            package p000;

            import java.nio.ByteBuffer;
            
            public abstract class iOlilI1ill0 {
                public static final byte[] I00000oIO;

                static {
/* 2 */             byte[] bArr = new byte[0];
/* 4 */             I00000oIO = bArr;
/* 6 */             ByteBuffer.wrap(bArr);
                }

                public static int I00000oIO(int i, byte[] bArr, int i2, int i3) {
/* 4 */             for (int i4 = i2; i4 < i2 + i3; i4++) {
/* 10 */                i = (i * 31) + bArr[i4];
                    }
/* 204 */           return i;
                }
            }
