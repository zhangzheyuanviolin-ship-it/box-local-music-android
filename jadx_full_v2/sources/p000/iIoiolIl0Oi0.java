            package p000;

            import java.util.Map;
            import java.util.Set;
            
            public abstract class iIoiolIl0Oi0 {
                public transient i1OOoIIIl1 I00iOIl;
                public transient i1liloI1Ol1 I00iiI;

                public final Map I00000oIO() {
/* 1 */             i1liloI1Ol1 i1liloi1ol1 = this.I00iiI;
/* 3 */             if (i1liloi1ol1 != null) {
/* 20 */                return i1liloi1ol1;
                    }
/* 6 */             iO0OOlIoo00 io0oolioo00 = (iO0OOlIoo00) this;
/* 13 */            i1liloI1Ol1 i1liloi1ol12 = new i1liloI1Ol1(io0oolioo00, io0oolioo00.I00iiO, 0);
/* 16 */            this.I00iiI = i1liloi1ol12;
/* 18 */            return i1liloi1ol12;
                }

                public final Set I00000oOI() {
/* 1 */             i1OOoIIIl1 i1oooiiil1 = this.I00iOIl;
/* 3 */             if (i1oooiiil1 != null) {
/* 20 */                return i1oooiiil1;
                    }
/* 6 */             iO0OOlIoo00 io0oolioo00 = (iO0OOlIoo00) this;
/* 12 */            i1OOoIIIl1 i1oooiiil12 = new i1OOoIIIl1(io0oolioo00, io0oolioo00.I00iiO);
/* 15 */            this.I00iOIl = i1oooiiil12;
/* 17 */            return i1oooiiil12;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof iIoiolIl0Oi0) {
/* 21 */                return I00000oIO().equals(((iIoiolIl0Oi0) obj).I00000oIO());
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 9 */             return ((i1liloI1Ol1) I00000oIO()).I00iiI.hashCode();
                }

                public final String toString() {
/* 9 */             return ((i1liloI1Ol1) I00000oIO()).I00iiI.toString();
                }
            }
