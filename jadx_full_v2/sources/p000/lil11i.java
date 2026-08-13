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
            
/* 6 */     public class lil11i extends AbstractExecutorService implements AutoCloseable, ExecutorService {
                public final ExecutorService I00iOIl;

                public lil11i(ExecutorService executorService) {
/* 4 */             this.I00iOIl = executorService;
                }

                @Override
                public final boolean awaitTermination(long j, TimeUnit timeUnit) {
/* 3 */             return this.I00iOIl.awaitTermination(j, timeUnit);
                }

                @Override
                public void close() {
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
/* 7 */             return new lio1llilO(Executors.callable(runnable, obj));
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
/* 1 */             String string = super.toString();
/* 7 */             String strValueOf = String.valueOf(this.I00iOIl);
/* 37 */            return IIl001iO0Io.I00100o1O0lo(new StringBuilder(IIlIOloOOO.I0000Il00O(String.valueOf(string).length(), 1, strValueOf.length(), 1)), string, "[", strValueOf, "]");
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
/* 12 */            return new lio1llilO(callable);
                }
            }
