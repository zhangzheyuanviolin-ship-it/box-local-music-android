            package p000;

            import android.os.Build;
            import java.util.Locale;
            
            public abstract class il1Io00o {
                public static boolean I00000oIO() {
/* 9 */             if ("Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
/* 62 */                return true;
                    }
/* 11 */            String str = Build.HARDWARE;
/* 13 */            Locale locale = Locale.ROOT;
/* 26 */            if (OlOolloIIOl0.I000l1(str.toLowerCase(locale), "ums", false)) {
/* 62 */                return true;
                    }
                    return (Build.MANUFACTURER.equalsIgnoreCase("Itel") || Build.BRAND.equalsIgnoreCase("Itel")) && OlOolloIIOl0.I000l1(str.toLowerCase(locale), "sp", false);
                }
            }
