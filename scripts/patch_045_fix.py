from pathlib import Path

root = Path(__file__).resolve().parents[1]
main = root / 'app/src/main/java/com/boxlocal/music/MainActivity.java'
text = main.read_text(encoding='utf-8')
if 'is就绪(' not in text:
    raise SystemExit('Expected localized isReady identifier regression not found')
text = text.replace('is就绪(', 'isReady(')
main.write_text(text, encoding='utf-8')
print('Restored ModelSpec.isReady identifiers after 0.4.5 localization')
