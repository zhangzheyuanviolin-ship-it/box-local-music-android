            package p000;

            import android.app.ActivityManager;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
            public final class iii1IIii implements OliiillO, OIOolOo {
                public static iii1IIii I00iiO;
                public final int I00iOIl;
                public Object I00iiI;

                public iii1IIii(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static iii1IIii I00000oIO(Context context) {
/* 3 */             if (I00iiO == null) {
/* 8 */                 iii1IIii iii1iiii = new iii1IIii(1);
/* 11 */                Context applicationContext = context.getApplicationContext();
/* 15 */                VarHandle.storeStoreFence();
/* 18 */                I00iiO = iii1iiii;
/* 30 */                iii1iiii.I00iiI = new i0i01Ii0iII(applicationContext, i0i01Ii0iII.I000lI, null, Io0i00i0.I0000Il00O);
                    }
/* 32 */            return I00iiO;
                }

                public static OoIOol I0000O(Context context, String str) {
/* 1 */             int i = 12;
                    try {
/* 13 */                return new OoIOol(i, context.getPackageManager().getResourcesForApplication(str), str);
                    } catch (PackageManager.NameNotFoundException unused) {
/* 29 */                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52);
/* 34 */                sb.append("Unable to get resources for ");
/* 37 */                sb.append(str);
/* 42 */                sb.append(", using local resources.");
/* 51 */                Log.w("OssLicenses", sb.toString());
/* 64 */                return new OoIOol(i, context.getResources(), context.getPackageName());
                    }
                }

                public void I00000oOI() {
/* 3 */             li10O1l0 li10o1l0 = (li10O1l0) this.I00iiI;
/* 5 */             li10o1l0.I010II();
/* 10 */            l0olllO1i l0olllo1i = (l0olllO1i) li10o1l0.I00iOIl;
/* 12 */            l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 14 */            l0olllO1i.I0000oI00(l0oi0o);
/* 19 */            l0olllo1i.I00li1OI.getClass();
/* 30 */            if (l0oi0o.I010o0o0oO(System.currentTimeMillis())) {
/* 32 */                l0Oi0o l0oi0o2 = l0olllo1i.I00ilI0I1;
/* 34 */                l0olllO1i.I0000oI00(l0oi0o2);
/* 40 */                l0oi0o2.I00ll1.I00000oOI(true);
/* 45 */                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
/* 48 */                ActivityManager.getMyMemoryState(runningAppProcessInfo);
/* 55 */                if (runningAppProcessInfo.importance == 100) {
/* 57 */                    l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 59 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 66 */                    l01o0io1ooo0.I00lll10.I00000oOI("Detected application was in foreground");
/* 91 */                    I0001Ioi1lo(System.currentTimeMillis(), l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I01101olii) ? SystemClock.elapsedRealtime() : 0L);
                        }
                    }
                }

                public void I0000Il00O(int i, String str, List list, boolean z, boolean z2) {
                    IOloiOI1 iOloiOI1;
/* 7 */             l0olllO1i l0olllo1i = (l0olllO1i) ((l0l1ol11) this.I00iiI).I00iOIl;
                    int i2 = i - 1;
/* 13 */            if (i2 == 0) {
/* 94 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 96 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 99 */                iOloiOI1 = l01o0io1ooo0.I00lli11;
                    } else if (i2 != 1) {
/* 17 */                if (i2 == 3) {
/* 58 */                    l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 60 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 63 */                    iOloiOI1 = l01o0io1ooo02.I00lll10;
                        } else if (i2 != 4) {
/* 22 */                    l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 24 */                    l0olllO1i.I000II(l01o0io1ooo03);
/* 27 */                    iOloiOI1 = l01o0io1ooo03.I00ll1;
                        } else if (z) {
/* 32 */                    l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 34 */                    l0olllO1i.I000II(l01o0io1ooo04);
/* 37 */                    iOloiOI1 = l01o0io1ooo04.I00l0OO0IO;
                        } else if (z2) {
/* 50 */                    l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i.I00ilO0;
/* 52 */                    l0olllO1i.I000II(l01o0io1ooo05);
/* 55 */                    iOloiOI1 = l01o0io1ooo05.I00l0I0l0lO1;
                        } else {
/* 42 */                    l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i.I00ilO0;
/* 44 */                    l0olllO1i.I000II(l01o0io1ooo06);
/* 47 */                    iOloiOI1 = l01o0io1ooo06.I00li1OI;
                        }
                    } else if (z) {
/* 68 */                l01O0IO1ooO0 l01o0io1ooo07 = l0olllo1i.I00ilO0;
/* 70 */                l0olllO1i.I000II(l01o0io1ooo07);
/* 73 */                iOloiOI1 = l01o0io1ooo07.I00io1l;
                    } else if (z2) {
/* 86 */                l01O0IO1ooO0 l01o0io1ooo08 = l0olllo1i.I00ilO0;
/* 88 */                l0olllO1i.I000II(l01o0io1ooo08);
/* 91 */                iOloiOI1 = l01o0io1ooo08.I00ilO0;
                    } else {
/* 78 */                l01O0IO1ooO0 l01o0io1ooo09 = l0olllo1i.I00ilO0;
/* 80 */                l0olllO1i.I000II(l01o0io1ooo09);
/* 83 */                iOloiOI1 = l01o0io1ooo09.I00ioIO;
                    }
/* 101 */           int size = list.size();
/* 106 */           if (size == 1) {
/* 149 */               iOloiOI1.I0000Il00O(str, list.get(0));
/* 399 */               return;
                    }
/* 109 */           if (size == 2) {
/* 141 */               iOloiOI1.I0000O(list.get(0), str, list.get(1));
                    } else if (size != 3) {
/* 113 */               iOloiOI1.I00000oOI(str);
                    } else {
/* 129 */               iOloiOI1.I0000oI00(str, list.get(0), list.get(1), list.get(2));
                    }
                }

                public void I0000oI00(long j, long j2) {
/* 3 */             li10O1l0 li10o1l0 = (li10O1l0) this.I00iiI;
/* 5 */             li10o1l0.I010II();
/* 8 */             li10o1l0.I010ioo();
/* 13 */            l0olllO1i l0olllo1i = (l0olllO1i) li10o1l0.I00iOIl;
/* 15 */            l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 17 */            l0olllO1i.I0000oI00(l0oi0o);
/* 24 */            if (l0oi0o.I010o0o0oO(j)) {
/* 26 */                l0olllO1i.I0000oI00(l0oi0o);
/* 32 */                l0oi0o.I00ll1.I00000oOI(true);
/* 39 */                l0olllo1i.I000iOII().I010l10O();
                    }
/* 42 */            l0olllO1i.I0000oI00(l0oi0o);
/* 47 */            l0oi0o.I00o0l1o1o0.I00000oOI(j);
/* 56 */            if (l0oi0o.I00ll1.I00000oIO()) {
/* 58 */                I0001Ioi1lo(j, j2);
                    }
                }

                public void I0001Ioi1lo(long j, long j2) {
/* 3 */             li10O1l0 li10o1l0 = (li10O1l0) this.I00iiI;
/* 5 */             li10o1l0.I010II();
/* 10 */            l0olllO1i l0olllo1i = (l0olllO1i) li10o1l0.I00iOIl;
/* 16 */            if (l0olllo1i.I00000oIO()) {
/* 20 */                l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 22 */                l0olllO1i.I0000oI00(l0oi0o);
/* 27 */                l0oi0o.I00o0l1o1o0.I00000oOI(j);
/* 32 */                l0olllo1i.I00li1OI.getClass();
/* 35 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 39 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 41 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 52 */                l01o0io1ooo0.I00lll10.I0000Il00O("Session started, time", Long.valueOf(jElapsedRealtime));
/* 57 */                long j3 = j / 1000;
/* 59 */                Long lValueOf = Long.valueOf(j3);
/* 63 */                lIl1O1li lil1o1li = l0olllo1i.I00lli11;
/* 65 */                l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 73 */                lil1o1li.I01101olii(j, lValueOf, "auto", "_sid");
/* 76 */                l0olllO1i.I0000oI00(l0oi0o);
/* 81 */                l0oi0o.I00o101lO.I00000oOI(j3);
/* 87 */                l0oi0o.I00ll1.I00000oOI(false);
/* 92 */                Bundle bundle = new Bundle();
/* 97 */                bundle.putLong("_sid", j3);
/* 100 */               l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 110 */               lil1o1li.I010lI0oi("auto", "_s", j, j2, bundle);
/* 115 */               String strI000II = l0oi0o.I00oOio10iI1.I000II();
/* 123 */               if (TextUtils.isEmpty(strI000II)) {
/* 332 */                   return;
                        }
/* 127 */               Bundle bundle2 = new Bundle();
/* 132 */               bundle2.putString("_ffr", strI000II);
/* 135 */               l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 144 */               lil1o1li.I010lI0oi("auto", "_ssr", j, j2, bundle2);
                    }
                }

                public String I000II(String str) {
                    try {
/* 3 */                 i0i01Ii0iII i0i01ii0iii = (i0i01Ii0iII) this.I00iiI;
/* 11 */                o0IiOl o0iiolI00000oOI = i0i01ii0iii.I00000oOI(0, new i0OloII1(i0i01ii0iii, str));
/* 17 */                lli100OOO0 lli100ooo0 = new lli100OOO0();
/* 20 */                lli100ooo0.I00ioIO = o0iiolI00000oOI;
/* 22 */                iloillOlIi1 iloillolii1 = iloillOlIi1.I00iOIl;
/* 27 */                iii1IIii iii1iiii = new iii1IIii(6);
/* 30 */                iii1iiii.I00iiI = lli100ooo0;
/* 32 */                VarHandle.storeStoreFence();
/* 35 */                o0iiolI00000oOI.I00000oOI(iloillolii1, iii1iiii);
/* 46 */                return (String) lli100ooo0.get(2L, TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
/* 54 */                Log.w("OssLicenses", "Failed to get package name from OssLicensesClient", e);
/* 77 */                return str;
                    }
                }

                @Override
                public Object get() {
                    switch (this.I00iOIl) {
                        case 3:
/* 50 */                    OliiillO oliiillO = (OliiillO) ((I0Oi111ii) this.I00iiI).I00iiO;
/* 52 */                    ll1ooI1iI ll1ooi1ii = new ll1ooI1iI();
/* 55 */                    ll1ooi1ii.I00000oIO = oliiillO;
/* 64 */                    ll1ooi1ii.I00000oOI = Math.max(5, 10);
/* 66 */                    VarHandle.storeStoreFence();
/* 69 */                    return OIiiIl0iO.I0000Il00O(ll1ooi1ii);
                        default:
/* 14 */                    OI011o1 oI011o1 = (OI011o1) ((OliiillO) this.I00iiI).get();
/* 16 */                    oI011o1.getClass();
/* 23 */                    OoIlol ooIlol = new OoIlol(ilii1II.I0000Il00O);
/* 38 */                    return new OI011Ol0looI(ooIlol, oI011o1.I00iiI.schedule(ooIlol, 10000L, TimeUnit.MILLISECONDS));
                    }
                }

                @Override
                public void onComplete(OloIIoII1oo oloIIoII1oo) {
/* 3 */             lli100OOO0 lli100ooo0 = (lli100OOO0) this.I00iiI;
/* 10 */            if (((o0IiOl) oloIIoII1oo).I0000O) {
/* 13 */                lli100ooo0.cancel(false);
/* 16 */                return;
                    }
/* 22 */            if (oloIIoII1oo.I000OOo1O()) {
/* 24 */                Object objI000II = oloIIoII1oo.I000II();
/* 28 */                if (objI000II == null) {
/* 30 */                    objI000II = iloOO0lI0llo.I00iio;
                        }
/* 38 */                if (iloOO0lI0llo.I00io1l.I0001Ioi1lo(lli100ooo0, null, objI000II)) {
/* 40 */                    lli100OOO0.I0000O(lli100ooo0);
/* 43 */                    return;
                        }
/* 68 */                return;
                    }
/* 44 */            Exception excI0001Ioi1lo = oloIIoII1oo.I0001Ioi1lo();
/* 48 */            if (excI0001Ioi1lo == null) {
/* 69 */                IOOlIIilOl0.I000iOII();
/* 77 */                return;
                    }
/* 52 */            ilo1oo10Ili1 ilo1oo10ili1 = new ilo1oo10Ili1();
/* 55 */            ilo1oo10ili1.I00000oIO = excI0001Ioi1lo;
/* 63 */            if (iloOO0lI0llo.I00io1l.I0001Ioi1lo(lli100ooo0, null, ilo1oo10ili1)) {
/* 65 */                lli100OOO0.I0000O(lli100ooo0);
                    }
                }
            }
