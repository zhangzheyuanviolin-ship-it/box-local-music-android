            package p000;

            import java.util.Calendar;
            import java.util.Locale;
            
            public final class iOolIl0IIo extends l1i00il00li {
                public long I00iiO;
                public String I00iio;

                @Override
                public final boolean I010OIo1l() {
/* 1 */             Calendar calendar = Calendar.getInstance();
/* 23 */            this.I00iiO = (calendar.get(16) + calendar.get(15)) / 60000;
/* 25 */            Locale locale = Locale.getDefault();
/* 29 */            String language = locale.getLanguage();
/* 33 */            Locale locale2 = Locale.ENGLISH;
/* 35 */            String lowerCase = language.toLowerCase(locale2);
/* 43 */            String lowerCase2 = locale.getCountry().toLowerCase(locale2);
/* 77 */            this.I00iio = IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
/* 79 */            return false;
                }

                public final long I010ioo() {
/* 1 */             I010i10l();
/* 4 */             return this.I00iiO;
                }

                public final String I010l10O() {
/* 1 */             I010i10l();
/* 4 */             return this.I00iio;
                }
            }
