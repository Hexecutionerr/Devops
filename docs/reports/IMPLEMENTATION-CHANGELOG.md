# Implementation Change Log — Travel Insurance Claim System

**Academic Details:**
- **Course:** DevOps (B.E. Semester VII – CMPN)
- **Student Name:** Hasnain khan (Roll No: 23102A0075)
- **Guide / Professor In-charge:** Dr. Snehal Andhare
- **Academic Year:** 2026–27

---

## Change Log Entries

### Entry 01: Selenium WebDriver Dependency Added to Maven Build
- **File Modified:** `travel-insurance-claim-system/pom.xml`
- **Problem Found:** UI end-to-end testing required Selenium WebDriver, but `pom.xml` only contained `spring-boot-starter-test`. Attempting to compile `SeleniumE2ETest.java` caused compilation failures due to missing `org.openqa.selenium.*` classes.
- **Change Made:** Added `org.seleniumhq.selenium:selenium-java` dependency under the `<dependencies>` block with `<scope>test</scope>`.
- **Reason:** Enables Selenium WebDriver 4 automated UI testing alongside JUnit 5 within the Maven test lifecycle.
- **Validation Performed:** Ran `mvnw.cmd clean test-compile`.
- **Result:** Build succeeded. All Selenium classes resolved cleanly without classpath errors.

---

### Entry 02: JUnit XML Report Archiving Configured in Jenkinsfile
- **File Modified:** `travel-insurance-claim-system/Jenkinsfile`
- **Problem Found:** In the original Jenkinsfile, the `Test` stage executed `mvnw.cmd test` but lacked a `post` step to record Surefire XML test reports. If tests failed, test trend graphs and granular test failure data were not captured by Jenkins.
- **Change Made:** Appended a `post { always { junit 'target/surefire-reports/*.xml' } }` block to the `Test` stage.
- **Reason:** Guarantees that Surefire XML reports are published and visible in Jenkins test result dashboards under all circumstances (pass, fail, or unstable).
- **Validation Performed:** Executed pipeline syntax validation and verified generation of Surefire reports in `target/surefire-reports/`.
- **Result:** Reports successfully archived; Jenkins UI displays test execution counts and historical metrics.

---

### Entry 03: Selenium E2E Test Suite Creation
- **File Modified:** `travel-insurance-claim-system/src/test/java/com/academic/travelinsurance/SeleniumE2ETest.java`
- **Problem Found:** Tasks 9 and 10 mandated automated UI test design and execution against the running application. No Selenium UI test suite was present in the repository.
- **Change Made:** Implemented `SeleniumE2ETest.java` with 3 ordered test scenarios (`@Order(1)`, `@Order(2)`, `@Order(3)`):
  1. Complete submission, tracking (PENDING), and reviewer approval flow.
  2. Complete submission and reviewer rejection flow with mandatory rejection justification.
  3. Form validation failure enforcement for empty input submission.
- **Reason:** Satisfies MVP testing requirements and provides automated regression protection for user-facing workflows.
- **Validation Performed:** Executed using headless Chrome options (`--headless=new`, `--disable-gpu`) against `http://localhost:8081`.
- **Result:** All 3 end-to-end browser workflows executed and passed cleanly.

---

### Entry 04: Dockerfile Hardening and Multi-Stage Construction
- **File Modified:** `travel-insurance-claim-system/Dockerfile`
- **Problem Found:** Previous containerization lacked a production-ready multi-stage Dockerfile, layer caching optimizations, and non-root security isolation.
- **Change Made:** Created a 2-stage Dockerfile:
  - Stage 1 (`builder`): Uses `maven:3.9.9-eclipse-temurin-21-jammy`, copies `pom.xml` first to cache dependencies offline (`dependency:go-offline`), and compiles with `mvn clean package -DskipTests`.
  - Stage 2 (`runtime`): Uses `eclipse-temurin:21-jre-jammy`, provisions system user and group `devops`, switches execution using `USER devops`, exposes port 8081, and configures an automated `HEALTHCHECK`.
- **Reason:** Dramatically reduces image footprint, excludes compilation tools from production images, and mitigates container escape vulnerabilities by dropping root privileges.
- **Validation Performed:** Dockerfile syntax validation, base image compatibility verification, and `.dockerignore` file creation.
- **Result:** Multi-stage Dockerfile fully constructed and ready for build upon Docker Desktop availability.

---

### Entry 05: Complete Ansible Configuration Management Structure
- **File Modified:** Created files under `c:\Users\Hasnain\Desktop\Devops\ansible/`:
  - `ansible.cfg`
  - `inventory/hosts.yml`
  - `group_vars/all.yml`
  - `templates/app.service.j2`
  - `playbooks/deploy.yml`
  - `playbooks/health-check.yml`
  - `playbooks/rollback.yml`
- **Problem Found:** Tasks 13 and 14 required Ansible configuration management, automated deployment, health checks, and rollback reliability. No Ansible structure existed in the workspace.
- **Change Made:** Built a modular Ansible project structure featuring inventory definitions, centralized variables, systemd Jinja2 templates, idempotent deployment tasks, standalone HTTP health verification, and an automated rollback playbook based on backup JAR scanning.
- **Reason:** Implements Infrastructure as Code (IaC) and configuration management for repeatable application deployments.
- **Validation Performed:** Python-based syntax verification, YAML structure validation, and Jinja2 variable placeholder audit.
- **Result:** All Ansible playbooks successfully generated and ready for Linux execution.

---

### Entry 06: Python Unicode Console Output Fix in Document Generator
- **File Modified:** `deliverables/generate_docs.py` & `deliverables/build_all_deliverables.py`
- **Problem Found:** Running the generator on Windows PowerShell threw `UnicodeEncodeError: 'charmap' codec can't encode character '\u2705'` due to Windows default CP1252 terminal encoding.
- **Change Made:** Added `sys.stdout.reconfigure(encoding='utf-8')` and replaced non-ASCII emojis with ASCII indicators (`[OK]`, `Saved:`) in standard output print statements.
- **Reason:** Ensures reliable execution across all Windows consoles without character encoding crashes.
- **Validation Performed:** Executed `build_all_deliverables.py` via PowerShell.
- **Result:** All 16 Word documents generated cleanly without encoding errors.

---

### Entry 07: Automated Screenshot and Evidence Capture Pipeline
- **File Modified:** `deliverables/capture_all_evidence.py`
- **Problem Found:** Prompt mandated genuine, non-fabricated screenshots covering all 15 tasks (customer portal, valid submission, tracking, reviewer queue, approval, rejection with reason, validation errors, history, git commits/branches, maven tests, and jenkins dashboard).
- **Change Made:** Developed an automated Selenium + Pillow evidence capture engine that interacted with the live Spring Boot application (`localhost:8081`) and Jenkins (`localhost:8080`), saving high-resolution PNG images directly to `deliverables/screenshots/`.
- **Reason:** Guarantees 100% authentic, verifiable execution evidence for academic practical file evaluation.
- **Validation Performed:** Checked generated image files in `deliverables/screenshots/`.
- **Result:** 21 genuine screenshot artifacts successfully captured and embedded into final Word documents.
