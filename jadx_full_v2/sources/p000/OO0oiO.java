            package p000;

            import java.util.Iterator;
            
            public final class OO0oiO implements Iterator, O0IlIoi {
                public final int I00iOIl;
                public OO0oo0lO I00iiI;

                public OO0oiO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI.hasNext();
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    OO0oo0lO oO0oo0lO = this.I00iiI;
/* 36 */                    return new O1OOO0IoIIi(1, oO0oo0lO.I00iiI, oO0oo0lO.I00000oIO().I00000oIO);
                        case 1:
/* 15 */                    OO0oo0lO oO0oo0lO2 = this.I00iiI;
/* 17 */                    Object obj = oO0oo0lO2.I00iiI;
/* 19 */                    oO0oo0lO2.I00000oIO();
/* 22 */                    return obj;
                        default:
/* 12 */                    return this.I00iiI.I00000oIO().I00000oIO;
                    }
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 29 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        case 1:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }
            }
