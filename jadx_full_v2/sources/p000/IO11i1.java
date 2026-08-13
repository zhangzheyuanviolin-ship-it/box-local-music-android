            package p000;
            
            public final class IO11i1 extends iOlI1iI1Ol {
                public char I00000oIO;

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("CharMatcher.is('");
/* 8 */             char c = this.I00000oIO;
/* 11 */            char[] cArr = new char[6];
/* 16 */            cArr[0] = '\\';
/* 21 */            cArr[1] = 'u';
/* 24 */            cArr[2] = 0;
/* 27 */            cArr[3] = 0;
/* 30 */            cArr[4] = 0;
/* 33 */            cArr[5] = 0;
/* 35 */            for (int i = 0; i < 4; i++) {
/* 47 */                cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
/* 50 */                c = (char) (c >> 4);
                    }
/* 58 */            sb.append(String.copyValueOf(cArr));
/* 63 */            sb.append("')");
/* 66 */            return sb.toString();
                }
            }
