            package p000;
            
/* 14 */    public final class Oo0io0OO1 {
                public final OlIIi1oIIOlo I00000oIO;
                public final OlIIi1oIIOlo I00000oOI;
                public final OlIIi1oIIOlo I0000Il00O;
                public final OlIIi1oIIOlo I0000O;

                public Oo0io0OO1(OlIIi1oIIOlo olIIi1oIIOlo, OlIIi1oIIOlo olIIi1oIIOlo2, int i) {
/* 12 */            this((i & 1) != 0 ? null : olIIi1oIIOlo, null, (i & 4) != 0 ? null : olIIi1oIIOlo2, null);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || !(obj instanceof Oo0io0OO1)) {
/* 5 */                 return false;
                    }
/* 13 */            Oo0io0OO1 oo0io0OO1 = (Oo0io0OO1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oo0io0OO1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oo0io0OO1.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oo0io0OO1.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oo0io0OO1.I0000O);
                }

                public final int hashCode() {
/* 2 */             OlIIi1oIIOlo olIIi1oIIOlo = this.I00000oIO;
/* 12 */            int iHashCode = (olIIi1oIIOlo != null ? olIIi1oIIOlo.hashCode() : 0) * 31;
/* 14 */            OlIIi1oIIOlo olIIi1oIIOlo2 = this.I00000oOI;
/* 25 */            int iHashCode2 = (iHashCode + (olIIi1oIIOlo2 != null ? olIIi1oIIOlo2.hashCode() : 0)) * 31;
/* 27 */            OlIIi1oIIOlo olIIi1oIIOlo3 = this.I0000Il00O;
/* 38 */            int iHashCode3 = (iHashCode2 + (olIIi1oIIOlo3 != null ? olIIi1oIIOlo3.hashCode() : 0)) * 31;
/* 40 */            OlIIi1oIIOlo olIIi1oIIOlo4 = this.I0000O;
/* 48 */            return iHashCode3 + (olIIi1oIIOlo4 != null ? olIIi1oIIOlo4.hashCode() : 0);
                }

/* 15 */        public Oo0io0OO1(OlIIi1oIIOlo olIIi1oIIOlo, OlIIi1oIIOlo olIIi1oIIOlo2, OlIIi1oIIOlo olIIi1oIIOlo3, OlIIi1oIIOlo olIIi1oIIOlo4) {
/* 17 */            this.I00000oIO = olIIi1oIIOlo;
/* 18 */            this.I00000oOI = olIIi1oIIOlo2;
/* 19 */            this.I0000Il00O = olIIi1oIIOlo3;
/* 20 */            this.I0000O = olIIi1oIIOlo4;
                }
            }
