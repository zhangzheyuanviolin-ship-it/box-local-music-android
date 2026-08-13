            package p000;

            import android.content.Context;
            import android.os.Bundle;
            
            public final class l1llIli {
                public final Context I00000oIO;
                public final Boolean I00000oOI;
                public final long I0000Il00O;
                public final il1i11oOloil I0000O;
                public final boolean I0000oI00;
                public final Long I0001Ioi1lo;
                public final Long I000II;
                public final String I000O01llI0;

                public l1llIli(Context context, il1i11oOloil il1i11ooloil, Long l, Long l2) {
/* 5 */             this.I0000oI00 = true;
/* 7 */             lII0I0I000I.I000II(context);
/* 10 */            Context applicationContext = context.getApplicationContext();
/* 14 */            lII0I0I000I.I000II(applicationContext);
/* 17 */            this.I00000oIO = applicationContext;
/* 19 */            this.I0001Ioi1lo = l;
/* 21 */            this.I000II = l2;
/* 23 */            if (il1i11ooloil != null) {
/* 25 */                this.I0000O = il1i11ooloil;
/* 29 */                this.I0000oI00 = il1i11ooloil.I00iiO;
/* 33 */                this.I0000Il00O = il1i11ooloil.I00iiI;
/* 37 */                this.I000O01llI0 = il1i11ooloil.I00ilI0I1;
/* 39 */                Bundle bundle = il1i11ooloil.I00iio;
/* 41 */                if (bundle != null) {
/* 53 */                    this.I00000oOI = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
                        }
                    }
                }
            }
