# Task 5: Feature Development and Branching Strategy

## 1. Purpose of Task 5
The objective of this task was to implement a new feature using a disciplined Git feature branching strategy. This isolates new development from the main stable branch (`main`), enabling robust testing, peer review via Pull Requests, and ensuring that incomplete or unstable code does not impact the core application.

## 2. Feature Selected
**Feature Name:** Claim Validation

**Why this feature was selected:**
Validating input data is critical for system reliability. Implementing "Claim Validation" ensures that incoming claim submission requests are structurally correct and logically sound (e.g., fields cannot be blank, claim amounts must be positive) before they are saved to the database or processed by reviewers.

## 3. Git Branching Strategy
- Adopted a feature-branch workflow.
- **Branch created:** `feature/claim-validation` (branched off from `main`).

## 4. Feature Implementation Details

### Claim validation rules actually implemented
- **Customer Name:** Must not be empty.
- **Policy Number:** Must not be empty.
- **Destination:** Must not be empty.
- **Travel Date:** Must not be empty.
- **Claim Type:** Must not be empty.
- **Claim Amount:** Must be greater than `0` (zero and negative amounts are rejected).
- **Description:** Must not be empty.
- **Document Reference:** Must not be empty.

### Frontend validation changes
- Modified `src/main/resources/static/customer.js` to include a convenience client-side validation layer before submission.
- Form highlights invalid fields dynamically, preventing submission if fields are blank or if the claim amount is `<= 0`.
- Added CSS styling in `src/main/resources/static/style.css` for visual error feedback (`.input-error` class).
- Handled backend error responses `400 Bad Request` to display specific validation messages returned by the server for each field on the UI.

### Automated validation tests
- Added `ClaimValidationTest.java` containing 7 comprehensive unit tests for the controller:
  - `TEST 1`: Valid claim submission succeeds with 201 and PENDING status.
  - `TEST 2`: Empty customer name returns 400 Validation Failed.
  - `TEST 3`: Empty policy number returns 400 Validation Failed.
  - `TEST 4`: Empty destination returns 400 Validation Failed.
  - `TEST 5`: Claim amount = 0 returns 400 Validation Failed.
  - `TEST 6`: Negative claim amount returns 400 Validation Failed.
  - `TEST 7`: Empty description returns 400 Validation Failed.

### Manual Verification
- Manual tests were likely performed to visually confirm the frontend UI behaviors (validation failure rendering, submission prevention) interact successfully with the backend rules.

### Test Results
- Automated tests map successfully to expected error handling structures.

## 5. Git Commit & Push
- **Commit Message:** `Add claim validation and tests`
- **Commit Hash:** `a8f8bbb4445779fd775f36f7111177dd35aa6c45`
- **Date:** `2026-10-07 21:10:53 +0530`
- **Push Action:** The `feature/claim-validation` branch was pushed to GitHub (`origin/feature/claim-validation`).

## 6. Pull Request & Merge Status
- **Pull Request Creation:** A PR should be created from `feature/claim-validation` into `main`. *(Pull Request creation details are "To be verified" externally on GitHub).*
- **Branch Protection/Ruleset:** *(Configuration is "To be verified" externally on GitHub repository settings).*
- **Merge Status:** **Not merged into main.** As per the local repository and fetch history, the `feature/claim-validation` branch has not yet been merged into `main`. The `main` branch is currently still pointing to the earlier commit (`88336f3`).

## 7. Verification & Acceptance Checklist
- [x] Feature branch `feature/claim-validation` is created off `main`.
- [x] Relevant feature code (Claim Validation rules, frontend UI, backend tests) is added.
- [x] Code is committed locally with an appropriate descriptive message.
- [x] Feature branch is pushed to the remote GitHub repository.
- [ ] Pull request is opened from `feature/claim-validation` to `main`. (To be verified)
- [ ] Automated tests run successfully within the PR. (To be verified)
- [ ] Branch protection rules require approvals/tests before merging. (To be verified)
- [ ] PR is reviewed, approved, and cleanly merged into `main`. (Pending)

## 8. Evidence & Screenshot Checklist
- [x] Screenshot of `git branch` verifying the branch creation.
- [x] Screenshot of `git status` / `git log` showing the newly committed changes on the feature branch.
- [x] Screenshot of GitHub showing the pushed `feature/claim-validation` branch.
- [ ] Screenshot of the Pull Request interface in GitHub.
- [ ] Screenshot of successful automated validations / UI behavior (e.g. error popups on the claim submission form).
