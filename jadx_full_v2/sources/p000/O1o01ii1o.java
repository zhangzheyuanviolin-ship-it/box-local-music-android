            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Deque;
            import java.util.List;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.Future;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
/* 6 */     public final class O1o01ii1o implements ExecutorService, AutoCloseable {
                public static final ThreadLocal I00iiI = new ThreadLocal();
                public final ThreadPoolExecutor I00iOIl;

                public O1o01ii1o() {
/* 4 */             ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
/* 12 */            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
/* 20 */            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
/* 26 */            ililolO ililolo = new ililolO(1);
/* 29 */            ililolo.I00000oOI = threadFactoryDefaultThreadFactory;
/* 31 */            VarHandle.storeStoreFence();
/* 39 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, linkedBlockingQueue, ililolo);
/* 42 */            this.I00iOIl = threadPoolExecutor;
/* 44 */            threadPoolExecutor.allowCoreThreadTimeOut(true);
                }

                @Override
                public final boolean awaitTermination(long j, TimeUnit timeUnit) {
/* 3 */             return this.I00iOIl.awaitTermination(j, timeUnit);
                }

                @Override
                public final void close() {
                    boolean zIsTerminated;
/* 5 */             if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
/* 113 */               return;
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
/* 7 */             Deque deque = (Deque) I00iiI.get();
/* 9 */             if (deque == null || deque.size() > 1) {
/* 46 */                OiIi1OlOOI11 oiIi1OlOOI11 = new OiIi1OlOOI11(5);
/* 49 */                oiIi1OlOOI11.I00iiI = runnable;
/* 51 */                VarHandle.storeStoreFence();
/* 56 */                this.I00iOIl.execute(oiIi1OlOOI11);
/* 186 */               return;
                    }
/* 18 */            deque.add(runnable);
/* 25 */            if (deque.size() <= 1) {
/* 40 */                do {
/* 27 */                    runnable.run();
/* 30 */                    deque.removeFirst();
/* 38 */                    runnable = (Runnable) deque.peekFirst();
/* 40 */                } while (runnable != null);
                    }
                }

                @Override
                public final List invokeAll(Collection collection) {
/* 3 */             return this.I00iOIl.invokeAll(collection);
                }

                @Override
                public final Object invokeAny(Collection collection) {
/* 3 */             return this.I00iOIl.invokeAny(collection);
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
                public final void shutdown() {
/* 3 */             this.I00iOIl.shutdown();
                }

                @Override
                public final List shutdownNow() {
/* 3 */             return this.I00iOIl.shutdownNow();
                }

                @Override
                public final Future submit(Runnable runnable) {
/* 3 */             return this.I00iOIl.submit(runnable);
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.toString();
                }

                @Override
/* 7 */         public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
/* 9 */             return this.I00iOIl.invokeAll(collection, j, timeUnit);
                }

                @Override
/* 7 */         public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
/* 9 */             return this.I00iOIl.invokeAny(collection, j, timeUnit);
                }

                @Override
/* 7 */         public final Future submit(Runnable runnable, Object obj) {
/* 9 */             return this.I00iOIl.submit(runnable, obj);
                }

                @Override
/* 9 */         public final Future submit(Callable callable) {
/* 11 */            return this.I00iOIl.submit(callable);
                }
            }
