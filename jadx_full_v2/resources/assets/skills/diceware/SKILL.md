---
name: diceware
description: Generate a memorable passphrase made of random words (diceware style) with entropy calculation. Use when the user asks for a passphrase, word-based password, or memorable password.
---

# Diceware Passphrase

## Instructions

Call the `run_js` tool with:
- **script name**: `index.html`
- **data**: JSON string with:
  - `words`: Number. How many words per passphrase. Default: 5. Min: 3, Max: 12.
  - `separator`: String. Separator between words. Default: `-`.
  - `count`: Number. How many passphrases to generate. Default: 1. Max: 10.
  - `capitalize`: Boolean. Capitalize each word. Default: false.

## Examples
- "Generate a passphrase" → words: 5, separator: -, count: 1
- "6-word passphrase with spaces" → words: 6, separator: " "
- "Give me 3 strong passphrases" → count: 3
