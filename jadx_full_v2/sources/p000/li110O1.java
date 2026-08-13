            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class li110O1 extends ll0lOI {
                public static final AtomicReferenceFieldUpdater I00000oIO = AtomicReferenceFieldUpdater.newUpdater(li111il1iiIi.class, Thread.class, "I00000oIO");
                public static final AtomicReferenceFieldUpdater I00000oOI = AtomicReferenceFieldUpdater.newUpdater(li111il1iiIi.class, li111il1iiIi.class, "I00000oOI");
                public static final AtomicReferenceFieldUpdater I0000Il00O = AtomicReferenceFieldUpdater.newUpdater(li11oiolO.class, li111il1iiIi.class, "I00iiO");
                public static final AtomicReferenceFieldUpdater I0000O = AtomicReferenceFieldUpdater.newUpdater(li11oiolO.class, li10IIOIIO.class, "I00iiI");
                public static final AtomicReferenceFieldUpdater I0000oI00 = AtomicReferenceFieldUpdater.newUpdater(li11oiolO.class, Object.class, "I00iOIl");

                @Override
                public final void I00000oIO(li111il1iiIi li111il1iiii, Thread thread) {
/* 3 */             I00000oIO.lazySet(li111il1iiii, thread);
                }

                @Override
                public final void I00000oOI(li111il1iiIi li111il1iiii, li111il1iiIi li111il1iiii2) {
/* 3 */             I00000oOI.lazySet(li111il1iiii, li111il1iiii2);
                }

                @Override
                public final boolean I0000Il00O(li11oiolO li11oiolo, li111il1iiIi li111il1iiii, li111il1iiIi li111il1iiii2) {
/* 3 */             return I0000Il00O.compareAndSet(li11oiolo, li111il1iiii, li111il1iiii2);
                }

                @Override
                public final boolean I0000O(li10iIlI1O li10iili1o, li10IIOIIO li10iioiio, li10IIOIIO li10iioiio2) {
/* 3 */             return I0000O.compareAndSet(li10iili1o, li10iioiio, li10iioiio2);
                }

                @Override
                public final li111il1iiIi I0000oI00(li10iIlI1O li10iili1o) {
/* 9 */             return (li111il1iiIi) I0000Il00O.getAndSet(li10iili1o, li111il1iiIi.I0000Il00O);
                }

                @Override
                public final li10IIOIIO I0001Ioi1lo(li10iIlI1O li10iili1o) {
/* 9 */             return (li10IIOIIO) I0000O.getAndSet(li10iili1o, li10IIOIIO.I0000O);
                }

                @Override
                public final boolean I000II(li11oiolO li11oiolo, Object obj, Object obj2) {
/* 3 */             return I0000oI00.compareAndSet(li11oiolo, obj, obj2);
                }
            }
