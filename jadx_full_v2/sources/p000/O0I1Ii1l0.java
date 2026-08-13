            package p000;
            
            public final class O0I1Ii1l0 extends l0OIOOOlliO {
                public final String I00000oOI;
                public final String I0000Il00O;

                public O0I1Ii1l0(String str, String str2) {
/* 4 */             this.I00000oOI = str;
/* 6 */             this.I0000Il00O = str2;
                }

                @Override
                public final String I00000oIO() {
/* 16 */            return this.I00000oOI + this.I0000Il00O;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O0I1Ii1l0)) {
/* 7 */                 return false;
                    }
/* 11 */            O0I1Ii1l0 o0I1Ii1l0 = (O0I1Ii1l0) obj;
                    return O0000Ioio00.I0000O(this.I00000oOI, o0I1Ii1l0.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o0I1Ii1l0.I0000Il00O);
                }

                public final int hashCode() {
/* 15 */            return this.I0000Il00O.hashCode() + (this.I00000oOI.hashCode() * 31);
                }
            }
