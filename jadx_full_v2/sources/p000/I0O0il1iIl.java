            package p000;

            import android.content.ContentValues;
            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.Color;
            import android.net.Uri;
            import android.os.Environment;
            import android.provider.MediaStore;
            import android.speech.tts.TextToSpeech;
            import android.speech.tts.Voice;
            import android.util.Log;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.ai.edge.litert.TensorBuffer;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.MappedByteBuffer;
            import java.nio.ShortBuffer;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Random;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
/* 14 */    public final class I0O0il1iIl extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final Object I00iiI;
                public Object I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0O0il1iIl(String str, Function1 function1, String str2, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(2, iOoil1iiIilo);
/* 3 */             this.I00iOIl = 10;
/* 5 */             this.I00iio = str;
/* 7 */             this.I00iiO = function1;
/* 9 */             this.I00iiI = str2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:122:0x0325, code lost:
                
                    r30 = r2;
                    r15 = r24;
                    r2 = r25;
                    r5 = new float[2359296];
                    r19 = r8;
                    java.lang.System.arraycopy(r2, 0, r5, 0, r2.length);
                    java.lang.System.arraycopy(r15, 0, r5, r2.length, r15.length);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:123:0x033b, code lost:
                
                    r2 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:124:0x033c, code lost:
                
                    r8 = r0.I000o00OoI0I;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:125:0x033f, code lost:
                
                    if (r2 >= 4) goto L210;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:126:0x0341, code lost:
                
                    if (r8 == false) goto L128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:128:0x0345, code lost:
                
                    r8 = r2 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:129:0x0347, code lost:
                
                    r6.invoke("Step " + r3 + "/4 · single " + r8 + "/4", java.lang.Float.valueOf((r2 * 0.015f) + (0.08f + r11)));
                    r8 = new java.lang.StringBuilder();
                    r8.append("kc_single");
                    r8.append(r2);
                    r8.append(".tflite");
                    r2 = r8.toString();
                    r8 = r0.I000O01llI0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:130:0x038d, code lost:
                
                    if (r8 == null) goto L197;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:131:0x038f, code lost:
                
                    r13 = r0.I000OOo1O;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:132:0x0391, code lost:
                
                    if (r13 == null) goto L198;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:133:0x0393, code lost:
                
                    r5 = (float[]) r0.I00000oOI(r9, r2, p000.IOOi1I.I000O01llI0(r5, r8, r13, r10)).get(0);
                    r2 = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:134:0x03aa, code lost:
                
                    p000.O0000Ioio00.I000OOo1O("ditSin");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:135:0x03ad, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:136:0x03ae, code lost:
                
                    p000.O0000Ioio00.I000OOo1O("ditCos");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:137:0x03b1, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:138:0x03b2, code lost:
                
                    if (r8 == false) goto L140;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:140:0x03b6, code lost:
                
                    r6.invoke("Step " + r3 + "/4 · final", java.lang.Float.valueOf(r11 + 0.145f));
                    r8 = r0.I000iOII;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:141:0x03d9, code lost:
                
                    if (r8 == null) goto L200;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:142:0x03db, code lost:
                
                    r2 = (float[]) r0.I00000oOI(r9, "kc_final.tflite", p000.IOOi1I.I000O01llI0(r5, r8[r30])).get(0);
                    r5 = r0.I000OiO;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:143:0x03f2, code lost:
                
                    if (r5 == null) goto L201;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:144:0x03f4, code lost:
                
                    r8 = r5[r3] - r5[r30];
                    r5 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:145:0x03fd, code lost:
                
                    if (r5 >= 32768) goto L211;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:146:0x03ff, code lost:
                
                    r4[r5] = (r2[r5] * r8) + r4[r5];
                    r5 = r5 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:148:0x040f, code lost:
                
                    p000.O0000Ioio00.I000OOo1O(r21);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:149:0x0412, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:150:0x0413, code lost:
                
                    p000.O0000Ioio00.I000OOo1O("temb");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:151:0x0416, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Removed duplicated region for block: B:164:0x04a3  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x04b8  */
                /* JADX WARN: Removed duplicated region for block: B:185:0x0152 A[EDGE_INSN: B:185:0x0152->B:63:0x0152 BREAK  A[LOOP:4: B:52:0x0135->B:62:0x014f], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:190:0x01e5 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x015b A[Catch: all -> 0x01d6, LOOP:6: B:64:0x0157->B:66:0x015b, LOOP_END, TryCatch #0 {all -> 0x01d6, blocks: (B:21:0x0081, B:23:0x0089, B:27:0x0092, B:29:0x0097, B:45:0x00fa, B:37:0x00c1, B:40:0x00d7, B:42:0x00dd, B:43:0x00e2, B:44:0x00f4, B:46:0x0105, B:47:0x0112, B:51:0x0130, B:56:0x013c, B:61:0x0148, B:62:0x014f, B:63:0x0152, B:66:0x015b, B:67:0x0164, B:71:0x016f, B:74:0x0177, B:76:0x01b9, B:78:0x01bd, B:81:0x01d9, B:82:0x01de, B:83:0x01df, B:84:0x01e4, B:85:0x01e5, B:87:0x01ef, B:90:0x01fa, B:91:0x020a, B:92:0x0210, B:94:0x021c, B:103:0x023e, B:106:0x0261, B:110:0x02a1, B:113:0x02a6, B:115:0x02f0, B:117:0x02f4, B:118:0x031d, B:119:0x0320, B:120:0x0321, B:121:0x0324, B:122:0x0325, B:129:0x0347, B:131:0x038f, B:133:0x0393, B:134:0x03aa, B:135:0x03ad, B:136:0x03ae, B:137:0x03b1, B:140:0x03b6, B:142:0x03db, B:144:0x03f4, B:146:0x03ff, B:148:0x040f, B:149:0x0412, B:150:0x0413, B:151:0x0416, B:152:0x0417, B:153:0x041a, B:156:0x041f, B:158:0x0452, B:159:0x0488, B:50:0x0125), top: B:168:0x007d }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x016f A[Catch: all -> 0x01d6, TRY_ENTER, TryCatch #0 {all -> 0x01d6, blocks: (B:21:0x0081, B:23:0x0089, B:27:0x0092, B:29:0x0097, B:45:0x00fa, B:37:0x00c1, B:40:0x00d7, B:42:0x00dd, B:43:0x00e2, B:44:0x00f4, B:46:0x0105, B:47:0x0112, B:51:0x0130, B:56:0x013c, B:61:0x0148, B:62:0x014f, B:63:0x0152, B:66:0x015b, B:67:0x0164, B:71:0x016f, B:74:0x0177, B:76:0x01b9, B:78:0x01bd, B:81:0x01d9, B:82:0x01de, B:83:0x01df, B:84:0x01e4, B:85:0x01e5, B:87:0x01ef, B:90:0x01fa, B:91:0x020a, B:92:0x0210, B:94:0x021c, B:103:0x023e, B:106:0x0261, B:110:0x02a1, B:113:0x02a6, B:115:0x02f0, B:117:0x02f4, B:118:0x031d, B:119:0x0320, B:120:0x0321, B:121:0x0324, B:122:0x0325, B:129:0x0347, B:131:0x038f, B:133:0x0393, B:134:0x03aa, B:135:0x03ad, B:136:0x03ae, B:137:0x03b1, B:140:0x03b6, B:142:0x03db, B:144:0x03f4, B:146:0x03ff, B:148:0x040f, B:149:0x0412, B:150:0x0413, B:151:0x0416, B:152:0x0417, B:153:0x041a, B:156:0x041f, B:158:0x0452, B:159:0x0488, B:50:0x0125), top: B:168:0x007d }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I00000oIO(Object obj) throws Throwable {
                    I0Oi111ii i0Oi111ii;
                    Bitmap bitmap;
                    Bitmap bitmapCreateBitmap;
                    String str;
                    int i;
                    float[] fArr;
                    int i2;
                    float[] fArr2;
                    int i3;
                    ArrayList arrayList;
                    int i4;
                    int i5;
                    float[] fArr3;
                    int i6;
                    String str2;
                    float[] fArr4;
                    float[] fArr5;
                    float fIntBitsToFloat;
                    int i7;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 10 */            Ili000 ili000 = (Ili000) this.I00iiO;
/* 14 */            String str3 = (String) this.I00iio;
/* 16 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 22 */            Ili0IOilll10 ili0IOilll10 = (Ili0IOilll10) this.I00iiI;
/* 28 */            I00oooO i00oooO = new I00oooO(21);
/* 31 */            i00oooO.I00iiI = ili0IOilll10;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            String str4 = "sigmas";
/* 42 */            File file = ili000.I0000Il00O;
/* 44 */            if (file == null || (i0Oi111ii = ili000.I00000oOI) == null) {
/* 46 */                bitmap = null;
/* 48 */                bitmapCreateBitmap = null;
                    } else {
/* 57 */                ili000.I000o00OoI0I = false;
                        try {
/* 66 */                    i00oooO.invoke("Encoding prompt", Float.valueOf(0.0f));
/* 86 */                    int[] iArrI00111O = i0Oi111ii.I00111O("<|im_start|>user\n" + str3 + "<|im_end|>\n<|im_start|>assistant\n<think>\n\n</think>\n\n");
/* 90 */                    int length = iArrI00111O.length;
/* 93 */                    int iMin = Math.min(length, Barcode.FORMAT_UPC_A);
/* 97 */                    int[] iArr = new int[Barcode.FORMAT_UPC_A];
/* 99 */                    int i8 = 0;
/* 100 */                   while (i8 < 512) {
/* 115 */                       iArr[i8] = i8 < iMin ? iArrI00111O[i8] : 151643;
/* 117 */                       i8++;
                            }
/* 120 */                   MappedByteBuffer mappedByteBuffer = ili000.I0000oI00;
/* 122 */                   bitmap = null;
/* 124 */                   int i9 = 2560;
                            try {
/* 126 */                       if (mappedByteBuffer != null) {
/* 130 */                           fArr = new float[1310720];
/* 132 */                           int i10 = 0;
/* 133 */                           i = 32768;
/* 136 */                           for (int i11 = Barcode.FORMAT_UPC_A; i10 < i11; i11 = Barcode.FORMAT_UPC_A) {
/* 138 */                               int i12 = iArr[i10];
/* 140 */                               if (i12 < 0 || i12 >= 151936) {
/* 275 */                                   str = str4;
/* 285 */                                   I000II.I0010I0i(IIlIOloOOO.I00100l0("token id ", i12, " out of range"));
                                        } else {
/* 147 */                                   int i13 = i12 * 5120;
/* 149 */                                   int i14 = 0;
/* 150 */                                   while (i14 < i9) {
/* 154 */                                       int i15 = (i10 * 2560) + i14;
/* 157 */                                       String str5 = str4;
/* 161 */                                       short s = mappedByteBuffer.getShort((i14 * 2) + i13);
/* 165 */                                       int i16 = s & 32768;
/* 167 */                                       MappedByteBuffer mappedByteBuffer2 = mappedByteBuffer;
/* 169 */                                       int i17 = s & 31744;
/* 171 */                                       int i18 = s & 1023;
/* 177 */                                       if (i17 == 31744) {
/* 189 */                                           fIntBitsToFloat = i18 == 0 ? i16 == 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY : Float.NaN;
                                                } else if (i17 != 0) {
/* 206 */                                           fIntBitsToFloat = Float.intBitsToFloat((((i17 >> 10) + 112) << 23) | (i16 << 16) | (i18 << 13));
                                                } else if (i18 != 0) {
/* 213 */                                           int i19 = -1;
/* 214 */                                           int i20 = i18;
                                                    while (true) {
/* 216 */                                               i7 = i19;
/* 220 */                                               if ((i20 & Barcode.FORMAT_UPC_E) != 0) {
                                                            break;
                                                        }
/* 222 */                                               i20 <<= 1;
/* 224 */                                               i19 = i7 + 1;
                                                    }
/* 240 */                                           fIntBitsToFloat = Float.intBitsToFloat(((i20 & 1023) << 13) | (i16 << 16) | ((112 - i7) << 23));
                                                } else {
/* 247 */                                           fIntBitsToFloat = Float.intBitsToFloat(i16 << 16);
                                                }
/* 251 */                                       fArr[i15] = fIntBitsToFloat;
/* 253 */                                       i14++;
/* 255 */                                       str4 = str5;
/* 257 */                                       mappedByteBuffer = mappedByteBuffer2;
/* 259 */                                       i9 = 2560;
                                            }
/* 266 */                                   i10++;
/* 268 */                                   i9 = 2560;
                                        }
                                    }
/* 291 */                           str = str4;
/* 307 */                           float[] fArr6 = new float[262144];
/* 309 */                           i2 = 0;
                                    while (true) {
/* 312 */                               if (i2 < 512) {
                                            break;
                                        }
/* 314 */                               int i21 = 0;
/* 315 */                               for (int i22 = Barcode.FORMAT_UPC_A; i21 < i22; i22 = Barcode.FORMAT_UPC_A) {
/* 329 */                                   fArr6[(i2 * Barcode.FORMAT_UPC_A) + i21] = (i21 > i2 || i21 >= iMin) ? -3.4028235E38f : 0.0f;
/* 331 */                                   i21++;
                                        }
/* 336 */                               i2++;
                                    }
/* 341 */                           fArr2 = new float[8388608];
/* 346 */                           for (i3 = 0; i3 < 32; i3++) {
/* 351 */                               System.arraycopy(fArr6, 0, fArr2, i3 * 262144, 262144);
                                    }
/* 360 */                           arrayList = new ArrayList(3);
/* 363 */                           i4 = 0;
                                    while (true) {
/* 366 */                               if (i4 < 3) {
/* 491 */                                   float[] fArr7 = new float[3932160];
/* 493 */                                   int i23 = 0;
/* 494 */                                   for (int i24 = 3; i23 < i24; i24 = 3) {
/* 500 */                                       float[] fArr8 = (float[]) arrayList.get(i23);
/* 505 */                                       for (int i25 = 0; i25 < 512; i25++) {
/* 516 */                                           System.arraycopy(fArr8, i25 * 2560, fArr7, (i23 * 2560) + (i25 * 7680), 2560);
                                                }
/* 525 */                                       i23++;
                                            }
/* 531 */                                   Random random = new Random(jCurrentTimeMillis);
/* 534 */                                   int i26 = i;
/* 536 */                                   float[] fArr9 = new float[i26];
/* 538 */                                   int i27 = 0;
/* 539 */                                   while (i27 < i26) {
/* 546 */                                       fArr9[i27] = (float) random.nextGaussian();
/* 548 */                                       i27++;
/* 550 */                                       i26 = 32768;
                                            }
/* 554 */                                   int i28 = 0;
                                            loop11: while (true) {
/* 555 */                                       boolean z = ili000.I000o00OoI0I;
/* 558 */                                       if (i28 < 4) {
/* 568 */                                           float f = (i28 * 0.16f) + 0.3f;
/* 569 */                                           if (z) {
                                                        break;
                                                    }
/* 573 */                                           i5 = i28 + 1;
/* 599 */                                           i00oooO.invoke("Step " + i5 + "/4 · prep", Float.valueOf(f));
/* 604 */                                           float[][] fArr10 = ili000.I000iOII;
/* 608 */                                           if (fArr10 == null) {
/* 1048 */                                              O0000Ioio00.I000OOo1O("temb");
/* 1051 */                                              throw null;
                                                    }
/* 620 */                                           ArrayList arrayListI00000oOI = ili000.I00000oOI(file, "kc_prep.tflite", IOOi1I.I000O01llI0(fArr9, fArr7, fArr10[i28]));
/* 629 */                                           float[] fArr11 = (float[]) arrayListI00000oOI.get(0);
/* 636 */                                           float[] fArr12 = (float[]) arrayListI00000oOI.get(1);
/* 645 */                                           float[] fArr13 = (float[]) arrayListI00000oOI.get(2);
/* 654 */                                           float[] fArr14 = (float[]) arrayListI00000oOI.get(3);
/* 660 */                                           float[] fArr15 = (float[]) arrayListI00000oOI.get(4);
/* 662 */                                           float[] fArr16 = fArr11;
/* 664 */                                           float[] fArr17 = fArr12;
/* 666 */                                           int i29 = 0;
                                                    while (true) {
/* 672 */                                               if (i29 >= 2) {
                                                            break;
                                                        }
/* 676 */                                               if (ili000.I000o00OoI0I) {
                                                            break loop11;
                                                        }
/* 679 */                                               int i30 = i29 + 1;
/* 683 */                                               StringBuilder sb = new StringBuilder();
/* 686 */                                               sb.append("Step ");
/* 689 */                                               sb.append(i5);
/* 692 */                                               int i31 = i28;
/* 696 */                                               sb.append("/4 · double ");
/* 699 */                                               sb.append(i30);
/* 704 */                                               sb.append("/2");
/* 726 */                                               i00oooO.invoke(sb.toString(), Float.valueOf((i29 * 0.02f) + 0.03f + f));
/* 745 */                                               String str6 = "kc_double" + i29 + ".tflite";
/* 749 */                                               float[] fArr18 = ili000.I000O01llI0;
/* 751 */                                               if (fArr18 == null) {
/* 802 */                                                   O0000Ioio00.I000OOo1O("ditCos");
/* 805 */                                                   throw null;
                                                        }
/* 753 */                                               float[] fArr19 = ili000.I000OOo1O;
/* 755 */                                               if (fArr19 == null) {
/* 798 */                                                   O0000Ioio00.I000OOo1O("ditSin");
/* 801 */                                                   throw null;
                                                        }
/* 769 */                                               ArrayList arrayListI00000oOI2 = ili000.I00000oOI(file, str6, IOOi1I.I000O01llI0(fArr16, fArr17, fArr18, fArr19, fArr13, fArr14));
/* 780 */                                               fArr16 = (float[]) arrayListI00000oOI2.get(0);
/* 789 */                                               fArr17 = (float[]) arrayListI00000oOI2.get(1);
/* 791 */                                               i29 = i30;
/* 792 */                                               i28 = i31;
                                                    }
                                                } else if (!z) {
/* 1065 */                                          i00oooO.invoke("Decoding image", Float.valueOf(0.95f));
/* 1087 */                                          float[] fArr20 = (float[]) ili000.I00000oOI(file, "kv_vae.tflite", Collections.singletonList(ili000.I0000O(fArr9))).get(0);
/* 1097 */                                          i00oooO.invoke("Done", Float.valueOf(1.0f));
/* 1102 */                                          int[] iArr2 = new int[65536];
/* 1105 */                                          for (int i32 = 0; i32 < 65536; i32++) {
/* 1156 */                                              iArr2[i32] = Color.rgb((int) ((lIiioliIlo.I00000oOI((fArr20[i32] / 2.0f) + 0.5f, 0.0f, 1.0f) * 255.0f) + 0.5f), (int) ((lIiioliIlo.I00000oOI((fArr20[65536 + i32] / 2.0f) + 0.5f, 0.0f, 1.0f) * 255.0f) + 0.5f), (int) ((lIiioliIlo.I00000oOI((fArr20[131072 + i32] / 2.0f) + 0.5f, 0.0f, 1.0f) * 255.0f) + 0.5f));
                                                    }
/* 1165 */                                          bitmapCreateBitmap = Bitmap.createBitmap(iArr2, Barcode.FORMAT_QR_CODE, Barcode.FORMAT_QR_CODE, Bitmap.Config.ARGB_8888);
                                                }
/* 1035 */                                      i28 = i5;
/* 1036 */                                      fArr7 = fArr3;
                                            }
                                        } else {
/* 370 */                                   if (ili000.I000o00OoI0I) {
                                                break;
                                            }
/* 376 */                                   i6 = i4 + 1;
/* 415 */                                   i00oooO.invoke("Text encoder " + i6 + "/3", Float.valueOf((i4 * 0.09f) + 0.02f));
/* 434 */                                   str2 = "ke_enc" + i4 + ".tflite";
/* 438 */                                   fArr4 = ili000.I0001Ioi1lo;
/* 440 */                                   if (fArr4 == null) {
/* 482 */                                       O0000Ioio00.I000OOo1O("encCos");
/* 485 */                                       throw null;
                                            }
/* 442 */                                   fArr5 = ili000.I000II;
/* 444 */                                   if (fArr5 == null) {
/* 476 */                                       O0000Ioio00.I000OOo1O("encSin");
/* 479 */                                       throw null;
                                            }
/* 464 */                                   fArr = (float[]) ili000.I00000oOI(file, str2, IOOi1I.I000O01llI0(fArr, fArr2, fArr4, fArr5)).get(0);
/* 466 */                                   arrayList.add(fArr);
/* 469 */                                   i4 = i6;
                                        }
                                    }
                                } else {
/* 36 */                            str = "sigmas";
/* 296 */                           i = 32768;
/* 301 */                           I000II.I001IO000("embed table not mapped");
                                }
/* 288 */                       fArr = null;
/* 307 */                       float[] fArr62 = new float[262144];
/* 309 */                       i2 = 0;
                                while (true) {
/* 312 */                           if (i2 < 512) {
                                    }
/* 336 */                           i2++;
                                }
/* 341 */                       fArr2 = new float[8388608];
/* 346 */                       while (i3 < 32) {
                                }
/* 360 */                       arrayList = new ArrayList(3);
/* 363 */                       i4 = 0;
                                while (true) {
/* 366 */                           if (i4 < 3) {
                                    }
/* 464 */                           fArr = (float[]) ili000.I00000oOI(file, str2, IOOi1I.I000O01llI0(fArr, fArr2, fArr4, fArr5)).get(0);
/* 466 */                           arrayList.add(fArr);
/* 469 */                           i4 = i6;
                                }
                            } catch (Throwable th) {
/* 471 */                       th = th;
/* 1175 */                      Log.e("FluxKleinEngine", "generate failed", th);
/* 372 */                       bitmapCreateBitmap = bitmap;
/* 1184 */                      OlO0OIIl1 olO0OIIl1 = ((Ili0IOilll10) this.I00iiI).I00000oOI;
/* 1227 */                      if (bitmapCreateBitmap == null) {
                                }
/* 1231 */                      olO0OIIl1.getClass();
/* 1236 */                      olO0OIIl1.I000lI(bitmap, ili00oiIllII00000oIO);
/* 1239 */                      return OoiIlOl1iI.I00000oIO;
                            }
                        } catch (Throwable th2) {
/* 107 */                   th = th2;
/* 108 */                   bitmap = null;
                        }
                    }
/* 1184 */          OlO0OIIl1 olO0OIIl12 = ((Ili0IOilll10) this.I00iiI).I00000oOI;
/* 1227 */          Ili00oiIllI ili00oiIllII00000oIO = bitmapCreateBitmap == null ? Ili00oiIllI.I00000oIO((Ili00oiIllI) olO0OIIl12.getValue(), null, false, "", 0.0f, bitmapCreateBitmap, null, false, 97) : Ili00oiIllI.I00000oIO((Ili00oiIllI) olO0OIIl12.getValue(), null, false, "", 0.0f, null, "Generation failed or was cancelled — check logcat.", false, 81);
/* 1231 */          olO0OIIl12.getClass();
/* 1236 */          olO0OIIl12.I000lI(bitmap, ili00oiIllII00000oIO);
/* 1239 */          return OoiIlOl1iI.I00000oIO;
                }

                private final Object I000II(Object obj) throws Throwable {
                    I1i1lO11OOO i1i1lO11OOO;
                    InputStream fileInputStream;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 10 */            Context context = (Context) this.I00iiO;
/* 14 */            Uri uri = (Uri) this.I00iio;
/* 19 */            Function1 function1 = (Function1) this.I00iiI;
                    try {
/* 27 */                if (uri.getScheme() == null || O0000Ioio00.I0000O(uri.getScheme(), "file")) {
/* 56 */                    String path = uri.getPath();
/* 60 */                    if (path == null) {
/* 62 */                        path = "";
                            }
/* 64 */                    fileInputStream = new FileInputStream(path);
                        } else {
/* 46 */                    fileInputStream = context.getContentResolver().openInputStream(uri);
                        }
                    } catch (Exception e) {
/* 339 */               Log.e("AGUtils", "Failed to convert wav to mono", e);
                    }
/* 67 */            if (fileInputStream == null) {
/* 69 */                i1i1lO11OOO = null;
                    } else {
/* 72 */                byte[] bArrI00000oOI = iOiOlIoI.I00000oOI(fileInputStream);
/* 76 */                fileInputStream.close();
/* 82 */                if (bArrI00000oOI.length < 44) {
/* 86 */                    Log.e("AGUtils", "Not a valid wav file");
/* 69 */                    i1i1lO11OOO = null;
                        } else {
/* 91 */                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrI00000oOI, 0, 44);
/* 95 */                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
/* 97 */                    ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
/* 103 */                   short s = byteBufferOrder.getShort(22);
/* 109 */                   int i = byteBufferOrder.getInt(24);
/* 115 */                   short s2 = byteBufferOrder.getShort(34);
/* 120 */                   byte[] bArrI00100l0 = I1IoiO1l.I00100l0(bArrI00000oOI, 44, bArrI00000oOI.length);
/* 127 */                   if (s2 == 8) {
/* 131 */                       byte[] bArr = new byte[bArrI00100l0.length * 2];
/* 137 */                       ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr).order(byteOrder);
/* 143 */                       for (byte b : bArrI00100l0) {
/* 154 */                           byteBufferOrder2.putShort((short) (((b & 255) - 128) * Barcode.FORMAT_QR_CODE));
                                }
/* 160 */                       bArrI00100l0 = bArr;
                            }
/* 171 */                   ShortBuffer shortBufferAsShortBuffer = ByteBuffer.wrap(bArrI00100l0).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
/* 175 */                   int iRemaining = shortBufferAsShortBuffer.remaining();
/* 179 */                   short[] sArrCopyOfRange = new short[iRemaining];
/* 181 */                   shortBufferAsShortBuffer.get(sArrCopyOfRange);
/* 186 */                   if (i < 16000) {
/* 188 */                       if (i != 16000) {
/* 197 */                           double d = 16000.0d / i;
/* 200 */                           int i2 = (int) (iRemaining * d);
/* 201 */                           short[] sArr = new short[i2];
/* 204 */                           if (s == 1) {
/* 206 */                               int i3 = 0;
/* 207 */                               while (i3 < i2) {
/* 210 */                                   double d2 = i3 / d;
/* 211 */                                   short[] sArr2 = sArrCopyOfRange;
/* 217 */                                   int iFloor = (int) Math.floor(d2);
/* 221 */                                   double d3 = d2 - iFloor;
/* 250 */                                   sArr[i3] = (short) (((iFloor + 1 < iRemaining ? sArr2[r6] : 0.0d) * d3) + ((1.0d - d3) * (iFloor < iRemaining ? sArr2[iFloor] : 0.0d)));
/* 252 */                                   i3++;
/* 254 */                                   sArrCopyOfRange = sArr2;
                                        }
                                    }
/* 260 */                           sArrCopyOfRange = sArr;
                                }
/* 261 */                       i = WhisperEngine.SAMPLE_RATE;
                            }
/* 266 */                   if (s == 2) {
/* 269 */                       int length = sArrCopyOfRange.length / 2;
/* 270 */                       short[] sArr3 = new short[length];
/* 273 */                       for (int i4 = 0; i4 < length; i4++) {
/* 275 */                           int i5 = i4 * 2;
/* 286 */                           sArr3[i4] = (short) ((sArrCopyOfRange[i5] + sArrCopyOfRange[i5 + 1]) / 2);
                                }
/* 291 */                       sArrCopyOfRange = sArr3;
                            }
/* 294 */                   int i6 = 30 * i;
/* 296 */                   if (sArrCopyOfRange.length > i6) {
/* 299 */                       iOO1il1Ii1oo.I00000oIO(i6, sArrCopyOfRange.length);
/* 303 */                       sArrCopyOfRange = Arrays.copyOfRange(sArrCopyOfRange, 0, i6);
                            }
/* 315 */                   ByteBuffer byteBufferOrder3 = ByteBuffer.allocate(sArrCopyOfRange.length * 2).order(ByteOrder.LITTLE_ENDIAN);
/* 323 */                   byteBufferOrder3.asShortBuffer().put(sArrCopyOfRange);
/* 332 */                   i1i1lO11OOO = new I1i1lO11OOO(i, byteBufferOrder3.array());
                        }
                    }
/* 344 */           if (i1i1lO11OOO != null) {
/* 359 */               function1.invoke(Collections.singletonList(new I1i1lO11OOO(i1i1lO11OOO.I00000oOI, i1i1lO11OOO.I00000oIO)));
                    }
/* 362 */           return OoiIlOl1iI.I00000oIO;
                }

                private final Object I000O01llI0(Object obj) throws Throwable {
/* 3 */             Object obj2 = this.I00iiI;
/* 6 */             Bitmap bitmap = (Bitmap) obj2;
/* 8 */             Object obj3 = this.I00iio;
/* 11 */            Bitmap bitmap2 = (Bitmap) obj3;
/* 13 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 15 */            lIoii1l01l0i.I00000oOI(obj);
/* 22 */            CompiledModel compiledModel = ((O1lo00) this.I00iiO).I00000oIO;
/* 25 */            if (compiledModel == null) {
/* 24 */                return null;
                    }
                    try {
/* 34 */                if (bitmap2.getWidth() != 512 || bitmap2.getHeight() != 512) {
/* 284 */                   throw new IllegalArgumentException("src must be 512×512");
                        }
/* 46 */                if (bitmap.getWidth() != 512 || bitmap.getHeight() != 512) {
/* 276 */                   throw new IllegalArgumentException("mask must be 512×512");
                        }
/* 56 */                int[] iArr = new int[262144];
/* 72 */                ((Bitmap) obj3).getPixels(iArr, 0, Barcode.FORMAT_UPC_A, 0, 0, Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A);
/* 75 */                int[] iArr2 = new int[262144];
/* 94 */                ((Bitmap) obj2).getPixels(iArr2, 0, Barcode.FORMAT_UPC_A, 0, 0, Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A);
/* 99 */                float[] fArr = new float[1048576];
/* 101 */               float[] fArr2 = new float[262144];
/* 107 */               for (int i = 0; i < 262144; i++) {
/* 123 */                   float f = ((iArr2[i] >> 16) & 255) >= 128 ? 1.0f : 0.0f;
/* 124 */                   fArr2[i] = f;
/* 130 */                   fArr[i] = f - 0.5f;
/* 134 */                   int i2 = iArr[i];
/* 146 */                   fArr[262144 + i] = ((((i2 >> 16) & 255) / 127.5f) - 1.0f) * f;
/* 157 */                   fArr[524288 + i] = ((((i2 >> 8) & 255) / 127.5f) - 1.0f) * f;
/* 168 */                   fArr[786432 + i] = (((i2 & 255) / 127.5f) - 1.0f) * f;
                        }
/* 176 */               List listCreateInputBuffers$default = CompiledModel.createInputBuffers$default(compiledModel, 0, 1, null);
/* 180 */               List listCreateOutputBuffers$default = CompiledModel.createOutputBuffers$default(compiledModel, 0, 1, null);
/* 190 */               ((TensorBuffer) listCreateInputBuffers$default.get(0)).writeFloat(fArr);
/* 196 */               CompiledModel.run$default(compiledModel, listCreateInputBuffers$default, listCreateOutputBuffers$default, 0, 4, (Object) null);
/* 205 */               float[] fArr3 = ((TensorBuffer) listCreateOutputBuffers$default.get(0)).readFloat();
/* 209 */               int[] iArr3 = new int[262144];
/* 211 */               for (int i3 = 0; i3 < 262144; i3++) {
/* 213 */                   float f2 = fArr2[i3];
/* 257 */                   iArr3[i3] = Color.rgb(O1lo00.I00000oIO(fArr3[i3], f2, (iArr[i3] >> 16) & 255), O1lo00.I00000oIO(fArr3[262144 + i3], f2, (iArr[i3] >> 8) & 255), O1lo00.I00000oIO(fArr3[524288 + i3], f2, iArr[i3] & 255));
                        }
/* 264 */               return Bitmap.createBitmap(iArr3, Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A, Bitmap.Config.ARGB_8888);
                    } catch (Throwable th) {
/* 289 */               Log.e("MiGanEngine", "inpaint failed", th);
/* 24 */                return null;
                    }
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iio;
/* 5 */             Object obj3 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 568 */                   return new I0O0il1iIl((Map) this.I00iiO, (String) obj2, (OI10i0Il) obj3, iOoil1iiIilo, 0);
                        case 1:
/* 549 */                   return new I0O0il1iIl((OI10i0Il) obj3, this.I00iiO, obj2, iOoil1iiIilo, 1);
                        case 2:
/* 530 */                   return new I0O0il1iIl((Ol1o0O0O0) this.I00iiO, (String) obj2, (OI10i0Il) obj3, iOoil1iiIilo, 2);
                        case 3:
/* 511 */                   return new I0O0il1iIl(this.I00iiO, (OI10i0Il) obj3, obj2, iOoil1iiIilo, 3);
                        case 4:
/* 492 */                   return new I0O0il1iIl((II10ili1) this.I00iiO, (String) obj2, (II10oli) obj3, iOoil1iiIilo, 4);
                        case 5:
/* 473 */                   return new I0O0il1iIl((Context) this.I00iiO, (II10oli) obj2, (Bitmap) obj3, iOoil1iiIilo, 5);
                        case 6:
/* 452 */                   I0O0il1iIl i0O0il1iIl = new I0O0il1iIl(obj2, obj3, iOoil1iiIilo, 6);
/* 455 */                   i0O0il1iIl.I00iiO = obj;
/* 457 */                   return i0O0il1iIl;
                        case 7:
/* 440 */                   return new I0O0il1iIl((OI10i0Il) obj3, this.I00iiO, obj2, iOoil1iiIilo, 7);
                        case 8:
/* 421 */                   return new I0O0il1iIl((Ili000) this.I00iiO, (String) obj2, (Ili0IOilll10) obj3, iOoil1iiIilo, 8);
                        case 9:
/* 401 */                   return new I0O0il1iIl((Context) this.I00iiO, (Ili0IOilll10) obj2, (Bitmap) obj3, iOoil1iiIilo, 9);
                        case 10:
/* 381 */                   return new I0O0il1iIl((String) obj2, (Function1) this.I00iiO, (String) obj3, iOoil1iiIilo);
                        case 11:
/* 366 */                   return new I0O0il1iIl((Ol1o0O0O0) this.I00iiO, (Ol1o0O0O0) obj2, (OI10i0Il) obj3, iOoil1iiIilo, 11);
                        case 12:
/* 346 */                   return new I0O0il1iIl((IoI011li) this.I00iiO, (String) obj2, (File) obj3, iOoil1iiIilo, 12);
                        case 13:
/* 326 */                   return new I0O0il1iIl((Context) this.I00iiO, (IoiIII) obj2, (Bitmap) obj3, iOoil1iiIilo, 13);
                        case 14:
/* 306 */                   return new I0O0il1iIl((OilIlo) this.I00iiO, (Function1) obj2, (OI10i0Il) obj3, iOoil1iiIilo, 14);
                        case 15:
/* 286 */                   return new I0O0il1iIl((OI10i0Il) obj3, this.I00iiO, obj2, iOoil1iiIilo, 15);
                        case 16:
/* 266 */                   return new I0O0il1iIl((OI10i0Il) obj3, this.I00iiO, obj2, iOoil1iiIilo, 16);
                        case 17:
/* 246 */                   return new I0O0il1iIl((i001ll1) this.I00iiO, (Function1) obj2, (OI10i0Il) obj3, iOoil1iiIilo, 17);
                        case PoseLandmark.RIGHT_PINKY:
/* 224 */                   I0O0il1iIl i0O0il1iIl2 = new I0O0il1iIl((OO1io0l0) obj2, (OlooOo) obj3, iOoil1iiIilo, 18);
/* 227 */                   i0O0il1iIl2.I00iiO = obj;
/* 229 */                   return i0O0il1iIl2;
                        case PoseLandmark.LEFT_INDEX:
/* 211 */                   return new I0O0il1iIl(this.I00iiO, (OI10i0Il) obj3, obj2, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 189 */                   I0O0il1iIl i0O0il1iIl3 = new I0O0il1iIl(obj3, (String) obj2, iOoil1iiIilo, 20);
/* 192 */                   i0O0il1iIl3.I00iiO = obj;
/* 194 */                   return i0O0il1iIl3;
                        case PoseLandmark.LEFT_THUMB:
/* 174 */                   I0O0il1iIl i0O0il1iIl4 = new I0O0il1iIl(obj3, (String) obj2, iOoil1iiIilo, 21);
/* 177 */                   i0O0il1iIl4.I00iiO = obj;
/* 179 */                   return i0O0il1iIl4;
                        case PoseLandmark.RIGHT_THUMB:
/* 159 */                   I0O0il1iIl i0O0il1iIl5 = new I0O0il1iIl((String) obj2, (O1i0l0IO0i1) obj3, iOoil1iiIilo, 22);
/* 162 */                   i0O0il1iIl5.I00iiO = obj;
/* 164 */                   return i0O0il1iIl5;
                        case PoseLandmark.LEFT_HIP:
/* 146 */                   return new I0O0il1iIl((Context) this.I00iiO, (List) obj2, (Function1) obj3, iOoil1iiIilo, 23);
                        case PoseLandmark.RIGHT_HIP:
/* 126 */                   return new I0O0il1iIl((Context) this.I00iiO, (Uri) obj2, (Function1) obj3, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 106 */                   return new I0O0il1iIl((O1lo00) this.I00iiO, (Bitmap) obj2, (Bitmap) obj3, iOoil1iiIilo, 25);
                        case PoseLandmark.RIGHT_KNEE:
/* 86 */                    return new I0O0il1iIl((Context) this.I00iiO, (O1loIO) obj2, (Bitmap) obj3, iOoil1iiIilo, 26);
                        case 27:
/* 66 */                    return new I0O0il1iIl(this.I00iiO, obj2, obj3, iOoil1iiIilo, 27);
                        case PoseLandmark.RIGHT_ANKLE:
/* 46 */                    return new I0O0il1iIl((OOOIOO1) this.I00iiO, (Ol1o1llOII) obj2, (Ol1o1llOII) obj3, iOoil1iiIilo, 28);
                        default:
/* 26 */                    return new I0O0il1iIl(this.I00iiO, (OI10i0Il) obj3, obj2, iOoil1iiIilo, 29);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 429 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 415 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 2:
/* 401 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 3:
/* 387 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 4:
/* 373 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 5:
/* 359 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 6:
                            break;
                        case 7:
/* 330 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 8:
/* 316 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 9:
/* 302 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 10:
/* 288 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 11:
/* 274 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 12:
/* 260 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 13:
/* 246 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 14:
/* 232 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 15:
/* 218 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 16:
/* 204 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 17:
/* 190 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case PoseLandmark.RIGHT_PINKY:
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 161 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 147 */                   ((I0O0il1iIl) create((OOIoIlO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case PoseLandmark.LEFT_THUMB:
                            break;
                        case PoseLandmark.RIGHT_THUMB:
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 103 */                   ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 89 */                    ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case PoseLandmark.LEFT_KNEE:
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 60 */                    ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 27:
/* 46 */                    ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 32 */                    ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((I0O0il1iIl) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    String str;
                    O111OO1Oi o111OO1OiI0010I0i;
                    O111OO1Oi o111OO1OiI0010I0i2;
                    Bitmap bitmapCreateBitmap;
                    I0Oi111ii i0Oi111ii;
                    String str2;
                    String string;
                    Set<Voice> voices;
                    Bitmap bitmapI0000Il00O;
                    InputStream fileInputStream;
/* 5 */             int i = 2;
/* 6 */             str = "";
/* 22 */            int i2 = 1;
/* 23 */            byte b = 0;
/* 24 */            Object obj2 = null;
/* 24 */            Object[] objArr = 0;
/* 24 */            Object[] objArr2 = 0;
/* 24 */            Object[] objArr3 = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 2633 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 2635 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2640 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 2654 */                  String str3 = (String) ((Map) this.I00iiO).get((String) this.I00iio);
/* 6 */                     str = str3 != null ? str3 : "";
/* 2660 */                  List list = I0O0l00olII.I00000oIO;
/* 2662 */                  oI10i0Il.setValue(str);
/* 2665 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 2625 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 2627 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2630 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 2533 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 2535 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2540 */                  Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00iiO;
/* 2542 */                  ol1o0O0O0.clear();
/* 2549 */                  ol1o0O0O0.add((String) this.I00iio);
/* 2562 */                  List list2 = ((II0I0ili0) ((OI10i0Il) this.I00iiI).getValue()).I00000oIO;
/* 2568 */                  ArrayList arrayList = new ArrayList();
/* 2571 */                  Iterator it = list2.iterator();
/* 2579 */                  while (it.hasNext()) {
/* 2589 */                      O111Oli o111OliI0010I0i = ((II00Ol1Ii) it.next()).I00000oOI.I0010I0i();
/* 2606 */                      String strI001i1O0Ol = (o111OliI0010I0i == null || (o111OO1OiI0010I0i = o111OliI0010I0i.I0010I0i()) == null) ? null : o111OO1OiI0010I0i.I001i1O0Ol();
/* 2607 */                      if (strI001i1O0Ol != null) {
/* 2609 */                          arrayList.add(strI001i1O0Ol);
                                }
                            }
/* 2619 */                  ol1o0O0O0.addAll(IOOi0Ool1i.I001i1lo1io(arrayList));
/* 2622 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 2438 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 2440 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2445 */                  Ol1o0O0O0 ol1o0O0O02 = (Ol1o0O0O0) this.I00iiO;
/* 2447 */                  ol1o0O0O02.clear();
/* 2460 */                  List list3 = ((II0I0ili0) ((OI10i0Il) this.I00iiI).getValue()).I00000oIO;
/* 2466 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iio;
/* 2470 */                  ArrayList arrayList2 = new ArrayList();
/* 2481 */                  for (Object obj3 : list3) {
/* 2492 */                      O111Oli o111OliI0010I0i2 = ((II00Ol1Ii) obj3).I00000oOI.I0010I0i();
/* 2520 */                      if (O0000Ioio00.I0000O((o111OliI0010I0i2 == null || (o111OO1OiI0010I0i2 = o111OliI0010I0i2.I0010I0i()) == null) ? null : o111OO1OiI0010I0i2.I001i1O0Ol(), (String) oI10i0Il2.getValue())) {
/* 2522 */                          arrayList2.add(obj3);
                                }
                            }
/* 2526 */                  ol1o0O0O02.addAll(arrayList2);
/* 2529 */                  return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 1896 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 1898 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1903 */                  II10ili1 iI10ili1 = (II10ili1) this.I00iiO;
/* 1907 */                  String str4 = (String) this.I00iio;
/* 1909 */                  long jCurrentTimeMillis = System.currentTimeMillis();
/* 1915 */                  II10oli iI10oli = (II10oli) this.I00iiI;
/* 1920 */                  I00oooO i00oooO = new I00oooO(6);
/* 1923 */                  i00oooO.I00iiI = iI10oli;
/* 1925 */                  VarHandle.storeStoreFence();
/* 1930 */                  File file = iI10ili1.I0000Il00O;
/* 1932 */                  if (file == null || (i0Oi111ii = iI10ili1.I00000oOI) == null) {
/* 2252 */                      bitmapCreateBitmap = null;
                            } else {
/* 1942 */                      iI10ili1.I000O01llI0 = false;
                                try {
/* 1951 */                          i00oooO.invoke("Encoding prompt", Float.valueOf(0.0f));
/* 1971 */                          int[] iArrI00111O = i0Oi111ii.I00111O("<|im_start|>user\n" + str4 + "<|im_end|>\n<|im_start|>assistant\n<think>\n\n</think>\n\n");
/* 1978 */                          int iMin = Math.min(iArrI00111O.length, Barcode.FORMAT_QR_CODE);
/* 1982 */                          int[] iArr = new int[Barcode.FORMAT_QR_CODE];
/* 1984 */                          int i3 = 0;
/* 1985 */                          while (i3 < 256) {
/* 1998 */                              iArr[i3] = i3 < iMin ? iArrI00111O[i3] : 151643;
/* 2000 */                              i3++;
                                    }
/* 2003 */                          int[] iArr2 = new int[Barcode.FORMAT_QR_CODE];
/* 2005 */                          int i4 = 0;
/* 2006 */                          while (i4 < 256) {
/* 2013 */                              iArr2[i4] = i4 < iMin ? 1 : 0;
/* 2015 */                              i4++;
                                    }
/* 2020 */                          if (!iI10ili1.I000O01llI0) {
/* 2033 */                              i00oooO.invoke("Text encoder", Float.valueOf(0.05f));
/* 2054 */                              float[] fArr = (float[]) II10ili1.I0000oI00(iI10ili1, file, "textenc_int4.tflite", IOOi1I.I000O01llI0(iArr, iArr2)).get(0);
/* 2061 */                              double dExp = Math.exp(2.0306897079499455d);
/* 2066 */                              float[] fArr2 = new float[5];
/* 2068 */                              int i5 = 0;
/* 2070 */                              while (i5 < 4) {
/* 2091 */                                  fArr2[i5] = (float) (dExp / (((1.0d / ((((-0.75d) * i5) / 3.0d) + 1.0d)) - 1.0d) + dExp));
/* 2093 */                                  i5++;
/* 2095 */                                  b = b;
                                        }
/* 2099 */                              int i6 = b;
/* 2101 */                              fArr2[4] = 0.0f;
/* 2105 */                              Random random = new Random(jCurrentTimeMillis);
/* 2110 */                              float[] fArr3 = new float[131072];
/* 2114 */                              for (int i7 = i6; i7 < 131072; i7++) {
/* 2121 */                                  fArr3[i7] = (float) random.nextGaussian();
                                        }
/* 2126 */                              int i8 = i6;
                                        while (true) {
/* 2128 */                                  boolean z = iI10ili1.I000O01llI0;
/* 2130 */                                  if (i8 < 4) {
/* 2132 */                                      if (!z) {
/* 2136 */                                          int i9 = i8 + 1;
/* 2179 */                                          i00oooO.invoke("Step " + i9 + "/4", Float.valueOf(((i8 * 0.7f) / 4.0f) + 0.2f));
/* 2184 */                                          float[] fArr4 = new float[i2];
/* 2186 */                                          fArr4[i6] = fArr2[i8];
/* 2224 */                                          float[] fArr5 = (float[]) II10ili1.I0000oI00(iI10ili1, file, "dit_gpu_int4b32.tflite", IOOi1I.I000O01llI0(fArr3, fArr, fArr4, (float[]) iI10ili1.I0001Ioi1lo.getValue(), (float[]) iI10ili1.I000II.getValue())).get(i6);
/* 2230 */                                          float f = fArr2[i9] - fArr2[i8];
/* 2232 */                                          for (int i10 = 0; i10 < 131072; i10++) {
/* 2240 */                                              fArr3[i10] = (fArr5[i10] * f) + fArr3[i10];
                                                    }
/* 2245 */                                          i8 = i9;
/* 2246 */                                          i2 = 1;
/* 2247 */                                          i6 = 0;
                                                }
                                            } else if (!z) {
/* 2264 */                                      i00oooO.invoke("Decoding image", Float.valueOf(0.93f));
/* 2286 */                                      float[] fArr6 = (float[]) II10ili1.I0000oI00(iI10ili1, file, "vae_dec_fp32.tflite", Collections.singletonList(iI10ili1.I00000oIO(fArr3))).get(0);
/* 2296 */                                      i00oooO.invoke("Done", Float.valueOf(1.0f));
/* 2301 */                                      int[] iArr3 = new int[262144];
/* 2303 */                                      for (int i11 = 0; i11 < 262144; i11++) {
/* 2353 */                                          iArr3[i11] = Color.rgb((int) ((lIiioliIlo.I00000oOI((fArr6[i11] / 2.0f) + 0.5f, 0.0f, 1.0f) * 255.0f) + 0.5f), (int) ((lIiioliIlo.I00000oOI((fArr6[262144 + i11] / 2.0f) + 0.5f, 0.0f, 1.0f) * 255.0f) + 0.5f), (int) ((lIiioliIlo.I00000oOI((fArr6[524288 + i11] / 2.0f) + 0.5f, 0.0f, 1.0f) * 255.0f) + 0.5f));
                                                }
/* 2362 */                                      bitmapCreateBitmap = Bitmap.createBitmap(iArr3, Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A, Bitmap.Config.ARGB_8888);
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
/* 2372 */                          Log.e("BonsaiEngine", "generate failed", th);
                                }
/* 2252 */                      bitmapCreateBitmap = null;
                            }
/* 2380 */                  OlO0OIIl1 olO0OIIl1 = ((II10oli) this.I00iiI).I00000oOI;
/* 2423 */                  II10ol01 iI10ol01I00000oIO = bitmapCreateBitmap != null ? II10ol01.I00000oIO((II10ol01) olO0OIIl1.getValue(), null, false, "", 0.0f, bitmapCreateBitmap, null, false, 97) : II10ol01.I00000oIO((II10ol01) olO0OIIl1.getValue(), null, false, "", 0.0f, null, "Generation failed or was cancelled — check logcat.", false, 81);
/* 2427 */                  olO0OIIl1.getClass();
/* 2431 */                  olO0OIIl1.I000lI(null, iI10ol01I00000oIO);
/* 2434 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 1771 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 1773 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1782 */                  String strI000l1 = IlIi0I0.I000l1(System.currentTimeMillis(), "bonsai_", ".png");
/* 1788 */                  ContentValues contentValues = new ContentValues();
/* 1791 */                  contentValues.put("_display_name", strI000l1);
/* 1794 */                  contentValues.put("mime_type", "image/png");
/* 1814 */                  contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/LocalDiffusion");
/* 1819 */                  Context context = (Context) this.I00iiO;
/* 1827 */                  Uri uriInsert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
/* 1831 */                  if (uriInsert != null) {
/* 1835 */                      II10oli iI10oli2 = (II10oli) this.I00iio;
/* 1839 */                      Bitmap bitmap = (Bitmap) this.I00iiI;
/* 1845 */                      OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
/* 1849 */                      if (outputStreamOpenOutputStream != null) {
                                    try {
/* 1853 */                              bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
/* 1856 */                              outputStreamOpenOutputStream.close();
                                    } finally {
                                        try {
/* 1862 */                                  throw th;
                                        } finally {
                                        }
                                    }
                                }
/* 1868 */                      OlO0OIIl1 olO0OIIl12 = iI10oli2.I00000oOI;
/* 1890 */                      olO0OIIl12.I000lI(null, II10ol01.I00000oIO((II10ol01) olO0OIIl12.getValue(), null, false, null, 0.0f, null, null, true, 63));
                            }
/* 1893 */                  return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 1728 */                  Ooli101Iii1 ooli101Iii1 = (Ooli101Iii1) this.I00iiO;
/* 1730 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 1732 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1739 */                  Ooli001 ooli001 = (Ooli001) ooli101Iii1.I00100o1O0lo();
/* 1743 */                  String str5 = (String) this.I00iio;
/* 1747 */                  String str6 = (String) this.I00iiI;
/* 1749 */                  str6.getClass();
/* 1752 */                  ooli001.I0000O();
/* 1763 */                  ((Ooli101Iii1) ooli001.I00iiI).I001i1O0Ol().put(str5, str6);
/* 1766 */                  return ooli001.I00000oOI();
                        case 7:
/* 1648 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 1650 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1661 */                  Set<OI1OloOIO1O> set = (Set) ((OI10i0Il) this.I00iiI).getValue();
/* 1667 */                  Iii0iOoIo iii0iOoIo = (Iii0iOoIo) this.I00iiO;
/* 1671 */                  Ol1o0O0O0 ol1o0O0O03 = (Ol1o0O0O0) this.I00iio;
/* 1681 */                  for (OI1OloOIO1O oI1OloOIO1O : set) {
/* 1707 */                      if (!((List) iii0iOoIo.I00000oOI().I0000oI00.I00iOIl.getValue()).contains(oI1OloOIO1O) && !ol1o0O0O03.contains(oI1OloOIO1O)) {
/* 1719 */                          iii0iOoIo.I00000oOI().I00000oOI(oI1OloOIO1O);
                                }
                            }
/* 1723 */                  return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 1643 */                  return I00000oIO(obj);
                        case 9:
/* 1518 */                  Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 1520 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1529 */                  String strI000l12 = IlIi0I0.I000l1(System.currentTimeMillis(), "flux_klein_", ".png");
/* 1535 */                  ContentValues contentValues2 = new ContentValues();
/* 1538 */                  contentValues2.put("_display_name", strI000l12);
/* 1541 */                  contentValues2.put("mime_type", "image/png");
/* 1561 */                  contentValues2.put("relative_path", Environment.DIRECTORY_PICTURES + "/LocalDiffusion");
/* 1566 */                  Context context2 = (Context) this.I00iiO;
/* 1574 */                  Uri uriInsert2 = context2.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues2);
/* 1578 */                  if (uriInsert2 != null) {
/* 1582 */                      Ili0IOilll10 ili0IOilll10 = (Ili0IOilll10) this.I00iio;
/* 1586 */                      Bitmap bitmap2 = (Bitmap) this.I00iiI;
/* 1592 */                      OutputStream outputStreamOpenOutputStream2 = context2.getContentResolver().openOutputStream(uriInsert2);
/* 1596 */                      if (outputStreamOpenOutputStream2 != null) {
                                    try {
/* 1600 */                              bitmap2.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream2);
/* 1603 */                              outputStreamOpenOutputStream2.close();
                                    } finally {
                                        try {
/* 1609 */                                  throw th;
                                        } finally {
                                        }
                                    }
                                }
/* 1615 */                      OlO0OIIl1 olO0OIIl13 = ili0IOilll10.I00000oOI;
/* 1637 */                      olO0OIIl13.I000lI(null, Ili00oiIllI.I00000oIO((Ili00oiIllI) olO0OIIl13.getValue(), null, false, null, 0.0f, null, null, true, 63));
                            }
/* 1640 */                  return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 1489 */                  Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 1491 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1502 */                  if (OlOoOIi0o.I001l0I00((String) this.I00iio)) {
/* 1512 */                      ((Function1) this.I00iiO).invoke((String) this.I00iiI);
                            }
/* 1515 */                  return OoiIlOl1iI.I00000oIO;
                        case 11:
/* 1327 */                  Ol1o0O0O0 ol1o0O0O04 = (Ol1o0O0O0) this.I00iio;
/* 1331 */                  Ol1o0O0O0 ol1o0O0O05 = (Ol1o0O0O0) this.I00iiO;
/* 1333 */                  Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 1335 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1340 */                  LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 1345 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiI;
/* 1347 */                  List list4 = Io0IlOI0l.I00000oIO;
/* 1357 */                  Iterator it2 = ((O1oiOloOo) oI10i0Il3.getValue()).I00000oIO.iterator();
/* 1365 */                  while (it2.hasNext()) {
/* 1375 */                      Iterator it3 = ((OloIl1l1oOii) it2.next()).I000OiO.iterator();
/* 1383 */                      while (it3.hasNext()) {
/* 1391 */                          linkedHashSet.add((O1oIOiI11o0) it3.next());
                                }
                            }
/* 1408 */                  List listI00Ol1ll1 = IOOi0Ool1i.I00Ol1ll1(IOOi0Ool1i.I00iIi0i1o(linkedHashSet), new IliIiio1(18));
/* 1412 */                  ol1o0O0O05.clear();
/* 1415 */                  List list5 = listI00Ol1ll1;
/* 1419 */                  ArrayList arrayList3 = new ArrayList();
/* 1430 */                  for (Object obj4 : list5) {
/* 1441 */                      if (!((O1oIOiI11o0) obj4).I00IOO) {
/* 1443 */                          arrayList3.add(obj4);
                                }
                            }
/* 1447 */                  ol1o0O0O05.addAll(arrayList3);
/* 1450 */                  ol1o0O0O04.clear();
/* 1455 */                  ArrayList arrayList4 = new ArrayList();
/* 1466 */                  for (Object obj5 : list5) {
/* 1477 */                      if (((O1oIOiI11o0) obj5).I00IOO) {
/* 1479 */                          arrayList4.add(obj5);
                                }
                            }
/* 1483 */                  ol1o0O0O04.addAll(arrayList4);
/* 1486 */                  return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 1293 */                  Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 1295 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1319 */                  ((IoI011li) this.I00iiO).invoke((String) this.I00iio, new Long(((File) this.I00iiI).length()));
/* 1322 */                  return OoiIlOl1iI.I00000oIO;
                        case 13:
/* 1150 */                  Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 1152 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1161 */                  String strI000l13 = IlIi0I0.I000l1(System.currentTimeMillis(), "local_diffusion_", ".png");
/* 1167 */                  ContentValues contentValues3 = new ContentValues();
/* 1170 */                  contentValues3.put("_display_name", strI000l13);
/* 1173 */                  contentValues3.put("mime_type", "image/png");
/* 1193 */                  contentValues3.put("relative_path", Environment.DIRECTORY_PICTURES + "/LocalDiffusion");
/* 1198 */                  Context context3 = (Context) this.I00iiO;
/* 1206 */                  Uri uriInsert3 = context3.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues3);
/* 1210 */                  if (uriInsert3 != null) {
/* 1214 */                      IoiIII ioiIII = (IoiIII) this.I00iio;
/* 1218 */                      Bitmap bitmap3 = (Bitmap) this.I00iiI;
/* 1224 */                      OutputStream outputStreamOpenOutputStream3 = context3.getContentResolver().openOutputStream(uriInsert3);
/* 1228 */                      if (outputStreamOpenOutputStream3 != null) {
                                    try {
/* 1232 */                              bitmap3.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream3);
/* 1235 */                              outputStreamOpenOutputStream3.close();
                                    } finally {
                                    }
                                }
/* 1247 */                      OlO0OIIl1 olO0OIIl14 = ioiIII.I00000oOI;
/* 1287 */                      olO0OIIl14.I000lI(null, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl14.getValue(), null, null, 0, 0.0f, null, false, 0, 0, null, null, false, 0.0f, true, 4095));
                            }
/* 1290 */                  return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 1095 */                  OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 1097 */                  Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 1099 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1118 */                  Oil1oo000i oil1oo000i = (Oil1oo000i) IOOi0Ool1i.I00IoIO0lI(((OilIl00O1o) ((OI10i0Il) this.I00iiI).getValue()).I0000O);
/* 1120 */                  if (oil1oo000i != null && (str2 = oil1oo000i.I00000oIO) != null) {
/* 1127 */                      str = str2;
                            }
/* 1132 */                  if (str.length() != 0) {
/* 1139 */                      ((OilIlo) this.I00iiO).I0000oI00();
/* 1146 */                      ((Function1) this.I00iio).invoke(str);
                            }
/* 1149 */                  return ooiIlOl1iI;
                        case 15:
/* 1055 */                  Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 1057 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1074 */                  if (!((O1oiOloOo) ((OI10i0Il) this.I00iiO).getValue()).I000II.I001i1O0Ol) {
/* 1082 */                      ((OI10i0Il) this.I00iio).setValue(Boolean.FALSE);
/* 1089 */                      ((OI10i0Il) this.I00iiI).setValue(null);
                            }
/* 1092 */                  return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 968 */                   TextToSpeech textToSpeech = (TextToSpeech) this.I00iio;
/* 970 */                   Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 972 */                   lIoii1l01l0i.I00000oOI(obj);
/* 989 */                   if (((Boolean) ((OI10i0Il) this.I00iiI).getValue()).booleanValue() && (string = ((Context) this.I00iiO).getSharedPreferences("box_settings", 0).getString("tts_voice_name", null)) != null && (voices = textToSpeech.getVoices()) != null) {
/* 1017 */                      Iterator<T> it4 = voices.iterator();
                                while (true) {
/* 1025 */                          if (it4.hasNext()) {
/* 1027 */                              Object next = it4.next();
/* 1042 */                              if (O0000Ioio00.I0000O(((Voice) next).getName(), string)) {
/* 1044 */                                  obj2 = next;
                                        }
                                    }
                                }
/* 1045 */                      Voice voice = (Voice) obj2;
/* 1047 */                      if (voice != null) {
/* 1049 */                          textToSpeech.setVoice(voice);
                                }
                            }
/* 1052 */                  return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 925 */                   OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 927 */                   Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 929 */                   lIoii1l01l0i.I00000oOI(obj);
/* 942 */                   String str7 = ((i001ilIoI) ((OI10i0Il) this.I00iiI).getValue()).I0000Il00O;
/* 948 */                   if (str7.length() != 0) {
/* 955 */                       ((i001ll1) this.I00iiO).I0000oI00();
/* 962 */                       ((Function1) this.I00iio).invoke(str7);
                            }
/* 965 */                   return ooiIlOl1iI2;
                        case PoseLandmark.RIGHT_PINKY:
/* 888 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 890 */                   lIoii1l01l0i.I00000oOI(obj);
/* 895 */                   Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 897 */                   Ii01I10 ii01I10 = Ii01I10.I00iio;
/* 903 */                   OO1io0l0 oO1io0l0 = (OO1io0l0) this.I00iio;
/* 907 */                   OlooOo olooOo = (OlooOo) this.I00iiI;
/* 912 */                   iOi1II01i0.I0000O(ii0110, null, ii01I10, new IOoolOIio0lO(oO1io0l0, olooOo, objArr2 == true ? 1 : 0, i2), 1);
/* 920 */                   return iOi1II01i0.I0000O(ii0110, null, ii01I10, new IOoolOIio0lO(oO1io0l0, olooOo, objArr == true ? 1 : 0, i), 1);
                        case PoseLandmark.LEFT_INDEX:
/* 865 */                   Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 867 */                   lIoii1l01l0i.I00000oOI(obj);
/* 882 */                   iIoi0io.I00000oOI((Ill0oOi0) this.I00iiO, (OI10i0Il) this.I00iiI, (OI10i0Il) this.I00iio);
/* 885 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 551 */                   Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 553 */                   lIoii1l01l0i.I00000oOI(obj);
/* 558 */                   OOIoIlO oOIoIlO = (OOIoIlO) this.I00iiO;
/* 562 */                   IOi0llI iOi0llI = (IOi0llI) this.I00iiI;
/* 566 */                   String str8 = (String) this.I00iio;
/* 568 */                   I0oiil10Ili i0oiil10Ili = iOi0llI.I00000oIO;
/* 570 */                   i0oiil10Ili.getClass();
/* 577 */                   ArrayList arrayList5 = (ArrayList) i0oiil10Ili.I00iiO;
/* 581 */                   IIIOlol iIIOlol = (IIIOlol) i0oiil10Ili.I00ilI0I1;
/* 585 */                   ArrayList arrayList6 = (ArrayList) i0oiil10Ili.I00iio;
/* 587 */                   int i12 = i0oiil10Ili.I00iiI;
/* 589 */                   IiiliIioo0oi iiiliIioo0oi = new IiiliIioo0oi();
/* 593 */                   iiiliIioo0oi.I00000oOI = -1;
/* 595 */                   iiiliIioo0oi.I0000Il00O = 0;
/* 597 */                   iiiliIioo0oi.I0000O = 0;
/* 599 */                   iiiliIioo0oi.I0001Ioi1lo = 0;
/* 601 */                   iiiliIioo0oi.I000II = 0;
/* 603 */                   iiiliIioo0oi.I000O01llI0 = 0;
/* 610 */                   iiiliIioo0oi.I000oI1ioi = new O100010Iili();
/* 614 */                   ArrayList arrayList7 = new ArrayList();
/* 617 */                   iiiliIioo0oi.I00100l0 = arrayList7;
/* 624 */                   iiiliIioo0oi.I00100o1O0lo = new ArrayList();
/* 626 */                   iiiliIioo0oi.I000OiO = arrayList5;
/* 628 */                   iiiliIioo0oi.I000iOII = iIIOlol;
/* 630 */                   iiiliIioo0oi.I000l1 = arrayList6;
/* 632 */                   iiiliIioo0oi.I000lI = i12;
/* 636 */                   IiilOOioIoo iiilOOioIoo = new IiilOOioIoo(b);
/* 644 */                   iiilOOioIoo.I00000oOI = new IiilOI1o();
/* 646 */                   VarHandle.storeStoreFence();
/* 649 */                   iiiliIioo0oi.I000o00OoI0I = iiilOOioIoo;
/* 656 */                   arrayList7.add(new Iiili1Illo(iiilOOioIoo, 0));
/* 659 */                   VarHandle.storeStoreFence();
/* 662 */                   int i13 = 0;
                            while (true) {
/* 663 */                       int length = str8.length();
/* 667 */                       int i14 = i13;
                                while (true) {
/* 672 */                           if (i14 < length) {
/* 674 */                               char cCharAt = str8.charAt(i14);
/* 678 */                               if (cCharAt != '\n' && cCharAt != '\r') {
/* 682 */                                   i14++;
                                        }
                                    } else {
/* 685 */                               i14 = -1;
                                    }
                                }
/* 686 */                       if (i14 == -1) {
/* 723 */                           if (str8.length() > 0 && (i13 == 0 || i13 < str8.length())) {
/* 737 */                               iiiliIioo0oi.I000OOo1O(str8.substring(i13));
                                    }
/* 746 */                           iiiliIioo0oi.I0001Ioi1lo(iiiliIioo0oi.I00100l0.size());
/* 757 */                           IoloOio0I ioloOio0I = new IoloOio0I(15, iiiliIioo0oi.I000l1, iiiliIioo0oi.I000oI1ioi);
/* 762 */                           iiiliIioo0oi.I000iOII.getClass();
/* 765 */                           IollOIOOI00 iollOIOOI00I000OOo1O = IIIOlol.I000OOo1O(ioloOio0I);
/* 771 */                           Iterator it5 = iiiliIioo0oi.I00100o1O0lo.iterator();
/* 779 */                           while (it5.hasNext()) {
/* 787 */                               ((I00io1l) it5.next()).I000O01llI0(iollOIOOI00I000OOo1O);
                                    }
/* 795 */                           IiilOI1o iiilOI1o = (IiilOI1o) iiiliIioo0oi.I000o00OoI0I.I00000oOI;
/* 801 */                           Iterator it6 = ((ArrayList) i0oiil10Ili.I00ilO0).iterator();
/* 809 */                           while (it6.hasNext()) {
/* 815 */                               I1lOollOi1o i1lOollOi1o = (I1lOollOi1o) it6.next();
/* 817 */                               i1lOollOi1o.getClass();
/* 822 */                               O1I1OO o1i1oo = new O1I1OO(i, b);
/* 825 */                               o1i1oo.I00iiO = i1lOollOi1o;
/* 827 */                               o1i1oo.I00iiI = 0;
/* 829 */                               VarHandle.storeStoreFence();
/* 832 */                               iiilOI1o.getClass();
/* 835 */                               o1i1oo.I001IO000(iiilOI1o);
                                    }
/* 839 */                           if (iiilOI1o == null) {
/* 861 */                               I000II.I000iOII("Could not parse the given text content into a meaningful Markdown representation!");
/* 24 */                                return null;
                                    }
/* 841 */                           I1Oi1Oi0O i1Oi1Oi0OI00000oIO = iOOIoOoO0il1.I00000oIO(iiilOI1o, null, null);
/* 845 */                           if (i1Oi1Oi0OI00000oIO != null) {
/* 847 */                               oOIoIlO.setValue(i1Oi1Oi0OI00000oIO);
/* 850 */                               return OoiIlOl1iI.I00000oIO;
                                    }
/* 855 */                           I000II.I000iOII("Could not convert the generated Commonmark Node into an ASTNode!");
/* 24 */                            return null;
                                }
/* 692 */                       iiiliIioo0oi.I000OOo1O(str8.substring(i13, i14));
/* 695 */                       i13 = i14 + 1;
/* 701 */                       if (i13 < str8.length() && str8.charAt(i14) == '\r' && str8.charAt(i13) == '\n') {
/* 715 */                           i13 = i14 + 2;
                                }
                            }
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 473 */                   O1i1liOl o1i1liOl = (O1i1liOl) this.I00iiO;
/* 475 */                   Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 477 */                   lIoii1l01l0i.I00000oOI(obj);
/* 480 */                   Iool1IOO1o0i iool1IOO1o0iI00111O = o1i1liOl.I00111O();
/* 486 */                   String str9 = (String) this.I00iio;
/* 490 */                   ArrayList arrayList8 = new ArrayList();
/* 501 */                   for (Object obj6 : iool1IOO1o0iI00111O) {
/* 518 */                       if (!O0000Ioio00.I0000O(((O1i1OolO) obj6).I001i1O0Ol(), str9)) {
/* 520 */                           arrayList8.add(obj6);
                                }
                            }
/* 524 */                   O1i1l1 o1i1l1I001IIilI0O = O1i1liOl.I001IIilI0O();
/* 532 */                   ArrayList arrayListI00OI1 = IOOi0Ool1i.I00OI1(arrayList8, (O1i1OolO) this.I00iiI);
/* 536 */                   o1i1l1I001IIilI0O.I0000O();
/* 543 */                   ((O1i1liOl) o1i1l1I001IIilI0O.I00iiI).I0010I0i(arrayListI00OI1);
/* 546 */                   return o1i1l1I001IIilI0O.I00000oOI();
                        case PoseLandmark.RIGHT_THUMB:
/* 425 */                   Ooli101Iii1 ooli101Iii12 = (Ooli101Iii1) this.I00iiO;
/* 427 */                   Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 429 */                   lIoii1l01l0i.I00000oOI(obj);
/* 436 */                   Ooli001 ooli0012 = (Ooli001) ooli101Iii12.I00100o1O0lo();
/* 440 */                   String str10 = (String) this.I00iio;
/* 444 */                   O1i0l0IO0i1 o1i0l0IO0i1 = (O1i0l0IO0i1) this.I00iiI;
/* 446 */                   str10.getClass();
/* 449 */                   o1i0l0IO0i1.getClass();
/* 452 */                   ooli0012.I0000O();
/* 463 */                   ((Ooli101Iii1) ooli0012.I00iiI).I001IO000().put(str10, o1i0l0IO0i1);
/* 466 */                   return ooli0012.I00000oOI();
                        case PoseLandmark.LEFT_HIP:
/* 293 */                   OoiIlOl1iI ooiIlOl1iI3 = OoiIlOl1iI.I00000oIO;
/* 295 */                   Ii0111o ii0111o23 = Ii0111o.I00iOIl;
/* 297 */                   lIoii1l01l0i.I00000oOI(obj);
/* 303 */                   Context context4 = (Context) this.I00iiO;
/* 307 */                   List<Uri> list6 = (List) this.I00iio;
/* 311 */                   Function1 function1 = (Function1) this.I00iiI;
/* 315 */                   ArrayList arrayList9 = new ArrayList();
/* 326 */                   for (Uri uri : list6) {
                                try {
/* 338 */                           if (uri.getScheme() == null || O0000Ioio00.I0000O(uri.getScheme(), "file")) {
/* 366 */                               String path = uri.getPath();
/* 370 */                               if (path == null) {
/* 6 */                                     path = "";
                                        }
/* 373 */                               fileInputStream = new FileInputStream(path);
                                    } else {
/* 357 */                               fileInputStream = context4.getContentResolver().openInputStream(uri);
                                    }
                                } catch (Exception e) {
/* 403 */                           e.printStackTrace();
                                }
/* 376 */                       if (fileInputStream != null) {
/* 385 */                           int iI0000O = new Il1Ilio1Ol1(fileInputStream).I0000O(1, "Orientation");
/* 389 */                           fileInputStream.close();
/* 392 */                           Bitmap bitmapI00000oOI = li10oO000.I00000oOI(context4, uri);
/* 406 */                           bitmapI0000Il00O = bitmapI00000oOI != null ? li10oO000.I0000Il00O(bitmapI00000oOI, iI0000O) : null;
                                }
/* 407 */                       if (bitmapI0000Il00O != null) {
/* 409 */                           arrayList9.add(bitmapI0000Il00O);
                                }
                            }
/* 417 */                   if (!arrayList9.isEmpty()) {
/* 419 */                       function1.invoke(arrayList9);
                            }
/* 422 */                   return ooiIlOl1iI3;
                        case PoseLandmark.RIGHT_HIP:
/* 288 */                   return I000II(obj);
                        case PoseLandmark.LEFT_KNEE:
/* 283 */                   return I000O01llI0(obj);
                        case PoseLandmark.RIGHT_KNEE:
/* 157 */                   Ii0111o ii0111o24 = Ii0111o.I00iOIl;
/* 159 */                   lIoii1l01l0i.I00000oOI(obj);
/* 168 */                   String strI000l14 = IlIi0I0.I000l1(System.currentTimeMillis(), "migan_erase_", ".png");
/* 174 */                   ContentValues contentValues4 = new ContentValues();
/* 177 */                   contentValues4.put("_display_name", strI000l14);
/* 180 */                   contentValues4.put("mime_type", "image/png");
/* 200 */                   contentValues4.put("relative_path", Environment.DIRECTORY_PICTURES + "/LocalDiffusion");
/* 205 */                   Context context5 = (Context) this.I00iiO;
/* 213 */                   Uri uriInsert4 = context5.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues4);
/* 217 */                   if (uriInsert4 != null) {
/* 221 */                       O1loIO o1loIO = (O1loIO) this.I00iio;
/* 225 */                       Bitmap bitmap4 = (Bitmap) this.I00iiI;
/* 231 */                       OutputStream outputStreamOpenOutputStream4 = context5.getContentResolver().openOutputStream(uriInsert4);
/* 235 */                       if (outputStreamOpenOutputStream4 != null) {
                                    try {
/* 239 */                               bitmap4.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream4);
/* 242 */                               outputStreamOpenOutputStream4.close();
                                    } finally {
                                    }
                                }
/* 254 */                       OlO0OIIl1 olO0OIIl15 = o1loIO.I00000oOI;
/* 277 */                       olO0OIIl15.I000lI(null, O1loIIIOiO.I00000oIO((O1loIIIOiO) olO0OIIl15.getValue(), null, null, 0, null, 0.0f, false, null, true, 127));
                            }
/* 280 */                   return OoiIlOl1iI.I00000oIO;
                        case 27:
/* 122 */                   Ii0111o ii0111o25 = Ii0111o.I00iOIl;
/* 124 */                   lIoii1l01l0i.I00000oOI(obj);
/* 129 */                   OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iio;
/* 131 */                   List list7 = O1o0iO.I00000oIO;
/* 133 */                   oIooi1iOiOol.I000O01llI0(0);
/* 144 */                   ((OIool0l11) this.I00iiI).I000O01llI0(System.currentTimeMillis());
/* 151 */                   Ili1iIl.I00000oIO((Ili1iIl) this.I00iiO);
/* 154 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_ANKLE:
/* 71 */                    Ii0111o ii0111o26 = Ii0111o.I00iOIl;
/* 73 */                    lIoii1l01l0i.I00000oOI(obj);
/* 92 */                    for (OOOIIIIl oOOIIIIl : ((OOOIOO1) this.I00iiO).I00iiI.I00000oIO) {
/* 108 */                       ((Ol1o1llOII) this.I00iio).put(oOOIIIIl.I00000oOI, oOOIIIIl.I0000O);
                            }
/* 116 */                   ((Ol1o1llOII) this.I00iiI).clear();
/* 119 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 28 */                    Ii0111o ii0111o27 = Ii0111o.I00iOIl;
/* 30 */                    lIoii1l01l0i.I00000oOI(obj);
/* 35 */                    OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiI;
/* 49 */                    if (!((List) oI10i0Il4.getValue()).isEmpty()) {
/* 65 */                        iOi1II01i0.I0000O((Ii0110) this.I00iiO, null, null, new OOl101((O0o0I1i0O) this.I00iio, oI10i0Il4, objArr3 == true ? 1 : 0, b), 3);
                            }
/* 68 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public I0O0il1iIl(Object obj, OI10i0Il oI10i0Il, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 16 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iiI = oI10i0Il;
                    this.I00iio = obj2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public I0O0il1iIl(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 17 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00iiI = obj2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public I0O0il1iIl(Object obj, Object obj2, Object obj3, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 18 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                    this.I00iiI = obj3;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public I0O0il1iIl(Object obj, String str, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 19 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                    this.I00iio = str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 19 */        public I0O0il1iIl(OI10i0Il oI10i0Il, Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 20 */            this.I00iOIl = i;
                    this.I00iiI = oI10i0Il;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                }
            }
