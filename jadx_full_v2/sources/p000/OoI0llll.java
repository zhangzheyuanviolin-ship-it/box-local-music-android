            package p000;
            
            public final class OoI0llll {
                public final I1111OO10i I00000oIO;
                public final OIOlOI I00000oOI;

                public OoI0llll(I1111OO10i i1111OO10i, OIOlOI oIOlOI) {
/* 4 */             this.I00000oIO = i1111OO10i;
/* 6 */             this.I00000oOI = oIOlOI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof OoI0llll)) {
/* 32 */                return false;
                    }
/* 9 */             OoI0llll ooI0llll = (OoI0llll) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ooI0llll.I00000oIO) && this.I00000oOI.equals(ooI0llll.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "TransformedText(text=" + ((Object) this.I00000oIO) + ", offsetMapping=" + this.I00000oOI + ")";
                }
            }
