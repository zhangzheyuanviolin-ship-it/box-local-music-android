            package p000;
            
            public abstract class iIo0Ioi1lIl {
                public static final char[] I00000oIO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                public static final char[] I00000oOI = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

                public static String I00000oIO(byte[] bArr) {
/* 1 */             int length = bArr.length;
/* 6 */             StringBuilder sb = new StringBuilder(length + length);
/* 10 */            for (int i = 0; i < length; i++) {
/* 16 */                int i2 = (bArr[i] & 240) >>> 4;
/* 18 */                char[] cArr = I00000oIO;
/* 22 */                sb.append(cArr[i2]);
/* 31 */                sb.append(cArr[bArr[i] & 15]);
                    }
/* 37 */            return sb.toString();
                }
            }
