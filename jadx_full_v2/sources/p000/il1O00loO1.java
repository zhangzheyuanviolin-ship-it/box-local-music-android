            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public final class il1O00loO1 {
                public static final Logger I0000oI00 = Logger.getLogger(il1O00loO1.class.getName());
                public static final boolean I0001Ioi1lo = l00iIli.I0000oI00;
                public i11I1Ili I00000oIO;
                public byte[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;

                public static int I000lI(String str) {
                    int length;
                    try {
/* 1 */                 length = l011IIO.I0000Il00O(str);
                    } catch (l010lOli unused) {
/* 12 */                length = str.getBytes(ililOO0.I00000oIO).length;
                    }
/* 17 */            return I000o00OoI0I(length) + length;
                }

                public static int I000o00OoI0I(int i) {
/* 9 */             return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
                }

                public static int I000oI1ioi(long j) {
/* 9 */             return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
                }

                public static il1O00loO1 I00100l0(int i, byte[] bArr) {
/* 3 */             il1O00loO1 il1o00loo1 = new il1O00loO1();
/* 6 */             int length = bArr.length;
/* 11 */            if (((length - i) | i) < 0) {
/* 41 */                OIiilo1Ool0o.I000l1("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)});
/* 44 */                return null;
                    }
/* 13 */            il1o00loo1.I00000oOI = bArr;
/* 15 */            il1o00loo1.I0000O = 0;
/* 17 */            il1o00loo1.I0000Il00O = i;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            return il1o00loo1;
                }

                public final void I00000oIO(byte b) throws IOO1IOl1O10 {
                    try {
/* 1 */                 byte[] bArr = this.I00000oOI;
/* 3 */                 int i = this.I0000O;
/* 7 */                 this.I0000O = i + 1;
/* 9 */                 bArr[i] = b;
                    } catch (IndexOutOfBoundsException e) {
/* 77 */                throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 11);
                    }
                }

                public final void I00000oOI(int i, byte[] bArr) throws IOO1IOl1O10 {
                    try {
/* 6 */                 System.arraycopy(bArr, 0, this.I00000oOI, this.I0000O, i);
                        this.I0000O += i;
                    } catch (IndexOutOfBoundsException e) {
/* 106 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), Integer.valueOf(i)), e, 11);
                    }
                }

                public final void I0000Il00O(int i, iiooOi11li iioooi11li) throws IOO1IOl1O10 {
/* 5 */             I000OiO((i << 3) | 2);
/* 12 */            I000OiO(iioooi11li.I0000oI00());
/* 21 */            I00000oOI(iioooi11li.I0000oI00(), iioooi11li.I00iiI);
                }

                public final void I0000O(int i, int i2) throws IOO1IOl1O10 {
/* 5 */             I000OiO((i << 3) | 5);
/* 8 */             I0000oI00(i2);
                }

                public final void I0000oI00(int i) throws IOO1IOl1O10 {
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
/* 168 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 11);
                    }
                }

                public final void I0001Ioi1lo(int i, long j) throws IOO1IOl1O10 {
/* 5 */             I000OiO((i << 3) | 1);
/* 8 */             I000II(j);
                }

                public final void I000II(long j) throws IOO1IOl1O10 {
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
/* 168 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 11);
                    }
                }

                public final void I000O01llI0(int i, String str) throws IOO1IOl1O10 {
/* 5 */             I000OiO((i << 3) | 2);
/* 8 */             int i2 = this.I0000Il00O;
/* 10 */            byte[] bArr = this.I00000oOI;
/* 12 */            int i3 = this.I0000O;
                    try {
/* 20 */                int iI000o00OoI0I = I000o00OoI0I(str.length() * 3);
/* 28 */                int iI000o00OoI0I2 = I000o00OoI0I(str.length());
/* 32 */                if (iI000o00OoI0I2 != iI000o00OoI0I) {
/* 62 */                    I000OiO(l011IIO.I0000Il00O(str));
/* 65 */                    int i4 = this.I0000O;
/* 72 */                    this.I0000O = l011IIO.I00000oOI(str, bArr, i4, i2 - i4);
                        } else {
/* 34 */                    int i5 = i3 + iI000o00OoI0I2;
/* 36 */                    this.I0000O = i5;
/* 39 */                    int iI00000oOI = l011IIO.I00000oOI(str, bArr, i5, i2 - i5);
/* 43 */                    this.I0000O = i3;
/* 48 */                    I000OiO((iI00000oOI - i3) - iI000o00OoI0I2);
/* 51 */                    this.I0000O = iI00000oOI;
                        }
                    } catch (IndexOutOfBoundsException e) {
/* 82 */                throw new IOO1IOl1O10(e);
                    } catch (l010lOli e2) {
/* 83 */                this.I0000O = i3;
/* 95 */                I0000oI00.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
/* 100 */               byte[] bytes = str.getBytes(ililOO0.I00000oIO);
                        try {
/* 104 */                   int length = bytes.length;
/* 105 */                   I000OiO(length);
/* 108 */                   I00000oOI(length, bytes);
                        } catch (IndexOutOfBoundsException e3) {
/* 332 */                   throw new IOO1IOl1O10(e3);
                        }
                    }
                }

                public final void I000OOo1O(int i, int i2) {
/* 4 */             I000OiO((i << 3) | i2);
                }

                public final void I000OiO(int i) {
                    while (true) {
/* 1 */                 int i2 = i & (-128);
/* 3 */                 byte[] bArr = this.I00000oOI;
/* 5 */                 int i3 = this.I0000O;
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
/* 77 */                        throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 11);
                            }
                        }
/* 77 */                throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 11);
                    }
                }

                public final void I000iOII(int i, long j) throws IOO1IOl1O10 {
/* 3 */             I000OiO(i << 3);
/* 6 */             I000l1(j);
                }

                public final void I000l1(long j) throws IOO1IOl1O10 {
/* 1 */             byte[] bArr = this.I00000oOI;
/* 3 */             int i = this.I0000Il00O;
/* 12 */            if (!I0001Ioi1lo || i - this.I0000O < 10) {
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
/* 168 */                           throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(i), 1), e, 11);
                                }
                            }
/* 168 */                   throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(i), 1), e, 11);
                        }
                    }
                    while (true) {
/* 22 */                long j3 = j & (-128);
/* 26 */                int i3 = (int) j;
/* 27 */                int i4 = this.I0000O;
/* 29 */                if (j3 == 0) {
/* 33 */                    this.I0000O = i4 + 1;
/* 42 */                    l00iIli.I0000Il00O.I001lIiIIo1O(bArr, l00iIli.I0001Ioi1lo + i4, (byte) i3);
/* 45 */                    return;
                        }
/* 48 */                this.I0000O = i4 + 1;
/* 61 */                l00iIli.I0000Il00O.I001lIiIIo1O(bArr, l00iIli.I0001Ioi1lo + i4, (byte) ((i3 | Barcode.FORMAT_ITF) & 255));
/* 64 */                j >>>= 7;
                    }
                }
            }
