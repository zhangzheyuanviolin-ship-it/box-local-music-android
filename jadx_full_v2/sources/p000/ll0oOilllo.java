            package p000;

            import android.content.Context;
            import android.content.ServiceConnection;
            import android.os.HandlerThread;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.concurrent.Executor;
            
            public final class ll0oOilllo {
                public static final Object I000II = new Object();
                public static ll0oOilllo I000O01llI0;
                public static HandlerThread I000OOo1O;
                public final HashMap I00000oIO = new HashMap();
                public final Context I00000oOI;
                public volatile O1oo1il01OoO I0000Il00O;
                public final IOloio1Ili I0000O;
                public final long I0000oI00;
                public final long I0001Ioi1lo;

                public ll0oOilllo(Context context, Looper looper) {
/* 14 */            li0l1I11iOO li0l1i11ioo = new li0l1I11iOO(1);
/* 17 */            li0l1i11ioo.I00iiI = this;
/* 19 */            VarHandle.storeStoreFence();
/* 26 */            this.I00000oOI = context.getApplicationContext();
/* 31 */            O1oo1il01OoO o1oo1il01OoO = new O1oo1il01OoO(looper, li0l1i11ioo, 6);
/* 34 */            Looper.getMainLooper();
/* 37 */            this.I0000Il00O = o1oo1il01OoO;
/* 43 */            this.I0000O = IOloio1Ili.I00000oOI();
/* 47 */            this.I0000oI00 = 5000L;
/* 52 */            this.I0001Ioi1lo = 300000L;
                }

                public static ll0oOilllo I00000oIO(Context context) {
                    ll0oOilllo ll0ooilllo;
                    synchronized (I000II) {
                        try {
/* 4 */                     ll0ooilllo = I000O01llI0;
/* 6 */                     if (ll0ooilllo == null) {
/* 18 */                        ll0ooilllo = new ll0oOilllo(context.getApplicationContext(), context.getMainLooper());
/* 21 */                        I000O01llI0 = ll0ooilllo;
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 27 */            return ll0ooilllo;
                }

                public final IOlo10lO1iOl I00000oOI(lOiI1l0o loii1l0o, iliOiO1 ilioio1, String str, Executor executor) {
                    IOlo10lO1iOl iOlo10lO1iOlI00000oIO;
/* 1 */             HashMap map = this.I00000oIO;
                    synchronized (map) {
                        try {
/* 10 */                    li0ill li0illVar = (li0ill) map.get(loii1l0o);
/* 13 */                    if (executor == null) {
/* 15 */                        executor = null;
                            }
/* 17 */                    if (li0illVar == null) {
/* 21 */                        li0illVar = new li0ill();
/* 24 */                        li0illVar.I00io1l = this;
/* 26 */                        li0illVar.I00ilI0I1 = loii1l0o;
/* 30 */                        HashMap map2 = new HashMap();
/* 33 */                        li0illVar.I00iOIl = map2;
/* 35 */                        li0illVar.I00iiI = 2;
/* 37 */                        VarHandle.storeStoreFence();
/* 40 */                        map2.put(ilioio1, ilioio1);
/* 43 */                        iOlo10lO1iOlI00000oIO = li0illVar.I00000oIO(executor, str);
/* 47 */                        map.put(loii1l0o, li0illVar);
                            } else {
/* 56 */                        this.I0000Il00O.removeMessages(0, loii1l0o);
/* 65 */                        if (li0illVar.I00iOIl.containsKey(ilioio1)) {
/* 114 */                           String string = loii1l0o.toString();
/* 126 */                           StringBuilder sb = new StringBuilder(string.length() + 81);
/* 129 */                           sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
/* 132 */                           sb.append(string);
/* 142 */                           throw new IllegalStateException(sb.toString());
                                }
/* 69 */                        li0illVar.I00iOIl.put(ilioio1, ilioio1);
/* 72 */                        int i = li0illVar.I00iiI;
/* 75 */                        if (i == 1) {
/* 90 */                            ilioio1.onServiceConnected(li0illVar.I00ilO0, li0illVar.I00iio);
                                } else if (i == 2) {
/* 81 */                            iOlo10lO1iOlI00000oIO = li0illVar.I00000oIO(executor, str);
                                }
/* 79 */                        iOlo10lO1iOlI00000oIO = null;
                            }
/* 96 */                    if (li0illVar.I00iiO) {
/* 98 */                        return IOlo10lO1iOl.I00ilO0;
                            }
/* 102 */                   if (iOlo10lO1iOlI00000oIO == null) {
/* 107 */                       iOlo10lO1iOlI00000oIO = new IOlo10lO1iOl(-1, null, null);
                            }
/* 111 */                   return iOlo10lO1iOlI00000oIO;
                        } catch (Throwable th) {
/* 204 */                   throw th;
                        }
                    }
                }

                public final void I0000Il00O(String str, ServiceConnection serviceConnection, boolean z) {
/* 3 */             lOiI1l0o loii1l0o = new lOiI1l0o(str, z);
/* 8 */             lII0I0I000I.I000O01llI0("ServiceConnection must not be null", serviceConnection);
/* 11 */            HashMap map = this.I00000oIO;
                    synchronized (map) {
                        try {
/* 22 */                    li0ill li0illVar = (li0ill) map.get(loii1l0o);
/* 24 */                    if (li0illVar == null) {
/* 99 */                        String string = loii1l0o.toString();
/* 111 */                       StringBuilder sb = new StringBuilder(string.length() + 50);
/* 114 */                       sb.append("Nonexistent connection status for service config: ");
/* 117 */                       sb.append(string);
/* 127 */                       throw new IllegalStateException(sb.toString());
                            }
/* 32 */                    if (!li0illVar.I00iOIl.containsKey(serviceConnection)) {
/* 68 */                        String string2 = loii1l0o.toString();
/* 80 */                        StringBuilder sb2 = new StringBuilder(string2.length() + 76);
/* 83 */                        sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
/* 86 */                        sb2.append(string2);
/* 96 */                        throw new IllegalStateException(sb2.toString());
                            }
/* 36 */                    li0illVar.I00iOIl.remove(serviceConnection);
/* 45 */                    if (li0illVar.I00iOIl.isEmpty()) {
/* 58 */                        this.I0000Il00O.sendMessageDelayed(this.I0000Il00O.obtainMessage(0, loii1l0o), this.I0000oI00);
                            }
                        } catch (Throwable th) {
/* 408 */                   throw th;
                        }
                    }
                }
            }
