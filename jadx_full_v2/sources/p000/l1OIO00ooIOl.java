            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.Message;
            import android.os.Messenger;
            import android.os.RemoteException;
            import android.util.Log;
            import android.util.SparseArray;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            
            public final class l1OIO00ooIOl implements Runnable {
                public final int I00iOIl;
                public liiilOIIl I00iiI;

                public l1OIO00ooIOl(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() throws RemoteException {
                    switch (this.I00iOIl) {
                        case 0:
/* 198 */                   liiilOIIl liiiloiil = this.I00iiI;
                            synchronized (liiiloiil) {
/* 204 */                       if (liiiloiil.I00iOIl == 1) {
/* 208 */                           liiiloiil.I00000oOI("Timed out while binding");
                                }
                            }
/* 215 */                   return;
                        case 1:
                            break;
                        default:
/* 10 */                    this.I00iiI.I00000oOI("Service disconnected");
/* 13 */                    return;
                    }
                    while (true) {
/* 14 */                liiilOIIl liiiloiil2 = this.I00iiI;
                        synchronized (liiiloiil2) {
                            try {
/* 20 */                        if (liiiloiil2.I00iOIl != 2) {
/* 39 */                            return;
                                }
/* 27 */                        ArrayDeque arrayDeque = liiiloiil2.I00iio;
/* 33 */                        if (arrayDeque.isEmpty()) {
/* 35 */                            liiiloiil2.I0000O();
/* 39 */                            return;
                                }
/* 44 */                        lli1OiO lli1oio = (lli1OiO) arrayDeque.poll();
/* 46 */                        SparseArray sparseArray = liiiloiil2.I00ilI0I1;
/* 48 */                        int i = lli1oio.I00000oIO;
/* 50 */                        sparseArray.put(i, lli1oio);
/* 57 */                        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) liiiloiil2.I00ilO0.I00iio;
/* 63 */                        iooili01 iooili01Var = new iooili01(12);
/* 66 */                        iooili01Var.I00iiI = liiiloiil2;
/* 68 */                        iooili01Var.I00iiO = lli1oio;
/* 70 */                        VarHandle.storeStoreFence();
/* 77 */                        scheduledExecutorService.schedule(iooili01Var, 30L, TimeUnit.SECONDS);
/* 88 */                        if (Log.isLoggable("MessengerIpcClient", 3)) {
/* 96 */                            "Sending ".concat(String.valueOf(lli1oio));
                                }
/* 99 */                        o00io0IiOOo0 o00io0iiooo0 = liiiloiil2.I00ilO0;
/* 101 */                       Messenger messenger = liiiloiil2.I00iiI;
/* 103 */                       int i2 = lli1oio.I0000Il00O;
/* 105 */                       Message messageObtain = Message.obtain();
/* 109 */                       messageObtain.what = i2;
/* 111 */                       messageObtain.arg1 = i;
/* 113 */                       messageObtain.replyTo = messenger;
/* 117 */                       Bundle bundle = new Bundle();
/* 126 */                       bundle.putBoolean("oneWay", lli1oio.I00000oIO());
/* 139 */                       bundle.putString("pkg", ((Context) o00io0iiooo0.I00iiO).getPackageName());
/* 146 */                       bundle.putBundle("data", lli1oio.I0000O);
/* 149 */                       messageObtain.setData(bundle);
                                try {
/* 152 */                           OoIOol ooIOol = liiiloiil2.I00iiO;
/* 156 */                           Messenger messenger2 = (Messenger) ooIOol.I00iiI;
/* 158 */                           if (messenger2 != null) {
/* 160 */                               messenger2.send(messageObtain);
                                    } else {
/* 167 */                               il1IIi0oI il1iii0oi = (il1IIi0oI) ooIOol.I00iiO;
/* 169 */                               if (il1iii0oi == null) {
/* 185 */                                   throw new IllegalStateException("Both messengers are null");
                                        }
/* 173 */                               il1iii0oi.I00iOIl.send(messageObtain);
                                    }
                                } catch (RemoteException e) {
/* 191 */                           liiiloiil2.I00000oOI(e.getMessage());
                                }
                            } finally {
                            }
                        }
                    }
                }
            }
