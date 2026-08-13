            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            
/* 6 */     public final class iolloOOi00 extends iollI00lIIil {
                public ListenableFuture I00ioIO;

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 3 */             this.I00ioIO.addListener(runnable, executor);
                }

                @Override
                public final boolean cancel(boolean z) {
/* 3 */             return this.I00ioIO.cancel(z);
                }

                @Override
                public final Object get() {
/* 3 */             return this.I00ioIO.get();
                }

                @Override
                public final boolean isCancelled() {
/* 3 */             return this.I00ioIO.isCancelled();
                }

                @Override
                public final boolean isDone() {
/* 3 */             return this.I00ioIO.isDone();
                }

                @Override
                public final String toString() {
/* 3 */             return this.I00ioIO.toString();
                }

                @Override
/* 7 */         public final Object get(long j, TimeUnit timeUnit) {
/* 8 */             return this.I00ioIO.get(j, timeUnit);
                }
            }
