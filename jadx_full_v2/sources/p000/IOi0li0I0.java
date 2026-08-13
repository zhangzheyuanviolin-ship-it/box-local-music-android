            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.util.Log;
            
            public abstract class IOi0li0I0 {
                public static final Io0Ool I00000oIO = new Io0Ool("CommonUtils", "");

                public static String I00000oIO(Context context) {
                    try {
/* 16 */                return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException e) {
/* 28 */                String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
/* 33 */                Io0Ool io0Ool = I00000oIO;
/* 41 */                if (!Log.isLoggable(io0Ool.I00000oIO, 6)) {
/* 52 */                    return "";
                        }
/* 49 */                Log.e("CommonUtils", io0Ool.I0000O(strConcat));
/* 52 */                return "";
                    }
                }
            }
