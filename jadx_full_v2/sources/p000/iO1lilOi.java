            package p000;

            import android.os.Handler;
            import android.os.Looper;
            
            public abstract class iO1lilOi {
                public static final Object I00000oIO = new Object();
                public static Thread I00000oOI;
                public static volatile Handler I0000Il00O;

                public static boolean I00000oIO(Thread thread) {
/* 1 */             Thread thread2 = I00000oOI;
/* 3 */             if (thread2 == null) {
/* 9 */                 thread2 = Looper.getMainLooper().getThread();
/* 13 */                I00000oOI = thread2;
                    }
                    return thread == thread2;
                }

                public static Handler I00000oOI() {
/* 3 */             if (I0000Il00O == null) {
                        synchronized (I00000oIO) {
                            try {
/* 10 */                        if (I0000Il00O == null) {
/* 21 */                            I0000Il00O = new Handler(Looper.getMainLooper());
                                }
                            } finally {
                            }
                        }
                    }
/* 30 */            return I0000Il00O;
                }
            }
