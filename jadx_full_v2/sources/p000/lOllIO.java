            package p000;

            import android.os.Handler;
            import android.os.Looper;
            
            public abstract class lOllIO {
                public static void I00000oIO() {
/* 7 */             lII1OI11o1I.I0000oI00("Not in application's main thread", I00000oOI());
                }

                public static boolean I00000oOI() {
                    return Looper.getMainLooper().getThread() == Thread.currentThread();
                }

                public static void I0000Il00O(Runnable runnable) {
/* 5 */             if (I00000oOI()) {
/* 7 */                 runnable.run();
                    } else {
/* 26 */                lII1OI11o1I.I0000oI00("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
                    }
                }
            }
