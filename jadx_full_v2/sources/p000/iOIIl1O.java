            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class iOIIl1O implements Executor {
                public static final iOIIl1O I00iiI;
                public Handler I00iOIl;

                static {
/* 3 */             iOIIl1O ioiil1o = new iOIIl1O();
/* 15 */            ioiil1o.I00iOIl = new Handler(Looper.getMainLooper());
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00iiI = ioiil1o;
                }

                @Override
                public final void execute(Runnable runnable) {
/* 3 */             this.I00iOIl.post(runnable);
                }
            }
