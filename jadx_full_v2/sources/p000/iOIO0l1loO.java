            package p000;

            import java.util.Map;
            import java.util.Set;
            
            public abstract class iOIO0l1loO {
                public transient iIOo111l I00iOIl;
                public transient i1liloI1Ol1 I00iiI;

                public final Map I00000oIO() {
/* 1 */             i1liloI1Ol1 i1liloi1ol1 = this.I00iiI;
/* 3 */             if (i1liloi1ol1 != null) {
/* 20 */                return i1liloi1ol1;
                    }
/* 6 */             iOIoo1lI ioioo1li = (iOIoo1lI) this;
/* 13 */            i1liloI1Ol1 i1liloi1ol12 = new i1liloI1Ol1(ioioo1li, ioioo1li.I00iiO, 1);
/* 16 */            this.I00iiI = i1liloi1ol12;
/* 18 */            return i1liloi1ol12;
                }

                public final Set I00000oOI() {
/* 1 */             iIOo111l iioo111l = this.I00iOIl;
/* 3 */             if (iioo111l != null) {
/* 20 */                return iioo111l;
                    }
/* 6 */             iOIoo1lI ioioo1li = (iOIoo1lI) this;
/* 12 */            iIOo111l iioo111l2 = new iIOo111l(ioioo1li, ioioo1li.I00iiO);
/* 15 */            this.I00iOIl = iioo111l2;
/* 17 */            return iioo111l2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof iOIO0l1loO) {
/* 21 */                return I00000oIO().equals(((iOIO0l1loO) obj).I00000oIO());
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
