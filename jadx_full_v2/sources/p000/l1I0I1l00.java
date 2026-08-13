            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.UUID;
            
            public abstract class l1I0I1l00 {
                /* JADX WARN: Removed duplicated region for block: B:109:0x0262  */
                /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x01d7 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(Oi1O00I1 oi1O00I1, I1Oi1Oi0O i1Oi1Oi0O, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    O1ooiI111i o1ooiI111i3;
                    boolean z;
                    Object objI00O0i0ii;
                    List listSingletonList;
                    O1ooiI111i o1ooiI111i4;
                    O1ooiI111i o1ooiI111i5;
                    Integer num;
                    int i4;
                    List list;
                    boolean z2;
                    Integer numValueOf;
                    O1ooiI111i o1ooiI111i6;
                    OOloioIl oOloioIlI001IO000;
/* 1 */             Oi1O00I1 oi1O00I12 = oi1O00I1;
/* 14 */            iloI0lOlll1.I00i0O(1311725673);
/* 19 */            if ((i & 6) == 0) {
/* 30 */                i3 = (iloI0lOlll1.I000II(oi1O00I12) ? 4 : 2) | i;
                    } else {
/* 32 */                i3 = i;
                    }
/* 39 */            if ((i & 48) == 0) {
/* 50 */                i3 |= iloI0lOlll1.I000II(i1Oi1Oi0O) ? 32 : 16;
                    }
/* 51 */            int i5 = i2 & 2;
/* 53 */            if (i5 == 0) {
/* 62 */                if ((i & 384) == 0) {
/* 64 */                    o1ooiI111i2 = o1ooiI111i;
/* 77 */                    i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 82 */                if ((i3 & 147) == 146 || !iloI0lOlll1.I00IO1()) {
/* 102 */                   o1ooiI111i3 = i5 == 0 ? O1ooIo101ll.I00000oIO : o1ooiI111i2;
/* 106 */                   iloI0lOlll1.I00i01iIIliI(-2075087027);
/* 112 */                   int i6 = 1;
/* 117 */                   z = (i3 & 112) != 32;
/* 118 */                   objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 122 */                   if (!z || objI00O0i0ii == IOl11li.I00000oIO) {
/* 137 */                       IIlio101Io iIlio101Io = new IIlio101Io(23);
/* 145 */                       iIlio101Io.I00iiI = new I11110OIl(16);
/* 149 */                       I11110OIl i11110OIl = (I11110OIl) iIlio101Io.I00iiI;
/* 156 */                       iIlio101Io.I00iiO = new LinkedHashMap();
/* 160 */                       LinkedHashMap linkedHashMap = (LinkedHashMap) iIlio101Io.I00iiO;
/* 162 */                       VarHandle.storeStoreFence();
/* 171 */                       listSingletonList = Collections.singletonList(new I1OiII0(i1Oi1Oi0O, false, null));
/* 182 */                       while (!listSingletonList.isEmpty()) {
/* 188 */                           I1OiII0 i1OiII0 = (I1OiII0) IOOi0Ool1i.I001lllioOl(listSingletonList);
/* 190 */                           I1Oi1Oi0O i1Oi1Oi0O2 = i1OiII0.I00000oIO;
/* 192 */                           boolean z3 = i1OiII0.I00000oOI;
/* 194 */                           Integer num2 = i1OiII0.I0000Il00O;
/* 196 */                           iOOO0ooiIo iooo0ooiio = i1Oi1Oi0O2.I00000oIO;
/* 200 */                           listSingletonList = IOOi0Ool1i.I001iOo1i0O(listSingletonList, i6);
/* 204 */                           if (z3) {
/* 531 */                               o1ooiI111i5 = o1ooiI111i3;
/* 535 */                               num = num2;
/* 539 */                               i4 = i6;
                                    } else {
/* 206 */                               boolean z4 = iooo0ooiio instanceof I1OIIO1OiO;
/* 208 */                               if (z4) {
/* 212 */                                   int iI00oooO = iIlio101Io.I00oooO(Oi1O0O.I0000O);
/* 221 */                                   i11110OIl.I0000O(((I1OIIO1OiO) iooo0ooiio).I00000oIO);
/* 224 */                                   i11110OIl.I0001Ioi1lo(iI00oooO);
/* 227 */                                   o1ooiI111i5 = o1ooiI111i3;
/* 229 */                                   list = listSingletonList;
/* 231 */                                   z2 = z4;
/* 233 */                                   num = num2;
/* 235 */                                   numValueOf = null;
                                        } else {
/* 241 */                                   if (iooo0ooiio instanceof I1OIiIiI0) {
/* 249 */                                       numValueOf = Integer.valueOf(iIlio101Io.I00oooO(Oi1O0l.I0000O));
                                            } else if (iooo0ooiio instanceof I1OiioO) {
/* 272 */                                       numValueOf = Integer.valueOf(iIlio101Io.I00oooO(Oi1OI0iOlOO.I0000O));
                                            } else {
/* 279 */                                       if (iooo0ooiio instanceof I1OO11iI) {
/* 285 */                                           o1ooiI111i5 = o1ooiI111i3;
/* 289 */                                           O0o01OIl o0o01OIl = new O0o01OIl(11);
/* 294 */                                           list = listSingletonList;
/* 297 */                                           I1oiiOOli1I i1oiiOOli1I = new I1oiiOOli1I(2);
/* 300 */                                           i1oiiOOli1I.I00iiI = iooo0ooiio;
/* 302 */                                           VarHandle.storeStoreFence();
/* 307 */                                           z2 = z4;
/* 312 */                                           num = num2;
/* 319 */                                           Ioll0ll0 ioll0ll0 = new Ioll0ll0(o0o01OIl, new IOii1l(786218717, i1oiiOOli1I, true), 2);
/* 326 */                                           String string = UUID.randomUUID().toString();
/* 336 */                                           linkedHashMap.put("inline:".concat(string), ioll0ll0);
/* 341 */                                           ioo10l.I00000oIO(i11110OIl, string, "�");
                                                } else {
/* 346 */                                           o1ooiI111i5 = o1ooiI111i3;
/* 348 */                                           list = listSingletonList;
/* 350 */                                           z2 = z4;
/* 352 */                                           num = num2;
/* 357 */                                           if (iooo0ooiio instanceof I1OOii) {
/* 373 */                                               numValueOf = Integer.valueOf(iIlio101Io.I00oooO(new Oi1O1o(((I1OOii) iooo0ooiio).I00000oIO)));
                                                    } else if (iooo0ooiio instanceof I1Oiil0I00lO) {
/* 384 */                                               i11110OIl.I0000O(" ");
                                                    } else if (iooo0ooiio instanceof I1OIo1) {
/* 394 */                                               i11110OIl.I0000O("\n");
                                                    } else if (iooo0ooiio instanceof I1OilliO0oO0) {
/* 408 */                                               numValueOf = Integer.valueOf(iIlio101Io.I00oooO(Oi1O00i0o1.I0000O));
                                                    } else if (iooo0ooiio instanceof I1Ol1OO10Oo) {
/* 422 */                                               i11110OIl.I0000O(((I1Ol1OO10Oo) iooo0ooiio).I00000oIO);
                                                    } else if (iooo0ooiio instanceof I1OOooOO) {
/* 444 */                                               numValueOf = Integer.valueOf(iIlio101Io.I00oooO(new Oi1O1o(((I1OOooOO) iooo0ooiio).I00000oOI)));
                                                    }
/* 464 */                                           ArrayList arrayListI00O10llo = IOOi0Ool1i.I00O10llo(Collections.singletonList(new I1OiII0(i1Oi1Oi0O2, true, numValueOf)), list);
/* 470 */                                           if ((iooo0ooiio instanceof I1Ol1OO10Oo) || z2 || (iooo0ooiio instanceof I1OO11iI) || (iooo0ooiio instanceof I1Oiil0I00lO) || (iooo0ooiio instanceof I1OIo1)) {
/* 487 */                                               i4 = 1;
                                                    } else {
/* 489 */                                               i4 = 1;
/* 494 */                                               Iterator it = lOo1ilOiIio1.I00000oIO(i1Oi1Oi0O2, true).iterator();
/* 502 */                                               while (it.hasNext()) {
/* 523 */                                                   arrayListI00O10llo = IOOi0Ool1i.I00O10llo(Collections.singletonList(new I1OiII0((I1Oi1Oi0O) it.next(), false, null)), arrayListI00O10llo);
                                                        }
                                                    }
/* 529 */                                           listSingletonList = arrayListI00O10llo;
                                                }
/* 344 */                                       numValueOf = null;
/* 464 */                                       ArrayList arrayListI00O10llo2 = IOOi0Ool1i.I00O10llo(Collections.singletonList(new I1OiII0(i1Oi1Oi0O2, true, numValueOf)), list);
/* 470 */                                       if (iooo0ooiio instanceof I1Ol1OO10Oo) {
/* 487 */                                           i4 = 1;
/* 529 */                                           listSingletonList = arrayListI00O10llo2;
                                                }
                                            }
/* 253 */                                   o1ooiI111i5 = o1ooiI111i3;
/* 255 */                                   list = listSingletonList;
/* 257 */                                   z2 = z4;
/* 259 */                                   num = num2;
                                        }
/* 464 */                               ArrayList arrayListI00O10llo22 = IOOi0Ool1i.I00O10llo(Collections.singletonList(new I1OiII0(i1Oi1Oi0O2, true, numValueOf)), list);
/* 470 */                               if (iooo0ooiio instanceof I1Ol1OO10Oo) {
                                        }
                                    }
/* 540 */                           if (num != null) {
/* 546 */                               i11110OIl.I0001Ioi1lo(num.intValue());
                                    }
/* 552 */                           i6 = i4;
/* 553 */                           o1ooiI111i3 = o1ooiI111i5;
                                }
/* 557 */                       o1ooiI111i4 = o1ooiI111i3;
/* 561 */                       I1111OO10i i1111OO10iI000OiO = i11110OIl.I000OiO();
/* 565 */                       Map mapI000iOII = O1Oii0O0loo.I000iOII(linkedHashMap);
/* 569 */                       Oi1Oi0 oi1Oi0 = new Oi1Oi0();
/* 572 */                       oi1Oi0.I00000oIO = i1111OO10iI000OiO;
/* 574 */                       oi1Oi0.I00000oOI = mapI000iOII;
/* 576 */                       VarHandle.storeStoreFence();
/* 579 */                       iloI0lOlll1.I00iio(oi1Oi0);
/* 582 */                       objI00O0i0ii = oi1Oi0;
                            } else {
/* 129 */                       o1ooiI111i4 = o1ooiI111i3;
                            }
/* 586 */                   iloI0lOlll1.I0010I0i(false);
/* 598 */                   oi1O00I12 = oi1O00I1;
/* 600 */                   o1ooiI111i6 = o1ooiI111i4;
/* 602 */                   lOlOlI.I00000oIO(oi1O00I12, (Oi1Oi0) objI00O0i0ii, o1ooiI111i6, null, false, 0, 0, iloI0lOlll1, i3 & 910, 60);
                        } else {
/* 91 */                    iloI0lOlll1.I00OilO00Il();
/* 94 */                    o1ooiI111i6 = o1ooiI111i2;
                        }
/* 605 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 609 */               if (oOloioIlI001IO000 == null) {
/* 614 */                   I0O0Ol1O0O i0O0Ol1O0O = new I0O0Ol1O0O(6);
/* 617 */                   i0O0Ol1O0O.I00ilI0I1 = oi1O00I12;
/* 619 */                   i0O0Ol1O0O.I00iiI = i1Oi1Oi0O;
/* 621 */                   i0O0Ol1O0O.I00ilO0 = o1ooiI111i6;
/* 623 */                   i0O0Ol1O0O.I00iiO = i;
/* 625 */                   i0O0Ol1O0O.I00iio = i2;
/* 627 */                   VarHandle.storeStoreFence();
/* 630 */                   oOloioIlI001IO000.I0000O = i0O0Ol1O0O;
/* 1294 */                  return;
                        }
/* 1294 */              return;
                    }
/* 55 */            i3 |= 384;
/* 57 */            o1ooiI111i2 = o1ooiI111i;
/* 82 */            if ((i3 & 147) == 146) {
/* 102 */               if (i5 == 0) {
                        }
/* 106 */               iloI0lOlll1.I00i01iIIliI(-2075087027);
/* 112 */               int i62 = 1;
/* 117 */               if ((i3 & 112) != 32) {
                        }
/* 118 */               objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 122 */               if (z) {
/* 137 */                   IIlio101Io iIlio101Io2 = new IIlio101Io(23);
/* 145 */                   iIlio101Io2.I00iiI = new I11110OIl(16);
/* 149 */                   I11110OIl i11110OIl2 = (I11110OIl) iIlio101Io2.I00iiI;
/* 156 */                   iIlio101Io2.I00iiO = new LinkedHashMap();
/* 160 */                   LinkedHashMap linkedHashMap2 = (LinkedHashMap) iIlio101Io2.I00iiO;
/* 162 */                   VarHandle.storeStoreFence();
/* 171 */                   listSingletonList = Collections.singletonList(new I1OiII0(i1Oi1Oi0O, false, null));
/* 182 */                   while (!listSingletonList.isEmpty()) {
                            }
/* 557 */                   o1ooiI111i4 = o1ooiI111i3;
/* 561 */                   I1111OO10i i1111OO10iI000OiO2 = i11110OIl2.I000OiO();
/* 565 */                   Map mapI000iOII2 = O1Oii0O0loo.I000iOII(linkedHashMap2);
/* 569 */                   Oi1Oi0 oi1Oi02 = new Oi1Oi0();
/* 572 */                   oi1Oi02.I00000oIO = i1111OO10iI000OiO2;
/* 574 */                   oi1Oi02.I00000oOI = mapI000iOII2;
/* 576 */                   VarHandle.storeStoreFence();
/* 579 */                   iloI0lOlll1.I00iio(oi1Oi02);
/* 582 */                   objI00O0i0ii = oi1Oi02;
/* 586 */                   iloI0lOlll1.I0010I0i(false);
/* 598 */                   oi1O00I12 = oi1O00I1;
/* 600 */                   o1ooiI111i6 = o1ooiI111i4;
/* 602 */                   lOlOlI.I00000oIO(oi1O00I12, (Oi1Oi0) objI00O0i0ii, o1ooiI111i6, null, false, 0, 0, iloI0lOlll1, i3 & 910, 60);
                        }
                    }
/* 605 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 609 */           if (oOloioIlI001IO000 == null) {
                    }
                }
            }
