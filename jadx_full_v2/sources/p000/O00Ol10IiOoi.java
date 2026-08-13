            package p000;
            
            @Oili0O
            public final class O00Ol10IiOoi implements O00OoO {
                public static final O00Ol0o1i Companion = new O00Ol0o1i();
                public Oi0IO1ii011 I00000oIO;
                public OOillOoli I00000oOI;
                public String I0000Il00O = "2.0";

                public O00Ol10IiOoi(Oi0IO1ii011 oi0IO1ii011, OOillOoli oOillOoli) {
/* 4 */             this.I00000oIO = oi0IO1ii011;
/* 6 */             this.I00000oOI = oOillOoli;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O00Ol10IiOoi)) {
/* 7 */                 return false;
                    }
/* 11 */            O00Ol10IiOoi o00Ol10IiOoi = (O00Ol10IiOoi) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o00Ol10IiOoi.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o00Ol10IiOoi.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "JSONRPCError(id=" + this.I00000oIO + ", error=" + this.I00000oOI + ")";
                }
            }
