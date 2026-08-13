            package p000;

            import java.util.List;
            
            @Oili0O
            public final class OOlO0i111i implements Oi0OO01oi {
                public static final OOlO0IO Companion = new OOlO0IO();
                public static final O0ioIllo0i1[] I0000Il00O = {l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new O1olloI0OlO(21)), null};
                public List I00000oIO;
                public O01ioO1o0i11 I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OOlO0i111i)) {
/* 7 */                 return false;
                    }
/* 11 */            OOlO0i111i oOlO0i111i = (OOlO0i111i) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oOlO0i111i.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oOlO0i111i.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oOI;
/* 21 */            return iHashCode + (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode());
                }

                public final String toString() {
/* 28 */            return "ReadResourceResult(contents=" + this.I00000oIO + ", meta=" + this.I00000oOI + ")";
                }
            }
