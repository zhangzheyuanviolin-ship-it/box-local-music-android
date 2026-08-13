---
name: wordle-helper
description: Suggest Wordle answer candidates given green, yellow, and gray letter feedback. Use when the user asks for Wordle help.
---

# Wordle Helper

## Instructions

Call the `run_js` tool with:
- **script name**: `index.html`
- **data**: JSON string with:
  - `green`: String. 5 letters, with `.` for unknown positions. Example: `c..er` means C in position 1, E in position 4, R in position 5.
  - `yellow`: String. Letters known to be in the word but position unknown. You can include their wrong position using `letter:pos` comma-list, e.g. `a:2,t:3`.
  - `gray`: String. Letters known NOT to be in the word. Example: `slnt`.
  - `length`: Number. Word length. Default: 5.

## Examples
- Green S._.T, yellow A (not at 2), gray RLN → green: "s...t", yellow: "a:2", gray: "rln"
- "I have green C at position 1, yellow E was at position 3 (wrong), gray letters XQZ"
