            package p000;

            import java.util.List;
            
            @Oili0O
            public final class Oo1Oioo {
                public static final Oo1OiI0oOOiO Companion = new Oo1OiI0oOOiO();
                public static final O0ioIllo0i1[] I0000O = {null, l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new OlOiIoII(12)), null};
                public O01ioO1o0i11 I00000oIO;
                public List I00000oOI;
                public String I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oo1Oioo)) {
/* 7 */                 return false;
                    }
/* 11 */            Oo1Oioo oo1Oioo = (Oo1Oioo) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oo1Oioo.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oo1Oioo.I00000oOI);
                }

                public final int hashCode() {
/* 1 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oIO;
/* 14 */            int iHashCode = (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode()) * 31;
/* 16 */            List list = this.I00000oOI;
/* 25 */            return iHashCode + (list != null ? list.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "ToolSchema(properties=" + this.I00000oIO + ", required=" + this.I00000oOI + ")";
                }
            }
