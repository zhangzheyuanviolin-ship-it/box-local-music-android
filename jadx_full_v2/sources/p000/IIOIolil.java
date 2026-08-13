            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.EOFException;
            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.Arrays;
            
/* 47 */    public final class IIOIolil extends FilterInputStream {
                public static final short[][] I00o0iI0io1 = {new short[]{2, 3}, new short[]{2, 3}, new short[]{2, 3}, new short[]{3}, new short[]{4, 5}, new short[]{4, 5, 7}, new short[]{4, 7}, new short[]{24}, new short[]{23, 24, 55, 8, 15}, new short[]{23, 24, 40, 55, 103, 104, 108, 8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31, 36, 39, 40, 43, 44, 51, 52, 53, 55, 56, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 200, 201, 202, 203, 204, 205, 210, 211, 212, 213, 214, 215, 218, 219}, new short[]{74, 75, 76, 77, 82, 83, 84, 85, 90, 91, 100, 101, 108, 109, 114, 115, 116, 117, 118, 119}};
                public static final short[][] I00o0l1o1o0 = {new short[]{3, 2}, new short[]{1, 4}, new short[]{6, 5}, new short[]{7}, new short[]{9, 8}, new short[]{10, 11, 12}, new short[]{13, 14}, new short[]{15}, new short[]{16, 17, 0, 18, 64}, new short[]{24, 25, 23, 22, 19, 20, 21, 1792, 1856, 1920}, new short[]{1984, 2048, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560, 52, 55, 56, 59, 60, 320, 384, 448, 53, 54, 50, 51, 44, 45, 46, 47, 57, 58, 61, 256, 48, 49, 62, 63, 30, 31, 32, 33, 40, 41, 128, 192, 26, 27, 28, 29, 34, 35, 36, 37, 38, 39, 42, 43}, new short[]{640, 704, 768, 832, 1280, 1344, 1408, 1472, 1536, 1600, 1664, 1728, 512, 576, 896, 960, 1024, 1088, 1152, 1216}};
                public static final short[][] I00o101lO = {new short[]{7, 8, 11, 12, 14, 15}, new short[]{18, 19, 20, 27, 7, 8}, new short[]{23, 24, 42, 43, 3, 52, 53, 7, 8}, new short[]{19, 23, 24, 36, 39, 40, 43, 3, 55, 4, 8, 12}, new short[]{18, 19, 20, 21, 22, 23, 26, 27, 2, 36, 37, 40, 41, 42, 43, 44, 45, 3, 50, 51, 52, 53, 54, 55, 4, 74, 75, 5, 82, 83, 84, 85, 88, 89, 90, 91, 100, 101, 103, 104, 10, 11}, new short[]{152, 153, 154, 155, 204, 205, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219}, new short[0], new short[]{8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31}};
                public static final short[][] I00oI0i = {new short[]{2, 3, 4, 5, 6, 7}, new short[]{128, 8, 9, 64, 10, 11}, new short[]{192, 1664, 16, 17, 13, 14, 15, 1, 12}, new short[]{26, 21, 28, 27, 18, 24, 25, 22, 256, 23, 20, 19}, new short[]{33, 34, 35, 36, 37, 38, 31, 32, 29, 53, 54, 39, 40, 41, 42, 43, 44, 30, 61, 62, 63, 0, 320, 384, 45, 59, 60, 46, 49, 50, 51, 52, 55, 56, 57, 58, 448, 512, 640, 576, 47, 48}, new short[]{1472, 1536, 1600, 1728, 704, 768, 832, 896, 960, 1024, 1088, 1152, 1216, 1280, 1344, 1408}, new short[0], new short[]{1792, 1856, 1920}, new short[]{1984, 2048, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560}};
                public static final IIOIoIO00l0i I00oII;
                public static final IIOIoIO00l0i I00oIiI10;
                public static final I0IIiO0iI I00oO101o;
                public static final I0IIiO0iI I00oOio10iI1;
                public static final I0IIiO0iI I00ol1;
                public static final I0IIiO0iI I00olI;
                public final int I00iOIl;
                public final byte[] I00iiI;
                public final boolean I00iiO;
                public final boolean I00iio;
                public final int I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public int[] I00ioIO;
                public int[] I00l0I0l0lO1;
                public int I00l0OO0IO;
                public int I00li1OI;
                public int I00ll1;
                public int I00lli11;
                public int I00lll10;

                static {
/* 316 */           IIOIoIO00l0i iIOIoIO00l0i = new IIOIoIO00l0i();
/* 319 */           I00oII = iIOIoIO00l0i;
/* 321 */           iIOIoIO00l0i.I0000oI00 = true;
/* 325 */           iIOIoIO00l0i.I0000Il00O = -2000;
/* 329 */           IIOIoIO00l0i iIOIoIO00l0i2 = new IIOIoIO00l0i();
/* 332 */           I00oIiI10 = iIOIoIO00l0i2;
/* 336 */           iIOIoIO00l0i2.I0000Il00O = -1000;
/* 338 */           iIOIoIO00l0i2.I00000oIO = iIOIoIO00l0i2;
/* 340 */           iIOIoIO00l0i2.I00000oOI = iIOIoIO00l0i;
/* 344 */           I0IIiO0iI i0IIiO0iI = new I0IIiO0iI();
/* 347 */           I00ol1 = i0IIiO0iI;
                    try {
/* 350 */               i0IIiO0iI.I00100l0(0, iIOIoIO00l0i2);
/* 353 */               i0IIiO0iI.I00100l0(1, iIOIoIO00l0i);
/* 361 */               I00oO101o = new I0IIiO0iI();
/* 364 */               for (int i = 0; i < 12; i++) {
/* 366 */                   int i2 = 0;
                            while (true) {
                                try {
/* 369 */                           short[] sArr = I00o0iI0io1[i];
/* 372 */                           if (i2 < sArr.length) {
/* 386 */                               I00oO101o.I000oI1ioi(i + 2, sArr[i2], I00o0l1o1o0[i][i2]);
/* 389 */                               i2++;
                                    }
                                } catch (IOException e) {
/* 518 */                           I000II.I000O01llI0(e);
/* 521 */                           return;
                                }
                            }
                        }
/* 395 */               I0IIiO0iI i0IIiO0iI2 = I00oO101o;
/* 400 */               i0IIiO0iI2.I00100l0(0, I00oIiI10);
/* 405 */               i0IIiO0iI2.I00100l0(1, I00oII);
/* 413 */               I00oOio10iI1 = new I0IIiO0iI();
/* 418 */               for (int i3 = 0; i3 < 9; i3++) {
/* 420 */                   int i4 = 0;
                            while (true) {
                                try {
/* 423 */                           short[] sArr2 = I00o101lO[i3];
/* 426 */                           if (i4 < sArr2.length) {
/* 440 */                               I00oOio10iI1.I000oI1ioi(i3 + 4, sArr2[i4], I00oI0i[i3][i4]);
/* 443 */                               i4++;
                                    }
                                } catch (IOException e2) {
/* 513 */                           I000II.I000O01llI0(e2);
/* 516 */                           return;
                                }
                            }
                        }
/* 449 */               I0IIiO0iI i0IIiO0iI3 = I00oOio10iI1;
/* 454 */               i0IIiO0iI3.I00100l0(0, I00oIiI10);
/* 459 */               i0IIiO0iI3.I00100l0(1, I00oII);
/* 464 */               I0IIiO0iI i0IIiO0iI4 = new I0IIiO0iI();
/* 467 */               I00olI = i0IIiO0iI4;
                        try {
/* 472 */                   i0IIiO0iI4.I000oI1ioi(4, 1, -3000);
/* 477 */                   i0IIiO0iI4.I000oI1ioi(3, 1, -4000);
/* 481 */                   i0IIiO0iI4.I000oI1ioi(1, 1, 0);
/* 484 */                   i0IIiO0iI4.I000oI1ioi(3, 3, 1);
/* 487 */                   i0IIiO0iI4.I000oI1ioi(6, 3, 2);
/* 491 */                   i0IIiO0iI4.I000oI1ioi(7, 3, 3);
/* 495 */                   i0IIiO0iI4.I000oI1ioi(3, 2, -1);
/* 499 */                   i0IIiO0iI4.I000oI1ioi(6, 2, -2);
/* 503 */                   i0IIiO0iI4.I000oI1ioi(7, 2, -3);
                        } catch (IOException e3) {
/* 508 */                   I000II.I000O01llI0(e3);
                        }
                    } catch (IOException e4) {
/* 523 */               I000II.I000O01llI0(e4);
                    }
                }

                public IIOIolil(InputStream inputStream, int i, int i2, long j, boolean z) {
/* 1 */             super(inputStream);
/* 5 */             this.I00ll1 = 0;
/* 8 */             this.I00lli11 = -1;
/* 10 */            this.I00lll10 = -1;
/* 12 */            this.I00iOIl = i;
/* 14 */            this.I00ilI0I1 = i2;
/* 22 */            this.I00iiI = new byte[(i + 7) / 8];
/* 25 */            int i3 = i + 2;
/* 28 */            this.I00ioIO = new int[i3];
/* 32 */            this.I00l0I0l0lO1 = new int[i3];
/* 34 */            if (i2 == 2) {
/* 73 */                this.I00iio = z;
/* 75 */                this.I00iiO = false;
                    } else if (i2 == 3) {
/* 58 */                this.I00iio = z;
/* 70 */                this.I00iiO = (1 & j) != 0;
                    } else {
/* 40 */                if (i2 != 4) {
/* 53 */                    I000II.I000iOII(Oi010OO0.I000oI1ioi(i2, "Illegal parameter: "));
/* 57 */                    throw null;
                        }
/* 42 */                this.I00iio = z;
/* 44 */                this.I00iiO = false;
                    }
                }

                public final void I00000oIO() {
/* 1 */             int iI000O01llI0 = 0;
/* 2 */             this.I00li1OI = 0;
/* 4 */             boolean z = true;
/* 35 */            do {
/* 20 */                iI000O01llI0 += z ? I000O01llI0(I00oOio10iI1) : I000O01llI0(I00oO101o);
/* 21 */                int[] iArr = this.I00l0I0l0lO1;
/* 23 */                int i = this.I00li1OI;
/* 27 */                this.I00li1OI = i + 1;
/* 29 */                iArr[i] = iI000O01llI0;
                        z = !z;
/* 35 */            } while (iI000O01llI0 < this.I00iOIl);
                }

                public final void I0000Il00O() {
                    int i;
/* 3 */             this.I00l0OO0IO = this.I00li1OI;
/* 5 */             int[] iArr = this.I00l0I0l0lO1;
/* 9 */             this.I00l0I0l0lO1 = this.I00ioIO;
/* 11 */            this.I00ioIO = iArr;
/* 13 */            int iI000O01llI0 = 0;
/* 14 */            this.I00li1OI = 0;
/* 17 */            boolean z = true;
                    while (true) {
/* 18 */                int i2 = this.I00iOIl;
/* 20 */                if (iI000O01llI0 >= i2) {
/* 245 */                   return;
                        }
/* 26 */                IIOIoIO00l0i iIOIoIO00l0i = (IIOIoIO00l0i) I00olI.I00iiI;
                        while (true) {
/* 37 */                    iIOIoIO00l0i = I001i1lo1io() ? iIOIoIO00l0i.I00000oOI : iIOIoIO00l0i.I00000oIO;
/* 39 */                    if (iIOIoIO00l0i != null) {
/* 44 */                        if (iIOIoIO00l0i.I0000oI00) {
/* 46 */                            int i3 = iIOIoIO00l0i.I0000Il00O;
/* 50 */                            if (i3 == -4000) {
/* 107 */                               I0IIiO0iI i0IIiO0iI = I00oO101o;
/* 109 */                               I0IIiO0iI i0IIiO0iI2 = I00oOio10iI1;
/* 120 */                               int iI000O01llI02 = I000O01llI0(z ? i0IIiO0iI2 : i0IIiO0iI) + iI000O01llI0;
/* 121 */                               int[] iArr2 = this.I00l0I0l0lO1;
/* 123 */                               int i4 = this.I00li1OI;
/* 127 */                               this.I00li1OI = i4 + 1;
/* 129 */                               iArr2[i4] = iI000O01llI02;
/* 131 */                               if (!z) {
/* 134 */                                   i0IIiO0iI = i0IIiO0iI2;
                                        }
/* 139 */                               iI000O01llI0 = I000O01llI0(i0IIiO0iI) + iI000O01llI02;
/* 140 */                               int[] iArr3 = this.I00l0I0l0lO1;
/* 142 */                               int i5 = this.I00li1OI;
/* 146 */                               this.I00li1OI = i5 + 1;
/* 148 */                               iArr3[i5] = iI000O01llI0;
                                    } else if (i3 != -3000) {
/* 56 */                                int iI00100l0 = I00100l0(iI000O01llI0, z);
/* 62 */                                if (iI00100l0 >= this.I00l0OO0IO || iI00100l0 == -1) {
/* 76 */                                    i = iIOIoIO00l0i.I0000Il00O;
                                        } else {
/* 70 */                                    i = this.I00ioIO[iI00100l0];
/* 72 */                                    i2 = iIOIoIO00l0i.I0000Il00O;
                                        }
/* 78 */                                iI000O01llI0 = i + i2;
/* 79 */                                int[] iArr4 = this.I00l0I0l0lO1;
/* 81 */                                int i6 = this.I00li1OI;
/* 83 */                                iArr4[i6] = iI000O01llI0;
/* 86 */                                this.I00li1OI = i6 + 1;
                                        z = !z;
                                    } else {
/* 95 */                                int iI00100l02 = I00100l0(iI000O01llI0, z) + 1;
/* 104 */                               iI000O01llI0 = iI00100l02 >= this.I00l0OO0IO ? i2 : this.I00ioIO[iI00100l02];
                                    }
                                }
                            }
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000II() throws IOException {
                    int i;
                    int i2;
                    byte[] bArr;
/* 3 */             boolean z = this.I00iio;
/* 5 */             int i3 = this.I00ilI0I1;
/* 7 */             if (i3 == 2) {
/* 80 */                if (z) {
/* 82 */                    this.I00lll10 = -1;
                        }
/* 84 */                I00000oIO();
                    } else if (i3 == 3) {
/* 33 */                if (z) {
/* 35 */                    this.I00lll10 = -1;
                        }
                        loop4: while (true) {
/* 41 */                    IIOIoIO00l0i iIOIoIO00l0i = (IIOIoIO00l0i) I00ol1.I00iiI;
/* 59 */                    do {
/* 52 */                        iIOIoIO00l0i = I001i1lo1io() ? iIOIoIO00l0i.I00000oOI : iIOIoIO00l0i.I00000oIO;
/* 54 */                        if (iIOIoIO00l0i == null) {
                                    break;
                                }
/* 59 */                    } while (!iIOIoIO00l0i.I0000oI00);
/* 63 */                    if (this.I00iiO || I001i1lo1io()) {
/* 76 */                        I00000oIO();
                            } else {
/* 72 */                        I0000Il00O();
                            }
                        }
/* 63 */                if (this.I00iiO) {
/* 76 */                    I00000oIO();
                        }
                    } else if (i3 != 4) {
/* 29 */                I000II.I000iOII(Oi010OO0.I000oI1ioi(i3, "Illegal parameter: "));
/* 32 */                return;
                    } else {
/* 15 */                if (z) {
/* 17 */                    this.I00lll10 = -1;
                        }
/* 19 */                I0000Il00O();
                    }
/* 88 */            this.I00ll1 = 0;
/* 91 */            int i4 = 0;
/* 92 */            int i5 = 0;
/* 93 */            boolean z2 = true;
                    while (true) {
/* 94 */                int i6 = this.I00li1OI;
/* 96 */                i = this.I00iOIl;
/* 99 */                if (i4 > i6) {
                            break;
                        }
/* 108 */               int i7 = i4 != i6 ? this.I00l0I0l0lO1[i4] : i;
/* 109 */               if (i7 <= i) {
/* 112 */                   i = i7;
                        }
/* 113 */               int i8 = i5 / 8;
                        while (true) {
/* 115 */                   i2 = i5 % 8;
/* 117 */                   bArr = this.I00iiI;
/* 119 */                   if (i2 == 0 || i - i5 <= 0) {
                                break;
                            }
/* 137 */                   bArr[i8] = (byte) ((z2 ? 0 : 1 << (7 - i2)) | bArr[i8]);
/* 139 */                   i5++;
                        }
/* 142 */               if (i2 == 0) {
/* 144 */                   i8 = i5 / 8;
/* 152 */                   byte b = (byte) (z2 ? 0 : 255);
/* 155 */                   while (i - i5 > 7) {
/* 157 */                       bArr[i8] = b;
/* 159 */                       i5 += 8;
/* 161 */                       i8++;
                            }
                        }
/* 166 */               while (i - i5 > 0) {
/* 168 */                   int i9 = i5 % 8;
/* 170 */                   if (i9 == 0) {
/* 172 */                       bArr[i8] = 0;
                            }
/* 186 */                   bArr[i8] = (byte) ((z2 ? 0 : 1 << (7 - i9)) | bArr[i8]);
/* 188 */                   i5++;
                        }
                        z2 = !z2;
/* 193 */               i4++;
                    }
/* 196 */           if (i5 == i) {
/* 201 */               this.I00ilO0 = (i5 + 7) / 8;
                    } else {
/* 212 */               IioIoO10iOiI.I000OOo1O(IIl001iO0Io.I000l1(i5, i, "Sum of run-lengths does not equal scan line width: ", " > "));
                    }
                }

                public final int I000O01llI0(I0IIiO0iI i0IIiO0iI) throws IOException {
/* 3 */             IIOIoIO00l0i iIOIoIO00l0i = (IIOIoIO00l0i) i0IIiO0iI.I00iiI;
/* 6 */             int i = 0;
                    while (true) {
/* 16 */                iIOIoIO00l0i = I001i1lo1io() ? iIOIoIO00l0i.I00000oOI : iIOIoIO00l0i.I00000oIO;
/* 18 */                if (iIOIoIO00l0i == null) {
/* 44 */                    IioIoO10iOiI.I000OOo1O("Unknown code in Huffman RLE stream");
/* 5 */                     return 0;
                        }
/* 22 */                if (iIOIoIO00l0i.I0000oI00) {
/* 24 */                    int i2 = iIOIoIO00l0i.I0000Il00O;
/* 26 */                    i += i2;
/* 29 */                    if (i2 < 64) {
                                return i2 >= 0 ? i : this.I00iOIl;
                            }
/* 33 */                    iIOIoIO00l0i = (IIOIoIO00l0i) i0IIiO0iI.I00iiI;
                        }
                    }
                }

                public final void I000l1() throws IOException {
/* 5 */             if (this.I00io1l >= this.I00ilO0) {
/* 8 */                 this.I00ilO0 = 0;
                        try {
/* 10 */                    I000II();
                        } catch (EOFException e) {
/* 17 */                    if (this.I00ilO0 != 0) {
/* 25 */                        throw e;
                            }
/* 20 */                    this.I00ilO0 = -1;
                        } catch (ArrayIndexOutOfBoundsException e2) {
/* 34 */                    throw new IOException("Malformed CCITT stream", e2);
                        }
/* 22 */                this.I00io1l = 0;
                    }
                }

                public final int I00100l0(int i, boolean z) {
/* 7 */             int i2 = (this.I00ll1 & (-2)) + (!z ? 1 : 0);
/* 9 */             if (i2 > 2) {
                        i2 -= 2;
                    }
/* 13 */            if (i == 0) {
/* 15 */                return i2;
                    }
/* 18 */            while (i2 < this.I00l0OO0IO) {
/* 24 */                if (i < this.I00ioIO[i2]) {
/* 26 */                    this.I00ll1 = i2;
/* 28 */                    return i2;
                        }
/* 29 */                i2 += 2;
                    }
/* 32 */            return -1;
                }

                public final boolean I001i1lo1io() throws IOException {
/* 1 */             int i = this.I00lll10;
/* 4 */             if (i < 0 || i > 7) {
/* 11 */                int i2 = ((FilterInputStream) this).in.read();
/* 15 */                this.I00lli11 = i2;
/* 18 */                if (i2 == -1) {
/* 55 */                    throw new EOFException("Unexpected end of Huffman RLE stream");
                        }
/* 20 */                this.I00lll10 = 0;
/* 22 */                i = 0;
                    }
/* 23 */            int i3 = this.I00lli11;
/* 28 */            boolean z = (i3 & Barcode.FORMAT_ITF) != 0;
/* 32 */            this.I00lli11 = i3 << 1;
/* 35 */            this.I00lll10 = i + 1;
/* 37 */            return z;
                }

                @Override
                public final boolean markSupported() {
/* 1 */             return false;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = this.I00ilO0;
/* 4 */             if (i3 < 0) {
/* 8 */                 Arrays.fill(bArr, i, i + i2, (byte) 0);
/* 11 */                return i2;
                    }
/* 14 */            if (this.I00io1l >= i3) {
/* 16 */                I000l1();
/* 19 */                i3 = this.I00ilO0;
/* 21 */                if (i3 < 0) {
/* 25 */                    Arrays.fill(bArr, i, i + i2, (byte) 0);
/* 28 */                    return i2;
                        }
                    }
/* 32 */            int iMin = Math.min(i3 - this.I00io1l, i2);
/* 40 */            System.arraycopy(this.I00iiI, this.I00io1l, bArr, i, iMin);
                    this.I00io1l += iMin;
/* 98 */            return iMin;
                }

                @Override
                public final synchronized void reset() {
/* 9 */             throw new IOException("mark/reset not supported");
                }

                @Override
                public final long skip(long j) throws IOException {
/* 1 */             int i = this.I00ilO0;
/* 5 */             if (i < 0) {
/* 3 */                 return -1L;
                    }
/* 10 */            if (this.I00io1l >= i) {
/* 12 */                I000l1();
/* 15 */                i = this.I00ilO0;
/* 17 */                if (i < 0) {
/* 3 */                     return -1L;
                        }
                    }
/* 28 */            int iMin = (int) Math.min(i - this.I00io1l, j);
                    this.I00io1l += iMin;
/* 34 */            return iMin;
                }

                @Override
/* 48 */        public final int read() throws IOException {
/* 49 */            int i = this.I00ilO0;
                    if (i < 0) {
                        return 0;
                    }
/* 50 */            if (this.I00io1l >= i) {
/* 51 */                I000l1();
/* 52 */                if (this.I00ilO0 < 0) {
                            return 0;
                        }
                    }
/* 53 */            int i2 = this.I00io1l;
                    this.I00io1l = i2 + 1;
                    return this.I00iiI[i2] & 255;
                }
            }
