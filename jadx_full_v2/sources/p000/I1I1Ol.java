            package p000;

            import android.os.LocaleList;
            import android.widget.TextView;
            
            public abstract class I1I1Ol {
                public static LocaleList I00000oIO(String str) {
/* 1 */             return LocaleList.forLanguageTags(str);
                }

                public static void I00000oOI(TextView textView, LocaleList localeList) {
/* 1 */             textView.setTextLocales(localeList);
                }
            }
