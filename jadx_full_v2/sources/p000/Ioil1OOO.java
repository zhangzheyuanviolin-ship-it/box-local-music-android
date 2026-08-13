            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Level;
            
/* 5 */     public final class Ioil1OOO implements ListenableFuture {
                public static final Ioil1OOO I00iiI = new Ioil1OOO(null);
                public static final O0o0ill01o0 I00iiO = new O0o0ill01o0(0, Ioil1OOO.class);
                public final Object I00iOIl;

                public Ioil1OOO(Object obj) {
/* 4 */             this.I00iOIl = obj;
                }

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 3 */             lII0I0I01I1l.I0001Ioi1lo("Runnable was null.", runnable);
/* 8 */             lII0I0I01I1l.I0001Ioi1lo("Executor was null.", executor);
                    try {
/* 11 */                executor.execute(runnable);
                    } catch (Exception e) {
/* 46 */                I00iiO.I00000oIO().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
                    }
                }

                @Override
                public final boolean cancel(boolean z) {
/* 1 */             return false;
                }

                @Override
                public final Object get(long j, TimeUnit timeUnit) {
/* 1 */             timeUnit.getClass();
/* 4 */             return this.I00iOIl;
                }

                @Override
                public final boolean isCancelled() {
/* 1 */             return false;
                }

                @Override
                public final boolean isDone() {
/* 1 */             return true;
                }

                public final String toString() {
/* 28 */            return super.toString() + "[status=SUCCESS, result=[" + this.I00iOIl + "]]";
                }

                @Override
/* 6 */         public final Object get() {
/* 7 */             return this.I00iOIl;
                }
            }
