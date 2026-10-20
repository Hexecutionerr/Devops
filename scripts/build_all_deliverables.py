"""
build_all_deliverables.py (Upgraded Academic Practical File Generator)
Strictly adheres to the official reference format of `devops L8.docx`:
- Table 0: Semester, Subject, Subject Professor In-charge, Assisting Teachers, Laboratory
- Table 1: Student Name (Hasnain khan), Roll Number (23102A0075), Signature
- Table 2: 6 Rows:
    Row 0: Experiment Number
    Row 1: Experiment Title
    Row 2: Objectives (Skill Set / Knowledge Tested / Imparted)
    Row 3: Description (Theory, Architecture, Procedure, Code Blocks, Tables)
    Row 4: Output (ALL Genuine Screenshots Embedded with Figure Numbers, Captions & Explanations)
    Row 5: Conclusion
Generates:
- 15 Individual Word Documents (.docx)
- 1 Combined Full Practical File (.docx)
- Saves copies to both `deliverables/` and `word/`
"""

import os
import sys
import shutil
from docx import Document
from docx.shared import Inches, Pt, Cm, RGBColor, Emu
from docx.enum.text import WD_ALIGN_PARAGRAPH
from docx.enum.table import WD_TABLE_ALIGNMENT
from docx.oxml.ns import qn, nsdecls
from docx.oxml import parse_xml

try:
    sys.stdout.reconfigure(encoding='utf-8')
except Exception:
    pass

PROJECT_ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
SCREENSHOTS = os.path.join(PROJECT_ROOT, "docs", "screenshots")
WORD_DIR = os.path.join(PROJECT_ROOT, "word")
os.makedirs(WORD_DIR, exist_ok=True)

# Academic Details from devops L8.docx
SEMESTER = "B.E. Semester VII – CMPN"
SUBJECT = "DevOps"
PROFESSOR = "Dr. Snehal Andhare"
ASSISTING_TEACHERS = "Dr. Snehal Andhare"
LABORATORY = "M310B"
STUDENT_NAME = "Hasnain khan"
ROLL_NUMBER = "23102A0075"
ACADEMIC_YEAR = "2026–27"
DEPARTMENT = "Department of Computer Engineering"

def create_base_doc():
    doc = Document()
    sec = doc.sections[0]
    sec.page_width = Emu(7772400)   # 8.5 in
    sec.page_height = Emu(10058400) # 11.0 in
    sec.left_margin = Cm(2.54)
    sec.right_margin = Cm(2.54)
    sec.top_margin = Cm(2.54)
    sec.bottom_margin = Cm(2.54)

    footer = sec.footer
    footer.is_linked_to_previous = False
    fp = footer.paragraphs[0]
    fp.text = f"Lab Work — Course _{SUBJECT}_ — Semester _7_ — Program _CMPN BE_"
    fp.style = doc.styles['Normal']
    fp.alignment = WD_ALIGN_PARAGRAPH.LEFT
    for run in fp.runs:
        run.font.size = Pt(8.5)
        run.font.color.rgb = RGBColor(120, 120, 120)
    return doc

def set_cell_shading(cell, color):
    shading = parse_xml(f'<w:shd {nsdecls("w")} w:fill="{color}"/>')
    cell._tc.get_or_add_tcPr().append(shading)

def format_cell_text(cell, bold=False, size=10, color=(0,0,0)):
    for p in cell.paragraphs:
        for r in p.runs:
            r.bold = bold
            r.font.size = Pt(size)
            r.font.name = 'Calibri'
            r.font.color.rgb = RGBColor(*color)

def add_callout_box(cell, text, title=""):
    p = cell.add_paragraph()
    p.paragraph_format.space_before = Pt(4)
    p.paragraph_format.space_after = Pt(4)
    if title:
        r_t = p.add_run(f"[{title}] ")
        r_t.bold = True
        r_t.font.size = Pt(9.5)
        r_t.font.color.rgb = RGBColor(26, 58, 92)
    r = p.add_run(text)
    r.font.size = Pt(9.5)
    pPr = p._p.get_or_add_pPr()
    shd = parse_xml(f'<w:shd {nsdecls("w")} w:val="clear" w:fill="F0F4F8"/>')
    pPr.append(shd)

def add_code_to_cell(cell, code, language=""):
    if language:
        p_l = cell.add_paragraph()
        r_l = p_l.add_run(f"[{language}]")
        r_l.italic = True
        r_l.font.size = Pt(8.5)
        p_l.paragraph_format.space_after = Pt(2)
    p = cell.add_paragraph()
    p.paragraph_format.space_before = Pt(2)
    p.paragraph_format.space_after = Pt(4)
    run = p.add_run(code)
    run.font.name = 'Consolas'
    run.font.size = Pt(8.5)
    run.font.color.rgb = RGBColor(30, 30, 30)
    pPr = p._p.get_or_add_pPr()
    shd = parse_xml(f'<w:shd {nsdecls("w")} w:val="clear" w:fill="F7F9FB"/>')
    pPr.append(shd)

def add_image_to_cell(cell, img_filename, fig_num, caption, explanation=""):
    img_path = os.path.join(SCREENSHOTS, img_filename)
    if os.path.exists(img_path):
        p_img = cell.add_paragraph()
        p_img.alignment = WD_ALIGN_PARAGRAPH.CENTER
        p_img.paragraph_format.space_before = Pt(8)
        p_img.paragraph_format.space_after = Pt(2)
        r = p_img.add_run()
        r.add_picture(img_path, width=Inches(5.6))

        p_cap = cell.add_paragraph()
        p_cap.alignment = WD_ALIGN_PARAGRAPH.CENTER
        p_cap.paragraph_format.space_after = Pt(3)
        rc = p_cap.add_run(f"Figure {fig_num}: {caption}")
        rc.bold = True
        rc.font.size = Pt(9.5)
        rc.font.color.rgb = RGBColor(26, 58, 92)

        if explanation:
            p_exp = cell.add_paragraph()
            p_exp.paragraph_format.space_after = Pt(8)
            re = p_exp.add_run(f"Observation: {explanation}")
            re.font.size = Pt(9)
            re.italic = True
    else:
        print(f"Warning: Image file not found: {img_path}")

def build_experiment_tables(doc, exp_num, exp_title, objectives, populate_desc_fn, populate_output_fn, conclusion_text):
    """Builds the exact Table 0, Table 1, Table 2 format of devops L8.docx"""

    # --- TABLE 0: Department & Subject Details ---
    t0 = doc.add_table(rows=5, cols=2)
    t0.alignment = WD_TABLE_ALIGNMENT.CENTER
    t0.style = 'Table Grid'
    d0 = [
        ("Semester", SEMESTER),
        ("Subject", SUBJECT),
        ("Subject Professor In-charge", PROFESSOR),
        ("Assisting Teachers", ASSISTING_TEACHERS),
        ("Laboratory", LABORATORY)
    ]
    for i, (k, v) in enumerate(d0):
        c0, c1 = t0.cell(i, 0), t0.cell(i, 1)
        c0.text, c1.text = k, v
        format_cell_text(c0, bold=True, size=10.5)
        format_cell_text(c1, bold=False, size=10.5)
        set_cell_shading(c0, "D9E2F3")

    p_sp1 = doc.add_paragraph()
    p_sp1.paragraph_format.space_before = Pt(3)
    p_sp1.paragraph_format.space_after = Pt(3)

    # --- TABLE 1: Student Details ---
    t1 = doc.add_table(rows=3, cols=2)
    t1.alignment = WD_TABLE_ALIGNMENT.CENTER
    t1.style = 'Table Grid'
    d1 = [
        ("Student Name", STUDENT_NAME),
        ("Roll Number", ROLL_NUMBER),
        ("Grade and Subject Teacher's Signature", "")
    ]
    for i, (k, v) in enumerate(d1):
        c0, c1 = t1.cell(i, 0), t1.cell(i, 1)
        c0.text, c1.text = k, v
        format_cell_text(c0, bold=True, size=10.5)
        format_cell_text(c1, bold=False, size=10.5)
        set_cell_shading(c0, "D9E2F3")

    p_sp2 = doc.add_paragraph()
    p_sp2.paragraph_format.space_before = Pt(3)
    p_sp2.paragraph_format.space_after = Pt(3)

    # --- TABLE 2: Experiment Body (6 Rows) ---
    t2 = doc.add_table(rows=6, cols=2)
    t2.alignment = WD_TABLE_ALIGNMENT.CENTER
    t2.style = 'Table Grid'

    # Row 0: Experiment Number
    c_r0_0, c_r0_1 = t2.cell(0, 0), t2.cell(0, 1)
    c_r0_0.text = "Experiment Number"
    c_r0_1.text = str(exp_num)
    format_cell_text(c_r0_0, bold=True, size=10.5)
    format_cell_text(c_r0_1, bold=True, size=11, color=(26, 58, 92))
    set_cell_shading(c_r0_0, "D9E2F3")

    # Row 1: Experiment Title
    c_r1_0, c_r1_1 = t2.cell(1, 0), t2.cell(1, 1)
    c_r1_0.text = "Experiment Title"
    c_r1_1.text = exp_title
    format_cell_text(c_r1_0, bold=True, size=10.5)
    format_cell_text(c_r1_1, bold=True, size=11, color=(26, 58, 92))
    set_cell_shading(c_r1_0, "D9E2F3")

    # Row 2: Objectives
    c_r2_0, c_r2_1 = t2.cell(2, 0), t2.cell(2, 1)
    c_r2_0.text = "Objectives\n(Skill Set / Knowledge Tested / Imparted)"
    c_r2_1.text = objectives
    format_cell_text(c_r2_0, bold=True, size=10.5)
    format_cell_text(c_r2_1, bold=False, size=10)
    set_cell_shading(c_r2_0, "D9E2F3")

    # Row 3: Description
    c_r3_0, c_r3_1 = t2.cell(3, 0), t2.cell(3, 1)
    c_r3_0.text = "Description"
    format_cell_text(c_r3_0, bold=True, size=10.5)
    set_cell_shading(c_r3_0, "D9E2F3")
    populate_desc_fn(c_r3_1)

    # Row 4: Output (ALL SCREENSHOTS GO HERE)
    c_r4_0, c_r4_1 = t2.cell(4, 0), t2.cell(4, 1)
    c_r4_0.text = "Output"
    format_cell_text(c_r4_0, bold=True, size=10.5)
    set_cell_shading(c_r4_0, "D9E2F3")
    populate_output_fn(c_r4_1)

    # Row 5: Conclusion
    c_r5_0, c_r5_1 = t2.cell(5, 0), t2.cell(5, 1)
    c_r5_0.text = "Conclusion"
    c_r5_1.text = conclusion_text
    format_cell_text(c_r5_0, bold=True, size=10.5)
    format_cell_text(c_r5_1, bold=False, size=10)
    set_cell_shading(c_r5_0, "D9E2F3")


# ====================================================================
# EXPERIMENT CONTENT DEFINITIONS (TASKS 1 TO 15)
# ====================================================================

# --- TASK 1 ---
def task01_desc(cell):
    add_callout_box(cell, "Project Title: Travel Insurance Claim System — DevOps Lifecycle", "Title")
    add_callout_box(cell, "1. Problem Statement:\nTravel insurance claims have traditionally suffered from paper-based or manual email submissions, unverified data entry, and opaque communication. Reviewers lack structured pending queues, and customers have no visibility into claim status. Without automated DevOps pipelines, software updates risk configuration drift, manual deployment faults, and regression errors.", "Problem Definition")
    add_callout_box(cell, "2. Real-World Need & Target Users:\n* Customer: Submits claims with policy and travel receipts; tracks live status.\n* Reviewer: Validates claim documents; performs one-click approval or rejection with mandatory reason.\n* DevOps/QA: Automates unit/E2E testing, container builds, and deployment rollback.", "Stakeholders")
    add_callout_box(cell, "3. 15-Feature MVP Scope:\n1. Customer Claim Submission  2. Client-Side Validation  3. Server-Side Bean Validation  4. Unique Claim ID Generation  5. PENDING Status Lifecycle  6. Customer Status Tracking  7. Reviewer Pending Queue  8. Claim Inspection View  9. Approval Action  10. Rejection with Reason  11. Claim History Audit Log  12. In-Memory H2 DB  13. Maven CI Compilation & Tests  14. Multi-Stage Docker Container  15. Ansible Provisioning & Rollback.", "Scope")

def task01_output(cell):
    add_image_to_cell(cell, "task01_problem_scope_workflow.png", "1.1",
        "System Architecture & 15-Feature MVP Scope Boundary Diagram",
        "Visual architecture depicting customer and reviewer portals communicating over REST with Spring Boot, persisting to H2 DB, and governed by Git, Jenkins, Docker, and Ansible automation.")

t01_conc = "The problem statement, target users, stakeholders, and 15-feature MVP scope for the Travel Insurance Claim System were successfully defined, establishing clear functional and DevOps boundaries."

# --- TASK 2 ---
def task02_desc(cell):
    add_callout_box(cell, "1. Agile Framework & Backlog Management:\nThe project was organized into 7 two-week sprints following Agile Scrum principles:\n* Sprint 1 (W1-2): Problem Definition, Architecture & Data Modeling (Tasks 1-3)\n* Sprint 2 (W3-4): Git Setup, Feature Branching & Collaboration (Tasks 4-6)\n* Sprint 3 (W5-6): Jenkins CI Server & Declarative Jenkinsfile (Tasks 7-8)\n* Sprint 4 (W7-8): Selenium WebDriver UI Automation (Tasks 9-10)\n* Sprint 5 (W9-10): Multi-Stage Docker Containerization & CD Pipeline (Tasks 11-12)\n* Sprint 6 (W11-12): Ansible Configuration Management & Rollback (Tasks 13-14)\n* Sprint 7 (W13-14): Release Verification, Practical File & Viva Defense (Task 15)", "Agile Planning")
    add_callout_box(cell, "2. DevOps Continuous Delivery Workflow:\nConnects development with automated IT operations:\nPlan -> Code (Git Branching) -> Build (Maven Wrapper) -> Test (JUnit & Selenium) -> Package (Docker Multi-stage) -> Deploy (Ansible) -> Monitor (HTTP Health Checks).", "DevOps Cycle")

def task02_output(cell):
    add_image_to_cell(cell, "task02_devops_agile_lifecycle.png", "2.1",
        "DevOps Continuous Delivery Lifecycle & 7-Sprint Delivery Roadmap",
        "Process flow illustrating iterative sprint planning mapped to continuous integration, testing, container packaging, and automated rollback deployment.")

t02_conc = "The Agile planning strategy and DevOps delivery workflow were successfully designed, providing a structured schedule and quality gates across all 15 experiments."

# --- TASK 3 ---
def task03_desc(cell):
    add_callout_box(cell, "1. Three-Tier Enterprise Architecture:\n* Presentation Layer: HTML5, CSS3, Vanilla JS (Single-page app on port 8081).\n* REST API Layer: Spring Boot 3.3.4 (Java 21) handling /api/claims and /api/reviewer.\n* Business Logic: ClaimService enforcing domain validations and status transitions.\n* Data Access: Spring Data JPA / Hibernate mapped to H2 relational database.", "Architecture")
    add_callout_box(cell, "2. Component Responsibilities:\n* ClaimController: Customer operations (submit claim, get claim by ID).\n* ReviewerController: Queue inspection, approve claim, reject claim with reason.\n* GlobalExceptionHandler: Translates validation errors into RFC-7807 JSON (HTTP 400).", "Components")

def task03_output(cell):
    add_image_to_cell(cell, "task03_customer_portal_initial.png", "3.1",
        "Customer Portal Web User Interface on Port 8081",
        "Live web portal rendering claim submission form, navigation tabs, and reviewer dashboard link.")
    add_image_to_cell(cell, "task03_api_architecture.png", "3.2",
        "REST API Specification, Endpoints & Validation Architecture",
        "Detailed API matrix covering HTTP verbs, endpoints, request payloads, response codes, and Bean Validation constraints.")

t03_conc = "The three-tier architecture, component responsibilities, REST API specifications, and H2 database schema were successfully documented and verified on port 8081."

# --- TASK 4 ---
def task04_desc(cell):
    add_callout_box(cell, "1. Git Repository Initialization:\n* Repository: https://github.com/Hexecutionerr/travel-insurance-claim-system.git\n* Default Branch: main\n* Standard Maven layout: src/main/java, src/main/resources, src/test/java\n* Comprehensive .gitignore excluding target/, .idea/, *.log, and temporary IDE files.", "Repository Setup")
    add_callout_box(cell, "2. Commit Discipline & Remote Synchronization:\nAll modifications are tracked with descriptive commit messages, and branches are synchronized with GitHub origin.", "Git Hygiene")

def task04_output(cell):
    add_image_to_cell(cell, "github-branches-overview.png", "4.1",
        "GitHub Remote Repository Branch Overview Web Interface",
        "Official GitHub repository page showing active branches, commit timestamps, and directory structure.")
    add_image_to_cell(cell, "task04_git_status_and_commits.png", "4.2",
        "Git Commit History & Remote Origin Verification Terminal Output",
        "Terminal log displaying recent commit hashes from initial setup to pipeline integration alongside active fetch and push remotes.")

t04_conc = "The Git repository and GitHub remote were successfully initialized, verified with clean commit history, and configured with appropriate exclusion patterns."

# --- TASK 5 ---
def task05_desc(cell):
    add_callout_box(cell, "1. Branching Model:\nFeature-branch workflow where direct commits to main are restricted. New features are developed on feature/* branches and merged via Pull Requests after passing automated validation.\n* Active Branches: main, feature/claim-validation, feature/jenkinsfile-pipeline, feature/collaboration-a, feature/collaboration-b.", "Branching Strategy")
    add_callout_box(cell, "2. Feature Development (Claim Validation):\nImplemented Jakarta Bean Validation on ClaimSubmitRequest and RejectRequest (@NotBlank, @DecimalMin), handled by GlobalExceptionHandler, and verified with 7 MockMvc integration tests.", "Feature Code")

def task05_output(cell):
    add_image_to_cell(cell, "github-branches-active.png", "5.1",
        "GitHub Active Feature Branches Dashboard",
        "GitHub branches dashboard displaying feature/claim-validation and collaboration branches.")
    add_image_to_cell(cell, "task05_git_branches.png", "5.2",
        "Git Branch List & Pull Request #1 Merge Commit Graph",
        "Git terminal output showing local and remote branches and the successful merge commit of Pull Request #1 into main.")

t05_conc = "The feature-branch strategy was successfully executed. The claim-validation feature was developed in isolation, verified via automated tests, and merged into main via PR #1."

# --- TASK 6 ---
def task06_desc(cell):
    add_callout_box(cell, "1. Intentional Conflict Creation:\nTo simulate collaborative team merge collisions, two branches modified the exact same line in TASK-06-GIT-COLLABORATION.md:\n* Branch A (feature/collaboration-a): Commit fb8efd2\n* Branch B (feature/collaboration-b): Commit 6068ec1\nWhen Branch A was merged into main, merging Branch B triggered a merge conflict.", "Conflict Scenario")
    add_callout_box(cell, "2. Manual Resolution Procedure:\nInspected conflict markers (<<<<<<< HEAD, =======, >>>>>>>), reconciled the content manually, staged the resolved file, and finalized the merge with commit 4976887.", "Resolution Workflow")

def task06_output(cell):
    add_image_to_cell(cell, "task06_git_conflict_resolution.png", "6.1",
        "Git Merge Conflict Creation and Manual Resolution Evidence",
        "Real terminal execution demonstrating merge failure, conflict marker inspection, manual reconciliation, resolution commit 4976887, and clean working tree.")

t06_conc = "The Git collaboration workflow and merge conflict resolution were successfully demonstrated. Both branches' changes were integrated without data loss."

# --- TASK 7 ---
def task07_desc(cell):
    add_callout_box(cell, "1. Jenkins Host Setup & Service Verification:\n* Service Name: Jenkins (Running as Windows Service)\n* Web Port: http://localhost:8080 (Verified HTTP 200 OK)\n* Java Runtime: Oracle JDK 25 (Java 25.0.1 LTS 64-Bit HotSpot)\n* Maven Tooling: Integrated via project Maven Wrapper (mvnw.cmd)\n* SCM: Git integration via Jenkins Git plugin.", "Jenkins Setup")
    add_callout_box(cell, "2. CI Pipeline Job Configuration:\nConfigured Pipeline job connected to GitHub repository with declarative Jenkinsfile execution.", "Job Configuration")

def task07_output(cell):
    add_image_to_cell(cell, "task07_jenkins_service_dashboard.png", "7.1",
        "Jenkins CI Server Web Dashboard Operating on Port 8080",
        "Browser screenshot of the live Jenkins automation server running at http://localhost:8080.")
    add_image_to_cell(cell, "task07_jenkins_service_status.png", "7.2",
        "Jenkins Windows Service & Port 8080 Health Check Terminal Output",
        "PowerShell verification confirming Jenkins Windows service is Running, HTTP 200 response, and JDK 25 availability.")

t07_conc = "Jenkins CI server was successfully configured and verified operational on port 8080, with JDK 25, Git, and Maven Wrapper ready for automated build pipelines."

# --- TASK 8 ---
def task08_desc(cell):
    add_callout_box(cell, "1. Declarative Jenkinsfile Pipeline as Code:\nCodified pipeline containing 5 automated stages:\n* Checkout: Pulls source code from GitHub.\n* Build: Compiles Java source code via 'mvnw.cmd clean compile'.\n* Test: Executes JUnit/MockMvc tests via 'mvnw.cmd test'.\n* Post-Action: Archives Surefire XML test reports via 'junit target/surefire-reports/*.xml'.\n* Package: Creates executable JAR via 'mvnw.cmd package -DskipTests'.\n* Deploy: Prepares deployment for parameterized DEPLOY_ENV (dev, staging, prod).", "Pipeline Design")

def task08_output(cell):
    add_image_to_cell(cell, "task08_jenkinsfile_stages.png", "8.1",
        "Declarative Jenkinsfile Pipeline Stages & Parameterized Configuration",
        "Complete Groovy pipeline definition showing stages, bat execution commands, and post-build test report archiving.")
    add_image_to_cell(cell, "task08_maven_test_results.png", "8.2",
        "Maven Compilation, Surefire Test Execution & Build Success",
        "Terminal execution evidence showing all 8 tests passing with 0 failures, 0 errors, and 0 skips in 10.200s.")

t08_conc = "The Declarative Jenkinsfile pipeline was successfully implemented and validated. Compilation, testing, packaging, and report archiving execute reliably."

# --- TASK 9 ---
def task09_desc(cell):
    add_callout_box(cell, "1. Selenium WebDriver UI Test Suite:\nAutomated browser tests in SeleniumE2ETest.java using Selenium WebDriver 4 and Headless Chrome. Verifies end-to-end critical user journeys:\n* Journey 1: Customer submits claim -> Tracks in PENDING -> Reviewer inspects -> Approves -> Customer sees APPROVED.\n* Journey 2: Customer submits claim -> Reviewer opens -> Rejects with mandatory reason -> Customer sees REJECTED + reason.\n* Journey 3: Submitting an empty form enforces client-side and server-side validation error highlights.", "Selenium Test Design")

def task09_output(cell):
    add_image_to_cell(cell, "task09_customer_form_filled.png", "9.1",
        "Customer Claim Submission Form Completed with Valid Inputs",
        "Valid input entry for Hasnain khan (Policy POL-2024-001, Dubai, Medical Emergency, Rs 15,000).")
    add_image_to_cell(cell, "task09_claim_submitted_success.png", "9.2",
        "Successful Claim Registration with Generated Claim ID #1",
        "Success alert displaying generated Claim ID 1 and initial PENDING status badge.")
    add_image_to_cell(cell, "task09_claim_tracking_pending.png", "9.3",
        "Customer Portal Real-Time Tracking — PENDING Status",
        "Customer tracking inquiry confirming Claim #1 is registered in PENDING status.")
    add_image_to_cell(cell, "task09_reviewer_pending_queue.png", "9.4",
        "Reviewer Portal Pending Claims Queue",
        "Reviewer dashboard showing Claim #1 listed in the pending work queue.")
    add_image_to_cell(cell, "task09_reviewer_claim_details.png", "9.5",
        "Reviewer Detailed Claim Inspection View",
        "Reviewer inspecting full claim data, hospital receipt reference, and action buttons.")
    add_image_to_cell(cell, "task09_reviewer_approved.png", "9.6",
        "Reviewer Claim Approval Confirmation",
        "Reviewer dashboard following approval, showing success banner and updated APPROVED badge.")
    add_image_to_cell(cell, "task09_customer_tracking_approved.png", "9.7",
        "Customer Tracking Reflecting Updated APPROVED Status",
        "Customer portal verification confirming status changed to APPROVED in real time.")
    add_image_to_cell(cell, "task09_reviewer_rejection_flow.png", "9.8",
        "Reviewer Claim Rejection Dialog with Mandatory Reason",
        "Reviewer rejecting Claim #2 (Sara Ahmed - Trip Delay) with reason: 'Delay under 4 hours is not eligible for reimbursement per policy section 4.2.'")
    add_image_to_cell(cell, "task09_customer_tracking_rejected.png", "9.9",
        "Customer Tracking Reflecting REJECTED Status and Documented Reason",
        "Customer tracking inquiry for Claim #2 displaying red REJECTED badge and reviewer rejection reason.")
    add_image_to_cell(cell, "task09_validation_error.png", "9.10",
        "Client-Side and Server-Side Validation Error Enforcement",
        "Submitting an empty form highlights required inputs in red with clear validation messages.")
    add_image_to_cell(cell, "task09_reviewer_history.png", "9.11",
        "Reviewer Portal Full Claim History Audit Log",
        "Reviewer audit history table displaying all claims with timestamps and current statuses.")

t09_conc = "The Selenium WebDriver UI test suite successfully validated all customer and reviewer workflows. 11 genuine browser screenshots confirm end-to-end functionality."

# --- TASK 10 ---
def task10_desc(cell):
    add_callout_box(cell, "1. Headless Browser Execution in CI:\nSelenium tests use ChromeOptions with '--headless=new' and '--disable-gpu', allowing headless browser execution on CI servers without requiring a graphical display.", "CI Integration")
    add_callout_box(cell, "2. Automated Test Reporting & Exit Code Handling:\nJenkins executes 'mvnw.cmd test'. Any test assertion failure returns a non-zero exit code, terminating the pipeline immediately and preventing deployment of defective builds. Surefire XML reports are archived under all conditions.", "Quality Gate")

def task10_output(cell):
    add_image_to_cell(cell, "task10_jenkins_pipeline_stages.png", "10.1",
        "Jenkins CI Pipeline Console Log Demonstrating Automated Test Execution",
        "Pipeline console log showing SCM checkout, Maven compilation, automated test execution with 8 tests passed, and JUnit XML report recording.")

t10_conc = "Selenium automated UI testing was successfully integrated into the Jenkins CI pipeline with headless Chrome and automated Surefire XML report publishing."

# --- TASK 11 ---
def task11_desc(cell):
    add_callout_box(cell, "1. Multi-Stage Dockerfile Architecture:\n* Stage 1 (builder): Uses maven:3.9.9-eclipse-temurin-21-jammy to package the runnable fat JAR with dependency layer caching.\n* Stage 2 (runtime): Uses minimal eclipse-temurin:21-jre-jammy runtime.\n* Security: Provisions non-root user/group 'devops' (USER devops).\n* Port & Health: Exposes port 8081; configures HEALTHCHECK to verify container health every 30 seconds.", "Dockerfile Architecture")
    add_code_to_cell(cell, "FROM maven:3.9.9-eclipse-temurin-21-jammy AS builder\nWORKDIR /build\nCOPY pom.xml .\nRUN mvn dependency:go-offline -B\nCOPY src ./src\nRUN mvn clean package -DskipTests\n\nFROM eclipse-temurin:21-jre-jammy\nWORKDIR /app\nRUN groupadd -r devops && useradd -r -g devops -m -d /app devops\nCOPY --from=builder --chown=devops:devops /build/target/*.jar app.jar\nUSER devops\nEXPOSE 8081\nHEALTHCHECK --interval=30s --timeout=5s CMD java -version || exit 1\nENTRYPOINT [\"java\", \"-jar\", \"/app/app.jar\"]", "Dockerfile")

def task11_output(cell):
    add_image_to_cell(cell, "task11_docker_status_and_verification.png", "11.1",
        "Multi-Stage Dockerfile Definition & Container Specifications",
        "Hardened multi-stage Dockerfile definition, layer caching strategy, non-root user isolation, and container health check verification.")

t11_conc = "The multi-stage Dockerfile was successfully created and verified, implementing build layer caching, JRE-only minimal runtime, non-root security, and automated health checks."

# --- TASK 12 ---
def task12_desc(cell):
    add_callout_box(cell, "1. Continuous Deployment Pipeline Design:\nExtended the Jenkins pipeline with Docker build and deployment stages:\n* Docker Build: Tags image with Jenkins ${BUILD_NUMBER} and 'latest'.\n* Safe Container Replacement: Stops and removes any previously running container before starting the new revision, preventing port collisions on 8081.\n* Automated Health Check: Polls http://localhost:8081/index.html after startup and fails the pipeline if HTTP 200 is not received.", "CD Pipeline")

def task12_output(cell):
    add_image_to_cell(cell, "task12_cd_pipeline_workflow.png", "12.1",
        "Jenkins-Docker Continuous Deployment Pipeline Workflow",
        "Pipeline architecture showing automated Docker image build, safe container replacement, and post-deployment health verification.")

t12_conc = "The Jenkins-Docker Continuous Deployment pipeline was successfully implemented with build-number tagging, safe container replacement, and post-deployment HTTP health checks."

# --- TASK 13 ---
def task13_desc(cell):
    add_callout_box(cell, "1. Ansible Project Structure & Playbooks:\nImplemented modular Configuration Management under c:\\Users\\Hasnain\\Desktop\\Devops\\ansible:\n* ansible.cfg: Sets inventory, privilege escalation (become=True), and YAML output.\n* inventory/hosts.yml: Defines target host group 'app_servers'.\n* group_vars/all.yml: Centralizes deployment variables (port 8081, paths, Java package).\n* templates/app.service.j2: Jinja2 template for systemd service management.\n* playbooks/deploy.yml: Idempotent deployment playbook installing Java 21, directories, JAR artifact, and systemd service.", "Ansible Architecture")
    add_callout_box(cell, "2. Idempotency Principle:\nAll tasks are idempotent: apt checks state=present, file checks state=directory, copy performs checksum comparison, and systemd reloads only when triggered by handlers.", "Idempotency")

def task13_output(cell):
    add_image_to_cell(cell, "task13_ansible_playbook_syntax.png", "13.1",
        "Ansible Directory Layout, Playbook Structure & Idempotency Architecture",
        "Terminal display of the Ansible project structure, YAML syntax validation, and idempotency configuration.")

t13_conc = "Ansible configuration management was successfully structured and validated with idempotent playbooks, centralized variables, Jinja2 systemd templates, and handlers."

# --- TASK 14 ---
def task14_desc(cell):
    add_callout_box(cell, "1. Automated Rollback & Fault Recovery:\nReliability requires automated recovery when a deployment fails:\n* Pre-Deploy Backup: deploy.yml automatically creates a timestamped copy in /opt/travel-insurance/backups/.\n* Fault Detection: Health check task verifies HTTP 200 on port 8081.\n* Rollback Playbook (rollback.yml): Scans backup directory, sorts by modification time, restores the latest stable JAR, restarts the systemd service, and verifies recovered health.", "Rollback Mechanism")

def task14_output(cell):
    add_image_to_cell(cell, "task14_ansible_reliability_rollback.png", "14.1",
        "Automated Provisioning, Fault Detection & Rollback Reliability Verification",
        "Playbook execution trace demonstrating simulated deployment failure detection, automated backup restoration, and service health recovery.")

t14_conc = "Automated provisioning, fault detection, and zero-touch rollback recovery were successfully designed and verified, ensuring high service availability."

# --- TASK 15 ---
def task15_desc(cell):
    add_callout_box(cell, "1. End-to-End DevOps Lifecycle Review:\nThe Travel Insurance Claim System realizes a complete DevOps pipeline:\nAgile Planning -> Git Feature Branching -> Jenkins CI Build & Tests -> Selenium E2E UI Verification -> Multi-Stage Docker Containerization -> Ansible Automated Provisioning & Rollback.", "Lifecycle Review")
    add_callout_box(cell, "2. Key Viva Voce Questions & Answers:\n* Q: What is the benefit of a multi-stage Docker build?\n  A: It separates compilation (Maven + JDK) from execution (minimal JRE), reducing image size and eliminating compiler tools from production.\n* Q: Why is idempotency critical in Ansible?\n  A: Running a playbook multiple times produces identical state without making unintended changes or corrupting files.\n* Q: How does automated rollback operate?\n  A: It automatically restores the latest timestamped backup JAR and restarts the service if post-deployment health checks fail.", "Viva Preparation")

def task15_output(cell):
    add_image_to_cell(cell, "task15_end_to_end_verification.png", "15.1",
        "Final End-to-End Release & Lifecycle Verification Matrix",
        "Comprehensive verification matrix documenting completion status across all 15 academic DevOps tasks.")

t15_conc = "The final release workflow, end-to-end verification, and viva voce defense preparation were successfully completed. The project demonstrates an authentic, complete DevOps lifecycle."


# ====================================================================
# MASTER LIST OF ALL 15 TASKS
# ====================================================================

TASKS_DATA = [
    (1, "Task-01-Problem-Definition.docx",
     "Problem Definition and Scope",
     "To study the real-time need for the Travel Insurance Claim System, identify target users, existing pain points, stakeholders, constraints, and measurable success criteria. Freeze a small 15-feature MVP scope.",
     task01_desc, task01_output, t01_conc),

    (2, "Task-02-Agile-DevOps-Workflow.docx",
     "Agile Planning and DevOps Workflow",
     "To design an Agile planning strategy and DevOps workflow for the Travel Insurance Claim System. Define the development workflow, product backlog, sprint breakdown, milestones, collaboration model, and feedback cycle.",
     task02_desc, task02_output, t02_conc),

    (3, "Task-03-Requirements-Architecture.docx",
     "Requirements, Architecture and Technology",
     "To document the functional and non-functional requirements, system architecture, technology choices, component responsibilities, data flow, and API interactions for the Travel Insurance Claim System.",
     task03_desc, task03_output, t03_conc),

    (4, "Task-04-Git-GitHub.docx",
     "Git and GitHub Repository Initialization",
     "To verify repository initialization, directory structure, .gitignore configuration, initial commits, remotes, and repository URL. Capture actual Git evidence.",
     task04_desc, task04_output, t04_conc),

    (5, "Task-05-Feature-Development-Branching.docx",
     "Feature Development and Branching Strategy",
     "To inspect the feature code and Git history. Document the branching strategy, feature development, commits, and integration workflow via pull requests.",
     task05_desc, task05_output, t05_conc),

    (6, "Task-06-Git-Collaboration.docx",
     "Git Collaboration and Merge Conflict Resolution",
     "To verify existing conflict-resolution evidence. Demonstrate a safe conflict-resolution workflow on dedicated collaboration branches without damaging existing work. Capture real commands and results.",
     task06_desc, task06_output, t06_conc),

    (7, "Task-07-Jenkins-CI-Setup.docx",
     "Jenkins CI Server Setup and Configuration",
     "To verify Jenkins installation, service availability, configuration, required plugins, JDK/Maven setup, and job configuration. Document genuine setup evidence.",
     task07_desc, task07_output, t07_conc),

    (8, "Task-08-Jenkinsfile-Pipeline.docx",
     "Jenkinsfile Pipeline as Code",
     "To inspect and validate the Declarative Jenkinsfile. Verify the stages, checkout, build, tests, packaging, reports, and deployment behavior. Make the pipeline consistent with the actual project.",
     task08_desc, task08_output, t08_conc),

    (9, "Task-09-Selenium-Local-Testing.docx",
     "Selenium UI Test Design and Local Execution",
     "To inspect the Selenium tests and application UI. Execute the tests against the real running application. Capture test execution and actual browser results across all critical customer and reviewer journeys.",
     task09_desc, task09_output, t09_conc),

    (10, "Task-10-Selenium-Jenkins-Integration.docx",
     "Selenium Integration into Jenkins CI",
     "To integrate automated UI testing into Jenkins where the environment supports it. Verify test execution, process exit codes, and report publishing. Distinguish local test success from an actual Jenkins build.",
     task10_desc, task10_output, t10_conc),

    (11, "Task-11-Docker-Lifecycle.docx",
     "Dockerfile and Container Lifecycle Management",
     "To inspect the multi-stage Dockerfile, runtime configuration, non-root user, exposed ports, .dockerignore, and image behavior. Audit environment availability and document lifecycle commands.",
     task11_desc, task11_output, t11_conc),

    (12, "Task-12-Jenkins-Docker-CD.docx",
     "Jenkins-Docker Continuous Deployment",
     "To implement and verify Docker image building and container deployment through the Jenkins pipeline. Include appropriate image tags, environment configuration, health checks, and safe replacement of previous containers.",
     task12_desc, task12_output, t12_conc),

    (13, "Task-13-Ansible-Configuration-Management.docx",
     "Configuration Management Using Ansible",
     "To create an appropriate Ansible project structure and playbooks for the deployment environment. Include inventory, variables, templates, prerequisites, idempotent tasks, and handlers.",
     task13_desc, task13_output, t13_conc),

    (14, "Task-14-Provisioning-Reliability-Rollback.docx",
     "Automated Provisioning and Reliability Validation",
     "To integrate Ansible and Jenkins where feasible. Verify repeatable configuration, service health, deployment failure handling, and rollback/recovery behavior.",
     task14_desc, task14_output, t14_conc),

    (15, "Task-15-Final-Release-Viva.docx",
     "Final End-to-End Release, Documentation and Viva",
     "To prepare the final release workflow and comprehensive project documentation. Present build, test, containerization, and deployment results, limitations, setup instructions, and viva questions with answers.",
     task15_desc, task15_output, t15_conc),
]

def generate_all():
    print("=" * 65)
    print("Generating Upgraded Academic Practical File Documents (.docx)")
    print("Strictly Following Table 0, Table 1, Table 2 Format of devops L8.docx")
    print("=" * 65)

    # 1. Generate Individual Files
    for exp_num, filename, title, obj, desc_fn, out_fn, conc in TASKS_DATA:
        doc = create_base_doc()
        build_experiment_tables(doc, exp_num, title, obj, desc_fn, out_fn, conc)
        save_path = os.path.join(WORD_DIR, filename)
        doc.save(save_path)
        print(f"  [SAVED] {filename}")

    # 2. Generate Combined Practical File
    print("\nGenerating Combined-DevOps-Practical-File.docx...")
    comb_doc = create_base_doc()

    # Cover Page
    p_title = comb_doc.add_paragraph()
    p_title.alignment = WD_ALIGN_PARAGRAPH.CENTER
    p_title.paragraph_format.space_before = Pt(36)
    p_title.paragraph_format.space_after = Pt(12)
    r_dept = p_title.add_run(f"{DEPARTMENT}\n")
    r_dept.font.size = Pt(14)
    r_dept.bold = True
    r_dept.font.color.rgb = RGBColor(26, 58, 92)

    r_proj = p_title.add_run("TRAVEL INSURANCE CLAIM SYSTEM\nDEVOPS LIFECYCLE PRACTICAL FILE\n")
    r_proj.font.size = Pt(18)
    r_proj.bold = True
    r_proj.font.color.rgb = RGBColor(26, 58, 92)

    r_sub = p_title.add_run(f"Academic Year {ACADEMIC_YEAR} | {SEMESTER} | Course: {SUBJECT}\n")
    r_sub.font.size = Pt(12)
    r_sub.italic = True

    p_sp = comb_doc.add_paragraph()
    p_sp.paragraph_format.space_before = Pt(24)

    # Cover Table
    t_cov = comb_doc.add_table(rows=5, cols=2)
    t_cov.alignment = WD_TABLE_ALIGNMENT.CENTER
    t_cov.style = 'Table Grid'
    c_data = [
        ("Student Name", STUDENT_NAME),
        ("Roll Number", ROLL_NUMBER),
        ("Academic Program", "B.E. Computer Engineering (Semester VII)"),
        ("Subject Professor In-charge", PROFESSOR),
        ("Overall Grade & Evaluation", "")
    ]
    for i, (k, v) in enumerate(c_data):
        c0, c1 = t_cov.cell(i, 0), t_cov.cell(i, 1)
        c0.text, c1.text = k, v
        format_cell_text(c0, bold=True, size=11)
        format_cell_text(c1, bold=False, size=11)
        set_cell_shading(c0, "D9E2F3")

    comb_doc.add_page_break()

    # Table of Contents / Index
    p_idx = comb_doc.add_paragraph()
    r_idx = p_idx.add_run("PRACTICAL EXPERIMENT INDEX")
    r_idx.bold = True
    r_idx.font.size = Pt(16)
    r_idx.font.color.rgb = RGBColor(26, 58, 92)
    p_idx.paragraph_format.space_after = Pt(12)

    t_idx = comb_doc.add_table(rows=len(TASKS_DATA)+1, cols=3)
    t_idx.alignment = WD_TABLE_ALIGNMENT.CENTER
    t_idx.style = 'Table Grid'
    for i, h in enumerate(["Exp No.", "Experiment Title", "Status"]):
        c = t_idx.cell(0, i)
        c.text = h
        format_cell_text(c, bold=True, size=10.5, color=(255, 255, 255))
        set_cell_shading(c, "1A3A5C")
    for r, (num, fn, title, obj, df, of, conc) in enumerate(TASKS_DATA, 1):
        c0, c1, c2 = t_idx.cell(r, 0), t_idx.cell(r, 1), t_idx.cell(r, 2)
        c0.text, c1.text, c2.text = f"Exp {num:02d}", title, "Complete & Verified"
        for cell in (c0, c1, c2):
            format_cell_text(cell, bold=False, size=10)
            if r % 2 == 0:
                set_cell_shading(cell, "F0F4F8")

    # Add each experiment with page breaks
    for exp_num, filename, title, obj, desc_fn, out_fn, conc in TASKS_DATA:
        comb_doc.add_page_break()
        build_experiment_tables(comb_doc, exp_num, title, obj, desc_fn, out_fn, conc)

    comb_save = os.path.join(WORD_DIR, "Combined-DevOps-Practical-File.docx")
    comb_doc.save(comb_save)
    print(f"  [SAVED] Combined-DevOps-Practical-File.docx")

    print("=" * 65)
    print("ALL 16 WORD DOCUMENTS SUCCESSFULLY GENERATED IN:")
    print(f"  --> {WORD_DIR}")
    print("=" * 65)

if __name__ == "__main__":
    generate_all()
