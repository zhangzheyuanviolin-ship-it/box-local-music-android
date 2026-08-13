            package p000;

            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.ai.edge.gallery.data.RuntimeType;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class il1lO0 {
                public static final void I00000oIO(O1oIOiI11o0 o1oIOiI11o0, OloIl1l1oOii oloIl1l1oOii, O1ol100o0O o1ol100o0O, O1oIo0iI00 o1oIo0iI00, boolean z, Oiool011li oiool011li, I10l11ioI i10l11ioI, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, O1ooiI111i o1ooiI111i, boolean z2, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    OloIl1l1oOii oloIl1l1oOii2;
                    O1ol100o0O o1ol100o0O2;
                    IllOOo00lI illOOo00lI3;
                    int i3;
                    boolean z3;
                    float f;
                    double d;
/* 30 */            iloI0lOlll1.I00i0O(1880788363);
/* 35 */            if ((i & 6) == 0) {
/* 46 */                i2 = (iloI0lOlll1.I000OOo1O(o1oIOiI11o0) ? 4 : 2) | i;
                    } else {
/* 48 */                i2 = i;
                    }
/* 51 */            if ((i & 48) == 0) {
/* 64 */                i2 |= iloI0lOlll1.I000OOo1O(oloIl1l1oOii) ? 32 : 16;
                    }
/* 68 */            if ((i & 384) == 0) {
/* 81 */                i2 |= iloI0lOlll1.I000OOo1O(o1ol100o0O) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 84 */            if ((i & 3072) == 0) {
/* 97 */                i2 |= iloI0lOlll1.I000II(o1oIo0iI00) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 100 */           if ((i & 24576) == 0) {
/* 113 */               i2 |= iloI0lOlll1.I000O01llI0(z) ? 16384 : 8192;
                    }
/* 117 */           if ((196608 & i) == 0) {
/* 130 */               i2 |= iloI0lOlll1.I000II(oiool011li) ? 131072 : 65536;
                    }
/* 134 */           if ((1572864 & i) == 0) {
/* 147 */               i2 |= iloI0lOlll1.I000OOo1O(i10l11ioI) ? 1048576 : 524288;
                    }
/* 151 */           if ((12582912 & i) == 0) {
/* 164 */               i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 8388608 : 4194304;
                    }
/* 168 */           if ((100663296 & i) == 0) {
/* 181 */               i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI2) ? 67108864 : 33554432;
                    }
/* 185 */           if ((805306368 & i) == 0) {
/* 198 */               i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 536870912 : 268435456;
                    }
/* 233 */           if (iloI0lOlll1.I00OIl(i2 & 1, ((i2 & 306783379) == 306783378 && ((iloI0lOlll1.I000O01llI0(z2) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
/* 247 */               boolean z4 = (o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.SUCCEEDED;
/* 250 */               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooiI111i, 1.0f);
/* 260 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oOI, i1O01oOIoI0I.I00lli11, iloI0lOlll1, 54);
/* 266 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 270 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 274 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000oI00);
/* 280 */               IOl0oi0lOl1.I000lI.getClass();
/* 283 */               iloI0lOlll1.I00i0oil();
/* 288 */               if (iloI0lOlll1.I00O10llo) {
/* 292 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 296 */                   iloI0lOlll1.I00io1l();
                        }
/* 301 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 306 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 315 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 318 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 323 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 328 */               if (z2 && z4) {
/* 335 */                   iloI0lOlll1.I00i01iIIliI(1804514383);
/* 340 */                   O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 342 */                   O1ooiI111i o1ooiI111iI000II = Ol0iOOO0.I000II(o1ooIo101ll, 42.0f);
/* 346 */                   if (z) {
/* 350 */                       f = Float.MAX_VALUE;
/* 353 */                       d = 0.0d;
/* 358 */                       if (1.0f <= 0.0d) {
/* 361 */                           IoliiIlI0O.I00000oIO("invalid weight; must be greater than zero");
                                }
/* 380 */                       o1ooiI111iI000II = o1ooiI111iI000II.I0000O(new O0io1O(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                            } else {
/* 385 */                       f = Float.MAX_VALUE;
/* 388 */                       d = 0.0d;
                            }
/* 400 */                   O1ooiI111i o1ooiI111iI0000O = Oiool011li.I0000oI00(oiool011li, Oiool011li.I0000O("benchmark_button", iloI0lOlll1), i10l11ioI).I0000O(o1ooiI111iI000II);
/* 404 */                   OIo1i1 oIo1i1 = IIIi0o0.I00000oIO;
/* 426 */                   IIIi0O0I1Oo iIIi0O0I1OoI00000oIO = IIIi0o0.I00000oIO(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I000O01llI0, 0L, iloI0lOlll1, 14);
/* 433 */                   OIo1i1 oIo1i1I00000oIO = iO01II.I00000oIO(2, 12.0f);
/* 440 */                   I1IO0lO1iI i1IO0lO1iI = new I1IO0lO1iI(1);
/* 443 */                   i1IO0lO1iI.I00iiI = z;
/* 445 */                   VarHandle.storeStoreFence();
/* 481 */                   iOiO0o0oi.I00000oIO(illOOo00lI2, o1ooiI111iI0000O, false, null, iIIi0O0I1OoI00000oIO, null, null, oIo1i1I00000oIO, iiioOl1O.I00000oOI(1187705402, i1IO0lO1iI, iloI0lOlll1), iloI0lOlll1, ((i2 >> 24) & 14) | 817889280, 364);
/* 490 */                   lOO1OIO00.I00000oIO(iloI0lOlll1, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 8.0f));
/* 493 */                   z3 = false;
/* 494 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 498 */                   z3 = false;
/* 499 */                   f = Float.MAX_VALUE;
/* 502 */                   d = 0.0d;
/* 507 */                   iloI0lOlll1.I00i01iIIliI(1805963571);
/* 510 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 525 */               boolean z5 = (o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.FAILED ? true : z3;
/* 534 */               boolean z6 = o1oIOiI11o0.I00100l0 == RuntimeType.LITERT_LM ? true : z3;
/* 535 */               if (!z5 || z6) {
/* 539 */                   z3 = true;
                        }
                        boolean z7 = !z;
/* 548 */               O1ooiI111i o1ooiI111iI0000oI002 = Oiool011li.I0000oI00(oiool011li, Oiool011li.I0000O("download_button", iloI0lOlll1), i10l11ioI);
/* 557 */               if (1.0f <= d) {
/* 560 */                   IoliiIlI0O.I00000oIO("invalid weight; must be greater than zero");
                        }
/* 612 */               oloIl1l1oOii2 = oloIl1l1oOii;
/* 614 */               o1ol100o0O2 = o1ol100o0O;
/* 616 */               illOOo00lI3 = illOOo00lI;
/* 618 */               i3 = 1;
/* 620 */               Iil0O0iOiIil.I00000oIO(oloIl1l1oOii2, o1oIOiI11o0, z3, o1oIo0iI00, o1ol100o0O2, illOOo00lI3, o1ooiI111iI0000oI002, null, new O0io1O(1.0f > f ? f : 1.0f, true), z7, false, iloI0lOlll1, ((i2 >> 3) & 14) | ((i2 << 3) & 112) | (i2 & 7168) | ((i2 << 6) & 57344) | (458752 & (i2 >> 6)), 0, 1152);
/* 623 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 627 */               oloIl1l1oOii2 = oloIl1l1oOii;
/* 629 */               o1ol100o0O2 = o1ol100o0O;
/* 631 */               illOOo00lI3 = illOOo00lI;
/* 632 */               i3 = 1;
/* 633 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 636 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 640 */           if (oOloioIlI001IO000 != null) {
/* 644 */               IOoo1o1I iOoo1o1I = new IOoo1o1I(i3);
/* 647 */               iOoo1o1I.I00ilI0I1 = o1oIOiI11o0;
/* 649 */               iOoo1o1I.I00ilO0 = oloIl1l1oOii2;
/* 651 */               iOoo1o1I.I00io1l = o1ol100o0O2;
/* 653 */               iOoo1o1I.I00ioIO = o1oIo0iI00;
/* 657 */               iOoo1o1I.I00iiI = z;
/* 661 */               iOoo1o1I.I00l0I0l0lO1 = oiool011li;
/* 665 */               iOoo1o1I.I00l0OO0IO = i10l11ioI;
/* 667 */               iOoo1o1I.I00li1OI = illOOo00lI3;
/* 671 */               iOoo1o1I.I00ll1 = illOOo00lI2;
/* 675 */               iOoo1o1I.I00lli11 = o1ooiI111i;
/* 679 */               iOoo1o1I.I00iiO = z2;
/* 683 */               iOoo1o1I.I00iio = i;
/* 685 */               VarHandle.storeStoreFence();
/* 688 */               oOloioIlI001IO000.I0000O = iOoo1o1I;
                    }
                }
            }
