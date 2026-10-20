# TASK 1: Problem Definition and Scope

## 1. Project Title
**Ansible-Provisioned Travel Insurance Claim System**

## 2. Problem Definition
Travel insurance claims are often dependent on manual submission, validation, review, and status communication processes. This manual approach can lead to processing delays, data-entry errors, and poor visibility for both customers and reviewers. Additionally, traditional software deployment for such systems can be error-prone and difficult to manage without automated workflows.

## 3. Real-World Need
There is a need for a centralized Travel Insurance Claim System that allows customers to submit claim requests efficiently and provides transparent status tracking. Simultaneously, it must enable reviewers to systematically validate required information and approve or reject claims. From a software engineering perspective, there is a real-world need to support this application with an automated DevOps workflow to ensure consistent testing, containerized deployment, and reliable environment provisioning.

## 4. Target Users
For this Minimum Viable Product (MVP), the primary users are:
1. **Customer:** Submits claims, enters claim details, provides document information, and checks the status of their submitted claims.
2. **Reviewer:** Views submitted claims, validates claim details, and makes decisions to approve or reject claims, optionally providing reasons for rejection.

## 5. Stakeholders
- **Customer:** Interested in easy claim submission and transparent status tracking.
- **Insurance Reviewer:** Interested in an organized system for reviewing claims and recording decisions.
- **Insurance Company:** Interested in faster, standardized, and more organized claim processing.
- **System Administrator:** Interested in maintaining and monitoring the application and infrastructure.
- **Development/DevOps Team:** Interested in building, testing, containerizing, and deploying the system efficiently.

## 6. Existing Pain Points
- Manual claim submission can cause data-entry errors and incomplete information.
- Claim documents and details may become scattered or difficult to track.
- Customers face difficulty in obtaining transparent claim status updates.
- Reviewers find it difficult to track and organize pending claims efficiently.
- The approval and rejection process may lack standardization.
- Manual software deployment introduces the risk of human error.
- Manual testing may allow defects to reach the deployment stage.
- Environment configuration is difficult to repeat consistently across different stages.

## 7. Project Objectives
- **O1:** Provide a centralized user interface for travel insurance claim submission.
- **O2:** Validate mandatory claim information before processing.
- **O3:** Allow reviewers to systematically review, approve, or reject claims.
- **O4:** Allow customers to track the status of their claims transparently.
- **O5:** Maintain claim information in a structured database.
- **O6:** Automate application build and testing processes through Jenkins.
- **O7:** Containerize the application environment using Docker.
- **O8:** Automate environment configuration and application deployment using Ansible.

## 8. Technical and Project Constraints
**Technical Constraints:**
- The application will utilize an H2 database for simplified local deployment and testing.
- The system will run on limited local or academic infrastructure rather than enterprise cloud environments.
- External insurance APIs and real insurance policy verification are not implemented.
- Real payment processing and advanced AI/OCR document verification are outside the scope.

**Project Constraints:**
- This is an individual student project with limited development time.
- The project focuses on a small, manageable MVP scope.
- No real or sensitive customer data will be used.

**DevOps Constraints:**
- The deployment environment will be local or virtualized.
- Automated rollback will demonstrate application-version recovery rather than a complete enterprise disaster-recovery strategy.

## 9. Measurable Success Criteria
- **SC1:** A customer can successfully submit a claim with all required valid data.
- **SC2:** The system rejects claims with missing or invalid mandatory data.
- **SC3:** A reviewer can successfully view a list of submitted claims.
- **SC4:** A reviewer can successfully approve or reject a pending claim.
- **SC5:** A customer can successfully view the updated status of their claim after a reviewer's decision.
- **SC6:** The application code builds successfully using Maven without compilation errors.
- **SC7:** Jenkins automatically executes the build process successfully.
- **SC8:** Selenium automated tests for critical user journeys execute and pass successfully.
- **SC9:** The application can run successfully inside an isolated Docker container.
- **SC10:** Ansible successfully provisions and configures the target deployment environment.
- **SC11:** Re-running the Ansible playbook produces no unnecessary configuration changes (idempotency).
- **SC12:** A previous stable application version can be successfully restored using the automated pipeline.

## 10. MVP Scope
The Minimum Viable Product (MVP) focuses solely on demonstrating the core capabilities of the Travel Insurance Claim System and its supporting DevOps pipeline. It includes essential features for claim submission, validation, review, and status tracking, built as a foundation for implementing automated build, test, and deployment workflows.

## 11. 15 Clearly Defined MVP Capabilities

*(Note: These 15 capabilities define the functional and supporting scope of the MVP application itself. They are distinct from the 15 academic implementation tasks provided by the instructor.)*

**Application Capabilities (Customer & Reviewer):**
1. **Submit Claim:** Allow customers to initiate a new travel insurance claim.
2. **View Claim:** Allow customers to view the details of their submitted claim.
3. **Track Claim Status:** Allow customers to check the current status of their claim (e.g., Pending, Approved, Rejected).
4. **Validate Required Fields:** Ensure all mandatory fields are provided during submission.
5. **Validate Claim Amount:** Ensure the requested claim amount is a valid numerical value.
6. **Validate Document Information:** Ensure the presence/basic information of submitted document references (Note: This does not imply OCR, authenticity verification, or real insurance document verification).
7. **View Pending Claims:** Allow reviewers to see a list of claims awaiting action.
8. **Review Claim:** Allow reviewers to open and inspect the details of a specific claim.
9. **Approve Claim:** Provide functionality for reviewers to mark a claim as approved.
10. **Reject Claim:** Provide functionality for reviewers to mark a claim as rejected, optionally with a reason.

**System Capabilities:**
11. **Store Claims:** Persist claim data securely in a relational database (H2).
12. **Update Claim Status:** Update the claim record state upon reviewer action.
13. **Provide Claim ID:** Generate and display a unique identifier for each submitted claim.

**DevOps Capabilities (Infrastructure & Pipeline):**
14. **Automated Build/Test:** Compile code and run automated tests (Unit & Selenium) using Maven and Jenkins.
15. **Automated Containerized Deployment:** Package the application via Docker and provision the environment using Ansible.

## 12. Out-of-Scope Features
To keep the MVP realistic for an academic project, the following are strictly out of scope:
- Real payment gateway integration.
- Real insurance company or third-party system integration.
- Aadhaar, passport, or real-time identity verification.
- OCR-based document scanning and verification.
- AI-based fraud detection.
- Mobile application development.
- Multi-company insurance integration.
- Production-grade authentication and authorization mechanisms (e.g., OAuth2, enterprise SSO).
- Use of real customer data.
- Enterprise-scale Kubernetes infrastructure.

## 13. Scope Assumptions
- The primary focus of the project is to demonstrate a functional DevOps pipeline (Jenkins, Docker, Ansible) using a representative application, rather than building a fully-featured insurance product.
- Basic, simplified web forms will be sufficient for the application interface.
- Local or virtualized environments are acceptable for demonstrating deployment and configuration automation.

## 14. Final Scope Statement
The "Ansible-Provisioned Travel Insurance Claim System" project will deliver a functional, minimal web application enabling simple travel insurance claim submission, review, and tracking. This application will serve as the foundation to demonstrate an automated DevOps lifecycle, specifically focusing on continuous integration with Jenkins, containerization with Docker, and automated environment provisioning and deployment using Ansible. The project strictly focuses on core mechanical workflows and academic demonstration, explicitly excluding production-level integrations, advanced security, and enterprise infrastructure.
