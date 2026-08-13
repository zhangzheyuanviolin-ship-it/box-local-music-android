            package p000;
            
            @Oili0O
            public final class IoiI00 implements O1iOol1 {
                public static final Ioi1o00IIO0O Companion = new Ioi1o00IIO0O();
                public static final O0ioIllo0i1[] I0001Ioi1lo = {null, null, null, null, l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new Iloi111(13))};
                public String I00000oIO;
                public String I00000oOI;
                public I11Illil0iIl I0000Il00O;
                public O01ioO1o0i11 I0000O;
                public IOoOoo0 I0000oI00;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IoiI00)) {
/* 7 */                 return false;
                    }
/* 11 */            IoiI00 ioiI00 = (IoiI00) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ioiI00.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ioiI00.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, ioiI00.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, ioiI00.I0000O);
                }

                public final int hashCode() {
/* 12 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
/* 16 */            I11Illil0iIl i11Illil0iIl = this.I0000Il00O;
/* 28 */            int iHashCode = (iI000O01llI0 + (i11Illil0iIl == null ? 0 : i11Illil0iIl.hashCode())) * 31;
/* 29 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0000O;
/* 40 */            return iHashCode + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             I11Illil0iIl i11Illil0iIl = this.I0000Il00O;
/* 7 */             O01ioO1o0i11 o01ioO1o0i11 = this.I0000O;
/* 15 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("ImageContent(data=", str, ", mimeType=", str2, ", annotations=");
/* 19 */            sbI00111O.append(i11Illil0iIl);
/* 24 */            sbI00111O.append(", meta=");
/* 27 */            sbI00111O.append(o01ioO1o0i11);
/* 32 */            sbI00111O.append(")");
/* 35 */            return sbI00111O.toString();
                }
            }
