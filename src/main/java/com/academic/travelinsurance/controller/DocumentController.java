package com.academic.travelinsurance.controller;

import com.academic.travelinsurance.dto.DocumentMetadataDto;
import com.academic.travelinsurance.entity.ClaimDocument;
import com.academic.travelinsurance.service.DocumentService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
.
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * REST Controller for retrieving, viewing, and downloading uploaded claim documents.
 * Base path: /api/documents
 */
@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    /**
     * GET /api/documents/claim/{claimId}
     * Returns metadata and access URLs for all documents attached to a specific claim.
     */
    @GetMapping("/claim/{claimId}")
    public ResponseEntity<List<DocumentMetadataDto>> getDocumentsByClaim(@PathVariable Long claimId) {
        List<DocumentMetadataDto> docs = documentService.getDocumentsByClaimId(claimId);
        return ResponseEntity.ok(docs);
    }

    /**
     * GET /api/documents/{documentId}/view
     * Streams the document for inline viewing (e.g. PDF in a browser tab).
     */
    @GetMapping("/{documentId}/view")
    public ResponseEntity<byte[]> viewDocument(@PathVariable Long documentId) {
        ClaimDocument doc = documentService.getDocumentById(documentId);

        MediaType mediaType;
        try {
            mediaType = MediaType.parseMediaType(doc.getContentType());
        } catch (Exception e) {
            mediaType = MediaType.APPLICATION_OCTET_STREAM;
        }

        String dispositionHeader = buildContentDisposition("inline", doc.getFileName());

        return ResponseEntity.ok()
                .contentType(mediaType)
                .header(HttpHeaders.CONTENT_DISPOSITION, dispositionHeader)
                .header("X-Content-Type-Options", "nosniff")
                .body(doc.getFileData());
    }

    /**
     * GET /api/documents/{documentId}/download
     * Downloads the document with its original filename and Content-Type.
     */
    @GetMapping("/{documentId}/download")
    public ResponseEntity<byte[]> downloadDocument(@PathVariable Long documentId) {
        ClaimDocument doc = documentService.getDocumentById(documentId);

        MediaType mediaType;
        try {
            mediaType = MediaType.parseMediaType(doc.getContentType());
        } catch (Exception e) {
            mediaType = MediaType.APPLICATION_OCTET_STREAM;
        }

        String dispositionHeader = buildContentDisposition("attachment", doc.getFileName());

        return ResponseEntity.ok()
                .contentType(mediaType)
                .header(HttpHeaders.CONTENT_DISPOSITION, dispositionHeader)
                .header(HttpHeaders.CONTENT_LENGTH, String.valueOf(doc.getFileSize()))
                .header("X-Content-Type-Options", "nosniff")
                .body(doc.getFileData());
    }

    /**
     * Builds RFC 6266 and RFC 5987 compliant Content-Disposition header.
     * Preserves exact original filename with spaces in both ASCII fallback and UTF-8 encoded filename*.
     */
    private String buildContentDisposition(String type, String fileName) {
        String safeName = (fileName == null || fileName.trim().isEmpty()) ? "document" : fileName.trim();
        String encoded = URLEncoder.encode(safeName, StandardCharsets.UTF_8).replace("+", "%20");
        String asciiFallback = safeName.replaceAll("[^\\x20-\\x7E]", "_").replace("\"", "\\\"");
        return type + "; filename=\"" + asciiFallback + "\"; filename*=UTF-8''" + encoded;
    }
}
