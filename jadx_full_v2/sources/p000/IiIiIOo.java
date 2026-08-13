            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            
/* 37 */    public final class IiIiIOo extends O0olI000 {
                public static final byte[] I00ilI0I1 = new byte[0];
                public final int I00iiO;
                public int I00iio;

                public IiIiIOo(InputStream inputStream, int i, int i2) {
/* 1 */             super(inputStream, i2);
/* 4 */             if (i <= 0) {
/* 6 */                 if (i < 0) {
/* 14 */                    I000II.I000iOII("negative lengths not allowed");
/* 18 */                    throw null;
                        }
/* 8 */                 I00000oIO();
                    }
/* 19 */            this.I00iiO = i;
/* 21 */            this.I00iio = i;
                }

                public final byte[] I0000Il00O() {
/* 1 */             int i = this.I00iio;
/* 3 */             if (i == 0) {
/* 5 */                 return I00ilI0I1;
                    }
/* 8 */             int i2 = this.I00iiI;
/* 10 */            if (i >= i2) {
/* 113 */               throw new IOException("corrupted stream - out of bounds length found: " + this.I00iio + " >= " + i2);
                    }
/* 12 */            byte[] bArr = new byte[i];
/* 21 */            int iI00000oOI = i - lOOllo00lO.I00000oOI(this.I00iOIl, bArr, 0, i);
/* 22 */            this.I00iio = iI00000oOI;
/* 24 */            if (iI00000oOI == 0) {
/* 26 */                I00000oIO();
/* 29 */                return bArr;
                    }
/* 34 */            I000II.I0001Ioi1lo(this.I00iiO, this.I00iio);
/* 37 */            return null;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = this.I00iio;
/* 3 */             if (i3 == 0) {
/* 5 */                 return -1;
                    }
/* 13 */            int i4 = this.I00iOIl.read(bArr, i, Math.min(i2, i3));
/* 17 */            if (i4 < 0) {
/* 34 */                I000II.I0001Ioi1lo(this.I00iiO, this.I00iio);
/* 37 */                return 0;
                    }
/* 21 */            int i5 = this.I00iio - i4;
/* 22 */            this.I00iio = i5;
/* 24 */            if (i5 == 0) {
/* 26 */                I00000oIO();
                    }
/* 29 */            return i4;
                }

                @Override
/* 38 */        public final int read() throws IOException {
/* 39 */            if (this.I00iio == 0) {
                        return -1;
                    }
                    int i = this.I00iOIl.read();
                    if (i < 0) {
                        I000II.I0001Ioi1lo(this.I00iiO, this.I00iio);
                        return 0;
                    }
                    int i2 = this.I00iio - 1;
                    this.I00iio = i2;
                    if (i2 == 0) {
                        I00000oIO();
                    }
                    return i;
                }
            }
