            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
/* 21 */    public final class ii0ilo11O extends ii00II01Iii0 implements ScheduledExecutorService {
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
/* 10 */            ii110O0 ii110o0 = new ii110O0(Executors.callable(runnable, null));
/* 19 */            return new ii01O1l01iO(ii110o0, scheduledExecutorService.schedule(ii110o0, j, timeUnit));
                }

                @Override
                public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 4 */             ii0IIoiIllI ii0iioiilli = new ii0IIoiIllI(runnable);
/* 15 */            return new ii01O1l01iO(ii0iioiilli, this.I00iiI.scheduleAtFixedRate(ii0iioiilli, j, j2, timeUnit));
                }

                @Override
                public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 4 */             ii0IIoiIllI ii0iioiilli = new ii0IIoiIllI(runnable);
/* 15 */            return new ii01O1l01iO(ii0iioiilli, this.I00iiI.scheduleWithFixedDelay(ii0iioiilli, j, j2, timeUnit));
                }

                @Override
/* 22 */        public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
/* 24 */            ii110O0 ii110o0 = new ii110O0(callable);
/* 26 */            return new ii01O1l01iO(ii110o0, this.I00iiI.schedule(ii110o0, j, timeUnit));
                }
            }
