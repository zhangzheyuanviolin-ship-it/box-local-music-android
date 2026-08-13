            package p000;

            import android.os.Handler;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            
            public final class II0l011 implements Executor {
                public final int I00iOIl;
                public Handler I00iiI;

                @Override
                public final void execute(Runnable runnable) {
                    switch (this.I00iOIl) {
                        case 0:
/* 40 */                    this.I00iiI.post(runnable);
/* 43 */                    return;
                        default:
/* 6 */                     Handler handler = this.I00iiI;
/* 12 */                    if (handler.post(runnable)) {
/* 14 */                        return;
                            }
/* 37 */                    throw new RejectedExecutionException(handler + " is shutting down");
                    }
                }
            }
