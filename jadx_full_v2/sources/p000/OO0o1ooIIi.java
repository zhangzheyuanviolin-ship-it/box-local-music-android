            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class OO0o1ooIIi implements Iterator, O0IlIoi {
                public final int I00iOIl;
                public Iterator I00iiI;

                public OO0o1ooIIi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 0:
/* 26 */                    return ((OO0o0oOIIii) this.I00iiI).I00iiO;
                        case 1:
/* 17 */                    return ((I01I0Iioooo0) this.I00iiI).hasNext();
                        default:
/* 8 */                     return this.I00iiI.hasNext();
                    }
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 32 */                    return (Map.Entry) ((OO0o0oOIIii) this.I00iiI).next();
                        case 1:
/* 19 */                    return ((I01I0Iioooo0) this.I00iiI).next();
                        default:
/* 12 */                    return (Ooo1l00l) this.I00iiI.next();
                    }
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    ((OO0o0oOIIii) this.I00iiI).remove();
/* 27 */                    return;
                        case 1:
/* 19 */                    throw new UnsupportedOperationException();
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }
            }
