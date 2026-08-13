            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.os.RemoteException;
            import android.os.StrictMode;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.concurrent.Executor;
            
            public final class li0ill implements ServiceConnection {
                public HashMap I00iOIl;
                public int I00iiI;
                public boolean I00iiO;
                public IBinder I00iio;
                public lOiI1l0o I00ilI0I1;
                public ComponentName I00ilO0;
                public ll0oOilllo I00io1l;

                public final IOlo10lO1iOl I00000oIO(Executor executor, String str) throws RemoteException {
                    try {
/* 7 */                 Intent intentI00000oIO = iII0lo10Ol0I.I00000oIO(this.I00io1l.I00000oOI, this.I00ilI0I1);
/* 12 */                this.I00iiI = 3;
/* 14 */                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
/* 31 */                StrictMode.setVmPolicy(iil1IiI1.I00000oIO(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
                        try {
/* 34 */                    ll0oOilllo ll0ooilllo = this.I00io1l;
/* 36 */                    IOloio1Ili iOloio1Ili = ll0ooilllo.I0000O;
/* 38 */                    Context context = ll0ooilllo.I00000oOI;
/* 40 */                    lOiI1l0o loii1l0o = this.I00ilI0I1;
/* 47 */                    boolean zI0000O = iOloio1Ili.I0000O(context, str, intentI00000oIO, this, 4225, executor);
/* 51 */                    this.I00iiO = zI0000O;
/* 53 */                    if (zI0000O) {
/* 66 */                        ll0ooilllo.I0000Il00O.sendMessageDelayed(ll0ooilllo.I0000Il00O.obtainMessage(1, loii1l0o), ll0ooilllo.I0001Ioi1lo);
/* 69 */                        IOlo10lO1iOl iOlo10lO1iOl = IOlo10lO1iOl.I00ilO0;
/* 71 */                        StrictMode.setVmPolicy(vmPolicy);
/* 74 */                        return iOlo10lO1iOl;
                            }
/* 79 */                    this.I00iiI = 2;
                            try {
/* 85 */                        ll0ooilllo.I0000O.I0000Il00O(ll0ooilllo.I00000oOI, this);
                            } catch (IllegalArgumentException unused) {
                            }
/* 93 */                    IOlo10lO1iOl iOlo10lO1iOl2 = new IOlo10lO1iOl(16, null, null);
/* 96 */                    StrictMode.setVmPolicy(vmPolicy);
/* 332 */                   return iOlo10lO1iOl2;
                        } catch (Throwable th) {
/* 100 */                   StrictMode.setVmPolicy(vmPolicy);
/* 103 */                   throw th;
                        }
                    } catch (iI0iiI00 e) {
/* 106 */               return e.I00iOIl;
                    }
                }

                @Override
                public final void onBindingDied(ComponentName componentName) {
/* 1 */             onServiceDisconnected(componentName);
                }

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 1 */             ll0oOilllo ll0ooilllo = this.I00io1l;
                    synchronized (ll0ooilllo.I00000oIO) {
                        try {
/* 11 */                    ll0ooilllo.I0000Il00O.removeMessages(1, this.I00ilI0I1);
/* 14 */                    this.I00iio = iBinder;
/* 16 */                    this.I00ilO0 = componentName;
/* 24 */                    Iterator it = this.I00iOIl.values().iterator();
/* 32 */                    while (it.hasNext()) {
/* 40 */                        ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                            }
/* 46 */                    this.I00iiI = 1;
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
                }

                @Override
                public final void onServiceDisconnected(ComponentName componentName) {
/* 1 */             ll0oOilllo ll0ooilllo = this.I00io1l;
                    synchronized (ll0ooilllo.I00000oIO) {
                        try {
/* 11 */                    ll0ooilllo.I0000Il00O.removeMessages(1, this.I00ilI0I1);
/* 15 */                    this.I00iio = null;
/* 17 */                    this.I00ilO0 = componentName;
/* 25 */                    Iterator it = this.I00iOIl.values().iterator();
/* 33 */                    while (it.hasNext()) {
/* 41 */                        ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                            }
/* 48 */                    this.I00iiI = 2;
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }
            }
