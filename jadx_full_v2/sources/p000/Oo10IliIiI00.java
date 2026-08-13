            package p000;

            import android.os.Looper;
            
            public abstract class Oo10IliIiI00 {
                public static final long I00000oIO;

                static {
                    long id;
                    try {
/* 9 */                 id = Looper.getMainLooper().getThread().getId();
                    } catch (Exception unused) {
/* 14 */                id = -1;
                    }
/* 16 */            I00000oIO = id;
                }
            }
