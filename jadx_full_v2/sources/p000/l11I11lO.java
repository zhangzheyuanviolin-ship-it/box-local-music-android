            package p000;

            import android.util.Log;
            
            public abstract class l11I11lO {
                public static int I00000oIO = 3;

                public static void I00000oIO(String str, String str2) {
/* 6 */             if (I0000O(6, str)) {
/* 8 */                 Log.e(str, str2);
                    }
                }

                public static void I00000oOI(String str, String str2, Throwable th) {
/* 6 */             if (I0000O(6, str)) {
/* 8 */                 Log.e(str, str2, th);
                    }
                }

                public static void I0000Il00O(String str, String str2) {
/* 6 */             if (I0000O(4, str)) {
/* 8 */                 Log.i(str, str2);
                    }
                }

                public static boolean I0000O(int i, String str) {
                    return I00000oIO <= i || Log.isLoggable(str, i);
                }

                public static void I0000oI00(String str, String str2) {
/* 6 */             if (I0000O(5, str)) {
/* 8 */                 Log.w(str, str2);
                    }
                }

                public static void I0001Ioi1lo(String str, String str2, Throwable th) {
/* 6 */             if (I0000O(5, str)) {
/* 8 */                 Log.w(str, str2, th);
                    }
                }
            }
