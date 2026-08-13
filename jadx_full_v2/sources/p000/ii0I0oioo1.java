            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.FileOutputStream;
            import java.io.IOException;
            
            public final class ii0I0oioo1 extends ii0I1Il {
                public byte[] I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public FileOutputStream I000II;

                @Override
                public final void I0000oI00(byte b) {
/* 5 */             if (this.I0001Ioi1lo == this.I0000oI00) {
/* 7 */                 I001lloI();
                    }
/* 10 */            int i = this.I0001Ioi1lo;
/* 14 */            this.I0001Ioi1lo = i + 1;
/* 18 */            this.I0000O[i] = b;
                }

                @Override
                public final void I0001Ioi1lo(int i, boolean z) {
/* 3 */             I00II0Ol1O0l(11);
/* 8 */             I00IO1oi11O(i << 3);
/* 11 */            int i2 = this.I0001Ioi1lo;
/* 15 */            this.I0001Ioi1lo = i2 + 1;
/* 19 */            this.I0000O[i2] = z ? (byte) 1 : (byte) 0;
                }

                @Override
                public final void I000II(int i, byte[] bArr) throws IOException {
/* 1 */             I001iOo1i0O(i);
/* 5 */             I001lllioOl(bArr, 0, i);
                }

                @Override
                public final void I000O01llI0(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             I001lllioOl(bArr, i, i2);
                }

                @Override
                public final void I000OOo1O(int i, ii01lO0l11ii ii01lo0l11ii) {
/* 5 */             I001iOo1i0O((i << 3) | 2);
/* 8 */             I000OiO(ii01lo0l11ii);
                }

                @Override
                public final void I000OiO(ii01lO0l11ii ii01lo0l11ii) {
/* 5 */             I001iOo1i0O(ii01lo0l11ii.I0001Ioi1lo());
/* 8 */             ii01lo0l11ii.I000oI1ioi(this);
                }

                @Override
                public final void I000iOII(int i, int i2) {
/* 3 */             I00II0Ol1O0l(14);
/* 10 */            I00IO1oi11O((i << 3) | 5);
/* 13 */            I00II0oii1o(i2);
                }

                @Override
                public final void I000l1(int i) {
/* 2 */             I00II0Ol1O0l(4);
/* 5 */             I00II0oii1o(i);
                }

                @Override
                public final void I000lI(int i, long j) {
/* 3 */             I00II0Ol1O0l(18);
/* 10 */            I00IO1oi11O((i << 3) | 1);
/* 13 */            I00IO1(j);
                }

                @Override
                public final void I000o00OoI0I(long j) {
/* 3 */             I00II0Ol1O0l(8);
/* 6 */             I00IO1(j);
                }

                @Override
                public final void I000oI1ioi(int i, int i2) {
/* 3 */             I00II0Ol1O0l(20);
/* 8 */             I00IO1oi11O(i << 3);
/* 11 */            if (i2 >= 0) {
/* 13 */                I00IO1oi11O(i2);
                    } else {
/* 18 */                I00IOO(i2);
                    }
                }

                @Override
                public final void I00100l0(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 I001iOo1i0O(i);
                    } else {
/* 8 */                 I001lIiIIo1O(i);
                    }
                }

                @Override
                public final void I00100o1O0lo(int i, ii00oo ii00ooVar, ii0oioOi00i ii0oiooi00i) {
/* 5 */             I001iOo1i0O((i << 3) | 2);
/* 12 */            I001iOo1i0O(ii00ooVar.I00000oIO(ii0oiooi00i));
/* 17 */            ii0oiooi00i.I0000Il00O(ii00ooVar, this.I00000oIO);
                }

                @Override
                public final void I0010I0i(ii00oo ii00ooVar) {
/* 1 */             ii0OoOo10 ii0oooo10 = (ii0OoOo10) ii00ooVar;
/* 7 */             I001iOo1i0O(ii0oooo10.I0010o());
/* 10 */            ii0oooo10.I00100o1O0lo(this);
                }

                @Override
                public final void I0010o(int i, ii00oo ii00ooVar) {
/* 3 */             I001iOo1i0O(11);
/* 7 */             I001i1lo1io(2, i);
/* 12 */            I001iOo1i0O(26);
/* 15 */            I0010I0i(ii00ooVar);
/* 20 */            I001iOo1i0O(12);
                }

                @Override
                public final void I00111O(int i, ii01lO0l11ii ii01lo0l11ii) {
/* 3 */             I001iOo1i0O(11);
/* 7 */             I001i1lo1io(2, i);
/* 11 */            I000OOo1O(3, ii01lo0l11ii);
/* 16 */            I001iOo1i0O(12);
                }

                @Override
                public final void I001IIilI0O(int i, String str) throws IOException {
/* 5 */             I001iOo1i0O((i << 3) | 2);
/* 8 */             I001IO000(str);
                }

                @Override
                public final void I001IO000(String str) throws IOException {
/* 1 */             byte[] bArr = this.I0000O;
/* 3 */             int i = this.I0000oI00;
                    try {
/* 9 */                 int length = str.length() * 3;
/* 11 */                int iI00000oOI = ii0I1Il.I00000oOI(length);
/* 15 */                int i2 = iI00000oOI + length;
/* 17 */                if (i2 > i) {
/* 19 */                    byte[] bArr2 = new byte[length];
/* 22 */                    int iI00000oOI2 = ii10i1o.I00000oOI(str, bArr2, 0, length);
/* 26 */                    I001iOo1i0O(iI00000oOI2);
/* 29 */                    I001lllioOl(bArr2, 0, iI00000oOI2);
/* 32 */                    return;
                        }
/* 39 */                if (i2 > i - this.I0001Ioi1lo) {
/* 41 */                    I001lloI();
                        }
/* 48 */                int iI00000oOI3 = ii0I1Il.I00000oOI(str.length());
/* 52 */                int i3 = this.I0001Ioi1lo;
                        try {
                            try {
/* 54 */                        if (iI00000oOI3 == iI00000oOI) {
/* 56 */                            int i4 = i3 + iI00000oOI3;
/* 58 */                            this.I0001Ioi1lo = i4;
/* 61 */                            int iI00000oOI4 = ii10i1o.I00000oOI(str, bArr, i4, i - i4);
/* 65 */                            this.I0001Ioi1lo = i3;
/* 70 */                            I00IO1oi11O((iI00000oOI4 - i3) - iI00000oOI3);
/* 73 */                            this.I0001Ioi1lo = iI00000oOI4;
                                } else {
/* 80 */                            int iI0000Il00O = ii10i1o.I0000Il00O(str);
/* 84 */                            I00IO1oi11O(iI0000Il00O);
/* 93 */                            this.I0001Ioi1lo = ii10i1o.I00000oOI(str, bArr, this.I0001Ioi1lo, iI0000Il00O);
                                }
                            } catch (ii10OoO1o e) {
/* 102 */                       this.I0001Ioi1lo = i3;
/* 104 */                       throw e;
                            }
                        } catch (ArrayIndexOutOfBoundsException e2) {
/* 101 */                   throw new IOO1IOl1O10((IndexOutOfBoundsException) e2);
                        }
                    } catch (ii10OoO1o e3) {
/* 105 */               I0000O(str, e3);
                    }
                }

                @Override
                public final void I001i1O0Ol(int i, int i2) {
/* 4 */             I001iOo1i0O((i << 3) | i2);
                }

                @Override
                public final void I001i1lo1io(int i, int i2) {
/* 3 */             I00II0Ol1O0l(20);
/* 8 */             I00IO1oi11O(i << 3);
/* 11 */            I00IO1oi11O(i2);
                }

                @Override
                public final void I001iOo1i0O(int i) {
/* 2 */             I00II0Ol1O0l(5);
/* 5 */             I00IO1oi11O(i);
                }

                @Override
                public final void I001l0I00(int i, long j) {
/* 3 */             I00II0Ol1O0l(20);
/* 8 */             I00IO1oi11O(i << 3);
/* 11 */            I00IOO(j);
                }

                @Override
                public final void I001lIiIIo1O(long j) {
/* 3 */             I00II0Ol1O0l(10);
/* 6 */             I00IOO(j);
                }

                public final void I001lllioOl(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = this.I0000oI00;
/* 3 */             int i4 = this.I0001Ioi1lo;
/* 5 */             int i5 = i3 - i4;
/* 7 */             byte[] bArr2 = this.I0000O;
/* 9 */             if (i5 >= i2) {
/* 11 */                System.arraycopy(bArr, i, bArr2, i4, i2);
                        this.I0001Ioi1lo += i2;
/* 19 */                return;
                    }
/* 20 */            System.arraycopy(bArr, i, bArr2, i4, i5);
/* 23 */            int i6 = i + i5;
/* 24 */            this.I0001Ioi1lo = i3;
/* 26 */            I001lloI();
/* 29 */            int i7 = i2 - i5;
/* 30 */            if (i7 > i3) {
/* 41 */                this.I000II.write(bArr, i6, i7);
                    } else {
/* 33 */                System.arraycopy(bArr, i6, bArr2, 0, i7);
/* 36 */                this.I0001Ioi1lo = i7;
                    }
                }

                public final void I001lloI() {
/* 8 */             this.I000II.write(this.I0000O, 0, this.I0001Ioi1lo);
/* 11 */            this.I0001Ioi1lo = 0;
                }

                public final void I00II0Ol1O0l(int i) {
/* 6 */             if (this.I0000oI00 - this.I0001Ioi1lo < i) {
/* 8 */                 I001lloI();
                    }
                }

                public final void I00II0oii1o(int i) {
/* 1 */             int i2 = this.I0001Ioi1lo;
/* 3 */             int i3 = i2 + 1;
/* 5 */             this.I0001Ioi1lo = i3;
/* 10 */            byte[] bArr = this.I0000O;
/* 12 */            bArr[i2] = (byte) (i & 255);
/* 14 */            int i4 = i2 + 2;
/* 16 */            this.I0001Ioi1lo = i4;
/* 23 */            bArr[i3] = (byte) ((i >> 8) & 255);
/* 25 */            int i5 = i2 + 3;
/* 27 */            this.I0001Ioi1lo = i5;
/* 34 */            bArr[i4] = (byte) ((i >> 16) & 255);
/* 38 */            this.I0001Ioi1lo = i2 + 4;
/* 45 */            bArr[i5] = (byte) ((i >> 24) & 255);
                }

                public final void I00IO1(long j) {
/* 1 */             int i = this.I0001Ioi1lo;
/* 3 */             int i2 = i + 1;
/* 5 */             this.I0001Ioi1lo = i2;
/* 13 */            byte[] bArr = this.I0000O;
/* 15 */            bArr[i] = (byte) (j & 255);
/* 17 */            int i3 = i + 2;
/* 19 */            this.I0001Ioi1lo = i3;
/* 28 */            bArr[i2] = (byte) ((j >> 8) & 255);
/* 30 */            int i4 = i + 3;
/* 32 */            this.I0001Ioi1lo = i4;
/* 41 */            bArr[i3] = (byte) ((j >> 16) & 255);
/* 43 */            int i5 = i + 4;
/* 45 */            this.I0001Ioi1lo = i5;
/* 54 */            bArr[i4] = (byte) (255 & (j >> 24));
/* 56 */            int i6 = i + 5;
/* 58 */            this.I0001Ioi1lo = i6;
/* 68 */            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
/* 70 */            int i7 = i + 6;
/* 72 */            this.I0001Ioi1lo = i7;
/* 82 */            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
/* 84 */            int i8 = i + 7;
/* 86 */            this.I0001Ioi1lo = i8;
/* 96 */            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
/* 99 */            this.I0001Ioi1lo = i + 8;
/* 109 */           bArr[i8] = (byte) (((int) (j >> 56)) & 255);
                }

                public final void I00IO1oi11O(int i) {
/* 1 */             byte[] bArr = this.I0000O;
/* 5 */             if (ii0I1Il.I0000Il00O) {
                        while (true) {
/* 7 */                     int i2 = i & (-128);
/* 9 */                     int i3 = this.I0001Ioi1lo;
/* 11 */                    if (i2 == 0) {
/* 15 */                        this.I0001Ioi1lo = i3 + 1;
/* 19 */                        ii10Oo1I0.I000O01llI0(bArr, i3, (byte) i);
/* 22 */                        return;
                            } else {
/* 25 */                        this.I0001Ioi1lo = i3 + 1;
/* 33 */                        ii10Oo1I0.I000O01llI0(bArr, i3, (byte) ((i | Barcode.FORMAT_ITF) & 255));
/* 36 */                        i >>>= 7;
                            }
                        }
                    } else {
                        while (true) {
/* 39 */                    int i4 = i & (-128);
/* 41 */                    int i5 = this.I0001Ioi1lo;
/* 43 */                    if (i4 == 0) {
/* 47 */                        this.I0001Ioi1lo = i5 + 1;
/* 50 */                        bArr[i5] = (byte) i;
/* 52 */                        return;
                            } else {
/* 55 */                        this.I0001Ioi1lo = i5 + 1;
/* 62 */                        bArr[i5] = (byte) ((i | Barcode.FORMAT_ITF) & 255);
/* 64 */                        i >>>= 7;
                            }
                        }
                    }
                }

                public final void I00IOO(long j) {
/* 1 */             byte[] bArr = this.I0000O;
/* 10 */            if (ii0I1Il.I0000Il00O) {
                        while (true) {
/* 12 */                    long j2 = j & (-128);
/* 16 */                    int i = (int) j;
/* 17 */                    int i2 = this.I0001Ioi1lo;
/* 19 */                    if (j2 == 0) {
/* 23 */                        this.I0001Ioi1lo = i2 + 1;
/* 27 */                        ii10Oo1I0.I000O01llI0(bArr, i2, (byte) i);
/* 30 */                        return;
                            } else {
/* 33 */                        this.I0001Ioi1lo = i2 + 1;
/* 41 */                        ii10Oo1I0.I000O01llI0(bArr, i2, (byte) ((i | Barcode.FORMAT_ITF) & 255));
/* 44 */                        j >>>= 7;
                            }
                        }
                    } else {
                        while (true) {
/* 46 */                    long j3 = j & (-128);
/* 50 */                    int i3 = (int) j;
/* 51 */                    int i4 = this.I0001Ioi1lo;
/* 53 */                    if (j3 == 0) {
/* 57 */                        this.I0001Ioi1lo = i4 + 1;
/* 60 */                        bArr[i4] = (byte) i3;
/* 62 */                        return;
                            } else {
/* 65 */                        this.I0001Ioi1lo = i4 + 1;
/* 72 */                        bArr[i4] = (byte) ((i3 | Barcode.FORMAT_ITF) & 255);
/* 74 */                        j >>>= 7;
                            }
                        }
                    }
                }
            }
