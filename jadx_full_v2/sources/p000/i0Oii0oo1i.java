            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.os.RemoteException;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class i0Oii0oo1i {
                public static final HashMap I000o00OoI0I = new HashMap();
                public final Context I00000oIO;
                public final OlOilIlol1 I00000oOI;
                public final String I0000Il00O;
                public final ArrayList I0000O = new ArrayList();
                public final HashSet I0000oI00 = new HashSet();
                public final Object I0001Ioi1lo = new Object();
                public boolean I000II;
                public final Intent I000O01llI0;
                public final WeakReference I000OOo1O;
                public final OOoolll I000OiO;
                public final AtomicInteger I000iOII;
                public i0OiI0l0lO0o I000l1;
                public i0OIIoi I000lI;

                public i0Oii0oo1i(Context context, OlOilIlol1 olOilIlol1, String str, Intent intent) {
/* 28 */            OOoolll oOoolll = new OOoolll(1);
/* 31 */            oOoolll.I00iiI = this;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            this.I000OiO = oOoolll;
/* 44 */            this.I000iOII = new AtomicInteger(0);
/* 46 */            this.I00000oIO = context;
/* 48 */            this.I00000oOI = olOilIlol1;
/* 50 */            this.I0000Il00O = str;
/* 52 */            this.I000O01llI0 = intent;
/* 60 */            this.I000OOo1O = new WeakReference(null);
                }

                public static void I00000oOI(i0Oii0oo1i i0oii0oo1i, i0Oi011IO0 i0oi011io0) {
/* 1 */             i0OIIoi i0oiioi = i0oii0oo1i.I000lI;
/* 3 */             OlOilIlol1 olOilIlol1 = i0oii0oo1i.I00000oOI;
/* 5 */             ArrayList arrayList = i0oii0oo1i.I0000O;
/* 8 */             if (i0oiioi != null || i0oii0oo1i.I000II) {
/* 95 */                if (!i0oii0oo1i.I000II) {
/* 108 */                   i0oi011io0.run();
/* 551 */                   return;
                        } else {
/* 101 */                   olOilIlol1.I0000O("Waiting to bind to the service.", new Object[0]);
/* 104 */                   arrayList.add(i0oi011io0);
/* 107 */                   return;
                        }
                    }
/* 18 */            olOilIlol1.I0000O("Initiate binding to the service.", new Object[0]);
/* 21 */            arrayList.add(i0oi011io0);
/* 26 */            i0OiI0l0lO0o i0oii0l0lo0o = new i0OiI0l0lO0o();
/* 29 */            i0oii0l0lo0o.I00iOIl = i0oii0oo1i;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            i0oii0oo1i.I000l1 = i0oii0l0lo0o;
/* 37 */            i0oii0oo1i.I000II = true;
/* 47 */            if (i0oii0oo1i.I00000oIO.bindService(i0oii0oo1i.I000O01llI0, i0oii0l0lo0o, 1)) {
/* 92 */                return;
                    }
/* 53 */            olOilIlol1.I0000O("Failed to bind to the service.", new Object[0]);
/* 56 */            i0oii0oo1i.I000II = false;
/* 58 */            Iterator it = arrayList.iterator();
/* 66 */            while (it.hasNext()) {
/* 72 */                i0Oi011IO0 i0oi011io02 = (i0Oi011IO0) it.next();
/* 78 */                IOiIIo1l iOiIIo1l = new IOiIIo1l("Failed to bind to the service.", 13);
/* 81 */                OloIlI0ll oloIlI0ll = i0oi011io02.I00iOIl;
/* 83 */                if (oloIlI0ll != null) {
/* 85 */                    oloIlI0ll.I0000Il00O(iOiIIo1l);
                        }
                    }
/* 89 */            arrayList.clear();
                }

                public final Handler I00000oIO() {
                    Handler handler;
/* 1 */             HashMap map = I000o00OoI0I;
                    synchronized (map) {
                        try {
/* 10 */                    if (!map.containsKey(this.I0000Il00O)) {
/* 18 */                        HandlerThread handlerThread = new HandlerThread(this.I0000Il00O, 10);
/* 21 */                        handlerThread.start();
/* 35 */                        map.put(this.I0000Il00O, new Handler(handlerThread.getLooper()));
                            }
/* 47 */                    handler = (Handler) map.get(this.I0000Il00O);
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
/* 50 */            return handler;
                }

                public final void I0000Il00O(i0Oi011IO0 i0oi011io0, OloIlI0ll oloIlI0ll) {
/* 12 */            I00000oIO().post(new i0IIIiIli(this, i0oi011io0.I00iOIl, oloIlI0ll, i0oi011io0));
                }

                public final void I0000O(OloIlI0ll oloIlI0ll) {
                    synchronized (this.I0001Ioi1lo) {
/* 6 */                 this.I0000oI00.remove(oloIlI0ll);
                    }
/* 20 */            I00000oIO().post(new i0Oi0IOl(this, 0));
                }

                public final void I0000oI00() {
/* 1 */             HashSet hashSet = this.I0000oI00;
/* 3 */             Iterator it = hashSet.iterator();
/* 11 */            while (it.hasNext()) {
/* 36 */                ((OloIlI0ll) it.next()).I0000Il00O(new RemoteException(String.valueOf(this.I0000Il00O).concat(" : Binder has died.")));
                    }
/* 40 */            hashSet.clear();
                }
            }
