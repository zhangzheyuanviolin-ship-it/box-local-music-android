---
name: json-formatter
description: Format, validate, or minify JSON. Use when the user asks to pretty-print, beautify, validate, or compact JSON.
---

# JSON Formatter

## Instructions

Call the `run_js` tool with:
- **script name**: `index.html`
- **data**: JSON string with:
  - `json`: String. The JSON text to process.
  - `mode`: String. One of `format` (default), `minify`, or `validate`.
  - `indent`: Number. Spaces for indentation (format mode only). Default: 2.

## Examples
- "Format this JSON: {\"a\":1,\"b\":[2,3]}" → mode: format
- "Is this valid JSON? {...}" → mode: validate
- "Minify this JSON" → mode: minify
- "Pretty print with 4 spaces" → mode: format, indent: 4
