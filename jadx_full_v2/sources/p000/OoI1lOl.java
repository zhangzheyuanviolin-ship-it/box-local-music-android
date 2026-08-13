            package p000;
            
            public final class OoI1lOl {
                public final String I00000oIO;
                public final String I00000oOI;

                public OoI1lOl(String str, String str2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof OoI1lOl)) {
/* 32 */                return false;
                    }
/* 9 */             OoI1lOl ooI1lOl = (OoI1lOl) obj;
                    return this.I00000oIO.equals(ooI1lOl.I00000oIO) && this.I00000oOI.equals(ooI1lOl.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I001IO000("TranslatorLanguage(label=", this.I00000oIO, ", tag=", this.I00000oOI, ")");
                }
            }
