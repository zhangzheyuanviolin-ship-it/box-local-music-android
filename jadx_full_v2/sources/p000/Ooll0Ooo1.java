            package p000;

            import java.nio.charset.Charset;
            import java.security.SecureRandom;
            
            public abstract class Ooll0Ooo1 {
                public static final int I00000oIO = 0;

                static {
/* 3 */             Charset.forName("UTF-8");
                }

                public static int I00000oIO() {
/* 3 */             SecureRandom secureRandom = new SecureRandom();
/* 7 */             byte[] bArr = new byte[4];
/* 10 */            int i = 0;
/* 11 */            while (i == 0) {
/* 13 */                secureRandom.nextBytes(bArr);
/* 43 */                i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
/* 113 */           return i;
                }

                public static final IIOIlli0IO I00000oOI(String str) {
/* 5 */             byte[] bArr = new byte[str.length()];
/* 12 */            for (int i = 0; i < str.length(); i++) {
/* 14 */                char cCharAt = str.charAt(i);
/* 20 */                if (cCharAt < '!' || cCharAt > '~') {
/* 53 */                    throw new IOiIIo1l("Not a printable ASCII character: " + cCharAt, 9);
                        }
/* 27 */                bArr[i] = (byte) cCharAt;
                    }
/* 54 */            return IIOIlli0IO.I00000oIO(bArr);
                }
            }
