            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            public final class O0olI0 extends Ii00lIOoi implements IiIiOllooO {
                public static final AtomicIntegerFieldUpdater I00io1l = AtomicIntegerFieldUpdater.newUpdater(O0olI0.class, "runningWorkers$volatile");
                public static final long I00ioIO = I1Ioolli0l0o.I00000oIO.objectFieldOffset(O0olI0.class.getDeclaredField("runningWorkers$volatile"));
                public IiIiOllooO I00iiI;
                public Ii00lIOoi I00iiO;
                public int I00iio;
                public O1I0iI0001 I00ilI0I1;
                public Object I00ilO0;
                private volatile int runningWorkers$volatile;

                @Override
                public final IiiOlIiio I00000oIO(long j, Runnable runnable, Ii00l101O ii00l101O) {
/* 3 */             return this.I00iiI.I00000oIO(j, runnable, ii00l101O);
                }

                @Override
                public final void I000l1(long j, IIoOoIol0Io0 iIoOoIol0Io0) {
/* 3 */             this.I00iiI.I000l1(j, iIoOoIol0Io0);
                }

                @Override
                public final void I00iOIl(Ii00l101O ii00l101O, Runnable runnable) {
                    Runnable runnableI00ooiO1I;
/* 3 */             this.I00ilI0I1.I00000oIO(runnable);
/* 16 */            if (I1Ioolli0l0o.I00000oIO.getIntVolatile(this, I00ioIO) >= this.I00iio || !I00oooO() || (runnableI00ooiO1I = I00ooiO1I()) == null) {
/* 89 */                return;
                    }
                    try {
/* 38 */                IiiIIO0IO.I00000oOI(this.I00iiO, this, new l0iOoII1Il(this, runnableI00ooiO1I));
                    } catch (Throwable th) {
/* 45 */                I00io1l.decrementAndGet(this);
/* 48 */                throw th;
                    }
                }

                @Override
                public final void I00oliIiO01i(Ii00l101O ii00l101O, Runnable runnable) {
                    Runnable runnableI00ooiO1I;
/* 3 */             this.I00ilI0I1.I00000oIO(runnable);
/* 16 */            if (I1Ioolli0l0o.I00000oIO.getIntVolatile(this, I00ioIO) >= this.I00iio || !I00oooO() || (runnableI00ooiO1I = I00ooiO1I()) == null) {
/* 89 */                return;
                    }
                    try {
/* 38 */                this.I00iiO.I00oliIiO01i(this, new l0iOoII1Il(this, runnableI00ooiO1I));
                    } catch (Throwable th) {
/* 45 */                I00io1l.decrementAndGet(this);
/* 48 */                throw th;
                    }
                }

                public final Runnable I00ooiO1I() {
                    while (true) {
/* 7 */                 Runnable runnable = (Runnable) this.I00ilI0I1.I0000Il00O();
/* 9 */                 if (runnable != null) {
/* 113 */                   return runnable;
                        }
                        synchronized (this.I00ilO0) {
/* 14 */                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = I00io1l;
/* 16 */                    atomicIntegerFieldUpdater.decrementAndGet(this);
/* 25 */                    if (this.I00ilI0I1.I00000oOI() == 0) {
/* 28 */                        return null;
                            }
/* 30 */                    atomicIntegerFieldUpdater.incrementAndGet(this);
                        }
                    }
                }

                public final boolean I00oooO() {
                    synchronized (this.I00ilO0) {
/* 4 */                 AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = I00io1l;
/* 16 */                if (I1Ioolli0l0o.I00000oIO.getIntVolatile(this, I00ioIO) >= this.I00iio) {
/* 19 */                    return false;
                        }
/* 21 */                atomicIntegerFieldUpdater.incrementAndGet(this);
/* 25 */                return true;
                    }
                }

                @Override
                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(this.I00iiO);
/* 13 */            sb.append(".limitedParallelism(");
/* 20 */            return Oi010OO0.I001i1lo1io(sb, this.I00iio, ')');
                }
            }
