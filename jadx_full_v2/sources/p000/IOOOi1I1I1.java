            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.logging.Logger;
            
            public final class IOOOi1I1I1 {
                public static final Logger I0000oI00 = Logger.getLogger(IOOOi1I1I1.class.getName());
                public static final boolean I0001Ioi1lo = Ooil11Oi.I0000oI00;
                public iiOlilo0IIIl I00000oIO;
                public byte[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;

                public static int I00000oIO(int i, IIOI1Ii1I iIOI1Ii1I) {
/* 9 */             return I00000oOI(iIOI1Ii1I) + I000O01llI0(i);
                }

                public static int I00000oOI(IIOI1Ii1I iIOI1Ii1I) {
/* 1 */             int size = iIOI1Ii1I.size();
/* 9 */             return I000OOo1O(size) + size;
                }

                public static int I0000Il00O(int i) {
/* 5 */             return I000O01llI0(i) + 4;
                }

                public static int I0000O(int i) {
/* 5 */             return I000O01llI0(i) + 8;
                }

                public static int I0000oI00(int i, I01Iio10lo i01Iio10lo, OiOIiIO0 oiOIiIO0) {
/* 11 */            return i01Iio10lo.I00000oOI(oiOIiIO0) + (I000O01llI0(i) * 2);
                }

                public static int I0001Ioi1lo(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return I000OOo1O(i);
                    }
/* 8 */             return 10;
                }

                public static int I000II(String str) {
                    int length;
                    try {
/* 1 */                 length = Oolio1l.I00000oIO(str);
                    } catch (Oolii1 unused) {
/* 12 */                length = str.getBytes(Iool1iOO11.I00000oIO).length;
                    }
/* 17 */            return I000OOo1O(length) + length;
                }

                public static int I000O01llI0(int i) {
/* 3 */             return I000OOo1O(i << 3);
                }

                public static int I000OOo1O(int i) {
/* 3 */             if ((i & (-128)) == 0) {
/* 5 */                 return 1;
                    }
/* 9 */             if ((i & (-16384)) == 0) {
/* 11 */                return 2;
                    }
/* 16 */            if (((-2097152) & i) == 0) {
/* 18 */                return 3;
                    }
                    return (i & (-268435456)) == 0 ? 4 : 5;
                }

                public static int I000OiO(long j) {
                    int i;
/* 9 */             if (((-128) & j) == 0) {
/* 8 */                 return 1;
                    }
/* 14 */            if (j < 0) {
/* 16 */                return 10;
                    }
/* 27 */            if (((-34359738368L) & j) != 0) {
/* 31 */                j >>>= 28;
/* 32 */                i = 6;
                    } else {
/* 34 */                i = 2;
                    }
/* 41 */            if (((-2097152) & j) != 0) {
/* 43 */                i += 2;
/* 47 */                j >>>= 14;
                    }
                    return (j & (-16384)) != 0 ? i + 1 : i;
                }

                public static IOOOi1I1I1 I000iOII(byte[] bArr) {
/* 1 */             int length = bArr.length;
/* 4 */             IOOOi1I1I1 iOOOi1I1I1 = new IOOOi1I1I1();
/* 11 */            if (((bArr.length - length) | length) < 0) {
/* 42 */                OIiilo1Ool0o.I000l1("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(length)});
/* 45 */                return null;
                    }
/* 13 */            iOOOi1I1I1.I00000oOI = bArr;
/* 15 */            iOOOi1I1I1.I0000O = 0;
/* 17 */            iOOOi1I1I1.I0000Il00O = length;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            return iOOOi1I1I1;
                }

                public final void I000l1(byte b) throws IOO1IOl1O10 {
                    try {
/* 1 */                 byte[] bArr = this.I00000oOI;
/* 3 */                 int i = this.I0000O;
/* 7 */                 this.I0000O = i + 1;
/* 9 */                 bArr[i] = b;
                    } catch (IndexOutOfBoundsException e) {
/* 49 */                throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 1);
                    }
                }

                public final void I000lI(byte[] bArr, int i, int i2) {
                    try {
/* 5 */                 System.arraycopy(bArr, i, this.I00000oOI, this.I0000O, i2);
                        this.I0000O += i2;
                    } catch (IndexOutOfBoundsException e) {
/* 215 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), Integer.valueOf(i2)), e, 1);
                    }
                }

                public final void I000o00OoI0I(int i) throws IOO1IOl1O10 {
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
/* 186 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 1);
                    }
                }

                public final void I000oI1ioi(long j) throws IOO1IOl1O10 {
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
/* 186 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 1);
                    }
                }

                public final void I00100l0(int i) throws IOO1IOl1O10 {
/* 1 */             if (i >= 0) {
/* 3 */                 I0010I0i(i);
                    } else {
/* 8 */                 I0010o(i);
                    }
                }

                public final void I00100o1O0lo(int i, int i2) {
/* 4 */             I0010I0i((i << 3) | i2);
                }

                public final void I0010I0i(int i) {
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
/* 28 */                        bArr[i3] = (byte) ((i & 127) | Barcode.FORMAT_ITF);
/* 30 */                        i >>>= 7;
                            } catch (IndexOutOfBoundsException e) {
/* 186 */                       throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 1);
                            }
                        }
/* 186 */               throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(this.I0000Il00O), 1), e, 1);
                    }
                }

                public final void I0010o(long j) throws IOO1IOl1O10 {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             byte[] bArr = this.I00000oOI;
/* 12 */            if (!I0001Ioi1lo || i - this.I0000O < 10) {
                        while (true) {
/* 57 */                    long j2 = j & (-128);
/* 61 */                    int i2 = this.I0000O;
/* 63 */                    if (j2 == 0) {
/* 67 */                        this.I0000O = i2 + 1;
/* 71 */                        bArr[i2] = (byte) j;
/* 73 */                        return;
                            } else {
                                try {
/* 78 */                            this.I0000O = i2 + 1;
/* 86 */                            bArr[i2] = (byte) ((((int) j) & 127) | Barcode.FORMAT_ITF);
/* 88 */                            j >>>= 7;
                                } catch (IndexOutOfBoundsException e) {
/* 186 */                           throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(i), 1), e, 1);
                                }
                            }
/* 186 */                   throw new IOO1IOl1O10(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.I0000O), Integer.valueOf(i), 1), e, 1);
                        }
                    }
                    while (true) {
/* 22 */                long j3 = j & (-128);
/* 26 */                int i3 = this.I0000O;
/* 28 */                if (j3 == 0) {
/* 32 */                    this.I0000O = i3 + 1;
/* 37 */                    Ooil11Oi.I000l1(bArr, i3, (byte) j);
/* 40 */                    return;
                        } else {
/* 43 */                    this.I0000O = i3 + 1;
/* 52 */                    Ooil11Oi.I000l1(bArr, i3, (byte) ((((int) j) & 127) | Barcode.FORMAT_ITF));
/* 55 */                    j >>>= 7;
                        }
                    }
                }
            }
