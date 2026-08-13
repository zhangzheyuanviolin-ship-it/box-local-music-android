            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.List;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
/* 6 */     public final class IiIl1iOoI01I implements ScheduledExecutorService, AutoCloseable {
                public ExecutorService I00iOIl;
                public ScheduledExecutorService I00iiI;

                @Override
                public final boolean awaitTermination(long j, TimeUnit timeUnit) {
/* 3 */             return this.I00iOIl.awaitTermination(j, timeUnit);
                }

                @Override
                public final void close() {
/* 5 */             if (this == ForkJoinPool.commonPool() || isTerminated()) {
/* 14 */                return;
                    }
/* 15 */            shutdown();
/* 29 */            throw null;
                }

                @Override
                public final void execute(Runnable runnable) {
/* 3 */             this.I00iOIl.execute(runnable);
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
                public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
/* 6 */             IiIl0OOl1O iiIl0OOl1O = new IiIl0OOl1O(0);
/* 9 */             iiIl0OOl1O.I00iiI = this;
/* 11 */            iiIl0OOl1O.I00ilI0I1 = runnable;
/* 13 */            iiIl0OOl1O.I00iiO = j;
/* 15 */            iiIl0OOl1O.I00iio = timeUnit;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            return new IiIlIiO0(iiIl0OOl1O);
                }

                @Override
                public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 6 */             IiIl0li iiIl0li = new IiIl0li(0);
/* 9 */             iiIl0li.I00iiI = this;
/* 11 */            iiIl0li.I00iiO = runnable;
/* 13 */            iiIl0li.I00iio = j;
/* 15 */            iiIl0li.I00ilI0I1 = j2;
/* 17 */            iiIl0li.I00ilO0 = timeUnit;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            return new IiIlIiO0(iiIl0li);
                }

                @Override
                public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 6 */             IiIl0li iiIl0li = new IiIl0li(1);
/* 9 */             iiIl0li.I00iiI = this;
/* 11 */            iiIl0li.I00iiO = runnable;
/* 13 */            iiIl0li.I00iio = j;
/* 15 */            iiIl0li.I00ilI0I1 = j2;
/* 17 */            iiIl0li.I00ilO0 = timeUnit;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            return new IiIlIiO0(iiIl0li);
                }

                @Override
                public final void shutdown() {
/* 29 */            throw new UnsupportedOperationException("Shutting down is not allowed.");
                }

                @Override
                public final List shutdownNow() {
/* 29 */            throw new UnsupportedOperationException("Shutting down is not allowed.");
                }

                @Override
                public final Future submit(Callable callable) {
/* 3 */             return this.I00iOIl.submit(callable);
                }

                @Override
/* 7 */         public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
/* 8 */             return this.I00iOIl.invokeAll(collection, j, timeUnit);
                }

                @Override
/* 7 */         public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
/* 8 */             return this.I00iOIl.invokeAny(collection, j, timeUnit);
                }

                @Override
/* 7 */         public final Future submit(Runnable runnable, Object obj) {
/* 8 */             return this.I00iOIl.submit(runnable, obj);
                }

                @Override
/* 8 */         public final Future submit(Runnable runnable) {
/* 9 */             return this.I00iOIl.submit(runnable);
                }

                @Override
/* 23 */        public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
                    IiIl0OOl1O iiIl0OOl1O = new IiIl0OOl1O(1);
                    iiIl0OOl1O.I00iiI = this;
                    iiIl0OOl1O.I00ilI0I1 = callable;
                    iiIl0OOl1O.I00iiO = j;
                    iiIl0OOl1O.I00iio = timeUnit;
                    VarHandle.storeStoreFence();
/* 24 */            return new IiIlIiO0(iiIl0OOl1O);
                }
            }
