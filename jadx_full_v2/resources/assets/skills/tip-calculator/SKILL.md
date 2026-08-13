---
name: tip-calculator
description: Calculate a tip on a bill and split it between people. Use when the user asks to calculate a tip, split a bill, or figure out what to pay.
---

# Tip Calculator

## Instructions

Call the `run_js` tool with:
- **script name**: `index.html`
- **data**: JSON string with:
  - `bill`: Number. The bill amount.
  - `tipPercent`: Number. Tip percentage. Default: 15.
  - `people`: Number. How many people split the bill. Default: 1.
  - `roundUp`: Boolean. Round each person's share up to the nearest dollar. Default: false.
  - `currency`: String. Currency symbol. Default: "$".

## Examples
- "Tip on a $80 bill" → bill: 80, tipPercent: 15, people: 1
- "Split $120 between 4 people with 20% tip" → bill: 120, tipPercent: 20, people: 4
- "What's 18% tip on $45.50?" → bill: 45.50, tipPercent: 18
