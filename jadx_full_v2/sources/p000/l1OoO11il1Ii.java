            package p000;

            import com.box.gallery.R;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.ai.edge.gallery.data.RuntimeType;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1OoO11il1Ii {
                /* JADX WARN: Removed duplicated region for block: B:174:0x06a1  */
                /* JADX WARN: Removed duplicated region for block: B:177:0x06b6  */
                /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(O1oIOiI11o0 o1oIOiI11o0, OloIl1l1oOii oloIl1l1oOii, O1ol100o0O o1ol100o0O, Function1 function1, Function1 function12, O1ooiI111i o1ooiI111i, Boolean bool, boolean z, boolean z2, boolean z3, Function1 function13, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    O1ooiI111i o1ooiI111i2;
                    int i3;
                    Boolean bool2;
                    int i4;
                    int i5;
                    char c;
                    int i6;
                    int i7;
                    IloI0lOlll1 iloI0lOlll12;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    Function1 function14;
                    OOloioIl oOloioIlI001IO000;
                    Function1 function15;
                    String str;
                    O1oIOiI11o0 o1oIOiI11o02;
                    int i8;
                    IoiOolO1iOo ioiOolO1iOoI0000O;
/* 1 */             O1oIOiI11o0 o1oIOiI11o03 = o1oIOiI11o0;
/* 3 */             OloIl1l1oOii oloIl1l1oOii2 = oloIl1l1oOii;
/* 5 */             O1ol100o0O o1ol100o0O2 = o1ol100o0O;
/* 9 */             Function1 function16 = function12;
/* 15 */            boolean z7 = o1oIOiI11o03.I00IOO;
/* 20 */            iloI0lOlll1.I00i0O(-2011158636);
/* 32 */            int i9 = i | (iloI0lOlll1.I000OOo1O(o1oIOiI11o03) ? 4 : 2);
/* 36 */            if ((i & 48) == 0) {
/* 49 */                i9 |= iloI0lOlll1.I000OOo1O(oloIl1l1oOii2) ? 32 : 16;
                    }
/* 85 */            int i10 = i9 | (iloI0lOlll1.I000OOo1O(o1ol100o0O2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000OOo1O(function1) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I000OOo1O(function16) ? 16384 : 8192);
/* 86 */            int i11 = i2 & 32;
/* 88 */            if (i11 != 0) {
/* 92 */                i3 = i10 | 196608;
/* 93 */                o1ooiI111i2 = o1ooiI111i;
                    } else {
/* 96 */                o1ooiI111i2 = o1ooiI111i;
/* 109 */               i3 = i10 | (iloI0lOlll1.I000II(o1ooiI111i2) ? 131072 : 65536);
                    }
/* 110 */           int i12 = i2 & 64;
/* 114 */           if (i12 == 0) {
/* 122 */               if ((i & 1572864) == 0) {
/* 124 */                   bool2 = bool;
/* 137 */                   i3 |= iloI0lOlll1.I000II(bool2) ? 1048576 : 524288;
                        }
/* 141 */               int i13 = i3 | 113246208;
/* 143 */               i4 = i2 & Barcode.FORMAT_UPC_A;
/* 145 */               if (i4 == 0) {
/* 149 */                   i5 = i3 | 918552576;
                        } else {
/* 168 */                   i5 = i13 | (iloI0lOlll1.I000O01llI0(z3) ? 536870912 : 268435456);
                        }
/* 172 */               int i14 = i2 & Barcode.FORMAT_UPC_E;
/* 190 */               c = i14 == 0 ? (char) 6 : iloI0lOlll1.I000OOo1O(function13) ? (char) 4 : (char) 2;
/* 221 */               if (iloI0lOlll1.I00OIl(i5 & 1, (i5 & 306783379) == 306783378 || (c & 3) != 2)) {
/* 1698 */                  i6 = i;
/* 1700 */                  i7 = i2;
/* 1701 */                  iloI0lOlll12 = iloI0lOlll1;
/* 1702 */                  iloI0lOlll12.I00OilO00Il();
/* 1705 */                  z4 = z;
/* 1707 */                  z5 = z2;
/* 1709 */                  z6 = z3;
/* 1711 */                  function14 = function13;
                        } else {
/* 223 */                   O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 225 */                   if (i11 != 0) {
/* 227 */                       o1ooiI111i2 = o1ooIo101ll;
                            }
/* 233 */                   Boolean bool3 = i12 != 0 ? null : bool2;
/* 239 */                   boolean z8 = i4 != 0 ? false : z3;
/* 241 */                   Object obj = IOl11li.I00000oIO;
/* 243 */                   if (i14 != 0) {
/* 245 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 249 */                       if (objI00O0i0ii == obj) {
/* 254 */                           objI00O0i0ii = new O1o0i0Ol0Oo0(7);
/* 257 */                           iloI0lOlll1.I00iio(objI00O0i0ii);
                                }
/* 260 */                       function15 = (Function1) objI00O0i0ii;
                            } else {
/* 263 */                       function15 = function13;
                            }
/* 267 */                   OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(o1ol100o0O2.I000OOo1O, iloI0lOlll1);
/* 271 */                   Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 275 */                   if (objI00O0i0ii2 == obj) {
/* 280 */                       O1oO0l o1oO0l = new O1oO0l(1);
/* 283 */                       o1oO0l.I00iiI = o1oIOiI11o03;
/* 285 */                       o1oO0l.I00iiO = oI10i0IlI00000oOI;
/* 287 */                       VarHandle.storeStoreFence();
/* 290 */                       objI00O0i0ii2 = Ol1llolil.I00000oOI(o1oO0l);
/* 294 */                       iloI0lOlll1.I00iio(objI00O0i0ii2);
                            }
/* 298 */                   OlO01l1oOil olO01l1oOil = (OlO01l1oOil) objI00O0i0ii2;
/* 300 */                   List list = o1oIOiI11o03.I0001Ioi1lo;
/* 302 */                   if (oloIl1l1oOii2 == null || (str = oloIl1l1oOii2.I00000oIO) == null) {
/* 308 */                       str = "";
                            }
/* 310 */                   boolean zContains = list.contains(str);
/* 314 */                   Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 318 */                   if (objI00O0i0ii3 == obj) {
/* 320 */                       if (bool3 != null) {
/* 322 */                           zContains = bool3.booleanValue();
                                }
/* 330 */                       objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Boolean.valueOf(zContains));
/* 334 */                       iloI0lOlll1.I00iio(objI00O0i0ii3);
                            }
/* 337 */                   OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii3;
/* 343 */                   O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) olO01l1oOil.getValue();
/* 357 */                   boolean z9 = (o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.FAILED;
/* 368 */                   boolean z10 = o1oIOiI11o03.I00100l0 == RuntimeType.AICORE;
/* 401 */                   O1ooiI111i o1ooiI111iI00000oOI = i0I1I0.I00000oOI(ii0OOOOo0i.I00000oIO(Ol0iOOO0.I0000oI00(o1ooiI111i2, 1.0f), OiI11O1i1.I00000oOI(12.0f)), ((Ii0iOlI) iloI0lOlll1.I000iOII(Oo0oi1olI.I00000oOI)).I0000Il00O, iO0ioilo.I00000oIO);
/* 408 */                   iloI0lOlll1.I00i01iIIliI(367935189);
/* 411 */                   Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 415 */                   if (objI00O0i0ii4 == obj) {
/* 417 */                       objI00O0i0ii4 = l001l0.I00000oIO();
/* 421 */                       iloI0lOlll1.I00iio(objI00O0i0ii4);
                            }
/* 426 */                   OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) objI00O0i0ii4;
/* 438 */                   Oi1lioiOilI oi1lioiOilII00000oIO = Oi1iliO.I00000oIO(true, 1000.0f, 0L, null, 252);
/* 475 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(o1oIOiI11o03) | ((c & 14) == 4) | ((1879048192 & i5) == 536870912) | ((i5 & 7168) == 2048);
/* 476 */                   Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                            Object obj2 = objI00O0i0ii5;
/* 480 */                   if (zI000OOo1O || objI00O0i0ii5 == obj) {
/* 486 */                       O1oOoiO0oi o1oOoiO0oi = new O1oOoiO0oi();
/* 489 */                       o1oOoiO0oi.I00iOIl = o1oIOiI11o03;
/* 491 */                       o1oOoiO0oi.I00iiI = function15;
/* 493 */                       o1oOoiO0oi.I00iiO = z8;
/* 495 */                       o1oOoiO0oi.I00iio = function1;
/* 497 */                       o1oOoiO0oi.I00ilI0I1 = oI10i0Il;
/* 499 */                       VarHandle.storeStoreFence();
/* 502 */                       iloI0lOlll1.I00iio(o1oOoiO0oi);
                                obj2 = o1oOoiO0oi;
                            }
/* 515 */                   O1ooiI111i o1ooiI111iI00000oIO = i1Ioo1o0.I00000oIO(o1ooiI111iI00000oOI, oI0lOIiOIOOo, oi1lioiOilII00000oIO, false, null, (IllOOo00lI) obj2, 28);
/* 520 */                   iloI0lOlll1.I0010I0i(false);
/* 525 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 529 */                   int i15 = i5;
/* 532 */                   int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 536 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 540 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oIO);
/* 546 */                   IOl0oi0lOl1.I000lI.getClass();
/* 549 */                   iloI0lOlll1.I00i0oil();
/* 552 */                   boolean z11 = iloI0lOlll1.I00O10llo;
/* 554 */                   IllOOo00lI illOOo00lI = O0iiOioolIi.I01101IOlO;
/* 556 */                   if (z11) {
/* 558 */                       iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 562 */                       iloI0lOlll1.I00io1l();
                            }
/* 565 */                   IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 567 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 570 */                   IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 572 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 575 */                   Integer numValueOf = Integer.valueOf(iHashCode);
/* 579 */                   IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 581 */                   li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 584 */                   li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 587 */                   IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 589 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 594 */                   O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(o1ooIo101ll, 16.0f);
/* 606 */                   boolean z12 = z8;
/* 610 */                   O1ooiI111i o1ooiI111i3 = o1ooiI111i2;
/* 613 */                   IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll1, 6);
/* 619 */                   int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 623 */                   OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 627 */                   O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0001Ioi1lo);
/* 631 */                   iloI0lOlll1.I00i0oil();
/* 634 */                   Function1 function17 = function15;
/* 638 */                   if (iloI0lOlll1.I00O10llo) {
/* 640 */                       iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 644 */                       iloI0lOlll1.I00io1l();
                            }
/* 647 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, iOOlo1O01OI00000oIO);
/* 650 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 653 */                   IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 656 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 659 */                   Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 663 */                   if (objI00O0i0ii6 == obj) {
/* 669 */                       objI00O0i0ii6 = new O1o0i0Ol0Oo0(8);
/* 672 */                       iloI0lOlll1.I00iio(objI00O0i0ii6);
                            }
/* 678 */                   O1ooiI111i o1ooiI111iI00000oOI2 = OiioloIlOlIi.I00000oOI(o1ooIo101ll, false, (Function1) objI00O0i0ii6);
/* 684 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00ilO0, false);
/* 690 */                   int iHashCode3 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 694 */                   OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll1.I000lI();
/* 698 */                   O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oOI2);
/* 702 */                   iloI0lOlll1.I00i0oil();
/* 707 */                   if (iloI0lOlll1.I00O10llo) {
/* 709 */                       iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 713 */                       iloI0lOlll1.I00io1l();
                            }
/* 716 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O2);
/* 719 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI3);
/* 722 */                   IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 725 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O3);
/* 750 */                   int i16 = i15 & 14;
/* 780 */                   l1OoiOII1Oi.I00000oIO(o1oIOiI11o0, oloIl1l1oOii, (O1oIo0iI00) olO01l1oOil.getValue(), ((Boolean) oI10i0Il.getValue()).booleanValue(), Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), iloI0lOlll1, i16 | 24576 | (i15 & 112));
/* 783 */                   II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00ll1;
/* 789 */                   O1ooiI111i o1ooiI111iI00000oOI3 = II1oili.I00000oIO.I00000oOI(o1ooIo101ll, i1O01oOIoI0I.I00ilI0I1);
/* 797 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, iI0O000iIl, iloI0lOlll1, 48);
/* 803 */                   int iHashCode4 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 807 */                   OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll1.I000lI();
/* 811 */                   O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oOI3);
/* 815 */                   iloI0lOlll1.I00i0oil();
/* 820 */                   if (iloI0lOlll1.I00O10llo) {
/* 822 */                       iloI0lOlll1.I000l1(illOOo00lI);
                            } else {
/* 826 */                       iloI0lOlll1.I00io1l();
                            }
/* 829 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 832 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI4);
/* 835 */                   IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 838 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O4);
/* 847 */                   if (o1oIOiI11o0.I00100o1O0lo.length() == 0) {
/* 852 */                       iloI0lOlll1.I00i01iIIliI(1041580452);
/* 884 */                       i8 = 48;
/* 886 */                       il0o0Oill.I00000oIO(o1oIOiI11o0, o1ol100o0O, (O1oIo0iI00) olO01l1oOil.getValue(), iO0100loIol.I00000oOI(o1ooIo101ll, z7 ? 12.0f : 0.0f, -12.0f), !z10, iloI0lOlll1, i16 | ((i15 >> 3) & 112));
/* 889 */                       o1oIOiI11o02 = o1oIOiI11o0;
/* 891 */                       iloI0lOlll1.I0010I0i(false);
                            } else {
/* 895 */                       o1oIOiI11o02 = o1oIOiI11o0;
/* 897 */                       i8 = 48;
/* 902 */                       iloI0lOlll1.I00i01iIIliI(1041922568);
/* 905 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 908 */                   if (z7) {
/* 1561 */                      iloI0lOlll1.I00i01iIIliI(1042368968);
/* 1564 */                      iloI0lOlll1.I0010I0i(false);
                            } else {
/* 913 */                       iloI0lOlll1.I00i01iIIliI(1041980352);
/* 935 */                       if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 937 */                           ioiOolO1iOoI0000O = li001Oilo00.I00000oIO;
/* 939 */                           if (ioiOolO1iOoI0000O == null) {
/* 963 */                               IoiOo1iI ioiOo1iI = new IoiOo1iI("Rounded.UnfoldLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
/* 968 */                               int i17 = Ooo1iOO.I00000oIO;
/* 974 */                               OlI00IIlOO olI00IIlOO = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 980 */                               OO0Ii1 oO0Ii1I000II = IIl001iO0Io.I000II(8.12f, 19.3f);
/* 1001 */                              oO0Ii1I000II.I0000oI00(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
/* 1011 */                              oO0Ii1I000II.I000O01llI0(12.0f, 16.83f);
/* 1017 */                              oO0Ii1I000II.I000OOo1O(2.47f, 2.47f);
/* 1020 */                              oO0Ii1I000II.I0000oI00(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
/* 1037 */                              oO0Ii1I000II.I0000oI00(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
/* 1040 */                              oO0Ii1I000II.I000OOo1O(-3.17f, -3.17f);
/* 1057 */                              oO0Ii1I000II.I0000oI00(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
/* 1060 */                              oO0Ii1I000II.I000OOo1O(-3.17f, 3.17f);
/* 1081 */                              oO0Ii1I000II.I0000oI00(-0.4f, 0.38f, -0.4f, 1.02f, -0.01f, 1.41f);
/* 1084 */                              oO0Ii1I000II.I0000Il00O();
/* 1093 */                              oO0Ii1I000II.I000OiO(15.88f, 4.7f);
/* 1113 */                              oO0Ii1I000II.I0000oI00(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
/* 1121 */                              oO0Ii1I000II.I000O01llI0(12.0f, 7.17f);
/* 1127 */                              oO0Ii1I000II.I000O01llI0(9.53f, 4.7f);
/* 1130 */                              oO0Ii1I000II.I0000oI00(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
/* 1147 */                              oO0Ii1I000II.I0000oI00(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
/* 1150 */                              oO0Ii1I000II.I000OOo1O(3.17f, 3.17f);
/* 1167 */                              oO0Ii1I000II.I0000oI00(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
/* 1170 */                              oO0Ii1I000II.I000OOo1O(3.17f, -3.17f);
/* 1191 */                              oO0Ii1I000II.I0000oI00(0.4f, -0.39f, 0.4f, -1.03f, 0.01f, -1.42f);
/* 1194 */                              oO0Ii1I000II.I0000Il00O();
/* 1200 */                              IoiOo1iI.I00000oOI(ioiOo1iI, oO0Ii1I000II.I00000oIO, 0, olI00IIlOO);
/* 1203 */                              ioiOolO1iOoI0000O = ioiOo1iI.I0000O();
/* 1207 */                              li001Oilo00.I00000oIO = ioiOolO1iOoI0000O;
                                    }
                                } else {
/* 1211 */                          ioiOolO1iOoI0000O = li00o0iII1l.I00000oIO;
/* 1213 */                          if (ioiOolO1iOoI0000O == null) {
/* 1237 */                              IoiOo1iI ioiOo1iI2 = new IoiOo1iI("Rounded.UnfoldMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
/* 1242 */                              int i18 = Ooo1iOO.I00000oIO;
/* 1248 */                              OlI00IIlOO olI00IIlOO2 = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 1259 */                              OO0Ii1 oO0Ii1I000lI = Oi010OO0.I000lI(12.0f, 5.83f, 2.46f, 2.46f);
/* 1280 */                              oO0Ii1I000lI.I0000oI00(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
/* 1297 */                              oO0Ii1I000lI.I0000oI00(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
/* 1308 */                              oO0Ii1I000lI.I000O01llI0(12.7f, 3.7f);
/* 1325 */                              oO0Ii1I000lI.I0000oI00(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
/* 1331 */                              oO0Ii1I000lI.I000O01llI0(8.12f, 6.88f);
/* 1348 */                              oO0Ii1I000lI.I0000oI00(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
/* 1365 */                              oO0Ii1I000lI.I0000oI00(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
/* 1376 */                              OooioIOo1.I0010I0i(oO0Ii1I000lI, 12.0f, 5.83f, 12.0f, 18.17f);
/* 1382 */                              oO0Ii1I000lI.I000OOo1O(-2.46f, -2.46f);
/* 1400 */                              oO0Ii1I000lI.I0000oI00(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
/* 1417 */                              oO0Ii1I000lI.I0000oI00(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
/* 1423 */                              oO0Ii1I000lI.I000OOo1O(3.17f, 3.18f);
/* 1440 */                              oO0Ii1I000lI.I0000oI00(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
/* 1443 */                              oO0Ii1I000lI.I000OOo1O(3.17f, -3.17f);
/* 1460 */                              oO0Ii1I000lI.I0000oI00(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
/* 1477 */                              oO0Ii1I000lI.I0000oI00(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
/* 1485 */                              oO0Ii1I000lI.I000O01llI0(12.0f, 18.17f);
/* 1488 */                              oO0Ii1I000lI.I0000Il00O();
/* 1494 */                              IoiOo1iI.I00000oOI(ioiOo1iI2, oO0Ii1I000lI.I00000oIO, 0, olI00IIlOO2);
/* 1497 */                              ioiOolO1iOoI0000O = ioiOo1iI2.I0000O();
/* 1501 */                              li00o0iII1l.I00000oIO = ioiOolO1iOoI0000O;
                                    }
                                }
/* 1548 */                      IoOoiI1II00i.I00000oIO(ioiOolO1iOoI0000O, lOOoli.I00000oOI(((Boolean) oI10i0Il.getValue()).booleanValue() ? R.string.cd_collapse_icon : R.string.cd_expand_icon, iloI0lOlll1), iOIiO1OII1.I00000oIO(o1ooIo101ll, 0.6f), ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I0010o, iloI0lOlll1, 384, 0);
/* 1552 */                      iloI0lOlll1.I0010I0i(false);
                            }
/* 1568 */                  iloI0lOlll1.I0010I0i(true);
/* 1571 */                  iloI0lOlll1.I0010I0i(true);
/* 1578 */                  Boolean bool4 = (Boolean) oI10i0Il.getValue();
/* 1580 */                  bool4.getClass();
/* 1585 */                  O1oOoll o1oOoll = new O1oOoll();
/* 1588 */                  o1oOoll.I00iOIl = o1oIOiI11o02;
/* 1590 */                  o1oOoll.I00iiI = z10;
/* 1592 */                  o1oOoll.I00iiO = z9;
/* 1594 */                  VarHandle.storeStoreFence();
/* 1600 */                  IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-1383810861, o1oOoll, iloI0lOlll1);
/* 1621 */                  z6 = z12;
/* 1623 */                  o1oIOiI11o03 = o1oIOiI11o0;
/* 1625 */                  o1ol100o0O2 = o1ol100o0O;
/* 1631 */                  i7 = i2;
/* 1635 */                  int i19 = i8;
/* 1636 */                  i6 = i;
/* 1639 */                  oloIl1l1oOii2 = oloIl1l1oOii;
/* 1641 */                  O1OIIoio0i1.I00000oOI(bool4, null, null, null, "item_layout_transition", null, iOii1lI00000oOI, iloI0lOlll1, 1597440, 46);
/* 1644 */                  iloI0lOlll12 = iloI0lOlll1;
/* 1648 */                  O1oi00ll o1oi00ll = new O1oi00ll();
/* 1651 */                  o1oi00ll.I00iOIl = oI10i0Il;
/* 1653 */                  o1oi00ll.I00iiI = o1oIOiI11o03;
/* 1655 */                  o1oi00ll.I00iiO = oloIl1l1oOii2;
/* 1657 */                  o1oi00ll.I00iio = o1ol100o0O2;
/* 1659 */                  o1oi00ll.I00ilI0I1 = function1;
/* 1661 */                  function16 = function12;
/* 1663 */                  o1oi00ll.I00ilO0 = function16;
/* 1665 */                  o1oi00ll.I00io1l = z6;
/* 1667 */                  o1oi00ll.I00ioIO = olO01l1oOil;
/* 1669 */                  VarHandle.storeStoreFence();
/* 1680 */                  Ol000ioo.I00000oIO(null, iiioOl1O.I00000oOI(-1630806322, o1oi00ll, iloI0lOlll12), iloI0lOlll12, i19);
/* 1683 */                  z4 = true;
/* 1684 */                  iloI0lOlll12.I0010I0i(true);
/* 1687 */                  iloI0lOlll12.I0010I0i(true);
/* 1690 */                  o1ooiI111i2 = o1ooiI111i3;
/* 1692 */                  z5 = true;
/* 1693 */                  function14 = function17;
/* 1695 */                  bool2 = bool3;
                        }
/* 1713 */              oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1717 */              if (oOloioIlI001IO000 == null) {
/* 1721 */                  O1oi01III1 o1oi01III1 = new O1oi01III1();
/* 1724 */                  o1oi01III1.I00iOIl = o1oIOiI11o03;
/* 1726 */                  o1oi01III1.I00iiI = oloIl1l1oOii2;
/* 1728 */                  o1oi01III1.I00iiO = o1ol100o0O2;
/* 1730 */                  o1oi01III1.I00iio = function1;
/* 1732 */                  o1oi01III1.I00ilI0I1 = function16;
/* 1734 */                  o1oi01III1.I00ilO0 = o1ooiI111i2;
/* 1736 */                  o1oi01III1.I00io1l = bool2;
/* 1738 */                  o1oi01III1.I00ioIO = z4;
/* 1740 */                  o1oi01III1.I00l0I0l0lO1 = z5;
/* 1742 */                  o1oi01III1.I00l0OO0IO = z6;
/* 1744 */                  o1oi01III1.I00li1OI = function14;
/* 1746 */                  o1oi01III1.I00ll1 = i6;
/* 1748 */                  o1oi01III1.I00lli11 = i7;
/* 1750 */                  VarHandle.storeStoreFence();
/* 1753 */                  oOloioIlI001IO000.I0000O = o1oi01III1;
/* 1755 */                  return;
                        }
/* 1755 */              return;
                    }
/* 116 */           i3 |= 1572864;
/* 117 */           bool2 = bool;
/* 141 */           int i132 = i3 | 113246208;
/* 143 */           i4 = i2 & Barcode.FORMAT_UPC_A;
/* 145 */           if (i4 == 0) {
                    }
/* 172 */           int i142 = i2 & Barcode.FORMAT_UPC_E;
/* 190 */           if (i142 == 0) {
                    }
/* 221 */           if (iloI0lOlll1.I00OIl(i5 & 1, (i5 & 306783379) == 306783378 || (c & 3) != 2)) {
                    }
/* 1713 */          oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1717 */          if (oOloioIlI001IO000 == null) {
                    }
                }
            }
