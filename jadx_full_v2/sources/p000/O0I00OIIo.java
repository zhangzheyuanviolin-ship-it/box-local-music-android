            package p000;

            import java.util.Map;
            
            public final class O0I00OIIo {
                public Oi01Iillli I00000oIO;
                public Oi01Iillli I00000oOI;
                public Map I0000Il00O;
                public boolean I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 37 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0I00OIIo)) {
/* 35 */                return false;
                    }
/* 9 */             O0I00OIIo o0I00OIIo = (O0I00OIIo) obj;
                    return this.I00000oIO == o0I00OIIo.I00000oIO && this.I00000oOI == o0I00OIIo.I00000oOI && this.I0000Il00O.equals(o0I00OIIo.I0000Il00O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             Oi01Iillli oi01Iillli = this.I00000oOI;
/* 28 */            return this.I0000Il00O.hashCode() + ((iHashCode + (oi01Iillli == null ? 0 : oi01Iillli.hashCode())) * 31);
                }

                public final String toString() {
/* 38 */            return "Jsr305Settings(globalLevel=" + this.I00000oIO + ", migrationLevel=" + this.I00000oOI + ", userDefinedLevelForSpecificAnnotation=" + this.I0000Il00O + ')';
                }
            }
