            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class ioOIiO1 extends lioiOiO {
                public static final AtomicReferenceFieldUpdater I00000oIO = AtomicReferenceFieldUpdater.newUpdater(ioOOIoo.class, Thread.class, "I00000oIO");
                public static final AtomicReferenceFieldUpdater I00000oOI = AtomicReferenceFieldUpdater.newUpdater(ioOOIoo.class, ioOOIoo.class, "I00000oOI");
                public static final AtomicReferenceFieldUpdater I0000Il00O = AtomicReferenceFieldUpdater.newUpdater(ioOi11iiI.class, ioOOIoo.class, "I00iiO");
                public static final AtomicReferenceFieldUpdater I0000O = AtomicReferenceFieldUpdater.newUpdater(ioOi11iiI.class, ioO100IioiO0.class, "I00iiI");
                public static final AtomicReferenceFieldUpdater I0000oI00 = AtomicReferenceFieldUpdater.newUpdater(ioOi11iiI.class, Object.class, "I00iOIl");

                @Override
                public final ioO100IioiO0 I00000oIO(ioOI0o10I iooi0o10i) {
/* 9 */             return (ioO100IioiO0) I0000O.getAndSet(iooi0o10i, ioO100IioiO0.I0000O);
                }

                @Override
                public final ioOOIoo I00000oOI(ioOI0o10I iooi0o10i) {
/* 9 */             return (ioOOIoo) I0000Il00O.getAndSet(iooi0o10i, ioOOIoo.I0000Il00O);
                }

                @Override
                public final void I0000Il00O(ioOOIoo ioooioo, ioOOIoo ioooioo2) {
/* 3 */             I00000oOI.lazySet(ioooioo, ioooioo2);
                }

                @Override
                public final void I0000O(ioOOIoo ioooioo, Thread thread) {
/* 3 */             I00000oIO.lazySet(ioooioo, thread);
                }

                @Override
                public final boolean I0000oI00(ioOI0o10I iooi0o10i, ioO100IioiO0 ioo100iioio0, ioO100IioiO0 ioo100iioio02) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = I0000O;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(iooi0o10i, ioo100iioio0, ioo100iioio02)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(iooi0o10i) == ioo100iioio0);
/* 17 */            return false;
                }

                @Override
                public final boolean I0001Ioi1lo(ioOi11iiI iooi11iii, Object obj, Object obj2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = I0000oI00;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(iooi11iii, obj, obj2)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(iooi11iii) == obj);
/* 17 */            return false;
                }

                @Override
                public final boolean I000II(ioOi11iiI iooi11iii, ioOOIoo ioooioo, ioOOIoo ioooioo2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
/* 15 */            do {
/* 1 */                 atomicReferenceFieldUpdater = I0000Il00O;
/* 7 */                 if (atomicReferenceFieldUpdater.compareAndSet(iooi11iii, ioooioo, ioooioo2)) {
/* 9 */                     return true;
                        }
/* 15 */            } while (atomicReferenceFieldUpdater.get(iooi11iii) == ioooioo);
/* 17 */            return false;
                }
            }
