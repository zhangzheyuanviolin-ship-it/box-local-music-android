from pathlib import Path

root = Path(__file__).resolve().parents[1]
main = root / 'app/src/main/java/com/boxlocal/music/MainActivity.java'

ui = main.read_text(encoding='utf-8')

# Final UI polish: keep accelerator choices concise and leave the proven 0.4.7
# GPU implementation untouched.
if 'GPU（最终实验：强化 OpenCL）' not in ui:
    raise SystemExit('0.4.7 GPU label anchor not found')
ui = ui.replace('GPU（最终实验：强化 OpenCL）', 'GPU', 1)

# Measure wall-clock generation time with Android elapsedRealtime so device clock
# changes cannot affect the result. The timer starts immediately before the worker
# thread is launched and stops as soon as the generated WAV path is returned.
if 'import android.os.Bundle;\n' not in ui:
    raise SystemExit('Bundle import anchor not found')
ui = ui.replace('import android.os.Bundle;\n', 'import android.os.Bundle;\nimport android.os.SystemClock;\n', 1)

field_anchor = '  private Button playbackButton;\n'
if field_anchor not in ui:
    raise SystemExit('playbackButton field anchor not found')
ui = ui.replace(field_anchor, field_anchor + '  private long lastGenerationElapsedMs = -1L;\n', 1)

start_anchor = '''    activeGeneration = true;\n    button.setEnabled(false);\n'''
start_replacement = '''    activeGeneration = true;\n    button.setEnabled(false);\n    final long generationStartedAtMs = SystemClock.elapsedRealtime();\n    lastGenerationElapsedMs = -1L;\n'''
if start_anchor not in ui:
    raise SystemExit('generation start anchor not found')
ui = ui.replace(start_anchor, start_replacement, 1)

complete_anchor = '''                lastGeneratedFile = new File(output);\n                lastExportedUri = null;\n'''
complete_replacement = '''                lastGeneratedFile = new File(output);\n                lastGenerationElapsedMs =\n                    Math.max(0L, SystemClock.elapsedRealtime() - generationStartedAtMs);\n                lastExportedUri = null;\n'''
if complete_anchor not in ui:
    raise SystemExit('generation completion anchor not found')
ui = ui.replace(complete_anchor, complete_replacement, 1)

# The generated status is immediately followed by autoplay, but keep timing on both
# states so it remains visible to screen readers throughout playback controls.
ui = ui.replace(
    'statusView.setText("音频生成完成：" + lastGeneratedFile.getAbsolutePath());',
    'statusView.setText("音频生成完成：" + lastGeneratedFile.getAbsolutePath() + generationElapsedText());')

# 0.4.6/0.4.7 acceleration diagnostics decorate both initial playback and resume.
playing_anchor = '''                + lastGeneratedFile.getName()\n                + (OfficialSoundGenEngine.accelerationReport().isEmpty()\n'''
playing_replacement = '''                + lastGeneratedFile.getName()\n                + generationElapsedText()\n                + (OfficialSoundGenEngine.accelerationReport().isEmpty()\n'''
playing_count = ui.count(playing_anchor)
if playing_count < 1:
    raise SystemExit('playback acceleration status anchor not found')
ui = ui.replace(playing_anchor, playing_replacement)

ui = ui.replace(
    'statusView.setText("已暂停：" + lastGeneratedFile.getName());',
    'statusView.setText("已暂停：" + lastGeneratedFile.getName() + generationElapsedText());')
ui = ui.replace(
    'statusView.setText("播放结束：" + lastGeneratedFile.getName());',
    'statusView.setText("播放结束：" + lastGeneratedFile.getName() + generationElapsedText());')

helper_anchor = '''  private Uri exportLastGenerated() throws Exception {\n'''
helper = '''  private String generationElapsedText() {\n    if (lastGenerationElapsedMs < 0L) return "";\n    return "\\n生成耗时："\n        + String.format(java.util.Locale.US, "%.2f", lastGenerationElapsedMs / 1000.0)\n        + " 秒";\n  }\n\n'''
if helper_anchor not in ui:
    raise SystemExit('export method anchor not found')
ui = ui.replace(helper_anchor, helper + helper_anchor, 1)

ui = ui.replace('Box 本地音乐 0.4.7', 'Box 本地音乐 0.4.8')
ui = ui.replace('Version: 0.4.7 (code 12)', 'Version: 0.4.8 (code 13)')

main.write_text(ui, encoding='utf-8')
print('Applied 0.4.8 final UI polish and generation elapsed-time display')
