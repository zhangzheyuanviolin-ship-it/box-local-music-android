            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public final class i11I0o0ii {
                public static final Logger I0000oI00 = Logger.getLogger(i11I0o0ii.class.getName());
                public static final boolean I0001Ioi1lo = i11oI1O.I0000oI00;
                public i11I1Ili I00000oIO;
                public final byte[] I00000oOI;
                public final int I0000Il00O;
                public int I0000O;

                public i11I0o0ii(int i, byte[] bArr) {
/* 4 */             int length = bArr.length;
/* 9 */             if (((length - i) | i) < 0) {
/* 36 */                OIiilo1Ool0o.I000l1("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)});
/* 106 */               throw null;
                    }
/* 11 */            this.I00000oOI = bArr;
/* 13 */            this.I0000O = 0;
/* 15 */            this.I0000Il00O = i;
                }

                public static int I00000oIO(String str) {
                    int length;
                    try {
/* 1 */                 length = i11oIi1.I0000Il00O(str);
                    } catch (i11oIOIIoOO unused) {
/* 12 */                length = str.getBytes(i11Oo1I1i.I00000oIO).length;
                    }
/* 17 */            return I00000oOI(length) + length;
                }

                public static int I00000oOI(int i) {
/* 9 */             return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
                }

                public static int I0000Il00O(long j) {
/* 9 */             return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
                }

                public final void I0000O(byte b) {
                    try {
/* 1 */                 byte[] bArr = this.I00000oOI;
/* 3 */                 int i = this.I0000O;
/* 7 */                 this.I0000O = i + 1;
/* 9 */                 bArr[i] = b;
                    } catch (IndexOutOfBoundsException e) {
/* 77 */                throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 8);
                    }
                }

                public final void I0000oI00(int i, byte[] bArr) {
                    try {
/* 6 */                 System.arraycopy(bArr, 0, this.I00000oOI, this.I0000O, i);
                        this.I0000O += i;
                    } catch (IndexOutOfBoundsException e) {
/* 106 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), Integer.valueOf(i)), e, 8);
                    }
                }

                public final void I0001Ioi1lo(int i, i11I0IiII0Ol i11i0iiii0ol) {
/* 5 */             I00100o1O0lo((i << 3) | 2);
/* 8 */             I000II(i11i0iiii0ol);
                }

                public final void I000II(i11I0IiII0Ol i11i0iiii0ol) {
/* 5 */             I00100o1O0lo(i11i0iiii0ol.I0000oI00());
/* 8 */             i111ol i111olVar = (i111ol) i11i0iiii0ol;
/* 16 */            I0000oI00(i111olVar.I0000oI00(), i111olVar.I00iiO);
                }

                public final void I000O01llI0(int i, int i2) {
/* 5 */             I00100o1O0lo((i << 3) | 5);
/* 8 */             I000OOo1O(i2);
                }

                public final void I000OOo1O(int i) {
                    try {
/* 1 */                 byte[] bArr = this.I00000oOI;
/* 3 */                 int i2 = this.I0000O;
/* 5 */                 int i3 = i2 + 1;
/* 7 */                 this.I0000O = i3;
/* 12 */                bArr[i2] = (byte) (i & 255);
/* 14 */                int i4 = i2 + 2;
/* 16 */                this.I0000O = i4;
/* 23 */                bArr[i3] = (byte) ((i >> 8) & 255);
/* 25 */                int i5 = i2 + 3;
/* 27 */                this.I0000O = i5;
/* 34 */                bArr[i4] = (byte) ((i >> 16) & 255);
/* 38 */                this.I0000O = i2 + 4;
/* 45 */                bArr[i5] = (byte) ((i >> 24) & 255);
                    } catch (IndexOutOfBoundsException e) {
/* 168 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 8);
                    }
                }

                public final void I000OiO(int i, long j) {
/* 5 */             I00100o1O0lo((i << 3) | 1);
/* 8 */             I000iOII(j);
                }

                public final void I000iOII(long j) {
                    try {
/* 3 */                 byte[] bArr = this.I00000oOI;
/* 5 */                 int i = this.I0000O;
/* 7 */                 int i2 = i + 1;
/* 9 */                 this.I0000O = i2;
/* 15 */                bArr[i] = (byte) (((int) j) & 255);
/* 17 */                int i3 = i + 2;
/* 19 */                this.I0000O = i3;
/* 27 */                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
/* 29 */                int i4 = i + 3;
/* 31 */                this.I0000O = i4;
/* 41 */                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
/* 43 */                int i5 = i + 4;
/* 45 */                this.I0000O = i5;
/* 55 */                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
/* 57 */                int i6 = i + 5;
/* 59 */                this.I0000O = i6;
/* 69 */                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
/* 71 */                int i7 = i + 6;
/* 73 */                this.I0000O = i7;
/* 83 */                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
/* 85 */                int i8 = i + 7;
/* 87 */                this.I0000O = i8;
/* 97 */                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
/* 100 */               this.I0000O = i + 8;
/* 109 */               bArr[i8] = (byte) (((int) (j >> 56)) & 255);
                    } catch (IndexOutOfBoundsException e) {
/* 168 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 8);
                    }
                }

                public final void I000l1(int i, int i2) {
/* 3 */             I00100o1O0lo(i << 3);
/* 6 */             I000lI(i2);
                }

                public final void I000lI(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 I00100o1O0lo(i);
                    } else {
/* 8 */                 I0010o(i);
                    }
                }

                public final void I000o00OoI0I(String str) {
/* 1 */             int i = this.I0000O;
                    try {
/* 9 */                 int iI00000oOI = I00000oOI(str.length() * 3);
/* 17 */                int iI00000oOI2 = I00000oOI(str.length());
/* 21 */                int i2 = this.I0000Il00O;
/* 23 */                byte[] bArr = this.I00000oOI;
/* 25 */                if (iI00000oOI2 != iI00000oOI) {
/* 54 */                    I00100o1O0lo(i11oIi1.I0000Il00O(str));
/* 57 */                    int i3 = this.I0000O;
/* 64 */                    this.I0000O = i11oIi1.I00000oOI(str, bArr, i3, i2 - i3);
                        } else {
/* 27 */                    int i4 = i + iI00000oOI2;
/* 29 */                    this.I0000O = i4;
/* 32 */                    int iI00000oOI3 = i11oIi1.I00000oOI(str, bArr, i4, i2 - i4);
/* 36 */                    this.I0000O = i;
/* 41 */                    I00100o1O0lo((iI00000oOI3 - i) - iI00000oOI2);
/* 44 */                    this.I0000O = iI00000oOI3;
                        }
                    } catch (i11oIOIIoOO e) {
/* 75 */                this.I0000O = i;
/* 87 */                I0000oI00.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
/* 92 */                byte[] bytes = str.getBytes(i11Oo1I1i.I00000oIO);
                        try {
/* 96 */                    int length = bytes.length;
/* 97 */                    I00100o1O0lo(length);
/* 100 */                   I0000oI00(length, bytes);
                        } catch (IndexOutOfBoundsException e2) {
/* 168 */                   throw new IOO1IOl1O10(e2);
                        }
                    } catch (IndexOutOfBoundsException e3) {
/* 74 */                throw new IOO1IOl1O10(e3);
                    }
                }

                public final void I000oI1ioi(int i, int i2) {
/* 4 */             I00100o1O0lo((i << 3) | i2);
                }

                public final void I00100l0(int i, int i2) {
/* 3 */             I00100o1O0lo(i << 3);
/* 6 */             I00100o1O0lo(i2);
                }

                public final void I00100o1O0lo(int i) {
                    while (true) {
/* 1 */                 int i2 = i & (-128);
/* 3 */                 int i3 = this.I0000O;
/* 5 */                 byte[] bArr = this.I00000oOI;
/* 7 */                 if (i2 == 0) {
/* 11 */                    this.I0000O = i3 + 1;
/* 14 */                    bArr[i3] = (byte) i;
/* 16 */                    return;
                        } else {
                            try {
/* 21 */                        this.I0000O = i3 + 1;
/* 28 */                        bArr[i3] = (byte) ((i | Barcode.FORMAT_ITF) & 255);
/* 30 */                        i >>>= 7;
                            } catch (IndexOutOfBoundsException e) {
/* 77 */                        throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 8);
                            }
                        }
/* 77 */                throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 8);
                    }
                }

                public final void I0010I0i(int i, long j) {
/* 3 */             I00100o1O0lo(i << 3);
/* 6 */             I0010o(j);
                }

                public final void I0010o(long j) {
/* 1 */             boolean z = I0001Ioi1lo;
/* 4 */             byte[] bArr = this.I00000oOI;
/* 10 */            int i = this.I0000Il00O;
/* 12 */            if (!z || i - this.I0000O < 10) {
                        while (true) {
/* 66 */                    long j2 = j & (-128);
/* 70 */                    int i2 = this.I0000O;
/* 72 */                    if (j2 == 0) {
/* 76 */                        this.I0000O = i2 + 1;
/* 80 */                        bArr[i2] = (byte) j;
/* 82 */                        return;
                            } else {
                                try {
/* 87 */                            this.I0000O = i2 + 1;
/* 95 */                            bArr[i2] = (byte) ((((int) j) | Barcode.FORMAT_ITF) & 255);
/* 97 */                            j >>>= 7;
                                } catch (IndexOutOfBoundsException e) {
/* 168 */                           throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(i), 1), e, 8);
                                }
                            }
/* 168 */                   throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(i), 1), e, 8);
                        }
                    }
                    while (true) {
/* 22 */                long j3 = j & (-128);
/* 26 */                int i3 = (int) j;
/* 27 */                int i4 = this.I0000O;
/* 29 */                if (j3 == 0) {
/* 33 */                    this.I0000O = i4 + 1;
/* 42 */                    i11oI1O.I0000Il00O.I000o00OoI0I(bArr, i11oI1O.I0001Ioi1lo + i4, (byte) i3);
/* 45 */                    return;
                        }
/* 48 */                this.I0000O = i4 + 1;
/* 61 */                i11oI1O.I0000Il00O.I000o00OoI0I(bArr, i11oI1O.I0001Ioi1lo + i4, (byte) ((i3 | Barcode.FORMAT_ITF) & 255));
/* 64 */                j >>>= 7;
                    }
                }
            }
