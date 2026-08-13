            package p000;

            import android.os.Handler;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            
            public final class II0i0l01ooIO implements Executor {
                public final int I00iOIl;
                public Handler I00iiI;

                @Override
                public final void execute(Runnable runnable) {
                    switch (this.I00iOIl) {
                        case 0:
/* 43 */                    this.I00iiI.post(runnable);
/* 46 */                    return;
                        default:
/* 6 */                     Handler handler = this.I00iiI;
/* 8 */                     runnable.getClass();
/* 15 */                    if (handler.post(runnable)) {
/* 17 */                        return;
                            }
/* 40 */                    throw new RejectedExecutionException(handler + " is shutting down");
                    }
                }
            }
