            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.Delayed;
            import java.util.concurrent.RunnableScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicReference;
            
/* 8 */     public final class Io11o0 implements RunnableScheduledFuture {
                public AtomicReference I00iOIl;
                public long I00iiI;
                public Callable I00iiO;
                public IIiOiI0il I00iio;

                @Override
                public final boolean cancel(boolean z) {
/* 3 */             return this.I00iio.cancel(z);
                }

                @Override
                public final int compareTo(Delayed delayed) {
/* 3 */             TimeUnit timeUnit = TimeUnit.MILLISECONDS;
/* 13 */            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
                }

                @Override
                public final Object get() {
/* 5 */             return this.I00iio.I00iiI.get();
                }

                @Override
                public final long getDelay(TimeUnit timeUnit) {
/* 10 */            return timeUnit.convert(this.I00iiI - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                }

                @Override
                public final boolean isCancelled() {
/* 3 */             return this.I00iio.isCancelled();
                }

                @Override
                public final boolean isDone() {
/* 5 */             return this.I00iio.I00iiI.isDone();
                }

                @Override
                public final boolean isPeriodic() {
/* 1 */             return false;
                }

                @Override
                public final void run() {
/* 8 */             IIiOOI iIiOOI = (IIiOOI) this.I00iOIl.getAndSet(null);
/* 10 */            if (iIiOOI != null) {
                        try {
/* 18 */                    iIiOOI.I00000oOI(this.I00iiO.call());
                        } catch (Exception e) {
/* 23 */                    iIiOOI.I0000O(e);
                        }
                    }
                }

                @Override
/* 9 */         public final Object get(long j, TimeUnit timeUnit) {
/* 12 */            return this.I00iio.I00iiI.get(j, timeUnit);
                }
            }
