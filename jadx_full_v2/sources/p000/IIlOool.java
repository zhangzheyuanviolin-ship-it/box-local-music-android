            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.List;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicInteger;
            
/* 13 */    public final class IIlOool implements Executor, ScheduledExecutorService, AutoCloseable {
                public static final IIlOo10 I00iiO;
                public Object I00iOIl;
                public ScheduledThreadPoolExecutor I00iiI;

                static {
/* 4 */             IIlOo10 iIlOo10 = new IIlOo10(0);
/* 12 */            iIlOo10.I00000oOI = new AtomicInteger(0);
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            I00iiO = iIlOo10;
                }

                public final void I00000oIO(IIlOoolol0ll iIlOoolol0ll) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
/* 1 */             iIlOoolol0ll.getClass();
                    synchronized (this.I00iOIl) {
                        try {
/* 14 */                    if (this.I00iiI.isShutdown()) {
/* 20 */                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, I00iiO);
/* 27 */                        scheduledThreadPoolExecutor2.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
/* 35 */                        scheduledThreadPoolExecutor2.setRejectedExecutionHandler(new IIlOo0Io());
/* 38 */                        this.I00iiI = scheduledThreadPoolExecutor2;
                            }
/* 43 */                    scheduledThreadPoolExecutor = this.I00iiI;
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 58 */            scheduledThreadPoolExecutor.setCorePoolSize(Math.max(1, iIlOoolol0ll.I000OOo1O().size()));
                }

                @Override
                public final boolean awaitTermination(long j, TimeUnit timeUnit) {
                    boolean zAwaitTermination;
                    synchronized (this.I00iOIl) {
/* 6 */                 zAwaitTermination = this.I00iiI.awaitTermination(j, timeUnit);
                    }
/* 11 */            return zAwaitTermination;
                }

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
                public final void execute(Runnable runnable) {
/* 1 */             runnable.getClass();
                    synchronized (this.I00iOIl) {
/* 9 */                 this.I00iiI.execute(runnable);
                    }
                }

                @Override
                public final List invokeAll(Collection collection) {
                    List listInvokeAll;
                    synchronized (this.I00iOIl) {
/* 6 */                 listInvokeAll = this.I00iiI.invokeAll(collection);
                    }
/* 11 */            return listInvokeAll;
                }

                @Override
                public final Object invokeAny(Collection collection) {
                    Object objInvokeAny;
                    synchronized (this.I00iOIl) {
/* 6 */                 objInvokeAny = this.I00iiI.invokeAny(collection);
                    }
/* 11 */            return objInvokeAny;
                }

                @Override
                public final boolean isShutdown() {
                    boolean zIsShutdown;
                    synchronized (this.I00iOIl) {
/* 6 */                 zIsShutdown = this.I00iiI.isShutdown();
                    }
/* 11 */            return zIsShutdown;
                }

                @Override
                public final boolean isTerminated() {
                    boolean zIsTerminated;
                    synchronized (this.I00iOIl) {
/* 6 */                 zIsTerminated = this.I00iiI.isTerminated();
                    }
/* 11 */            return zIsTerminated;
                }

                @Override
                public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
                    ScheduledFuture<?> scheduledFutureSchedule;
                    synchronized (this.I00iOIl) {
/* 6 */                 scheduledFutureSchedule = this.I00iiI.schedule(runnable, j, timeUnit);
                    }
/* 11 */            return scheduledFutureSchedule;
                }

                @Override
                public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
                    ScheduledFuture<?> scheduledFutureScheduleAtFixedRate;
                    synchronized (this.I00iOIl) {
/* 6 */                 scheduledFutureScheduleAtFixedRate = this.I00iiI.scheduleAtFixedRate(runnable, j, j2, timeUnit);
                    }
/* 11 */            return scheduledFutureScheduleAtFixedRate;
                }

                @Override
                public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
                    ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
                    synchronized (this.I00iOIl) {
/* 6 */                 scheduledFutureScheduleWithFixedDelay = this.I00iiI.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
                    }
/* 11 */            return scheduledFutureScheduleWithFixedDelay;
                }

                @Override
                public final void shutdown() {
                    synchronized (this.I00iOIl) {
/* 6 */                 this.I00iiI.shutdown();
                    }
                }

                @Override
                public final List shutdownNow() {
                    List<Runnable> listShutdownNow;
                    synchronized (this.I00iOIl) {
/* 6 */                 listShutdownNow = this.I00iiI.shutdownNow();
                    }
/* 11 */            return listShutdownNow;
                }

                @Override
                public final Future submit(Callable callable) {
                    Future futureSubmit;
                    synchronized (this.I00iOIl) {
/* 6 */                 futureSubmit = this.I00iiI.submit(callable);
                    }
/* 11 */            return futureSubmit;
                }

                @Override
/* 14 */        public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
                    List listInvokeAll;
                    synchronized (this.I00iOIl) {
/* 16 */                listInvokeAll = this.I00iiI.invokeAll(collection, j, timeUnit);
                    }
                    return listInvokeAll;
                }

                @Override
/* 14 */        public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
                    Object objInvokeAny;
                    synchronized (this.I00iOIl) {
/* 16 */                objInvokeAny = this.I00iiI.invokeAny(collection, j, timeUnit);
                    }
                    return objInvokeAny;
                }

                @Override
/* 14 */        public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
                    ScheduledFuture scheduledFutureSchedule;
                    synchronized (this.I00iOIl) {
/* 16 */                scheduledFutureSchedule = this.I00iiI.schedule(callable, j, timeUnit);
                    }
                    return scheduledFutureSchedule;
                }

                @Override
/* 14 */        public final Future submit(Runnable runnable, Object obj) {
                    Future futureSubmit;
                    synchronized (this.I00iOIl) {
/* 16 */                futureSubmit = this.I00iiI.submit(runnable, obj);
                    }
                    return futureSubmit;
                }

                @Override
/* 17 */        public final Future submit(Runnable runnable) {
                    Future<?> futureSubmit;
                    synchronized (this.I00iOIl) {
/* 19 */                futureSubmit = this.I00iiI.submit(runnable);
                    }
                    return futureSubmit;
                }
            }
