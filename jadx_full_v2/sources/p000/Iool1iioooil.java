            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            
            public abstract class Iool1iioooil {
                public static final byte[] I00000oIO;

                static {
/* 2 */             byte[] bArr = new byte[0];
/* 4 */             I00000oIO = bArr;
/* 6 */             ByteBuffer.wrap(bArr);
/* 11 */            IOOIoI0ii iOOIoI0ii = new IOOIoI0ii();
/* 17 */            iOOIoI0ii.I000OiO = Integer.MAX_VALUE;
/* 19 */            iOOIoI0ii.I0000O = bArr;
/* 23 */            iOOIoI0ii.I0000oI00 = 0 + 0;
/* 25 */            iOOIoI0ii.I000II = 0;
/* 27 */            iOOIoI0ii.I000O01llI0 = 0;
/* 29 */            VarHandle.storeStoreFence();
                    try {
/* 32 */                iOOIoI0ii.I0000oI00(0);
                    } catch (O0010I0o e) {
/* 113 */               throw new IllegalArgumentException(e);
                    }
                }

                public static int I00000oIO(long j) {
/* 6 */             return (int) (j ^ (j >>> 32));
                }

                public static int I00000oOI(int i, byte[] bArr, int i2, int i3) {
/* 4 */             for (int i4 = i2; i4 < i2 + i3; i4++) {
/* 10 */                i = (i * 31) + bArr[i4];
                    }
/* 483 */           return i;
                }
            }
