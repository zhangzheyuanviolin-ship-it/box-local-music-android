---
name: color-tools
description: Convert colors between hex/rgb/hsl and check WCAG contrast ratio. Use when the user asks about color conversion, contrast, or accessibility.
---

# Color Tools

## Instructions

Call the `run_js` tool with:
- **script name**: `index.html`
- **data**: JSON string with:
  - `color`: String. A color in hex (`#RRGGBB` / `#RGB`), rgb (`rgb(r,g,b)`), or hsl (`hsl(h,s%,l%)`).
  - `operation`: String. One of `convert` (default) or `contrast`.
  - `against`: String. Only for `contrast`. Second color to compare.

## Examples
- "Convert #4ecca3 to rgb and hsl" → color: "#4ecca3", operation: convert
- "What's the contrast ratio between #ffffff and #1a1a2e?" → color: "#ffffff", operation: contrast, against: "#1a1a2e"
- "Convert rgb(255,120,50) to hex" → color: "rgb(255,120,50)", operation: convert
