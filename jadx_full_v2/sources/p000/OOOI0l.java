            package p000;
            
            @Oili0O
            public final class OOOI0l implements OOo11oi0ilIO {
                public static final OOOI0O1o Companion = new OOOI0O1o();
                public static final O0ioIllo0i1[] I0000O = {null, null, l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new O1olloI0OlO(16))};
                public String I00000oIO;
                public String I00000oOI;
                public OOo1IiIOoo1 I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OOOI0l)) {
/* 7 */                 return false;
                    }
/* 11 */            OOOI0l oOOI0l = (OOOI0l) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oOOI0l.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oOOI0l.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 19 */            return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I001IO000("PromptReference(name=", this.I00000oIO, ", title=", this.I00000oOI, ")");
                }
            }
