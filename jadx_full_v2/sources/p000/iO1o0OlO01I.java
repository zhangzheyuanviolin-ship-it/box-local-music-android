            package p000;
            
            public abstract class iO1o0OlO01I {
                public static final int I00000oIO(char c) {
/* 3 */             if ('0' <= c && c < ':') {
/* 9 */                 return c - '0';
                    }
/* 13 */            if ('a' <= c && c < 'g') {
/* 19 */                return c - 'W';
                    }
/* 24 */            if ('A' <= c && c < 'G') {
/* 30 */                return c - '7';
                    }
/* 186 */           throw new IllegalArgumentException("Unexpected hex digit: " + c);
                }
            }
