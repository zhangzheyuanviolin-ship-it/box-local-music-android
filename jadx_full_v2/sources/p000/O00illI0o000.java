            package p000;
            
            @Oili0O
            public final class O00illI0o000 implements O00OoO {
                public static final O00ill0o Companion = new O00ill0o();
                public Oi0IO1ii011 I00000oIO;
                public Oi0OO01oi I00000oOI;
                public String I0000Il00O = "2.0";

                public O00illI0o000(Oi0IO1ii011 oi0IO1ii011, Oi0OO01oi oi0OO01oi) {
/* 4 */             this.I00000oIO = oi0IO1ii011;
/* 6 */             this.I00000oOI = oi0OO01oi;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O00illI0o000)) {
/* 7 */                 return false;
                    }
/* 11 */            O00illI0o000 o00illI0o000 = (O00illI0o000) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o00illI0o000.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o00illI0o000.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "JSONRPCResponse(id=" + this.I00000oIO + ", result=" + this.I00000oOI + ")";
                }
            }
