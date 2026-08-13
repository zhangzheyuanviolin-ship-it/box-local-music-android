            package p000;

            import android.content.res.Configuration;
            import android.os.LocaleList;
            import java.util.Locale;
            
            public abstract class I11loolloI1 {
                public static void I00000oIO(Configuration configuration, Configuration configuration2, Configuration configuration3) {
/* 1 */             LocaleList locales = configuration.getLocales();
/* 5 */             LocaleList locales2 = configuration2.getLocales();
/* 13 */            if (locales.equals(locales2)) {
/* 98 */                return;
                    }
/* 15 */            configuration3.setLocales(locales2);
/* 20 */            configuration3.locale = configuration2.locale;
                }

                public static O11oilI I00000oOI(Configuration configuration) {
/* 5 */             String languageTags = configuration.getLocales().toLanguageTags();
/* 9 */             if (languageTags != null) {
/* 11 */                O11oilI o11oilI = O11oilI.I00000oOI;
/* 17 */                if (!languageTags.isEmpty()) {
/* 23 */                    String[] strArrSplit = languageTags.split(",", -1);
/* 27 */                    int length = strArrSplit.length;
/* 28 */                    Locale[] localeArr = new Locale[length];
/* 31 */                    for (int i = 0; i < length; i++) {
/* 39 */                        localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
                            }
/* 49 */                    return O11oilI.I0000Il00O(new LocaleList(localeArr));
                        }
                    }
/* 54 */            return O11oilI.I00000oOI;
                }

                public static void I0000Il00O(O11oilI o11oilI) {
/* 13 */            LocaleList.setDefault(LocaleList.forLanguageTags(o11oilI.I00000oIO.I00000oIO.toLanguageTags()));
                }

                public static void I0000O(Configuration configuration, O11oilI o11oilI) {
/* 13 */            configuration.setLocales(LocaleList.forLanguageTags(o11oilI.I00000oIO.I00000oIO.toLanguageTags()));
                }
            }
