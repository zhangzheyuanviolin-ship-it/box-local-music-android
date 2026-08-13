            package com.google.firebase.messaging;

            import android.app.NotificationManager;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.os.Binder;
            import android.os.Bundle;
            import android.util.Log;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import p000.I0Oi111ii;
            import p000.I0l01l0;
            import p000.I101oOiOiI;
            import p000.I1Io0i0II;
            import p000.I1ii1l10IO;
            import p000.I1ii1o0;
            import p000.IIoIil;
            import p000.IOiOoIO1OI;
            import p000.Iii11l;
            import p000.IlIoliIO;
            import p000.IlO01o11oOOO;
            import p000.IlO0Ii1Il00o;
            import p000.IlO0lI01iol;
            import p000.IlO0ll0OiI;
            import p000.O1Il01;
            import p000.OOiO0Il;
            import p000.Oi0Oooi;
            import p000.OiI1lOO1O0i;
            import p000.OlOO1i11110;
            import p000.OllIllO1O;
            import p000.OloIIoII1oo;
            import p000.i1i0olI;
            import p000.iO10oo0i1o;
            import p000.l1OO1oIO0i1o;
            import p000.lII0I0I000I;
            import p000.lIi01Il01o;
            import p000.lOio0o;
            import p000.lli1OiO;
            import p000.o00io0IiOOo0;
            import p000.o0IiOl;
            
            public class FirebaseMessaging {
                public static Oi0Oooi I000l1;
                public static OOiO0Il I000lI = new IOiOoIO1OI(5);
                public static ScheduledThreadPoolExecutor I000o00OoI0I;
                public IlIoliIO I00000oIO;
                public Context I00000oOI;
                public I0Oi111ii I0000Il00O;
                public I1ii1o0 I0000O;
                public OlOO1i11110 I0000oI00;
                public I1ii1l10IO I0001Ioi1lo;
                public ScheduledThreadPoolExecutor I000II;
                public ThreadPoolExecutor I000O01llI0;
                public I101oOiOiI I000OOo1O;
                public IlO0Ii1Il00o I000OiO;
                public boolean I000iOII;

                public static void I00000oOI(Runnable runnable, long j) {
                    synchronized (FirebaseMessaging.class) {
                        try {
/* 4 */                     ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = I000o00OoI0I;
/* 6 */                     if (scheduledThreadPoolExecutor == null) {
/* 19 */                        scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new iO10oo0i1o("TAG", 5));
/* 22 */                        I000o00OoI0I = scheduledThreadPoolExecutor;
                            }
/* 29 */                    scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
                        } catch (Throwable th) {
/* 89 */                    throw th;
                        }
                    }
                }

                public static synchronized Oi0Oooi I0000Il00O(Context context) {
                    Oi0Oooi oi0Oooi;
/* 4 */             oi0Oooi = I000l1;
/* 6 */             if (oi0Oooi == null) {
/* 10 */                oi0Oooi = new Oi0Oooi(context);
/* 13 */                I000l1 = oi0Oooi;
                    }
/* 19 */            return oi0Oooi;
                }

                @Deprecated
                public static synchronized FirebaseMessaging getInstance(IlIoliIO ilIoliIO) {
                    FirebaseMessaging firebaseMessaging;
/* 4 */             ilIoliIO.I00000oIO();
/* 13 */            firebaseMessaging = (FirebaseMessaging) ilIoliIO.I0000O.I00000oIO(FirebaseMessaging.class);
/* 17 */            lII0I0I000I.I000O01llI0("Firebase Messaging component is not present", firebaseMessaging);
/* 21 */            return firebaseMessaging;
                }

                public final String I00000oIO() throws IOException {
                    OloIIoII1oo oloIIoII1ooI000l1;
/* 1 */             O1Il01 o1Il01I0000O = I0000O();
/* 9 */             if (!I000O01llI0(o1Il01I0000O)) {
/* 13 */                return (String) o1Il01I0000O.I00iiI;
                    }
/* 18 */            String strI0000Il00O = I101oOiOiI.I0000Il00O(this.I00000oIO);
/* 22 */            OlOO1i11110 olOO1i11110 = this.I0000oI00;
/* 26 */            IlO0ll0OiI ilO0ll0OiI = new IlO0ll0OiI();
/* 29 */            ilO0ll0OiI.I00iOIl = this;
/* 31 */            ilO0ll0OiI.I00iiI = strI0000Il00O;
/* 33 */            ilO0ll0OiI.I00iiO = o1Il01I0000O;
/* 35 */            VarHandle.storeStoreFence();
                    synchronized (olOO1i11110) {
/* 47 */                oloIIoII1ooI000l1 = (OloIIoII1oo) ((I1Io0i0II) olOO1i11110.I00iiO).get(strI0000Il00O);
/* 50 */                if (oloIIoII1ooI000l1 != null) {
/* 54 */                    Log.isLoggable("FirebaseMessaging", 3);
                        } else {
/* 63 */                    Log.isLoggable("FirebaseMessaging", 3);
/* 66 */                    o0IiOl o0iiolI00000oIO = ilO0ll0OiI.I00000oIO();
/* 72 */                    ExecutorService executorService = (ExecutorService) olOO1i11110.I00iiI;
/* 78 */                    IIoIil iIoIil = new IIoIil(14);
/* 81 */                    iIoIil.I00iiI = olOO1i11110;
/* 83 */                    iIoIil.I00iiO = strI0000Il00O;
/* 85 */                    VarHandle.storeStoreFence();
/* 88 */                    oloIIoII1ooI000l1 = o0iiolI00000oIO.I000l1(executorService, iIoIil);
/* 96 */                    ((I1Io0i0II) olOO1i11110.I00iiO).put(strI0000Il00O, oloIIoII1ooI000l1);
                        }
                    }
                    try {
/* 104 */               return (String) lOio0o.I00000oIO(oloIIoII1ooI000l1);
                    } catch (InterruptedException | ExecutionException e) {
/* 115 */               throw new IOException("FCM Registration failed!", e);
                    }
                }

                public final O1Il01 I0000O() {
                    O1Il01 o1Il01I000O01llI0;
/* 3 */             Oi0Oooi oi0OooiI0000Il00O = I0000Il00O(this.I00000oOI);
/* 9 */             IlIoliIO ilIoliIO = this.I00000oIO;
/* 11 */            ilIoliIO.I00000oIO();
/* 25 */            String strI0000Il00O = "[DEFAULT]".equals(ilIoliIO.I00000oOI) ? "" : ilIoliIO.I0000Il00O();
/* 31 */            String strI0000Il00O2 = I101oOiOiI.I0000Il00O(this.I00000oIO);
                    synchronized (oi0OooiI0000Il00O) {
/* 67 */                o1Il01I000O01llI0 = O1Il01.I000O01llI0(((SharedPreferences) oi0OooiI0000Il00O.I00iiI).getString(strI0000Il00O + "|T|" + strI0000Il00O2 + "|*", null));
                    }
/* 72 */            return o1Il01I000O01llI0;
                }

                public final void I0000oI00() {
                    o0IiOl o0iiolI0000O;
                    int i;
/* 5 */             OiI1lOO1O0i oiI1lOO1O0i = (OiI1lOO1O0i) this.I0000Il00O.I00iio;
/* 16 */            int i2 = 1;
/* 17 */            if (oiI1lOO1O0i.I0000Il00O.I001i1O0Ol() >= 241100000) {
/* 21 */                o00io0IiOOo0 o00io0iiooo0I000II = o00io0IiOOo0.I000II(oiI1lOO1O0i.I00000oOI);
/* 25 */                Bundle bundle = Bundle.EMPTY;
                        synchronized (o00io0iiooo0I000II) {
/* 30 */                    i = o00io0iiooo0I000II.I00iiI;
/* 34 */                    o00io0iiooo0I000II.I00iiI = i + 1;
                        }
/* 49 */                o0iiolI0000O = o00io0iiooo0I000II.I000O01llI0(new lli1OiO(i, 5, bundle, 1)).I000iOII(Iii11l.I00iio, i1i0olI.I00l0I0l0lO1);
                    } else {
/* 64 */                o0iiolI0000O = lOio0o.I0000O(new IOException("SERVICE_NOT_AVAILABLE"));
                    }
/* 68 */            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.I000II;
/* 72 */            IlO0lI01iol ilO0lI01iol = new IlO0lI01iol(i2);
/* 75 */            ilO0lI01iol.I00iiI = this;
/* 77 */            VarHandle.storeStoreFence();
/* 80 */            o0iiolI0000O.I0000oI00(scheduledThreadPoolExecutor, ilO0lI01iol);
                }

                public final boolean I0001Ioi1lo() {
/* 1 */             Context context = this.I00000oOI;
/* 3 */             lIi01Il01o.I00000oIO(context);
/* 19 */            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
/* 92 */                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
/* 16 */                return false;
                    }
/* 39 */            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
/* 42 */                Log.isLoggable("FirebaseMessaging", 3);
/* 45 */                IlIoliIO ilIoliIO = this.I00000oIO;
/* 47 */                ilIoliIO.I00000oIO();
/* 58 */                if (ilIoliIO.I0000O.I00000oIO(I0l01l0.class) != null) {
/* 71 */                    return true;
                        }
/* 65 */                if (l1OO1oIO0i1o.I00000oIO() && I000lI != null) {
/* 71 */                    return true;
                        }
                    }
/* 16 */            return false;
                }

                public final synchronized void I000II(long j) {
/* 22 */            I00000oOI(new OllIllO1O(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
/* 26 */            this.I000iOII = true;
                }

                public final boolean I000O01llI0(O1Il01 o1Il01) {
                    String str;
/* 2 */             if (o1Il01 != null) {
/* 6 */                 String str2 = (String) o1Il01.I00iiI;
/* 10 */                String strI00000oOI = this.I000OOo1O.I00000oOI();
/* 26 */                if (System.currentTimeMillis() <= o1Il01.I00iOIl + 604800000 && strI00000oOI.equals((String) o1Il01.I00iiO)) {
/* 45 */                    if (this.I0000O.I00IioO0OiOi()) {
                                try {
/* 59 */                            str = (String) lOio0o.I00000oIO(((IlO01o11oOOO) this.I000OiO).I0000Il00O());
                                } catch (InterruptedException | ExecutionException unused) {
/* 62 */                            str = null;
                                }
/* 67 */                        return !str2.equalsIgnoreCase(str);
                            }
/* 75 */                    if (str2.length() > 22) {
/* 78 */                        return false;
                            }
                        }
                    }
/* 1 */             return true;
                }
            }
