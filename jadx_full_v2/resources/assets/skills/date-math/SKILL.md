---
name: date-math
description: Calculate days between dates, a person's age, or the weekday of a date. Use when the user asks about dates, age, or how many days until/since an event.
---

# Date Math

## Instructions

Call the `run_js` tool with:
- **script name**: `index.html`
- **data**: JSON string with:
  - `operation`: String. One of `between`, `age`, or `weekday`.
  - `date1`: String. ISO date (YYYY-MM-DD) or similar.
  - `date2`: String (optional). Second date. Defaults to today.

## Operations
- **between**: Days/weeks/months/years between date1 and date2.
- **age**: Age as of date2 given a birthdate in date1.
- **weekday**: Day of week for date1.

## Examples
- "How many days between 2020-01-01 and today?" → operation: between, date1: 2020-01-01
- "How old is someone born 1990-06-15?" → operation: age, date1: 1990-06-15
- "What weekday is 2026-12-25?" → operation: weekday, date1: 2026-12-25
