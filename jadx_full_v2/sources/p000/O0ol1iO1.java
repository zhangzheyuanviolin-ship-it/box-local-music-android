            package p000;
            
            public final class O0ol1iO1 implements i00O0OOIlOO {
                public i00O0OOIlOO I00000oIO;
                public int I00000oOI;

                @Override
                public final int I00000oIO(IiIooOOOI iiIooOOOI) {
/* 5 */             if ((this.I00000oOI & 16) != 0) {
/* 9 */                 return this.I00000oIO.I00000oIO(iiIooOOOI);
                    }
/* 14 */            return 0;
                }

                @Override
                public final int I00000oOI(IiIooOOOI iiIooOOOI, O0iOOoiioO o0iOOoiioO) {
/* 11 */            if (((o0iOOoiioO == O0iOOoiioO.I00iOIl ? 4 : 1) & this.I00000oOI) != 0) {
/* 15 */                return this.I00000oIO.I00000oOI(iiIooOOOI, o0iOOoiioO);
                    }
/* 20 */            return 0;
                }

                @Override
                public final int I0000Il00O(IiIooOOOI iiIooOOOI) {
/* 5 */             if ((this.I00000oOI & 32) != 0) {
/* 9 */                 return this.I00000oIO.I0000Il00O(iiIooOOOI);
                    }
/* 14 */            return 0;
                }

                @Override
                public final int I0000O(IiIooOOOI iiIooOOOI, O0iOOoiioO o0iOOoiioO) {
/* 12 */            if (((o0iOOoiioO == O0iOOoiioO.I00iOIl ? 8 : 2) & this.I00000oOI) != 0) {
/* 16 */                return this.I00000oIO.I0000O(iiIooOOOI, o0iOOoiioO);
                    }
/* 21 */            return 0;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O0ol1iO1)) {
/* 7 */                 return false;
                    }
/* 13 */            O0ol1iO1 o0ol1iO1 = (O0ol1iO1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o0ol1iO1.I00000oIO) && this.I00000oOI == o0ol1iO1.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 1 */             i00O0OOIlOO i00o0ooiloo = this.I00000oIO;
/* 3 */             int i = this.I00000oOI;
/* 7 */             StringBuilder sb = new StringBuilder();
/* 10 */            int i2 = liIIl1IoIl0i.I00000oIO;
/* 14 */            if ((i & i2) == i2) {
/* 18 */                liIIl1IoIl0i.I00000oIO(sb, "Start");
                    }
/* 21 */            int i3 = liIIl1IoIl0i.I0000Il00O;
/* 25 */            if ((i & i3) == i3) {
/* 29 */                liIIl1IoIl0i.I00000oIO(sb, "Left");
                    }
/* 36 */            if ((i & 16) == 16) {
/* 40 */                liIIl1IoIl0i.I00000oIO(sb, "Top");
                    }
/* 43 */            int i4 = liIIl1IoIl0i.I00000oOI;
/* 47 */            if ((i & i4) == i4) {
/* 51 */                liIIl1IoIl0i.I00000oIO(sb, "End");
                    }
/* 54 */            int i5 = liIIl1IoIl0i.I0000O;
/* 58 */            if ((i & i5) == i5) {
/* 62 */                liIIl1IoIl0i.I00000oIO(sb, "Right");
                    }
/* 68 */            if ((i & 32) == 32) {
/* 72 */                liIIl1IoIl0i.I00000oIO(sb, "Bottom");
                    }
/* 108 */           return "(" + i00o0ooiloo + " only " + IlIi0I0.I000lI("WindowInsetsSides(", sb.toString(), ")") + ")";
                }
            }
