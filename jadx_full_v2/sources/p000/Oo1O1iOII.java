            package p000;
            
            @Oili0O
            public final class Oo1O1iOII {
                public static final Oo1O1iII011 Companion = new Oo1O1iII011();
                public String I00000oIO;
                public Boolean I00000oOI;
                public Boolean I0000Il00O;
                public Boolean I0000O;
                public Boolean I0000oI00;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oo1O1iOII)) {
/* 7 */                 return false;
                    }
/* 11 */            Oo1O1iOII oo1O1iOII = (Oo1O1iOII) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oo1O1iOII.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oo1O1iOII.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oo1O1iOII.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oo1O1iOII.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oo1O1iOII.I0000oI00);
                }

                public final int hashCode() {
/* 1 */             String str = this.I00000oIO;
/* 12 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 14 */            Boolean bool = this.I00000oOI;
/* 25 */            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
/* 27 */            Boolean bool2 = this.I0000Il00O;
/* 38 */            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
/* 40 */            Boolean bool3 = this.I0000O;
/* 51 */            int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
/* 53 */            Boolean bool4 = this.I0000oI00;
/* 62 */            return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
                }

                public final String toString() {
/* 58 */            return "ToolAnnotations(title=" + this.I00000oIO + ", readOnlyHint=" + this.I00000oOI + ", destructiveHint=" + this.I0000Il00O + ", idempotentHint=" + this.I0000O + ", openWorldHint=" + this.I0000oI00 + ")";
                }
            }
