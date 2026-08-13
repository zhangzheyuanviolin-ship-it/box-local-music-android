            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class l01l0OooI extends liooi0 {
                public static final AtomicReferenceFieldUpdater I00000oIO = AtomicReferenceFieldUpdater.newUpdater(l01l0oIOl1.class, Thread.class, "I00000oIO");
                public static final AtomicReferenceFieldUpdater I00000oOI = AtomicReferenceFieldUpdater.newUpdater(l01l0oIOl1.class, l01l0oIOl1.class, "I00000oOI");
                public static final AtomicReferenceFieldUpdater I0000Il00O = AtomicReferenceFieldUpdater.newUpdater(l01loiOOo11l.class, l01l0oIOl1.class, "I00iiO");
                public static final AtomicReferenceFieldUpdater I0000O = AtomicReferenceFieldUpdater.newUpdater(l01loiOOo11l.class, l01Olo10.class, "I00iiI");
                public static final AtomicReferenceFieldUpdater I0000oI00 = AtomicReferenceFieldUpdater.newUpdater(l01loiOOo11l.class, Object.class, "I00iOIl");

                @Override
                public final l01Olo10 I00000oIO(l01iOilOl1il l01ioilol1il) {
/* 9 */             return (l01Olo10) I0000O.getAndSet(l01ioilol1il, l01Olo10.I0000O);
                }

                @Override
                public final l01l0oIOl1 I00000oOI(l01iOilOl1il l01ioilol1il) {
/* 9 */             return (l01l0oIOl1) I0000Il00O.getAndSet(l01ioilol1il, l01l0oIOl1.I0000Il00O);
                }

                @Override
                public final void I0000Il00O(l01l0oIOl1 l01l0oiol1, l01l0oIOl1 l01l0oiol12) {
/* 3 */             I00000oOI.lazySet(l01l0oiol1, l01l0oiol12);
                }

                @Override
                public final void I0000O(l01l0oIOl1 l01l0oiol1, Thread thread) {
/* 3 */             I00000oIO.lazySet(l01l0oiol1, thread);
                }

                @Override
                public final boolean I0000oI00(l01iOilOl1il l01ioilol1il, l01Olo10 l01olo10, l01Olo10 l01olo102) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = I0000O;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(l01ioilol1il, l01olo10, l01olo102)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(l01ioilol1il) == l01olo10);
/* 17 */            return false;
                }

                @Override
                public final boolean I0001Ioi1lo(l01loiOOo11l l01loiooo11l, Object obj, Object obj2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = I0000oI00;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(l01loiooo11l, obj, obj2)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(l01loiooo11l) == obj);
/* 17 */            return false;
                }

                @Override
                public final boolean I000II(l01loiOOo11l l01loiooo11l, l01l0oIOl1 l01l0oiol1, l01l0oIOl1 l01l0oiol12) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = I0000Il00O;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(l01loiooo11l, l01l0oiol1, l01l0oiol12)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(l01loiooo11l) == l01l0oiol1);
/* 17 */            return false;
                }
            }
