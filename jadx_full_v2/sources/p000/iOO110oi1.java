            package p000;

            import java.nio.charset.StandardCharsets;
            
            public abstract class iOO110oi1 {
                public static boolean I00000oIO(String str, byte[] bArr, int i, int i2) {
/* 3 */             byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
/* 7 */             int length = bytes.length;
/* 8 */             int iMin = Math.min(length, i2);
/* 13 */            int i3 = 0;
                    while (true) {
/* 14 */                if (i3 < iMin) {
/* 22 */                    if (bytes[i3] != bArr[i + i3]) {
                                break;
                            }
/* 25 */                    i3++;
                        } else if (length == i2) {
/* 30 */                    return true;
                        }
                    }
/* 12 */            return false;
                }
            }
