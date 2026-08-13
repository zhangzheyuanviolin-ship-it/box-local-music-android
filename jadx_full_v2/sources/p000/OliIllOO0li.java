            package p000;
            
            @Oili0O
            public final class OliIllOO0li implements Oi0O0llI {
                public static final OliIiiii1 Companion = new OliIiiii1();
                public String I00000oIO;
                public O01ioO1o0i11 I00000oOI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    boolean zEquals;
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OliIllOO0li)) {
/* 7 */                 return false;
                    }
/* 11 */            OliIllOO0li oliIllOO0li = (OliIllOO0li) obj;
/* 21 */            if (!O0000Ioio00.I0000O(this.I00000oIO, oliIllOO0li.I00000oIO)) {
/* 7 */                 return false;
                    }
/* 24 */            O01ioO1o0i11 o01ioO1o0i11 = this.I00000oOI;
/* 26 */            O01ioO1o0i11 o01ioO1o0i112 = oliIllOO0li.I00000oOI;
/* 28 */            if (o01ioO1o0i11 == null) {
/* 34 */                zEquals = o01ioO1o0i112 == null;
                    } else if (o01ioO1o0i112 != null) {
/* 39 */                zEquals = o01ioO1o0i11.equals(o01ioO1o0i112);
                    }
                    return zEquals;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oOI;
/* 21 */            return iHashCode + (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode());
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oOI;
/* 20 */            return Oi010OO0.I001IO000("SubscribeRequestParams(uri=", str, ", meta=", o01ioO1o0i11 == null ? "null" : Oi0IiIoo.I00000oOI(o01ioO1o0i11), ")");
                }
            }
