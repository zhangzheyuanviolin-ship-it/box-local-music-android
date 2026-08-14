from pathlib import Path

root = Path(__file__).resolve().parents[1]
engine = root / 'app/src/main/java/com/boxlocal/music/OfficialSoundGenEngine.java'
main = root / 'app/src/main/java/com/boxlocal/music/MainActivity.java'

text = engine.read_text(encoding='utf-8')

old_call = 'return createGpuExperimental(file, component, quantizedHint);'
if text.count(old_call) < 2:
    raise SystemExit('Expected at least two GPU experimental calls after 0.4.6')
text = text.replace(old_call, 'return createGpuDelegateHybrid(file, component, quantizedHint);', 2)

old_class = '  private static final class LiteRtRunner implements AutoCloseable {'
new_class = '  private static class LiteRtRunner implements AutoCloseable {'
if old_class not in text:
    raise SystemExit('LiteRtRunner class declaration not found')
text = text.replace(old_class, new_class, 1)

old_ctor = '    private LiteRtRunner(Object model, List<?> inputs, List<?> outputs) {'
new_ctor = '    protected LiteRtRunner(Object model, List<?> inputs, List<?> outputs) {'
if old_ctor not in text:
    raise SystemExit('LiteRtRunner constructor not found')
text = text.replace(old_ctor, new_ctor, 1)

create_anchor = '''    private static LiteRtRunner createGpuExperimental(
        File file, String component, boolean quantizedHint) throws Exception {
'''
if create_anchor not in text:
    raise SystemExit('createGpuExperimental method anchor not found')

helpers = r'''    private static LiteRtRunner createGpuDelegateHybrid(
        File file, String component, boolean quantizedHint) throws Exception {
      Throwable delegateError = null;
      try {
        LiteRtRunner runner = createInterpreterGpuDelegate(file, component);
        runner.gpuFallbackNote = component + " Interpreter GPU Delegate partial delegation";
        appendAccelerationReport(
            component + "=Interpreter GPU Delegate 初始化成功；不支持算子允许留在 CPU");
        return runner;
      } catch (Throwable error) {
        delegateError = rootCause(error);
        appendAccelerationReport(
            component + "=Interpreter GPU Delegate 失败：" + compactThrowable(delegateError)
                + "；继续 CompiledModel GPU+CPU");
        System.gc();
      }

      LiteRtRunner fallback = createGpuExperimental(file, component, quantizedHint);
      if (delegateError != null && fallback.gpuFallbackNote == null) {
        fallback.gpuFallbackNote =
            component + " Interpreter GPU Delegate failed; " + compactThrowable(delegateError);
      }
      return fallback;
    }

    private static LiteRtRunner createInterpreterGpuDelegate(File file, String component)
        throws Exception {
      org.tensorflow.lite.gpu.GpuDelegate delegate = null;
      org.tensorflow.lite.Interpreter interpreter = null;
      try {
        org.tensorflow.lite.gpu.GpuDelegate.Options delegateOptions;
        try (org.tensorflow.lite.gpu.CompatibilityList compatibility =
            new org.tensorflow.lite.gpu.CompatibilityList()) {
          if (!compatibility.isDelegateSupportedOnThisDevice()) {
            throw new IllegalStateException(
                "CompatibilityList reports GPU delegate unsupported on this device");
          }
          delegateOptions = compatibility.getBestOptionsForThisDevice();
        }
        delegateOptions.setQuantizedModelsAllowed(true);
        delegateOptions.setPrecisionLossAllowed(true);
        delegateOptions.setInferencePreference(
            org.tensorflow.lite.gpu.GpuDelegateFactory.Options.INFERENCE_PREFERENCE_SUSTAINED_SPEED);

        delegate = new org.tensorflow.lite.gpu.GpuDelegate(delegateOptions);
        org.tensorflow.lite.Interpreter.Options interpreterOptions =
            new org.tensorflow.lite.Interpreter.Options();
        interpreterOptions.addDelegate(delegate);
        interpreterOptions.setUseXNNPACK(true);
        interpreterOptions.setNumThreads(
            Math.max(2, Math.min(6, Runtime.getRuntime().availableProcessors())));

        interpreter = new org.tensorflow.lite.Interpreter(file, interpreterOptions);
        interpreter.allocateTensors();
        return new InterpreterGpuRunner(interpreter, delegate);
      } catch (Throwable error) {
        if (interpreter != null) {
          try { interpreter.close(); } catch (Throwable ignored) {}
        }
        if (delegate != null) {
          try { delegate.close(); } catch (Throwable ignored) {}
        }
        if (error instanceof Exception) throw (Exception) error;
        throw new Exception(
            "Interpreter GPU Delegate initialization failed for component=" + component
                + ", model=" + file.getName(), error);
      }
    }

'''
text = text.replace(create_anchor, helpers + create_anchor, 1)

sentence_anchor = '  private static final class SentencePiece {'
if sentence_anchor not in text:
    raise SystemExit('SentencePiece anchor not found')

subclass = r'''  private static final class InterpreterGpuRunner extends LiteRtRunner {
    private final org.tensorflow.lite.Interpreter interpreter;
    private final org.tensorflow.lite.gpu.GpuDelegate delegate;
    private final ByteBuffer[] inputBuffers;
    private final ByteBuffer[] outputBuffers;

    InterpreterGpuRunner(
        org.tensorflow.lite.Interpreter interpreter,
        org.tensorflow.lite.gpu.GpuDelegate delegate) {
      super(null, java.util.Collections.emptyList(), java.util.Collections.emptyList());
      this.interpreter = interpreter;
      this.delegate = delegate;
      this.inputBuffers = new ByteBuffer[interpreter.getInputTensorCount()];
      this.outputBuffers = new ByteBuffer[interpreter.getOutputTensorCount()];
      for (int i = 0; i < inputBuffers.length; i++) {
        inputBuffers[i] =
            ByteBuffer.allocateDirect(interpreter.getInputTensor(i).numBytes())
                .order(ByteOrder.nativeOrder());
      }
      for (int i = 0; i < outputBuffers.length; i++) {
        outputBuffers[i] =
            ByteBuffer.allocateDirect(interpreter.getOutputTensor(i).numBytes())
                .order(ByteOrder.nativeOrder());
      }
    }

    @Override
    void requireInputs(int count, String name) {
      if (inputBuffers.length < count) {
        throw new IllegalStateException(
            name + " exposes " + inputBuffers.length
                + " inputs; Box v3.3.3 expects at least " + count);
      }
    }

    @Override
    void requireOutputs(int count, String name) {
      if (outputBuffers.length < count) {
        throw new IllegalStateException(
            name + " exposes " + outputBuffers.length
                + " outputs; Box v3.3.3 expects at least " + count);
      }
    }

    @Override
    void writeLong(int index, long[] values) {
      ByteBuffer buffer = inputBuffers[index];
      int expected = values.length * Long.BYTES;
      if (buffer.capacity() != expected) {
        throw new IllegalArgumentException(
            "Interpreter input " + index + " bytes=" + buffer.capacity()
                + ", long bytes=" + expected);
      }
      buffer.clear();
      buffer.asLongBuffer().put(values);
      buffer.position(0);
    }

    @Override
    void writeFloat(int index, float[] values) {
      ByteBuffer buffer = inputBuffers[index];
      int expected = values.length * Float.BYTES;
      if (buffer.capacity() != expected) {
        throw new IllegalArgumentException(
            "Interpreter input " + index + " bytes=" + buffer.capacity()
                + ", float bytes=" + expected);
      }
      buffer.clear();
      buffer.asFloatBuffer().put(values);
      buffer.position(0);
    }

    @Override
    float[] readFloat(int index) {
      ByteBuffer buffer = outputBuffers[index].duplicate().order(ByteOrder.nativeOrder());
      buffer.position(0);
      float[] result = new float[buffer.capacity() / Float.BYTES];
      buffer.asFloatBuffer().get(result);
      return result;
    }

    @Override
    void run() {
      Object[] inputs = new Object[inputBuffers.length];
      for (int i = 0; i < inputBuffers.length; i++) {
        inputBuffers[i].position(0);
        inputs[i] = inputBuffers[i];
      }
      java.util.Map<Integer, Object> outputs = new java.util.HashMap<>();
      for (int i = 0; i < outputBuffers.length; i++) {
        outputBuffers[i].clear();
        outputs.put(i, outputBuffers[i]);
      }
      interpreter.runForMultipleInputsOutputs(inputs, outputs);
      for (ByteBuffer output : outputBuffers) output.position(0);
    }

    @Override
    public void close() {
      try { interpreter.close(); } catch (Throwable ignored) {}
      try { delegate.close(); } catch (Throwable ignored) {}
    }
  }

'''
text = text.replace(sentence_anchor, subclass + sentence_anchor, 1)

text = text.replace(
    'GPU 实验模式：Text 固定 CPU，Core/Decoder 尝试 GPU+CPU 混合编译',
    'GPU 实验模式：Text 固定 CPU；Core/Decoder 优先 Interpreter GPU Delegate 部分委派')

engine.write_text(text, encoding='utf-8')

ui = main.read_text(encoding='utf-8')
ui = ui.replace('GPU（实验：GPU+CPU 混合）', 'GPU（实验：Interpreter Delegate）')
ui = ui.replace(
    'GPU 实验模式：Text=CPU，Core/Decoder=GPU+CPU 混合编译，失败自动回退 CPU',
    'GPU 实验模式：Text=CPU，Core/Decoder 优先 Interpreter GPU Delegate 部分委派，失败回退 CompiledModel/CPU')
ui = ui.replace('Box 本地音乐 0.4.6', 'Box 本地音乐 0.4.7')
ui = ui.replace('Version: 0.4.6 (code 11)', 'Version: 0.4.7 (code 12)')
main.write_text(ui, encoding='utf-8')

print('Applied 0.4.7 Interpreter GPU Delegate partial delegation experiment')
