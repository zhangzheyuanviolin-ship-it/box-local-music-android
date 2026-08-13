            package p000;

            import android.app.NotificationManager;
            import android.content.Context;
            import java.lang.invoke.VarHandle;
            
            public final class i0IIII0I1O implements i0Ii0I1ll {
                public final int I00iOIl;
                public i0O00lI I00iiI;

                @Override
                public final Object I0000Il00O() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             i0O00lI i0o00li = this.I00iiI;
                    switch (i) {
                        case 0:
/* 33 */                    Context contextI00000oOI = i0o00li.I00000oOI();
/* 39 */                    i0II0Oio01IO i0ii0oio01io = new i0II0Oio01IO();
/* 42 */                    i0ii0oio01io.I00000oIO = contextI00000oOI;
/* 48 */                    i0ii0oio01io.I00000oOI = contextI00000oOI.getPackageName();
/* 50 */                    VarHandle.storeStoreFence();
/* 53 */                    return i0ii0oio01io;
                        default:
/* 8 */                     Context contextI00000oOI2 = i0o00li.I00000oOI();
/* 14 */                    i0OI0oooo i0oi0oooo = new i0OI0oooo();
/* 17 */                    i0oi0oooo.I00000oIO = contextI00000oOI2;
/* 27 */                    i0oi0oooo.I00000oOI = (NotificationManager) contextI00000oOI2.getSystemService("notification");
/* 29 */                    VarHandle.storeStoreFence();
/* 32 */                    return i0oi0oooo;
                    }
                }
            }
