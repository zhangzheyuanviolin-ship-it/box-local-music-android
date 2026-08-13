            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.locks.ReentrantLock;
            
            public final class OlOIIi0lO0 {
                public static final ReentrantLock I0000Il00O = new ReentrantLock();
                public static OlOIIi0lO0 I0000O;
                public ReentrantLock I00000oIO;
                public SharedPreferences I00000oOI;

                public static OlOIIi0lO0 I00000oIO(Context context) {
/* 1 */             lII0I0I000I.I000II(context);
/* 4 */             ReentrantLock reentrantLock = I0000Il00O;
/* 6 */             reentrantLock.lock();
                    try {
/* 9 */                 OlOIIi0lO0 olOIIi0lO0 = I0000O;
/* 11 */                if (olOIIi0lO0 == null) {
/* 15 */                    Context applicationContext = context.getApplicationContext();
/* 19 */                    olOIIi0lO0 = new OlOIIi0lO0();
/* 27 */                    olOIIi0lO0.I00000oIO = new ReentrantLock();
/* 36 */                    olOIIi0lO0.I00000oOI = applicationContext.getSharedPreferences("com.google.android.gms.signin", 0);
/* 38 */                    VarHandle.storeStoreFence();
/* 41 */                    I0000O = olOIIi0lO0;
                        }
/* 49 */                return olOIIi0lO0;
                    } finally {
/* 50 */                reentrantLock.unlock();
                    }
                }

                public final String I00000oOI(String str) {
/* 1 */             ReentrantLock reentrantLock = this.I00000oIO;
/* 3 */             reentrantLock.lock();
                    try {
/* 9 */                 return this.I00000oOI.getString(str, null);
                    } finally {
/* 18 */                reentrantLock.unlock();
                    }
                }
            }
