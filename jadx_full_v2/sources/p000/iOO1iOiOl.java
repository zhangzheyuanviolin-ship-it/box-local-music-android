            package p000;
            
            public abstract class iOO1iOiOl {
                public static byte[] I00000oIO(byte[] bArr) {
/* 1 */             if (bArr == null) {
/* 3 */                 return null;
                    }
/* 9 */             return (byte[]) bArr.clone();
                }

                public static int I00000oOI(byte[] bArr) {
/* 1 */             if (bArr == null) {
/* 3 */                 return 0;
                    }
/* 5 */             int length = bArr.length;
/* 6 */             int i = length + 1;
                    while (true) {
                        length--;
/* 10 */                if (length < 0) {
/* 49 */                    return i;
                        }
/* 16 */                i = (i * 257) ^ bArr[length];
                    }
                }
            }
