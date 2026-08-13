            package p000;
            
            public final class IIoIii1o1 {
                public boolean I00000oIO;
                public boolean I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IIoIii1o1)) {
/* 7 */                 return false;
                    }
/* 11 */            IIoIii1o1 iIoIii1o1 = (IIoIii1o1) obj;
                    return this.I00000oIO == iIoIii1o1.I00000oIO && this.I00000oOI == iIoIii1o1.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.I00000oOI) + (Boolean.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "ValidationCriteria(checkBack=" + this.I00000oIO + ", checkFront=" + this.I00000oOI + ')';
                }
            }
