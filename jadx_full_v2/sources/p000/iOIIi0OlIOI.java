            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class iOIIi0OlIOI implements Executor {
                public static final iOIIi0OlIOI I00iiI;
                public Handler I00iOIl;

                static {
/* 3 */             iOIIi0OlIOI ioiii0olioi = new iOIIi0OlIOI();
/* 15 */            ioiii0olioi.I00iOIl = new Handler(Looper.getMainLooper());
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00iiI = ioiii0olioi;
                }

                @Override
                public final void execute(Runnable runnable) {
/* 3 */             this.I00iOIl.post(runnable);
                }
            }
