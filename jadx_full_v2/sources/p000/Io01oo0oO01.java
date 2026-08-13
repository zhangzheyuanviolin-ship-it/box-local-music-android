            package p000;

            import java.util.List;
            
            @Oili0O
            public final class Io01oo0oO01 implements Oi0OO01oi {
                public static final Io01oIl10i1i Companion = new Io01oIl10i1i();
                public static final O0ioIllo0i1[] I0000O = {l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new Iloi111(2)), null, null};
                public List I00000oIO;
                public String I00000oOI;
                public O01ioO1o0i11 I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Io01oo0oO01)) {
/* 7 */                 return false;
                    }
/* 11 */            Io01oo0oO01 io01oo0oO01 = (Io01oo0oO01) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, io01oo0oO01.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, io01oo0oO01.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, io01oo0oO01.I0000Il00O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 23 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 34 */            return iHashCode2 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "GetPromptResult(messages=" + this.I00000oIO + ", description=" + this.I00000oOI + ", meta=" + this.I0000Il00O + ")";
                }
            }
