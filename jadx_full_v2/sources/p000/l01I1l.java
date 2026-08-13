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
            import java.util.concurrent.TimeUnit;
            
/* 6 */     public class l01I1l extends AbstractExecutorService implements AutoCloseable, ExecutorService {
                public final ExecutorService I00iOIl;

                public l01I1l(ExecutorService executorService) {
/* 4 */             this.I00iOIl = executorService;
                }

                @Override
                public final boolean awaitTermination(long j, TimeUnit timeUnit) {
/* 3 */             return this.I00iOIl.awaitTermination(j, timeUnit);
                }

                @Override
                public void close() throws InterruptedException {
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
/* 7 */             return new l0IlIi(Executors.callable(runnable, obj));
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
/* 15 */            return Oi010OO0.I001IIilI0O(super.toString(), "[", String.valueOf(this.I00iOIl), "]");
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
/* 12 */            return new l0IlIi(callable);
                }
            }
