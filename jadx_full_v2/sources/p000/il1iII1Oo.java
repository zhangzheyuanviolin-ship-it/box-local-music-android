            package p000;
            
            public final class il1iII1Oo {
                public o00iIloIO I00000oIO;
                public il0llll00oO I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof il1iII1Oo)) {
/* 32 */                return false;
                    }
/* 8 */             il1iII1Oo il1iii1oo = (il1iII1Oo) obj;
                    return this.I00000oIO.equals(il1iii1oo.I00000oIO) && this.I00000oOI.equals(il1iii1oo.I00000oOI);
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 18 */            return this.I00000oOI.hashCode() ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("InferenceServiceContext{getService=", this.I00000oIO.toString(), ", disconnectSignal=", this.I00000oOI.toString(), "}");
                }
            }
