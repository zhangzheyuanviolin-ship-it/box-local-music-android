            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.os.Bundle;
            import com.google.firebase.messaging.FirebaseMessaging;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class IlO0iIIo1l implements Runnable {
                public final int I00iOIl;
                public FirebaseMessaging I00iiI;

                @Override
                public final void run() {
                    o0IiOl o0iiolI0000O;
                    int i;
/* 1 */             int i2 = this.I00iOIl;
/* 3 */             FirebaseMessaging firebaseMessaging = this.I00iiI;
                    switch (i2) {
                        case 0:
/* 138 */                   if (firebaseMessaging.I0001Ioi1lo.I0000oI00() && firebaseMessaging.I000O01llI0(firebaseMessaging.I0000O())) {
                                synchronized (firebaseMessaging) {
/* 153 */                           if (!firebaseMessaging.I000iOII) {
/* 157 */                               firebaseMessaging.I000II(0L);
                                    }
                                }
/* 167 */                       return;
                            }
/* 167 */                   return;
                        default:
/* 8 */                     Context context = firebaseMessaging.I00000oOI;
/* 10 */                    lIi01Il01o.I00000oIO(context);
/* 13 */                    I0Oi111ii i0Oi111ii = firebaseMessaging.I0000Il00O;
/* 15 */                    boolean zI0001Ioi1lo = firebaseMessaging.I0001Ioi1lo();
/* 19 */                    SharedPreferences sharedPreferencesI00000oIO = lIi0lOOo10.I00000oIO(context);
/* 30 */                    if (!sharedPreferencesI00000oIO.contains("proxy_retention") || sharedPreferencesI00000oIO.getBoolean("proxy_retention", false) != zI0001Ioi1lo) {
/* 41 */                        OiI1lOO1O0i oiI1lOO1O0i = (OiI1lOO1O0i) i0Oi111ii.I00iio;
/* 52 */                        if (oiI1lOO1O0i.I0000Il00O.I001i1O0Ol() >= 241100000) {
/* 56 */                            Bundle bundle = new Bundle();
/* 59 */                            bundle.putBoolean("proxy_retention", zI0001Ioi1lo);
/* 64 */                            o00io0IiOOo0 o00io0iiooo0I000II = o00io0IiOOo0.I000II(oiI1lOO1O0i.I00000oOI);
                                    synchronized (o00io0iiooo0I000II) {
/* 71 */                                i = o00io0iiooo0I000II.I00iiI;
/* 75 */                                o00io0iiooo0I000II.I00iiI = i + 1;
                                    }
/* 82 */                            o0iiolI0000O = o00io0iiooo0I000II.I000O01llI0(new lli1OiO(i, 4, bundle, 0));
                                } else {
/* 97 */                            o0iiolI0000O = lOio0o.I0000O(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
/* 104 */                       I1Ii1lIoOI i1Ii1lIoOI = new I1Ii1lIoOI(1);
/* 109 */                       OOiO1Ol1IIIO oOiO1Ol1IIIO = new OOiO1Ol1IIIO();
/* 112 */                       oOiO1Ol1IIIO.I00iOIl = context;
/* 114 */                       oOiO1Ol1IIIO.I00iiI = zI0001Ioi1lo;
/* 116 */                       VarHandle.storeStoreFence();
/* 119 */                       o0iiolI0000O.I0000oI00(i1Ii1lIoOI, oOiO1Ol1IIIO);
                            }
/* 126 */                   if (firebaseMessaging.I0001Ioi1lo()) {
/* 128 */                       firebaseMessaging.I0000oI00();
/* 131 */                       return;
                            }
/* 131 */                   return;
                    }
                }
            }
