            package p000;
            
            @Oili0O
            public final class IIiIi10iloI implements Oi0O0llI {
                public static final IIiIOollol Companion = new IIiIOollol();
                public String I00000oIO;
                public O01ioO1o0i11 I00000oOI;
                public O01ioO1o0i11 I0000Il00O = null;

                public IIiIi10iloI(String str, O01ioO1o0i11 o01ioO1o0i11) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = o01ioO1o0i11;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    boolean zEquals;
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IIiIi10iloI)) {
/* 7 */                 return false;
                    }
/* 11 */            IIiIi10iloI iIiIi10iloI = (IIiIi10iloI) obj;
/* 21 */            if (!O0000Ioio00.I0000O(this.I00000oIO, iIiIi10iloI.I00000oIO) || !O0000Ioio00.I0000O(this.I00000oOI, iIiIi10iloI.I00000oOI)) {
/* 7 */                 return false;
                    }
/* 35 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 37 */            O01ioO1o0i11 o01ioO1o0i112 = iIiIi10iloI.I0000Il00O;
/* 39 */            if (o01ioO1o0i11 == null) {
/* 45 */                zEquals = o01ioO1o0i112 == null;
                    } else if (o01ioO1o0i112 != null) {
/* 50 */                zEquals = o01ioO1o0i11.equals(o01ioO1o0i112);
                    }
                    return zEquals;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oOI;
/* 23 */            int iHashCode2 = (iHashCode + (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode())) * 31;
/* 25 */            O01ioO1o0i11 o01ioO1o0i112 = this.I0000Il00O;
/* 36 */            return iHashCode2 + (o01ioO1o0i112 != null ? o01ioO1o0i112.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             O01ioO1o0i11 o01ioO1o0i11 = this.I00000oOI;
/* 5 */             O01ioO1o0i11 o01ioO1o0i112 = this.I0000Il00O;
/* 12 */            String strI00000oOI = o01ioO1o0i112 == null ? "null" : Oi0IiIoo.I00000oOI(o01ioO1o0i112);
/* 20 */            StringBuilder sb = new StringBuilder("CallToolRequestParams(name=");
/* 23 */            sb.append(str);
/* 28 */            sb.append(", arguments=");
/* 31 */            sb.append(o01ioO1o0i11);
/* 36 */            sb.append(", meta=");
/* 41 */            return IIl001iO0Io.I00100l0(sb, strI00000oOI, ")");
                }
            }
