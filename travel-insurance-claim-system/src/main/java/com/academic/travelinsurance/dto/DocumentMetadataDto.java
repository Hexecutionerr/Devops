package com.academic.travelinsurance.dto;

import java.time.LocalDateTime;

public class DocumentMetadataDto {

    private Long documentId;
    private Long claimId;
    private String fileName;
    private String contentType;
    private Long fileSize;
    private String viewUrl;
    private String downloadUrl;
    private LocalDateTime uploadedAt;

    public DocumentMetadataDto() {}

    public DocumentMetadataDto(Long documentId, Long claimId, String fileName, String contentType,
                               Long fileSize, String viewUrl, String downloadUrl, LocalDateTime uploadedAt) {
        this.documentId = documentId;
        this.claimId = claimId;
        this.fileName = fileName;
        this.contentType = contentType;
        this.fileSize = fileSize;
        this.viewUrl = viewUrl;
        this.downloadUrl = downloadUrl;
        this.uploadedAt = uploadedAt;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public Long getClaimId() {
        return claimId;
    }

    public void setClaimId(Long claimId) {
        this.claimId = claimId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getViewUrl() {
        return viewUrl;
    }

    public void setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(LocalDateTime uploadedAt) {
        this.uploadedAt = uploadedAt;
    }
}
