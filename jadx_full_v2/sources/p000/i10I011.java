            package p000;

            import java.util.ListIterator;
            
            public final class i10I011 extends OoiOOoOlo implements ListIterator {
                public int I00iiI;
                public int I00iiO;
                public final i10I10 I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i10I011(i10I10 i10i10, int i) {
/* 6 */             super(2);
/* 1 */             int size = i10i10.size();
/* 9 */             if (i < 0 || i > size) {
/* 26 */                I000II.I0010o(liOI0000I1OI.I0000Il00O(i, size, "index"));
/* 37 */                throw null;
                    }
/* 13 */            this.I00iiI = size;
/* 15 */            this.I00iiO = i;
/* 17 */            this.I00iio = i10i10;
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
