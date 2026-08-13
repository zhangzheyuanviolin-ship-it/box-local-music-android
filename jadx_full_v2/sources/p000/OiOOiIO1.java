            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.Closeable;
            import java.io.IOException;
            
/* 66 */    public final class OiOOiIO1 implements Closeable {
                public final int I00iOIl;
                public OiOOiI1lllOo I00iiI;
                public int I00iio;
                public long I00ilI0I1;
                public byte[] I00ilO0;
                public int I00io1l;
                public long I00iiO = 0;
                public boolean I00ioIO = false;
                public int[] I00l0I0l0lO1 = new int[16];
                public int I00l0OO0IO = 0;

                public OiOOiIO1(OiOOiI1lllOo oiOOiI1lllOo) throws IOException {
/* 19 */            oiOOiI1lllOo.I00000oIO();
/* 22 */            this.I00iiI = oiOOiI1lllOo;
/* 26 */            this.I00iOIl = Barcode.FORMAT_AZTEC;
/* 28 */            I00000oIO();
                }

                public final void I00000oIO() throws IOException {
                    int iNextSetBit;
/* 1 */             int i = this.I00l0OO0IO;
/* 3 */             int i2 = i + 1;
/* 5 */             int[] iArr = this.I00l0I0l0lO1;
/* 9 */             if (i2 >= iArr.length) {
/* 12 */                int length = iArr.length * 2;
/* 15 */                if (length < iArr.length) {
/* 21 */                    if (iArr.length == Integer.MAX_VALUE) {
/* 27 */                        IioIoO10iOiI.I000OOo1O("Maximum buffer size reached.");
/* 30 */                        return;
                            }
/* 23 */                    length = Integer.MAX_VALUE;
                        }
/* 31 */                int[] iArr2 = new int[length];
/* 33 */                System.arraycopy(iArr, 0, iArr2, 0, i);
/* 36 */                this.I00l0I0l0lO1 = iArr2;
                    }
/* 38 */            OiOOiI1lllOo oiOOiI1lllOo = this.I00iiI;
                    synchronized (oiOOiI1lllOo.I00ilI0I1) {
                        try {
/* 45 */                    iNextSetBit = oiOOiI1lllOo.I00ilI0I1.nextSetBit(0);
/* 49 */                    if (iNextSetBit < 0) {
/* 51 */                        oiOOiI1lllOo.I0000Il00O();
/* 56 */                        iNextSetBit = oiOOiI1lllOo.I00ilI0I1.nextSetBit(0);
/* 60 */                        if (iNextSetBit < 0) {
/* 70 */                            throw new IOException("Maximum allowed scratch file memory exceeded.");
                                }
                            }
/* 75 */                    oiOOiI1lllOo.I00ilI0I1.clear(iNextSetBit);
/* 80 */                    if (iNextSetBit >= oiOOiI1lllOo.I00iio) {
/* 84 */                        oiOOiI1lllOo.I00iio = iNextSetBit + 1;
                            }
                        } catch (Throwable th) {
/* 541 */                   throw th;
                        }
                    }
/* 87 */            int[] iArr3 = this.I00l0I0l0lO1;
/* 89 */            int i3 = this.I00l0OO0IO;
/* 91 */            iArr3[i3] = iNextSetBit;
/* 93 */            this.I00iio = i3;
/* 96 */            int i4 = this.I00iOIl;
/* 100 */           this.I00ilI0I1 = i3 * i4;
/* 104 */           this.I00l0OO0IO = i3 + 1;
/* 108 */           this.I00ilO0 = new byte[i4];
/* 110 */           this.I00io1l = 0;
                }

                public final void I0000Il00O() throws IOException {
/* 1 */             OiOOiI1lllOo oiOOiI1lllOo = this.I00iiI;
/* 3 */             if (oiOOiI1lllOo != null) {
/* 5 */                 oiOOiI1lllOo.I00000oIO();
                    } else {
/* 11 */                IioIoO10iOiI.I000OOo1O("Buffer already closed");
                    }
                }

                public final boolean I000II(boolean z) throws IOException {
/* 1 */             int i = this.I00io1l;
/* 4 */             int i2 = this.I00iOIl;
/* 6 */             if (i < i2) {
/* 3 */                 return true;
                    }
/* 11 */            if (this.I00ioIO) {
/* 23 */                this.I00iiI.I000O01llI0(this.I00l0I0l0lO1[this.I00iio], this.I00ilO0);
/* 26 */                this.I00ioIO = false;
                    }
/* 30 */            int i3 = this.I00iio + 1;
/* 33 */            if (i3 >= this.I00l0OO0IO) {
/* 59 */                if (!z) {
/* 10 */                    return false;
                        }
/* 61 */                I00000oIO();
/* 3 */                 return true;
                    }
/* 35 */            OiOOiI1lllOo oiOOiI1lllOo = this.I00iiI;
/* 37 */            int[] iArr = this.I00l0I0l0lO1;
/* 39 */            this.I00iio = i3;
/* 47 */            this.I00ilO0 = oiOOiI1lllOo.I000II(iArr[i3]);
/* 54 */            this.I00ilI0I1 = this.I00iio * i2;
/* 56 */            this.I00io1l = 0;
/* 3 */             return true;
                }

                public final void I000O01llI0(int i) throws IOException {
/* 9 */             I000l1((this.I00ilI0I1 + this.I00io1l) - i);
                }

                public final void I000l1(long j) throws IOException {
/* 1 */             I0000Il00O();
/* 8 */             if (j > this.I00iiO) {
/* 106 */               I000II.I001i1O0Ol();
/* 186 */               return;
                    }
/* 14 */            if (j < 0) {
/* 102 */               IioIoO10iOiI.I000OOo1O(IlIi0I0.I000iOII(j, "Negative seek offset: "));
/* 105 */               return;
                    }
/* 16 */            long j2 = this.I00ilI0I1;
/* 20 */            int i = this.I00iOIl;
/* 22 */            if (j >= j2 && j <= i + j2) {
/* 32 */                this.I00io1l = (int) (j - j2);
/* 34 */                return;
                    }
/* 37 */            if (this.I00ioIO) {
/* 49 */                this.I00iiI.I000O01llI0(this.I00l0I0l0lO1[this.I00iio], this.I00ilO0);
/* 53 */                this.I00ioIO = false;
                    }
                    long j3 = i;
/* 58 */            int i2 = (int) (j / j3);
/* 63 */            if (j % j3 == 0 && j == this.I00iiO) {
                        i2--;
                    }
/* 83 */            this.I00ilO0 = this.I00iiI.I000II(this.I00l0I0l0lO1[i2]);
/* 85 */            this.I00iio = i2;
/* 88 */            long j4 = i2 * j3;
/* 89 */            this.I00ilI0I1 = j4;
/* 93 */            this.I00io1l = (int) (j - j4);
                }

                public final boolean I00l0OO0IO() throws IOException {
/* 1 */             I0000Il00O();
                    return this.I00ilI0I1 + ((long) this.I00io1l) >= this.I00iiO;
                }

                @Override
                public final void close() {
/* 1 */             OiOOiI1lllOo oiOOiI1lllOo = this.I00iiI;
/* 3 */             if (oiOOiI1lllOo != null) {
/* 5 */                 int[] iArr = this.I00l0I0l0lO1;
/* 7 */                 int i = this.I00l0OO0IO;
                        synchronized (oiOOiI1lllOo.I00ilI0I1) {
/* 15 */                    for (int i2 = 0; i2 < i; i2++) {
                                try {
/* 17 */                            int i3 = iArr[i2];
/* 19 */                            if (i3 >= 0 && i3 < oiOOiI1lllOo.I00iio && !oiOOiI1lllOo.I00ilI0I1.get(i3)) {
/* 35 */                                oiOOiI1lllOo.I00ilI0I1.set(i3);
/* 40 */                                if (i3 < oiOOiI1lllOo.I00io1l) {
/* 44 */                                    oiOOiI1lllOo.I00ilO0[i3] = null;
                                        }
                                    }
                                } catch (Throwable th) {
/* 72 */                            throw th;
                                }
                            }
                        }
/* 53 */                this.I00iiI = null;
/* 55 */                this.I00l0I0l0lO1 = null;
/* 57 */                this.I00ilO0 = null;
/* 61 */                this.I00ilI0I1 = 0L;
/* 64 */                this.I00iio = -1;
/* 66 */                this.I00io1l = 0;
/* 68 */                this.I00iiO = 0L;
                    }
                }

                public final void finalize() throws Throwable {
                    try {
/* 1 */                 close();
                    } finally {
/* 9 */                 super.finalize();
                    }
                }

                public final long getPosition() throws IOException {
/* 1 */             I0000Il00O();
/* 9 */             return this.I00ilI0I1 + this.I00io1l;
                }

                public final int peek() throws IOException {
/* 1 */             int i = read();
/* 6 */             if (i != -1) {
/* 9 */                 I000O01llI0(1);
                    }
/* 29 */            return i;
                }

                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             I0000Il00O();
/* 9 */             long j = this.I00ilI0I1 + this.I00io1l;
/* 10 */            long j2 = this.I00iiO;
/* 14 */            if (j >= j2) {
/* 16 */                return -1;
                    }
/* 24 */            int iMin = (int) Math.min(i2, j2 - j);
/* 26 */            int i3 = 0;
/* 27 */            while (iMin > 0) {
/* 33 */                if (!I000II(false)) {
/* 62 */                    IioIoO10iOiI.I000OOo1O("Unexpectedly no bytes available for read in buffer.");
/* 65 */                    return 0;
                        }
/* 40 */                int iMin2 = Math.min(iMin, this.I00iOIl - this.I00io1l);
/* 48 */                System.arraycopy(this.I00ilO0, this.I00io1l, bArr, i, iMin2);
                        this.I00io1l += iMin2;
/* 56 */                i3 += iMin2;
/* 57 */                i += iMin2;
/* 58 */                iMin -= iMin2;
                    }
/* 215 */           return i3;
                }

                public final void write(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             I0000Il00O();
/* 4 */             while (i2 > 0) {
/* 7 */                 I000II(true);
/* 15 */                int iMin = Math.min(i2, this.I00iOIl - this.I00io1l);
/* 23 */                System.arraycopy(bArr, i, this.I00ilO0, this.I00io1l, iMin);
                        this.I00io1l += iMin;
/* 31 */                this.I00ioIO = true;
/* 33 */                i += iMin;
/* 34 */                i2 -= iMin;
                    }
/* 41 */            long j = this.I00ilI0I1 + this.I00io1l;
/* 46 */            if (j > this.I00iiO) {
/* 48 */                this.I00iiO = j;
                    }
                }

/* 67 */        public final int read() throws IOException {
/* 68 */            I0000Il00O();
                    if (this.I00ilI0I1 + this.I00io1l >= this.I00iiO) {
                        return -1;
                    }
/* 70 */            if (I000II(false)) {
/* 71 */                byte[] bArr = this.I00ilO0;
                        int i = this.I00io1l;
                        this.I00io1l = i + 1;
                        return bArr[i] & 255;
                    }
/* 72 */            IioIoO10iOiI.I000OOo1O("Unexpectedly no bytes available for read in buffer.");
                    return 0;
                }
            }
