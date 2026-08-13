            package p000;

            import android.os.Bundle;
            import com.google.android.gms.measurement.api.AppMeasurementSdk;
            
            public final class I0l01lI0O00l implements I0l01l0 {
                public static volatile I0l01lI0O00l I00000oOI;
                public AppMeasurementSdk I00000oIO;

                public final void I00000oIO(String str, Bundle bundle) {
/* 9 */             if (iil11Ooo1.I00000oOI.contains("fcm") || iil11Ooo1.I00000oIO.contains(str)) {
/* 82 */                return;
                    }
/* 21 */            OOol0l1I1 oOol0l1I1 = iil11Ooo1.I0000Il00O;
/* 23 */            int i = oOol0l1I1.I00iio;
/* 25 */            int i2 = 0;
/* 26 */            int i3 = 0;
/* 27 */            while (i3 < i) {
/* 35 */                boolean zContainsKey = bundle.containsKey((String) oOol0l1I1.get(i3));
/* 39 */                i3++;
/* 41 */                if (zContainsKey) {
/* 82 */                    return;
                        }
                    }
/* 50 */            if ("_cmp".equals(str)) {
/* 59 */                if (iil11Ooo1.I00000oOI.contains("fcm")) {
/* 82 */                    return;
                        }
/* 62 */                OOol0l1I1 oOol0l1I12 = iil11Ooo1.I0000Il00O;
/* 64 */                int i4 = oOol0l1I12.I00iio;
/* 66 */                while (i2 < i4) {
/* 74 */                    boolean zContainsKey2 = bundle.containsKey((String) oOol0l1I12.get(i2));
/* 78 */                    i2++;
/* 80 */                    if (zContainsKey2) {
/* 82 */                        return;
                            }
                        }
/* 87 */                bundle.putString("_cis", "fcm_integration");
                    }
/* 92 */            this.I00000oIO.logEvent("fcm", str, bundle);
                }
            }
