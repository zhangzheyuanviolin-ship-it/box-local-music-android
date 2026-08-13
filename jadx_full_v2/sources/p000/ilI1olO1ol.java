            package p000;

            import java.nio.charset.CharsetEncoder;
            
            public abstract class ilI1olO1ol {
                public static final III1oo00i1li I00000oIO(CharsetEncoder charsetEncoder, String str, int i, int i2) {
/* 3 */             III1oo00i1li iII1oo00i1li = new III1oo00i1li();
/* 6 */             if (i < i2) {
/* 21 */                do {
/* 9 */                     byte[] bArrI00000oIO = iOlIOO1I.I00000oIO(charsetEncoder, str, i, i2);
/* 14 */                    iII1oo00i1li.I001l0I00(bArrI00000oIO.length, bArrI00000oIO);
/* 17 */                    int length = bArrI00000oIO.length;
/* 18 */                    if (length < 0) {
/* 26 */                        I000II.I001IO000("Check failed.");
/* 29 */                        return null;
                            }
/* 20 */                    i += length;
/* 21 */                } while (i < i2);
                    }
/* 23 */            return iII1oo00i1li;
                }
            }
