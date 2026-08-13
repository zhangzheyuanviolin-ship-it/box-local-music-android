            package p000;

            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            
/* 34 */    public final class II1Ool extends OOiO0OIilloO {
                public long I00iiI;
                public long I00iiO;
                public long I00iio;
                public boolean I00ilI0I1;

                public II1Ool(InputStream inputStream, long j) {
/* 2 */             super(inputStream, false);
/* 7 */             this.I00iiI = 0L;
/* 9 */             this.I00iio = j;
/* 12 */            this.I00ilI0I1 = false;
                }

                @Override
                public final synchronized void I00000oIO(int i) {
/* 3 */             if (i != -1) {
                        this.I00iiI += i;
                    }
                }

                public final synchronized long I0000Il00O() {
/* 2 */             return this.I00iiI;
                }

                public final boolean I000II() {
/* 1 */             long j = this.I00iio;
                    return j >= 0 && I0000Il00O() >= j;
                }

                @Override
                public final int available() {
/* 5 */             if (!I000II()) {
/* 14 */                return ((FilterInputStream) this).in.available();
                    }
/* 7 */             I0000Il00O();
/* 10 */            return 0;
                }

                @Override
                public final void close() throws IOException {
/* 3 */             if (this.I00ilI0I1) {
/* 7 */                 ((FilterInputStream) this).in.close();
                    }
                }

                @Override
                public final synchronized void mark(int i) {
/* 4 */             ((FilterInputStream) this).in.mark(i);
/* 9 */             this.I00iiO = this.I00iiI;
                }

                @Override
                public final boolean markSupported() {
/* 3 */             return ((FilterInputStream) this).in.markSupported();
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) {
/* 5 */             if (I000II()) {
/* 7 */                 I0000Il00O();
/* 10 */                return -1;
                    }
                    long jMin = i2;
/* 13 */            long j = this.I00iio;
/* 19 */            if (j >= 0) {
/* 26 */                jMin = Math.min(jMin, j - I0000Il00O());
                    }
/* 31 */            return super.read(bArr, i, (int) jMin);
                }

                @Override
                public final synchronized void reset() {
/* 4 */             ((FilterInputStream) this).in.reset();
/* 9 */             this.I00iiI = this.I00iiO;
                }

                @Override
                public final synchronized long skip(long j) {
                    long jSkip;
/* 2 */             long j2 = this.I00iio;
/* 8 */             if (j2 >= 0) {
/* 15 */                j = Math.min(j, j2 - I0000Il00O());
                    }
/* 21 */            jSkip = ((FilterInputStream) this).in.skip(j);
                    this.I00iiI += jSkip;
/* 31 */            return jSkip;
                }

                public final String toString() {
/* 3 */             return ((FilterInputStream) this).in.toString();
                }

                @Override
/* 35 */        public final int read(byte[] bArr) {
/* 36 */            return read(bArr, 0, bArr.length);
                }

                @Override
/* 36 */        public final int read() {
/* 37 */            if (I000II()) {
/* 38 */                I0000Il00O();
                        return -1;
                    }
/* 39 */            return super.read();
                }
            }
