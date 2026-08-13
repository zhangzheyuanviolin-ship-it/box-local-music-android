            package p000;
            
            public abstract class lOOoOoI {
                public static String I00000oIO(String str, String str2) {
/* 9 */             int length = str.length() - str2.length();
/* 10 */            if (length < 0 || length > 1) {
/* 66 */                I000II.I000iOII("Invalid input received");
/* 69 */                return null;
                    }
/* 26 */            StringBuilder sb = new StringBuilder(str2.length() + str.length());
/* 34 */            for (int i = 0; i < str.length(); i++) {
/* 40 */                sb.append(str.charAt(i));
/* 47 */                if (str2.length() > i) {
/* 53 */                    sb.append(str2.charAt(i));
                        }
                    }
/* 59 */            return sb.toString();
                }
            }
