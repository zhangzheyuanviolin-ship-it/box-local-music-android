---
name: unit-converter
description: Convert between units of length, weight, temperature, volume, or time. Use when the user asks to convert units.
---

# Unit Converter

## Instructions

Call the `run_js` tool with:
- **script name**: `index.html`
- **data**: JSON string with:
  - `value`: Number. The value to convert.
  - `from`: String. Source unit.
  - `to`: String. Target unit.
  - `category`: String. One of `length`, `weight`, `temperature`, `volume`, `time`.

## Supported units
- **length**: mm, cm, m, km, in, ft, yd, mi
- **weight**: mg, g, kg, oz, lb, ton
- **temperature**: c, f, k
- **volume**: ml, l, tsp, tbsp, cup, floz, pint, quart, gal
- **time**: ms, s, min, hr, day, week, month, year

## Examples
- "Convert 10 miles to km" → value: 10, from: mi, to: km, category: length
- "How many pounds is 5kg?" → value: 5, from: kg, to: lb, category: weight
- "Convert 72 F to Celsius" → value: 72, from: f, to: c, category: temperature
