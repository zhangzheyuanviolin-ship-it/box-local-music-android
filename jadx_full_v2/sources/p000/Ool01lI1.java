            package p000;
            
            public final class Ool01lI1 extends Ool01o0 {
                public String I00000oIO;
                public String I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ool01lI1)) {
/* 7 */                 return false;
                    }
/* 11 */            Ool01lI1 ool01lI1 = (Ool01lI1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ool01lI1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ool01lI1.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I001IO000("UpdateAvailable(version=", this.I00000oIO, ", downloadUrl=", this.I00000oOI, ")");
                }
            }
