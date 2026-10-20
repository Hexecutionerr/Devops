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
