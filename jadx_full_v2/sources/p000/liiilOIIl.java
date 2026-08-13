            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.os.Looper;
            import android.os.Messenger;
            import android.util.Log;
            import android.util.SparseArray;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.Iterator;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            
            public final class liiilOIIl implements ServiceConnection {
                public int I00iOIl = 0;
                public final Messenger I00iiI;
                public OoIOol I00iiO;
                public final ArrayDeque I00iio;
                public final SparseArray I00ilI0I1;
                public final o00io0IiOOo0 I00ilO0;

                public liiilOIIl(o00io0IiOOo0 o00io0iiooo0) {
/* 4 */             this.I00ilO0 = o00io0iiooo0;
/* 13 */            Looper mainLooper = Looper.getMainLooper();
/* 19 */            li0l1I11iOO li0l1i11ioo = new li0l1I11iOO(0);
/* 22 */            li0l1i11ioo.I00iiI = this;
/* 24 */            VarHandle.storeStoreFence();
/* 29 */            O1oo1il01OoO o1oo1il01OoO = new O1oo1il01OoO(mainLooper, li0l1i11ioo, 8);
/* 32 */            Looper.getMainLooper();
/* 38 */            this.I00iiI = new Messenger(o1oo1il01OoO);
/* 45 */            this.I00iio = new ArrayDeque();
/* 52 */            this.I00ilI0I1 = new SparseArray();
                }

                public final synchronized boolean I00000oIO(lli1OiO lli1oio) {
/* 2 */             int i = this.I00iOIl;
/* 5 */             int i2 = 0;
/* 6 */             int i3 = 1;
/* 7 */             if (i != 0) {
/* 9 */                 if (i == 1) {
/* 45 */                    this.I00iio.add(lli1oio);
/* 6 */                     return true;
                        }
/* 11 */                if (i != 2) {
/* 5 */                     return false;
                        }
/* 17 */                this.I00iio.add(lli1oio);
/* 22 */                l1OIO00ooIOl l1oio00ooiol = new l1OIO00ooIOl(i3);
/* 25 */                l1oio00ooiol.I00iiI = this;
/* 27 */                VarHandle.storeStoreFence();
/* 36 */                ((ScheduledExecutorService) this.I00ilO0.I00iio).execute(l1oio00ooiol);
/* 6 */                 return true;
                    }
/* 52 */            this.I00iio.add(lli1oio);
/* 62 */            lII0I0I000I.I000OiO(this.I00iOIl == 0);
/* 67 */            Log.isLoggable("MessengerIpcClient", 2);
/* 70 */            this.I00iOIl = 1;
/* 76 */            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
/* 81 */            intent.setPackage("com.google.android.gms");
                    try {
/* 84 */                IOloio1Ili iOloio1IliI00000oOI = IOloio1Ili.I00000oOI();
/* 88 */                o00io0IiOOo0 o00io0iiooo0 = this.I00ilO0;
/* 98 */                if (iOloio1IliI00000oOI.I00000oIO((Context) o00io0iiooo0.I00iiO, intent, this, 1)) {
/* 110 */                   l1OIO00ooIOl l1oio00ooiol2 = new l1OIO00ooIOl(i2);
/* 113 */                   l1oio00ooiol2.I00iiI = this;
/* 115 */                   VarHandle.storeStoreFence();
/* 126 */                   ((ScheduledExecutorService) o00io0iiooo0.I00iio).schedule(l1oio00ooiol2, 30L, TimeUnit.SECONDS);
                        } else {
/* 102 */                   I00000oOI("Unable to bind to service");
                        }
                    } catch (SecurityException e) {
/* 132 */               I0000Il00O("Unable to bind to service", e);
                    }
/* 6 */             return true;
                }

                public final synchronized void I00000oOI(String str) {
/* 3 */             I0000Il00O(str, null);
                }

                public final synchronized void I0000Il00O(String str, SecurityException securityException) {
                    try {
/* 9 */                 if (Log.isLoggable("MessengerIpcClient", 3)) {
/* 17 */                    "Disconnected: ".concat(String.valueOf(str));
                        }
/* 23 */                int i = this.I00iOIl;
/* 25 */                if (i == 0) {
/* 125 */                   throw new IllegalStateException();
                        }
/* 30 */                if (i != 1 && i != 2) {
/* 34 */                    if (i != 3) {
/* 37 */                        return;
                            }
/* 38 */                    this.I00iOIl = 4;
/* 41 */                    return;
                        }
/* 44 */                Log.isLoggable("MessengerIpcClient", 2);
/* 47 */                this.I00iOIl = 4;
/* 59 */                IOloio1Ili.I00000oOI().I0000Il00O((Context) this.I00ilO0.I00iiO, this);
/* 66 */                I1o1lOlooI1 i1o1lOlooI1 = new I1o1lOlooI1(str, securityException, 13);
/* 69 */                ArrayDeque arrayDeque = this.I00iio;
/* 71 */                Iterator it = arrayDeque.iterator();
/* 79 */                while (it.hasNext()) {
/* 87 */                    ((lli1OiO) it.next()).I0000Il00O(i1o1lOlooI1);
                        }
/* 91 */                arrayDeque.clear();
/* 94 */                int i2 = 0;
                        while (true) {
/* 95 */                    SparseArray sparseArray = this.I00ilI0I1;
/* 101 */                   if (i2 >= sparseArray.size()) {
/* 115 */                       sparseArray.clear();
/* 119 */                       return;
                            } else {
/* 109 */                       ((lli1OiO) sparseArray.valueAt(i2)).I0000Il00O(i1o1lOlooI1);
/* 112 */                       i2++;
                            }
                        }
                    } catch (Throwable th) {
/* 332 */               throw th;
                    }
                }

                public final synchronized void I0000O() {
/* 5 */             if (this.I00iOIl == 2 && this.I00iio.isEmpty() && this.I00ilI0I1.size() == 0) {
/* 25 */                Log.isLoggable("MessengerIpcClient", 2);
/* 29 */                this.I00iOIl = 3;
/* 41 */                IOloio1Ili.I00000oOI().I0000Il00O((Context) this.I00ilO0.I00iiO, this);
                    }
                }

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 4 */             Log.isLoggable("MessengerIpcClient", 2);
/* 11 */            IlloOIoilIl illoOIoilIl = new IlloOIoilIl(9);
/* 14 */            illoOIoilIl.I00iiI = this;
/* 16 */            illoOIoilIl.I00iiO = iBinder;
/* 18 */            VarHandle.storeStoreFence();
/* 27 */            ((ScheduledExecutorService) this.I00ilO0.I00iio).execute(illoOIoilIl);
                }

                @Override
                public final void onServiceDisconnected(ComponentName componentName) {
/* 4 */             Log.isLoggable("MessengerIpcClient", 2);
/* 9 */             l1OIO00ooIOl l1oio00ooiol = new l1OIO00ooIOl(2);
/* 12 */            l1oio00ooiol.I00iiI = this;
/* 14 */            VarHandle.storeStoreFence();
/* 23 */            ((ScheduledExecutorService) this.I00ilO0.I00iio).execute(l1oio00ooiol);
                }
            }
