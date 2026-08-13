            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Delayed;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
/* 6 */     public final class l0oloi1I0Oi1 extends iII0Il0 implements ScheduledFuture, ListenableFuture, Future {
                public final l01iOilOl1il I00iiI;
                public final ScheduledFuture I00iiO;

                public l0oloi1I0Oi1(l01iOilOl1il l01ioilol1il, ScheduledFuture scheduledFuture) {
/* 2 */             super(4);
/* 5 */             this.I00iiI = l01ioilol1il;
/* 7 */             this.I00iiO = scheduledFuture;
                }

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 3 */             this.I00iiI.addListener(runnable, executor);
                }

                @Override
                public final boolean cancel(boolean z) {
/* 3 */             boolean zCancel = this.I00iiI.cancel(z);
/* 7 */             if (zCancel) {
/* 11 */                this.I00iiO.cancel(z);
                    }
/* 29 */            return zCancel;
                }

                @Override
                public final int compareTo(Delayed delayed) {
/* 5 */             return this.I00iiO.compareTo(delayed);
                }

                @Override
                public final Object get() {
/* 3 */             return this.I00iiI.get();
                }

                @Override
                public final long getDelay(TimeUnit timeUnit) {
/* 3 */             return this.I00iiO.getDelay(timeUnit);
                }

                @Override
                public final boolean isCancelled() {
/* 3 */             return this.I00iiI.isCancelled();
                }

                @Override
                public final boolean isDone() {
/* 3 */             return this.I00iiI.isDone();
                }

                @Override
/* 7 */         public final Object get(long j, TimeUnit timeUnit) {
/* 9 */             return this.I00iiI.get(j, timeUnit);
                }
            }
