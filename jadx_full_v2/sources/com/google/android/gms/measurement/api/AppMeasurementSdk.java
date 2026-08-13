            package com.google.android.gms.measurement.api;

            import android.content.Context;
            import android.os.Bundle;
            import p000.iioi1o1OO;
            import p000.ilO1oIo0o0ii;
            import p000.ilOiooOI0iO;
            import p000.iliOIiil;
            import p000.io0oIOI1o1i;
            
            public class AppMeasurementSdk {
                public io0oIOI1o1i I00000oIO;

                public static AppMeasurementSdk getInstance(Context context) {
/* 6 */             return io0oIOI1o1i.I0000Il00O(context, null).I00000oOI;
                }

                public void beginAdUnitExposure(String str) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 3 */             io0oioi1o1i.getClass();
/* 12 */            io0oioi1o1i.I00000oIO(new ilO1oIo0o0ii(io0oioi1o1i, str, 0));
                }

                public void endAdUnitExposure(String str) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 3 */             io0oioi1o1i.getClass();
/* 12 */            io0oioi1o1i.I00000oIO(new ilO1oIo0o0ii(io0oioi1o1i, str, 1));
                }

                public long generateEventId() {
/* 3 */             return this.I00000oIO.I0000O();
                }

                public String getAppInstanceId() {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 3 */             io0oioi1o1i.getClass();
/* 8 */             iioi1o1OO iioi1o1oo = new iioi1o1OO();
/* 17 */            io0oioi1o1i.I00000oIO(new ilOiooOI0iO(io0oioi1o1i, iioi1o1oo, 1));
/* 32 */            return (String) iioi1o1OO.I0000oI00(iioi1o1oo.I0000O(50L), String.class);
                }

                public String getGmpAppId() {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 3 */             io0oioi1o1i.getClass();
/* 8 */             iioi1o1OO iioi1o1oo = new iioi1o1OO();
/* 17 */            io0oioi1o1i.I00000oIO(new ilOiooOI0iO(io0oioi1o1i, iioi1o1oo, 0));
/* 32 */            return (String) iioi1o1OO.I0000oI00(iioi1o1oo.I0000O(500L), String.class);
                }

                public void logEvent(String str, String str2, Bundle bundle) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 3 */             io0oioi1o1i.getClass();
/* 15 */            io0oioi1o1i.I00000oIO(new iliOIiil(io0oioi1o1i, str, str2, bundle, true));
                }
            }
