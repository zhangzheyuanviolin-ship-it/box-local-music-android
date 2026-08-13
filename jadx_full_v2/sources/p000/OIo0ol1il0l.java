            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            
            public abstract class OIo0ol1il0l {
                static {
/* 3 */             IIi0oIl.I000OiO("PackageManagerHelper");
                }

                public static void I00000oIO(Context context, Class cls, boolean z) {
                    try {
/* 14 */                int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
/* 18 */                boolean z2 = false;
/* 20 */                if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
/* 25 */                    z2 = true;
                        }
/* 26 */                if (z == z2) {
/* 32 */                    IIi0oIl.I000II().getClass();
                        } else {
/* 54 */                    context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
/* 61 */                    IIi0oIl.I000II().getClass();
                        }
                    } catch (Exception unused) {
/* 69 */                IIi0oIl.I000II().getClass();
                    }
                }
            }
