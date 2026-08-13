            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            
/* 68 */    public final class Iol0Il extends O0olI000 {
                public int I00iiO;
                public int I00iio;
                public boolean I00ilI0I1;
                public boolean I00ilO0;

                public Iol0Il(InputStream inputStream, int i) throws IOException {
/* 1 */             super(inputStream, i);
/* 5 */             this.I00ilI0I1 = false;
/* 8 */             this.I00ilO0 = true;
/* 14 */            this.I00iiO = inputStream.read();
/* 16 */            int i2 = inputStream.read();
/* 20 */            this.I00iio = i2;
/* 22 */            if (i2 >= 0) {
/* 24 */                I0000Il00O();
                    } else {
/* 28 */                I000II.I001i1O0Ol();
/* 89 */                throw null;
                    }
                }

                public final boolean I0000Il00O() {
/* 3 */             if (!this.I00ilI0I1 && this.I00ilO0 && this.I00iiO == 0 && this.I00iio == 0) {
/* 18 */                this.I00ilI0I1 = true;
/* 20 */                I00000oIO();
                    }
/* 23 */            return this.I00ilI0I1;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 3 */             if (this.I00ilO0 || i2 < 3) {
/* 65 */                return super.read(bArr, i, i2);
                    }
/* 11 */            if (this.I00ilI0I1) {
/* 13 */                return -1;
                    }
/* 19 */            InputStream inputStream = this.I00iOIl;
/* 21 */            int i3 = inputStream.read(bArr, i + 2, i2 - 2);
/* 26 */            if (i3 < 0) {
/* 61 */                I000II.I001i1O0Ol();
/* 25 */                return 0;
                    }
/* 31 */            bArr[i] = (byte) this.I00iiO;
/* 38 */            bArr[i + 1] = (byte) this.I00iio;
/* 44 */            this.I00iiO = inputStream.read();
/* 46 */            int i4 = inputStream.read();
/* 50 */            this.I00iio = i4;
/* 52 */            if (i4 >= 0) {
/* 54 */                return i3 + 2;
                    }
/* 57 */            I000II.I001i1O0Ol();
/* 25 */            return 0;
                }

                @Override
/* 69 */        public final int read() throws IOException {
/* 70 */            if (I0000Il00O()) {
                        return -1;
                    }
                    int i = this.I00iOIl.read();
                    if (i < 0) {
                        I000II.I001i1O0Ol();
                        return 0;
                    }
                    int i2 = this.I00iiO;
                    this.I00iiO = this.I00iio;
                    this.I00iio = i;
                    return i2;
                }
            }
