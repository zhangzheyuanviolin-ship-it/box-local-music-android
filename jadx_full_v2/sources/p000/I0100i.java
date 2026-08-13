            package p000;

            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.graphics.Typeface;
            import android.os.Process;
            import android.os.SystemClock;
            import android.os.Trace;
            import android.util.Log;
            import android.view.ActionMode;
            import android.view.Choreographer;
            import com.google.ai.edge.litertlm.Conversation;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.nio.MappedByteBuffer;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Set;
            
            public final class I0100i implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;

                public I0100i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                private final void I00000oIO() {
/* 3 */             Ioi10iOOI ioi10iOOI = (Ioi10iOOI) this.I00iiI;
                    synchronized (ioi10iOOI.I00ol1) {
                        try {
/* 9 */                     ioi10iOOI.I00oli = null;
/* 11 */                    IoiO1IO1I1i ioiO1IO1I1i = ioi10iOOI.I00olI;
/* 13 */                    if (ioiO1IO1I1i != null) {
/* 15 */                        ioi10iOOI.I00olI = null;
/* 17 */                        ioi10iOOI.I0001Ioi1lo(ioiO1IO1I1i);
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                private final void I00000oOI() {
/* 3 */             IOiOol0 iOiOol0 = (IOiOol0) this.I00iiI;
/* 9 */             if (((IIoIloi0) iOiOol0.I00io1l) != null) {
/* 11 */                iOiOol0.I00IoIO0lI();
/* 16 */                O0oOooi1l o0oOooi1l = (O0oOooi1l) iOiOol0.I00ioIO;
/* 20 */                Set<I1l100l> setKeySet = (HashSet) iOiOol0.I00ilI0I1;
                        synchronized (o0oOooi1l.I00000oIO) {
/* 25 */                    if (setKeySet == null) {
                                try {
/* 29 */                            setKeySet = o0oOooi1l.I00000oOI.keySet();
                                } catch (Throwable th) {
/* 75 */                            throw th;
                                }
                            }
/* 44 */                    for (I1l100l i1l100l : setKeySet) {
/* 58 */                        if (o0oOooi1l.I00000oOI.containsKey(i1l100l)) {
/* 68 */                            o0oOooi1l.I000iOII((O0oOi0i1O) o0oOooi1l.I00000oOI.get(i1l100l));
                                }
                            }
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:241:0x0468, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:243:0x046c, code lost:
                
                    throw r0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:147:0x021f  */
                /* JADX WARN: Removed duplicated region for block: B:148:0x0227  */
                /* JADX WARN: Removed duplicated region for block: B:173:0x0308  */
                /* JADX WARN: Removed duplicated region for block: B:231:0x0438  */
                /* JADX WARN: Removed duplicated region for block: B:284:0x035b A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() throws SecurityException, IllegalArgumentException {
                    int i;
                    long j;
                    float f;
                    ArrayList arrayList;
                    boolean z;
/* 6 */             boolean z2 = false;
/* 8 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 1189 */                  ((I0100o111I) this.I00iiI).I00000oOI();
/* 1192 */                  return;
                        case 1:
/* 1181 */                  ((OIOo1iiI) this.I00iiI).invoke();
/* 1184 */                  return;
                        case 2:
/* 1136 */                  I0ll1oo i0ll1oo = (I0ll1oo) this.I00iiI;
/* 1140 */                  Trace.beginSection("Compose:semantics:measureAndLayout");
                            try {
/* 1146 */                      i0ll1oo.I00iio.I0010I0i(true);
/* 1149 */                      Trace.endSection();
/* 1154 */                      Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                                try {
/* 1157 */                          i0ll1oo.I000OOo1O();
/* 1160 */                          Trace.endSection();
/* 1164 */                          i0ll1oo.I010II = false;
/* 1166 */                          return;
                                } finally {
                                }
                            } finally {
                            }
                        case 3:
/* 968 */                   I0lo1oIo i0lo1oIo = (I0lo1oIo) this.I00iiI;
/* 970 */                   boolean zI0000O = i0lo1oIo.I0000O();
/* 974 */                   I0lio1O01i01 i0lio1O01i01 = i0lo1oIo.I00iOIl;
/* 976 */                   if (zI0000O) {
/* 982 */                       Trace.beginSection("ContentCapture:changeChecker");
                                try {
/* 986 */                           i0lio1O01i01.I0010I0i(true);
/* 989 */                           OI0l1oli1I oI0l1oli1I = i0lo1oIo.I00li1OI;
/* 991 */                           int[] iArr = oI0l1oli1I.I00000oOI;
/* 993 */                           long[] jArr = oI0l1oli1I.I00000oIO;
/* 996 */                           int length = jArr.length - 2;
/* 997 */                           if (length >= 0) {
/* 999 */                               int i2 = 0;
                                        while (true) {
/* 1000 */                                  long j2 = jArr[i2];
/* 1014 */                                  if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 1023 */                                      int i3 = 8 - ((~(i2 - length)) >>> 31);
/* 1026 */                                      for (int i4 = 0; i4 < i3; i4++) {
/* 1035 */                                          if ((255 & j2) < 128) {
/* 1040 */                                              int i5 = iArr[(i2 << 3) + i4];
/* 1050 */                                              if (!i0lo1oIo.I0000Il00O().I00000oIO(i5)) {
/* 1065 */                                                  i0lo1oIo.I00iio.add(new IOoIOi(i5, i0lo1oIo.I00l0OO0IO, IOoIiIOliiO1.I00iiI, null));
/* 1072 */                                                  i0lo1oIo.I00ioIO.I000lI(OoiIlOl1iI.I00000oIO);
                                                        }
                                                    }
/* 1075 */                                          j2 >>= 8;
                                                }
/* 1079 */                                      if (i3 == 8) {
/* 1081 */                                          if (i2 != length) {
/* 1083 */                                              i2++;
                                                    }
                                                }
                                            }
                                        }
                                    }
/* 1088 */                          Trace.beginSection("ContentCapture:sendAppearEvents");
/* 1101 */                          i0lo1oIo.I0001Ioi1lo(i0lio1O01i01.getSemanticsOwner().I00000oIO(), i0lo1oIo.I00ll1);
/* 1104 */                          Trace.endSection();
/* 1111 */                          i0lo1oIo.I00000oOI(i0lo1oIo.I0000Il00O());
/* 1114 */                          i0lo1oIo.I000OiO();
/* 1118 */                          i0lo1oIo.I00lli11 = false;
/* 1123 */                          return;
                                } finally {
                                }
                            }
/* 1123 */                  return;
                        case 4:
/* 958 */                   ActionMode actionMode = ((I100OOIO0oio) this.I00iiI).I000O01llI0;
/* 960 */                   if (actionMode != null) {
/* 962 */                       actionMode.finish();
/* 965 */                       return;
                            }
/* 965 */                   return;
                        case 5:
/* 950 */                   ((I10I01iioO) this.I00iiI).invoke();
/* 953 */                   return;
                        case 6:
/* 484 */                   I1100oilii i1100oilii = (I1100oilii) ((I1100oilii) this.I00iiI).I0000Il00O.I00iiI;
/* 486 */                   long jUptimeMillis = SystemClock.uptimeMillis();
/* 490 */                   ArrayList arrayList2 = i1100oilii.I00000oOI;
/* 492 */                   long jUptimeMillis2 = SystemClock.uptimeMillis();
/* 496 */                   int i6 = 0;
/* 501 */                   while (i6 < arrayList2.size()) {
/* 507 */                       OlIOOillOO olIOOillOO = (OlIOOillOO) arrayList2.get(i6);
/* 509 */                       if (olIOOillOO == null) {
/* 511 */                           arrayList = arrayList2;
                                } else {
/* 514 */                           Ol0Ii10o1 ol0Ii10o1 = i1100oilii.I00000oIO;
/* 520 */                           Long l = (Long) ol0Ii10o1.get(olIOOillOO);
/* 522 */                           if (l != null) {
/* 531 */                               if (l.longValue() < jUptimeMillis2) {
/* 533 */                                   ol0Ii10o1.remove(olIOOillOO);
/* 536 */                                   j = olIOOillOO.I0001Ioi1lo;
/* 542 */                                   if (j != 0) {
/* 544 */                                       olIOOillOO.I0001Ioi1lo = jUptimeMillis;
/* 548 */                                       olIOOillOO.I00000oIO(olIOOillOO.I00000oOI);
                                            } else {
/* 552 */                                       long j3 = jUptimeMillis - j;
/* 554 */                                       olIOOillOO.I0001Ioi1lo = jUptimeMillis;
/* 560 */                                       float f2 = I1100oilii.I00000oIO().I000II;
/* 575 */                                       long j4 = f2 == 0.0f ? 2147483647L : (long) (j3 / f2);
/* 577 */                                       boolean z3 = olIOOillOO.I000l1;
/* 579 */                                       float f3 = olIOOillOO.I000iOII;
/* 584 */                                       if (z3) {
/* 588 */                                           if (f3 != Float.MAX_VALUE) {
/* 593 */                                               olIOOillOO.I000OiO.I000OOo1O = f3;
/* 595 */                                               olIOOillOO.I000iOII = Float.MAX_VALUE;
                                                    }
/* 602 */                                           olIOOillOO.I00000oOI = (float) olIOOillOO.I000OiO.I000OOo1O;
/* 604 */                                           olIOOillOO.I00000oIO = 0.0f;
/* 606 */                                           olIOOillOO.I000l1 = z2;
/* 608 */                                           arrayList = arrayList2;
                                                } else {
/* 614 */                                           OlIOOlill1o olIOOlill1o = olIOOillOO.I000OiO;
/* 616 */                                           float f4 = olIOOillOO.I00000oOI;
/* 618 */                                           float f5 = olIOOillOO.I00000oIO;
/* 620 */                                           if (f3 != Float.MAX_VALUE) {
/* 626 */                                               long j5 = j4 / 2;
/* 634 */                                               Iio1o1I iio1o1II00000oIO = olIOOlill1o.I00000oIO(f4, f5, j5);
/* 638 */                                               OlIOOlill1o olIOOlill1o2 = olIOOillOO.I000OiO;
/* 643 */                                               olIOOlill1o2.I000OOo1O = olIOOillOO.I000iOII;
/* 645 */                                               olIOOillOO.I000iOII = Float.MAX_VALUE;
/* 659 */                                               Iio1o1I iio1o1II00000oIO2 = olIOOlill1o2.I00000oIO(iio1o1II00000oIO.I00iOIl, iio1o1II00000oIO.I00iiI, j5);
/* 663 */                                               f = iio1o1II00000oIO2.I00iOIl;
/* 665 */                                               olIOOillOO.I00000oOI = f;
/* 669 */                                               olIOOillOO.I00000oIO = iio1o1II00000oIO2.I00iiI;
                                                    } else {
/* 683 */                                               Iio1o1I iio1o1II00000oIO3 = olIOOlill1o.I00000oIO(f4, f5, j4);
/* 687 */                                               f = iio1o1II00000oIO3.I00iOIl;
/* 689 */                                               olIOOillOO.I00000oOI = f;
/* 693 */                                               olIOOillOO.I00000oIO = iio1o1II00000oIO3.I00iiI;
                                                    }
/* 696 */                                           float fMax = Math.max(f, -3.4028235E38f);
/* 700 */                                           olIOOillOO.I00000oOI = fMax;
/* 706 */                                           olIOOillOO.I00000oOI = Math.min(fMax, Float.MAX_VALUE);
/* 708 */                                           float f6 = olIOOillOO.I00000oIO;
/* 710 */                                           OlIOOlill1o olIOOlill1o3 = olIOOillOO.I000OiO;
/* 712 */                                           olIOOlill1o3.getClass();
/* 715 */                                           double dAbs = Math.abs(f6);
/* 720 */                                           arrayList = arrayList2;
/* 725 */                                           if (dAbs >= olIOOlill1o3.I0000oI00 || Math.abs(r3 - ((float) olIOOlill1o3.I000OOo1O)) >= olIOOlill1o3.I0000O) {
/* 754 */                                               z = false;
/* 757 */                                               float fMin = Math.min(olIOOillOO.I00000oOI, Float.MAX_VALUE);
/* 761 */                                               olIOOillOO.I00000oOI = fMin;
/* 766 */                                               float fMax2 = Math.max(fMin, -3.4028235E38f);
/* 770 */                                               olIOOillOO.I00000oOI = fMax2;
/* 772 */                                               olIOOillOO.I00000oIO(fMax2);
/* 775 */                                               if (z) {
                                                            continue;
                                                        } else {
/* 777 */                                                   ArrayList arrayList3 = olIOOillOO.I000O01llI0;
/* 780 */                                                   olIOOillOO.I0000oI00 = false;
/* 782 */                                                   I1100oilii i1100oiliiI00000oIO = I1100oilii.I00000oIO();
/* 788 */                                                   i1100oiliiI00000oIO.I00000oIO.remove(olIOOillOO);
/* 791 */                                                   ArrayList arrayList4 = i1100oiliiI00000oIO.I00000oOI;
/* 793 */                                                   int iIndexOf = arrayList4.indexOf(olIOOillOO);
/* 797 */                                                   if (iIndexOf >= 0) {
/* 800 */                                                       arrayList4.set(iIndexOf, null);
/* 804 */                                                       i1100oiliiI00000oIO.I0001Ioi1lo = true;
                                                            }
/* 808 */                                                   olIOOillOO.I0001Ioi1lo = 0L;
/* 815 */                                                   for (int i7 = 0; i7 < arrayList3.size(); i7++) {
/* 821 */                                                       if (arrayList3.get(i7) != null) {
/* 830 */                                                           arrayList3.get(i7).getClass();
/* 833 */                                                           OIiilo1Ool0o.I00000oIO();
/* 945 */                                                           return;
                                                                }
                                                            }
/* 846 */                                                   for (int size = arrayList3.size() - 1; size >= 0; size--) {
/* 852 */                                                       if (arrayList3.get(size) == null) {
/* 854 */                                                           arrayList3.remove(size);
                                                                }
                                                            }
                                                        }
                                                    } else {
/* 747 */                                               olIOOillOO.I00000oOI = (float) olIOOillOO.I000OiO.I000OOo1O;
/* 750 */                                               olIOOillOO.I00000oIO = 0.0f;
                                                    }
                                                }
/* 609 */                                       z = true;
/* 757 */                                       float fMin2 = Math.min(olIOOillOO.I00000oOI, Float.MAX_VALUE);
/* 761 */                                       olIOOillOO.I00000oOI = fMin2;
/* 766 */                                       float fMax22 = Math.max(fMin2, -3.4028235E38f);
/* 770 */                                       olIOOillOO.I00000oOI = fMax22;
/* 772 */                                       olIOOillOO.I00000oIO(fMax22);
/* 775 */                                       if (z) {
                                                }
                                            }
                                        }
/* 511 */                               arrayList = arrayList2;
                                    } else {
/* 536 */                               j = olIOOillOO.I0001Ioi1lo;
/* 542 */                               if (j != 0) {
                                        }
                                    }
                                }
/* 860 */                       i6++;
/* 862 */                       arrayList2 = arrayList;
/* 863 */                       z2 = false;
                            }
/* 868 */                   ArrayList arrayList5 = arrayList2;
/* 871 */                   if (i1100oilii.I0001Ioi1lo) {
/* 881 */                       for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
/* 887 */                           if (arrayList5.get(size2) == null) {
/* 889 */                               arrayList5.remove(size2);
                                    }
                                }
/* 899 */                       if (arrayList5.size() == 0) {
/* 901 */                           IoloOio0I ioloOio0I = i1100oilii.I000O01llI0;
/* 907 */                           ValueAnimator.unregisterDurationScaleChangeListener((I10oollIOol) ioloOio0I.I00iiI);
/* 911 */                           ioloOio0I.I00iiI = null;
                                }
/* 913 */                       i = 0;
/* 914 */                       i1100oilii.I0001Ioi1lo = false;
                            } else {
/* 917 */                       i = 0;
                            }
/* 922 */                   if (arrayList5.size() > 0) {
/* 924 */                       OlOO1i11110 olOO1i11110 = i1100oilii.I0000oI00;
/* 926 */                       I0100i i0100i = i1100oilii.I0000O;
/* 930 */                       Choreographer choreographer = (Choreographer) olOO1i11110.I00iiI;
/* 934 */                       I1100io i1100io = new I1100io(i);
/* 937 */                       i1100io.I00iiI = i0100i;
/* 939 */                       VarHandle.storeStoreFence();
/* 942 */                       choreographer.postFrameCallback(i1100io);
/* 945 */                       return;
                            }
/* 945 */                   return;
                        case 7:
/* 472 */                   il001oo1.I00000oOI(((I1iIilO0io01) this.I00iiI).I00000oIO, null);
/* 475 */                   return;
                        case 8:
/* 449 */                   II0lI0lO1 iI0lI0lO1 = ((II0i11) this.I00iiI).I0110OiO;
/* 451 */                   iOOol1iOiIO iI0ioIIollll = iI0lI0lO1.I0000Il00O;
/* 453 */                   if (iI0ioIIollll == null) {
/* 457 */                       iI0ioIIollll = new II0ioIIollll();
/* 460 */                       iI0lI0lO1.I0000Il00O = iI0ioIIollll;
                            }
/* 462 */                   iI0ioIIollll.I00000oOI();
/* 465 */                   return;
                        case 9:
/* 441 */                   il001oo1.I00000oOI(((IIl01i0I) this.I00iiI).I0000oI00, null);
/* 444 */                   return;
                        case 10:
/* 431 */                   iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new I0II0OiI((IIl10ilil1) this.I00iiI, iOoil1iiIilo, 9));
/* 434 */                   return;
                        case 11:
/* 408 */                   Runnable runnable = (Runnable) this.I00iiI;
/* 411 */                   Process.setThreadPriority(-3);
/* 414 */                   runnable.run();
/* 417 */                   return;
                        case 12:
/* 402 */                   ((IIo01Oii0) this.I00iiI).I00000oIO.getClass();
/* 405 */                   return;
                        case 13:
/* 366 */                   OOIo1Iiiil oOIo1Iiiil = (OOIo1Iiiil) ((I0Oi111ii) ((IIl1i10oO) this.I00iiI).I00000oOI).I00iiI;
/* 368 */                   if (oOIo1Iiiil != null) {
/* 373 */                       l11I11lO.I0000O(3, "ProcessingRequest");
/* 376 */                       Oi0Oi10I oi0Oi10I = oOIo1Iiiil.I000II;
/* 378 */                       oi0Oi10I.getClass();
/* 381 */                       lOllIO.I00000oIO();
/* 386 */                       if (oi0Oi10I.I000II || oi0Oi10I.I000O01llI0) {
/* 395 */                           return;
                                }
/* 393 */                       oi0Oi10I.I000O01llI0 = true;
/* 395 */                       return;
                            }
/* 395 */                   return;
                        case 14:
/* 344 */                   IOiO11OOiliI iOiO11OOiliI = (IOiO11OOiliI) this.I00iiI;
/* 346 */                   Runnable runnable2 = iOiO11OOiliI.I00iiI;
/* 348 */                   if (runnable2 != null) {
/* 350 */                       runnable2.run();
/* 353 */                       iOiO11OOiliI.I00iiI = null;
/* 355 */                       return;
                            }
/* 355 */                   return;
                        case 15:
/* 338 */                   IOiOOll1.I0000oI00((IOiOOll1) this.I00iiI);
/* 341 */                   return;
                        case 16:
/* 330 */                   ((Io1o0l0iOl) this.I00iiI).invoke();
/* 333 */                   return;
                        case 17:
/* 322 */                   ((IIiOOI) this.I00iiI).I0000O(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
/* 325 */                   return;
                        case PoseLandmark.RIGHT_PINKY:
/* 307 */                   ((OliolIlIO) this.I00iiI).close();
/* 310 */                   return;
                        case PoseLandmark.LEFT_INDEX:
/* 295 */                   IiI1oOoo iiI1oOoo = (IiI1oOoo) this.I00iiI;
/* 297 */                   iiI1oOoo.I000OiO = true;
/* 299 */                   iiI1oOoo.I0000oI00();
/* 302 */                   return;
                        case PoseLandmark.RIGHT_INDEX:
/* 285 */                   Iio1000IOoi1 iio1000IOoi1 = (Iio1000IOoi1) this.I00iiI;
/* 287 */                   iio1000IOoi1.I0001Ioi1lo = true;
/* 289 */                   iio1000IOoi1.I0000oI00();
/* 292 */                   return;
                        case PoseLandmark.LEFT_THUMB:
/* 254 */                   Iio111Ii0 iio111Ii0 = (Iio111Ii0) ((I1ii1o0) this.I00iiI).I00ilI0I1;
/* 256 */                   if (iio111Ii0 != null) {
/* 262 */                       Iterator it = iio111Ii0.values().iterator();
/* 270 */                       while (it.hasNext()) {
/* 278 */                           ((OlioOil) it.next()).I00000oOI();
                                }
/* 282 */                       return;
                            }
/* 282 */                   return;
                        case PoseLandmark.RIGHT_THUMB:
/* 74 */                    IliiOIiill iliiOIiill = (IliiOIiill) this.I00iiI;
                            synchronized (iliiOIiill.I00iio) {
                                try {
/* 83 */                            if (iliiOIiill.I00ioIO == null) {
/* 243 */                               return;
                                    }
                                    try {
/* 92 */                                Ilili1O1io ilili1O1ioI0000Il00O = iliiOIiill.I0000Il00O();
/* 96 */                                int i8 = ilili1O1ioI0000Il00O.I0001Ioi1lo;
/* 98 */                                if (i8 == 2) {
                                            synchronized (iliiOIiill.I00iio) {
                                            }
                                        }
/* 111 */                               if (i8 != 0) {
/* 225 */                                   throw new RuntimeException("fetchFonts result is not OK. (" + i8 + ")");
                                        }
                                        try {
/* 115 */                                   Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
/* 118 */                                   o0llIi o0llii = iliiOIiill.I00iiO;
/* 120 */                                   Context context = iliiOIiill.I00iOIl;
/* 122 */                                   o0llii.getClass();
/* 129 */                                   Typeface typefaceI00000oIO = OoOl10O1o.I00000oIO(context, new Ilili1O1io[]{ilili1O1ioI0000Il00O}, 0);
/* 137 */                                   MappedByteBuffer mappedByteBufferI00000oIO = lOoo01O1loo0.I00000oIO(iliiOIiill.I00iOIl, ilili1O1ioI0000Il00O.I00000oIO);
/* 141 */                                   if (mappedByteBufferI00000oIO == null || typefaceI00000oIO == null) {
/* 197 */                                       throw new RuntimeException("Unable to open file.");
                                            }
/* 147 */                                   Trace.beginSection("EmojiCompat.MetadataRepo.create");
/* 156 */                                   OillOo0 oillOo0 = new OillOo0(typefaceI00000oIO, l1OOloO.I00000oIO(mappedByteBufferI00000oIO));
/* 162 */                                   Trace.endSection();
                                            synchronized (iliiOIiill.I00iio) {
                                                try {
/* 168 */                                           ilI1Io1io ili1io1io = iliiOIiill.I00ioIO;
/* 170 */                                           if (ili1io1io != null) {
/* 172 */                                               ili1io1io.I00000oOI(oillOo0);
                                                    }
                                                } finally {
                                                }
                                            }
/* 179 */                                   iliiOIiill.I00000oOI();
/* 243 */                                   return;
                                        } catch (Throwable th) {
/* 189 */                                   throw th;
                                        } finally {
                                        }
                                    } catch (Throwable th2) {
                                        synchronized (iliiOIiill.I00iio) {
                                            try {
/* 229 */                                       ilI1Io1io ili1io1io2 = iliiOIiill.I00ioIO;
/* 231 */                                       if (ili1io1io2 != null) {
/* 233 */                                           ili1io1io2.I00000oIO(th2);
                                                }
/* 240 */                                       iliiOIiill.I00000oOI();
/* 243 */                                       return;
                                            } finally {
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        case PoseLandmark.LEFT_HIP:
/* 67 */                    I00000oIO();
/* 70 */                    return;
                        case PoseLandmark.RIGHT_HIP:
/* 63 */                    I00000oOI();
/* 66 */                    return;
                        case PoseLandmark.LEFT_KNEE:
/* 55 */                    O010OIi o010OIi = (O010OIi) this.I00iiI;
/* 57 */                    if (o010OIi != null) {
/* 59 */                        o010OIi.I000II(null);
/* 62 */                        return;
                            }
/* 62 */                    return;
                        case PoseLandmark.RIGHT_KNEE:
                            try {
/* 40 */                        ((Conversation) this.I00iiI).cancelProcess();
/* 52 */                        return;
                            } catch (Exception e) {
/* 49 */                        Log.w("AGLlmChatModelHelper", "loop-guard cancel failed", e);
/* 52 */                        return;
                            }
                        case 27:
/* 32 */                    ((I0O1OI) this.I00iiI).invoke();
/* 35 */                    return;
                        case PoseLandmark.RIGHT_ANKLE:
/* 24 */                    ((O1OllOiIo1I) this.I00iiI).I0000Il00O();
/* 27 */                    return;
                        default:
/* 16 */                    ((OOIIOiolI) this.I00iiI).I00100o1O0lo();
/* 19 */                    return;
                    }
                }
            }
