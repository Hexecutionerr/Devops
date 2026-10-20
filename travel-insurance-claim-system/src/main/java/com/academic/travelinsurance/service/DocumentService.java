package com.academic.travelinsurance.service;

import com.academic.travelinsurance.dto.DocumentMetadataDto;
import com.academic.travelinsurance.entity.ClaimDocument;
import com.academic.travelinsurance.exception.DocumentNotFoundException;
import com.academic.travelinsurance.repository.ClaimDocumentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class DocumentService {

    private final ClaimDocumentRepository documentRepository;
    private final Path uploadStorageDir = Paths.get("uploads").toAbsolutePath().normalize();

    public DocumentService(ClaimDocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
        try {
            Files.createDirectories(uploadStorageDir);
        } catch (IOException ignored) {}
    }

    /**
     * Store an uploaded document in the database and optionally write a copy to the server filesystem.
     */
    public ClaimDocument saveDocument(Long claimId, MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        if (originalFilename == null || originalFilename.trim().isEmpty()) {
            originalFilename = "document";
        }
        // Sanitize to prevent path traversal
        String sanitizedFilename = Paths.get(originalFilename).getFileName().toString();

        String contentType = file.getContentType();
        if (contentType == null || contentType.trim().isEmpty() || "application/octet-stream".equals(contentType)) {
            contentType = determineContentType(sanitizedFilename);
        }

        byte[] fileBytes = file.getBytes();
        ClaimDocument doc = new ClaimDocument(
                claimId,
                sanitizedFilename,
                contentType,
                file.getSize(),
                fileBytes
        );

        ClaimDocument savedDoc = documentRepository.save(doc);

        // Safe backup to filesystem
        try {
            Path claimFolder = uploadStorageDir.resolve(String.valueOf(claimId)).normalize();
            Files.createDirectories(claimFolder);
            Path targetFile = claimFolder.resolve(savedDoc.getId() + "_" + sanitizedFilename).normalize();
            if (targetFile.startsWith(uploadStorageDir)) {
                Files.write(targetFile, fileBytes);
            }
        } catch (Exception ignored) {}

        return savedDoc;
    }

    /**
     * Get all documents associated with a claim as DTOs with view and download URLs.
     */
    public List<DocumentMetadataDto> getDocumentsByClaimId(Long claimId) {
        return documentRepository.findByClaimIdOrderByIdAsc(claimId).stream()
                .map(this::toDto)
                .toList();
    }

    /**
     * Retrieve document entity with binary data by document ID.
     */
    public ClaimDocument getDocumentById(Long documentId) {
        return documentRepository.findById(documentId)
                .orElseThrow(() -> new DocumentNotFoundException(documentId));
    }

    private DocumentMetadataDto toDto(ClaimDocument doc) {
        return new DocumentMetadataDto(
                doc.getId(),
                doc.getClaimId(),
                doc.getFileName(),
                doc.getContentType(),
                doc.getFileSize(),
                "/api/documents/" + doc.getId() + "/view",
                "/api/documents/" + doc.getId() + "/download",
                doc.getUploadedAt()
        );
    }

    private String determineContentType(String fileName) {
        String lower = fileName.toLowerCase();
        if (lower.endsWith(".pdf")) return "application/pdf";
        if (lower.endsWith(".png")) return "image/png";
        if (lower.endsWith(".jpg") || lower.endsWith(".jpeg")) return "image/jpeg";
        if (lower.endsWith(".doc")) return "application/msword";
        if (lower.endsWith(".docx")) return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
        return "application/octet-stream";
    }
}
