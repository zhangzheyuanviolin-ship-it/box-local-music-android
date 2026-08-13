            package p000;
            
            public final class Iii0io0OooO {
                public final boolean I00000oIO;
                public final boolean I00000oOI;
                public final Oii0IOl I0000Il00O;
                public final boolean I0000O;

                public Iii0io0OooO(int i) {
/* 9 */             boolean z = (i & 1) != 0;
/* 16 */            boolean z2 = (i & 2) != 0;
/* 19 */            boolean z3 = (i & 4) != 0;
/* 22 */            Oii0IOl oii0IOl = Oii0IOl.I00iOIl;
/* 27 */            this.I00000oIO = z;
/* 29 */            this.I00000oOI = z2;
/* 31 */            this.I0000Il00O = oii0IOl;
/* 33 */            this.I0000O = z3;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 40 */                return true;
                    }
/* 6 */             if (!(obj instanceof Iii0io0OooO)) {
/* 38 */                return false;
                    }
/* 9 */             Iii0io0OooO iii0io0OooO = (Iii0io0OooO) obj;
                    return this.I00000oIO == iii0io0OooO.I00000oIO && this.I00000oOI == iii0io0OooO.I00000oOI && this.I0000Il00O == iii0io0OooO.I0000Il00O && this.I0000O == iii0io0OooO.I0000O;
                }

                public final int hashCode() {
/* 39 */            return (((Boolean.hashCode(true) + Oi010OO0.I000OOo1O((this.I0000Il00O.hashCode() + Oi010OO0.I000OOo1O(Boolean.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI)) * 31, 31, this.I0000O)) * 31) + 2) * 31;
                }
            }
