            package p000;

            import android.content.ContentResolver;
            import android.content.ContentValues;
            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.Color;
            import android.net.Uri;
            import android.os.Environment;
            import android.provider.MediaStore;
            import android.util.Log;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Random;
            import kotlin.jvm.functions.Function1;
            import org.json.JSONArray;
            
/* 12 */    public final class OOl11O0ii0II extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public final Object I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOl11O0ii0II(IOiOol0 iOiOol0, Context context, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 3 */             this.I00iOIl = 8;
/* 5 */             this.I00iiO = iOiOol0;
/* 7 */             this.I00iio = context;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iio;
/* 5 */             Object obj3 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 191 */                   return new OOl11O0ii0II((Ii0l0Olio10) this.I00iiI, (OI10i0Il) obj3, (OOl1OlI0) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 172 */                   return new OOl11O0ii0II((IoI011li) this.I00iiI, (String) obj3, (File) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 153 */                   return new OOl11O0ii0II((Ool0OI) this.I00iiI, (Bitmap) obj3, (Ol1OiIli00Ii) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 134 */                   return new OOl11O0ii0II((Context) this.I00iiI, (Ool0lIIlll) obj3, (Bitmap) obj2, iOoil1iiIilo, 3);
                        case 4:
/* 115 */                   return new OOl11O0ii0II((IoI011li) this.I00iiI, (String) obj3, (File) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 96 */                    return new OOl11O0ii0II((i0I00l) this.I00iiI, (String) obj3, (i0I01lo) obj2, iOoil1iiIilo, 5);
                        case 6:
/* 77 */                    return new OOl11O0ii0II((Context) this.I00iiI, (i0I01lo) obj3, (Bitmap) obj2, iOoil1iiIilo, 6);
                        case 7:
/* 58 */                    return new OOl11O0ii0II((OIooO1iiliI) this.I00iiI, (OIooO1iiliI) obj3, (OIooO1iiliI) obj2, iOoil1iiIilo, 7);
                        case 8:
/* 37 */                    OOl11O0ii0II oOl11O0ii0II = new OOl11O0ii0II((IOiOol0) obj3, (Context) obj2, iOoil1iiIilo);
/* 40 */                    oOl11O0ii0II.I00iiI = obj;
/* 42 */                    return oOl11O0ii0II;
                        default:
/* 26 */                    return new OOl11O0ii0II((IOiOol0) this.I00iiI, (Context) obj3, (Map) obj2, iOoil1iiIilo, 9);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 145 */                   ((OOl11O0ii0II) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 131 */                   ((OOl11O0ii0II) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 2:
                            break;
                        case 3:
/* 102 */                   ((OOl11O0ii0II) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 4:
/* 88 */                    ((OOl11O0ii0II) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 5:
/* 74 */                    ((OOl11O0ii0II) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 6:
/* 60 */                    ((OOl11O0ii0II) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 7:
/* 46 */                    ((OOl11O0ii0II) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 8:
/* 32 */                    ((OOl11O0ii0II) create((Map) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((OOl11O0ii0II) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
                    OutputStream outputStreamOpenOutputStream;
                    boolean zCompress;
                    Bitmap bitmapCreateBitmap;
/* 5 */             int i = 2;
/* 6 */             int i2 = 16;
/* 20 */            float f = 0.0f;
/* 22 */            float f2 = 1.0f;
                    switch (this.I00iOIl) {
                        case 0:
/* 1740 */                  Function1 function1 = ((Ii0l0Olio10) this.I00iiI).I0000oI00;
/* 1742 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 1744 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1755 */                  OOl1IO oOl1IO = (OOl1IO) ((OI10i0Il) this.I00iiO).getValue();
/* 1759 */                  if (oOl1IO instanceof OOl11i0l) {
/* 1763 */                      OOl1OlI0 oOl1OlI0 = (OOl1OlI0) this.I00iio;
/* 1768 */                      OOl0olO oOl0olO = new OOl0olO(1);
/* 1771 */                      oOl0olO.I00iiI = oOl1OlI0;
/* 1773 */                      VarHandle.storeStoreFence();
/* 1776 */                      function1.invoke(oOl0olO);
                            } else {
/* 1782 */                      if (!(oOl1IO instanceof OOl11o1IO0o)) {
/* 1792 */                          I000II.I00000oIO();
/* 1791 */                          return null;
                                }
/* 1785 */                      function1.invoke(null);
                            }
/* 1788 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 1704 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 1706 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1730 */                  ((IoI011li) this.I00iiI).invoke((String) this.I00iiO, new Long(((File) this.I00iio).length()));
/* 1733 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 1367 */                  int i3 = 0;
/* 1370 */                  Ol1OiIli00Ii ol1OiIli00Ii = (Ol1OiIli00Ii) this.I00iio;
/* 1372 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 1374 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1380 */                  Ool0OI ool0OI = (Ool0OI) this.I00iiI;
/* 1382 */                  CompiledModel compiledModel = ool0OI.I00000oIO;
/* 1384 */                  if (compiledModel != null) {
                                try {
/* 1390 */                          Bitmap bitmapCreateScaledBitmap = (Bitmap) this.I00iiO;
/* 1400 */                          int iMax = Math.max(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight());
/* 1406 */                          if (iMax <= 1024) {
/* 1408 */                              z = true;
                                    } else {
/* 1413 */                              float f3 = 1024.0f / iMax;
/* 1428 */                              z = true;
/* 1429 */                              bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) (bitmapCreateScaledBitmap.getWidth() * f3), (int) (bitmapCreateScaledBitmap.getHeight() * f3), true);
                                    }
/* 1433 */                          int width = bitmapCreateScaledBitmap.getWidth();
/* 1437 */                          int height = bitmapCreateScaledBitmap.getHeight();
/* 1441 */                          int i4 = Barcode.FORMAT_ITF;
/* 1443 */                          if (width > 128 || height > 128) {
/* 1493 */                              Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width * 4, height * 4, Bitmap.Config.ARGB_8888);
/* 1503 */                              int iMin = Math.min(Barcode.FORMAT_ITF, Barcode.FORMAT_ITF) / 2;
/* 1507 */                              if (16 <= iMin) {
/* 1510 */                                  iMin = 16;
                                        }
/* 1511 */                              int i5 = 128 - iMin;
/* 1518 */                              int i6 = i5 < 1 ? 1 : i5;
/* 1523 */                              int i7 = i5 < 1 ? 1 : i5;
/* 1524 */                              List listI00000oOI = li0I0lOII0o.I00000oOI(width, i6);
/* 1528 */                              List listI00000oOI2 = li0I0lOII0o.I00000oOI(height, i7);
/* 1540 */                              int size = listI00000oOI.size() * listI00000oOI2.size();
/* 1541 */                              Iterator it = listI00000oOI2.iterator();
/* 1545 */                              int i8 = 0;
/* 1550 */                              while (it.hasNext()) {
/* 1558 */                                  int iIntValue = ((Number) it.next()).intValue();
/* 1562 */                                  Iterator it2 = listI00000oOI.iterator();
/* 1566 */                                  int i9 = i8;
/* 1572 */                                  while (it2.hasNext()) {
/* 1580 */                                      int iIntValue2 = ((Number) it2.next()).intValue();
/* 1588 */                                      float[] fArrI0000Il00O = ool0OI.I0000Il00O(compiledModel, Bitmap.createBitmap(bitmapCreateScaledBitmap, iIntValue2, iIntValue, i4, i4));
/* 1592 */                                      if (fArrI0000Il00O != null) {
/* 1599 */                                          int i10 = iMin / 2;
/* 1605 */                                          int i11 = iIntValue2 == 0 ? i3 : i10;
/* 1606 */                                          if (iIntValue != 0) {
/* 1609 */                                              i3 = i10;
                                                    }
/* 1616 */                                          int i12 = iIntValue2 + Barcode.FORMAT_ITF >= width ? 0 : i10;
/* 1617 */                                          Bitmap bitmap = bitmapCreateScaledBitmap;
/* 1621 */                                          if (iIntValue + Barcode.FORMAT_ITF >= height) {
/* 1623 */                                              i10 = 0;
                                                    }
/* 1625 */                                          int i13 = (iIntValue2 + i11) * 4;
/* 1629 */                                          int i14 = (iIntValue + i3) * 4;
/* 1631 */                                          int i15 = iIntValue;
/* 1633 */                                          int i16 = i11 * 4;
/* 1635 */                                          int i17 = iMin;
/* 1638 */                                          int i18 = i3 * 4;
/* 1647 */                                          int i19 = ((128 - i11) - i12) * 4;
/* 1652 */                                          int i20 = ((128 - i3) - i10) * 4;
/* 1654 */                                          int i21 = size;
/* 1659 */                                          ool0OI.I00000oIO(fArrI0000Il00O, bitmapCreateBitmap2, i13, i14, i16, i18, i19, i20);
/* 1662 */                                          int i22 = i9 + 1;
/* 1672 */                                          ol1OiIli00Ii.invoke(new Float(i22 / i21));
/* 1675 */                                          i4 = 128;
/* 1676 */                                          size = i21;
/* 1677 */                                          i9 = i22;
/* 1679 */                                          iIntValue = i15;
/* 1681 */                                          iMin = i17;
/* 1683 */                                          i3 = 0;
/* 1684 */                                          bitmapCreateScaledBitmap = bitmap;
                                                }
                                            }
/* 1689 */                                  i8 = i9;
                                        }
/* 1693 */                              return bitmapCreateBitmap2;
                                    }
/* 1451 */                          float[] fArrI0000Il00O2 = ool0OI.I0000Il00O(compiledModel, Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, Barcode.FORMAT_ITF, Barcode.FORMAT_ITF, z));
/* 1455 */                          if (fArrI0000Il00O2 != null) {
/* 1459 */                              Bitmap bitmapI00000oOI = ool0OI.I00000oOI(fArrI0000Il00O2);
/* 1470 */                              ol1OiIli00Ii.invoke(new Float(1.0f));
/* 1478 */                              return Bitmap.createScaledBitmap(bitmapI00000oOI, width * 4, height * 4, true);
                                    }
                                } catch (Throwable th) {
/* 1699 */                          Log.e("UpscaleEngine", "upscale failed", th);
                                }
                            }
/* 1594 */                  return null;
                        case 3:
/* 1131 */                  OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 1137 */                  OlO0OIIl1 olO0OIIl1 = ((Ool0lIIlll) this.I00iiO).I00000oOI;
/* 1139 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 1141 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1148 */                  ContentResolver contentResolver = ((Context) this.I00iiI).getContentResolver();
/* 1158 */                  String strI000l1 = IlIi0I0.I000l1(System.currentTimeMillis(), "upscaled_", ".png");
/* 1164 */                  ContentValues contentValues = new ContentValues();
/* 1167 */                  contentValues.put("_display_name", strI000l1);
/* 1170 */                  contentValues.put("mime_type", "image/png");
/* 1192 */                  contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/Upscaled");
/* 1203 */                  contentValues.put("is_pending", new Integer(1));
/* 1208 */                  Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
/* 1212 */                  if (uriInsert == null) {
/* 1236 */                      olO0OIIl1.I000lI(null, Ool0l1o1.I00000oIO((Ool0l1o1) olO0OIIl1.getValue(), null, null, false, 0.0f, false, false, "Couldn't save image", 47));
                            } else {
                                try {
/* 1241 */                          outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
/* 1245 */                          if (outputStreamOpenOutputStream != null) {
                                        try {
/* 1253 */                                  zCompress = ((Bitmap) this.I00iio).compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
/* 1257 */                                  outputStreamOpenOutputStream.flush();
/* 1260 */                                  outputStreamOpenOutputStream.close();
                                        } finally {
                                        }
                                    } else {
/* 1275 */                              zCompress = false;
                                    }
/* 1276 */                          if (!zCompress) {
/* 1329 */                              throw new IOException("PNG encode failed");
                                    }
/* 1278 */                          contentValues.clear();
/* 1287 */                          contentValues.put("is_pending", new Integer(0));
/* 1291 */                          contentResolver.update(uriInsert, contentValues, null, null);
/* 1318 */                          olO0OIIl1.I000lI(null, Ool0l1o1.I00000oIO((Ool0l1o1) olO0OIIl1.getValue(), null, null, false, 0.0f, false, true, null, 79));
                                } catch (Throwable th2) {
/* 1330 */                          contentResolver.delete(uriInsert, null, null);
/* 1363 */                          olO0OIIl1.I000lI(null, Ool0l1o1.I00000oIO((Ool0l1o1) olO0OIIl1.getValue(), null, null, false, 0.0f, false, false, IIl001iO0Io.I000o00OoI0I("Couldn't save image: ", th2.getMessage()), 47));
                                }
                            }
/* 1366 */                  return ooiIlOl1iI;
                        case 4:
/* 1099 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 1101 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1125 */                  ((IoI011li) this.I00iiI).invoke((String) this.I00iiO, new Long(((File) this.I00iio).length()));
/* 1128 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 407 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 409 */                   lIoii1l01l0i.I00000oOI(obj);
/* 415 */                   i0I00l i0i00l = (i0I00l) this.I00iiI;
/* 419 */                   String str = (String) this.I00iiO;
/* 421 */                   long jCurrentTimeMillis = System.currentTimeMillis();
/* 427 */                   i0I01lo i0i01lo = (i0I01lo) this.I00iio;
/* 433 */                   Ol0Oo0 ol0Oo0 = new Ol0Oo0(14);
/* 436 */                   ol0Oo0.I00iiI = i0i01lo;
/* 438 */                   VarHandle.storeStoreFence();
/* 441 */                   File file = i0i00l.I0000Il00O;
/* 443 */                   if (file == null) {
/* 888 */                       bitmapCreateBitmap = null;
                            } else {
/* 447 */                       i0i00l.I000O01llI0 = false;
                                try {
/* 455 */                           ol0Oo0.invoke("Encoding prompt", Float.valueOf(0.0f));
/* 458 */                           OIoi0IIoi oIoi0IIoiI00000oOI = i0i00l.I00000oOI(file, str);
/* 462 */                           if (oIoi0IIoiI00000oOI != null) {
/* 470 */                               float[] fArr = (float[]) oIoi0IIoiI00000oOI.I00iOIl;
/* 476 */                               int iIntValue3 = ((Number) oIoi0IIoiI00000oOI.I00iiI).intValue();
/* 482 */                               Random random = new Random(jCurrentTimeMillis);
/* 485 */                               int i23 = 16384;
/* 487 */                               float[] fArr2 = new float[16384];
/* 489 */                               int i24 = 0;
/* 490 */                               while (i24 < 16384) {
/* 499 */                                   fArr2[i24] = (float) random.nextGaussian();
/* 501 */                                   i24++;
/* 503 */                                   f = f;
                                        }
/* 507 */                               float f4 = f;
/* 511 */                               float[] fArr3 = new float[10];
/* 513 */                               int i25 = 0;
                                        while (true) {
/* 514 */                                   int i26 = 9;
/* 516 */                                   if (i25 < 9) {
/* 532 */                                       double d = 1.0d - ((0.8888888888888888d * i25) / 8.0d);
/* 547 */                                       fArr3[i25] = (float) ((3.0d * d) / ((d * 2.0d) + 1.0d));
/* 549 */                                       i25++;
                                            } else {
/* 552 */                                       fArr3[9] = f4;
/* 554 */                                       int i27 = 0;
                                                while (true) {
/* 555 */                                           boolean z2 = i0i00l.I000O01llI0;
/* 557 */                                           if (i27 >= i26) {
/* 883 */                                               File file2 = file;
/* 884 */                                               float f5 = f2;
/* 886 */                                               if (!z2) {
/* 900 */                                                   ol0Oo0.invoke("Decoding image", Float.valueOf(0.95f));
/* 905 */                                                   float[] fArr4 = new float[16384];
/* 908 */                                                   for (int i28 = 0; i28 < 16384; i28++) {
/* 920 */                                                       fArr4[i28] = (fArr2[i28] / 0.3611f) + 0.1159f;
                                                            }
/* 940 */                                                   float[] fArr5 = (float[]) i0i00l.I0000O(file2, "zvae.tflite", Collections.singletonList(fArr4)).get(0);
/* 948 */                                                   ol0Oo0.invoke("Done", Float.valueOf(f5));
/* 953 */                                                   int[] iArr = new int[65536];
/* 955 */                                                   int i29 = 0;
/* 956 */                                                   while (i29 < 65536) {
/* 966 */                                                       float f6 = f4;
/* 968 */                                                       float f7 = f5;
/* 1010 */                                                      iArr[i29] = Color.rgb((int) ((lIiioliIlo.I00000oOI((fArr5[i29] / 2.0f) + 0.5f, f6, f7) * 255.0f) + 0.5f), (int) ((lIiioliIlo.I00000oOI((fArr5[65536 + i29] / 2.0f) + 0.5f, f6, f7) * 255.0f) + 0.5f), (int) ((lIiioliIlo.I00000oOI((fArr5[131072 + i29] / 2.0f) + 0.5f, f6, f7) * 255.0f) + 0.5f));
/* 1012 */                                                      i29++;
/* 1014 */                                                      f4 = f6;
/* 1016 */                                                      f5 = 1.0f;
                                                            }
/* 1023 */                                                  bitmapCreateBitmap = Bitmap.createBitmap(iArr, Barcode.FORMAT_QR_CODE, Barcode.FORMAT_QR_CODE, Bitmap.Config.ARGB_8888);
                                                        }
                                                    } else if (!z2) {
/* 571 */                                               float f8 = (i27 * 0.086666666f) + 0.15f;
/* 577 */                                               float[] fArrI000II = i0i00l.I000II(f2 - fArr3[i27]);
/* 581 */                                               float[] fArr6 = new float[i23];
/* 583 */                                               float f9 = f2;
/* 585 */                                               int i30 = 0;
/* 586 */                                               while (i30 < i2) {
/* 588 */                                                   int i31 = 0;
/* 589 */                                                   while (i31 < i2) {
/* 595 */                                                       int i32 = ((i30 * 16) + i31) * 64;
/* 597 */                                                       int i33 = 0;
/* 598 */                                                       while (i33 < i) {
/* 600 */                                                           int i34 = 0;
/* 601 */                                                           while (i34 < i) {
/* 603 */                                                               int i35 = 0;
/* 604 */                                                               while (i35 < i2) {
/* 633 */                                                                   fArr6[(((i33 * 2) + i34) * 16) + i32 + i35] = fArr2[(i31 * 2) + i34 + (((i30 * 2) + i33) * 32) + (i35 * Barcode.FORMAT_UPC_E)];
/* 635 */                                                                   i35++;
/* 637 */                                                                   i2 = 16;
                                                                        }
/* 640 */                                                               i34++;
/* 642 */                                                               i = 2;
/* 643 */                                                               i2 = 16;
                                                                    }
/* 646 */                                                           i33++;
/* 648 */                                                           i = 2;
/* 649 */                                                           i2 = 16;
                                                                }
/* 655 */                                                       i31++;
/* 657 */                                                       i = 2;
/* 658 */                                                       i2 = 16;
                                                            }
/* 664 */                                                   i30++;
/* 666 */                                                   i = 2;
/* 667 */                                                   i2 = 16;
                                                        }
/* 675 */                                               int i36 = i27 + 1;
/* 706 */                                               ol0Oo0.invoke("Step " + i36 + "/" + i26, Float.valueOf(f8));
/* 711 */                                               i0I000o1 i0i000o1 = new i0I000o1();
/* 714 */                                               i0i000o1.I00iOIl = ol0Oo0;
/* 716 */                                               i0i000o1.I00iiI = i27;
/* 718 */                                               i0i000o1.I00iiO = i26;
/* 720 */                                               i0i000o1.I00iio = f8;
/* 725 */                                               i0i000o1.I00ilI0I1 = 0.086666666f;
/* 728 */                                               i0i000o1.I00ilO0 = 1;
/* 730 */                                               VarHandle.storeStoreFence();
/* 735 */                                               File file3 = file;
/* 739 */                                               float[] fArrI00000oIO = i0i00l.I00000oIO(file3, fArr6, fArr, iIntValue3, fArrI000II, i0i000o1);
/* 745 */                                               if (fArrI00000oIO != null) {
/* 753 */                                                   float f10 = fArr3[i36] - fArr3[i27];
/* 756 */                                                   float[] fArr7 = new float[16384];
/* 758 */                                                   int i37 = 0;
                                                            while (true) {
/* 761 */                                                       if (i37 < 16) {
/* 763 */                                                           int i38 = 0;
/* 764 */                                                           for (int i39 = 16; i38 < i39; i39 = 16) {
/* 769 */                                                               int i40 = ((i37 * 16) + i38) * 64;
/* 771 */                                                               int i41 = 0;
                                                                        while (true) {
/* 772 */                                                                   int i42 = 2;
/* 773 */                                                                   if (i41 < 2) {
/* 775 */                                                                       int i43 = 0;
                                                                                while (true) {
/* 776 */                                                                           float[] fArr8 = fArr3;
/* 778 */                                                                           if (i43 < i42) {
/* 783 */                                                                               for (int i44 = 0; i44 < 16; i44++) {
/* 814 */                                                                                   fArr7[(i38 * 2) + i43 + (((i37 * 2) + i41) * 32) + (i44 * Barcode.FORMAT_UPC_E)] = fArrI00000oIO[(((i41 * 2) + i43) * 16) + i40 + i44];
                                                                                        }
/* 819 */                                                                               i43++;
/* 821 */                                                                               fArr3 = fArr8;
/* 823 */                                                                               i42 = 2;
                                                                                    }
                                                                                }
/* 825 */                                                                       i41++;
                                                                            }
                                                                        }
/* 832 */                                                               i38++;
                                                                    }
/* 841 */                                                           i37++;
                                                                } else {
/* 846 */                                                           float[] fArr9 = fArr3;
/* 851 */                                                           for (int i45 = 0; i45 < 16384; i45++) {
/* 860 */                                                               fArr2[i45] = ((-fArr7[i45]) * f10) + fArr2[i45];
                                                                    }
/* 868 */                                                           file = file3;
/* 869 */                                                           i23 = 16384;
/* 870 */                                                           fArr3 = fArr9;
/* 872 */                                                           f2 = f9;
/* 874 */                                                           i2 = 16;
/* 876 */                                                           i26 = 9;
/* 879 */                                                           i27 = i36;
/* 880 */                                                           i = 2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th3) {
/* 1033 */                          Log.e("ZImageEngine", "generate failed", th3);
                                }
/* 888 */                       bitmapCreateBitmap = null;
                            }
/* 1042 */                  OlO0OIIl1 olO0OIIl12 = ((i0I01lo) this.I00iio).I00000oOI;
/* 1085 */                  i0I01ii i0i01iiI00000oIO = bitmapCreateBitmap != null ? i0I01ii.I00000oIO((i0I01ii) olO0OIIl12.getValue(), null, false, "", 0.0f, bitmapCreateBitmap, null, false, 97) : i0I01ii.I00000oIO((i0I01ii) olO0OIIl12.getValue(), null, false, "", 0.0f, null, "Generation failed or was cancelled — check logcat.", false, 81);
/* 1089 */                  olO0OIIl12.getClass();
/* 1093 */                  olO0OIIl12.I000lI(null, i0i01iiI00000oIO);
/* 1096 */                  return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 280 */                   Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 282 */                   lIoii1l01l0i.I00000oOI(obj);
/* 291 */                   String strI000l12 = IlIi0I0.I000l1(System.currentTimeMillis(), "z_image_", ".png");
/* 297 */                   ContentValues contentValues2 = new ContentValues();
/* 300 */                   contentValues2.put("_display_name", strI000l12);
/* 303 */                   contentValues2.put("mime_type", "image/png");
/* 325 */                   contentValues2.put("relative_path", Environment.DIRECTORY_PICTURES + "/LocalDiffusion");
/* 330 */                   Context context = (Context) this.I00iiI;
/* 338 */                   Uri uriInsert2 = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues2);
/* 342 */                   if (uriInsert2 != null) {
/* 346 */                       i0I01lo i0i01lo2 = (i0I01lo) this.I00iiO;
/* 350 */                       Bitmap bitmap2 = (Bitmap) this.I00iio;
/* 356 */                       outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert2);
/* 360 */                       if (outputStreamOpenOutputStream != null) {
                                    try {
/* 364 */                               bitmap2.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
/* 367 */                               outputStreamOpenOutputStream.close();
                                    } catch (Throwable th4) {
                                        try {
/* 373 */                                   throw th4;
                                        } finally {
                                        }
                                    }
                                }
/* 379 */                       OlO0OIIl1 olO0OIIl13 = i0i01lo2.I00000oOI;
/* 401 */                       olO0OIIl13.I000lI(null, i0I01ii.I00000oIO((i0I01ii) olO0OIIl13.getValue(), null, false, null, 0.0f, null, null, true, 63));
                            }
/* 404 */                   return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 251 */                   Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 253 */                   lIoii1l01l0i.I00000oOI(obj);
/* 260 */                   ((OIooO1iiliI) this.I00iiI).I000O01llI0(1.0f);
/* 267 */                   ((OIooO1iiliI) this.I00iiO).I000O01llI0(0.0f);
/* 274 */                   ((OIooO1iiliI) this.I00iio).I000O01llI0(0.0f);
/* 277 */                   return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 198 */                   Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 200 */                   lIoii1l01l0i.I00000oOI(obj);
/* 211 */                   Iterator it3 = ((Map) this.I00iiI).entrySet().iterator();
/* 219 */                   while (it3.hasNext()) {
/* 241 */                       IOiOol0.I00O0i0ii((IOiOol0) this.I00iiO, (Context) this.I00iio, (o0l0iIlo0O) ((Map.Entry) it3.next()).getValue());
/* 244 */                       it3.remove();
                            }
/* 248 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 28 */                    Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 30 */                    lIoii1l01l0i.I00000oOI(obj);
/* 49 */                    File file4 = new File(((IOiOol0) this.I00iiI).I00Ol10((Context) this.I00iiO), "index");
/* 54 */                    JSONArray jSONArray = new JSONArray();
/* 75 */                    for (Map.Entry entry : ((Map) this.I00iio).entrySet()) {
/* 87 */                        String str2 = (String) entry.getKey();
/* 93 */                        o0l0iIlo0O o0l0iilo0o = (o0l0iIlo0O) entry.getValue();
/* 103 */                       if (O0000Ioio00.I0000O(str2, o0l0iilo0o.zza())) {
/* 159 */                           jSONArray.put(o0l0iilo0o.zzc());
                                } else {
/* 105 */                           String strZza = o0l0iilo0o.zza();
/* 132 */                           StringBuilder sb = new StringBuilder(String.valueOf(strZza).length() + String.valueOf(str2).length() + 25 + 24);
/* 139 */                           IIl001iO0Io.I001lIiIIo1O(sb, "IDs in key (", str2, ") and value (", strZza);
/* 144 */                           sb.append(") do not match. Ignored.");
/* 151 */                           Log.w("CacheFileManager", sb.toString());
                                }
                            }
                            try {
/* 163 */                       String string = jSONArray.toString();
/* 167 */                       Charset charset = IO1IOI.I00000oIO;
/* 171 */                       FileOutputStream fileOutputStream = new FileOutputStream(file4);
                                try {
/* 174 */                           IlIl10.I000lI(fileOutputStream, string, charset);
/* 177 */                           fileOutputStream.close();
/* 180 */                           return OoiIlOl1iI.I00000oIO;
                                } finally {
                                }
                            } catch (IOException e) {
/* 194 */                       Log.e("CacheFileManager", "Failed to write cache index file.", e);
/* 197 */                       throw e;
                            }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public OOl11O0ii0II(Object obj, Object obj2, Object obj3, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 14 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                    this.I00iiO = obj2;
                    this.I00iio = obj3;
                }
            }
