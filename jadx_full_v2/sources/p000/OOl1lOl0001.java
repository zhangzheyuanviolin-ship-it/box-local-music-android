            package p000;

            import java.io.IOException;
            
/* 9 */     public final class OOl1lOl0001 implements OilOll {
                public OiOOiIO1 I00iOIl;

                @Override
                public final void I001lIiIIo1O(int i, byte[] bArr) throws IOException {
/* 3 */             this.I00iOIl.I000O01llI0(i);
                }

                @Override
                public final void I00ilO0(int i) throws IOException {
/* 4 */             this.I00iOIl.I000O01llI0(1);
                }

                @Override
                public final byte[] I00io1l(int i) throws IOException {
/* 1 */             OiOOiIO1 oiOOiIO1 = this.I00iOIl;
/* 3 */             byte[] bArr = new byte[i];
/* 5 */             int i2 = 0;
/* 15 */            do {
/* 8 */                 int i3 = oiOOiIO1.read(bArr, i2, i - i2);
/* 12 */                if (i3 < 0) {
/* 18 */                    I000II.I001i1O0Ol();
/* 21 */                    return null;
                        }
/* 14 */                i2 += i3;
/* 15 */            } while (i2 < i);
/* 17 */            return bArr;
                }

                @Override
                public final boolean I00l0OO0IO() {
/* 3 */             return this.I00iOIl.I00l0OO0IO();
                }

                @Override
                public final void I00oIiI10(byte[] bArr) throws IOException {
/* 4 */             this.I00iOIl.I000O01llI0(bArr.length);
                }

                @Override
                public final void close() {
/* 3 */             this.I00iOIl.close();
                }

                @Override
                public final long getPosition() {
/* 3 */             return this.I00iOIl.getPosition();
                }

                @Override
                public final int peek() {
/* 3 */             return this.I00iOIl.peek();
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) {
/* 6 */             return this.I00iOIl.read(bArr, 0, 10);
                }

                @Override
/* 10 */        public final int read(byte[] bArr) {
/* 12 */            return this.I00iOIl.read(bArr, 0, bArr.length);
                }

                @Override
/* 12 */        public final int read() {
/* 13 */            return this.I00iOIl.read();
                }
            }
