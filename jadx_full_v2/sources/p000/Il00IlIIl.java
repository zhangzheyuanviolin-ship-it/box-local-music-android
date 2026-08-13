            package p000;

            import java.util.Iterator;
            import java.util.NoSuchElementException;
            
            public final class Il00IlIIl implements Iterator, O0IlIoi {
                @Override
                public final boolean hasNext() {
/* 1 */             return false;
                }

                @Override
                public final Object next() {
/* 29 */            throw new NoSuchElementException();
                }

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
