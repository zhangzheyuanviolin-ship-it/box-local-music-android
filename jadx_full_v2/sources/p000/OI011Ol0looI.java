            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Delayed;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
/* 6 */     public final class OI011Ol0looI implements ScheduledFuture, ListenableFuture, Future {
                public final I011IO1I11OI I00iOIl;
                public final ScheduledFuture I00iiI;

                public OI011Ol0looI(I011IO1I11OI i011io1i11oi, ScheduledFuture scheduledFuture) {
/* 4 */             this.I00iOIl = i011io1i11oi;
/* 6 */             this.I00iiI = scheduledFuture;
                }

                public final boolean I00000oIO(boolean z) {
/* 3 */             return this.I00iOIl.cancel(z);
                }

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 3 */             this.I00iOIl.addListener(runnable, executor);
                }

                @Override
                public final boolean cancel(boolean z) {
/* 1 */             boolean zI00000oIO = I00000oIO(z);
/* 5 */             if (zI00000oIO) {
/* 9 */                 this.I00iiI.cancel(z);
                    }
/* 49 */            return zI00000oIO;
                }

                @Override
                public final int compareTo(Delayed delayed) {
/* 5 */             return this.I00iiI.compareTo(delayed);
                }

                @Override
                public final Object get() {
/* 3 */             return this.I00iOIl.get();
                }

                @Override
                public final long getDelay(TimeUnit timeUnit) {
/* 3 */             return this.I00iiI.getDelay(timeUnit);
                }

                @Override
                public final boolean isCancelled() {
/* 3 */             return this.I00iOIl.isCancelled();
                }

                @Override
                public final boolean isDone() {
/* 3 */             return this.I00iOIl.isDone();
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.toString();
                }

                @Override
/* 7 */         public final Object get(long j, TimeUnit timeUnit) {
/* 9 */             return this.I00iOIl.get(j, timeUnit);
                }
            }
