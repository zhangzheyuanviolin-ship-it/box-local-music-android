            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l0oIlolO {
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, O0l101IIlOI0 o0l101IIlOI0, Io10li00 io10li00, OIo1Oi1l1lI oIo1Oi1l1lI, IlOIll0o11Ii ilOIll0o11Ii, boolean z, I0o1iIoolIi i0o1iIoolIi, I1IioI1l10 i1IioI1l10, I1IiiOO0i0io i1IiiOO0i0io, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    int i4;
                    int i5;
                    O0l101IIlOI0 o0l101IIlOI02;
                    boolean z2;
                    IlOIll0o11Ii ilOIll0o11Ii2;
                    int i6;
                    int i7;
                    O1ooiI111i o1ooiI111iI00000oIO;
/* 28 */            iloI0lOlll1.I00i0O(708740370);
/* 33 */            if ((i & 6) == 0) {
/* 44 */                i3 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 46 */                i3 = i;
                    }
/* 51 */            if ((i & 48) == 0) {
/* 64 */                i3 |= iloI0lOlll1.I000II(o0l101IIlOI0) ? 32 : 16;
                    }
/* 67 */            if ((i & 384) == 0) {
/* 89 */                i3 |= (i & Barcode.FORMAT_UPC_A) == 0 ? iloI0lOlll1.I000II(io10li00) : iloI0lOlll1.I000OOo1O(io10li00) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 92 */            if ((i & 3072) == 0) {
/* 105 */               i3 |= iloI0lOlll1.I000II(oIo1Oi1l1lI) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 109 */           if ((i & 24576) == 0) {
/* 122 */               i3 |= iloI0lOlll1.I000O01llI0(false) ? 16384 : 8192;
                    }
/* 130 */           if ((i & 196608) == 0) {
/* 143 */               i3 |= iloI0lOlll1.I000O01llI0(true) ? 131072 : 65536;
                    }
/* 149 */           if ((i & 1572864) == 0) {
/* 162 */               i3 |= iloI0lOlll1.I000II(ilOIll0o11Ii) ? 1048576 : 524288;
                    }
/* 168 */           if ((i & 12582912) == 0) {
/* 181 */               i3 |= iloI0lOlll1.I000O01llI0(z) ? 8388608 : 4194304;
                    }
/* 187 */           if ((i & 100663296) == 0) {
/* 200 */               i3 |= iloI0lOlll1.I000II(i0o1iIoolIi) ? 67108864 : 33554432;
                    }
/* 206 */           if ((i & 805306368) == 0) {
/* 219 */               i3 |= iloI0lOlll1.I000II(i1IioI1l10) ? 536870912 : 268435456;
                    }
/* 223 */           if ((i2 & 6) == 0) {
/* 236 */               i4 = i2 | (iloI0lOlll1.I000II(i1IiiOO0i0io) ? 4 : 2);
                    } else {
/* 239 */               i4 = i2;
                    }
/* 243 */           if ((i2 & 48) == 0) {
/* 253 */               i4 |= iloI0lOlll1.I000OOo1O(function1) ? 32 : 16;
                    }
/* 281 */           if (iloI0lOlll1.I00OIl(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
/* 283 */               iloI0lOlll1.I00Ol00();
/* 288 */               if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 297 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 300 */               iloI0lOlll1.I0010o();
/* 303 */               int i8 = i3 >> 3;
/* 305 */               int i9 = i8 & 14;
/* 309 */               int i10 = i9 | (i4 & 112);
/* 313 */               OI10i0Il oI10i0IlI00000oOI = lOO00IiI0li.I00000oOI(function1, iloI0lOlll1);
/* 319 */               int i11 = i3;
/* 338 */               boolean z3 = (((i10 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(o0l101IIlOI0)) || (i10 & 6) == 4;
/* 339 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 343 */               boolean z4 = z3;
/* 345 */               Object obj = IOl11li.I00000oIO;
/* 347 */               if (z4 || objI00O0i0ii == obj) {
/* 355 */                   IOO0o0I1l iOO0o0I1l = IOO0o0I1l.I00ilI0I1;
/* 359 */                   i7 = i8;
/* 363 */                   IloOi11lo iloOi11lo = new IloOi11lo(28);
/* 366 */                   iloOi11lo.I00iiI = oI10i0IlI00000oOI;
/* 368 */                   VarHandle.storeStoreFence();
/* 371 */                   IOO000ilo iOO000ilo = Ol1llolil.I00000oIO;
/* 375 */                   IiO0o1I iiO0o1I = new IiO0o1I(iloOi11lo, iOO0o0I1l);
/* 382 */                   IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(26);
/* 385 */                   iO1Io1IOOOIi.I00iiI = iiO0o1I;
/* 387 */                   iO1Io1IOOOIi.I00iiO = o0l101IIlOI0;
/* 389 */                   VarHandle.storeStoreFence();
/* 411 */                   objI00O0i0ii = new O0l0IOol0(0, 0, OlO01l1oOil.class, new IiO0o1I(iO1Io1IOOOIi, iOO0o0I1l), "value", "getValue()Ljava/lang/Object;");
/* 416 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        } else {
/* 352 */                   i7 = i8;
                        }
/* 420 */               O0Iooi01 o0Iooi01 = (O0Iooi01) objI00O0i0ii;
/* 426 */               int i12 = ((i11 >> 9) & 112) | i9;
/* 471 */               boolean z5 = ((((i12 & 112) ^ 48) > 32 && iloI0lOlll1.I000O01llI0(false)) || (i12 & 48) == 32) | ((((i12 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(o0l101IIlOI0)) || (i12 & 6) == 4);
/* 472 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii2;
/* 476 */               if (z5 || objI00O0i0ii2 == obj) {
/* 482 */                   O0o10oO1lI o0o10oO1lI = new O0o10oO1lI();
/* 485 */                   o0o10oO1lI.I00000oIO = o0l101IIlOI0;
/* 487 */                   VarHandle.storeStoreFence();
/* 490 */                   iloI0lOlll1.I00iio(o0o10oO1lI);
                            obj2 = o0o10oO1lI;
                        }
/* 493 */               O0o10oO1lI o0o10oO1lI2 = (O0o10oO1lI) obj2;
/* 495 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 499 */               if (objI00O0i0ii3 == obj) {
/* 501 */                   objI00O0i0ii3 = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 505 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 508 */               Ii0110 ii0110 = (Ii0110) objI00O0i0ii3;
/* 516 */               Object obj3 = (Io10IIII) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000II);
/* 537 */               liIoOiiO1Oi liiooiio1oi = !((Boolean) iloI0lOlll1.I000iOII(IOlO0o100i1i.I001i1lo1io)).booleanValue() ? OlO1oilO0o0I.I00000oIO : null;
/* 538 */               int i13 = i11 & 112;
/* 559 */               int i14 = (i11 & 524272) | ((i4 << 18) & 3670016) | ((i11 >> 6) & 29360128);
/* 743 */               boolean zI000II = ((((i14 & 112) ^ 48) > 32 && iloI0lOlll1.I000II(o0l101IIlOI0)) || (i14 & 48) == 32) | ((((i14 & 896) ^ 384) > 256 && iloI0lOlll1.I000II(io10li00)) || (i14 & 384) == 256) | ((((i14 & 7168) ^ 3072) > 2048 && iloI0lOlll1.I000II(oIo1Oi1l1lI)) || (i14 & 3072) == 2048) | ((((57344 & i14) ^ 24576) > 16384 && iloI0lOlll1.I000O01llI0(false)) || (i14 & 24576) == 16384) | ((((458752 & i14) ^ 196608) > 131072 && iloI0lOlll1.I000O01llI0(true)) || (i14 & 196608) == 131072) | ((((i14 & 3670016) ^ 1572864) > 1048576 && iloI0lOlll1.I000II(i1IiiOO0i0io)) || (i14 & 1572864) == 1048576) | ((((i14 & 29360128) ^ 12582912) > 8388608 && iloI0lOlll1.I000II(i1IioI1l10)) || (i14 & 12582912) == 8388608) | iloI0lOlll1.I000II(obj3);
/* 744 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii4;
/* 748 */               if (zI000II || objI00O0i0ii4 == obj) {
/* 755 */                   O0l0Oo0oOo o0l0Oo0oOo = new O0l0Oo0oOo(0);
/* 758 */                   o0l0Oo0oOo.I0000oI00 = o0l101IIlOI0;
/* 760 */                   o0l0Oo0oOo.I00000oOI = oIo1Oi1l1lI;
/* 762 */                   o0l0Oo0oOo.I0000Il00O = o0Iooi01;
/* 764 */                   o0l0Oo0oOo.I0001Ioi1lo = io10li00;
/* 766 */                   o0l0Oo0oOo.I000II = i1IioI1l10;
/* 768 */                   o0l0Oo0oOo.I0000O = ii0110;
/* 770 */                   o0l0Oo0oOo.I000O01llI0 = obj3;
/* 772 */                   o0l0Oo0oOo.I000OOo1O = liiooiio1oi;
/* 774 */                   VarHandle.storeStoreFence();
/* 777 */                   iloI0lOlll1.I00iio(o0l0Oo0oOo);
                            obj4 = o0l0Oo0oOo;
                        }
/* 781 */               O0liioil o0liioil = (O0liioil) obj4;
/* 789 */               boolean z6 = i13 == 32;
/* 790 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii5;
/* 794 */               if (z6 || objI00O0i0ii5 == obj) {
/* 802 */                   IlIi0Il ilIi0Il = new IlIi0Il(10);
/* 805 */                   ilIi0Il.I00iiI = o0l101IIlOI0;
/* 807 */                   VarHandle.storeStoreFence();
/* 810 */                   iloI0lOlll1.I00iio(ilIi0Il);
                            obj5 = ilIi0Il;
                        }
/* 819 */               boolean z7 = true;
/* 820 */               OlO1oOlIl01 olO1oOlIl01I00000oIO = l0oloiiool0l.I00000oIO(true, (IllOOo00lI) obj5, iloI0lOlll1, (i11 >> 12) & 126);
/* 824 */               OIilII oIilII = OIilII.I00iOIl;
/* 826 */               if (z) {
/* 831 */                   iloI0lOlll1.I00i01iIIliI(27471107);
/* 837 */                   if (((i9 ^ 6) <= 4 || !iloI0lOlll1.I000II(o0l101IIlOI0)) && (i7 & 6) != 4) {
/* 850 */                       z7 = false;
                            }
/* 851 */                   Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                            Object obj6 = objI00O0i0ii6;
/* 855 */                   if (z7 || objI00O0i0ii6 == obj) {
/* 861 */                       O0l00lI o0l00lI = new O0l00lI();
/* 864 */                       o0l00lI.I00000oIO = o0l101IIlOI0;
/* 866 */                       VarHandle.storeStoreFence();
/* 869 */                       iloI0lOlll1.I00iio(o0l00lI);
                                obj6 = o0l00lI;
                            }
/* 876 */                   o1ooiI111iI00000oIO = iIoIoOi00.I00000oIO((O0l00lI) obj6, o0l101IIlOI0.I000o00OoI0I, oIilII);
/* 881 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 889 */                   iloI0lOlll1.I00i01iIIliI(27767312);
/* 892 */                   iloI0lOlll1.I0010I0i(false);
/* 895 */                   o1ooiI111iI00000oIO = O1ooIo101ll.I00000oIO;
                        }
/* 929 */               i5 = i2;
/* 937 */               i6 = 2;
/* 942 */               O1ooiI111i o1ooiI111iI00000oIO2 = iO0lIo11i11O.I00000oIO(iIoO1101ooO1.I00000oIO(iIoOIl1il.I00000oIO(o1ooiI111i.I0000O(o0l101IIlOI0.I000iOII).I0000O(o0l101IIlOI0.I000l1), o0Iooi01, o0o10oO1lI2, oIilII, z).I0000O(o1ooiI111iI00000oIO), o0l101IIlOI0.I000lI), o0l101IIlOI0, oIilII, i0o1iIoolIi, z, ilOIll0o11Ii, o0l101IIlOI0.I0001Ioi1lo, olO1oOlIl01I00000oIO);
/* 946 */               o0l101IIlOI02 = o0l101IIlOI0;
/* 947 */               ilOIll0o11Ii2 = ilOIll0o11Ii;
/* 957 */               z2 = z;
/* 959 */               l0oolIloOO.I00000oIO(o0Iooi01, o1ooiI111iI00000oIO2, o0l101IIlOI02.I000oI1ioi, o0liioil, iloI0lOlll1, 0);
                    } else {
/* 963 */               i5 = i2;
/* 965 */               o0l101IIlOI02 = o0l101IIlOI0;
/* 966 */               z2 = z;
/* 967 */               ilOIll0o11Ii2 = ilOIll0o11Ii;
/* 968 */               i6 = 2;
/* 969 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 972 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 976 */           if (oOloioIlI001IO000 != null) {
/* 980 */               IOIIIO ioiiio = new IOIIIO(i6);
/* 983 */               ioiiio.I00io1l = o1ooiI111i;
/* 985 */               ioiiio.I00iiO = o0l101IIlOI02;
/* 987 */               ioiiio.I00ilO0 = io10li00;
/* 989 */               ioiiio.I00lli11 = oIo1Oi1l1lI;
/* 991 */               ioiiio.I00ioIO = ilOIll0o11Ii2;
/* 993 */               ioiiio.I00iiI = z2;
/* 997 */               ioiiio.I00l0I0l0lO1 = i0o1iIoolIi;
/* 999 */               ioiiio.I00l0OO0IO = i1IioI1l10;
/* 1001 */              ioiiio.I00ll1 = i1IiiOO0i0io;
/* 1005 */              ioiiio.I00li1OI = function1;
/* 1009 */              ioiiio.I00iio = i;
/* 1011 */              ioiiio.I00ilI0I1 = i5;
/* 1013 */              VarHandle.storeStoreFence();
/* 1016 */              oOloioIlI001IO000.I0000O = ioiiio;
                    }
                }
            }
