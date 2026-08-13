            package p000;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class iIOo00OOi1I extends liiOI1lOOIOO {
                public AtomicReferenceFieldUpdater I00000oIO;
                public AtomicReferenceFieldUpdater I00000oOI;
                public AtomicReferenceFieldUpdater I0000Il00O;
                public AtomicReferenceFieldUpdater I0000O;
                public AtomicReferenceFieldUpdater I0000oI00;

                @Override
                public final iIOloo00l0 I00000oIO(iIOoOi1oli iioooi1oli) {
/* 9 */             return (iIOloo00l0) this.I0000O.getAndSet(iioooi1oli, iIOloo00l0.I0000O);
                }

                @Override
                public final iIOo0i01l I00000oOI(iIOoOi1oli iioooi1oli) {
/* 9 */             return (iIOo0i01l) this.I0000Il00O.getAndSet(iioooi1oli, iIOo0i01l.I0000Il00O);
                }

                @Override
                public final void I0000Il00O(iIOo0i01l iioo0i01l, iIOo0i01l iioo0i01l2) {
/* 3 */             this.I00000oOI.lazySet(iioo0i01l, iioo0i01l2);
                }

                @Override
                public final void I0000O(iIOo0i01l iioo0i01l, Thread thread) {
/* 3 */             this.I00000oIO.lazySet(iioo0i01l, thread);
                }

                @Override
                public final boolean I0000oI00(iIOoOi1oli iioooi1oli, iIOloo00l0 iioloo00l0, iIOloo00l0 iioloo00l02) {
/* 1 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.I0000O;
/* 7 */             while (!atomicReferenceFieldUpdater.compareAndSet(iioooi1oli, iioloo00l0, iioloo00l02)) {
/* 15 */                if (atomicReferenceFieldUpdater.get(iioooi1oli) != iioloo00l0) {
/* 17 */                    return false;
                        }
                    }
/* 9 */             return true;
                }

                @Override
                public final boolean I0001Ioi1lo(iIOoOi1oli iioooi1oli, Object obj, Object obj2) {
/* 1 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.I0000oI00;
/* 7 */             while (!atomicReferenceFieldUpdater.compareAndSet(iioooi1oli, obj, obj2)) {
/* 15 */                if (atomicReferenceFieldUpdater.get(iioooi1oli) != obj) {
/* 17 */                    return false;
                        }
                    }
/* 9 */             return true;
                }

                @Override
                public final boolean I000II(iIOoOi1oli iioooi1oli, iIOo0i01l iioo0i01l, iIOo0i01l iioo0i01l2) {
/* 1 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.I0000Il00O;
/* 7 */             while (!atomicReferenceFieldUpdater.compareAndSet(iioooi1oli, iioo0i01l, iioo0i01l2)) {
/* 15 */                if (atomicReferenceFieldUpdater.get(iioooi1oli) != iioo0i01l) {
/* 17 */                    return false;
                        }
                    }
/* 9 */             return true;
                }
            }
