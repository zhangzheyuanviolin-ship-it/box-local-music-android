            package p000;

            import android.util.Base64;
            import java.lang.invoke.VarHandle;
            
            public abstract class iOll00o11OI {
                public static final IliIlOOIoIo I00000oIO;

                static {
/* 6 */             byte[] bArrDecode = Base64.decode("xBkDPNxUEiMRX5vPP2wqvCR4Grb8GZQqrKNyC0Y", 3);
/* 12 */            byte[] bArrDecode2 = Base64.decode("xJXZd/zR0io4+XWtcwbtnyYutpO4NX7DhE3xBg4", 3);
/* 17 */            byte[] bArr = new byte[bArrDecode.length];
/* 21 */            for (int i = 0; i < bArrDecode.length; i++) {
/* 29 */                bArr[i] = (byte) (bArrDecode[i] ^ bArrDecode2[i]);
                    }
/* 34 */            String strEncodeToString = Base64.encodeToString(bArr, 3);
/* 39 */            IliIlOOIoIo iliIlOOIoIo = new IliIlOOIoIo(2);
/* 42 */            iliIlOOIoIo.I00iiI = strEncodeToString;
/* 44 */            VarHandle.storeStoreFence();
/* 47 */            I00000oIO = iliIlOOIoIo;
                }
            }
