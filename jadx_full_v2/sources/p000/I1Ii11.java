            package p000;
            
            public final class I1Ii11 {
                public final Object I00000oIO;
                public final Object I00000oOI;

                public I1Ii11(Object obj, Object obj2) {
/* 4 */             this.I00000oIO = obj;
/* 6 */             this.I00000oOI = obj2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I1Ii11)) {
/* 7 */                 return false;
                    }
/* 11 */            I1Ii11 i1Ii11 = (I1Ii11) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i1Ii11.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, i1Ii11.I00000oOI);
                }

                public final int hashCode() {
/* 2 */             Object obj = this.I00000oIO;
/* 12 */            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
/* 14 */            Object obj2 = this.I00000oOI;
/* 23 */            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "ApproximationBounds(lower=" + this.I00000oIO + ", upper=" + this.I00000oOI + ')';
                }
            }
