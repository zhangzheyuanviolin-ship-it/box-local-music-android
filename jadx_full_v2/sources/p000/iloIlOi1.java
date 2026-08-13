            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class iloIlOi1 extends lioI0I {
                public static final AtomicReferenceFieldUpdater I00000oIO = AtomicReferenceFieldUpdater.newUpdater(iloO01.class, Thread.class, "I00000oIO");
                public static final AtomicReferenceFieldUpdater I00000oOI = AtomicReferenceFieldUpdater.newUpdater(iloO01.class, iloO01.class, "I00000oOI");
                public static final AtomicReferenceFieldUpdater I0000Il00O = AtomicReferenceFieldUpdater.newUpdater(iloOO0lI0llo.class, iloO01.class, "I00iiO");
                public static final AtomicReferenceFieldUpdater I0000O = AtomicReferenceFieldUpdater.newUpdater(iloOO0lI0llo.class, iloI0IOOI.class, "I00iiI");
                public static final AtomicReferenceFieldUpdater I0000oI00 = AtomicReferenceFieldUpdater.newUpdater(iloOO0lI0llo.class, Object.class, "I00iOIl");

                @Override
                public final void I00000oIO(iloO01 iloo01, Thread thread) {
/* 3 */             I00000oIO.lazySet(iloo01, thread);
                }

                @Override
                public final void I00000oOI(iloO01 iloo01, iloO01 iloo012) {
/* 3 */             I00000oOI.lazySet(iloo01, iloo012);
                }

                @Override
                public final boolean I0000Il00O(iloOO0lI0llo ilooo0li0llo, iloO01 iloo01, iloO01 iloo012) {
/* 3 */             return I0000Il00O.compareAndSet(ilooo0li0llo, iloo01, iloo012);
                }

                @Override
                public final iloO01 I0000O(iloOO0lI0llo ilooo0li0llo) {
/* 9 */             return (iloO01) I0000Il00O.getAndSet(ilooo0li0llo, iloO01.I0000Il00O);
                }

                @Override
                public final iloI0IOOI I0000oI00(iloOO0lI0llo ilooo0li0llo) {
/* 9 */             return (iloI0IOOI) I0000O.getAndSet(ilooo0li0llo, iloI0IOOI.I00000oOI);
                }

                @Override
                public final boolean I0001Ioi1lo(iloOO0lI0llo ilooo0li0llo, Object obj, Object obj2) {
/* 3 */             return I0000oI00.compareAndSet(ilooo0li0llo, obj, obj2);
                }
            }
