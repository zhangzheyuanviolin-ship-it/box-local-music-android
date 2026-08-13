            package p000;

            import java.util.Locale;
            
            public final class Olo000 {
                public final String I00000oIO;
                public final String I00000oOI;
                public final boolean I0000Il00O;
                public final int I0000O;
                public final String I0000oI00;
                public final int I0001Ioi1lo;
                public final int I000II;

                public Olo000(String str, String str2, boolean z, int i, String str3, int i2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
/* 8 */             this.I0000Il00O = z;
/* 10 */            this.I0000O = i;
/* 12 */            this.I0000oI00 = str3;
/* 14 */            this.I0001Ioi1lo = i2;
/* 18 */            String upperCase = str2.toUpperCase(Locale.ROOT);
/* 98 */            this.I000II = OlOoOIi0o.I000oI1ioi(upperCase, "INT", false) ? 3 : (OlOoOIi0o.I000oI1ioi(upperCase, "CHAR", false) || OlOoOIi0o.I000oI1ioi(upperCase, "CLOB", false) || OlOoOIi0o.I000oI1ioi(upperCase, "TEXT", false)) ? 2 : OlOoOIi0o.I000oI1ioi(upperCase, "BLOB", false) ? 5 : (OlOoOIi0o.I000oI1ioi(upperCase, "REAL", false) || OlOoOIi0o.I000oI1ioi(upperCase, "FLOA", false) || OlOoOIi0o.I000oI1ioi(upperCase, "DOUB", false)) ? 4 : 1;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this != obj) {
/* 9 */                 if (obj instanceof Olo000) {
/* 19 */                    boolean z = this.I0000O > 0;
/* 20 */                    Olo000 olo000 = (Olo000) obj;
/* 22 */                    int i = olo000.I0001Ioi1lo;
/* 31 */                    if (z == (olo000.I0000O > 0) && O0000Ioio00.I0000O(this.I00000oIO, olo000.I00000oIO) && this.I0000Il00O == olo000.I0000Il00O) {
/* 52 */                        String str = olo000.I0000oI00;
/* 55 */                        int i2 = this.I0001Ioi1lo;
/* 57 */                        String str2 = this.I0000oI00;
/* 59 */                        if ((i2 != 1 || i != 2 || str2 == null || lOiiOIloll0.I00000oIO(str2, str)) && ((i2 != 2 || i != 1 || str == null || lOiiOIloll0.I00000oIO(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : lOiiOIloll0.I00000oIO(str2, str))) && this.I000II == olo000.I000II))) {
                                }
                            }
                        }
/* 8 */                 return false;
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 28 */            return (((((this.I00000oIO.hashCode() * 31) + this.I000II) * 31) + (this.I0000Il00O ? 1231 : 1237)) * 31) + this.I0000O;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append("',\n            |   type = '");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append("',\n            |   affinity = '");
/* 30 */            sb.append(this.I000II);
/* 35 */            sb.append("',\n            |   notNull = '");
/* 40 */            sb.append(this.I0000Il00O);
/* 45 */            sb.append("',\n            |   primaryKeyPosition = '");
/* 50 */            sb.append(this.I0000O);
/* 55 */            sb.append("',\n            |   defaultValue = '");
/* 58 */            String str = this.I0000oI00;
/* 60 */            if (str == null) {
/* 62 */                str = "undefined";
                    }
/* 64 */            sb.append(str);
/* 69 */            sb.append("'\n            |}\n        ");
/* 80 */            return OlOoOOooiIll.I00000oOI(OlOoOOooiIll.I0000O(sb.toString()));
                }
            }
