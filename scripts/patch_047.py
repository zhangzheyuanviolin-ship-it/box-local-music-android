from pathlib import Path

root = Path(__file__).resolve().parents[1]
engine = root / 'app/src/main/java/com/boxlocal/music/OfficialSoundGenEngine.java'
main = root / 'app/src/main/java/com/boxlocal/music/MainActivity.java'

text = engine.read_text(encoding='utf-8')

old_profiles = '''      String[][] profiles =
          new String[][] {
            {"AUTOMATIC", "DEFAULT"},
            {"OPENCL", "FP16"},
            {"OPENCL", "FP32"},
            {"OPENGL", "FP16"},
            {"OPENGL", "FP32"}
          };
'''
new_profiles = '''      // 0.4.6 always accepted AUTOMATIC/DEFAULT first, yet device timing was
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
if old_profiles not in text:
    raise SystemExit('0.4.6 GPU profile array not found')
text = text.replace(old_profiles, new_profiles, 1)

old_classes = '''      Class<?> gpuOptionsClass =
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
new_classes = '''      Class<?> gpuOptionsClass =
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
if old_classes not in text:
    raise SystemExit('0.4.6 GpuOptions constructor block not found')
text = text.replace(old_classes, new_classes, 1)

text = text.replace(
    'GPU 实验模式：Text 固定 CPU，Core/Decoder 尝试 GPU+CPU 混合编译',
    'GPU 最终实验：Text 固定 CPU；Core/Decoder 优先 OpenCL/FP16 强化 GPU+CPU 混合编译')
text = text.replace(
    'GPU+CPU 五种 profile 均失败，已安全回退 CPU',
    '强化 GPU+CPU 五种 profile 均失败，已安全回退 CPU')

engine.write_text(text, encoding='utf-8')

ui = main.read_text(encoding='utf-8')
ui = ui.replace('GPU（实验：GPU+CPU 混合）', 'GPU（最终实验：强化 OpenCL）')
ui = ui.replace(
    'GPU 实验模式：Text=CPU，Core/Decoder=GPU+CPU 混合编译，失败自动回退 CPU',
    'GPU 最终实验：Text=CPU，Core/Decoder 优先 OpenCL/FP16 强化 GPU+CPU 混合编译，失败自动回退 CPU')
ui = ui.replace('Box 本地音乐 0.4.6', 'Box 本地音乐 0.4.7')
ui = ui.replace('Version: 0.4.6 (code 11)', 'Version: 0.4.7 (code 12)')
main.write_text(ui, encoding='utf-8')

print('Applied 0.4.7 aggressive OpenCL GPU+CPU hybrid profile experiment')
