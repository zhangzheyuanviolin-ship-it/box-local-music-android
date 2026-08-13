            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.EOFException;
            import java.io.IOException;
            
/* 25 */    public final class O1ilII extends IoiOloi {
                public byte[] I00iOIl;
                public int I00iiI;

                @Override
                public final long I000II() {
/* 3 */             return this.I00iiI;
                }

                @Override
                public final long I000l1() {
/* 4 */             return this.I00iOIl.length;
                }

                @Override
                public final long I00IOO() {
/* 20 */            return (I00ioIO() << 32) + (I00ioIO() & 4294967295L);
                }

                @Override
                public final short I00IioO0OiOi() throws EOFException {
/* 1 */             int i = read();
/* 5 */             int i2 = read();
/* 11 */            if ((i | i2) >= 0) {
/* 16 */                return (short) ((i << 8) + i2);
                    }
/* 18 */            I000II.I001i1O0Ol();
/* 21 */            return (short) 0;
                }

                @Override
                public final int I00OIl() throws EOFException {
/* 1 */             int i = read();
/* 5 */             int i2 = read();
/* 11 */            if ((i | i2) >= 0) {
/* 15 */                return (i << 8) + i2;
                    }
/* 17 */            I000II.I001i1O0Ol();
/* 20 */            return 0;
                }

                @Override
                public final void I00Ol00(long j) throws IOException {
/* 5 */             if (j < 0 || j > 2147483647L) {
/* 24 */                IioIoO10iOiI.I000OOo1O(IlIi0I0.I000iOII(j, "Illegal seek position: "));
                    } else {
/* 15 */                this.I00iiI = (int) j;
                    }
                }

                public final int I00ioIO() throws EOFException {
/* 1 */             int i = read();
/* 5 */             int i2 = read();
/* 9 */             int i3 = read();
/* 13 */            int i4 = read();
/* 21 */            if ((i | i2 | i3 | i4) >= 0) {
/* 31 */                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
                    }
/* 33 */            I000II.I001i1O0Ol();
/* 36 */            return 0;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) {
/* 1 */             int i3 = this.I00iiI;
/* 3 */             byte[] bArr2 = this.I00iOIl;
/* 6 */             if (i3 >= bArr2.length) {
/* 25 */                return -1;
                    }
/* 10 */            int iMin = Math.min(i2, bArr2.length - i3);
/* 16 */            System.arraycopy(bArr2, this.I00iiI, bArr, i, iMin);
                    this.I00iiI += iMin;
/* 24 */            return iMin;
                }

                @Override
/* 26 */        public final int read() {
/* 27 */            int i = this.I00iiI;
                    byte[] bArr = this.I00iOIl;
                    if (i >= bArr.length) {
                        return -1;
                    }
/* 28 */            byte b = bArr[i];
/* 29 */            this.I00iiI = i + 1;
/* 30 */            return (b + 256) % Barcode.FORMAT_QR_CODE;
                }

                @Override
/* 28 */        public final void close() {
                }
            }
