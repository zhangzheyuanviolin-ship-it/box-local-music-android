from pathlib import Path

root = Path(__file__).resolve().parents[1]
engine = root / 'app/src/main/java/com/boxlocal/music/OfficialSoundGenEngine.java'
main = root / 'app/src/main/java/com/boxlocal/music/MainActivity.java'
model_spec = root / 'app/src/main/java/com/boxlocal/music/ModelSpec.java'
strings = root / 'app/src/main/res/values/strings.xml'

text = engine.read_text(encoding='utf-8')

# 0.4.5 GPU mode is hybrid: known-failing text encoders stay on CPU,
# core is the mandatory GPU experiment, decoder tries GPU and falls back to CPU.
replacements = {
    'LiteRtRunner.open(new File(dir, "sg_text.litert"), acceleratorMode, true)':
        'LiteRtRunner.open(new File(dir, "sg_text.litert"), acceleratorMode, true, "text", false)',
    'LiteRtRunner.open(new File(dir, "sg_core.litert"), acceleratorMode, true)':
        'LiteRtRunner.open(new File(dir, "sg_core.litert"), acceleratorMode, true, "core", false)',
    'LiteRtRunner.open(new File(dir, "sg_decode.litert"), acceleratorMode, true)':
        'LiteRtRunner.open(new File(dir, "sg_decode.litert"), acceleratorMode, true, "decoder", false)',
    'LiteRtRunner.open(new File(dir, "sghd_text.litert"), acceleratorMode, false)':
        'LiteRtRunner.open(new File(dir, "sghd_text.litert"), acceleratorMode, false, "text", true)',
    'LiteRtRunner.open(new File(dir, "sghd_core.litert"), acceleratorMode, false)':
        'LiteRtRunner.open(new File(dir, "sghd_core.litert"), acceleratorMode, false, "core", true)',
    'LiteRtRunner.open(new File(dir, "sghd_decode.litert"), acceleratorMode, false)':
        'LiteRtRunner.open(new File(dir, "sghd_decode.litert"), acceleratorMode, false, "decoder", true)',
}
for old, new in replacements.items():
    if old not in text:
        raise SystemExit('Missing accelerator call anchor: ' + old)
    text = text.replace(old, new)

old_open = '''    static LiteRtRunner open(
        File file, AcceleratorMode acceleratorMode, boolean autoGpuPreferred) throws Exception {
      if (!file.isFile()) {
        throw new IllegalStateException("Missing model file: " + file.getAbsolutePath());
      }
      AcceleratorMode mode =
          acceleratorMode == null ? AcceleratorMode.AUTO : acceleratorMode;
      if (mode == AcceleratorMode.CPU) {
        return create(file, new String[] {"CPU"});
      }
      if (mode == AcceleratorMode.GPU) {
        return create(file, new String[] {"GPU"});
      }
      if (autoGpuPreferred) {
        try {
          return create(file, new String[] {"GPU", "CPU"});
        } catch (Throwable gpuError) {
          try {
            return create(file, new String[] {"CPU"});
          } catch (Exception cpuError) {
            cpuError.addSuppressed(gpuError);
            throw cpuError;
          }
        }
      }
      return create(file, new String[] {"CPU"});
    }
'''
new_open = '''    static LiteRtRunner open(
        File file,
        AcceleratorMode acceleratorMode,
        boolean autoGpuPreferred,
        String component,
        boolean quantizedHint)
        throws Exception {
      if (!file.isFile()) {
        throw new IllegalStateException("Missing model file: " + file.getAbsolutePath());
      }
      AcceleratorMode mode =
          acceleratorMode == null ? AcceleratorMode.AUTO : acceleratorMode;
      if (mode == AcceleratorMode.CPU) {
        return create(file, new String[] {"CPU"});
      }
      if (mode == AcceleratorMode.GPU) {
        if ("text".equals(component)) {
          return create(file, new String[] {"CPU"});
        }
        if ("core".equals(component)) {
          return createGpuExperimental(file, component, quantizedHint);
        }
        if ("decoder".equals(component)) {
          try {
            return createGpuExperimental(file, component, quantizedHint);
          } catch (Exception gpuError) {
            LiteRtRunner cpu = create(file, new String[] {"CPU"});
            cpu.gpuFallbackNote =
                "decoder GPU probe failed; CPU fallback; " + compactThrowable(gpuError);
            return cpu;
          }
        }
        return createGpuExperimental(file, component, quantizedHint);
      }
      if (autoGpuPreferred) {
        try {
          return create(file, new String[] {"GPU", "CPU"});
        } catch (Throwable gpuError) {
          try {
            return create(file, new String[] {"CPU"});
          } catch (Exception cpuError) {
            cpuError.addSuppressed(gpuError);
            throw cpuError;
          }
        }
      }
      return create(file, new String[] {"CPU"});
    }
'''
if old_open not in text:
    raise SystemExit('0.4.4 LiteRtRunner.open block not found')
text = text.replace(old_open, new_open, 1)

# Track a decoder CPU fallback without changing the already-proven run/buffer code.
old_fields = '''    private final Object model;
    private final List<?> inputs;
    private final List<?> outputs;
'''
new_fields = '''    private final Object model;
    private final List<?> inputs;
    private final List<?> outputs;
    private String gpuFallbackNote;
'''
if old_fields not in text:
    raise SystemExit('LiteRtRunner fields anchor not found')
text = text.replace(old_fields, new_fields, 1)

create_anchor = '''    @SuppressWarnings({"unchecked", "rawtypes"})
    private static LiteRtRunner create(File file, String[] accelerators) throws Exception {
'''
if create_anchor not in text:
    raise SystemExit('LiteRtRunner create anchor not found')

gpu_helpers = r'''    private static LiteRtRunner createGpuExperimental(
        File file, String component, boolean quantizedHint) throws Exception {
      String[][] profiles =
          new String[][] {
            {"AUTOMATIC", "DEFAULT"},
            {"OPENCL", "FP16"},
            {"OPENCL", "FP32"},
            {"OPENGL", "FP16"},
            {"OPENGL", "FP32"}
          };
      StringBuilder failures = new StringBuilder();
      Throwable last = null;
      for (String[] profile : profiles) {
        try {
          LiteRtRunner runner =
              createGpuProfile(file, profile[0], profile[1], quantizedHint);
          runner.gpuFallbackNote =
              component + " GPU profile=" + profile[0] + "/" + profile[1];
          return runner;
        } catch (Throwable error) {
          last = rootCause(error);
          if (failures.length() > 0) failures.append(" | ");
          failures
              .append(profile[0])
              .append('/')
              .append(profile[1])
              .append(": ")
              .append(compactThrowable(last));
          System.gc();
        }
      }
      throw new Exception(
          "GPU compile probe failed for component="
              + component
              + ", model="
              + file.getName()
              + ", LiteRT=2.1.6, attempts="
              + failures,
          last);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static LiteRtRunner createGpuProfile(
        File file, String backendName, String precisionName, boolean quantizedHint)
        throws Exception {
      Class<?> compiled = Class.forName("com.google.ai.edge.litert.CompiledModel");
      Class<?> accelerator = Class.forName("com.google.ai.edge.litert.Accelerator");
      Class<?> options = Class.forName("com.google.ai.edge.litert.CompiledModel$Options");
      Object array = Array.newInstance(accelerator, 1);
      Array.set(array, 0, Enum.valueOf((Class<? extends Enum>) accelerator, "GPU"));
      Constructor<?> optionsCtor = options.getConstructor(array.getClass());
      Object optionValue = optionsCtor.newInstance(array);
      configureGpuOptions(optionValue, options, backendName, precisionName, quantizedHint);

      Object model = null;
      try {
        model = createCompiledModel(compiled, file.getAbsolutePath(), optionValue);
        List<?> inputs = createBuffers(compiled, model, true);
        List<?> outputs = createBuffers(compiled, model, false);
        return new LiteRtRunner(model, inputs, outputs);
      } catch (Throwable error) {
        closeObjectQuietly(model);
        throw error;
      }
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static void configureGpuOptions(
        Object optionValue,
        Class<?> optionsClass,
        String backendName,
        String precisionName,
        boolean quantizedHint)
        throws Exception {
      Class<?> gpuOptionsClass =
          Class.forName("com.google.ai.edge.litert.CompiledModel$GpuOptions");
      Class<?> backendClass =
          Class.forName("com.google.ai.edge.litert.CompiledModel$GpuOptions$Backend");
      Class<?> precisionClass =
          Class.forName("com.google.ai.edge.litert.CompiledModel$GpuOptions$Precision");
      Object backend = Enum.valueOf((Class<? extends Enum>) backendClass, backendName);
      Object precision = Enum.valueOf((Class<? extends Enum>) precisionClass, precisionName);

      Object gpuOptions = null;
      for (Constructor<?> ctor : gpuOptionsClass.getConstructors()) {
        if (ctor.getParameterCount() != 15) continue;
        Object[] args = new Object[15];
        args[2] = quantizedHint ? Boolean.TRUE : null;
        args[3] = precision;
        args[12] = backend;
        gpuOptions = ctor.newInstance(args);
        break;
      }
      if (gpuOptions == null) {
        throw new NoSuchMethodException("LiteRT 2.1.6 GpuOptions 15-arg constructor not found");
      }

      for (Method method : optionsClass.getMethods()) {
        if (method.getName().equals("setGpuOptions")
            && method.getParameterCount() == 1
            && method.getParameterTypes()[0].isInstance(gpuOptions)) {
          method.invoke(optionValue, gpuOptions);
          return;
        }
      }
      try {
        java.lang.reflect.Field field = optionsClass.getDeclaredField("gpuOptions");
        field.setAccessible(true);
        field.set(optionValue, gpuOptions);
        return;
      } catch (NoSuchFieldException ignored) {
      }
      throw new NoSuchMethodException("LiteRT Options.setGpuOptions not found");
    }

    private static Throwable rootCause(Throwable error) {
      Throwable current = error;
      while (current instanceof java.lang.reflect.InvocationTargetException
          && ((java.lang.reflect.InvocationTargetException) current).getTargetException() != null) {
        current = ((java.lang.reflect.InvocationTargetException) current).getTargetException();
      }
      while (current.getCause() != null && current.getCause() != current) {
        current = current.getCause();
      }
      return current;
    }

    private static String compactThrowable(Throwable error) {
      if (error == null) return "unknown";
      String message = error.getMessage();
      return error.getClass().getSimpleName() + (message == null ? "" : ": " + message);
    }

    private static void closeObjectQuietly(Object value) {
      if (value == null) return;
      try {
        Method close = value.getClass().getMethod("close");
        close.invoke(value);
        return;
      } catch (Throwable ignored) {
      }
      try {
        Method destroy = value.getClass().getMethod("destroy");
        destroy.invoke(value);
      } catch (Throwable ignored) {
      }
    }

'''
text = text.replace(create_anchor, gpu_helpers + create_anchor, 1)

# Long diagnostics should describe the hybrid component policy truthfully.
text = text.replace(
    'stage = "text model load " + acceleratorMode.name();',
    'stage = acceleratorMode == AcceleratorMode.GPU ? "text model load CPU (GPU hybrid)" : "text model load " + acceleratorMode.name();')
text = text.replace(
    'stage = "text inference " + acceleratorMode.name();',
    'stage = acceleratorMode == AcceleratorMode.GPU ? "text inference CPU (GPU hybrid)" : "text inference " + acceleratorMode.name();')
text = text.replace(
    'stage = "core model load " + acceleratorMode.name();',
    'stage = acceleratorMode == AcceleratorMode.GPU ? "core GPU compile probe" : "core model load " + acceleratorMode.name();')
text = text.replace(
    ' + " / 8 inference " + acceleratorMode.name();',
    ' + (acceleratorMode == AcceleratorMode.GPU ? " / 8 inference GPU experimental" : " / 8 inference " + acceleratorMode.name());')
text = text.replace(
    'stage = "decoder model load " + acceleratorMode.name();',
    'stage = acceleratorMode == AcceleratorMode.GPU ? "decoder GPU probe with CPU fallback" : "decoder model load " + acceleratorMode.name();')
text = text.replace(
    'stage = "decoder inference " + acceleratorMode.name();',
    'stage = acceleratorMode == AcceleratorMode.GPU ? "decoder inference GPU or CPU fallback" : "decoder inference " + acceleratorMode.name();')

engine.write_text(text, encoding='utf-8')

ui = main.read_text(encoding='utf-8')
if 'import android.view.ViewGroup;\n' in ui and 'import android.view.View;\n' not in ui:
    ui = ui.replace('import android.view.ViewGroup;\n', 'import android.view.View;\nimport android.view.ViewGroup;\n', 1)

old_accel_ui = '''    addText("Acceleration mode");
    RadioGroup acceleratorGroup = new RadioGroup(this);
    acceleratorGroup.setOrientation(LinearLayout.VERTICAL);

    RadioButton autoAccelerator = new RadioButton(this);
    autoAccelerator.setText("Auto (recommended; stable baseline)");
    autoAccelerator.setChecked(true);
    acceleratorGroup.addView(autoAccelerator);

    RadioButton cpuAccelerator = new RadioButton(this);
    cpuAccelerator.setText("CPU");
    acceleratorGroup.addView(cpuAccelerator);

    RadioButton gpuAccelerator = new RadioButton(this);
    gpuAccelerator.setText("GPU (experimental; no automatic CPU fallback)");
    acceleratorGroup.addView(gpuAccelerator);

    root.addView(acceleratorGroup, matchWrap());
'''
new_accel_ui = '''    addText("加速模式");
    RadioGroup acceleratorGroup = new RadioGroup(this);
    acceleratorGroup.setOrientation(LinearLayout.VERTICAL);

    RadioButton autoAccelerator = new RadioButton(this);
    autoAccelerator.setId(View.generateViewId());
    autoAccelerator.setText("自动（推荐）");
    acceleratorGroup.addView(autoAccelerator);

    RadioButton cpuAccelerator = new RadioButton(this);
    cpuAccelerator.setId(View.generateViewId());
    cpuAccelerator.setText("CPU");
    acceleratorGroup.addView(cpuAccelerator);

    RadioButton gpuAccelerator = new RadioButton(this);
    gpuAccelerator.setId(View.generateViewId());
    gpuAccelerator.setText("GPU（实验：优先加速核心计算）");
    acceleratorGroup.addView(gpuAccelerator);

    acceleratorGroup.check(autoAccelerator.getId());
    root.addView(acceleratorGroup, matchWrap());
'''
if old_accel_ui not in ui:
    raise SystemExit('0.4.4 accelerator UI block not found')
ui = ui.replace(old_accel_ui, new_accel_ui, 1)

old_generate_select = '''          OfficialSoundGenEngine.AcceleratorMode acceleratorMode =
              gpuAccelerator.isChecked()
                  ? OfficialSoundGenEngine.AcceleratorMode.GPU
                  : cpuAccelerator.isChecked()
                      ? OfficialSoundGenEngine.AcceleratorMode.CPU
                      : OfficialSoundGenEngine.AcceleratorMode.AUTO;
'''
new_generate_select = '''          int checkedAcceleratorId = acceleratorGroup.getCheckedRadioButtonId();
          OfficialSoundGenEngine.AcceleratorMode acceleratorMode =
              checkedAcceleratorId == gpuAccelerator.getId()
                  ? OfficialSoundGenEngine.AcceleratorMode.GPU
                  : checkedAcceleratorId == cpuAccelerator.getId()
                      ? OfficialSoundGenEngine.AcceleratorMode.CPU
                      : OfficialSoundGenEngine.AcceleratorMode.AUTO;
'''
if old_generate_select not in ui:
    raise SystemExit('0.4.4 accelerator selection block not found')
ui = ui.replace(old_generate_select, new_generate_select, 1)

# User-facing Chinese localization. Technical exception stack traces remain untouched.
translations = {
    'Official Box model downloader and local music generation workflow.': 'Box 官方模型下载与本地音乐生成工具。',
    'Models and URLs are taken from the installed Box 3.3.3 JADX source: SoundGen, SoundGen HD, and SoundGen HD Long.': '模型与下载地址来自 Box 3.3.3：SoundGen、SoundGen HD 和 SoundGen HD Long。',
    'Ready': '就绪',
    'Download size: ': '下载大小：',
    '. Files: ': '。文件数：',
    'Verify downloaded files': '校验已下载模型',
    'Download or resume': '下载或继续下载',
    'Select model and open generation page': '选择模型并进入生成页面',
    'Delete downloaded model': '删除已下载模型',
    'Deleted ': '已删除：',
    'Downloaded files are stored in app-private model storage. Delete from the model list if you need to reclaim space.': '模型文件保存在应用专用目录中。如需释放空间，可返回模型列表删除。',
    'Describe the music': '描述您想生成的音乐',
    'Duration: ': '生成时长：',
    ' seconds': ' 秒',
    'Ready. Model files verified: ': '就绪。模型文件已校验：',
    'Generate with selected model': '生成音乐',
    'Play last generated WAV': '播放',
    'Pause playback': '暂停',
    'Resume playback': '继续播放',
    'Export last generated WAV': '导出音频',
    'Share last generated WAV': '分享音频',
    'Back to model list': '返回模型列表',
    'A download is already running.': '已有下载任务正在运行。',
    'Downloading ': '正在下载 ',
    ' current file ': '，当前文件：',
    'Download complete: ': '下载完成：',
    'Generation is already running.': '音乐正在生成中。',
    'Prompt is empty.': '音乐描述不能为空。',
    'Generated WAV: ': '音频生成完成：',
    'No generated WAV is available yet.': '当前还没有可播放的生成音频。',
    'Playing: ': '正在播放：',
    'Paused: ': '已暂停：',
    'Playback finished: ': '播放结束：',
    'Exported WAV: ': '音频已导出：',
    'Share WAV': '分享音频',
    'Loading official Box SoundGen engine...': '正在加载 Box SoundGen 推理引擎……',
    'Generating ': '正在生成 ',
    'Playback WAV': '播放音频',
    'Toggle playback WAV': '切换播放状态',
    'Export WAV': '导出音频',
    'Share WAV': '分享音频',
    'Download model ': '下载模型 ',
    'Generate model ': '生成模型 ',
}
for old, new in translations.items():
    ui = ui.replace(old, new)

old_accel_text = '''    String acceleratorText =
        acceleratorMode == OfficialSoundGenEngine.AcceleratorMode.GPU
            ? "GPU experimental (forced)"
            : acceleratorMode == OfficialSoundGenEngine.AcceleratorMode.CPU
                ? "CPU forced"
                : model.soundGenBlocks == 0
                    ? "Auto: GPU preferred, CPU fallback"
                    : "Auto: CPU stable baseline";
'''
new_accel_text = '''    String acceleratorText =
        acceleratorMode == OfficialSoundGenEngine.AcceleratorMode.GPU
            ? "GPU 实验混合模式：Text=CPU，Core=GPU 探测，Decoder=GPU 探测/CPU 回退"
            : acceleratorMode == OfficialSoundGenEngine.AcceleratorMode.CPU
                ? "强制 CPU"
                : model.soundGenBlocks == 0
                    ? "自动：SoundGen 优先 GPU/CPU 回退"
                    : "自动：CPU";
'''
if old_accel_text not in ui:
    raise SystemExit('0.4.4 accelerator status text not found')
ui = ui.replace(old_accel_text, new_accel_text, 1)
ui = ui.replace('Loading SoundGen HD Long. Accelerator: ', '正在加载 SoundGen HD Long。加速模式：')
ui = ui.replace('. Blocks: 2048. Requested duration: ', '。Blocks：2048。请求时长：')
ui = ui.replace('s. Heap MB free=', ' 秒。Java 堆 MB free=')
ui = ui.replace('Loading " + model.name + ". Accelerator: " + acceleratorText + "..."',
                '正在加载 " + model.name + "。加速模式：" + acceleratorText + "……"')

ui = ui.replace('Box Local Music 0.4.4', 'Box 本地音乐 0.4.5')
ui = ui.replace('Version: 0.4.4 (code 9)', 'Version: 0.4.5 (code 10)')
main.write_text(ui, encoding='utf-8')

spec = model_spec.read_text(encoding='utf-8')
spec = spec.replace(
    'Official Box SoundGen model. On-device text-to-audio, fully offline after download. Downloads about 1.1GB on first use.',
    'Box 官方 SoundGen 本地音乐生成模型。模型下载完成后可完全离线使用，首次下载约 1.1GB。')
spec = spec.replace(
    'Official Box SoundGen HD model. Higher quality on-device text-to-audio, up to about 24 seconds. Downloads about 2.1GB on first use.',
    'Box 官方 SoundGen HD 高质量本地音乐生成模型，最长约 24 秒，首次下载约 2.1GB。')
spec = spec.replace(
    'Official Box SoundGen HD Long model. Same HD text and tokenizer, long-form core and decoder, up to about 3 minutes.',
    'Box 官方 SoundGen HD Long 长音频高质量音乐生成模型，最长约 3 分钟。')
spec = spec.replace(' ? "ready" : ', ' ? "已就绪" : ')
model_spec.write_text(spec, encoding='utf-8')

s = strings.read_text(encoding='utf-8')
s = s.replace('<string name="app_name">Box Local Music</string>', '<string name="app_name">Box 本地音乐</string>')
strings.write_text(s, encoding='utf-8')

print('Applied 0.4.5 Chinese UI, exclusive accelerator selector, LiteRT GPU hybrid probe patch')
