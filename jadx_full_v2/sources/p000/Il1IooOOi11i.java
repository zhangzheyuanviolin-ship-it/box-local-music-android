            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            
/* 12 */    public final class Il1IooOOi11i extends InputStream {
                public InputStream I00iOIl;
                public int I00iiI;

                @Override
                public final int available() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final void close() throws IOException {
/* 3 */             this.I00iOIl.close();
                }

                @Override
                public final int read() throws IOException {
/* 3 */             int i = this.I00iOIl.read();
/* 8 */             if (i == -1) {
/* 11 */                this.I00iiI = 0;
                    }
/* 20 */            return i;
                }

                @Override
                public final long skip(long j) {
/* 3 */             return this.I00iOIl.skip(j);
                }

                @Override
/* 13 */        public final int read(byte[] bArr) throws IOException {
/* 14 */            int i = this.I00iOIl.read(bArr);
                    if (i == -1) {
/* 15 */                this.I00iiI = 0;
                    }
                    return i;
                }

                @Override
/* 15 */        public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 16 */            int i3 = this.I00iOIl.read(bArr, i, i2);
                    if (i3 == -1) {
/* 17 */                this.I00iiI = 0;
                    }
                    return i3;
                }
            }
