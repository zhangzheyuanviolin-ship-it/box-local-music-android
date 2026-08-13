            package p000;

            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
/* 27 */    public final class IOO1lioOO {
                public static final IOO1lioOO I00000oOI = new IOO1lioOO(0);
                public static final IOO1lioOO I0000Il00O = new IOO1lioOO(1);
                public final int I00000oIO;

                public IOO1lioOO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public final void I00000oIO(Object obj) throws Exception {
                    boolean zIsTerminated;
                    switch (this.I00000oIO) {
                        case 0:
/* 7 */                     AutoCloseable autoCloseable = (AutoCloseable) obj;
/* 9 */                     if (autoCloseable != null) {
/* 13 */                        if (!(autoCloseable instanceof AutoCloseable)) {
/* 21 */                            if (!(autoCloseable instanceof ExecutorService)) {
/* 70 */                                OIiilo1Ool0o.I00100o1O0lo();
                                        break;
                                    } else {
/* 23 */                                ExecutorService executorService = (ExecutorService) autoCloseable;
/* 29 */                                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 38 */                                    executorService.shutdown();
/* 41 */                                    boolean z = false;
/* 42 */                                    while (!zIsTerminated) {
                                                try {
/* 48 */                                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused) {
/* 53 */                                            if (!z) {
/* 55 */                                                executorService.shutdownNow();
/* 58 */                                                z = true;
                                                    }
                                                }
                                            }
/* 60 */                                    if (z) {
/* 66 */                                        Thread.currentThread().interrupt();
                                                break;
                                            }
                                        }
                                    }
                                } else {
/* 15 */                            autoCloseable.close();
                                    break;
                                }
                            }
                            break;
                    }
                }

/* 28 */        private final void I00000oOI(Object obj) {
                }
            }
