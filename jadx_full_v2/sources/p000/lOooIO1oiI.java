            package p000;

            import android.app.AppOpsManager;
            import android.content.Context;
            
            public abstract class lOooIO1oiI {
                public static boolean I00000oIO(int i, Context context, String str) {
                    try {
/* 13 */                AppOpsManager appOpsManager = (AppOpsManager) i01l1OO001.I00000oIO(context).I00000oIO.getSystemService("appops");
/* 15 */                if (appOpsManager == null) {
/* 29 */                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                        }
/* 17 */                appOpsManager.checkPackage(i, str);
/* 20 */                return true;
                    } catch (SecurityException unused) {
/* 30 */                return false;
                    }
                }
            }
