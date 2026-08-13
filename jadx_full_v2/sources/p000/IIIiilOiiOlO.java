            package p000;

            import java.io.OutputStream;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Iterator;
            
/* 27 */    public final class IIIiilOiiOlO extends OutputStream {
                public ArrayList I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public byte[] I00iio;
                public int I00ilI0I1;

                public final void I00000oIO(int i) {
/* 1 */             int i2 = this.I00iiI;
/* 3 */             ArrayList arrayList = this.I00iOIl;
/* 11 */            if (i2 < arrayList.size() - 1) {
                        this.I00iiO += this.I00iio.length;
/* 23 */                int i3 = this.I00iiI + 1;
/* 25 */                this.I00iiI = i3;
/* 33 */                this.I00iio = (byte[]) arrayList.get(i3);
/* 35 */                return;
                    }
/* 36 */            byte[] bArr = this.I00iio;
/* 38 */            if (bArr == null) {
/* 41 */                this.I00iiO = 0;
                    } else {
/* 50 */                i = Math.max(bArr.length << 1, i - this.I00iiO);
                        this.I00iiO += this.I00iio.length;
                    }
                    this.I00iiI++;
/* 68 */            byte[] bArr2 = IoOlilOO.I00000oIO;
/* 70 */            byte[] bArr3 = new byte[i];
/* 72 */            this.I00iio = bArr3;
/* 74 */            arrayList.add(bArr3);
                }

                public final synchronized byte[] I0000Il00O() {
                    byte[] bArr;
/* 2 */             int i = this.I00ilI0I1;
/* 4 */             if (i == 0) {
/* 6 */                 bArr = IoOlilOO.I00000oIO;
                    } else {
/* 9 */                 byte[] bArr2 = IoOlilOO.I00000oIO;
/* 11 */                byte[] bArr3 = new byte[i];
/* 15 */                Iterator it = this.I00iOIl.iterator();
/* 20 */                int i2 = 0;
/* 25 */                while (it.hasNext()) {
/* 31 */                    byte[] bArr4 = (byte[]) it.next();
/* 34 */                    int iMin = Math.min(bArr4.length, i);
/* 38 */                    System.arraycopy(bArr4, 0, bArr3, i2, iMin);
/* 41 */                    i2 += iMin;
/* 42 */                    i -= iMin;
/* 43 */                    if (i == 0) {
                                break;
                            }
                        }
/* 45 */                bArr = bArr3;
                    }
/* 47 */            return bArr;
                }

                public final String toString() {
/* 11 */            return new String(I0000Il00O(), Charset.defaultCharset());
                }

                @Override
                public final void write(byte[] bArr, int i, int i2) {
                    int i3;
/* 1 */             if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
/* 57 */                OoOil11Ol1o.I001i1lo1io();
/* 215 */               return;
                    }
/* 14 */            if (i2 == 0) {
/* 16 */                return;
                    }
                    synchronized (this) {
/* 18 */                int i4 = this.I00ilI0I1;
/* 20 */                int i5 = i4 + i2;
/* 24 */                int i6 = i4 - this.I00iiO;
/* 25 */                while (i2 > 0) {
/* 31 */                    int iMin = Math.min(i2, this.I00iio.length - i6);
/* 39 */                    System.arraycopy(bArr, i3 - i2, this.I00iio, i6, iMin);
/* 42 */                    i2 -= iMin;
/* 43 */                    if (i2 > 0) {
/* 45 */                        I00000oIO(i5);
/* 48 */                        i6 = 0;
                            }
                        }
/* 50 */                this.I00ilI0I1 = i5;
                    }
                }

                @Override
/* 28 */        public final void close() {
                }

                @Override
/* 60 */        public final synchronized void write(int i) {
/* 61 */            int i2 = this.I00ilI0I1;
                    int i3 = i2 - this.I00iiO;
/* 62 */            if (i3 == this.I00iio.length) {
/* 63 */                I00000oIO(i2 + 1);
                        i3 = 0;
                    }
/* 64 */            this.I00iio[i3] = (byte) i;
                    this.I00ilI0I1++;
                }
            }
