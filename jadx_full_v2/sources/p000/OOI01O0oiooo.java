            package p000;

            import java.io.FilterOutputStream;
            import java.io.IOException;
            import java.util.Arrays;
            
/* 60 */    public final class OOI01O0oiooo extends FilterOutputStream {
                public int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public boolean I00ilO0;
                public byte[] I00io1l;
                public byte[] I00ioIO;
                public int I00l0I0l0lO1;
                public boolean I00l0OO0IO;

                public final void I00000oIO() throws IOException {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = this.I00iiI;
/* 5 */             int i3 = this.I00iiO;
/* 7 */             int i4 = this.I00iio;
/* 9 */             byte[] bArr = this.I00io1l;
/* 11 */            byte[] bArr2 = this.I00ioIO;
/* 15 */            if (i != 1) {
/* 25 */                int i5 = ((i2 * i3) + 7) / 8;
/* 26 */                int length = bArr.length;
/* 28 */                if (i != 2) {
                            switch (i) {
                                case 11:
/* 166 */                           for (int i6 = i5; i6 < length; i6++) {
/* 176 */                               bArr[i6] = (byte) (bArr[i6] + bArr[i6 - i5]);
                                    }
                                    break;
                                case 12:
/* 146 */                           for (int i7 = 0; i7 < length; i7++) {
/* 160 */                               bArr[i7] = (byte) (((bArr[i7] & 255) + (bArr2[i7] & 255)) & 255);
                                    }
                                    break;
                                case 13:
/* 114 */                           for (int i8 = 0; i8 < length; i8++) {
/* 120 */                               int i9 = i8 - i5;
/* 140 */                               bArr[i8] = (byte) (((((i9 >= 0 ? bArr[i9] & 255 : 0) + (bArr2[i8] & 255)) / 2) + (bArr[i8] & 255)) & 255);
                                    }
                                    break;
                                case 14:
/* 36 */                            for (int i10 = 0; i10 < length; i10++) {
/* 40 */                                int i11 = bArr[i10] & 255;
/* 42 */                                int i12 = i10 - i5;
/* 51 */                                int i13 = i12 >= 0 ? bArr[i12] & 255 : 0;
/* 54 */                                int i14 = bArr2[i10] & 255;
/* 63 */                                int i15 = i12 >= 0 ? bArr2[i12] & 255 : 0;
/* 66 */                                int i16 = (i13 + i14) - i15;
/* 69 */                                int iAbs = Math.abs(i16 - i13);
/* 75 */                                int iAbs2 = Math.abs(i16 - i14);
/* 80 */                                int iAbs3 = Math.abs(i16 - i15);
/* 84 */                                if (iAbs <= iAbs2 && iAbs <= iAbs3) {
/* 92 */                                    bArr[i10] = (byte) ((i11 + i13) & 255);
                                        } else if (iAbs2 <= iAbs3) {
/* 101 */                                   bArr[i10] = (byte) ((i11 + i14) & 255);
                                        } else {
/* 108 */                                   bArr[i10] = (byte) ((i11 + i15) & 255);
                                        }
                                    }
                                    break;
                            }
                        } else if (i3 == 8) {
/* 184 */                   for (int i17 = i5; i17 < length; i17++) {
/* 198 */                       bArr[i17] = (byte) ((bArr[i17] & 255) + (bArr[i17 - i5] & 255));
                            }
                        } else if (i3 == 16) {
/* 210 */                   for (int i18 = i5; i18 < length - 1; i18 += 2) {
/* 217 */                       int i19 = i18 + 1;
/* 224 */                       int i20 = i18 - i5;
/* 237 */                       int i21 = ((bArr[i20] & 255) << 8) + (bArr[i20 + 1] & 255) + ((bArr[i18] & 255) << 8) + (bArr[i19] & 255);
/* 243 */                       bArr[i18] = (byte) ((i21 >> 8) & 255);
/* 248 */                       bArr[i19] = (byte) (i21 & 255);
                            }
                        } else if (i3 == 1 && i2 == 1) {
/* 258 */                   for (int i22 = 0; i22 < length; i22++) {
/* 260 */                       int i23 = 7;
/* 261 */                       while (i23 >= 0) {
/* 263 */                           int i24 = bArr[i22];
/* 267 */                           int i25 = (i24 >> i23) & 1;
/* 268 */                           if (i22 != 0 || i23 != 7) {
/* 288 */                               if (((i25 + ((i23 == 7 ? bArr[i22 - 1] : i24 >> (i23 + 1)) & 1)) & 1) == 0) {
/* 295 */                                   bArr[i22] = (byte) (i24 & (~(1 << i23)));
                                        } else {
/* 302 */                                   bArr[i22] = (byte) (i24 | (1 << i23));
                                        }
                                    }
                                    i23--;
                                }
                            }
                        } else {
/* 310 */                   int i26 = i4 * i2;
/* 312 */                   for (int i27 = i2; i27 < i26; i27++) {
/* 314 */                       int i28 = i27 * i3;
/* 316 */                       int i29 = i28 / 8;
/* 321 */                       int i30 = (8 - (i28 % 8)) - i3;
/* 324 */                       int i31 = (i27 - i2) * i3;
/* 331 */                       int i32 = bArr[i29];
/* 335 */                       int i33 = (1 << i3) - 1;
/* 355 */                       bArr[i29] = (byte) ((((((i32 >>> i30) & i33) + ((bArr[i31 / 8] >>> ((8 - (i31 % 8)) - i3)) & i33)) & i33) << i30) | ((~(i33 << i30)) & i32));
                            }
                        }
                    }
/* 364 */           ((FilterOutputStream) this).out.write(this.I00io1l);
/* 367 */           byte[] bArr3 = this.I00ioIO;
/* 371 */           this.I00ioIO = this.I00io1l;
/* 373 */           this.I00io1l = bArr3;
/* 375 */           this.I00l0I0l0lO1 = 0;
/* 377 */           this.I00l0OO0IO = false;
                }

                @Override
                public final void flush() throws IOException {
/* 1 */             int i = this.I00l0I0l0lO1;
/* 3 */             if (i > 0) {
/* 10 */                Arrays.fill(this.I00io1l, i, this.I00ilI0I1, (byte) 0);
/* 13 */                I00000oIO();
                    }
/* 16 */            super.flush();
                }

                @Override
                public final void write(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = i2 + i;
/* 2 */             while (i < i3) {
/* 6 */                 if (this.I00ilO0 && this.I00l0I0l0lO1 == 0 && !this.I00l0OO0IO) {
/* 20 */                    this.I00iOIl = bArr[i] + 10;
/* 22 */                    i++;
/* 25 */                    this.I00l0OO0IO = true;
                        } else {
/* 35 */                    int iMin = Math.min(this.I00ilI0I1 - this.I00l0I0l0lO1, i3 - i);
/* 43 */                    System.arraycopy(bArr, i, this.I00io1l, this.I00l0I0l0lO1, iMin);
/* 48 */                    int i4 = this.I00l0I0l0lO1 + iMin;
/* 49 */                    this.I00l0I0l0lO1 = i4;
/* 51 */                    i += iMin;
/* 55 */                    if (i4 == this.I00io1l.length) {
/* 57 */                        I00000oIO();
                            }
                        }
                    }
                }

                @Override
/* 61 */        public final void write(byte[] bArr) throws IOException {
/* 62 */            write(bArr, 0, bArr.length);
                }

                @Override
/* 62 */        public final void write(int i) {
/* 63 */            throw new UnsupportedOperationException("Not supported");
                }
            }
