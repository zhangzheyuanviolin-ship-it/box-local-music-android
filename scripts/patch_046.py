from pathlib import Path

root = Path(__file__).resolve().parents[1]
engine = root / 'app/src/main/java/com/boxlocal/music/OfficialSoundGenEngine.java'
main = root / 'app/src/main/java/com/boxlocal/music/MainActivity.java'

text = engine.read_text(encoding='utf-8')

# Add a lightweight user-visible acceleration report. Only one generation can run at a time.
anchor = '''  private OfficialSoundGenEngine() {}\n'''
insert = '''  private static volatile String ACCELERATION_REPORT = "";\n\n  private OfficialSoundGenEngine() {}\n\n  static String accelerationReport() {\n    return ACCELERATION_REPORT == null ? "" : ACCELERATION_REPORT;\n  }\n\n  private static void resetAccelerationReport() {\n    ACCELERATION_REPORT = "";\n  }\n\n  private static void appendAccelerationReport(String line) {\n    if (line == null || line.isEmpty()) return;\n    if (ACCELERATION_REPORT == null || ACCELERATION_REPORT.isEmpty()) {\n      ACCELERATION_REPORT = line;\n    } else {\n      ACCELERATION_REPORT = ACCELERATION_REPORT + "；" + line;\n    }\n  }\n'''
if anchor not in text:
    raise SystemExit('Engine constructor anchor not found')
text = text.replace(anchor, insert, 1)

seed_anchor = '''    AcceleratorMode resolvedMode = acceleratorMode == null ? AcceleratorMode.AUTO : acceleratorMode;\n    long seed = 42L;\n'''
seed_replacement = '''    AcceleratorMode resolvedMode = acceleratorMode == null ? AcceleratorMode.AUTO : acceleratorMode;\n    resetAccelerationReport();\n    if (resolvedMode == AcceleratorMode.GPU) {\n      appendAccelerationReport("GPU 实验模式：Text 固定 CPU，Core/Decoder 尝试 GPU+CPU 混合编译");\n    }\n    long seed = 42L;\n'''
if seed_anchor not in text:
    raise SystemExit('Generate seed anchor not found')
text = text.replace(seed_anchor, seed_replacement, 1)

text_anchor = '''        if ("text".equals(component)) {\n          return create(file, new String[] {"CPU"});\n        }\n'''
text_replacement = '''        if ("text".equals(component)) {\n          appendAccelerationReport("Text=CPU");\n          return create(file, new String[] {"CPU"});\n        }\n'''
if text_anchor not in text:
    raise SystemExit('GPU text branch anchor not found')
text = text.replace(text_anchor, text_replacement, 1)

old_gpu_method = '''    private static LiteRtRunner createGpuExperimental(\n        File file, String component, boolean quantizedHint) throws Exception {\n      String[][] profiles =\n          new String[][] {\n            {"AUTOMATIC", "DEFAULT"},\n            {"OPENCL", "FP16"},\n            {"OPENCL", "FP32"},\n            {"OPENGL", "FP16"},\n            {"OPENGL", "FP32"}\n          };\n      StringBuilder failures = new StringBuilder();\n      Throwable last = null;\n      for (String[] profile : profiles) {\n        try {\n          LiteRtRunner runner =\n              createGpuProfile(file, profile[0], profile[1], quantizedHint);\n          runner.gpuFallbackNote =\n              component + " GPU profile=" + profile[0] + "/" + profile[1];\n          return runner;\n        } catch (Throwable error) {\n          last = rootCause(error);\n          if (failures.length() > 0) failures.append(" | ");\n          failures\n              .append(profile[0])\n              .append('/')\n              .append(profile[1])\n              .append(": ")\n              .append(compactThrowable(last));\n          System.gc();\n        }\n      }\n      throw new Exception(\n          "GPU compile probe failed for component="\n              + component\n              + ", model="\n              + file.getName()\n              + ", LiteRT=2.1.6, attempts="\n              + failures,\n          last);\n    }\n'''
new_gpu_method = '''    private static LiteRtRunner createGpuExperimental(\n        File file, String component, boolean quantizedHint) throws Exception {\n      // LiteRT CLI documents GPU+CPU as the supported GPU path with CPU fallback.\n      // 0.4.5 proved that pure-GPU compilation fails for both HD cores on this device.\n      String[][] profiles =\n          new String[][] {\n            {"AUTOMATIC", "DEFAULT"},\n            {"OPENCL", "FP16"},\n            {"OPENCL", "FP32"},\n            {"OPENGL", "FP16"},\n            {"OPENGL", "FP32"}\n          };\n      StringBuilder failures = new StringBuilder();\n      Throwable last = null;\n      for (String[] profile : profiles) {\n        try {\n          LiteRtRunner runner =\n              createGpuProfile(file, profile[0], profile[1], quantizedHint);\n          runner.gpuFallbackNote =\n              component + " GPU+CPU profile=" + profile[0] + "/" + profile[1];\n          appendAccelerationReport(\n              component\n                  + "=GPU+CPU 混合编译成功("\n                  + profile[0]\n                  + "/"\n                  + profile[1]\n                  + ")；实际 GPU 分区需结合耗时判断");\n          return runner;\n        } catch (Throwable error) {\n          last = rootCause(error);\n          if (failures.length() > 0) failures.append(" | ");\n          failures\n              .append(profile[0])\n              .append('/')\n              .append(profile[1])\n              .append(": ")\n              .append(compactThrowable(last));\n          System.gc();\n        }\n      }\n      appendAccelerationReport(\n          component + "=GPU+CPU 五种 profile 均失败，已安全回退 CPU");\n      LiteRtRunner cpu = create(file, new String[] {"CPU"});\n      cpu.gpuFallbackNote =\n          component + " GPU+CPU probes failed; CPU fallback; " + failures;\n      return cpu;\n    }\n'''
if old_gpu_method not in text:
    raise SystemExit('0.4.5 createGpuExperimental block not found')
text = text.replace(old_gpu_method, new_gpu_method, 1)

old_array = '''      Object array = Array.newInstance(accelerator, 1);\n      Array.set(array, 0, Enum.valueOf((Class<? extends Enum>) accelerator, "GPU"));\n'''
new_array = '''      Object array = Array.newInstance(accelerator, 2);\n      Array.set(array, 0, Enum.valueOf((Class<? extends Enum>) accelerator, "GPU"));\n      Array.set(array, 1, Enum.valueOf((Class<? extends Enum>) accelerator, "CPU"));\n'''
if old_array not in text:
    raise SystemExit('0.4.5 pure GPU accelerator array not found')
text = text.replace(old_array, new_array, 1)

engine.write_text(text, encoding='utf-8')

ui = main.read_text(encoding='utf-8')
ui = ui.replace('GPU（实验：优先加速核心计算）', 'GPU（实验：GPU+CPU 混合）')
ui = ui.replace(
    'GPU 实验混合模式：Text=CPU，Core=GPU 探测，Decoder=GPU 探测/CPU 回退',
    'GPU 实验模式：Text=CPU，Core/Decoder=GPU+CPU 混合编译，失败自动回退 CPU')

# Keep the excellent 0.4.5 playback state machine, but surface the GPU decision while playing.
old_playing = 'statusView.setText("正在播放：" + lastGeneratedFile.getName());'
new_playing = '''statusView.setText(\n            "正在播放："\n                + lastGeneratedFile.getName()\n                + (OfficialSoundGenEngine.accelerationReport().isEmpty()\n                    ? ""\n                    : "\\n加速诊断：" + OfficialSoundGenEngine.accelerationReport()));'''
count = ui.count(old_playing)
if count < 1:
    raise SystemExit('Chinese playing status anchor not found')
ui = ui.replace(old_playing, new_playing)

ui = ui.replace('Box 本地音乐 0.4.5', 'Box 本地音乐 0.4.6')
ui = ui.replace('Version: 0.4.5 (code 10)', 'Version: 0.4.6 (code 11)')
main.write_text(ui, encoding='utf-8')

print('Applied 0.4.6 GPU+CPU hybrid fallback experiment')
