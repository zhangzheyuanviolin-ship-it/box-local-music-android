            package p000;

            import java.io.IOException;
            import java.util.Enumeration;
            
            public final class O0ioi0 implements Enumeration {
                public I00Io1o110i I00000oIO;
                public I00OIO1 I00000oOI;

                public final I00OIO1 I00000oIO() {
                    try {
/* 3 */                 return this.I00000oIO.I000l1();
                    } catch (IOException e) {
/* 29 */                throw new I00OI1("malformed ASN.1: " + e, e);
                    }
                }

                @Override
                public final boolean hasMoreElements() {
                    return this.I00000oOI != null;
                }

                @Override
                public final Object nextElement() {
/* 1 */             I00OIO1 i00oio1 = this.I00000oOI;
/* 3 */             if (i00oio1 != null) {
/* 9 */                 this.I00000oOI = I00000oIO();
/* 11 */                return i00oio1;
                    }
/* 12 */            IoOOl0iOl1io.I00000oOI();
/* 15 */            return null;
                }
            }
