            package p000;
            
            public abstract class OlOoIoi11 {
                public static final int I00000oIO = 0;

                static {
                    try {
                        try {
                        } catch (Exception unused) {
/* 18 */                    String.format("%n", new Object[0]);
                        }
                    } catch (Exception unused2) {
                    }
                }

                public static String I00000oIO(byte[] bArr) {
/* 3 */             int length = bArr.length;
/* 4 */             char[] cArr = new char[length];
/* 7 */             for (int i = 0; i != length; i++) {
/* 14 */                cArr[i] = (char) (bArr[i] & 255);
                    }
/* 19 */            return new String(cArr);
                }

                public static String I00000oOI(String str) {
/* 1 */             char[] charArray = str.toCharArray();
/* 6 */             boolean z = false;
/* 8 */             for (int i = 0; i != charArray.length; i++) {
/* 10 */                char c = charArray[i];
/* 14 */                if ('a' <= c && 'z' >= c) {
/* 23 */                    charArray[i] = (char) (c - ' ');
/* 25 */                    z = true;
                        }
                    }
                    return z ? new String(charArray) : str;
                }
            }
