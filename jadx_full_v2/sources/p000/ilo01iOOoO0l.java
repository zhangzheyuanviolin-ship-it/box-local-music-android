            package p000;
            
            public abstract class ilo01iOOoO0l {
                public static byte[] I00000oIO(String str) {
/* 8 */             if (str.length() % 2 != 0) {
/* 66 */                I000II.I000iOII("Expected a string of even length");
/* 7 */                 return null;
                    }
/* 14 */            int length = str.length() / 2;
/* 16 */            byte[] bArr = new byte[length];
/* 19 */            for (int i = 0; i < length; i++) {
/* 21 */                int i2 = i * 2;
/* 29 */                int iDigit = Character.digit(str.charAt(i2), 16);
/* 39 */                int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
/* 44 */                if (iDigit == -1 || iDigit2 == -1) {
/* 59 */                    I000II.I000iOII("input is not hexadecimal");
/* 7 */                     return null;
                        }
/* 52 */                bArr[i] = (byte) ((iDigit * 16) + iDigit2);
                    }
/* 63 */            return bArr;
                }

                public static String I00000oOI(byte[] bArr) {
/* 6 */             StringBuilder sb = new StringBuilder(bArr.length * 2);
/* 11 */            for (byte b : bArr) {
/* 15 */                int i = b & 255;
/* 25 */                sb.append("0123456789abcdef".charAt(i / 16));
/* 34 */                sb.append("0123456789abcdef".charAt(i % 16));
                    }
/* 40 */            return sb.toString();
                }
            }
