            package p000;
            
            @Oili0O
            public final class OOO1i1I {
                public static final OOO1OIl0Oo Companion = new OOO1OIl0Oo();
                public String I00000oIO;
                public String I00000oOI;
                public Boolean I0000Il00O;
                public String I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OOO1i1I)) {
/* 7 */                 return false;
                    }
/* 11 */            OOO1i1I oOO1i1I = (OOO1i1I) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oOO1i1I.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oOO1i1I.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oOO1i1I.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oOO1i1I.I0000O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 23 */            Boolean bool = this.I0000Il00O;
/* 34 */            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
/* 36 */            String str2 = this.I0000O;
/* 45 */            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             Boolean bool = this.I0000Il00O;
/* 7 */             String str3 = this.I0000O;
/* 15 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("PromptArgument(name=", str, ", description=", str2, ", required=");
/* 19 */            sbI00111O.append(bool);
/* 24 */            sbI00111O.append(", title=");
/* 27 */            sbI00111O.append(str3);
/* 32 */            sbI00111O.append(")");
/* 35 */            return sbI00111O.toString();
                }
            }
