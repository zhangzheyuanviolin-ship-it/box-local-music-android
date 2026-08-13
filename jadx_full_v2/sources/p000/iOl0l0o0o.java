            package p000;
            
            public abstract class iOl0l0o0o {
                public static final String I00000oIO(String str) {
                    char cCharAt;
/* 5 */             if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
/* 49 */                return str;
                    }
/* 27 */            StringBuilder sb = new StringBuilder(str.length());
/* 34 */            sb.append(Character.toUpperCase(cCharAt));
/* 42 */            sb.append((CharSequence) str, 1, str.length());
/* 45 */            return sb.toString();
                }

                public static final boolean I00000oOI(int i, String str) {
/* 1 */             char cCharAt = str.charAt(i);
                    return 'A' <= cCharAt && cCharAt < '[';
                }

                public static final String I0000Il00O(String str) {
/* 7 */             StringBuilder sb = new StringBuilder(str.length());
/* 10 */            int length = str.length();
/* 15 */            for (int i = 0; i < length; i++) {
/* 17 */                char cCharAt = str.charAt(i);
/* 23 */                if ('A' <= cCharAt && cCharAt < '[') {
/* 29 */                    cCharAt = Character.toLowerCase(cCharAt);
                        }
/* 33 */                sb.append(cCharAt);
                    }
/* 39 */            return sb.toString();
                }
            }
