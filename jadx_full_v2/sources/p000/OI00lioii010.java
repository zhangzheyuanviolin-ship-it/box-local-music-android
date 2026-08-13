            package p000;

            import java.util.Objects;
            
            public final class OI00lioii010 {
                public IO0o1O0li0 I00000oIO;
                public int I00000oOI;
                public String I0000Il00O;
                public String I0000O;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OI00lioii010)) {
/* 42 */                return false;
                    }
/* 6 */             OI00lioii010 oI00lioii010 = (OI00lioii010) obj;
                    return this.I00000oIO == oI00lioii010.I00000oIO && this.I00000oOI == oI00lioii010.I00000oOI && this.I0000Il00O.equals(oI00lioii010.I0000Il00O) && this.I0000O.equals(oI00lioii010.I0000O);
                }

                public final int hashCode() {
/* 17 */            return Objects.hash(this.I00000oIO, Integer.valueOf(this.I00000oOI), this.I0000Il00O, this.I0000O);
                }

                public final String toString() {
/* 1 */             IO0o1O0li0 iO0o1O0li0 = this.I00000oIO;
/* 3 */             int i = this.I00000oOI;
/* 5 */             String str = this.I0000Il00O;
/* 7 */             String str2 = this.I0000O;
/* 13 */            StringBuilder sb = new StringBuilder("(status=");
/* 16 */            sb.append(iO0o1O0li0);
/* 21 */            sb.append(", keyId=");
/* 24 */            sb.append(i);
/* 29 */            sb.append(", keyType='");
/* 36 */            return IIl001iO0Io.I00100o1O0lo(sb, str, "', keyPrefix='", str2, "')");
                }
            }
