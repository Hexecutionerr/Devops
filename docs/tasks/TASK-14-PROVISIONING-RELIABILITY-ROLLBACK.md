# Task 14 — Automated Provisioning and Reliability Validation

## 1. Objective
To implement an automated fault-recovery and rollback playbook that restores the previously deployed application version when a deployment failure or health check anomaly occurs.

## 2. Rollback Mechanism
1. **Pre-Deployment Backup:**
   Prior to deploying a new JAR release, `deploy.yml` copies the currently active JAR to `/opt/travel-insurance/backups/app-backup-{{ timestamp }}.jar`.
2. **Automated Rollback Workflow (`rollback.yml`):**
   - Scans `/opt/travel-insurance/backups/` using the Ansible `find` module.
   - Sorts the found artifacts by modification timestamp (`mtime`) and selects the latest backup file.
   - Stops the failed service using systemd (`state: stopped`).
   - Copies the backup artifact over `/opt/travel-insurance/app.jar`.
   - Restarts the service with the restored release.
   - Polls the HTTP health check URL until HTTP 200 OK is confirmed.

## 3. Reliability Verification
This automated strategy guarantees zero-touch recovery without requiring manual sysadmin intervention.
