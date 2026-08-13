            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public final class ilIO10iO {
                public static final Logger I0000oI00 = Logger.getLogger(ilIO10iO.class.getName());
                public static final boolean I0001Ioi1lo = l0II0IlI.I0000oI00;
                public i1IoOl I00000oIO;
                public byte[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;

                public static int I00000oIO(int i) {
/* 9 */             return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
                }

                public static int I00000oOI(long j) {
/* 9 */             return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
                }

                public static int I0010I0i(String str) {
                    int length;
                    try {
/* 1 */                 length = l0O1O1.I0000Il00O(str);
                    } catch (l0O00Oo0 unused) {
/* 12 */                length = str.getBytes(iloi1OI100li.I00000oIO).length;
                    }
/* 17 */            return I00000oIO(length) + length;
                }

                public final void I0000Il00O(byte b) throws IOO1IOl1O10 {
                    try {
/* 1 */                 byte[] bArr = this.I00000oOI;
/* 3 */                 int i = this.I0000O;
/* 7 */                 this.I0000O = i + 1;
/* 9 */                 bArr[i] = b;
                    } catch (IndexOutOfBoundsException e) {
/* 77 */                throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 12);
                    }
                }

                public final void I0000O(byte[] bArr, int i, int i2) {
                    try {
/* 5 */                 System.arraycopy(bArr, i, this.I00000oOI, this.I0000O, i2);
                        this.I0000O += i2;
                    } catch (IndexOutOfBoundsException e) {
/* 98 */                throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), Integer.valueOf(i2)), e, 12);
                    }
                }

                public final void I0000oI00(int i, il1oII0OlIo il1oii0olio) throws IOO1IOl1O10 {
/* 5 */             I000oI1ioi((i << 3) | 2);
/* 12 */            I000oI1ioi(il1oii0olio.I0001Ioi1lo());
/* 15 */            il1oii0olio.I0010I0i(this);
                }

                public final void I0001Ioi1lo(int i, int i2) throws IOO1IOl1O10 {
/* 5 */             I000oI1ioi((i << 3) | 5);
/* 8 */             I000II(i2);
                }

                public final void I000II(int i) throws IOO1IOl1O10 {
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
/* 168 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 12);
                    }
                }

                public final void I000O01llI0(int i, long j) throws IOO1IOl1O10 {
/* 5 */             I000oI1ioi((i << 3) | 1);
/* 8 */             I000OOo1O(j);
                }

                public final void I000OOo1O(long j) throws IOO1IOl1O10 {
                    try {
/* 1 */                 byte[] bArr = this.I00000oOI;
/* 3 */                 int i = this.I0000O;
/* 5 */                 int i2 = i + 1;
/* 7 */                 this.I0000O = i2;
/* 13 */                bArr[i] = (byte) (((int) j) & 255);
/* 15 */                int i3 = i + 2;
/* 17 */                this.I0000O = i3;
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
/* 168 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 12);
                    }
                }

                public final void I000OiO(int i, int i2) throws IOO1IOl1O10 {
/* 3 */             I000oI1ioi(i << 3);
/* 6 */             I000iOII(i2);
                }

                public final void I000iOII(int i) throws IOO1IOl1O10 {
/* 1 */             if (i >= 0) {
/* 3 */                 I000oI1ioi(i);
                    } else {
/* 8 */                 I00100o1O0lo(i);
                    }
                }

                public final void I000l1(int i, String str) throws IOO1IOl1O10 {
/* 5 */             I000oI1ioi((i << 3) | 2);
/* 8 */             int i2 = this.I0000O;
                    try {
/* 16 */                int iI00000oIO = I00000oIO(str.length() * 3);
/* 24 */                int iI00000oIO2 = I00000oIO(str.length());
/* 28 */                int i3 = this.I0000Il00O;
/* 30 */                byte[] bArr = this.I00000oOI;
/* 32 */                if (iI00000oIO2 != iI00000oIO) {
/* 61 */                    I000oI1ioi(l0O1O1.I0000Il00O(str));
/* 64 */                    int i4 = this.I0000O;
/* 71 */                    this.I0000O = l0O1O1.I00000oOI(str, bArr, i4, i3 - i4);
                        } else {
/* 34 */                    int i5 = i2 + iI00000oIO2;
/* 36 */                    this.I0000O = i5;
/* 39 */                    int iI00000oOI = l0O1O1.I00000oOI(str, bArr, i5, i3 - i5);
/* 43 */                    this.I0000O = i2;
/* 48 */                    I000oI1ioi((iI00000oOI - i2) - iI00000oIO2);
/* 51 */                    this.I0000O = iI00000oOI;
                        }
                    } catch (IndexOutOfBoundsException e) {
/* 81 */                throw new IOO1IOl1O10(e);
                    } catch (l0O00Oo0 e2) {
/* 82 */                this.I0000O = i2;
/* 94 */                I0000oI00.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
/* 99 */                byte[] bytes = str.getBytes(iloi1OI100li.I00000oIO);
                        try {
/* 103 */                   int length = bytes.length;
/* 104 */                   I000oI1ioi(length);
/* 108 */                   I0000O(bytes, 0, length);
                        } catch (IndexOutOfBoundsException e3) {
/* 332 */                   throw new IOO1IOl1O10(e3);
                        }
                    }
                }

                public final void I000lI(int i, int i2) throws IOO1IOl1O10 {
/* 4 */             I000oI1ioi((i << 3) | i2);
                }

                public final void I000o00OoI0I(int i, int i2) throws IOO1IOl1O10 {
/* 3 */             I000oI1ioi(i << 3);
/* 6 */             I000oI1ioi(i2);
                }

                public final void I000oI1ioi(int i) throws IOO1IOl1O10 {
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
/* 77 */                        throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 12);
                            }
                        }
/* 77 */                throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 12);
                    }
                }

                public final void I00100l0(int i, long j) throws IOO1IOl1O10 {
/* 3 */             I000oI1ioi(i << 3);
/* 6 */             I00100o1O0lo(j);
                }

                public final void I00100o1O0lo(long j) throws IOO1IOl1O10 {
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
/* 168 */                           throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(i), 1), e, 12);
                                }
                            }
/* 168 */                   throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(i), 1), e, 12);
                        }
                    }
                    while (true) {
/* 22 */                long j3 = j & (-128);
/* 26 */                int i3 = (int) j;
/* 27 */                int i4 = this.I0000O;
/* 29 */                if (j3 == 0) {
/* 33 */                    this.I0000O = i4 + 1;
/* 42 */                    l0II0IlI.I0000Il00O.I001lIiIIo1O(bArr, l0II0IlI.I0001Ioi1lo + i4, (byte) i3);
/* 45 */                    return;
                        }
/* 48 */                this.I0000O = i4 + 1;
/* 61 */                l0II0IlI.I0000Il00O.I001lIiIIo1O(bArr, l0II0IlI.I0001Ioi1lo + i4, (byte) ((i3 | Barcode.FORMAT_ITF) & 255));
/* 64 */                j >>>= 7;
                    }
                }
            }
