            package p000;

            import java.util.List;
            
            @Oili0O
            public final class IIiIoI1ii1 implements Oi0OO01oi {
                public static final IIiIiIOo Companion = new IIiIiIOo();
                public static final O0ioIllo0i1[] I0000oI00 = {l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new I01iOOoiOI(29)), null, null, null};
                public List I00000oIO;
                public Boolean I00000oOI;
                public O01ioO1o0i11 I0000Il00O;
                public O01ioO1o0i11 I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IIiIoI1ii1)) {
/* 7 */                 return false;
                    }
/* 11 */            IIiIoI1ii1 iIiIoI1ii1 = (IIiIoI1ii1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iIiIoI1ii1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iIiIoI1ii1.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iIiIoI1ii1.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, iIiIoI1ii1.I0000O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             Boolean bool = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
/* 23 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 36 */            int iHashCode3 = (iHashCode2 + (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode())) * 31;
/* 38 */            O01ioO1o0i11 o01ioO1o0i112 = this.I0000O;
/* 49 */            return iHashCode3 + (o01ioO1o0i112 != null ? o01ioO1o0i112.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 48 */            return "CallToolResult(content=" + this.I00000oIO + ", isError=" + this.I00000oOI + ", structuredContent=" + this.I0000Il00O + ", meta=" + this.I0000O + ")";
                }
            }
