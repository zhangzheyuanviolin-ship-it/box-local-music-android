            package p000;

            import java.util.Iterator;
            
            public final class Ol11iIl11o implements IOlI1OoI0I, Iterable, O0IlIoi {
                public Ol11i0000Oo I00iOIl;
                public int I00iiI;
                public int I00iiO;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Ol11iIl11o)) {
/* 28 */                return false;
                    }
/* 5 */             Ol11iIl11o ol11iIl11o = (Ol11iIl11o) obj;
                    return ol11iIl11o.I00iiI == this.I00iiI && ol11iIl11o.I00iiO == this.I00iiO && ol11iIl11o.I00iOIl == this.I00iOIl;
                }

                public final int hashCode() {
/* 11 */            return (this.I00iOIl.hashCode() * 31) + this.I00iiI;
                }

                @Override
                public final Iterator iterator() {
/* 1 */             Ol11i0000Oo ol11i0000Oo = this.I00iOIl;
/* 7 */             if (ol11i0000Oo.I00ioIO != this.I00iiO) {
/* 9 */                 Ol11iOOOoo1.I0001Ioi1lo();
                    }
/* 12 */            int i = this.I00iiI;
/* 14 */            ol11i0000Oo.I000oI1ioi(i);
/* 28 */            return new Io10oO1l001(ol11i0000Oo, i + 1, Ol11iOOOoo1.I00000oOI(ol11i0000Oo.I00iOIl, i) + i);
                }
            }
