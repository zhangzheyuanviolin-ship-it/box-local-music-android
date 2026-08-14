from pathlib import Path

root = Path(__file__).resolve().parents[1]
engine = root / 'app/src/main/java/com/boxlocal/music/OfficialSoundGenEngine.java'
main = root / 'app/src/main/java/com/boxlocal/music/MainActivity.java'

text = engine.read_text(encoding='utf-8')

# 0.4.6 proved CompiledModel(GPU+CPU) initializes for HD cores but gives no measurable speedup.
# 0.4.7 tries the older Interpreter GPU delegate, whose graph delegation can keep unsupported
# operations on CPU while supported partitions run on GPU. Existing CompiledModel and CPU paths
# remain as fallbacks and are not otherwise changed.
text = text.replace(
    'return createGpuExperimental(file, component, quantizedHint);',
    'return createGpuDelegateHybrid(file, component, quantizedHint);',
    1)

old_decoder = '''          try {
            return createGpuExperimental(file, component, quantizedHint);
          } catch (Exception gpuError) {
            LiteRtRunner cpu = create(file, new String[] {"CPU"});
            cpu.gpuFallbackNote =
                "decoder GPU probe failed; CPU fallback; " + compactThrowable(gpuError);
            return cpu;
          }
'''
new_decoder = '''          try {
            return createGpuDelegateHybrid(file, component, quantizedHint);
          } catch (Exception gpuError) {
            LiteRtRunner cpu = create(file, new String[] {"CPU"});
            cpu.gpuFallbackNote =
                "decoder GPU delegate failed; CPU fallback; " + compactThrowable(gpuError);
            appendAccelerationReport("decoder=Interpreter GPU Delegate 与 CompiledModel GPU 路径均失败，CPU 回退");
            return cpu;
          }
'''
if old_decoder not in text:
    raise SystemExit('0.4.6 decoder GPU branch not found')
text = text.replace(old_decoder, new_decoder, 1)

fields_anchor = '''    private final Object model;
    private final List<?> inputs;
    private final List<?> outputs;
    private String gpuFallbackNote;
'''
fields_repl = '''    private final Object model;
    private final List<?> inputs;
    private final List<?> outputs;
    private final org.tensorflow.lite.Interpreter interpreter;
    private final org.tensorflow.lite.gpu.GpuDelegate interpreterGpuDelegate;
    private final ByteBuffer[] interpreterInputs;
    private final ByteBuffer[] interpreterOutputs;
    private String gpuFallbackNote;
'''
if fields_anchor not in text:
    raise SystemExit('0.4.6 LiteRtRunner fields anchor not found')
text = text.replace(fields_anchor, fields_repl, 1)

ctor_anchor = '''    private LiteRtRunner(Object model, List<?> inputs, List<?> outputs) {
      this.model = model;
      this.inputs = inputs;
      this.outputs = outputs;
    }
'''
ctor_repl = '''    private LiteRtRunner(Object model, List<?> inputs, List<?> outputs) {
      this.model = model;
      this.inputs = inputs;
      this.outputs = outputs;
      this.interpreter = null;
      this.interpreterGpuDelegate = null;
      this.interpreterInputs = null;
      this.interpreterOutputs = null;
    }

    private LiteRtRunner(
        org.tensorflow.lite.Interpreter interpreter,
        org.tensorflow.lite.gpu.GpuDelegate gpuDelegate,
        ByteBuffer[] interpreterInputs,
        ByteBuffer[] interpreterOutputs) {
      this.model = null;
      this.inputs = null;
      this.outputs = null;
      this.interpreter = interpreter;
      this.interpreterGpuDelegate = gpuDelegate;
      this.interpreterInputs = interpreterInputs;
      this.interpreterOutputs = interpreterOutputs;
    }
'''
if ctor_anchor not in text:
    raise SystemExit('LiteRtRunner constructor anchor not found')
text = text.replace(ctor_anchor, ctor_repl, 1)

create_anchor = '''    private static LiteRtRunner createGpuExperimental(
        File file, String component, boolean quantizedHint) throws Exception {
'''
if create_anchor not in text:
    raise SystemExit('createGpuExperimental anchor not found')

helper = r'''    private static LiteRtRunner createGpuDelegateHybrid(
        File file, String component, boolean quantizedHint) throws Exception {
      Throwable interpreterError = null;
      try {
        LiteRtRunner runner = createInterpreterGpuDelegate(file, component, quantizedHint);
        runner.gpuFallbackNote = component + " Interpreter GPU Delegate partial delegation";
        appendAccelerationReport(
            component + "=Interpreter GPU Delegate 初始化成功（允许不支持算子留在 CPU）");
        return runner;
      } catch (Throwable error) {
        interpreterError = rootCause(error);
        appendAccelerationReport(
            component + "=Interpreter GPU Delegate 失败：" + compactThrowable(interpreterError)
                + "；继续尝试 CompiledModel GPU+CPU");
        System.gc();
      }

      try {
        LiteRtRunner runner = createGpuExperimental(file, component, quantizedHint);
        if (interpreterError != null) {
          runner.gpuFallbackNote =
              component + " Interpreter GPU failed; CompiledModel fallback; "
                  + compactThrowable(interpreterError);
        }
        return runner;
      } catch (Exception compiledError) {
        if (interpreterError != null) compiledError.addSuppressed(interpreterError);
        throw compiledError;
      }
    }

    private static LiteRtRunner createInterpreterGpuDelegate(
        File file, String component, boolean quantizedHint) throws Exception {
      org.tensorflow.lite.gpu.GpuDelegate gpuDelegate = null;
      org.tensorflow.lite.Interpreter interpreter = null;
      try {
        org.tensorflow.lite.gpu.CompatibilityList compatibility =
            new org.tensorflow.lite.gpu.CompatibilityList();
        org.tensorflow.lite.gpu.GpuDelegate.Options delegateOptions;
        try {
          if (!compatibility.isDelegateSupportedOnThisDevice()) {
            throw new IllegalStateException("CompatibilityList reports GPU delegate unsupported on this device");
          }
          delegateOptions = compatibility.getBestOptionsForThisDevice();
        } finally {
          compatibility.close();
        }
        delegateOptions.setQuantizedModelsAllowed(true);
        delegateOptions.setPrecisionLossAllowed(true);
        delegateOptions.setInferencePreference(
            org.tensorflow.lite.gpu.GpuDelegateFactory.Options.INFERENCE_PREFERENCE_SUSTAINED_SPEED);

        gpuDelegate = new org.tensorflow.lite.gpu.GpuDelegate(delegateOptions);
        org.tensorflow.lite.Interpreter.Options options = new org.tensorflow.lite.Interpreter.Options();
        options.addDelegate(gpuDelegate);
        // Unsupported partitions remain on optimized CPU kernels.
        options.setNumThreads(Math.max(2, Math.min(6, Runtime.getRuntime().availableProcessors())));
        options.setUseXNNPACK(true);

        interpreter = new org.tensorflow.lite.Interpreter(file, options);
        interpreter.allocateTensors();

        int inputCount = interpreter.getInputTensorCount();
        int outputCount = interpreter.getOutputTensorCount();
        ByteBuffer[] inputBuffers = new ByteBuffer[inputCount];
        ByteBuffer[] outputBuffers = new ByteBuffer[outputCount];
        for (int i = 0; i < inputCount; i++) {
          int bytes = interpreter.getInputTensor(i).numBytes();
          inputBuffers[i] = ByteBuffer.allocateDirect(bytes).order(ByteOrder.nativeOrder());
        }
        for (int i = 0; i < outputCount; i++) {
          int bytes = interpreter.getOutputTensor(i).numBytes();
          outputBuffers[i] = ByteBuffer.allocateDirect(bytes).order(ByteOrder.nativeOrder());
        }
        return new LiteRtRunner(interpreter, gpuDelegate, inputBuffers, outputBuffers);
      } catch (Throwable error) {
        if (interpreter != null) {
          try { interpreter.close(); } catch (Throwable ignored) {}
        }
        if (gpuDelegate != null) {
          try { gpuDelegate.close(); } catch (Throwable ignored) {}
        }
        if (error instanceof Exception) throw (Exception) error;
        throw new Exception(
            "Interpreter GPU Delegate initialization failed for component=" + component
                + ", model=" + file.getName(), error);
      }
    }

'''
text = text.replace(create_anchor, helper + create_anchor, 1)

old_req_inputs = '''    void requireInputs(int count, String name) {
      if (inputs.size() < count) {
        throw new IllegalStateException(
            name + " exposes " + inputs.size() + " inputs; Box v3.3.3 expects at least " + count);
      }
    }
'''
new_req_inputs = '''    void requireInputs(int count, String name) {
      int actual = interpreter != null ? interpreterInputs.length : inputs.size();
      if (actual < count) {
        throw new IllegalStateException(
            name + " exposes " + actual + " inputs; Box v3.3.3 expects at least " + count);
      }
    }
'''
if old_req_inputs not in text:
    raise SystemExit('requireInputs anchor not found')
text = text.replace(old_req_inputs, new_req_inputs, 1)

old_req_outputs = '''    void requireOutputs(int count, String name) {
      if (outputs.size() < count) {
        throw new IllegalStateException(
            name + " exposes " + outputs.size() + " outputs; Box v3.3.3 expects at least " + count);
      }
    }
'''
new_req_outputs = '''    void requireOutputs(int count, String name) {
      int actual = interpreter != null ? interpreterOutputs.length : outputs.size();
      if (actual < count) {
        throw new IllegalStateException(
            name + " exposes " + actual + " outputs; Box v3.3.3 expects at least " + count);
      }
    }
'''
if old_req_outputs not in text:
    raise SystemExit('requireOutputs anchor not found')
text = text.replace(old_req_outputs, new_req_outputs, 1)

old_write_long = '''    void writeLong(int index, long[] values) throws Exception {
      invokeTensor(inputs.get(index), "writeLong", long[].class, values);
    }
'''
new_write_long = '''    void writeLong(int index, long[] values) throws Exception {
      if (interpreter != null) {
        ByteBuffer buffer = interpreterInputs[index];
        if (buffer.capacity() != values.length * Long.BYTES) {
          throw new IllegalArgumentException(
              "Interpreter input " + index + " byte size=" + buffer.capacity()
                  + ", long values bytes=" + (values.length * Long.BYTES));
        }
        buffer.clear();
        buffer.asLongBuffer().put(values);
        buffer.position(0);
        return;
      }
      invokeTensor(inputs.get(index), "writeLong", long[].class, values);
    }
'''
if old_write_long not in text:
    raise SystemExit('writeLong anchor not found')
text = text.replace(old_write_long, new_write_long, 1)

old_write_float = '''    void writeFloat(int index, float[] values) throws Exception {
      invokeTensor(inputs.get(index), "writeFloat", float[].class, values);
    }
'''
new_write_float = '''    void writeFloat(int index, float[] values) throws Exception {
      if (interpreter != null) {
        ByteBuffer buffer = interpreterInputs[index];
        if (buffer.capacity() != values.length * Float.BYTES) {
          throw new IllegalArgumentException(
              "Interpreter input " + index + " byte size=" + buffer.capacity()
                  + ", float values bytes=" + (values.length * Float.BYTES));
        }
        buffer.clear();
        buffer.asFloatBuffer().put(values);
        buffer.position(0);
        return;
      }
      invokeTensor(inputs.get(index), "writeFloat", float[].class, values);
    }
'''
if old_write_float not in text:
    raise SystemExit('writeFloat anchor not found')
text = text.replace(old_write_float, new_write_float, 1)

old_read_float = '''    float[] readFloat(int index) throws Exception {
      return (float[]) outputs.get(index).getClass().getMethod("readFloat").invoke(outputs.get(index));
    }
'''
new_read_float = '''    float[] readFloat(int index) throws Exception {
      if (interpreter != null) {
        ByteBuffer buffer = interpreterOutputs[index].duplicate().order(ByteOrder.nativeOrder());
        buffer.position(0);
        float[] result = new float[buffer.capacity() / Float.BYTES];
        buffer.asFloatBuffer().get(result);
        return result;
      }
      return (float[]) outputs.get(index).getClass().getMethod("readFloat").invoke(outputs.get(index));
    }
'''
if old_read_float not in text:
    raise SystemExit('readFloat anchor not found')
text = text.replace(old_read_float, new_read_float, 1)

run_anchor = '''    void run() throws Exception {
      for (Method method : model.getClass().getMethods()) {
'''
run_repl = '''    void run() throws Exception {
      if (interpreter != null) {
        Object[] inputObjects = new Object[interpreterInputs.length];
        for (int i = 0; i < interpreterInputs.length; i++) {
          interpreterInputs[i].position(0);
          inputObjects[i] = interpreterInputs[i];
        }
        java.util.Map<Integer, Object> outputMap = new java.util.HashMap<>();
        for (int i = 0; i < interpreterOutputs.length; i++) {
          interpreterOutputs[i].clear();
          outputMap.put(i, interpreterOutputs[i]);
        }
        interpreter.runForMultipleInputsOutputs(inputObjects, outputMap);
        for (ByteBuffer output : interpreterOutputs) output.position(0);
        return;
      }
      for (Method method : model.getClass().getMethods()) {
'''
if run_anchor not in text:
    raise SystemExit('run method anchor not found')
text = text.replace(run_anchor, run_repl, 1)

close_anchor = '''    @Override
    public void close() {
      closeAll(inputs);
      closeAll(outputs);
      try {
        model.getClass().getMethod("close").invoke(model);
      } catch (Throwable ignored) {
      }
    }
'''
close_repl = '''    @Override
    public void close() {
      if (interpreter != null) {
        try { interpreter.close(); } catch (Throwable ignored) {}
        if (interpreterGpuDelegate != null) {
          try { interpreterGpuDelegate.close(); } catch (Throwable ignored) {}
        }
        return;
      }
      closeAll(inputs);
      closeAll(outputs);
      try {
        model.getClass().getMethod("close").invoke(model);
      } catch (Throwable ignored) {
      }
    }
'''
if close_anchor not in text:
    raise SystemExit('close method anchor not found')
text = text.replace(close_anchor, close_repl, 1)

engine.write_text(text, encoding='utf-8')

ui = main.read_text(encoding='utf-8')
ui = ui.replace('GPU（实验：GPU+CPU 混合）', 'GPU（实验：Interpreter Delegate）')
ui = ui.replace(
    'GPU 实验模式：Text=CPU，Core/Decoder=GPU+CPU 混合编译，失败自动回退 CPU',
    'GPU 实验模式：Text=CPU，Core/Decoder 优先使用 Interpreter GPU Delegate 部分委派，失败再回退 CompiledModel/CPU')
ui = ui.replace('Box 本地音乐 0.4.6', 'Box 本地音乐 0.4.7')
ui = ui.replace('Version: 0.4.6 (code 11)', 'Version: 0.4.7 (code 12)')
main.write_text(ui, encoding='utf-8')

print('Applied 0.4.7 Interpreter GPU Delegate partial-delegation experiment')
