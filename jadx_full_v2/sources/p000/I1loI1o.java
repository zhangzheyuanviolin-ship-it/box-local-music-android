            package p000;
            
            public final class I1loI1o extends OII10lO0 {
                public Object I00000oIO;
                public long I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 32 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1loI1o)) {
/* 30 */                return false;
                    }
/* 9 */             I1loI1o i1loI1o = (I1loI1o) obj;
                    return this.I00000oIO.equals(i1loI1o.I00000oIO) && this.I00000oOI == i1loI1o.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Long.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "BackHandlerInfo(owner=" + this.I00000oIO + ", compositeKey=" + this.I00000oOI + ')';
                }
            }
