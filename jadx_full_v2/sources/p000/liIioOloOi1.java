            package p000;

            import android.content.ComponentName;
            import android.content.pm.ComponentInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            
            public abstract class liIioOloOi1 {
                public static void I00000oIO(PackageManager packageManager, ComponentName componentName) throws PackageManager.NameNotFoundException {
                    ComponentInfo componentInfo;
/* 1 */             int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
/* 6 */             if (componentEnabledSetting != 1) {
/* 9 */                 if (componentEnabledSetting != 2) {
/* 11 */                    String packageName = componentName.getPackageName();
/* 15 */                    String className = componentName.getClassName();
                            try {
/* 21 */                        PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 516);
/* 26 */                        ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
/* 41 */                        int i = 0;
                                loop0: while (true) {
/* 42 */                            if (i >= 3) {
/* 70 */                                componentInfo = null;
                                        break;
                                    }
/* 44 */                            ComponentInfo[] componentInfoArr2 = componentInfoArr[i];
/* 46 */                            if (componentInfoArr2 != null) {
/* 49 */                                int length = componentInfoArr2.length;
/* 51 */                                for (int i2 = 0; i2 < length; i2++) {
/* 53 */                                    componentInfo = componentInfoArr2[i2];
/* 61 */                                    if (componentInfo.name.equals(className)) {
                                                break loop0;
                                            }
                                        }
                                    }
/* 67 */                            i++;
                                }
/* 71 */                        if (componentInfo != null) {
/* 78 */                            if (componentInfo.isEnabled()) {
/* 106 */                               return;
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
/* 81 */                packageManager.setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
            }
