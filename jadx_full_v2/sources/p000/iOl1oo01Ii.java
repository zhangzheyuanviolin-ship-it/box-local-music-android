            package p000;
            
            public final class iOl1oo01Ii {
                public l0o1looii0Ol I00000oIO;
                public il0llll00oO I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof iOl1oo01Ii) {
/* 10 */                iOl1oo01Ii iol1oo01ii = (iOl1oo01Ii) obj;
/* 20 */                if (this.I00000oIO.equals(iol1oo01ii.I00000oIO) && this.I00000oOI.equals(iol1oo01ii.I00000oOI)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 18 */            return this.I00000oOI.hashCode() ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("ServiceContext{service=", this.I00000oIO.toString(), ", disconnectSignal=", this.I00000oOI.toString(), "}");
                }
            }
