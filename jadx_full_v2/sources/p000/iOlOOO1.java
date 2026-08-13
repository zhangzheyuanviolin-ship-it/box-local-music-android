            package p000;
            
            public final class iOlOOO1 {
                public iiillii1o I00000oIO;
                public iiiooOiO01i I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof iOlOOO1)) {
/* 32 */                return false;
                    }
/* 8 */             iOlOOO1 iolooo1 = (iOlOOO1) obj;
                    return this.I00000oIO.equals(iolooo1.I00000oIO) && this.I00000oOI.equals(iolooo1.I00000oOI);
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 18 */            return this.I00000oOI.hashCode() ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("AndroidSystemInfo{deviceInfo=", this.I00000oIO.toString(), ", NNAPIInfo=", this.I00000oOI.toString(), "}");
                }
            }
