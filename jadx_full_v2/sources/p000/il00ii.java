            package p000;

            import java.util.ListIterator;
            
            public final class il00ii extends OoiOOoOlo implements ListIterator {
                public int I00iiI;
                public int I00iiO;
                public final il0II0OO1 I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public il00ii(il0II0OO1 il0ii0oo1, int i) {
/* 7 */             super(16);
/* 1 */             int size = il0ii0oo1.size();
/* 10 */            if (i < 0 || i > size) {
/* 27 */                I000II.I0010o(lil0iIo1Oiil.I0000O(i, size, "index"));
/* 37 */                throw null;
                    }
/* 14 */            this.I00iiI = size;
/* 16 */            this.I00iiO = i;
/* 18 */            this.I00iio = il0ii0oo1;
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
