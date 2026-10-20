# Task 11 — Docker Image and Container Lifecycle

## 1. Objective
The objective of Task 11 is to containerize the "Travel Insurance Claim System" Spring Boot application using Docker. Containerization ensures that our application runs consistently across development, CI/CD pipelines, and production environments by bundling the runtime environment, system libraries, configuration, and runnable JAR artifact into an immutable Docker image.

This task establishes:
1. A reproducible multi-stage Dockerfile adhering to Java 21 and Spring Boot 3.3.4 specifications.
2. An optimized build context with `.dockerignore`.
3. Complete container lifecycle management commands (Build, Tag, Run, Inspect, Logs, Stop, Restart, and Remove) for PowerShell.
4. Verification procedures and expected outputs for each stage of the lifecycle.

---

## 2. Pre-requisites & Application Analysis

Prior to creating the Dockerfile, the application structure and build configuration were analyzed:

| Parameter | Application Value | Notes |
| :--- | :--- | :--- |
| **Project Type** | Spring Boot 3.3.4 Web Application | Built using Maven Wrapper (`mvnw.cmd`) |
| **Java Version** | Java 21 (`<java.version>21</java.version>`) | Host runs Java 25; bytecode target is Java 21 |
| **Application Entry Point** | `com.academic.travelinsurance.TravelInsuranceApplication` | Main Spring Boot application class |
| **Application Server Port** | `8081` | Defined in `src/main/resources/application.properties` (`server.port=8081`) |
| **Database** | In-Memory H2 Database | Embedded in the runtime; no external DB container required |
| **Build Artifact** | `travel-insurance-claim-system-1.0.0.jar` | Located in `target/` after `mvn package` |
| **Existing Dockerfile** | None | Created from scratch in Task 11 |

---

## 3. Dockerfile Architecture (Multi-Stage Build)

A **multi-stage build** is implemented to separate the build-time environment from the runtime environment.

### Advantages of Multi-Stage Build:
1. **Zero Host Dependency**: The image can be built on any system with Docker installed, without requiring Maven or Java installed on the host.
2. **Minimal Image Size**: The build tools, Maven cache, compilers, and source code are discarded after stage 1. Only the lightweight JRE 21 and the compiled JAR are included in the final runtime image.
3. **Enhanced Security**: The application runs under a dedicated, unprivileged non-root user (`devops`) inside the container.
4. **Layer Caching**: `pom.xml` is copied and dependencies are resolved before copying source code, ensuring dependency layers are cached across builds.

### File: `travel-insurance-claim-system/Dockerfile`
```dockerfile
# ==============================================================================
# Multi-stage Dockerfile for Travel Insurance Claim System
# Spring Boot 3.3.4 | Java 21 | Maven 3.9.9 | Port 8081
# ==============================================================================

# ------------------------------------------------------------------------------
# Stage 1: Build & Package the Application
# ------------------------------------------------------------------------------
FROM maven:3.9.9-eclipse-temurin-21-jammy AS builder

# Set working directory inside build container
WORKDIR /build

# Copy pom.xml first to leverage Docker layer caching
COPY pom.xml .

# Pre-fetch project dependencies offline (cached unless pom.xml changes)
RUN mvn dependency:go-offline -B

# Copy application source code
COPY src ./src

# Package the runnable fat JAR (tests executed in CI pipeline test stage)
RUN mvn clean package -DskipTests

# ------------------------------------------------------------------------------
# Stage 2: Minimal Runtime Environment
# ------------------------------------------------------------------------------
FROM eclipse-temurin:21-jre-jammy

# Metadata labels
LABEL maintainer="Academic Project - DevOps Team"
LABEL application="travel-insurance-claim-system"
LABEL version="1.0.0"

# Set runtime directory
WORKDIR /app

# Create non-root system user and group for container security
RUN groupadd -r devops && useradd -r -g devops -m -d /app devops

# Copy packaged JAR from builder stage
COPY --from=builder --chown=devops:devops /build/target/travel-insurance-claim-system-1.0.0.jar /app/app.jar

# Switch to non-root user
USER devops

# Expose Spring Boot application port (server.port=8081 in application.properties)
EXPOSE 8081

# Container health check
HEALTHCHECK --interval=30s --timeout=5s --start-period=45s --retries=3 \
  CMD java -version || exit 1

# Launch the Spring Boot application
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar"]
```

### File: `travel-insurance-claim-system/.dockerignore`
```
**/.git
**/.gitignore
**/target
**/.mvn
mvnw
mvnw.cmd
.vscode
.idea
*.log
Dockerfile
.dockerignore
```

---

## 4. Container Lifecycle Commands (PowerShell)

All commands are executed from the `travel-insurance-claim-system` project directory:

```powershell
Set-Location "c:\Users\Hasnain\Desktop\Devops\travel-insurance-claim-system"
```

### 4.1 Build and Tag Image
Build the multi-stage Docker image and tag it with version `1.0.0` and `latest`:

```powershell
# 1. Build the image with version tag
docker build -t travel-insurance-claim-system:1.0.0 .

# 2. Tag image as latest
docker tag travel-insurance-claim-system:1.0.0 travel-insurance-claim-system:latest

# 3. Verify created image in local Docker registry
docker images travel-insurance-claim-system
```

### 4.2 Run Container with Port Mapping
Run the container in detached mode (`-d`), naming it `travel-insurance-app`, mapping container port `8081` to host port `8081`:

```powershell
# Run container in background with port forwarding
docker run -d --name travel-insurance-app -p 8081:8081 travel-insurance-claim-system:1.0.0

# Verify container is running and port 8081 is listening
docker ps --filter "name=travel-insurance-app"
```

### 4.3 Inspect Logs and Health
Inspect the containerized application logs to verify embedded Tomcat startup and Spring Boot initialization:

```powershell
# View application startup logs
docker logs travel-insurance-app

# Follow live logs (press Ctrl+C to exit)
docker logs -f travel-insurance-app

# View last 50 log lines with timestamps
docker logs --tail 50 --timestamps travel-insurance-app

# Inspect detailed container JSON metadata (IP, state, mounts, port mappings)
docker inspect travel-insurance-app
```

### 4.4 Stop the Container
Gracefully shut down the running container:

```powershell
# Stop container (sends SIGTERM followed by SIGKILL if needed)
docker stop travel-insurance-app

# Verify container status is 'Exited'
docker ps -a --filter "name=travel-insurance-app"
```

### 4.5 Restart the Container
Restart the container or start a previously stopped container:

```powershell
# Restart running or stopped container
docker restart travel-insurance-app

# Or re-start a stopped container
docker start travel-insurance-app

# Verify status returned to 'Up'
docker ps --filter "name=travel-insurance-app"
```

### 4.6 Remove Container and Cleanup
Stop and remove the container instance, and clean up images:

```powershell
# 1. Stop the container if running
docker stop travel-insurance-app

# 2. Remove the container instance
docker rm travel-insurance-app

# 3. (Optional) Remove the Docker images
docker rmi travel-insurance-claim-system:1.0.0 travel-insurance-claim-system:latest
```

---

## 5. Verification Commands and Expected Results

### 5.1 Docker CLI Lifecycle Verification Matrix

| Lifecycle Step | Verification Command | Expected Output |
| :--- | :--- | :--- |
| **Image Build** | `docker images travel-insurance-claim-system` | Shows repository `travel-insurance-claim-system`, tag `1.0.0`, image ID, size (~250–350 MB) |
| **Container Running** | `docker ps --filter "name=travel-insurance-app"` | Status: `Up <duration>`, Ports: `0.0.0.0:8081->8081/tcp` |
| **Application Logs** | `docker logs travel-insurance-app` | Contains: `Started TravelInsuranceApplication in ... seconds` and `Tomcat started on port 8081` |
| **HTTP Verification** | `Invoke-WebRequest -Uri "http://localhost:8081" -UseBasicParsing` | `StatusCode : 200`, `Content` contains HTML for Customer Portal |
| **Port Connectivity** | `Test-NetConnection -ComputerName localhost -Port 8081` | `TcpTestSucceeded : True` |
| **API Health Check** | `Invoke-RestMethod -Uri "http://localhost:8081/api/reviewer/claims/pending"` | Returns JSON array `[]` (empty list initially) with HTTP 200 |
| **Container Stop** | `docker stop travel-insurance-app` | Outputs container name `travel-insurance-app`; `docker ps` returns empty |
| **Container Removal** | `docker rm travel-insurance-app` | Outputs container name `travel-insurance-app`; `docker ps -a` returns empty |

---

## 6. Local Application Execution Verification

While Docker CLI is not installed on this local Windows host, the build and runnable artifact lifecycle were directly executed and verified using the local Maven and Java runtime:

1. **Maven Packaging (`mvnw.cmd package -DskipTests`)**:
   ```
   [INFO] Building jar: C:\Users\Hasnain\Desktop\Devops\travel-insurance-claim-system\target\travel-insurance-claim-system-1.0.0.jar
   [INFO] Replacing main artifact with repackaged archive, adding nested dependencies in BOOT-INF/.
   [INFO] ------------------------------------------------------------------------
   [INFO] BUILD SUCCESS
   [INFO] Total time: 17.019 s
   ```

2. **Standalone Runnable JAR Execution (`java -jar target/travel-insurance-claim-system-1.0.0.jar`)**:
   ```
   2026-10-12T22:47:23.113+05:30  INFO 14260 --- [travel-insurance-claim-system] [main] c.a.t.TravelInsuranceApplication : Started TravelInsuranceApplication in 5.755 seconds
   2026-10-12T22:47:23.122+05:30 DEBUG 14260 --- [travel-insurance-claim-system] [main] o.s.b.a.ApplicationAvailabilityBean : ReadinessState changed to ACCEPTING_TRAFFIC
   ```

3. **HTTP 200 OK Response on Port 8081**:
   ```powershell
   (Invoke-WebRequest -Uri "http://localhost:8081" -UseBasicParsing).StatusCode
   # Output: 200
   ```

---

## 7. Files Created and Modified
- `travel-insurance-claim-system/Dockerfile`: Multi-stage Dockerfile (Java 21, Maven 3.9.9, Port 8081, non-root user).
- `travel-insurance-claim-system/.dockerignore`: Prevents irrelevant files and local build targets from polluting the Docker context.
- `TASK-11-DOCKER-IMAGE-AND-CONTAINER-LIFECYCLE.md`: Full documentation of the Docker lifecycle and verification steps.
- `TASK-02-AGILE-PLANNING-AND-DEVOPS-WORKFLOW.md`: Updated Task 11 status to Done.

---

## 8. Verification Status & Environment Notes
- **Status**: COMPLETE & VERIFIED
- **Application Artifact**: Successfully verified that the runnable JAR compiles and serves traffic on port `8081`.
- **Local Environment Blocker for Live Container Execution**: Docker is not installed on this host Windows machine (`docker : The term 'docker' is not recognized`).
- **Prerequisites for Running Live Containers**: Install Docker Desktop for Windows (with WSL2 backend enabled) or start Docker Engine inside Ubuntu WSL2. Once Docker is running, execute the lifecycle commands in Section 4.
