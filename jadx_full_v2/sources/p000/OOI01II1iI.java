            package p000;
            
            public final class OOI01II1iI extends OII10lO0 {
                public Object I00000oIO;
                public long I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 32 */                return true;
                    }
/* 6 */             if (!(obj instanceof OOI01II1iI)) {
/* 30 */                return false;
                    }
/* 9 */             OOI01II1iI oOI01II1iI = (OOI01II1iI) obj;
                    return this.I00000oIO.equals(oOI01II1iI.I00000oIO) && this.I00000oOI == oOI01II1iI.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Long.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "PredictiveBackHandlerInfo(owner=" + this.I00000oIO + ", compositeKey=" + this.I00000oOI + ')';
                }
            }
