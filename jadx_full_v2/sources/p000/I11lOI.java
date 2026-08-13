            package p000;

            import android.app.LocaleManager;
            import android.os.LocaleList;
            
            public abstract class I11lOI {
                public static LocaleList I00000oIO(Object obj) {
/* 3 */             return ((LocaleManager) obj).getApplicationLocales();
                }

                public static void I00000oOI(Object obj, LocaleList localeList) {
/* 3 */             ((LocaleManager) obj).setApplicationLocales(localeList);
                }
            }
