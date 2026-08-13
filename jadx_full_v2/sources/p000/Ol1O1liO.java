            package p000;

            import java.util.AbstractList;
            import java.util.ConcurrentModificationException;
            import java.util.Iterator;
            
            public final class Ol1O1liO implements Iterator {
                public boolean I00iOIl;
                public int I00iiI;
                public Ol1O1o01 I00iiO;

                public final void I00000oIO() {
/* 1 */             Ol1O1o01 ol1O1o01 = this.I00iiO;
/* 1 */             int i = ((AbstractList) ol1O1o01).modCount;
/* 7 */             int i2 = this.I00iiI;
/* 9 */             if (i == i2) {
/* 11 */                return;
                    }
/* 113 */           throw new ConcurrentModificationException("ModCount: " + ((AbstractList) ol1O1o01).modCount + "; expected: " + i2);
                }

                @Override
                public final boolean hasNext() {
/* 3 */             return !this.I00iOIl;
                }

                @Override
                public final Object next() {
/* 3 */             if (this.I00iOIl) {
/* 16 */                IoOOl0iOl1io.I00000oOI();
/* 19 */                return null;
                    }
/* 6 */             this.I00iOIl = true;
/* 8 */             I00000oIO();
/* 13 */            return this.I00iiO.I00iiI;
                }

                @Override
                public final void remove() {
/* 1 */             I00000oIO();
/* 6 */             this.I00iiO.clear();
                }
            }
