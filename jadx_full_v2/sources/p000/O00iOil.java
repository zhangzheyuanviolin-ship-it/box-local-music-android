            package p000;
            
            @Oili0O
            public final class O00iOil implements O00OoO {
                public static final O00iIl Companion = new O00iIl();
                public Oi0IO1ii011 I00000oIO;
                public String I00000oOI;
                public O01O0o1iI I0000Il00O;
                public String I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O00iOil)) {
/* 7 */                 return false;
                    }
/* 11 */            O00iOil o00iOil = (O00iOil) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o00iOil.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o00iOil.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o00iOil.I0000Il00O);
                }

                public final int hashCode() {
/* 12 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
/* 16 */            O01O0o1iI o01O0o1iI = this.I0000Il00O;
/* 26 */            return iI000O01llI0 + (o01O0o1iI == null ? 0 : o01O0o1iI.hashCode());
                }

                public final String toString() {
/* 38 */            return "JSONRPCRequest(id=" + this.I00000oIO + ", method=" + this.I00000oOI + ", params=" + this.I0000Il00O + ")";
                }
            }
