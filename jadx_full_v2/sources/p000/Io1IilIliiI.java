            package p000;

            import java.util.Locale;
            
            public final class Io1IilIliiI {
                public final String I00000oIO;
                public final String I00000oOI;

                public Io1IilIliiI(String str, String str2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Io1IilIliiI)) {
/* 29 */                return false;
                    }
/* 5 */             Io1IilIliiI io1IilIliiI = (Io1IilIliiI) obj;
                    return OlOolloIIOl0.I000O01llI0(io1IilIliiI.I00000oIO, this.I00000oIO, true) && OlOolloIIOl0.I000O01llI0(io1IilIliiI.I00000oOI, this.I00000oOI, true);
                }

                public final int hashCode() {
/* 1 */             Locale locale = Locale.ROOT;
/* 9 */             int iHashCode = this.I00000oIO.toLowerCase(locale).hashCode();
/* 26 */            return this.I00000oOI.toLowerCase(locale).hashCode() + (iHashCode * 31) + iHashCode;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", value=");
/* 22 */            return IIl001iO0Io.I00100l0(sb, this.I00000oOI, ", escapeValue=false)");
                }
            }
