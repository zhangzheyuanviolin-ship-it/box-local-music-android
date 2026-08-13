            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.util.concurrent.Executor;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ooi1oi1ii implements Executor {
                public static final Ooi1oi1ii I00iOIl;
                public static final Handler I00iiI;
                public static final Ooi1oi1ii[] I00iiO;

                static {
/* 6 */             Ooi1oi1ii ooi1oi1ii = new Ooi1oi1ii("INSTANCE", 0);
/* 9 */             I00iOIl = ooi1oi1ii;
/* 15 */            I00iiO = new Ooi1oi1ii[]{ooi1oi1ii};
/* 26 */            I00iiI = new Handler(Looper.getMainLooper());
                }

                public static Ooi1oi1ii valueOf(String str) {
/* 7 */             return (Ooi1oi1ii) Enum.valueOf(Ooi1oi1ii.class, str);
                }

                public static Ooi1oi1ii[] values() {
/* 7 */             return (Ooi1oi1ii[]) I00iiO.clone();
                }

                @Override
                public final void execute(Runnable runnable) {
/* 3 */             I00iiI.post(runnable);
                }
            }
