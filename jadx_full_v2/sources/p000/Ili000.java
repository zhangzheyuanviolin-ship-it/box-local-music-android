            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.litert.Accelerator;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.ai.edge.litert.Environment;
            import com.google.ai.edge.litert.TensorBuffer;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.File;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.RandomAccessFile;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.FloatBuffer;
            import java.nio.MappedByteBuffer;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class Ili000 {
                public Environment I00000oIO;
                public I0Oi111ii I00000oOI;
                public File I0000Il00O;
                public RandomAccessFile I0000O;
                public MappedByteBuffer I0000oI00;
                public float[] I0001Ioi1lo;
                public float[] I000II;
                public float[] I000O01llI0;
                public float[] I000OOo1O;
                public float[] I000OiO;
                public float[][] I000iOII;
                public float[] I000l1;
                public float[] I000lI;
                public volatile boolean I000o00OoI0I;

                public static float[] I0000Il00O(Context context, String str) throws IOException {
/* 11 */            InputStream inputStreamOpen = context.getAssets().open("fluxklein/".concat(str));
                    try {
/* 29 */                FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.wrap(iOiOlIoI.I00000oOI(inputStreamOpen)).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer();
/* 37 */                float[] fArr = new float[floatBufferAsFloatBuffer.remaining()];
/* 39 */                floatBufferAsFloatBuffer.get(fArr);
/* 42 */                inputStreamOpen.close();
/* 45 */                return fArr;
                    } finally {
                    }
                }

                public final void I00000oIO() {
/* 2 */             this.I00000oOI = null;
/* 4 */             this.I0000Il00O = null;
/* 6 */             this.I0000oI00 = null;
                    try {
/* 8 */                 RandomAccessFile randomAccessFile = this.I0000O;
/* 10 */                if (randomAccessFile != null) {
/* 12 */                    randomAccessFile.close();
                        }
                    } catch (Throwable unused) {
                    }
/* 15 */            this.I0000O = null;
                    try {
/* 17 */                Environment environment = this.I00000oIO;
/* 19 */                if (environment != null) {
/* 21 */                    environment.close();
                        }
                    } catch (Throwable unused2) {
                    }
/* 24 */            this.I00000oIO = null;
                }

                public final ArrayList I00000oOI(File file, String str, List list) {
                    CompiledModel compiledModelCreate;
                    List list2;
                    List list3;
/* 15 */            CompiledModel.Options options = new CompiledModel.Options(Accelerator.GPU);
/* 48 */            options.setGpuOptions(new CompiledModel.GpuOptions(null, null, null, CompiledModel.GpuOptions.Precision.FP32, null, null, null, null, null, null, null, null, null, null, null, 32759, null));
                    try {
/* 64 */                compiledModelCreate = CompiledModel.INSTANCE.create(new File(file, str).getAbsolutePath(), options, this.I00000oIO);
                    } catch (Throwable th) {
/* 79 */                Log.w("FluxKleinEngine", str.concat(" failed to compile on GPU, retrying on CPU"), th);
/* 106 */               compiledModelCreate = CompiledModel.INSTANCE.create(new File(file, str).getAbsolutePath(), new CompiledModel.Options(Accelerator.CPU), this.I00000oIO);
                    }
/* 68 */            CompiledModel compiledModel = compiledModelCreate;
/* 113 */           int i = 0;
                    try {
/* 114 */               List listCreateInputBuffers$default = CompiledModel.createInputBuffers$default(compiledModel, 0, 1, null);
/* 118 */               List listCreateOutputBuffers$default = CompiledModel.createOutputBuffers$default(compiledModel, 0, 1, null);
                        try {
/* 134 */                   for (Object obj : list) {
/* 140 */                       int i2 = i + 1;
/* 142 */                       if (i < 0) {
/* 163 */                           IOOi1I.I000lI();
/* 166 */                           throw null;
                                }
/* 152 */                       ((TensorBuffer) listCreateInputBuffers$default.get(i)).writeFloat((float[]) obj);
/* 155 */                       i = i2;
                            }
/* 169 */                   list2 = listCreateOutputBuffers$default;
/* 170 */                   list3 = listCreateInputBuffers$default;
                            try {
/* 172 */                       CompiledModel.run$default(compiledModel, list3, list2, 0, 4, (Object) null);
/* 176 */                       List list4 = list2;
/* 186 */                       ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list4, 10));
/* 189 */                       Iterator it = list4.iterator();
/* 197 */                       while (it.hasNext()) {
/* 209 */                           arrayList.add(((TensorBuffer) it.next()).readFloat());
                                }
/* 218 */                       Iterator it2 = list3.iterator();
/* 226 */                       while (it2.hasNext()) {
                                    try {
/* 234 */                               ((TensorBuffer) it2.next()).close();
                                    } catch (Throwable th2) {
/* 239 */                               lIoii1l01l0i.I00000oIO(th2);
                                    }
                                }
/* 248 */                       Iterator it3 = list2.iterator();
/* 256 */                       while (it3.hasNext()) {
                                    try {
/* 264 */                               ((TensorBuffer) it3.next()).close();
                                    } catch (Throwable th3) {
/* 269 */                               lIoii1l01l0i.I00000oIO(th3);
                                    }
                                }
/* 273 */                       compiledModel.close();
/* 276 */                       return arrayList;
                            } catch (Throwable th4) {
/* 213 */                       th = th4;
/* 160 */                       Throwable th5 = th;
/* 280 */                       Iterator it4 = list3.iterator();
/* 288 */                       while (it4.hasNext()) {
                                    try {
/* 296 */                               ((TensorBuffer) it4.next()).close();
                                    } catch (Throwable th6) {
/* 301 */                               lIoii1l01l0i.I00000oIO(th6);
                                    }
                                }
/* 308 */                       Iterator it5 = list2.iterator();
/* 316 */                       while (it5.hasNext()) {
                                    try {
/* 324 */                               ((TensorBuffer) it5.next()).close();
                                    } catch (Throwable th7) {
/* 329 */                               lIoii1l01l0i.I00000oIO(th7);
                                    }
                                }
/* 333 */                       throw th5;
                            }
                        } catch (Throwable th8) {
/* 157 */                   th = th8;
/* 158 */                   list2 = listCreateOutputBuffers$default;
/* 159 */                   list3 = listCreateInputBuffers$default;
                        }
                    } finally {
/* 334 */               compiledModel.close();
                    }
                }

                public final float[] I0000O(float[] fArr) {
/* 6 */             float[] fArr2 = new float[32768];
/* 12 */            for (int i = 0; i < 128; i++) {
/* 14 */                float[] fArr3 = this.I000lI;
/* 17 */                if (fArr3 == null) {
/* 83 */                    O0000Ioio00.I000OOo1O("bnStd");
/* 86 */                    throw null;
                        }
/* 19 */                float f = fArr3[i];
/* 21 */                float[] fArr4 = this.I000l1;
/* 23 */                if (fArr4 == null) {
/* 77 */                    O0000Ioio00.I000OOo1O("bnMean");
/* 80 */                    throw null;
                        }
/* 25 */                float f2 = fArr4[i];
/* 27 */                int i2 = i / 4;
/* 31 */                int i3 = (i % 4) / 2;
/* 33 */                int i4 = i % 2;
/* 38 */                for (int i5 = 0; i5 < 16; i5++) {
/* 41 */                    for (int i6 = 0; i6 < 16; i6++) {
/* 64 */                        fArr2[(i6 * 2) + i4 + (((i5 * 2) + i3) * 32) + (i2 * Barcode.FORMAT_UPC_E)] = (fArr[(((i5 * 16) + i6) * Barcode.FORMAT_ITF) + i] * f) + f2;
                            }
                        }
                    }
/* 168 */           return fArr2;
                }
            }
