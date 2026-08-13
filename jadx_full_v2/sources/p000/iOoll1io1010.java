            package p000;
            
            public final class iOoll1io1010 {
                public l0IIO1Oi0lOi I00000oIO;
                public il0llll00oO I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof iOoll1io1010) {
/* 10 */                iOoll1io1010 iooll1io1010 = (iOoll1io1010) obj;
/* 20 */                if (this.I00000oIO.equals(iooll1io1010.I00000oIO) && this.I00000oOI.equals(iooll1io1010.I00000oOI)) {
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
