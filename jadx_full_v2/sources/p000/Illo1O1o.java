            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            
/* 6 */     public class Illo1O1o implements ListenableFuture {
                public ListenableFuture I00iOIl;
                public IIiOOI I00iiI;

                public static Illo1O1o I00000oIO(ListenableFuture listenableFuture) {
/* 3 */             if (listenableFuture instanceof Illo1O1o) {
/* 5 */                 return (Illo1O1o) listenableFuture;
                    }
/* 10 */            Illo1O1o illo1O1o = new Illo1O1o();
/* 13 */            listenableFuture.getClass();
/* 16 */            illo1O1o.I00iOIl = listenableFuture;
/* 18 */            VarHandle.storeStoreFence();
/* 29 */            return illo1O1o;
                }

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 3 */             this.I00iOIl.addListener(runnable, executor);
                }

                @Override
                public boolean cancel(boolean z) {
/* 3 */             return this.I00iOIl.cancel(z);
                }

                @Override
                public Object get() {
/* 3 */             return this.I00iOIl.get();
                }

                @Override
                public final boolean isCancelled() {
/* 3 */             return this.I00iOIl.isCancelled();
                }

                @Override
                public final boolean isDone() {
/* 3 */             return this.I00iOIl.isDone();
                }

                @Override
/* 7 */         public Object get(long j, TimeUnit timeUnit) {
/* 8 */             return this.I00iOIl.get(j, timeUnit);
                }
            }
