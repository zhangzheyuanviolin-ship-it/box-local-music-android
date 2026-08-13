            package p000;

            import java.util.List;
            
            public final class I10l0oo1oO implements O1iOIl0o10 {
                public I10llI0II11l I00000oIO;
                public OO1I0001000i[] I00000oOI;
                public OO1I0001000i[] I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public I10l0iiI10I I000O01llI0;
                public I10l0iiI10I I000OOo1O;

                @Override
                public final int I00000oIO(IoooOl1001li ioooOl1001li, List list, int i) {
                    Integer numValueOf;
/* 6 */             if (list.isEmpty()) {
/* 8 */                 numValueOf = null;
                    } else {
/* 20 */                numValueOf = Integer.valueOf(((O1iIo0ll) list.get(0)).I001iOo1i0O(i));
/* 24 */                int iI000II = IOOi1I.I000II(list);
/* 28 */                int i2 = 1;
/* 29 */                if (1 <= iI000II) {
                            while (true) {
/* 41 */                        Integer numValueOf2 = Integer.valueOf(((O1iIo0ll) list.get(i2)).I001iOo1i0O(i));
/* 49 */                        if (numValueOf2.compareTo(numValueOf) > 0) {
/* 51 */                            numValueOf = numValueOf2;
                                }
/* 52 */                        if (i2 == iI000II) {
                                    break;
                                }
/* 54 */                        i2++;
                            }
                        }
                    }
/* 57 */            if (numValueOf != null) {
/* 59 */                return numValueOf.intValue();
                    }
/* 5 */             return 0;
                }

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    OIoi0IIoi oIoi0IIoi;
/* 9 */             I10llI0II11l i10llI0II11l = this.I00000oIO;
/* 11 */            int size = list.size();
/* 15 */            OO1I0001000i[] oO1I0001000iArr = new OO1I0001000i[size];
/* 18 */            List list2 = list;
/* 20 */            int size2 = list2.size();
/* 24 */            long j2 = 0;
/* 29 */            for (int i = 0; i < size2; i++) {
/* 37 */                O1iIo0ll o1iIo0ll = (O1iIo0ll) list.get(i);
/* 44 */                Object objI00II0Ol1O0l = o1iIo0ll.I00II0Ol1O0l();
/* 56 */                I10l1ooOi i10l1ooOi = objI00II0Ol1O0l instanceof I10l1ooOi ? (I10l1ooOi) objI00II0Ol1O0l : null;
/* 57 */                if (i10l1ooOi != null && ((Boolean) i10l1ooOi.I00000oIO.getValue()).booleanValue()) {
/* 89 */                    oO1I0001000iArr[i] = o1iIo0ll.I001lllioOl(j);
/* 88 */                    j2 = (r10.I00iiI & 4294967295L) | (r10.I00iOIl << 32);
                        }
                    }
/* 100 */           int size3 = list2.size();
/* 105 */           for (int i2 = 0; i2 < size3; i2++) {
/* 111 */               O1iIo0ll o1iIo0ll2 = (O1iIo0ll) list.get(i2);
/* 115 */               if (oO1I0001000iArr[i2] == null) {
/* 121 */                   oO1I0001000iArr[i2] = o1iIo0ll2.I001lllioOl(j);
                        }
                    }
/* 130 */           if (o1iOIoOiO0.I00OloOo()) {
/* 148 */               oIoi0IIoi = new OIoi0IIoi(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
                    } else {
/* 152 */               int i3 = 0;
/* 153 */               int i4 = 0;
/* 155 */               for (int i5 = 0; i5 < size; i5++) {
/* 157 */                   OO1I0001000i oO1I0001000i = oO1I0001000iArr[i5];
/* 159 */                   if (oO1I0001000i != null) {
/* 169 */                       Object objI00II0Ol1O0l2 = ((O1iIo0ll) list.get(i5)).I00II0Ol1O0l();
/* 180 */                       I10l1ooOi i10l1ooOi2 = objI00II0Ol1O0l2 instanceof I10l1ooOi ? (I10l1ooOi) objI00II0Ol1O0l2 : null;
/* 181 */                       if (i10l1ooOi2 == null || !((Boolean) i10l1ooOi2.I00000oOI.getValue()).booleanValue()) {
/* 200 */                           int i6 = oO1I0001000i.I00iOIl;
/* 202 */                           if (i6 > i3) {
/* 204 */                               i3 = i6;
                                    }
/* 205 */                           int i7 = oO1I0001000i.I00iiI;
/* 207 */                           if (i7 > i4) {
/* 209 */                               i4 = i7;
                                    }
                                }
                            }
                        }
/* 223 */               oIoi0IIoi = new OIoi0IIoi(Integer.valueOf(i3), Integer.valueOf(i4));
                    }
/* 230 */           int iIntValue = ((Number) oIoi0IIoi.I00iOIl).intValue();
/* 238 */           int iIntValue2 = ((Number) oIoi0IIoi.I00iiI).intValue();
/* 242 */           boolean zI00OloOo = o1iOIoOiO0.I00OloOo();
/* 246 */           Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 248 */           if (zI00OloOo) {
/* 279 */               this.I00000oOI = oO1I0001000iArr;
/* 281 */               this.I0000O = iIntValue;
/* 283 */               this.I0001Ioi1lo = iIntValue2;
/* 287 */               return o1iOIoOiO0.I001i1lo1io(iIntValue, iIntValue2, il011I1OiO0I, this.I000O01llI0);
                    }
/* 263 */           i10llI0II11l.I0000O.setValue(IooOl0ol01.I00000oIO((iIntValue << 32) | (iIntValue2 & 4294967295L)));
/* 266 */           this.I0000Il00O = oO1I0001000iArr;
/* 268 */           this.I0000oI00 = iIntValue;
/* 270 */           this.I000II = iIntValue2;
/* 274 */           return o1iOIoOiO0.I001i1lo1io(iIntValue, iIntValue2, il011I1OiO0I, this.I000OOo1O);
                }

                @Override
                public final int I0000Il00O(IoooOl1001li ioooOl1001li, List list, int i) {
                    Integer numValueOf;
/* 6 */             if (list.isEmpty()) {
/* 8 */                 numValueOf = null;
                    } else {
/* 20 */                numValueOf = Integer.valueOf(((O1iIo0ll) list.get(0)).I000l1(i));
/* 24 */                int iI000II = IOOi1I.I000II(list);
/* 28 */                int i2 = 1;
/* 29 */                if (1 <= iI000II) {
                            while (true) {
/* 41 */                        Integer numValueOf2 = Integer.valueOf(((O1iIo0ll) list.get(i2)).I000l1(i));
/* 49 */                        if (numValueOf2.compareTo(numValueOf) > 0) {
/* 51 */                            numValueOf = numValueOf2;
                                }
/* 52 */                        if (i2 == iI000II) {
                                    break;
                                }
/* 54 */                        i2++;
                            }
                        }
                    }
/* 57 */            if (numValueOf != null) {
/* 59 */                return numValueOf.intValue();
                    }
/* 5 */             return 0;
                }

                @Override
                public final int I0000O(IoooOl1001li ioooOl1001li, List list, int i) {
                    Integer numValueOf;
/* 6 */             if (list.isEmpty()) {
/* 8 */                 numValueOf = null;
                    } else {
/* 20 */                numValueOf = Integer.valueOf(((O1iIo0ll) list.get(0)).I0000Il00O(i));
/* 24 */                int iI000II = IOOi1I.I000II(list);
/* 28 */                int i2 = 1;
/* 29 */                if (1 <= iI000II) {
                            while (true) {
/* 41 */                        Integer numValueOf2 = Integer.valueOf(((O1iIo0ll) list.get(i2)).I0000Il00O(i));
/* 49 */                        if (numValueOf2.compareTo(numValueOf) > 0) {
/* 51 */                            numValueOf = numValueOf2;
                                }
/* 52 */                        if (i2 == iI000II) {
                                    break;
                                }
/* 54 */                        i2++;
                            }
                        }
                    }
/* 57 */            if (numValueOf != null) {
/* 59 */                return numValueOf.intValue();
                    }
/* 5 */             return 0;
                }

                @Override
                public final int I0000oI00(IoooOl1001li ioooOl1001li, List list, int i) {
                    Integer numValueOf;
/* 6 */             if (list.isEmpty()) {
/* 8 */                 numValueOf = null;
                    } else {
/* 20 */                numValueOf = Integer.valueOf(((O1iIo0ll) list.get(0)).I00OI1(i));
/* 24 */                int iI000II = IOOi1I.I000II(list);
/* 28 */                int i2 = 1;
/* 29 */                if (1 <= iI000II) {
                            while (true) {
/* 41 */                        Integer numValueOf2 = Integer.valueOf(((O1iIo0ll) list.get(i2)).I00OI1(i));
/* 49 */                        if (numValueOf2.compareTo(numValueOf) > 0) {
/* 51 */                            numValueOf = numValueOf2;
                                }
/* 52 */                        if (i2 == iI000II) {
                                    break;
                                }
/* 54 */                        i2++;
                            }
                        }
                    }
/* 57 */            if (numValueOf != null) {
/* 59 */                return numValueOf.intValue();
                    }
/* 5 */             return 0;
                }
            }
