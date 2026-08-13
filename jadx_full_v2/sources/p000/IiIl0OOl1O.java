            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            public final class IiIl0OOl1O implements IiIl1l1l0, OllIoO1OO {
                public final int I00iOIl;
                public Object I00iiI;
                public long I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public IiIl0OOl1O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public ScheduledFuture I00000oIO(iiOlilo0IIIl iiolilo0iiil) {
                    switch (this.I00iOIl) {
                        case 0:
/* 44 */                    IiIl1iOoI01I iiIl1iOoI01I = (IiIl1iOoI01I) this.I00iiI;
/* 48 */                    Runnable runnable = (Runnable) this.I00ilI0I1;
/* 50 */                    long j = this.I00iiO;
/* 54 */                    TimeUnit timeUnit = (TimeUnit) this.I00iio;
/* 56 */                    ScheduledExecutorService scheduledExecutorService = iiIl1iOoI01I.I00iiI;
/* 61 */                    IiIl0ol iiIl0ol = new IiIl0ol(1);
/* 64 */                    iiIl0ol.I00iiI = iiIl1iOoI01I;
/* 66 */                    iiIl0ol.I00iiO = runnable;
/* 68 */                    iiIl0ol.I00iio = iiolilo0iiil;
/* 70 */                    VarHandle.storeStoreFence();
/* 73 */                    return scheduledExecutorService.schedule(iiIl0ol, j, timeUnit);
                        default:
/* 8 */                     IiIl1iOoI01I iiIl1iOoI01I2 = (IiIl1iOoI01I) this.I00iiI;
/* 12 */                    Callable callable = (Callable) this.I00ilI0I1;
/* 14 */                    long j2 = this.I00iiO;
/* 18 */                    TimeUnit timeUnit2 = (TimeUnit) this.I00iio;
/* 20 */                    ScheduledExecutorService scheduledExecutorService2 = iiIl1iOoI01I2.I00iiI;
/* 25 */                    IiIl1O1 iiIl1O1 = new IiIl1O1(0);
/* 28 */                    iiIl1O1.I00000oOI = iiIl1iOoI01I2;
/* 30 */                    iiIl1O1.I0000Il00O = callable;
/* 32 */                    iiIl1O1.I0000O = iiolilo0iiil;
/* 34 */                    VarHandle.storeStoreFence();
/* 37 */                    return scheduledExecutorService2.schedule(iiIl1O1, j2, timeUnit2);
                    }
                }

                @Override
                public Object I000oI1ioi() {
/* 3 */             IiOili0lOO1 iiOili0lOO1 = (IiOili0lOO1) this.I00iiI;
/* 7 */             Iterable iterable = (Iterable) this.I00ilI0I1;
/* 11 */            I1lO11 i1lO11 = (I1lO11) this.I00iio;
/* 13 */            long j = this.I00iiO;
/* 17 */            OiIIilol0iO oiIIilol0iO = (OiIIilol0iO) iiOili0lOO1.I00iio;
/* 19 */            oiIIilol0iO.getClass();
/* 30 */            if (iterable.iterator().hasNext()) {
/* 39 */                String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(OiIIilol0iO.I001i1lo1io(iterable));
/* 47 */                IIoIil iIoIil = new IIoIil(15);
/* 50 */                iIoIil.I00iiI = oiIIilol0iO;
/* 52 */                iIoIil.I00iiO = strConcat;
/* 54 */                VarHandle.storeStoreFence();
/* 57 */                oiIIilol0iO.I000II(iIoIil);
                    }
/* 68 */            long jI0001Ioi1lo = ((IOO0l0i0Oo) iiOili0lOO1.I00ioIO).I0001Ioi1lo() + j;
/* 72 */            OiIIIO0OO0 oiIIIO0OO0 = new OiIIIO0OO0(1);
/* 75 */            oiIIIO0OO0.I00iiI = jI0001Ioi1lo;
/* 77 */            oiIIIO0OO0.I00iiO = i1lO11;
/* 79 */            VarHandle.storeStoreFence();
/* 82 */            oiIIilol0iO.I000II(oiIIIO0OO0);
/* 85 */            return null;
                }
            }
