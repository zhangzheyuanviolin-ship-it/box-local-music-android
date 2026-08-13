            package p000;
            
            @Oili0O
            public final class OOillOoli {
                public static final OOillIoi Companion = new OOillIoi();
                public int I00000oIO;
                public String I00000oOI;
                public O01O0o1iI I0000Il00O = null;

                public OOillOoli(int i, String str) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OOillOoli)) {
/* 7 */                 return false;
                    }
/* 11 */            OOillOoli oOillOoli = (OOillOoli) obj;
                    return this.I00000oIO == oOillOoli.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, oOillOoli.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oOillOoli.I0000Il00O);
                }

                public final int hashCode() {
/* 12 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(Integer.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI);
/* 16 */            O01O0o1iI o01O0o1iI = this.I0000Il00O;
/* 26 */            return iI000O01llI0 + (o01O0o1iI == null ? 0 : o01O0o1iI.hashCode());
                }

                public final String toString() {
/* 38 */            return "RPCError(code=" + this.I00000oIO + ", message=" + this.I00000oOI + ", data=" + this.I0000Il00O + ")";
                }
            }
