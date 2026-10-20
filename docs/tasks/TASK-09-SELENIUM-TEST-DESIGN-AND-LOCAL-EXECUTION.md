# Task 9: Selenium Test Design and Local Execution

## Test Objectives
The objective is to verify the core end-to-end flows of the Travel Insurance Claim System MVP using automated UI tests. This ensures that customers can successfully submit and track claims, and reviewers can view, approve, and reject those claims without errors.

## Tools Used
* **Selenium WebDriver (Java)**: For browser automation.
* **Selenium Manager**: For automatic management of browser drivers.
* **JUnit 5**: As the test runner and assertion framework.
* **Spring Boot Test**: For starting the embedded server (`@SpringBootTest` with `DEFINED_PORT`) on port `8081` during tests.
* **Maven**: For dependency management and test execution.

## Test Cases

### Test Case 1: Submit and Approve Claim Flow
**Description:** Verify a customer can submit a valid claim and a reviewer can approve it.
**Steps:**
1. Customer opens `http://localhost:8081/index.html`.
2. Fills out the claim form with valid data (Policy: POL-APP-123, Type: Medical Emergency, etc.).
3. Submits the form and captures the generated Claim ID.
4. Switches to the "Track Claim" tab, enters the ID, and verifies the status is `PENDING`.
5. Reviewer opens `http://localhost:8081/reviewer.html`.
6. Selects the pending claim from the queue.
7. Clicks "Approve" and verifies the status updates to `APPROVED`.
**Expected Result:** Claim is successfully created, tracked as pending, and then updated to approved.

### Test Case 2: Submit and Reject Claim Flow
**Description:** Verify a customer can submit a valid claim and a reviewer can reject it with a reason.
**Steps:**
1. Customer opens `http://localhost:8081/index.html`.
2. Fills out the claim form with valid data (Policy: POL-REJ-456, Type: Trip Delay, etc.).
3. Submits the form and captures the generated Claim ID.
4. Reviewer opens `http://localhost:8081/reviewer.html`.
5. Selects the pending claim from the queue.
6. Clicks "Reject", enters a rejection reason ("Delay less than 4 hours is not covered."), and confirms.
7. Verifies the status updates to `REJECTED`.
**Expected Result:** Claim is successfully created and then rejected, with the rejection reason saved.

### Test Case 3: Invalid Claim Submission
**Description:** Verify that submitting an empty/invalid form triggers validation errors.
**Steps:**
1. Customer opens `http://localhost:8081/index.html`.
2. Leaves all fields empty and clicks "Submit Claim".
3. Verifies that the client-side JavaScript validation blocks submission and displays inline error messages (e.g., "Policy number is required.").
**Expected Result:** The system should prevent submission and display appropriate validation errors.

## How to Execute the Tests
1. Ensure you are in the `travel-insurance-claim-system` directory.
2. Run the following Maven command:
   ```bash
   call mvnw.cmd test -Dtest=SeleniumE2ETest
   ```
3. The tests will automatically start the Spring Boot application on port 8081 (if not already running), execute the tests in a headless Chrome browser, and report the results.

## Actual Results
*(Will be updated based on execution)*

## Final Test Summary
*(Will be updated based on execution)*

[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 19.30 s -- in com.academic.travelinsurance.SeleniumE2ETest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
