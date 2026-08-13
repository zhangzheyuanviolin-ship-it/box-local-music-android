            package p000;

            import android.text.TextUtils;
            
            public abstract class lII1IoI {
                public static void I00000oIO(String str, boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             I000II.I000iOII(str);
                }

                public static void I00000oOI(String str, String str2) {
/* 1 */             I0000Il00O(str2, str);
/* 10 */            I00000oIO(str2, !TextUtils.isEmpty(str));
                }

                public static void I0000Il00O(String str, Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 4 */             IOOlIIilOl0.I000II(str);
                }

                public static void I0000O(String str, String str2) {
/* 1 */             if (str != null) {
/* 3 */                 I00000oOI(str, str2);
                    }
                }
            }
