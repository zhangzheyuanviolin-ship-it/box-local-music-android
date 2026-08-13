            package p000;
            
            public final class OO1Oi01o0 {
                public final OO1O1OI I00000oIO;
                public final OO1Il0I1 I00000oOI;

                public OO1Oi01o0(OO1O1OI oo1o1oi, OO1Il0I1 oO1Il0I1) {
/* 4 */             this.I00000oIO = oo1o1oi;
/* 6 */             this.I00000oOI = oO1Il0I1;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OO1Oi01o0)) {
/* 7 */                 return false;
                    }
/* 11 */            OO1Oi01o0 oO1Oi01o0 = (OO1Oi01o0) obj;
                    return O0000Ioio00.I0000O(this.I00000oOI, oO1Oi01o0.I00000oOI) && O0000Ioio00.I0000O(this.I00000oIO, oO1Oi01o0.I00000oIO);
                }

                public final int hashCode() {
/* 2 */             OO1O1OI oo1o1oi = this.I00000oIO;
/* 12 */            int iHashCode = (oo1o1oi != null ? oo1o1oi.hashCode() : 0) * 31;
/* 14 */            OO1Il0I1 oO1Il0I1 = this.I00000oOI;
/* 22 */            return iHashCode + (oO1Il0I1 != null ? oO1Il0I1.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "PlatformTextStyle(spanStyle=" + this.I00000oIO + ", paragraphSyle=" + this.I00000oOI + ")";
                }
            }
