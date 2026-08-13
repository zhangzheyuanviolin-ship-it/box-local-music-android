            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class iO0i0IOoll00 implements Executor {
                public static final iO0i0IOoll00 I00iiI;
                public Handler I00iOIl;

                static {
/* 3 */             iO0i0IOoll00 io0i0iooll00 = new iO0i0IOoll00();
/* 15 */            io0i0iooll00.I00iOIl = new Handler(Looper.getMainLooper());
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00iiI = io0i0iooll00;
                }

                @Override
                public final void execute(Runnable runnable) {
/* 3 */             this.I00iOIl.post(runnable);
                }
            }
