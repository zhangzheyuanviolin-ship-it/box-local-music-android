            package p000;
            
            public final class O10oo000lo {
                public Object I00000oIO;
                public String I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 27 */                return true;
                    }
/* 6 */             if (!(obj instanceof O10oo000lo)) {
/* 29 */                return false;
                    }
/* 9 */             O10oo000lo o10oo000lo = (O10oo000lo) obj;
                    return this.I00000oIO == o10oo000lo.I00000oIO && this.I00000oOI.equals(o10oo000lo.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (System.identityHashCode(this.I00000oIO) * 31);
                }
            }
