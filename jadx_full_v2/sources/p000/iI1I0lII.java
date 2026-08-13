            package p000;

            import java.util.Map;
            import java.util.Set;
            
            public abstract class iI1I0lII implements iiO10IIlO0O {
                public transient loliOI1li I00iOIl;
                public transient i1liloI1Ol1 I00iiI;

                public final Map I00000oIO() {
/* 1 */             i1liloI1Ol1 i1liloi1ol1 = this.I00iiI;
/* 3 */             if (i1liloi1ol1 != null) {
/* 20 */                return i1liloi1ol1;
                    }
/* 6 */             iI1oliOIO ii1olioio = (iI1oliOIO) this;
/* 13 */            i1liloI1Ol1 i1liloi1ol12 = new i1liloI1Ol1(ii1olioio, ii1olioio.I00iiO, 6);
/* 16 */            this.I00iiI = i1liloi1ol12;
/* 18 */            return i1liloi1ol12;
                }

                public final Set I00000oOI() {
/* 1 */             loliOI1li lolioi1li = this.I00iOIl;
/* 3 */             if (lolioi1li != null) {
/* 20 */                return lolioi1li;
                    }
/* 6 */             iI1oliOIO ii1olioio = (iI1oliOIO) this;
/* 12 */            loliOI1li lolioi1li2 = new loliOI1li(ii1olioio, ii1olioio.I00iiO);
/* 15 */            this.I00iOIl = lolioi1li2;
/* 17 */            return lolioi1li2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof iiO10IIlO0O) {
/* 23 */                return I00000oIO().equals(((iI1I0lII) ((iiO10IIlO0O) obj)).I00000oIO());
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
