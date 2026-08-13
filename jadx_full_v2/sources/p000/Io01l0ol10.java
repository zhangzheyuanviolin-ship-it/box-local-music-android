            package p000;

            import java.util.Map;
            
            @Oili0O
            public final class Io01l0ol10 implements Oi0O0llI {
                public static final Io01l0Il Companion = new Io01l0Il();
                public static final O0ioIllo0i1[] I0000O = {null, l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new Iloi111(1)), null};
                public String I00000oIO;
                public Map I00000oOI;
                public O01ioO1o0i11 I0000Il00O;

                /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    boolean zEquals;
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Io01l0ol10)) {
/* 7 */                 return false;
                    }
/* 11 */            Io01l0ol10 io01l0ol10 = (Io01l0ol10) obj;
/* 21 */            if (!O0000Ioio00.I0000O(this.I00000oIO, io01l0ol10.I00000oIO) || !O0000Ioio00.I0000O(this.I00000oOI, io01l0ol10.I00000oOI)) {
/* 7 */                 return false;
                    }
/* 35 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 37 */            O01ioO1o0i11 o01ioO1o0i112 = io01l0ol10.I0000Il00O;
/* 39 */            if (o01ioO1o0i11 == null) {
/* 45 */                zEquals = o01ioO1o0i112 == null;
                    } else if (o01ioO1o0i112 != null) {
/* 50 */                zEquals = o01ioO1o0i11.equals(o01ioO1o0i112);
                    }
                    return zEquals;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             Map map = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
/* 23 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 34 */            return iHashCode2 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             Map map = this.I00000oOI;
/* 5 */             O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 12 */            String strI00000oOI = o01ioO1o0i11 == null ? "null" : Oi0IiIoo.I00000oOI(o01ioO1o0i11);
/* 20 */            StringBuilder sb = new StringBuilder("GetPromptRequestParams(name=");
/* 23 */            sb.append(str);
/* 28 */            sb.append(", arguments=");
/* 31 */            sb.append(map);
/* 36 */            sb.append(", meta=");
/* 41 */            return IIl001iO0Io.I00100l0(sb, strI00000oOI, ")");
                }
            }
