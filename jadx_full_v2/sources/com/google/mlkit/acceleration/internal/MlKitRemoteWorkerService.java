            package com.google.mlkit.acceleration.internal;

            import android.content.Context;
            import android.util.Log;
            import p000.I0i0io0oOOi;
            import p000.Oi00l1;
            import p000.i01IlOO;
            
            public class MlKitRemoteWorkerService extends Oi00l1 {
                @Override
                public final void onCreate() {
                    try {
/* 5 */                 i01IlOO.I00000oOI(getApplicationContext());
                    } catch (IllegalStateException unused) {
/* 12 */                Log.isLoggable("MlKitRWService", 3);
/* 15 */                Context applicationContext = getApplicationContext();
/* 22 */                I0i0io0oOOi i0i0io0oOOi = new I0i0io0oOOi(2);
/* 29 */                i0i0io0oOOi.I00iiI = applicationContext.getPackageName();
/* 35 */                i01IlOO.I0000oI00(applicationContext, i0i0io0oOOi.I0000Il00O());
                    }
/* 38 */            super.onCreate();
                }
            }
