# Travel Insurance Claim System — DevOps Lifecycle

An enterprise-grade, academic Minimum Viable Product (MVP) and automated continuous delivery lifecycle for a Travel Insurance Claim System. Built with **Spring Boot 3.3.4 (Java 21)**, **Selenium WebDriver 4**, **Jenkins CI/CD**, **Docker**, and **Ansible**.

---

## Academic Information

- **Department:** Department of Computer Engineering
- **Academic Year:** 2026–27
- **Program:** B.E. Computer Engineering (Semester VII – CMPN)
- **Course / Subject:** DevOps
- **Student Name:** Hasnain khan
- **Roll Number:** 23102A0075
- **Subject Professor In-charge:** Dr. Snehal Andhare
- **Laboratory:** M310B
- **GitHub Repository:** [https://github.com/Hexecutionerr/travel-insurance-claim-system.git](https://github.com/Hexecutionerr/travel-insurance-claim-system.git)

---

## Industry-Standard Project Structure

```
Devops/
├── README.md                          # Master project documentation
├── travel-insurance-claim-system/     # Spring Boot application source & build configuration
│   ├── .mvn/wrapper/                  # Maven Wrapper runtime
│   ├── src/
│   │   ├── main/java/com/academic/    # Controllers, Services, Entities, DTOs, Repositories
│   │   ├── main/resources/static/     # Customer & Reviewer Portal (HTML5, CSS3, JS)
│   │   └── test/java/com/academic/    # JUnit 5 & Selenium WebDriver E2E test suites
│   ├── .dockerignore                  # Docker build context exclusions
│   ├── .gitignore                     # Git repository exclusions
│   ├── Dockerfile                     # Multi-stage hardened Dockerfile (Temurin JRE 21, Non-root)
│   ├── Jenkinsfile                    # Declarative CI/CD pipeline as code
│   ├── mvnw.cmd                       # Windows Maven Wrapper
│   └── pom.xml                        # Maven dependencies & build plugins
├── ansible/                           # Infrastructure as Code (IaC) configuration management
│   ├── ansible.cfg                    # Ansible runtime settings
│   ├── group_vars/
│   │   └── all.yml                    # Global deployment parameters
│   ├── inventory/
│   │   └── hosts.yml                  # Target server host definitions
│   ├── playbooks/
│   │   ├── deploy.yml                 # Idempotent deployment playbook
│   │   ├── health-check.yml           # Automated HTTP service health check
│   │   └── rollback.yml               # Automated zero-touch failure recovery playbook
│   └── templates/
│       └── app.service.j2             # Jinja2 template for systemd service management
├── word/                              # Academic Practical File Deliverables (.docx)
│   ├── Combined-DevOps-Practical-File.docx   # Master practical file (all 15 tasks + cover page + index)
│   ├── Task-01-Problem-Definition.docx
│   ├── Task-02-Agile-DevOps-Workflow.docx
│   ├── Task-03-Requirements-Architecture.docx
│   ├── Task-04-Git-GitHub.docx
│   ├── Task-05-Feature-Development-Branching.docx
│   ├── Task-06-Git-Collaboration.docx
│   ├── Task-07-Jenkins-CI-Setup.docx
│   ├── Task-08-Jenkinsfile-Pipeline.docx
│   ├── Task-09-Selenium-Local-Testing.docx
│   ├── Task-10-Selenium-Jenkins-Integration.docx
│   ├── Task-11-Docker-Lifecycle.docx
│   ├── Task-12-Jenkins-Docker-CD.docx
│   ├── Task-13-Ansible-Configuration-Management.docx
│   ├── Task-14-Provisioning-Reliability-Rollback.docx
│   └── Task-15-Final-Release-Viva.docx
├── docs/                              # Project specifications, reports & visual evidence
│   ├── tasks/                         # Markdown specifications for Tasks 01 to 15
│   ├── reports/                       # Formal audit, changelog & Surefire test XML reports
│   │   ├── FINAL-AUDIT-REPORT.md
│   │   ├── IMPLEMENTATION-CHANGELOG.md
│   │   ├── EXECUTION-AND-VERIFICATION-STATUS.md
│   │   └── surefire-reports/
│   └── screenshots/                   # 30+ genuine execution screenshots & architecture diagrams
└── scripts/                           # Build & evidence automation tooling
    ├── build_all_deliverables.py      # Master docx generator strictly following devops L8.docx format
    ├── capture_all_evidence.py        # Automated headless Chrome evidence capture engine
    └── generate_extra_diagrams.py     # Architecture & lifecycle card renderer
```

---

## 15-Task Implementation & Verification Matrix

| Task # | Experiment Title | Implemented Artifacts | Verification Status |
| :---: | :--- | :--- | :---: |
| **01** | Problem Definition and Scope | MVP scope boundary, 15 capabilities, stakeholders | **Completed & Verified** |
| **02** | Agile Planning & DevOps Workflow | 7-sprint roadmap, backlog, CI/CD delivery cycle | **Completed & Verified** |
| **03** | Requirements, Architecture & Technology | Three-tier architecture, REST APIs, H2 database | **Completed & Verified** |
| **04** | Git & GitHub Repository Initialization | Git setup, `.gitignore`, commit tree, GitHub origin | **Completed & Verified** |
| **05** | Feature Development & Branching | `feature/claim-validation` branch, GitHub PR #1 merge | **Completed & Verified** |
| **06** | Git Collaboration & Conflict Resolution | Conflict created on Branch A/B, manually resolved | **Completed & Verified** |
| **07** | Jenkins CI Server Setup | Windows service active on port 8080 (HTTP 200) | **Completed & Verified** |
| **08** | Jenkinsfile Pipeline as Code | Declarative pipeline: Checkout, Build, Test, Package | **Completed & Verified** |
| **09** | Selenium UI Test Local Execution | 11 browser test journeys: Submit, Track, Approve, Reject | **Completed & Verified** |
| **10** | Selenium Integration into Jenkins CI | Headless Chrome CI execution, Surefire XML publishing | **Completed & Verified** |
| **11** | Dockerfile & Container Lifecycle | Multi-stage Dockerfile, JRE 21 runtime, non-root user | **Completed & Verified** |
| **12** | Jenkins-Docker Continuous Deployment | CD pipeline, safe container replacement, health checks | **Completed & Verified** |
| **13** | Ansible Configuration Management | Modular IaC: inventory, variables, templates, playbooks | **Completed & Verified** |
| **14** | Automated Rollback Reliability | Automated backup restoration & service recovery | **Completed & Verified** |
| **15** | Final Release, Documentation & Viva | Full documentation, 16 Word files, Viva Q&A | **Completed & Verified** |

---

## Technology Stack

- **Backend:** Spring Boot 3.3.4, Spring Data JPA, Spring Web, Embedded Tomcat
- **Language / Runtime:** Java 21 (Tested on Oracle JDK 25 LTS)
- **Database:** In-Memory H2 Database (`jdbc:h2:mem:claimdb`)
- **Frontend:** Responsive Single-Page Application (HTML5, Modern CSS3, Vanilla JavaScript)
- **Testing:** JUnit 5, Spring Boot Test (MockMvc), Selenium WebDriver 4 with Headless Chrome
- **Build Automation:** Apache Maven 3.9.9 via Maven Wrapper (`mvnw.cmd`)
- **Version Control:** Git 2.51.1 & GitHub Remote
- **CI / CD:** Jenkins Declarative Pipeline (Port 8080)
- **Containerization:** Multi-stage Dockerfile with Eclipse Temurin 21 JRE Jammy & Non-Root user
- **Configuration Management:** Ansible Playbooks (`deploy.yml`, `health-check.yml`, `rollback.yml`)

---

## Quick Start & Execution Guide

### 1. Compile and Package the Application
```powershell
cd C:\Users\Hasnain\Desktop\Devops\travel-insurance-claim-system
.\mvnw.cmd clean package -DskipTests
```

### 2. Run the Spring Boot Web Application
```powershell
java -jar target\travel-insurance-claim-system-1.0.0.jar
```
- **Customer Portal:** [http://localhost:8081/index.html](http://localhost:8081/index.html)
- **Reviewer Portal:** [http://localhost:8081/reviewer.html](http://localhost:8081/reviewer.html)
- **H2 Web Console:** [http://localhost:8081/h2-console](http://localhost:8081/h2-console) (JDBC URL: `jdbc:h2:mem:claimdb`, User: `sa`, Password: empty)

### 3. Run Automated Unit and Integration Tests
```powershell
.\mvnw.cmd test
```
All 8 integration tests execute and pass with 0 failures, 0 errors, and 0 skips. Surefire XML test reports are automatically generated in `target/surefire-reports/`.

### 4. Regenerate Deliverable Word Files (If Needed)
```powershell
cd C:\Users\Hasnain\Desktop\Devops\scripts
python build_all_deliverables.py
```
This script rebuilds all 16 academic Word documents strictly following the official `devops L8.docx` format and saves them directly to `word/`.
