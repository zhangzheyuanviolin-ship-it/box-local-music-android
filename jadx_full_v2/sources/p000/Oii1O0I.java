            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import sun.misc.Unsafe;
            
            public abstract class Oii1O0I extends IOlOio11 implements OIIoiiOIil00 {
                public static final AtomicIntegerFieldUpdater I00ilI0I1 = AtomicIntegerFieldUpdater.newUpdater(Oii1O0I.class, "cleanedAndPointers$volatile");
                public static final long I00ilO0 = I1Ioolli0l0o.I00000oIO.objectFieldOffset(Oii1O0I.class.getDeclaredField("cleanedAndPointers$volatile"));
                public final long I00iio;
                private volatile int cleanedAndPointers$volatile;

                public Oii1O0I(long j, Oii1O0I oii1O0I, int i) {
/* 1 */             super(oii1O0I);
/* 4 */             this.I00iio = j;
/* 8 */             this.cleanedAndPointers$volatile = i << 16;
                }

                @Override
                public final boolean I0000O() {
                    return I1Ioolli0l0o.I00000oIO.getIntVolatile(this, I00ilO0) == I000II() && I0000Il00O() != null;
                }

                public final boolean I0001Ioi1lo() {
                    return I00ilI0I1.addAndGet(this, -65536) == I000II() && I0000Il00O() != null;
                }

                public abstract int I000II();

                public abstract void I000O01llI0(int i, Ii00l101O ii00l101O);

                public final void I000OOo1O() {
/* 11 */            if (I00ilI0I1.incrementAndGet(this) == I000II()) {
/* 13 */                I0000oI00();
                    }
                }

                public final boolean I000OiO() {
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00ilO0;
/* 5 */                 int intVolatile = unsafe.getIntVolatile(this, j);
/* 13 */                if (intVolatile == this.I000II() && this.I0000Il00O() != null) {
/* 22 */                    return false;
                        }
/* 28 */                Oii1O0I oii1O0I = this;
/* 33 */                if (unsafe.compareAndSwapInt(oii1O0I, j, intVolatile, intVolatile + 65536)) {
/* 35 */                    return true;
                        }
/* 37 */                this = oii1O0I;
                    }
                }
            }
