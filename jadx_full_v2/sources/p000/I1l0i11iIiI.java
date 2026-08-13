            package p000;
            
            public final class I1l0i11iIiI {
                public Object I00000oIO;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof I1l0i11iIiI) {
/* 15 */                return this.I00000oIO.equals(((I1l0i11iIiI) obj).I00000oIO);
                    }
/* 20 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.I00000oIO.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 18 */            return "Identifier{value=" + this.I00000oIO + "}";
                }
            }
