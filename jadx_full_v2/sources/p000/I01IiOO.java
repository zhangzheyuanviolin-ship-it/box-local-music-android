            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.FilterInputStream;
            import java.io.IOException;
            
/* 21 */    public final class I01IiOO extends FilterInputStream {
                public int I00iOIl;

                public I01IiOO(ByteArrayInputStream byteArrayInputStream, int i) {
/* 1 */             super(byteArrayInputStream);
/* 4 */             this.I00iOIl = i;
                }

                @Override
                public final int available() {
/* 7 */             return Math.min(super.available(), this.I00iOIl);
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = this.I00iOIl;
/* 3 */             if (i3 <= 0) {
/* 5 */                 return -1;
                    }
/* 11 */            int i4 = super.read(bArr, i, Math.min(i2, i3));
/* 15 */            if (i4 >= 0) {
                        this.I00iOIl -= i4;
                    }
/* 215 */           return i4;
                }

                @Override
                public final long skip(long j) throws IOException {
/* 8 */             long jSkip = super.skip(Math.min(j, this.I00iOIl));
/* 16 */            if (jSkip >= 0) {
/* 23 */                this.I00iOIl = (int) (this.I00iOIl - jSkip);
                    }
/* 49 */            return jSkip;
                }

                @Override
/* 22 */        public final int read() throws IOException {
/* 23 */            if (this.I00iOIl <= 0) {
                        return -1;
                    }
/* 24 */            int i = super.read();
                    if (i >= 0) {
                        this.I00iOIl--;
                    }
                    return i;
                }
            }
