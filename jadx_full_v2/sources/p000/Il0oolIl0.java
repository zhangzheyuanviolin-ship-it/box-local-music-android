            package p000;

            import java.util.Locale;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            public abstract class Il0oolIl0 {
                public static final Pattern I00000oIO = Pattern.compile("[\\\\&]");
                public static final Pattern I00000oOI = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
                public static final Pattern I0000Il00O;
                public static final lo1iloiI1 I0000O;

                static {
/* 20 */            Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
/* 29 */            I0000Il00O = Pattern.compile("[ \t\r\n]+");
/* 38 */            I0000O = new lo1iloiI1(11);
                }

                public static String I00000oIO(String str) {
/* 1 */             String strTrim = str.trim();
/* 5 */             Locale locale = Locale.ROOT;
/* 23 */            return I0000Il00O.matcher(strTrim.toLowerCase(locale).toUpperCase(locale)).replaceAll(" ");
                }

                public static String I00000oOI(String str) {
/* 11 */            if (!I00000oIO.matcher(str).find()) {
/* 186 */               return str;
                    }
/* 15 */            Matcher matcher = I00000oOI.matcher(str);
/* 23 */            if (!matcher.find()) {
/* 186 */               return str;
                    }
/* 34 */            StringBuilder sb = new StringBuilder(str.length() + 16);
/* 38 */            int iEnd = 0;
/* 87 */            do {
/* 43 */                sb.append((CharSequence) str, iEnd, matcher.start());
/* 46 */                String strGroup = matcher.group();
/* 52 */                I0000O.getClass();
/* 61 */                if (strGroup.charAt(0) == '\\') {
/* 68 */                    sb.append((CharSequence) strGroup, 1, strGroup.length());
                        } else {
/* 76 */                    sb.append(IoIIOIl0I1.I00000oIO(strGroup));
                        }
/* 79 */                iEnd = matcher.end();
/* 87 */            } while (matcher.find());
/* 93 */            if (iEnd != str.length()) {
/* 99 */                sb.append((CharSequence) str, iEnd, str.length());
                    }
/* 102 */           return sb.toString();
                }
            }
