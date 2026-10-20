package com.academic.travelinsurance.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Global exception handler.
 * Catches exceptions from all controllers and returns structured JSON error responses.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handles Bean Validation failures (both JSON @RequestBody and multipart @ModelAttribute).
     * Returns 400 Bad Request with a map of field -> error message.
     */
    @ExceptionHandler({MethodArgumentNotValidException.class, org.springframework.validation.BindException.class})
    public ResponseEntity<Map<String, Object>> handleValidationErrors(Exception ex) {
        org.springframework.validation.BindingResult bindingResult;
        if (ex instanceof MethodArgumentNotValidException manve) {
            bindingResult = manve.getBindingResult();
        } else if (ex instanceof org.springframework.validation.BindException be) {
            bindingResult = be.getBindingResult();
        } else {
            return handleGenericException(ex);
        }

        Map<String, String> fieldErrors = new HashMap<>();
        for (FieldError error : bindingResult.getFieldErrors()) {
            fieldErrors.put(error.getField(), error.getDefaultMessage());
        }

        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now().toString());
        body.put("status", 400);
        body.put("error", "Validation Failed");
        body.put("fieldErrors", fieldErrors);

        return ResponseEntity.badRequest().body(body);
    }

    /**
     * Handles files exceeding maximum upload limits.
     * Returns 400 Bad Request.
     */
    @ExceptionHandler(org.springframework.web.multipart.MaxUploadSizeExceededException.class)
    public ResponseEntity<Map<String, Object>> handleMaxUploadSize(org.springframework.web.multipart.MaxUploadSizeExceededException ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now().toString());
        body.put("status", 400);
        body.put("error", "File Too Large");
        body.put("message", "Uploaded file exceeds the maximum allowed limit of 5 MB.");

        return ResponseEntity.badRequest().body(body);
    }

    /**
     * Handles ClaimNotFoundException (claim ID not found in DB).
     * Returns 404 Not Found.
     */
    @ExceptionHandler(ClaimNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleClaimNotFound(ClaimNotFoundException ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now().toString());
        body.put("status", 404);
        body.put("error", "Not Found");
        body.put("message", ex.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }

    /**
     * Handles DocumentNotFoundException (document ID not found in DB).
     * Returns 404 Not Found.
     */
    @ExceptionHandler(DocumentNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleDocumentNotFound(DocumentNotFoundException ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now().toString());
        body.put("status", 404);
        body.put("error", "Not Found");
        body.put("message", ex.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }

    /**
     * Handles any other unexpected exceptions.
     * Returns 500 Internal Server Error.
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGenericException(Exception ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now().toString());
        body.put("status", 500);
        body.put("error", "Internal Server Error");
        body.put("message", ex.getMessage());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
    }
}
