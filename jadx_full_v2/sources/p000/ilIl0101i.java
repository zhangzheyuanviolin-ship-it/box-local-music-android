            package p000;

            import android.os.Build;
            import java.util.Locale;
            
            public abstract class ilIl0101i {
                public static boolean I00000oIO() {
                    return (Build.MANUFACTURER.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei")) && "HWANE".equalsIgnoreCase(Build.DEVICE);
                }

                public static boolean I00000oOI() {
/* 9 */             if (!Build.MANUFACTURER.equalsIgnoreCase("Nokia") && !Build.BRAND.equalsIgnoreCase("Nokia")) {
/* 38 */                return false;
                    }
/* 19 */            String str = Build.DEVICE;
                    return "B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str);
                }

                public static boolean I0000Il00O() {
                    return (Build.MANUFACTURER.equalsIgnoreCase("OnePlus") || Build.BRAND.equalsIgnoreCase("OnePlus")) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
                }

                public static boolean I0000O() {
                    return (Build.MANUFACTURER.equalsIgnoreCase("OnePlus") || Build.BRAND.equalsIgnoreCase("OnePlus")) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
                }

                public static boolean I0000oI00() {
                    return (Build.MANUFACTURER.equalsIgnoreCase("Redmi") || Build.BRAND.equalsIgnoreCase("Redmi")) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
                }

                public static boolean I0001Ioi1lo() {
                    return (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "a05s".equalsIgnoreCase(Build.DEVICE) && OlOoOIi0o.I000oI1ioi(Build.MODEL.toUpperCase(Locale.ROOT), "SM-A057", false);
                }

                public static boolean I000II() {
                    return (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "J7XELTE".equalsIgnoreCase(Build.DEVICE);
                }

                public static boolean I000O01llI0() {
                    return (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE);
                }

                public static boolean I000OOo1O() {
/* 9 */             if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung") && !Build.BRAND.equalsIgnoreCase("Samsung")) {
/* 46 */                return false;
                    }
/* 19 */            String str = Build.DEVICE;
                    return "q4q".equalsIgnoreCase(str) || "SCG16".equalsIgnoreCase(str) || "SC-55C".equalsIgnoreCase(str);
                }
            }
