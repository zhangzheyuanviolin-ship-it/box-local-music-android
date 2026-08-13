            package p000;

            import java.util.Map;
            import java.util.Set;
            
            public abstract class lo00oOloO implements iOoolIO11 {
                public transient iolO010IO I00iOIl;
                public transient i1liloI1Ol1 I00iiI;

                public final Map I00000oIO() {
/* 1 */             i1liloI1Ol1 i1liloi1ol1 = this.I00iiI;
/* 3 */             if (i1liloi1ol1 != null) {
/* 20 */                return i1liloi1ol1;
                    }
/* 6 */             loO1I0 loo1i0 = (loO1I0) this;
/* 13 */            i1liloI1Ol1 i1liloi1ol12 = new i1liloI1Ol1(loo1i0, loo1i0.I00iiO, 3);
/* 16 */            this.I00iiI = i1liloi1ol12;
/* 18 */            return i1liloi1ol12;
                }

                public final Set I00000oOI() {
/* 1 */             iolO010IO iolo010io = this.I00iOIl;
/* 3 */             if (iolo010io != null) {
/* 20 */                return iolo010io;
                    }
/* 6 */             loO1I0 loo1i0 = (loO1I0) this;
/* 12 */            iolO010IO iolo010io2 = new iolO010IO(loo1i0, loo1i0.I00iiO);
/* 15 */            this.I00iOIl = iolo010io2;
/* 17 */            return iolo010io2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof iOoolIO11) {
/* 23 */                return I00000oIO().equals(((lo00oOloO) ((iOoolIO11) obj)).I00000oIO());
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
