            package p000;

            import android.util.Base64;
            import java.lang.invoke.VarHandle;
            
            public abstract class o0IIIi01O0o {
                public static final I0i0io0oOOi I00000oIO;

                static {
/* 6 */             byte[] bArrDecode = Base64.decode("xBkDPNxUEiMRX5vPP2wqvCR4Grb8GZQqrKNyC0Y", 3);
/* 12 */            byte[] bArrDecode2 = Base64.decode("xJXZd/zR0io4+XWtcwbtnyYutpO4NX7DhE3xBg4", 3);
/* 17 */            byte[] bArr = new byte[bArrDecode.length];
/* 21 */            for (int i = 0; i < bArrDecode.length; i++) {
/* 29 */                bArr[i] = (byte) (bArrDecode[i] ^ bArrDecode2[i]);
                    }
/* 34 */            String strEncodeToString = Base64.encodeToString(bArr, 3);
/* 39 */            I0i0io0oOOi i0i0io0oOOi = new I0i0io0oOOi(6);
/* 42 */            i0i0io0oOOi.I00iiI = strEncodeToString;
/* 44 */            VarHandle.storeStoreFence();
/* 47 */            I00000oIO = i0i0io0oOOi;
                }
            }
