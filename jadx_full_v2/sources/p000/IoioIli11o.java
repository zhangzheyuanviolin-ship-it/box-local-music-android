            package p000;

            import java.util.List;
            
            @Oili0O
            public final class IoioIli11o {
                public static final IoioIOilIlo Companion = new IoioIOilIlo();
                public static final O0ioIllo0i1[] I0001Ioi1lo = {null, null, null, null, l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new Iloi111(14))};
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public String I0000O;
                public List I0000oI00;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IoioIli11o)) {
/* 7 */                 return false;
                    }
/* 11 */            IoioIli11o ioioIli11o = (IoioIli11o) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ioioIli11o.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ioioIli11o.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, ioioIli11o.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, ioioIli11o.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, ioioIli11o.I0000oI00);
                }

                public final int hashCode() {
/* 12 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
/* 16 */            String str = this.I0000Il00O;
/* 28 */            int iHashCode = (iI000O01llI0 + (str == null ? 0 : str.hashCode())) * 31;
/* 29 */            String str2 = this.I0000O;
/* 40 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 41 */            List list = this.I0000oI00;
/* 50 */            return iHashCode2 + (list != null ? list.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             String str3 = this.I0000Il00O;
/* 7 */             String str4 = this.I0000O;
/* 9 */             List list = this.I0000oI00;
/* 17 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("Implementation(name=", str, ", version=", str2, ", title=");
/* 25 */            IIl001iO0Io.I001lIiIIo1O(sbI00111O, str3, ", websiteUrl=", str4, ", icons=");
/* 28 */            sbI00111O.append(list);
/* 33 */            sbI00111O.append(")");
/* 36 */            return sbI00111O.toString();
                }
            }
