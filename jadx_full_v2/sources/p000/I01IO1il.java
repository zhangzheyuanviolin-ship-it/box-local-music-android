            package p000;

            import java.util.ListIterator;
            
            public abstract class I01IO1il implements ListIterator, O0IlIoi {
                public int I00iOIl;
                public int I00iiI;

                public I01IO1il(int i, int i2) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
                }

                @Override
                public void add(Object obj) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean hasNext() {
                    return this.I00iOIl < this.I00iiI;
                }

                @Override
                public final boolean hasPrevious() {
                    return this.I00iOIl > 0;
                }

                @Override
                public final int nextIndex() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final int previousIndex() {
/* 3 */             return this.I00iOIl - 1;
                }

                @Override
                public void remove() {
/* 20 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public void set(Object obj) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
