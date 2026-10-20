# Task 13 — Configuration Management Using Ansible

## 1. Objective
To structure and implement Infrastructure as Code (IaC) using Ansible playbooks, inventory definitions, centralized variables, and Jinja2 templates for idempotent environment configuration and application deployment.

## 2. Directory Layout
The project maintains a dedicated Ansible configuration repository under `ansible/`:
```
ansible/
├── ansible.cfg              # Default inventory and privilege escalation settings
├── inventory/
│   └── hosts.yml            # Target server host definitions
├── group_vars/
│   └── all.yml              # Centralized environment variables (ports, paths, versions)
├── templates/
│   └── app.service.j2       # Systemd service Jinja2 template
└── playbooks/
    ├── deploy.yml           # Main deployment playbook
    ├── health-check.yml     # Standalone service health verification
    └── rollback.yml         # Automated backup restoration playbook
```

## 3. Idempotency Implementation
Every task in `deploy.yml` enforces state declaratively:
- Package installation specifies `state: present`.
- Directory management uses `state: directory`.
- File synchronization relies on checksum verification to avoid redundant file transfers.
- Service restarts are deferred to handlers (`notify: Restart Travel Insurance Service`) that only fire when underlying artifacts change.
