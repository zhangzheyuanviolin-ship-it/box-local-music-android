            package p000;
            
            public final class Oo1O0Ol0ll {
                public Oo1O0IIl I00000oIO;
                public I01lO1io10 I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oo1O0Ol0ll)) {
/* 28 */                return false;
                    }
/* 9 */             Oo1O0Ol0ll oo1O0Ol0ll = (Oo1O0Ol0ll) obj;
                    return this.I00000oIO == oo1O0Ol0ll.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, oo1O0Ol0ll.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             I01lO1io10 i01lO1io10 = this.I00000oOI;
/* 19 */            return iHashCode + (i01lO1io10 == null ? 0 : i01lO1io10.hashCode());
                }

                public final String toString() {
/* 28 */            return "TokenStatusAndData(status=" + this.I00000oIO + ", data=" + this.I00000oOI + ")";
                }
            }
