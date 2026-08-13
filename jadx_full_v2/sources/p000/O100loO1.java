            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Map;
            
            public final class O100loO1 implements O1iOIl0o10 {
                public final int I00000oIO;
                public Object I00000oOI;

                public O100loO1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    boolean z;
                    int iMax;
                    int iMax2;
                    int i;
                    int i2;
                    OO1I0001000i oO1I0001000iI001lllioOl;
/* 7 */             int i3 = this.I00000oIO;
/* 12 */            Map map = Il011I1OiO0I.I00iOIl;
                    switch (i3) {
                        case 0:
/* 559 */                   int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 563 */                   int iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 571 */                   IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(24);
/* 574 */                   iiioilIl1Il.I00iiI = list;
/* 576 */                   iiioilIl1Il.I00iiO = this;
/* 578 */                   VarHandle.storeStoreFence();
/* 581 */                   return o1iOIoOiO0.I001i1lo1io(iI000OiO, iI000OOo1O, map, iiioilIl1Il);
                        case 1:
/* 180 */                   Ol111o0 ol111o0 = (Ol111o0) this.I00000oOI;
/* 182 */                   int i4 = ol111o0.I00000oIO;
/* 184 */                   float[] fArr = ol111o0.I000O01llI0;
/* 189 */                   int size = list.size();
/* 193 */                   int i5 = 0;
                            while (true) {
/* 194 */                       if (i5 < size) {
/* 200 */                           O1iIo0ll o1iIo0ll = (O1iIo0ll) list.get(i5);
/* 208 */                           if (iIoIOo00o.I00000oIO(o1iIo0ll) == Ol100II1.I00iOIl) {
/* 210 */                               OO1I0001000i oO1I0001000iI001lllioOl2 = o1iIo0ll.I001lllioOl(j);
/* 217 */                               int size2 = list.size();
/* 222 */                               for (int i6 = 0; i6 < size2; i6++) {
/* 228 */                                   O1iIo0ll o1iIo0ll2 = (O1iIo0ll) list.get(i6);
/* 236 */                                   if (iIoIOo00o.I00000oIO(o1iIo0ll2) == Ol100II1.I00iiI) {
/* 293 */                                       OO1I0001000i oO1I0001000iI001lllioOl3 = ol111o0.I0000Il00O() ? o1iIo0ll2.I001lllioOl(IOo0oO11ll1O.I0000Il00O(IOo0olo.I000OiO(0, -oO1I0001000iI001lllioOl2.I00iiI, 1, j), 0, 0, 0, 0, 14)) : o1iIo0ll2.I001lllioOl(IOo0oO11ll1O.I0000Il00O(IOo0olo.I000OiO(-oO1I0001000iI001lllioOl2.I00iOIl, 0, 2, j), 0, 0, 0, 0, 11));
/* 299 */                                       OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 304 */                                       OOo0ll111 oOo0ll1112 = new OOo0ll111();
/* 307 */                                       float fI00000oOI = ol111o0.I00000oOI();
/* 326 */                                       if (O0000Ioio00.I0000Il00O(fI00000oOI, fArr.length == 0 ? null : Float.valueOf(fArr[0]))) {
/* 350 */                                           z = true;
                                                } else if (!O0000Ioio00.I0000Il00O(fI00000oOI, fArr.length == 0 ? null : Float.valueOf(fArr[fArr.length - 1]))) {
/* 348 */                                           z = false;
                                                }
/* 353 */                                       int iI00OilO00Il = oO1I0001000iI001lllioOl3.I00OilO00Il(Ol10ooO01IO.I00000oIO);
/* 359 */                                       int i7 = iI00OilO00Il != Integer.MIN_VALUE ? iI00OilO00Il : 0;
/* 362 */                                       int i8 = oO1I0001000iI001lllioOl2.I00iOIl;
/* 364 */                                       int i9 = oO1I0001000iI001lllioOl2.I00iiI;
/* 366 */                                       boolean zI0000Il00O = ol111o0.I0000Il00O();
/* 372 */                                       int i10 = oO1I0001000iI001lllioOl3.I00iOIl;
/* 374 */                                       if (zI0000Il00O) {
/* 376 */                                           iMax = Math.max(i10, i8);
/* 380 */                                           int i11 = oO1I0001000iI001lllioOl3.I00iiI;
/* 382 */                                           iMax2 = i9 + i11;
/* 388 */                                           i = (iMax - oO1I0001000iI001lllioOl3.I00iOIl) / 2;
/* 390 */                                           i2 = i9 / 2;
/* 400 */                                           oOo0ll111.I00iOIl = (iMax - oO1I0001000iI001lllioOl2.I00iOIl) / 2;
/* 430 */                                           oOo0ll1112.I00iOIl = (i2 - (oO1I0001000iI001lllioOl2.I00iiI / 2)) + ((i4 <= 0 || z) ? O1OooO0IlOo.I000II(i11 * fI00000oOI) : O1OooO0IlOo.I000II((i11 - (i7 * 2)) * fI00000oOI) + i7);
                                                } else {
/* 435 */                                           iMax = i10 + i8;
/* 438 */                                           iMax2 = Math.max(oO1I0001000iI001lllioOl3.I00iiI, i9);
/* 442 */                                           i = i8 / 2;
/* 448 */                                           i2 = (iMax2 - oO1I0001000iI001lllioOl3.I00iiI) / 2;
/* 481 */                                           oOo0ll111.I00iOIl = (((i4 <= 0 || z) ? O1OooO0IlOo.I000II(oO1I0001000iI001lllioOl3.I00iOIl * fI00000oOI) : O1OooO0IlOo.I000II((oO1I0001000iI001lllioOl3.I00iOIl - (i7 * 2)) * fI00000oOI) + i7) + i) - (oO1I0001000iI001lllioOl2.I00iOIl / 2);
/* 489 */                                           oOo0ll1112.I00iOIl = (iMax2 - oO1I0001000iI001lllioOl2.I00iiI) / 2;
                                                }
/* 493 */                                       ol111o0.I000OOo1O.I000O01llI0(iMax);
/* 498 */                                       ol111o0.I000OiO.I000O01llI0(iMax2);
/* 504 */                                       II1oOo01OlOl iI1oOo01OlOl = new II1oOo01OlOl(1);
/* 507 */                                       iI1oOo01OlOl.I00iiI = oO1I0001000iI001lllioOl3;
/* 509 */                                       iI1oOo01OlOl.I00iiO = i;
/* 511 */                                       iI1oOo01OlOl.I00iio = i2;
/* 513 */                                       iI1oOo01OlOl.I00ilI0I1 = oO1I0001000iI001lllioOl2;
/* 515 */                                       iI1oOo01OlOl.I00ilO0 = oOo0ll111;
/* 517 */                                       iI1oOo01OlOl.I00io1l = oOo0ll1112;
/* 519 */                                       VarHandle.storeStoreFence();
/* 522 */                                       return o1iOIoOiO0.I001i1lo1io(iMax, iMax2, map, iI1oOo01OlOl);
                                            }
                                        }
/* 534 */                               O10lllI0o0.I00000oOI("Collection contains no element matching the predicate.");
/* 537 */                               IOOlIIilOl0.I0000Il00O();
                                    } else {
/* 544 */                               i5++;
                                    }
                                } else {
/* 549 */                           O10lllI0o0.I00000oOI("Collection contains no element matching the predicate.");
/* 552 */                           IOOlIIilOl0.I0000Il00O();
                                }
                            }
/* 540 */                   return null;
                        default:
/* 22 */                    if (((IlliIl1l11O) this.I00000oOI) != null) {
/* 27 */                        int size3 = list.size();
/* 32 */                        for (int i12 = 0; i12 < size3; i12++) {
/* 39 */                            O1iIo0ll o1iIo0ll3 = (O1iIo0ll) list.get(i12);
/* 51 */                            if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO(o1iIo0ll3), "text")) {
/* 65 */                                oO1I0001000iI001lllioOl = o1iIo0ll3.I001lllioOl(IOo0oO11ll1O.I0000Il00O(j, 0, 0, 0, 0, 11));
                                    }
                                }
/* 75 */                        O10lllI0o0.I00000oOI("Collection contains no element matching the predicate.");
/* 78 */                        IOOlIIilOl0.I0000Il00O();
/* 14 */                        return null;
                            }
/* 82 */                    oO1I0001000iI001lllioOl = null;
/* 89 */                    int iMax3 = Math.max(oO1I0001000iI001lllioOl != null ? oO1I0001000iI001lllioOl.I00iOIl : 0, 0);
/* 117 */                   int iMax4 = Math.max(o1iOIoOiO0.I00l0OO0IO(OOIOOl1oOOO.I0000oI00), o1iOIoOiO0.I00iio(lOlilO1lOIO.I0000O(20)) + 0 + (oO1I0001000iI001lllioOl != null ? oO1I0001000iI001lllioOl.I00iiI : 0));
/* 134 */                   Integer numValueOf = oO1I0001000iI001lllioOl != null ? Integer.valueOf(oO1I0001000iI001lllioOl.I00OilO00Il(I0l00ioI.I00000oIO)) : null;
/* 148 */                   Integer numValueOf2 = oO1I0001000iI001lllioOl != null ? Integer.valueOf(oO1I0001000iI001lllioOl.I00OilO00Il(I0l00ioI.I00000oOI)) : null;
/* 151 */                   Olll01OlI1ii olll01OlI1ii = new Olll01OlI1ii();
/* 154 */                   olll01OlI1ii.I00iOIl = oO1I0001000iI001lllioOl;
/* 156 */                   olll01OlI1ii.I00iiI = null;
/* 158 */                   olll01OlI1ii.I00iiO = o1iOIoOiO0;
/* 160 */                   olll01OlI1ii.I00iio = iMax3;
/* 162 */                   olll01OlI1ii.I00ilI0I1 = iMax4;
/* 164 */                   olll01OlI1ii.I00ilO0 = numValueOf;
/* 166 */                   olll01OlI1ii.I00io1l = numValueOf2;
/* 168 */                   VarHandle.storeStoreFence();
/* 171 */                   return o1iOIoOiO0.I001i1lo1io(iMax3, iMax4, map, olll01OlI1ii);
                    }
                }
            }
