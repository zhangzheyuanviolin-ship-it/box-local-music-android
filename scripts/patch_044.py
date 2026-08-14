from pathlib import Path

root = Path(__file__).resolve().parents[1]
engine = root / 'app/src/main/java/com/boxlocal/music/OfficialSoundGenEngine.java'
main = root / 'app/src/main/java/com/boxlocal/music/MainActivity.java'

text = engine.read_text(encoding='utf-8')

anchor = '''final class OfficialSoundGenEngine {\n  private OfficialSoundGenEngine() {}\n'''
replacement = '''final class OfficialSoundGenEngine {\n  enum AcceleratorMode {\n    AUTO,\n    CPU,\n    GPU\n  }\n\n  private OfficialSoundGenEngine() {}\n'''
if anchor not in text:
    raise SystemExit('Engine class anchor not found')
text = text.replace(anchor, replacement, 1)

old_generate_sig = '''      String prompt,\n      float durationSeconds,\n      Consumer<Float> progress)\n      throws Exception {\n'''
new_generate_sig = '''      String prompt,\n      float durationSeconds,\n      AcceleratorMode acceleratorMode,\n      Consumer<Float> progress)\n      throws Exception {\n'''
if old_generate_sig not in text:
    raise SystemExit('generate signature anchor not found')
text = text.replace(old_generate_sig, new_generate_sig, 1)

old_dispatch = '''    long seed = 42L;\n    if (model.soundGenBlocks == 0) {\n      return generateBasic(context, modelDir, prompt, durationSeconds, seed, progress);\n    }\n    if ("soundgen_hd_long".equals(model.id)) {\n      return generateHdLong(context, model, modelDir, prompt, durationSeconds, seed, progress);\n    }\n    return generateHd(context, model, modelDir, prompt, durationSeconds, seed, progress);\n'''
new_dispatch = '''    AcceleratorMode resolvedMode = acceleratorMode == null ? AcceleratorMode.AUTO : acceleratorMode;\n    long seed = 42L;\n    if (model.soundGenBlocks == 0) {\n      return generateBasic(context, modelDir, prompt, durationSeconds, seed, resolvedMode, progress);\n    }\n    if ("soundgen_hd_long".equals(model.id)) {\n      return generateHdLong(context, model, modelDir, prompt, durationSeconds, seed, resolvedMode, progress);\n    }\n    return generateHd(context, model, modelDir, prompt, durationSeconds, seed, resolvedMode, progress);\n'''
if old_dispatch not in text:
    raise SystemExit('dispatch block not found')
text = text.replace(old_dispatch, new_dispatch, 1)

sig_old = '''      long seed,\n      Consumer<Float> progress)\n'''
sig_new = '''      long seed,\n      AcceleratorMode acceleratorMode,\n      Consumer<Float> progress)\n'''
count = text.count(sig_old)
if count != 3:
    raise SystemExit(f'Expected 3 generator signatures, found {count}')
text = text.replace(sig_old, sig_new)

for filename in ("sg_text.litert", "sg_core.litert", "sg_decode.litert"):
    old = f'LiteRtRunner.open(new File(dir, "{filename}"), true)'
    new = f'LiteRtRunner.open(new File(dir, "{filename}"), acceleratorMode, true)'
    if old not in text:
        raise SystemExit(f'Missing Basic open call for {filename}')
    text = text.replace(old, new)

for filename in ("sghd_text.litert", "sghd_core.litert", "sghd_decode.litert"):
    old = f'LiteRtRunner.open(new File(dir, "{filename}"), false)'
    new = f'LiteRtRunner.open(new File(dir, "{filename}"), acceleratorMode, false)'
    if old not in text:
        raise SystemExit(f'Missing HD/Long open call for {filename}')
    text = text.replace(old, new)

text = text.replace('stage = "text model load CPU";', 'stage = "text model load " + acceleratorMode.name();')
text = text.replace('stage = "text inference CPU";', 'stage = "text inference " + acceleratorMode.name();')
text = text.replace('stage = "core model load CPU";', 'stage = "core model load " + acceleratorMode.name();')
text = text.replace(' + " / 8 inference CPU";', ' + " / 8 inference " + acceleratorMode.name();')
text = text.replace('stage = "decoder model load CPU";', 'stage = "decoder model load " + acceleratorMode.name();')
text = text.replace('stage = "decoder inference CPU";', 'stage = "decoder inference " + acceleratorMode.name();')
text = text.replace('+ ", accelerator=CPU"', '+ ", accelerator=" + acceleratorMode.name()')

text = text.replace(', blocks, duration, null);', ', blocks, duration, acceleratorMode, null);')
text = text.replace(', blocks, duration, error);', ', blocks, duration, acceleratorMode, error);')
old_diag_sig = '''      int blocks,\n      float duration,\n      Throwable error)\n'''
new_diag_sig = '''      int blocks,\n      float duration,\n      AcceleratorMode acceleratorMode,\n      Throwable error)\n'''
if old_diag_sig not in text:
    raise SystemExit('Long diagnostic signature not found')
text = text.replace(old_diag_sig, new_diag_sig, 1)
if 'out.append("accelerator=CPU\\n");' not in text:
    raise SystemExit('Long diagnostic accelerator line not found')
text = text.replace(
    'out.append("accelerator=CPU\\n");',
    'out.append("accelerator=").append(acceleratorMode.name()).append(\'\\n\');',
    1)

old_open = '''    static LiteRtRunner open(File file, boolean allowGpu) throws Exception {\n      if (!file.isFile()) {\n        throw new IllegalStateException("Missing model file: " + file.getAbsolutePath());\n      }\n      if (allowGpu) {\n        try {\n          return create(file, new String[] {"GPU", "CPU"});\n        } catch (Throwable ignored) {\n          return create(file, new String[] {"CPU"});\n        }\n      }\n      return create(file, new String[] {"CPU"});\n    }\n'''
new_open = '''    static LiteRtRunner open(\n        File file, AcceleratorMode acceleratorMode, boolean autoGpuPreferred) throws Exception {\n      if (!file.isFile()) {\n        throw new IllegalStateException("Missing model file: " + file.getAbsolutePath());\n      }\n      AcceleratorMode mode =\n          acceleratorMode == null ? AcceleratorMode.AUTO : acceleratorMode;\n      if (mode == AcceleratorMode.CPU) {\n        return create(file, new String[] {"CPU"});\n      }\n      if (mode == AcceleratorMode.GPU) {\n        return create(file, new String[] {"GPU"});\n      }\n      if (autoGpuPreferred) {\n        try {\n          return create(file, new String[] {"GPU", "CPU"});\n        } catch (Throwable gpuError) {\n          try {\n            return create(file, new String[] {"CPU"});\n          } catch (Exception cpuError) {\n            cpuError.addSuppressed(gpuError);\n            throw cpuError;\n          }\n        }\n      }\n      return create(file, new String[] {"CPU"});\n    }\n'''
if old_open not in text:
    raise SystemExit('LiteRtRunner.open block not found')
text = text.replace(old_open, new_open, 1)

engine.write_text(text, encoding='utf-8')

ui = main.read_text(encoding='utf-8')
ui = ui.replace('import android.widget.ProgressBar;\n', 'import android.widget.ProgressBar;\nimport android.widget.RadioButton;\nimport android.widget.RadioGroup;\n')
if 'private MediaPlayer mediaPlayer;\n' not in ui:
    raise SystemExit('mediaPlayer field not found')
ui = ui.replace(
    'private MediaPlayer mediaPlayer;\n',
    'private MediaPlayer mediaPlayer;\n  private Button playbackButton;\n',
    1)

status_anchor = '    statusView = addText("Ready. Model files verified: " + model.localStatusText(modelDir(model)));\n'
accel_ui = '''    addText("Acceleration mode");\n    RadioGroup acceleratorGroup = new RadioGroup(this);\n    acceleratorGroup.setOrientation(LinearLayout.VERTICAL);\n\n    RadioButton autoAccelerator = new RadioButton(this);\n    autoAccelerator.setText("Auto (recommended; stable baseline)");\n    autoAccelerator.setChecked(true);\n    acceleratorGroup.addView(autoAccelerator);\n\n    RadioButton cpuAccelerator = new RadioButton(this);\n    cpuAccelerator.setText("CPU");\n    acceleratorGroup.addView(cpuAccelerator);\n\n    RadioButton gpuAccelerator = new RadioButton(this);\n    gpuAccelerator.setText("GPU (experimental; no automatic CPU fallback)");\n    acceleratorGroup.addView(gpuAccelerator);\n\n    root.addView(acceleratorGroup, matchWrap());\n\n'''
if status_anchor not in ui:
    raise SystemExit('Generation page status anchor not found')
ui = ui.replace(status_anchor, accel_ui + status_anchor, 1)

old_generate_click = '''    generate.setOnClickListener(\n        v ->\n            startGeneration(\n                model,\n                prompt.getText().toString(),\n                model.minDurationSec + duration.getProgress(),\n                generate));\n'''
new_generate_click = '''    generate.setOnClickListener(\n        v -> {\n          OfficialSoundGenEngine.AcceleratorMode acceleratorMode =\n              gpuAccelerator.isChecked()\n                  ? OfficialSoundGenEngine.AcceleratorMode.GPU\n                  : cpuAccelerator.isChecked()\n                      ? OfficialSoundGenEngine.AcceleratorMode.CPU\n                      : OfficialSoundGenEngine.AcceleratorMode.AUTO;\n          startGeneration(\n              model,\n              prompt.getText().toString(),\n              model.minDurationSec + duration.getProgress(),\n              acceleratorMode,\n              generate);\n        });\n'''
if old_generate_click not in ui:
    raise SystemExit('Generate click listener block not found')
ui = ui.replace(old_generate_click, new_generate_click, 1)

old_play_button = '''    Button play = new Button(this);\n    play.setText("Play last generated WAV");\n    root.addView(play, matchWrap());\n    play.setOnClickListener(v -> playLastGenerated());\n'''
new_play_button = '''    Button play = new Button(this);\n    playbackButton = play;\n    play.setText("Play last generated WAV");\n    root.addView(play, matchWrap());\n    play.setOnClickListener(v -> togglePlayback());\n'''
if old_play_button not in ui:
    raise SystemExit('Playback button block not found')
ui = ui.replace(old_play_button, new_play_button, 1)

old_start_sig = '  private void startGeneration(ModelSpec model, String prompt, int durationSeconds, Button button) {\n'
new_start_sig = '''  private void startGeneration(\n      ModelSpec model,\n      String prompt,\n      int durationSeconds,\n      OfficialSoundGenEngine.AcceleratorMode acceleratorMode,\n      Button button) {\n'''
if old_start_sig not in ui:
    raise SystemExit('startGeneration signature not found')
ui = ui.replace(old_start_sig, new_start_sig, 1)

old_status = '''    if ("soundgen_hd_long".equals(model.id)) {\n      Runtime runtime = Runtime.getRuntime();\n      statusView.setText(\n          "Loading SoundGen HD Long. Accelerator: CPU. Blocks: 2048. Requested duration: "\n              + durationSeconds\n              + "s. Heap MB free="\n              + (runtime.freeMemory() / 1048576L)\n              + ", total="\n              + (runtime.totalMemory() / 1048576L)\n              + ", max="\n              + (runtime.maxMemory() / 1048576L));\n    } else {\n      statusView.setText("Loading official Box SoundGen engine...");\n    }\n'''
new_status = '''    String acceleratorText =\n        acceleratorMode == OfficialSoundGenEngine.AcceleratorMode.GPU\n            ? "GPU experimental (forced)"\n            : acceleratorMode == OfficialSoundGenEngine.AcceleratorMode.CPU\n                ? "CPU forced"\n                : model.soundGenBlocks == 0\n                    ? "Auto: GPU preferred, CPU fallback"\n                    : "Auto: CPU stable baseline";\n    if ("soundgen_hd_long".equals(model.id)) {\n      Runtime runtime = Runtime.getRuntime();\n      statusView.setText(\n          "Loading SoundGen HD Long. Accelerator: "\n              + acceleratorText\n              + ". Blocks: 2048. Requested duration: "\n              + durationSeconds\n              + "s. Heap MB free="\n              + (runtime.freeMemory() / 1048576L)\n              + ", total="\n              + (runtime.totalMemory() / 1048576L)\n              + ", max="\n              + (runtime.maxMemory() / 1048576L));\n    } else {\n      statusView.setText(\n          "Loading " + model.name + ". Accelerator: " + acceleratorText + "...");\n    }\n'''
if old_status not in ui:
    raise SystemExit('0.4.2 generation status block not found')
ui = ui.replace(old_status, new_status, 1)

old_generate_call = '''                        prompt.trim(),\n                        durationSeconds,\n                        progress ->\n'''
new_generate_call = '''                        prompt.trim(),\n                        durationSeconds,\n                        acceleratorMode,\n                        progress ->\n'''
if old_generate_call not in ui:
    raise SystemExit('Engine generate call anchor not found')
ui = ui.replace(old_generate_call, new_generate_call, 1)

old_failure = 'showFailure("Generate model " + model.id + ", duration=" + durationSeconds, e)'
new_failure = 'showFailure("Generate model " + model.id + ", duration=" + durationSeconds + ", accelerator=" + acceleratorMode, e)'
if old_failure not in ui:
    raise SystemExit('Generation failure diagnostics anchor not found')
ui = ui.replace(old_failure, new_failure, 1)

old_play_method = '''  private void playLastGenerated() {\n    try {\n      if (lastGeneratedFile == null || !lastGeneratedFile.isFile()) {\n        statusView.setText("No generated WAV is available yet.");\n        return;\n      }\n      if (mediaPlayer != null) {\n        mediaPlayer.release();\n      }\n      mediaPlayer = new MediaPlayer();\n      mediaPlayer.setDataSource(lastGeneratedFile.getAbsolutePath());\n      mediaPlayer.prepare();\n      mediaPlayer.start();\n      statusView.setText("Playing: " + lastGeneratedFile.getName());\n    } catch (Exception e) {\n      showFailure("Playback WAV", e);\n    }\n  }\n'''
new_play_method = '''  private void togglePlayback() {\n    try {\n      if (mediaPlayer != null) {\n        if (mediaPlayer.isPlaying()) {\n          mediaPlayer.pause();\n          if (playbackButton != null) {\n            playbackButton.setText("Resume playback");\n          }\n          statusView.setText("Paused: " + lastGeneratedFile.getName());\n          return;\n        }\n        mediaPlayer.start();\n        if (playbackButton != null) {\n          playbackButton.setText("Pause playback");\n        }\n        statusView.setText("Playing: " + lastGeneratedFile.getName());\n        return;\n      }\n      playLastGenerated();\n    } catch (Exception e) {\n      showFailure("Toggle playback WAV", e);\n    }\n  }\n\n  private void playLastGenerated() {\n    try {\n      if (lastGeneratedFile == null || !lastGeneratedFile.isFile()) {\n        statusView.setText("No generated WAV is available yet.");\n        return;\n      }\n      if (mediaPlayer != null) {\n        mediaPlayer.release();\n        mediaPlayer = null;\n      }\n      MediaPlayer player = new MediaPlayer();\n      mediaPlayer = player;\n      player.setDataSource(lastGeneratedFile.getAbsolutePath());\n      player.prepare();\n      player.setOnCompletionListener(\n          completedPlayer -> {\n            try {\n              completedPlayer.release();\n            } catch (Throwable ignored) {\n            }\n            if (mediaPlayer == completedPlayer) {\n              mediaPlayer = null;\n            }\n            runOnUiThread(\n                () -> {\n                  if (playbackButton != null) {\n                    playbackButton.setText("Play last generated WAV");\n                  }\n                  if (lastGeneratedFile != null) {\n                    statusView.setText("Playback finished: " + lastGeneratedFile.getName());\n                  }\n                });\n          });\n      player.start();\n      if (playbackButton != null) {\n        playbackButton.setText("Pause playback");\n      }\n      statusView.setText("Playing: " + lastGeneratedFile.getName());\n    } catch (Exception e) {\n      if (mediaPlayer != null) {\n        try {\n          mediaPlayer.release();\n        } catch (Throwable ignored) {\n        }\n        mediaPlayer = null;\n      }\n      if (playbackButton != null) {\n        playbackButton.setText("Play last generated WAV");\n      }\n      showFailure("Playback WAV", e);\n    }\n  }\n'''
if old_play_method not in ui:
    raise SystemExit('playLastGenerated method not found after diagnostics patch')
ui = ui.replace(old_play_method, new_play_method, 1)

ui = ui.replace('Box Local Music 0.4.3', 'Box Local Music 0.4.4')
ui = ui.replace('Version: 0.4.3 (code 8)', 'Version: 0.4.4 (code 9)')

main.write_text(ui, encoding='utf-8')
print('Applied 0.4.4 accelerator selector and playback toggle patch')
