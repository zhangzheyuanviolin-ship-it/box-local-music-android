            package p000;
            
            public final class OOOI1I {
                public final int I00000oIO;
                public final String I00000oOI;

                public OOOI1I(int i, String str) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof OOOI1I)) {
/* 28 */                return false;
                    }
/* 9 */             OOOI1I oooi1i = (OOOI1I) obj;
                    return this.I00000oIO == oooi1i.I00000oIO && this.I00000oOI.equals(oooi1i.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (Integer.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "PromptTemplate(labelResId=" + this.I00000oIO + ", prompt=" + this.I00000oOI + ")";
                }
            }
