            package p000;

            import java.util.List;
            
            @Oili0O
            public final class Oi0ilo0 {
                public static final Oi0illOi Companion = new Oi0illOi();
                public static final O0ioIllo0i1[] I000OiO = {null, null, null, null, null, null, null, l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new O1olloI0OlO(23)), null};
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public String I0000O;
                public Long I0000oI00;
                public String I0001Ioi1lo;
                public I11Illil0iIl I000II;
                public List I000O01llI0;
                public O01ioO1o0i11 I000OOo1O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oi0ilo0)) {
/* 7 */                 return false;
                    }
/* 11 */            Oi0ilo0 oi0ilo0 = (Oi0ilo0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oi0ilo0.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oi0ilo0.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oi0ilo0.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oi0ilo0.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oi0ilo0.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, oi0ilo0.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, oi0ilo0.I000II) && O0000Ioio00.I0000O(this.I000O01llI0, oi0ilo0.I000O01llI0) && O0000Ioio00.I0000O(this.I000OOo1O, oi0ilo0.I000OOo1O);
                }

                public final int hashCode() {
/* 12 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
/* 16 */            String str = this.I0000Il00O;
/* 28 */            int iHashCode = (iI000O01llI0 + (str == null ? 0 : str.hashCode())) * 31;
/* 29 */            String str2 = this.I0000O;
/* 40 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 41 */            Long l = this.I0000oI00;
/* 52 */            int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
/* 53 */            String str3 = this.I0001Ioi1lo;
/* 64 */            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 65 */            I11Illil0iIl i11Illil0iIl = this.I000II;
/* 76 */            int iHashCode5 = (iHashCode4 + (i11Illil0iIl == null ? 0 : i11Illil0iIl.hashCode())) * 31;
/* 77 */            List list = this.I000O01llI0;
/* 88 */            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
/* 89 */            O01ioO1o0i11 o01ioO1o0i11 = this.I000OOo1O;
/* 100 */           return iHashCode6 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             String str3 = this.I0000Il00O;
/* 7 */             String str4 = this.I0000O;
/* 9 */             Long l = this.I0000oI00;
/* 11 */            String str5 = this.I0001Ioi1lo;
/* 13 */            I11Illil0iIl i11Illil0iIl = this.I000II;
/* 15 */            List list = this.I000O01llI0;
/* 17 */            O01ioO1o0i11 o01ioO1o0i11 = this.I000OOo1O;
/* 25 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("Resource(uri=", str, ", name=", str2, ", description=");
/* 33 */            IIl001iO0Io.I001lIiIIo1O(sbI00111O, str3, ", mimeType=", str4, ", size=");
/* 36 */            sbI00111O.append(l);
/* 41 */            sbI00111O.append(", title=");
/* 44 */            sbI00111O.append(str5);
/* 49 */            sbI00111O.append(", annotations=");
/* 52 */            sbI00111O.append(i11Illil0iIl);
/* 57 */            sbI00111O.append(", icons=");
/* 60 */            sbI00111O.append(list);
/* 65 */            sbI00111O.append(", meta=");
/* 68 */            sbI00111O.append(o01ioO1o0i11);
/* 73 */            sbI00111O.append(")");
/* 76 */            return sbI00111O.toString();
                }
            }
