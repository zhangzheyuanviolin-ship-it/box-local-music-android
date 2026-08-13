---
name: regex-tester
description: Test a regular expression against text and return all matches. Use when the user asks to test a regex, find matches, or validate a pattern.
---

# Regex Tester

## Instructions

Call the `run_js` tool with:
- **script name**: `index.html`
- **data**: JSON string with:
  - `pattern`: String. The regex pattern (no surrounding slashes).
  - `text`: String. Text to search.
  - `flags`: String (optional). Regex flags. Default: `g`. Common: `g`, `i`, `gi`, `gm`, `gim`.

## Examples
- "Test /\\d+/g against 'abc 123 def 456'" → pattern: \\d+, text: abc 123 def 456, flags: g
- "Find all emails in this text using regex"
- "Does this match the pattern [A-Z]+?"
