            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class ioOIiliOi extends lioii00ii {
                public static final AtomicReferenceFieldUpdater I00000oIO = AtomicReferenceFieldUpdater.newUpdater(ioOOO0liOIIo.class, Thread.class, "I00000oIO");
                public static final AtomicReferenceFieldUpdater I00000oOI = AtomicReferenceFieldUpdater.newUpdater(ioOOO0liOIIo.class, ioOOO0liOIIo.class, "I00000oOI");
                public static final AtomicReferenceFieldUpdater I0000Il00O = AtomicReferenceFieldUpdater.newUpdater(ioOi0ll1.class, ioOOO0liOIIo.class, "I00iiO");
                public static final AtomicReferenceFieldUpdater I0000O = AtomicReferenceFieldUpdater.newUpdater(ioOi0ll1.class, ioO100ol0.class, "I00iiI");
                public static final AtomicReferenceFieldUpdater I0000oI00 = AtomicReferenceFieldUpdater.newUpdater(ioOi0ll1.class, Object.class, "I00iOIl");

                @Override
                public final ioO100ol0 I00000oIO(ioOI0i0o11I iooi0i0o11i) {
/* 9 */             return (ioO100ol0) I0000O.getAndSet(iooi0i0o11i, ioO100ol0.I0000O);
                }

                @Override
                public final ioOOO0liOIIo I00000oOI(ioOI0i0o11I iooi0i0o11i) {
/* 9 */             return (ioOOO0liOIIo) I0000Il00O.getAndSet(iooi0i0o11i, ioOOO0liOIIo.I0000Il00O);
                }

                @Override
                public final void I0000Il00O(ioOOO0liOIIo ioooo0lioiio, ioOOO0liOIIo ioooo0lioiio2) {
/* 3 */             I00000oOI.lazySet(ioooo0lioiio, ioooo0lioiio2);
                }

                @Override
                public final void I0000O(ioOOO0liOIIo ioooo0lioiio, Thread thread) {
/* 3 */             I00000oIO.lazySet(ioooo0lioiio, thread);
                }

                @Override
                public final boolean I0000oI00(ioOI0i0o11I iooi0i0o11i, ioO100ol0 ioo100ol0, ioO100ol0 ioo100ol02) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = I0000O;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(iooi0i0o11i, ioo100ol0, ioo100ol02)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(iooi0i0o11i) == ioo100ol0);
/* 17 */            return false;
                }

                @Override
                public final boolean I0001Ioi1lo(ioOi0ll1 iooi0ll1, Object obj, Object obj2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = I0000oI00;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(iooi0ll1, obj, obj2)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(iooi0ll1) == obj);
/* 17 */            return false;
                }

                @Override
                public final boolean I000II(ioOi0ll1 iooi0ll1, ioOOO0liOIIo ioooo0lioiio, ioOOO0liOIIo ioooo0lioiio2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = I0000Il00O;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(iooi0ll1, ioooo0lioiio, ioooo0lioiio2)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(iooi0ll1) == ioooo0lioiio);
/* 17 */            return false;
                }
            }
