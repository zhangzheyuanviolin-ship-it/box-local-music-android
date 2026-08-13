            package p000;

            import com.google.android.gms.common.api.Status;
            import java.util.HashMap;
            import java.util.Locale;
            
            public final class I1O10lli extends I11OiOl {
                /* JADX WARN: Illegal instructions before constructor call */
                public I1O10lli(int i) {
/* 3 */             Locale locale = Locale.getDefault();
/* 7 */             Integer numValueOf = Integer.valueOf(i);
/* 11 */            HashMap map = i0I1iii0l0l.I00000oIO;
/* 13 */            Integer numValueOf2 = Integer.valueOf(i);
/* 62 */            super(new Status(i, String.format(locale, "Asset Pack Download Error(%d): %s", numValueOf, !map.containsKey(numValueOf2) ? "" : Oi010OO0.I001IIilI0O((String) map.get(numValueOf2), " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#", (String) i0I1iii0l0l.I00000oOI.get(numValueOf2), ")")), null, null));
/* 65 */            if (i != 0) {
/* 67 */                return;
                    }
/* 70 */            I000II.I000iOII("errorCode should not be 0.");
/* 186 */           throw null;
                }
            }
