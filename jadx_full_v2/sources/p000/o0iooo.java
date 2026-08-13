            package p000;

            import android.os.SystemClock;
            
            public abstract class o0iooo {
                public static final o0ilOOi0 I00000oIO;

                static {
                    o0ilOOi0 o0ilooi0;
                    try {
/* 1 */                 SystemClock.elapsedRealtimeNanos();
/* 7 */                 o0ilooi0 = new o0ilOOi0(0);
                    } catch (Throwable unused) {
/* 11 */                SystemClock.elapsedRealtime();
/* 17 */                o0ilooi0 = new o0ilOOi0(1);
                    }
/* 20 */            I00000oIO = o0ilooi0;
                }
            }
