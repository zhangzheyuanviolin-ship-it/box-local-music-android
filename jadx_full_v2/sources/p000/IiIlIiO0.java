            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Delayed;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            public final class IiIlIiO0 extends I01Ol1o0 implements ScheduledFuture {
                public final ScheduledFuture I00ioIO;

                public IiIlIiO0(IiIl1l1l0 iiIl1l1l0) {
/* 6 */             iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 9 */             iiolilo0iiil.I00iOIl = this;
/* 11 */            VarHandle.storeStoreFence();
/* 18 */            this.I00ioIO = iiIl1l1l0.I00000oIO(iiolilo0iiil);
                }

                @Override
                public final void I00000oOI() {
/* 1 */             ScheduledFuture scheduledFuture = this.I00ioIO;
/* 3 */             Object obj = this.I00iOIl;
/* 18 */            scheduledFuture.cancel((obj instanceof I01OIo) && ((I01OIo) obj).I00000oIO);
                }

                @Override
                public final int compareTo(Delayed delayed) {
/* 5 */             return this.I00ioIO.compareTo(delayed);
                }

                @Override
                public final long getDelay(TimeUnit timeUnit) {
/* 3 */             return this.I00ioIO.getDelay(timeUnit);
                }
            }
