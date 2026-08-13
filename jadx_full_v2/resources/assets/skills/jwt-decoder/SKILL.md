---
name: jwt-decoder
description: Decode a JSON Web Token (JWT) and show its header, payload, and expiry. Use when the user asks to decode, inspect, or read a JWT.
---

# JWT Decoder

Decodes the header and payload of a JWT. Does NOT verify the signature — this is a decode-only tool.

## Instructions

Call the `run_js` tool with:
- **script name**: `index.html`
- **data**: JSON string with:
  - `jwt`: String. The JWT token (three base64url parts separated by dots).

## Examples
- "Decode this JWT: eyJhbGciOi..."
- "What's inside this token: ..."
