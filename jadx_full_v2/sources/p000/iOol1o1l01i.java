            package p000;

            import java.util.ListIterator;
            
            public final class iOol1o1l01i extends OoiOOoOlo implements ListIterator {
                public int I00iiI;
                public int I00iiO;
                public final ii01IlIiIo I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iOol1o1l01i(ii01IlIiIo ii01iliiio, int i) {
/* 7 */             super(11);
/* 1 */             int size = ii01iliiio.size();
/* 10 */            ll0o0Io00O10.I00000oOI(i, size);
/* 13 */            this.I00iiI = size;
/* 15 */            this.I00iiO = i;
/* 17 */            this.I00iio = ii01iliiio;
                }

                public final Object I00000oIO(int i) {
/* 3 */             return this.I00iio.get(i);
                }

                @Override
                public final void add(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean hasNext() {
                    return this.I00iiO < this.I00iiI;
                }

                @Override
                public final boolean hasPrevious() {
                    return this.I00iiO > 0;
                }

                @Override
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 18 */                IoOOl0iOl1io.I00000oOI();
/* 21 */                return null;
                    }
/* 7 */             int i = this.I00iiO;
/* 11 */            this.I00iiO = i + 1;
/* 13 */            return I00000oIO(i);
                }

                @Override
                public final int nextIndex() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Object previous() {
/* 5 */             if (!hasPrevious()) {
/* 18 */                IoOOl0iOl1io.I00000oOI();
/* 21 */                return null;
                    }
                    int i = this.I00iiO - 1;
/* 11 */            this.I00iiO = i;
/* 13 */            return I00000oIO(i);
                }

                @Override
                public final int previousIndex() {
/* 3 */             return this.I00iiO - 1;
                }

                @Override
                public final void set(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }
            }
