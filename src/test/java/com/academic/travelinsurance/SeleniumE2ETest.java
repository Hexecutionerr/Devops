package com.academic.travelinsurance;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SeleniumE2ETest {

    private WebDriver driver;
    private WebDriverWait wait;

    @LocalServerPort
    private int port = 8081;

    private String getBaseUrl() {
        return "http://localhost:" + port;
    }

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        
        // Selenium Manager automatically downloads the correct ChromeDriver
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @Order(1)
    public void testSubmitAndApproveClaimFlow() throws Exception {
        // 1. Customer opens the application
        driver.get(getBaseUrl() + "/index.html");
        assertEquals("Travel Insurance Claim System — Customer Portal", driver.getTitle());

        // 2. Customer submits a valid claim
        driver.findElement(By.id("policyNumber")).sendKeys("POL-APP-123");
        driver.findElement(By.id("customerName")).sendKeys("Alice Approver");
        driver.findElement(By.id("destination")).sendKeys("Paris");
        WebElement travelDate1 = driver.findElement(By.id("travelDate"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '2024-12-01';", travelDate1);
        
        Select claimType = new Select(driver.findElement(By.id("claimType")));
        claimType.selectByValue("Medical Emergency");
        
        driver.findElement(By.id("claimAmount")).sendKeys("5000");
        driver.findElement(By.id("description")).sendKeys("Medical issue in Paris.");
        driver.findElement(By.id("documentReference")).sendKeys("MED-001");
        
        driver.findElement(By.id("submitBtn")).click();
        
        // Wait for claim ID to be generated
        WebElement claimIdElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("generatedClaimId")));
        String claimId = claimIdElem.getText();
        assertTrue(claimId != null && !claimId.isEmpty(), "Claim ID should be generated");

        // 3. Customer tracks a claim
        driver.findElement(By.id("navTrack")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("trackClaimId"))).sendKeys(claimId);
        driver.findElement(By.id("trackBtn")).click();
        
        WebElement statusElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("d-status")));
        assertTrue(statusElem.getText().contains("PENDING"), "Status should be PENDING");

        // 4. Reviewer opens the pending claims
        driver.get(getBaseUrl() + "/reviewer.html");
        assertEquals("Travel Insurance Claim System — Reviewer Portal", driver.getTitle());
        
        // Wait for the pending claims to load
        WebElement claimListItem = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//div[contains(text(), 'Claim #" + claimId + "')]")
        ));
        claimListItem.click();

        // 5. Reviewer approves a claim
        WebElement approveBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("approveBtn")));
        // Use JS click to avoid any overlapping elements issue
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", approveBtn);
        
        WebElement detailMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("detailMsg")));
        assertTrue(detailMsg.getText().contains("APPROVED successfully"), "Claim should be approved");
    }

    @Test
    @Order(2)
    public void testSubmitAndRejectClaimFlow() throws Exception {
        // Customer opens the application
        driver.get(getBaseUrl() + "/index.html");

        // Customer submits a valid claim
        driver.findElement(By.id("policyNumber")).sendKeys("POL-REJ-456");
        driver.findElement(By.id("customerName")).sendKeys("Bob Rejector");
        driver.findElement(By.id("destination")).sendKeys("London");
        WebElement travelDate2 = driver.findElement(By.id("travelDate"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '2024-11-15';", travelDate2);
        
        Select claimType = new Select(driver.findElement(By.id("claimType")));
        claimType.selectByValue("Trip Delay");
        
        driver.findElement(By.id("claimAmount")).sendKeys("1000");
        driver.findElement(By.id("description")).sendKeys("Flight delayed by 2 hours.");
        driver.findElement(By.id("documentReference")).sendKeys("FL-123");
        
        driver.findElement(By.id("submitBtn")).click();
        
        WebElement claimIdElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("generatedClaimId")));
        String claimId = claimIdElem.getText();

        // Reviewer opens the pending claims
        driver.get(getBaseUrl() + "/reviewer.html");
        
        WebElement claimListItem = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//div[contains(text(), 'Claim #" + claimId + "')]")
        ));
        claimListItem.click();

        // 6. Reviewer rejects a claim with a rejection reason
        WebElement rejectToggleBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("rejectToggleBtn")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", rejectToggleBtn);
        
        WebElement rejectReason = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rejectionReason")));
        rejectReason.sendKeys("Delay less than 4 hours is not covered.");
        
        WebElement confirmRejectBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmRejectBtn")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", confirmRejectBtn);
        
        WebElement detailMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("detailMsg")));
        assertTrue(detailMsg.getText().contains("REJECTED"), "Claim should be rejected");
    }

    @Test
    @Order(3)
    public void testInvalidClaimSubmission() {
        // 7. Verify validation/error behaviour for an invalid claim
        driver.get(getBaseUrl() + "/index.html");
        
        // Submit empty form (handled by JS validation)
        WebElement submitBtn = driver.findElement(By.id("submitBtn"));
        submitBtn.click();
        
        // Policy number is required, JS should show an error
        WebElement policyError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("policyNumber-error")));
        assertTrue(policyError.getText().contains("Policy number is required"), "Policy number validation error should appear");
        
        WebElement nameError = driver.findElement(By.id("customerName-error"));
        assertTrue(nameError.getText().contains("Customer name is required"), "Customer name validation error should appear");
    }

    @Test
    @Order(4)
    public void testFileUploadInteraction() throws Exception {
        driver.get(getBaseUrl() + "/index.html");

        // 1. Verify upload zone is present and visible
        WebElement uploadZone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploadZone")));
        assertTrue(uploadZone.isDisplayed(), "Upload zone should be visible");

        // 2. Verify clicking upload zone triggers file input
        Boolean fileInputTriggered = (Boolean) ((JavascriptExecutor) driver).executeScript(
            "var fileInput = document.getElementById('documentFiles');" +
            "var clicked = false;" +
            "var origClick = fileInput.click;" +
            "fileInput.click = function() { clicked = true; };" +
            "document.getElementById('uploadZone').click();" +
            "fileInput.click = origClick;" +
            "return clicked;"
        );
        assertTrue(fileInputTriggered, "Clicking the upload zone must trigger file input click");

        // 3. Create a temporary file and upload it
        java.io.File tempFile = java.io.File.createTempFile("test_receipt", ".pdf");
        tempFile.deleteOnExit();

        WebElement fileInput = driver.findElement(By.id("documentFiles"));
        fileInput.sendKeys(tempFile.getAbsolutePath());

        // 4. Verify file preview item appears
        WebElement previewItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#filePreviewList .file-preview-item")));
        assertTrue(previewItem.getText().contains(tempFile.getName()), "Preview should display selected file name");

        // 5. Test removing the file
        WebElement removeBtn = previewItem.findElement(By.cssSelector(".btn-remove-file"));
        removeBtn.click();
        
        wait.until(ExpectedConditions.invisibilityOf(previewItem));
        assertEquals(0, driver.findElements(By.cssSelector("#filePreviewList .file-preview-item")).size(), "File should be removed from preview");
    }

    @Test
    @Order(5)
    public void testSubmitClaimWithDocumentAndReviewerView() throws Exception {
        driver.get(getBaseUrl() + "/index.html");

        // 1. Fill in claim form
        driver.findElement(By.id("policyNumber")).sendKeys("POL-DOC-VIEW");
        driver.findElement(By.id("customerName")).sendKeys("David Document");
        driver.findElement(By.id("destination")).sendKeys("Rome, Italy");
        WebElement travelDate = driver.findElement(By.id("travelDate"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '2024-11-28';", travelDate);

        Select claimType = new Select(driver.findElement(By.id("claimType")));
        claimType.selectByValue("Medical Emergency");

        driver.findElement(By.id("claimAmount")).sendKeys("8500");
        driver.findElement(By.id("description")).sendKeys("Hospital bill for emergency care.");
        driver.findElement(By.id("documentReference")).sendKeys("MED-ROME-777");

        // 2. Attach a PDF file
        java.io.File tempFile = java.io.File.createTempFile("Rome_Hospital_Bill", ".pdf");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), "dummy pdf data".getBytes());

        WebElement fileInput = driver.findElement(By.id("documentFiles"));
        fileInput.sendKeys(tempFile.getAbsolutePath());

        // Verify preview item appears
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#filePreviewList .file-preview-item")));

        // 3. Submit the claim
        driver.findElement(By.id("submitBtn")).click();

        // Wait for claim ID
        WebElement claimIdElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("generatedClaimId")));
        String claimId = claimIdElem.getText();
        assertTrue(claimId != null && !claimId.isEmpty(), "Claim ID must be generated");

        // 4. Open Reviewer Portal
        driver.get(getBaseUrl() + "/reviewer.html");

        // Click on the claim in pending list
        WebElement claimItem = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//div[contains(text(), 'Claim #" + claimId + "')]")
        ));
        claimItem.click();

        // 5. Verify uploaded document appears with clickable link and buttons
        WebElement docBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("r-uploadedFilesBox")));
        assertTrue(docBox.isDisplayed(), "Uploaded documents box should be visible");

        WebElement docLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#r-uploadedFiles .doc-card-filename")));
        assertTrue(docLink.getText().contains("Rome_Hospital_Bill"), "Document filename should be displayed");
        String href = docLink.getAttribute("href");
        assertTrue(href != null && href.contains("/api/documents/"), "Link should point to document endpoint");
        assertEquals("_blank", docLink.getAttribute("target"), "Link should open in new tab");

        // Verify View and Download buttons exist
        WebElement viewBtn = driver.findElement(By.cssSelector("#r-uploadedFiles .btn-doc-view"));
        assertTrue(viewBtn.isDisplayed(), "View button should be displayed");

        WebElement downloadBtn = driver.findElement(By.cssSelector("#r-uploadedFiles .btn-doc-download"));
        assertTrue(downloadBtn.isDisplayed(), "Download button should be displayed");
        String downloadHref = downloadBtn.getAttribute("href");
        assertTrue(downloadHref != null && downloadHref.contains("/api/documents/") && downloadHref.endsWith("/download"), "Download link should point to /download endpoint");
    }
}


