            package p000;

            import java.util.Iterator;
            
            public final class OlII0Il1O implements IOlI1OoI0I, Iterable, O0IlIoi {
                public Ol11i0000Oo I00iOIl;
                public int I00iiI;
                public OOollo I00iiO;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OlII0Il1O)) {
/* 32 */                return false;
                    }
/* 5 */             OlII0Il1O olII0Il1O = (OlII0Il1O) obj;
                    return olII0Il1O.I00iiI == this.I00iiI && olII0Il1O.I00iOIl == this.I00iOIl && olII0Il1O.I00iiO.equals(this.I00iiO);
                }

                public final int hashCode() {
/* 20 */            return this.I00iiO.hashCode() + ((this.I00iOIl.hashCode() + (this.I00iiI * 31)) * 31);
                }

                @Override
                public final Iterator iterator() {
/* 10 */            return new OlII00OOiI(this.I00iOIl, this.I00iiI, null, this.I00iiO);
                }
            }
