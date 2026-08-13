            package p000;

            import java.util.List;
            
            @Oili0O
            public final class IoOo0iOi {
                public static final IoOloO Companion = new IoOloO();
                public static final O0ioIllo0i1[] I0000oI00;
                public String I00000oIO;
                public String I00000oOI;
                public List I0000Il00O;
                public IoOlolIIi I0000O;

                static {
/* 8 */             O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 48 */            I0000oI00 = new O0ioIllo0i1[]{null, null, l0oi0lOi11i.I00000oIO(o0oI01I0oo, new Iloi111(10)), l0oi0lOi11i.I00000oIO(o0oI01I0oo, new Iloi111(11))};
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IoOo0iOi)) {
/* 7 */                 return false;
                    }
/* 11 */            IoOo0iOi ioOo0iOi = (IoOo0iOi) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ioOo0iOi.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ioOo0iOi.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, ioOo0iOi.I0000Il00O) && this.I0000O == ioOo0iOi.I0000O;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 23 */            List list = this.I0000Il00O;
/* 34 */            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
/* 36 */            IoOlolIIi ioOlolIIi = this.I0000O;
/* 45 */            return iHashCode3 + (ioOlolIIi != null ? ioOlolIIi.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             List list = this.I0000Il00O;
/* 7 */             IoOlolIIi ioOlolIIi = this.I0000O;
/* 15 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("Icon(src=", str, ", mimeType=", str2, ", sizes=");
/* 19 */            sbI00111O.append(list);
/* 24 */            sbI00111O.append(", theme=");
/* 27 */            sbI00111O.append(ioOlolIIi);
/* 32 */            sbI00111O.append(")");
/* 35 */            return sbI00111O.toString();
                }
            }
