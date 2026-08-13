            package p000;

            import java.util.Iterator;
            
            public final class IO11l10l01o implements Iterator, O0IlIoi {
                public int I00iOIl;
                public int I00iiI;
                public boolean I00iiO;
                public int I00iio;

                @Override
                public final boolean hasNext() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Object next() {
/* 1 */             int i = this.I00iio;
/* 5 */             if (i != this.I00iiI) {
/* 23 */                this.I00iio = this.I00iOIl + i;
                    } else {
/* 9 */                 if (!this.I00iiO) {
/* 15 */                    IoOOl0iOl1io.I00000oOI();
/* 18 */                    return null;
                        }
/* 12 */                this.I00iiO = false;
                    }
/* 26 */            return Character.valueOf((char) i);
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
