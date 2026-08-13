            package com.google.android.gms.measurement;

            import android.app.Service;
            import android.app.job.JobParameters;
            import android.content.Intent;
            import android.os.IBinder;
            import android.os.PowerManager;
            import android.util.Log;
            import android.util.SparseArray;
            import java.lang.invoke.VarHandle;
            import p000.i0001Io0l1;
            import p000.i0O1lIi1O0IO;
            import p000.iili1oo1o;
            import p000.l01O0IO1ooO0;
            import p000.l0o10OoO0;
            import p000.l0olllO1i;
            import p000.l1Oli1l;
            import p000.lII0I0I000I;
            import p000.lOo0oolIi1;
            import p000.liOO1i1;
            import p000.lilOOl0;
            
            public final class AppMeasurementService extends Service implements lOo0oolIi1 {
                public i0O1lIi1O0IO I00iOIl;

                @Override
                public final void I00000oIO(Intent intent) {
/* 1 */             SparseArray sparseArray = i0001Io0l1.I00000oIO;
/* 8 */             int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
/* 12 */            if (intExtra == 0) {
/* 14 */                return;
                    }
/* 15 */            SparseArray sparseArray2 = i0001Io0l1.I00000oIO;
                    synchronized (sparseArray2) {
                        try {
/* 22 */                    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
/* 24 */                    if (wakeLock != null) {
/* 26 */                        wakeLock.release();
/* 29 */                        sparseArray2.remove(intExtra);
                            } else {
/* 50 */                        Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                @Override
                public final void I00000oOI(JobParameters jobParameters) {
/* 29 */            throw new UnsupportedOperationException();
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
                public final IBinder onBind(Intent intent) {
/* 1 */             i0O1lIi1O0IO i0o1lii1o0ioI0000Il00O = I0000Il00O();
/* 8 */             if (intent == null) {
/* 12 */                Log.e("FA", "onBind called with null intent");
/* 7 */                 return null;
                    }
/* 16 */            String action = intent.getAction();
/* 26 */            if (!"com.google.android.gms.measurement.START".equals(action)) {
/* 64 */                Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
/* 7 */                 return null;
                    }
/* 34 */            lilOOl0 lilool0I001iOo1i0O = lilOOl0.I001iOo1i0O((Service) i0o1lii1o0ioI0000Il00O.I00iiI);
/* 40 */            l1Oli1l l1oli1l = new l1Oli1l("com.google.android.gms.measurement.internal.IMeasurementService");
/* 43 */            lII0I0I000I.I000II(lilool0I001iOo1i0O);
/* 46 */            l1oli1l.I000II = lilool0I001iOo1i0O;
/* 48 */            l1oli1l.I000OOo1O = null;
/* 50 */            VarHandle.storeStoreFence();
/* 53 */            return l1oli1l;
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
                public final int onStartCommand(Intent intent, int i, int i2) {
/* 1 */             i0O1lIi1O0IO i0o1lii1o0ioI0000Il00O = I0000Il00O();
/* 5 */             if (intent == null) {
/* 11 */                Log.w("FA", "AppMeasurementService started with null intent");
/* 94 */                return 2;
                    }
/* 17 */            Service service = (Service) i0o1lii1o0ioI0000Il00O.I00iiI;
/* 24 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllO1i.I000l1(service, null, null, null).I00ilO0;
/* 26 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 29 */            String action = intent.getAction();
/* 41 */            l01o0io1ooo0.I00lll10.I0000O(Integer.valueOf(i2), "Local AppMeasurementService called. startId, action", action);
/* 50 */            if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
/* 94 */                return 2;
                    }
/* 55 */            iili1oo1o iili1oo1oVar = new iili1oo1o(5);
/* 58 */            iili1oo1oVar.I00iiO = i0o1lii1o0ioI0000Il00O;
/* 60 */            iili1oo1oVar.I00iiI = i2;
/* 62 */            iili1oo1oVar.I00iio = l01o0io1ooo0;
/* 64 */            iili1oo1oVar.I00ilI0I1 = intent;
/* 66 */            VarHandle.storeStoreFence();
/* 69 */            lilOOl0 lilool0I001iOo1i0O = lilOOl0.I001iOo1i0O(service);
/* 73 */            l0o10OoO0 l0o10ooo0I00iOIl = lilool0I001iOo1i0O.I00iOIl();
/* 81 */            liOO1i1 lioo1i1 = new liOO1i1(12);
/* 84 */            lioo1i1.I00iiI = lilool0I001iOo1i0O;
/* 86 */            lioo1i1.I00iiO = iili1oo1oVar;
/* 88 */            VarHandle.storeStoreFence();
/* 91 */            l0o10ooo0I00iOIl.I010o0o0oO(lioo1i1);
/* 94 */            return 2;
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
/* 1 */             return stopSelfResult(i);
                }
            }
