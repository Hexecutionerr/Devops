/* =========================================================
   customer.js — Customer Portal JavaScript
   Handles: Claim Submission, Tab Navigation, Claim Tracking,
            Document Upload with Drag & Drop
   ========================================================= */

const API_BASE = '/api';

// Supported document upload configuration
const ALLOWED_EXTENSIONS = ['.pdf', '.jpeg', '.jpg', '.png', '.doc', '.docx'];
const MAX_FILE_SIZE = 5 * 1024 * 1024; // 5 MB

// In-memory list of selected files
let selectedFiles = [];

/* ---------- Tab Navigation ---------- */
function showTab(tabId, btn) {
    document.querySelectorAll('.tab-section').forEach(s => s.classList.remove('active'));
    document.querySelectorAll('nav button').forEach(b => b.classList.remove('active'));
    document.getElementById(tabId).classList.add('active');
    if (btn) btn.classList.add('active');
}

/* ---------- Utility: Show message ---------- */
function showMsg(elementId, message, type) {
    const el = document.getElementById(elementId);
    if (!el) return;
    el.className = `msg msg-${type} show`;
    el.innerHTML = message;
}

/* ---------- Utility: Hide message ---------- */
function hideMsg(elementId) {
    const el = document.getElementById(elementId);
    if (!el) return;
    el.className = 'msg';
    el.innerHTML = '';
}

/* ---------- Utility: Status Badge ---------- */
function statusBadge(status) {
    const map = {
        'PENDING': 'badge-pending',
        'APPROVED': 'badge-approved',
        'REJECTED': 'badge-rejected'
    };
    return `<span class="badge ${map[status] || ''}">${status}</span>`;
}

/* ---------- Utility: Format DateTime ---------- */
function formatDateTime(isoString) {
    if (!isoString) return '—';
    const d = new Date(isoString);
    return d.toLocaleString('en-IN', { dateStyle: 'medium', timeStyle: 'short' });
}

/* ---------- Utility: Format File Size ---------- */
function formatFileSize(bytes) {
    if (bytes < 1024) return bytes + ' B';
    if (bytes < 1024 * 1024) return (bytes / 1024).toFixed(1) + ' KB';
    return (bytes / (1024 * 1024)).toFixed(1) + ' MB';
}

/* ---------- Utility: File Icon ---------- */
function getFileIcon(fileName) {
    const lower = (fileName || '').toLowerCase();
    if (lower.endsWith('.pdf')) return '📕';
    if (lower.endsWith('.jpg') || lower.endsWith('.jpeg') || lower.endsWith('.png')) return '🖼️';
    if (lower.endsWith('.doc') || lower.endsWith('.docx')) return '📘';
    return '📄';
}

/* ---------- Utility: HTML Escaping ---------- */
function escapeHtml(str) {
    if (!str) return '';
    return str
        .replace(/&/g, '&amp;')
        .replace(/</g, '&lt;')
        .replace(/>/g, '&gt;')
        .replace(/"/g, '&quot;')
        .replace(/'/g, '&#039;');
}

/* ---------- Clear submit result ---------- */
function clearSubmitResult() {
    hideMsg('submitResult');
    const claimIdBox = document.getElementById('claimIdBox');
    if (claimIdBox) claimIdBox.style.display = 'none';
    clearAllFieldErrors();
    clearSelectedFiles();
}

/* =========================================================
   CLIENT-SIDE VALIDATION HELPERS
   ========================================================= */

/**
 * Show an inline error message below a specific field.
 * Creates a <span class="field-error"> element if it does not exist yet.
 */
function showFieldError(fieldId, message) {
    const input = document.getElementById(fieldId);
    if (!input) return;
    input.classList.add('input-error');
    let errEl = document.getElementById(fieldId + '-error');
    if (!errEl) {
        errEl = document.createElement('span');
        errEl.id = fieldId + '-error';
        errEl.className = 'field-error';
        input.parentNode.appendChild(errEl);
    }
    errEl.textContent = message;
    errEl.style.display = 'block';
}

/**
 * Remove the inline error for a specific field.
 */
function clearFieldError(fieldId) {
    const input = document.getElementById(fieldId);
    if (input) input.classList.remove('input-error');
    const errEl = document.getElementById(fieldId + '-error');
    if (errEl) errEl.style.display = 'none';
}

/**
 * Remove all inline field errors.
 */
function clearAllFieldErrors() {
    ['policyNumber','customerName','destination','travelDate',
     'claimType','claimAmount','description','documentReference']
        .forEach(clearFieldError);
}

/**
 * Run client-side validation on the claim submission form.
 * Returns true if valid, false otherwise (and shows per-field errors).
 */
function validateClaimForm(payload) {
    let valid = true;
    clearAllFieldErrors();

    if (!payload.customerName) {
        showFieldError('customerName', 'Customer name is required.');
        valid = false;
    }
    if (!payload.policyNumber) {
        showFieldError('policyNumber', 'Policy number is required.');
        valid = false;
    }
    if (!payload.destination) {
        showFieldError('destination', 'Destination is required.');
        valid = false;
    }
    if (!payload.travelDate) {
        showFieldError('travelDate', 'Travel date is required.');
        valid = false;
    }
    if (!payload.claimType) {
        showFieldError('claimType', 'Claim type is required.');
        valid = false;
    }
    if (isNaN(payload.claimAmount) || payload.claimAmount <= 0) {
        showFieldError('claimAmount', 'Claim amount must be greater than 0.');
        valid = false;
    }
    if (!payload.description) {
        showFieldError('description', 'Description is required.');
        valid = false;
    }
    if (!payload.documentReference) {
        showFieldError('documentReference', 'Document reference is required.');
        valid = false;
    }

    return valid;
}

/* =========================================================
   DOCUMENT UPLOAD FUNCTIONALITY
   ========================================================= */

function showUploadError(message) {
    const errEl = document.getElementById('fileUploadError');
    if (!errEl) return;
    errEl.innerHTML = message;
    errEl.style.display = 'block';
}

function clearUploadError() {
    const errEl = document.getElementById('fileUploadError');
    if (!errEl) return;
    errEl.innerHTML = '';
    errEl.style.display = 'none';
}

/**
 * Initialize file upload zone: click, keyboard, drag-and-drop, change events.
 */
function initUploadZone() {
    const uploadZone = document.getElementById('uploadZone');
    const fileInput = document.getElementById('documentFiles');

    if (!uploadZone || !fileInput) return;

    // 1. Click anywhere on upload area opens native file picker
    uploadZone.addEventListener('click', function(e) {
        if (e.target === fileInput) return;
        fileInput.click();
    });

    // 2. Keyboard accessibility: Enter or Space triggers file picker
    uploadZone.addEventListener('keydown', function(e) {
        if (e.key === 'Enter' || e.key === ' ') {
            e.preventDefault();
            fileInput.click();
        }
    });

    // 3. Prevent duplicate dialogs if click propagates
    fileInput.addEventListener('click', function(e) {
        e.stopPropagation();
    });

    // 4. File selection via native file picker
    fileInput.addEventListener('change', function(e) {
        if (e.target.files && e.target.files.length > 0) {
            handleSelectedFiles(e.target.files);
        }
        // Reset fileInput value so the same file can be re-selected if removed
        fileInput.value = '';
    });

    // 5. Drag and Drop events
    ['dragenter', 'dragover'].forEach(eventName => {
        uploadZone.addEventListener(eventName, function(e) {
            e.preventDefault();
            e.stopPropagation();
            uploadZone.classList.add('drag-over');
        });
    });

    ['dragleave', 'dragend'].forEach(eventName => {
        uploadZone.addEventListener(eventName, function(e) {
            e.preventDefault();
            e.stopPropagation();
            uploadZone.classList.remove('drag-over');
        });
    });

    uploadZone.addEventListener('drop', function(e) {
        e.preventDefault();
        e.stopPropagation();
        uploadZone.classList.remove('drag-over');
        if (e.dataTransfer && e.dataTransfer.files && e.dataTransfer.files.length > 0) {
            handleSelectedFiles(e.dataTransfer.files);
        }
    });
}

/**
 * Validate and add files to selectedFiles list.
 */
function handleSelectedFiles(fileList) {
    clearUploadError();
    const errorMessages = [];

    Array.from(fileList).forEach(file => {
        const lowerName = file.name.toLowerCase();
        const hasValidExt = ALLOWED_EXTENSIONS.some(ext => lowerName.endsWith(ext));

        // Format validation
        if (!hasValidExt) {
            errorMessages.push(`⚠️ "${escapeHtml(file.name)}": Unsupported format. Allowed: PDF, JPEG, JPG, PNG, DOC, DOCX.`);
            return;
        }

        // Size validation (Max 5 MB)
        if (file.size > MAX_FILE_SIZE) {
            errorMessages.push(`⚠️ "${escapeHtml(file.name)}": Exceeds 5 MB limit (${formatFileSize(file.size)}).`);
            return;
        }

        // Prevent duplicate file addition (same name and size)
        const isDuplicate = selectedFiles.some(f => f.name === file.name && f.size === file.size);
        if (!isDuplicate) {
            selectedFiles.push(file);
        }
    });

    if (errorMessages.length > 0) {
        showUploadError(errorMessages.join('<br>'));
    }

    renderFilePreview();
}

/**
 * Render selected files list below the upload zone with remove buttons.
 */
function renderFilePreview() {
    const previewList = document.getElementById('filePreviewList');
    if (!previewList) return;

    if (selectedFiles.length === 0) {
        previewList.innerHTML = '';
        return;
    }

    previewList.innerHTML = selectedFiles.map((file, idx) => `
        <div class="file-preview-item" id="file-item-${idx}">
            <div class="file-preview-info">
                <span class="file-preview-icon">${getFileIcon(file.name)}</span>
                <span class="file-preview-name" title="${escapeHtml(file.name)}">${escapeHtml(file.name)}</span>
                <span class="file-preview-size">(${formatFileSize(file.size)})</span>
            </div>
            <button type="button" class="btn-remove-file" onclick="removeFile(${idx})" title="Remove file" aria-label="Remove ${escapeHtml(file.name)}">
                ✕
            </button>
        </div>
    `).join('');
}

/**
 * Remove an individual file from the selected list.
 */
function removeFile(index) {
    if (index >= 0 && index < selectedFiles.length) {
        selectedFiles.splice(index, 1);
        renderFilePreview();
    }
}

/**
 * Clear all selected files and preview.
 */
function clearSelectedFiles() {
    selectedFiles = [];
    renderFilePreview();
    clearUploadError();
    const fileInput = document.getElementById('documentFiles');
    if (fileInput) fileInput.value = '';
}

/* =========================================================
   CLAIM SUBMISSION
   ========================================================= */
document.getElementById('claimForm').addEventListener('submit', async function (e) {
    e.preventDefault();
    hideMsg('submitResult');
    document.getElementById('claimIdBox').style.display = 'none';

    const submitBtn = document.getElementById('submitBtn');

    // Build the request payload
    const payload = {
        policyNumber:      document.getElementById('policyNumber').value.trim(),
        customerName:      document.getElementById('customerName').value.trim(),
        destination:       document.getElementById('destination').value.trim(),
        travelDate:        document.getElementById('travelDate').value,
        claimType:         document.getElementById('claimType').value,
        claimAmount:       parseFloat(document.getElementById('claimAmount').value),
        description:       document.getElementById('description').value.trim(),
        documentReference: document.getElementById('documentReference').value.trim()
    };

    // --- Client-side validation ---
    if (!validateClaimForm(payload)) {
        showMsg('submitResult', 'Please fix the highlighted fields before submitting.', 'error');
        return;
    }

    submitBtn.disabled = true;
    submitBtn.textContent = 'Submitting...';

    try {
        let response;

        if (selectedFiles.length > 0) {
            // Multipart FormData submission when supporting documents are attached
            const formData = new FormData();
            formData.append('policyNumber', payload.policyNumber);
            formData.append('customerName', payload.customerName);
            formData.append('destination', payload.destination);
            formData.append('travelDate', payload.travelDate);
            formData.append('claimType', payload.claimType);
            formData.append('claimAmount', payload.claimAmount);
            formData.append('description', payload.description);
            formData.append('documentReference', payload.documentReference);

            selectedFiles.forEach(file => {
                formData.append('files', file);
            });

            response = await fetch(`${API_BASE}/claims`, {
                method: 'POST',
                body: formData
            });
        } else {
            // Standard JSON submission when no documents are attached
            response = await fetch(`${API_BASE}/claims`, {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(payload)
            });
        }

        const data = await response.json();

        if (response.status === 201) {
            // Success — show the generated Claim ID
            clearAllFieldErrors();
            clearSelectedFiles();
            document.getElementById('generatedClaimId').textContent = data.claimId;
            document.getElementById('claimIdBox').style.display = 'block';
            document.getElementById('claimForm').reset();
            showMsg('submitResult', 'Claim submitted successfully! Your Claim ID is shown below.', 'success');
        } else if (response.status === 400) {
            // Backend validation error — display field errors returned by the server
            clearAllFieldErrors();
            let errorHtml = 'Please fix the following errors:<ul style="margin-top:6px;padding-left:18px;">';
            if (data.fieldErrors) {
                for (const [field, msg] of Object.entries(data.fieldErrors)) {
                    errorHtml += `<li><strong>${field}:</strong> ${msg}</li>`;
                    showFieldError(field, msg);
                }
            } else {
                errorHtml += `<li>${data.message || 'Validation failed.'}</li>`;
            }
            errorHtml += '</ul>';
            showMsg('submitResult', errorHtml, 'error');
        } else {
            showMsg('submitResult', `Unexpected error: ${data.message || 'Please try again.'}`, 'error');
        }

    } catch (err) {
        showMsg('submitResult', 'Network error. Make sure the server is running.', 'error');
        console.error('Submit error:', err);
    } finally {
        submitBtn.disabled = false;
        submitBtn.innerHTML = '🚀 Submit Claim';
    }
});


/* =========================================================
   CLAIM TRACKING
   ========================================================= */
async function trackClaim() {
    const claimIdInput = document.getElementById('trackClaimId');
    const claimId = claimIdInput.value.trim();

    hideMsg('trackResult');
    document.getElementById('claimDetailsCard').style.display = 'none';

    if (!claimId || isNaN(claimId) || Number(claimId) < 1) {
        showMsg('trackResult', 'Please enter a valid Claim ID.', 'error');
        return;
    }

    const trackBtn = document.getElementById('trackBtn');
    trackBtn.disabled = true;
    trackBtn.textContent = 'Searching...';

    try {
        const response = await fetch(`${API_BASE}/claims/${claimId}`);
        const data = await response.json();

        if (response.status === 200) {
            populateClaimDetails(data);
            document.getElementById('claimDetailsCard').style.display = 'block';
        } else if (response.status === 404) {
            showMsg('trackResult', `Claim with ID <strong>${claimId}</strong> was not found. Please check your Claim ID.`, 'error');
        } else {
            showMsg('trackResult', `Error: ${data.message || 'Unable to retrieve claim.'}`, 'error');
        }

    } catch (err) {
        showMsg('trackResult', 'Network error. Make sure the server is running.', 'error');
        console.error('Track error:', err);
    } finally {
        trackBtn.disabled = false;
        trackBtn.textContent = '🔍 Search';
    }
}

/* ---------- Populate Claim Details Card ---------- */
function populateClaimDetails(claim) {
    document.getElementById('d-claimId').textContent          = claim.claimId;
    document.getElementById('d-status').innerHTML             = statusBadge(claim.status);
    document.getElementById('d-policyNumber').textContent     = claim.policyNumber;
    document.getElementById('d-customerName').textContent     = claim.customerName;
    document.getElementById('d-destination').textContent      = claim.destination;
    document.getElementById('d-travelDate').textContent       = claim.travelDate;
    document.getElementById('d-claimType').textContent        = claim.claimType;
    document.getElementById('d-claimAmount').textContent      = '₹ ' + Number(claim.claimAmount).toLocaleString('en-IN');
    document.getElementById('d-description').textContent      = claim.description;
    document.getElementById('d-documentReference').textContent= claim.documentReference;
    document.getElementById('d-createdAt').textContent        = formatDateTime(claim.createdAt);
    document.getElementById('d-updatedAt').textContent        = formatDateTime(claim.updatedAt);

    // Load and render uploaded documents
    renderCustomerDocuments(claim);

    // Show rejection reason only if REJECTED
    const rejBox = document.getElementById('d-rejectionBox');
    if (claim.status === 'REJECTED' && claim.rejectionReason) {
        document.getElementById('d-rejectionReason').textContent = claim.rejectionReason;
        rejBox.style.display = 'block';
    } else {
        rejBox.style.display = 'none';
    }
}

/* ---------- Render Clickable Uploaded Documents in Tracking ---------- */
async function renderCustomerDocuments(claim) {
    const uploadedBox = document.getElementById('d-uploadedFilesBox');
    const container = document.getElementById('d-uploadedFiles');
    if (!uploadedBox || !container) return;

    container.innerHTML = '<span style="color:#6c757d;font-style:italic;font-size:0.85rem;">Loading documents...</span>';
    uploadedBox.style.display = 'block';

    try {
        const response = await fetch(`${API_BASE}/documents/claim/${claim.claimId}`);
        if (response.ok) {
            const docs = await response.json();
            if (Array.isArray(docs) && docs.length > 0) {
                container.innerHTML = `
                    <div class="doc-card-list">
                        ${docs.map(doc => `
                            <div class="doc-card-item">
                                <div class="doc-card-left">
                                    <span class="doc-card-icon">${getFileIcon(doc.fileName)}</span>
                                    <a href="${doc.viewUrl}" target="_blank" rel="noopener noreferrer" class="doc-card-filename" title="Open ${escapeHtml(doc.fileName)} in new tab">
                                        ${escapeHtml(doc.fileName)}
                                    </a>
                                    <span class="doc-card-size">${formatFileSize(doc.fileSize)}</span>
                                </div>
                                <div class="doc-card-actions">
                                    <a href="${doc.viewUrl}" target="_blank" rel="noopener noreferrer" class="btn-doc-action btn-doc-view" title="View ${escapeHtml(doc.fileName)} in new tab">
                                        👁️ View
                                    </a>
                                    <a href="${doc.downloadUrl}" class="btn-doc-action btn-doc-download" download="${escapeHtml(doc.fileName)}" title="Download ${escapeHtml(doc.fileName)}">
                                        📥 Download
                                    </a>
                                </div>
                            </div>
                        `).join('')}
                    </div>
                `;
                return;
            }
        }
    } catch (err) {
        console.warn('Could not fetch structured documents for claim ' + claim.claimId, err);
    }

    // Fallback: If claim has uploadedFiles text but no binary records
    if (claim.uploadedFiles && claim.uploadedFiles.trim() !== '') {
        const names = claim.uploadedFiles.split(',').map(s => s.trim()).filter(Boolean);
        container.innerHTML = `
            <div class="doc-card-list">
                ${names.map(name => `
                    <div class="doc-card-item">
                        <div class="doc-card-left">
                            <span class="doc-card-icon">${getFileIcon(name)}</span>
                            <span class="doc-card-filename" style="cursor:default;color:#555;">${escapeHtml(name)}</span>
                        </div>
                        <span class="doc-card-size">Filename record</span>
                    </div>
                `).join('')}
            </div>
        `;
    } else {
        uploadedBox.style.display = 'none';
        container.innerHTML = '';
    }
}


/* Allow pressing Enter in the track input */
document.getElementById('trackClaimId').addEventListener('keydown', function (e) {
    if (e.key === 'Enter') trackClaim();
});

/* Initialize upload zone */
if (document.readyState === 'loading') {
    document.addEventListener('DOMContentLoaded', initUploadZone);
} else {
    initUploadZone();
}
