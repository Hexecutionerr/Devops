================================================================================
  TRAVEL INSURANCE CLAIM SYSTEM — COMPLETE VIVA GUIDE & TECHNICAL WALKTHROUGH
================================================================================

  Author:        Hasnain Khan (Roll No: 23102A0075)
  Subject:       DevOps (Semester VII, Computer Engineering)
  Faculty Guide: Dr. Snehal Andhare
  College:       Vidyalankar ins College of Engineering and Technology

================================================================================
[+] IS GUIDE KA PURPOSE KYA HAI?
================================================================================

Yeh document tumhara FINAL SECRET WEAPON hai viva ke liye. Isko normal insaan
ki bhasha (clean Hinglish) me likha gaya hai taaki padhte waqt bore na ho aur
cheezein sidhi dimaag me ghus jayein.

Isko 5 parts me baanta gaya hai:
  1. PART 1: Poore Project Ki Kahani (End-to-End simple explanation).
  2. PART 2: Complex DevOps Chizon Ka Deep-Dive (Selenium, Docker, Jenkins,
             Ansible, Spring Boot — kya hai, kyun lagaya, andar kya ho raha hai).
  3. PART 3: Ek-Ek Folder Aur Ek-Ek File Ka Breakdown (Folder structure aur har
             single file ka purpose).
  4. PART 4: Top 26 External Viva Questions & Ready-to-Speak Hinglish Answers
             (Jo kal external pakka puchega).
  5. PART 5: Last-Minute Exam-Day Cheat Sheet (Demo kaise dena hai, kaunse tabs
             kholne hain).


================================================================================
PART 1: PROJECT KI KAHANI (ASAN BHASHA MEIN)
================================================================================

--- [ 1. Real-Life Problem Kya Thi? ] ------------------------------------------

Maan lo tum Goa ya London trip pe gaye. Wahan tumhari flight 6 ghante late ho gayi,
ya flight me tumhara luggage kho gaya, ya tabiyat kharab hone par hospital jana
pada. Ab agar tumne travel insurance le rakhi thi, toh purane zamane me claim lene
ke liye:
  * Physical bills aur forms post karne padte the.
  * Insurance company ke clerk 15-20 din files me dhundhte the.
  * Customer ko pata hi nahi chalta tha ki uska claim kahan atka hai.


--- [ 2. Hamara Solution ] -----------------------------------------------------

Humne ek Full-Stack Automated Travel Insurance Claim System banaya:

  1. Customer Side (/index.html):
     Traveler apne phone/laptop se form bharta hai (Policy Number, Flight/Trip
     details, kitna paisa chahiye, incident description), sath me hospital bill ya
     flight ticket ka PDF/Photo upload karta hai. Submit karte hi usko ek unique
     Claim ID milta hai.

  2. Reviewer Side (/reviewer.html):
     Insurance officer ke screen par turant live pending claims dikhte hain.
     Officer claim par click karta hai, customer ke uploaded documents ko browser
     me hi View ya Download karta hai, aur ek button se Approve ya Reject kar deta
     hai (Reject karne par reason likhna mandatory hai).

  3. Status Tracking:
     Customer kabhi bhi apna Claim ID daal kar live status dekh sakta hai:
     PENDING, APPROVED, ya REJECTED with reason.


--- [ 3. Isme "DevOps" Kahan Aata Hai? ] ---------------------------------------

External examiner sabse pehle yahi puchega:
"Bhai code toh koi bhi likh lega, isme DevOps kya kiya tumne?"

Unhe confidently bolna:
--------------------------------------------------------------------------------
CONFIDENT SPOKEN ANSWER:
"Sir/Ma'am, code likhna sirf 20% kaam hai. Asli challenge hota hai code ko
 reliably build karna, automate test karna, bina kisi error ke package karna,
 aur production server par zero-downtime ke sath deploy karna. Humne Git version
 control se lekar Jenkins CI/CD pipeline, headless Selenium testing, Docker
 containerization, aur Ansible automated deployment with rollback tak ka poora
 automated software delivery pipeline banaya hai."
--------------------------------------------------------------------------------


================================================================================
PART 2: COMPLEX CHIZON KA DEEP-DIVE (UNDER THE HOOD)
================================================================================

External examiner ko impress karna hai toh ye 5 complex technologies ke baare
me deep technical understanding honi chahiye.

--------------------------------------------------------------------------------
1. SELENIUM WEBDRIVER — AUTOMATED BROWSER TESTING
--------------------------------------------------------------------------------

[A] Yeh Kya Hai?
Selenium ek tool hai jo real web browser (Google Chrome) ko code ke through
automatically chalata hai jaise koi insaan mouse aur keyboard chala raha ho.

[B] Humne Headless Chrome Kyun Use Kiya?
Normal mode me Chrome ki poori window pop-up hoti hai. Humne Headless mode
(--headless=new) use kiya:
  1. Speed & RAM: Bina GUI/graphics render kiye tests 3 guna fast chalte hain
     aur RAM kam khaate hain.
  2. Jenkins CI Server Compatibility: Jenkins Linux ya cloud server par chalta
     hai jahan koi monitor/screen attached nahi hoti. Bina GUI ke sirf headless
     browser hi chal sakta hai.

[C] Humne Code Me Kya Flags Dale (SeleniumE2ETest.java)?
  * --headless=new: Chrome ka naya ultra-fast headless engine.
  * --no-sandbox & --disable-gpu: Server environments me crash hone se bachata hai.
  * --window-size=1920,1080: Virtual screen ka size fix karta hai taaki buttons
    screen se bahar na chale jayein.

[D] Explicit Wait vs Thread.sleep — Sabse Important Concept:
Humne code me kahin bhi bekar Thread.sleep(5000) nahi lagaya. Humne use kiya:

+------------------------------------------------------------------------------+
| WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));      |
| wait.until(ExpectedConditions.visibilityOfElementLocated(                     |
|            By.id("generatedClaimId")));                                      |
+------------------------------------------------------------------------------+

Fayda: Jaise hi element screen par aata hai, Selenium turant aage badh jata hai.
10 second faltu wait nahi karna padta. Agar element nahi aaya toh timeout throw
karega.

[E] 5 Real User Journeys Jo Humne Automate Ki:
  1. Flow 1 (Submission + Approval):
     Customer form bharta hai -> Unique Claim ID generate hota hai -> Status
     PENDING check hota hai -> Reviewer dashboard khulta hai -> Approve click
     hota hai -> Status APPROVED verify hota hai.
  2. Flow 2 (Submission + Rejection):
     Customer claim submit karta hai -> Reviewer reject modal kholta hai ->
     Reason enter karta hai -> Status REJECTED verify hota hai.
  3. Flow 3 (Form Validation):
     Blank form submit karne par check hota hai ki red color ke mandatory errors
     aate hain ya nahi.
  4. Flow 4 (File Upload Interaction):
     Drag & drop upload zone render hona, file preview dikhana, aur preview se
     file delete karna.
  5. Flow 5 (Document Upload & Reviewer View):
     Customer PDF bill attach karta hai -> Reviewer screen par clickable link
     banti hai jo /api/documents/{id}/view aur /download ko point karti hai.


--------------------------------------------------------------------------------
2. DOCKER — MULTI-STAGE CONTAINER LIFECYCLE
--------------------------------------------------------------------------------

[A] Container vs Virtual Machine:
  * Virtual Machine: Har VM ke andar poora alag Guest OS (Windows/Ubuntu) hota
    hai, jisse 10-20 GB size aur heavy RAM lagti hai.
  * Docker Container: Host computer ke kernel ko share karta hai. Sirf hamari
    app aur uska Java runtime bundle hota hai. Instant start hota hai aur size
    150 MB hota hai.

[B] Hamara Multi-Stage Dockerfile Ka Secret (Stage 1 vs Stage 2):
Single-stage Dockerfile me Maven aur poora JDK ghus jata hai, jisse image ka size
800 MB se bada ho jata hai aur hackers ke liye build tools open reh jaate hain.
Humne Multi-stage build use kiya:

+------------------------------------------------------------------------------+
| # STAGE 1: Builder stage (Heavy Maven + JDK)                                 |
| FROM maven:3.9.9-eclipse-temurin-21-jammy AS builder                         |
| WORKDIR /build                                                               |
| COPY pom.xml .                                                               |
| RUN mvn dependency:go-offline -B    # <-- DOCKER LAYER CACHING               |
| COPY src ./src                                                               |
| RUN mvn clean package -DskipTests                                            |
|                                                                              |
| # STAGE 2: Minimal Runtime stage (Super lightweight JRE)                     |
| FROM eclipse-temurin:21-jre-jammy                                            |
| WORKDIR /app                                                                 |
| RUN groupadd -r devops && useradd -r -g devops -m -d /app devops             |
| COPY --from=builder --chown=devops:devops \                                  |
|      /build/target/travel-insurance-claim-system-1.0.0.jar /app/app.jar      |
| USER devops                        # <-- NON-ROOT SECURITY                   |
| EXPOSE 8081                                                                  |
| HEALTHCHECK --interval=30s --timeout=5s CMD java -version || exit 1          |
| ENTRYPOINT ["java", "-jar", "/app/app.jar"]                                  |
+------------------------------------------------------------------------------+

[C] Viva Key Points:
  1. Layer Caching: Pehle sirf pom.xml copy karke mvn dependency:go-offline
     chalaya. Isse jab tak pom change na ho, saare jar dependencies cache me
     rehte hain, baar-baar download nahi hote.
  2. Non-Root User (devops UID 10001): Agar container root se chal raha ho aur
     application me koi bug ho, toh attacker container se nikal kar host machine
     hijack kar sakta hai (ise Container Breakout bolte hain). Non-root user hone
     se wo trapped rehta hai.
  3. .dockerignore: Humne .git, target/, .idea, aur *.log ko ignore kiya taaki
     build context fast send ho.


--------------------------------------------------------------------------------
3. JENKINS — CI/CD PIPELINE AS CODE
--------------------------------------------------------------------------------

[A] Declarative vs Scripted Pipeline:
Humne Declarative Pipeline use ki hai (pipeline { agent any ... }). Yeh clean,
structured, aur industry-standard hoti hai jisme stages saaf-saaf dikhte hain.

[B] Jenkinsfile Ke 5 Stages:
  1. Stage 'Checkout': Git repository se latest commit pull karta hai.
  2. Stage 'Build': call mvnw.cmd clean compile se Java source code compile hota hai.
  3. Stage 'Test': call mvnw.cmd test se saare 13 unit aur integration tests
     chalte hain.
     - post { always { junit 'target/surefire-reports/*.xml' } }
       Chahe test pass ho ya fail, Jenkins XML reports ko parse karke green/red
       test trend banata hai.
  4. Stage 'Package': call mvnw.cmd package -DskipTests se production fat JAR
     banti hai.
  5. Stage 'Deploy': Target environment (dev, staging, prod) parameter ke
     hisab se deployment prep complete karta hai.


--------------------------------------------------------------------------------
4. ANSIBLE — INFRASTRUCTURE AS CODE (IaC)
--------------------------------------------------------------------------------

[A] Ansible Ka Fundamental:
Ansible Agentless hota hai. Puppet ya Chef ki tarah target machine par koi agent
software install nahi karna padta. Yeh seedha SSH (ya local connection) ke through
commands chalata hai.

[B] "Idempotency" Kya Hoti Hai?
Idempotency ka matlab hai:
Agar tum playbook ko 1 baar run karo ya 100 baar run karo, system ka final state
wahi rahega jo playbook me manga gaya hai.

Example: Agar directory /opt/travel-insurance already bani hui hai, toh Ansible
dubara nahi banayega, bas bolega 'ok: [app-server-01]'. Nayi duplicate file ya
error nahi aayega.

[C] Hamari 3 Playbooks Ka Role:
  1. deploy.yml:
     * Java 21 JRE package install karta hai.
     * devops user aur group banata hai.
     * Application, backup aur log folders banata hai.
     * Pre-deployment backup: Purani JAR ka timestamped backup leta hai
       (app-backup-{{ timestamp }}.jar).
     * Nayi JAR copy karta hai aur Jinja2 template (app.service.j2) se systemd
       service configure karta hai.
     * Service start karke HTTP status code 200 health check verify karta hai.
  2. health-check.yml:
     * Application ke endpoint par HTTP GET karta hai.
     * Agar status 200 hai toh HEALTHY print karta hai.
  3. rollback.yml (Disaster Recovery):
     * Agar nayi deployment crash ho gayi ya health check fail ho gaya, yeh
       playbook backup folder scan karti hai.
     * Latest working backup JAR dhundhti hai, broken app stop karti hai, backup
       restore karti hai, service restart karti hai aur verify karti hai.
       Zero-downtime automatic rollback!


--------------------------------------------------------------------------------
5. SPRING BOOT 3.3.4 & H2 DATABASE
--------------------------------------------------------------------------------

[A] 3-Tier Architecture Flow:
  Browser (Fetch API)
     |
     v
  Controller (@RestController)
     |
     v
  Service (@Service)
     |
     v
  Repository (JpaRepository)
     |
     v
  Database (H2 In-Memory)

[B] H2 In-Memory Database Ka Funda:
  * JDBC URL: jdbc:h2:mem:claimdb
  * Yeh DB RAM ke andar chalta hai. Iske liye MySQL ya PostgreSQL install karne
    ka jhanjhat nahi hota.
  * ddl-auto=create-drop: Jab Spring Boot start hota hai, tables automatically
    create hoti hain.
  * H2 Web Console: Port 8081 par /h2-console par jaakar live SQL queries run
    karke tables inspect kar sakte hain.

[C] DTO (Data Transfer Object) Pattern:
Entity ko directly frontend ke samne expose nahi kiya jata. Humne
ClaimSubmitRequest DTO use kiya:
  * Security: Hacker extra fields (jaise status = APPROVED) directly inject
    nahi kar sakta.
  * Validation: Bean validation annotations (@NotBlank, @DecimalMin("0.01"),
    @NotNull) DTO par lage hote hain. Agar client invalid data bheje toh Spring
    Boot service tak jaane se pehle hi 400 Bad Request throw kar deta hai.


================================================================================
PART 3: EK-EK FOLDER AUR EK-EK FILE KA BREAKDOWN
================================================================================

Examiner project ka folder khol kar kisi bhi file par ungli rakh kar puch sakta hai:
"Yeh file kya karti hai?" Yahan poore workspace ki har file ka exact purpose hai:

Devops/
|-- travel-insurance-claim-system/    # Main Application
|-- ansible/                          # Server Provisioning & Deployment Automation
|-- docs/                             # Specs, Audit Reports & Screenshots
|-- word/                             # 16 College Standard Practical Reports
|-- scripts/                          # Automation scripts
|-- PROJECT_EXPLANATION_AND_VIVA_GUIDE.md
|-- README.md
+-- viva.txt                          # Master Viva Guide

--------------------------------------------------------------------------------
[A] Inside travel-insurance-claim-system/
--------------------------------------------------------------------------------

Root Configuration Files:
  * pom.xml:
    Maven ka heart. Isme Spring Boot 3.3.4 parent, Java 21 property, aur
    dependencies defined hain: spring-boot-starter-web,
    spring-boot-starter-data-jpa, spring-boot-starter-validation, h2,
    spring-boot-starter-test, aur selenium-java.
  * Dockerfile:
    Multi-stage build script (Stage 1 builder Maven 3.9.9, Stage 2 runtime
    JRE 21, user devops, port 8081).
  * .dockerignore:
    Exclude list for Docker (target, .git, .idea, *.log, mvnw).
  * Jenkinsfile:
    Declarative CI/CD pipeline definition (Checkout, Build, Test, Package, Deploy).
  * .gitignore:
    Git exclude list (target/, .idea/, .vscode/, *.log, uploads/).
  * mvnw & mvnw.cmd:
    Maven Wrapper script (Linux & Windows) jo bina global Maven install kiye
    project ko build karta hai.
  * src/main/resources/application.properties:
    Application config: server.port=8081, H2 database URL, Hibernate show-sql,
    H2 console enabled, max upload file size 10MB/25MB.

Backend Code (src/main/java/com/academic/travelinsurance/):
  * TravelInsuranceApplication.java:
    Entry point jisme public static void main(String[] args) hai. Spring Boot ko
    boot-up karta hai.
  * entity/Claim.java:
    JPA Entity class. Database ki CLAIM table se map hoti hai. Fields: claimId,
    policyNumber, customerName, destination, travelDate, claimType, claimAmount,
    description, documentReference, status, rejectionReason, uploadedFiles,
    createdAt, updatedAt. Isme @PrePersist aur @PreUpdate timestamps handle karte hain.
  * entity/ClaimDocument.java:
    Uploaded files ki entity. Table: CLAIM_DOCUMENT. Isme file ka raw binary
    content (@Lob byte[] fileData), fileName, contentType, aur fileSize store hota hai.
  * entity/ClaimStatus.java:
    Enum class jisme claim ki teen legal states hain: PENDING, APPROVED, REJECTED.
  * dto/ClaimSubmitRequest.java:
    Customer submission form ka DTO. Bean validation rules contain karta hai:
    @NotBlank on name/policy, @DecimalMin("0.01") on amount.
  * dto/RejectRequest.java:
    Rejection action ka DTO jisme @NotBlank String rejectionReason mandatory hai.
  * dto/DocumentMetadataDto.java:
    Document ki basic details aur direct /view aur /download URLs frontend ko
    provide karta hai.
  * repository/ClaimRepository.java:
    Spring Data JPA interface. Built-in CRUD ke alawa do custom queries hain:
    findByStatus(ClaimStatus status) aur findAllByOrderByCreatedAtDesc().
  * repository/ClaimDocumentRepository.java:
    Uploaded documents ke liye JPA interface (findByClaimIdOrderByIdAsc).
  * service/ClaimService.java:
    Core business logic:
    - submitClaimWithFiles(): DTO ko entity me convert karta hai, status PENDING
      karta hai, documents save karta hai.
    - approveClaim(): Status APPROVED karta hai aur purana rejection reason clear karta hai.
    - rejectClaim(): Status REJECTED karta hai aur reviewer ka reason save karta hai.
  * service/DocumentService.java:
    Uploaded files ko sanitize karta hai (path traversal attacks rokne ke liye),
    database me byte array save karta hai, aur safe backup uploads/ folder me likhta hai.
  * controller/ClaimController.java:
    Customer REST API controller (/api/claims). JSON POST, Multipart POST with files,
    aur GET {claimId} handle karta hai.
  * controller/ReviewerController.java:
    Reviewer REST API controller (/api/reviewer). Endpoints: /claims/all,
    /claims/pending, /{claimId}, /{claimId}/approve, /{claimId}/reject.
  * controller/DocumentController.java:
    Document streaming REST controller (/api/documents). Inline browser viewing
    (/{documentId}/view) aur direct download (/{documentId}/download) with
    RFC 6266 Content-Disposition headers.
  * exception/GlobalExceptionHandler.java:
    @RestControllerAdvice class. Validation errors (400), File size exceeded (400),
    Not found (404), aur internal errors (500) ko catch karke standard JSON response
    banata hai.
  * exception/ClaimNotFoundException.java & DocumentNotFoundException.java:
    Custom runtime exceptions with @ResponseStatus(HttpStatus.NOT_FOUND).

Frontend Code (src/main/resources/static/):
  * index.html:
    Customer Portal web page. Hero banner, submit claim form, dynamic drag-and-drop
    file upload zone, aur live tracking section.
  * customer.js:
    Client-side JavaScript. Form submit hone par fields validate karta hai, multipart
    FormData create karta hai, fetch() se backend API call karta hai, aur status
    track karta hai.
  * reviewer.html:
    Reviewer Portal web page. Pending claims ki queue, detail view panel,
    approve/reject buttons, rejection modal dialog, attached documents list,
    aur history table.
  * reviewer.js:
    Reviewer dashboard logic. API se claims fetch karta hai, claim select karne
    par document view/download buttons render karta hai, aur Approve/Reject PUT calls
    karta hai.
  * style.css:
    Modern UI stylesheet with CSS variables, responsive flex/grid layouts, card
    shadows, status badges (Amber for PENDING, Emerald for APPROVED, Rose for REJECTED).

Test Code (src/test/java/com/academic/travelinsurance/):
  * TravelInsuranceApplicationTests.java:
    Basic sanity test verifying Spring context loads.
  * ClaimValidationTest.java:
    11 detailed JUnit 5 + MockMvc integration tests (Valid submission, invalid blank
    fields, amount=0, negative amount, multipart file uploads, PDF/JPG/PNG/DOCX
    format verification, 404 handling).
  * SeleniumE2ETest.java:
    5 End-to-End browser test scenarios in headless Chrome.

--------------------------------------------------------------------------------
[B] Inside ansible/
--------------------------------------------------------------------------------

  * ansible.cfg:
    Ansible setting file — inventory location (inventory/hosts.yml), default
    remote user (devops), sudo privilege escalation (become=True).
  * inventory/hosts.yml:
    Managed hosts ki list. app_servers group me app-server-01 host define hai.
  * group_vars/all.yml:
    Global deployment variables: app_port: 8081, deploy_dir: /opt/travel-insurance,
    backup_dir: /opt/travel-insurance/backups, java_package: openjdk-21-jre-headless,
    health_check_url.
  * templates/app.service.j2:
    Jinja2 template file. Isse /etc/systemd/system/travel-insurance.service file
    generate hoti hai jo Linux systemd background service ke tor par application
    ko chalati hai.
  * playbooks/deploy.yml:
    Main automated deployment playbook (prerequisites install, backup purani jar,
    deploy new jar, restart service, verify health).
  * playbooks/health-check.yml:
    Standalone service verification playbook.
  * playbooks/rollback.yml:
    Automated zero-downtime disaster recovery playbook.

--------------------------------------------------------------------------------
[C] Inside word/, docs/, scripts/
--------------------------------------------------------------------------------

  * word/:
    - Project-Report-Travel-Insurance-DevOps.docx: 2 MB complete academic report
      (Cover page, Certificate, Abstract, Ch 1 to 9, Screenshots).
    - Combined-DevOps-Practical-File.docx: Master practical file of all 15 tasks
      matching official 'devops L8.docx' format.
    - Task-01.docx to Task-15.docx: Individual task practical reports.
  * docs/screenshots/:
    29 real execution screenshots (Git commits, Jenkins dashboard, Selenium tests
    passing, Docker build, Ansible rollback).
  * scripts/:
    Python automation scripts (build_all_deliverables.py, capture_all_evidence.py).


================================================================================
PART 4: TOP 26 EXTERNAL VIVA QUESTIONS & SPOKEN ANSWERS
================================================================================

Yeh wo questions hain jo external examiner pakka puchega. Inke answers seedhe
aur confident bhasha me yaad kar lo:

--------------------------------------------------------------------------------
Q01. What is the core problem statement of your project?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"Sir/Ma'am, traditional travel insurance claim settlement relies on manual
 paperwork, physical receipt mailing, and human verification, taking 15 to 20
 days. Our system digitizes this into an automated web portal with instant claim
 submission, document uploads, and a reviewer dashboard, reducing the processing
 turnaround time to under 5 minutes while maintaining a full DevOps CI/CD
 automated delivery lifecycle."

--------------------------------------------------------------------------------
Q02. Why did you choose Spring Boot instead of plain Servlets or NodeJS?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"Spring Boot provides an enterprise-grade framework with an embedded Tomcat
 server, automatic configuration, and robust dependency management. With Spring
 Data JPA and Hibernate, database interactions require zero boilerplate SQL
 queries, and Jakarta Bean Validation allows declarative server-side input
 validation."

--------------------------------------------------------------------------------
Q03. Where is your database running? What happens if the server restarts?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"Currently, we use an in-memory H2 database running directly in the JVM process
 memory (jdbc:h2:mem:claimdb). It is ideal for local development and CI testing
 because it requires zero external setup. When the server stops, the memory
 resets. However, because we use Spring Data JPA, we can easily switch to
 PostgreSQL or MySQL in production simply by changing the datasource URL in
 application.properties without touching a single line of Java code."

--------------------------------------------------------------------------------
Q04. What is a REST API? Which HTTP methods did you use in this project?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"REST (Representational State Transfer) is an architectural style for web
 services using standard HTTP verbs. In our project:
  - POST (/api/claims): Create and submit a new claim (returns 201 Created).
  - GET  (/api/claims/{id}, /api/reviewer/claims/pending): Fetch claim data
         without modifying anything (returns 200 OK).
  - PUT  (/api/reviewer/claims/{id}/approve, /reject): Update the state of an
         existing claim to APPROVED or REJECTED (returns 200 OK)."

--------------------------------------------------------------------------------
Q05. What is a DTO and why didn't you directly use the JPA Entity in the Controller?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"DTO stands for Data Transfer Object. If we expose our @Entity directly in the
 REST controller:
  1. A malicious user could send extra JSON fields like 'status: APPROVED' and
     bypass business rules (Mass Assignment vulnerability).
  2. DTO allows us to enforce strict input validation (@NotBlank, @DecimalMin)
     specifically for user input.
  3. It decouples the internal database schema from the external public API
     contract."

--------------------------------------------------------------------------------
Q06. How does input validation work in your project?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"We implement two-layer validation:
  1. Client-Side (JavaScript): In customer.js, we validate empty fields, valid
     dates, and positive amounts to give instant visual feedback to the user
     before sending the request.
  2. Server-Side (Spring Boot Bean Validation): In ClaimSubmitRequest.java,
     annotations like @NotBlank and @DecimalMin("0.01") ensure that even if
     someone bypasses the frontend using Postman or cURL, the server intercepts
     it and returns a 400 Bad Request via our GlobalExceptionHandler."

--------------------------------------------------------------------------------
Q07. Why did you write Selenium tests when you already had JUnit tests?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"JUnit and MockMvc test the Java classes and REST APIs in memory, but they do
 NOT test the actual user experience in a real browser. Selenium WebDriver launches
 a real Chrome browser instance, navigates pages, types into form fields, clicks
 buttons, and verifies DOM elements. It tests the complete integrated stack —
 HTML, CSS, JavaScript, Network calls, Backend APIs, and Database — proving that
 the application works for an actual end user."

--------------------------------------------------------------------------------
Q08. What does "Headless" mode mean in Selenium? Why use it?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"Headless mode (--headless=new) means the browser runs purely in memory without
 opening a visible Graphical User Interface window.
 We use it because:
  1. It is significantly faster and consumes less CPU and RAM.
  2. CI/CD servers like Jenkins or cloud Linux machines run in non-GUI terminal
     environments without a display monitor, so normal browsers would immediately
     crash."

--------------------------------------------------------------------------------
Q09. How did you handle synchronization/timing issues in Selenium?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"Instead of using hardcoded Thread.sleep() which wastes time and makes tests flaky,
 we used Selenium's WebDriverWait with ExpectedConditions. For example:
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("generatedClaimId"))).
 This waits dynamically until the element is present in the DOM or times out after
 10 seconds, ensuring fast, deterministic test execution."

--------------------------------------------------------------------------------
Q10. What is Continuous Integration (CI) vs Continuous Delivery (CD) vs Continuous Deployment?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"
  * Continuous Integration (CI):
    Developers frequently merge code into a shared repository. Every push triggers
    an automated build and test pipeline (e.g., Jenkins compiling and running tests).
  * Continuous Delivery (CD):
    After CI passes, the application artifact (JAR/Docker image) is automatically
    packaged and ready to be deployed to production with manual one-click approval.
  * Continuous Deployment:
    There is no manual approval gate; every change that passes the automated
    pipeline is immediately deployed live to production."

--------------------------------------------------------------------------------
Q11. Explain your Jenkins Declarative Pipeline stages.
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"Our Jenkinsfile contains 5 declarative stages:
  1. Checkout: Pulls the latest code from the Git repository.
  2. Build: Runs 'mvnw.cmd clean compile' to compile Java source code.
  3. Test: Runs 'mvnw.cmd test' to execute JUnit and Selenium tests, with an
     'always' post-action that publishes JUnit Surefire XML test reports.
  4. Package: Runs 'mvnw.cmd package -DskipTests' to generate the deployable fat JAR.
  5. Deploy: Prepares the deployment artifact according to the selected environment
     parameter (dev, staging, prod)."

--------------------------------------------------------------------------------
Q12. What happens if a JUnit test fails during the Jenkins build?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"If any test fails, Maven exits with a non-zero exit code (code 1). Jenkins
 immediately marks the Test stage as FAILED, terminates the pipeline, and sends an
 alert. The pipeline will NEVER proceed to the Package or Deploy stage, preventing
 defective code from reaching production."

--------------------------------------------------------------------------------
Q13. What is the difference between a Virtual Machine and a Docker Container?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"A Virtual Machine packages a full Guest Operating System along with its virtual
 kernel and hardware drivers, taking gigabytes of storage and minutes to boot.
 A Docker container shares the host OS kernel and packages only the application
 binaries and runtime dependencies, making it start in seconds, consume minimal
 RAM, and measure only a few hundred megabytes in size."

--------------------------------------------------------------------------------
Q14. What is a Multi-Stage Dockerfile and why did you use it?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"In a traditional Dockerfile, build tools like Maven and full JDKs remain inside
 the final production image, inflating the size to 800 MB+ and leaving compilers
 exposed to security risks. In our Multi-Stage Dockerfile:
  - Stage 1 (Builder): Uses maven:3.9.9-eclipse-temurin-21 to compile and package
    the fat JAR.
  - Stage 2 (Runtime): Uses a minimal eclipse-temurin:21-jre-jammy image, copying
    only the final JAR from the builder stage.
 This reduced the final image size to ~150 MB and eliminated unnecessary attack
 vectors."

--------------------------------------------------------------------------------
Q15. Why should a Docker container never run as root?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"If an attacker finds a vulnerability (such as remote code execution) in an
 application running as 'root' inside a container, they might achieve a 'Container
 Breakout' and gain full root privileges over the host machine. To prevent this,
 we created a dedicated system user 'devops' (UID 10001) in Stage 2 and added
 'USER devops', ensuring least-privilege security compliance."

--------------------------------------------------------------------------------
Q16. How does Docker layer caching work in your Dockerfile?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"Docker caches each layer sequentially. In our Dockerfile, we copy pom.xml first
 and run 'mvn dependency:go-offline' before copying the src/ directory. Because
 dependencies rarely change compared to source code, Docker reuses the cached
 dependency layer, cutting build times from several minutes to just a few seconds."

--------------------------------------------------------------------------------
Q17. What is Ansible and how is it different from Puppet and Chef?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"Ansible is an open-source automation and configuration management tool. The key
 difference is that Ansible is Agentless — it does not require any background
 agent software installed on the target nodes. It communicates over standard SSH
 (or local connections) using human-readable YAML playbooks, whereas Puppet and
 Chef require dedicated agents and complex Ruby-based DSLs."

--------------------------------------------------------------------------------
Q18. What is 'Idempotency' in Ansible?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"Idempotency means that executing a playbook multiple times will result in the
 exact same system state without repeating actions or causing errors. For example,
 if a directory already exists or a package is already installed, Ansible detects
 the state and marks it as 'ok' without modifying it or throwing an error."

--------------------------------------------------------------------------------
Q19. How does automated rollback work in Task 14?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"In Task 14, our deployment playbook takes a timestamped backup of the existing
 working JAR (app-backup-*.jar) before copying the new artifact. After deploying,
 an automated health check queries /index.html. If the health check fails or
 returns an error, our rollback.yml playbook automatically locates the latest
 backup JAR, stops the failing service, restores the previous JAR, restarts the
 systemd service, and verifies health — achieving zero-touch disaster recovery."

--------------------------------------------------------------------------------
Q20. What is a Git Feature Branching strategy? Why not commit directly to main?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"The main branch represents stable, production-ready code. Direct commits can
 break the build for other team members. Under the Feature Branching strategy,
 each developer creates an isolated branch (e.g., feature/claim-submission). Once
 the feature is complete and local tests pass, a Pull Request (PR) is opened,
 peer-reviewed, verified by CI, and only then merged into main."

--------------------------------------------------------------------------------
Q21. How did you resolve the Git Merge Conflict in Task 6?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"We simulated a conflict by creating two branches from main that modified the
 exact same configuration line in application.properties. When trying to merge,
 Git flagged conflict markers:

  <<<<<<< HEAD
  server.port=8081
  =======
  server.port=8082
  >>>>>>> conflict-test-b

 We inspected both branches, retained the intended port 8081, deleted the conflict
 markers, staged the resolved file with 'git add', and committed the merge commit
 with 'git commit'."

--------------------------------------------------------------------------------
Q22. What is the role of .gitignore and .dockerignore?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"
  * .gitignore:
    Prevents binary build artifacts (target/), IDE settings (.idea/, .vscode/),
    and local logs from being tracked in version control, keeping the repository
    small and clean.
  * .dockerignore:
    Excludes local build directories and files from being uploaded to the Docker
    daemon build context, speeding up image builds and preventing sensitive files
    from leaking into image layers."

--------------------------------------------------------------------------------
Q23. How do you stream uploaded documents safely in DocumentController.java?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"When a user views or downloads a document:
  1. We retrieve the binary byte array from the database.
  2. We detect the MIME type (e.g. application/pdf, image/png).
  3. We construct an RFC 6266 compliant Content-Disposition header with both
     ASCII fallback and UTF-8 encoded filename to handle spaces safely.
  4. For viewing, we use 'inline', allowing the browser to render the PDF directly
     in a new tab without forcing a download."

--------------------------------------------------------------------------------
Q24. What are Jinja2 templates in Ansible?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"Jinja2 is a templating engine used by Ansible (.j2 extension). In our project,
 app.service.j2 contains dynamic variables like {{ system_user }} and
 {{ app_port }}. During deployment, Ansible renders these variables into a
 concrete Linux systemd configuration file /etc/systemd/system/travel-insurance.service."

--------------------------------------------------------------------------------
Q25. How do you handle exceptions globally in Spring Boot?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"We implemented GlobalExceptionHandler.java annotated with @RestControllerAdvice.
 It uses @ExceptionHandler methods to catch specific exceptions like
 MethodArgumentNotValidException (for validation errors), ClaimNotFoundException
 (for 404s), and MaxUploadSizeExceededException. It maps them to clean, consistent
 JSON responses containing a timestamp, HTTP status, error type, and field-level
 error messages."

--------------------------------------------------------------------------------
Q26. What are the key academic deliverables you prepared?
--------------------------------------------------------------------------------
SPOKEN ANSWER:
"
  1. A fully functional Spring Boot 3.3.4 + H2 + Selenium web application.
  2. A Declarative Jenkinsfile and a Multi-Stage hardened Dockerfile.
  3. Complete Ansible IaC playbooks for deployment, health check, and rollback.
  4. 16 official Word practical reports formatted strictly according to the
     college 'devops L8.docx' template.
  5. A complete 2 MB academic Project Report
     (Project-Report-Travel-Insurance-DevOps.docx) with all chapters and screenshots.
  6. Over 29 verified execution screenshots documenting each task."


================================================================================
PART 5: LAST-MINUTE EXAM-DAY SURVIVAL SHEET
================================================================================

[+] DEMO SCREEN SETUP (Examiner aate hi yeh 4 tabs open rakhna):
--------------------------------------------------------------------------------
  1. TAB 1: Customer Portal  -->  http://localhost:8081/index.html
     * Form bharke ek claim submit karke dikhana. PDF upload karna. Status PENDING
       dikhana.

  2. TAB 2: Reviewer Portal  -->  http://localhost:8081/reviewer.html
     * Naya pending claim click karna. Document open karke dikhana. Approve ya
       Reject click karke dikhana.

  3. TAB 3: H2 Database Web Console  -->  http://localhost:8081/h2-console
     * JDBC URL: jdbc:h2:mem:claimdb | User: sa | Password: (empty)
     * 'SELECT * FROM CLAIM;' run karke live database table dikhana.

  4. TAB 4: Jenkins Dashboard  -->  http://localhost:8080/
     * Pipeline stages (Checkout -> Build -> Test -> Package) green dikhana.


[+] VS CODE ME HIGHLIGHT KARNE LAYAK 4 FILES:
--------------------------------------------------------------------------------
  * travel-insurance-claim-system/Jenkinsfile
    (Pipeline as code)
  * travel-insurance-claim-system/Dockerfile
    (Multi-stage build & non-root user)
  * travel-insurance-claim-system/src/test/java/.../SeleniumE2ETest.java
    (Browser automation)
  * ansible/playbooks/rollback.yml
    (Automated recovery)


[+] WORD REPORTS FOLDER:
--------------------------------------------------------------------------------
  * Folder path: C:\Users\Hasnain\Desktop\Devops\word
  * Main file to show: Combined-DevOps-Practical-File.docx ya
                       Project-Report-Travel-Insurance-DevOps.docx.

================================================================================
  All the best Hasnain! Tumhara project 100% verified, clean aur industry-standard
  hai. Confidently bolna! Good luck!
================================================================================

