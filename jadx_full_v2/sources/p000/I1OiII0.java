            package p000;
            
            public final class I1OiII0 {
                public final I1Oi1Oi0O I00000oIO;
                public final boolean I00000oOI;
                public final Integer I0000Il00O;

                public I1OiII0(I1Oi1Oi0O i1Oi1Oi0O, boolean z, Integer num) {
/* 4 */             this.I00000oIO = i1Oi1Oi0O;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = num;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I1OiII0)) {
/* 7 */                 return false;
                    }
/* 11 */            I1OiII0 i1OiII0 = (I1OiII0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i1OiII0.I00000oIO) && this.I00000oOI == i1OiII0.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, i1OiII0.I0000Il00O);
                }

                public final int hashCode() {
/* 12 */            int iI000OOo1O = Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
/* 16 */            Integer num = this.I0000Il00O;
/* 26 */            return iI000OOo1O + (num == null ? 0 : num.hashCode());
                }

                public final String toString() {
/* 38 */            return "AstNodeTraversalEntry(astNode=" + this.I00000oIO + ", isVisited=" + this.I00000oOI + ", formatIndex=" + this.I0000Il00O + ")";
                }
            }
