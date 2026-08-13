            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class ii01oiO extends ii0I1Il {
                public final byte[] I0000O;
                public final int I0000oI00;
                public int I0001Ioi1lo;

                public ii01oiO(int i, byte[] bArr) {
/* 4 */             int length = bArr.length;
/* 9 */             if (((length - i) | i) < 0) {
/* 36 */                OIiilo1Ool0o.I000l1("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)});
/* 106 */               throw null;
                    }
/* 11 */            this.I0000O = bArr;
/* 13 */            this.I0001Ioi1lo = 0;
/* 15 */            this.I0000oI00 = i;
                }

                @Override
                public final void I0000oI00(byte b) throws IOO1IOl1O10 {
                    try {
/* 1 */                 byte[] bArr = this.I0000O;
/* 3 */                 int i = this.I0001Ioi1lo;
/* 7 */                 this.I0001Ioi1lo = i + 1;
/* 9 */                 bArr[i] = b;
                    } catch (IndexOutOfBoundsException e) {
/* 77 */                throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0001Ioi1lo), Integer.valueOf(this.I0000oI00), 1), e, 10);
                    }
                }

                @Override
                public final void I0001Ioi1lo(int i, boolean z) throws IOO1IOl1O10 {
/* 3 */             I001iOo1i0O(i << 3);
/* 6 */             I0000oI00(z ? (byte) 1 : (byte) 0);
                }

                @Override
                public final void I000II(int i, byte[] bArr) throws IOO1IOl1O10 {
/* 1 */             I001iOo1i0O(i);
/* 5 */             I001lloI(bArr, 0, i);
                }

                @Override
                public final void I000O01llI0(byte[] bArr, int i, int i2) throws IOO1IOl1O10 {
/* 1 */             I001lloI(bArr, i, i2);
                }

                @Override
                public final void I000OOo1O(int i, ii01lO0l11ii ii01lo0l11ii) throws IOO1IOl1O10 {
/* 5 */             I001iOo1i0O((i << 3) | 2);
/* 8 */             I000OiO(ii01lo0l11ii);
                }

                @Override
                public final void I000OiO(ii01lO0l11ii ii01lo0l11ii) throws IOO1IOl1O10 {
/* 5 */             I001iOo1i0O(ii01lo0l11ii.I0001Ioi1lo());
/* 8 */             ii01lo0l11ii.I000oI1ioi(this);
                }

                @Override
                public final void I000iOII(int i, int i2) throws IOO1IOl1O10 {
/* 5 */             I001iOo1i0O((i << 3) | 5);
/* 8 */             I000l1(i2);
                }

                @Override
                public final void I000l1(int i) throws IOO1IOl1O10 {
                    try {
/* 1 */                 byte[] bArr = this.I0000O;
/* 3 */                 int i2 = this.I0001Ioi1lo;
/* 5 */                 int i3 = i2 + 1;
/* 7 */                 this.I0001Ioi1lo = i3;
/* 12 */                bArr[i2] = (byte) (i & 255);
/* 14 */                int i4 = i2 + 2;
/* 16 */                this.I0001Ioi1lo = i4;
/* 23 */                bArr[i3] = (byte) ((i >> 8) & 255);
/* 25 */                int i5 = i2 + 3;
/* 27 */                this.I0001Ioi1lo = i5;
/* 34 */                bArr[i4] = (byte) ((i >> 16) & 255);
/* 38 */                this.I0001Ioi1lo = i2 + 4;
/* 45 */                bArr[i5] = (byte) ((i >> 24) & 255);
                    } catch (IndexOutOfBoundsException e) {
/* 168 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0001Ioi1lo), Integer.valueOf(this.I0000oI00), 1), e, 10);
                    }
                }

                @Override
                public final void I000lI(int i, long j) throws IOO1IOl1O10 {
/* 5 */             I001iOo1i0O((i << 3) | 1);
/* 8 */             I000o00OoI0I(j);
                }

                @Override
                public final void I000o00OoI0I(long j) throws IOO1IOl1O10 {
                    try {
/* 1 */                 byte[] bArr = this.I0000O;
/* 3 */                 int i = this.I0001Ioi1lo;
/* 5 */                 int i2 = i + 1;
/* 7 */                 this.I0001Ioi1lo = i2;
/* 13 */                bArr[i] = (byte) (((int) j) & 255);
/* 15 */                int i3 = i + 2;
/* 17 */                this.I0001Ioi1lo = i3;
/* 27 */                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
/* 29 */                int i4 = i + 3;
/* 31 */                this.I0001Ioi1lo = i4;
/* 41 */                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
/* 43 */                int i5 = i + 4;
/* 45 */                this.I0001Ioi1lo = i5;
/* 55 */                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
/* 57 */                int i6 = i + 5;
/* 59 */                this.I0001Ioi1lo = i6;
/* 69 */                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
/* 71 */                int i7 = i + 6;
/* 73 */                this.I0001Ioi1lo = i7;
/* 83 */                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
/* 85 */                int i8 = i + 7;
/* 87 */                this.I0001Ioi1lo = i8;
/* 97 */                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
/* 100 */               this.I0001Ioi1lo = i + 8;
/* 109 */               bArr[i8] = (byte) (((int) (j >> 56)) & 255);
                    } catch (IndexOutOfBoundsException e) {
/* 168 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0001Ioi1lo), Integer.valueOf(this.I0000oI00), 1), e, 10);
                    }
                }

                @Override
                public final void I000oI1ioi(int i, int i2) throws IOO1IOl1O10 {
/* 3 */             I001iOo1i0O(i << 3);
/* 6 */             I00100l0(i2);
                }

                @Override
                public final void I00100l0(int i) throws IOO1IOl1O10 {
/* 1 */             if (i >= 0) {
/* 3 */                 I001iOo1i0O(i);
                    } else {
/* 8 */                 I001lIiIIo1O(i);
                    }
                }

                @Override
                public final void I00100o1O0lo(int i, ii00oo ii00ooVar, ii0oioOi00i ii0oiooi00i) throws IOO1IOl1O10 {
/* 5 */             I001iOo1i0O((i << 3) | 2);
/* 12 */            I001iOo1i0O(ii00ooVar.I00000oIO(ii0oiooi00i));
/* 17 */            ii0oiooi00i.I0000Il00O(ii00ooVar, this.I00000oIO);
                }

                @Override
                public final void I0010I0i(ii00oo ii00ooVar) throws IOO1IOl1O10 {
/* 1 */             ii0OoOo10 ii0oooo10 = (ii0OoOo10) ii00ooVar;
/* 7 */             I001iOo1i0O(ii0oooo10.I0010o());
/* 10 */            ii0oooo10.I00100o1O0lo(this);
                }

                @Override
                public final void I0010o(int i, ii00oo ii00ooVar) throws IOO1IOl1O10 {
/* 3 */             I001iOo1i0O(11);
/* 7 */             I001i1lo1io(2, i);
/* 12 */            I001iOo1i0O(26);
/* 15 */            I0010I0i(ii00ooVar);
/* 20 */            I001iOo1i0O(12);
                }

                @Override
                public final void I00111O(int i, ii01lO0l11ii ii01lo0l11ii) throws IOO1IOl1O10 {
/* 3 */             I001iOo1i0O(11);
/* 7 */             I001i1lo1io(2, i);
/* 11 */            I000OOo1O(3, ii01lo0l11ii);
/* 16 */            I001iOo1i0O(12);
                }

                @Override
                public final void I001IIilI0O(int i, String str) throws IOO1IOl1O10 {
/* 5 */             I001iOo1i0O((i << 3) | 2);
/* 8 */             I001IO000(str);
                }

                @Override
                public final void I001IO000(String str) throws IOO1IOl1O10 {
/* 1 */             int i = this.I0001Ioi1lo;
                    try {
/* 9 */                 int iI00000oOI = ii0I1Il.I00000oOI(str.length() * 3);
/* 17 */                int iI00000oOI2 = ii0I1Il.I00000oOI(str.length());
/* 21 */                int i2 = this.I0000oI00;
/* 23 */                byte[] bArr = this.I0000O;
/* 25 */                if (iI00000oOI2 != iI00000oOI) {
/* 53 */                    I001iOo1i0O(ii10i1o.I0000Il00O(str));
/* 56 */                    int i3 = this.I0001Ioi1lo;
/* 63 */                    this.I0001Ioi1lo = ii10i1o.I00000oOI(str, bArr, i3, i2 - i3);
                        } else {
/* 27 */                    int i4 = i + iI00000oOI2;
/* 29 */                    this.I0001Ioi1lo = i4;
/* 32 */                    int iI00000oOI3 = ii10i1o.I00000oOI(str, bArr, i4, i2 - i4);
/* 36 */                    this.I0001Ioi1lo = i;
/* 41 */                    I001iOo1i0O((iI00000oOI3 - i) - iI00000oOI2);
/* 44 */                    this.I0001Ioi1lo = iI00000oOI3;
                        }
                    } catch (ii10OoO1o e) {
/* 73 */                this.I0001Ioi1lo = i;
/* 75 */                I0000O(str, e);
                    } catch (IndexOutOfBoundsException e2) {
/* 72 */                throw new IOO1IOl1O10(e2);
                    }
                }

                @Override
                public final void I001i1O0Ol(int i, int i2) throws IOO1IOl1O10 {
/* 4 */             I001iOo1i0O((i << 3) | i2);
                }

                @Override
                public final void I001i1lo1io(int i, int i2) throws IOO1IOl1O10 {
/* 3 */             I001iOo1i0O(i << 3);
/* 6 */             I001iOo1i0O(i2);
                }

                @Override
                public final void I001iOo1i0O(int i) throws IOO1IOl1O10 {
                    while (true) {
/* 1 */                 int i2 = i & (-128);
/* 3 */                 int i3 = this.I0001Ioi1lo;
/* 5 */                 byte[] bArr = this.I0000O;
/* 7 */                 if (i2 == 0) {
/* 11 */                    this.I0001Ioi1lo = i3 + 1;
/* 14 */                    bArr[i3] = (byte) i;
/* 16 */                    return;
                        } else {
                            try {
/* 21 */                        this.I0001Ioi1lo = i3 + 1;
/* 28 */                        bArr[i3] = (byte) ((i | Barcode.FORMAT_ITF) & 255);
/* 30 */                        i >>>= 7;
                            } catch (IndexOutOfBoundsException e) {
/* 77 */                        throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0001Ioi1lo), Integer.valueOf(this.I0000oI00), 1), e, 10);
                            }
                        }
/* 77 */                throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0001Ioi1lo), Integer.valueOf(this.I0000oI00), 1), e, 10);
                    }
                }

                @Override
                public final void I001l0I00(int i, long j) throws IOO1IOl1O10 {
/* 3 */             I001iOo1i0O(i << 3);
/* 6 */             I001lIiIIo1O(j);
                }

                @Override
                public final void I001lIiIIo1O(long j) throws IOO1IOl1O10 {
/* 1 */             boolean z = ii0I1Il.I0000Il00O;
/* 6 */             byte[] bArr = this.I0000O;
/* 12 */            int i = this.I0000oI00;
/* 14 */            if (!z || i - this.I0001Ioi1lo < 10) {
                        while (true) {
/* 56 */                    long j2 = j & (-128);
/* 60 */                    int i2 = this.I0001Ioi1lo;
/* 62 */                    if (j2 == 0) {
/* 66 */                        this.I0001Ioi1lo = i2 + 1;
/* 70 */                        bArr[i2] = (byte) j;
/* 72 */                        return;
                            } else {
                                try {
/* 77 */                            this.I0001Ioi1lo = i2 + 1;
/* 85 */                            bArr[i2] = (byte) ((((int) j) | Barcode.FORMAT_ITF) & 255);
/* 87 */                            j >>>= 7;
                                } catch (IndexOutOfBoundsException e) {
/* 168 */                           throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0001Ioi1lo), Integer.valueOf(i), 1), e, 10);
                                }
                            }
/* 168 */                   throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0001Ioi1lo), Integer.valueOf(i), 1), e, 10);
                        }
                    }
                    while (true) {
/* 22 */                long j3 = j & (-128);
/* 26 */                int i3 = (int) j;
/* 27 */                int i4 = this.I0001Ioi1lo;
/* 29 */                if (j3 == 0) {
/* 33 */                    this.I0001Ioi1lo = i4 + 1;
/* 37 */                    ii10Oo1I0.I000O01llI0(bArr, i4, (byte) i3);
/* 40 */                    return;
                        } else {
/* 43 */                    this.I0001Ioi1lo = i4 + 1;
/* 51 */                    ii10Oo1I0.I000O01llI0(bArr, i4, (byte) ((i3 | Barcode.FORMAT_ITF) & 255));
/* 54 */                    j >>>= 7;
                        }
                    }
                }

                public final int I001lllioOl() {
/* 5 */             return this.I0000oI00 - this.I0001Ioi1lo;
                }

                public final void I001lloI(byte[] bArr, int i, int i2) throws IOO1IOl1O10 {
                    try {
/* 5 */                 System.arraycopy(bArr, i, this.I0000O, this.I0001Ioi1lo, i2);
                        this.I0001Ioi1lo += i2;
                    } catch (IndexOutOfBoundsException e) {
/* 98 */                throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0001Ioi1lo), Integer.valueOf(this.I0000oI00), Integer.valueOf(i2)), e, 10);
                    }
                }
            }
