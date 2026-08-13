            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.os.PowerManager;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.foreground.SystemForegroundService;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            
            public final class OOIo1i0 {
                public static final String I000l1 = IIi0oIl.I000OiO("Processor");
                public PowerManager.WakeLock I00000oIO;
                public Context I00000oOI;
                public IOllii I0000Il00O;
                public OillOo0 I0000O;
                public WorkDatabase I0000oI00;
                public HashMap I0001Ioi1lo;
                public HashMap I000II;
                public HashMap I000O01llI0;
                public HashSet I000OOo1O;
                public ArrayList I000OiO;
                public Object I000iOII;

                public static boolean I0000O(i01ilO i01ilo, int i) {
/* 1 */             if (i01ilo == null) {
/* 31 */                IIi0oIl.I000II().getClass();
/* 34 */                return false;
                    }
/* 3 */             O010loOOi0Oo o010loOOi0Oo = i01ilo.I000o00OoI0I;
/* 7 */             i01iIoo1loO i01iioo1loo = new i01iIoo1loO();
/* 10 */            i01iioo1loo.I00iOIl = i;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            o010loOOi0Oo.I00111O(i01iioo1loo);
/* 22 */            IIi0oIl.I000II().getClass();
/* 25 */            return true;
                }

                public final void I00000oIO(Il11ii il11ii) {
                    synchronized (this.I000iOII) {
/* 6 */                 this.I000OiO.add(il11ii);
                    }
                }

                public final i01ilO I00000oOI(String str) {
/* 7 */             i01ilO i01ilo = (i01ilO) this.I0001Ioi1lo.remove(str);
/* 13 */            boolean z = i01ilo != null;
/* 14 */            if (!z) {
/* 22 */                i01ilo = (i01ilO) this.I000II.remove(str);
                    }
/* 26 */            this.I000O01llI0.remove(str);
/* 29 */            if (z) {
                        synchronized (this.I000iOII) {
                            try {
/* 40 */                        if (this.I0001Ioi1lo.isEmpty()) {
/* 42 */                            Context context = this.I00000oOI;
/* 44 */                            String str2 = OllOO1l1.I00l0OO0IO;
/* 50 */                            Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
/* 55 */                            intent.setAction("ACTION_STOP_FOREGROUND");
                                    try {
/* 60 */                                this.I00000oOI.startService(intent);
                                    } catch (Throwable th) {
/* 73 */                                IIi0oIl.I000II().I0001Ioi1lo(I000l1, "Unable to stop foreground service", th);
                                    }
/* 76 */                            PowerManager.WakeLock wakeLock = this.I00000oIO;
/* 78 */                            if (wakeLock != null) {
/* 80 */                                wakeLock.release();
/* 84 */                                this.I00000oIO = null;
                                    }
                                }
                            } finally {
                            }
                        }
                    }
/* 168 */           return i01ilo;
                }

                public final i01ilO I0000Il00O(String str) {
/* 7 */             i01ilO i01ilo = (i01ilO) this.I0001Ioi1lo.get(str);
                    return i01ilo == null ? (i01ilO) this.I000II.get(str) : i01ilo;
                }

                public final void I0000oI00(i01IIlI i01iili) {
/* 5 */             Io1iO1Ooo0l io1iO1Ooo0l = (Io1iO1Ooo0l) this.I0000O.I00ilI0I1;
/* 11 */            Io11iII11ll io11iII11ll = new Io11iII11ll(14);
/* 14 */            io11iII11ll.I00iiI = this;
/* 16 */            io11iII11ll.I00iiO = i01iili;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            io1iO1Ooo0l.execute(io11iII11ll);
                }
            }
