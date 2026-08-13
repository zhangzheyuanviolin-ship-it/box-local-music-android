            package com.google.android.gms.measurement;

            import android.app.Service;
            import android.app.job.JobParameters;
            import android.app.job.JobService;
            import android.content.Intent;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            import p000.IlloOIoilIl;
            import p000.O10oO1IiI1;
            import p000.i0O1lIi1O0IO;
            import p000.ilI001i;
            import p000.io0oIOI1o1i;
            import p000.l01O0IO1ooO0;
            import p000.l0o10OoO0;
            import p000.lII0I0I000I;
            import p000.lOo0oolIi1;
            import p000.liOO1i1;
            import p000.lilOOl0;
            import p000.lolOiIoiillI;
            
/* 27 */    public final class AppMeasurementJobService extends JobService implements lOo0oolIi1 {
                public i0O1lIi1O0IO I00iOIl;

                @Override
                public final void I00000oOI(JobParameters jobParameters) {
/* 2 */             jobFinished(jobParameters, false);
                }

                public final i0O1lIi1O0IO I0000Il00O() {
/* 1 */             i0O1lIi1O0IO i0o1lii1o0io = this.I00iOIl;
/* 3 */             if (i0o1lii1o0io != null) {
/* 20 */                return i0o1lii1o0io;
                    }
/* 9 */             i0O1lIi1O0IO i0o1lii1o0io2 = new i0O1lIi1O0IO(10);
/* 12 */            i0o1lii1o0io2.I00iiI = this;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            this.I00iOIl = i0o1lii1o0io2;
/* 20 */            return i0o1lii1o0io2;
                }

                @Override
                public final void onCreate() {
/* 1 */             super.onCreate();
/* 22 */            ((Service) I0000Il00O().I00iiI).getClass().getSimpleName().concat(" is starting up.");
                }

                @Override
                public final void onDestroy() {
/* 19 */            ((Service) I0000Il00O().I00iiI).getClass().getSimpleName().concat(" is shutting down.");
/* 22 */            super.onDestroy();
                }

                @Override
                public final void onRebind(Intent intent) {
/* 1 */             I0000Il00O();
/* 4 */             if (intent == null) {
/* 10 */                Log.e("FA", "onRebind called with null intent");
                    } else {
/* 24 */                "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
                    }
                }

                @Override
                public final boolean onStartJob(JobParameters jobParameters) {
/* 1 */             i0O1lIi1O0IO i0o1lii1o0ioI0000Il00O = I0000Il00O();
/* 7 */             Service service = (Service) i0o1lii1o0ioI0000Il00O.I00iiI;
/* 15 */            String string = jobParameters.getExtras().getString("action");
/* 25 */            "onStartJob received action: ".concat(String.valueOf(string));
/* 34 */            if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
/* 36 */                lII0I0I000I.I000II(string);
/* 39 */                lilOOl0 lilool0I001iOo1i0O = lilOOl0.I001iOo1i0O(service);
/* 43 */                l01O0IO1ooO0 l01o0io1ooo0I00II0oii1o = lilool0I001iOo1i0O.I00II0oii1o();
/* 49 */                lolOiIoiillI loloiioiilli = lilool0I001iOo1i0O.I00ll1.I00iiO;
/* 55 */                l01o0io1ooo0I00II0oii1o.I00lll10.I0000Il00O("Local AppMeasurementJobService called. action", string);
/* 62 */                O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(19);
/* 65 */                o10oO1IiI1.I00iiI = i0o1lii1o0ioI0000Il00O;
/* 67 */                o10oO1IiI1.I00iiO = l01o0io1ooo0I00II0oii1o;
/* 69 */                o10oO1IiI1.I00iio = jobParameters;
/* 71 */                VarHandle.storeStoreFence();
/* 74 */                l0o10OoO0 l0o10ooo0I00iOIl = lilool0I001iOo1i0O.I00iOIl();
/* 82 */                liOO1i1 lioo1i1 = new liOO1i1(12);
/* 85 */                lioo1i1.I00iiI = lilool0I001iOo1i0O;
/* 87 */                lioo1i1.I00iiO = o10oO1IiI1;
/* 89 */                VarHandle.storeStoreFence();
/* 92 */                l0o10ooo0I00iOIl.I010o0o0oO(lioo1i1);
                    }
/* 101 */           if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
/* 137 */               return true;
                    }
/* 103 */           lII0I0I000I.I000II(string);
/* 107 */           io0oIOI1o1i io0oioi1o1iI0000Il00O = io0oIOI1o1i.I0000Il00O(service, null);
/* 115 */           IlloOIoilIl illoOIoilIl = new IlloOIoilIl(13);
/* 118 */           illoOIoilIl.I00iiI = i0o1lii1o0ioI0000Il00O;
/* 120 */           illoOIoilIl.I00iiO = jobParameters;
/* 122 */           VarHandle.storeStoreFence();
/* 125 */           io0oioi1o1iI0000Il00O.getClass();
/* 134 */           io0oioi1o1iI0000Il00O.I00000oIO(new ilI001i(io0oioi1o1iI0000Il00O, illoOIoilIl, 2));
/* 137 */           return true;
                }

                @Override
                public final boolean onStopJob(JobParameters jobParameters) {
/* 1 */             return false;
                }

                @Override
                public final boolean onUnbind(Intent intent) {
/* 1 */             I0000Il00O();
/* 4 */             if (intent == null) {
/* 10 */                Log.e("FA", "onUnbind called with null intent");
/* 27 */                return true;
                    }
/* 24 */            "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
/* 27 */            return true;
                }

                @Override
                public final boolean zza(int i) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
/* 28 */        public final void I00000oIO(Intent intent) {
                }
            }
