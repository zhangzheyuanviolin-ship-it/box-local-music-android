            package p000;
            
            @Oili0O
            public final class Iiol1i01oo implements Oi0OO01oi {
                public static final Iiol11 Companion = new Iiol11();
                public static final O0ioIllo0i1[] I0000O = {l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new IOlIlo1(20)), null, null};
                public Iiol0ol0oI I00000oIO;
                public O01ioO1o0i11 I00000oOI;
                public O01ioO1o0i11 I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Iiol1i01oo)) {
/* 7 */                 return false;
                    }
/* 11 */            Iiol1i01oo iiol1i01oo = (Iiol1i01oo) obj;
                    return this.I00000oIO == iiol1i01oo.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, iiol1i01oo.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iiol1i01oo.I0000Il00O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oOI;
/* 23 */            int iHashCode2 = (iHashCode + (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode())) * 31;
/* 25 */            O01ioO1o0i11 o01ioO1o0i112 = this.I0000Il00O;
/* 36 */            return iHashCode2 + (o01ioO1o0i112 != null ? o01ioO1o0i112.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "ElicitResult(action=" + this.I00000oIO + ", content=" + this.I00000oOI + ", meta=" + this.I0000Il00O + ")";
                }
            }
