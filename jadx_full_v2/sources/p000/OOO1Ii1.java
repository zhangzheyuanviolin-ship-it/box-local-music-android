            package p000;

            import java.util.List;
            
            @Oili0O
            public final class OOO1Ii1 {
                public static final OOO1I1i01O Companion = new OOO1I1i01O();
                public static final O0ioIllo0i1[] I000II;
                public String I00000oIO;
                public String I00000oOI;
                public List I0000Il00O;
                public String I0000O;
                public List I0000oI00;
                public O01ioO1o0i11 I0001Ioi1lo;

                static {
/* 8 */             O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 54 */            I000II = new O0ioIllo0i1[]{null, null, l0oi0lOi11i.I00000oIO(o0oI01I0oo, new O1olloI0OlO(13)), null, l0oi0lOi11i.I00000oIO(o0oI01I0oo, new O1olloI0OlO(14)), null};
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OOO1Ii1)) {
/* 7 */                 return false;
                    }
/* 11 */            OOO1Ii1 oOO1Ii1 = (OOO1Ii1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oOO1Ii1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oOO1Ii1.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oOO1Ii1.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oOO1Ii1.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oOO1Ii1.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, oOO1Ii1.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 23 */            List list = this.I0000Il00O;
/* 34 */            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
/* 36 */            String str2 = this.I0000O;
/* 47 */            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 49 */            List list2 = this.I0000oI00;
/* 60 */            int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
/* 62 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0001Ioi1lo;
/* 73 */            return iHashCode5 + (o01ioO1o0i11 != null ? o01ioO1o0i11.I00iOIl.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             List list = this.I0000Il00O;
/* 7 */             String str3 = this.I0000O;
/* 9 */             List list2 = this.I0000oI00;
/* 11 */            O01ioO1o0i11 o01ioO1o0i11 = this.I0001Ioi1lo;
/* 19 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("Prompt(name=", str, ", description=", str2, ", arguments=");
/* 23 */            sbI00111O.append(list);
/* 28 */            sbI00111O.append(", title=");
/* 31 */            sbI00111O.append(str3);
/* 36 */            sbI00111O.append(", icons=");
/* 39 */            sbI00111O.append(list2);
/* 44 */            sbI00111O.append(", meta=");
/* 47 */            sbI00111O.append(o01ioO1o0i11);
/* 52 */            sbI00111O.append(")");
/* 55 */            return sbI00111O.toString();
                }
            }
