            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.os.Bundle;
            import android.util.Log;
            import com.google.android.gms.measurement.api.AppMeasurementSdk;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Random;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            public final class io0oIOI1o1i {
                public static volatile io0oIOI1o1i I000II;
                public final ExecutorService I00000oIO;
                public final AppMeasurementSdk I00000oOI;
                public int I0000Il00O;
                public boolean I0000O;
                public volatile il000illiO I0000oI00;
                public volatile long I0001Ioi1lo;

                public io0oIOI1o1i(Context context, Bundle bundle) throws ClassNotFoundException {
/* 8 */             int i = 0;
/* 9 */             ililolO ililolo = new ililolO(0);
/* 16 */            ililolo.I00000oOI = Executors.defaultThreadFactory();
/* 18 */            VarHandle.storeStoreFence();
/* 28 */            int i2 = 1;
/* 34 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ililolo);
/* 37 */            threadPoolExecutor.allowCoreThreadTimeOut(true);
/* 44 */            this.I00000oIO = Executors.unconfigurableExecutorService(threadPoolExecutor);
/* 48 */            AppMeasurementSdk appMeasurementSdk = new AppMeasurementSdk();
/* 51 */            appMeasurementSdk.I00000oIO = this;
/* 53 */            VarHandle.storeStoreFence();
/* 56 */            this.I00000oOI = appMeasurementSdk;
/* 60 */            new ArrayList();
                    try {
/* 71 */                if (ll0i0l0Ili.I00000oIO(context, ll011I.I00000oIO(context)) != null) {
                            try {
/* 82 */                        Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, io0oIOI1o1i.class.getClassLoader());
                            } catch (ClassNotFoundException unused) {
/* 86 */                        this.I0000O = true;
/* 90 */                        Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
/* 93 */                        return;
                            }
                        }
                    } catch (IllegalStateException unused2) {
                    }
/* 99 */            I00000oIO(new ilO0olIi(this, context, bundle, i));
/* 106 */           Application application = (Application) context.getApplicationContext();
/* 108 */           if (application == null) {
/* 112 */               Log.w("FA", "Unable to register lifecycle notifications. Application null.");
/* 115 */               return;
                    }
/* 118 */           IlIII0O1il ilIII0O1il = new IlIII0O1il(i2);
/* 121 */           ilIII0O1il.I00iiI = this;
/* 123 */           VarHandle.storeStoreFence();
/* 126 */           application.registerActivityLifecycleCallbacks(ilIII0O1il);
                }

                public static io0oIOI1o1i I0000Il00O(Context context, Bundle bundle) {
/* 1 */             lII0I0I000I.I000II(context);
/* 6 */             if (I000II == null) {
                        synchronized (io0oIOI1o1i.class) {
                            try {
/* 13 */                        if (I000II == null) {
/* 36 */                            I000II = new io0oIOI1o1i(context, bundle == null ? new Bundle() : new Bundle(bundle));
                                }
                            } finally {
                            }
                        }
                    }
/* 42 */            return I000II;
                }

                public final void I00000oIO(iloOo1lIio ilooo1liio) {
/* 3 */             this.I00000oIO.execute(ilooo1liio);
                }

                public final void I00000oOI(Exception exc, boolean z, boolean z2) {
                    this.I0000O |= z;
/* 8 */             if (z) {
/* 12 */                Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
/* 15 */                return;
                    }
/* 16 */            if (z2) {
/* 23 */                I00000oIO(new ilI001i(this, exc));
                    }
/* 28 */            Log.w("FA", "Error with data collection. Data lost.", exc);
                }

                public final long I0000O() {
/* 3 */             iioi1o1OO iioi1o1oo = new iioi1o1OO();
/* 12 */            I00000oIO(new ilOiooOI0iO(this, iioi1o1oo, 2));
/* 27 */            Long l = (Long) iioi1o1OO.I0000oI00(iioi1o1oo.I0000O(500L), Long.class);
/* 29 */            if (l != null) {
/* 58 */                return l.longValue();
                    }
/* 45 */            long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
/* 51 */            int i = this.I0000Il00O + 1;
/* 53 */            this.I0000Il00O = i;
/* 56 */            return jNextLong + i;
                }
            }
