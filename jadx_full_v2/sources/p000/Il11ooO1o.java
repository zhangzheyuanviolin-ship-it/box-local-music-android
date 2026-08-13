            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Method;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            public final class Il11ooO1o extends Il11oo implements IiIiOllooO {
                public final Executor I00iiI;

                public Il11ooO1o(Executor executor) {
                    Method method;
/* 4 */             this.I00iiI = executor;
/* 6 */             Method method2 = IOlOi0l1O1O.I00000oIO;
                    try {
/* 15 */                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
/* 16 */                if (scheduledThreadPoolExecutor != null && (method = IOlOi0l1O1O.I00000oIO) != null) {
/* 30 */                    method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
                        }
                    } catch (Throwable unused) {
                    }
                }

                @Override
                public final IiiOlIiio I00000oIO(long j, Runnable runnable, Ii00l101O ii00l101O) {
/* 1 */             Executor executor = this.I00iiI;
/* 5 */             ScheduledFuture<?> scheduledFutureSchedule = null;
/* 11 */            ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
/* 12 */            if (scheduledExecutorService != null) {
                        try {
/* 16 */                    scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
                        } catch (RejectedExecutionException e) {
/* 28 */                    l01oO1iOo.I00000oOI(ii00l101O, ilIiOIi0I.I00000oIO("The task was rejected", e));
                        }
                    }
/* 31 */            if (scheduledFutureSchedule == null) {
/* 46 */                return Ii1o00O.I00l0I0l0lO1.I00000oIO(j, runnable, ii00l101O);
                    }
/* 35 */            IiiOilOO iiiOilOO = new IiiOilOO();
/* 38 */            iiiOilOO.I00iOIl = scheduledFutureSchedule;
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            return iiiOilOO;
                }

                @Override
                public final void I000l1(long j, IIoOoIol0Io0 iIoOoIol0Io0) {
/* 1 */             Executor executor = this.I00iiI;
/* 5 */             ScheduledFuture<?> scheduledFutureSchedule = null;
/* 11 */            ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
/* 12 */            if (scheduledExecutorService != null) {
/* 17 */                illioiliioi illioiliioiVar = new illioiliioi(2);
/* 20 */                illioiliioiVar.I00iiI = this;
/* 22 */                illioiliioiVar.I00iiO = iIoOoIol0Io0;
/* 24 */                VarHandle.storeStoreFence();
/* 27 */                Ii00l101O ii00l101O = iIoOoIol0Io0.I00ilI0I1;
                        try {
/* 31 */                    scheduledFutureSchedule = scheduledExecutorService.schedule(illioiliioiVar, j, TimeUnit.MILLISECONDS);
                        } catch (RejectedExecutionException e) {
/* 43 */                    l01oO1iOo.I00000oOI(ii00l101O, ilIiOIi0I.I00000oIO("The task was rejected", e));
                        }
                    }
/* 46 */            if (scheduledFutureSchedule == null) {
/* 65 */                Ii1o00O.I00l0I0l0lO1.I000l1(j, iIoOoIol0Io0);
/* 89 */                return;
                    }
/* 51 */            IIoOIOIIIl iIoOIOIIIl = new IIoOIOIIIl(0);
/* 54 */            iIoOIOIIIl.I00iiI = scheduledFutureSchedule;
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            iIoOoIol0Io0.I001i1O0Ol(iIoOIOIIIl);
                }

                @Override
                public final void I00iOIl(Ii00l101O ii00l101O, Runnable runnable) {
                    try {
/* 3 */                 this.I00iiI.execute(runnable);
                    } catch (RejectedExecutionException e) {
/* 14 */                l01oO1iOo.I00000oOI(ii00l101O, ilIiOIi0I.I00000oIO("The task was rejected", e));
/* 17 */                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 21 */                Ii1oo1ooill0.I00iiI.I00iOIl(ii00l101O, runnable);
                    }
                }

                @Override
                public final void close() {
/* 1 */             Executor executor = this.I00iiI;
/* 10 */            ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
/* 11 */            if (executorService != null) {
/* 13 */                executorService.shutdown();
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Il11ooO1o) && ((Il11ooO1o) obj).I00iiI == this.I00iiI;
                }

                public final int hashCode() {
/* 3 */             return System.identityHashCode(this.I00iiI);
                }

                @Override
                public final String toString() {
/* 3 */             return this.I00iiI.toString();
                }
            }
