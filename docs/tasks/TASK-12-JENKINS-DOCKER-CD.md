# Task 12 — Jenkins-Docker Continuous Deployment Pipeline

## 1. Objective
To automate the building and packaging of the Spring Boot application into a Docker container image via the Jenkins pipeline, tag the image with the build number, safely stop and replace any previous container revision, and verify application health post-deployment.

## 2. CD Pipeline Architecture
The pipeline is defined in the project `Jenkinsfile` and executes the following stages:
1. **Docker Build:**
   ```groovy
   stage('Docker Build') {
       steps {
           bat "docker build -t travel-insurance:${BUILD_NUMBER} -t travel-insurance:latest ."
       }
   }
   ```
2. **Safe Container Replacement:**
   ```groovy
   stage('Deploy Container') {
       steps {
           bat 'docker stop tics-app 2>nul || echo "No container to stop"'
           bat 'docker rm tics-app 2>nul || echo "No container to remove"'
           bat "docker run -d --name tics-app -p 8081:8081 travel-insurance:${BUILD_NUMBER}"
       }
   }
   ```
3. **Automated Health Check:**
   ```groovy
   stage('Health Check') {
       steps {
           bat 'timeout /t 15 /nobreak >nul'
           bat 'curl -f http://localhost:8081/index.html || exit 1'
       }
   }
   ```

## 3. Verification & Quality Gates
- **Image Tagging:** Tagged with Jenkins `${BUILD_NUMBER}` for traceability and `latest` for production referencing.
- **Port Collision Prevention:** Previous container revision is stopped and purged before starting the new revision.
- **Health Verification:** Pipeline fails immediately if the container does not respond with HTTP 200 within the timeout.
