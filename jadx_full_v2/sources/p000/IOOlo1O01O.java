            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class IOOlo1O01O implements O1iOIl0o10, OiI1O1iOoiOI {
                public final I1IioI1l10 I00000oIO;
                public final II0IlloOiO0i I00000oOI;

                public IOOlo1O01O(I1IioI1l10 i1IioI1l10, II0IlloOiO0i iI0IlloOiO0i) {
/* 4 */             this.I00000oIO = i1IioI1l10;
/* 6 */             this.I00000oOI = iI0IlloOiO0i;
                }

                @Override
                public final int I00000oIO(IoooOl1001li ioooOl1001li, List list, int i) {
/* 7 */             int iI00l0OO0IO = ioooOl1001li.I00l0OO0IO(this.I00000oIO.I00000oIO());
/* 16 */            if (list.isEmpty()) {
/* 15 */                return 0;
                    }
/* 26 */            int iMin = Math.min((list.size() - 1) * iI00l0OO0IO, i);
/* 31 */            List list2 = list;
/* 33 */            int size = list2.size();
/* 39 */            int iMax = 0;
/* 40 */            float f = 0.0f;
/* 44 */            for (int i2 = 0; i2 < size; i2++) {
/* 50 */                O1iIo0ll o1iIo0ll = (O1iIo0ll) list.get(i2);
/* 56 */                float fI00000oOI = lIooiiooO.I00000oOI(lIooiiooO.I00000oIO(o1iIo0ll));
/* 62 */                if (fI00000oOI == 0.0f) {
/* 74 */                    int iMin2 = Math.min(o1iIo0ll.I0000Il00O(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
/* 78 */                    iMin += iMin2;
/* 83 */                    iMax = Math.max(iMax, o1iIo0ll.I001iOo1i0O(iMin2));
                        } else if (fI00000oOI > 0.0f) {
/* 92 */                    f += fI00000oOI;
                        }
                    }
/* 113 */           int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
/* 117 */           int size2 = list2.size();
/* 121 */           for (int i3 = 0; i3 < size2; i3++) {
/* 127 */               O1iIo0ll o1iIo0ll2 = (O1iIo0ll) list.get(i3);
/* 133 */               float fI00000oOI2 = lIooiiooO.I00000oOI(lIooiiooO.I00000oIO(o1iIo0ll2));
/* 139 */               if (fI00000oOI2 > 0.0f) {
/* 155 */                   iMax = Math.max(iMax, o1iIo0ll2.I001iOo1i0O(iRound != Integer.MAX_VALUE ? Math.round(iRound * fI00000oOI2) : Integer.MAX_VALUE));
                        }
                    }
/* 408 */           return iMax;
                }

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
/* 43 */            return lO00IllIl.I00000oIO(this, IOo0oO11ll1O.I000iOII(j), IOo0oO11ll1O.I000l1(j), IOo0oO11ll1O.I000OOo1O(j), IOo0oO11ll1O.I000OiO(j), o1iOIoOiO0.I00l0OO0IO(this.I00000oIO.I00000oIO()), o1iOIoOiO0, list, new OO1I0001000i[list.size()], 0, list.size(), null, 0);
                }

                @Override
                public final int I0000Il00O(IoooOl1001li ioooOl1001li, List list, int i) {
/* 7 */             int iI00l0OO0IO = ioooOl1001li.I00l0OO0IO(this.I00000oIO.I00000oIO());
/* 16 */            if (list.isEmpty()) {
/* 15 */                return 0;
                    }
/* 26 */            int iMin = Math.min((list.size() - 1) * iI00l0OO0IO, i);
/* 31 */            List list2 = list;
/* 33 */            int size = list2.size();
/* 39 */            int iMax = 0;
/* 40 */            float f = 0.0f;
/* 44 */            for (int i2 = 0; i2 < size; i2++) {
/* 50 */                O1iIo0ll o1iIo0ll = (O1iIo0ll) list.get(i2);
/* 56 */                float fI00000oOI = lIooiiooO.I00000oOI(lIooiiooO.I00000oIO(o1iIo0ll));
/* 62 */                if (fI00000oOI == 0.0f) {
/* 74 */                    int iMin2 = Math.min(o1iIo0ll.I0000Il00O(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
/* 78 */                    iMin += iMin2;
/* 83 */                    iMax = Math.max(iMax, o1iIo0ll.I000l1(iMin2));
                        } else if (fI00000oOI > 0.0f) {
/* 92 */                    f += fI00000oOI;
                        }
                    }
/* 113 */           int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
/* 117 */           int size2 = list2.size();
/* 121 */           for (int i3 = 0; i3 < size2; i3++) {
/* 127 */               O1iIo0ll o1iIo0ll2 = (O1iIo0ll) list.get(i3);
/* 133 */               float fI00000oOI2 = lIooiiooO.I00000oOI(lIooiiooO.I00000oIO(o1iIo0ll2));
/* 139 */               if (fI00000oOI2 > 0.0f) {
/* 155 */                   iMax = Math.max(iMax, o1iIo0ll2.I000l1(iRound != Integer.MAX_VALUE ? Math.round(iRound * fI00000oOI2) : Integer.MAX_VALUE));
                        }
                    }
/* 408 */           return iMax;
                }

                @Override
                public final int I0000O(IoooOl1001li ioooOl1001li, List list, int i) {
/* 7 */             int iI00l0OO0IO = ioooOl1001li.I00l0OO0IO(this.I00000oIO.I00000oIO());
/* 16 */            if (list.isEmpty()) {
/* 15 */                return 0;
                    }
/* 22 */            int size = list.size();
/* 27 */            int iMax = 0;
/* 28 */            int i2 = 0;
/* 29 */            float f = 0.0f;
/* 30 */            for (int i3 = 0; i3 < size; i3++) {
/* 36 */                O1iIo0ll o1iIo0ll = (O1iIo0ll) list.get(i3);
/* 42 */                float fI00000oOI = lIooiiooO.I00000oOI(lIooiiooO.I00000oIO(o1iIo0ll));
/* 46 */                int iI0000Il00O = o1iIo0ll.I0000Il00O(i);
/* 52 */                if (fI00000oOI == 0.0f) {
/* 54 */                    i2 += iI0000Il00O;
                        } else if (fI00000oOI > 0.0f) {
/* 60 */                    f += fI00000oOI;
/* 67 */                    iMax = Math.max(iMax, Math.round(iI0000Il00O / fI00000oOI));
                        }
                    }
/* 88 */            return ((list.size() - 1) * iI00l0OO0IO) + Math.round(iMax * f) + i2;
                }

                @Override
                public final int I0000oI00(IoooOl1001li ioooOl1001li, List list, int i) {
/* 7 */             int iI00l0OO0IO = ioooOl1001li.I00l0OO0IO(this.I00000oIO.I00000oIO());
/* 16 */            if (list.isEmpty()) {
/* 15 */                return 0;
                    }
/* 22 */            int size = list.size();
/* 27 */            int iMax = 0;
/* 28 */            int i2 = 0;
/* 29 */            float f = 0.0f;
/* 30 */            for (int i3 = 0; i3 < size; i3++) {
/* 36 */                O1iIo0ll o1iIo0ll = (O1iIo0ll) list.get(i3);
/* 42 */                float fI00000oOI = lIooiiooO.I00000oOI(lIooiiooO.I00000oIO(o1iIo0ll));
/* 46 */                int iI00OI1 = o1iIo0ll.I00OI1(i);
/* 52 */                if (fI00000oOI == 0.0f) {
/* 54 */                    i2 += iI00OI1;
                        } else if (fI00000oOI > 0.0f) {
/* 60 */                    f += fI00000oOI;
/* 67 */                    iMax = Math.max(iMax, Math.round(iI00OI1 / fI00000oOI));
                        }
                    }
/* 88 */            return ((list.size() - 1) * iI00l0OO0IO) + Math.round(iMax * f) + i2;
                }

                @Override
                public final void I0001Ioi1lo(int i, int[] iArr, int[] iArr2, O1iOIoOiO0 o1iOIoOiO0) {
/* 3 */             this.I00000oIO.I000O01llI0(o1iOIoOiO0, i, iArr, iArr2);
                }

                @Override
                public final long I000II(int i, int i2, int i3, boolean z) {
                    return !z ? IOo0olo.I00000oIO(0, i3, i, i2) : iio0lo1i.I00000oIO(0, i3, i, i2);
                }

                @Override
                public final O1iOIo0o0 I000O01llI0(OO1I0001000i[] oO1I0001000iArr, O1iOIoOiO0 o1iOIoOiO0, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
/* 4 */             IOOllI0o iOOllI0o = new IOOllI0o(0);
/* 7 */             iOOllI0o.I00iiO = oO1I0001000iArr;
/* 9 */             iOOllI0o.I00iio = this;
/* 11 */            iOOllI0o.I00iiI = i2;
/* 13 */            iOOllI0o.I00ilI0I1 = o1iOIoOiO0;
/* 15 */            iOOllI0o.I00ilO0 = iArr;
/* 17 */            VarHandle.storeStoreFence();
/* 22 */            return o1iOIoOiO0.I001i1lo1io(i2, i, Il011I1OiO0I.I00iOIl, iOOllI0o);
                }

                @Override
                public final int I000OOo1O(OO1I0001000i oO1I0001000i) {
/* 1 */             return oO1I0001000i.I00iOIl;
                }

                @Override
                public final int I000OiO(OO1I0001000i oO1I0001000i) {
/* 1 */             return oO1I0001000i.I00iiI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof IOOlo1O01O)) {
/* 32 */                return false;
                    }
/* 9 */             IOOlo1O01O iOOlo1O01O = (IOOlo1O01O) obj;
                    return this.I00000oIO.equals(iOOlo1O01O.I00000oIO) && this.I00000oOI.equals(iOOlo1O01O.I00000oOI);
                }

                public final int hashCode() {
/* 17 */            return Float.hashCode(this.I00000oOI.I00000oIO) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "ColumnMeasurePolicy(verticalArrangement=" + this.I00000oIO + ", horizontalAlignment=" + this.I00000oOI + ")";
                }
            }
