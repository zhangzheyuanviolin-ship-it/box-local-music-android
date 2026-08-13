            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class ioOoi11ooIo extends lioiiOOIoO {
                public static final AtomicReferenceFieldUpdater I00000oIO = AtomicReferenceFieldUpdater.newUpdater(ioOooi000.class, Thread.class, "I00000oIO");
                public static final AtomicReferenceFieldUpdater I00000oOI = AtomicReferenceFieldUpdater.newUpdater(ioOooi000.class, ioOooi000.class, "I00000oOI");
                public static final AtomicReferenceFieldUpdater I0000Il00O = AtomicReferenceFieldUpdater.newUpdater(ioi01lIi1.class, ioOooi000.class, "I00iiO");
                public static final AtomicReferenceFieldUpdater I0000O = AtomicReferenceFieldUpdater.newUpdater(ioi01lIi1.class, ioOlIi.class, "I00iiI");
                public static final AtomicReferenceFieldUpdater I0000oI00 = AtomicReferenceFieldUpdater.newUpdater(ioi01lIi1.class, Object.class, "I00iOIl");

                @Override
                public final ioOlIi I00000oIO(ioOlolI0ll00 ioololi0ll00) {
/* 9 */             return (ioOlIi) I0000O.getAndSet(ioololi0ll00, ioOlIi.I0000O);
                }

                @Override
                public final ioOooi000 I00000oOI(ioOlolI0ll00 ioololi0ll00) {
/* 9 */             return (ioOooi000) I0000Il00O.getAndSet(ioololi0ll00, ioOooi000.I0000Il00O);
                }

                @Override
                public final void I0000Il00O(ioOooi000 iooooi000, ioOooi000 iooooi0002) {
/* 3 */             I00000oOI.lazySet(iooooi000, iooooi0002);
                }

                @Override
                public final void I0000O(ioOooi000 iooooi000, Thread thread) {
/* 3 */             I00000oIO.lazySet(iooooi000, thread);
                }

                @Override
                public final boolean I0000oI00(ioOlolI0ll00 ioololi0ll00, ioOlIi ioolii, ioOlIi ioolii2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = I0000O;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(ioololi0ll00, ioolii, ioolii2)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(ioololi0ll00) == ioolii);
/* 17 */            return false;
                }

                @Override
                public final boolean I0001Ioi1lo(ioi01lIi1 ioi01lii1, Object obj, Object obj2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = I0000oI00;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(ioi01lii1, obj, obj2)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(ioi01lii1) == obj);
/* 17 */            return false;
                }

                @Override
                public final boolean I000II(ioi01lIi1 ioi01lii1, ioOooi000 iooooi000, ioOooi000 iooooi0002) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = I0000Il00O;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(ioi01lii1, iooooi000, iooooi0002)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(ioi01lii1) == iooooi000);
/* 17 */            return false;
                }
            }
