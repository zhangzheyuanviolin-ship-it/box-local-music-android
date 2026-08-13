            package p000;

            import java.util.List;
            
            @Oili0O
            public final class O1oo01I1 {
                public static final O1oloo1 Companion = new O1oloo1();
                public static final O0ioIllo0i1[] I0000oI00 = {l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new O1olloI0OlO(0)), null, null, null};
                public List I00000oIO;
                public Double I00000oOI;
                public Double I0000Il00O;
                public Double I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O1oo01I1)) {
/* 7 */                 return false;
                    }
/* 11 */            O1oo01I1 o1oo01I1 = (O1oo01I1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o1oo01I1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o1oo01I1.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o1oo01I1.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, o1oo01I1.I0000O);
                }

                public final int hashCode() {
/* 1 */             List list = this.I00000oIO;
/* 12 */            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
/* 14 */            Double d = this.I00000oOI;
/* 25 */            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
/* 27 */            Double d2 = this.I0000Il00O;
/* 38 */            int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
/* 40 */            Double d3 = this.I0000O;
/* 49 */            return iHashCode3 + (d3 != null ? d3.hashCode() : 0);
                }

                public final String toString() {
/* 48 */            return "ModelPreferences(hints=" + this.I00000oIO + ", costPriority=" + this.I00000oOI + ", speedPriority=" + this.I0000Il00O + ", intelligencePriority=" + this.I0000O + ")";
                }
            }
