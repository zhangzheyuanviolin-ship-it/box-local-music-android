from pathlib import Path

root = Path(__file__).resolve().parents[1]
source_path = root / 'scripts/patch_047.py'
source = source_path.read_text(encoding='utf-8')
source = source.replace(
    "run_anchor = '''    void run() throws Exception {\\n      for (Method method : model.getClass().getMethods()) {\\n'''",
    "run_anchor = '''    void run() throws Exception {\\n      Class<?> compiled = model.getClass();\\n'''")
source = source.replace(
    "      for (Method method : model.getClass().getMethods()) {\\n'''\\nif run_anchor not in text:\\n    raise SystemExit('run method anchor not found')",
    "      Class<?> compiled = model.getClass();\\n'''\\nif run_anchor not in text:\\n    raise SystemExit('run method anchor not found')")
exec(compile(source, str(source_path), 'exec'), {'__file__': str(source_path), '__name__': '__main__'})
