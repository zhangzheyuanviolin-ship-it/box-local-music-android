            package p000;

            import java.io.OutputStream;
            import java.util.ArrayList;
            import java.util.Iterator;
            
/* 41 */    public final class IIOI0o10 extends OutputStream {
                public static final byte[] I00ilO0 = new byte[0];
                public int I00iOIl;
                public ArrayList I00iiI;
                public int I00iiO;
                public byte[] I00iio;
                public int I00ilI0I1;

                public final void I00000oIO(int i) {
/* 10 */            this.I00iiI.add(new O1101ooIo0l(this.I00iio));
/* 18 */            int length = this.I00iiO + this.I00iio.length;
/* 19 */            this.I00iiO = length;
/* 35 */            this.I00iio = new byte[Math.max(this.I00iOIl, Math.max(i, length >>> 1))];
/* 38 */            this.I00ilI0I1 = 0;
                }

                public final void I0000Il00O() {
/* 1 */             ArrayList arrayList = this.I00iiI;
/* 3 */             int i = this.I00ilI0I1;
/* 5 */             byte[] bArr = this.I00iio;
/* 9 */             if (i >= bArr.length) {
/* 39 */                arrayList.add(new O1101ooIo0l(this.I00iio));
/* 44 */                this.I00iio = I00ilO0;
                    } else if (i > 0) {
/* 13 */                byte[] bArr2 = new byte[i];
/* 20 */                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
/* 28 */                arrayList.add(new O1101ooIo0l(bArr2));
                    }
                    this.I00iiO += this.I00ilI0I1;
/* 53 */            this.I00ilI0I1 = 0;
                }

                public final synchronized IIOII1 I000II() {
                    ArrayList arrayList;
/* 2 */             I0000Il00O();
/* 5 */             arrayList = this.I00iiI;
/* 7 */             if (arrayList == null) {
/* 11 */                ArrayList arrayList2 = new ArrayList();
/* 14 */                Iterator it = arrayList.iterator();
/* 22 */                while (it.hasNext()) {
/* 30 */                    arrayList2.add((IIOII1) it.next());
                        }
/* 34 */                arrayList = arrayList2;
                    }
/* 52 */            return arrayList.isEmpty() ? IIOII1.I00iOIl : IIOII1.I00000oOI(arrayList.iterator(), arrayList.size());
                }

                public final String toString() {
                    int i;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
                    synchronized (this) {
/* 16 */                i = this.I00iiO + this.I00ilI0I1;
                    }
/* 26 */            return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
                }

                @Override
                public final synchronized void write(byte[] bArr, int i, int i2) {
                    try {
/* 2 */                 byte[] bArr2 = this.I00iio;
/* 4 */                 int length = bArr2.length;
/* 5 */                 int i3 = this.I00ilI0I1;
/* 8 */                 if (i2 <= length - i3) {
/* 10 */                    System.arraycopy(bArr, i, bArr2, i3, i2);
                            this.I00ilI0I1 += i2;
                        } else {
/* 22 */                    int length2 = bArr2.length - i3;
/* 23 */                    System.arraycopy(bArr, i, bArr2, i3, length2);
/* 27 */                    int i4 = i2 - length2;
/* 28 */                    I00000oIO(i4);
/* 34 */                    System.arraycopy(bArr, i + length2, this.I00iio, 0, i4);
/* 37 */                    this.I00ilI0I1 = i4;
                        }
                    } catch (Throwable th) {
/* 215 */               throw th;
                    }
                }

                @Override
/* 42 */        public final synchronized void write(int i) {
                    try {
/* 43 */                if (this.I00ilI0I1 == this.I00iio.length) {
/* 44 */                    I00000oIO(1);
                        }
/* 45 */                byte[] bArr = this.I00iio;
                        int i2 = this.I00ilI0I1;
                        this.I00ilI0I1 = i2 + 1;
                        bArr[i2] = (byte) i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
