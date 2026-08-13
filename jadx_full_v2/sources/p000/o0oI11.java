            package p000;

            import java.util.Map;
            import java.util.Set;
            
            public abstract class o0oI11 implements ii10olIi0O {
                public transient lO0Oi0oI I00iOIl;
                public transient i1liloI1Ol1 I00iiI;

                public final Map I00000oIO() {
/* 1 */             i1liloI1Ol1 i1liloi1ol1 = this.I00iiI;
/* 3 */             if (i1liloi1ol1 != null) {
/* 20 */                return i1liloi1ol1;
                    }
/* 6 */             o10liooI o10liooi = (o10liooI) this;
/* 13 */            i1liloI1Ol1 i1liloi1ol12 = new i1liloI1Ol1(o10liooi, o10liooi.I00iiO, 4);
/* 16 */            this.I00iiI = i1liloi1ol12;
/* 18 */            return i1liloi1ol12;
                }

                public final Set I00000oOI() {
/* 1 */             lO0Oi0oI lo0oi0oi = this.I00iOIl;
/* 3 */             if (lo0oi0oi != null) {
/* 20 */                return lo0oi0oi;
                    }
/* 6 */             o10liooI o10liooi = (o10liooI) this;
/* 12 */            lO0Oi0oI lo0oi0oi2 = new lO0Oi0oI(o10liooi, o10liooi.I00iiO);
/* 15 */            this.I00iOIl = lo0oi0oi2;
/* 17 */            return lo0oi0oi2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof ii10olIi0O) {
/* 23 */                return I00000oIO().equals(((o0oI11) ((ii10olIi0O) obj)).I00000oIO());
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
