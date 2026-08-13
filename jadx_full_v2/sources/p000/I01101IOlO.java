            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class I01101IOlO extends iOI00o11 {
                public AtomicReferenceFieldUpdater I00000oIO;
                public AtomicReferenceFieldUpdater I00000oOI;
                public AtomicReferenceFieldUpdater I0000Il00O;
                public AtomicReferenceFieldUpdater I0000O;
                public AtomicReferenceFieldUpdater I0000oI00;

                @Override
                public final boolean I00000oIO(I011IOil i011IOil, I010oio1OO0 i010oio1OO0, I010oio1OO0 i010oio1OO02) {
/* 3 */             return this.I0000O.compareAndSet(i011IOil, i010oio1OO0, i010oio1OO02);
                }

                @Override
                public final boolean I00000oOI(I011IOil i011IOil, Object obj, Object obj2) {
/* 3 */             return this.I0000oI00.compareAndSet(i011IOil, obj, obj2);
                }

                @Override
                public final boolean I0000Il00O(I011IOil i011IOil, I0111i i0111i, I0111i i0111i2) {
/* 3 */             return this.I0000Il00O.compareAndSet(i011IOil, i0111i, i0111i2);
                }

                @Override
                public final void I0000O(I0111i i0111i, I0111i i0111i2) {
/* 3 */             this.I00000oOI.lazySet(i0111i, i0111i2);
                }

                @Override
                public final void I0000oI00(I0111i i0111i, Thread thread) {
/* 3 */             this.I00000oIO.lazySet(i0111i, thread);
                }
            }
