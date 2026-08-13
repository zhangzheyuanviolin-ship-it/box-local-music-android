            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class I10llll implements O1iOIl0o10 {
                public I10ooOlo I00000oIO;
                public boolean I00000oOI;

                @Override
                public final int I00000oIO(IoooOl1001li ioooOl1001li, List list, int i) {
/* 6 */             if (list.isEmpty()) {
/* 5 */                 return 0;
                    }
/* 15 */            int iI001iOo1i0O = ((O1iIo0ll) list.get(0)).I001iOo1i0O(i);
/* 19 */            int iI000II = IOOi1I.I000II(list);
/* 23 */            int i2 = 1;
/* 24 */            if (1 <= iI000II) {
                        while (true) {
/* 32 */                    int iI001iOo1i0O2 = ((O1iIo0ll) list.get(i2)).I001iOo1i0O(i);
/* 36 */                    if (iI001iOo1i0O2 > iI001iOo1i0O) {
/* 38 */                        iI001iOo1i0O = iI001iOo1i0O2;
                            }
/* 39 */                    if (i2 == iI000II) {
                                break;
                            }
/* 41 */                    i2++;
                        }
                    }
/* 98 */            return iI001iOo1i0O;
                }

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
/* 3 */             OIooliIO0 oIooliIO0 = this.I00000oIO.I00000oOI;
/* 11 */            ArrayList arrayList = new ArrayList(list.size());
/* 17 */            int size = list.size();
/* 22 */            int iMax = 0;
/* 23 */            int iMax2 = 0;
/* 24 */            for (int i = 0; i < size; i++) {
/* 32 */                OO1I0001000i oO1I0001000iI001lllioOl = ((O1iIo0ll) list.get(i)).I001lllioOl(j);
/* 38 */                iMax = Math.max(iMax, oO1I0001000iI001lllioOl.I00iOIl);
/* 44 */                iMax2 = Math.max(iMax2, oO1I0001000iI001lllioOl.I00iiI);
/* 48 */                arrayList.add(oO1I0001000iI001lllioOl);
                    }
/* 66 */            if (o1iOIoOiO0.I00OloOo()) {
/* 68 */                this.I00000oOI = true;
/* 80 */                oIooliIO0.setValue(IooOl0ol01.I00000oIO((iMax2 & 4294967295L) | (iMax << 32)));
                    } else if (!this.I00000oOI) {
/* 98 */                oIooliIO0.setValue(IooOl0ol01.I00000oIO((iMax2 & 4294967295L) | (iMax << 32)));
                    }
/* 108 */           return o1iOIoOiO0.I001i1lo1io(iMax, iMax2, Il011I1OiO0I.I00iOIl, new I10iOo0il1(arrayList, 1));
                }

                @Override
                public final int I0000Il00O(IoooOl1001li ioooOl1001li, List list, int i) {
/* 6 */             if (list.isEmpty()) {
/* 5 */                 return 0;
                    }
/* 15 */            int iI000l1 = ((O1iIo0ll) list.get(0)).I000l1(i);
/* 19 */            int iI000II = IOOi1I.I000II(list);
/* 23 */            int i2 = 1;
/* 24 */            if (1 <= iI000II) {
                        while (true) {
/* 32 */                    int iI000l12 = ((O1iIo0ll) list.get(i2)).I000l1(i);
/* 36 */                    if (iI000l12 > iI000l1) {
/* 38 */                        iI000l1 = iI000l12;
                            }
/* 39 */                    if (i2 == iI000II) {
                                break;
                            }
/* 41 */                    i2++;
                        }
                    }
/* 98 */            return iI000l1;
                }

                @Override
                public final int I0000O(IoooOl1001li ioooOl1001li, List list, int i) {
/* 6 */             if (list.isEmpty()) {
/* 5 */                 return 0;
                    }
/* 15 */            int iI0000Il00O = ((O1iIo0ll) list.get(0)).I0000Il00O(i);
/* 19 */            int iI000II = IOOi1I.I000II(list);
/* 23 */            int i2 = 1;
/* 24 */            if (1 <= iI000II) {
                        while (true) {
/* 32 */                    int iI0000Il00O2 = ((O1iIo0ll) list.get(i2)).I0000Il00O(i);
/* 36 */                    if (iI0000Il00O2 > iI0000Il00O) {
/* 38 */                        iI0000Il00O = iI0000Il00O2;
                            }
/* 39 */                    if (i2 == iI000II) {
                                break;
                            }
/* 41 */                    i2++;
                        }
                    }
/* 98 */            return iI0000Il00O;
                }

                @Override
                public final int I0000oI00(IoooOl1001li ioooOl1001li, List list, int i) {
/* 6 */             if (list.isEmpty()) {
/* 5 */                 return 0;
                    }
/* 15 */            int iI00OI1 = ((O1iIo0ll) list.get(0)).I00OI1(i);
/* 19 */            int iI000II = IOOi1I.I000II(list);
/* 23 */            int i2 = 1;
/* 24 */            if (1 <= iI000II) {
                        while (true) {
/* 32 */                    int iI00OI12 = ((O1iIo0ll) list.get(i2)).I00OI1(i);
/* 36 */                    if (iI00OI12 > iI00OI1) {
/* 38 */                        iI00OI1 = iI00OI12;
                            }
/* 39 */                    if (i2 == iI000II) {
                                break;
                            }
/* 41 */                    i2++;
                        }
                    }
/* 98 */            return iI00OI1;
                }
            }
