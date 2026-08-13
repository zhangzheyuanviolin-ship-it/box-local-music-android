            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.litert.Accelerator;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.ai.edge.litert.Environment;
            import com.google.ai.edge.litert.TensorBuffer;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.BufferedWriter;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStreamWriter;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.FloatBuffer;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class II10ili1 {
                public Environment I00000oIO;
                public I0Oi111ii I00000oOI;
                public File I0000Il00O;
                public float[] I0000O;
                public float[] I0000oI00;
                public OllO00oiil I0001Ioi1lo;
                public OllO00oiil I000II;
                public volatile boolean I000O01llI0;

                public static I0Oi111ii I00000oOI(File file) throws JSONException, IOException {
/* 5 */             File file2 = new File(file, "qwen_vocab.txt");
/* 12 */            File file3 = new File(file, "qwen_merges.txt");
/* 19 */            File file4 = new File(file, "qwen_special.txt");
/* 26 */            if (!file2.exists() || !file3.exists() || !file4.exists()) {
/* 44 */                Log.i("BonsaiEngine", "converting HuggingFace tokenizer files to staged format");
/* 60 */                JSONObject jSONObject = new JSONObject(IlIl10.I000OOo1O(new File(file, "bonsai_vocab.json")));
/* 69 */                HashMap map = new HashMap(jSONObject.length());
/* 72 */                Iterator<String> itKeys = jSONObject.keys();
/* 76 */                int i = -1;
/* 81 */                while (itKeys.hasNext()) {
/* 83 */                    String next = itKeys.next();
/* 89 */                    int i2 = jSONObject.getInt(next);
/* 97 */                    map.put(Integer.valueOf(i2), next);
/* 100 */                   if (i2 > i) {
/* 102 */                       i = i2;
                            }
                        }
/* 120 */               BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), IO1IOI.I00000oIO), 8192);
/* 123 */               if (i >= 0) {
/* 125 */                   int i3 = 0;
                            while (true) {
                                try {
/* 134 */                           String str = (String) map.get(Integer.valueOf(i3));
/* 136 */                           if (str == null) {
/* 138 */                               str = "";
                                    }
/* 143 */                           bufferedWriter.write(str);
/* 146 */                           bufferedWriter.newLine();
/* 149 */                           if (i3 == i) {
                                        break;
                                    }
/* 151 */                           i3++;
                                } finally {
                                }
                            }
                        }
/* 160 */               bufferedWriter.close();
/* 163 */               Charset charset = IO1IOI.I00000oIO;
/* 177 */               bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file3), charset), 8192);
                        try {
/* 184 */                   File file5 = new File(file, "bonsai_merges.txt");
/* 191 */                   IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(18);
/* 194 */                   iIOIlOoI111.I00iiI = bufferedWriter;
/* 196 */                   VarHandle.storeStoreFence();
/* 199 */                   IlIl10.I0000oI00(file5, iIOIlOoI111);
/* 202 */                   bufferedWriter.close();
/* 218 */                   JSONObject jSONObject2 = new JSONObject(IlIl10.I000OOo1O(new File(file, "bonsai_added_tokens.json")));
/* 233 */                   bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file4), charset), 8192);
                            try {
/* 236 */                       Iterator<String> itKeys2 = jSONObject2.keys();
/* 244 */                       while (itKeys2.hasNext()) {
/* 246 */                           String next2 = itKeys2.next();
/* 252 */                           bufferedWriter.write(next2);
/* 257 */                           bufferedWriter.write("\t");
/* 268 */                           bufferedWriter.write(String.valueOf(jSONObject2.getInt(next2)));
/* 271 */                           bufferedWriter.newLine();
                                }
/* 277 */                       bufferedWriter.close();
                            } finally {
                                try {
/* 286 */                           throw th;
                                } finally {
                                }
                            }
                        } finally {
                            try {
/* 293 */                       throw th;
                            } finally {
                            }
                        }
                    }
/* 282 */           return new I0Oi111ii(file2, file3, file4);
                }

                public static float[] I0000O(Context context, String str) throws IOException {
/* 11 */            InputStream inputStreamOpen = context.getAssets().open("bonsai/".concat(str));
                    try {
/* 29 */                FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.wrap(iOiOlIoI.I00000oOI(inputStreamOpen)).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer();
/* 37 */                float[] fArr = new float[floatBufferAsFloatBuffer.remaining()];
/* 39 */                floatBufferAsFloatBuffer.get(fArr);
/* 42 */                inputStreamOpen.close();
/* 45 */                return fArr;
                    } finally {
                    }
                }

                public static ArrayList I0000oI00(II10ili1 iI10ili1, File file, String str, List list) {
/* 25 */            CompiledModel compiledModelCreate = CompiledModel.INSTANCE.create(new File(file, str).getAbsolutePath(), new CompiledModel.Options(Accelerator.CPU), iI10ili1.I00000oIO);
/* 30 */            int i = 0;
                    try {
/* 32 */                List listCreateInputBuffers$default = CompiledModel.createInputBuffers$default(compiledModelCreate, 0, 1, null);
/* 36 */                List listCreateOutputBuffers$default = CompiledModel.createOutputBuffers$default(compiledModelCreate, 0, 1, null);
                        try {
/* 50 */                    for (Object obj : list) {
/* 56 */                        int i2 = i + 1;
/* 58 */                        if (i < 0) {
/* 120 */                           IOOi1I.I000lI();
/* 123 */                           throw null;
                                }
/* 62 */                        if (obj instanceof float[]) {
/* 72 */                            ((TensorBuffer) listCreateInputBuffers$default.get(i)).writeFloat((float[]) obj);
                                } else {
/* 82 */                            if (!(obj instanceof int[])) {
/* 119 */                               throw new IllegalArgumentException("unsupported input type at " + i);
                                    }
/* 92 */                            ((TensorBuffer) listCreateInputBuffers$default.get(i)).writeInt((int[]) obj);
                                }
/* 95 */                        i = i2;
                            }
/* 127 */                   CompiledModel.run$default(compiledModelCreate, listCreateInputBuffers$default, listCreateOutputBuffers$default, 0, 4, (Object) null);
/* 131 */                   List list2 = listCreateOutputBuffers$default;
/* 141 */                   ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 144 */                   Iterator it = list2.iterator();
/* 152 */                   while (it.hasNext()) {
/* 164 */                       arrayList.add(((TensorBuffer) it.next()).readFloat());
                            }
/* 170 */                   Iterator it2 = listCreateInputBuffers$default.iterator();
/* 178 */                   while (it2.hasNext()) {
                                try {
/* 186 */                           ((TensorBuffer) it2.next()).close();
                                } catch (Throwable th) {
/* 192 */                           lIoii1l01l0i.I00000oIO(th);
                                }
                            }
/* 201 */                   Iterator it3 = listCreateOutputBuffers$default.iterator();
/* 209 */                   while (it3.hasNext()) {
                                try {
/* 217 */                           ((TensorBuffer) it3.next()).close();
                                } catch (Throwable th2) {
/* 223 */                           lIoii1l01l0i.I00000oIO(th2);
                                }
                            }
/* 227 */                   compiledModelCreate.close();
/* 230 */                   return arrayList;
                        } finally {
                        }
                    } catch (Throwable th3) {
/* 288 */               compiledModelCreate.close();
/* 1182 */              throw th3;
                    }
                }

                public final float[] I00000oIO(float[] fArr) {
/* 5 */             float[] fArr2 = new float[131072];
/* 11 */            for (int i = 0; i < 128; i++) {
/* 13 */                float[] fArr3 = this.I0000O;
/* 16 */                if (fArr3 == null) {
/* 82 */                    O0000Ioio00.I000OOo1O("bnScale");
/* 85 */                    throw null;
                        }
/* 18 */                float f = fArr3[i];
/* 20 */                float[] fArr4 = this.I0000oI00;
/* 22 */                if (fArr4 == null) {
/* 76 */                    O0000Ioio00.I000OOo1O("bnShift");
/* 79 */                    throw null;
                        }
/* 24 */                float f2 = fArr4[i];
/* 26 */                int i2 = i / 4;
/* 30 */                int i3 = (i % 4) / 2;
/* 32 */                int i4 = i % 2;
/* 37 */                for (int i5 = 0; i5 < 32; i5++) {
/* 40 */                    for (int i6 = 0; i6 < 32; i6++) {
/* 63 */                        fArr2[(i6 * 2) + i4 + (((i5 * 2) + i3) * 64) + (i2 * Barcode.FORMAT_AZTEC)] = (fArr[(((i5 * 32) + i6) * Barcode.FORMAT_ITF) + i] * f) + f2;
                            }
                        }
                    }
/* 168 */           return fArr2;
                }

                public final void I0000Il00O() {
/* 2 */             this.I00000oOI = null;
/* 4 */             this.I0000Il00O = null;
                    try {
/* 6 */                 Environment environment = this.I00000oIO;
/* 8 */                 if (environment != null) {
/* 10 */                    environment.close();
                        }
                    } catch (Throwable unused) {
                    }
/* 13 */            this.I00000oIO = null;
                }
            }
