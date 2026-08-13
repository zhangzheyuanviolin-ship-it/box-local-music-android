            package p000;

            import java.io.IOException;
            import java.io.RandomAccessFile;
            
/* 55 */    public final class IIIIiiioo extends RandomAccessFile {
                public byte[] I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public long I00iio;

                @Override
                public final long getFilePointer() {
/* 10 */            return (this.I00iio - this.I00iiI) + this.I00iiO;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             byte[] bArr2 = this.I00iOIl;
/* 4 */             int i3 = 0;
                    while (true) {
/* 5 */                 int i4 = this.I00iiI;
/* 7 */                 int i5 = this.I00iiO;
/* 9 */                 int i6 = i4 - i5;
/* 10 */                if (i2 <= i6) {
/* 12 */                    System.arraycopy(bArr2, i5, bArr, i, i2);
                            this.I00iiO += i2;
/* 20 */                    return i3 + i2;
                        }
/* 22 */                System.arraycopy(bArr2, i5, bArr, i, i6);
/* 25 */                i3 += i6;
                        this.I00iiO += i6;
/* 31 */                int i7 = read(bArr2);
/* 35 */                if (i7 >= 0) {
                            this.I00iio += i7;
/* 43 */                    this.I00iiI = i7;
/* 45 */                    this.I00iiO = 0;
                        }
/* 47 */                if (i7 <= 0) {
/* 52 */                    if (i3 == 0) {
/* 54 */                        return -1;
                            }
/* 215 */                   return i3;
                        }
/* 49 */                i += i6;
/* 50 */                i2 -= i6;
                    }
                }

                @Override
                public final void seek(long j) throws IOException {
                    int i;
/* 4 */             int i2 = (int) (this.I00iio - j);
/* 5 */             if (i2 >= 0 && i2 <= (i = this.I00iiI)) {
/* 12 */                this.I00iiO = i - i2;
/* 14 */                return;
                    }
/* 15 */            super.seek(j);
/* 19 */            this.I00iiI = 0;
/* 21 */            this.I00iiO = 0;
/* 27 */            this.I00iio = super.getFilePointer();
                }

                @Override
/* 56 */        public final int read() throws IOException {
/* 57 */            byte[] bArr = this.I00iOIl;
                    if (this.I00iiO >= this.I00iiI) {
/* 58 */                int i = read(bArr);
                        if (i >= 0) {
                            this.I00iio += i;
/* 60 */                    this.I00iiI = i;
/* 61 */                    this.I00iiO = 0;
                        }
                        if (i < 0) {
                            return -1;
                        }
                    }
/* 62 */            if (this.I00iiI == 0) {
                        return -1;
                    }
/* 63 */            int i2 = this.I00iiO;
                    this.I00iiO = i2 + 1;
                    return (bArr[i2] + 256) & 255;
                }
            }
