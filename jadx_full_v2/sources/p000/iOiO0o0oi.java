            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public abstract class iOiO0o0oi {
                /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
                /* JADX WARN: Removed duplicated region for block: B:105:0x0123  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x012c  */
                /* JADX WARN: Removed duplicated region for block: B:208:0x035b  */
                /* JADX WARN: Removed duplicated region for block: B:211:0x0368  */
                /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x0107  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, boolean z, OioOIi1o0I oioOIi1o0I, IIIi0O0I1Oo iIIi0O0I1Oo, IIIi1IOoio iIIi1IOoio, II1IOloil iI1IOloil, OIo1Oi1l1lI oIo1Oi1l1lI, Function3 function3, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    int i4;
                    boolean z2;
                    OioOIi1o0I oioOIi1o0II00000oOI;
                    IIIi0O0I1Oo iIIi0O0I1OoI00000oOI;
                    IIIi1IOoio iIIi1IOoio2;
                    int i5;
                    II1IOloil iI1IOloil2;
                    int i6;
                    IllOOo00lI illOOo00lI2;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    OOloioIl oOloioIlI001IO000;
                    IIIi1IOoio iIIi1IOoio3;
                    OIo1Oi1l1lI oIo1Oi1l1lI3;
                    O1ooiI111i o1ooiI111i3;
                    boolean z3;
                    int i7;
                    II1IOloil iI1IOloil3;
                    IIIi0O0I1Oo iIIi0O0I1Oo2;
                    Object obj;
                    IIIi0O0I1Oo iIIi0O0I1Oo3;
                    II1IOloil iI1IOloil4;
                    OioOIi1o0I oioOIi1o0I2;
                    Ol1o0O0O0 ol1o0O0O0;
                    int i8;
                    OI0lOIiOIOOo oI0lOIiOIOOo;
                    boolean z4;
                    IIIi1IOoio iIIi1IOoio4;
                    I110IiI1I1 i110IiI1I1;
                    int i9;
/* 14 */            iloI0lOlll1.I00i0O(-1310015664);
/* 19 */            if ((i & 6) == 0) {
/* 30 */                i3 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 32 */                i3 = i;
                    }
/* 33 */            int i10 = i2 & 2;
/* 35 */            if (i10 != 0) {
/* 37 */                i3 |= 48;
                    } else {
/* 44 */                if ((i & 48) == 0) {
/* 46 */                    o1ooiI111i2 = o1ooiI111i;
/* 59 */                    i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                        }
/* 60 */                i4 = i2 & 4;
/* 62 */                if (i4 != 0) {
/* 71 */                    if ((i & 384) == 0) {
/* 73 */                        z2 = z;
/* 86 */                        i3 |= iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                            }
/* 89 */                    if ((i & 3072) == 0) {
/* 93 */                        if ((i2 & 8) == 0) {
/* 95 */                            oioOIi1o0II00000oOI = oioOIi1o0I;
/* 101 */                           if (iloI0lOlll1.I000II(oioOIi1o0II00000oOI)) {
/* 103 */                               i9 = Barcode.FORMAT_PDF417;
                                    }
/* 110 */                           i3 |= i9;
                                } else {
/* 106 */                           oioOIi1o0II00000oOI = oioOIi1o0I;
                                }
/* 108 */                       i9 = Barcode.FORMAT_UPC_E;
/* 110 */                       i3 |= i9;
                            } else {
/* 112 */                       oioOIi1o0II00000oOI = oioOIi1o0I;
                            }
/* 116 */                   if ((i & 24576) == 0) {
/* 120 */                       if ((i2 & 16) == 0) {
/* 122 */                           iIIi0O0I1OoI00000oOI = iIIi0O0I1Oo;
/* 128 */                           int i11 = iloI0lOlll1.I000II(iIIi0O0I1OoI00000oOI) ? 16384 : 8192;
/* 137 */                           i3 |= i11;
                                } else {
/* 133 */                           iIIi0O0I1OoI00000oOI = iIIi0O0I1Oo;
                                }
/* 137 */                       i3 |= i11;
                            } else {
/* 139 */                       iIIi0O0I1OoI00000oOI = iIIi0O0I1Oo;
                            }
/* 144 */                   if ((196608 & i) == 0) {
/* 148 */                       if ((i2 & 32) == 0) {
/* 150 */                           iIIi1IOoio2 = iIIi1IOoio;
/* 156 */                           int i12 = iloI0lOlll1.I000II(iIIi1IOoio2) ? 131072 : 65536;
/* 165 */                           i3 |= i12;
                                } else {
/* 161 */                           iIIi1IOoio2 = iIIi1IOoio;
                                }
/* 165 */                       i3 |= i12;
                            } else {
/* 167 */                       iIIi1IOoio2 = iIIi1IOoio;
                            }
/* 169 */                   i5 = i2 & 64;
/* 173 */                   if (i5 != 0) {
/* 175 */                       i3 |= 1572864;
/* 177 */                       iI1IOloil2 = iI1IOloil;
                            } else {
/* 182 */                       iI1IOloil2 = iI1IOloil;
/* 184 */                       if ((i & 1572864) == 0) {
/* 197 */                           i3 |= iloI0lOlll1.I000II(iI1IOloil2) ? 1048576 : 524288;
                                }
                            }
/* 199 */                   i6 = i2 & Barcode.FORMAT_ITF;
/* 203 */                   if (i6 != 0) {
/* 205 */                       i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
/* 227 */                       i3 |= iloI0lOlll1.I000II(oIo1Oi1l1lI) ? 8388608 : 4194304;
                            }
/* 236 */                   if ((i2 & Barcode.FORMAT_QR_CODE) != 0) {
/* 238 */                       i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
/* 256 */                       i3 |= iloI0lOlll1.I000II(null) ? 67108864 : 33554432;
                            }
/* 262 */                   if ((i & 805306368) == 0) {
/* 275 */                       i3 |= iloI0lOlll1.I000OOo1O(function3) ? 536870912 : 268435456;
                            }
/* 299 */                   if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 306783379) != 306783378)) {
/* 301 */                       iloI0lOlll1.I00Ol00();
/* 312 */                       if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 349 */                           if (i10 != 0) {
/* 351 */                               o1ooiI111i2 = O1ooIo101ll.I00000oIO;
                                    }
/* 354 */                           if (i4 != 0) {
/* 356 */                               z2 = true;
                                    }
/* 359 */                           if ((i2 & 8) != 0) {
/* 361 */                               OIo1i1 oIo1i1 = IIIi0o0.I00000oIO;
/* 369 */                               i3 &= -7169;
/* 365 */                               oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(IIIiO10l0.I00000oIO, iloI0lOlll1);
                                    }
/* 374 */                           if ((i2 & 16) != 0) {
/* 376 */                               OIo1i1 oIo1i12 = IIIi0o0.I00000oIO;
/* 392 */                               i3 &= -57345;
/* 388 */                               iIIi0O0I1OoI00000oOI = IIIi0o0.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO);
                                    }
/* 397 */                           if ((i2 & 32) != 0) {
/* 399 */                               OIo1i1 oIo1i13 = IIIi0o0.I00000oIO;
/* 405 */                               iIIi1IOoio3 = new IIIi1IOoio(IlIlIIi.I0001Ioi1lo);
/* 408 */                               i3 &= -458753;
                                    } else {
/* 412 */                               iIIi1IOoio3 = iIIi1IOoio2;
                                    }
/* 413 */                           if (i5 != 0) {
/* 415 */                               iI1IOloil2 = null;
                                    }
/* 421 */                           oIo1Oi1l1lI3 = i6 != 0 ? IIIi0o0.I00000oIO : oIo1Oi1l1lI;
/* 424 */                           iIIi1IOoio2 = iIIi1IOoio3;
/* 425 */                           o1ooiI111i3 = o1ooiI111i2;
/* 426 */                           z3 = z2;
/* 427 */                           i7 = i3;
/* 428 */                           iI1IOloil3 = iI1IOloil2;
/* 429 */                           iIIi0O0I1Oo2 = iIIi0O0I1OoI00000oOI;
                                } else {
/* 321 */                           iloI0lOlll1.I00OilO00Il();
/* 326 */                           if ((i2 & 8) != 0) {
/* 328 */                               i3 &= -7169;
                                    }
/* 332 */                           if ((i2 & 16) != 0) {
/* 334 */                               i3 &= -57345;
                                    }
/* 338 */                           if ((i2 & 32) != 0) {
/* 340 */                               i3 &= -458753;
                                    }
/* 341 */                           oIo1Oi1l1lI3 = oIo1Oi1l1lI;
/* 343 */                           i7 = i3;
/* 344 */                           o1ooiI111i3 = o1ooiI111i2;
/* 345 */                           z3 = z2;
/* 346 */                           iIIi0O0I1Oo2 = iIIi0O0I1OoI00000oOI;
/* 347 */                           iI1IOloil3 = iI1IOloil2;
                                }
/* 430 */                       iloI0lOlll1.I0010o();
/* 436 */                       iloI0lOlll1.I00i01iIIliI(1691726283);
/* 439 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 443 */                       Object obj2 = IOl11li.I00000oIO;
/* 445 */                       if (objI00O0i0ii == obj2) {
/* 447 */                           objI00O0i0ii = l001l0.I00000oIO();
/* 451 */                           iloI0lOlll1.I00iio(objI00O0i0ii);
                                }
/* 454 */                       OI0lOIiOIOOo oI0lOIiOIOOo2 = (OI0lOIiOIOOo) objI00O0i0ii;
/* 456 */                       iloI0lOlll1.I0010I0i(false);
/* 466 */                       long j = z3 ? iIIi0O0I1Oo2.I00000oIO : iIIi0O0I1Oo2.I0000Il00O;
/* 475 */                       long j2 = z3 ? iIIi0O0I1Oo2.I00000oOI : iIIi0O0I1Oo2.I0000O;
/* 477 */                       if (iIIi1IOoio2 == null) {
/* 482 */                           iloI0lOlll1.I00i01iIIliI(1691909926);
/* 486 */                           iloI0lOlll1.I0010I0i(false);
/* 489 */                           obj = obj2;
/* 491 */                           z4 = z3;
/* 493 */                           iIIi0O0I1Oo3 = iIIi0O0I1Oo2;
/* 495 */                           i8 = i7;
/* 497 */                           oI0lOIiOIOOo = oI0lOIiOIOOo2;
/* 499 */                           iI1IOloil4 = iI1IOloil3;
/* 501 */                           oioOIi1o0I2 = oioOIi1o0II00000oOI;
/* 503 */                           iIIi1IOoio4 = iIIi1IOoio2;
/* 505 */                           i110IiI1I1 = null;
                                } else {
/* 511 */                           iloI0lOlll1.I00i01iIIliI(-499611589);
/* 522 */                           int i13 = ((i7 >> 6) & 14) | ((i7 >> 9) & 896);
/* 523 */                           Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 527 */                           obj = obj2;
/* 529 */                           if (objI00O0i0ii2 == obj) {
/* 533 */                               objI00O0i0ii2 = new Ol1o0O0O0();
/* 536 */                               iloI0lOlll1.I00iio(objI00O0i0ii2);
                                    }
/* 539 */                           Ol1o0O0O0 ol1o0O0O02 = (Ol1o0O0O0) objI00O0i0ii2;
/* 541 */                           boolean zI000II = iloI0lOlll1.I000II(oI0lOIiOIOOo2);
/* 545 */                           iIIi0O0I1Oo3 = iIIi0O0I1Oo2;
/* 547 */                           Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 551 */                           if (zI000II || objI00O0i0ii3 == obj) {
/* 564 */                               iI1IOloil4 = iI1IOloil3;
/* 566 */                               oioOIi1o0I2 = oioOIi1o0II00000oOI;
/* 570 */                               objI00O0i0ii3 = new IIIi11Oil00o(oI0lOIiOIOOo2, ol1o0O0O02, null, 0);
/* 573 */                               ol1o0O0O0 = ol1o0O0O02;
/* 574 */                               iloI0lOlll1.I00iio(objI00O0i0ii3);
                                    } else {
/* 556 */                               iI1IOloil4 = iI1IOloil3;
/* 558 */                               oioOIi1o0I2 = oioOIi1o0II00000oOI;
/* 560 */                               ol1o0O0O0 = ol1o0O0O02;
                                    }
/* 579 */                           iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii3, iloI0lOlll1, oI0lOIiOIOOo2);
/* 586 */                           IooiIloo0i iooiIloo0i = (IooiIloo0i) IOOi0Ool1i.I00IoIO0lI(ol1o0O0O0);
/* 601 */                           float f = (z3 && !(iooiIloo0i instanceof OOIII1oOoolO) && (iooiIloo0i instanceof IoI1l00l)) ? iIIi1IOoio2.I00000oIO : 0.0f;
/* 603 */                           Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 607 */                           if (objI00O0i0ii4 == obj) {
/* 615 */                               oI0lOIiOIOOo = oI0lOIiOIOOo2;
/* 619 */                               i8 = i7;
/* 624 */                               objI00O0i0ii4 = new I10i01(Iil1010O.I00000oIO(f), Ooo0ii.I0000Il00O, null, 12);
/* 627 */                               iloI0lOlll1.I00iio(objI00O0i0ii4);
                                    } else {
/* 631 */                               i8 = i7;
/* 633 */                               oI0lOIiOIOOo = oI0lOIiOIOOo2;
                                    }
/* 635 */                           I10i01 i10i01 = (I10i01) objI00O0i0ii4;
/* 637 */                           Iil1010O iil1010OI00000oIO = Iil1010O.I00000oIO(f);
/* 697 */                           boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(i10i01) | iloI0lOlll1.I0000O(f) | ((((i13 & 14) ^ 6) > 4 && iloI0lOlll1.I000O01llI0(z3)) || (i13 & 6) == 4) | ((((i13 & 896) ^ 384) > 256 && iloI0lOlll1.I000II(iIIi1IOoio2)) || (i13 & 384) == 256) | iloI0lOlll1.I000OOo1O(iooiIloo0i);
/* 698 */                           Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 702 */                           if (zI000OOo1O || objI00O0i0ii5 == obj) {
/* 718 */                               z4 = z3;
/* 726 */                               iIIi1IOoio4 = iIIi1IOoio2;
/* 728 */                               objI00O0i0ii5 = new IIIi11ioII1(i10i01, f, z4, iIIi1IOoio4, iooiIloo0i, null, 0);
/* 733 */                               iloI0lOlll1.I00iio(objI00O0i0ii5);
                                    } else {
/* 707 */                               z4 = z3;
/* 709 */                               iIIi1IOoio4 = iIIi1IOoio2;
                                    }
/* 738 */                           iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii5, iloI0lOlll1, iil1010OI00000oIO);
/* 741 */                           i110IiI1I1 = i10i01.I0000Il00O;
/* 744 */                           iloI0lOlll1.I0010I0i(false);
                                }
/* 760 */                       float f2 = i110IiI1I1 != null ? ((Iil1010O) i110IiI1I1.I00iiI.getValue()).I00iOIl : 0.0f;
/* 761 */                       Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 765 */                       if (objI00O0i0ii6 == obj) {
/* 771 */                           objI00O0i0ii6 = new I10I0o1ii10(28);
/* 774 */                           iloI0lOlll1.I00iio(objI00O0i0ii6);
                                }
/* 780 */                       O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111i3, false, (Function1) objI00O0i0ii6);
/* 787 */                       I0o0i11iOOlI i0o0i11iOOlI = new I0o0i11iOOlI(1);
/* 790 */                       i0o0i11iOOlI.I00iiI = j2;
/* 792 */                       i0o0i11iOOlI.I00iiO = oIo1Oi1l1lI3;
/* 796 */                       i0o0i11iOOlI.I00iio = function3;
/* 798 */                       VarHandle.storeStoreFence();
/* 808 */                       int i14 = i8;
/* 826 */                       OioOIi1o0I oioOIi1o0I3 = oioOIi1o0I2;
/* 828 */                       II1IOloil iI1IOloil5 = iI1IOloil4;
/* 830 */                       O1ooiI111i o1ooiI111i4 = o1ooiI111i3;
/* 837 */                       illOOo00lI2 = illOOo00lI;
/* 844 */                       OlioioOl0O.I0000Il00O(illOOo00lI2, o1ooiI111iI00000oOI, z4, oioOIi1o0I3, j, j2, 0.0f, f2, iI1IOloil5, oI0lOIiOIOOo, iiioOl1O.I00000oOI(-535639973, i0o0i11iOOlI, iloI0lOlll1), iloI0lOlll1, (i14 & 8078) | ((i14 << 6) & 234881024), 64);
/* 847 */                       oioOIi1o0II00000oOI = oioOIi1o0I3;
/* 848 */                       iI1IOloil2 = iI1IOloil5;
/* 849 */                       iIIi0O0I1OoI00000oOI = iIIi0O0I1Oo3;
/* 851 */                       o1ooiI111i2 = o1ooiI111i4;
/* 853 */                       oIo1Oi1l1lI2 = oIo1Oi1l1lI3;
/* 855 */                       z2 = z4;
/* 857 */                       iIIi1IOoio2 = iIIi1IOoio4;
                            } else {
/* 860 */                       illOOo00lI2 = illOOo00lI;
/* 862 */                       iloI0lOlll1.I00OilO00Il();
/* 865 */                       oIo1Oi1l1lI2 = oIo1Oi1l1lI;
                            }
/* 867 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 871 */                   if (oOloioIlI001IO000 != null) {
/* 876 */                       IIIi1l iIIi1l = new IIIi1l(0);
/* 879 */                       iIIi1l.I00io1l = illOOo00lI2;
/* 881 */                       iIIi1l.I00iiI = o1ooiI111i2;
/* 883 */                       iIIi1l.I00iio = z2;
/* 885 */                       iIIi1l.I00ioIO = oioOIi1o0II00000oOI;
/* 887 */                       iIIi1l.I00l0I0l0lO1 = iIIi0O0I1OoI00000oOI;
/* 889 */                       iIIi1l.I00l0OO0IO = iIIi1IOoio2;
/* 891 */                       iIIi1l.I00li1OI = iI1IOloil2;
/* 893 */                       iIIi1l.I00iiO = oIo1Oi1l1lI2;
/* 897 */                       iIIi1l.I00ll1 = function3;
/* 901 */                       iIIi1l.I00ilI0I1 = i;
/* 905 */                       iIIi1l.I00ilO0 = i2;
/* 907 */                       VarHandle.storeStoreFence();
/* 910 */                       oOloioIlI001IO000.I0000O = iIIi1l;
/* 1925 */                      return;
                            }
/* 1925 */                  return;
                        }
/* 64 */                i3 |= 384;
/* 66 */                z2 = z;
/* 89 */                if ((i & 3072) == 0) {
                        }
/* 116 */               if ((i & 24576) == 0) {
                        }
/* 144 */               if ((196608 & i) == 0) {
                        }
/* 169 */               i5 = i2 & 64;
/* 173 */               if (i5 != 0) {
                        }
/* 199 */               i6 = i2 & Barcode.FORMAT_ITF;
/* 203 */               if (i6 != 0) {
                        }
/* 236 */               if ((i2 & Barcode.FORMAT_QR_CODE) != 0) {
                        }
/* 262 */               if ((i & 805306368) == 0) {
                        }
/* 299 */               if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 306783379) != 306783378)) {
                        }
/* 867 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 871 */               if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 39 */            o1ooiI111i2 = o1ooiI111i;
/* 60 */            i4 = i2 & 4;
/* 62 */            if (i4 != 0) {
                    }
/* 66 */            z2 = z;
/* 89 */            if ((i & 3072) == 0) {
                    }
/* 116 */           if ((i & 24576) == 0) {
                    }
/* 144 */           if ((196608 & i) == 0) {
                    }
/* 169 */           i5 = i2 & 64;
/* 173 */           if (i5 != 0) {
                    }
/* 199 */           i6 = i2 & Barcode.FORMAT_ITF;
/* 203 */           if (i6 != 0) {
                    }
/* 236 */           if ((i2 & Barcode.FORMAT_QR_CODE) != 0) {
                    }
/* 262 */           if ((i & 805306368) == 0) {
                    }
/* 299 */           if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 306783379) != 306783378)) {
                    }
/* 867 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 871 */           if (oOloioIlI001IO000 != null) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
                /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, boolean z, OioOIi1o0I oioOIi1o0I, IIIi0O0I1Oo iIIi0O0I1Oo, IIIi1IOoio iIIi1IOoio, OIo1Oi1l1lI oIo1Oi1l1lI, Function3 function3, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    int i4;
                    boolean z2;
                    int i5;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    int i6;
                    IIIi0O0I1Oo iIIi0O0I1Oo2;
                    IIIi1IOoio iIIi1IOoio2;
                    OIo1Oi1l1lI oIo1Oi1l1lI3;
                    O1ooiI111i o1ooiI111i3;
                    OioOIi1o0I oioOIi1o0II00000oOI;
                    OOloioIl oOloioIlI001IO000;
                    int i7;
                    int i8;
                    boolean z3;
                    IIIi1IOoio iIIi1IOoio3;
/* 14 */            iloI0lOlll1.I00i0O(-102343472);
/* 19 */            int i9 = 2;
/* 20 */            if ((i & 6) == 0) {
/* 31 */                i3 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 33 */                i3 = i;
                    }
/* 34 */            int i10 = i2 & 2;
/* 36 */            if (i10 != 0) {
/* 38 */                i3 |= 48;
                    } else {
/* 45 */                if ((i & 48) == 0) {
/* 47 */                    o1ooiI111i2 = o1ooiI111i;
/* 60 */                    i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                        }
/* 61 */                i4 = i2 & 4;
/* 63 */                if (i4 == 0) {
/* 65 */                    i3 |= 384;
                        } else {
/* 72 */                    if ((i & 384) == 0) {
/* 74 */                        z2 = z;
/* 87 */                        i3 |= iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                            }
/* 90 */                    if ((i & 3072) == 0) {
/* 92 */                        i3 |= Barcode.FORMAT_UPC_E;
                            }
/* 96 */                    if ((i & 24576) == 0) {
/* 98 */                        i3 |= 8192;
                            }
/* 103 */                   if ((196608 & i) == 0) {
/* 107 */                       i3 |= 65536;
                            }
/* 110 */                   int i11 = 1572864 | i3;
/* 111 */                   i5 = i2 & Barcode.FORMAT_ITF;
/* 113 */                   if (i5 == 0) {
/* 124 */                       if ((12582912 & i) == 0) {
/* 126 */                           oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 139 */                           i11 |= iloI0lOlll1.I000II(oIo1Oi1l1lI2) ? 8388608 : 4194304;
                                }
/* 142 */                       i6 = i11 | 100663296;
/* 146 */                       if ((805306368 & i) == 0) {
/* 159 */                           i6 |= iloI0lOlll1.I000OOo1O(function3) ? 536870912 : 268435456;
                                }
/* 179 */                       if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
/* 334 */                           iloI0lOlll1.I00OilO00Il();
/* 337 */                           iIIi0O0I1Oo2 = iIIi0O0I1Oo;
/* 339 */                           iIIi1IOoio2 = iIIi1IOoio;
/* 341 */                           oIo1Oi1l1lI3 = oIo1Oi1l1lI2;
/* 342 */                           o1ooiI111i3 = o1ooiI111i2;
/* 343 */                           oioOIi1o0II00000oOI = oioOIi1o0I;
                                } else {
/* 181 */                           iloI0lOlll1.I00Ol00();
/* 189 */                           if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 220 */                               O1ooiI111i o1ooiI111i4 = i10 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 221 */                               if (i4 != 0) {
/* 223 */                                   z2 = true;
                                        }
/* 224 */                               OIo1i1 oIo1i1 = IIIi0o0.I00000oIO;
/* 228 */                               oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(IIIiO10l0.I00000oIO, iloI0lOlll1);
/* 240 */                               IOOl011 iOOl011 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO;
/* 242 */                               IIIi0O0I1Oo iIIi0O0I1Oo3 = iOOl011.I00OOll1;
/* 244 */                               if (iIIi0O0I1Oo3 == null) {
/* 262 */                                   i7 = -523265;
/* 288 */                                   IIIi0O0I1Oo iIIi0O0I1Oo4 = new IIIi0O0I1Oo(IOOl0iiliOl.I0000O(iOOl011, IlIlOio0I.I00000oIO), IOOl0iiliOl.I0000O(iOOl011, IlIlOio0I.I0000oI00), IOOiio0i.I0000Il00O(0.12f, IOOl0iiliOl.I0000O(iOOl011, IlIlOio0I.I00000oOI)), IOOiio0i.I0000Il00O(0.38f, IOOl0iiliOl.I0000O(iOOl011, IlIlOio0I.I0000Il00O)));
/* 291 */                                   iOOl011.I00OOll1 = iIIi0O0I1Oo4;
/* 293 */                                   iIIi0O0I1Oo3 = iIIi0O0I1Oo4;
                                        } else {
/* 295 */                                   i7 = -523265;
                                        }
/* 301 */                               IIIi1IOoio iIIi1IOoio4 = new IIIi1IOoio(IlIlOio0I.I0000O);
/* 304 */                               int i12 = i6 & i7;
/* 306 */                               if (i5 != 0) {
/* 308 */                                   oIo1Oi1l1lI2 = IIIi0o0.I00000oIO;
                                        }
/* 310 */                               oIo1Oi1l1lI3 = oIo1Oi1l1lI2;
/* 311 */                               o1ooiI111i3 = o1ooiI111i4;
/* 312 */                               i8 = i12;
/* 313 */                               z3 = z2;
/* 314 */                               iIIi0O0I1Oo2 = iIIi0O0I1Oo3;
/* 315 */                               iIIi1IOoio3 = iIIi1IOoio4;
                                    } else {
/* 198 */                               iloI0lOlll1.I00OilO00Il();
/* 203 */                               iIIi0O0I1Oo2 = iIIi0O0I1Oo;
/* 205 */                               oIo1Oi1l1lI3 = oIo1Oi1l1lI2;
/* 201 */                               i8 = i6 & (-523265);
/* 207 */                               o1ooiI111i3 = o1ooiI111i2;
/* 208 */                               z3 = z2;
/* 209 */                               oioOIi1o0II00000oOI = oioOIi1o0I;
/* 211 */                               iIIi1IOoio3 = iIIi1IOoio;
                                    }
/* 316 */                           iloI0lOlll1.I0010o();
/* 325 */                           I00000oIO(illOOo00lI, o1ooiI111i3, z3, oioOIi1o0II00000oOI, iIIi0O0I1Oo2, iIIi1IOoio3, null, oIo1Oi1l1lI3, function3, iloI0lOlll1, 2147483646 & i8, 0);
/* 328 */                           IIIi1IOoio iIIi1IOoio5 = iIIi1IOoio3;
/* 330 */                           z2 = z3;
/* 331 */                           iIIi1IOoio2 = iIIi1IOoio5;
                                }
/* 345 */                       oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 349 */                       if (oOloioIlI001IO000 == null) {
/* 353 */                           II01Ii1OIio0 iI01Ii1OIio0 = new II01Ii1OIio0(i9);
/* 356 */                           iI01Ii1OIio0.I00ilO0 = illOOo00lI;
/* 358 */                           iI01Ii1OIio0.I00iiI = o1ooiI111i3;
/* 360 */                           iI01Ii1OIio0.I00iiO = z2;
/* 362 */                           iI01Ii1OIio0.I00io1l = oioOIi1o0II00000oOI;
/* 364 */                           iI01Ii1OIio0.I00ioIO = iIIi0O0I1Oo2;
/* 366 */                           iI01Ii1OIio0.I00l0I0l0lO1 = iIIi1IOoio2;
/* 368 */                           iI01Ii1OIio0.I00l0OO0IO = oIo1Oi1l1lI3;
/* 370 */                           iI01Ii1OIio0.I00li1OI = function3;
/* 374 */                           iI01Ii1OIio0.I00iio = i;
/* 376 */                           iI01Ii1OIio0.I00ilI0I1 = i2;
/* 378 */                           VarHandle.storeStoreFence();
/* 381 */                           oOloioIlI001IO000.I0000O = iI01Ii1OIio0;
/* 3539 */                          return;
                                }
/* 3539 */                      return;
                            }
/* 117 */                   i11 = 14155776 | i3;
/* 118 */                   oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 142 */                   i6 = i11 | 100663296;
/* 146 */                   if ((805306368 & i) == 0) {
                            }
/* 179 */                   if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
                            }
/* 345 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 349 */                   if (oOloioIlI001IO000 == null) {
                            }
                        }
/* 67 */                z2 = z;
/* 90 */                if ((i & 3072) == 0) {
                        }
/* 96 */                if ((i & 24576) == 0) {
                        }
/* 103 */               if ((196608 & i) == 0) {
                        }
/* 110 */               int i112 = 1572864 | i3;
/* 111 */               i5 = i2 & Barcode.FORMAT_ITF;
/* 113 */               if (i5 == 0) {
                        }
/* 118 */               oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 142 */               i6 = i112 | 100663296;
/* 146 */               if ((805306368 & i) == 0) {
                        }
/* 179 */               if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
                        }
/* 345 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 349 */               if (oOloioIlI001IO000 == null) {
                        }
                    }
/* 40 */            o1ooiI111i2 = o1ooiI111i;
/* 61 */            i4 = i2 & 4;
/* 63 */            if (i4 == 0) {
                    }
/* 67 */            z2 = z;
/* 90 */            if ((i & 3072) == 0) {
                    }
/* 96 */            if ((i & 24576) == 0) {
                    }
/* 103 */           if ((196608 & i) == 0) {
                    }
/* 110 */           int i1122 = 1572864 | i3;
/* 111 */           i5 = i2 & Barcode.FORMAT_ITF;
/* 113 */           if (i5 == 0) {
                    }
/* 118 */           oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 142 */           i6 = i1122 | 100663296;
/* 146 */           if ((805306368 & i) == 0) {
                    }
/* 179 */           if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
                    }
/* 345 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 349 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x015d  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x016d  */
                /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, boolean z, OioOIi1o0I oioOIi1o0I, IIIi0O0I1Oo iIIi0O0I1Oo, II1IOloil iI1IOloil, OIo1Oi1l1lI oIo1Oi1l1lI, Function3 function3, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    int i4;
                    boolean z2;
                    int i5;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    int i6;
                    IIIi0O0I1Oo iIIi0O0I1Oo2;
                    II1IOloil iI1IOloil2;
                    O1ooiI111i o1ooiI111i3;
                    OioOIi1o0I oioOIi1o0II00000oOI;
                    OOloioIl oOloioIlI001IO000;
                    int i7;
                    long jI0000Il00O;
                    boolean z3;
                    int i8;
/* 14 */            iloI0lOlll1.I00i0O(399974542);
/* 19 */            if ((i & 6) == 0) {
/* 30 */                i3 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 32 */                i3 = i;
                    }
/* 33 */            int i9 = i2 & 2;
/* 35 */            if (i9 != 0) {
/* 37 */                i3 |= 48;
                    } else {
/* 44 */                if ((i & 48) == 0) {
/* 46 */                    o1ooiI111i2 = o1ooiI111i;
/* 59 */                    i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                        }
/* 60 */                i4 = i2 & 4;
/* 62 */                if (i4 == 0) {
/* 64 */                    i3 |= 384;
                        } else {
/* 71 */                    if ((i & 384) == 0) {
/* 73 */                        z2 = z;
/* 86 */                        i3 |= iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                            }
/* 89 */                    if ((i & 3072) == 0) {
/* 91 */                        i3 |= Barcode.FORMAT_UPC_E;
                            }
/* 95 */                    if ((i & 24576) == 0) {
/* 97 */                        i3 |= 8192;
                            }
/* 101 */                   int i10 = 196608 | i3;
/* 105 */                   if ((1572864 & i) == 0) {
/* 109 */                       i10 = 720896 | i3;
                            }
/* 110 */                   i5 = i2 & Barcode.FORMAT_ITF;
/* 114 */                   if (i5 == 0) {
/* 121 */                       if ((12582912 & i) == 0) {
/* 123 */                           oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 136 */                           i10 |= iloI0lOlll1.I000II(oIo1Oi1l1lI2) ? 8388608 : 4194304;
                                }
/* 139 */                       i6 = i10 | 100663296;
/* 143 */                       if ((805306368 & i) == 0) {
/* 156 */                           i6 |= iloI0lOlll1.I000OOo1O(function3) ? 536870912 : 268435456;
                                }
/* 176 */                       if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
/* 350 */                           iloI0lOlll1.I00OilO00Il();
/* 353 */                           iIIi0O0I1Oo2 = iIIi0O0I1Oo;
/* 355 */                           iI1IOloil2 = iI1IOloil;
/* 357 */                           o1ooiI111i3 = o1ooiI111i2;
/* 358 */                           oioOIi1o0II00000oOI = oioOIi1o0I;
                                } else {
/* 178 */                           iloI0lOlll1.I00Ol00();
/* 186 */                           if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 216 */                               O1ooiI111i o1ooiI111i4 = i9 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 217 */                               if (i4 != 0) {
/* 219 */                                   z2 = true;
                                        }
/* 220 */                               OIo1i1 oIo1i1 = IIIi0o0.I00000oIO;
/* 224 */                               oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(IIIiO10l0.I00000oIO, iloI0lOlll1);
/* 236 */                               IOOl011 iOOl011 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO;
/* 238 */                               IIIi0O0I1Oo iIIi0O0I1Oo3 = iOOl011.I00OilO00Il;
/* 240 */                               if (iIIi0O0I1Oo3 == null) {
/* 244 */                                   long j = IOOiio0i.I000lI;
/* 254 */                                   i7 = -3734529;
/* 268 */                                   iIIi0O0I1Oo3 = new IIIi0O0I1Oo(j, IOOl0iiliOl.I0000O(iOOl011, OIioo1Oolol.I0000Il00O), j, IOOiio0i.I0000Il00O(OIioo1Oolol.I00000oOI, IOOl0iiliOl.I0000O(iOOl011, OIioo1Oolol.I00000oIO)));
/* 273 */                                   iOOl011.I00OilO00Il = iIIi0O0I1Oo3;
                                        } else {
/* 276 */                                   i7 = -3734529;
                                        }
/* 278 */                               float f = IIIiO10l0.I00000oOI;
/* 280 */                               if (z2) {
/* 285 */                                   iloI0lOlll1.I00i01iIIliI(-112362814);
/* 290 */                                   jI0000Il00O = IOOl0iiliOl.I0000oI00(OIioo1Oolol.I0000O, iloI0lOlll1);
/* 294 */                                   iloI0lOlll1.I0010I0i(false);
                                        } else {
/* 301 */                                   iloI0lOlll1.I00i01iIIliI(-112275208);
/* 313 */                                   jI0000Il00O = IOOiio0i.I0000Il00O(0.1f, IOOl0iiliOl.I0000oI00(OIioo1Oolol.I0000O, iloI0lOlll1));
/* 317 */                                   iloI0lOlll1.I0010I0i(false);
                                        }
/* 320 */                               II1IOloil iI1IOloilI00000oIO = iOi0iO0iIOI0.I00000oIO(f, jI0000Il00O);
/* 324 */                               int i11 = i6 & i7;
/* 326 */                               if (i5 != 0) {
/* 328 */                                   oIo1Oi1l1lI2 = IIIi0o0.I00000oIO;
                                        }
/* 331 */                               o1ooiI111i3 = o1ooiI111i4;
/* 332 */                               z3 = z2;
/* 333 */                               i8 = i11;
/* 334 */                               iI1IOloil2 = iI1IOloilI00000oIO;
/* 335 */                               iIIi0O0I1Oo2 = iIIi0O0I1Oo3;
                                    } else {
/* 195 */                               iloI0lOlll1.I00OilO00Il();
/* 198 */                               int i12 = i6 & (-3734529);
/* 200 */                               iIIi0O0I1Oo2 = iIIi0O0I1Oo;
/* 202 */                               iI1IOloil2 = iI1IOloil;
/* 204 */                               z3 = z2;
/* 205 */                               i8 = i12;
/* 206 */                               o1ooiI111i3 = o1ooiI111i2;
/* 207 */                               oioOIi1o0II00000oOI = oioOIi1o0I;
                                    }
/* 336 */                           iloI0lOlll1.I0010o();
/* 345 */                           I00000oIO(illOOo00lI, o1ooiI111i3, z3, oioOIi1o0II00000oOI, iIIi0O0I1Oo2, null, iI1IOloil2, oIo1Oi1l1lI2, function3, iloI0lOlll1, 2147483646 & i8, 0);
/* 348 */                           z2 = z3;
                                }
/* 360 */                       oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 364 */                       if (oOloioIlI001IO000 == null) {
/* 369 */                           II01Ii1OIio0 iI01Ii1OIio0 = new II01Ii1OIio0(1);
/* 372 */                           iI01Ii1OIio0.I00ilO0 = illOOo00lI;
/* 374 */                           iI01Ii1OIio0.I00iiI = o1ooiI111i3;
/* 376 */                           iI01Ii1OIio0.I00iiO = z2;
/* 378 */                           iI01Ii1OIio0.I00io1l = oioOIi1o0II00000oOI;
/* 380 */                           iI01Ii1OIio0.I00ioIO = iIIi0O0I1Oo2;
/* 382 */                           iI01Ii1OIio0.I00l0I0l0lO1 = iI1IOloil2;
/* 384 */                           iI01Ii1OIio0.I00l0OO0IO = oIo1Oi1l1lI2;
/* 386 */                           iI01Ii1OIio0.I00li1OI = function3;
/* 390 */                           iI01Ii1OIio0.I00iio = i;
/* 392 */                           iI01Ii1OIio0.I00ilI0I1 = i2;
/* 394 */                           VarHandle.storeStoreFence();
/* 397 */                           oOloioIlI001IO000.I0000O = iI01Ii1OIio0;
/* 3539 */                          return;
                                }
/* 3539 */                      return;
                            }
/* 116 */                   i10 |= 12582912;
/* 117 */                   oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 139 */                   i6 = i10 | 100663296;
/* 143 */                   if ((805306368 & i) == 0) {
                            }
/* 176 */                   if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
                            }
/* 360 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 364 */                   if (oOloioIlI001IO000 == null) {
                            }
                        }
/* 66 */                z2 = z;
/* 89 */                if ((i & 3072) == 0) {
                        }
/* 95 */                if ((i & 24576) == 0) {
                        }
/* 101 */               int i102 = 196608 | i3;
/* 105 */               if ((1572864 & i) == 0) {
                        }
/* 110 */               i5 = i2 & Barcode.FORMAT_ITF;
/* 114 */               if (i5 == 0) {
                        }
/* 117 */               oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 139 */               i6 = i102 | 100663296;
/* 143 */               if ((805306368 & i) == 0) {
                        }
/* 176 */               if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
                        }
/* 360 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 364 */               if (oOloioIlI001IO000 == null) {
                        }
                    }
/* 39 */            o1ooiI111i2 = o1ooiI111i;
/* 60 */            i4 = i2 & 4;
/* 62 */            if (i4 == 0) {
                    }
/* 66 */            z2 = z;
/* 89 */            if ((i & 3072) == 0) {
                    }
/* 95 */            if ((i & 24576) == 0) {
                    }
/* 101 */           int i1022 = 196608 | i3;
/* 105 */           if ((1572864 & i) == 0) {
                    }
/* 110 */           i5 = i2 & Barcode.FORMAT_ITF;
/* 114 */           if (i5 == 0) {
                    }
/* 117 */           oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 139 */           i6 = i1022 | 100663296;
/* 143 */           if ((805306368 & i) == 0) {
                    }
/* 176 */           if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
                    }
/* 360 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 364 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0146  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0154  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000O(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, boolean z, OioOIi1o0I oioOIi1o0I, IIIi0O0I1Oo iIIi0O0I1Oo, OIo1Oi1l1lI oIo1Oi1l1lI, Function3 function3, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    int i4;
                    boolean z2;
                    IIIi0O0I1Oo iIIi0O0I1Oo2;
                    int i5;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    int i6;
                    OIo1Oi1l1lI oIo1Oi1l1lI3;
                    O1ooiI111i o1ooiI111i3;
                    boolean z3;
                    OioOIi1o0I oioOIi1o0II00000oOI;
                    OOloioIl oOloioIlI001IO000;
                    int i7;
                    IIIi0O0I1Oo iIIi0O0I1Oo3;
                    int i8;
/* 14 */            iloI0lOlll1.I00i0O(-1061374109);
/* 19 */            if ((i & 6) == 0) {
/* 30 */                i3 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 32 */                i3 = i;
                    }
/* 33 */            int i9 = i2 & 2;
/* 35 */            if (i9 != 0) {
/* 37 */                i3 |= 48;
                    } else {
/* 44 */                if ((i & 48) == 0) {
/* 46 */                    o1ooiI111i2 = o1ooiI111i;
/* 59 */                    i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                        }
/* 60 */                i4 = i2 & 4;
/* 62 */                if (i4 == 0) {
/* 64 */                    i3 |= 384;
                        } else {
/* 71 */                    if ((i & 384) == 0) {
/* 73 */                        z2 = z;
/* 86 */                        i3 |= iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                            }
/* 89 */                    if ((i & 3072) == 0) {
/* 91 */                        i3 |= Barcode.FORMAT_UPC_E;
                            }
/* 95 */                    if ((i & 24576) == 0) {
/* 99 */                        if ((i2 & 16) == 0) {
/* 101 */                           iIIi0O0I1Oo2 = iIIi0O0I1Oo;
/* 107 */                           int i10 = iloI0lOlll1.I000II(iIIi0O0I1Oo2) ? 16384 : 8192;
/* 116 */                           i3 |= i10;
                                } else {
/* 112 */                           iIIi0O0I1Oo2 = iIIi0O0I1Oo;
                                }
/* 116 */                       i3 |= i10;
                            } else {
/* 118 */                       iIIi0O0I1Oo2 = iIIi0O0I1Oo;
                            }
/* 122 */                   int i11 = 1769472 | i3;
/* 123 */                   i5 = i2 & Barcode.FORMAT_ITF;
/* 125 */                   if (i5 == 0) {
/* 136 */                       if ((12582912 & i) == 0) {
/* 138 */                           oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 151 */                           i11 |= iloI0lOlll1.I000II(oIo1Oi1l1lI2) ? 8388608 : 4194304;
                                }
/* 154 */                       i6 = i11 | 100663296;
/* 158 */                       if ((805306368 & i) == 0) {
/* 171 */                           i6 |= iloI0lOlll1.I000OOo1O(function3) ? 536870912 : 268435456;
                                }
/* 190 */                       if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
/* 327 */                           iloI0lOlll1.I00OilO00Il();
/* 330 */                           oIo1Oi1l1lI3 = oIo1Oi1l1lI2;
/* 331 */                           o1ooiI111i3 = o1ooiI111i2;
/* 332 */                           z3 = z2;
/* 333 */                           oioOIi1o0II00000oOI = oioOIi1o0I;
                                } else {
/* 192 */                           iloI0lOlll1.I00Ol00();
/* 200 */                           if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 234 */                               O1ooiI111i o1ooiI111i4 = i9 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 235 */                               if (i4 != 0) {
/* 237 */                                   z2 = true;
                                        }
/* 238 */                               OIo1i1 oIo1i1 = IIIi0o0.I00000oIO;
/* 242 */                               oioOIi1o0II00000oOI = Oiol0Ol0li0.I00000oOI(IIIiO10l0.I00000oIO, iloI0lOlll1);
/* 246 */                               int i12 = i6 & (-7169);
/* 250 */                               if ((i2 & 16) != 0) {
/* 260 */                                   IOOl011 iOOl011 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO;
/* 262 */                                   iIIi0O0I1Oo2 = iOOl011.I00Oio;
/* 264 */                                   if (iIIi0O0I1Oo2 == null) {
/* 268 */                                       long j = IOOiio0i.I000lI;
/* 278 */                                       i8 = -64513;
/* 291 */                                       iIIi0O0I1Oo2 = new IIIi0O0I1Oo(j, IOOl0iiliOl.I0000O(iOOl011, IOOl0iI.I00ll1), j, IOOiio0i.I0000Il00O(Oloi1ii.I00000oOI, IOOl0iiliOl.I0000O(iOOl011, Oloi1ii.I00000oIO)));
/* 296 */                                       iOOl011.I00Oio = iIIi0O0I1Oo2;
                                            } else {
/* 299 */                                       i8 = -64513;
                                            }
/* 300 */                                   i12 = i6 & i8;
                                        }
/* 302 */                               if (i5 != 0) {
/* 304 */                                   oIo1Oi1l1lI2 = IIIi0o0.I00000oOI;
                                        }
/* 306 */                               oIo1Oi1l1lI3 = oIo1Oi1l1lI2;
/* 307 */                               o1ooiI111i3 = o1ooiI111i4;
/* 308 */                               z3 = z2;
/* 309 */                               i7 = i12;
/* 310 */                               iIIi0O0I1Oo3 = iIIi0O0I1Oo2;
                                    } else {
/* 209 */                               iloI0lOlll1.I00OilO00Il();
/* 212 */                               int i13 = i6 & (-7169);
/* 216 */                               if ((i2 & 16) != 0) {
/* 218 */                                   i13 = i6 & (-64513);
                                        }
/* 220 */                               boolean z4 = z2;
/* 221 */                               i7 = i13;
/* 222 */                               z3 = z4;
/* 223 */                               oIo1Oi1l1lI3 = oIo1Oi1l1lI2;
/* 224 */                               o1ooiI111i3 = o1ooiI111i2;
/* 225 */                               iIIi0O0I1Oo3 = iIIi0O0I1Oo2;
/* 226 */                               oioOIi1o0II00000oOI = oioOIi1o0I;
                                    }
/* 311 */                           iloI0lOlll1.I0010o();
/* 322 */                           I00000oIO(illOOo00lI, o1ooiI111i3, z3, oioOIi1o0II00000oOI, iIIi0O0I1Oo3, null, null, oIo1Oi1l1lI3, function3, iloI0lOlll1, i7 & 2147483646, 0);
/* 325 */                           iIIi0O0I1Oo2 = iIIi0O0I1Oo3;
                                }
/* 335 */                       oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 339 */                       if (oOloioIlI001IO000 == null) {
/* 344 */                           I0oiII i0oiII = new I0oiII(1);
/* 347 */                           i0oiII.I00iiI = illOOo00lI;
/* 349 */                           i0oiII.I00iiO = o1ooiI111i3;
/* 351 */                           i0oiII.I00iio = z3;
/* 353 */                           i0oiII.I00ioIO = oioOIi1o0II00000oOI;
/* 355 */                           i0oiII.I00l0I0l0lO1 = iIIi0O0I1Oo2;
/* 357 */                           i0oiII.I00ilI0I1 = oIo1Oi1l1lI3;
/* 359 */                           i0oiII.I00l0OO0IO = function3;
/* 361 */                           i0oiII.I00ilO0 = i;
/* 363 */                           i0oiII.I00io1l = i2;
/* 365 */                           VarHandle.storeStoreFence();
/* 368 */                           oOloioIlI001IO000.I0000O = i0oiII;
/* 2739 */                          return;
                                }
/* 2739 */                      return;
                            }
/* 129 */                   i11 = 14352384 | i3;
/* 130 */                   oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 154 */                   i6 = i11 | 100663296;
/* 158 */                   if ((805306368 & i) == 0) {
                            }
/* 190 */                   if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
                            }
/* 335 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 339 */                   if (oOloioIlI001IO000 == null) {
                            }
                        }
/* 66 */                z2 = z;
/* 89 */                if ((i & 3072) == 0) {
                        }
/* 95 */                if ((i & 24576) == 0) {
                        }
/* 122 */               int i112 = 1769472 | i3;
/* 123 */               i5 = i2 & Barcode.FORMAT_ITF;
/* 125 */               if (i5 == 0) {
                        }
/* 130 */               oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 154 */               i6 = i112 | 100663296;
/* 158 */               if ((805306368 & i) == 0) {
                        }
/* 190 */               if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
                        }
/* 335 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 339 */               if (oOloioIlI001IO000 == null) {
                        }
                    }
/* 39 */            o1ooiI111i2 = o1ooiI111i;
/* 60 */            i4 = i2 & 4;
/* 62 */            if (i4 == 0) {
                    }
/* 66 */            z2 = z;
/* 89 */            if ((i & 3072) == 0) {
                    }
/* 95 */            if ((i & 24576) == 0) {
                    }
/* 122 */           int i1122 = 1769472 | i3;
/* 123 */           i5 = i2 & Barcode.FORMAT_ITF;
/* 125 */           if (i5 == 0) {
                    }
/* 130 */           oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 154 */           i6 = i1122 | 100663296;
/* 158 */           if ((805306368 & i) == 0) {
                    }
/* 190 */           if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
                    }
/* 335 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 339 */           if (oOloioIlI001IO000 == null) {
                    }
                }
            }
