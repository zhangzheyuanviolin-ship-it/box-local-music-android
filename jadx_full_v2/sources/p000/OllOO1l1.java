            package p000;

            import android.app.ForegroundServiceStartNotAllowedException;
            import android.app.Notification;
            import android.content.Context;
            import android.content.Intent;
            import android.util.Log;
            import androidx.work.impl.foreground.SystemForegroundService;
            import androidx.work.impl.model.WorkSpec;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class OllOO1l1 implements OIOollli, Il11ii {
                public static final String I00l0OO0IO = IIi0oIl.I000OiO("SystemFgDispatcher");
                public i01IlOO I00iOIl;
                public OloIli I00iiI;
                public Object I00iiO;
                public i01IIlI I00iio;
                public LinkedHashMap I00ilI0I1;
                public HashMap I00ilO0;
                public HashMap I00io1l;
                public OlIOOOoi0IlI I00ioIO;
                public SystemForegroundService I00l0I0l0lO1;

                public static Intent I00000oOI(Context context, i01IIlI i01iili, IliliOOliOi ililiOOliOi) {
/* 5 */             Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
/* 10 */            intent.setAction("ACTION_START_FOREGROUND");
/* 17 */            intent.putExtra("KEY_WORKSPEC_ID", i01iili.I00000oIO);
/* 24 */            intent.putExtra("KEY_GENERATION", i01iili.I00000oOI);
/* 31 */            intent.putExtra("KEY_NOTIFICATION_ID", ililiOOliOi.I00000oIO);
/* 38 */            intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ililiOOliOi.I00000oOI);
/* 45 */            intent.putExtra("KEY_NOTIFICATION", ililiOOliOi.I0000Il00O);
/* 98 */            return intent;
                }

                @Override
                public final void I00000oIO(WorkSpec workSpec, IOo100ol1lIo iOo100ol1lIo) {
/* 3 */             if (iOo100ol1lIo instanceof IOo0oooliOI0) {
/* 9 */                 IIi0oIl.I000II().getClass();
/* 12 */                i01IlOO i01iloo = this.I00iOIl;
/* 14 */                i01IIlI i01iiliI00000oIO = liIOI1iO.I00000oIO(workSpec);
/* 37 */                i01iloo.I0000O.I0000O(new OlOIIOi0(i01iloo.I0001Ioi1lo, new OlO0000lIOII(i01iiliI00000oIO), true, ((IOo0oooliOI0) iOo100ol1lIo).I00000oIO));
                    }
                }

                @Override
                public final void I0000Il00O(i01IIlI i01iili, boolean z) {
                    Map.Entry entry;
                    synchronized (this.I00iiO) {
                        try {
/* 27 */                    O010OIi o010OIi = ((WorkSpec) this.I00ilO0.remove(i01iili)) != null ? (O010OIi) this.I00io1l.remove(i01iili) : null;
/* 28 */                    if (o010OIi != null) {
/* 30 */                        o010OIi.I000II(null);
                            }
                        } catch (Throwable th) {
/* 332 */                   throw th;
                        }
                    }
/* 40 */            IliliOOliOi ililiOOliOi = (IliliOOliOi) this.I00ilI0I1.remove(i01iili);
/* 48 */            if (i01iili.equals(this.I00iio)) {
/* 56 */                if (this.I00ilI0I1.size() > 0) {
/* 64 */                    Iterator it = this.I00ilI0I1.entrySet().iterator();
/* 68 */                    Object next = it.next();
                            while (true) {
/* 72 */                        entry = (Map.Entry) next;
/* 78 */                        if (!it.hasNext()) {
                                    break;
                                } else {
/* 80 */                            next = it.next();
                                }
                            }
/* 93 */                    this.I00iio = (i01IIlI) entry.getKey();
/* 97 */                    if (this.I00l0I0l0lO1 != null) {
/* 103 */                       IliliOOliOi ililiOOliOi2 = (IliliOOliOi) entry.getValue();
/* 105 */                       SystemForegroundService systemForegroundService = this.I00l0I0l0lO1;
/* 107 */                       int i = ililiOOliOi2.I00000oIO;
/* 109 */                       int i2 = ililiOOliOi2.I00000oOI;
/* 111 */                       Notification notification = ililiOOliOi2.I0000Il00O;
/* 113 */                       systemForegroundService.getClass();
/* 116 */                       String str = SystemForegroundService.I00ilI0I1;
                                try {
/* 121 */                           systemForegroundService.startForeground(i, notification, i2);
                                } catch (ForegroundServiceStartNotAllowedException e) {
/* 145 */                           if (IIi0oIl.I000II().I00iOIl <= 5) {
/* 147 */                               Log.w(str, "Unable to start foreground service", e);
                                    }
                                } catch (SecurityException e2) {
/* 132 */                           if (IIi0oIl.I000II().I00iOIl <= 5) {
/* 134 */                               Log.w(str, "Unable to start foreground service", e2);
                                    }
                                }
/* 156 */                       this.I00l0I0l0lO1.I00iio.cancel(ililiOOliOi2.I00000oIO);
                            }
                        } else {
/* 160 */                   this.I00iio = null;
                        }
                    }
/* 162 */           SystemForegroundService systemForegroundService2 = this.I00l0I0l0lO1;
/* 164 */           if (ililiOOliOi == null || systemForegroundService2 == null) {
/* 185 */               return;
                    }
/* 168 */           IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 172 */           i01iili.toString();
/* 175 */           iIi0oIlI000II.getClass();
/* 182 */           systemForegroundService2.I00iio.cancel(ililiOOliOi.I00000oIO);
                }

                public final void I0000O(Intent intent) {
/* 1 */             LinkedHashMap linkedHashMap = this.I00ilI0I1;
/* 5 */             if (this.I00l0I0l0lO1 == null) {
/* 175 */               I000II.I001IO000("handleNotify was called on the destroyed dispatcher");
/* 437 */               return;
                    }
/* 9 */             int i = 0;
/* 10 */            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
/* 16 */            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
/* 34 */            i01IIlI i01iili = new i01IIlI(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
/* 43 */            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
/* 49 */            IIi0oIl.I000II().getClass();
/* 52 */            if (notification == null) {
/* 169 */               I000II.I000iOII("Notification passed in the intent was null.");
/* 172 */               return;
                    }
/* 56 */            IliliOOliOi ililiOOliOi = new IliliOOliOi(intExtra, notification, intExtra2);
/* 59 */            linkedHashMap.put(i01iili, ililiOOliOi);
/* 68 */            IliliOOliOi ililiOOliOi2 = (IliliOOliOi) linkedHashMap.get(this.I00iio);
/* 70 */            if (ililiOOliOi2 == null) {
/* 72 */                this.I00iio = i01iili;
                    } else {
/* 79 */                this.I00l0I0l0lO1.I00iio.notify(intExtra, notification);
/* 86 */                Iterator it = linkedHashMap.entrySet().iterator();
/* 94 */                while (it.hasNext()) {
/* 110 */                   i |= ((IliliOOliOi) ((Map.Entry) it.next()).getValue()).I00000oOI;
                        }
/* 118 */               ililiOOliOi = new IliliOOliOi(ililiOOliOi2.I00000oIO, ililiOOliOi2.I0000Il00O, i);
                    }
/* 121 */           SystemForegroundService systemForegroundService = this.I00l0I0l0lO1;
/* 123 */           int i2 = ililiOOliOi.I00000oIO;
/* 125 */           int i3 = ililiOOliOi.I00000oOI;
/* 127 */           Notification notification2 = ililiOOliOi.I0000Il00O;
/* 129 */           systemForegroundService.getClass();
/* 132 */           String str = SystemForegroundService.I00ilI0I1;
                    try {
/* 137 */               systemForegroundService.startForeground(i2, notification2, i3);
                    } catch (ForegroundServiceStartNotAllowedException e) {
/* 161 */               if (IIi0oIl.I000II().I00iOIl <= 5) {
/* 163 */                   Log.w(str, "Unable to start foreground service", e);
                        }
                    } catch (SecurityException e2) {
/* 148 */               if (IIi0oIl.I000II().I00iOIl <= 5) {
/* 150 */                   Log.w(str, "Unable to start foreground service", e2);
                        }
                    }
                }

                public final void I0000oI00() {
/* 2 */             this.I00l0I0l0lO1 = null;
                    synchronized (this.I00iiO) {
                        try {
/* 13 */                    Iterator it = this.I00io1l.values().iterator();
/* 21 */                    while (it.hasNext()) {
/* 29 */                        ((O010OIi) it.next()).I000II(null);
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 38 */            OOIo1i0 oOIo1i0 = this.I00iOIl.I0001Ioi1lo;
                    synchronized (oOIo1i0.I000iOII) {
/* 45 */                oOIo1i0.I000OiO.remove(this);
                    }
                }

                public final void I0001Ioi1lo(int i, int i2) {
/* 21 */            IIi0oIl.I000II().I000OOo1O(I00l0OO0IO, "Foreground service timed out, FGS type: " + i2);
/* 39 */            for (Map.Entry entry : this.I00ilI0I1.entrySet()) {
/* 55 */                if (((IliliOOliOi) entry.getValue()).I00000oOI == i2) {
/* 61 */                    i01IIlI i01iili = (i01IIlI) entry.getKey();
/* 63 */                    i01IlOO i01iloo = this.I00iOIl;
/* 81 */                    i01iloo.I0000O.I0000O(new OlOIIOi0(i01iloo.I0001Ioi1lo, new OlO0000lIOII(i01iili), true, -128));
                        }
                    }
/* 85 */            SystemForegroundService systemForegroundService = this.I00l0I0l0lO1;
/* 87 */            if (systemForegroundService != null) {
/* 89 */                systemForegroundService.I00iiI = true;
/* 95 */                IIi0oIl.I000II().getClass();
/* 98 */                systemForegroundService.stopForeground(true);
/* 101 */               systemForegroundService.stopSelf(i);
                    }
                }
            }
