            package p000;

            import android.os.Build;
            import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
            import java.util.Iterator;
            import java.util.Locale;
            
            public abstract class ilO10l0 {
                public static boolean I00000oIO() {
/* 9 */             if (!Build.MANUFACTURER.equalsIgnoreCase("Google") && !Build.BRAND.equalsIgnoreCase("Google")) {
/* 20 */                return false;
                    }
/* 32 */            return ExtraSupportedSurfaceCombinationsQuirk.I0000Il00O.contains(Build.MODEL.toUpperCase(Locale.ROOT));
                }

                public static boolean I00000oOI() {
/* 10 */            if (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) {
/* 24 */                String upperCase = Build.MODEL.toUpperCase(Locale.ROOT);
/* 30 */                Iterator it = ExtraSupportedSurfaceCombinationsQuirk.I0000O.iterator();
/* 38 */                while (it.hasNext()) {
/* 50 */                    if (OlOolloIIOl0.I000l1(upperCase, (String) it.next(), false)) {
/* 52 */                        return true;
                            }
                        }
                    }
/* 9 */             return false;
                }
            }
