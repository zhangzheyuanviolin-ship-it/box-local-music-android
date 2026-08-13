            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.text.TextUtils;
            
            public abstract class ll0i0l0Ili {
                public static String I00000oIO(Context context, String str) {
/* 1 */             lII0I0I000I.I000II(context);
/* 4 */             Resources resources = context.getResources();
/* 12 */            if (TextUtils.isEmpty(str)) {
/* 14 */                str = ll011I.I00000oIO(context);
                    }
/* 22 */            int identifier = resources.getIdentifier("google_app_id", "string", str);
/* 27 */            if (identifier == 0) {
/* 26 */                return null;
                    }
                    try {
/* 30 */                return resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
/* 26 */                return null;
                    }
                }

                public static String I00000oOI(String str, String[] strArr, String[] strArr2) {
/* 3 */             int iMin = Math.min(strArr.length, strArr2.length);
/* 8 */             for (int i = 0; i < iMin; i++) {
/* 10 */                String str2 = strArr[i];
/* 12 */                if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
/* 25 */                    return strArr2[i];
                        }
                    }
/* 31 */            return null;
                }
            }
