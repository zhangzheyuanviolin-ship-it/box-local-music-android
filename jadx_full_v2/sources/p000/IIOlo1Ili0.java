            package p000;

            import java.io.BufferedInputStream;
            import java.io.FilterInputStream;
            import java.io.IOException;
            
            public final class IIOlo1Ili0 extends FilterInputStream {
                public IIOlo1Ili0(BufferedInputStream bufferedInputStream) {
/* 1 */             super(bufferedInputStream);
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             if (i2 == 0) {
/* 3 */                 return 0;
                    }
/* 7 */             int iI00000oOI = lOOllo00lO.I00000oOI(((FilterInputStream) this).in, bArr, i, i2);
/* 11 */            if (iI00000oOI > 0) {
/* 13 */                return iI00000oOI;
                    }
/* 14 */            return -1;
                }
            }
