from pathlib import Path

root = Path(__file__).resolve().parents[1]
engine = root / 'app/src/main/java/com/boxlocal/music/OfficialSoundGenEngine.java'
main = root / 'app/src/main/java/com/boxlocal/music/MainActivity.java'

text = engine.read_text(encoding='utf-8')
old_run = '''    void run() throws Exception {
      for (Method method : model.getClass().getMethods()) {
        if (!method.getName().equals("run") || method.getParameterCount() != 2) continue;
        method.invoke(model, inputs, outputs);
        return;
      }
      Class<?> compiled = model.getClass();
      for (Method method : compiled.getMethods()) {
        if (!method.getName().equals("run$default") || !Modifier.isStatic(method.getModifiers())) continue;
        Class<?>[] p = method.getParameterTypes();
        Object[] args = new Object[p.length];
        args[0] = model;
        args[1] = inputs;
        args[2] = outputs;
        for (int i = 3; i < p.length; i++) {
          if (p[i] == int.class) args[i] = i == 3 ? 0 : 4;
          else args[i] = null;
        }
        method.invoke(null, args);
        return;
      }
      throw new NoSuchMethodException("LiteRT run(inputs, outputs) not found");
    }
'''
new_run = '''    void run() throws Exception {
      Class<?> compiled = model.getClass();
      StringBuilder available = new StringBuilder();
      for (Method method : compiled.getMethods()) {
        if (!method.getName().startsWith("run")) continue;
        if (available.length() > 0) available.append(" | ");
        available.append(method.getName()).append(java.util.Arrays.toString(method.getParameterTypes()));
      }
      try {
        for (Method method : compiled.getMethods()) {
          if (!method.getName().equals("run")) continue;
          Class<?>[] p = method.getParameterTypes();
          if (p.length == 3
              && java.util.List.class.isAssignableFrom(p[0])
              && java.util.List.class.isAssignableFrom(p[1])
              && p[2] == int.class) {
            method.invoke(model, inputs, outputs, 0);
            return;
          }
        }
        for (Method method : compiled.getMethods()) {
          if (!method.getName().equals("run")) continue;
          Class<?>[] p = method.getParameterTypes();
          if (p.length == 2
              && java.util.List.class.isAssignableFrom(p[0])
              && java.util.List.class.isAssignableFrom(p[1])) {
            method.invoke(model, inputs, outputs);
            return;
          }
        }
        for (Method method : compiled.getMethods()) {
          if (!method.getName().equals("run$default") || !Modifier.isStatic(method.getModifiers())) continue;
          Class<?>[] p = method.getParameterTypes();
          if (p.length < 5
              || !p[0].isInstance(model)
              || !java.util.List.class.isAssignableFrom(p[1])
              || !java.util.List.class.isAssignableFrom(p[2])) continue;
          Object[] args = new Object[p.length];
          args[0] = model;
          args[1] = inputs;
          args[2] = outputs;
          for (int i = 3; i < p.length; i++) {
            if (p[i] == int.class) args[i] = i == 3 ? 0 : 4;
            else args[i] = null;
          }
          method.invoke(null, args);
          return;
        }
      } catch (java.lang.reflect.InvocationTargetException e) {
        Throwable cause = e.getTargetException() == null ? e : e.getTargetException();
        Exception wrapped = new Exception(
            "LiteRT run failed. inputs=" + inputs.size()
                + ", outputs=" + outputs.size()
                + ", methods=" + available,
            cause);
        wrapped.addSuppressed(e);
        throw wrapped;
      }
      throw new NoSuchMethodException(
          "No compatible LiteRT in-place run overload. inputs=" + inputs.size()
              + ", outputs=" + outputs.size()
              + ", methods=" + available);
    }
'''
if old_run not in text:
    raise SystemExit('Expected 0.4.0 LiteRtRunner.run block not found')
engine.write_text(text.replace(old_run, new_run, 1), encoding='utf-8')

text = main.read_text(encoding='utf-8')
text = text.replace('import android.os.Bundle;\n', 'import android.os.Build;\nimport android.os.Bundle;\n')
text = text.replace('import java.io.OutputStream;\n', 'import java.io.OutputStream;\nimport java.io.PrintWriter;\nimport java.io.StringWriter;\n')
text = text.replace('setTitle("Box Local Music");', 'setTitle("Box Local Music 0.4.1");', 1)
text = text.replace('addTitle("Box Local Music");', 'addTitle("Box Local Music 0.4.1");', 1)
text = text.replace('statusView.setText("Export failed: " + e.getMessage());', 'showFailure("Export WAV", e);')
text = text.replace('statusView.setText("Share failed: " + e.getMessage());', 'showFailure("Share WAV", e);')
text = text.replace('() -> statusView.setText("Download failed: " + error.getMessage())', '() -> showFailure("Download model " + model.id, error)')
text = text.replace('} catch (Exception e) {\n                runOnUiThread(() -> statusView.setText("Generation failed: " + e.getMessage()));', '} catch (Throwable e) {\n                runOnUiThread(() -> showFailure("Generate model " + model.id + ", duration=" + durationSeconds, e));')
text = text.replace('statusView.setText("Playback failed: " + e.getMessage());', 'showFailure("Playback WAV", e);')
text = text.replace('''  private TextView addTitle(String text) {''', '''  private void showFailure(String stage, Throwable throwable) {
    StringWriter buffer = new StringWriter();
    PrintWriter writer = new PrintWriter(buffer);
    writer.println("BOX LOCAL MUSIC FULL ERROR LOG");
    writer.println("Version: 0.4.1 (code 6)");
    writer.println("Stage: " + stage);
    writer.println("Device: " + Build.MANUFACTURER + " " + Build.MODEL);
    writer.println("Android: " + Build.VERSION.RELEASE + " / SDK " + Build.VERSION.SDK_INT);
    Runtime runtime = Runtime.getRuntime();
    writer.println("Heap MB: free=" + (runtime.freeMemory() / 1048576L)
        + ", total=" + (runtime.totalMemory() / 1048576L)
        + ", max=" + (runtime.maxMemory() / 1048576L));
    writer.println("External files: " + getExternalFilesDir(null));
    writer.println("Throwable: " + throwable.getClass().getName() + ": " + throwable.getMessage());
    writer.println();
    throwable.printStackTrace(writer);
    writer.flush();
    statusView.setText(buffer.toString());
    statusView.setTextIsSelectable(true);
  }

  private TextView addTitle(String text) {''')
text = text.replace('''    view.setTextSize(16);
    root.addView(view, matchWrap());''', '''    view.setTextSize(16);
    view.setTextIsSelectable(true);
    root.addView(view, matchWrap());''', 1)
main.write_text(text, encoding='utf-8')
print('Applied 0.4.1 LiteRT and diagnostics patch')
