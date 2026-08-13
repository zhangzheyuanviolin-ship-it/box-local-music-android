            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class iOOill0O implements Executor {
                public static final iOOill0O I00iiI;
                public Handler I00iOIl;

                static {
/* 3 */             iOOill0O iooill0o = new iOOill0O();
/* 15 */            iooill0o.I00iOIl = new Handler(Looper.getMainLooper());
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00iiI = iooill0o;
                }

                @Override
                public final void execute(Runnable runnable) {
/* 3 */             this.I00iOIl.post(runnable);
                }
            }
