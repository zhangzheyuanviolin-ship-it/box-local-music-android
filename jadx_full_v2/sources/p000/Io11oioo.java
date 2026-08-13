            package p000;

            import android.os.Handler;
            import android.os.SystemClock;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.AbstractExecutorService;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicReference;
            
/* 91 */    public final class Io11oioo extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {
                public final Handler I00iOIl;

                static {
/* 5 */             new I0OiiiO(10);
                }

                public Io11oioo(Handler handler) {
/* 4 */             this.I00iOIl = handler;
                }

                @Override
                public final boolean awaitTermination(long j, TimeUnit timeUnit) {
/* 37 */            throw new UnsupportedOperationException(Io11oioo.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
                }

                @Override
                public final void close() {
/* 5 */             if (this == ForkJoinPool.commonPool()) {
/* 7 */                 return;
                    }
/* 8 */             shutdown();
/* 20 */            throw null;
                }

                @Override
                public final void execute(Runnable runnable) {
/* 1 */             Handler handler = this.I00iOIl;
/* 7 */             if (handler.post(runnable)) {
/* 9 */                 return;
                    }
/* 77 */            throw new RejectedExecutionException(handler + " is shutting down");
                }

                @Override
                public final boolean isShutdown() {
/* 1 */             return false;
                }

                @Override
                public final boolean isTerminated() {
/* 1 */             return false;
                }

                @Override
                public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
/* 11 */            long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit) + SystemClock.uptimeMillis();
/* 14 */            Io11o0 io11o0 = new Io11o0();
/* 23 */            io11o0.I00iOIl = new AtomicReference(null);
/* 25 */            io11o0.I00iiI = jConvert;
/* 27 */            io11o0.I00iiO = callable;
/* 34 */            IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(14, false);
/* 37 */            ioIlOo1o0IIl.I00iio = io11o0;
/* 39 */            Handler handler = this.I00iOIl;
/* 41 */            ioIlOo1o0IIl.I00iiI = handler;
/* 43 */            ioIlOo1o0IIl.I00iiO = callable;
/* 45 */            VarHandle.storeStoreFence();
/* 52 */            io11o0.I00iio = iOiiloIII0O.I00000oIO(ioIlOo1o0IIl);
/* 54 */            VarHandle.storeStoreFence();
/* 61 */            if (handler.postAtTime(io11o0, jConvert)) {
/* 63 */                return io11o0;
                    }
/* 89 */            return new Ioil0iOoOII0(new RejectedExecutionException(handler + " is shutting down"), 1);
                }

                @Override
                public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 204 */           throw new UnsupportedOperationException(Io11oioo.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
                }

                @Override
                public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 204 */           throw new UnsupportedOperationException(Io11oioo.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
                }

                @Override
                public final void shutdown() {
/* 20 */            throw new UnsupportedOperationException(Io11oioo.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
                }

                @Override
                public final List shutdownNow() {
/* 20 */            throw new UnsupportedOperationException(Io11oioo.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
                }

                @Override
/* 92 */        public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
/* 94 */            Io11llo0i io11llo0i = new Io11llo0i(0);
                    io11llo0i.I00000oOI = runnable;
/* 95 */            VarHandle.storeStoreFence();
/* 96 */            return schedule(io11llo0i, j, timeUnit);
                }
            }
