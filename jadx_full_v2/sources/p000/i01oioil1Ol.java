            package p000;
            
            public final class i01oioil1Ol {
                public int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof i01oioil1Ol)) {
/* 7 */                 return false;
                    }
/* 11 */            i01oioil1Ol i01oioil1ol = (i01oioil1Ol) obj;
                    return this.I00000oIO == i01oioil1ol.I00000oIO && this.I00000oOI == i01oioil1ol.I00000oOI && this.I0000Il00O == i01oioil1ol.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.I0000Il00O) + IIl001iO0Io.I0000O(this.I00000oOI, Integer.hashCode(this.I00000oIO) * 31, 31);
                }

                public final String toString() {
/* 19 */            return IIl001iO0Io.I000lI(this.I0000Il00O, ")", IIl001iO0Io.I0010I0i("Cell(gx=", this.I00000oIO, ", gy=", this.I00000oOI, ", stride="));
                }
            }
