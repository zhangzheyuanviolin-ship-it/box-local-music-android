            package p000;

            import java.util.ListIterator;
            import java.util.NoSuchElementException;
            
            public final class Il010loii1OO implements ListIterator, O0IlIoi {
                public static final Il010loii1OO I00iOIl = new Il010loii1OO();

                @Override
                public final void add(Object obj) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean hasNext() {
/* 1 */             return false;
                }

                @Override
                public final boolean hasPrevious() {
/* 1 */             return false;
                }

                @Override
                public final Object next() {
/* 29 */            throw new NoSuchElementException();
                }

                @Override
                public final int nextIndex() {
/* 1 */             return 0;
                }

                @Override
                public final Object previous() {
/* 29 */            throw new NoSuchElementException();
                }

                @Override
                public final int previousIndex() {
/* 1 */             return -1;
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void set(Object obj) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
