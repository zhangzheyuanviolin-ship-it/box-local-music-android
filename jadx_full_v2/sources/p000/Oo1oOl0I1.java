            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class Oo1oOl0I1 implements O1iOIl0o10 {
                public IlOOiIO I00000oIO;
                public II0IlloOiO0i I00000oOI;
                public float I0000Il00O;
                public OIo1Oi1l1lI I0000O;

                @Override
                public final int I00000oIO(IoooOl1001li ioooOl1001li, List list, int i) {
/* 4 */             int size = list.size();
/* 9 */             int iI001iOo1i0O = 0;
/* 10 */            for (int i2 = 0; i2 < size; i2++) {
/* 22 */                iI001iOo1i0O += ((O1iIo0ll) list.get(i2)).I001iOo1i0O(i);
                    }
/* 98 */            return iI001iOo1i0O;
                }

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    int iI000OiO;
/* 7 */             OIo1Oi1l1lI oIo1Oi1l1lI = this.I0000O;
/* 12 */            int size = list.size();
/* 21 */            for (int i = 0; i < size; i++) {
/* 27 */                O1iIo0ll o1iIo0ll = (O1iIo0ll) list.get(i);
/* 39 */                if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO(o1iIo0ll), "navigationIcon")) {
/* 54 */                    OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0oO11ll1O.I0000Il00O(j, 0, 0, 0, 0, 14));
/* 59 */                    List list2 = list;
/* 61 */                    int size2 = list2.size();
/* 66 */                    for (int i2 = 0; i2 < size2; i2++) {
/* 72 */                        O1iIo0ll o1iIo0ll2 = (O1iIo0ll) list.get(i2);
/* 84 */                        if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO(o1iIo0ll2), "actionIcons")) {
/* 102 */                           OO1I0001000i oO1I0001000iI001lllioOl2 = o1iIo0ll2.I001lllioOl(IOo0oO11ll1O.I0000Il00O(j, 0, 0, 0, 0, 14));
/* 110 */                           float fI0000O = iO01II.I0000O(oIo1Oi1l1lI, o1iOIoOiO0.getLayoutDirection());
/* 118 */                           float fI0000Il00O = iO01II.I0000Il00O(oIo1Oi1l1lI, o1iOIoOiO0.getLayoutDirection());
/* 130 */                           int iMax = Math.max(o1iOIoOiO0.I00l0OO0IO(I11i1lloiiO.I00000oIO), oO1I0001000iI001lllioOl.I00iOIl);
/* 141 */                           if (IOo0oO11ll1O.I000OiO(j) == Integer.MAX_VALUE) {
/* 143 */                               iI000OiO = IOo0oO11ll1O.I000OiO(j);
                                    } else {
/* 167 */                               int iI000OiO2 = (((IOo0oO11ll1O.I000OiO(j) - iMax) - oO1I0001000iI001lllioOl2.I00iOIl) - o1iOIoOiO0.I00l0OO0IO(fI0000O)) - o1iOIoOiO0.I00l0OO0IO(fI0000Il00O);
/* 172 */                               iI000OiO = iI000OiO2 < 0 ? 0 : iI000OiO2;
                                    }
/* 147 */                           int i3 = iI000OiO;
/* 174 */                           int size3 = list2.size();
/* 179 */                           for (int i4 = 0; i4 < size3; i4++) {
/* 185 */                               O1iIo0ll o1iIo0ll3 = (O1iIo0ll) list.get(i4);
/* 197 */                               if (O0000Ioio00.I0000O(iIoIOo00o.I00000oIO(o1iIo0ll3), "title")) {
/* 213 */                                   OO1I0001000i oO1I0001000iI001lllioOl3 = o1iIo0ll3.I001lllioOl(IOo0oO11ll1O.I0000Il00O(j, 0, i3, 0, 0, 12));
/* 217 */                                   IoI110lO0O ioI110lO0O = I0l00ioI.I00000oOI;
/* 225 */                                   if (oO1I0001000iI001lllioOl3.I00OilO00Il(ioI110lO0O) != Integer.MIN_VALUE) {
/* 227 */                                       oO1I0001000iI001lllioOl3.I00OilO00Il(ioI110lO0O);
                                            }
/* 232 */                                   float fInvoke = this.I00000oIO.invoke();
/* 244 */                                   int iI000II = Float.isNaN(fInvoke) ? 0 : O1OooO0IlOo.I000II(fInvoke);
/* 277 */                                   int iMax2 = Math.max(o1iOIoOiO0.I00l0OO0IO(this.I0000Il00O), oO1I0001000iI001lllioOl3.I00iiI) + o1iOIoOiO0.I00l0OO0IO(oIo1Oi1l1lI.I0000O()) + o1iOIoOiO0.I00l0OO0IO(oIo1Oi1l1lI.I00000oIO());
/* 282 */                                   if (IOo0oO11ll1O.I000OOo1O(j) != Integer.MAX_VALUE) {
/* 285 */                                       int i5 = iMax2 + iI000II;
/* 286 */                                       iMax2 = i5 >= 0 ? i5 : 0;
                                            }
/* 295 */                                   int iI00l0OO0IO = o1iOIoOiO0.I00l0OO0IO(oIo1Oi1l1lI.I0000O());
/* 303 */                                   int iI00l0OO0IO2 = o1iOIoOiO0.I00l0OO0IO(oIo1Oi1l1lI.I00000oIO());
/* 315 */                                   int iI00l0OO0IO3 = o1iOIoOiO0.I00l0OO0IO(iO01II.I0000O(oIo1Oi1l1lI, o1iOIoOiO0.getLayoutDirection()));
/* 327 */                                   int iI00l0OO0IO4 = o1iOIoOiO0.I00l0OO0IO(iO01II.I0000Il00O(oIo1Oi1l1lI, o1iOIoOiO0.getLayoutDirection()));
/* 332 */                                   int i6 = (iI00l0OO0IO + iMax2) - iI00l0OO0IO2;
/* 333 */                                   int iI000OiO3 = IOo0oO11ll1O.I000OiO(j);
/* 339 */                                   Oo1oOiii0l oo1oOiii0l = new Oo1oOiii0l();
/* 342 */                                   oo1oOiii0l.I00iOIl = oO1I0001000iI001lllioOl;
/* 344 */                                   oo1oOiii0l.I00iiI = iI00l0OO0IO3;
/* 346 */                                   oo1oOiii0l.I00iiO = i6;
/* 348 */                                   oo1oOiii0l.I00iio = oO1I0001000iI001lllioOl3;
/* 350 */                                   oo1oOiii0l.I00ilI0I1 = oO1I0001000iI001lllioOl2;
/* 354 */                                   oo1oOiii0l.I00ilO0 = j;
/* 356 */                                   oo1oOiii0l.I00io1l = iI00l0OO0IO4;
/* 358 */                                   oo1oOiii0l.I00ioIO = this;
/* 360 */                                   VarHandle.storeStoreFence();
/* 365 */                                   return o1iOIoOiO0.I001i1lo1io(iI000OiO3, iMax2, Il011I1OiO0I.I00iOIl, oo1oOiii0l);
                                        }
                                    }
/* 376 */                           O10lllI0o0.I00000oOI("Collection contains no element matching the predicate.");
/* 379 */                           IOOlIIilOl0.I0000Il00O();
/* 18 */                            return null;
                                }
                            }
/* 389 */                   O10lllI0o0.I00000oOI("Collection contains no element matching the predicate.");
/* 392 */                   IOOlIIilOl0.I0000Il00O();
/* 18 */                    return null;
                        }
                    }
/* 402 */           O10lllI0o0.I00000oOI("Collection contains no element matching the predicate.");
/* 405 */           IOOlIIilOl0.I0000Il00O();
/* 18 */            return null;
                }

                @Override
                public final int I0000Il00O(IoooOl1001li ioooOl1001li, List list, int i) {
/* 4 */             int size = list.size();
/* 9 */             int iI000l1 = 0;
/* 10 */            for (int i2 = 0; i2 < size; i2++) {
/* 22 */                iI000l1 += ((O1iIo0ll) list.get(i2)).I000l1(i);
                    }
/* 98 */            return iI000l1;
                }

                @Override
                public final int I0000O(IoooOl1001li ioooOl1001li, List list, int i) {
                    Integer numValueOf;
/* 3 */             int iI00l0OO0IO = ioooOl1001li.I00l0OO0IO(this.I0000Il00O);
/* 12 */            if (list.isEmpty()) {
/* 14 */                numValueOf = null;
                    } else {
/* 26 */                numValueOf = Integer.valueOf(((O1iIo0ll) list.get(0)).I0000Il00O(i));
/* 30 */                int iI000II = IOOi1I.I000II(list);
/* 34 */                int i2 = 1;
/* 35 */                if (1 <= iI000II) {
                            while (true) {
/* 47 */                        Integer numValueOf2 = Integer.valueOf(((O1iIo0ll) list.get(i2)).I0000Il00O(i));
/* 55 */                        if (numValueOf2.compareTo(numValueOf) > 0) {
/* 57 */                            numValueOf = numValueOf2;
                                }
/* 58 */                        if (i2 == iI000II) {
                                    break;
                                }
/* 60 */                        i2++;
                            }
                        }
                    }
/* 69 */            return Math.max(iI00l0OO0IO, numValueOf != null ? numValueOf.intValue() : 0);
                }

                @Override
                public final int I0000oI00(IoooOl1001li ioooOl1001li, List list, int i) {
                    Integer numValueOf;
/* 3 */             int iI00l0OO0IO = ioooOl1001li.I00l0OO0IO(this.I0000Il00O);
/* 12 */            if (list.isEmpty()) {
/* 14 */                numValueOf = null;
                    } else {
/* 26 */                numValueOf = Integer.valueOf(((O1iIo0ll) list.get(0)).I00OI1(i));
/* 30 */                int iI000II = IOOi1I.I000II(list);
/* 34 */                int i2 = 1;
/* 35 */                if (1 <= iI000II) {
                            while (true) {
/* 47 */                        Integer numValueOf2 = Integer.valueOf(((O1iIo0ll) list.get(i2)).I00OI1(i));
/* 55 */                        if (numValueOf2.compareTo(numValueOf) > 0) {
/* 57 */                            numValueOf = numValueOf2;
                                }
/* 58 */                        if (i2 == iI000II) {
                                    break;
                                }
/* 60 */                        i2++;
                            }
                        }
                    }
/* 69 */            return Math.max(iI00l0OO0IO, numValueOf != null ? numValueOf.intValue() : 0);
                }
            }
