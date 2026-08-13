            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.Objects;
            
/* 27 */    public final class IlIII0O1il implements Application.ActivityLifecycleCallbacks {
                public final int I00iOIl;
                public Object I00iiI;

                public IlIII0O1il(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I000OOo1O(il1l0io1O il1l0io1o, Bundle bundle) {
/* 7 */             l0olllO1i l0olllo1i = (l0olllO1i) ((lIl1O1li) this.I00iiI).I00iOIl;
                    try {
                        try {
/* 9 */                     l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 11 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 18 */                    l01o0io1ooo0.I00lll10.I00000oOI("onActivityCreated");
/* 21 */                    Intent intent = il1l0io1o.I00iiO;
/* 23 */                    if (intent != null) {
/* 25 */                        Uri data = intent.getData();
/* 29 */                        if (data == null || !data.isHierarchical()) {
/* 43 */                            Bundle extras = intent.getExtras();
/* 48 */                            if (extras != null) {
/* 52 */                                String string = extras.getString("com.android.vending.referral_url");
/* 67 */                                data = !TextUtils.isEmpty(string) ? Uri.parse(string) : null;
                                    }
                                }
/* 68 */                        if (data != null && data.isHierarchical()) {
/* 79 */                            l0olllO1i.I0000oI00(l0olllo1i.I00l0I0l0lO1);
/* 91 */                            String str = lioil0ilIOi.I01Oi01Ilol(intent) ? "gs" : "auto";
/* 95 */                            String queryParameter = data.getQueryParameter("referrer");
/* 103 */                           boolean z = bundle == null;
/* 104 */                           l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 106 */                           l0olllO1i.I000II(l0o10ooo0);
/* 112 */                           l1oloOI l1olooi = new l1oloOI(2);
/* 115 */                           l1olooi.I00iio = z;
/* 117 */                           l1olooi.I00ilI0I1 = data;
/* 119 */                           l1olooi.I00iiI = str;
/* 121 */                           l1olooi.I00iiO = queryParameter;
/* 123 */                           l1olooi.I00ilO0 = this;
/* 125 */                           VarHandle.storeStoreFence();
/* 128 */                           l0o10ooo0.I010o0o0oO(l1olooi);
                                }
                            }
                        } catch (RuntimeException e) {
/* 140 */                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 142 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 149 */                   l01o0io1ooo02.I00ilO0.I0000Il00O("Throwable caught in onActivityCreated", e);
                        }
                    } finally {
/* 153 */               lO0liIO0 lo0liio0 = l0olllo1i.I00ll1;
/* 155 */               l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 158 */               lo0liio0.I010l1ol111(il1l0io1o, bundle);
                    }
                }

                public void I000OiO(il1l0io1O il1l0io1o) {
/* 9 */             lO0liIO0 lo0liio0 = ((l0olllO1i) ((lIl1O1li) this.I00iiI).I00iOIl).I00ll1;
/* 11 */            l0olllO1i.I0001Ioi1lo(lo0liio0);
                    synchronized (lo0liio0.I00ll1) {
                        try {
/* 23 */                    if (Objects.equals(lo0liio0.I00io1l, il1l0io1o)) {
/* 26 */                        lo0liio0.I00io1l = null;
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 42 */            if (((l0olllO1i) lo0liio0.I00iOIl).I00iio.I0111i()) {
/* 53 */                lo0liio0.I00ilO0.remove(Integer.valueOf(il1l0io1o.I00iOIl));
                    }
                }

                public void I000iOII(il1l0io1O il1l0io1o) {
                    int i;
/* 7 */             l0olllO1i l0olllo1i = (l0olllO1i) ((lIl1O1li) this.I00iiI).I00iOIl;
/* 9 */             lO0liIO0 lo0liio0 = l0olllo1i.I00ll1;
/* 11 */            l0olllO1i.I0001Ioi1lo(lo0liio0);
                    synchronized (lo0liio0.I00ll1) {
/* 18 */                lo0liio0.I00li1OI = false;
/* 20 */                i = 1;
/* 21 */                lo0liio0.I00ioIO = true;
                    }
/* 26 */            l0olllO1i l0olllo1i2 = (l0olllO1i) lo0liio0.I00iOIl;
/* 30 */            l0olllo1i2.I00li1OI.getClass();
/* 33 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 44 */            if (l0olllo1i2.I00iio.I0111i()) {
/* 69 */                lIol0ili1Oi liol0ili1oiI010oio1OO0 = lo0liio0.I010oio1OO0(il1l0io1o);
/* 75 */                lo0liio0.I00iio = lo0liio0.I00iiO;
/* 77 */                lo0liio0.I00iiO = null;
/* 79 */                l0o10OoO0 l0o10ooo0 = l0olllo1i2.I00io1l;
/* 81 */                l0olllO1i.I000II(l0o10ooo0);
/* 86 */                OllIllO1O ollIllO1O = new OllIllO1O(i);
/* 89 */                ollIllO1O.I00iiO = liol0ili1oiI010oio1OO0;
/* 91 */                ollIllO1O.I00iiI = jElapsedRealtime;
/* 93 */                ollIllO1O.I00iio = lo0liio0;
/* 95 */                VarHandle.storeStoreFence();
/* 98 */                l0o10ooo0.I010o0o0oO(ollIllO1O);
                    } else {
/* 46 */                lo0liio0.I00iiO = null;
/* 48 */                l0o10OoO0 l0o10ooo02 = l0olllo1i2.I00io1l;
/* 50 */                l0olllO1i.I000II(l0o10ooo02);
/* 55 */                iil0ol0o1 iil0ol0o1Var = new iil0ol0o1(i);
/* 58 */                iil0ol0o1Var.I00iiI = jElapsedRealtime;
/* 60 */                iil0ol0o1Var.I00iiO = lo0liio0;
/* 62 */                VarHandle.storeStoreFence();
/* 65 */                l0o10ooo02.I010o0o0oO(iil0ol0o1Var);
                    }
/* 101 */           li10O1l0 li10o1l0 = l0olllo1i.I00ioIO;
/* 103 */           l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 108 */           l0olllO1i l0olllo1i3 = (l0olllO1i) li10o1l0.I00iOIl;
/* 112 */           l0olllo1i3.I00li1OI.getClass();
/* 115 */           long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 119 */           l0o10OoO0 l0o10ooo03 = l0olllo1i3.I00io1l;
/* 121 */           l0olllO1i.I000II(l0o10ooo03);
/* 126 */           lOollI loolli = new lOollI(i);
/* 129 */           loolli.I00iiI = jElapsedRealtime2;
/* 131 */           loolli.I00iiO = li10o1l0;
/* 133 */           VarHandle.storeStoreFence();
/* 136 */           l0o10ooo03.I010o0o0oO(loolli);
                }

                public void I000l1(il1l0io1O il1l0io1o) {
/* 7 */             l0olllO1i l0olllo1i = (l0olllO1i) ((lIl1O1li) this.I00iiI).I00iOIl;
/* 9 */             li10O1l0 li10o1l0 = l0olllo1i.I00ioIO;
/* 11 */            l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 16 */            l0olllO1i l0olllo1i2 = (l0olllO1i) li10o1l0.I00iOIl;
/* 20 */            l0olllo1i2.I00li1OI.getClass();
/* 23 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 27 */            l0o10OoO0 l0o10ooo0 = l0olllo1i2.I00io1l;
/* 29 */            l0olllO1i.I000II(l0o10ooo0);
/* 34 */            int i = 0;
/* 35 */            lOollI loolli = new lOollI(i);
/* 38 */            loolli.I00iiI = jElapsedRealtime;
/* 40 */            loolli.I00iiO = li10o1l0;
/* 42 */            VarHandle.storeStoreFence();
/* 45 */            l0o10ooo0.I010o0o0oO(loolli);
/* 48 */            lO0liIO0 lo0liio0 = l0olllo1i.I00ll1;
/* 50 */            l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 53 */            Object obj = lo0liio0.I00ll1;
                    synchronized (obj) {
/* 56 */                int i2 = 1;
                        try {
/* 57 */                    lo0liio0.I00li1OI = true;
/* 65 */                    if (!Objects.equals(il1l0io1o, lo0liio0.I00io1l)) {
                                synchronized (obj) {
/* 69 */                            lo0liio0.I00io1l = il1l0io1o;
/* 71 */                            lo0liio0.I00ioIO = false;
/* 76 */                            l0olllO1i l0olllo1i3 = (l0olllO1i) lo0liio0.I00iOIl;
/* 84 */                            if (l0olllo1i3.I00iio.I0111i()) {
/* 87 */                                lo0liio0.I00l0I0l0lO1 = null;
/* 89 */                                l0o10OoO0 l0o10ooo02 = l0olllo1i3.I00io1l;
/* 91 */                                l0olllO1i.I000II(l0o10ooo02);
/* 96 */                                lO010OO1i1 lo010oo1i1 = new lO010OO1i1(i2);
/* 99 */                                lo010oo1i1.I00iiI = lo0liio0;
/* 101 */                               VarHandle.storeStoreFence();
/* 104 */                               l0o10ooo02.I010o0o0oO(lo010oo1i1);
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 437 */                   throw th;
                        }
                    }
/* 113 */           l0olllO1i l0olllo1i4 = (l0olllO1i) lo0liio0.I00iOIl;
/* 121 */           if (!l0olllo1i4.I00iio.I0111i()) {
/* 125 */               lo0liio0.I00iiO = lo0liio0.I00l0I0l0lO1;
/* 127 */               l0o10OoO0 l0o10ooo03 = l0olllo1i4.I00io1l;
/* 129 */               l0olllO1i.I000II(l0o10ooo03);
/* 134 */               lO010OO1i1 lo010oo1i12 = new lO010OO1i1(i);
/* 137 */               lo010oo1i12.I00iiI = lo0liio0;
/* 139 */               VarHandle.storeStoreFence();
/* 142 */               l0o10ooo03.I010o0o0oO(lo010oo1i12);
/* 145 */               return;
                    }
/* 152 */           lo0liio0.I010lI0oi(il1l0io1o.I00iiI, lo0liio0.I010oio1OO0(il1l0io1o), false);
/* 159 */           il11ll0i il11ll0iVar = ((l0olllO1i) lo0liio0.I00iOIl).I00lll10;
/* 161 */           l0olllO1i.I0000O(il11ll0iVar);
/* 166 */           l0olllO1i l0olllo1i5 = (l0olllO1i) il11ll0iVar.I00iOIl;
/* 170 */           l0olllo1i5.I00li1OI.getClass();
/* 173 */           long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 177 */           l0o10OoO0 l0o10ooo04 = l0olllo1i5.I00io1l;
/* 179 */           l0olllO1i.I000II(l0o10ooo04);
/* 184 */           iil0ol0o1 iil0ol0o1Var = new iil0ol0o1(i);
/* 187 */           iil0ol0o1Var.I00iiI = jElapsedRealtime2;
/* 189 */           iil0ol0o1Var.I00iiO = il11ll0iVar;
/* 191 */           VarHandle.storeStoreFence();
/* 194 */           l0o10ooo04.I010o0o0oO(iil0ol0o1Var);
                }

                public void I000lI(il1l0io1O il1l0io1o, Bundle bundle) {
                    lIol0ili1Oi liol0ili1oi;
/* 9 */             lO0liIO0 lo0liio0 = ((l0olllO1i) ((lIl1O1li) this.I00iiI).I00iOIl).I00ll1;
/* 11 */            l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 24 */            if (!((l0olllO1i) lo0liio0.I00iOIl).I00iio.I0111i() || bundle == null || (liol0ili1oi = (lIol0ili1Oi) lo0liio0.I00ilO0.get(Integer.valueOf(il1l0io1o.I00iOIl))) == null) {
/* 106 */               return;
                    }
/* 47 */            Bundle bundle2 = new Bundle();
/* 54 */            bundle2.putLong("id", liol0ili1oi.I0000Il00O);
/* 61 */            bundle2.putString("name", liol0ili1oi.I00000oIO);
/* 68 */            bundle2.putString("referrer_name", liol0ili1oi.I00000oOI);
/* 73 */            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
                }

                @Override
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    switch (this.I00iOIl) {
                        case 0:
/* 27 */                    Intent intent = activity.getIntent();
/* 31 */                    if (intent != null) {
/* 39 */                        ArrayDeque arrayDeque = (ArrayDeque) this.I00iiI;
/* 41 */                        Bundle bundle2 = null;
                                try {
/* 42 */                            Bundle extras = intent.getExtras();
/* 46 */                            if (extras != null) {
/* 50 */                                String string = extras.getString("google.message_id");
/* 54 */                                if (string == null) {
/* 58 */                                    string = extras.getString("message_id");
                                        }
/* 66 */                                if (!TextUtils.isEmpty(string)) {
/* 72 */                                    if (arrayDeque.contains(string)) {
                                                break;
                                            } else {
/* 76 */                                        arrayDeque.add(string);
                                            }
                                        }
/* 84 */                                bundle2 = extras.getBundle("gcm.n.analytics_data");
                                    }
                                } catch (RuntimeException e) {
/* 91 */                            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
                                }
/* 110 */                       if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
/* 112 */                           if (bundle2 != null) {
/* 126 */                               if ("1".equals(bundle2.getString("google.c.a.tc"))) {
/* 128 */                                   IlIoliIO ilIoliIOI00000oOI = IlIoliIO.I00000oOI();
/* 132 */                                   ilIoliIOI00000oOI.I00000oIO();
/* 143 */                                   I0l01l0 i0l01l0 = (I0l01l0) ilIoliIOI00000oOI.I0000O.I00000oIO(I0l01l0.class);
/* 145 */                                   Log.isLoggable("FirebaseMessaging", 3);
/* 148 */                                   if (i0l01l0 != null) {
/* 152 */                                       String string2 = bundle2.getString("google.c.a.c_id");
/* 156 */                                       I0l01lI0O00l i0l01lI0O00l = (I0l01lI0O00l) i0l01l0;
/* 166 */                                       if (!iil11Ooo1.I00000oOI.contains("fcm")) {
/* 171 */                                           io0oIOI1o1i io0oioi1o1i = i0l01lI0O00l.I00000oIO.I00000oIO;
/* 173 */                                           io0oioi1o1i.getClass();
/* 181 */                                           io0oioi1o1i.I00000oIO(new ilI001i(io0oioi1o1i, string2));
                                                }
/* 186 */                                       Bundle bundle3 = new Bundle();
/* 193 */                                       bundle3.putString("source", "Firebase");
/* 200 */                                       bundle3.putString("medium", "notification");
/* 205 */                                       bundle3.putString("campaign", string2);
/* 210 */                                       i0l01lI0O00l.I00000oIO("_cmp", bundle3);
                                            } else {
/* 216 */                                       Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                                            }
                                        } else {
/* 220 */                                   Log.isLoggable("FirebaseMessaging", 3);
                                        }
                                    }
/* 225 */                           l1OO1oIO0i1o.I0000Il00O("_no", bundle2);
                                    break;
                                }
                            }
                            break;
                        case 1:
/* 23 */                    ((io0oIOI1o1i) this.I00iiI).I00000oIO(new ilO0olIi(this, bundle, activity));
                            break;
                        default:
/* 10 */                    I000OOo1O(il1l0io1O.I00000oOI(activity), bundle);
                            break;
                    }
                }

                @Override
                public final void onActivityDestroyed(Activity activity) {
                    switch (this.I00iOIl) {
                        case 0:
                            break;
                        case 1:
/* 24 */                    ((io0oIOI1o1i) this.I00iiI).I00000oIO(new ilool0ooo0o(this, activity, 4));
                            break;
                        default:
/* 10 */                    I000OiO(il1l0io1O.I00000oOI(activity));
                            break;
                    }
                }

                @Override
                public final void onActivityPaused(Activity activity) {
                    switch (this.I00iOIl) {
                        case 0:
                            break;
                        case 1:
/* 24 */                    ((io0oIOI1o1i) this.I00iiI).I00000oIO(new ilool0ooo0o(this, activity, 2));
                            break;
                        default:
/* 10 */                    I000iOII(il1l0io1O.I00000oOI(activity));
                            break;
                    }
                }

                @Override
                public final void onActivityResumed(Activity activity) {
                    switch (this.I00iOIl) {
                        case 0:
                            break;
                        case 1:
/* 24 */                    ((io0oIOI1o1i) this.I00iiI).I00000oIO(new ilool0ooo0o(this, activity, 1));
                            break;
                        default:
/* 10 */                    I000l1(il1l0io1O.I00000oOI(activity));
                            break;
                    }
                }

                @Override
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    switch (this.I00iOIl) {
                        case 0:
                            break;
                        case 1:
/* 16 */                    iioi1o1OO iioi1o1oo = new iioi1o1OO();
/* 28 */                    ((io0oIOI1o1i) this.I00iiI).I00000oIO(new ilO0olIi(this, activity, iioi1o1oo));
/* 33 */                    Bundle bundleI0000O = iioi1o1oo.I0000O(50L);
/* 37 */                    if (bundleI0000O != null) {
/* 39 */                        bundle.putAll(bundleI0000O);
                                break;
                            }
                            break;
                        default:
/* 10 */                    I000lI(il1l0io1O.I00000oOI(activity), bundle);
                            break;
                    }
                }

                @Override
                public final void onActivityStarted(Activity activity) {
                    switch (this.I00iOIl) {
                        case 1:
/* 17 */                    ((io0oIOI1o1i) this.I00iiI).I00000oIO(new ilool0ooo0o(this, activity, 0));
                            break;
                    }
                }

                @Override
                public final void onActivityStopped(Activity activity) {
                    switch (this.I00iOIl) {
                        case 1:
/* 17 */                    ((io0oIOI1o1i) this.I00iiI).I00000oIO(new ilool0ooo0o(this, activity, 3));
                            break;
                    }
                }

/* 28 */        private final void I00000oIO(Activity activity) {
                }

/* 28 */        private final void I00000oOI(Activity activity) {
                }

/* 28 */        private final void I0000Il00O(Activity activity) {
                }

/* 28 */        private final void I0000oI00(Activity activity) {
                }

/* 28 */        private final void I0001Ioi1lo(Activity activity) {
                }

/* 28 */        private final void I000II(Activity activity) {
                }

/* 28 */        private final void I000O01llI0(Activity activity) {
                }

/* 36 */        private final void I0000O(Activity activity, Bundle bundle) {
                }
            }
