            package p000;

            import java.util.List;
            
            @Oili0O
            public final class O10i1ioIO1Ii implements Oi0OO01oi {
                public static final O10i1iIO Companion = new O10i1iIO();
                public static final O0ioIllo0i1[] I0000O = {l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new O0o0Ol0(2)), null, null};
                public List I00000oIO;
                public String I00000oOI;
                public O01ioO1o0i11 I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O10i1ioIO1Ii)) {
/* 7 */                 return false;
                    }
/* 11 */            O10i1ioIO1Ii o10i1ioIO1Ii = (O10i1ioIO1Ii) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o10i1ioIO1Ii.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o10i1ioIO1Ii.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o10i1ioIO1Ii.I0000Il00O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 23 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 34 */            return iHashCode2 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "ListResourceTemplatesResult(resourceTemplates=" + this.I00000oIO + ", nextCursor=" + this.I00000oOI + ", meta=" + this.I0000Il00O + ")";
                }
            }
