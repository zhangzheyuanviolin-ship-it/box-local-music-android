            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            
/* 6 */     public final class Oll0oO implements ListenableFuture, IOoil1iiIilo {
                public IiIOIO1I I00iOIl;
                public Oi0OoOoOI1li I00iiI;

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 3 */             this.I00iiI.addListener(runnable, executor);
                }

                @Override
                public final boolean cancel(boolean z) {
/* 3 */             boolean zCancel = this.I00iiI.cancel(z);
/* 7 */             if (zCancel) {
/* 12 */                this.I00iOIl.I000II(null);
                    }
/* 29 */            return zCancel;
                }

                @Override
                public final Object get() {
/* 3 */             return this.I00iiI.get();
                }

                @Override
                public final Ii00l101O getContext() {
/* 1 */             return Oll101.I00000oOI;
                }

                @Override
                public final boolean isCancelled() {
/* 5 */             return this.I00iiI.I00iOIl instanceof I01OIo;
                }

                @Override
                public final boolean isDone() {
/* 3 */             return this.I00iiI.isDone();
                }

                @Override
                public final void resumeWith(Object obj) {
/* 1 */             Oi0OoOoOI1li oi0OoOoOI1li = this.I00iiI;
/* 3 */             Throwable thI00000oOI = Oi10ii.I00000oOI(obj);
/* 7 */             if (thI00000oOI == null) {
/* 9 */                 oi0OoOoOI1li.I000OOo1O(obj);
                    } else if (thI00000oOI instanceof CancellationException) {
/* 18 */                oi0OoOoOI1li.cancel(false);
                    } else {
/* 22 */                oi0OoOoOI1li.I000OiO(thI00000oOI);
                    }
                }

                @Override
/* 7 */         public final Object get(long j, TimeUnit timeUnit) {
/* 8 */             return this.I00iiI.get(j, timeUnit);
                }
            }
