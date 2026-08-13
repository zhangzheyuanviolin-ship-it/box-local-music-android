            package p000;
            
            @Oili0O
            public final class II0oOI implements Oi0iol0 {
                public static final II0oIoO Companion = new II0oIoO();
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public O01ioO1o0i11 I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof II0oOI)) {
/* 7 */                 return false;
                    }
/* 11 */            II0oOI iI0oOI = (II0oOI) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iI0oOI.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iI0oOI.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iI0oOI.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, iI0oOI.I0000O);
                }

                public final int hashCode() {
/* 12 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
/* 16 */            String str = this.I0000Il00O;
/* 28 */            int iHashCode = (iI000O01llI0 + (str == null ? 0 : str.hashCode())) * 31;
/* 29 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000O;
/* 40 */            return iHashCode + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             String str3 = this.I0000Il00O;
/* 7 */             O01ioO1o0i11 o01ioO1o0i11 = this.I0000O;
/* 15 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("BlobResourceContents(blob=", str, ", uri=", str2, ", mimeType=");
/* 19 */            sbI00111O.append(str3);
/* 24 */            sbI00111O.append(", meta=");
/* 27 */            sbI00111O.append(o01ioO1o0i11);
/* 32 */            sbI00111O.append(")");
/* 35 */            return sbI00111O.toString();
                }
            }
