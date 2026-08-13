            package p000;
            
            public final class O0lO1lilIooO {
                public int I00000oIO;
                public int I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O0lO1lilIooO)) {
/* 7 */                 return false;
                    }
/* 11 */            O0lO1lilIooO o0lO1lilIooO = (O0lO1lilIooO) obj;
                    return this.I00000oIO == o0lO1lilIooO.I00000oIO && this.I00000oOI == o0lO1lilIooO.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (Integer.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I0010o("Interval(start=", this.I00000oIO, ", end=", this.I00000oOI, ")");
                }
            }
