            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.Objects;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            public final class i01I000O00 implements ServiceConnection {
                public final Context I00iOIl;
                public final Intent I00iiI;
                public final ScheduledThreadPoolExecutor I00iiO;
                public final ArrayDeque I00iio;
                public i011oiiI I00ilI0I1;
                public boolean I00ilO0;

                public i01I000O00(Context context) {
/* 12 */            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new iO10oo0i1o("Firebase-FirebaseInstanceIdServiceConnection", 5));
/* 19 */            scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
/* 22 */            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
/* 33 */            this.I00iio = new ArrayDeque();
/* 36 */            this.I00ilO0 = false;
/* 38 */            Context applicationContext = context.getApplicationContext();
/* 42 */            this.I00iOIl = applicationContext;
/* 59 */            this.I00iiI = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
/* 61 */            this.I00iiO = scheduledThreadPoolExecutor;
                }

                public final synchronized void I00000oIO() {
                    try {
/* 5 */                 Log.isLoggable("FirebaseMessaging", 3);
/* 14 */                while (!this.I00iio.isEmpty()) {
/* 18 */                    Log.isLoggable("FirebaseMessaging", 3);
/* 21 */                    i011oiiI i011oiii = this.I00ilI0I1;
/* 23 */                    if (i011oiii == null || !i011oiii.isBinderAlive()) {
/* 54 */                        Log.isLoggable("FirebaseMessaging", 3);
/* 59 */                        if (!this.I00ilO0) {
/* 63 */                            this.I00ilO0 = true;
                                    try {
                                    } catch (SecurityException e) {
/* 91 */                                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                                    }
/* 79 */                            if (!IOloio1Ili.I00000oOI().I00000oIO(this.I00iOIl, this.I00iiI, this, 65)) {
/* 84 */                                Log.e("FirebaseMessaging", "binding to the service failed");
/* 95 */                                this.I00ilO0 = false;
/* 97 */                                ArrayDeque arrayDeque = this.I00iio;
/* 103 */                               while (!arrayDeque.isEmpty()) {
/* 114 */                                   ((i011ol) arrayDeque.poll()).I00000oOI.I0000O(null);
                                        }
                                    }
                                }
/* 119 */                       return;
                            }
/* 33 */                    Log.isLoggable("FirebaseMessaging", 3);
/* 46 */                    this.I00ilI0I1.I00000oIO((i011ol) this.I00iio.poll());
                        }
                    } finally {
                    }
                }

                public final synchronized o0IiOl I00000oOI(Intent intent) {
                    OloIlI0ll oloIlI0ll;
/* 5 */             Log.isLoggable("FirebaseMessaging", 3);
/* 10 */            i011ol i011olVar = new i011ol();
/* 15 */            oloIlI0ll = new OloIlI0ll();
/* 18 */            i011olVar.I00000oOI = oloIlI0ll;
/* 20 */            i011olVar.I00000oIO = intent;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.I00iiO;
/* 31 */            OOIl1i1 oOIl1i1 = new OOIl1i1(17);
/* 34 */            oOIl1i1.I00iiI = i011olVar;
/* 36 */            VarHandle.storeStoreFence();
/* 43 */            ScheduledFuture<?> scheduledFutureSchedule = scheduledThreadPoolExecutor.schedule(oOIl1i1, 20L, TimeUnit.SECONDS);
/* 47 */            o0IiOl o0iiol = oloIlI0ll.I00000oIO;
/* 52 */            Olio1i0OI00i olio1i0OI00i = new Olio1i0OI00i(6);
/* 55 */            olio1i0OI00i.I00iiI = scheduledFutureSchedule;
/* 57 */            VarHandle.storeStoreFence();
/* 60 */            o0iiol.I00000oOI(scheduledThreadPoolExecutor, olio1i0OI00i);
/* 65 */            this.I00iio.add(i011olVar);
/* 68 */            I00000oIO();
/* 71 */            return oloIlI0ll.I00000oIO;
                }

                @Override
                public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    try {
/* 11 */                if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 13 */                    Objects.toString(componentName);
                        }
/* 20 */                this.I00ilO0 = false;
/* 24 */                if (iBinder instanceof i011oiiI) {
/* 68 */                    this.I00ilI0I1 = (i011oiiI) iBinder;
/* 70 */                    I00000oIO();
/* 74 */                    return;
                        }
/* 40 */                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
/* 43 */                ArrayDeque arrayDeque = this.I00iio;
/* 49 */                while (!arrayDeque.isEmpty()) {
/* 60 */                    ((i011ol) arrayDeque.poll()).I00000oOI.I0000O(null);
                        }
                    } catch (Throwable th) {
/* 106 */               throw th;
                    }
                }

                @Override
                public final void onServiceDisconnected(ComponentName componentName) {
/* 8 */             if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 10 */                Objects.toString(componentName);
                    }
/* 13 */            I00000oIO();
                }
            }
