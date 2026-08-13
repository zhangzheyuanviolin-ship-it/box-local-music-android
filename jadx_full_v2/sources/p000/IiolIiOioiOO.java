            package p000;
            
            @Oili0O
            public final class IiolIiOioiOO implements IOoI1l1oi0 {
                public static final IiolIII Companion = new IiolIII();
                public static final O0ioIllo0i1[] I0000oI00 = {null, null, null, l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new IOlIlo1(22))};
                public Oi0iol0 I00000oIO;
                public I11Illil0iIl I00000oOI;
                public O01ioO1o0i11 I0000Il00O;
                public IOoOoo0 I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IiolIiOioiOO)) {
/* 7 */                 return false;
                    }
/* 11 */            IiolIiOioiOO iiolIiOioiOO = (IiolIiOioiOO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iiolIiOioiOO.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iiolIiOioiOO.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iiolIiOioiOO.I0000Il00O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             I11Illil0iIl i11Illil0iIl = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (i11Illil0iIl == null ? 0 : i11Illil0iIl.hashCode())) * 31;
/* 23 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 34 */            return iHashCode2 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "EmbeddedResource(resource=" + this.I00000oIO + ", annotations=" + this.I00000oOI + ", meta=" + this.I0000Il00O + ")";
                }
            }
