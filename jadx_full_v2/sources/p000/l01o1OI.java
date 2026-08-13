            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
/* 21 */    public final class l01o1OI extends l01I1l implements ScheduledExecutorService {
                public ScheduledExecutorService I00iiI;

                @Override
                public final void close() throws InterruptedException {
/* 5 */             if (this == ForkJoinPool.commonPool()) {
/* 55 */                return;
                    }
/* 8 */             ExecutorService executorService = this.I00iOIl;
/* 14 */            if (executorService.isTerminated()) {
/* 55 */                return;
                    }
/* 16 */            shutdown();
/* 19 */            boolean zAwaitTermination = false;
/* 20 */            boolean z = false;
/* 21 */            while (!zAwaitTermination) {
                        try {
/* 27 */                    zAwaitTermination = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
/* 33 */                    if (!z) {
/* 35 */                        shutdownNow();
                            }
/* 38 */                    z = true;
                        }
                    }
/* 40 */            if (z) {
/* 46 */                Thread.currentThread().interrupt();
                    }
                }

                @Override
                public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
/* 1 */             ScheduledExecutorService scheduledExecutorService = this.I00iiI;
/* 10 */            l0IlIi l0ilii = new l0IlIi(Executors.callable(runnable, null));
/* 19 */            return new l01O1l0Ii1(l0ilii, scheduledExecutorService.schedule(l0ilii, j, timeUnit));
                }

                @Override
                public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 4 */             l01iiI l01iii = new l01iiI(runnable);
/* 15 */            return new l01O1l0Ii1(l01iii, this.I00iiI.scheduleAtFixedRate(l01iii, j, j2, timeUnit));
                }

                @Override
                public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 4 */             l01iiI l01iii = new l01iiI(runnable);
/* 15 */            return new l01O1l0Ii1(l01iii, this.I00iiI.scheduleWithFixedDelay(l01iii, j, j2, timeUnit));
                }

                @Override
/* 22 */        public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
/* 24 */            l0IlIi l0ilii = new l0IlIi(callable);
/* 26 */            return new l01O1l0Ii1(l0ilii, this.I00iiI.schedule(l0ilii, j, timeUnit));
                }
            }
