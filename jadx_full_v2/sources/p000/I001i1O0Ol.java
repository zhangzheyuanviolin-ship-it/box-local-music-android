            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.ValueType;
            import com.google.ai.edge.litertlm.Contents;
            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import com.google.mlkit.genai.prompt.GenerateContentRequestKt;
            import com.google.mlkit.genai.prompt.Generation;
            import com.google.mlkit.genai.prompt.GenerationConfigKt;
            import com.google.mlkit.genai.prompt.GenerativeModel;
            import com.google.mlkit.genai.prompt.ImagePart;
            import com.google.mlkit.genai.prompt.TextPart;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class I001i1O0Ol implements O11il1ilio1o {
                public static final I001i1O0Ol I00000oIO = new I001i1O0Ol();
                public static final LinkedHashMap I00000oOI = new LinkedHashMap();

                @Override
                public final void I00000oIO(O1oIOiI11o0 o1oIOiI11o0, IllOOo00lI illOOo00lI) throws Exception {
/* 1 */             Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 11 */            I001i1lo1io i001i1lo1io = obj instanceof I001i1lo1io ? (I001i1lo1io) obj : null;
/* 12 */            if (i001i1lo1io != null) {
                        try {
/* 16 */                    i001i1lo1io.I00000oIO.close();
                        } catch (Exception e) {
/* 29 */                    IIlIOloOOO.I001iOo1i0O("Failed to close the engine: ", e.getMessage(), "AICoreModelHelper");
                        }
                    }
/* 40 */            IllOOo00lI illOOo00lI2 = (IllOOo00lI) I00000oOI.remove(o1oIOiI11o0.I00000oIO);
/* 42 */            if (illOOo00lI2 != null) {
/* 44 */                illOOo00lI2.invoke();
                    }
/* 47 */            o1oIOiI11o0.I00IlilI0i0i = null;
/* 51 */            ((O1oiilO) illOOo00lI).invoke();
                }

                @Override
                public final void I0000Il00O(O1oIOiI11o0 o1oIOiI11o0, Contents contents, List list, boolean z) {
/* 1 */             Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 10 */            I001i1lo1io i001i1lo1io = obj instanceof I001i1lo1io ? (I001i1lo1io) obj : null;
/* 11 */            if (i001i1lo1io == null) {
/* 13 */                return;
                    }
/* 16 */            i001i1lo1io.I00000oOI.clear();
                }

                @Override
                public final void I0000O(Context context, O1oIOiI11o0 o1oIOiI11o0, boolean z, boolean z2, Function1 function1, Contents contents, List list, boolean z3, Ii0110 ii0110) {
/* 1 */             if (ii0110 == null) {
/* 7 */                 Log.e("AICoreModelHelper", "CoroutineScope is required for AICoreModelHelper");
/* 12 */                function1.invoke("Initialization failed: CoroutineScope is null");
/* 15 */                return;
                    }
/* 16 */            Generation generation = Generation.INSTANCE;
/* 21 */            I000l1 i000l1 = new I000l1(1);
/* 24 */            i000l1.I00iiI = o1oIOiI11o0;
/* 26 */            VarHandle.storeStoreFence();
/* 44 */            iOi1II01i0.I0000O(ii0110, null, null, new I00111O(generation.getClient(GenerationConfigKt.generationConfig(i000l1)), o1oIOiI11o0, function1, (IOoil1iiIilo) null), 3);
                }

                @Override
                public final void I0000oI00(O1oIOiI11o0 o1oIOiI11o0) {
                    OlIl0i olIl0i;
/* 1 */             Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 11 */            I001i1lo1io i001i1lo1io = obj instanceof I001i1lo1io ? (I001i1lo1io) obj : null;
/* 12 */            if (i001i1lo1io == null || (olIl0i = i001i1lo1io.I0000Il00O) == null) {
/* 29 */                return;
                    }
/* 19 */            olIl0i.I000II(null);
                }

                @Override
                public final void I0001Ioi1lo(O1oIOiI11o0 o1oIOiI11o0, String str, Function3 function3, IllOOo00lI illOOo00lI, Function1 function1, List list, List list2, Ii0110 ii0110, Map map) {
/* 5 */             String str2 = o1oIOiI11o0.I00000oIO;
/* 7 */             Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 17 */            I001i1lo1io i001i1lo1io = obj instanceof I001i1lo1io ? (I001i1lo1io) obj : null;
/* 18 */            if (i001i1lo1io == null) {
/* 22 */                function1.invoke("AICore model instance is not initialized.");
/* 25 */                return;
                    }
/* 26 */            if (ii0110 == null) {
/* 32 */                Log.e("AICoreModelHelper", "CoroutineScope is required for AICoreModelHelper inference");
/* 37 */                function1.invoke("Inference failed: CoroutineScope is null");
/* 40 */                return;
                    }
/* 41 */            LinkedHashMap linkedHashMap = I00000oOI;
/* 47 */            if (!linkedHashMap.containsKey(str2)) {
/* 49 */                linkedHashMap.put(str2, illOOo00lI);
                    }
/* 52 */            List<I000iOII> list3 = i001i1lo1io.I00000oOI;
/* 56 */            StringBuilder sb = new StringBuilder();
/* 67 */            for (I000iOII i000iOII : list3) {
/* 84 */                sb.append(i000iOII.I00000oIO ? "user" : "model");
/* 89 */                sb.append(": ");
/* 94 */                sb.append(i000iOII.I00000oOI);
/* 99 */                sb.append("\n");
                    }
/* 107 */           String strI0010I0i = IIlIOloOOO.I0010I0i(sb, "user: ", str, "\nmodel: ");
/* 138 */           float fI00000oOI = lIiioliIlo.I00000oOI(((Float) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Temperature", Float.valueOf(1.0f)), ValueType.FLOAT)).floatValue(), 0.0f, 1.0f);
/* 164 */           int iIntValue = ((Integer) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("TopK", 64), ValueType.INT)).intValue();
/* 168 */           OlIl0i olIl0i = i001i1lo1io.I0000Il00O;
/* 170 */           if (olIl0i != null) {
/* 172 */               olIl0i.I000II(null);
                    }
/* 190 */           i001i1lo1io.I0000Il00O = iOi1II01i0.I0000O(ii0110, null, null, new I001IIilI0O(i001i1lo1io, strI0010I0i, fI00000oOI, iIntValue, list, str, function3, function1, null), 3);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000OOo1O(I001i1lo1io i001i1lo1io, String str, float f, int i, List list, String str2, Function3 function3, Function1 function1, IOoilo iOoilo) throws Throwable {
                    I00100l0 i00100l0;
                    GenerateContentRequest generateContentRequest;
/* 3 */             if (iOoilo instanceof I00100l0) {
/* 6 */                 i00100l0 = (I00100l0) iOoilo;
/* 8 */                 int i2 = i00100l0.I00iio;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    i00100l0.I00iio = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i00100l0 = new I00100l0(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = i00100l0.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = i00100l0.I00iio;
                    try {
/* 34 */                if (i3 == 0) {
/* 54 */                    lIoii1l01l0i.I00000oOI(obj);
/* 64 */                    int i4 = 0;
/* 65 */                    if (list.isEmpty()) {
/* 102 */                       TextPart textPart = new TextPart(str);
/* 107 */                       I000lI i000lI = new I000lI(1);
/* 110 */                       i000lI.I00iiI = f;
/* 112 */                       i000lI.I00iiO = i;
/* 114 */                       VarHandle.storeStoreFence();
/* 117 */                       generateContentRequest = GenerateContentRequestKt.generateContentRequest(textPart, i000lI);
                            } else {
/* 75 */                        ImagePart imagePart = new ImagePart((Bitmap) IOOi0Ool1i.I001lllioOl(list));
/* 80 */                        TextPart textPart2 = new TextPart(str);
/* 85 */                        I000lI i000lI2 = new I000lI(0);
/* 88 */                        i000lI2.I00iiI = f;
/* 90 */                        i000lI2.I00iiO = i;
/* 92 */                        VarHandle.storeStoreFence();
/* 95 */                        generateContentRequest = GenerateContentRequestKt.generateContentRequest(imagePart, textPart2, i000lI2);
                            }
/* 123 */                   IlOil1ii ilOil1iiGenerateContentStream = i001i1lo1io.I00000oIO.generateContentStream(generateContentRequest);
/* 129 */                   OOo0ooi oOo0ooi = new OOo0ooi();
/* 134 */                   oOo0ooi.I00iOIl = "";
/* 138 */                   I00100o1O0lo i00100o1O0lo = new I00100o1O0lo(i4);
/* 141 */                   i00100o1O0lo.I00iiI = oOo0ooi;
/* 143 */                   i00100o1O0lo.I00iiO = i001i1lo1io;
/* 145 */                   i00100o1O0lo.I00iio = str2;
/* 147 */                   i00100o1O0lo.I00ilI0I1 = function3;
/* 149 */                   VarHandle.storeStoreFence();
/* 152 */                   i00100l0.I00iOIl = function1;
/* 154 */                   i00100l0.I00iio = 1;
/* 160 */                   if (ilOil1iiGenerateContentStream.I00000oIO(i00100o1O0lo, i00100l0) == ii0111o) {
/* 162 */                       return ii0111o;
                            }
                        } else {
/* 36 */                    if (i3 != 1) {
/* 49 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 52 */                        return null;
                            }
/* 38 */                    Function1 function12 = i00100l0.I00iOIl;
/* 40 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
                    } catch (CancellationException unused) {
/* 192 */               Log.i("AICoreModelHelper", "The inference is cancelled.");
                    } catch (Exception e) {
/* 165 */               Log.e("AICoreModelHelper", "onError", e);
/* 186 */               function1.invoke("Error: " + e.getMessage());
                    }
/* 195 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000OiO(O1oIOiI11o0 o1oIOiI11o0, GenerativeModel generativeModel, IOoilo iOoilo) throws Throwable {
                    I001IO000 i001io000;
                    int iIntValue;
/* 3 */             if (iOoilo instanceof I001IO000) {
/* 6 */                 i001io000 = (I001IO000) iOoilo;
/* 8 */                 int i = i001io000.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i001io000.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i001io000 = new I001IO000(this, iOoilo);
                        }
                    }
/* 25 */            Object tokenLimit = i001io000.I00iiI;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i2 = i001io000.I00iio;
                    try {
/* 32 */                if (i2 == 0) {
/* 49 */                    lIoii1l01l0i.I00000oOI(tokenLimit);
/* 52 */                    i001io000.I00iOIl = o1oIOiI11o0;
/* 54 */                    i001io000.I00iio = 1;
/* 56 */                    tokenLimit = generativeModel.getTokenLimit(i001io000);
/* 60 */                    if (tokenLimit == obj) {
/* 62 */                        return obj;
                            }
                        } else {
/* 34 */                    if (i2 != 1) {
/* 44 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                        return null;
                            }
/* 36 */                    o1oIOiI11o0 = i001io000.I00iOIl;
/* 38 */                    lIoii1l01l0i.I00000oOI(tokenLimit);
                        }
/* 65 */                iIntValue = ((Number) tokenLimit).intValue();
                    } catch (Exception unused) {
/* 70 */                iIntValue = -1;
                    }
/* 71 */            if (iIntValue > 0) {
/* 77 */                LinkedHashMap linkedHashMap = new LinkedHashMap(o1oIOiI11o0.I00IoIO0lI);
/* 86 */                linkedHashMap.put("Max tokens", String.valueOf(iIntValue));
/* 89 */                o1oIOiI11o0.I00IoIO0lI = linkedHashMap;
                    }
/* 91 */            return OoiIlOl1iI.I00000oIO;
                }
            }
