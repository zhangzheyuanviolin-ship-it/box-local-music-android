            package p000;
            
            public abstract class lOOlo0i1i0 {
                public static final int I00000oIO(int i, CharSequence charSequence) {
/* 1 */             int length = charSequence.length();
/* 5 */             while (i < length) {
/* 13 */                if (charSequence.charAt(i) == '\n') {
/* 15 */                    return i;
                        }
/* 16 */                i++;
                    }
/* 19 */            return charSequence.length();
                }

                public static final int I00000oOI(int i, CharSequence charSequence) {
/* 1 */             while (i > 0) {
/* 11 */                if (charSequence.charAt(i - 1) == '\n') {
/* 13 */                    return i;
                        }
                        i--;
                    }
/* 17 */            return 0;
                }
            }
