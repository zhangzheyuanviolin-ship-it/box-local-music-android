            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class ilOoiO0Ii1 {
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, I1IiiOO0i0io i1IiiOO0i0io, I1IioI1l10 i1IioI1l10, II0O000iIl iI0O000iIl, int i, int i2, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i3, int i4) {
/* 10 */            iloI0lOlll1.I00i0O(-1303174015);
/* 13 */            int i5 = i3 | 6;
/* 17 */            if ((i3 & 48) == 0) {
/* 30 */                i5 |= iloI0lOlll1.I000II(i1IiiOO0i0io) ? 32 : 16;
                    }
/* 31 */            int i6 = i4 & 4;
/* 33 */            if (i6 != 0) {
/* 35 */                i5 |= 384;
                    } else if ((i3 & 384) == 0) {
/* 53 */                i5 |= iloI0lOlll1.I000II(i1IioI1l10) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 57 */            int i7 = i5 | 224256;
/* 76 */            if (iloI0lOlll1.I00OIl(i7 & 1, (599187 & i7) != 599186)) {
/* 78 */                if (i6 != 0) {
/* 80 */                    i1IioI1l10 = I1IiooiI1IlO.I0000Il00O;
                        }
/* 82 */                I1IioI1l10 i1IioI1l102 = i1IioI1l10;
/* 83 */                iI0O000iIl = i1O01oOIoI0I.I00ll1;
/* 85 */                IlOolO0Oi ilOolO0Oi = IlOolO0Oi.I00000oOI;
/* 99 */                int i8 = (i7 & 112) | 1572870 | (i7 & 896) | 12807168;
/* 101 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 105 */               I00000oOI(o1ooIo101ll, i1IiiOO0i0io, i1IioI1l102, ilOolO0Oi, iOii1l, iloI0lOlll1, i8);
/* 108 */               i = Integer.MAX_VALUE;
/* 111 */               i2 = Integer.MAX_VALUE;
/* 112 */               o1ooiI111i = o1ooIo101ll;
/* 113 */               i1IioI1l10 = i1IioI1l102;
                    } else {
/* 115 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 118 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 122 */           if (oOloioIlI001IO000 != null) {
/* 126 */               IlOoOii ilOoOii = new IlOoOii();
/* 129 */               ilOoOii.I00iOIl = o1ooiI111i;
/* 131 */               ilOoOii.I00iiI = i1IiiOO0i0io;
/* 133 */               ilOoOii.I00iiO = i1IioI1l10;
/* 135 */               ilOoOii.I00iio = iI0O000iIl;
/* 137 */               ilOoOii.I00ilI0I1 = i;
/* 139 */               ilOoOii.I00ilO0 = i2;
/* 141 */               ilOoOii.I00io1l = iOii1l;
/* 143 */               ilOoOii.I00ioIO = i3;
/* 145 */               ilOoOii.I00l0I0l0lO1 = i4;
/* 147 */               VarHandle.storeStoreFence();
/* 150 */               oOloioIlI001IO000.I0000O = ilOoOii;
                    }
                }

                public static final void I00000oOI(O1ooiI111i o1ooiI111i, I1IiiOO0i0io i1IiiOO0i0io, I1IioI1l10 i1IioI1l10, IlOolO0Oi ilOolO0Oi, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 15 */            II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00ll1;
/* 20 */            iloI0lOlll1.I00i0O(-1956591841);
/* 26 */            if ((i & 6) == 0) {
/* 37 */                i2 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 39 */                i2 = i;
                    }
/* 44 */            if ((i & 48) == 0) {
/* 56 */                i2 |= iloI0lOlll1.I000II(i1IiiOO0i0io) ? 32 : 16;
                    }
/* 59 */            if ((i & 384) == 0) {
/* 72 */                i2 |= iloI0lOlll1.I000II(i1IioI1l10) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 75 */            if ((i & 3072) == 0) {
/* 88 */                i2 |= iloI0lOlll1.I000II(iI0O000iIl) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 94 */            if ((i & 24576) == 0) {
/* 107 */               i2 |= iloI0lOlll1.I0000oI00(Integer.MAX_VALUE) ? 16384 : 8192;
                    }
/* 111 */           if ((196608 & i) == 0) {
/* 124 */               i2 |= iloI0lOlll1.I0000oI00(Integer.MAX_VALUE) ? 131072 : 65536;
                    }
/* 130 */           if ((1572864 & i) == 0) {
/* 142 */               i2 |= iloI0lOlll1.I000II(ilOolO0Oi) ? 1048576 : 524288;
                    }
/* 146 */           if ((12582912 & i) == 0) {
/* 159 */               i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 8388608 : 4194304;
                    }
/* 181 */           if (iloI0lOlll1.I00OIl(i2 & 1, (4793491 & i2) != 4793490)) {
/* 185 */               int i3 = 3670016 & i2;
/* 190 */               boolean z = i3 == 1048576;
/* 192 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 196 */               Object obj = IOl11li.I00000oIO;
                        Object obj2 = objI00O0i0ii;
/* 198 */               if (z || objI00O0i0ii == obj) {
/* 204 */                   IlOoi0i0 ilOoi0i0 = ilOolO0Oi.I00000oIO;
/* 206 */                   IlOoi1ilio00 ilOoi1ilio00 = new IlOoi1ilio00();
/* 209 */                   ilOoi1ilio00.I00000oIO = ilOoi0i0;
/* 211 */                   VarHandle.storeStoreFence();
/* 214 */                   iloI0lOlll1.I00iio(ilOoi1ilio00);
                            obj2 = ilOoi1ilio00;
                        }
/* 217 */               IlOoi1ilio00 ilOoi1ilio002 = (IlOoi1ilio00) obj2;
/* 219 */               int i4 = i2 >> 3;
/* 343 */               boolean zI000II = ((((i4 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(i1IiiOO0i0io)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && iloI0lOlll1.I000II(i1IioI1l10)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && iloI0lOlll1.I000II(iI0O000iIl)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) > 2048 && iloI0lOlll1.I0000oI00(Integer.MAX_VALUE)) || (i4 & 3072) == 2048) | ((((57344 & i4) ^ 24576) > 16384 && iloI0lOlll1.I0000oI00(Integer.MAX_VALUE)) || (i4 & 24576) == 16384) | iloI0lOlll1.I000II(ilOoi1ilio002);
/* 344 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 348 */               if (zI000II || objI00O0i0ii2 == obj) {
/* 352 */                   float fI00000oIO = i1IiiOO0i0io.I00000oIO();
/* 358 */                   Ii0OOlliol0i ii0OOlliol0i = new Ii0OOlliol0i();
/* 361 */                   ii0OOlliol0i.I00000oIO = iI0O000iIl;
/* 363 */                   VarHandle.storeStoreFence();
/* 366 */                   float fI00000oIO2 = i1IioI1l10.I00000oIO();
/* 372 */                   IlOoil ilOoil = new IlOoil();
/* 375 */                   ilOoil.I00000oIO = i1IiiOO0i0io;
/* 377 */                   ilOoil.I00000oOI = i1IioI1l10;
/* 379 */                   ilOoil.I0000Il00O = fI00000oIO;
/* 381 */                   ilOoil.I0000O = ii0OOlliol0i;
/* 383 */                   ilOoil.I0000oI00 = fI00000oIO2;
/* 385 */                   ilOoil.I0001Ioi1lo = ilOoi1ilio002;
/* 387 */                   VarHandle.storeStoreFence();
/* 390 */                   iloI0lOlll1.I00iio(ilOoil);
/* 393 */                   objI00O0i0ii2 = ilOoil;
                        }
/* 394 */               IlOoil ilOoil2 = (IlOoil) objI00O0i0ii2;
/* 427 */               boolean z2 = (i3 == 1048576) | ((29360128 & i2) == 8388608) | ((i2 & 458752) == 131072);
/* 428 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii3;
/* 432 */               if (z2 || objI00O0i0ii3 == obj) {
/* 438 */                   ArrayList arrayList = new ArrayList();
/* 444 */                   IoOo1I0o1 ioOo1I0o1 = new IoOo1I0o1(3);
/* 447 */                   ioOo1I0o1.I00iiI = iOii1l;
/* 449 */                   VarHandle.storeStoreFence();
/* 461 */                   arrayList.add(new IOii1l(-1192950673, ioOo1I0o1, true));
/* 464 */                   ilOolO0Oi.getClass();
/* 469 */                   ilOolO0Oi.I00000oIO.ordinal();
/* 472 */                   iloI0lOlll1.I00iio(arrayList);
                            obj3 = arrayList;
                        }
/* 477 */               IOii1l iOii1lI00000oIO = l0o0Oioio1ol.I00000oIO((List) obj3);
/* 481 */               boolean zI000II2 = iloI0lOlll1.I000II(ilOoil2);
/* 485 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii4;
/* 489 */               if (zI000II2 || objI00O0i0ii4 == obj) {
/* 495 */                   OI0O0o01II10 oI0O0o01II10 = new OI0O0o01II10();
/* 498 */                   oI0O0o01II10.I00000oIO = ilOoil2;
/* 500 */                   VarHandle.storeStoreFence();
/* 503 */                   iloI0lOlll1.I00iio(oI0O0o01II10);
                            obj4 = oI0O0o01II10;
                        }
/* 506 */               O1iOIl0o10 o1iOIl0o10 = (O1iOIl0o10) obj4;
/* 510 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 514 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 518 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111i);
/* 524 */               IOl0oi0lOl1.I000lI.getClass();
/* 527 */               iloI0lOlll1.I00i0oil();
/* 532 */               if (iloI0lOlll1.I00O10llo) {
/* 536 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 540 */                   iloI0lOlll1.I00io1l();
                        }
/* 545 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10);
/* 550 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 559 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 562 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 567 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 574 */               iOii1lI00000oIO.invoke(iloI0lOlll1, 0);
/* 578 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 582 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 585 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 589 */           if (oOloioIlI001IO000 != null) {
/* 594 */               I1olloiiiOi i1olloiiiOi = new I1olloiiiOi(2);
/* 597 */               i1olloiiiOi.I00iiI = o1ooiI111i;
/* 599 */               i1olloiiiOi.I00ilI0I1 = i1IiiOO0i0io;
/* 601 */               i1olloiiiOi.I00ilO0 = i1IioI1l10;
/* 603 */               i1olloiiiOi.I00io1l = ilOolO0Oi;
/* 605 */               i1olloiiiOi.I00iiO = iOii1l;
/* 607 */               i1olloiiiOi.I00iio = i;
/* 609 */               VarHandle.storeStoreFence();
/* 612 */               oOloioIlI001IO000.I0000O = i1olloiiiOi;
                    }
                }
            }
