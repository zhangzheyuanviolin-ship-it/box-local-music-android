            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            
            public abstract class il1OI0o0Il10 {
                public static Boolean I00000oIO;
                public static Boolean I00000oOI;
                public static Boolean I0000Il00O;
                public static Boolean I0000O;

                public static boolean I00000oIO(Context context) {
/* 1 */             PackageManager packageManager = context.getPackageManager();
/* 7 */             if (I00000oIO == null) {
/* 19 */                I00000oIO = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                    }
/* 21 */            Boolean boolValueOf = I00000oOI;
/* 23 */            if (boolValueOf == null) {
/* 35 */                boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
/* 39 */                I00000oOI = boolValueOf;
                    }
                    return boolValueOf.booleanValue();
                }
            }
