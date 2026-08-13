            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            import java.io.PushbackInputStream;
            
/* 15 */    public final class Ioo011Oi implements OilOll {
                public final PushbackInputStream I00iOIl;
                public int I00iiI = 0;

                public Ioo011Oi(InputStream inputStream) {
/* 11 */            this.I00iOIl = new PushbackInputStream(inputStream, 32767);
                }

                @Override
                public final void I001lIiIIo1O(int i, byte[] bArr) throws IOException {
/* 4 */             this.I00iOIl.unread(bArr, 0, i);
                    this.I00iiI -= i;
                }

                @Override
                public final void I00ilO0(int i) throws IOException {
/* 3 */             this.I00iOIl.unread(i);
                    this.I00iiI--;
                }

                @Override
                public final byte[] I00io1l(int i) throws IOException {
/* 1 */             byte[] bArr = new byte[i];
/* 3 */             int i2 = 0;
/* 13 */            do {
/* 6 */                 int i3 = read(bArr, i2, i - i2);
/* 10 */                if (i3 < 0) {
/* 16 */                    I000II.I001i1O0Ol();
/* 19 */                    return null;
                        }
/* 12 */                i2 += i3;
/* 13 */            } while (i2 < i);
/* 15 */            return bArr;
                }

                @Override
                public final boolean I00l0OO0IO() {
                    return peek() == -1;
                }

                @Override
                public final void I00oIiI10(byte[] bArr) throws IOException {
/* 3 */             this.I00iOIl.unread(bArr);
                    this.I00iiI -= bArr.length;
                }

                @Override
                public final void close() throws IOException {
/* 3 */             this.I00iOIl.close();
                }

                @Override
                public final long getPosition() {
/* 3 */             return this.I00iiI;
                }

                @Override
                public final int peek() throws IOException {
/* 1 */             PushbackInputStream pushbackInputStream = this.I00iOIl;
/* 3 */             int i = pushbackInputStream.read();
/* 8 */             if (i != -1) {
/* 10 */                pushbackInputStream.unread(i);
                    }
/* 29 */            return i;
                }

                @Override
                public final int read(byte[] bArr) throws IOException {
/* 3 */             int i = this.I00iOIl.read(bArr);
/* 7 */             if (i <= 0) {
/* 15 */                return -1;
                    }
                    this.I00iiI += i;
/* 14 */            return i;
                }

                @Override
/* 16 */        public final int read() throws IOException {
/* 17 */            int i = this.I00iOIl.read();
                    this.I00iiI++;
                    return i;
                }

                @Override
/* 18 */        public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 19 */            int i3 = this.I00iOIl.read(bArr, i, i2);
                    if (i3 <= 0) {
                        return -1;
                    }
                    this.I00iiI += i3;
                    return i3;
                }
            }
