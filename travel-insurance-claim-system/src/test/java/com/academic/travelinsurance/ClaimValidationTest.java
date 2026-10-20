package com.academic.travelinsurance;

import com.academic.travelinsurance.dto.ClaimSubmitRequest;
import com.academic.travelinsurance.entity.ClaimStatus;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.mock.web.MockMultipartFile;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for claim validation (Task 3 — Claim Validation feature).
 *
 * Tests cover:
 *  TEST 1 — Valid claim submission
 *  TEST 2 — Empty customer name
 *  TEST 3 — Empty policy number
 *  TEST 4 — Empty destination
 *  TEST 5 — Claim amount = 0
 *  TEST 6 — Negative claim amount
 *  TEST 7 — Empty description
 */
@SpringBootTest
@AutoConfigureMockMvc
class ClaimValidationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    // -----------------------------------------------------------------------
    // Helper: build a fully valid ClaimSubmitRequest
    // -----------------------------------------------------------------------
    private ClaimSubmitRequest validRequest() {
        ClaimSubmitRequest req = new ClaimSubmitRequest();
        req.setPolicyNumber("POL-2024-001");
        req.setCustomerName("Hasnain Ahmed");
        req.setDestination("Dubai, UAE");
        req.setTravelDate(LocalDate.of(2024, 10, 15));
        req.setClaimType("Medical Emergency");
        req.setClaimAmount(new BigDecimal("15000.00"));
        req.setDescription("Fell ill during the trip and required hospitalisation.");
        req.setDocumentReference("DR-2024-001");
        return req;
    }

    // -----------------------------------------------------------------------
    // TEST 1 — Valid claim: expect 201 Created, claimId generated, status PENDING
    // -----------------------------------------------------------------------
    @Test
    @DisplayName("TEST 1 — Valid claim submission succeeds with 201 and PENDING status")
    void test1_validClaimSubmission_returns201WithPendingStatus() throws Exception {
        ClaimSubmitRequest req = validRequest();

        MvcResult result = mockMvc.perform(post("/api/claims")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(req)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.claimId").isNumber())
                .andExpect(jsonPath("$.status").value(ClaimStatus.PENDING.name()))
                .andExpect(jsonPath("$.customerName").value("Hasnain Ahmed"))
                .andExpect(jsonPath("$.policyNumber").value("POL-2024-001"))
                .andReturn();

        System.out.println("[TEST 1 PASSED] Valid claim submitted. Response: "
                + result.getResponse().getContentAsString());
    }

    // -----------------------------------------------------------------------
    // TEST 2 — Empty customer name: expect 400 Bad Request with fieldErrors
    // -----------------------------------------------------------------------
    @Test
    @DisplayName("TEST 2 — Empty customer name returns 400 Validation Failed")
    void test2_emptyCustomerName_returns400() throws Exception {
        ClaimSubmitRequest req = validRequest();
        req.setCustomerName("");   // blank

        mockMvc.perform(post("/api/claims")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(req)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").value("Validation Failed"))
                .andExpect(jsonPath("$.fieldErrors.customerName").exists());

        System.out.println("[TEST 2 PASSED] Empty customer name correctly rejected with 400.");
    }

    // -----------------------------------------------------------------------
    // TEST 3 — Empty policy number: expect 400 Bad Request
    // -----------------------------------------------------------------------
    @Test
    @DisplayName("TEST 3 — Empty policy number returns 400 Validation Failed")
    void test3_emptyPolicyNumber_returns400() throws Exception {
        ClaimSubmitRequest req = validRequest();
        req.setPolicyNumber("");   // blank

        mockMvc.perform(post("/api/claims")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(req)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").value("Validation Failed"))
                .andExpect(jsonPath("$.fieldErrors.policyNumber").exists());

        System.out.println("[TEST 3 PASSED] Empty policy number correctly rejected with 400.");
    }

    // -----------------------------------------------------------------------
    // TEST 4 — Empty destination: expect 400 Bad Request
    // -----------------------------------------------------------------------
    @Test
    @DisplayName("TEST 4 — Empty destination returns 400 Validation Failed")
    void test4_emptyDestination_returns400() throws Exception {
        ClaimSubmitRequest req = validRequest();
        req.setDestination("");    // blank

        mockMvc.perform(post("/api/claims")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(req)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").value("Validation Failed"))
                .andExpect(jsonPath("$.fieldErrors.destination").exists());

        System.out.println("[TEST 4 PASSED] Empty destination correctly rejected with 400.");
    }

    // -----------------------------------------------------------------------
    // TEST 5 — Claim amount = 0: expect 400 Bad Request
    // -----------------------------------------------------------------------
    @Test
    @DisplayName("TEST 5 — Claim amount = 0 returns 400 Validation Failed")
    void test5_claimAmountZero_returns400() throws Exception {
        ClaimSubmitRequest req = validRequest();
        req.setClaimAmount(BigDecimal.ZERO);   // 0 — must be > 0

        mockMvc.perform(post("/api/claims")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(req)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").value("Validation Failed"))
                .andExpect(jsonPath("$.fieldErrors.claimAmount").exists());

        System.out.println("[TEST 5 PASSED] Claim amount = 0 correctly rejected with 400.");
    }

    // -----------------------------------------------------------------------
    // TEST 6 — Negative claim amount: expect 400 Bad Request
    // -----------------------------------------------------------------------
    @Test
    @DisplayName("TEST 6 — Negative claim amount returns 400 Validation Failed")
    void test6_negativeClaimAmount_returns400() throws Exception {
        ClaimSubmitRequest req = validRequest();
        req.setClaimAmount(new BigDecimal("-500.00"));   // negative

        mockMvc.perform(post("/api/claims")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(req)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").value("Validation Failed"))
                .andExpect(jsonPath("$.fieldErrors.claimAmount").exists());

        System.out.println("[TEST 6 PASSED] Negative claim amount correctly rejected with 400.");
    }

    // -----------------------------------------------------------------------
    // TEST 7 — Empty description: expect 400 Bad Request
    // -----------------------------------------------------------------------
    @Test
    @DisplayName("TEST 7 — Empty description returns 400 Validation Failed")
    void test7_emptyDescription_returns400() throws Exception {
        ClaimSubmitRequest req = validRequest();
        req.setDescription("");    // blank

        mockMvc.perform(post("/api/claims")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(req)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").value("Validation Failed"))
                .andExpect(jsonPath("$.fieldErrors.description").exists());

        System.out.println("[TEST 7 PASSED] Empty description correctly rejected with 400.");
    }

    // -----------------------------------------------------------------------
    // TEST 8 — Multipart claim submission with files: expect 201 Created and uploadedFiles set
    // -----------------------------------------------------------------------
    @Test
    @DisplayName("TEST 8 — Multipart claim submission with files returns 201 Created")
    void test8_multipartClaimSubmissionWithFiles_returns201() throws Exception {
        MockMultipartFile file1 = new MockMultipartFile(
                "files", "medical_receipt.pdf", "application/pdf", "dummy pdf content".getBytes()
        );
        MockMultipartFile file2 = new MockMultipartFile(
                "files", "boarding_pass.png", "image/png", "dummy image content".getBytes()
        );

        mockMvc.perform(multipart("/api/claims")
                        .file(file1)
                        .file(file2)
                        .param("policyNumber", "POL-DOC-001")
                        .param("customerName", "Sara Documenter")
                        .param("destination", "Tokyo, Japan")
                        .param("travelDate", "2024-11-20")
                        .param("claimType", "Medical Emergency")
                        .param("claimAmount", "12500.00")
                        .param("description", "Hospital emergency room treatment.")
                        .param("documentReference", "HOSP-TK-999"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.claimId").exists())
                .andExpect(jsonPath("$.status").value("PENDING"))
                .andExpect(jsonPath("$.uploadedFiles").value("medical_receipt.pdf, boarding_pass.png"));

        System.out.println("[TEST 8 PASSED] Multipart claim submission with files passed with 201.");
    }

    // -----------------------------------------------------------------------
    // TEST 9 — Multipart claim submission without files: expect 201 Created
    // -----------------------------------------------------------------------
    @Test
    @DisplayName("TEST 9 — Multipart claim submission without files returns 201 Created")
    void test9_multipartClaimSubmissionWithoutFiles_returns201() throws Exception {
        mockMvc.perform(multipart("/api/claims")
                        .param("policyNumber", "POL-DOC-002")
                        .param("customerName", "Tom Traveler")
                        .param("destination", "Rome, Italy")
                        .param("travelDate", "2024-12-05")
                        .param("claimType", "Baggage Loss")
                        .param("claimAmount", "4500.00")
                        .param("description", "Lost suitcase on transit.")
                        .param("documentReference", "BAG-RM-101"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.claimId").exists())
                .andExpect(jsonPath("$.status").value("PENDING"));

        System.out.println("[TEST 9 PASSED] Multipart claim submission without files passed with 201.");
    }

    // -----------------------------------------------------------------------
    // TEST 10 — Document retrieval, inline view, download, and 404 handling
    // -----------------------------------------------------------------------
    @Test
    @DisplayName("TEST 10 — Document retrieval, inline view, download, and missing-file handling")
    void test10_documentRetrievalViewAndDownload() throws Exception {
        MockMultipartFile pdfFile = new MockMultipartFile(
                "files", "claim_receipt.pdf", "application/pdf", "dummy pdf content for test".getBytes()
        );

        // 1. Submit a claim with a PDF document
        MvcResult submitResult = mockMvc.perform(multipart("/api/claims")
                        .file(pdfFile)
                        .param("policyNumber", "POL-TEST-10")
                        .param("customerName", "Alice Documenter")
                        .param("destination", "London, UK")
                        .param("travelDate", "2024-12-10")
                        .param("claimType", "Trip Delay")
                        .param("claimAmount", "5000.00")
                        .param("description", "Flight delay claim.")
                        .param("documentReference", "REC-101"))
                .andExpect(status().isCreated())
                .andReturn();

        String responseJson = submitResult.getResponse().getContentAsString();
        long claimId = objectMapper.readTree(responseJson).get("claimId").asLong();

        // 2. Fetch documents for this claim
        MvcResult docListResult = mockMvc.perform(get("/api/documents/claim/" + claimId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0].fileName").value("claim_receipt.pdf"))
                .andExpect(jsonPath("$[0].contentType").value("application/pdf"))
                .andExpect(jsonPath("$[0].viewUrl").exists())
                .andExpect(jsonPath("$[0].downloadUrl").exists())
                .andReturn();

        long documentId = objectMapper.readTree(docListResult.getResponse().getContentAsString()).get(0).get("documentId").asLong();

        // 3. Test inline view endpoint
        mockMvc.perform(get("/api/documents/" + documentId + "/view"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_PDF))
                .andExpect(header().string("Content-Disposition", containsString("inline")))
                .andExpect(header().string("Content-Disposition", containsString("claim_receipt.pdf")))
                .andExpect(content().bytes("dummy pdf content for test".getBytes()));

        // 4. Test download endpoint
        mockMvc.perform(get("/api/documents/" + documentId + "/download"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_PDF))
                .andExpect(header().string("Content-Disposition", containsString("attachment")))
                .andExpect(header().string("Content-Disposition", containsString("claim_receipt.pdf")))
                .andExpect(content().bytes("dummy pdf content for test".getBytes()));

        // 5. Test missing document handling (404 Not Found)
        mockMvc.perform(get("/api/documents/999999/view"))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.error").value("Not Found"));

        System.out.println("[TEST 10 PASSED] Document retrieval, inline view, download, and 404 handling verified.");
    }

    // -----------------------------------------------------------------------
    // TEST 11 — Multiple document formats (PDF, JPG, PNG, DOCX) & filenames with spaces
    // -----------------------------------------------------------------------
    @Test
    @DisplayName("TEST 11 — All supported formats and filenames with spaces preserve exact bytes and MIME types")
    void test11_allSupportedFormatsAndFilenamesWithSpaces() throws Exception {
        byte[] pdfBytes = "%PDF-1.4 sample pdf binary data".getBytes(StandardCharsets.UTF_8);
        byte[] jpgBytes = new byte[]{(byte) 0xFF, (byte) 0xD8, (byte) 0xFF, (byte) 0xE0, 0x00, 0x10, 0x4A, 0x46, 0x49, 0x46};
        byte[] pngBytes = new byte[]{(byte) 0x89, 0x50, 0x4E, 0x47, 0x0D, 0x0A, 0x1A, 0x0A};
        byte[] docxBytes = new byte[]{'P', 'K', 0x03, 0x04, 0x14, 0x00, 0x06, 0x00};

        MockMultipartFile filePdf = new MockMultipartFile("files", "DL - Assignment 7.pdf", "application/pdf", pdfBytes);
        MockMultipartFile fileJpg = new MockMultipartFile("files", "Medical Receipt 2024.jpg", "image/jpeg", jpgBytes);
        MockMultipartFile filePng = new MockMultipartFile("files", "Boarding Pass Final.png", "image/png", pngBytes);
        MockMultipartFile fileDocx = new MockMultipartFile("files", "Insurance Policy Doc.docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", docxBytes);

        MvcResult submitResult = mockMvc.perform(multipart("/api/claims")
                        .file(filePdf)
                        .file(fileJpg)
                        .file(filePng)
                        .file(fileDocx)
                        .param("policyNumber", "POL-MULTI-SPACES")
                        .param("customerName", "Multi Formatter")
                        .param("destination", "Tokyo, Japan")
                        .param("travelDate", "2024-12-15")
                        .param("claimType", "Trip Cancellation")
                        .param("claimAmount", "15000.00")
                        .param("description", "Various receipts and passes with spaces in filenames.")
                        .param("documentReference", "DOC-MULTI-123"))
                .andExpect(status().isCreated())
                .andReturn();

        long claimId = objectMapper.readTree(submitResult.getResponse().getContentAsString()).get("claimId").asLong();

        // Retrieve document list
        MvcResult listResult = mockMvc.perform(get("/api/documents/claim/" + claimId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(4))
                .andReturn();

        JsonNode docs = objectMapper.readTree(listResult.getResponse().getContentAsString());
        assertEquals("DL - Assignment 7.pdf", docs.get(0).get("fileName").asText());
        assertEquals("application/pdf", docs.get(0).get("contentType").asText());
        assertEquals("Medical Receipt 2024.jpg", docs.get(1).get("fileName").asText());
        assertEquals("image/jpeg", docs.get(1).get("contentType").asText());
        assertEquals("Boarding Pass Final.png", docs.get(2).get("fileName").asText());
        assertEquals("image/png", docs.get(2).get("contentType").asText());
        assertEquals("Insurance Policy Doc.docx", docs.get(3).get("fileName").asText());
        assertEquals("application/vnd.openxmlformats-officedocument.wordprocessingml.document", docs.get(3).get("contentType").asText());

        // Verify PDF download exact bytes and headers
        long pdfId = docs.get(0).get("documentId").asLong();
        mockMvc.perform(get("/api/documents/" + pdfId + "/download"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_PDF))
                .andExpect(header().string("Content-Disposition", containsString("attachment")))
                .andExpect(header().string("Content-Disposition", containsString("DL - Assignment 7.pdf")))
                .andExpect(content().bytes(pdfBytes));

        // Verify JPG download exact bytes and headers
        long jpgId = docs.get(1).get("documentId").asLong();
        mockMvc.perform(get("/api/documents/" + jpgId + "/download"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.IMAGE_JPEG))
                .andExpect(header().string("Content-Disposition", containsString("attachment")))
                .andExpect(header().string("Content-Disposition", containsString("Medical Receipt 2024.jpg")))
                .andExpect(content().bytes(jpgBytes));

        // Verify PNG download exact bytes and headers
        long pngId = docs.get(2).get("documentId").asLong();
        mockMvc.perform(get("/api/documents/" + pngId + "/download"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.IMAGE_PNG))
                .andExpect(header().string("Content-Disposition", containsString("attachment")))
                .andExpect(header().string("Content-Disposition", containsString("Boarding Pass Final.png")))
                .andExpect(content().bytes(pngBytes));

        // Verify DOCX download exact bytes and headers
        long docxId = docs.get(3).get("documentId").asLong();
        mockMvc.perform(get("/api/documents/" + docxId + "/download"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.wordprocessingml.document")))
                .andExpect(header().string("Content-Disposition", containsString("attachment")))
                .andExpect(header().string("Content-Disposition", containsString("Insurance Policy Doc.docx")))
                .andExpect(content().bytes(docxBytes));

        System.out.println("[TEST 11 PASSED] PDF, JPG, PNG, DOCX with spaces in filename successfully verified for download and content.");
    }
}


