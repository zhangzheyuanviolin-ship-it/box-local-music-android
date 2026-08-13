            package p000;

            import android.content.Context;
            import android.util.Size;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iIoOlloI {
                /* JADX WARN: Removed duplicated region for block: B:153:0x030a  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x031b  */
                /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IlliIl1l11O illiIl1l11O, O1ooiI111i o1ooiI111i, int i, int i2, boolean z, IIo0l1 iIo0l1, IllOOo00lI illOOo00lI, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i3, int i4) {
                    int i5;
                    int i6;
                    int i7;
                    boolean z2;
                    int i8;
                    IllOOo00lI illOOo00lI2;
                    int i9;
                    int i10;
                    Function1 function12;
                    int i11;
                    O1ooiI111i o1ooiI111i2;
                    int i12;
                    Function1 function13;
                    int i13;
                    int i14;
                    OOloioIl oOloioIlI001IO000;
                    boolean z3;
                    Function1 function14;
                    OI10i0Il oI10i0Il;
                    Object obj;
                    int i15;
                    boolean z4;
/* 14 */            iloI0lOlll1.I00i0O(-140049364);
/* 19 */            if ((i3 & 6) == 0) {
/* 30 */                i5 = (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 4 : 2) | i3;
                    } else {
/* 32 */                i5 = i3;
                    }
/* 33 */            int i16 = i4 & 4;
/* 35 */            if (i16 != 0) {
/* 37 */                i5 |= 384;
                    } else {
/* 44 */                if ((i3 & 384) == 0) {
/* 46 */                    i6 = i;
/* 59 */                    i5 |= iloI0lOlll1.I0000oI00(i6) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 60 */                int i17 = i5 | 3072;
/* 62 */                i7 = i4 & 16;
/* 64 */                if (i7 != 0) {
/* 73 */                    if ((i3 & 24576) == 0) {
/* 75 */                        z2 = z;
/* 88 */                        i17 |= iloI0lOlll1.I000O01llI0(z2) ? 16384 : 8192;
                            }
/* 100 */                   int i18 = i17 | (iloI0lOlll1.I000OOo1O(iIo0l1) ? 131072 : 65536);
/* 101 */                   i8 = i4 & 64;
/* 103 */                   if (i8 != 0) {
/* 107 */                       i9 = i18 | 1572864;
/* 109 */                       illOOo00lI2 = illOOo00lI;
                            } else {
/* 112 */                       illOOo00lI2 = illOOo00lI;
/* 125 */                       i9 = i18 | (iloI0lOlll1.I000OOo1O(illOOo00lI2) ? 1048576 : 524288);
                            }
/* 127 */                   i10 = i4 & Barcode.FORMAT_ITF;
/* 129 */                   if (i10 != 0) {
/* 133 */                       i11 = i9 | 12582912;
/* 135 */                       function12 = function1;
                            } else {
/* 138 */                       function12 = function1;
/* 151 */                       i11 = i9 | (iloI0lOlll1.I000OOo1O(function12) ? 8388608 : 4194304);
                            }
/* 174 */                   if (iloI0lOlll1.I00OIl(i11 & 1, (i11 & 4793491) != 4793490)) {
/* 176 */                       iloI0lOlll1.I00Ol00();
/* 179 */                       int i19 = i3 & 1;
/* 181 */                       Object obj2 = IOl11li.I00000oIO;
/* 184 */                       if (i19 == 0 || iloI0lOlll1.I001lloI()) {
/* 204 */                           if (i16 != 0) {
/* 208 */                               i6 = 500;
                                    }
/* 209 */                           if (i7 != 0) {
/* 211 */                               z2 = true;
                                    }
/* 212 */                           if (i8 != 0) {
/* 214 */                               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 218 */                               if (objI00O0i0ii == obj2) {
/* 222 */                                   objI00O0i0ii = new O0o0Ol0(6);
/* 225 */                                   iloI0lOlll1.I00iio(objI00O0i0ii);
                                        }
/* 228 */                               illOOo00lI2 = (IllOOo00lI) objI00O0i0ii;
                                    }
/* 231 */                           if (i10 != 0) {
/* 233 */                               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 237 */                               if (objI00O0i0ii2 == obj2) {
/* 242 */                                   objI00O0i0ii2 = new O0o01OIl(5);
/* 245 */                                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                                        }
/* 248 */                               function14 = (Function1) objI00O0i0ii2;
/* 250 */                               z3 = z2;
                                    } else {
/* 255 */                               z3 = z2;
/* 257 */                               function14 = function12;
                                    }
/* 252 */                           i13 = i6;
/* 253 */                           i14 = 2;
                                } else {
/* 193 */                           iloI0lOlll1.I00OilO00Il();
/* 196 */                           z3 = z2;
/* 198 */                           function14 = function12;
/* 199 */                           i13 = i6;
/* 200 */                           i14 = i2;
                                }
/* 202 */                       IllOOo00lI illOOo00lI3 = illOOo00lI2;
/* 259 */                       iloI0lOlll1.I0010o();
/* 268 */                       Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 270 */                       Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 274 */                       if (objI00O0i0ii3 == obj2) {
/* 276 */                           objI00O0i0ii3 = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 280 */                           iloI0lOlll1.I00iio(objI00O0i0ii3);
                                }
/* 283 */                       Ii0110 ii0110 = (Ii0110) objI00O0i0ii3;
/* 291 */                       O0oiOi o0oiOi = (O0oiOi) iloI0lOlll1.I000iOII(O11looOii.I00000oIO);
/* 293 */                       Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 299 */                       if (objI00O0i0ii4 == obj2) {
/* 301 */                           objI00O0i0ii4 = lOO00IiI0li.I00000oIO(null);
/* 305 */                           iloI0lOlll1.I00iio(objI00O0i0ii4);
                                }
/* 308 */                       OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii4;
/* 310 */                       Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 314 */                       if (objI00O0i0ii5 == obj2) {
/* 316 */                           objI00O0i0ii5 = lOO00IiI0li.I00000oIO(null);
/* 320 */                           iloI0lOlll1.I00iio(objI00O0i0ii5);
                                }
/* 323 */                       OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii5;
/* 332 */                       boolean z5 = (i11 & 14) == 4;
/* 333 */                       Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii6;
/* 337 */                       if (z5 || objI00O0i0ii6 == obj2) {
/* 344 */                           O110Io1OoiO o110Io1OoiO = new O110Io1OoiO(0);
/* 347 */                           o110Io1OoiO.I00iiO = illiIl1l11O;
/* 349 */                           o110Io1OoiO.I00iiI = oI10i0Il2;
/* 351 */                           VarHandle.storeStoreFence();
/* 354 */                           iloI0lOlll1.I00iio(o110Io1OoiO);
                                    obj3 = o110Io1OoiO;
                                }
/* 357 */                       IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) obj3;
/* 364 */                       I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(5);
/* 391 */                       int i20 = i11 & 896;
/* 393 */                       int i21 = i11;
/* 414 */                       int i22 = i21 & 3670016;
/* 429 */                       int i23 = i21 & 29360128;
/* 440 */                       boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context) | iloI0lOlll1.I000OOo1O(o0oiOi) | iloI0lOlll1.I000II(illiIl1l11O2) | (i20 == 256) | iloI0lOlll1.I000OOo1O(iIo0l1) | (i22 == 1048576) | (i23 == 8388608);
/* 444 */                       Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                                Object obj4 = objI00O0i0ii7;
/* 448 */                       if (zI000OOo1O || objI00O0i0ii7 == obj2) {
/* 454 */                           O110O00o o110O00o = new O110O00o();
/* 457 */                           o110O00o.I00iOIl = ii0110;
/* 459 */                           o110O00o.I00iiI = context;
/* 461 */                           o110O00o.I00iiO = o0oiOi;
/* 463 */                           o110O00o.I00iio = illiIl1l11O2;
/* 465 */                           o110O00o.I00ilI0I1 = i13;
/* 467 */                           o110O00o.I00ilO0 = i14;
/* 469 */                           o110O00o.I00io1l = iIo0l1;
/* 471 */                           o110O00o.I00ioIO = illOOo00lI3;
/* 473 */                           o110O00o.I00l0I0l0lO1 = function14;
/* 475 */                           o110O00o.I00l0OO0IO = oI10i0Il3;
/* 477 */                           VarHandle.storeStoreFence();
/* 480 */                           iloI0lOlll1.I00iio(o110O00o);
                                    obj4 = o110O00o;
                                }
/* 486 */                       O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj4, iloI0lOlll1, 0);
/* 541 */                       boolean zI000OOo1O2 = (i23 == 8388608) | (i20 == 256) | iloI0lOlll1.I000OOo1O(context) | iloI0lOlll1.I000OOo1O(o0oiOi) | iloI0lOlll1.I000II(illiIl1l11O2) | iloI0lOlll1.I000OOo1O(iIo0l1) | (i22 == 1048576) | iloI0lOlll1.I000OOo1O(o1OIi1I00000oIO);
/* 542 */                       Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
/* 546 */                       if (zI000OOo1O2 || objI00O0i0ii8 == obj2) {
/* 550 */                           function13 = function14;
/* 563 */                           oI10i0Il = oI10i0Il3;
/* 566 */                           obj = obj2;
/* 568 */                           i15 = 6;
/* 569 */                           i12 = i4;
/* 571 */                           Object il0OOo = new Il0OOo(context, o0oiOi, illiIl1l11O2, i13, i14, iIo0l1, illOOo00lI3, function13, o1OIi1I00000oIO, oI10i0Il, null);
/* 574 */                           iloI0lOlll1.I00iio(il0OOo);
/* 577 */                           objI00O0i0ii8 = il0OOo;
                                } else {
/* 552 */                           i12 = i4;
/* 554 */                           function13 = function14;
/* 555 */                           oI10i0Il = oI10i0Il3;
/* 556 */                           obj = obj2;
/* 557 */                           i15 = 6;
                                }
/* 580 */                       OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 582 */                       iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii8, iloI0lOlll1, ooiIlOl1iI);
/* 585 */                       Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
                                Object obj5 = objI00O0i0ii9;
/* 589 */                       if (objI00O0i0ii9 == obj) {
/* 595 */                           IlI0iIl011 ilI0iIl011 = new IlI0iIl011(28);
/* 598 */                           ilI0iIl011.I00iiI = oI10i0Il;
/* 600 */                           VarHandle.storeStoreFence();
/* 603 */                           iloI0lOlll1.I00iio(ilI0iIl011);
                                    obj5 = ilI0iIl011;
                                }
/* 608 */                       iIO0iiOiOl0l.I00000oOI(ooiIlOl1iI, (Function1) obj5, iloI0lOlll1);
/* 611 */                       if (z3) {
/* 616 */                           iloI0lOlll1.I00i01iIIliI(-1794370385);
/* 623 */                           OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00, i1O01oOIoI0I.I00ll1, iloI0lOlll1, i15);
/* 629 */                           int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 633 */                           OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 637 */                           o1ooiI111i2 = o1ooiI111i;
/* 639 */                           O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111i2);
/* 645 */                           IOl0oi0lOl1.I000lI.getClass();
/* 648 */                           iloI0lOlll1.I00i0oil();
/* 653 */                           if (iloI0lOlll1.I00O10llo) {
/* 657 */                               iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                                    } else {
/* 661 */                               iloI0lOlll1.I00io1l();
                                    }
/* 666 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 671 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 680 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 683 */                           li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 688 */                           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 695 */                           Object obj6 = (I0oO00o) oI10i0Il2.getValue();
/* 697 */                           if (obj6 != null) {
/* 702 */                               iloI0lOlll1.I00i01iIIliI(-120767304);
/* 705 */                               IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I0000Il00O;
/* 707 */                               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(obj6);
/* 711 */                               Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                                        Object obj7 = objI00O0i0ii10;
/* 715 */                               if (zI000OOo1O3 || objI00O0i0ii10 == obj) {
/* 723 */                                   O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(9);
/* 726 */                                   o0l0IlolloIO.I00iiI = obj6;
/* 728 */                                   VarHandle.storeStoreFence();
/* 731 */                                   iloI0lOlll1.I00iio(o0l0IlolloIO);
                                            obj7 = o0l0IlolloIO;
                                        }
/* 736 */                               iOl0ilO1.I00000oIO(ilIl1Io0lii1, (Function1) obj7, iloI0lOlll1, i15);
/* 739 */                               z4 = false;
/* 740 */                               iloI0lOlll1.I0010I0i(false);
                                    } else {
/* 745 */                               z4 = false;
/* 749 */                               iloI0lOlll1.I00i01iIIliI(-119292169);
/* 752 */                               iloI0lOlll1.I0010I0i(false);
                                    }
/* 756 */                           iloI0lOlll1.I0010I0i(true);
/* 759 */                           iloI0lOlll1.I0010I0i(z4);
                                } else {
/* 763 */                           o1ooiI111i2 = o1ooiI111i;
/* 769 */                           iloI0lOlll1.I00i01iIIliI(-1792764554);
/* 772 */                           iloI0lOlll1.I0010I0i(false);
                                }
/* 775 */                       illOOo00lI2 = illOOo00lI3;
/* 776 */                       z2 = z3;
                            } else {
/* 779 */                       o1ooiI111i2 = o1ooiI111i;
/* 781 */                       i12 = i4;
/* 783 */                       iloI0lOlll1.I00OilO00Il();
/* 786 */                       function13 = function12;
/* 787 */                       i13 = i6;
/* 788 */                       i14 = i2;
                            }
/* 790 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 794 */                   if (oOloioIlI001IO000 != null) {
/* 798 */                       O110O0O o110o0o = new O110O0O();
/* 803 */                       o110o0o.I00iOIl = illiIl1l11O;
/* 805 */                       o110o0o.I00iiI = o1ooiI111i2;
/* 807 */                       o110o0o.I00iiO = i13;
/* 809 */                       o110o0o.I00iio = i14;
/* 811 */                       o110o0o.I00ilI0I1 = z2;
/* 813 */                       o110o0o.I00ilO0 = iIo0l1;
/* 815 */                       o110o0o.I00io1l = illOOo00lI2;
/* 817 */                       o110o0o.I00ioIO = function13;
/* 821 */                       o110o0o.I00l0I0l0lO1 = i3;
/* 823 */                       o110o0o.I00l0OO0IO = i12;
/* 825 */                       VarHandle.storeStoreFence();
/* 828 */                       oOloioIlI001IO000.I0000O = o110o0o;
/* 3539 */                      return;
                            }
/* 3539 */                  return;
                        }
/* 66 */                i17 = i5 | 27648;
/* 68 */                z2 = z;
/* 100 */               int i182 = i17 | (iloI0lOlll1.I000OOo1O(iIo0l1) ? 131072 : 65536);
/* 101 */               i8 = i4 & 64;
/* 103 */               if (i8 != 0) {
                        }
/* 127 */               i10 = i4 & Barcode.FORMAT_ITF;
/* 129 */               if (i10 != 0) {
                        }
/* 174 */               if (iloI0lOlll1.I00OIl(i11 & 1, (i11 & 4793491) != 4793490)) {
                        }
/* 790 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 794 */               if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 39 */            i6 = i;
/* 60 */            int i172 = i5 | 3072;
/* 62 */            i7 = i4 & 16;
/* 64 */            if (i7 != 0) {
                    }
/* 68 */            z2 = z;
/* 100 */           int i1822 = i172 | (iloI0lOlll1.I000OOo1O(iIo0l1) ? 131072 : 65536);
/* 101 */           i8 = i4 & 64;
/* 103 */           if (i8 != 0) {
                    }
/* 127 */           i10 = i4 & Barcode.FORMAT_ITF;
/* 129 */           if (i10 != 0) {
                    }
/* 174 */           if (iloI0lOlll1.I00OIl(i11 & 1, (i11 & 4793491) != 4793490)) {
                    }
/* 790 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 794 */           if (oOloioIlI001IO000 != null) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(Context context, O0oiOi o0oiOi, IlliIl1l11O illiIl1l11O, int i, int i2, IIo0l1 iIo0l1, IllOOo00lI illOOo00lI, Function1 function1, IOoilo iOoilo) throws Throwable {
                    O110OIlo1Il0 o110OIlo1Il0;
/* 3 */             if (iOoilo instanceof O110OIlo1Il0) {
/* 6 */                 o110OIlo1Il0 = (O110OIlo1Il0) iOoilo;
/* 8 */                 int i3 = o110OIlo1Il0.I00l0I0l0lO1;
/* 14 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 17 */                    o110OIlo1Il0.I00l0I0l0lO1 = i3 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o110OIlo1Il0 = new O110OIlo1Il0(iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = o110OIlo1Il0.I00ioIO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i4 = o110OIlo1Il0.I00l0I0l0lO1;
/* 31 */            int i5 = 1;
/* 32 */            if (i4 == 0) {
/* 61 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 64 */                OOIl1Io0 oOIl1Io0 = OOIl1Io0.I00000oOI;
/* 66 */                o110OIlo1Il0.I00iOIl = o0oiOi;
/* 68 */                o110OIlo1Il0.I00iiI = illiIl1l11O;
/* 70 */                o110OIlo1Il0.I00iiO = iIo0l1;
/* 72 */                o110OIlo1Il0.I00iio = illOOo00lI;
/* 74 */                o110OIlo1Il0.I00ilI0I1 = function1;
/* 76 */                o110OIlo1Il0.I00ilO0 = i;
/* 78 */                o110OIlo1Il0.I00io1l = i2;
/* 80 */                o110OIlo1Il0.I00l0I0l0lO1 = 1;
/* 86 */                objI00000oIO = l10oIiO1Il.I00000oIO(lIIOO11.I00000oIO(context), o110OIlo1Il0);
/* 90 */                if (objI00000oIO == ii0111o) {
/* 92 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i4 != 1) {
/* 56 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 59 */                    return null;
                        }
/* 36 */                i2 = o110OIlo1Il0.I00io1l;
/* 38 */                i = o110OIlo1Il0.I00ilO0;
/* 40 */                function1 = o110OIlo1Il0.I00ilI0I1;
/* 42 */                illOOo00lI = o110OIlo1Il0.I00iio;
/* 44 */                iIo0l1 = o110OIlo1Il0.I00iiO;
/* 46 */                illiIl1l11O = o110OIlo1Il0.I00iiI;
/* 48 */                o0oiOi = o110OIlo1Il0.I00iOIl;
/* 50 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
                    }
/* 93 */            OOIl1Io0 oOIl1Io02 = (OOIl1Io0) objI00000oIO;
/* 95 */            iOl0lOIi11 iol0loii11 = iOl0lOIi11.I00iiO;
/* 105 */           Oi0Oo11I oi0Oo11I = new Oi0Oo11I(3, new Size(i, i));
/* 110 */           Oi0Oliol oi0Oliol = new Oi0Oliol();
/* 113 */           oi0Oliol.I00000oIO = iol0loii11;
/* 115 */           oi0Oliol.I00000oOI = oi0Oo11I;
/* 117 */           VarHandle.storeStoreFence();
/* 122 */           OOo0o0oO oOo0o0oO = new OOo0o0oO();
/* 127 */           IIoO01O1 iIoO01O1 = new IIoO01O1(1);
/* 130 */           I1ioiI i1ioiI = IoiIli1i0Oil.I001lllioOl;
/* 132 */           OI0oiliol10O oI0oiliol10O = iIoO01O1.I00iOIl;
/* 134 */           oI0oiliol10O.I0010I0i(i1ioiI, oi0Oliol);
/* 143 */           oI0oiliol10O.I0010I0i(Ioi0OoiI.I00ilI0I1, Integer.valueOf(i2));
/* 153 */           oI0oiliol10O.I0010I0i(Ioi0OoiI.I00iiI, 0);
/* 156 */           Ioi0OoiI ioi0OoiII00000oIO = iIoO01O1.I00100o1O0lo();
/* 160 */           IoiIli1i0Oil.I001lllioOl(ioi0OoiII00000oIO);
/* 165 */           Ioi01I0 ioi01I0 = new Ioi01I0(ioi0OoiII00000oIO);
/* 173 */           ioi01I0.I0010I0i = new Object();
/* 175 */           VarHandle.storeStoreFence();
/* 178 */           ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
/* 184 */           IloOolOII iloOolOII = new IloOolOII(i5);
/* 187 */           iloOolOII.I00iiI = illOOo00lI;
/* 189 */           iloOolOII.I00iiO = oOo0o0oO;
/* 191 */           iloOolOII.I00iio = iIo0l1;
/* 193 */           iloOolOII.I00ilI0I1 = illiIl1l11O;
/* 195 */           VarHandle.storeStoreFence();
/* 198 */           ioi01I0.I00IioO0OiOi(executorServiceNewSingleThreadExecutor, iloOolOII);
                    try {
/* 201 */               oOIl1Io02.I00000oOI();
/* 212 */               function1.invoke(oOIl1Io02.I00000oIO(o0oiOi, iIo0l1, ioi01I0));
                    } catch (Exception unused) {
                    }
/* 1821 */          return oOIl1Io02;
                }
            }
