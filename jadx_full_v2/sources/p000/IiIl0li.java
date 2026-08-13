            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            public final class IiIl0li implements IiIl1l1l0 {
                public final int I00iOIl;
                public IiIl1iOoI01I I00iiI;
                public Runnable I00iiO;
                public long I00iio;
                public long I00ilI0I1;
                public TimeUnit I00ilO0;

                public IiIl0li(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final ScheduledFuture I00000oIO(iiOlilo0IIIl iiolilo0iiil) {
                    switch (this.I00iOIl) {
                        case 0:
/* 38 */                    IiIl1iOoI01I iiIl1iOoI01I = this.I00iiI;
/* 40 */                    Runnable runnable = this.I00iiO;
/* 42 */                    long j = this.I00iio;
/* 44 */                    long j2 = this.I00ilI0I1;
/* 46 */                    TimeUnit timeUnit = this.I00ilO0;
/* 48 */                    ScheduledExecutorService scheduledExecutorService = iiIl1iOoI01I.I00iiI;
/* 53 */                    IiIl0ol iiIl0ol = new IiIl0ol(0);
/* 56 */                    iiIl0ol.I00iiI = iiIl1iOoI01I;
/* 58 */                    iiIl0ol.I00iiO = runnable;
/* 60 */                    iiIl0ol.I00iio = iiolilo0iiil;
/* 62 */                    VarHandle.storeStoreFence();
/* 65 */                    return scheduledExecutorService.scheduleAtFixedRate(iiIl0ol, j, j2, timeUnit);
                        default:
/* 6 */                     IiIl1iOoI01I iiIl1iOoI01I2 = this.I00iiI;
/* 8 */                     Runnable runnable2 = this.I00iiO;
/* 10 */                    long j3 = this.I00iio;
/* 12 */                    long j4 = this.I00ilI0I1;
/* 14 */                    TimeUnit timeUnit2 = this.I00ilO0;
/* 16 */                    ScheduledExecutorService scheduledExecutorService2 = iiIl1iOoI01I2.I00iiI;
/* 21 */                    IiIl0ol iiIl0ol2 = new IiIl0ol(2);
/* 24 */                    iiIl0ol2.I00iiI = iiIl1iOoI01I2;
/* 26 */                    iiIl0ol2.I00iiO = runnable2;
/* 28 */                    iiIl0ol2.I00iio = iiolilo0iiil;
/* 30 */                    VarHandle.storeStoreFence();
/* 33 */                    return scheduledExecutorService2.scheduleWithFixedDelay(iiIl0ol2, j3, j4, timeUnit2);
                    }
                }
            }
