            package com.google.ai.edge.gallery.whisper;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import p000.IOoil1iiIilo;
            import p000.IiiIil1lOIO;
            import p000.Io00llIoO1lO;
            import p000.O0000Ioio00;
            import p000.O1OlIoo;
            import p000.O1OlO1II;
            import p000.O1OlOOioiI;
            import p000.OOoiliiIoloI;
            import p000.Ol0Oli;
            import p000.OlOoOIi0o;
            import p000.OlOolloIIOl0;
            import p000.i0011lli;
            import p000.i001Ili;
            import p000.i001iI0o1iOo;
            import p000.iOi1II01i0;
            
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u0003J(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u001e\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/google/ai/edge/gallery/whisper/WhisperEngine;", "", "<init>", "()V", "", "json", "", "Li001iI0o1iOo;", "parseSegmentsJson", "(Ljava/lang/String;)Ljava/util/List;", "modelPath", "", "loadModelNative", "(Ljava/lang/String;)J", "handle", "", "audioData", "language", "transcribeNative", "(J[FLjava/lang/String;)Ljava/lang/String;", "transcribeWithSegmentsNative", "LOoiIlOl1iI;", "freeModelNative", "(J)V", "", "loadModel", "(Ljava/lang/String;LIOoil1iiIilo;)Ljava/lang/Object;", "transcribe", "([FLjava/lang/String;LIOoil1iiIilo;)Ljava/lang/Object;", "freeModel", "transcribeWithSegments", "contextHandle", "J", "isLoaded", "()Z", "Companion", "i0011lli", "whisper"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class WhisperEngine {
                public static final i0011lli Companion = new i0011lli();
                public static final int SAMPLE_RATE = 16000;
                private long contextHandle;

                static {
/* 10 */            System.loadLibrary("whisper_jni");
                }

                private final native void freeModelNative(long handle);

                private final native long loadModelNative(String modelPath);

                private final List<i001iI0o1iOo> parseSegmentsJson(String json) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 10 */            String string = OlOoOIi0o.I00OIo(json).toString();
/* 20 */            if (!O0000Ioio00.I0000O(string, "[]") && string.length() != 0) {
/* 41 */                Iterator it = OOoiliiIoloI.I00000oOI(new OOoiliiIoloI("\\{\"s\":(\\d+),\"e\":(\\d+),\"t\":\"((?:[^\"\\\\]|\\\\.)*)\"\\}"), string).iterator();
                        while (true) {
/* 46 */                    Io00llIoO1lO io00llIoO1lO = (Io00llIoO1lO) it;
/* 52 */                    if (!io00llIoO1lO.hasNext()) {
                                break;
                            }
/* 60 */                    O1OlOOioiI o1OlOOioiI = (O1OlOOioiI) ((O1OlIoo) io00llIoO1lO.next());
/* 75 */                    Long lI000o00OoI0I = OlOolloIIOl0.I000o00OoI0I((String) ((O1OlO1II) o1OlOOioiI.I00000oIO()).get(1));
/* 79 */                    if (lI000o00OoI0I != null) {
/* 81 */                        long jLongValue = lI000o00OoI0I.longValue();
/* 98 */                        Long lI000o00OoI0I2 = OlOolloIIOl0.I000o00OoI0I((String) ((O1OlO1II) o1OlOOioiI.I00000oIO()).get(2));
/* 102 */                       if (lI000o00OoI0I2 != null) {
/* 104 */                           long jLongValue2 = lI000o00OoI0I2.longValue();
/* 149 */                           String string2 = OlOoOIi0o.I00OIo(OlOolloIIOl0.I000iOII(OlOolloIIOl0.I000iOII(OlOolloIIOl0.I000iOII((String) ((O1OlO1II) o1OlOOioiI.I00000oIO()).get(3), "\\\"", "\""), "\\\\", "\\"), "\\n", "\n")).toString();
/* 157 */                           if (string2.length() > 0) {
/* 161 */                               i001iI0o1iOo i001ii0o1ioo = new i001iI0o1iOo();
/* 164 */                               i001ii0o1ioo.I00000oIO = jLongValue;
/* 166 */                               i001ii0o1ioo.I00000oOI = jLongValue2;
/* 168 */                               i001ii0o1ioo.I0000Il00O = string2;
/* 170 */                               VarHandle.storeStoreFence();
/* 173 */                               arrayList.add(i001ii0o1ioo);
                                    }
                                }
                            }
                        }
                    }
/* 437 */           return arrayList;
                }

                public static Object transcribe$default(WhisperEngine whisperEngine, float[] fArr, String str, IOoil1iiIilo iOoil1iiIilo, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 str = "en";
                    }
/* 7 */             return whisperEngine.transcribe(fArr, str, iOoil1iiIilo);
                }

                private final native String transcribeNative(long handle, float[] audioData, String language);

                public static Object transcribeWithSegments$default(WhisperEngine whisperEngine, float[] fArr, String str, IOoil1iiIilo iOoil1iiIilo, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 str = "auto";
                    }
/* 7 */             return whisperEngine.transcribeWithSegments(fArr, str, iOoil1iiIilo);
                }

                private final native String transcribeWithSegmentsNative(long handle, float[] audioData, String language);

                public final void freeModel() {
/* 1 */             long j = this.contextHandle;
/* 7 */             if (j != 0) {
/* 9 */                 freeModelNative(j);
/* 12 */                this.contextHandle = 0L;
                    }
                }

                public final boolean isLoaded() {
                    return this.contextHandle != 0;
                }

                public final Object loadModel(String str, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            return iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new Ol0Oli(this, str, (IOoil1iiIilo) null, 17), iOoil1iiIilo);
                }

                public final Object transcribe(float[] fArr, String str, IOoil1iiIilo iOoil1iiIilo) {
/* 13 */            return iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new i001Ili(this, fArr, str, null, 0), iOoil1iiIilo);
                }

                public final Object transcribeWithSegments(float[] fArr, String str, IOoil1iiIilo iOoil1iiIilo) {
/* 13 */            return iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new i001Ili(this, fArr, str, null, 1), iOoil1iiIilo);
                }
            }
