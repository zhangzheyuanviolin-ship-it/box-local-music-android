---
name: dice-roller
description: Roll dice using standard dice notation (e.g. 2d6+3, 1d20, 4d6-1). Use when the user asks to roll dice.
---

# Dice Roller

## Instructions

Call the `run_js` tool with:
- **script name**: `index.html`
- **data**: JSON string with:
  - `notation`: String. Dice notation like `2d6`, `1d20+5`, `4d8-2`, or multiple separated by space/comma: `2d6 1d8+1`.
  - `rolls`: Number (optional). How many times to repeat the roll. Default: 1. Max: 20.

## Examples
- "Roll a d20" → notation: 1d20
- "Roll 4d6 and drop the lowest" → notation: 4d6 (user discards lowest)
- "Roll 2d6+3" → notation: 2d6+3
- "Roll 3 times: 1d20" → notation: 1d20, rolls: 3
