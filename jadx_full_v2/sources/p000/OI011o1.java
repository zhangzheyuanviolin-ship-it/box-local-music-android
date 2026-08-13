            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.List;
            import java.util.concurrent.AbstractExecutorService;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.Future;
            import java.util.concurrent.RunnableFuture;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
/* 6 */     public final class OI011o1 extends AbstractExecutorService implements ScheduledExecutorService, ExecutorService, AutoCloseable {
                public ScheduledExecutorService I00iOIl;
                public ScheduledExecutorService I00iiI;

                public final ListenableFuture I00000oIO(iooili01 iooili01Var) {
/* 5 */             return (ListenableFuture) super.submit(iooili01Var);
                }

                @Override
                public final boolean awaitTermination(long j, TimeUnit timeUnit) {
/* 3 */             return this.I00iOIl.awaitTermination(j, timeUnit);
                }

                @Override
                public final void close() throws InterruptedException {
                    ScheduledExecutorService scheduledExecutorService;
                    boolean zIsTerminated;
/* 5 */             if (this == ForkJoinPool.commonPool() || (zIsTerminated = (scheduledExecutorService = this.I00iOIl).isTerminated())) {
/* 55 */                return;
                    }
/* 16 */            shutdown();
/* 19 */            boolean z = false;
/* 20 */            while (!zIsTerminated) {
                        try {
/* 26 */                    zIsTerminated = scheduledExecutorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
/* 31 */                    if (!z) {
/* 33 */                        shutdownNow();
/* 36 */                        z = true;
                            }
                        }
                    }
/* 38 */            if (z) {
/* 44 */                Thread.currentThread().interrupt();
                    }
                }

                @Override
                public final void execute(Runnable runnable) {
/* 3 */             this.I00iOIl.execute(runnable);
                }

                @Override
                public final boolean isShutdown() {
/* 3 */             return this.I00iOIl.isShutdown();
                }

                @Override
                public final boolean isTerminated() {
/* 3 */             return this.I00iOIl.isTerminated();
                }

                @Override
                public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
/* 7 */             return new OoIlol(Executors.callable(runnable, obj));
                }

                @Override
                public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
/* 8 */             OoIlol ooIlol = new OoIlol(Executors.callable(runnable, null));
/* 19 */            return new OI011Ol0looI(ooIlol, this.I00iiI.schedule(ooIlol, j, timeUnit));
                }

                @Override
                public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 4 */             OI011io10o0O oI011io10o0O = new OI011io10o0O(runnable);
/* 15 */            return new OI011Ol0looI(oI011io10o0O, this.I00iiI.scheduleAtFixedRate(oI011io10o0O, j, j2, timeUnit));
                }

                @Override
                public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 4 */             OI011io10o0O oI011io10o0O = new OI011io10o0O(runnable);
/* 15 */            return new OI011Ol0looI(oI011io10o0O, this.I00iiI.scheduleWithFixedDelay(oI011io10o0O, j, j2, timeUnit));
                }

                @Override
                public final void shutdown() {
/* 3 */             this.I00iOIl.shutdown();
                }

                @Override
                public final List shutdownNow() {
/* 3 */             return this.I00iOIl.shutdownNow();
                }

                @Override
                public final Future submit(Runnable runnable) {
/* 5 */             return (ListenableFuture) super.submit(runnable);
                }

                public final String toString() {
/* 28 */            return super.toString() + "[" + this.I00iOIl + "]";
                }

                @Override
/* 7 */         public final Future submit(Runnable runnable, Object obj) {
/* 8 */             return (ListenableFuture) super.submit(runnable, obj);
                }

                @Override
/* 8 */         public final Future submit(Callable callable) {
/* 9 */             return (ListenableFuture) super.submit(callable);
                }

                @Override
/* 10 */        public final RunnableFuture newTaskFor(Callable callable) {
/* 11 */            return new OoIlol(callable);
                }

                @Override
/* 22 */        public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
/* 23 */            OoIlol ooIlol = new OoIlol(callable);
/* 25 */            return new OI011Ol0looI(ooIlol, this.I00iiI.schedule(ooIlol, j, timeUnit));
                }
            }
