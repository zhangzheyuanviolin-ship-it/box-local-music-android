            package p000;
            
            @Oili0O
            public final class Iiol0IOiiO0O implements Oi0O0llI {
                public static final Iioil1 Companion = new Iioil1();
                public String I00000oIO;
                public IioioOiI I00000oOI;
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
/* 8 */             if (!(obj instanceof Iiol0IOiiO0O)) {
/* 7 */                 return false;
                    }
/* 11 */            Iiol0IOiiO0O iiol0IOiiO0O = (Iiol0IOiiO0O) obj;
/* 21 */            if (!O0000Ioio00.I0000O(this.I00000oIO, iiol0IOiiO0O.I00000oIO) || !O0000Ioio00.I0000O(this.I00000oOI, iiol0IOiiO0O.I00000oOI)) {
/* 7 */                 return false;
                    }
/* 35 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 37 */            O01ioO1o0i11 o01ioO1o0i112 = iiol0IOiiO0O.I0000Il00O;
/* 39 */            if (o01ioO1o0i11 == null) {
/* 45 */                zEquals = o01ioO1o0i112 == null;
                    } else if (o01ioO1o0i112 != null) {
/* 50 */                zEquals = o01ioO1o0i11.equals(o01ioO1o0i112);
                    }
                    return zEquals;
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31;
/* 18 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 30 */            return iHashCode + (o01ioO1o0i11 == null ? 0 : o01ioO1o0i11.I00iOIl.hashCode());
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             IioioOiI iioioOiI = this.I00000oOI;
/* 5 */             O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 12 */            String strI00000oOI = o01ioO1o0i11 == null ? "null" : Oi0IiIoo.I00000oOI(o01ioO1o0i11);
/* 20 */            StringBuilder sb = new StringBuilder("ElicitRequestParams(message=");
/* 23 */            sb.append(str);
/* 28 */            sb.append(", requestedSchema=");
/* 31 */            sb.append(iioioOiI);
/* 36 */            sb.append(", meta=");
/* 41 */            return IIl001iO0Io.I00100l0(sb, strI00000oOI, ")");
                }
            }
