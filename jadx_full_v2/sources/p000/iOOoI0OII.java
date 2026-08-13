            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOOoI0OII {
                /* JADX WARN: Removed duplicated region for block: B:112:0x018c  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x028c  */
                /* JADX WARN: Removed duplicated region for block: B:140:0x029f  */
                /* JADX WARN: Removed duplicated region for block: B:144:0x02a8  */
                /* JADX WARN: Removed duplicated region for block: B:148:0x02c3  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(I1111OO10i i1111OO10i, O1ooiI111i o1ooiI111i, Oo0lloOiiIOI oo0lloOiiIOI, Function1 function1, int i, boolean z, int i2, int i3, Map map, IloI0lOlll1 iloI0lOlll1, int i4, int i5, int i6) {
                    int i7;
                    O1ooiI111i o1ooiI111i2;
                    Function1 function12;
                    int i8;
                    int i9;
                    boolean z2;
                    int i10;
                    IloI0lOlll1 iloI0lOlll12;
                    int i11;
                    Object obj;
                    OiiiOo1IOlI oiiiOo1IOlI;
                    boolean z3;
                    boolean z4;
                    IliO0o11i01 iliO0o11i01;
                    boolean z5;
                    boolean z6;
                    Object objI00O0i0ii;
                    OI10i0Il oI10i0Il;
                    boolean zI000II;
                    Object obj2;
                    Object obj3;
                    long jLongValue;
                    boolean zI0001Ioi1lo;
                    Object objI00O0i0ii2;
/* 5 */             Oo0lloOiiIOI oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 17 */            Map map2 = map;
/* 19 */            IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 28 */            iloI0lOlll13.I00i0O(-1343466571);
/* 46 */            int i12 = (i4 & 6) == 0 ? (iloI0lOlll13.I000II(i1111OO10i) ? 4 : 2) | i4 : i4;
/* 49 */            if ((i4 & 48) == 0) {
/* 62 */                i12 |= iloI0lOlll13.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 65 */            if ((i4 & 384) == 0) {
/* 78 */                i12 |= iloI0lOlll13.I000II(oo0lloOiiIOI2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 81 */            if ((i4 & 3072) == 0) {
/* 94 */                i12 |= iloI0lOlll13.I000OOo1O(function1) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 97 */            if ((i4 & 24576) == 0) {
/* 110 */               i12 |= iloI0lOlll13.I0000oI00(i) ? 16384 : 8192;
                    }
/* 114 */           if ((196608 & i4) == 0) {
/* 127 */               i12 |= iloI0lOlll13.I000O01llI0(z) ? 131072 : 65536;
                    }
/* 131 */           if ((1572864 & i4) == 0) {
/* 144 */               i12 |= iloI0lOlll13.I0000oI00(i2) ? 1048576 : 524288;
                    }
/* 148 */           if ((12582912 & i4) == 0) {
/* 161 */               i12 |= iloI0lOlll13.I0000oI00(i3) ? 8388608 : 4194304;
                    }
/* 165 */           if ((100663296 & i4) == 0) {
/* 178 */               i12 |= iloI0lOlll13.I000OOo1O(map2) ? 67108864 : 33554432;
                    }
/* 184 */           if ((i6 & Barcode.FORMAT_UPC_A) != 0) {
/* 186 */               i12 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
/* 204 */               i12 |= iloI0lOlll13.I000OOo1O(null) ? 536870912 : 268435456;
                    }
/* 207 */           if ((i6 & Barcode.FORMAT_UPC_E) != 0) {
/* 209 */               i7 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
/* 234 */               i7 = i5 | ((i5 & 8) == 0 ? iloI0lOlll13.I000II(null) : iloI0lOlll13.I000OOo1O(null) ? 4 : 2);
                    } else {
/* 237 */               i7 = i5;
                    }
/* 247 */           int i13 = i7;
/* 266 */           if (iloI0lOlll13.I00OIl(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true)) {
/* 268 */               illoi1i0olIl.I00000oOI(i3, i2);
/* 277 */               Oiio1oll000 oiio1oll000 = (Oiio1oll000) iloI0lOlll13.I000iOII(OiioI1I0i0.I00000oIO);
/* 279 */               Object obj4 = IOl11li.I00000oIO;
/* 281 */               if (oiio1oll000 != null) {
/* 286 */                   iloI0lOlll13.I00i01iIIliI(1588272647);
/* 299 */                   long j = ((Oo0lOii10o10) iloI0lOlll13.I000iOII(Oo0lOio.I00000oIO)).I00000oOI;
/* 301 */                   Object[] objArr = {oiio1oll000};
/* 305 */                   i11 = i12;
/* 310 */                   I00oooO i00oooO = new I00oooO(5);
/* 313 */                   i00oooO.I00iiI = oiio1oll000;
/* 315 */                   VarHandle.storeStoreFence();
/* 325 */                   IoloOio0I ioloOio0II00000oIO = OiIoloOl0.I00000oIO(i00oooO, new I10I0o1ii10(14));
/* 329 */                   boolean zI000OOo1O = iloI0lOlll13.I000OOo1O(oiio1oll000);
/* 333 */                   Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 337 */                   if (zI000OOo1O) {
/* 346 */                       obj = obj4;
                            } else {
/* 339 */                       obj = obj4;
/* 341 */                       if (objI00O0i0ii3 != obj) {
                                    obj3 = objI00O0i0ii3;
                                }
/* 371 */                       jLongValue = ((Number) lIo1lO.I0000Il00O(objArr, ioloOio0II00000oIO, (IllOOo00lI) obj3, iloI0lOlll13, 0)).longValue();
/* 388 */                       zI0001Ioi1lo = iloI0lOlll13.I0001Ioi1lo(jLongValue) | iloI0lOlll13.I000II(oiio1oll000) | iloI0lOlll13.I0001Ioi1lo(j);
/* 389 */                       objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
/* 393 */                       if (!zI0001Ioi1lo || objI00O0i0ii2 == obj) {
/* 405 */                           objI00O0i0ii2 = new OiiiOo1IOlI(jLongValue, oiio1oll000, j);
/* 410 */                           iloI0lOlll13.I00iio(objI00O0i0ii2);
                                }
/* 417 */                       iloI0lOlll13.I0010I0i(false);
/* 414 */                       oiiiOo1IOlI = (OiiiOo1IOlI) objI00O0i0ii2;
                            }
/* 351 */                   I1ol01 i1ol01 = new I1ol01(1);
/* 354 */                   i1ol01.I00iiI = oiio1oll000;
/* 356 */                   VarHandle.storeStoreFence();
/* 359 */                   iloI0lOlll13.I00iio(i1ol01);
                            obj3 = i1ol01;
/* 371 */                   jLongValue = ((Number) lIo1lO.I0000Il00O(objArr, ioloOio0II00000oIO, (IllOOo00lI) obj3, iloI0lOlll13, 0)).longValue();
/* 388 */                   zI0001Ioi1lo = iloI0lOlll13.I0001Ioi1lo(jLongValue) | iloI0lOlll13.I000II(oiio1oll000) | iloI0lOlll13.I0001Ioi1lo(j);
/* 389 */                   objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
/* 393 */                   if (!zI0001Ioi1lo) {
/* 405 */                       objI00O0i0ii2 = new OiiiOo1IOlI(jLongValue, oiio1oll000, j);
/* 410 */                       iloI0lOlll13.I00iio(objI00O0i0ii2);
/* 417 */                       iloI0lOlll13.I0010I0i(false);
/* 414 */                       oiiiOo1IOlI = (OiiiOo1IOlI) objI00O0i0ii2;
                            }
                        } else {
/* 423 */                   i11 = i12;
/* 425 */                   obj = obj4;
/* 430 */                   iloI0lOlll13.I00i01iIIliI(1588900273);
/* 433 */                   iloI0lOlll13.I0010I0i(false);
/* 436 */                   oiiiOo1IOlI = null;
                        }
/* 438 */               OIoi0IIoi oIoi0IIoi = I111iI.I00000oIO;
/* 442 */               int length = i1111OO10i.I00iiI.length();
/* 446 */               List list = i1111OO10i.I00iOIl;
/* 448 */               if (list != null) {
/* 453 */                   int size = list.size();
/* 458 */                   for (int i14 = 0; i14 < size; i14++) {
/* 464 */                       I11110l0o i11110l0o = (I11110l0o) list.get(i14);
/* 470 */                       if ((i11110l0o.I00000oIO instanceof OlOli0o) && "androidx.compose.foundation.text.inlineContent".equals(i11110l0o.I0000O)) {
/* 486 */                           z3 = false;
/* 491 */                           if (I111IiO.I00000oOI(0, length, i11110l0o.I00000oOI, i11110l0o.I0000Il00O)) {
/* 493 */                               z4 = true;
                                        break;
                                    }
                                }
                            }
/* 499 */                   z3 = false;
/* 500 */                   z4 = false;
/* 501 */                   boolean zI00000oIO = lOioiI.I00000oIO(i1111OO10i);
/* 511 */                   iliO0o11i01 = (IliO0o11i01) iloI0lOlll13.I000iOII(IOlO0o100i1i.I000iOII);
/* 513 */                   z5 = z3;
/* 517 */                   if (!z4 || zI00000oIO) {
/* 657 */                       OiiiOo1IOlI oiiiOo1IOlI2 = oiiiOo1IOlI;
/* 663 */                       iloI0lOlll13.I00i01iIIliI(1590195670);
/* 669 */                       z6 = (i11 & 14) != 4 ? z5 : true;
/* 673 */                       objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 677 */                       if (!z6 || objI00O0i0ii == obj) {
/* 681 */                           objI00O0i0ii = lOO00IiI0li.I00000oIO(i1111OO10i);
/* 685 */                           iloI0lOlll13.I00iio(objI00O0i0ii);
                                }
/* 688 */                       oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 694 */                       I1111OO10i i1111OO10i2 = (I1111OO10i) oI10i0Il.getValue();
/* 696 */                       zI000II = iloI0lOlll13.I000II(oI10i0Il);
/* 700 */                       Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                                obj2 = objI00O0i0ii4;
/* 704 */                       if (!zI000II || objI00O0i0ii4 == obj) {
/* 712 */                           I0Il0IoIIOll i0Il0IoIIOll = new I0Il0IoIIOll(20);
/* 715 */                           i0Il0IoIIOll.I00iiI = oI10i0Il;
/* 717 */                           VarHandle.storeStoreFence();
/* 720 */                           iloI0lOlll13.I00iio(i0Il0IoIIOll);
                                    obj2 = i0Il0IoIIOll;
                                }
/* 743 */                       int i15 = i11 << 6;
/* 771 */                       o1ooiI111i2 = o1ooiI111i;
/* 775 */                       z2 = z;
/* 779 */                       i9 = i3;
/* 785 */                       oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 789 */                       I0000oI00(o1ooiI111i2, i1111OO10i2, function1, z4, map, oo0lloOiiIOI2, i, z2, i2, i9, iliO0o11i01, oiiiOo1IOlI2, null, (Function1) obj2, null, iloI0lOlll13, ((i11 >> 3) & 910) | ((i11 >> 12) & 57344) | ((i11 << 9) & 458752) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192), ((i11 >> 21) & 896) | ((i13 << 12) & 57344));
/* 792 */                       function12 = function1;
/* 793 */                       IloI0lOlll1 iloI0lOlll14 = iloI0lOlll13;
/* 795 */                       map2 = map;
/* 796 */                       i10 = i;
/* 797 */                       i8 = i2;
/* 798 */                       iloI0lOlll14.I0010I0i(false);
                                iloI0lOlll12 = iloI0lOlll14;
                            } else {
/* 524 */                       iloI0lOlll13.I00i01iIIliI(1589148149);
/* 534 */                       I1oll0O1OO0.I00000oIO(i1111OO10i, oo0lloOiiIOI, iliO0o11i01, null, z, iloI0lOlll13);
/* 558 */                       O1ooiI111i o1ooiI111iI000II = I000II(o1ooiI111i, i1111OO10i, oo0lloOiiIOI, function1, i, z, i2, i3, iliO0o11i01, null, null, oiiiOo1IOlI, null, null, null);
/* 562 */                       I0o0oo1oOOlO i0o0oo1oOOlO = I0o0oo1oOOlO.I000II;
/* 566 */                       int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 570 */                       O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI000II);
/* 574 */                       OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 580 */                       IOl0oi0lOl1.I000lI.getClass();
/* 583 */                       iloI0lOlll13.I00i0oil();
/* 588 */                       if (iloI0lOlll13.I00O10llo) {
/* 592 */                           iloI0lOlll13.I000l1(O0iiOioolIi.I01101IOlO);
                                } else {
/* 596 */                           iloI0lOlll13.I00io1l();
                                }
/* 601 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll13, i0o0oo1oOOlO);
/* 606 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll13, oO0lO0l0I000lI);
/* 609 */                       li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 614 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 623 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll13, Integer.valueOf(iHashCode));
/* 627 */                       iloI0lOlll13.I0010I0i(true);
/* 631 */                       iloI0lOlll13.I0010I0i(false);
/* 634 */                       o1ooiI111i2 = o1ooiI111i;
/* 636 */                       oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 638 */                       function12 = function1;
/* 640 */                       i10 = i;
/* 642 */                       z2 = z;
/* 644 */                       i8 = i2;
/* 646 */                       i9 = i3;
/* 648 */                       iloI0lOlll12 = iloI0lOlll13;
/* 649 */                       map2 = map;
                            }
                        } else {
/* 499 */                   z3 = false;
/* 500 */                   z4 = false;
/* 501 */                   boolean zI00000oIO2 = lOioiI.I00000oIO(i1111OO10i);
/* 511 */                   iliO0o11i01 = (IliO0o11i01) iloI0lOlll13.I000iOII(IOlO0o100i1i.I000iOII);
/* 513 */                   z5 = z3;
/* 517 */                   if (z4) {
/* 657 */                       OiiiOo1IOlI oiiiOo1IOlI22 = oiiiOo1IOlI;
/* 663 */                       iloI0lOlll13.I00i01iIIliI(1590195670);
/* 669 */                       if ((i11 & 14) != 4) {
                                }
/* 673 */                       objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 677 */                       if (!z6) {
/* 681 */                           objI00O0i0ii = lOO00IiI0li.I00000oIO(i1111OO10i);
/* 685 */                           iloI0lOlll13.I00iio(objI00O0i0ii);
/* 688 */                           oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 694 */                           I1111OO10i i1111OO10i22 = (I1111OO10i) oI10i0Il.getValue();
/* 696 */                           zI000II = iloI0lOlll13.I000II(oI10i0Il);
/* 700 */                           Object objI00O0i0ii42 = iloI0lOlll13.I00O0i0ii();
                                    obj2 = objI00O0i0ii42;
/* 704 */                           if (!zI000II) {
/* 712 */                               I0Il0IoIIOll i0Il0IoIIOll2 = new I0Il0IoIIOll(20);
/* 715 */                               i0Il0IoIIOll2.I00iiI = oI10i0Il;
/* 717 */                               VarHandle.storeStoreFence();
/* 720 */                               iloI0lOlll13.I00iio(i0Il0IoIIOll2);
                                        obj2 = i0Il0IoIIOll2;
/* 743 */                               int i152 = i11 << 6;
/* 771 */                               o1ooiI111i2 = o1ooiI111i;
/* 775 */                               z2 = z;
/* 779 */                               i9 = i3;
/* 785 */                               oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 789 */                               I0000oI00(o1ooiI111i2, i1111OO10i22, function1, z4, map, oo0lloOiiIOI2, i, z2, i2, i9, iliO0o11i01, oiiiOo1IOlI22, null, (Function1) obj2, null, iloI0lOlll13, ((i11 >> 3) & 910) | ((i11 >> 12) & 57344) | ((i11 << 9) & 458752) | (3670016 & i152) | (29360128 & i152) | (234881024 & i152) | (i152 & 1879048192), ((i11 >> 21) & 896) | ((i13 << 12) & 57344));
/* 792 */                               function12 = function1;
/* 793 */                               IloI0lOlll1 iloI0lOlll142 = iloI0lOlll13;
/* 795 */                               map2 = map;
/* 796 */                               i10 = i;
/* 797 */                               i8 = i2;
/* 798 */                               iloI0lOlll142.I0010I0i(false);
                                        iloI0lOlll12 = iloI0lOlll142;
                                    }
                                }
                            }
                        }
                    } else {
/* 802 */               o1ooiI111i2 = o1ooiI111i;
/* 803 */               function12 = function1;
/* 804 */               i8 = i2;
/* 805 */               i9 = i3;
/* 806 */               z2 = z;
/* 807 */               i10 = i;
/* 808 */               iloI0lOlll13.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 811 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 815 */           if (oOloioIlI001IO000 != null) {
/* 819 */               I1olIII0I0I i1olIII0I0I = new I1olIII0I0I();
/* 824 */               i1olIII0I0I.I00iOIl = i1111OO10i;
/* 826 */               i1olIII0I0I.I00iiI = o1ooiI111i2;
/* 828 */               i1olIII0I0I.I00iiO = oo0lloOiiIOI2;
/* 830 */               i1olIII0I0I.I00iio = function12;
/* 832 */               i1olIII0I0I.I00ilI0I1 = i10;
/* 834 */               i1olIII0I0I.I00ilO0 = z2;
/* 836 */               i1olIII0I0I.I00io1l = i8;
/* 838 */               i1olIII0I0I.I00ioIO = i9;
/* 840 */               i1olIII0I0I.I00l0I0l0lO1 = map2;
/* 844 */               i1olIII0I0I.I00l0OO0IO = i4;
/* 848 */               i1olIII0I0I.I00li1OI = i5;
/* 852 */               i1olIII0I0I.I00ll1 = i6;
/* 854 */               VarHandle.storeStoreFence();
/* 857 */               oOloioIlI001IO000.I0000O = i1olIII0I0I;
                    }
                }

                public static final void I00000oOI(I1111OO10i i1111OO10i, Oo0lloOiiIOI oo0lloOiiIOI, Function1 function1, int i, Map map, IloI0lOlll1 iloI0lOlll1, int i2) {
                    int i3;
                    int i4;
/* 14 */            iloI0lOlll1.I00i0O(-1064305212);
/* 19 */            int i5 = 2;
/* 20 */            if ((i2 & 6) == 0) {
/* 31 */                i3 = (iloI0lOlll1.I000II(i1111OO10i) ? 4 : 2) | i2;
                    } else {
/* 33 */                i3 = i2;
                    }
/* 34 */            int i6 = i2 & 48;
/* 37 */            O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 39 */            if (i6 == 0) {
/* 52 */                i3 |= iloI0lOlll1.I000II(o1ooIo101ll) ? 32 : 16;
                    }
/* 55 */            if ((i2 & 384) == 0) {
/* 68 */                i3 |= iloI0lOlll1.I000II(oo0lloOiiIOI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 71 */            if ((i2 & 3072) == 0) {
/* 84 */                i3 |= iloI0lOlll1.I000OOo1O(function1) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 88 */            if ((i2 & 24576) == 0) {
/* 101 */               i3 |= iloI0lOlll1.I0000oI00(1) ? 16384 : 8192;
                    }
/* 105 */           if ((196608 & i2) == 0) {
/* 118 */               i3 |= iloI0lOlll1.I000O01llI0(true) ? 131072 : 65536;
                    }
/* 122 */           if ((1572864 & i2) == 0) {
/* 138 */               i3 |= iloI0lOlll1.I0000oI00(Integer.MAX_VALUE) ? 1048576 : 524288;
                    }
/* 141 */           int i7 = i3 | 12582912;
/* 145 */           if ((100663296 & i2) == 0) {
/* 158 */               i7 |= iloI0lOlll1.I000OOo1O(map) ? 67108864 : 33554432;
                    }
/* 161 */           int i8 = i7 | 805306368;
/* 179 */           if (iloI0lOlll1.I00OIl(i8 & 1, (306783379 & i8) != 306783378)) {
/* 194 */               i4 = 1;
/* 196 */               I00000oIO(i1111OO10i, o1ooIo101ll, oo0lloOiiIOI, function1, 1, true, Integer.MAX_VALUE, 1, map, iloI0lOlll1, i8 & 2147483646, 0, Barcode.FORMAT_UPC_E);
                    } else {
/* 200 */               iloI0lOlll1.I00OilO00Il();
/* 203 */               i4 = i;
                    }
/* 205 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 209 */           if (oOloioIlI001IO000 != null) {
/* 213 */               I0oliIo i0oliIo = new I0oliIo(i5);
/* 216 */               i0oliIo.I00iio = i1111OO10i;
/* 218 */               i0oliIo.I00ilI0I1 = oo0lloOiiIOI;
/* 220 */               i0oliIo.I00ilO0 = function1;
/* 222 */               i0oliIo.I00iiI = i4;
/* 224 */               i0oliIo.I00io1l = map;
/* 226 */               i0oliIo.I00iiO = i2;
/* 228 */               VarHandle.storeStoreFence();
/* 231 */               oOloioIlI001IO000.I0000O = i0oliIo;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
                /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x0138  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x0315  */
                /* JADX WARN: Removed duplicated region for block: B:168:0x0328  */
                /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x00fe A[PHI: r18
                  0x00fe: PHI (r18v15 int) = (r18v4 int), (r18v10 int), (r18v11 int) binds: [B:91:0x00fc, B:101:0x0119, B:100:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(String str, O1ooiI111i o1ooiI111i, Oo0lloOiiIOI oo0lloOiiIOI, Function1 function1, int i, boolean z, int i2, int i3, IOOioI10Il1 iOOioI10Il1, I1ili1lI0O i1ili1lI0O, IloI0lOlll1 iloI0lOlll1, int i4, int i5) {
                    int i6;
                    O1ooiI111i o1ooiI111i2;
                    int i7;
                    Function1 function12;
                    int i8;
                    int i9;
                    int i10;
                    boolean z2;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    int i15;
                    IloI0lOlll1 iloI0lOlll12;
                    int i16;
                    Function1 function13;
                    int i17;
                    boolean z3;
                    IOOioI10Il1 iOOioI10Il12;
                    I1ili1lI0O i1ili1lI0O2;
                    OOloioIl oOloioIlI001IO000;
                    O1ooiI111i o1ooiI111i3;
                    Function1 function14;
                    I1ili1lI0O i1ili1lI0O3;
                    IOOioI10Il1 iOOioI10Il13;
                    OiiiOo1IOlI oiiiOo1IOlI;
                    boolean z4;
                    O1ooiI111i o1ooiI111i4;
                    O1ooiI111i o1ooiI111iI000II;
                    int i18;
                    Object obj;
/* 18 */            iloI0lOlll1.I00i0O(-1040751001);
/* 23 */            if ((i4 & 6) == 0) {
/* 34 */                i6 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i4;
                    } else {
/* 36 */                i6 = i4;
                    }
/* 37 */            int i19 = i5 & 2;
/* 39 */            if (i19 != 0) {
/* 41 */                i6 |= 48;
                    } else {
/* 48 */                if ((i4 & 48) == 0) {
/* 50 */                    o1ooiI111i2 = o1ooiI111i;
/* 63 */                    i6 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                        }
/* 66 */                if ((i4 & 384) == 0) {
/* 79 */                    i6 |= iloI0lOlll1.I000II(oo0lloOiiIOI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 80 */                i7 = i5 & 8;
/* 82 */                if (i7 == 0) {
/* 84 */                    i6 |= 3072;
                        } else {
/* 91 */                    if ((i4 & 3072) == 0) {
/* 93 */                        function12 = function1;
/* 106 */                       i6 |= iloI0lOlll1.I000OOo1O(function12) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                            }
/* 107 */                   i8 = i5 & 16;
/* 109 */                   if (i8 != 0) {
/* 111 */                       i6 |= 24576;
                            } else {
/* 118 */                       if ((i4 & 24576) == 0) {
/* 120 */                           i9 = i;
/* 133 */                           i6 |= iloI0lOlll1.I0000oI00(i9) ? 16384 : 8192;
                                }
/* 134 */                       i10 = i5 & 32;
/* 138 */                       if (i10 == 0) {
/* 140 */                           i6 |= 196608;
                                } else {
/* 145 */                           if ((196608 & i4) == 0) {
/* 147 */                               z2 = z;
/* 160 */                               i6 |= iloI0lOlll1.I000O01llI0(z2) ? 131072 : 65536;
                                    }
/* 166 */                           if ((i4 & 1572864) == 0) {
/* 179 */                               i6 |= iloI0lOlll1.I0000oI00(i2) ? 1048576 : 524288;
                                    }
/* 181 */                           i11 = i5 & Barcode.FORMAT_ITF;
/* 185 */                           if (i11 != 0) {
/* 187 */                               i6 |= 12582912;
                                    } else {
/* 196 */                               if ((i4 & 12582912) == 0) {
/* 198 */                                   i12 = i11;
/* 213 */                                   i6 |= iloI0lOlll1.I0000oI00(i3) ? 8388608 : 4194304;
                                        }
/* 215 */                               i13 = i5 & Barcode.FORMAT_QR_CODE;
/* 219 */                               if (i13 != 0) {
/* 230 */                                   if ((i4 & 100663296) == 0) {
/* 232 */                                       i14 = i13;
/* 247 */                                       i6 |= iloI0lOlll1.I000OOo1O(iOOioI10Il1) ? 67108864 : 33554432;
                                            }
/* 249 */                                   i15 = i5 & Barcode.FORMAT_UPC_A;
/* 251 */                                   int i20 = 805306368;
/* 253 */                                   if (i15 != 0) {
/* 255 */                                       i6 |= i20;
                                            } else if ((i4 & 805306368) == 0) {
/* 282 */                                       i20 = (i4 & 1073741824) == 0 ? iloI0lOlll1.I000II(i1ili1lI0O) : iloI0lOlll1.I000OOo1O(i1ili1lI0O) ? 536870912 : 268435456;
/* 255 */                                       i6 |= i20;
                                            }
/* 311 */                                   if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 306783379) != 306783378)) {
/* 318 */                                       O1ooiI111i o1ooiI111i5 = i19 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 321 */                                       Function1 function15 = i7 == 0 ? function12 : null;
/* 330 */                                       i17 = i8 != 0 ? 1 : i9;
/* 337 */                                       z3 = i10 != 0 ? true : z2;
/* 344 */                                       i16 = i12 != 0 ? 1 : i3;
/* 350 */                                       IOOioI10Il1 iOOioI10Il14 = i14 != 0 ? null : iOOioI10Il1;
/* 356 */                                       I1ili1lI0O i1ili1lI0O4 = i15 != 0 ? null : i1ili1lI0O;
/* 358 */                                       illoi1i0olIl.I00000oOI(i16, i2);
/* 367 */                                       Oiio1oll000 oiio1oll000 = (Oiio1oll000) iloI0lOlll1.I000iOII(OiioI1I0i0.I00000oIO);
/* 369 */                                       if (oiio1oll000 != null) {
/* 374 */                                           iloI0lOlll1.I00i01iIIliI(356427477);
/* 387 */                                           long j = ((Oo0lOii10o10) iloI0lOlll1.I000iOII(Oo0lOio.I00000oIO)).I00000oOI;
/* 389 */                                           Object[] objArr = {oiio1oll000};
/* 396 */                                           I00oooO i00oooO = new I00oooO(5);
/* 401 */                                           i00oooO.I00iiI = oiio1oll000;
/* 403 */                                           VarHandle.storeStoreFence();
/* 406 */                                           function14 = function15;
/* 410 */                                           i1ili1lI0O3 = i1ili1lI0O4;
/* 417 */                                           IoloOio0I ioloOio0II00000oIO = OiIoloOl0.I00000oIO(i00oooO, new I10I0o1ii10(14));
/* 421 */                                           boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(oiio1oll000);
/* 425 */                                           Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 431 */                                           Object obj2 = IOl11li.I00000oIO;
/* 433 */                                           if (zI000OOo1O || objI00O0i0ii == obj2) {
/* 444 */                                               o1ooiI111i3 = o1ooiI111i5;
/* 446 */                                               i18 = 0;
/* 447 */                                               I1ol01 i1ol01 = new I1ol01(0);
/* 450 */                                               i1ol01.I00iiI = oiio1oll000;
/* 452 */                                               VarHandle.storeStoreFence();
/* 455 */                                               iloI0lOlll1.I00iio(i1ol01);
                                                        obj = i1ol01;
                                                    } else {
/* 438 */                                               o1ooiI111i3 = o1ooiI111i5;
/* 440 */                                               i18 = 0;
                                                        obj = objI00O0i0ii;
                                                    }
/* 465 */                                           Number number = (Number) lIo1lO.I0000Il00O(objArr, ioloOio0II00000oIO, (IllOOo00lI) obj, iloI0lOlll1, i18);
/* 467 */                                           iOOioI10Il13 = iOOioI10Il14;
/* 468 */                                           long jLongValue = number.longValue();
/* 485 */                                           boolean zI0001Ioi1lo = iloI0lOlll1.I0001Ioi1lo(jLongValue) | iloI0lOlll1.I000II(oiio1oll000) | iloI0lOlll1.I0001Ioi1lo(j);
/* 486 */                                           Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                                                    Object obj3 = objI00O0i0ii2;
/* 490 */                                           if (zI0001Ioi1lo || objI00O0i0ii2 == obj2) {
/* 502 */                                               Object oiiiOo1IOlI2 = new OiiiOo1IOlI(jLongValue, oiio1oll000, j);
/* 507 */                                               iloI0lOlll1.I00iio(oiiiOo1IOlI2);
                                                        obj3 = oiiiOo1IOlI2;
                                                    }
/* 511 */                                           oiiiOo1IOlI = (OiiiOo1IOlI) obj3;
/* 514 */                                           iloI0lOlll1.I0010I0i(false);
                                                } else {
/* 518 */                                           o1ooiI111i3 = o1ooiI111i5;
/* 520 */                                           function14 = function15;
/* 522 */                                           i1ili1lI0O3 = i1ili1lI0O4;
/* 525 */                                           iOOioI10Il13 = iOOioI10Il14;
/* 529 */                                           iloI0lOlll1.I00i01iIIliI(357055103);
/* 532 */                                           iloI0lOlll1.I0010I0i(false);
/* 535 */                                           oiiiOo1IOlI = null;
                                                }
/* 542 */                                       IliO0o11i01 iliO0o11i01 = (IliO0o11i01) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000iOII);
/* 550 */                                       Executor executor = (Executor) iloI0lOlll1.I000iOII(I1oll0O1OO0.I00000oIO);
/* 552 */                                       if (executor == null || !I1oll0O1OO0.I00000oOI(str.length())) {
/* 614 */                                           z4 = false;
/* 618 */                                           iloI0lOlll1.I00i01iIIliI(-1248455541);
/* 621 */                                           iloI0lOlll1.I0010I0i(false);
                                                } else {
/* 567 */                                           iloI0lOlll1.I00i01iIIliI(-1250263182);
/* 576 */                                           O0iOOoiioO o0iOOoiioO = (O0iOOoiioO) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I);
/* 584 */                                           IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
                                                    try {
/* 588 */                                               I1olil1illO i1olil1illO = new I1olil1illO();
/* 591 */                                               i1olil1illO.I00iOIl = oo0lloOiiIOI;
/* 593 */                                               i1olil1illO.I00iiI = o0iOOoiioO;
/* 595 */                                               i1olil1illO.I00iiO = str;
/* 597 */                                               i1olil1illO.I00iio = iiIooOOOI;
/* 599 */                                               i1olil1illO.I00ilI0I1 = iliO0o11i01;
/* 601 */                                               i1olil1illO.I00ilO0 = z3;
/* 603 */                                               VarHandle.storeStoreFence();
/* 606 */                                               executor.execute(i1olil1illO);
                                                    } catch (RejectedExecutionException unused) {
                                                    }
/* 609 */                                           z4 = false;
/* 610 */                                           iloI0lOlll1.I0010I0i(false);
                                                }
/* 624 */                                       if (oiiiOo1IOlI == null && function14 == null && i1ili1lI0O3 == null) {
/* 637 */                                           iloI0lOlll1.I00i01iIIliI(358076243);
/* 640 */                                           iloI0lOlll1.I0010I0i(z4);
/* 645 */                                           Oo0lOo111o oo0lOo111o = new Oo0lOo111o();
/* 648 */                                           oo0lOo111o.I00000oIO = str;
/* 650 */                                           oo0lOo111o.I00000oOI = oo0lloOiiIOI;
/* 652 */                                           oo0lOo111o.I0000Il00O = iliO0o11i01;
/* 654 */                                           oo0lOo111o.I0000O = i17;
/* 656 */                                           oo0lOo111o.I0000oI00 = z3;
/* 658 */                                           oo0lOo111o.I0001Ioi1lo = i2;
/* 660 */                                           oo0lOo111o.I000II = i16;
/* 662 */                                           iOOioI10Il12 = iOOioI10Il13;
/* 663 */                                           oo0lOo111o.I000O01llI0 = iOOioI10Il12;
/* 665 */                                           VarHandle.storeStoreFence();
/* 668 */                                           o1ooiI111i4 = o1ooiI111i3;
/* 674 */                                           i1ili1lI0O2 = i1ili1lI0O3;
/* 676 */                                           iloI0lOlll12 = iloI0lOlll1;
/* 670 */                                           o1ooiI111iI000II = o1ooiI111i4.I0000O(oo0lOo111o);
/* 678 */                                           function13 = function14;
                                                } else {
/* 630 */                                           iOOioI10Il12 = iOOioI10Il13;
/* 631 */                                           o1ooiI111i4 = o1ooiI111i3;
/* 684 */                                           iloI0lOlll1.I00i01iIIliI(357432497);
/* 705 */                                           i1ili1lI0O2 = i1ili1lI0O3;
/* 707 */                                           iloI0lOlll12 = iloI0lOlll1;
/* 709 */                                           OiiiOo1IOlI oiiiOo1IOlI3 = oiiiOo1IOlI;
/* 710 */                                           function13 = function14;
/* 712 */                                           o1ooiI111iI000II = I000II(o1ooiI111i4, new I1111OO10i(str), oo0lloOiiIOI, function13, i17, z3, i2, i16, (IliO0o11i01) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000iOII), null, null, oiiiOo1IOlI3, iOOioI10Il12, null, i1ili1lI0O2);
/* 717 */                                           iloI0lOlll12.I0010I0i(false);
                                                }
/* 720 */                                       I0o0oo1oOOlO i0o0oo1oOOlO = I0o0oo1oOOlO.I000II;
/* 724 */                                       int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 728 */                                       O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI000II);
/* 732 */                                       OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 738 */                                       IOl0oi0lOl1.I000lI.getClass();
/* 741 */                                       iloI0lOlll12.I00i0oil();
/* 746 */                                       if (iloI0lOlll12.I00O10llo) {
/* 750 */                                           iloI0lOlll12.I000l1(O0iiOioolIi.I01101IOlO);
                                                } else {
/* 754 */                                           iloI0lOlll12.I00io1l();
                                                }
/* 759 */                                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll12, i0o0oo1oOOlO);
/* 764 */                                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll12, oO0lO0l0I000lI);
/* 767 */                                       li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 772 */                                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 781 */                                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll12, Integer.valueOf(iHashCode));
/* 785 */                                       iloI0lOlll12.I0010I0i(true);
/* 788 */                                       o1ooiI111i2 = o1ooiI111i4;
                                            } else {
/* 790 */                                       iloI0lOlll12 = iloI0lOlll1;
/* 791 */                                       iloI0lOlll12.I00OilO00Il();
/* 794 */                                       i16 = i3;
/* 796 */                                       function13 = function12;
/* 797 */                                       i17 = i9;
/* 798 */                                       z3 = z2;
/* 799 */                                       iOOioI10Il12 = iOOioI10Il1;
/* 801 */                                       i1ili1lI0O2 = i1ili1lI0O;
                                            }
/* 803 */                                   oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 807 */                                   if (oOloioIlI001IO000 != null) {
/* 811 */                                       I1ol10 i1ol10 = new I1ol10();
/* 816 */                                       i1ol10.I00iOIl = str;
/* 818 */                                       i1ol10.I00iiI = o1ooiI111i2;
/* 820 */                                       i1ol10.I00iiO = oo0lloOiiIOI;
/* 822 */                                       i1ol10.I00iio = function13;
/* 824 */                                       i1ol10.I00ilI0I1 = i17;
/* 826 */                                       i1ol10.I00ilO0 = z3;
/* 828 */                                       i1ol10.I00io1l = i2;
/* 830 */                                       i1ol10.I00ioIO = i16;
/* 832 */                                       i1ol10.I00l0I0l0lO1 = iOOioI10Il12;
/* 834 */                                       i1ol10.I00l0OO0IO = i1ili1lI0O2;
/* 838 */                                       i1ol10.I00li1OI = i4;
/* 842 */                                       i1ol10.I00ll1 = i5;
/* 844 */                                       VarHandle.storeStoreFence();
/* 847 */                                       oOloioIlI001IO000.I0000O = i1ol10;
/* 1578 */                                      return;
                                            }
/* 1578 */                                  return;
                                        }
/* 221 */                               i6 |= 100663296;
/* 223 */                               i14 = i13;
/* 249 */                               i15 = i5 & Barcode.FORMAT_UPC_A;
/* 251 */                               int i202 = 805306368;
/* 253 */                               if (i15 != 0) {
                                        }
/* 311 */                               if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 306783379) != 306783378)) {
                                        }
/* 803 */                               oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 807 */                               if (oOloioIlI001IO000 != null) {
                                        }
                                    }
/* 189 */                           i12 = i11;
/* 215 */                           i13 = i5 & Barcode.FORMAT_QR_CODE;
/* 219 */                           if (i13 != 0) {
                                    }
/* 223 */                           i14 = i13;
/* 249 */                           i15 = i5 & Barcode.FORMAT_UPC_A;
/* 251 */                           int i2022 = 805306368;
/* 253 */                           if (i15 != 0) {
                                    }
/* 311 */                           if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 306783379) != 306783378)) {
                                    }
/* 803 */                           oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 807 */                           if (oOloioIlI001IO000 != null) {
                                    }
                                }
/* 141 */                       z2 = z;
/* 166 */                       if ((i4 & 1572864) == 0) {
                                }
/* 181 */                       i11 = i5 & Barcode.FORMAT_ITF;
/* 185 */                       if (i11 != 0) {
                                }
/* 189 */                       i12 = i11;
/* 215 */                       i13 = i5 & Barcode.FORMAT_QR_CODE;
/* 219 */                       if (i13 != 0) {
                                }
/* 223 */                       i14 = i13;
/* 249 */                       i15 = i5 & Barcode.FORMAT_UPC_A;
/* 251 */                       int i20222 = 805306368;
/* 253 */                       if (i15 != 0) {
                                }
/* 311 */                       if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 306783379) != 306783378)) {
                                }
/* 803 */                       oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 807 */                       if (oOloioIlI001IO000 != null) {
                                }
                            }
/* 113 */                   i9 = i;
/* 134 */                   i10 = i5 & 32;
/* 138 */                   if (i10 == 0) {
                            }
/* 141 */                   z2 = z;
/* 166 */                   if ((i4 & 1572864) == 0) {
                            }
/* 181 */                   i11 = i5 & Barcode.FORMAT_ITF;
/* 185 */                   if (i11 != 0) {
                            }
/* 189 */                   i12 = i11;
/* 215 */                   i13 = i5 & Barcode.FORMAT_QR_CODE;
/* 219 */                   if (i13 != 0) {
                            }
/* 223 */                   i14 = i13;
/* 249 */                   i15 = i5 & Barcode.FORMAT_UPC_A;
/* 251 */                   int i202222 = 805306368;
/* 253 */                   if (i15 != 0) {
                            }
/* 311 */                   if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 306783379) != 306783378)) {
                            }
/* 803 */                   oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 807 */                   if (oOloioIlI001IO000 != null) {
                            }
                        }
/* 86 */                function12 = function1;
/* 107 */               i8 = i5 & 16;
/* 109 */               if (i8 != 0) {
                        }
/* 113 */               i9 = i;
/* 134 */               i10 = i5 & 32;
/* 138 */               if (i10 == 0) {
                        }
/* 141 */               z2 = z;
/* 166 */               if ((i4 & 1572864) == 0) {
                        }
/* 181 */               i11 = i5 & Barcode.FORMAT_ITF;
/* 185 */               if (i11 != 0) {
                        }
/* 189 */               i12 = i11;
/* 215 */               i13 = i5 & Barcode.FORMAT_QR_CODE;
/* 219 */               if (i13 != 0) {
                        }
/* 223 */               i14 = i13;
/* 249 */               i15 = i5 & Barcode.FORMAT_UPC_A;
/* 251 */               int i2022222 = 805306368;
/* 253 */               if (i15 != 0) {
                        }
/* 311 */               if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 306783379) != 306783378)) {
                        }
/* 803 */               oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 807 */               if (oOloioIlI001IO000 != null) {
                        }
                    }
/* 43 */            o1ooiI111i2 = o1ooiI111i;
/* 66 */            if ((i4 & 384) == 0) {
                    }
/* 80 */            i7 = i5 & 8;
/* 82 */            if (i7 == 0) {
                    }
/* 86 */            function12 = function1;
/* 107 */           i8 = i5 & 16;
/* 109 */           if (i8 != 0) {
                    }
/* 113 */           i9 = i;
/* 134 */           i10 = i5 & 32;
/* 138 */           if (i10 == 0) {
                    }
/* 141 */           z2 = z;
/* 166 */           if ((i4 & 1572864) == 0) {
                    }
/* 181 */           i11 = i5 & Barcode.FORMAT_ITF;
/* 185 */           if (i11 != 0) {
                    }
/* 189 */           i12 = i11;
/* 215 */           i13 = i5 & Barcode.FORMAT_QR_CODE;
/* 219 */           if (i13 != 0) {
                    }
/* 223 */           i14 = i13;
/* 249 */           i15 = i5 & Barcode.FORMAT_UPC_A;
/* 251 */           int i20222222 = 805306368;
/* 253 */           if (i15 != 0) {
                    }
/* 311 */           if (iloI0lOlll1.I00OIl(i6 & 1, (i6 & 306783379) != 306783378)) {
                    }
/* 803 */           oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 807 */           if (oOloioIlI001IO000 != null) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
                /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
                /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000O(String str, O1ooiI111i o1ooiI111i, Oo0lloOiiIOI oo0lloOiiIOI, Function1 function1, int i, boolean z, int i2, int i3, IloI0lOlll1 iloI0lOlll1, int i4, int i5) {
                    int i6;
                    O1ooiI111i o1ooiI111i2;
                    int i7;
                    Oo0lloOiiIOI oo0lloOiiIOI2;
                    int i8;
                    Function1 function12;
                    int i9;
                    int i10;
                    int i11;
                    boolean z2;
                    int i12;
                    int i13;
                    String str2;
                    int i14;
                    int i15;
                    O1ooiI111i o1ooiI111i3;
                    OOloioIl oOloioIlI001IO000;
/* 12 */            iloI0lOlll1.I00i0O(-1186827822);
/* 17 */            if ((i4 & 6) == 0) {
/* 28 */                i6 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i4;
                    } else {
/* 30 */                i6 = i4;
                    }
/* 31 */            int i16 = i5 & 2;
/* 33 */            if (i16 != 0) {
/* 35 */                i6 |= 48;
                    } else {
/* 42 */                if ((i4 & 48) == 0) {
/* 44 */                    o1ooiI111i2 = o1ooiI111i;
/* 57 */                    i6 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                        }
/* 58 */                i7 = i5 & 4;
/* 60 */                if (i7 == 0) {
/* 62 */                    i6 |= 384;
                        } else {
/* 69 */                    if ((i4 & 384) == 0) {
/* 71 */                        oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 84 */                        i6 |= iloI0lOlll1.I000II(oo0lloOiiIOI2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                            }
/* 85 */                    i8 = i5 & 8;
/* 87 */                    if (i8 != 0) {
/* 89 */                        i6 |= 3072;
                            } else {
/* 96 */                        if ((i4 & 3072) == 0) {
/* 98 */                            function12 = function1;
/* 111 */                           i6 |= iloI0lOlll1.I000OOo1O(function12) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                                }
/* 112 */                       i9 = i5 & 16;
/* 114 */                       if (i9 == 0) {
/* 116 */                           i6 |= 24576;
                                } else {
/* 123 */                           if ((i4 & 24576) == 0) {
/* 125 */                               i10 = i;
/* 138 */                               i6 |= iloI0lOlll1.I0000oI00(i10) ? 16384 : 8192;
                                    }
/* 139 */                           i11 = i5 & 32;
/* 143 */                           if (i11 == 0) {
/* 150 */                               if ((196608 & i4) == 0) {
/* 152 */                                   z2 = z;
/* 165 */                                   i6 |= iloI0lOlll1.I000O01llI0(z2) ? 131072 : 65536;
                                        }
/* 166 */                               i12 = i5 & 64;
/* 170 */                               if (i12 == 0) {
/* 172 */                                   i6 |= 1572864;
                                        } else if ((i4 & 1572864) == 0) {
/* 194 */                                   i6 |= iloI0lOlll1.I0000oI00(i2) ? 1048576 : 524288;
                                        }
/* 198 */                               i13 = i6 | 113246208;
/* 224 */                               if (iloI0lOlll1.I00OIl(i13 & 1, (i13 & 38347923) == 38347922)) {
/* 288 */                                   str2 = str;
/* 290 */                                   iloI0lOlll1.I00OilO00Il();
/* 293 */                                   i14 = i2;
/* 295 */                                   i15 = i3;
/* 297 */                                   o1ooiI111i3 = o1ooiI111i2;
                                        } else {
/* 232 */                                   o1ooiI111i3 = i16 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 239 */                                   Oo0lloOiiIOI oo0lloOiiIOI3 = i7 != 0 ? Oo0lloOiiIOI.I0000O : oo0lloOiiIOI2;
/* 245 */                                   Function1 function13 = i8 != 0 ? null : function12;
/* 251 */                                   int i17 = i9 != 0 ? 1 : i10;
/* 257 */                                   boolean z3 = i11 != 0 ? true : z2;
/* 265 */                                   i14 = i12 != 0 ? Integer.MAX_VALUE : i2;
/* 277 */                                   str2 = str;
/* 279 */                                   I0000Il00O(str2, o1ooiI111i3, oo0lloOiiIOI3, function13, i17, z3, i14, 1, null, null, iloI0lOlll1, i13 & 268435454, Barcode.FORMAT_UPC_A);
/* 282 */                                   i10 = i17;
/* 283 */                                   z2 = z3;
/* 284 */                                   oo0lloOiiIOI2 = oo0lloOiiIOI3;
/* 285 */                                   i15 = 1;
/* 286 */                                   function12 = function13;
                                        }
/* 298 */                               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 302 */                               if (oOloioIlI001IO000 == null) {
/* 306 */                                   I1olOioo i1olOioo = new I1olOioo();
/* 309 */                                   i1olOioo.I00iOIl = str2;
/* 311 */                                   i1olOioo.I00iiI = o1ooiI111i3;
/* 313 */                                   i1olOioo.I00iiO = oo0lloOiiIOI2;
/* 315 */                                   i1olOioo.I00iio = function12;
/* 317 */                                   i1olOioo.I00ilI0I1 = i10;
/* 319 */                                   i1olOioo.I00ilO0 = z2;
/* 321 */                                   i1olOioo.I00io1l = i14;
/* 323 */                                   i1olOioo.I00ioIO = i15;
/* 325 */                                   i1olOioo.I00l0I0l0lO1 = i4;
/* 327 */                                   i1olOioo.I00l0OO0IO = i5;
/* 329 */                                   VarHandle.storeStoreFence();
/* 332 */                                   oOloioIlI001IO000.I0000O = i1olOioo;
/* 3539 */                                  return;
                                        }
/* 3539 */                              return;
                                    }
/* 145 */                           i6 |= 196608;
/* 146 */                           z2 = z;
/* 166 */                           i12 = i5 & 64;
/* 170 */                           if (i12 == 0) {
                                    }
/* 198 */                           i13 = i6 | 113246208;
/* 224 */                           if (iloI0lOlll1.I00OIl(i13 & 1, (i13 & 38347923) == 38347922)) {
                                    }
/* 298 */                           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 302 */                           if (oOloioIlI001IO000 == null) {
                                    }
                                }
/* 118 */                       i10 = i;
/* 139 */                       i11 = i5 & 32;
/* 143 */                       if (i11 == 0) {
                                }
/* 146 */                       z2 = z;
/* 166 */                       i12 = i5 & 64;
/* 170 */                       if (i12 == 0) {
                                }
/* 198 */                       i13 = i6 | 113246208;
/* 224 */                       if (iloI0lOlll1.I00OIl(i13 & 1, (i13 & 38347923) == 38347922)) {
                                }
/* 298 */                       oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 302 */                       if (oOloioIlI001IO000 == null) {
                                }
                            }
/* 91 */                    function12 = function1;
/* 112 */                   i9 = i5 & 16;
/* 114 */                   if (i9 == 0) {
                            }
/* 118 */                   i10 = i;
/* 139 */                   i11 = i5 & 32;
/* 143 */                   if (i11 == 0) {
                            }
/* 146 */                   z2 = z;
/* 166 */                   i12 = i5 & 64;
/* 170 */                   if (i12 == 0) {
                            }
/* 198 */                   i13 = i6 | 113246208;
/* 224 */                   if (iloI0lOlll1.I00OIl(i13 & 1, (i13 & 38347923) == 38347922)) {
                            }
/* 298 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 302 */                   if (oOloioIlI001IO000 == null) {
                            }
                        }
/* 64 */                oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 85 */                i8 = i5 & 8;
/* 87 */                if (i8 != 0) {
                        }
/* 91 */                function12 = function1;
/* 112 */               i9 = i5 & 16;
/* 114 */               if (i9 == 0) {
                        }
/* 118 */               i10 = i;
/* 139 */               i11 = i5 & 32;
/* 143 */               if (i11 == 0) {
                        }
/* 146 */               z2 = z;
/* 166 */               i12 = i5 & 64;
/* 170 */               if (i12 == 0) {
                        }
/* 198 */               i13 = i6 | 113246208;
/* 224 */               if (iloI0lOlll1.I00OIl(i13 & 1, (i13 & 38347923) == 38347922)) {
                        }
/* 298 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 302 */               if (oOloioIlI001IO000 == null) {
                        }
                    }
/* 37 */            o1ooiI111i2 = o1ooiI111i;
/* 58 */            i7 = i5 & 4;
/* 60 */            if (i7 == 0) {
                    }
/* 64 */            oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 85 */            i8 = i5 & 8;
/* 87 */            if (i8 != 0) {
                    }
/* 91 */            function12 = function1;
/* 112 */           i9 = i5 & 16;
/* 114 */           if (i9 == 0) {
                    }
/* 118 */           i10 = i;
/* 139 */           i11 = i5 & 32;
/* 143 */           if (i11 == 0) {
                    }
/* 146 */           z2 = z;
/* 166 */           i12 = i5 & 64;
/* 170 */           if (i12 == 0) {
                    }
/* 198 */           i13 = i6 | 113246208;
/* 224 */           if (iloI0lOlll1.I00OIl(i13 & 1, (i13 & 38347923) == 38347922)) {
                    }
/* 298 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 302 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:165:0x02bb  */
                /* JADX WARN: Type inference failed for: r10v14 */
                /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r10v17 */
                /* JADX WARN: Type inference failed for: r15v4, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r49v0, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v19, types: [O100loO1] */
                /* JADX WARN: Type inference failed for: r9v10 */
                /* JADX WARN: Type inference failed for: r9v19 */
                /* JADX WARN: Type inference failed for: r9v2 */
                /* JADX WARN: Type inference failed for: r9v20 */
                /* JADX WARN: Type inference failed for: r9v3, types: [OI10i0Il, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v6, types: [Oo0io0] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000oI00(O1ooiI111i o1ooiI111i, I1111OO10i i1111OO10i, Function1 function1, boolean z, Map map, Oo0lloOiiIOI oo0lloOiiIOI, int i, boolean z2, int i2, int i3, IliO0o11i01 iliO0o11i01, OiiiOo1IOlI oiiiOo1IOlI, IOOioI10Il1 iOOioI10Il1, Function1 function12, I1ili1lI0O i1ili1lI0O, IloI0lOlll1 iloI0lOlll1, int i4, int i5) {
                    int i6;
                    int i7;
                    O1ooiI111i o1ooiI111i2;
                    Oo0lloOiiIOI oo0lloOiiIOI2;
                    IliO0o11i01 iliO0o11i012;
                    I1111OO10i i1111OO10i2;
                    int i8;
                    int i9;
                    int i10;
                    OiiiOo1IOlI oiiiOo1IOlI2;
                    IOOioI10Il1 iOOioI10Il12;
                    IloI0lOlll1 iloI0lOlll12;
                    Function1 function13;
                    Oo0io0 oo0io0;
                    I01ii1IIl i01ii1IIl;
                    IllOOo00lI illOOo00lI;
                    OIoi0IIoi oIoi0IIoi;
                    I0Il0IoIIOll i0Il0IoIIOll;
                    ?? r9;
                    Object obj;
                    Object obj2;
                    Object obj3;
                    I0ollO i0ollO;
                    ?? r92;
                    boolean z3;
                    ?? r10;
                    Object obj4;
                    IllOOo00lI illOOo00lI2;
                    boolean z4 = z2;
/* 1 */             iloI0lOlll1.I00i0O(-2118572703);
                    if ((i4 & 6) == 0) {
                        i6 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i4;
                    } else {
                        i6 = i4;
                    }
                    if ((i4 & 48) == 0) {
                        i6 |= iloI0lOlll1.I000II(i1111OO10i) ? 32 : 16;
                    }
                    int i11 = i4 & 384;
                    int i12 = Barcode.FORMAT_ITF;
                    if (i11 == 0) {
                        i6 |= iloI0lOlll1.I000OOo1O(function1) ? Barcode.FORMAT_QR_CODE : 128;
                    }
                    int i13 = i4 & 3072;
                    int i14 = Barcode.FORMAT_UPC_E;
                    if (i13 == 0) {
                        i6 |= iloI0lOlll1.I000O01llI0(z) ? 2048 : 1024;
                    }
                    if ((i4 & 24576) == 0) {
                        i6 |= iloI0lOlll1.I000OOo1O(map) ? 16384 : 8192;
                    }
                    if ((196608 & i4) == 0) {
                        i6 |= iloI0lOlll1.I000II(oo0lloOiiIOI) ? 131072 : 65536;
                    }
                    if ((1572864 & i4) == 0) {
                        i6 |= iloI0lOlll1.I0000oI00(i) ? 1048576 : 524288;
                    }
                    if ((12582912 & i4) == 0) {
                        i6 |= iloI0lOlll1.I000O01llI0(z4) ? 8388608 : 4194304;
                    }
                    if ((100663296 & i4) == 0) {
                        i6 |= iloI0lOlll1.I0000oI00(i2) ? 67108864 : 33554432;
                    }
                    if ((805306368 & i4) == 0) {
                        i6 |= iloI0lOlll1.I0000oI00(i3) ? 536870912 : 268435456;
                    }
                    if ((i5 & 6) == 0) {
                        i7 = i5 | (iloI0lOlll1.I000OOo1O(iliO0o11i01) ? 4 : 2);
                    } else {
                        i7 = i5;
                    }
                    if ((i5 & 48) == 0) {
                        i7 |= iloI0lOlll1.I000OOo1O(oiiiOo1IOlI) ? 32 : 16;
                    }
                    int i15 = i7;
                    if ((i5 & 384) == 0) {
                        if (iloI0lOlll1.I000OOo1O(iOOioI10Il1)) {
                            i12 = Barcode.FORMAT_QR_CODE;
                        }
                        i15 |= i12;
                    }
                    if ((i5 & 3072) == 0) {
                        if (iloI0lOlll1.I000OOo1O(function12)) {
                            i14 = 2048;
                        }
                        i15 |= i14;
                    }
                    if ((i5 & 24576) == 0) {
                        i15 |= (32768 & i5) == 0 ? iloI0lOlll1.I000II(i1ili1lI0O) : iloI0lOlll1.I000OOo1O(i1ili1lI0O) ? 16384 : 8192;
                    }
                    if (iloI0lOlll1.I00OIl(i6 & 1, ((i6 & 306783379) == 306783378 && (i15 & 9363) == 9362) ? false : true)) {
/* 2 */                 boolean zI00000oIO = lOioiI.I00000oIO(i1111OO10i);
                        IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        if (zI00000oIO) {
                            iloI0lOlll1.I00i01iIIliI(145641571);
                            function13 = null;
                            boolean z5 = (i6 & 112) == 32;
/* 3 */                     ?? I00O0i0ii = iloI0lOlll1.I00O0i0ii();
                            Oo0io0 oo0io02 = I00O0i0ii;
                            if (z5 || I00O0i0ii == iOO0o0I1l) {
/* 5 */                         Oo0io0 oo0io03 = new Oo0io0();
/* 7 */                         oo0io03.I00000oIO = lOO00IiI0li.I00000oIO(null);
/* 8 */                         Oo011oIOO1 oo011oIOO1 = new Oo011oIOO1(11);
/* 9 */                         I11110OIl i11110OIl = new I11110OIl(i1111OO10i);
                                ArrayList arrayList = i11110OIl.I00iiO;
/* 10 */                        ArrayList arrayList2 = new ArrayList(arrayList.size());
/* 11 */                        int size = arrayList.size();
                                int i16 = 0;
                                while (i16 < size) {
                                    int i17 = size;
                                    int i18 = i16;
/* 15 */                            List list = (List) oo011oIOO1.invoke(((I111101Olo00) arrayList.get(i16)).I00000oIO(Integer.MIN_VALUE));
                                    Oo011oIOO1 oo011oIOO12 = oo011oIOO1;
/* 16 */                            ArrayList arrayList3 = new ArrayList(list.size());
/* 17 */                            int size2 = list.size();
                                    int i19 = 0;
                                    while (i19 < size2) {
                                        int i20 = size2;
/* 19 */                                I11110l0o i11110l0o = (I11110l0o) list.get(i19);
/* 26 */                                arrayList3.add(new I111101Olo00(i11110l0o.I00000oIO, i11110l0o.I00000oOI, i11110l0o.I0000Il00O, i11110l0o.I0000O));
                                        i19++;
                                        list = list;
                                        size2 = i20;
                                    }
/* 27 */                            IOOii0O10Io0.I00100l0(arrayList2, arrayList3);
                                    i16 = i18 + 1;
                                    size = i17;
                                    oo011oIOO1 = oo011oIOO12;
                                }
/* 28 */                        arrayList.clear();
/* 29 */                        arrayList.addAll(arrayList2);
/* 31 */                        oo0io03.I00000oOI = i11110OIl.I000OiO();
/* 33 */                        oo0io03.I0000Il00O = new Ol1o0O0O0();
/* 34 */                        VarHandle.storeStoreFence();
/* 35 */                        iloI0lOlll1.I00iio(oo0io03);
                                oo0io02 = oo0io03;
                            }
/* 37 */                    iloI0lOlll1.I0010I0i(false);
/* 36 */                    oo0io0 = oo0io02;
                        } else {
                            function13 = null;
/* 38 */                    iloI0lOlll1.I00i01iIIliI(145707228);
/* 39 */                    iloI0lOlll1.I0010I0i(false);
                            oo0io0 = null;
                        }
/* 40 */                if (lOioiI.I00000oIO(i1111OO10i)) {
                            iloI0lOlll1.I00i01iIIliI(145905443);
/* 41 */                    boolean zI000II = ((i6 & 112) == 32) | iloI0lOlll1.I000II(oo0io0);
/* 42 */                    ?? I00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                            I01ii1IIl i01ii1IIl2 = I00O0i0ii2;
                            if (zI000II || I00O0i0ii2 == iOO0o0I1l) {
/* 43 */                        I01ii1IIl i01ii1IIl3 = new I01ii1IIl(16);
                                i01ii1IIl3.I00iiI = oo0io0;
                                i01ii1IIl3.I00iiO = i1111OO10i;
                                VarHandle.storeStoreFence();
/* 44 */                        iloI0lOlll1.I00iio(i01ii1IIl3);
                                i01ii1IIl2 = i01ii1IIl3;
                            }
/* 45 */                    i01ii1IIl = i01ii1IIl2;
/* 46 */                    iloI0lOlll1.I0010I0i(false);
                        } else {
/* 47 */                    iloI0lOlll1.I00i01iIIliI(146002721);
                            boolean z6 = (i6 & 112) == 32;
/* 48 */                    Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                            Object obj5 = objI00O0i0ii;
                            if (z6 || objI00O0i0ii == iOO0o0I1l) {
/* 49 */                        I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(9);
                                i0OIOO00l0O.I00iiI = i1111OO10i;
                                VarHandle.storeStoreFence();
/* 50 */                        iloI0lOlll1.I00iio(i0OIOO00l0O);
                                obj5 = i0OIOO00l0O;
                            }
/* 51 */                    i01ii1IIl = (IllOOo00lI) obj5;
/* 52 */                    iloI0lOlll1.I0010I0i(false);
                        }
                        IllOOo00lI illOOo00lI3 = i01ii1IIl;
                        if (!z) {
                            illOOo00lI = illOOo00lI3;
                            i0Il0IoIIOll = function13;
/* 74 */                    oIoi0IIoi = new OIoi0IIoi(i0Il0IoIIOll, i0Il0IoIIOll);
                        } else if (map != null) {
/* 53 */                    OIoi0IIoi oIoi0IIoi2 = I111iI.I00000oIO;
/* 54 */                    if (map.isEmpty()) {
                                illOOo00lI = illOOo00lI3;
/* 73 */                        oIoi0IIoi = I111iI.I00000oIO;
                            } else {
/* 56 */                        List listI00000oOI = i1111OO10i.I00000oOI(i1111OO10i.I00iiI.length(), "androidx.compose.foundation.text.inlineContent");
/* 57 */                        ArrayList arrayList4 = new ArrayList();
/* 58 */                        ArrayList arrayList5 = new ArrayList();
/* 59 */                        int size3 = listI00000oOI.size();
                                int i21 = 0;
                                while (i21 < size3) {
/* 61 */                            I11110l0o i11110l0o2 = (I11110l0o) listI00000oOI.get(i21);
/* 62 */                            Object obj6 = i11110l0o2.I00000oIO;
                                    int i22 = i11110l0o2.I0000Il00O;
                                    int i23 = i11110l0o2.I00000oOI;
/* 63 */                            IollOOl0o0 iollOOl0o0 = (IollOOl0o0) map.get(obj6);
                                    List list2 = listI00000oOI;
                                    if (iollOOl0o0 != null) {
                                        illOOo00lI2 = illOOo00lI3;
/* 67 */                                arrayList4.add(new I11110l0o(iollOOl0o0.I00000oIO, i23, i22));
/* 71 */                                arrayList5.add(new I11110l0o(iollOOl0o0.I00000oOI, i23, i22));
                                    } else {
                                        illOOo00lI2 = illOOo00lI3;
                                    }
                                    i21++;
                                    listI00000oOI = list2;
                                    illOOo00lI3 = illOOo00lI2;
                                }
                                illOOo00lI = illOOo00lI3;
/* 72 */                        oIoi0IIoi = new OIoi0IIoi(arrayList4, arrayList5);
                            }
                            i0Il0IoIIOll = function13;
                        }
/* 76 */                List list3 = (List) oIoi0IIoi.I00iOIl;
/* 78 */                List list4 = (List) oIoi0IIoi.I00iiI;
                        if (z) {
/* 79 */                    iloI0lOlll1.I00i01iIIliI(146318828);
/* 80 */                    Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                            Object obj7 = objI00O0i0ii2;
                            if (objI00O0i0ii2 == iOO0o0I1l) {
/* 81 */                        OIooliIO0 oIooliIO0I00000oIO = lOO00IiI0li.I00000oIO(i0Il0IoIIOll);
/* 82 */                        iloI0lOlll1.I00iio(oIooliIO0I00000oIO);
                                obj7 = oIooliIO0I00000oIO;
                            }
/* 84 */                    iloI0lOlll1.I0010I0i(false);
/* 83 */                    r9 = (OI10i0Il) obj7;
                        } else {
/* 85 */                    iloI0lOlll1.I00i01iIIliI(146406588);
/* 86 */                    iloI0lOlll1.I0010I0i(false);
                            r9 = i0Il0IoIIOll;
                        }
                        if (z) {
/* 87 */                    iloI0lOlll1.I00i01iIIliI(146499837);
/* 88 */                    boolean zI000II2 = iloI0lOlll1.I000II(r9);
/* 89 */                    ?? I00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                            I0Il0IoIIOll i0Il0IoIIOll2 = I00O0i0ii3;
                            if (zI000II2 || I00O0i0ii3 == iOO0o0I1l) {
/* 90 */                        I0Il0IoIIOll i0Il0IoIIOll3 = new I0Il0IoIIOll(19);
                                i0Il0IoIIOll3.I00iiI = r9;
                                VarHandle.storeStoreFence();
/* 91 */                        iloI0lOlll1.I00iio(i0Il0IoIIOll3);
                                i0Il0IoIIOll2 = i0Il0IoIIOll3;
                            }
/* 92 */                    i0Il0IoIIOll = i0Il0IoIIOll2;
/* 93 */                    iloI0lOlll1.I0010I0i(false);
                        } else {
/* 94 */                    iloI0lOlll1.I00i01iIIliI(146571260);
/* 95 */                    iloI0lOlll1.I0010I0i(false);
                        }
                        Function1 function14 = i0Il0IoIIOll;
                        int i24 = (i6 >> 3) & 14;
/* 96 */                I1oll0O1OO0.I00000oIO(i1111OO10i, oo0lloOiiIOI, iliO0o11i01, list3, z2, iloI0lOlll1);
/* 97 */                I1111OO10i i1111OO10i3 = (I1111OO10i) illOOo00lI.invoke();
/* 98 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(oo0io0) | ((i6 & 896) == 256);
/* 99 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        if (zI000OOo1O || objI00O0i0ii3 == iOO0o0I1l) {
/* 100 */                   I1ol01OO i1ol01OO = new I1ol01OO(0);
                            i1ol01OO.I00iiI = oo0io0;
                            i1ol01OO.I00iiO = function1;
                            VarHandle.storeStoreFence();
/* 101 */                   iloI0lOlll1.I00iio(i1ol01OO);
                            obj = i1ol01OO;
                        } else {
                            obj = objI00O0i0ii3;
                        }
/* 102 */               Function1 function15 = (Function1) obj;
                        i9 = i2;
                        Oo0io0 oo0io04 = oo0io0;
                        ?? r15 = iloI0lOlll1;
                        OI10i0Il oI10i0Il = r9;
                        o1ooiI111i2 = o1ooiI111i;
                        oo0lloOiiIOI2 = oo0lloOiiIOI;
                        z4 = z2;
                        i10 = i3;
                        oiiiOo1IOlI2 = oiiiOo1IOlI;
                        iOOioI10Il12 = iOOioI10Il1;
                        i8 = i;
/* 103 */               O1ooiI111i o1ooiI111iI000II = I000II(o1ooiI111i2, i1111OO10i3, oo0lloOiiIOI2, function15, i8, z4, i9, i10, iliO0o11i01, list3, function14, oiiiOo1IOlI2, iOOioI10Il12, function12, i1ili1lI0O);
                        iliO0o11i012 = iliO0o11i01;
                        if (z) {
                            Oo0io0 oo0io05 = oo0io04;
/* 114 */                   r15.I00i01iIIliI(147956465);
/* 115 */                   boolean zI000OOo1O2 = r15.I000OOo1O(oo0io05);
/* 116 */                   Object objI00O0i0ii4 = r15.I00O0i0ii();
                            if (zI000OOo1O2 || objI00O0i0ii4 == iOO0o0I1l) {
/* 117 */                       I1ol0Ioo1i i1ol0Ioo1i = new I1ol0Ioo1i(1);
                                i1ol0Ioo1i.I00iiI = oo0io05;
                                VarHandle.storeStoreFence();
/* 118 */                       r15.I00iio(i1ol0Ioo1i);
                                obj2 = i1ol0Ioo1i;
                            } else {
                                obj2 = objI00O0i0ii4;
                            }
/* 119 */                   IllOOo00lI illOOo00lI4 = (IllOOo00lI) obj2;
/* 120 */                   boolean zI000II3 = r15.I000II(oI10i0Il);
/* 121 */                   Object objI00O0i0ii5 = r15.I00O0i0ii();
                            if (zI000II3 || objI00O0i0ii5 == iOO0o0I1l) {
/* 122 */                       I1ol0OoiOI1o i1ol0OoiOI1o = new I1ol0OoiOI1o(0);
                                i1ol0OoiOI1o.I00iiI = oI10i0Il;
                                VarHandle.storeStoreFence();
/* 123 */                       r15.I00iio(i1ol0OoiOI1o);
                                obj3 = i1ol0OoiOI1o;
                            } else {
                                obj3 = objI00O0i0ii5;
                            }
/* 126 */                   I0ollO i0ollO2 = new I0ollO(1);
/* 127 */                   i0ollO2.I00000oOI = illOOo00lI4;
/* 128 */                   i0ollO2.I0000Il00O = (IllOOo00lI) obj3;
/* 129 */                   VarHandle.storeStoreFence();
/* 130 */                   r15.I0010I0i(false);
                            i0ollO = i0ollO2;
                            r92 = oo0io05;
                        } else {
/* 104 */                   r15.I00i01iIIliI(147779703);
                            Oo0io0 oo0io06 = oo0io04;
/* 105 */                   boolean zI000OOo1O3 = r15.I000OOo1O(oo0io06);
/* 106 */                   Object objI00O0i0ii6 = r15.I00O0i0ii();
                            if (zI000OOo1O3 || objI00O0i0ii6 == iOO0o0I1l) {
                                r10 = 0;
/* 107 */                       I1ol0Ioo1i i1ol0Ioo1i2 = new I1ol0Ioo1i(false ? 1 : 0);
                                i1ol0Ioo1i2.I00iiI = oo0io06;
                                VarHandle.storeStoreFence();
/* 108 */                       r15.I00iio(i1ol0Ioo1i2);
                                obj4 = i1ol0Ioo1i2;
                            } else {
                                r10 = 0;
                                obj4 = objI00O0i0ii6;
                            }
/* 111 */                   ?? o100loO1 = new O100loO1(r10);
/* 109 */                   o100loO1.I00000oOI = (IllOOo00lI) obj4;
/* 112 */                   VarHandle.storeStoreFence();
/* 113 */                   r15.I0010I0i(r10);
                            i0ollO = o100loO1;
                            r92 = oo0io06;
                        }
/* 132 */               int iHashCode = Long.hashCode(r15.I00OI1);
/* 133 */               OO0lO0l0 oO0lO0l0I000lI = r15.I000lI();
/* 134 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(r15, o1ooiI111iI000II);
/* 135 */               IOl0oi0lOl1.I000lI.getClass();
/* 136 */               r15.I00i0oil();
/* 137 */               if (r15.I00O10llo) {
/* 138 */                   r15.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 139 */                   r15.I00io1l();
                        }
/* 141 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, r15, i0ollO);
/* 143 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, r15, oO0lO0l0I000lI);
/* 146 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, r15, Integer.valueOf(iHashCode));
/* 147 */               li01Ooiio01.I00000oOI(r15);
/* 149 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, r15, o1ooiI111iI0000Il00O);
                        if (r92 == 0) {
/* 150 */                   r15.I00i01iIIliI(-433557001);
                            z3 = false;
                        } else {
                            z3 = false;
/* 152 */                   r15.I00i01iIIliI(-291080374);
                            r92.I00000oIO(0, r15);
                        }
/* 151 */               r15.I0010I0i(z3);
                        if (list4 == null) {
/* 153 */                   r15.I00i01iIIliI(-433506223);
/* 154 */                   r15.I0010I0i(z3);
                            i1111OO10i2 = i1111OO10i;
                        } else {
/* 155 */                   r15.I00i01iIIliI(-433506222);
                            i1111OO10i2 = i1111OO10i;
                            I111iI.I00000oIO(i1111OO10i2, list4, r15, i24);
/* 156 */                   r15.I0010I0i(z3);
                        }
/* 157 */               r15.I0010I0i(true);
                        iloI0lOlll12 = r15;
                    } else {
                        o1ooiI111i2 = o1ooiI111i;
                        oo0lloOiiIOI2 = oo0lloOiiIOI;
                        iliO0o11i012 = iliO0o11i01;
                        i1111OO10i2 = i1111OO10i;
                        IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
                        i8 = i;
                        i9 = i2;
                        i10 = i3;
                        oiiiOo1IOlI2 = oiiiOo1IOlI;
                        iOOioI10Il12 = iOOioI10Il1;
/* 158 */               iloI0lOlll13.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 159 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        I1ol0oOOl0o1 i1ol0oOOl0o1 = new I1ol0oOOl0o1();
                        i1ol0oOOl0o1.I00iOIl = o1ooiI111i2;
                        i1ol0oOOl0o1.I00iiI = i1111OO10i2;
                        i1ol0oOOl0o1.I00iiO = function1;
                        i1ol0oOOl0o1.I00iio = z;
                        i1ol0oOOl0o1.I00ilI0I1 = map;
                        i1ol0oOOl0o1.I00ilO0 = oo0lloOiiIOI2;
                        i1ol0oOOl0o1.I00io1l = i8;
                        i1ol0oOOl0o1.I00ioIO = z4;
                        i1ol0oOOl0o1.I00l0I0l0lO1 = i9;
                        i1ol0oOOl0o1.I00l0OO0IO = i10;
                        i1ol0oOOl0o1.I00li1OI = iliO0o11i012;
                        i1ol0oOOl0o1.I00ll1 = oiiiOo1IOlI2;
                        i1ol0oOOl0o1.I00lli11 = iOOioI10Il12;
                        i1ol0oOOl0o1.I00lll10 = function12;
                        i1ol0oOOl0o1.I00o0iI0io1 = i1ili1lI0O;
                        i1ol0oOOl0o1.I00o0l1o1o0 = i4;
                        i1ol0oOOl0o1.I00o101lO = i5;
                        VarHandle.storeStoreFence();
/* 160 */               oOloioIlI001IO000.I0000O = i1ol0oOOl0o1;
                    }
                }

                public static final ArrayList I0001Ioi1lo(List list, IllOOo00lI illOOo00lI) {
                    IoOi0looIo ioOi0looIo;
/* 11 */            if (!((Boolean) illOOo00lI.invoke()).booleanValue()) {
/* 192 */               return null;
                    }
/* 19 */            ArrayList arrayList = new ArrayList(list.size());
/* 25 */            int size = list.size();
/* 31 */            for (int i = 0; i < size; i++) {
/* 37 */                O1iIo0ll o1iIo0ll = (O1iIo0ll) list.get(i);
/* 45 */                IIoIil iIoIil = ((Oo0lI1o11ll) o1iIo0ll.I00II0Ol1O0l()).I00000oIO;
/* 49 */                Oo0io0 oo0io0 = (Oo0io0) iIoIil.I00iiI;
/* 53 */                I11110l0o i11110l0o = (I11110l0o) iIoIil.I00iiO;
/* 61 */                Oo0iil0o0oI oo0iil0o0oI = (Oo0iil0o0oI) oo0io0.I00000oIO.getValue();
/* 65 */                if (oo0iil0o0oI == null) {
/* 69 */                    OlOiIoII olOiIoII = new OlOiIoII(8);
/* 74 */                    ioOi0looIo = new IoOi0looIo();
/* 77 */                    ioOi0looIo.I00iOIl = 0;
/* 79 */                    ioOi0looIo.I00iiI = 0;
/* 81 */                    ioOi0looIo.I00iiO = olOiIoII;
/* 83 */                    VarHandle.storeStoreFence();
                        } else {
/* 87 */                    I11110l0o i11110l0oI0000Il00O = Oo0io0.I0000Il00O(i11110l0o, oo0iil0o0oI);
/* 91 */                    if (i11110l0oI0000Il00O == null) {
/* 96 */                        OlOiIoII olOiIoII2 = new OlOiIoII(7);
/* 101 */                       ioOi0looIo = new IoOi0looIo();
/* 104 */                       ioOi0looIo.I00iOIl = 0;
/* 106 */                       ioOi0looIo.I00iiI = 0;
/* 108 */                       ioOi0looIo.I00iiO = olOiIoII2;
/* 110 */                       VarHandle.storeStoreFence();
                            } else {
/* 126 */                       IooO1IOlo iooO1IOloI00000oOI = ioooOioll1.I00000oOI(oo0iil0o0oI.I000OiO(i11110l0oI0000Il00O.I00000oOI, i11110l0oI0000Il00O.I0000Il00O).I0000O());
/* 130 */                       int iI0000O = iooO1IOloI00000oOI.I0000O();
/* 134 */                       int iI00000oOI = iooO1IOloI00000oOI.I00000oOI();
/* 140 */                       OlOi0iollo olOi0iollo = new OlOi0iollo(8);
/* 143 */                       olOi0iollo.I00iiI = iooO1IOloI00000oOI;
/* 145 */                       VarHandle.storeStoreFence();
/* 150 */                       IoOi0looIo ioOi0looIo2 = new IoOi0looIo();
/* 153 */                       ioOi0looIo2.I00iOIl = iI0000O;
/* 155 */                       ioOi0looIo2.I00iiI = iI00000oOI;
/* 157 */                       ioOi0looIo2.I00iiO = olOi0iollo;
/* 159 */                       VarHandle.storeStoreFence();
/* 162 */                       ioOi0looIo = ioOi0looIo2;
                            }
                        }
/* 163 */               int i2 = ioOi0looIo.I00iOIl;
/* 165 */               int i3 = ioOi0looIo.I00iiI;
/* 184 */               arrayList.add(new OIoi0IIoi(o1iIo0ll.I001lllioOl(iio0lo1i.I00000oOI(i2, i2, i3, i3)), (IllOOo00lI) ioOi0looIo.I00iiO));
                    }
/* 191 */           return arrayList;
                }

                public static final O1ooiI111i I000II(O1ooiI111i o1ooiI111i, I1111OO10i i1111OO10i, Oo0lloOiiIOI oo0lloOiiIOI, Function1 function1, int i, boolean z, int i2, int i3, IliO0o11i01 iliO0o11i01, List list, Function1 function12, OiiiOo1IOlI oiiiOo1IOlI, IOOioI10Il1 iOOioI10Il1, Function1 function13, I1ili1lI0O i1ili1lI0O) {
/* 1 */             if (oiiiOo1IOlI == null) {
/* 5 */                 OloOl0l oloOl0l = new OloOl0l();
/* 8 */                 oloOl0l.I00000oIO = i1111OO10i;
/* 10 */                oloOl0l.I00000oOI = oo0lloOiiIOI;
/* 12 */                oloOl0l.I0000Il00O = iliO0o11i01;
/* 14 */                oloOl0l.I0000O = function1;
/* 16 */                oloOl0l.I0000oI00 = i;
/* 18 */                oloOl0l.I0001Ioi1lo = z;
/* 20 */                oloOl0l.I000II = i2;
/* 22 */                oloOl0l.I000O01llI0 = i3;
/* 24 */                oloOl0l.I000OOo1O = list;
/* 26 */                oloOl0l.I000OiO = function12;
/* 28 */                oloOl0l.I000iOII = iOOioI10Il1;
/* 30 */                oloOl0l.I000l1 = i1ili1lI0O;
/* 32 */                oloOl0l.I000lI = function13;
/* 34 */                VarHandle.storeStoreFence();
/* 43 */                return o1ooiI111i.I0000O(O1ooIo101ll.I00000oIO).I0000O(oloOl0l);
                    }
/* 50 */            OiiOIl oiiOIl = new OiiOIl();
/* 53 */            oiiOIl.I00000oIO = i1111OO10i;
/* 55 */            oiiOIl.I00000oOI = oo0lloOiiIOI;
/* 57 */            oiiOIl.I0000Il00O = iliO0o11i01;
/* 59 */            oiiOIl.I0000O = function1;
/* 61 */            oiiOIl.I0000oI00 = i;
/* 63 */            oiiOIl.I0001Ioi1lo = z;
/* 65 */            oiiOIl.I000II = i2;
/* 67 */            oiiOIl.I000O01llI0 = i3;
/* 69 */            oiiOIl.I000OOo1O = list;
/* 71 */            oiiOIl.I000OiO = function12;
/* 73 */            oiiOIl.I000iOII = oiiiOo1IOlI;
/* 75 */            oiiOIl.I000l1 = iOOioI10Il1;
/* 77 */            oiiOIl.I000lI = i1ili1lI0O;
/* 79 */            VarHandle.storeStoreFence();
/* 88 */            return o1ooiI111i.I0000O(oiiiOo1IOlI.I000II).I0000O(oiiOIl);
                }
            }
