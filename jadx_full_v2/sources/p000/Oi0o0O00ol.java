            package p000;

            import java.util.List;
            
            @Oili0O
            public final class Oi0o0O00ol {
                public static final Oi0o0I1i11 Companion = new Oi0o0I1i11();
                public static final O0ioIllo0i1[] I000OOo1O = {null, null, null, null, null, null, l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new O1olloI0OlO(27)), null};
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public String I0000O;
                public String I0000oI00;
                public I11Illil0iIl I0001Ioi1lo;
                public List I000II;
                public O01ioO1o0i11 I000O01llI0;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oi0o0O00ol)) {
/* 7 */                 return false;
                    }
/* 11 */            Oi0o0O00ol oi0o0O00ol = (Oi0o0O00ol) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oi0o0O00ol.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oi0o0O00ol.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oi0o0O00ol.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oi0o0O00ol.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oi0o0O00ol.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, oi0o0O00ol.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, oi0o0O00ol.I000II) && O0000Ioio00.I0000O(this.I000O01llI0, oi0o0O00ol.I000O01llI0);
                }

                public final int hashCode() {
/* 12 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
/* 16 */            String str = this.I0000Il00O;
/* 28 */            int iHashCode = (iI000O01llI0 + (str == null ? 0 : str.hashCode())) * 31;
/* 29 */            String str2 = this.I0000O;
/* 40 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 41 */            String str3 = this.I0000oI00;
/* 52 */            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 53 */            I11Illil0iIl i11Illil0iIl = this.I0001Ioi1lo;
/* 64 */            int iHashCode4 = (iHashCode3 + (i11Illil0iIl == null ? 0 : i11Illil0iIl.hashCode())) * 31;
/* 65 */            List list = this.I000II;
/* 76 */            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
/* 77 */            O01ioO1o0i11 o01ioO1o0i11 = this.I000O01llI0;
/* 88 */            return iHashCode5 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             String str3 = this.I0000Il00O;
/* 7 */             String str4 = this.I0000O;
/* 9 */             String str5 = this.I0000oI00;
/* 11 */            I11Illil0iIl i11Illil0iIl = this.I0001Ioi1lo;
/* 13 */            List list = this.I000II;
/* 15 */            O01ioO1o0i11 o01ioO1o0i11 = this.I000O01llI0;
/* 23 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("ResourceTemplate(uriTemplate=", str, ", name=", str2, ", description=");
/* 31 */            IIl001iO0Io.I001lIiIIo1O(sbI00111O, str3, ", mimeType=", str4, ", title=");
/* 34 */            sbI00111O.append(str5);
/* 39 */            sbI00111O.append(", annotations=");
/* 42 */            sbI00111O.append(i11Illil0iIl);
/* 47 */            sbI00111O.append(", icons=");
/* 50 */            sbI00111O.append(list);
/* 55 */            sbI00111O.append(", meta=");
/* 58 */            sbI00111O.append(o01ioO1o0i11);
/* 63 */            sbI00111O.append(")");
/* 66 */            return sbI00111O.toString();
                }
            }
