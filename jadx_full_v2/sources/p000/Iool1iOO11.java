            package p000;

            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            
            public abstract class Iool1iOO11 {
                public static final Charset I00000oIO;
                public static final byte[] I00000oOI;

                static {
/* 3 */             Charset.forName("US-ASCII");
/* 12 */            I00000oIO = Charset.forName("UTF-8");
/* 16 */            Charset.forName("ISO-8859-1");
/* 20 */            byte[] bArr = new byte[0];
/* 22 */            I00000oOI = bArr;
/* 24 */            ByteBuffer.wrap(bArr);
/* 27 */            IOOOI0.I000OOo1O(bArr, 0, 0, false);
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
