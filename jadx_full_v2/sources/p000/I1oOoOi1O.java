            package p000;
            
            @Oili0O
            public final class I1oOoOi1O implements Oi0O0llI {
                public static final I1oOl0oli Companion = new I1oOl0oli();
                public O01ioO1o0i11 I00000oIO;

                /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    boolean zEquals;
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I1oOoOi1O)) {
/* 7 */                 return false;
                    }
/* 13 */            O01ioO1o0i11 o01ioO1o0i11 = this.I00000oIO;
/* 15 */            O01ioO1o0i11 o01ioO1o0i112 = ((I1oOoOi1O) obj).I00000oIO;
/* 17 */            if (o01ioO1o0i11 == null) {
/* 23 */                zEquals = o01ioO1o0i112 == null;
                    } else if (o01ioO1o0i112 != null) {
/* 28 */                zEquals = o01ioO1o0i11.equals(o01ioO1o0i112);
                    }
                    return zEquals;
                }

                public final int hashCode() {
/* 1 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oIO;
/* 3 */             if (o01ioO1o0i11 == null) {
/* 5 */                 return 0;
                    }
/* 9 */             return o01ioO1o0i11.I00iOIl.hashCode();
                }

                public final String toString() {
/* 1 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oIO;
/* 16 */            return IlIi0I0.I000lI("BaseRequestParams(meta=", o01ioO1o0i11 == null ? "null" : Oi0IiIoo.I00000oOI(o01ioO1o0i11), ")");
                }
            }
