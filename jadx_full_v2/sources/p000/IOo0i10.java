            package p000;

            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class IOo0i10 implements OilO0iOl {
                public AtomicReference I00000oIO;

                @Override
                public final Iterator iterator() {
/* 8 */             OilO0iOl oilO0iOl = (OilO0iOl) this.I00000oIO.getAndSet(null);
/* 10 */            if (oilO0iOl != null) {
/* 12 */                return oilO0iOl.iterator();
                    }
/* 19 */            I000II.I001IO000("This sequence can be consumed only once.");
/* 3 */             return null;
                }
            }
