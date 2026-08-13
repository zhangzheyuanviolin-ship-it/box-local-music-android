            package p000;

            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOi0ilOl10I {
                public static final void I00000oIO(O1ooiI111i o1ooiI111i, Ol010000lo00 ol010000lo00, IllOOo00lI illOOo00lI, float f, boolean z, IlliIl1l11O illiIl1l11O, IlliIl1l11O illiIl1l11O2, OioOIi1o0I oioOIi1o0I, long j, long j2, float f2, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    O1ooiI111i o1ooiI111i2;
                    float f3;
                    boolean z2;
                    OioOIi1o0I oioOIi1o0I2;
/* 17 */            long j3 = j;
/* 19 */            long j4 = j2;
/* 30 */            iloI0lOlll1.I00i0O(57000307);
/* 78 */            int i2 = i | (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | (iloI0lOlll1.I000II(ol010000lo00) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 80 */            boolean zI0000O = iloI0lOlll1.I0000O(f);
/* 84 */            int i3 = Barcode.FORMAT_PDF417;
/* 171 */           boolean z3 = true;
/* 177 */           int i4 = i2 | (zI0000O ? 2048 : 1024) | (iloI0lOlll1.I000O01llI0(z) ? 16384 : 8192) | (iloI0lOlll1.I000O01llI0(true) ? 131072 : 65536) | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 1048576 : 524288) | (iloI0lOlll1.I000OOo1O(illiIl1l11O2) ? 8388608 : 4194304) | (iloI0lOlll1.I000II(oioOIi1o0I) ? 67108864 : 33554432) | (iloI0lOlll1.I0001Ioi1lo(j3) ? 536870912 : 268435456);
/* 198 */           int i5 = (iloI0lOlll1.I0001Ioi1lo(j4) ? 4 : 2) | (iloI0lOlll1.I0000O(f2) ? 32 : 16) | 384;
/* 204 */           if (!iloI0lOlll1.I000OOo1O(iOii1l)) {
/* 207 */               i3 = 1024;
                    }
/* 209 */           int i6 = i5 | i3;
/* 238 */           if (iloI0lOlll1.I00OIl(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
/* 240 */               iloI0lOlll1.I00Ol00();
/* 245 */               if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 254 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 257 */               iloI0lOlll1.I0010o();
/* 260 */               OOiIOoiOO oOiIOoiOO = O1OoilIO.I00000oOI;
/* 270 */               Object objI0001Ioi1lo = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I0000O.I0001Ioi1lo();
/* 284 */               Object objI00000oOI = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I0000O.I00000oOI();
/* 302 */               int i7 = (i4 & 112) ^ 48;
/* 336 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I0000O.I0001Ioi1lo()) | ((i7 > 32 && iloI0lOlll1.I000II(ol010000lo00)) || (i4 & 48) == 32) | iloI0lOlll1.I000OOo1O(objI0001Ioi1lo) | iloI0lOlll1.I000OOo1O(objI00000oOI);
/* 337 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 341 */               Object obj = IOl11li.I00000oIO;
                        Object obj2 = objI00O0i0ii;
/* 343 */               if (zI000OOo1O || objI00O0i0ii == obj) {
/* 350 */                   I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(7);
/* 353 */                   i0iI0O1IoIoI.I00iiI = ol010000lo00;
/* 355 */                   i0iI0O1IoIoI.I00iiO = objI0001Ioi1lo;
/* 357 */                   i0iI0O1IoIoI.I00iio = objI00000oOI;
/* 359 */                   VarHandle.storeStoreFence();
/* 362 */                   iloI0lOlll1.I00iio(i0iI0O1IoIoI);
                            obj2 = i0iI0O1IoIoI;
                        }
/* 367 */               iIO0iiOiOl0l.I0001Ioi1lo((IllOOo00lI) obj2, iloI0lOlll1);
/* 370 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 374 */               if (objI00O0i0ii2 == obj) {
/* 377 */                   objI00O0i0ii2 = O1OI1ll1Il0i.I00000oIO(0.0f);
/* 381 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 384 */               I10i01 i10i01 = (I10i01) objI00O0i0ii2;
/* 386 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 390 */               if (objI00O0i0ii3 == obj) {
/* 392 */                   objI00O0i0ii3 = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 396 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 399 */               Object obj3 = (Ii0110) objI00O0i0ii3;
/* 428 */               boolean zI000OOo1O2 = ((i7 > 32 && iloI0lOlll1.I000II(ol010000lo00)) || (i4 & 48) == 32) | iloI0lOlll1.I000OOo1O(obj3) | iloI0lOlll1.I000OOo1O(i10i01);
/* 433 */               if ((i4 & 896) != 256) {
/* 436 */                   z3 = false;
                        }
/* 438 */               boolean z4 = zI000OOo1O2 | z3;
/* 440 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii4;
/* 444 */               if (z4 || objI00O0i0ii4 == obj) {
/* 452 */                   I0IoO01lIoO i0IoO01lIoO = new I0IoO01lIoO(8);
/* 455 */                   i0IoO01lIoO.I00iio = ol010000lo00;
/* 457 */                   i0IoO01lIoO.I00iiI = obj3;
/* 459 */                   i0IoO01lIoO.I00iiO = i10i01;
/* 461 */                   i0IoO01lIoO.I00ilI0I1 = illOOo00lI;
/* 463 */                   VarHandle.storeStoreFence();
/* 466 */                   iloI0lOlll1.I00iio(i0IoO01lIoO);
                            obj4 = i0IoO01lIoO;
                        }
/* 469 */               Object obj5 = (IllOOo00lI) obj4;
/* 471 */               boolean zI0000oI00 = ol010000lo00.I0000oI00();
/* 483 */               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(i10i01) | iloI0lOlll1.I000II(obj5);
/* 484 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 488 */               int i8 = 15;
/* 490 */               if (zI000OOo1O3 || objI00O0i0ii5 == obj) {
/* 497 */                   objI00O0i0ii5 = new I00oIiI10(obj5, i10i01, null, i8);
/* 500 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 506 */               iOOloioiO.I00000oOI(zI0000oI00, (IlliIl1l11O) objI00O0i0ii5, iloI0lOlll1, 0);
/* 515 */               float fFloatValue = ((Number) i10i01.I0000O()).floatValue();
/* 525 */               int i9 = i4 >> 6;
/* 534 */               int i10 = ((i4 << 3) & 524272) | (3670016 & i9) | (i9 & 29360128);
/* 535 */               int i11 = i6 << 24;
/* 544 */               int i12 = i10 | (234881024 & i11) | (i11 & 1879048192);
/* 546 */               int i13 = i4 >> 15;
/* 556 */               int i14 = (i13 & 896) | (i13 & 112) | 6 | (i6 & 7168);
/* 558 */               o1ooiI111i2 = o1ooiI111i;
/* 560 */               z2 = z;
/* 562 */               oioOIi1o0I2 = oioOIi1o0I;
/* 564 */               j3 = j;
/* 566 */               j4 = j2;
/* 569 */               f3 = f;
/* 571 */               I00000oOI(fFloatValue, o1ooiI111i2, ol010000lo00, illOOo00lI, f3, z2, oioOIi1o0I2, j3, j4, f2, illiIl1l11O, illiIl1l11O2, iOii1l, iloI0lOlll1, i12, i14);
                    } else {
/* 575 */               o1ooiI111i2 = o1ooiI111i;
/* 577 */               f3 = f;
/* 579 */               z2 = z;
/* 581 */               oioOIi1o0I2 = oioOIi1o0I;
/* 583 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 586 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 590 */           if (oOloioIlI001IO000 != null) {
/* 594 */               II1O1IOilol iI1O1IOilol = new II1O1IOilol();
/* 597 */               iI1O1IOilol.I00iOIl = o1ooiI111i2;
/* 599 */               iI1O1IOilol.I00iiI = ol010000lo00;
/* 601 */               iI1O1IOilol.I00iiO = illOOo00lI;
/* 603 */               iI1O1IOilol.I00iio = f3;
/* 605 */               iI1O1IOilol.I00ilI0I1 = z2;
/* 607 */               iI1O1IOilol.I00ilO0 = illiIl1l11O;
/* 609 */               iI1O1IOilol.I00io1l = illiIl1l11O2;
/* 611 */               iI1O1IOilol.I00ioIO = oioOIi1o0I2;
/* 613 */               iI1O1IOilol.I00l0I0l0lO1 = j3;
/* 615 */               iI1O1IOilol.I00l0OO0IO = j4;
/* 617 */               iI1O1IOilol.I00li1OI = f2;
/* 619 */               iI1O1IOilol.I00ll1 = iOii1l;
/* 621 */               VarHandle.storeStoreFence();
/* 624 */               oOloioIlI001IO000.I0000O = iI1O1IOilol;
                    }
                }

                public static final void I00000oOI(float f, O1ooiI111i o1ooiI111i, Ol010000lo00 ol010000lo00, IllOOo00lI illOOo00lI, float f2, boolean z, OioOIi1o0I oioOIi1o0I, long j, long j2, float f3, IlliIl1l11O illiIl1l11O, IlliIl1l11O illiIl1l11O2, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    int i4;
                    OioOIi1o0I oioOIi1o0I2;
                    long j3;
                    long j4;
                    float f4;
                    String str;
                    Object obj;
                    float f5 = f;
                    boolean z2 = z;
/* 1 */             iloI0lOlll1.I00i0O(-780255289);
                    if ((i & 6) == 0) {
                        i3 = i | (iloI0lOlll1.I0000O(f5) ? 4 : 2);
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
                    int i5 = i & 384;
                    int i6 = Barcode.FORMAT_ITF;
                    if (i5 == 0) {
                        i3 |= iloI0lOlll1.I000II(ol010000lo00) ? Barcode.FORMAT_QR_CODE : 128;
                    }
                    int i7 = i & 3072;
                    int i8 = Barcode.FORMAT_UPC_E;
                    if (i7 == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_PDF417 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= iloI0lOlll1.I0000O(f2) ? 16384 : 8192;
                    }
                    if ((196608 & i) == 0) {
                        i3 |= iloI0lOlll1.I000O01llI0(z2) ? 131072 : 65536;
                    }
                    if ((1572864 & i) == 0) {
                        i3 |= iloI0lOlll1.I000II(oioOIi1o0I) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= iloI0lOlll1.I0001Ioi1lo(j) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= iloI0lOlll1.I0001Ioi1lo(j2) ? 67108864 : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        i3 |= iloI0lOlll1.I0000O(f3) ? 536870912 : 268435456;
                    }
                    int i9 = i3;
                    if ((i2 & 6) == 0) {
                        i4 = i2 | (iloI0lOlll1.I0000O(0.0f) ? 4 : 2);
                    } else {
                        i4 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i4 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 32 : 16;
                    }
                    int i10 = i4;
                    if ((i2 & 384) == 0) {
                        if (iloI0lOlll1.I000OOo1O(illiIl1l11O2)) {
                            i6 = Barcode.FORMAT_QR_CODE;
                        }
                        i10 |= i6;
                    }
                    if ((i2 & 3072) == 0) {
                        if (iloI0lOlll1.I000OOo1O(iOii1l)) {
                            i8 = Barcode.FORMAT_PDF417;
                        }
                        i10 |= i8;
                    }
                    int i11 = i10;
                    if (iloI0lOlll1.I00OIl(i9 & 1, ((i9 & 306783379) == 306783378 && (i11 & 1171) == 1170) ? false : true)) {
                        iloI0lOlll1.I00Ol00();
                        if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 2 */                     iloI0lOlll1.I00OilO00Il();
                        }
                        iloI0lOlll1.I0010o();
/* 3 */                 String strI00000oIO = lOi10Ol.I00000oIO(R.string.m3c_bottom_sheet_pane_title, iloI0lOlll1);
/* 6 */                 Oooii1o1 oooii1o1 = (Oooii1o1) iloI0lOlll1.I000iOII(IOlO0o100i1i.I00111O);
/* 10 */                OlIOiI1iI1 olIOiI1iI1I0001Ioi1lo = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I0000O.I0001Ioi1lo();
/* 11 */                OOiIOoiOO oOiIOoiOO = IOlO0o100i1i.I000O01llI0;
/* 13 */                IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(oOiIOoiOO);
/* 14 */                OoIoO0I0oOI ooIoO0I0oOI = I0l0O0O.I00000oIO;
/* 15 */                I0l1OOl1l10 i0l1OOl1l10 = ol010000lo00.I0000oI00;
                        I0l1OOl1l10 i0l1OOl1l102 = ol010000lo00.I0000oI00;
                        int i12 = (i9 & 896) ^ 384;
/* 16 */                boolean z3 = (i12 > 256 && iloI0lOlll1.I000II(ol010000lo00)) || (i9 & 384) == 256;
/* 17 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                        boolean z4 = z3;
/* 18 */                Object obj2 = IOl11li.I00000oIO;
                        if (z4 || objI00O0i0ii == obj2) {
                            str = strI00000oIO;
/* 19 */                    II1O1Oi0l0 iI1O1Oi0l0 = new II1O1Oi0l0(0);
                            iI1O1Oi0l0.I00iiI = ol010000lo00;
                            VarHandle.storeStoreFence();
/* 20 */                    iloI0lOlll1.I00iio(iI1O1Oi0l0);
                            obj = iI1O1Oi0l0;
                        } else {
                            str = strI00000oIO;
                            obj = objI00O0i0ii;
                        }
/* 21 */                Function1 function1 = (Function1) obj;
/* 22 */                OoIoO0I0oOI ooIoO0I0oOI2 = I0l0O0O.I00000oIO;
/* 24 */                IiIooOOOI iiIooOOOI2 = (IiIooOOOI) iloI0lOlll1.I000iOII(oOiIOoiOO);
/* 25 */                boolean zI000II = iloI0lOlll1.I000II(iiIooOOOI2) | iloI0lOlll1.I000II(i0l1OOl1l10) | iloI0lOlll1.I000II(function1) | iloI0lOlll1.I000II(olIOiI1iI1I0001Ioi1lo);
/* 26 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        if (zI000II || objI00O0i0ii2 == obj2) {
/* 27 */                    objI00O0i0ii2 = I0l0lIoOIoIi.I0000O(i0l1OOl1l10, iiIooOOOI2, function1, olIOiI1iI1I0001Ioi1lo);
/* 28 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 29 */                Ol1iIOI ol1iIOI = (Ol1iIOI) objI00O0i0ii2;
                        boolean zI000II2 = iloI0lOlll1.I000II(ol1iIOI) | ((i12 > 256 && iloI0lOlll1.I000II(ol010000lo00)) || (i9 & 384) == 256) | iloI0lOlll1.I000II(oooii1o1) | iloI0lOlll1.I000II(iiIooOOOI);
/* 31 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii3;
                        if (zI000II2 || objI00O0i0ii3 == obj2) {
/* 33 */                    II1OIl1 iI1OIl1 = new II1OIl1();
/* 34 */                    iI1OIl1.I00000oIO = oooii1o1;
                            iI1OIl1.I00000oOI = ol010000lo00;
                            iI1OIl1.I0000Il00O = iiIooOOOI;
                            iI1OIl1.I0000O = ol1iIOI;
                            iI1OIl1.I0000oI00 = illOOo00lI;
/* 35 */                    VarHandle.storeStoreFence();
/* 36 */                    iloI0lOlll1.I00iio(iI1OIl1);
                            obj3 = iI1OIl1;
                        }
/* 37 */                II1OIl1 iI1OIl12 = (II1OIl1) obj3;
/* 38 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii4 == obj2) {
/* 39 */                    objI00O0i0ii4 = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 40 */                    iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 41 */                Ii0110 ii0110 = (Ii0110) objI00O0i0ii4;
/* 42 */                boolean zI000OOo1O = ((i12 > 256 && iloI0lOlll1.I000II(ol010000lo00)) || (i9 & 384) == 256) | iloI0lOlll1.I000OOo1O(ii0110) | ((i9 & 7168) == 2048);
/* 43 */                Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii5;
                        if (zI000OOo1O || objI00O0i0ii5 == obj2) {
/* 44 */                    I0O1111oo i0O1111oo = new I0O1111oo(2);
                            i0O1111oo.I00iiI = ol010000lo00;
                            i0O1111oo.I00iio = ii0110;
                            i0O1111oo.I00iiO = illOOo00lI;
                            VarHandle.storeStoreFence();
/* 45 */                    iloI0lOlll1.I00iio(i0O1111oo);
                            obj4 = i0O1111oo;
                        }
/* 46 */                IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj4;
/* 48 */                O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(Ol0iOOO0.I0010I0i(o1ooiI111i, Float.NaN, f2), 1.0f);
/* 49 */                O1ooiI111i o1ooiI111iI00000oIO = O1ooIo101ll.I00000oIO;
                        if (z) {
/* 50 */                    iloI0lOlll1.I00i01iIIliI(1794078218);
/* 51 */                    boolean z5 = (i12 > 256 && iloI0lOlll1.I000II(ol010000lo00)) || (i9 & 384) == 256;
/* 52 */                    Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                            Object obj5 = objI00O0i0ii6;
                            if (z5 || objI00O0i0ii6 == obj2) {
/* 53 */                        OIilII oIilII = OIilII.I00iOIl;
/* 54 */                        int i13 = Ol00iioo.I00000oIO;
/* 56 */                        Ol00iI1i0Il ol00iI1i0Il = new Ol00iI1i0Il();
/* 57 */                        ol00iI1i0Il.I00iOIl = ol010000lo00;
                                ol00iI1i0Il.I00iiI = iI1OIl12;
/* 58 */                        VarHandle.storeStoreFence();
/* 59 */                        iloI0lOlll1.I00iio(ol00iI1i0Il);
                                obj5 = ol00iI1i0Il;
                            }
/* 61 */                    o1ooiI111iI00000oIO = iO0011o0iIIl.I00000oIO(o1ooiI111iI00000oIO, (OII1lIlol) obj5, null);
/* 62 */                    iloI0lOlll1.I0010I0i(false);
                        } else {
/* 63 */                    iloI0lOlll1.I00i01iIIliI(1794093039);
/* 64 */                    iloI0lOlll1.I0010I0i(false);
                        }
/* 65 */                O1ooiI111i o1ooiI111iI0000O = o1ooiI111iI0000oI00.I0000O(o1ooiI111iI00000oIO);
/* 66 */                OIilII oIilII2 = OIilII.I00iOIl;
                        boolean z6 = (i12 > 256 && iloI0lOlll1.I000II(ol010000lo00)) || (i9 & 384) == 256;
/* 67 */                Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                        Object obj6 = objI00O0i0ii7;
                        if (z6 || objI00O0i0ii7 == obj2) {
/* 68 */                    I00oooO i00oooO = new I00oooO(7);
                            i00oooO.I00iiI = ol010000lo00;
                            VarHandle.storeStoreFence();
/* 69 */                    iloI0lOlll1.I00iio(i00oooO);
                            obj6 = i00oooO;
                        }
/* 72 */                O1ooiI111i o1ooiI111iI00000oOI = I0l0lIoOIoIi.I00000oOI(iIIoOiil.I00000oIO(o1ooiI111iI0000O, i0l1OOl1l102, oIilII2, (IlliIl1l11O) obj6), i0l1OOl1l102, oIilII2, z && ol010000lo00.I0000Il00O() != Ol010l0o0O.I00iOIl, iI1OIl12);
                        String str2 = str;
/* 73 */                boolean zI000II3 = iloI0lOlll1.I000II(str2);
/* 74 */                Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                        Object obj7 = objI00O0i0ii8;
                        if (zI000II3 || objI00O0i0ii8 == obj2) {
/* 75 */                    I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(3);
                            i0ioO0Oio0ll.I00iiI = str2;
                            VarHandle.storeStoreFence();
/* 76 */                    iloI0lOlll1.I00iio(i0ioO0Oio0ll);
                            obj7 = i0ioO0Oio0ll;
                        }
/* 78 */                O1ooiI111i o1ooiI111iI00000oOI2 = OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oOI, false, (Function1) obj7);
/* 79 */                II1O00ioi iI1O00ioi = new II1O00ioi(0);
                        iI1O00ioi.I00iiO = ol010000lo00;
                        iI1O00ioi.I00iiI = f;
                        VarHandle.storeStoreFence();
                        O1ooiI111i o1ooiI111iI00000oIO2 = iIlll1lo.I00000oIO(o1ooiI111iI00000oOI2, iI1O00ioi);
/* 80 */                int i14 = Ol00iioo.I00000oIO;
/* 81 */                II1O1Oi0l0 iI1O1Oi0l02 = new II1O1Oi0l0(1);
                        iI1O1Oi0l02.I00iiI = ol010000lo00;
                        VarHandle.storeStoreFence();
                        O1ooiI111i o1ooiI111iI00000oIO3 = iIlll1lo.I00000oIO(o1ooiI111iI00000oIO2, iI1O1Oi0l02);
/* 82 */                II1OIO0liI0 iI1OIO0liI0 = new II1OIO0liI0();
                        iI1OIO0liI0.I00iOIl = illiIl1l11O2;
                        iI1OIO0liI0.I00iiI = f;
                        iI1OIO0liI0.I00iiO = ol010000lo00;
                        iI1OIO0liI0.I00iio = illiIl1l11O;
                        iI1OIO0liI0.I00ilI0I1 = illOOo00lI2;
                        iI1OIO0liI0.I00ilO0 = ii0110;
                        iI1OIO0liI0.I00io1l = z;
                        iI1OIO0liI0.I00ioIO = iOii1l;
                        VarHandle.storeStoreFence();
                        IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(1483196812, iI1OIO0liI0, iloI0lOlll1);
                        int i15 = i9 >> 15;
                        int i16 = (i15 & 57344) | (i15 & 112) | 12582912 | (i15 & 896) | (i15 & 7168) | (458752 & (i11 << 15));
                        f5 = f;
                        j3 = j;
                        j4 = j2;
                        f4 = f3;
                        z2 = z;
                        oioOIi1o0I2 = oioOIi1o0I;
/* 83 */                OlioioOl0O.I00000oIO(o1ooiI111iI00000oIO3, oioOIi1o0I2, j3, j4, f4, 0.0f, null, iOii1lI00000oOI, iloI0lOlll1, i16, 64);
                    } else {
                        oioOIi1o0I2 = oioOIi1o0I;
                        j3 = j;
                        j4 = j2;
                        f4 = f3;
/* 84 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 85 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        II1OIOlI010 iI1OIOlI010 = new II1OIOlI010();
                        iI1OIOlI010.I00iOIl = f5;
                        iI1OIOlI010.I00iiI = o1ooiI111i;
                        iI1OIOlI010.I00iiO = ol010000lo00;
                        iI1OIOlI010.I00iio = illOOo00lI;
                        iI1OIOlI010.I00ilI0I1 = f2;
                        iI1OIOlI010.I00ilO0 = z2;
                        iI1OIOlI010.I00io1l = oioOIi1o0I2;
                        iI1OIOlI010.I00ioIO = j3;
                        iI1OIOlI010.I00l0I0l0lO1 = j4;
                        iI1OIOlI010.I00l0OO0IO = f4;
                        iI1OIOlI010.I00li1OI = illiIl1l11O;
                        iI1OIOlI010.I00ll1 = illiIl1l11O2;
                        iI1OIOlI010.I00lli11 = iOii1l;
                        iI1OIOlI010.I00lll10 = i;
                        iI1OIOlI010.I00o0iI0io1 = i2;
                        VarHandle.storeStoreFence();
/* 86 */                oOloioIlI001IO000.I0000O = iI1OIOlI010;
                    }
                }

                public static final float I0000Il00O(Oi11lOiIoi oi11lOiIoi, float f) {
/* 7 */             float fIntBitsToFloat = Float.intBitsToFloat((int) (oi11lOiIoi.I00oI0i >> 32));
/* 17 */            if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
/* 15 */                return 1.0f;
                    }
/* 43 */            return 1.0f - (l1I1Il.I00000oOI(0.0f, Math.min(oi11lOiIoi.I00oIiI10.I00000oIO() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
                }

                public static final float I0000O(Oi11lOiIoi oi11lOiIoi, float f) {
/* 10 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (oi11lOiIoi.I00oI0i & 4294967295L));
/* 20 */            if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
/* 18 */                return 1.0f;
                    }
/* 46 */            return 1.0f - (l1I1Il.I00000oOI(0.0f, Math.min(oi11lOiIoi.I00oIiI10.I00000oIO() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
                }
            }
