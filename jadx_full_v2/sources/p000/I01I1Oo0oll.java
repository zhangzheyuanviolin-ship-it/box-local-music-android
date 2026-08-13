            package p000;

            import java.util.ListIterator;
            
            public final class I01I1Oo0oll extends I01I0Iioooo0 implements ListIterator {
                public final I01IO0oio I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I01I1Oo0oll(I01IO0oio i01IO0oio, int i) {
/* 3 */             super(i01IO0oio);
/* 1 */             this.I00iio = i01IO0oio;
/* 6 */             int iI00000oOI = i01IO0oio.I00000oOI();
/* 10 */            if (i < 0 || i > iI00000oOI) {
/* 25 */                I000II.I0010o(IIl001iO0Io.I000l1(i, iI00000oOI, "index: ", ", size: "));
/* 89 */                throw null;
                    }
/* 14 */            this.I00iiI = i;
                }

                @Override
                public final void add(Object obj) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean hasPrevious() {
                    return this.I00iiI > 0;
                }

                @Override
                public final int nextIndex() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final Object previous() {
/* 5 */             if (!hasPrevious()) {
/* 20 */                IoOOl0iOl1io.I00000oOI();
/* 23 */                return null;
                    }
                    int i = this.I00iiI - 1;
/* 11 */            this.I00iiI = i;
/* 15 */            return this.I00iio.get(i);
                }

                @Override
                public final int previousIndex() {
/* 3 */             return this.I00iiI - 1;
                }

                @Override
                public final void set(Object obj) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
