            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class IOl1II00 {
                public static final OIi0io011l I00000oIO = new OIi0io011l("provider");
                public static final OIi0io011l I00000oOI = new OIi0io011l("provider");
                public static final OIi0io011l I0000Il00O = new OIi0io011l("compositionLocalMap");
                public static final OIi0io011l I0000O = new OIi0io011l("providers");
                public static final OIi0io011l I0000oI00 = new OIi0io011l("reference");

                public static final void I00000oIO(String str) {
/* 29 */            throw new IOl0iO0(IlIi0I0.I000lI("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
                }

                public static final Void I00000oOI(String str) {
/* 29 */            throw new IOl0iO0(IlIi0I0.I000lI("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:82:0x01bc  */
                /* JADX WARN: Type inference failed for: r6v13, types: [Il01100l] */
                /* JADX WARN: Type inference failed for: r6v14 */
                /* JADX WARN: Type inference failed for: r6v16, types: [java.util.ArrayList] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final OI0Iloloi I0000Il00O(IOlIOiI0iiI1 iOlIOiI0iiI1, OI0Iol1O oI0Iol1O, Ol11il011o0 ol11il011o0, I1IOO010 i1ioo010) {
                    IOO0o0I1l iOO0o0I1l;
                    Ol11i0000Oo ol11i0000Oo;
                    ?? arrayList;
                    Ilo1iIi1OI01 ilo1iIi1OI01;
                    long[] jArr;
                    Ilo1iIi1OI01 ilo1iIi1OI012;
                    IOO0o0I1l iOO0o0I1l2;
                    Ol11i0000Oo ol11i0000Oo2;
                    int i;
                    long[] jArr2;
                    int i2;
                    long j;
                    int i3;
                    boolean zI000II;
                    int i4;
                    int i5;
                    long j2;
/* 3 */             OI0Iol1O oI0Iol1O2 = oI0Iol1O;
/* 9 */             IOO0o0I1l iOO0o0I1l3 = IOl11li.I00000oIO;
/* 13 */            Ol11i0000Oo ol11i0000Oo3 = new Ol11i0000Oo();
/* 18 */            if (ol11il011o0.I0000oI00 != null) {
/* 20 */                ol11i0000Oo3.I0000O();
                    }
/* 25 */            if (ol11il011o0.I0001Ioi1lo != null) {
/* 32 */                ol11i0000Oo3.I00li1OI = new OI0l1oli1I();
                    }
/* 34 */            int i6 = ol11il011o0.I00111O;
/* 36 */            if (i1ioo010 != null && ol11il011o0.I00II0oii1o(i6) > 0) {
/* 44 */                int iI00IO1 = ol11il011o0.I001IO000;
/* 46 */                while (iI00IO1 > 0 && !ol11il011o0.I001i1lo1io(iI00IO1)) {
/* 56 */                    iI00IO1 = ol11il011o0.I00IO1(ol11il011o0.I00000oOI, iI00IO1);
                        }
/* 61 */                if (iI00IO1 >= 0 && ol11il011o0.I001i1lo1io(iI00IO1)) {
/* 69 */                    Object objI00II0Ol1O0l = ol11il011o0.I00II0Ol1O0l(iI00IO1);
/* 73 */                    int i7 = iI00IO1 + 1;
/* 79 */                    int iI00111O = ol11il011o0.I00111O(iI00IO1) + iI00IO1;
/* 80 */                    int iI00II0oii1o = 0;
/* 81 */                    while (i7 < iI00111O) {
/* 87 */                        int iI00111O2 = ol11il011o0.I00111O(i7) + i7;
/* 88 */                        if (iI00111O2 > i6) {
                                    break;
                                }
/* 103 */                       iI00II0oii1o += ol11il011o0.I001i1lo1io(i7) ? 1 : ol11il011o0.I00II0oii1o(i7);
/* 104 */                       i7 = iI00111O2;
                            }
/* 114 */                   int iI00II0oii1o2 = ol11il011o0.I001i1lo1io(i6) ? 1 : ol11il011o0.I00II0oii1o(i6);
/* 118 */                   i1ioo010.I0000O(objI00II0Ol1O0l);
/* 121 */                   i1ioo010.I000II(iI00II0oii1o, iI00II0oii1o2);
/* 124 */                   i1ioo010.I000OOo1O();
                        }
                    }
/* 127 */           Ilo1iIi1OI01 ilo1iIi1OI013 = oI0Iol1O2.I0000oI00;
/* 133 */           int i8 = 8;
/* 135 */           if (ilo1iIi1OI013.I00000oIO()) {
/* 141 */               if (iOlIOiI0iiI1.I00lll10.I0000oI00 > 0) {
/* 145 */                   arrayList = new ArrayList();
/* 148 */                   OI10I1IoI0Ol oI10I1IoI0Ol = iOlIOiI0iiI1.I00lll10;
/* 150 */                   long[] jArr3 = oI10I1IoI0Ol.I00000oIO;
                            int length = jArr3.length - 2;
/* 155 */                   if (length >= 0) {
/* 157 */                       int i9 = 0;
                                while (true) {
/* 158 */                           long j3 = jArr3[i9];
/* 175 */                           if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 182 */                               int i10 = 8 - ((~(i9 - length)) >>> 31);
/* 184 */                               int i11 = 0;
/* 185 */                               while (i11 < i10) {
/* 195 */                                   if ((j3 & 255) < 128) {
/* 199 */                                       int i12 = i8;
/* 201 */                                       int i13 = (i9 << 3) + i11;
/* 203 */                                       ilo1iIi1OI012 = ilo1iIi1OI013;
/* 207 */                                       Object obj = oI10I1IoI0Ol.I00000oOI[i13];
/* 213 */                                       Object obj2 = oI10I1IoI0Ol.I0000Il00O[i13];
/* 215 */                                       i = i11;
/* 219 */                                       if (obj2 instanceof OI10IIO) {
/* 221 */                                           OI10IIO oi10iio = (OI10IIO) obj2;
/* 223 */                                           Object[] objArr = oi10iio.I00000oOI;
/* 227 */                                           long[] jArr4 = oi10iio.I00000oIO;
/* 229 */                                           jArr2 = jArr3;
                                                    int length2 = jArr4.length - 2;
/* 234 */                                           if (length2 >= 0) {
/* 238 */                                               j = j3;
/* 240 */                                               int i14 = 0;
                                                        while (true) {
/* 241 */                                                   long j4 = jArr4[i14];
/* 243 */                                                   iOO0o0I1l2 = iOO0o0I1l3;
/* 245 */                                                   ol11i0000Oo2 = ol11i0000Oo3;
/* 255 */                                                   if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 262 */                                                       int i15 = 8 - ((~(i14 - length2)) >>> 31);
/* 264 */                                                       int i16 = 0;
/* 265 */                                                       while (i16 < i15) {
/* 271 */                                                           if ((j4 & 255) < 128) {
/* 275 */                                                               i4 = i16;
/* 277 */                                                               int i17 = (i14 << 3) + i4;
/* 279 */                                                               j2 = j4;
/* 281 */                                                               Object obj3 = objArr[i17];
/* 285 */                                                               OOloioIl oOloioIl = (OOloioIl) obj;
/* 287 */                                                               Ilo1iIi1OI01 ilo1iIi1OI014 = oOloioIl.I0000Il00O;
/* 289 */                                                               if (ilo1iIi1OI014 != null) {
/* 293 */                                                                   Ilo1iIi1OI01 ilo1iIi1OI01I00000oIO = ill0oooiIi.I00000oIO(ilo1iIi1OI012);
/* 297 */                                                                   Ilo1iIi1OI01 ilo1iIi1OI01I00000oIO2 = ill0oooiIi.I00000oIO(ilo1iIi1OI014);
/* 301 */                                                                   int iI0000Il00O = ol11il011o0.I0000Il00O(ilo1iIi1OI01I00000oIO);
/* 305 */                                                                   i5 = length;
/* 313 */                                                                   int iI00000oOI = Ol11iOOOoo1.I00000oOI(ol11il011o0.I00000oOI, iI0000Il00O) + iI0000Il00O;
/* 314 */                                                                   int i18 = ilo1iIi1OI01I00000oIO2.I00000oIO;
/* 316 */                                                                   if (iI0000Il00O <= i18 && i18 < iI00000oOI) {
/* 325 */                                                                       arrayList.add(new OIoi0IIoi(oOloioIl, obj3));
/* 328 */                                                                       oi10iio.I000lI(i17);
                                                                            }
                                                                        } else {
/* 332 */                                                                   i5 = length;
                                                                        }
                                                                    } else {
/* 335 */                                                               i4 = i16;
/* 337 */                                                               i5 = length;
/* 339 */                                                               j2 = j4;
                                                                    }
/* 341 */                                                           j4 = j2 >> i12;
/* 343 */                                                           i16 = i4 + 1;
/* 349 */                                                           length = i5;
                                                                }
/* 354 */                                                       i2 = length;
/* 356 */                                                       if (i15 != i12) {
                                                                    break;
                                                                }
                                                            } else {
/* 359 */                                                       i2 = length;
                                                            }
/* 361 */                                                   if (i14 == length2) {
                                                                break;
                                                            }
/* 363 */                                                   i14++;
/* 369 */                                                   iOO0o0I1l3 = iOO0o0I1l2;
/* 371 */                                                   ol11i0000Oo3 = ol11i0000Oo2;
/* 373 */                                                   length = i2;
/* 375 */                                                   i12 = 8;
                                                        }
                                                    } else {
/* 379 */                                               iOO0o0I1l2 = iOO0o0I1l3;
/* 381 */                                               ol11i0000Oo2 = ol11i0000Oo3;
/* 383 */                                               i2 = length;
/* 385 */                                               j = j3;
                                                    }
/* 387 */                                           zI000II = oi10iio.I000II();
                                                } else {
/* 392 */                                           iOO0o0I1l2 = iOO0o0I1l3;
/* 394 */                                           ol11i0000Oo2 = ol11i0000Oo3;
/* 396 */                                           jArr2 = jArr3;
/* 398 */                                           i2 = length;
/* 400 */                                           j = j3;
/* 404 */                                           OOloioIl oOloioIl2 = (OOloioIl) obj;
/* 406 */                                           Ilo1iIi1OI01 ilo1iIi1OI015 = oOloioIl2.I0000Il00O;
/* 408 */                                           if (ilo1iIi1OI015 != null) {
/* 410 */                                               Ilo1iIi1OI01 ilo1iIi1OI01I00000oIO3 = ill0oooiIi.I00000oIO(ilo1iIi1OI012);
/* 414 */                                               Ilo1iIi1OI01 ilo1iIi1OI01I00000oIO4 = ill0oooiIi.I00000oIO(ilo1iIi1OI015);
/* 418 */                                               int iI0000Il00O2 = ol11il011o0.I0000Il00O(ilo1iIi1OI01I00000oIO3);
/* 428 */                                               int iI00000oOI2 = Ol11iOOOoo1.I00000oOI(ol11il011o0.I00000oOI, iI0000Il00O2) + iI0000Il00O2;
/* 429 */                                               int i19 = ilo1iIi1OI01I00000oIO4.I00000oIO;
/* 431 */                                               if (iI0000Il00O2 > i19 || i19 >= iI00000oOI2) {
/* 445 */                                                   zI000II = false;
                                                        } else {
/* 440 */                                                   arrayList.add(new OIoi0IIoi(oOloioIl2, obj2));
/* 443 */                                                   zI000II = true;
                                                        }
                                                    }
                                                }
/* 446 */                                       if (zI000II) {
/* 448 */                                           oI10I1IoI0Ol.I000l1(i13);
                                                }
/* 451 */                                       i3 = 8;
                                            } else {
/* 454 */                                       ilo1iIi1OI012 = ilo1iIi1OI013;
/* 456 */                                       iOO0o0I1l2 = iOO0o0I1l3;
/* 458 */                                       ol11i0000Oo2 = ol11i0000Oo3;
/* 460 */                                       i = i11;
/* 462 */                                       jArr2 = jArr3;
/* 464 */                                       i2 = length;
/* 466 */                                       j = j3;
/* 468 */                                       i3 = i8;
                                            }
/* 469 */                                   j3 = j >> i3;
/* 471 */                                   i11 = i + 1;
/* 475 */                                   i8 = i3;
/* 476 */                                   ilo1iIi1OI013 = ilo1iIi1OI012;
/* 478 */                                   jArr3 = jArr2;
/* 480 */                                   iOO0o0I1l3 = iOO0o0I1l2;
/* 482 */                                   ol11i0000Oo3 = ol11i0000Oo2;
/* 484 */                                   length = i2;
                                        }
/* 490 */                               ilo1iIi1OI01 = ilo1iIi1OI013;
/* 492 */                               iOO0o0I1l = iOO0o0I1l3;
/* 494 */                               ol11i0000Oo = ol11i0000Oo3;
/* 497 */                               jArr = jArr3;
/* 499 */                               int i20 = length;
/* 501 */                               if (i10 != i8) {
                                            break;
                                        }
/* 503 */                               length = i20;
                                    } else {
/* 506 */                               ilo1iIi1OI01 = ilo1iIi1OI013;
/* 508 */                               iOO0o0I1l = iOO0o0I1l3;
/* 510 */                               ol11i0000Oo = ol11i0000Oo3;
/* 512 */                               jArr = jArr3;
                                    }
/* 514 */                           if (i9 == length) {
                                        break;
                                    }
/* 516 */                           i9++;
/* 522 */                           ilo1iIi1OI013 = ilo1iIi1OI01;
/* 524 */                           jArr3 = jArr;
/* 526 */                           iOO0o0I1l3 = iOO0o0I1l;
/* 528 */                           ol11i0000Oo3 = ol11i0000Oo;
/* 530 */                           i8 = 8;
                                }
                            } else {
/* 534 */                       iOO0o0I1l = iOO0o0I1l3;
/* 536 */                       ol11i0000Oo = ol11i0000Oo3;
                            }
                        } else {
/* 541 */                   iOO0o0I1l = iOO0o0I1l3;
/* 543 */                   ol11i0000Oo = ol11i0000Oo3;
/* 545 */                   arrayList = Il01100l.I00iOIl;
                        }
/* 538 */               oI0Iol1O2 = oI0Iol1O;
/* 558 */               oI0Iol1O2.I0001Ioi1lo = IOOi0Ool1i.I00O10llo(oI0Iol1O2.I0001Ioi1lo, (Iterable) arrayList);
                    } else {
/* 561 */               iOO0o0I1l = iOO0o0I1l3;
/* 563 */               ol11i0000Oo = ol11i0000Oo3;
                    }
/* 565 */           Ol11il011o0 ol11il011o0I000lI = ol11i0000Oo.I000lI();
                    try {
/* 569 */               ol11il011o0I000lI.I0000O();
/* 577 */               IOO0o0I1l iOO0o0I1l4 = iOO0o0I1l;
/* 580 */               ol11il011o0I000lI.I00O0o1oo(126665345, oI0Iol1O2.I00000oIO, false, iOO0o0I1l4);
/* 583 */               Ol11il011o0.I001iOo1i0O(ol11il011o0I000lI);
/* 588 */               ol11il011o0I000lI.I00OI1(oI0Iol1O2.I00000oOI);
/* 597 */               List listI001lloI = ol11il011o0.I001lloI(ill0oooiIi.I00000oIO(oI0Iol1O2.I0000oI00), ol11il011o0I000lI);
/* 601 */               ol11il011o0I000lI.I00IoIO0lI();
/* 604 */               ol11il011o0I000lI.I000OOo1O();
/* 607 */               ol11il011o0I000lI.I000OiO();
/* 611 */               ol11il011o0I000lI.I0000oI00(true);
/* 616 */               OI0Iloloi oI0Iloloi = new OI0Iloloi();
/* 619 */               Ol11i0000Oo ol11i0000Oo4 = ol11i0000Oo;
/* 621 */               oI0Iloloi.I00000oIO = ol11i0000Oo4;
/* 623 */               VarHandle.storeStoreFence();
/* 627 */               List list = listI001lloI;
/* 633 */               if (!list.isEmpty()) {
/* 635 */                   int size = list.size();
/* 640 */                   for (int i21 = 0; i21 < size; i21++) {
/* 646 */                       Ilo1iIi1OI01 ilo1iIi1OI016 = (Ilo1iIi1OI01) listI001lloI.get(i21);
/* 652 */                       if (ol11i0000Oo4.I000o00OoI0I(ilo1iIi1OI016)) {
/* 654 */                           int iI00000oOI3 = ol11i0000Oo4.I00000oOI(ilo1iIi1OI016);
/* 660 */                           int iI0000oI00 = Ol11iOOOoo1.I0000oI00(ol11i0000Oo4.I00iOIl, iI00000oOI3);
/* 666 */                           int i22 = iI00000oOI3 + 1;
/* 695 */                           if (((i22 < ol11i0000Oo4.I00iiI ? ol11i0000Oo4.I00iOIl[(i22 * 5) + 4] : ol11i0000Oo4.I00iiO.length) - iI0000oI00 > 0 ? ol11i0000Oo4.I00iiO[iI0000oI00] : iOO0o0I1l4) instanceof OOloioIl) {
/* 701 */                               OlOO1i11110 olOO1i11110 = new OlOO1i11110(8);
/* 706 */                               olOO1i11110.I00iiI = iOlIOiI0iiI1;
/* 708 */                               olOO1i11110.I00iiO = oI0Iol1O2;
/* 710 */                               VarHandle.storeStoreFence();
/* 713 */                               ol11il011o0I000lI = ol11i0000Oo4.I000lI();
                                        try {
/* 717 */                                   lIilio1l0.I00000oIO(ol11il011o0I000lI, listI001lloI, olOO1i11110);
/* 721 */                                   ol11il011o0I000lI.I0000oI00(true);
/* 724 */                                   return oI0Iloloi;
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
/* 739 */               return oI0Iloloi;
                    } finally {
                    }
                }

                public static final void I0000O(Ol11il011o0 ol11il011o0, OOoo1il oOoo1il) {
/* 1 */             int i = ol11il011o0.I00111O;
/* 7 */             I00oooO i00oooO = new I00oooO(12);
/* 10 */            i00oooO.I00iiI = oOoo1il;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            ol11il011o0.I000lI(i, i00oooO);
/* 18 */            ol11il011o0.I00IioO0OiOi();
                }
            }
