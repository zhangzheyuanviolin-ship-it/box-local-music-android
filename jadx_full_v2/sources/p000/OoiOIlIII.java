            package p000;
            
            @Oili0O
            public final class OoiOIlIII implements Oi0iol0 {
                public static final OoiO1ooIo0 Companion = new OoiO1ooIo0();
                public String I00000oIO;
                public String I00000oOI;
                public O01ioO1o0i11 I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OoiOIlIII)) {
/* 7 */                 return false;
                    }
/* 11 */            OoiOIlIII ooiOIlIII = (OoiOIlIII) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ooiOIlIII.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ooiOIlIII.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, ooiOIlIII.I0000Il00O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 23 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 34 */            return iHashCode2 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             O01ioO1o0i11 o01ioO1o0i11 = this.I0000Il00O;
/* 13 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("UnknownResourceContents(uri=", str, ", mimeType=", str2, ", meta=");
/* 17 */            sbI00111O.append(o01ioO1o0i11);
/* 22 */            sbI00111O.append(")");
/* 25 */            return sbI00111O.toString();
                }
            }
