            package p000;

            import android.util.Log;
            
            public abstract class l11I1i {
                public static void I00000oIO(String str, String str2, Object obj) {
/* 12 */            if (Log.isLoggable("TRuntime.".concat(str), 3)) {
/* 18 */                String.format(str2, obj);
                    }
                }

                public static void I00000oOI(String str, String str2, Exception exc) {
/* 3 */             String strConcat = "TRuntime.".concat(str);
/* 12 */            if (Log.isLoggable(strConcat, 6)) {
/* 14 */                Log.e(strConcat, str2, exc);
                    }
                }
            }
