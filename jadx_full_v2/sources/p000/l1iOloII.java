            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ActivityInfo;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.util.Log;
            
            public abstract class l1iOloII {
                public static Intent I00000oIO(I11io0O0O1o1 i11io0O0O1o1) {
/* 1 */             Intent parentActivityIntent = i11io0O0O1o1.getParentActivityIntent();
/* 5 */             if (parentActivityIntent != null) {
/* 7 */                 return parentActivityIntent;
                    }
                    try {
/* 12 */                String strI0000Il00O = I0000Il00O(i11io0O0O1o1, i11io0O0O1o1.getComponentName());
/* 17 */                if (strI0000Il00O == null) {
/* 16 */                    return null;
                        }
/* 22 */                ComponentName componentName = new ComponentName(i11io0O0O1o1, strI0000Il00O);
                        try {
                            return I0000Il00O(i11io0O0O1o1, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
                        } catch (PackageManager.NameNotFoundException unused) {
/* 67 */                    Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strI0000Il00O + "' in manifest");
/* 16 */                    return null;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
/* 77 */                throw new IllegalArgumentException(e);
                    }
                }

                public static Intent I00000oOI(Context context, ComponentName componentName) {
/* 1 */             String strI0000Il00O = I0000Il00O(context, componentName);
/* 5 */             if (strI0000Il00O == null) {
/* 7 */                 return null;
                    }
/* 15 */            ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strI0000Il00O);
                    return I0000Il00O(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
                }

                public static String I0000Il00O(Context context, ComponentName componentName) {
                    String string;
/* 8 */             ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
/* 12 */            String str = activityInfo.parentActivityName;
/* 14 */            if (str != null) {
/* 16 */                return str;
                    }
/* 17 */            Bundle bundle = activityInfo.metaData;
/* 20 */            if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
/* 19 */                return null;
                    }
/* 39 */            if (string.charAt(0) != '.') {
/* 106 */               return string;
                    }
/* 56 */            return context.getPackageName() + string;
                }
            }
