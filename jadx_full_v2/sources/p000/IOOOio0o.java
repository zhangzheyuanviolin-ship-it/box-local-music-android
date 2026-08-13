            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public final class IOOOio0o {
                public static final Logger I0001Ioi1lo = Logger.getLogger(IOOOio0o.class.getName());
                public static final boolean I000II = OoilIIl.I0000oI00;
                public IIOOoll I00000oIO;
                public byte[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public OOl1lI0oI I0000oI00;

                public static int I0001Ioi1lo(int i, IIO1ooI iIO1ooI) {
/* 1 */             int iI000O01llI0 = I000O01llI0(i);
/* 5 */             int size = iIO1ooI.size();
/* 14 */            return I000OOo1O(size) + size + iI000O01llI0;
                }

                public static int I000II(String str) {
                    int length;
                    try {
/* 1 */                 length = Ooll0IoO.I00000oIO(str);
                    } catch (Oolio1Illi00 unused) {
/* 12 */                length = str.getBytes(IoolIIolo1lI.I00000oIO).length;
                    }
/* 17 */            return I000OOo1O(length) + length;
                }

                public static int I000O01llI0(int i) {
/* 3 */             return I000OOo1O(i << 3);
                }

                public static int I000OOo1O(int i) {
/* 9 */             return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
                }

                public static int I000OiO(long j) {
/* 9 */             return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
                }

                public final void I00000oIO(int i) {
/* 1 */             byte[] bArr = this.I00000oOI;
/* 3 */             int i2 = this.I0000O;
/* 5 */             int i3 = i2 + 1;
/* 7 */             this.I0000O = i3;
/* 12 */            bArr[i2] = (byte) (i & 255);
/* 14 */            int i4 = i2 + 2;
/* 16 */            this.I0000O = i4;
/* 23 */            bArr[i3] = (byte) ((i >> 8) & 255);
/* 25 */            int i5 = i2 + 3;
/* 27 */            this.I0000O = i5;
/* 34 */            bArr[i4] = (byte) ((i >> 16) & 255);
/* 38 */            this.I0000O = i2 + 4;
/* 45 */            bArr[i5] = (byte) ((i >> 24) & 255);
                }

                public final void I00000oOI(long j) {
/* 1 */             byte[] bArr = this.I00000oOI;
/* 3 */             int i = this.I0000O;
/* 5 */             int i2 = i + 1;
/* 7 */             this.I0000O = i2;
/* 15 */            bArr[i] = (byte) (j & 255);
/* 17 */            int i3 = i + 2;
/* 19 */            this.I0000O = i3;
/* 28 */            bArr[i2] = (byte) ((j >> 8) & 255);
/* 30 */            int i4 = i + 3;
/* 32 */            this.I0000O = i4;
/* 41 */            bArr[i3] = (byte) ((j >> 16) & 255);
/* 43 */            int i5 = i + 4;
/* 45 */            this.I0000O = i5;
/* 54 */            bArr[i4] = (byte) (255 & (j >> 24));
/* 56 */            int i6 = i + 5;
/* 58 */            this.I0000O = i6;
/* 68 */            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
/* 70 */            int i7 = i + 6;
/* 72 */            this.I0000O = i7;
/* 82 */            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
/* 84 */            int i8 = i + 7;
/* 86 */            this.I0000O = i8;
/* 96 */            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
/* 99 */            this.I0000O = i + 8;
/* 109 */           bArr[i8] = (byte) (((int) (j >> 56)) & 255);
                }

                public final void I0000Il00O(int i, int i2) {
/* 4 */             I0000O((i << 3) | i2);
                }

                public final void I0000O(int i) {
/* 1 */             byte[] bArr = this.I00000oOI;
/* 5 */             if (I000II) {
                        while (true) {
/* 7 */                     int i2 = i & (-128);
/* 9 */                     int i3 = this.I0000O;
/* 11 */                    if (i2 == 0) {
/* 15 */                        this.I0000O = i3 + 1;
/* 19 */                        OoilIIl.I000OiO(bArr, i3, (byte) i);
/* 22 */                        return;
                            } else {
/* 25 */                        this.I0000O = i3 + 1;
/* 33 */                        OoilIIl.I000OiO(bArr, i3, (byte) ((i | Barcode.FORMAT_ITF) & 255));
/* 36 */                        i >>>= 7;
                            }
                        }
                    } else {
                        while (true) {
/* 39 */                    int i4 = i & (-128);
/* 41 */                    int i5 = this.I0000O;
/* 43 */                    if (i4 == 0) {
/* 47 */                        this.I0000O = i5 + 1;
/* 50 */                        bArr[i5] = (byte) i;
/* 52 */                        return;
                            } else {
/* 55 */                        this.I0000O = i5 + 1;
/* 62 */                        bArr[i5] = (byte) ((i | Barcode.FORMAT_ITF) & 255);
/* 64 */                        i >>>= 7;
                            }
                        }
                    }
                }

                public final void I0000oI00(long j) {
/* 1 */             byte[] bArr = this.I00000oOI;
/* 10 */            if (I000II) {
                        while (true) {
/* 12 */                    long j2 = j & (-128);
/* 16 */                    int i = this.I0000O;
/* 18 */                    if (j2 == 0) {
/* 22 */                        this.I0000O = i + 1;
/* 27 */                        OoilIIl.I000OiO(bArr, i, (byte) j);
/* 30 */                        return;
                            } else {
/* 33 */                        this.I0000O = i + 1;
/* 42 */                        OoilIIl.I000OiO(bArr, i, (byte) ((((int) j) | Barcode.FORMAT_ITF) & 255));
/* 45 */                        j >>>= 7;
                            }
                        }
                    } else {
                        while (true) {
/* 47 */                    long j3 = j & (-128);
/* 51 */                    int i2 = this.I0000O;
/* 53 */                    if (j3 == 0) {
/* 57 */                        this.I0000O = i2 + 1;
/* 61 */                        bArr[i2] = (byte) j;
/* 63 */                        return;
                            } else {
/* 66 */                        this.I0000O = i2 + 1;
/* 74 */                        bArr[i2] = (byte) ((((int) j) | Barcode.FORMAT_ITF) & 255);
/* 76 */                        j >>>= 7;
                            }
                        }
                    }
                }

                public final void I000iOII() throws IOException {
/* 8 */             this.I0000oI00.write(this.I00000oOI, 0, this.I0000O);
/* 11 */            this.I0000O = 0;
                }

                public final void I000l1(int i) throws IOException {
/* 6 */             if (this.I0000Il00O - this.I0000O < i) {
/* 8 */                 I000iOII();
                    }
                }

                public final void I000lI(byte b) throws IOException {
/* 5 */             if (this.I0000O == this.I0000Il00O) {
/* 7 */                 I000iOII();
                    }
/* 10 */            byte[] bArr = this.I00000oOI;
/* 12 */            int i = this.I0000O;
/* 16 */            this.I0000O = i + 1;
/* 18 */            bArr[i] = b;
                }

                public final void I000o00OoI0I(byte[] bArr, int i, int i2) throws IOException {
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
/* 27 */            I000iOII();
/* 30 */            if (i7 > i3) {
/* 41 */                this.I0000oI00.write(bArr, i6, i7);
                    } else {
/* 33 */                System.arraycopy(bArr, i6, bArr2, 0, i7);
/* 36 */                this.I0000O = i7;
                    }
                }

                public final void I000oI1ioi(int i, boolean z) throws IOException {
/* 3 */             I000l1(11);
/* 7 */             I0000Il00O(i, 0);
/* 10 */            byte b = z ? (byte) 1 : (byte) 0;
/* 11 */            byte[] bArr = this.I00000oOI;
/* 13 */            int i2 = this.I0000O;
/* 17 */            this.I0000O = i2 + 1;
/* 19 */            bArr[i2] = b;
                }

                public final void I00100l0(int i, IIO1ooI iIO1ooI) throws IOException {
/* 2 */             I001lllioOl(i, 2);
/* 5 */             I00100o1O0lo(iIO1ooI);
                }

                public final void I00100o1O0lo(IIO1ooI iIO1ooI) throws IOException {
/* 5 */             I00II0Ol1O0l(iIO1ooI.size());
/* 18 */            I001i1lo1io(iIO1ooI.I00iiI, iIO1ooI.I000OOo1O(), iIO1ooI.size());
                }

                public final void I0010I0i(int i, int i2) throws IOException {
/* 3 */             I000l1(14);
/* 7 */             I0000Il00O(i, 5);
/* 10 */            I00000oIO(i2);
                }

                public final void I0010o(int i) throws IOException {
/* 2 */             I000l1(4);
/* 5 */             I00000oIO(i);
                }

                public final void I00111O(int i, long j) throws IOException {
/* 3 */             I000l1(18);
/* 7 */             I0000Il00O(i, 1);
/* 10 */            I00000oOI(j);
                }

                public final void I001IIilI0O(long j) throws IOException {
/* 3 */             I000l1(8);
/* 6 */             I00000oOI(j);
                }

                public final void I001IO000(int i, int i2) throws IOException {
/* 3 */             I000l1(20);
/* 7 */             I0000Il00O(i, 0);
/* 10 */            if (i2 >= 0) {
/* 12 */                I0000O(i2);
                    } else {
/* 17 */                I0000oI00(i2);
                    }
                }

                public final void I001i1O0Ol(int i) throws IOException {
/* 1 */             if (i >= 0) {
/* 3 */                 I00II0Ol1O0l(i);
                    } else {
/* 8 */                 I00IO1(i);
                    }
                }

                public final void I001i1lo1io(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             I000o00OoI0I(bArr, i, i2);
                }

                public final void I001iOo1i0O(int i, I01Ilo0i i01Ilo0i, OiOIlIo oiOIlIo) throws IOException {
/* 2 */             I001lllioOl(i, 2);
/* 9 */             I00II0Ol1O0l(i01Ilo0i.I00000oIO(oiOIlIo));
/* 14 */            oiOIlIo.I000O01llI0(i01Ilo0i, this.I00000oIO);
                }

                public final void I001l0I00(int i, String str) throws IOException {
/* 2 */             I001lllioOl(i, 2);
/* 5 */             I001lIiIIo1O(str);
                }

                public final void I001lIiIIo1O(String str) throws IOException {
/* 1 */             byte[] bArr = this.I00000oOI;
/* 3 */             int i = this.I0000Il00O;
                    try {
/* 10 */                int length = str.length() * 3;
/* 12 */                int iI000OOo1O = I000OOo1O(length);
/* 16 */                int i2 = iI000OOo1O + length;
/* 18 */                if (i2 > i) {
/* 20 */                    byte[] bArr2 = new byte[length];
/* 24 */                    int iI00000oOI = Ooll0IoO.I00000oIO.I00000oOI(str, bArr2, 0, length);
/* 28 */                    I00II0Ol1O0l(iI00000oOI);
/* 31 */                    I000o00OoI0I(bArr2, 0, iI00000oOI);
/* 34 */                    return;
                        }
/* 41 */                if (i2 > i - this.I0000O) {
/* 43 */                    I000iOII();
                        }
/* 50 */                int iI000OOo1O2 = I000OOo1O(str.length());
/* 54 */                int i3 = this.I0000O;
                        try {
/* 56 */                    if (iI000OOo1O2 == iI000OOo1O) {
/* 58 */                        int i4 = i3 + iI000OOo1O2;
/* 60 */                        this.I0000O = i4;
/* 65 */                        int iI00000oOI2 = Ooll0IoO.I00000oIO.I00000oOI(str, bArr, i4, i - i4);
/* 69 */                        this.I0000O = i3;
/* 74 */                        I0000O((iI00000oOI2 - i3) - iI000OOo1O2);
/* 77 */                        this.I0000O = iI00000oOI2;
                            } else {
/* 84 */                        int iI00000oIO = Ooll0IoO.I00000oIO(str);
/* 88 */                        I0000O(iI00000oIO);
/* 99 */                        this.I0000O = Ooll0IoO.I00000oIO.I00000oOI(str, bArr, this.I0000O, iI00000oIO);
                            }
                        } catch (Oolio1Illi00 e) {
/* 108 */                   this.I0000O = i3;
/* 110 */                   throw e;
                        } catch (ArrayIndexOutOfBoundsException e2) {
/* 107 */                   throw new IOO1IOl1O10((IndexOutOfBoundsException) e2);
                        }
                    } catch (Oolio1Illi00 e3) {
/* 117 */               I0001Ioi1lo.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
/* 122 */               byte[] bytes = str.getBytes(IoolIIolo1lI.I00000oIO);
                        try {
/* 127 */                   I00II0Ol1O0l(bytes.length);
/* 131 */                   I001i1lo1io(bytes, 0, bytes.length);
                        } catch (IndexOutOfBoundsException e4) {
/* 168 */                   throw new IOO1IOl1O10(e4);
                        }
                    }
                }

                public final void I001lllioOl(int i, int i2) {
/* 4 */             I00II0Ol1O0l((i << 3) | i2);
                }

                public final void I001lloI(int i, int i2) throws IOException {
/* 3 */             I000l1(20);
/* 7 */             I0000Il00O(i, 0);
/* 10 */            I0000O(i2);
                }

                public final void I00II0Ol1O0l(int i) throws IOException {
/* 2 */             I000l1(5);
/* 5 */             I0000O(i);
                }

                public final void I00II0oii1o(int i, long j) throws IOException {
/* 3 */             I000l1(20);
/* 7 */             I0000Il00O(i, 0);
/* 10 */            I0000oI00(j);
                }

                public final void I00IO1(long j) throws IOException {
/* 3 */             I000l1(10);
/* 6 */             I0000oI00(j);
                }
            }
