            package p000;
            
            public final class OIOo1I10o extends OII10lO0 {
                public final I1lo101oIi1 I00000oIO;
                public final O0oiOi I00000oOI;

                public OIOo1I10o(I1lo101oIi1 i1lo101oIi1, O0oiOi o0oiOi) {
/* 4 */             this.I00000oIO = i1lo101oIi1;
/* 6 */             this.I00000oOI = o0oiOi;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OIOo1I10o)) {
/* 7 */                 return false;
                    }
/* 11 */            OIOo1I10o oIOo1I10o = (OIOo1I10o) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oIOo1I10o.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oIOo1I10o.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             O0oiOi o0oiOi = this.I00000oOI;
/* 19 */            return iHashCode + (o0oiOi == null ? 0 : o0oiOi.hashCode());
                }

                public final String toString() {
/* 28 */            return "OnBackPressedCallbackInfo(callback=" + this.I00000oIO + ", owner=" + this.I00000oOI + ')';
                }
            }
