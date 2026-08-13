            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            
            public abstract class IoolIIolo1lI {
                public static final Charset I00000oIO;
                public static final byte[] I00000oOI;

                static {
/* 3 */             Charset.forName("US-ASCII");
/* 12 */            I00000oIO = Charset.forName("UTF-8");
/* 16 */            Charset.forName("ISO-8859-1");
/* 20 */            byte[] bArr = new byte[0];
/* 22 */            I00000oOI = bArr;
/* 24 */            ByteBuffer.wrap(bArr);
/* 29 */            IOOIlli iOOIlli = new IOOIlli();
/* 35 */            iOOIlli.I000OOo1O = Integer.MAX_VALUE;
/* 37 */            iOOIlli.I0000Il00O = bArr;
/* 41 */            iOOIlli.I0000O = 0 + 0;
/* 43 */            iOOIlli.I0001Ioi1lo = 0;
/* 45 */            iOOIlli.I000II = 0;
/* 47 */            VarHandle.storeStoreFence();
                    try {
/* 50 */                iOOIlli.I000lI(0);
                    } catch (O0011oo e) {
/* 110 */               throw new IllegalArgumentException(e);
                    }
                }

                public static void I00000oIO(String str, Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 4 */             IOOlIIilOl0.I000II(str);
                }

                public static int I00000oOI(long j) {
/* 6 */             return (int) (j ^ (j >>> 32));
                }
            }
