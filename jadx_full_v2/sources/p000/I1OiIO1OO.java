            package p000;
            
            public final class I1OiIO1OO extends I1OIOiil {
                public int I00000oIO;
                public char I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I1OiIO1OO)) {
/* 7 */                 return false;
                    }
/* 11 */            I1OiIO1OO i1OiIO1OO = (I1OiIO1OO) obj;
                    return this.I00000oIO == i1OiIO1OO.I00000oIO && this.I00000oOI == i1OiIO1OO.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Character.hashCode(this.I00000oOI) + (Integer.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "AstOrderedList(startNumber=" + this.I00000oIO + ", delimiter=" + this.I00000oOI + ")";
                }
            }
