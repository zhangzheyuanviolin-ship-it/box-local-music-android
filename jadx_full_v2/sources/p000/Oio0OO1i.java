            package p000;
            
            @Oili0O
            public final class Oio0OO1i implements Oi0O0llI {
                public static final Oio01o1O Companion = new Oio01o1O();
                public static final O0ioIllo0i1[] I0000Il00O = {l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new Oi1O00OI(18)), null};
                public O1II0olio0l1 I00000oIO;
                public O01ioO1o0i11 I00000oOI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    boolean zEquals;
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oio0OO1i)) {
/* 7 */                 return false;
                    }
/* 11 */            Oio0OO1i oio0OO1i = (Oio0OO1i) obj;
/* 17 */            if (this.I00000oIO != oio0OO1i.I00000oIO) {
/* 7 */                 return false;
                    }
/* 20 */            O01ioO1o0i11 o01ioO1o0i11 = this.I00000oOI;
/* 22 */            O01ioO1o0i11 o01ioO1o0i112 = oio0OO1i.I00000oOI;
/* 24 */            if (o01ioO1o0i11 == null) {
/* 30 */                zEquals = o01ioO1o0i112 == null;
                    } else if (o01ioO1o0i112 != null) {
/* 35 */                zEquals = o01ioO1o0i11.equals(o01ioO1o0i112);
                    }
                    return zEquals;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oOI;
/* 21 */            return iHashCode + (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode());
                }

                public final String toString() {
/* 1 */             O1II0olio0l1 o1II0olio0l1 = this.I00000oIO;
/* 3 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oOI;
/* 37 */            return "SetLevelRequestParams(level=" + o1II0olio0l1 + ", meta=" + (o01ioO1o0i11 == null ? "null" : Oi0IiIoo.I00000oOI(o01ioO1o0i11)) + ")";
                }
            }
