            package com.google.firebase.analytics;

            import android.app.Activity;
            import android.content.Context;
            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import p000.IlIoliIO;
            import p000.IlO01o11oOOO;
            import p000.IlO0Ii1Il00o;
            import p000.OoOil11Ol1o;
            import p000.il11o1;
            import p000.il1l0io1O;
            import p000.ilI11O0l1;
            import p000.iliOIiil;
            import p000.io0oIOI1o1i;
            import p000.lII0I0I000I;
            import p000.lIlI1I;
            import p000.lOio0o;
            
            public final class FirebaseAnalytics {
                public static volatile FirebaseAnalytics I00000oOI;
                public io0oIOI1o1i I00000oIO;

                public static FirebaseAnalytics getInstance(Context context) {
/* 3 */             if (I00000oOI == null) {
                        synchronized (FirebaseAnalytics.class) {
                            try {
/* 10 */                        if (I00000oOI == null) {
/* 13 */                            io0oIOI1o1i io0oioi1o1iI0000Il00O = io0oIOI1o1i.I0000Il00O(context, null);
/* 19 */                            FirebaseAnalytics firebaseAnalytics = new FirebaseAnalytics();
/* 22 */                            lII0I0I000I.I000II(io0oioi1o1iI0000Il00O);
/* 25 */                            firebaseAnalytics.I00000oIO = io0oioi1o1iI0000Il00O;
/* 27 */                            VarHandle.storeStoreFence();
/* 30 */                            I00000oOI = firebaseAnalytics;
                                }
                            } finally {
                            }
                        }
                    }
/* 39 */            return I00000oOI;
                }

                public static lIlI1I getScionFrontendApiImplementation(Context context, Bundle bundle) {
/* 1 */             io0oIOI1o1i io0oioi1o1iI0000Il00O = io0oIOI1o1i.I0000Il00O(context, bundle);
/* 5 */             if (io0oioi1o1iI0000Il00O == null) {
/* 7 */                 return null;
                    }
/* 11 */            il11o1 il11o1Var = new il11o1();
/* 14 */            il11o1Var.I00000oIO = io0oioi1o1iI0000Il00O;
/* 16 */            VarHandle.storeStoreFence();
/* 89 */            return il11o1Var;
                }

                public final void I00000oIO(String str, Bundle bundle) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 3 */             io0oioi1o1i.getClass();
/* 15 */            io0oioi1o1i.I00000oIO(new iliOIiil(io0oioi1o1i, (String) null, str, bundle, false));
                }

                public String getFirebaseInstanceId() {
                    try {
/* 2 */                 Object obj = IlO01o11oOOO.I000lI;
/* 4 */                 IlIoliIO ilIoliIOI00000oOI = IlIoliIO.I00000oOI();
/* 10 */                ilIoliIOI00000oOI.I00000oIO();
/* 33 */                return (String) lOio0o.I00000oOI(((IlO01o11oOOO) ilIoliIOI00000oOI.I0000O.I00000oIO(IlO0Ii1Il00o.class)).I0000Il00O(), 30000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
/* 40 */                OoOil11Ol1o.I000oI1ioi(e);
/* 1 */                 return null;
                    } catch (ExecutionException e2) {
/* 56 */                OoOil11Ol1o.I000oI1ioi(e2.getCause());
/* 1 */                 return null;
                    } catch (TimeoutException unused) {
/* 51 */                throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
                    }
                }

                @Deprecated
                public void setCurrentScreen(Activity activity, String str, String str2) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 3 */             il1l0io1O il1l0io1oI00000oOI = il1l0io1O.I00000oOI(activity);
/* 7 */             io0oioi1o1i.getClass();
/* 15 */            io0oioi1o1i.I00000oIO(new ilI11O0l1(io0oioi1o1i, il1l0io1oI00000oOI, str, str2));
                }
            }
