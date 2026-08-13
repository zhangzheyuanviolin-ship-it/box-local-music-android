            package p000;

            import android.os.Build;
            import android.util.Range;
            import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
            import java.util.LinkedHashMap;
            import java.util.Locale;
            
            public abstract class ilO0Io0l0oo {
                public static boolean I00000oIO() {
/* 9 */             if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung") && !Build.BRAND.equalsIgnoreCase("Samsung")) {
/* 60 */                return false;
                    }
/* 19 */            LinkedHashMap linkedHashMap = ExtraCroppingQuirk.I00000oIO;
/* 21 */            String str = Build.MODEL;
/* 23 */            Locale locale = Locale.ROOT;
/* 33 */            if (!linkedHashMap.containsKey(str.toUpperCase(locale))) {
/* 60 */                return false;
                    }
/* 43 */            Range range = (Range) linkedHashMap.get(str.toUpperCase(locale));
/* 45 */            if (range != null) {
/* 53 */                return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
                    }
/* 58 */            return true;
                }
            }
