            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceArray;
            import sun.misc.Unsafe;
            
            public final class i01OIoo0l1O {
                public static final AtomicIntegerFieldUpdater I00000oOI;
                public static final AtomicIntegerFieldUpdater I0000Il00O;
                public static final long I0000O;
                public static final long I0000oI00;
                public static final long I0001Ioi1lo;
                public static final long I000II;
                public AtomicReferenceArray I00000oIO;
                private volatile int blockingTasksInBuffer$volatile;
                private volatile int consumerIndex$volatile;
                private volatile Object lastScheduledTask$volatile;
                private volatile int producerIndex$volatile;

                static {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 15 */            I0001Ioi1lo = unsafe.objectFieldOffset(i01OIoo0l1O.class.getDeclaredField("lastScheduledTask$volatile"));
/* 23 */            I00000oOI = AtomicIntegerFieldUpdater.newUpdater(i01OIoo0l1O.class, "producerIndex$volatile");
/* 33 */            I000II = unsafe.objectFieldOffset(i01OIoo0l1O.class.getDeclaredField("producerIndex$volatile"));
/* 45 */            I0000oI00 = unsafe.objectFieldOffset(i01OIoo0l1O.class.getDeclaredField("consumerIndex$volatile"));
/* 53 */            I0000Il00O = AtomicIntegerFieldUpdater.newUpdater(i01OIoo0l1O.class, "blockingTasksInBuffer$volatile");
/* 63 */            I0000O = unsafe.objectFieldOffset(i01OIoo0l1O.class.getDeclaredField("blockingTasksInBuffer$volatile"));
                }

                public final OloIOlo10 I00000oIO(OloIOlo10 oloIOlo10) {
/* 1 */             AtomicReferenceArray atomicReferenceArray = this.I00000oIO;
/* 9 */             if (I00000oOI() == 127) {
/* 11 */                return oloIOlo10;
                    }
/* 14 */            if (oloIOlo10.I00iiI) {
/* 18 */                I0000Il00O.incrementAndGet(this);
                    }
/* 29 */            int intVolatile = I1Ioolli0l0o.I00000oIO.getIntVolatile(this, I000II) & 127;
/* 34 */            while (atomicReferenceArray.get(intVolatile) != null) {
/* 36 */                Thread.yield();
                    }
/* 40 */            atomicReferenceArray.lazySet(intVolatile, oloIOlo10);
/* 45 */            I00000oOI.incrementAndGet(this);
/* 48 */            return null;
                }

                public final int I00000oOI() {
/* 17 */            return I1Ioolli0l0o.I00000oIO.getIntVolatile(this, I000II) - I1Ioolli0l0o.I00000oIO.getIntVolatile(this, I0000oI00);
                }

                public final OloIOlo10 I0000Il00O() {
                    OloIOlo10 oloIOlo10;
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I0000oI00;
/* 5 */                 int intVolatile = unsafe.getIntVolatile(this, j);
/* 18 */                if (intVolatile - unsafe.getIntVolatile(this, I000II) == 0) {
/* 17 */                    return null;
                        }
/* 21 */                int i = intVolatile & 127;
/* 25 */                i01OIoo0l1O i01oioo0l1o = this;
/* 30 */                if (unsafe.compareAndSwapInt(i01oioo0l1o, j, intVolatile, intVolatile + 1) && (oloIOlo10 = (OloIOlo10) i01oioo0l1o.I00000oIO.getAndSet(i, null)) != null) {
/* 46 */                    if (oloIOlo10.I00iiI) {
/* 50 */                        I0000Il00O.decrementAndGet(i01oioo0l1o);
                            }
/* 113 */                   return oloIOlo10;
                        }
/* 42 */                this = i01oioo0l1o;
                    }
                }

                public final OloIOlo10 I0000O(int i, boolean z) {
/* 1 */             int i2 = i & 127;
/* 3 */             AtomicReferenceArray atomicReferenceArray = this.I00000oIO;
/* 9 */             OloIOlo10 oloIOlo10 = (OloIOlo10) atomicReferenceArray.get(i2);
/* 12 */            if (oloIOlo10 == null || oloIOlo10.I00iiI != z || !atomicReferenceArray.compareAndSet(i2, oloIOlo10, null)) {
/* 11 */                return null;
                    }
/* 24 */            if (z) {
/* 28 */                I0000Il00O.decrementAndGet(this);
                    }
/* 31 */            return oloIOlo10;
                }
            }
