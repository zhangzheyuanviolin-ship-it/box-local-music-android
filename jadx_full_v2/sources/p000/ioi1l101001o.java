            package p000;

            import java.util.Iterator;
            
            public final class ioi1l101001o implements Iterator {
                public Iterator I00iOIl;
                public boolean I00iiI;
                public Object I00iiO;

                @Override
                public final boolean hasNext() {
                    return this.I00iiI || this.I00iOIl.hasNext();
                }

                @Override
                public final Object next() {
/* 3 */             if (!this.I00iiI) {
/* 7 */                 return this.I00iOIl.next();
                    }
/* 12 */            Object obj = this.I00iiO;
/* 15 */            this.I00iiI = false;
/* 18 */            this.I00iiO = null;
/* 29 */            return obj;
                }

                @Override
                public final void remove() {
/* 3 */             if (this.I00iiI) {
/* 13 */                I000II.I001IO000("Can't remove after you've peeked at next");
                    } else {
/* 7 */                 this.I00iOIl.remove();
                    }
                }
            }
