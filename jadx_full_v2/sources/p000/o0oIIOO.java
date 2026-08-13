            package p000;

            import java.util.Map;
            import java.util.Set;
            
            public abstract class o0oIIOO implements ii1O0i {
                public transient lO0OoO0lIlI I00iOIl;
                public transient i1liloI1Ol1 I00iiI;

                public final Map I00000oIO() {
/* 1 */             i1liloI1Ol1 i1liloi1ol1 = this.I00iiI;
/* 3 */             if (i1liloi1ol1 != null) {
/* 20 */                return i1liloi1ol1;
                    }
/* 6 */             o10lo0 o10lo0Var = (o10lo0) this;
/* 13 */            i1liloI1Ol1 i1liloi1ol12 = new i1liloI1Ol1(o10lo0Var, o10lo0Var.I00iiO, 5);
/* 16 */            this.I00iiI = i1liloi1ol12;
/* 18 */            return i1liloi1ol12;
                }

                public final Set I00000oOI() {
/* 1 */             lO0OoO0lIlI lo0ooo0lili = this.I00iOIl;
/* 3 */             if (lo0ooo0lili != null) {
/* 20 */                return lo0ooo0lili;
                    }
/* 6 */             o10lo0 o10lo0Var = (o10lo0) this;
/* 12 */            lO0OoO0lIlI lo0ooo0lili2 = new lO0OoO0lIlI(o10lo0Var, o10lo0Var.I00iiO);
/* 15 */            this.I00iOIl = lo0ooo0lili2;
/* 17 */            return lo0ooo0lili2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof ii1O0i) {
/* 23 */                return I00000oIO().equals(((o0oIIOO) ((ii1O0i) obj)).I00000oIO());
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
