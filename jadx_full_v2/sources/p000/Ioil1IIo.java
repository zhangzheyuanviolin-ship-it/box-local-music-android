            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            
/* 15 */    public class Ioil1IIo implements ListenableFuture {
                public static final Ioil1IIo I00iiO = new Ioil1IIo(null, 0);
                public final int I00iOIl;
                public final Object I00iiI;

                public Ioil1IIo(Object obj, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
                }

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 1 */             runnable.getClass();
/* 4 */             executor.getClass();
                    try {
/* 7 */                 executor.execute(runnable);
                    } catch (RuntimeException e) {
/* 36 */                l11I11lO.I00000oOI("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
                    }
                }

                @Override
                public final boolean cancel(boolean z) {
/* 1 */             return false;
                }

                @Override
                public final Object get() throws ExecutionException {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 16 */                    return obj;
                        default:
/* 15 */                    throw new ExecutionException((Exception) obj);
                    }
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
/* 1 */             int i = this.I00iOIl;
/* 5 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 63 */                    return super.toString() + "[status=SUCCESS, result=[" + obj + "]]";
                        default:
/* 35 */                    return super.toString() + "[status=FAILURE, cause=[" + ((Exception) obj) + "]]";
                    }
                }

                @Override
/* 16 */        public final Object get(long j, TimeUnit timeUnit) {
/* 17 */            timeUnit.getClass();
/* 18 */            return get();
                }
            }
