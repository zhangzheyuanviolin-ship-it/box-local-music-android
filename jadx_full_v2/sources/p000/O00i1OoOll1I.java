            package p000;
            
            @Oili0O
            public final class O00i1OoOll1I implements O00OoO {
                public static final O00i1O0o Companion = new O00i1O0o();
                public String I00000oIO;
                public O01O0o1iI I00000oOI;
                public String I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O00i1OoOll1I)) {
/* 7 */                 return false;
                    }
/* 11 */            O00i1OoOll1I o00i1OoOll1I = (O00i1OoOll1I) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o00i1OoOll1I.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o00i1OoOll1I.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             O01O0o1iI o01O0o1iI = this.I00000oOI;
/* 19 */            return iHashCode + (o01O0o1iI == null ? 0 : o01O0o1iI.hashCode());
                }

                public final String toString() {
/* 28 */            return "JSONRPCNotification(method=" + this.I00000oIO + ", params=" + this.I00000oOI + ")";
                }
            }
