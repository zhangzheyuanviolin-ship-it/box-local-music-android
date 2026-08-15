from pathlib import Path

root = Path(__file__).resolve().parents[1]
engine = root / 'app/src/main/java/com/boxlocal/music/OfficialSoundGenEngine.java'
main = root / 'app/src/main/java/com/boxlocal/music/MainActivity.java'

text = engine.read_text(encoding='utf-8')

# Final stability policy: preserve all 0.4.8 UI/timing/playback behavior, but roll the
# accelerator implementation itself back to the already device-validated 0.4.6 policy.
# In particular, remove the aggressive OpenCL/FP16-first ordering and the extra GPU options
# introduced in 0.4.7.
current_profiles = '''      // 0.4.6 always accepted AUTOMATIC/DEFAULT first, yet device timing was
      // indistinguishable from CPU. In this final GPU experiment, explicitly try
      // OpenCL/FP16 first so AUTOMATIC cannot silently win before a stronger GPU profile.
      String[][] profiles =
          new String[][] {
            {"OPENCL", "FP16"},
            {"OPENCL", "FP32"},
            {"AUTOMATIC", "FP16"},
            {"AUTOMATIC", "DEFAULT"},
            {"OPENGL", "FP16"}
          };
'''
stable_profiles = '''      String[][] profiles =
          new String[][] {
            {"AUTOMATIC", "DEFAULT"},
            {"OPENCL", "FP16"},
            {"OPENCL", "FP32"},
            {"OPENGL", "FP16"},
            {"OPENGL", "FP32"}
          };
'''
if current_profiles not in text:
    raise SystemExit('0.4.7 aggressive GPU profile block not found')
text = text.replace(current_profiles, stable_profiles, 1)

current_options = '''      Class<?> gpuOptionsClass =
          Class.forName("com.google.ai.edge.litert.CompiledModel$GpuOptions");
      Class<?> backendClass =
          Class.forName("com.google.ai.edge.litert.CompiledModel$GpuOptions$Backend");
      Class<?> precisionClass =
          Class.forName("com.google.ai.edge.litert.CompiledModel$GpuOptions$Precision");
      Class<?> storageClass =
          Class.forName("com.google.ai.edge.litert.CompiledModel$GpuOptions$BufferStorageType");
      Class<?> priorityClass =
          Class.forName("com.google.ai.edge.litert.CompiledModel$GpuOptions$Priority");
      Object backend = Enum.valueOf((Class<? extends Enum>) backendClass, backendName);
      Object precision = Enum.valueOf((Class<? extends Enum>) precisionClass, precisionName);
      Object storage =
          Enum.valueOf(
              (Class<? extends Enum>) storageClass,
              "OPENGL".equals(backendName) ? "TEXTURE_2D" : "BUFFER");
      Object priority = Enum.valueOf((Class<? extends Enum>) priorityClass, "HIGH");

      Object gpuOptions = null;
      for (Constructor<?> ctor : gpuOptionsClass.getConstructors()) {
        if (ctor.getParameterCount() != 15) continue;
        Object[] args = new Object[15];
        // Exact 2.1.6 GpuOptions constructor order from Google's current API docs:
        // constantTensorSharing, infiniteFloatCapping, allowSrcQuantizedFcConvOps,
        // precision, bufferStorageType, preferTextureWeights, ... backend, priority, ...
        args[0] = Boolean.TRUE; // reuse constant GPU tensors across repeated diffusion steps
        args[2] = quantizedHint ? Boolean.TRUE : null; // important for the INT8 HD/Long cores
        args[3] = precision;
        args[4] = storage;
        args[5] = Boolean.TRUE; // prefer texture-backed weights where the backend supports it
        args[12] = backend;
        args[13] = priority;
        gpuOptions = ctor.newInstance(args);
        break;
      }
'''
stable_options = '''      Class<?> gpuOptionsClass =
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
'''
if current_options not in text:
    raise SystemExit('0.4.7 aggressive GpuOptions block not found')
text = text.replace(current_options, stable_options, 1)

text = text.replace(
    'GPU 最终实验：Text 固定 CPU；Core/Decoder 优先 OpenCL/FP16 强化 GPU+CPU 混合编译',
    'GPU 模式：Text 固定 CPU；Core/Decoder 使用稳定 GPU+CPU 混合策略')
text = text.replace(
    '强化 GPU+CPU 五种 profile 均失败，已安全回退 CPU',
    'GPU+CPU 五种 profile 均失败，已安全回退 CPU')

# Long mode previously survived full 180-second generation when decoder ended up on CPU.
# Make that outcome deterministic: GPU mode may use the stable 0.4.6 mixed policy for Core,
# but Long Decoder is always CPU. This protects the proven 0.4.3 serialized lifecycle at 85%.
long_decoder_call = 'LiteRtRunner.open(new File(dir, "sghd_decode.litert"), acceleratorMode, false, "decoder", true)'
if text.count(long_decoder_call) != 2:
    raise SystemExit('Expected exactly two HD/Long decoder open calls')
first = text.find(long_decoder_call)
second = text.find(long_decoder_call, first + len(long_decoder_call))
replacement_call = ('LiteRtRunner.open(new File(dir, "sghd_decode.litert"), '
                    'acceleratorMode == AcceleratorMode.GPU ? AcceleratorMode.CPU : acceleratorMode, '
                    'false, "decoder", true)')
text = text[:second] + text[second:].replace(long_decoder_call, replacement_call, 1)

stage_old = '''      stage = acceleratorMode == AcceleratorMode.GPU ? "decoder GPU probe with CPU fallback" : "decoder model load " + acceleratorMode.name();
      writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, acceleratorMode, null);
'''
stage_new = '''      stage = acceleratorMode == AcceleratorMode.GPU ? "decoder model load CPU (stable Long GPU policy)" : "decoder model load " + acceleratorMode.name();
      if (acceleratorMode == AcceleratorMode.GPU) {
        appendAccelerationReport("decoder=CPU（Long 稳定策略）");
      }
      writeLongDiagnostic(context, "RUNNING", stage, blocks, duration, acceleratorMode, null);
'''
if stage_old not in text:
    raise SystemExit('Long decoder stage anchor not found')
text = text.replace(stage_old, stage_new, 1)

infer_old = '''        stage = acceleratorMode == AcceleratorMode.GPU ? "decoder inference GPU or CPU fallback" : "decoder inference " + acceleratorMode.name();
'''
infer_new = '''        stage = acceleratorMode == AcceleratorMode.GPU ? "decoder inference CPU (stable Long GPU policy)" : "decoder inference " + acceleratorMode.name();
'''
if infer_old not in text:
    raise SystemExit('Long decoder inference stage anchor not found')
text = text.replace(infer_old, infer_new, 1)

engine.write_text(text, encoding='utf-8')

ui = main.read_text(encoding='utf-8')
# 0.4.8 already leaves the radio label as plain "GPU" and has generation timing.
# Only bump final version strings; do not change the UI or timing state machine.
ui = ui.replace('Box 本地音乐 0.4.8', 'Box 本地音乐 0.4.9')
ui = ui.replace('Version: 0.4.8 (code 13)', 'Version: 0.4.9 (code 14)')
main.write_text(ui, encoding='utf-8')

print('Applied 0.4.9 final stable GPU rollback and Long decoder CPU policy')
