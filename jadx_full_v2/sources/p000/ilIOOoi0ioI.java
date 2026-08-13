            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class ilIOOoi0ioI implements Executor {
                public static final ilIOOoi0ioI I00iiI;
                public Handler I00iOIl;

                static {
/* 3 */             ilIOOoi0ioI ilioooi0ioi = new ilIOOoi0ioI();
/* 15 */            ilioooi0ioi.I00iOIl = new Handler(Looper.getMainLooper());
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00iiI = ilioooi0ioi;
                }

                @Override
                public final void execute(Runnable runnable) {
/* 3 */             this.I00iOIl.post(runnable);
                }
            }
