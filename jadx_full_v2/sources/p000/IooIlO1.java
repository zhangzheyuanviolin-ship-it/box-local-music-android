            package p000;

            import java.util.Iterator;
            
            public abstract class IooIlO1 implements Iterator, O0IlIoi {
                @Override
                public final Object next() {
/* 5 */             return Integer.valueOf(nextInt());
                }

                public abstract int nextInt();

                @Override
                public final void remove() {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
