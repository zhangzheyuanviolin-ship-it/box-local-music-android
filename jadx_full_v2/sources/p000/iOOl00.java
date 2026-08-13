            package p000;

            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
            public abstract class iOOl00 {
                public static final void I00000oIO(AutoCloseable autoCloseable, Throwable th) {
                    boolean zIsTerminated;
/* 1 */             if (autoCloseable != null) {
/* 3 */                 if (th != null) {
                            try {
/* 68 */                        OooioIOo1.I0010o(autoCloseable);
/* 71 */                        return;
                            } catch (Throwable th2) {
/* 73 */                        ilIilolOlIoO.I00000oIO(th, th2);
/* 106 */                       return;
                            }
                        }
/* 7 */                 if (autoCloseable instanceof AutoCloseable) {
/* 9 */                     autoCloseable.close();
/* 106 */                   return;
                        }
/* 15 */                if (!(autoCloseable instanceof ExecutorService)) {
/* 64 */                    OIiilo1Ool0o.I00100o1O0lo();
/* 67 */                    return;
                        }
/* 17 */                ExecutorService executorService = (ExecutorService) autoCloseable;
/* 23 */                if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
/* 106 */                   return;
                        }
/* 32 */                executorService.shutdown();
/* 35 */                boolean z = false;
/* 36 */                while (!zIsTerminated) {
                            try {
/* 42 */                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
/* 47 */                        if (!z) {
/* 49 */                            executorService.shutdownNow();
/* 52 */                            z = true;
                                }
                            }
                        }
/* 54 */                if (z) {
/* 60 */                    Thread.currentThread().interrupt();
                        }
                    }
                }
            }
