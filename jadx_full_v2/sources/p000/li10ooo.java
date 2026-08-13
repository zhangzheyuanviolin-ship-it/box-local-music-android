            package p000;
            
            public abstract class li10ooo {
                public static final int I00000oIO(int i, String str) {
                    int i2;
/* 1 */             char cCharAt = str.charAt(i);
/* 9 */             if (Character.isHighSurrogate(cCharAt) && (i2 = i + 1) < str.length()) {
/* 19 */                char cCharAt2 = str.charAt(i2);
/* 27 */                if (Character.isLowSurrogate(cCharAt2)) {
/* 42 */                    return (cCharAt2 - 56320) + ((cCharAt - 55296) << 10) + 65536;
                        }
                    }
/* 89 */            return cCharAt;
                }
            }
