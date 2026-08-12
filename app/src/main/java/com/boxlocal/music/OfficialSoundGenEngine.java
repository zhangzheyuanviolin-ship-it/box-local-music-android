package com.boxlocal.music;

import android.content.Context;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.file.Files;
import java.util.function.Consumer;

final class OfficialSoundGenEngine {
  private OfficialSoundGenEngine() {}

  static String generate(
      Context context,
      ModelSpec model,
      File modelDir,
      String prompt,
      float durationSeconds,
      Consumer<Float> progress)
      throws Exception {
    if (!model.isReady(modelDir)) {
      throw new IllegalStateException("Model files are not fully downloaded.");
    }
    Object engine = model.soundGenBlocks == 0 ? createBasicEngine(modelDir) : createHdEngine(model, modelDir);
    Class<?> functionClass = Class.forName("kotlin.jvm.functions.Function1");
    Object progressFunction =
        Proxy.newProxyInstance(
            functionClass.getClassLoader(),
            new Class<?>[] {functionClass},
            (proxy, method, args) -> {
              if ("invoke".equals(method.getName()) && args != null && args.length == 1 && args[0] instanceof Number) {
                progress.accept(((Number) args[0]).floatValue());
              }
              return null;
            });
    Object task = createGenerationTask(engine, prompt, progressFunction, System.currentTimeMillis(), durationSeconds, context);
    Class<?> resultClass = Class.forName("p000.OoiIlOl1iI");
    Object resultToken = resultClass.getField("I00000oIO").get(null);
    Object result = task.getClass().getMethod("invokeSuspend", Object.class).invoke(task, resultToken);
    if (!(result instanceof String) || ((String) result).isEmpty()) {
      throw new IllegalStateException("Official SoundGen returned no audio path.");
    }
    return (String) result;
  }

  private static Object createBasicEngine(File dir) throws Exception {
    Class<?> engineClass = Class.forName("p000.OlI0iOo");
    Object engine = engineClass.getConstructor().newInstance();
    set(engine, "I00000oIO", createCompiledModel(new File(dir, "sg_text.litert")));
    set(engine, "I00000oOI", createCompiledModel(new File(dir, "sg_core.litert")));
    set(engine, "I0000Il00O", createCompiledModel(new File(dir, "sg_decode.litert")));
    Class<?> tokenizerClass = Class.forName("p000.lOO0oI");
    Object tokenizer =
        tokenizerClass
            .getMethod("I00000oIO", byte[].class)
            .invoke(null, Files.readAllBytes(new File(dir, "sg_vocab.spm").toPath()));
    set(engine, "I0000O", tokenizer);
    return engine;
  }

  private static Object createHdEngine(ModelSpec model, File dir) throws Exception {
    Class<?> engineClass = Class.forName("p000.OlI0o1");
    Object engine = engineClass.getConstructor(int.class).newInstance(model.soundGenBlocks);
    set(engine, "I0001Ioi1lo", createCompiledModel(new File(dir, "sghd_text.litert")));
    set(engine, "I000II", createCompiledModel(new File(dir, "sghd_core.litert")));
    set(engine, "I000O01llI0", createCompiledModel(new File(dir, "sghd_decode.litert")));
    Class<?> tokenizerClass = Class.forName("p000.lOO011Io1");
    Object tokenizer =
        tokenizerClass
            .getMethod("I00000oIO", byte[].class)
            .invoke(null, Files.readAllBytes(new File(dir, "sghd_vocab.spm").toPath()));
    set(engine, "I000OOo1O", tokenizer);
    return engine;
  }

  private static Object createGenerationTask(
      Object engine, String prompt, Object progressFunction, long seed, float durationSeconds, Context context)
      throws Exception {
    Class<?> taskClass = Class.forName("p000.OlI01II0");
    Class<?> continuationClass = Class.forName("p000.IOoil1iiIilo");
    Class<?> functionClass = Class.forName("kotlin.jvm.functions.Function1");
    for (Constructor<?> constructor : taskClass.getConstructors()) {
      Class<?>[] types = constructor.getParameterTypes();
      if (types.length == 7
          && types[0].isInstance(engine)
          && types[1] == String.class
          && types[2] == functionClass
          && types[3] == long.class
          && types[4] == float.class) {
        return constructor.newInstance(engine, prompt, progressFunction, seed, durationSeconds, context, null);
      }
      if (types.length == 7
          && types[0].isInstance(engine)
          && types[1] == String.class
          && types[2] == float.class
          && types[3] == functionClass
          && types[4] == long.class) {
        return constructor.newInstance(engine, prompt, durationSeconds, progressFunction, seed, context, null);
      }
    }
    throw new NoSuchMethodException("Official SoundGen generation constructor not found: " + continuationClass.getName());
  }

  private static Object createCompiledModel(File file) throws Exception {
    Class<?> compiledModel = Class.forName("com.google.ai.edge.litert.CompiledModel");
    return compiledModel.getMethod("create", String.class).invoke(null, file.getAbsolutePath());
  }

  private static void set(Object target, String name, Object value) throws Exception {
    Field field = target.getClass().getField(name);
    field.set(target, value);
  }
}
