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
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class i0I00l {
                public Environment I00000oIO;
                public I0Oi111ii I00000oOI;
                public File I0000Il00O;
                public RandomAccessFile I0000O;
                public MappedByteBuffer I0000oI00;
                public float[] I0001Ioi1lo;
                public float[] I000II;
                public volatile boolean I000O01llI0;

                public static float[] I0000oI00(Context context, String str) throws IOException {
/* 5 */             InputStream inputStreamOpen = context.getAssets().open(str);
                    try {
/* 23 */                FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.wrap(iOiOlIoI.I00000oOI(inputStreamOpen)).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer();
/* 31 */                float[] fArr = new float[floatBufferAsFloatBuffer.remaining()];
/* 33 */                floatBufferAsFloatBuffer.get(fArr);
/* 36 */                inputStreamOpen.close();
/* 39 */                return fArr;
                    } finally {
                    }
                }

                public static OIoi0IIoi I0001Ioi1lo(int[][] iArr) {
/* 1 */             int length = iArr.length;
/* 2 */             int i = length * 64;
/* 4 */             float[] fArr = new float[i];
/* 6 */             float[] fArr2 = new float[i];
/* 10 */            for (int i2 = 0; i2 < length; i2++) {
/* 13 */                int i3 = 0;
/* 15 */                for (int i4 = 0; i4 < 3; i4++) {
/* 19 */                    int i5 = iO1Oo1o0OOio.I00000oIO[i4];
/* 21 */                    int i6 = i5 / 2;
/* 24 */                    for (int i7 = 0; i7 < i6; i7++) {
/* 46 */                        double dPow = iArr[i2][i4] * (1.0d / Math.pow(256.0d, (i7 * 2.0d) / i5));
/* 50 */                        int i8 = (i2 * 64) + i3 + i7;
/* 56 */                        fArr[i8] = (float) Math.cos(dPow);
/* 63 */                        fArr2[i8] = (float) Math.sin(dPow);
                            }
/* 68 */                    i3 += i6;
                        }
                    }
/* 77 */            return new OIoi0IIoi(fArr, fArr2);
                }

                public final float[] I00000oIO(File file, float[] fArr, float[] fArr2, int i, float[] fArr3, IlliIl1l11O illiIl1l11O) {
/* 10 */            illiIl1l11O.invoke("caption", Float.valueOf(0.02f));
/* 28 */            float[] fArr4 = (float[]) I0000O(file, "z_embc.tflite", Collections.singletonList(fArr2)).get(0);
/* 33 */            while (i < 32) {
/* 35 */                float[] fArr5 = this.I0001Ioi1lo;
/* 37 */                if (fArr5 == null) {
/* 51 */                    O0000Ioio00.I000OOo1O("capPadToken");
/* 54 */                    throw null;
                        }
/* 43 */                System.arraycopy(fArr5, 0, fArr4, i * 3840, 3840);
/* 46 */                i++;
                    }
/* 55 */            int[][] iArr = new int[32][];
/* 57 */            int i2 = 0;
/* 58 */            while (i2 < 32) {
/* 60 */                int i3 = i2 + 1;
/* 66 */                iArr[i2] = new int[]{i3, 0, 0};
/* 68 */                i2 = i3;
                    }
/* 70 */            OIoi0IIoi oIoi0IIoiI0001Ioi1lo = I0001Ioi1lo(iArr);
/* 76 */            float[] fArr6 = (float[]) oIoi0IIoiI0001Ioi1lo.I00iOIl;
/* 80 */            float[] fArr7 = (float[]) oIoi0IIoiI0001Ioi1lo.I00iiI;
/* 100 */           float[] fArr8 = (float[]) I0000O(file, "z_refc.tflite", IOOi1I.I000O01llI0(fArr4, fArr6, fArr7)).get(0);
/* 104 */           if (!this.I000O01llI0) {
/* 117 */               illiIl1l11O.invoke("image", Float.valueOf(0.08f));
/* 122 */               int[][] iArr2 = new int[Barcode.FORMAT_QR_CODE][];
/* 125 */               for (int i4 = 0; i4 < 256; i4++) {
/* 137 */                   iArr2[i4] = new int[]{33, i4 / 16, i4 % 16};
                        }
/* 142 */               OIoi0IIoi oIoi0IIoiI0001Ioi1lo2 = I0001Ioi1lo(iArr2);
/* 148 */               float[] fArr9 = (float[]) oIoi0IIoiI0001Ioi1lo2.I00iOIl;
/* 152 */               float[] fArr10 = (float[]) oIoi0IIoiI0001Ioi1lo2.I00iiI;
/* 188 */               float[] fArr11 = (float[]) I0000O(file, "z_refx.tflite", IOOi1I.I000O01llI0((float[]) I0000O(file, "z_embx.tflite", Collections.singletonList(fArr)).get(0), fArr9, fArr10, fArr3)).get(0);
/* 192 */               if (!this.I000O01llI0) {
/* 198 */                   float[] fArr12 = new float[1105920];
/* 201 */                   System.arraycopy(fArr11, 0, fArr12, 0, fArr11.length);
/* 206 */                   System.arraycopy(fArr8, 0, fArr12, fArr11.length, fArr8.length);
/* 212 */                   float[] fArr13 = new float[fArr9.length + fArr6.length];
/* 215 */                   System.arraycopy(fArr9, 0, fArr13, 0, fArr9.length);
/* 220 */                   System.arraycopy(fArr6, 0, fArr13, fArr9.length, fArr6.length);
/* 226 */                   float[] fArr14 = new float[fArr10.length + fArr7.length];
/* 229 */                   System.arraycopy(fArr10, 0, fArr14, 0, fArr10.length);
/* 234 */                   System.arraycopy(fArr7, 0, fArr14, fArr10.length, fArr7.length);
/* 237 */                   int i5 = 0;
/* 239 */                   while (i5 < 6) {
/* 243 */                       if (!this.I000O01llI0) {
/* 246 */                           int i6 = i5 + 1;
/* 269 */                           illiIl1l11O.invoke(IIlIOloOOO.I00100l0("block ", i6, "/6"), Float.valueOf((i5 * 0.13f) + 0.15f));
/* 297 */                           fArr12 = (float[]) I0000O(file, IIlIOloOOO.I00100l0("zc_main", i5, ".tflite"), IOOi1I.I000O01llI0(fArr12, fArr13, fArr14, fArr3)).get(0);
/* 299 */                           i5 = i6;
                                }
                            }
/* 310 */                   illiIl1l11O.invoke("final", Float.valueOf(0.95f));
/* 331 */                   float[] fArr15 = (float[]) I0000O(file, "zc_final.tflite", IOOi1I.I000O01llI0(fArr12, fArr3)).get(0);
/* 336 */                   iOO1il1Ii1oo.I00000oIO(16384, fArr15.length);
/* 339 */                   return Arrays.copyOfRange(fArr15, 0, 16384);
                        }
                    }
/* 32 */            return null;
                }

                public final OIoi0IIoi I00000oOI(File file, String str) {
                    float fIntBitsToFloat;
/* 3 */             I0Oi111ii i0Oi111ii = this.I00000oOI;
/* 6 */             if (i0Oi111ii == null) {
/* 5 */                 return null;
                    }
/* 30 */            int[] iArrI00111O = i0Oi111ii.I00111O("<|im_start|>user\n" + str + "<|im_end|>\n<|im_start|>assistant\n");
/* 37 */            int iMin = Math.min(iArrI00111O.length, 64);
/* 41 */            int[] iArr = new int[64];
/* 44 */            int i = 0;
/* 45 */            while (i < 64) {
/* 55 */                iArr[i] = i < iMin ? iArrI00111O[i] : 151643;
/* 57 */                i++;
                    }
/* 60 */            MappedByteBuffer mappedByteBuffer = this.I0000oI00;
/* 62 */            if (mappedByteBuffer == null) {
/* 243 */               I000II.I001IO000("embed table not mapped");
/* 5 */                 return null;
                    }
/* 67 */            float[] fArr = new float[163840];
/* 70 */            for (int i2 = 0; i2 < 64; i2++) {
/* 72 */                int i3 = iArr[i2];
/* 74 */                if (i3 < 0 || i3 >= 151936) {
/* 193 */                   I000II.I0010I0i(IIlIOloOOO.I00100l0("token id ", i3, " out of range"));
/* 5 */                     return null;
                        }
/* 81 */                int i4 = i3 * 5120;
/* 86 */                for (int i5 = 0; i5 < 2560; i5++) {
/* 90 */                    int i6 = (i2 * 2560) + i5;
/* 94 */                    short s = mappedByteBuffer.getShort((i5 * 2) + i4);
/* 101 */                   int i7 = 32768 & s;
/* 102 */                   int i8 = s & 31744;
/* 104 */                   int i9 = s & 1023;
/* 108 */                   if (i8 == 31744) {
/* 120 */                       fIntBitsToFloat = i9 == 0 ? i7 == 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY : Float.NaN;
                            } else if (i8 != 0) {
/* 137 */                       fIntBitsToFloat = Float.intBitsToFloat((i9 << 13) | (i7 << 16) | (((i8 >> 10) + 112) << 23));
                            } else if (i9 != 0) {
/* 144 */                       int i10 = -1;
/* 147 */                       while ((i9 & Barcode.FORMAT_UPC_E) == 0) {
/* 149 */                           i9 <<= 1;
/* 151 */                           i10++;
                                }
/* 166 */                       fIntBitsToFloat = Float.intBitsToFloat(((i9 & 1023) << 13) | (i7 << 16) | ((112 - i10) << 23));
                            } else {
/* 173 */                       fIntBitsToFloat = Float.intBitsToFloat(i7 << 16);
                            }
/* 177 */                   fArr[i6] = fIntBitsToFloat;
                        }
                    }
/* 213 */           float[] fArr2 = (float[]) I0000O(file, "qwen_enc.tflite", Collections.singletonList(fArr)).get(0);
/* 218 */           float[] fArr3 = new float[81920];
/* 222 */           int iMin2 = Math.min(iMin, 32);
/* 228 */           System.arraycopy(fArr2, 0, fArr3, 0, iMin2 * 2560);
/* 237 */           return new OIoi0IIoi(fArr3, Integer.valueOf(iMin2));
                }

                public final void I0000Il00O() {
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

                public final ArrayList I0000O(File file, String str, List list) {
                    CompiledModel compiledModelCreate;
                    List list2;
                    List list3;
/* 15 */            CompiledModel.Options options = new CompiledModel.Options(Accelerator.GPU);
/* 48 */            options.setGpuOptions(new CompiledModel.GpuOptions(null, null, null, CompiledModel.GpuOptions.Precision.FP32, null, null, null, null, null, null, null, null, null, null, null, 32759, null));
                    try {
/* 64 */                compiledModelCreate = CompiledModel.INSTANCE.create(new File(file, str).getAbsolutePath(), options, this.I00000oIO);
                    } catch (Throwable th) {
/* 79 */                Log.w("ZImageEngine", str.concat(" failed to compile on GPU, retrying on CPU"), th);
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

                public final float[] I000II(float f) {
/* 3 */             float[] fArr = new float[Barcode.FORMAT_QR_CODE];
/* 9 */             for (int i = 0; i < 128; i++) {
/* 37 */                double dExp = f * 1000.0d * Math.exp(((-Math.log(10000.0d)) * i) / 128.0d);
/* 43 */                fArr[i] = (float) Math.cos(dExp);
/* 51 */                fArr[Barcode.FORMAT_ITF + i] = (float) Math.sin(dExp);
                    }
/* 58 */            float[] fArr2 = new float[Barcode.FORMAT_UPC_E];
/* 64 */            for (int i2 = 0; i2 < 1024; i2++) {
/* 66 */                float[] fArr3 = this.I000II;
/* 68 */                if (fArr3 == null) {
/* 116 */                   O0000Ioio00.I000OOo1O("tembMlp");
/* 119 */                   throw null;
                        }
/* 73 */                double d = fArr3[262144 + i2];
/* 76 */                int i3 = i2 * Barcode.FORMAT_QR_CODE;
/* 79 */                for (int i4 = 0; i4 < 256; i4++) {
/* 83 */                    if (this.I000II == null) {
/* 97 */                        O0000Ioio00.I000OOo1O("tembMlp");
/* 100 */                       throw null;
                            }
/* 93 */                    d += r11[i3 + i4] * fArr[i4];
                        }
/* 111 */               fArr2[i2] = (float) (d / (Math.exp(-d) + 1.0d));
                    }
/* 120 */           float[] fArr4 = new float[Barcode.FORMAT_QR_CODE];
/* 123 */           for (int i5 = 0; i5 < 256; i5++) {
/* 125 */               float[] fArr5 = this.I000II;
/* 127 */               if (fArr5 == null) {
/* 171 */                   O0000Ioio00.I000OOo1O("tembMlp");
/* 174 */                   throw null;
                        }
/* 133 */               double d2 = fArr5[525312 + i5];
/* 141 */               int i6 = (i5 * Barcode.FORMAT_UPC_E) + 263168;
/* 143 */               for (int i7 = 0; i7 < 1024; i7++) {
/* 147 */                   if (this.I000II == null) {
/* 161 */                       O0000Ioio00.I000OOo1O("tembMlp");
/* 164 */                       throw null;
                            }
/* 157 */                   d2 += r11[i6 + i7] * fArr2[i7];
                        }
/* 166 */               fArr4[i5] = (float) d2;
                    }
/* 437 */           return fArr4;
                }
            }
