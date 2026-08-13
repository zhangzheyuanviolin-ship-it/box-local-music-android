---
name: text-encrypt
description: Encrypt or decrypt a message with AES-256-GCM using a passphrase. Use when the user wants to encrypt text, decrypt text, or protect a message with a password.
---

# Text Encrypt / Decrypt

Uses AES-256-GCM with PBKDF2-SHA256 key derivation (250k iterations). All processing is local.

## Instructions

Call the `run_js` tool with:
- **script name**: `index.html`
- **data**: JSON string with:
  - `mode`: String. Either `encrypt` or `decrypt`.
  - `text`: String. Plaintext to encrypt, or base64 ciphertext to decrypt.
  - `passphrase`: String. Passphrase used for encryption/decryption.

## Output format
Encrypted text is returned as a base64 string containing salt + iv + ciphertext. Paste that same string back with the same passphrase to decrypt.

## Examples
- "Encrypt 'meet me at 5pm' with passphrase 'shadow'" → mode: encrypt, text: "meet me at 5pm", passphrase: "shadow"
- "Decrypt this: base64string... with passphrase hunter2" → mode: decrypt, text: ..., passphrase: ...
