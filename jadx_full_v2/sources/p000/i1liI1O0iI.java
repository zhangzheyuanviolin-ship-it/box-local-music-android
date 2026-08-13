            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.OutputStream;
            
            public final class i1liI1O0iI extends i1lllO0 {
                public byte[] I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public OutputStream I0001Ioi1lo;

                @Override
                public final void I0000Il00O(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             I001l0I00(bArr, i, i2);
                }

                @Override
                public final void I0000O(int i, int i2) {
/* 4 */             I0010I0i((i << 3) | i2);
                }

                @Override
                public final void I0000oI00(int i, int i2) {
/* 3 */             I001lIiIIo1O(20);
/* 8 */             I001lloI(i << 3);
/* 11 */            if (i2 >= 0) {
/* 13 */                I001lloI(i2);
                    } else {
/* 18 */                I001i1O0Ol(i2);
                    }
                }

                @Override
                public final void I0001Ioi1lo(int i, int i2) {
/* 3 */             I001lIiIIo1O(20);
/* 8 */             I001lloI(i << 3);
/* 11 */            I001lloI(i2);
                }

                @Override
                public final void I000II(int i, int i2) {
/* 3 */             I001lIiIIo1O(14);
/* 10 */            I001lloI((i << 3) | 5);
/* 13 */            I001i1lo1io(i2);
                }

                @Override
                public final void I000O01llI0(int i, long j) {
/* 3 */             I001lIiIIo1O(20);
/* 8 */             I001lloI(i << 3);
/* 11 */            I001i1O0Ol(j);
                }

                @Override
                public final void I000OOo1O(int i, long j) {
/* 3 */             I001lIiIIo1O(18);
/* 10 */            I001lloI((i << 3) | 1);
/* 13 */            I001iOo1i0O(j);
                }

                @Override
                public final void I000OiO(int i, boolean z) {
/* 3 */             I001lIiIIo1O(11);
/* 8 */             I001lloI(i << 3);
/* 11 */            byte[] bArr = this.I0000Il00O;
/* 13 */            int i2 = this.I0000oI00;
/* 15 */            bArr[i2] = z ? (byte) 1 : (byte) 0;
/* 19 */            this.I0000oI00 = i2 + 1;
                }

                @Override
                public final void I000iOII(int i, String str) throws IOException {
/* 5 */             I0010I0i((i << 3) | 2);
/* 8 */             I001IO000(str);
                }

                @Override
                public final void I000l1(int i, i1lIIl01O i1liil01o) {
/* 5 */             I0010I0i((i << 3) | 2);
/* 8 */             I000lI(i1liil01o);
                }

                @Override
                public final void I000lI(i1lIIl01O i1liil01o) {
/* 5 */             I0010I0i(i1liil01o.I0000O());
/* 8 */             i1liil01o.I000OOo1O(this);
                }

                @Override
                public final void I000o00OoI0I(int i, byte[] bArr) throws IOException {
/* 1 */             I0010I0i(i);
/* 5 */             I001l0I00(bArr, 0, i);
                }

                @Override
                public final void I000oI1ioi(i1ilO0II i1ilo0ii) {
/* 1 */             i1oi01OllI i1oi01olli = (i1oi01OllI) i1ilo0ii;
/* 7 */             I0010I0i(i1oi01olli.I000l1());
/* 10 */            i1oi01olli.I0000oI00(this);
                }

                @Override
                public final void I00100l0(byte b) {
/* 5 */             if (this.I0000oI00 == this.I0000O) {
/* 7 */                 I001lllioOl();
                    }
/* 10 */            byte[] bArr = this.I0000Il00O;
/* 12 */            int i = this.I0000oI00;
/* 14 */            bArr[i] = b;
/* 18 */            this.I0000oI00 = i + 1;
                }

                @Override
                public final void I00100o1O0lo(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 I0010I0i(i);
                    } else {
/* 8 */                 I00111O(i);
                    }
                }

                @Override
                public final void I0010I0i(int i) {
/* 2 */             I001lIiIIo1O(5);
/* 5 */             I001lloI(i);
                }

                @Override
                public final void I0010o(int i) {
/* 2 */             I001lIiIIo1O(4);
/* 5 */             I001i1lo1io(i);
                }

                @Override
                public final void I00111O(long j) {
/* 3 */             I001lIiIIo1O(10);
/* 6 */             I001i1O0Ol(j);
                }

                @Override
                public final void I001IIilI0O(long j) {
/* 3 */             I001lIiIIo1O(8);
/* 6 */             I001iOo1i0O(j);
                }

                @Override
                public final void I001IO000(String str) throws IOException {
/* 1 */             byte[] bArr = this.I0000Il00O;
/* 7 */             int length = str.length() * 3;
/* 9 */             int iI00000oIO = i1lllO0.I00000oIO(length);
/* 13 */            int i = iI00000oIO + length;
/* 15 */            int i2 = this.I0000O;
/* 17 */            if (i > i2) {
/* 19 */                byte[] bArr2 = new byte[length];
/* 22 */                int iI0000Il00O = iI1i1o0lIl1o.I0000Il00O(str, bArr2, 0, length);
/* 26 */                I0010I0i(iI0000Il00O);
/* 29 */                I001l0I00(bArr2, 0, iI0000Il00O);
/* 32 */                return;
                    }
/* 37 */            if (i > i2 - this.I0000oI00) {
/* 39 */                I001lllioOl();
                    }
/* 46 */            int iI00000oIO2 = i1lllO0.I00000oIO(str.length());
/* 50 */            int i3 = this.I0000oI00;
                    try {
/* 52 */                if (iI00000oIO2 == iI00000oIO) {
/* 54 */                    int i4 = i3 + iI00000oIO2;
/* 56 */                    this.I0000oI00 = i4;
/* 59 */                    int iI0000Il00O2 = iI1i1o0lIl1o.I0000Il00O(str, bArr, i4, i2 - i4);
/* 63 */                    this.I0000oI00 = i3;
/* 68 */                    I001lloI((iI0000Il00O2 - i3) - iI00000oIO2);
/* 71 */                    this.I0000oI00 = iI0000Il00O2;
                        } else {
/* 74 */                    int iI00000oOI = iI1i1o0lIl1o.I00000oOI(str);
/* 78 */                    I001lloI(iI00000oOI);
/* 87 */                    this.I0000oI00 = iI1i1o0lIl1o.I0000Il00O(str, bArr, this.I0000oI00, iI00000oOI);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
/* 168 */               throw new IOO1IOl1O10((IndexOutOfBoundsException) e);
                    }
                }

                public final void I001i1O0Ol(long j) {
/* 1 */             byte[] bArr = this.I0000Il00O;
/* 10 */            if (i1lllO0.I00000oOI) {
                        while (true) {
/* 12 */                    long j2 = j & (-128);
/* 16 */                    int i = (int) j;
/* 17 */                    int i2 = this.I0000oI00;
/* 19 */                    if (j2 == 0) {
/* 23 */                        this.I0000oI00 = i2 + 1;
/* 27 */                        iI1Oili0OI.I000OiO(bArr, i2, (byte) i);
/* 30 */                        return;
                            } else {
/* 33 */                        this.I0000oI00 = i2 + 1;
/* 39 */                        iI1Oili0OI.I000OiO(bArr, i2, (byte) (i | Barcode.FORMAT_ITF));
/* 42 */                        j >>>= 7;
                            }
                        }
                    } else {
                        while (true) {
/* 44 */                    long j3 = j & (-128);
/* 48 */                    int i3 = (int) j;
/* 49 */                    int i4 = this.I0000oI00;
/* 51 */                    if (j3 == 0) {
/* 55 */                        this.I0000oI00 = i4 + 1;
/* 58 */                        bArr[i4] = (byte) i3;
/* 60 */                        return;
                            } else {
/* 63 */                        this.I0000oI00 = i4 + 1;
/* 68 */                        bArr[i4] = (byte) (i3 | Barcode.FORMAT_ITF);
/* 70 */                        j >>>= 7;
                            }
                        }
                    }
                }

                public final void I001i1lo1io(int i) {
/* 1 */             int i2 = this.I0000oI00;
/* 6 */             byte[] bArr = this.I0000Il00O;
/* 8 */             bArr[i2] = (byte) i;
/* 13 */            bArr[i2 + 1] = (byte) (i >> 8);
/* 20 */            bArr[i2 + 2] = (byte) (i >> 16);
/* 27 */            bArr[i2 + 3] = (byte) (i >> 24);
/* 31 */            this.I0000oI00 = i2 + 4;
                }

                public final void I001iOo1i0O(long j) {
/* 1 */             int i = this.I0000oI00;
/* 7 */             byte[] bArr = this.I0000Il00O;
/* 9 */             bArr[i] = (byte) j;
/* 17 */            bArr[i + 1] = (byte) (j >> 8);
/* 27 */            bArr[i + 2] = (byte) (j >> 16);
/* 37 */            bArr[i + 3] = (byte) (j >> 24);
/* 47 */            bArr[i + 4] = (byte) (j >> 32);
/* 57 */            bArr[i + 5] = (byte) (j >> 40);
/* 67 */            bArr[i + 6] = (byte) (j >> 48);
/* 76 */            bArr[i + 7] = (byte) (j >> 56);
/* 79 */            this.I0000oI00 = i + 8;
                }

                public final void I001l0I00(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = this.I0000O;
/* 3 */             int i4 = this.I0000oI00;
/* 5 */             int i5 = i3 - i4;
/* 7 */             byte[] bArr2 = this.I0000Il00O;
/* 9 */             if (i5 >= i2) {
/* 11 */                System.arraycopy(bArr, i, bArr2, i4, i2);
                        this.I0000oI00 += i2;
/* 19 */                return;
                    }
/* 20 */            System.arraycopy(bArr, i, bArr2, i4, i5);
/* 23 */            int i6 = i + i5;
/* 24 */            this.I0000oI00 = i3;
/* 26 */            I001lllioOl();
/* 29 */            int i7 = i2 - i5;
/* 30 */            if (i7 > i3) {
/* 41 */                this.I0001Ioi1lo.write(bArr, i6, i7);
                    } else {
/* 33 */                System.arraycopy(bArr, i6, bArr2, 0, i7);
/* 36 */                this.I0000oI00 = i7;
                    }
                }

                public final void I001lIiIIo1O(int i) {
/* 6 */             if (this.I0000O - this.I0000oI00 < i) {
/* 8 */                 I001lllioOl();
                    }
                }

                public final void I001lllioOl() {
/* 8 */             this.I0001Ioi1lo.write(this.I0000Il00O, 0, this.I0000oI00);
/* 11 */            this.I0000oI00 = 0;
                }

                public final void I001lloI(int i) {
/* 1 */             byte[] bArr = this.I0000Il00O;
/* 5 */             if (i1lllO0.I00000oOI) {
                        while (true) {
/* 7 */                     int i2 = i & (-128);
/* 9 */                     int i3 = this.I0000oI00;
/* 11 */                    if (i2 == 0) {
/* 15 */                        this.I0000oI00 = i3 + 1;
/* 19 */                        iI1Oili0OI.I000OiO(bArr, i3, (byte) i);
/* 22 */                        return;
                            } else {
/* 25 */                        this.I0000oI00 = i3 + 1;
/* 31 */                        iI1Oili0OI.I000OiO(bArr, i3, (byte) (i | Barcode.FORMAT_ITF));
/* 34 */                        i >>>= 7;
                            }
                        }
                    } else {
                        while (true) {
/* 37 */                    int i4 = i & (-128);
/* 39 */                    int i5 = this.I0000oI00;
/* 41 */                    if (i4 == 0) {
/* 45 */                        this.I0000oI00 = i5 + 1;
/* 48 */                        bArr[i5] = (byte) i;
/* 50 */                        return;
                            } else {
/* 53 */                        this.I0000oI00 = i5 + 1;
/* 58 */                        bArr[i5] = (byte) (i | Barcode.FORMAT_ITF);
/* 60 */                        i >>>= 7;
                            }
                        }
                    }
                }
            }
