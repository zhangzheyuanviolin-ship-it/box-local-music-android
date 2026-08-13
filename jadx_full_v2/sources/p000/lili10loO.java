            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
/* 21 */    public final class lili10loO extends lil11i implements ScheduledExecutorService {
                public ScheduledExecutorService I00iiI;

                @Override
                public final void close() {
                    boolean zIsTerminated;
/* 5 */             if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
/* 55 */                return;
                    }
/* 14 */            shutdown();
/* 17 */            boolean z = false;
/* 18 */            while (!zIsTerminated) {
                        try {
/* 24 */                    zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
/* 29 */                    if (!z) {
/* 31 */                        shutdownNow();
/* 34 */                        z = true;
                            }
                        }
                    }
/* 36 */            if (z) {
/* 42 */                Thread.currentThread().interrupt();
                    }
                }

                @Override
                public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
/* 1 */             ScheduledExecutorService scheduledExecutorService = this.I00iiI;
/* 10 */            lio1llilO lio1llilo = new lio1llilO(Executors.callable(runnable, null));
/* 19 */            return new lilIi0iOoiiO(lio1llilo, scheduledExecutorService.schedule(lio1llilo, j, timeUnit));
                }

                @Override
                public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 4 */             lilOl1Ii lilol1ii = new lilOl1Ii(runnable);
/* 15 */            return new lilIi0iOoiiO(lilol1ii, this.I00iiI.scheduleAtFixedRate(lilol1ii, j, j2, timeUnit));
                }

                @Override
                public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 4 */             lilOl1Ii lilol1ii = new lilOl1Ii(runnable);
/* 15 */            return new lilIi0iOoiiO(lilol1ii, this.I00iiI.scheduleWithFixedDelay(lilol1ii, j, j2, timeUnit));
                }

                @Override
/* 22 */        public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
/* 24 */            lio1llilO lio1llilo = new lio1llilO(callable);
/* 26 */            return new lilIi0iOoiiO(lio1llilo, this.I00iiI.schedule(lio1llilo, j, timeUnit));
                }
            }
