            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.ShortBuffer;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOOOloIOiI0 {
                /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(List list, float f, O1ooiI111i o1ooiI111i, boolean z, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    long j;
/* 4 */             iloI0lOlll1.I00i0O(2079413806);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000OOo1O(list) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 27 */            if ((i & 48) == 0) {
/* 39 */                i2 |= iloI0lOlll1.I0000O(f) ? 32 : 16;
                    }
/* 42 */            if ((i & 384) == 0) {
/* 55 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 58 */            if ((i & 3072) == 0) {
/* 71 */                i2 |= iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 89 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 99 */                long j2 = ((Ii0iOlI) iloI0lOlll1.I000iOII(Oo0oi1olI.I00000oOI)).I000o00OoI0I;
/* 101 */               if (z) {
/* 106 */                   iloI0lOlll1.I00i01iIIliI(1156882675);
/* 109 */                   iloI0lOlll1.I0010I0i(false);
/* 112 */                   j = IOOiio0i.I0001Ioi1lo;
                        } else {
/* 118 */                   iloI0lOlll1.I00i01iIIliI(1156883861);
/* 131 */                   j = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00000oIO;
/* 133 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 156 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(list) | iloI0lOlll1.I0001Ioi1lo(j2) | ((i2 & 112) == 32) | iloI0lOlll1.I0001Ioi1lo(j);
/* 157 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 161 */               if (!zI000OOo1O) {
                            Object obj = objI00O0i0ii;
/* 165 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 169 */                       I1iI0l1I i1iI0l1I = new I1iI0l1I();
/* 172 */                       i1iI0l1I.I00iOIl = list;
/* 174 */                       i1iI0l1I.I00iiI = f;
/* 176 */                       i1iI0l1I.I00iiO = j;
/* 178 */                       i1iI0l1I.I00iio = j2;
/* 180 */                       VarHandle.storeStoreFence();
/* 183 */                       iloI0lOlll1.I00iio(i1iI0l1I);
                                obj = i1iI0l1I;
                            }
/* 192 */                   iOl0ilO1.I00000oIO(o1ooiI111i, (Function1) obj, iloI0lOlll1, (i2 >> 6) & 14);
                        }
                    } else {
/* 196 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 199 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 203 */           if (oOloioIlI001IO000 != null) {
/* 207 */               I1iI1iOoIO i1iI1iOoIO = new I1iI1iOoIO();
/* 210 */               i1iI1iOoIO.I00iOIl = list;
/* 212 */               i1iI1iOoIO.I00iiI = f;
/* 214 */               i1iI1iOoIO.I00iiO = o1ooiI111i;
/* 216 */               i1iI1iOoIO.I00iio = z;
/* 218 */               i1iI1iOoIO.I00ilI0I1 = i;
/* 220 */               VarHandle.storeStoreFence();
/* 223 */               oOloioIlI001IO000.I0000O = i1iI1iOoIO;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:124:0x039f  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x03a8  */
                /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(byte[] bArr, int i, O1ooiI111i o1ooiI111i, boolean z, IloI0lOlll1 iloI0lOlll1, int i2, int i3) {
                    boolean z2;
                    int i4;
                    IloI0lOlll1 iloI0lOlll12;
                    OOloioIl oOloioIlI001IO000;
                    int i5;
                    int i6;
                    Object obj;
                    ArrayList arrayList;
                    Object obj2;
                    OI10i0Il oI10i0Il;
                    OI10i0Il oI10i0Il2;
                    OIooO1iiliI oIooO1iiliI;
                    long j;
/* 7 */             IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 14 */            iloI0lOlll13.I00i0O(612494923);
/* 38 */            int i7 = (iloI0lOlll13.I000OOo1O(bArr) ? 4 : 2) | i2 | (iloI0lOlll13.I0000oI00(i) ? 32 : 16);
/* 39 */            int i8 = i3 & 16;
/* 41 */            if (i8 == 0) {
/* 51 */                if ((i2 & 24576) == 0) {
/* 53 */                    z2 = z;
/* 66 */                    i7 |= iloI0lOlll13.I000O01llI0(z2) ? 16384 : 8192;
                        }
/* 47 */                i4 = i7;
/* 83 */                if (iloI0lOlll13.I00OIl(i4 & 1, (i4 & 9363) == 9362)) {
/* 928 */                   iloI0lOlll13.I00OilO00Il();
                            iloI0lOlll12 = iloI0lOlll13;
                        } else {
/* 89 */                    boolean z3 = i8 != 0 ? false : z2;
/* 90 */                    Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 94 */                    Object obj3 = IOl11li.I00000oIO;
/* 96 */                    if (objI00O0i0ii == obj3) {
/* 98 */                        objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll13);
/* 102 */                       iloI0lOlll13.I00iio(objI00O0i0ii);
                            }
/* 105 */                   Object obj4 = (Ii0110) objI00O0i0ii;
/* 107 */                   Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
/* 111 */                   if (objI00O0i0ii2 == obj3) {
/* 115 */                       objI00O0i0ii2 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 119 */                       iloI0lOlll13.I00iio(objI00O0i0ii2);
                            }
/* 124 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii2;
/* 126 */                   Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 130 */                   IOoil1iiIilo iOoil1iiIilo = null;
/* 132 */                   if (objI00O0i0ii3 == obj3) {
/* 134 */                       objI00O0i0ii3 = lOO00IiI0li.I00000oIO(null);
/* 138 */                       iloI0lOlll13.I00iio(objI00O0i0ii3);
                            }
/* 143 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii3;
/* 145 */                   boolean zI000II = iloI0lOlll13.I000II(bArr);
/* 149 */                   Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
/* 153 */                   if (zI000II || objI00O0i0ii4 == obj3) {
/* 169 */                       i5 = i4;
/* 175 */                       objI00O0i0ii4 = Double.valueOf((bArr.length / 2.0d) / i);
/* 179 */                       iloI0lOlll13.I00iio(objI00O0i0ii4);
                            } else {
/* 158 */                       i5 = i4;
                            }
/* 184 */                   double dDoubleValue = ((Number) objI00O0i0ii4).doubleValue();
/* 188 */                   boolean zI0000Il00O = iloI0lOlll13.I0000Il00O(dDoubleValue);
/* 192 */                   Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
/* 196 */                   if (zI0000Il00O || objI00O0i0ii5 == obj3) {
/* 213 */                       objI00O0i0ii5 = Integer.valueOf((int) (((dDoubleValue / 30.0d) * 32.0d) + 16.0d));
/* 217 */                       iloI0lOlll13.I00iio(objI00O0i0ii5);
                            }
/* 222 */                   int iIntValue = ((Number) objI00O0i0ii5).intValue();
/* 226 */                   boolean zI000II2 = iloI0lOlll13.I000II(bArr);
/* 230 */                   Object objI00O0i0ii6 = iloI0lOlll13.I00O0i0ii();
/* 235 */                   if (zI000II2 || objI00O0i0ii6 == obj3) {
/* 244 */                       Float fValueOf = Float.valueOf(0.0f);
/* 249 */                       if (bArr.length == 0) {
/* 253 */                           arrayList = new ArrayList(iIntValue);
/* 257 */                           for (int i9 = 0; i9 < iIntValue; i9++) {
/* 259 */                               arrayList.add(fValueOf);
                                    }
                                } else {
/* 279 */                           ShortBuffer shortBufferAsShortBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
/* 283 */                           int iRemaining = shortBufferAsShortBuffer.remaining();
/* 287 */                           short[] sArr = new short[iRemaining];
/* 289 */                           shortBufferAsShortBuffer.get(sArr);
/* 292 */                           if (iRemaining == 0) {
/* 296 */                               ArrayList arrayList2 = new ArrayList(iIntValue);
/* 300 */                               for (int i10 = 0; i10 < iIntValue; i10++) {
/* 302 */                                   arrayList2.add(fValueOf);
                                        }
/* 308 */                               arrayList = arrayList2;
                                    } else {
/* 310 */                               int i11 = iRemaining / iIntValue;
/* 314 */                               ArrayList arrayList3 = new ArrayList();
/* 317 */                               int i12 = 0;
/* 318 */                               while (i12 < iIntValue) {
/* 320 */                                   int i13 = i12 * i11;
/* 322 */                                   short[] sArr2 = sArr;
/* 324 */                                   int i14 = i13 + i11;
/* 326 */                                   if (i14 > iRemaining) {
/* 328 */                                       i14 = iRemaining;
                                            }
/* 329 */                                   double d = 0.0d;
/* 331 */                                   int i15 = iIntValue;
/* 333 */                                   int i16 = i13;
/* 335 */                                   while (i16 < i14) {
/* 337 */                                       int i17 = i14;
/* 341 */                                       int i18 = i16;
/* 343 */                                       int i19 = i11;
/* 346 */                                       double dAbs = Math.abs(sArr2[i16]);
/* 352 */                                       if (dAbs > d) {
/* 354 */                                           d = dAbs;
                                                }
/* 356 */                                       i16 = i18 + 1;
/* 358 */                                       i14 = i17;
/* 360 */                                       i11 = i19;
                                            }
/* 384 */                                   arrayList3.add(Float.valueOf(lIiioliIlo.I00000oOI((float) (d / 32767.0d), 0.0f, 1.0f)));
/* 387 */                                   i12++;
/* 389 */                                   sArr = sArr2;
/* 391 */                                   i11 = i11;
/* 393 */                                   iIntValue = i15;
                                        }
/* 396 */                               i6 = iIntValue;
/* 398 */                               Iterator it = arrayList3.iterator();
/* 406 */                               if (!it.hasNext()) {
/* 924 */                                   IoOOl0iOl1io.I00000oOI();
/* 927 */                                   return;
                                        }
/* 414 */                               float fFloatValue = ((Number) it.next()).floatValue();
/* 422 */                               while (it.hasNext()) {
/* 434 */                                   fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
                                        }
/* 442 */                               if (fFloatValue == 0.0f) {
/* 444 */                                   obj = arrayList3;
                                        } else {
/* 449 */                                   float f = 0.9f / fFloatValue;
/* 458 */                                   ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(arrayList3, 10));
/* 461 */                                   Iterator it2 = arrayList3.iterator();
/* 469 */                                   while (it2.hasNext()) {
/* 486 */                                       arrayList4.add(Float.valueOf(((Number) it2.next()).floatValue() * f));
                                            }
/* 490 */                                   obj = arrayList4;
                                        }
/* 491 */                               iloI0lOlll13.I00iio(obj);
                                        obj2 = obj;
                                    }
                                }
/* 265 */                       i6 = iIntValue;
                                obj = arrayList;
/* 491 */                       iloI0lOlll13.I00iio(obj);
                                obj2 = obj;
                            } else {
/* 240 */                       i6 = iIntValue;
                                obj2 = objI00O0i0ii6;
                            }
/* 495 */                   List list = (List) obj2;
/* 497 */                   Object objI00O0i0ii7 = iloI0lOlll13.I00O0i0ii();
/* 501 */                   if (objI00O0i0ii7 == obj3) {
/* 506 */                       objI00O0i0ii7 = new OIooO1iiliI(0.0f);
/* 509 */                       iloI0lOlll13.I00iio(objI00O0i0ii7);
                            }
/* 514 */                   OIooO1iiliI oIooO1iiliI2 = (OIooO1iiliI) objI00O0i0ii7;
/* 516 */                   Boolean bool = Boolean.FALSE;
/* 518 */                   Object objI00O0i0ii8 = iloI0lOlll13.I00O0i0ii();
/* 522 */                   if (objI00O0i0ii8 == obj3) {
/* 528 */                       objI00O0i0ii8 = new I0O0il1iIl(oI10i0Il4, (Object) oI10i0Il3, (Object) oIooO1iiliI2, iOoil1iiIilo, 1);
/* 533 */                       oI10i0Il = oI10i0Il4;
/* 535 */                       oI10i0Il2 = oI10i0Il3;
/* 537 */                       oIooO1iiliI = oIooO1iiliI2;
/* 539 */                       iloI0lOlll13.I00iio(objI00O0i0ii8);
                            } else {
/* 543 */                       oI10i0Il = oI10i0Il4;
/* 545 */                       oI10i0Il2 = oI10i0Il3;
/* 547 */                       oIooO1iiliI = oIooO1iiliI2;
                            }
/* 551 */                   iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii8, iloI0lOlll13, bool);
/* 554 */                   Object objI00O0i0ii9 = iloI0lOlll13.I00O0i0ii();
                            Object obj5 = objI00O0i0ii9;
/* 558 */                   if (objI00O0i0ii9 == obj3) {
/* 564 */                       I0Il0IoIIOll i0Il0IoIIOll = new I0Il0IoIIOll(15);
/* 567 */                       i0Il0IoIIOll.I00iiI = oI10i0Il;
/* 569 */                       VarHandle.storeStoreFence();
/* 572 */                       iloI0lOlll13.I00iio(i0Il0IoIIOll);
                                obj5 = i0Il0IoIIOll;
                            }
/* 579 */                   iIO0iiOiOl0l.I00000oOI(OoiIlOl1iI.I00000oIO, (Function1) obj5, iloI0lOlll13);
/* 588 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, i1O01oOIoI0I.I00lli11, iloI0lOlll13, 48);
/* 596 */                   int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 600 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 604 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111i);
/* 610 */                   IOl0oi0lOl1.I000lI.getClass();
/* 613 */                   iloI0lOlll13.I00i0oil();
/* 618 */                   if (iloI0lOlll13.I00O10llo) {
/* 622 */                       iloI0lOlll13.I000l1(O0iiOioolIi.I01101IOlO);
                            } else {
/* 626 */                       iloI0lOlll13.I00io1l();
                            }
/* 631 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO);
/* 636 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll13, oO0lO0l0I000lI);
/* 645 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll13, Integer.valueOf(iHashCode));
/* 648 */                   li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 653 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 674 */                   boolean zI000OOo1O = iloI0lOlll13.I000OOo1O(obj4) | iloI0lOlll13.I000OOo1O(bArr) | ((i5 & 112) == 32);
/* 675 */                   Object objI00O0i0ii10 = iloI0lOlll13.I00O0i0ii();
                            Object obj6 = objI00O0i0ii10;
/* 679 */                   if (zI000OOo1O || objI00O0i0ii10 == obj3) {
/* 686 */                       I10OI0 i10oi0 = new I10OI0(1);
/* 689 */                       i10oi0.I00iiO = obj4;
/* 691 */                       i10oi0.I00iio = oI10i0Il;
/* 693 */                       i10oi0.I00ilI0I1 = bArr;
/* 695 */                       i10oi0.I00iiI = i;
/* 697 */                       i10oi0.I00ilO0 = oI10i0Il2;
/* 699 */                       i10oi0.I00io1l = oIooO1iiliI;
/* 701 */                       VarHandle.storeStoreFence();
/* 704 */                       iloI0lOlll13.I00iio(i10oi0);
                                obj6 = i10oi0;
                            }
/* 712 */                   I1IIol00oIo0 i1IIol00oIo0 = new I1IIol00oIo0(1);
/* 715 */                   i1IIol00oIo0.I00iiI = z3;
/* 717 */                   i1IIol00oIo0.I00iiO = oI10i0Il2;
/* 719 */                   VarHandle.storeStoreFence();
/* 740 */                   boolean z4 = z3;
/* 745 */                   iIo1101O.I00000oIO((IllOOo00lI) obj6, null, false, null, null, iiioOl1O.I00000oOI(605707725, i1IIol00oIo0, iloI0lOlll13), iloI0lOlll13, 1572864, 62);
/* 760 */                   O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 780 */                   I00000oIO(list, oIooO1iiliI.I000II(), Ol0iOOO0.I000II(Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, ((i6 - 1) * 2) + (i6 * 2)), 24.0f), z4, iloI0lOlll1, (i5 >> 3) & 7168);
/* 806 */                   String strConcat = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1)).concat("s");
/* 810 */                   OOiIOoiOO oOiIOoiOO = O1OoilIO.I00000oOI;
/* 820 */                   Oo0lloOiiIOI oo0lloOiiIOI = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00000oOI.I000lI;
/* 822 */                   if (z4) {
/* 827 */                       iloI0lOlll1.I00i01iIIliI(1922275860);
/* 831 */                       iloI0lOlll1.I0010I0i(false);
/* 834 */                       j = IOOiio0i.I0001Ioi1lo;
                            } else {
/* 843 */                       iloI0lOlll1.I00i01iIIliI(1922277055);
/* 854 */                       long j2 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00000oIO.I0010o;
/* 856 */                       iloI0lOlll1.I0010I0i(false);
/* 859 */                       j = j2;
                            }
/* 913 */                   Oo0i1oIIoOO.I00000oOI(strConcat, iO01II.I000OiO(o1ooIo101ll, 12.0f, 0.0f, 0.0f, 0.0f, 14), j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, oo0lloOiiIOI, iloI0lOlll1, 48, 0, 131064);
/* 916 */                   IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 918 */                   iloI0lOlll14.I0010I0i(true);
/* 921 */                   z2 = z4;
                            iloI0lOlll12 = iloI0lOlll14;
                        }
/* 931 */               oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 935 */               if (oOloioIlI001IO000 == null) {
/* 939 */                   I1iI01oI i1iI01oI = new I1iI01oI();
/* 942 */                   i1iI01oI.I00iOIl = bArr;
/* 944 */                   i1iI01oI.I00iiI = i;
/* 948 */                   i1iI01oI.I00iiO = o1ooiI111i;
/* 950 */                   i1iI01oI.I00iio = z2;
/* 954 */                   i1iI01oI.I00ilI0I1 = i2;
/* 958 */                   i1iI01oI.I00ilO0 = i3;
/* 960 */                   VarHandle.storeStoreFence();
/* 963 */                   oOloioIlI001IO000.I0000O = i1iI01oI;
/* 965 */                   return;
                        }
/* 965 */               return;
                    }
/* 43 */            i7 |= 24576;
/* 45 */            z2 = z;
/* 47 */            i4 = i7;
/* 83 */            if (iloI0lOlll13.I00OIl(i4 & 1, (i4 & 9363) == 9362)) {
                    }
/* 931 */           oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 935 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /* JADX WARN: Type inference failed for: r12v0, types: [OI10i0Il] */
                /* JADX WARN: Type inference failed for: r12v1 */
                /* JADX WARN: Type inference failed for: r12v10 */
                /* JADX WARN: Type inference failed for: r12v14 */
                /* JADX WARN: Type inference failed for: r12v15 */
                /* JADX WARN: Type inference failed for: r12v2 */
                /* JADX WARN: Type inference failed for: r12v3, types: [IllOOo00lI] */
                /* JADX WARN: Type inference failed for: r12v4 */
                /* JADX WARN: Type inference failed for: r12v7 */
                /* JADX WARN: Type inference failed for: r12v8 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000Il00O(OI10i0Il oI10i0Il, byte[] bArr, int i, I1i1OOi1iIo i1i1OOi1iIo, I01ii1IIl i01ii1IIl, IOoilo iOoilo) throws Throwable {
                    I1iIOoO i1iIOoO;
                    Float f;
                    IllOOo00lI illOOo00lI;
/* 5 */             if (iOoilo instanceof I1iIOoO) {
/* 8 */                 i1iIOoO = (I1iIOoO) iOoilo;
/* 10 */                int i2 = i1iIOoO.I00iio;
/* 16 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 19 */                    i1iIOoO.I00iio = i2 - Integer.MIN_VALUE;
                        } else {
/* 24 */                    i1iIOoO = new I1iIOoO(iOoilo);
                        }
                    }
/* 27 */            Object obj = i1iIOoO.I00iiO;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i3 = i1iIOoO.I00iio;
                    try {
/* 36 */                if (i3 == 0) {
/* 58 */                    lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 61 */                        IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 63 */                        Ii1oo1ooill0 ii1oo1ooill0 = Ii1oo1ooill0.I00iiI;
/* 72 */                        I0iOI0o1i i0iOI0o1i = new I0iOI0o1i((OI10i0Il) oI10i0Il, i, bArr, i1i1OOi1iIo, (IOoil1iiIilo) null);
/* 75 */                        i1iIOoO.I00iOIl = i1i1OOi1iIo;
/* 77 */                        I01ii1IIl i01ii1IIl2 = i01ii1IIl;
/* 79 */                        i1iIOoO.I00iiI = i01ii1IIl2;
/* 81 */                        i1iIOoO.I00iio = 1;
                                oI10i0Il = i01ii1IIl2;
/* 87 */                        if (iOi1II01i0.I0000oI00(ii1oo1ooill0, i0iOI0o1i, i1iIOoO) == ii0111o) {
/* 89 */                            return ii0111o;
                                }
                            } catch (Exception unused) {
/* 106 */                       oI10i0Il = i01ii1IIl;
/* 123 */                       f = new Float(1.0f);
                                illOOo00lI = oI10i0Il;
/* 95 */                        i1i1OOi1iIo.invoke(f);
/* 98 */                        illOOo00lI.invoke();
/* 127 */                       return OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th) {
/* 102 */                       th = th;
/* 103 */                       oI10i0Il = i01ii1IIl;
/* 49 */                        Throwable th2 = th;
/* 114 */                       i1i1OOi1iIo.invoke(new Float(1.0f));
/* 117 */                       oI10i0Il.invoke();
/* 120 */                       throw th2;
                            }
                        } else {
/* 38 */                    if (i3 != 1) {
/* 53 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 56 */                        return null;
                            }
/* 40 */                    I01ii1IIl i01ii1IIl3 = i1iIOoO.I00iiI;
/* 42 */                    i1i1OOi1iIo = i1iIOoO.I00iOIl;
/* 44 */                    lIoii1l01l0i.I00000oOI(obj);
                            oI10i0Il = i01ii1IIl3;
                        }
/* 92 */                f = new Float(1.0f);
                        illOOo00lI = oI10i0Il;
                    } catch (Exception unused2) {
                    } catch (Throwable th3) {
/* 48 */                th = th3;
                    }
/* 95 */            i1i1OOi1iIo.invoke(f);
/* 98 */            illOOo00lI.invoke();
/* 127 */           return OoiIlOl1iI.I00000oIO;
                }
            }
