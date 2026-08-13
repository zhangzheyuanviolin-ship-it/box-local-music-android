            package p000;

            import android.net.ConnectivityManager;
            import android.net.Network;
            import android.net.NetworkCapabilities;
            import android.net.NetworkRequest;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class Oiolol0ii1 extends ConnectivityManager.NetworkCallback {
                public static final Oiolol0ii1 I00000oIO = new Oiolol0ii1();
                public static final Object I00000oOI = new Object();
                public static final LinkedHashMap I0000Il00O = new LinkedHashMap();
                public static NetworkCapabilities I0000O;
                public static boolean I0000oI00;
                public static Boolean I0001Ioi1lo;

                public static void I00000oIO() {
/* 3 */             ArrayList arrayList = new ArrayList();
                    synchronized (I00000oOI) {
                        try {
/* 11 */                    if (I0000oI00 && I0001Ioi1lo != null) {
/* 35 */                        for (Map.Entry entry : I0000Il00O.entrySet()) {
/* 47 */                            Function1 function1 = (Function1) entry.getKey();
/* 53 */                            NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
/* 55 */                            Oiolol0ii1 oiolol0ii1 = I00000oIO;
/* 57 */                            NetworkCapabilities networkCapabilities = I0000O;
/* 59 */                            oiolol0ii1.getClass();
/* 97 */                            arrayList.add(new OIoi0IIoi(function1, !I0001Ioi1lo.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities) ? IOo0oo1oo1OI.I00000oIO : new IOo0oooliOI0(7)));
                                }
/* 102 */                       Iterator it = arrayList.iterator();
/* 110 */                       while (it.hasNext()) {
/* 116 */                           OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) it.next();
/* 126 */                           ((Function1) oIoi0IIoi.I00iOIl).invoke((IOo100ol1lIo) oIoi0IIoi.I00iiI);
                                }
/* 130 */                       return;
                            }
/* 131 */                   IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 135 */                   int i = i01I01lIOo.I00000oIO;
/* 137 */                   iIi0oIlI000II.getClass();
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
                }

                @Override
                public final void onBlockedStatusChanged(Network network, boolean z) {
/* 1 */             IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 5 */             int i = i01I01lIOo.I00000oIO;
/* 7 */             iIi0oIlI000II.getClass();
                    synchronized (I00000oOI) {
/* 23 */                if (O0000Ioio00.I0000O(I0001Ioi1lo, Boolean.valueOf(z))) {
/* 26 */                    return;
                        }
/* 31 */                I0001Ioi1lo = Boolean.valueOf(z);
/* 34 */                I00000oIO();
                    }
                }

                @Override
                public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
/* 1 */             IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 5 */             int i = i01I01lIOo.I00000oIO;
/* 7 */             iIi0oIlI000II.getClass();
                    synchronized (I00000oOI) {
/* 13 */                I0000O = networkCapabilities;
/* 16 */                I0000oI00 = true;
                    }
/* 19 */            I00000oIO();
                }

                @Override
                public final void onLost(Network network) {
/* 1 */             IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 5 */             int i = i01I01lIOo.I00000oIO;
/* 7 */             iIi0oIlI000II.getClass();
                    synchronized (I00000oOI) {
/* 14 */                I0000O = null;
/* 24 */                Iterator it = I0000Il00O.keySet().iterator();
/* 32 */                while (it.hasNext()) {
/* 46 */                    ((Function1) it.next()).invoke(new IOo0oooliOI0(7));
                        }
                    }
                }
            }
