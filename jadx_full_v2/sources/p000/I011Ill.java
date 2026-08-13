            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class I011Ill extends iOI011o {
                public static final AtomicReferenceFieldUpdater I00000oIO = AtomicReferenceFieldUpdater.newUpdater(I011iO.class, Thread.class, "I00000oIO");
                public static final AtomicReferenceFieldUpdater I00000oOI = AtomicReferenceFieldUpdater.newUpdater(I011iO.class, I011iO.class, "I00000oOI");
                public static final AtomicReferenceFieldUpdater I0000Il00O = AtomicReferenceFieldUpdater.newUpdater(I011iiii0i.class, I011iO.class, "I00iiO");
                public static final AtomicReferenceFieldUpdater I0000O = AtomicReferenceFieldUpdater.newUpdater(I011iiii0i.class, I010o0o0oO.class, "I00iiI");
                public static final AtomicReferenceFieldUpdater I0000oI00 = AtomicReferenceFieldUpdater.newUpdater(I011iiii0i.class, Object.class, "I00iOIl");

                @Override
                public final boolean I00000oIO(I011IO1I11OI i011io1i11oi, I010o0o0oO i010o0o0oO, I010o0o0oO i010o0o0oO2) {
/* 3 */             return I0000O.compareAndSet(i011io1i11oi, i010o0o0oO, i010o0o0oO2);
                }

                @Override
                public final boolean I00000oOI(I011iiii0i i011iiii0i, Object obj, Object obj2) {
/* 3 */             return I0000oI00.compareAndSet(i011iiii0i, obj, obj2);
                }

                @Override
                public final boolean I0000Il00O(I011iiii0i i011iiii0i, I011iO i011iO, I011iO i011iO2) {
/* 3 */             return I0000Il00O.compareAndSet(i011iiii0i, i011iO, i011iO2);
                }

                @Override
                public final I010o0o0oO I0000O(I011IO1I11OI i011io1i11oi) {
/* 9 */             return (I010o0o0oO) I0000O.getAndSet(i011io1i11oi, I010o0o0oO.I0000O);
                }

                @Override
                public final I011iO I0000oI00(I011IO1I11OI i011io1i11oi) {
/* 9 */             return (I011iO) I0000Il00O.getAndSet(i011io1i11oi, I011iO.I0000Il00O);
                }

                @Override
                public final void I0001Ioi1lo(I011iO i011iO, I011iO i011iO2) {
/* 3 */             I00000oOI.lazySet(i011iO, i011iO2);
                }

                @Override
                public final void I000II(I011iO i011iO, Thread thread) {
/* 3 */             I00000oIO.lazySet(i011iO, thread);
                }
            }
