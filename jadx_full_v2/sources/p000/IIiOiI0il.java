            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.ref.WeakReference;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            
/* 6 */     public final class IIiOiI0il implements ListenableFuture {
                public WeakReference I00iOIl;
                public IIiOOoOOll11 I00iiI;

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 3 */             this.I00iiI.addListener(runnable, executor);
                }

                @Override
                public final boolean cancel(boolean z) {
/* 7 */             IIiOOI iIiOOI = (IIiOOI) this.I00iOIl.get();
/* 11 */            boolean zCancel = this.I00iiI.cancel(z);
/* 15 */            if (zCancel && iIiOOI != null) {
/* 20 */                iIiOOI.I00000oIO = null;
/* 22 */                iIiOOI.I00000oOI = null;
/* 26 */                iIiOOI.I0000Il00O.I000OOo1O(null);
                    }
/* 29 */            return zCancel;
                }

                @Override
                public final Object get() {
/* 3 */             return this.I00iiI.get();
                }

                @Override
                public final boolean isCancelled() {
/* 5 */             return this.I00iiI.I00iOIl instanceof I01OIo;
                }

                @Override
                public final boolean isDone() {
/* 3 */             return this.I00iiI.isDone();
                }

                public final String toString() {
/* 3 */             return this.I00iiI.toString();
                }

                @Override
/* 7 */         public final Object get(long j, TimeUnit timeUnit) {
/* 8 */             return this.I00iiI.get(j, timeUnit);
                }
            }
