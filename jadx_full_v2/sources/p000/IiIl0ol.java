            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutorService;
            
            public final class IiIl0ol implements Runnable {
                public final int I00iOIl;
                public IiIl1iOoI01I I00iiI;
                public Runnable I00iiO;
                public iiOlilo0IIIl I00iio;

                public IiIl0ol(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 56 */                    IiIl1iOoI01I iiIl1iOoI01I = this.I00iiI;
/* 58 */                    Runnable runnable = this.I00iiO;
/* 60 */                    iiOlilo0IIIl iiolilo0iiil = this.I00iio;
/* 62 */                    ExecutorService executorService = iiIl1iOoI01I.I00iOIl;
/* 67 */                    IiIl0ii iiIl0ii = new IiIl0ii(0);
/* 70 */                    iiIl0ii.I00iiI = runnable;
/* 72 */                    iiIl0ii.I00iiO = iiolilo0iiil;
/* 74 */                    VarHandle.storeStoreFence();
/* 77 */                    executorService.execute(iiIl0ii);
                            break;
                        case 1:
/* 31 */                    IiIl1iOoI01I iiIl1iOoI01I2 = this.I00iiI;
/* 33 */                    Runnable runnable2 = this.I00iiO;
/* 35 */                    iiOlilo0IIIl iiolilo0iiil2 = this.I00iio;
/* 37 */                    ExecutorService executorService2 = iiIl1iOoI01I2.I00iOIl;
/* 42 */                    IiIl0ii iiIl0ii2 = new IiIl0ii(2);
/* 45 */                    iiIl0ii2.I00iiI = runnable2;
/* 47 */                    iiIl0ii2.I00iiO = iiolilo0iiil2;
/* 49 */                    VarHandle.storeStoreFence();
/* 52 */                    executorService2.execute(iiIl0ii2);
                            break;
                        default:
/* 6 */                     IiIl1iOoI01I iiIl1iOoI01I3 = this.I00iiI;
/* 8 */                     Runnable runnable3 = this.I00iiO;
/* 10 */                    iiOlilo0IIIl iiolilo0iiil3 = this.I00iio;
/* 12 */                    ExecutorService executorService3 = iiIl1iOoI01I3.I00iOIl;
/* 17 */                    IiIl0ii iiIl0ii3 = new IiIl0ii(1);
/* 20 */                    iiIl0ii3.I00iiI = runnable3;
/* 22 */                    iiIl0ii3.I00iiO = iiolilo0iiil3;
/* 24 */                    VarHandle.storeStoreFence();
/* 27 */                    executorService3.execute(iiIl0ii3);
                            break;
                    }
                }
            }
