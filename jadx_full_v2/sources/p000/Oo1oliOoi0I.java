            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import com.google.firebase.messaging.FirebaseMessaging;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            
            public final class Oo1oliOoi0I implements Callable {
                public Context I00000oIO;
                public ScheduledThreadPoolExecutor I00000oOI;
                public I101oOiOiI I0000Il00O;
                public IlIoliIO I0000O;
                public FirebaseMessaging I0000oI00;
                public IlO0Ii1Il00o I0001Ioi1lo;

                @Override
                public final Object call() {
                    Oo1ol1loo1 oo1ol1loo1;
/* 1 */             Context context = this.I00000oIO;
/* 3 */             ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.I00000oOI;
/* 5 */             I101oOiOiI i101oOiOiI = this.I0000Il00O;
/* 7 */             IlIoliIO ilIoliIO = this.I0000O;
/* 9 */             FirebaseMessaging firebaseMessaging = this.I0000oI00;
/* 11 */            IlO0Ii1Il00o ilO0Ii1Il00o = this.I0001Ioi1lo;
                    synchronized (Oo1ol1loo1.class) {
                        try {
/* 16 */                    WeakReference weakReference = Oo1ol1loo1.I00000oOI;
/* 29 */                    oo1ol1loo1 = weakReference != null ? (Oo1ol1loo1) weakReference.get() : null;
/* 31 */                    if (oo1ol1loo1 == null) {
/* 35 */                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
/* 41 */                        Oo1ol1loo1 oo1ol1loo12 = new Oo1ol1loo1();
/* 44 */                        VarHandle.storeStoreFence();
                                synchronized (oo1ol1loo12) {
/* 52 */                            oo1ol1loo12.I00000oIO = I1ii1o0.I001l0I00(sharedPreferences, scheduledThreadPoolExecutor);
                                }
/* 60 */                        Oo1ol1loo1.I00000oOI = new WeakReference(oo1ol1loo12);
/* 62 */                        oo1ol1loo1 = oo1ol1loo12;
                            }
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
/* 72 */            Oo1ol1ll oo1ol1ll = new Oo1ol1ll(0);
/* 75 */            oo1ol1ll.I00iiI = ilO0Ii1Il00o;
/* 77 */            oo1ol1ll.I00iiO = ilIoliIO;
/* 79 */            oo1ol1ll.I00iio = firebaseMessaging;
/* 81 */            VarHandle.storeStoreFence();
/* 84 */            Oo1oo01i oo1oo01i = new Oo1oo01i();
/* 92 */            oo1oo01i.I0000O = new I1Io0i0II(0);
/* 94 */            oo1oo01i.I0001Ioi1lo = false;
/* 96 */            oo1oo01i.I00000oOI = i101oOiOiI;
/* 98 */            oo1oo01i.I000II = oo1ol1loo1;
/* 100 */           oo1oo01i.I0000Il00O = oo1ol1ll;
/* 102 */           oo1oo01i.I00000oIO = context;
/* 104 */           oo1oo01i.I0000oI00 = scheduledThreadPoolExecutor;
/* 106 */           VarHandle.storeStoreFence();
/* 109 */           return oo1oo01i;
                }
            }
