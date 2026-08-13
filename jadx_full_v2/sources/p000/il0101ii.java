            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class il0101ii {
                /* JADX WARN: Removed duplicated region for block: B:145:0x0307  */
                /* JADX WARN: Removed duplicated region for block: B:148:0x0318  */
                /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x00e0  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x00ec  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(Integer num, Integer num2, String str, Function1 function1, O1ooiI111i o1ooiI111i, boolean z, int i, float f, boolean z2, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i2, int i3) {
                    int i4;
                    Integer num3;
                    int i5;
                    O1ooiI111i o1ooiI111i2;
                    int i6;
                    boolean z3;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    boolean z4;
                    int i11;
                    Integer num4;
                    float f2;
                    IlliIl1l11O illiIl1l11O2;
                    int i12;
                    boolean z5;
                    OOloioIl oOloioIlI001IO000;
                    Integer num5;
                    IOoil1iiIilo iOoil1iiIilo;
                    Integer num6;
                    OI10i0Il oI10i0Il;
                    III0Ii iII0Ii;
                    boolean z6;
                    Oo0lloOiiIOI oo0lloOiiIOII00000oOI;
/* 14 */            iloI0lOlll1.I00i0O(1756999512);
/* 17 */            int i13 = i3 & 1;
/* 19 */            if (i13 != 0) {
/* 21 */                i4 = i2 | 6;
                    } else {
/* 38 */                i4 = (iloI0lOlll1.I000II(num) ? 4 : 2) | i2;
                    }
/* 39 */            int i14 = i3 & 2;
/* 41 */            if (i14 != 0) {
/* 43 */                i5 = i4 | 48;
/* 45 */                num3 = num2;
                    } else {
/* 48 */                num3 = num2;
/* 61 */                i5 = i4 | (iloI0lOlll1.I000II(num3) ? 32 : 16);
                    }
/* 73 */            int i15 = i5 | (iloI0lOlll1.I000II(str) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 76 */            if ((i2 & 3072) == 0) {
/* 89 */                i15 |= iloI0lOlll1.I000OOo1O(function1) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 90 */            int i16 = i3 & 16;
/* 92 */            if (i16 != 0) {
/* 94 */                i15 |= 24576;
                    } else {
/* 101 */               if ((i2 & 24576) == 0) {
/* 103 */                   o1ooiI111i2 = o1ooiI111i;
/* 116 */                   i15 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 16384 : 8192;
                        }
/* 117 */               i6 = i3 & 32;
/* 119 */               if (i6 == 0) {
/* 123 */                   i7 = i15 | 196608;
/* 124 */                   z3 = z;
                        } else {
/* 127 */                   z3 = z;
/* 140 */                   i7 = i15 | (iloI0lOlll1.I000O01llI0(z3) ? 131072 : 65536);
                        }
/* 142 */               i8 = i3 & 64;
/* 146 */               if (i8 == 0) {
/* 148 */                   i7 |= 1572864;
/* 150 */                   i9 = i;
                        } else {
/* 155 */                   i9 = i;
/* 157 */                   if ((i2 & 1572864) == 0) {
/* 170 */                       i7 |= iloI0lOlll1.I0000oI00(i9) ? 1048576 : 524288;
                            }
                        }
/* 174 */               int i17 = i7 | 12582912;
/* 176 */               i10 = i3 & Barcode.FORMAT_QR_CODE;
/* 178 */               if (i10 != 0) {
/* 190 */                   if ((100663296 & i2) == 0) {
/* 192 */                       z4 = z2;
/* 205 */                       i17 |= iloI0lOlll1.I000O01llI0(z4) ? 67108864 : 33554432;
                            }
/* 209 */                   i11 = i17 | 805306368;
/* 235 */                   if (iloI0lOlll1.I00OIl(i11 & 1, (i11 & 306783379) != 306783378)) {
/* 241 */                       Integer num7 = i13 != 0 ? null : num;
/* 247 */                       Integer num8 = i14 != 0 ? null : num3;
/* 253 */                       O1ooiI111i o1ooiI111i3 = i16 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 254 */                       if (i6 != 0) {
/* 256 */                           z3 = true;
                                }
/* 263 */                       int i18 = i8 != 0 ? 1 : i9;
/* 269 */                       boolean z7 = i10 != 0 ? false : z4;
/* 271 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 275 */                       Object obj = IOl11li.I00000oIO;
/* 277 */                       if (objI00O0i0ii == obj) {
/* 279 */                           objI00O0i0ii = l001l0.I00000oIO();
/* 283 */                           iloI0lOlll1.I00iio(objI00O0i0ii);
                                }
/* 287 */                       OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) objI00O0i0ii;
/* 289 */                       Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 293 */                       if (objI00O0i0ii2 == obj) {
/* 297 */                           num5 = num7;
/* 298 */                           iOoil1iiIilo = null;
/* 306 */                           objI00O0i0ii2 = lOO00IiI0li.I00000oIO(new Oo0OI01Il(6, 0L, str));
/* 310 */                           iloI0lOlll1.I00iio(objI00O0i0ii2);
                                } else {
/* 314 */                           num5 = num7;
/* 315 */                           iOoil1iiIilo = null;
                                }
/* 317 */                       OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii2;
/* 319 */                       Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 323 */                       if (objI00O0i0ii3 == obj) {
/* 325 */                           objI00O0i0ii3 = lOO00IiI0li.I00000oIO(iOoil1iiIilo);
/* 329 */                           iloI0lOlll1.I00iio(objI00O0i0ii3);
                                }
/* 334 */                       OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii3;
/* 336 */                       Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 340 */                       if (objI00O0i0ii4 == obj) {
/* 342 */                           objI00O0i0ii4 = i1IlOlo1.I00000oIO();
/* 346 */                           iloI0lOlll1.I00iio(objI00O0i0ii4);
                                }
/* 349 */                       III0Ii iII0Ii2 = (III0Ii) objI00O0i0ii4;
/* 357 */                       IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 359 */                       Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 363 */                       if (objI00O0i0ii5 == obj) {
/* 365 */                           objI00O0i0ii5 = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 369 */                           iloI0lOlll1.I00iio(objI00O0i0ii5);
                                }
/* 372 */                       Ii0110 ii0110 = (Ii0110) objI00O0i0ii5;
/* 376 */                       int i19 = i18;
/* 385 */                       boolean z8 = (i11 & 896) == 256;
/* 386 */                       Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 390 */                       if (z8 || objI00O0i0ii6 == obj) {
/* 402 */                           num6 = num5;
/* 406 */                           objI00O0i0ii6 = new I1iIil1I(str, oI10i0Il2, iOoil1iiIilo, 11);
/* 409 */                           iloI0lOlll1.I00iio(objI00O0i0ii6);
                                } else {
/* 395 */                           num6 = num5;
                                }
/* 414 */                       int i20 = i11 >> 6;
/* 416 */                       iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii6, iloI0lOlll1, str);
/* 425 */                       boolean z9 = z3;
/* 429 */                       Oo0lI00l oo0lI00lI00000oIO = Oo0lI00l.I00000oIO(((Oo0OI01Il) oI10i0Il2.getValue()).I00000oOI);
/* 437 */                       Oo0iil0o0oI oo0iil0o0oI = (Oo0iil0o0oI) oI10i0Il3.getValue();
/* 453 */                       boolean zI000II = iloI0lOlll1.I000II(iiIooOOOI) | iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(iII0Ii2);
/* 457 */                       Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 463 */                       if (zI000II || objI00O0i0ii7 == obj) {
/* 483 */                           objI00O0i0ii7 = new Ii0iIoIIl(iiIooOOOI, ii0110, oI10i0Il3, oI10i0Il2, 56.0f, iII0Ii2, null);
/* 488 */                           oI10i0Il = oI10i0Il3;
/* 490 */                           iII0Ii = iII0Ii2;
/* 492 */                           iloI0lOlll1.I00iio(objI00O0i0ii7);
                                } else {
/* 468 */                           oI10i0Il = oI10i0Il3;
/* 470 */                           iII0Ii = iII0Ii2;
                                }
/* 497 */                       iIO0iiOiOl0l.I0000oI00(oo0lI00lI00000oIO, oo0iil0o0oI, (IlliIl1l11O) objI00O0i0ii7, iloI0lOlll1);
/* 504 */                       Oo0OI01Il oo0OI01Il = (Oo0OI01Il) oI10i0Il2.getValue();
/* 512 */                       O1ooiI111i o1ooiI111iI00000oOI = i1IlOlo1.I00000oOI(Ol0iOOO0.I0000oI00(o1ooiI111i3, 1.0f), iII0Ii);
/* 516 */                       if (z7) {
/* 521 */                           iloI0lOlll1.I00i01iIIliI(8168362);
/* 549 */                           oo0lloOiiIOII00000oOI = Oo0lloOiiIOI.I00000oOI(liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000l1, 0L, 0L, null, IliO1o11o.I00iio, 0L, 0L, null, 16777183);
/* 553 */                           z6 = false;
/* 554 */                           iloI0lOlll1.I0010I0i(false);
                                } else {
/* 560 */                           z6 = false;
/* 564 */                           iloI0lOlll1.I00i01iIIliI(8268337);
/* 571 */                           oo0lloOiiIOII00000oOI = liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000iOII;
/* 573 */                           iloI0lOlll1.I0010I0i(false);
                                }
/* 612 */                       Oo0lloOiiIOI oo0lloOiiIOII00000oOI2 = Oo0lloOiiIOI.I00000oOI(oo0lloOiiIOII00000oOI, IOOiio0i.I0000Il00O(z9 ? 1.0f : 0.7f, liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I00100o1O0lo), 0L, null, null, 0L, 0L, null, 16777214);
/* 622 */                       O1ooiI111i o1ooiI111i4 = o1ooiI111i3;
/* 628 */                       OlI00IIlOO olI00IIlOO = new OlI00IIlOO(liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I00000oIO);
/* 635 */                       boolean z10 = (i11 & 7168) != 2048 ? z6 : true;
/* 640 */                       Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                                Object obj2 = objI00O0i0ii8;
/* 648 */                       if (z10 || objI00O0i0ii8 == obj) {
/* 654 */                           I00o101lO i00o101lO = new I00o101lO(28);
/* 657 */                           i00o101lO.I00iiI = function1;
/* 659 */                           i00o101lO.I00iiO = oI10i0Il2;
/* 661 */                           VarHandle.storeStoreFence();
/* 664 */                           iloI0lOlll1.I00iio(i00o101lO);
                                    obj2 = i00o101lO;
                                }
/* 667 */                       Function1 function12 = (Function1) obj2;
/* 669 */                       Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii9;
/* 673 */                       if (objI00O0i0ii9 == obj) {
/* 677 */                           I0Il0IoIIOll i0Il0IoIIOll = new I0Il0IoIIOll(28);
/* 680 */                           i0Il0IoIIOll.I00iiI = oI10i0Il;
/* 682 */                           VarHandle.storeStoreFence();
/* 685 */                           iloI0lOlll1.I00iio(i0Il0IoIIOll);
                                    obj3 = i0Il0IoIIOll;
                                }
/* 693 */                       IO1oIiIi1O01 iO1oIiIi1O01 = new IO1oIiIi1O01(7);
/* 696 */                       iO1oIiIi1O01.I00iiO = oI0lOIiOIOOo;
/* 698 */                       iO1oIiIi1O01.I00iiI = oI10i0Il2;
/* 700 */                       Integer num9 = num6;
/* 702 */                       iO1oIiIi1O01.I00iio = num9;
/* 704 */                       iO1oIiIi1O01.I00ilI0I1 = num8;
/* 706 */                       VarHandle.storeStoreFence();
/* 745 */                       i12 = i19;
/* 757 */                       z5 = z9;
/* 759 */                       I1oioi1oI.I00000oIO(oo0OI01Il, function12, o1ooiI111iI00000oOI, z5, oo0lloOiiIOII00000oOI2, null, null, 0, i12, null, (Function1) obj3, oI0lOIiOIOOo, olI00IIlOO, iiioOl1O.I00000oOI(-43403653, iO1oIiIi1O01, iloI0lOlll1), iloI0lOlll1, i20 & 7168, ((i11 >> 18) & 14) | 200064, 3024);
/* 762 */                       illiIl1l11O2 = i1OllOI.I00000oIO;
/* 765 */                       num4 = num9;
/* 767 */                       z4 = z7;
/* 769 */                       num3 = num8;
/* 771 */                       o1ooiI111i2 = o1ooiI111i4;
/* 773 */                       f2 = 56.0f;
                            } else {
/* 776 */                       iloI0lOlll1.I00OilO00Il();
/* 779 */                       num4 = num;
/* 781 */                       f2 = f;
/* 783 */                       illiIl1l11O2 = illiIl1l11O;
/* 785 */                       i12 = i9;
/* 786 */                       z5 = z3;
                            }
/* 787 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 791 */                   if (oOloioIlI001IO000 != null) {
/* 795 */                       Ii0i1oI0i ii0i1oI0i = new Ii0i1oI0i();
/* 798 */                       ii0i1oI0i.I00iOIl = num4;
/* 800 */                       ii0i1oI0i.I00iiI = num3;
/* 802 */                       ii0i1oI0i.I00iiO = str;
/* 804 */                       ii0i1oI0i.I00iio = function1;
/* 806 */                       ii0i1oI0i.I00ilI0I1 = o1ooiI111i2;
/* 808 */                       ii0i1oI0i.I00ilO0 = z5;
/* 810 */                       ii0i1oI0i.I00io1l = i12;
/* 812 */                       ii0i1oI0i.I00ioIO = f2;
/* 814 */                       ii0i1oI0i.I00l0I0l0lO1 = z4;
/* 816 */                       ii0i1oI0i.I00l0OO0IO = illiIl1l11O2;
/* 820 */                       ii0i1oI0i.I00li1OI = i2;
/* 824 */                       ii0i1oI0i.I00ll1 = i3;
/* 826 */                       VarHandle.storeStoreFence();
/* 829 */                       oOloioIlI001IO000.I0000O = ii0i1oI0i;
/* 1578 */                      return;
                            }
/* 1578 */                  return;
                        }
/* 182 */               i17 = i7 | 113246208;
/* 184 */               z4 = z2;
/* 209 */               i11 = i17 | 805306368;
/* 235 */               if (iloI0lOlll1.I00OIl(i11 & 1, (i11 & 306783379) != 306783378)) {
                        }
/* 787 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 791 */               if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 96 */            o1ooiI111i2 = o1ooiI111i;
/* 117 */           i6 = i3 & 32;
/* 119 */           if (i6 == 0) {
                    }
/* 142 */           i8 = i3 & 64;
/* 146 */           if (i8 == 0) {
                    }
/* 174 */           int i172 = i7 | 12582912;
/* 176 */           i10 = i3 & Barcode.FORMAT_QR_CODE;
/* 178 */           if (i10 != 0) {
                    }
/* 184 */           z4 = z2;
/* 209 */           i11 = i172 | 805306368;
/* 235 */           if (iloI0lOlll1.I00OIl(i11 & 1, (i11 & 306783379) != 306783378)) {
                    }
/* 787 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 791 */           if (oOloioIlI001IO000 != null) {
                    }
                }
            }
