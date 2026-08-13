            package p000;

            import android.content.Context;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.ai.edge.litert.TensorBuffer;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.File;
            import java.io.RandomAccessFile;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.charset.Charset;
            import java.text.Normalizer;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Random;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            
/* 19 */    public final class OlI01II0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public final String I00iiI;
                public final Function1 I00iiO;
                public final long I00iio;
                public final float I00ilI0I1;
                public final Context I00ilO0;
                public final Object I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OlI01II0(OlI0iOo olI0iOo, String str, float f, Function1 function1, long j, Context context, IOoil1iiIilo iOoil1iiIilo) {
/* 17 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00io1l = olI0iOo;
/* 6 */             this.I00iiI = str;
/* 8 */             this.I00ilI0I1 = f;
/* 10 */            this.I00iiO = function1;
/* 12 */            this.I00iio = j;
/* 14 */            this.I00ilO0 = context;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00io1l;
                    switch (i) {
                        case 0:
/* 45 */                    return new OlI01II0((OlI0iOo) obj2, this.I00iiI, this.I00ilI0I1, this.I00iiO, this.I00iio, this.I00ilO0, iOoil1iiIilo);
                        default:
/* 24 */                    return new OlI01II0((OlI0o1) obj2, this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((OlI01II0) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x010f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CompiledModel compiledModel;
                    CompiledModel compiledModel2;
                    OlI1Oi olI1Oi;
                    int i;
                    int[] iArrI00iIO;
                    String str;
                    int i2;
                    float[] fArr;
                    int[] iArr;
                    RandomAccessFile randomAccessFile;
                    CompiledModel compiledModel3;
                    CompiledModel compiledModel4;
                    o00io0IiOOo0 o00io0iiooo0;
                    float f;
                    int i3;
                    Iterator it;
                    int[] iArrI00iIO2;
                    float f2;
                    float[] fArr2;
/* 3 */             int i4 = this.I00iOIl;
/* 9 */             String str2 = this.I00iiI;
/* 11 */            Object obj2 = this.I00io1l;
/* 13 */            Function1 function1 = this.I00iiO;
/* 26 */            long j = this.I00iio;
/* 28 */            float f3 = this.I00ilI0I1;
                    switch (i4) {
                        case 0:
/* 1183 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 1185 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1188 */                  OlI0iOo olI0iOo = (OlI0iOo) obj2;
/* 1190 */                  CompiledModel compiledModel5 = olI0iOo.I00000oIO;
/* 1192 */                  if (compiledModel5 == null || (compiledModel = olI0iOo.I00000oOI) == null || (compiledModel2 = olI0iOo.I0000Il00O) == null || (olI1Oi = olI0iOo.I0000O) == null) {
/* 2243 */                      Object obj3 = null;
/* 2244 */                      I000II.I001IO000("not loaded");
/* 2247 */                      return obj3;
                            }
/* 1242 */                  String strConcat = "▁".concat(Pattern.compile("\\s+").matcher(OlOoOIi0o.I00OIo(Normalizer.normalize(str2, Normalizer.Form.NFKC)).toString()).replaceAll(" ").replace(' ', (char) 9601));
/* 1246 */                  int length = strConcat.length();
/* 1250 */                  if (length == 0) {
/* 1254 */                      iArrI00iIO = new int[]{1};
                            } else {
/* 1260 */                      int i5 = length + 1;
/* 1262 */                      float[] fArr3 = new float[i5];
/* 1264 */                      int i6 = 0;
                                while (true) {
/* 1265 */                          float f4 = -1.0E30f;
/* 1268 */                          if (i6 < i5) {
/* 1270 */                              if (i6 == 0) {
/* 1272 */                                  f4 = 0.0f;
                                        }
/* 1274 */                              fArr3[i6] = f4;
/* 1276 */                              i6++;
                                    } else {
/* 1279 */                              int[] iArr2 = new int[i5];
/* 1282 */                              for (int i7 = 0; i7 < i5; i7++) {
/* 1284 */                                  iArr2[i7] = -1;
                                        }
/* 1289 */                              int[] iArr3 = new int[i5];
/* 1292 */                              for (int i8 = 0; i8 < i5; i8++) {
/* 1296 */                                  iArr3[i8] = 2;
                                        }
/* 1301 */                              int i9 = 0;
/* 1302 */                              while (i9 < length) {
/* 1308 */                                  if (fArr3[i9] == f4) {
/* 1310 */                                      str = strConcat;
/* 1312 */                                      i2 = length;
/* 1314 */                                      fArr = fArr3;
/* 1316 */                                      iArr = iArr2;
                                            } else {
/* 1324 */                                      int iMin = Math.min(olI1Oi.I00000oOI, length - i9);
/* 1329 */                                      if (1 <= iMin) {
/* 1331 */                                          i2 = length;
/* 1333 */                                          int i10 = 1;
                                                    while (true) {
/* 1336 */                                              fArr = fArr3;
/* 1338 */                                              int i11 = i9 + i10;
/* 1340 */                                              iArr = iArr2;
/* 1350 */                                              Integer num = (Integer) olI1Oi.I00000oIO.get(strConcat.substring(i9, i11));
/* 1352 */                                              if (num != null) {
/* 1354 */                                                  int iIntValue = num.intValue();
/* 1358 */                                                  float f5 = fArr[i9];
/* 1360 */                                                  str = strConcat;
/* 1362 */                                                  float[] fArr4 = olI1Oi.I0000O;
/* 1364 */                                                  if (fArr4 == null) {
/* 1384 */                                                      O0000Ioio00.I000OOo1O("scores");
/* 1389 */                                                      throw null;
                                                            }
/* 1368 */                                                  float f6 = f5 + fArr4[iIntValue];
/* 1373 */                                                  if (f6 > fArr[i11]) {
/* 1375 */                                                      fArr[i11] = f6;
/* 1377 */                                                      iArr[i11] = i9;
/* 1379 */                                                      iArr3[i11] = iIntValue;
                                                            }
                                                        } else {
/* 1390 */                                                  str = strConcat;
                                                        }
/* 1392 */                                              if (i10 != iMin) {
/* 1394 */                                                  i10++;
/* 1396 */                                                  fArr3 = fArr;
/* 1398 */                                                  iArr2 = iArr;
/* 1400 */                                                  strConcat = str;
                                                        }
                                                    }
                                                } else {
/* 1403 */                                          str = strConcat;
/* 1405 */                                          i2 = length;
/* 1407 */                                          fArr = fArr3;
/* 1409 */                                          iArr = iArr2;
                                                }
/* 1415 */                                      float f7 = fArr[i9] + olI1Oi.I0000Il00O;
/* 1416 */                                      int i12 = i9 + 1;
/* 1422 */                                      if (f7 > fArr[i12]) {
/* 1424 */                                          fArr[i12] = f7;
/* 1426 */                                          iArr[i12] = i9;
/* 1430 */                                          iArr3[i12] = 2;
                                                }
                                            }
/* 1432 */                                  i9++;
/* 1434 */                                  length = i2;
/* 1436 */                                  fArr3 = fArr;
/* 1438 */                                  iArr2 = iArr;
/* 1440 */                                  strConcat = str;
/* 1442 */                                  f4 = -1.0E30f;
                                        }
/* 1449 */                              int[] iArr4 = iArr2;
/* 1453 */                              ArrayList arrayList = new ArrayList();
/* 1456 */                              while (length > 0) {
/* 1464 */                                  arrayList.add(Integer.valueOf(iArr3[length]));
/* 1467 */                                  length = iArr4[length];
                                        }
/* 1470 */                              Collections.reverse(arrayList);
/* 1477 */                              if (arrayList.isEmpty()) {
/* 1493 */                                  i = 1;
                                        } else {
/* 1489 */                                  i = 1;
/* 1490 */                                  if (((Number) IOOi0Ool1i.I00Io1o110i(arrayList)).intValue() != 1) {
                                            }
/* 1501 */                                  iArrI00iIO = IOOi0Ool1i.I00iIO(arrayList);
                                        }
/* 1498 */                              arrayList.add(Integer.valueOf(i));
/* 1501 */                              iArrI00iIO = IOOi0Ool1i.I00iIO(arrayList);
                                    }
                                }
                            }
/* 1507 */                  long[] jArr = new long[Barcode.FORMAT_ITF];
/* 1509 */                  long[] jArr2 = new long[Barcode.FORMAT_ITF];
/* 1512 */                  int iMin2 = Math.min(iArrI00iIO.length, Barcode.FORMAT_ITF);
/* 1517 */                  for (int i13 = 0; i13 < iMin2; i13++) {
/* 1522 */                      jArr[i13] = iArrI00iIO[i13];
/* 1524 */                      jArr2[i13] = 1;
                            }
/* 1532 */                  List listCreateInputBuffers$default = CompiledModel.createInputBuffers$default(compiledModel5, 0, 1, null);
/* 1536 */                  List listCreateOutputBuffers$default = CompiledModel.createOutputBuffers$default(compiledModel5, 0, 1, null);
/* 1546 */                  ((TensorBuffer) listCreateInputBuffers$default.get(0)).writeLong(jArr);
/* 1555 */                  ((TensorBuffer) listCreateInputBuffers$default.get(1)).writeLong(jArr2);
/* 1569 */                  ((TensorBuffer) listCreateInputBuffers$default.get(2)).writeFloat(new float[]{f3});
/* 1582 */                  CompiledModel.run$default(compiledModel5, listCreateInputBuffers$default, listCreateOutputBuffers$default, 0, 4, (Object) null);
/* 1593 */                  float[] fArr5 = ((TensorBuffer) listCreateOutputBuffers$default.get(0)).readFloat();
/* 1604 */                  float[] fArr6 = ((TensorBuffer) listCreateOutputBuffers$default.get(2)).readFloat();
/* 1608 */                  OlI0iOo.I00000oIO(listCreateInputBuffers$default);
/* 1611 */                  OlI0iOo.I00000oIO(listCreateOutputBuffers$default);
/* 1616 */                  float f8 = 0.1f;
/* 1622 */                  function1.invoke(new Float(0.1f));
/* 1627 */                  float[] fArr7 = new float[9];
/* 1633 */                  fArr7[0] = -6.0f;
/* 1639 */                  fArr7[8] = 2.0f;
/* 1641 */                  int i14 = 1;
/* 1642 */                  for (int i15 = 8; i14 < i15; i15 = 8) {
/* 1652 */                      fArr7[i14] = fArr7[i14 - 1] + 1.0f;
/* 1654 */                      i14++;
                            }
/* 1664 */                  for (int i16 = 0; i16 < 9; i16++) {
/* 1678 */                      fArr7[i16] = 1.0f / (((float) Math.exp(fArr7[i16])) + 1.0f);
                            }
/* 1685 */                  fArr7[0] = 1.0f;
/* 1689 */                  fArr7[8] = 0.0f;
/* 1693 */                  Random random = new Random(j);
/* 1698 */                  float[] fArr8 = new float[16384];
/* 1700 */                  int i17 = 0;
/* 1701 */                  while (i17 < 16384) {
/* 1705 */                      Random random2 = random;
/* 1711 */                      fArr8[i17] = (float) random2.nextGaussian();
/* 1713 */                      i17++;
/* 1715 */                      f8 = f8;
/* 1717 */                      random = random2;
                            }
/* 1719 */                  float f9 = f8;
/* 1724 */                  List listCreateInputBuffers$default2 = CompiledModel.createInputBuffers$default(compiledModel, 0, 1, null);
/* 1728 */                  List listCreateOutputBuffers$default2 = CompiledModel.createOutputBuffers$default(compiledModel, 0, 1, null);
/* 1738 */                  ((TensorBuffer) listCreateInputBuffers$default2.get(0)).writeFloat(fArr5);
/* 1747 */                  ((TensorBuffer) listCreateInputBuffers$default2.get(1)).writeFloat(fArr6);
/* 1750 */                  int i18 = 0;
/* 1753 */                  while (i18 < 8) {
/* 1755 */                      float f10 = fArr7[i18];
/* 1757 */                      int i19 = i18 + 1;
/* 1759 */                      float f11 = fArr7[i19];
/* 1770 */                      ((TensorBuffer) listCreateInputBuffers$default2.get(2)).writeFloat(fArr8);
/* 1788 */                      ((TensorBuffer) listCreateInputBuffers$default2.get(3)).writeFloat(new float[]{f10});
/* 1797 */                      CompiledModel compiledModel6 = compiledModel;
/* 1799 */                      List list = listCreateInputBuffers$default2;
/* 1801 */                      CompiledModel.run$default(compiledModel6, list, listCreateOutputBuffers$default2, 0, 4, (Object) null);
/* 1812 */                      float[] fArr9 = ((TensorBuffer) listCreateOutputBuffers$default2.get(0)).readFloat();
/* 1816 */                      float[] fArr10 = fArr7;
/* 1825 */                      Random random3 = new Random(i18 + j + 4564);
/* 1828 */                      int i20 = 16384;
/* 1830 */                      float[] fArr11 = new float[16384];
/* 1832 */                      int i21 = 0;
/* 1833 */                      while (i21 < i20) {
/* 1835 */                          float[] fArr12 = fArr11;
/* 1841 */                          fArr12[i21] = (float) random3.nextGaussian();
/* 1843 */                          i21++;
/* 1845 */                          fArr11 = fArr12;
/* 1846 */                          i20 = 16384;
                                }
/* 1849 */                      float[] fArr13 = fArr11;
/* 1850 */                      float[] fArr14 = new float[i20];
/* 1853 */                      for (int i22 = 0; i22 < i20; i22++) {
/* 1874 */                          fArr14[i22] = (fArr13[i22] * f11) + ((1.0f - f11) * (fArr8[i22] - (fArr9[i22] * f10)));
                                }
/* 1891 */                      function1.invoke(new Float(((i19 * 0.8f) / 8.0f) + f9));
/* 1895 */                      fArr8 = fArr14;
/* 1896 */                      i18 = i19;
/* 1897 */                      fArr7 = fArr10;
/* 1898 */                      compiledModel = compiledModel6;
/* 1900 */                      listCreateInputBuffers$default2 = list;
                            }
/* 1906 */                  OlI0iOo.I00000oIO(listCreateInputBuffers$default2);
/* 1909 */                  OlI0iOo.I00000oIO(listCreateOutputBuffers$default2);
/* 1915 */                  List listCreateInputBuffers$default3 = CompiledModel.createInputBuffers$default(compiledModel2, 0, 1, null);
/* 1919 */                  List listCreateOutputBuffers$default3 = CompiledModel.createOutputBuffers$default(compiledModel2, 0, 1, null);
/* 1929 */                  ((TensorBuffer) listCreateInputBuffers$default3.get(0)).writeFloat(fArr8);
/* 1942 */                  CompiledModel.run$default(compiledModel2, listCreateInputBuffers$default3, listCreateOutputBuffers$default3, 0, 4, (Object) null);
/* 1953 */                  float[] fArr15 = ((TensorBuffer) listCreateOutputBuffers$default3.get(0)).readFloat();
/* 1957 */                  OlI0iOo.I00000oIO(listCreateInputBuffers$default3);
/* 1960 */                  OlI0iOo.I00000oIO(listCreateOutputBuffers$default3);
/* 1971 */                  function1.invoke(new Float(0.95f));
/* 1990 */                  int iMin3 = Math.min(524288, Math.max(1, O1OooO0IlOo.I000II(f3 * 44100.0f)));
/* 2004 */                  File file = new File(this.I00ilO0.getCacheDir(), "soundgen");
/* 2007 */                  file.mkdirs();
/* 2024 */                  File file2 = new File(file, IlIi0I0.I000l1(System.currentTimeMillis(), "soundgen_", ".wav"));
/* 2027 */                  int i23 = iMin3 * 4;
/* 2033 */                  randomAccessFile = new RandomAccessFile(file2, "rw");
                            try {
/* 2038 */                      randomAccessFile.setLength(0L);
/* 2043 */                      ByteBuffer byteBufferAllocate = ByteBuffer.allocate(44);
/* 2047 */                      ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
/* 2049 */                      ByteBuffer byteBufferOrder = byteBufferAllocate.order(byteOrder);
/* 2055 */                      Charset charset = IO1IOI.I00000oOI;
/* 2061 */                      byteBufferOrder.put("RIFF".getBytes(charset));
/* 2066 */                      byteBufferOrder.putInt(i23 + 36);
/* 2075 */                      byteBufferOrder.put("WAVE".getBytes(charset));
/* 2084 */                      byteBufferOrder.put("fmt ".getBytes(charset));
/* 2089 */                      byteBufferOrder.putInt(16);
/* 2093 */                      byteBufferOrder.putShort((short) 1);
/* 2097 */                      byteBufferOrder.putShort((short) 2);
/* 2103 */                      byteBufferOrder.putInt(44100);
/* 2109 */                      byteBufferOrder.putInt(176400);
/* 2113 */                      byteBufferOrder.putShort((short) 4);
/* 2116 */                      byteBufferOrder.putShort((short) 16);
/* 2125 */                      byteBufferOrder.put("data".getBytes(charset));
/* 2128 */                      byteBufferOrder.putInt(i23);
/* 2135 */                      randomAccessFile.write(byteBufferOrder.array());
/* 2142 */                      ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(i23).order(byteOrder);
/* 2147 */                      for (int i24 = 0; i24 < iMin3; i24++) {
/* 2149 */                          float f12 = fArr15[i24];
/* 2157 */                          if (f12 > 1.0f) {
/* 2159 */                              f12 = 1.0f;
                                    } else if (f12 < -1.0f) {
/* 2166 */                              f12 = -1.0f;
                                    }
/* 2176 */                          byteBufferOrder2.putShort((short) O1OooO0IlOo.I000II(f12 * 32767.0f));
/* 2181 */                          float f13 = fArr15[524288 + i24];
/* 2187 */                          if (f13 > 1.0f) {
/* 2189 */                              f13 = 1.0f;
                                    } else if (f13 < -1.0f) {
/* 2196 */                              f13 = -1.0f;
                                    }
/* 2203 */                          byteBufferOrder2.putShort((short) O1OooO0IlOo.I000II(f13 * 32767.0f));
                                }
/* 2216 */                      randomAccessFile.write(byteBufferOrder2.array());
/* 2219 */                      randomAccessFile.close();
/* 2229 */                      function1.invoke(new Float(1.0f));
/* 2232 */                      return file2.getAbsolutePath();
                            } catch (Throwable th) {
                                try {
/* 2237 */                          throw th;
                                } finally {
                                }
                            }
                        default:
/* 37 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 39 */                    lIoii1l01l0i.I00000oOI(obj);
/* 42 */                    OlI0o1 olI0o1 = (OlI0o1) obj2;
/* 44 */                    int i25 = olI0o1.I0000O;
/* 46 */                    int i26 = olI0o1.I00000oOI;
/* 48 */                    CompiledModel compiledModel7 = olI0o1.I0001Ioi1lo;
/* 50 */                    if (compiledModel7 == null || (compiledModel3 = olI0o1.I000II) == null || (compiledModel4 = olI0o1.I000O01llI0) == null || (o00io0iiooo0 = olI0o1.I000OOo1O) == null) {
/* 1162 */                      I000II.I001IO000("not loaded");
/* 1165 */                      return null;
                            }
/* 66 */                    HashMap map = (HashMap) o00io0iiooo0.I00iiO;
/* 68 */                    String strReplace = str2.replace(' ', (char) 9601);
/* 76 */                    if (strReplace.length() == 0) {
/* 79 */                        iArrI00iIO2 = new int[0];
/* 81 */                        i3 = i25;
/* 83 */                        f = f3;
                            } else {
/* 93 */                        ArrayList arrayList2 = new ArrayList(strReplace.length());
/* 96 */                        f = f3;
/* 98 */                        int i27 = 0;
/* 103 */                       while (i27 < strReplace.length()) {
/* 113 */                           int iCharCount = Character.charCount(strReplace.codePointAt(i27)) + i27;
/* 118 */                           arrayList2.add(strReplace.substring(i27, iCharCount));
/* 121 */                           i27 = iCharCount;
                                }
/* 128 */                       while (arrayList2.size() > 1) {
/* 134 */                           int size = arrayList2.size() - 1;
/* 137 */                           float f14 = Float.NEGATIVE_INFINITY;
/* 139 */                           int i28 = -1;
/* 141 */                           int i29 = 0;
/* 142 */                           while (i29 < size) {
/* 144 */                               int i30 = size;
/* 146 */                               Object obj4 = arrayList2.get(i29);
/* 150 */                               int i31 = i29;
/* 152 */                               int i32 = i31 + 1;
/* 154 */                               Object obj5 = arrayList2.get(i32);
/* 162 */                               StringBuilder sb = new StringBuilder();
/* 165 */                               sb.append(obj4);
/* 168 */                               sb.append(obj5);
/* 179 */                               Integer num2 = (Integer) map.get(sb.toString());
/* 181 */                               if (num2 != null) {
/* 191 */                                   f2 = ((float[]) o00io0iiooo0.I00iio)[num2.intValue()];
/* 195 */                                   if (f2 > f14) {
/* 197 */                                       i28 = i31;
                                            } else {
/* 200 */                                       f2 = f14;
                                            }
                                        }
/* 202 */                               f14 = f2;
/* 204 */                               size = i30;
/* 206 */                               i29 = i32;
                                    }
/* 211 */                           if (i28 >= 0) {
/* 213 */                               Object obj6 = arrayList2.get(i28);
/* 217 */                               int i33 = i28 + 1;
/* 219 */                               Object obj7 = arrayList2.get(i33);
/* 223 */                               int i34 = i25;
/* 227 */                               StringBuilder sb2 = new StringBuilder();
/* 230 */                               sb2.append(obj6);
/* 233 */                               sb2.append(obj7);
/* 240 */                               arrayList2.set(i28, sb2.toString());
/* 243 */                               arrayList2.remove(i33);
/* 248 */                               i25 = i34;
                                    } else {
/* 251 */                               i3 = i25;
/* 259 */                               ArrayList arrayList3 = new ArrayList(arrayList2.size());
/* 262 */                               it = arrayList2.iterator();
/* 270 */                               while (it.hasNext()) {
/* 276 */                                   String str3 = (String) it.next();
/* 282 */                                   Integer num3 = (Integer) map.get(str3);
/* 284 */                                   if (num3 != null) {
/* 286 */                                       arrayList3.add(num3);
                                            } else {
/* 292 */                                       byte[] bytes = str3.getBytes(IO1IOI.I00000oIO);
/* 296 */                                       int length2 = bytes.length;
/* 297 */                                       int i35 = 0;
/* 298 */                                       while (i35 < length2) {
/* 302 */                                           Iterator it2 = it;
/* 310 */                                           int i36 = ((int[]) o00io0iiooo0.I00ilI0I1)[bytes[i35] & 255];
/* 312 */                                           Integer numValueOf = Integer.valueOf(i36);
/* 316 */                                           if (i36 < 0) {
/* 319 */                                               numValueOf = null;
                                                    }
/* 333 */                                           arrayList3.add(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : o00io0iiooo0.I00iiI));
/* 336 */                                           i35++;
/* 338 */                                           it = it2;
                                                }
                                            }
                                        }
/* 341 */                               iArrI00iIO2 = IOOi0Ool1i.I00iIO(arrayList3);
                                    }
                                }
/* 251 */                       i3 = i25;
/* 259 */                       ArrayList arrayList32 = new ArrayList(arrayList2.size());
/* 262 */                       it = arrayList2.iterator();
/* 270 */                       while (it.hasNext()) {
                                }
/* 341 */                       iArrI00iIO2 = IOOi0Ool1i.I00iIO(arrayList32);
                            }
/* 347 */                   long[] jArr3 = new long[Barcode.FORMAT_QR_CODE];
/* 349 */                   long[] jArr4 = new long[Barcode.FORMAT_QR_CODE];
/* 352 */                   int iMin4 = Math.min(iArrI00iIO2.length, Barcode.FORMAT_QR_CODE);
/* 356 */                   int i37 = 0;
/* 357 */                   while (i37 < iMin4) {
/* 361 */                       long[] jArr5 = jArr3;
/* 364 */                       jArr5[i37] = iArrI00iIO2[i37];
/* 366 */                       jArr4[i37] = 1;
/* 368 */                       i37++;
/* 370 */                       jArr3 = jArr5;
                            }
/* 380 */                   List listCreateInputBuffers$default4 = CompiledModel.createInputBuffers$default(compiledModel7, 0, 1, null);
/* 384 */                   List listCreateOutputBuffers$default4 = CompiledModel.createOutputBuffers$default(compiledModel7, 0, 1, null);
/* 396 */                   ((TensorBuffer) listCreateInputBuffers$default4.get(0)).writeLong(jArr3);
/* 405 */                   ((TensorBuffer) listCreateInputBuffers$default4.get(1)).writeLong(jArr4);
/* 418 */                   CompiledModel.run$default(compiledModel7, listCreateInputBuffers$default4, listCreateOutputBuffers$default4, 0, 4, (Object) null);
/* 429 */                   float[] fArr16 = ((TensorBuffer) listCreateOutputBuffers$default4.get(0)).readFloat();
/* 433 */                   OlI0o1.I00000oIO(listCreateInputBuffers$default4);
/* 436 */                   OlI0o1.I00000oIO(listCreateOutputBuffers$default4);
/* 441 */                   float[] fArr17 = new float[Barcode.FORMAT_QR_CODE];
/* 443 */                   int i38 = 0;
/* 444 */                   for (int i39 = Barcode.FORMAT_QR_CODE; i38 < i39; i39 = Barcode.FORMAT_QR_CODE) {
/* 450 */                       fArr17[i38] = r8[i38];
/* 452 */                       i38++;
/* 454 */                       jArr4 = jArr4;
                            }
/* 460 */                   float f15 = 0.05f;
/* 466 */                   function1.invoke(new Float(0.05f));
/* 497 */                   float fExp = (float) Math.exp(-((((lIiioliIlo.I0000Il00O(olI0o1.I00000oIO, Barcode.FORMAT_QR_CODE, Barcode.FORMAT_AZTEC) - Barcode.FORMAT_QR_CODE) * 0.65f) / 3840.0f) + 0.5f));
/* 500 */                   float[] fArr18 = new float[9];
/* 502 */                   int i40 = 0;
                            while (true) {
/* 506 */                       float f16 = 1.0f - (i40 / 8.0f);
/* 533 */                       fArr18[i40] = f16 >= 1.0f ? 1.0f : f16 <= 0.0f ? 0.0f : 1.0f - (fExp / (((1.0f / (1.0f - f16)) - 1.0f) + fExp));
/* 537 */                       if (i40 == 8) {
/* 544 */                           fArr18[0] = 1.0f;
/* 548 */                           Random random4 = new Random(j);
/* 551 */                           float[] fArr19 = new float[i26];
/* 553 */                           int i41 = 0;
/* 554 */                           while (i41 < i26) {
/* 563 */                               fArr19[i41] = (float) random4.nextGaussian();
/* 565 */                               i41++;
/* 567 */                               f15 = f15;
/* 568 */                               fArr18 = fArr18;
                                    }
/* 570 */                           float f17 = f15;
/* 571 */                           float[] fArr20 = fArr18;
/* 574 */                           float[] fArr21 = new float[olI0o1.I0000Il00O];
/* 585 */                           List listCreateInputBuffers$default5 = CompiledModel.createInputBuffers$default(compiledModel3, 0, 1, null);
/* 589 */                           List listCreateOutputBuffers$default5 = CompiledModel.createOutputBuffers$default(compiledModel3, 0, 1, null);
/* 600 */                           ((TensorBuffer) listCreateInputBuffers$default5.get(2)).writeFloat(fArr16);
/* 610 */                           ((TensorBuffer) listCreateInputBuffers$default5.get(3)).writeFloat(fArr17);
/* 620 */                           ((TensorBuffer) listCreateInputBuffers$default5.get(4)).writeFloat(new float[]{f});
/* 630 */                           ((TensorBuffer) listCreateInputBuffers$default5.get(5)).writeFloat(fArr21);
/* 633 */                           int i42 = 0;
/* 636 */                           while (i42 < 8) {
/* 638 */                               float f18 = fArr20[i42];
/* 640 */                               int i43 = i42 + 1;
/* 642 */                               float f19 = fArr20[i43];
/* 651 */                               ((TensorBuffer) listCreateInputBuffers$default5.get(0)).writeFloat(fArr19);
/* 667 */                               ((TensorBuffer) listCreateInputBuffers$default5.get(1)).writeFloat(new float[]{f18});
/* 676 */                               CompiledModel compiledModel8 = compiledModel3;
/* 678 */                               List list2 = listCreateInputBuffers$default5;
/* 680 */                               CompiledModel.run$default(compiledModel8, list2, listCreateOutputBuffers$default5, 0, 4, (Object) null);
/* 683 */                               List list3 = listCreateOutputBuffers$default5;
/* 693 */                               float[] fArr22 = ((TensorBuffer) list3.get(0)).readFloat();
/* 698 */                               if (i42 < 7) {
/* 706 */                                   Random random5 = new Random(i42 + j + 1);
/* 709 */                                   fArr2 = new float[i26];
/* 711 */                                   int i44 = 0;
/* 712 */                                   while (i44 < i26) {
/* 714 */                                       Random random6 = random5;
/* 722 */                                       fArr2[i44] = (float) random6.nextGaussian();
/* 724 */                                       i44++;
/* 726 */                                       f18 = f18;
/* 727 */                                       random5 = random6;
                                            }
                                        } else {
/* 732 */                                   fArr2 = null;
                                        }
/* 730 */                               float f20 = f18;
/* 734 */                               float[] fArr23 = new float[i26];
/* 737 */                               for (int i45 = 0; i45 < i26; i45++) {
/* 745 */                                   float f21 = fArr19[i45] - (fArr22[i45] * f20);
/* 747 */                                   if (fArr2 != null) {
/* 756 */                                       f21 = (fArr2[i45] * f19) + ((1.0f - f19) * f21);
                                            }
/* 758 */                                   fArr23[i45] = f21;
                                        }
/* 775 */                               function1.invoke(new Float(((i43 * 0.8f) / 8.0f) + f17));
/* 778 */                               fArr19 = fArr23;
/* 779 */                               i42 = i43;
/* 780 */                               listCreateOutputBuffers$default5 = list3;
/* 782 */                               compiledModel3 = compiledModel8;
/* 784 */                               listCreateInputBuffers$default5 = list2;
                                    }
/* 792 */                           OlI0o1.I00000oIO(listCreateInputBuffers$default5);
/* 795 */                           OlI0o1.I00000oIO(listCreateOutputBuffers$default5);
/* 801 */                           List listCreateInputBuffers$default6 = CompiledModel.createInputBuffers$default(compiledModel4, 0, 1, null);
/* 805 */                           List listCreateOutputBuffers$default6 = CompiledModel.createOutputBuffers$default(compiledModel4, 0, 1, null);
/* 815 */                           ((TensorBuffer) listCreateInputBuffers$default6.get(0)).writeFloat(fArr19);
/* 828 */                           CompiledModel.run$default(compiledModel4, listCreateInputBuffers$default6, listCreateOutputBuffers$default6, 0, 4, (Object) null);
/* 839 */                           float[] fArr24 = ((TensorBuffer) listCreateOutputBuffers$default6.get(0)).readFloat();
/* 843 */                           OlI0o1.I00000oIO(listCreateInputBuffers$default6);
/* 846 */                           OlI0o1.I00000oIO(listCreateOutputBuffers$default6);
/* 857 */                           function1.invoke(new Float(0.97f));
/* 874 */                           int i46 = i3;
/* 876 */                           int iMin5 = Math.min(i46, Math.max(1, O1OooO0IlOo.I000II(f * 44100.0f)));
/* 880 */                           int length3 = fArr24.length;
/* 881 */                           float f22 = 0.0f;
/* 884 */                           for (int i47 = 0; i47 < length3; i47++) {
/* 886 */                               float f23 = fArr24[i47];
/* 890 */                               if (f23 < 0.0f) {
/* 892 */                                   f23 = -f23;
                                        }
/* 895 */                               if (f23 > f22) {
/* 897 */                                   f22 = f23;
                                        }
                                    }
/* 911 */                           float f24 = f22 > 1.0E-6f ? 1.0f / f22 : 1.0f;
/* 925 */                           File file3 = new File(this.I00ilO0.getCacheDir(), "soundgenhd");
/* 928 */                           file3.mkdirs();
/* 945 */                           File file4 = new File(file3, IlIi0I0.I000l1(System.currentTimeMillis(), "soundgenhd_", ".wav"));
/* 948 */                           int i48 = iMin5 * 4;
/* 954 */                           randomAccessFile = new RandomAccessFile(file4, "rw");
                                    try {
/* 959 */                               randomAccessFile.setLength(0L);
/* 964 */                               ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(44);
/* 968 */                               ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
/* 970 */                               ByteBuffer byteBufferOrder3 = byteBufferAllocate2.order(byteOrder2);
/* 976 */                               Charset charset2 = IO1IOI.I00000oOI;
/* 982 */                               byteBufferOrder3.put("RIFF".getBytes(charset2));
/* 987 */                               byteBufferOrder3.putInt(i48 + 36);
/* 996 */                               byteBufferOrder3.put("WAVE".getBytes(charset2));
/* 1005 */                              byteBufferOrder3.put("fmt ".getBytes(charset2));
/* 1010 */                              byteBufferOrder3.putInt(16);
/* 1014 */                              byteBufferOrder3.putShort((short) 1);
/* 1018 */                              byteBufferOrder3.putShort((short) 2);
/* 1024 */                              byteBufferOrder3.putInt(44100);
/* 1030 */                              byteBufferOrder3.putInt(176400);
/* 1034 */                              byteBufferOrder3.putShort((short) 4);
/* 1037 */                              byteBufferOrder3.putShort((short) 16);
/* 1046 */                              byteBufferOrder3.put("data".getBytes(charset2));
/* 1049 */                              byteBufferOrder3.putInt(i48);
/* 1056 */                              randomAccessFile.write(byteBufferOrder3.array());
/* 1063 */                              ByteBuffer byteBufferOrder4 = ByteBuffer.allocate(i48).order(byteOrder2);
/* 1068 */                              for (int i49 = 0; i49 < iMin5; i49++) {
/* 1072 */                                  float f25 = fArr24[i49] * f24;
/* 1077 */                                  if (f25 > 1.0f) {
/* 1079 */                                      f25 = 1.0f;
                                            } else if (f25 < -1.0f) {
/* 1086 */                                      f25 = -1.0f;
                                            }
/* 1096 */                                  byteBufferOrder4.putShort((short) O1OooO0IlOo.I000II(f25 * 32767.0f));
/* 1103 */                                  float f26 = fArr24[i46 + i49] * f24;
/* 1106 */                                  if (f26 > 1.0f) {
/* 1108 */                                      f26 = 1.0f;
                                            } else if (f26 < -1.0f) {
/* 1115 */                                      f26 = -1.0f;
                                            }
/* 1122 */                                  byteBufferOrder4.putShort((short) O1OooO0IlOo.I000II(f26 * 32767.0f));
                                        }
/* 1135 */                              randomAccessFile.write(byteBufferOrder4.array());
/* 1138 */                              randomAccessFile.close();
/* 1148 */                              function1.invoke(new Float(1.0f));
/* 1151 */                              return file4.getAbsolutePath();
                                    } catch (Throwable th2) {
                                        try {
/* 1156 */                                  throw th2;
                                        } finally {
                                        }
                                    }
                                }
/* 539 */                       i40++;
                            }
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 20 */        public OlI01II0(OlI0o1 olI0o1, String str, Function1 function1, long j, float f, Context context, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 21 */            this.I00io1l = olI0o1;
                    this.I00iiI = str;
                    this.I00iiO = function1;
                    this.I00iio = j;
                    this.I00ilI0I1 = f;
                    this.I00ilO0 = context;
                }
            }
