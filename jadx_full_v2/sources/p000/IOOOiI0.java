            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.OutputStream;
            
            public final class IOOOiI0 {
                public static final boolean I0001Ioi1lo = Ooil1O.I0000oI00;
                public Oi1ol0llI I00000oIO;
                public byte[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public OutputStream I0000oI00;

                public static int I0001Ioi1lo(int i, IIO1i00loOo iIO1i00loOo) {
/* 1 */             int iI000II = I000II(i);
/* 5 */             int size = iIO1i00loOo.size();
/* 14 */            return I000O01llI0(size) + size + iI000II;
                }

                public static int I000II(int i) {
/* 3 */             return I000O01llI0(i << 3);
                }

                public static int I000O01llI0(int i) {
/* 9 */             return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
                }

                public static int I000OOo1O(long j) {
/* 9 */             return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
                }

                public final void I00000oIO(int i) {
/* 1 */             int i2 = this.I0000O;
/* 3 */             byte[] bArr = this.I00000oOI;
/* 8 */             bArr[i2] = (byte) i;
/* 15 */            bArr[i2 + 1] = (byte) (i >> 8);
/* 22 */            bArr[i2 + 2] = (byte) (i >> 16);
/* 29 */            bArr[i2 + 3] = (byte) (i >> 24);
/* 31 */            this.I0000O = i2 + 4;
                }

                public final void I00000oOI(long j) {
/* 1 */             int i = this.I0000O;
/* 3 */             byte[] bArr = this.I00000oOI;
/* 9 */             bArr[i] = (byte) j;
/* 19 */            bArr[i + 1] = (byte) (j >> 8);
/* 29 */            bArr[i + 2] = (byte) (j >> 16);
/* 39 */            bArr[i + 3] = (byte) (j >> 24);
/* 49 */            bArr[i + 4] = (byte) (j >> 32);
/* 59 */            bArr[i + 5] = (byte) (j >> 40);
/* 69 */            bArr[i + 6] = (byte) (j >> 48);
/* 77 */            bArr[i + 7] = (byte) (j >> 56);
/* 79 */            this.I0000O = i + 8;
                }

                public final void I0000Il00O(int i, int i2) {
/* 4 */             I0000O((i << 3) | i2);
                }

                public final void I0000O(int i) {
/* 1 */             byte[] bArr = this.I00000oOI;
/* 5 */             if (I0001Ioi1lo) {
                        while (true) {
/* 7 */                     int i2 = i & (-128);
/* 9 */                     int i3 = this.I0000O;
/* 11 */                    if (i2 == 0) {
/* 15 */                        this.I0000O = i3 + 1;
/* 19 */                        Ooil1O.I000l1(bArr, i3, (byte) i);
/* 22 */                        return;
                            } else {
/* 25 */                        this.I0000O = i3 + 1;
/* 31 */                        Ooil1O.I000l1(bArr, i3, (byte) (i | Barcode.FORMAT_ITF));
/* 34 */                        i >>>= 7;
                            }
                        }
                    } else {
                        while (true) {
/* 37 */                    int i4 = i & (-128);
/* 39 */                    int i5 = this.I0000O;
/* 41 */                    if (i4 == 0) {
/* 45 */                        this.I0000O = i5 + 1;
/* 48 */                        bArr[i5] = (byte) i;
/* 50 */                        return;
                            } else {
/* 53 */                        this.I0000O = i5 + 1;
/* 58 */                        bArr[i5] = (byte) (i | Barcode.FORMAT_ITF);
/* 60 */                        i >>>= 7;
                            }
                        }
                    }
                }

                public final void I0000oI00(long j) {
/* 1 */             byte[] bArr = this.I00000oOI;
/* 10 */            if (I0001Ioi1lo) {
                        while (true) {
/* 12 */                    long j2 = j & (-128);
/* 16 */                    int i = this.I0000O;
/* 18 */                    if (j2 == 0) {
/* 22 */                        this.I0000O = i + 1;
/* 27 */                        Ooil1O.I000l1(bArr, i, (byte) j);
/* 30 */                        return;
                            } else {
/* 33 */                        this.I0000O = i + 1;
/* 40 */                        Ooil1O.I000l1(bArr, i, (byte) (((int) j) | Barcode.FORMAT_ITF));
/* 43 */                        j >>>= 7;
                            }
                        }
                    } else {
                        while (true) {
/* 45 */                    long j3 = j & (-128);
/* 49 */                    int i2 = this.I0000O;
/* 51 */                    if (j3 == 0) {
/* 55 */                        this.I0000O = i2 + 1;
/* 59 */                        bArr[i2] = (byte) j;
/* 61 */                        return;
                            } else {
/* 64 */                        this.I0000O = i2 + 1;
/* 70 */                        bArr[i2] = (byte) (((int) j) | Barcode.FORMAT_ITF);
/* 72 */                        j >>>= 7;
                            }
                        }
                    }
                }

                public final void I000OiO() {
/* 8 */             this.I0000oI00.write(this.I00000oOI, 0, this.I0000O);
/* 11 */            this.I0000O = 0;
                }

                public final void I000iOII(int i) {
/* 6 */             if (this.I0000Il00O - this.I0000O < i) {
/* 8 */                 I000OiO();
                    }
                }

                public final void I000l1(byte b) {
/* 5 */             if (this.I0000O == this.I0000Il00O) {
/* 7 */                 I000OiO();
                    }
/* 10 */            int i = this.I0000O;
/* 14 */            this.I00000oOI[i] = b;
/* 18 */            this.I0000O = i + 1;
                }

                public final void I000lI(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = this.I0000Il00O;
/* 3 */             int i4 = this.I0000O;
/* 5 */             int i5 = i3 - i4;
/* 7 */             byte[] bArr2 = this.I00000oOI;
/* 9 */             if (i5 >= i2) {
/* 11 */                System.arraycopy(bArr, i, bArr2, i4, i2);
                        this.I0000O += i2;
/* 19 */                return;
                    }
/* 20 */            System.arraycopy(bArr, i, bArr2, i4, i5);
/* 23 */            int i6 = i + i5;
/* 24 */            int i7 = i2 - i5;
/* 25 */            this.I0000O = i3;
/* 27 */            I000OiO();
/* 30 */            if (i7 > i3) {
/* 41 */                this.I0000oI00.write(bArr, i6, i7);
                    } else {
/* 33 */                System.arraycopy(bArr, i6, bArr2, 0, i7);
/* 36 */                this.I0000O = i7;
                    }
                }

                public final void I000o00OoI0I(int i, boolean z) {
/* 3 */             I000iOII(11);
/* 7 */             I0000Il00O(i, 0);
/* 10 */            byte b = z ? (byte) 1 : (byte) 0;
/* 11 */            int i2 = this.I0000O;
/* 15 */            this.I00000oOI[i2] = b;
/* 19 */            this.I0000O = i2 + 1;
                }

                public final void I000oI1ioi(int i, IIO1i00loOo iIO1i00loOo) {
/* 2 */             I001l0I00(i, 2);
/* 5 */             I00100l0(iIO1i00loOo);
                }

                public final void I00100l0(IIO1i00loOo iIO1i00loOo) {
/* 5 */             I001lllioOl(iIO1i00loOo.size());
/* 8 */             iIO1i00loOo.I000o00OoI0I(this);
                }

                public final void I00100o1O0lo(int i, int i2) {
/* 3 */             I000iOII(14);
/* 7 */             I0000Il00O(i, 5);
/* 10 */            I00000oIO(i2);
                }

                public final void I0010I0i(int i) {
/* 2 */             I000iOII(4);
/* 5 */             I00000oIO(i);
                }

                public final void I0010o(int i, long j) {
/* 3 */             I000iOII(18);
/* 7 */             I0000Il00O(i, 1);
/* 10 */            I00000oOI(j);
                }

                public final void I00111O(long j) {
/* 3 */             I000iOII(8);
/* 6 */             I00000oOI(j);
                }

                public final void I001IIilI0O(int i, int i2) {
/* 3 */             I000iOII(20);
/* 7 */             I0000Il00O(i, 0);
/* 10 */            if (i2 >= 0) {
/* 12 */                I0000O(i2);
                    } else {
/* 17 */                I0000oI00(i2);
                    }
                }

                public final void I001IO000(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 I001lllioOl(i);
                    } else {
/* 8 */                 I00II0Ol1O0l(i);
                    }
                }

                public final void I001i1O0Ol(byte[] bArr, int i, int i2) {
/* 1 */             I000lI(bArr, i, i2);
                }

                public final void I001i1lo1io(int i, String str) throws IOException, Oolio0o0olIO {
/* 2 */             I001l0I00(i, 2);
/* 5 */             I001iOo1i0O(str);
                }

                public final void I001iOo1i0O(String str) throws IOException, Oolio0o0olIO {
/* 1 */             byte[] bArr = this.I00000oOI;
/* 7 */             int length = str.length() * 3;
/* 9 */             int iI000O01llI0 = I000O01llI0(length);
/* 13 */            int i = iI000O01llI0 + length;
/* 15 */            int i2 = this.I0000Il00O;
/* 17 */            if (i > i2) {
/* 19 */                byte[] bArr2 = new byte[length];
/* 24 */                int iI00000oOI = Ooll0110oo.I00000oIO.I00000oOI(str, bArr2, 0, length);
/* 28 */                I001lllioOl(iI00000oOI);
/* 31 */                I000lI(bArr2, 0, iI00000oOI);
/* 34 */                return;
                    }
/* 39 */            if (i > i2 - this.I0000O) {
/* 41 */                I000OiO();
                    }
/* 48 */            int iI000O01llI02 = I000O01llI0(str.length());
/* 52 */            int i3 = this.I0000O;
                    try {
/* 54 */                if (iI000O01llI02 == iI000O01llI0) {
/* 56 */                    int i4 = i3 + iI000O01llI02;
/* 58 */                    this.I0000O = i4;
/* 63 */                    int iI00000oOI2 = Ooll0110oo.I00000oIO.I00000oOI(str, bArr, i4, i2 - i4);
/* 67 */                    this.I0000O = i3;
/* 72 */                    I0000O((iI00000oOI2 - i3) - iI000O01llI02);
/* 75 */                    this.I0000O = iI00000oOI2;
                        } else {
/* 78 */                    int iI00000oIO = Ooll0110oo.I00000oIO(str);
/* 82 */                    I0000O(iI00000oIO);
/* 93 */                    this.I0000O = Ooll0110oo.I00000oIO.I00000oOI(str, bArr, this.I0000O, iI00000oIO);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
/* 186 */               throw new IOO1IOl1O10((IndexOutOfBoundsException) e);
                    }
                }

                public final void I001l0I00(int i, int i2) {
/* 4 */             I001lllioOl((i << 3) | i2);
                }

                public final void I001lIiIIo1O(int i, int i2) {
/* 3 */             I000iOII(20);
/* 7 */             I0000Il00O(i, 0);
/* 10 */            I0000O(i2);
                }

                public final void I001lllioOl(int i) {
/* 2 */             I000iOII(5);
/* 5 */             I0000O(i);
                }

                public final void I001lloI(int i, long j) {
/* 3 */             I000iOII(20);
/* 7 */             I0000Il00O(i, 0);
/* 10 */            I0000oI00(j);
                }

                public final void I00II0Ol1O0l(long j) {
/* 3 */             I000iOII(10);
/* 6 */             I0000oI00(j);
                }
            }
