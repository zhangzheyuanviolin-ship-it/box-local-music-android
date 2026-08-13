            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.TotalCaptureResult;
            import android.media.Image;
            import android.os.Trace;
            import android.util.ArrayMap;
            import android.util.Log;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
            public final class IIl00O {
                public IIlIIOi I00000oIO;
                public Oo10IliO00O I00000oOI;
                public int I0000Il00O;
                public Map I0000O;
                public Map I0000oI00;
                public OlOO00iI0lI I0001Ioi1lo;
                public OlOl1I I000II;
                public boolean I000O01llI0;
                public int I000OOo1O;
                public Object I000OiO;
                public boolean I000iOII;
                public IIl0001i1o01 I000l1;
                public I0oO11I I000lI;

                public final void I00000oIO(IIl0001i1o01 iIl0001i1o01) {
/* 1 */             Objects.toString(iIl0001i1o01);
/* 21 */            if (((OoiIlOl1iI) this.I00000oOI.I00000oOI(2000L, new IIl00I(iIl0001i1o01, null, 0))) == null) {
/* 45 */                Log.e("CXCP", this + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + iIl0001i1o01);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:218:0x04e3  */
                /* JADX WARN: Removed duplicated region for block: B:312:0x066e A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIl0001i1o01 I00000oOI(boolean z, List list, Map map, Map map2, Map map3, O1OIll00i o1OIll00i, List list2) throws InterruptedException {
                    CaptureRequest.Builder builderI00OOll1;
                    ArrayMap arrayMap;
                    ArrayMap arrayMap2;
                    List<CaptureRequest> listCreateHighSpeedRequestList;
                    Iterator it;
                    Iterator it2;
                    boolean zI00000oIO;
                    long j;
                    boolean zI00000oIO2;
                    boolean zIsTerminated;
                    Image image;
                    boolean z2;
                    List list3;
                    Iterator it3;
                    ArrayList arrayList;
                    boolean zI00000oIO3;
                    boolean z3;
                    boolean z4;
/* 9 */             ArrayList arrayList2 = new ArrayList(list.size());
/* 18 */            ArrayList arrayList3 = new ArrayList(list.size());
/* 23 */            ArrayMap arrayMap3 = new ArrayMap();
/* 28 */            ArrayMap arrayMap4 = new ArrayMap();
/* 33 */            ArrayMap arrayMap5 = new ArrayMap();
/* 36 */            IIlIIOi iIlIIOi = this.I00000oIO;
/* 40 */            OlOO00iI0lI olOO00iI0lI = this.I0001Ioi1lo;
/* 44 */            List list4 = list;
/* 52 */            if (list4.isEmpty()) {
/* 1662 */              I000II.I001IO000("build(...) should never be called with an empty request list!");
/* 50 */                return null;
                    }
/* 58 */            if (iIlIIOi instanceof I0lIOolO) {
/* 60 */                Iterator it4 = list.iterator();
/* 64 */                Boolean bool = null;
/* 66 */                Boolean bool2 = null;
/* 71 */                while (it4.hasNext()) {
/* 79 */                    Oi01iIoI oi01iIoI = (Oi01iIoI) it4.next();
/* 81 */                    List list5 = oi01iIoI.I00000oIO;
/* 85 */                    Iterator it5 = it4;
/* 89 */                    if ((list5 instanceof Collection) && list5.isEmpty()) {
/* 100 */                       list3 = list4;
/* 102 */                       arrayList = arrayList2;
/* 104 */                       z3 = false;
                            } else {
/* 107 */                       Iterator it6 = list5.iterator();
/* 115 */                       while (it6.hasNext()) {
/* 123 */                           int i = ((OlOO0I1) it6.next()).I00000oIO;
/* 125 */                           ArrayList arrayList4 = olOO00iI0lI.I00ioIO;
/* 127 */                           if (arrayList4 == null || !arrayList4.isEmpty()) {
/* 142 */                               Iterator it7 = arrayList4.iterator();
/* 150 */                               while (it7.hasNext()) {
/* 156 */                                   Iterator it8 = it6;
/* 160 */                                   OlOIo0l1O0Ol olOIo0l1O0Ol = (OlOIo0l1O0Ol) it7.next();
/* 162 */                                   list3 = list4;
/* 164 */                                   OIlIOo oIlIOo = olOIo0l1O0Ol.I000II;
/* 166 */                                   OIlIOoOil oIlIOoOil = olOIo0l1O0Ol.I000OOo1O;
/* 168 */                                   if (oIlIOo == null) {
/* 170 */                                       it3 = it7;
/* 172 */                                       arrayList = arrayList2;
/* 174 */                                       zI00000oIO3 = false;
                                            } else {
/* 176 */                                       it3 = it7;
/* 178 */                                       arrayList = arrayList2;
/* 184 */                                       zI00000oIO3 = OIlIOo.I00000oIO(oIlIOo.I00000oIO, 1L);
                                            }
/* 188 */                                   if (!zI00000oIO3) {
/* 202 */                                       if (!(oIlIOoOil == null ? false : OIlIOoOil.I00000oIO(oIlIOoOil.I00000oIO, 0L)) && oIlIOoOil != null) {
/* 207 */                                           list4 = list3;
/* 209 */                                           it6 = it8;
/* 211 */                                           arrayList2 = arrayList;
/* 213 */                                           it7 = it3;
                                                }
                                            }
/* 216 */                                   z3 = true;
                                        }
                                    }
/* 219 */                           list4 = list4;
/* 221 */                           it6 = it6;
/* 223 */                           arrayList2 = arrayList2;
                                }
/* 100 */                       list3 = list4;
/* 102 */                       arrayList = arrayList2;
/* 104 */                       z3 = false;
                            }
/* 226 */                   Boolean boolValueOf = Boolean.valueOf(z3);
/* 232 */                   if (bool2 != null && !bool2.equals(boolValueOf)) {
/* 269 */                       Log.e("CXCP", "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: " + bool2.booleanValue() + ". Current request contains preview stream use case or hint: " + z3 + '.');
                            }
/* 272 */                   List list6 = oi01iIoI.I00000oIO;
/* 278 */                   if ((list6 instanceof Collection) && list6.isEmpty()) {
/* 289 */                       z4 = false;
                            } else {
/* 291 */                       Iterator it9 = list6.iterator();
/* 299 */                       while (it9.hasNext()) {
/* 307 */                           int i2 = ((OlOO0I1) it9.next()).I00000oIO;
/* 309 */                           ArrayList arrayList5 = olOO00iI0lI.I00ioIO;
/* 311 */                           if (arrayList5 == null || !arrayList5.isEmpty()) {
/* 320 */                               Iterator it10 = arrayList5.iterator();
/* 328 */                               while (it10.hasNext()) {
/* 334 */                                   OlOIo0l1O0Ol olOIo0l1O0Ol2 = (OlOIo0l1O0Ol) it10.next();
/* 336 */                                   OIlIOo oIlIOo2 = olOIo0l1O0Ol2.I000II;
/* 350 */                                   if (!(oIlIOo2 == null ? false : OIlIOo.I00000oIO(oIlIOo2.I00000oIO, 3L))) {
/* 352 */                                       OIlIOoOil oIlIOoOil2 = olOIo0l1O0Ol2.I000OOo1O;
/* 366 */                                       if (oIlIOoOil2 == null ? false : OIlIOoOil.I00000oIO(oIlIOoOil2.I00000oIO, 1L)) {
                                                }
                                            }
/* 372 */                                   z4 = true;
                                        }
                                    }
                                }
/* 289 */                       z4 = false;
                            }
/* 378 */                   Boolean boolValueOf2 = Boolean.valueOf(z4);
/* 382 */                   if (bool != null && !bool.equals(boolValueOf2)) {
/* 421 */                       Log.e("CXCP", "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: " + bool.booleanValue() + ". Current request contains video stream use case: " + z4 + '.');
                            }
/* 424 */                   ArrayList arrayList6 = olOO00iI0lI.I00ioIO;
/* 426 */                   if (arrayList6 == null || !arrayList6.isEmpty()) {
/* 435 */                       Iterator it11 = arrayList6.iterator();
/* 443 */                       while (it11.hasNext()) {
/* 455 */                           if (!((OlOIo0l1O0Ol) it11.next()).I00000oIO()) {
/* 473 */                               Log.e("CXCP", "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are " + olOO00iI0lI.I00ioIO);
/* 50 */                                return null;
                                    }
                                }
                            }
/* 477 */                   bool2 = boolValueOf;
/* 478 */                   bool = boolValueOf2;
/* 479 */                   it4 = it5;
/* 481 */                   list4 = list3;
/* 483 */                   arrayList2 = arrayList;
                        }
                    }
/* 489 */           ArrayList arrayList7 = arrayList2;
/* 497 */           if (list4.isEmpty()) {
/* 1656 */              I000II.I001IO000("build(...) should never be called with an empty request list!");
/* 50 */                return null;
                    }
/* 499 */           Iterator it12 = list.iterator();
/* 664 */           do {
/* 507 */               char c = '!';
/* 509 */               if (!it12.hasNext()) {
/* 674 */                   Iterator it13 = list.iterator();
/* 682 */                   while (it13.hasNext()) {
/* 689 */                       Oi01iIoI oi01iIoI2 = (Oi01iIoI) it13.next();
/* 691 */                       Objects.toString(oi01iIoI2);
/* 694 */                       Oi0OO1IIl1 oi0OO1IIl1 = oi01iIoI2.I0000oI00;
/* 701 */                       int i3 = oi0OO1IIl1 != null ? oi0OO1IIl1.I00000oIO : this.I0000Il00O;
/* 705 */                       IIlIIOi iIlIIOi2 = this.I00000oIO;
/* 707 */                       Ioloo0I1O0l0 ioloo0I1O0l0 = oi01iIoI2.I0001Ioi1lo;
/* 709 */                       if (ioloo0I1O0l0 != null) {
/* 725 */                           TotalCaptureResult totalCaptureResult = (TotalCaptureResult) ioloo0I1O0l0.I00000oOI.I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(TotalCaptureResult.class));
/* 727 */                           if (totalCaptureResult == null) {
/* 744 */                               IOOlIIilOl0.I0001Ioi1lo(ioloo0I1O0l0.I00000oOI, "Failed to unwrap FrameInfo ", " as TotalCaptureResult");
/* 50 */                                return null;
                                    }
/* 733 */                           builderI00OOll1 = iIlIIOi2.I00Ol10().I00100l0(totalCaptureResult);
                                } else {
/* 752 */                           builderI00OOll1 = iIlIIOi2.I00Ol10().I00OOll1(i3);
                                }
/* 756 */                       if (builderI00OOll1 == null) {
/* 758 */                           if (ioloo0I1O0l0 != null) {
/* 779 */                               Log.i("CXCP", "Failed to create a ReprocessingCaptureRequest.Builder from " + ioloo0I1O0l0.I00000oOI + c);
                                    } else {
/* 804 */                               Log.i("CXCP", "Failed to create a CaptureRequest.Builder from " + ((Object) Oi0OO1IIl1.I0000Il00O(i3)) + c);
                                    }
/* 807 */                           builderI00OOll1 = null;
                                }
/* 809 */                       if (builderI00OOll1 == null) {
/* 50 */                            return null;
                                }
/* 813 */                       O1lOllO o1lOllO = IIloiOIOoo.I00000oOI;
/* 815 */                       Map map4 = map3;
/* 817 */                       Object obj = map4.get(o1lOllO);
/* 823 */                       if (obj == null) {
/* 825 */                           obj = map.get(o1lOllO);
                                }
/* 829 */                       builderI00OOll1.setTag(obj);
/* 836 */                       int size = oi01iIoI2.I00000oIO.size();
/* 841 */                       boolean z5 = false;
/* 842 */                       for (int i4 = 0; i4 < size; i4++) {
/* 854 */                           Surface surface = (Surface) arrayMap5.get(oi01iIoI2.I00000oIO.get(i4));
/* 856 */                           if (surface != null) {
/* 858 */                               builderI00OOll1.addTarget(surface);
/* 861 */                               z5 = true;
                                    }
                                }
/* 866 */                       if (!z5) {
/* 1553 */                          I000II.I001IO000("Check failed.");
/* 50 */                            return null;
                                }
/* 868 */                       Ioloo0I1O0l0 ioloo0I1O0l02 = oi01iIoI2.I0001Ioi1lo;
/* 870 */                       if (ioloo0I1O0l02 == null) {
/* 1115 */                          lIoO00l.I00000oOI(builderI00OOll1, map);
/* 1120 */                          lIoO00l.I00000oOI(builderI00OOll1, map2);
/* 1125 */                          lIoO00l.I00000oOI(builderI00OOll1, oi01iIoI2.I00000oOI);
/* 1128 */                          lIoO00l.I00000oOI(builderI00OOll1, map4);
                                } else {
/* 874 */                           if (this.I000lI == null) {
/* 880 */                               Log.e("CXCP", "Failed to queue request to ImageWriter - No ImageWriter available!");
/* 50 */                                return null;
                                    }
/* 885 */                           I0oIollOil0 i0oIollOil0 = ioloo0I1O0l02.I00000oIO;
                                    synchronized (this.I000OiO) {
/* 892 */                               if (this.I000iOII) {
/* 926 */                                   Log.w("CXCP", this + " disconnected. " + i0oIollOil0 + " can't be queued to " + this.I000lI);
/* 50 */                                    return null;
                                        }
/* 936 */                               Objects.toString(i0oIollOil0);
/* 941 */                               Objects.toString(this.I000lI);
/* 944 */                               I0oO11I i0oO11I = this.I000lI;
/* 946 */                               i0oO11I.getClass();
                                        try {
/* 965 */                                   image = (Image) i0oIollOil0.I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(Image.class));
                                        } catch (Throwable th) {
/* 1036 */                                  Log.w("CXCP", "Failed to queue image to " + i0oO11I + " due to error " + th.getMessage() + ". Ignoring failure and closing " + i0oIollOil0);
/* 1041 */                                  if (i0oIollOil0 instanceof AutoCloseable) {
/* 1043 */                                      i0oIollOil0.close();
                                            } else {
/* 1049 */                                      if (!(i0oIollOil0 instanceof ExecutorService)) {
/* 1109 */                                          OIiilo1Ool0o.I00100o1O0lo();
/* 50 */                                            return null;
                                                }
/* 1052 */                                      ExecutorService executorService = (ExecutorService) i0oIollOil0;
/* 1058 */                                      if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 1067 */                                          executorService.shutdown();
/* 1070 */                                          boolean z6 = false;
/* 1071 */                                          while (!zIsTerminated) {
                                                        try {
/* 1077 */                                                  zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                        } catch (InterruptedException unused) {
/* 1082 */                                                  if (!z6) {
/* 1084 */                                                      executorService.shutdownNow();
/* 1087 */                                                      z6 = true;
                                                            }
                                                        }
                                                    }
/* 1090 */                                          if (z6) {
/* 1096 */                                              Thread.currentThread().interrupt();
                                                    }
                                                }
                                            }
                                        }
/* 967 */                               if (image == null) {
/* 981 */                                   Log.w("CXCP", "Failed to unwrap image wrapper " + i0oIollOil0);
/* 1099 */                                  i0oIollOil0.toString();
/* 1104 */                                  Objects.toString(this.I000lI);
/* 50 */                                    return null;
                                        }
/* 990 */                               i0oO11I.I00iOIl.queueInputImage(image);
/* 995 */                               lIoO00l.I00000oOI(builderI00OOll1, oi01iIoI2.I00000oOI);
                                    }
                                }
/* 1131 */                      I1OooI1 i1OooI1 = IIl00Ooo.I0000Il00O;
/* 1133 */                      i1OooI1.getClass();
/* 1138 */                      long jIncrementAndGet = I1OooI1.I00000oOI.incrementAndGet(i1OooI1);
/* 1142 */                      CaptureRequest captureRequestBuild = builderI00OOll1.build();
/* 1146 */                      IIlIIOi iIlIIOi3 = this.I00000oIO;
/* 1150 */                      if (iIlIIOi3 instanceof I0lIOolO) {
/* 1152 */                          I0lIOolO i0lIOolO = (I0lIOolO) iIlIIOi3;
/* 1156 */                          I0lIi00oO i0lIi00oO = i0lIOolO.I00iOIl;
/* 1158 */                          arrayMap = arrayMap4;
                                    try {
                                        try {
/* 1164 */                                  Trace.beginSection("CXCP#createHighSpeedRequestList");
/* 1169 */                                  listCreateHighSpeedRequestList = i0lIOolO.I00ilI0I1.createHighSpeedRequestList(captureRequestBuild);
/* 1173 */                                  Trace.endSection();
                                        } catch (Throwable th2) {
/* 1178 */                                  Trace.endSection();
/* 1181 */                                  throw th2;
                                        }
                                    } catch (IllegalArgumentException unused2) {
/* 1220 */                              Log.w("CXCP", "Failed to createHighSpeedRequestList from " + i0lIi00oO + " because the output surface was destroyed before calling createHighSpeedRequestList.");
/* 1246 */                              listCreateHighSpeedRequestList = null;
/* 1248 */                              if (listCreateHighSpeedRequestList != null) {
                                        }
                                    } catch (IllegalStateException unused3) {
/* 1243 */                              Log.w("CXCP", "Failed to createHighSpeedRequestList. " + i0lIi00oO + " may be closed.");
/* 1246 */                              listCreateHighSpeedRequestList = null;
/* 1248 */                              if (listCreateHighSpeedRequestList != null) {
                                        }
                                    } catch (UnsupportedOperationException unused4) {
/* 1199 */                              Log.w("CXCP", "Failed to createHighSpeedRequestList from " + i0lIi00oO + " because the output surface was not available.");
/* 1246 */                              listCreateHighSpeedRequestList = null;
/* 1248 */                              if (listCreateHighSpeedRequestList != null) {
                                        }
                                    }
/* 1248 */                          if (listCreateHighSpeedRequestList != null) {
/* 50 */                                return null;
                                    }
/* 1252 */                          List list7 = oi01iIoI2.I00000oIO;
/* 1258 */                          if ((list7 instanceof Collection) && list7.isEmpty()) {
/* 1269 */                              arrayMap2 = arrayMap3;
/* 1486 */                              arrayList7 = arrayList7;
/* 1506 */                              IIl10I1I iIl10I1I = new IIl10I1I(this.I00000oIO, listCreateHighSpeedRequestList.get(0), map, map2, map3, arrayMap5, z, oi01iIoI2, jIncrementAndGet);
/* 1513 */                              arrayList3.add(listCreateHighSpeedRequestList.get(0));
/* 1516 */                              arrayList7.add(iIl10I1I);
                                    } else {
/* 1280 */                              Iterator it14 = list7.iterator();
/* 1288 */                              while (it14.hasNext()) {
/* 1296 */                                  int i5 = ((OlOO0I1) it14.next()).I00000oIO;
/* 1300 */                                  ArrayList arrayList8 = this.I0001Ioi1lo.I00ioIO;
/* 1302 */                                  if (arrayList8 == null || !arrayList8.isEmpty()) {
/* 1323 */                                      Iterator it15 = arrayList8.iterator();
/* 1331 */                                      while (it15.hasNext()) {
/* 1337 */                                          OlOIo0l1O0Ol olOIo0l1O0Ol3 = (OlOIo0l1O0Ol) it15.next();
/* 1339 */                                          OIlIOo oIlIOo3 = olOIo0l1O0Ol3.I000II;
/* 1341 */                                          if (oIlIOo3 == null) {
/* 1343 */                                              it = it14;
/* 1345 */                                              it2 = it15;
/* 1346 */                                              zI00000oIO = false;
                                                    } else {
/* 1350 */                                              it = it14;
/* 1352 */                                              it2 = it15;
/* 1357 */                                              zI00000oIO = OIlIOo.I00000oIO(oIlIOo3.I00000oIO, 3L);
                                                    }
/* 1361 */                                          if (zI00000oIO) {
/* 1390 */                                              j = 1;
                                                    } else {
/* 1363 */                                              OIlIOoOil oIlIOoOil3 = olOIo0l1O0Ol3.I000OOo1O;
/* 1365 */                                              if (oIlIOoOil3 == null) {
/* 1367 */                                                  zI00000oIO2 = false;
/* 1368 */                                                  j = 1;
                                                        } else {
/* 1373 */                                                  j = 1;
/* 1375 */                                                  zI00000oIO2 = OIlIOoOil.I00000oIO(oIlIOoOil3.I00000oIO, 1L);
                                                        }
/* 1379 */                                              if (!zI00000oIO2) {
/* 1382 */                                                  it14 = it;
/* 1388 */                                                  it15 = it2;
                                                        }
                                                    }
/* 1395 */                                          int size2 = listCreateHighSpeedRequestList.size();
/* 1399 */                                          int i6 = 0;
/* 1400 */                                          while (i6 < size2) {
/* 1415 */                                              int i7 = size2;
/* 1426 */                                              int i8 = i6;
/* 1431 */                                              IIl10I1I iIl10I1I2 = new IIl10I1I(this.I00000oIO, listCreateHighSpeedRequestList.get(i6), map, map2, map4, arrayMap5, z, oi01iIoI2, jIncrementAndGet);
/* 1438 */                                              arrayList3.add(listCreateHighSpeedRequestList.get(i8));
/* 1443 */                                              arrayList7.add(iIl10I1I2);
/* 1446 */                                              i6 = i8 + 1;
/* 1448 */                                              size2 = i7;
/* 1450 */                                              map4 = map3;
/* 1452 */                                              arrayMap3 = arrayMap3;
/* 1454 */                                              j = j;
                                                    }
/* 1457 */                                          arrayMap2 = arrayMap3;
                                                }
                                            }
/* 1470 */                                  it14 = it14;
/* 1476 */                                  map4 = map3;
/* 1478 */                                  arrayList7 = arrayList7;
/* 1480 */                                  arrayMap3 = arrayMap3;
                                        }
/* 1269 */                              arrayMap2 = arrayMap3;
/* 1486 */                              arrayList7 = arrayList7;
/* 1506 */                              IIl10I1I iIl10I1I3 = new IIl10I1I(this.I00000oIO, listCreateHighSpeedRequestList.get(0), map, map2, map3, arrayMap5, z, oi01iIoI2, jIncrementAndGet);
/* 1513 */                              arrayList3.add(listCreateHighSpeedRequestList.get(0));
/* 1516 */                              arrayList7.add(iIl10I1I3);
                                    }
                                } else {
/* 1520 */                          arrayMap = arrayMap4;
/* 1522 */                          arrayMap2 = arrayMap3;
/* 1541 */                          IIl10I1I iIl10I1I4 = new IIl10I1I(iIlIIOi3, captureRequestBuild, map, map2, map3, arrayMap5, z, oi01iIoI2, jIncrementAndGet);
/* 1544 */                          arrayList3.add(captureRequestBuild);
/* 1547 */                          arrayList7.add(iIl10I1I4);
                                }
/* 1462 */                      arrayMap3 = arrayMap2;
/* 1464 */                      arrayMap4 = arrayMap;
/* 1466 */                      c = '!';
                            }
/* 1557 */                  ArrayMap arrayMap6 = arrayMap4;
/* 1561 */                  ArrayList arrayList9 = arrayList7;
/* 1571 */                  String strI000l1 = this.I00000oIO.I00Ol10().I000l1();
/* 1575 */                  OlOO00iI0lI olOO00iI0lI2 = this.I0001Ioi1lo;
/* 1577 */                  OlOl1I olOl1I = this.I000II;
/* 1579 */                  IIl0001i1o01 iIl0001i1o01 = new IIl0001i1o01();
/* 1582 */                  iIl0001i1o01.I00000oIO = strI000l1;
/* 1586 */                  iIl0001i1o01.I00000oOI = z;
/* 1588 */                  iIl0001i1o01.I0000Il00O = arrayList3;
/* 1590 */                  iIl0001i1o01.I0000O = arrayList9;
/* 1594 */                  iIl0001i1o01.I0000oI00 = list2;
/* 1598 */                  iIl0001i1o01.I0001Ioi1lo = o1OIll00i;
/* 1602 */                  iIl0001i1o01.I000II = arrayMap3;
/* 1606 */                  iIl0001i1o01.I000O01llI0 = arrayMap6;
/* 1608 */                  iIl0001i1o01.I000OOo1O = olOO00iI0lI2;
/* 1610 */                  iIl0001i1o01.I000OiO = olOl1I;
/* 1612 */                  I1OooI1 i1OooI12 = IIl00Ooo.I00000oOI;
/* 1614 */                  i1OooI12.getClass();
/* 1623 */                  iIl0001i1o01.I000iOII = I1OooI1.I00000oOI.incrementAndGet(i1OooI12);
/* 1630 */                  iIl0001i1o01.I000l1 = new IOi10loi();
/* 1640 */                  if (arrayList3.size() == arrayList9.size()) {
/* 1642 */                      VarHandle.storeStoreFence();
/* 1645 */                      return iIl0001i1o01;
                            }
/* 1650 */                  I000II.I001IO000("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
/* 50 */                    return null;
                        }
/* 515 */               Oi01iIoI oi01iIoI3 = (Oi01iIoI) it12.next();
/* 519 */               Iterator it16 = oi01iIoI3.I00000oIO.iterator();
/* 523 */               z2 = false;
/* 528 */               while (it16.hasNext()) {
/* 536 */                   int i9 = ((OlOO0I1) it16.next()).I00000oIO;
/* 546 */                   if (!arrayMap5.containsKey(OlOO0I1.I00000oIO(i9))) {
/* 561 */                       Surface surface2 = (Surface) this.I0000O.get(OlOO0I1.I00000oIO(i9));
/* 563 */                       if (surface2 != null) {
/* 569 */                           arrayMap3.put(surface2, OlOO0I1.I00000oIO(i9));
/* 576 */                           arrayMap5.put(OlOO0I1.I00000oIO(i9), surface2);
/* 581 */                           IIo1loI0 iIo1loI0I00000oIO = this.I0001Ioi1lo.I00000oIO(i9);
/* 585 */                           if (iIo1loI0I00000oIO == null) {
/* 635 */                               I000II.I001IO000("Required value was null.");
/* 50 */                                return null;
                                    }
/* 589 */                           Iterator it17 = iIo1loI0I00000oIO.I00000oOI.iterator();
/* 597 */                           while (it17.hasNext()) {
/* 603 */                               OlOIo0l1O0Ol olOIo0l1O0Ol4 = (OlOIo0l1O0Ol) it17.next();
/* 613 */                               Object obj2 = this.I0000oI00.get(OIl1lI0ll101.I00000oIO(olOIo0l1O0Ol4.I00000oIO));
/* 617 */                               if (obj2 == null) {
/* 631 */                                   I000II.I001IO000("Required value was null.");
/* 50 */                                    return null;
                                        }
/* 627 */                               arrayMap4.put((Surface) obj2, OIl1lI0ll101.I00000oIO(olOIo0l1O0Ol4.I00000oIO));
                                    }
                                } else {
                                    continue;
                                }
                            }
/* 548 */                   z2 = true;
                        }
/* 639 */               if (!z2) {
/* 660 */                   Log.i("CXCP", "  Failed to bind any surfaces for " + oi01iIoI3 + '!');
/* 50 */                    return null;
                        }
/* 664 */           } while (z2);
/* 670 */           I000II.I001IO000("Check failed.");
/* 50 */            return null;
                }

                public final void I0000Il00O() {
                    IIl0001i1o01 iIl0001i1o01;
                    try {
/* 18 */                Trace.beginSection(this + "#disconnect");
                        synchronized (this.I000OiO) {
                            try {
/* 26 */                        if (this.I000iOII) {
/* 55 */                            iIl0001i1o01 = null;
                                } else {
/* 29 */                            this.I000iOII = true;
/* 31 */                            I0oO11I i0oO11I = this.I000lI;
/* 33 */                            if (i0oO11I != null) {
/* 35 */                                IIl001iO0Io.I001iOo1i0O(i0oO11I);
                                    }
/* 43 */                            Surface inputSurface = this.I00000oIO.getInputSurface();
/* 47 */                            if (inputSurface != null) {
/* 49 */                                inputSurface.release();
                                    }
/* 52 */                            iIl0001i1o01 = this.I000l1;
                                }
                            } catch (Throwable th) {
/* 71 */                        throw th;
                            }
                        }
/* 59 */                if (this.I000O01llI0 && iIl0001i1o01 != null) {
/* 63 */                    I00000oIO(iIl0001i1o01);
                        }
                    } finally {
/* 73 */                Trace.endSection();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Integer I0000O(IIl0001i1o01 iIl0001i1o01) {
                    Integer numI00oI0i;
                    synchronized (this.I000OiO) {
/* 6 */                 if (this.I000iOII) {
/* 35 */                    Log.w("CXCP", this + " disconnected. " + iIl0001i1o01 + " won't be submitted");
/* 39 */                    return null;
                        }
/* 50 */                if (iIl0001i1o01.I0000Il00O.size() == 1) {
/* 52 */                    IIlIIOi iIlIIOi = this.I00000oIO;
/* 56 */                    if (iIlIIOi instanceof I0lIOolO) {
/* 95 */                        boolean z = iIl0001i1o01.I00000oOI;
/* 97 */                        IIlIIOi iIlIIOi2 = this.I00000oIO;
/* 99 */                        ArrayList arrayList = iIl0001i1o01.I0000Il00O;
/* 108 */                       numI00oI0i = z ? iIlIIOi2.I00oI0i(arrayList, iIl0001i1o01) : iIlIIOi2.I00oOio10iI1(arrayList, iIl0001i1o01);
                            } else if (iIl0001i1o01.I00000oOI) {
/* 65 */                        if (this.I000O01llI0) {
/* 67 */                            this.I000l1 = iIl0001i1o01;
                                }
/* 77 */                        numI00oI0i = iIlIIOi.I00oO101o((CaptureRequest) iIl0001i1o01.I0000Il00O.get(0), iIl0001i1o01);
                            } else {
/* 90 */                        numI00oI0i = iIlIIOi.I00IO1((CaptureRequest) iIl0001i1o01.I0000Il00O.get(0), iIl0001i1o01);
                            }
                        }
/* 113 */               return numI00oI0i;
                    }
                }

                public final String toString() {
/* 13 */            return "Camera2CaptureSequenceProcessor-" + this.I000OOo1O;
                }
            }
