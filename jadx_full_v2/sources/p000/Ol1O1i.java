            package p000;

            import java.util.Iterator;
            import java.util.NoSuchElementException;
            
            public final class Ol1O1i implements Iterator {
                public static final Ol1O1i I00iiI = new Ol1O1i(0);
                public final int I00iOIl;

                public Ol1O1i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return false;
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    throw new NoSuchElementException();
                        default:
/* 11 */                    throw new NoSuchElementException();
                    }
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    throw new IllegalStateException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }
            }
