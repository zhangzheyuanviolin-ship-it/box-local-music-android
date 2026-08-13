            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class l1loiOIllii {
                /* JADX WARN: Removed duplicated region for block: B:106:0x023f  */
                /* JADX WARN: Removed duplicated region for block: B:109:0x0257  */
                /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(int i, int i2, I0o1iIoolIi i0o1iIoolIi, II0O000iIl iI0O000iIl, IOO0o0I1l iOO0o0I1l, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, O1ooiI111i o1ooiI111i, OII1lIlol oII1lIlol, OIo1Oi1l1lI oIo1Oi1l1lI, OIoIoIO0oI1O oIoIoIO0oI1O, Ol1iIOI ol1iIOI, lo1iloiI1 lo1iloii1, boolean z) {
                    int i3;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    int i4;
                    II0O000iIl iI0O000iIl2;
                    int i5;
                    boolean z2;
                    int i6;
                    int i7;
                    I0o1iIoolIi i0o1iIoolIiI00000oOI;
                    O1ooiI111i o1ooiI111i2;
                    OII1lIlol oII1lIlol2;
                    Ol1iIOI ol1iIOI2;
                    lo1iloiI1 lo1iloii12;
                    boolean z3;
                    OIo1Oi1l1lI oIo1Oi1l1lI3;
                    IOO0o0I1l iOO0o0I1l2;
                    OOloioIl oOloioIlI001IO000;
                    int i8;
                    II0O000iIl iI0O000iIl3;
/* 12 */            iloI0lOlll1.I00i0O(1860873769);
/* 17 */            if ((i & 6) == 0) {
/* 28 */                i3 = (iloI0lOlll1.I000II(oIoIoIO0oI1O) ? 4 : 2) | i;
                    } else {
/* 30 */                i3 = i;
                    }
/* 31 */            int i9 = i2 & 2;
/* 33 */            if (i9 != 0) {
/* 35 */                i3 |= 48;
                    } else if ((i & 48) == 0) {
/* 53 */                i3 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 54 */            int i10 = i2 & 4;
/* 56 */            if (i10 != 0) {
/* 58 */                i3 |= 384;
                    } else {
/* 65 */                if ((i & 384) == 0) {
/* 67 */                    oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 80 */                    i3 |= iloI0lOlll1.I000II(oIo1Oi1l1lI2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 84 */                int i11 = 224256 | i3;
/* 85 */                i4 = i2 & 64;
/* 87 */                if (i4 == 0) {
/* 92 */                    i11 = 1797120 | i3;
                        } else {
/* 99 */                    if ((1572864 & i) == 0) {
/* 101 */                       iI0O000iIl2 = iI0O000iIl;
/* 114 */                       i11 |= iloI0lOlll1.I000II(iI0O000iIl2) ? 1048576 : 524288;
                            }
/* 118 */                   if ((12582912 & i) == 0) {
/* 122 */                       i11 |= 4194304;
                            }
/* 123 */                   i5 = i2 & Barcode.FORMAT_QR_CODE;
/* 127 */                   if (i5 == 0) {
/* 134 */                       if ((100663296 & i) == 0) {
/* 136 */                           z2 = z;
/* 149 */                           i11 |= iloI0lOlll1.I000O01llI0(z2) ? 67108864 : 33554432;
                                }
/* 152 */                       i6 = i11 | 805306368;
/* 175 */                       if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
/* 576 */                           i7 = 1;
/* 577 */                           iloI0lOlll1.I00OilO00Il();
/* 580 */                           i0o1iIoolIiI00000oOI = i0o1iIoolIi;
/* 582 */                           o1ooiI111i2 = o1ooiI111i;
/* 584 */                           oII1lIlol2 = oII1lIlol;
/* 586 */                           ol1iIOI2 = ol1iIOI;
/* 588 */                           lo1iloii12 = lo1iloii1;
/* 590 */                           z3 = z2;
/* 591 */                           oIo1Oi1l1lI3 = oIo1Oi1l1lI2;
/* 592 */                           iOO0o0I1l2 = iOO0o0I1l;
                                } else {
/* 177 */                           iloI0lOlll1.I00Ol00();
/* 185 */                           if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 221 */                               O1ooiI111i o1ooiI111i3 = i9 != 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i;
/* 232 */                               OIo1Oi1l1lI oIo1i1 = i10 != 0 ? new OIo1i1(0.0f, 0.0f, 0.0f, 0.0f) : oIo1Oi1l1lI2;
/* 233 */                               lo1iloiI1 lo1iloii13 = lo1iloiI1.I00io1l;
/* 235 */                               if (i4 != 0) {
/* 237 */                                   iI0O000iIl2 = i1O01oOIoI0I.I00lli11;
                                        }
/* 243 */                               int i12 = (i6 & 14) | 196608;
/* 247 */                               Object oIoIIiI0lIl = new OIoIIiI0lIl();
/* 250 */                               VarHandle.storeStoreFence();
/* 253 */                               Ii1OoIll0 ii1OoIll0I00000oIO = OlIO0l.I00000oIO(iloI0lOlll1);
/* 257 */                               OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 261 */                               II0O000iIl iI0O000iIl4 = iI0O000iIl2;
/* 267 */                               O1ooiI111i o1ooiI111i4 = o1ooiI111i3;
/* 271 */                               OlIOiI1iI1 olIOiI1iI1I0000Il00O = iOO01lio0.I0000Il00O(0.0f, 400.0f, Float.valueOf(1.0f), 1);
/* 281 */                               Object obj = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 283 */                               OOiIOoiOO oOiIOoiOO = IOlO0o100i1i.I000o00OoI0I;
/* 291 */                               O0iOOoiioO o0iOOoiioO = (O0iOOoiioO) iloI0lOlll1.I000iOII(oOiIOoiOO);
/* 295 */                               OIo1Oi1l1lI oIo1Oi1l1lI4 = oIo1i1;
/* 346 */                               boolean zI000II = iloI0lOlll1.I000II(obj) | ((((i12 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(oIoIoIO0oI1O)) || (i12 & 6) == 4) | iloI0lOlll1.I000II(ii1OoIll0I00000oIO) | iloI0lOlll1.I000II(olIOiI1iI1I0000Il00O) | iloI0lOlll1.I000II(oIoIIiI0lIl) | iloI0lOlll1.I0000oI00(o0iOOoiioO.ordinal());
/* 347 */                               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 351 */                               Object obj2 = IOl11li.I00000oIO;
                                        Object obj3 = objI00O0i0ii;
/* 353 */                               if (zI000II || objI00O0i0ii == obj2) {
/* 361 */                                   I0illI1iI i0illI1iI = new I0illI1iI(14);
/* 364 */                                   i0illI1iI.I00iiO = oIoIoIO0oI1O;
/* 366 */                                   i0illI1iI.I00iiI = o0iOOoiioO;
/* 368 */                                   VarHandle.storeStoreFence();
/* 375 */                                   IoloOio0I ioloOio0I = new IoloOio0I(22);
/* 378 */                                   ioloOio0I.I00iiI = oIoIoIO0oI1O;
/* 380 */                                   ioloOio0I.I00iiO = i0illI1iI;
/* 382 */                                   VarHandle.storeStoreFence();
/* 387 */                                   Ol1iIOI ol1iIOI3 = new Ol1iIOI();
/* 390 */                                   ol1iIOI3.I00000oIO = ioloOio0I;
/* 392 */                                   ol1iIOI3.I00000oOI = ii1OoIll0I00000oIO;
/* 394 */                                   ol1iIOI3.I0000Il00O = olIOiI1iI1I0000Il00O;
/* 398 */                                   ol1iIOI3.I0000O = OiOlllI10.I00000oOI;
/* 400 */                                   VarHandle.storeStoreFence();
/* 403 */                                   iloI0lOlll1.I00iio(ol1iIOI3);
/* 406 */                                   obj3 = ol1iIOI3;
                                        }
/* 408 */                               Ol1iIOI ol1iIOI4 = (Ol1iIOI) obj3;
/* 410 */                               i8 = i6 & (-29360129);
/* 412 */                               if (i5 != 0) {
/* 414 */                                   z2 = true;
                                        }
/* 415 */                               OIilII oIilII = OIilII.I00iOIl;
/* 421 */                               int i13 = (i6 & 14) | 432;
/* 427 */                               O0iOOoiioO o0iOOoiioO2 = (O0iOOoiioO) iloI0lOlll1.I000iOII(oOiIOoiOO);
/* 456 */                               boolean zI0000oI00 = ((((i13 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(oIoIoIO0oI1O)) || (i13 & 6) == 4) | iloI0lOlll1.I0000oI00(o0iOOoiioO2.ordinal());
/* 458 */                               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                                        Object obj4 = objI00O0i0ii2;
/* 462 */                               if (zI0000oI00 || objI00O0i0ii2 == obj2) {
/* 468 */                                   IiI01I iiI01I = new IiI01I();
/* 471 */                                   iiI01I.I00iOIl = oIoIoIO0oI1O;
/* 473 */                                   iiI01I.I00iiI = o0iOOoiioO2;
/* 475 */                                   VarHandle.storeStoreFence();
/* 478 */                                   iloI0lOlll1.I00iio(iiI01I);
                                            obj4 = iiI01I;
                                        }
/* 484 */                               IOO0o0I1l iOO0o0I1l3 = IOO0o0I1l.I00ilO0;
/* 490 */                               o1ooiI111i2 = o1ooiI111i4;
/* 492 */                               lo1iloii12 = lo1iloii13;
/* 494 */                               ol1iIOI2 = ol1iIOI4;
/* 482 */                               oII1lIlol2 = (IiI01I) obj4;
/* 486 */                               i0o1iIoolIiI00000oOI = OIlIo0OII1.I00000oOI(iloI0lOlll1);
/* 497 */                               z3 = z2;
/* 498 */                               oIo1Oi1l1lI3 = oIo1Oi1l1lI4;
/* 500 */                               iOO0o0I1l2 = iOO0o0I1l3;
/* 501 */                               iI0O000iIl3 = iI0O000iIl4;
                                    } else {
/* 194 */                               iloI0lOlll1.I00OilO00Il();
/* 197 */                               i8 = i6 & (-29360129);
/* 199 */                               i0o1iIoolIiI00000oOI = i0o1iIoolIi;
/* 201 */                               o1ooiI111i2 = o1ooiI111i;
/* 203 */                               oII1lIlol2 = oII1lIlol;
/* 205 */                               ol1iIOI2 = ol1iIOI;
/* 207 */                               lo1iloii12 = lo1iloii1;
/* 209 */                               iI0O000iIl3 = iI0O000iIl2;
/* 210 */                               z3 = z2;
/* 211 */                               oIo1Oi1l1lI3 = oIo1Oi1l1lI2;
/* 212 */                               iOO0o0I1l2 = iOO0o0I1l;
                                    }
/* 503 */                           iloI0lOlll1.I0010o();
/* 506 */                           OIilII oIilII2 = OIilII.I00iOIl;
/* 529 */                           int i14 = i8 >> 6;
/* 537 */                           int i15 = i8 << 12;
/* 570 */                           i7 = 1;
/* 571 */                           l0ooo0ii0Ii.I00000oIO(((i8 >> 3) & 14) | 24576 | ((i8 << 3) & 112) | (i8 & 896) | ((i8 >> 18) & 7168) | (i14 & 3670016) | (i15 & 234881024) | (i15 & 1879048192), ((i8 >> 9) & 14) | 3456 | (i14 & 57344) | 1769472, i0o1iIoolIiI00000oOI, iI0O000iIl3, iOO0o0I1l2, iOii1l, iloI0lOlll1, o1ooiI111i2, oII1lIlol2, oIo1Oi1l1lI3, oIoIoIO0oI1O, ol1iIOI2, lo1iloii12, z3);
/* 574 */                           iI0O000iIl2 = iI0O000iIl3;
                                }
/* 594 */                       oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 598 */                       if (oOloioIlI001IO000 == null) {
/* 602 */                           O0ll00l o0ll00l = new O0ll00l(i7);
/* 605 */                           o0ll00l.I00iiI = oIoIoIO0oI1O;
/* 607 */                           o0ll00l.I00iiO = o1ooiI111i2;
/* 609 */                           o0ll00l.I00iio = oIo1Oi1l1lI3;
/* 611 */                           o0ll00l.I00ilI0I1 = lo1iloii12;
/* 613 */                           o0ll00l.I00ilO0 = iI0O000iIl2;
/* 615 */                           o0ll00l.I00io1l = ol1iIOI2;
/* 617 */                           o0ll00l.I00ioIO = z3;
/* 619 */                           o0ll00l.I00l0I0l0lO1 = oII1lIlol2;
/* 621 */                           o0ll00l.I00l0OO0IO = iOO0o0I1l2;
/* 623 */                           o0ll00l.I00li1OI = i0o1iIoolIiI00000oOI;
/* 627 */                           o0ll00l.I00ll1 = iOii1l;
/* 629 */                           o0ll00l.I00lli11 = i;
/* 633 */                           o0ll00l.I00lll10 = i2;
/* 635 */                           VarHandle.storeStoreFence();
/* 638 */                           oOloioIlI001IO000.I0000O = o0ll00l;
/* 1755 */                          return;
                                }
/* 1755 */                      return;
                            }
/* 129 */                   i11 |= 100663296;
/* 130 */                   z2 = z;
/* 152 */                   i6 = i11 | 805306368;
/* 175 */                   if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
                            }
/* 594 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 598 */                   if (oOloioIlI001IO000 == null) {
                            }
                        }
/* 93 */                iI0O000iIl2 = iI0O000iIl;
/* 118 */               if ((12582912 & i) == 0) {
                        }
/* 123 */               i5 = i2 & Barcode.FORMAT_QR_CODE;
/* 127 */               if (i5 == 0) {
                        }
/* 130 */               z2 = z;
/* 152 */               i6 = i11 | 805306368;
/* 175 */               if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
                        }
/* 594 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 598 */               if (oOloioIlI001IO000 == null) {
                        }
                    }
/* 60 */            oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 84 */            int i112 = 224256 | i3;
/* 85 */            i4 = i2 & 64;
/* 87 */            if (i4 == 0) {
                    }
/* 93 */            iI0O000iIl2 = iI0O000iIl;
/* 118 */           if ((12582912 & i) == 0) {
                    }
/* 123 */           i5 = i2 & Barcode.FORMAT_QR_CODE;
/* 127 */           if (i5 == 0) {
                    }
/* 130 */           z2 = z;
/* 152 */           i6 = i112 | 805306368;
/* 175 */           if (iloI0lOlll1.I00OIl(i6 & 1, (306783379 & i6) == 306783378)) {
                    }
/* 594 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 598 */           if (oOloioIlI001IO000 == null) {
                    }
                }
            }
