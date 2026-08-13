            package p000;
            
            public abstract class liool1o110 {
                public static String I00000oIO(String str) {
/* 1 */             int length = str.length();
/* 5 */             int i = 0;
/* 6 */             while (i < length) {
/* 8 */                 char cCharAt = str.charAt(i);
/* 14 */                if (cCharAt >= 'A' && cCharAt <= 'Z') {
/* 20 */                    char[] charArray = str.toCharArray();
/* 24 */                    while (i < length) {
/* 26 */                        char c = charArray[i];
/* 28 */                        if (c >= 'A' && c <= 'Z') {
/* 35 */                            charArray[i] = (char) (c ^ ' ');
                                }
/* 37 */                        i++;
                            }
/* 40 */                    return String.valueOf(charArray);
                        }
/* 45 */                i++;
                    }
/* 49 */            return str;
                }
            }
