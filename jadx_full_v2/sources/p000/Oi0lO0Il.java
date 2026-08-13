            package p000;

            import java.util.List;
            
            @Oili0O
            public final class Oi0lO0Il implements IOoI1l1oi0 {
                public static final Oi0lIoIoO10o Companion = new Oi0lIoIoO10o();
                public static final O0ioIllo0i1[] I000iOII;
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public Long I0000O;
                public String I0000oI00;
                public List I0001Ioi1lo;
                public String I000II;
                public I11Illil0iIl I000O01llI0;
                public O01ioO1o0i11 I000OOo1O;
                public IOoOoo0 I000OiO;

                static {
/* 8 */             O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 69 */            I000iOII = new O0ioIllo0i1[]{null, null, null, null, null, l0oi0lOi11i.I00000oIO(o0oI01I0oo, new O1olloI0OlO(24)), null, null, null, l0oi0lOi11i.I00000oIO(o0oI01I0oo, new O1olloI0OlO(25))};
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oi0lO0Il)) {
/* 7 */                 return false;
                    }
/* 11 */            Oi0lO0Il oi0lO0Il = (Oi0lO0Il) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oi0lO0Il.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oi0lO0Il.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oi0lO0Il.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oi0lO0Il.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oi0lO0Il.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, oi0lO0Il.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, oi0lO0Il.I000II) && O0000Ioio00.I0000O(this.I000O01llI0, oi0lO0Il.I000O01llI0) && O0000Ioio00.I0000O(this.I000OOo1O, oi0lO0Il.I000OOo1O);
                }

                public final int hashCode() {
/* 12 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
/* 16 */            String str = this.I0000Il00O;
/* 28 */            int iHashCode = (iI000O01llI0 + (str == null ? 0 : str.hashCode())) * 31;
/* 29 */            Long l = this.I0000O;
/* 40 */            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
/* 41 */            String str2 = this.I0000oI00;
/* 52 */            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 53 */            List list = this.I0001Ioi1lo;
/* 64 */            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
/* 65 */            String str3 = this.I000II;
/* 76 */            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 77 */            I11Illil0iIl i11Illil0iIl = this.I000O01llI0;
/* 88 */            int iHashCode6 = (iHashCode5 + (i11Illil0iIl == null ? 0 : i11Illil0iIl.hashCode())) * 31;
/* 89 */            O01ioO1o0i11 o01ioO1o0i11 = this.I000OOo1O;
/* 100 */           return iHashCode6 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             String str3 = this.I0000Il00O;
/* 7 */             Long l = this.I0000O;
/* 9 */             String str4 = this.I0000oI00;
/* 11 */            List list = this.I0001Ioi1lo;
/* 13 */            String str5 = this.I000II;
/* 15 */            I11Illil0iIl i11Illil0iIl = this.I000O01llI0;
/* 17 */            O01ioO1o0i11 o01ioO1o0i11 = this.I000OOo1O;
/* 25 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("ResourceLink(name=", str, ", uri=", str2, ", title=");
/* 29 */            sbI00111O.append(str3);
/* 34 */            sbI00111O.append(", size=");
/* 37 */            sbI00111O.append(l);
/* 42 */            sbI00111O.append(", mimeType=");
/* 45 */            sbI00111O.append(str4);
/* 50 */            sbI00111O.append(", icons=");
/* 53 */            sbI00111O.append(list);
/* 58 */            sbI00111O.append(", description=");
/* 61 */            sbI00111O.append(str5);
/* 66 */            sbI00111O.append(", annotations=");
/* 69 */            sbI00111O.append(i11Illil0iIl);
/* 74 */            sbI00111O.append(", meta=");
/* 77 */            sbI00111O.append(o01ioO1o0i11);
/* 82 */            sbI00111O.append(")");
/* 85 */            return sbI00111O.toString();
                }
            }
