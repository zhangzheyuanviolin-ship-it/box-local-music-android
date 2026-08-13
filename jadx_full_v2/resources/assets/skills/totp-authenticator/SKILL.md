---
name: totp-authenticator
description: Generate a time-based one-time password (TOTP / 2FA code) from a base32 secret. Use when the user gives a TOTP secret and wants the current code.
---

# TOTP Authenticator

Generates a 2FA code locally from a base32 secret — no cloud. The secret never leaves the device.

## Instructions

Call the `run_js` tool with:
- **script name**: `index.html`
- **data**: JSON string with:
  - `secret`: String. Base32-encoded TOTP secret (case-insensitive, spaces OK).
  - `digits`: Number (optional). Code length. Default: 6.
  - `period`: Number (optional). Seconds per code. Default: 30.
  - `algorithm`: String (optional). One of `SHA-1` (default), `SHA-256`, or `SHA-512`.

## Examples
- "Generate TOTP code for secret JBSWY3DPEHPK3PXP" → secret: "JBSWY3DPEHPK3PXP"
- "What's the 2FA code for: GEZDGNBVGY3TQOJQ with 8 digits?" → secret: ..., digits: 8
