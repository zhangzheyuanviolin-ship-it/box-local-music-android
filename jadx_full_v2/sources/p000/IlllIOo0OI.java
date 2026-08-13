            package p000;

            import java.util.List;
            
            public final class IlllIOo0OI {
                public final String I00000oIO;
                public final List I00000oOI;
                public final long I0000Il00O;

                public IlllIOo0OI(String str, List list) {
/* 1 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 8 */             this.I00000oIO = str;
/* 10 */            this.I00000oOI = list;
/* 12 */            this.I0000Il00O = jCurrentTimeMillis;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 43 */                return true;
                    }
/* 6 */             if (!(obj instanceof IlllIOo0OI)) {
/* 41 */                return false;
                    }
/* 9 */             IlllIOo0OI illlIOo0OI = (IlllIOo0OI) obj;
                    return this.I00000oIO.equals(illlIOo0OI.I00000oIO) && this.I00000oOI.equals(illlIOo0OI.I00000oOI) && this.I0000Il00O == illlIOo0OI.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Long.hashCode(this.I0000Il00O) + IIl001iO0Io.I0000oI00(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("FunctionCallDetails(functionName=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", parameters=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", ts=");
/* 32 */            return IlIi0I0.I000o00OoI0I(sb, this.I0000Il00O, ")");
                }
            }
