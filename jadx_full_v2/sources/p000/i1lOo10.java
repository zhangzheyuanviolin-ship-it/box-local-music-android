            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.Locale;
            
            public final class i1lOo10 extends i1lllO0 {
                public final byte[] I0000Il00O;
                public final int I0000O;
                public int I0000oI00;

                public i1lOo10(int i, byte[] bArr) {
/* 4 */             int length = bArr.length;
/* 8 */             if (((length - i) | i) < 0) {
/* 18 */                Locale locale = Locale.US;
/* 28 */                I000II.I000iOII(IIl001iO0Io.I000l1(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
/* 37 */                throw null;
                    }
/* 10 */            this.I0000Il00O = bArr;
/* 13 */            this.I0000oI00 = 0;
/* 15 */            this.I0000O = i;
                }

                @Override
                public final void I0000Il00O(byte[] bArr, int i, int i2) throws IOO1IOl1O10 {
/* 1 */             I001i1O0Ol(bArr, i, i2);
                }

                @Override
                public final void I0000O(int i, int i2) throws IOO1IOl1O10 {
/* 4 */             I0010I0i((i << 3) | i2);
                }

                @Override
                public final void I0000oI00(int i, int i2) throws IOO1IOl1O10 {
/* 3 */             I0010I0i(i << 3);
/* 6 */             I00100o1O0lo(i2);
                }

                @Override
                public final void I0001Ioi1lo(int i, int i2) throws IOO1IOl1O10 {
/* 3 */             I0010I0i(i << 3);
/* 6 */             I0010I0i(i2);
                }

                @Override
                public final void I000II(int i, int i2) throws IOO1IOl1O10 {
/* 5 */             I0010I0i((i << 3) | 5);
/* 8 */             I0010o(i2);
                }

                @Override
                public final void I000O01llI0(int i, long j) throws IOO1IOl1O10 {
/* 3 */             I0010I0i(i << 3);
/* 6 */             I00111O(j);
                }

                @Override
                public final void I000OOo1O(int i, long j) throws IOO1IOl1O10 {
/* 5 */             I0010I0i((i << 3) | 1);
/* 8 */             I001IIilI0O(j);
                }

                @Override
                public final void I000OiO(int i, boolean z) throws IOO1IOl1O10 {
/* 3 */             I0010I0i(i << 3);
/* 6 */             I00100l0(z ? (byte) 1 : (byte) 0);
                }

                @Override
                public final void I000iOII(int i, String str) throws IOO1IOl1O10 {
/* 5 */             I0010I0i((i << 3) | 2);
/* 8 */             I001IO000(str);
                }

                @Override
                public final void I000l1(int i, i1lIIl01O i1liil01o) throws IOO1IOl1O10 {
/* 5 */             I0010I0i((i << 3) | 2);
/* 8 */             I000lI(i1liil01o);
                }

                @Override
                public final void I000lI(i1lIIl01O i1liil01o) throws IOO1IOl1O10 {
/* 5 */             I0010I0i(i1liil01o.I0000O());
/* 8 */             i1liil01o.I000OOo1O(this);
                }

                @Override
                public final void I000o00OoI0I(int i, byte[] bArr) throws IOO1IOl1O10 {
/* 1 */             I0010I0i(i);
/* 5 */             I001i1O0Ol(bArr, 0, i);
                }

                @Override
                public final void I000oI1ioi(i1ilO0II i1ilo0ii) throws IOO1IOl1O10 {
/* 1 */             i1oi01OllI i1oi01olli = (i1oi01OllI) i1ilo0ii;
/* 7 */             I0010I0i(i1oi01olli.I000l1());
/* 10 */            i1oi01olli.I0000oI00(this);
                }

                @Override
                public final void I00100l0(byte b) throws IOO1IOl1O10 {
/* 1 */             int i = this.I0000oI00;
                    try {
/* 5 */                 int i2 = i + 1;
                        try {
/* 7 */                     this.I0000Il00O[i] = b;
/* 9 */                     this.I0000oI00 = i2;
                        } catch (IndexOutOfBoundsException e) {
/* 12 */                    e = e;
/* 13 */                    i = i2;
/* 29 */                    throw new IOO1IOl1O10(i, this.I0000O, 1, e);
                        }
                    } catch (IndexOutOfBoundsException e2) {
/* 17 */                e = e2;
                    }
                }

                @Override
                public final void I00100o1O0lo(int i) throws IOO1IOl1O10 {
/* 1 */             if (i >= 0) {
/* 3 */                 I0010I0i(i);
                    } else {
/* 8 */                 I00111O(i);
                    }
                }

                @Override
                public final void I0010I0i(int i) throws IOO1IOl1O10 {
                    int i2;
/* 1 */             int i3 = this.I0000oI00;
                    while (true) {
/* 3 */                 int i4 = i & (-128);
/* 5 */                 byte[] bArr = this.I0000Il00O;
/* 7 */                 if (i4 == 0) {
/* 9 */                     i2 = i3 + 1;
/* 12 */                    bArr[i3] = (byte) i;
/* 14 */                    this.I0000oI00 = i2;
/* 16 */                    return;
                        } else {
/* 21 */                    i2 = i3 + 1;
                            try {
/* 26 */                        bArr[i3] = (byte) (i | Barcode.FORMAT_ITF);
/* 28 */                        i >>>= 7;
/* 30 */                        i3 = i2;
                            } catch (IndexOutOfBoundsException e) {
/* 77 */                        throw new IOO1IOl1O10(i2, this.I0000O, 1, e);
                            }
                        }
/* 77 */                throw new IOO1IOl1O10(i2, this.I0000O, 1, e);
                    }
                }

                @Override
                public final void I0010o(int i) throws IOO1IOl1O10 {
/* 1 */             int i2 = this.I0000oI00;
                    try {
/* 3 */                 byte[] bArr = this.I0000Il00O;
/* 6 */                 bArr[i2] = (byte) i;
/* 13 */                bArr[i2 + 1] = (byte) (i >> 8);
/* 20 */                bArr[i2 + 2] = (byte) (i >> 16);
/* 27 */                bArr[i2 + 3] = (byte) (i >> 24);
/* 31 */                this.I0000oI00 = i2 + 4;
                    } catch (IndexOutOfBoundsException e) {
/* 77 */                throw new IOO1IOl1O10(i2, this.I0000O, 4, e);
                    }
                }

                @Override
                public final void I00111O(long j) throws IOO1IOl1O10 {
                    int i;
/* 1 */             int i2 = this.I0000oI00;
/* 4 */             byte[] bArr = this.I0000Il00O;
/* 10 */            int i3 = this.I0000O;
/* 14 */            if (!i1lllO0.I00000oOI || i3 - i2 < 10) {
/* 54 */                while ((j & (-128)) != 0) {
/* 69 */                    int i4 = i2 + 1;
                            try {
/* 75 */                        bArr[i2] = (byte) (((int) j) | Barcode.FORMAT_ITF);
/* 77 */                        j >>>= 7;
/* 78 */                        i2 = i4;
                            } catch (IndexOutOfBoundsException e) {
/* 80 */                        e = e;
/* 81 */                        i = i4;
/* 168 */                       throw new IOO1IOl1O10(i, i3, 1, e);
                            }
                        }
/* 56 */                i = i2 + 1;
                        try {
/* 60 */                    bArr[i2] = (byte) j;
                        } catch (IndexOutOfBoundsException e2) {
/* 65 */                    e = e2;
/* 168 */                   throw new IOO1IOl1O10(i, i3, 1, e);
                        }
                    } else {
/* 26 */                while ((j & (-128)) != 0) {
/* 44 */                    iI1Oili0OI.I000OiO(bArr, i2, (byte) (((int) j) | Barcode.FORMAT_ITF));
/* 47 */                    j >>>= 7;
/* 37 */                    i2++;
                        }
/* 28 */                i = i2 + 1;
/* 33 */                iI1Oili0OI.I000OiO(bArr, i2, (byte) j);
                    }
/* 62 */            this.I0000oI00 = i;
                }

                @Override
                public final void I001IIilI0O(long j) throws IOO1IOl1O10 {
/* 1 */             int i = this.I0000oI00;
                    try {
/* 3 */                 byte[] bArr = this.I0000Il00O;
/* 7 */                 bArr[i] = (byte) j;
/* 17 */                bArr[i + 1] = (byte) (j >> 8);
/* 27 */                bArr[i + 2] = (byte) (j >> 16);
/* 37 */                bArr[i + 3] = (byte) (j >> 24);
/* 47 */                bArr[i + 4] = (byte) (j >> 32);
/* 57 */                bArr[i + 5] = (byte) (j >> 40);
/* 67 */                bArr[i + 6] = (byte) (j >> 48);
/* 76 */                bArr[i + 7] = (byte) (j >> 56);
/* 79 */                this.I0000oI00 = i + 8;
                    } catch (IndexOutOfBoundsException e) {
/* 168 */               throw new IOO1IOl1O10(i, this.I0000O, 8, e);
                    }
                }

                @Override
                public final void I001IO000(String str) throws IOO1IOl1O10 {
/* 1 */             int i = this.I0000oI00;
                    try {
/* 9 */                 int iI00000oIO = i1lllO0.I00000oIO(str.length() * 3);
/* 17 */                int iI00000oIO2 = i1lllO0.I00000oIO(str.length());
/* 21 */                byte[] bArr = this.I0000Il00O;
/* 23 */                if (iI00000oIO2 != iI00000oIO) {
/* 50 */                    I0010I0i(iI1i1o0lIl1o.I00000oOI(str));
/* 53 */                    int i2 = this.I0000oI00;
/* 61 */                    this.I0000oI00 = iI1i1o0lIl1o.I0000Il00O(str, bArr, i2, bArr.length - i2);
                        } else {
/* 25 */                    int i3 = i + iI00000oIO2;
/* 27 */                    this.I0000oI00 = i3;
/* 31 */                    int iI0000Il00O = iI1i1o0lIl1o.I0000Il00O(str, bArr, i3, bArr.length - i3);
/* 35 */                    this.I0000oI00 = i;
/* 40 */                    I0010I0i((iI0000Il00O - i) - iI00000oIO2);
/* 43 */                    this.I0000oI00 = iI0000Il00O;
                        }
                    } catch (IndexOutOfBoundsException e) {
/* 77 */                throw new IOO1IOl1O10(e);
                    }
                }

                public final void I001i1O0Ol(byte[] bArr, int i, int i2) throws IOO1IOl1O10 {
                    try {
/* 5 */                 System.arraycopy(bArr, i, this.I0000Il00O, this.I0000oI00, i2);
                        this.I0000oI00 += i2;
                    } catch (IndexOutOfBoundsException e) {
/* 98 */                throw new IOO1IOl1O10(this.I0000oI00, this.I0000O, i2, e);
                    }
                }

                public final int I001i1lo1io() {
/* 5 */             return this.I0000O - this.I0000oI00;
                }
            }
