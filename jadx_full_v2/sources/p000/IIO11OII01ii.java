            package p000;

            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            
/* 30 */    public final class IIO11OII01ii extends FilterInputStream {
                public long I00iOIl;
                public long I00iiI;

                public IIO11OII01ii(InputStream inputStream) {
/* 1 */             super(inputStream);
/* 6 */             this.I00iiI = -1L;
/* 11 */            this.I00iOIl = 1048577L;
                }

                @Override
                public final int available() {
/* 14 */            return (int) Math.min(((FilterInputStream) this).in.available(), this.I00iOIl);
                }

                @Override
                public final synchronized void mark(int i) {
/* 4 */             ((FilterInputStream) this).in.mark(i);
/* 9 */             this.I00iiI = this.I00iOIl;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             long j = this.I00iOIl;
/* 8 */             if (j == 0) {
/* 7 */                 return -1;
                    }
/* 19 */            int i3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
/* 23 */            if (i3 != -1) {
                        this.I00iOIl -= i3;
                    }
/* 215 */           return i3;
                }

                @Override
                public final synchronized void reset() {
/* 8 */             if (!((FilterInputStream) this).in.markSupported()) {
/* 46 */                throw new IOException("Mark not supported");
                    }
/* 16 */            if (this.I00iiI == -1) {
/* 38 */                throw new IOException("Mark not set");
                    }
/* 20 */            ((FilterInputStream) this).in.reset();
/* 25 */            this.I00iOIl = this.I00iiI;
                }

                @Override
                public final long skip(long j) throws IOException {
/* 9 */             long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.I00iOIl));
                    this.I00iOIl -= jSkip;
/* 49 */            return jSkip;
                }

                @Override
/* 31 */        public final int read() throws IOException {
                    if (this.I00iOIl == 0) {
                        return -1;
                    }
/* 33 */            int i = ((FilterInputStream) this).in.read();
                    if (i != -1) {
                        this.I00iOIl--;
                    }
                    return i;
                }
            }
