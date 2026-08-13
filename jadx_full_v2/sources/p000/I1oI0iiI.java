            package p000;
            
            public class I1oI0iiI {
                public static final I1oI0I I0000oI00;
                public static final byte[] I0001Ioi1lo;
                public final boolean I00000oIO;
                public final boolean I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;

                static {
/* 3 */             I1oI0iO0oolo[] i1oI0iO0ooloArr = I1oI0iO0oolo.I00iOIl;
/* 10 */            I0000oI00 = new I1oI0I(false, false, -1);
/* 18 */            I0001Ioi1lo = new byte[]{13, 10};
/* 23 */            new I1oI0iiI(true, false, -1);
/* 30 */            new I1oI0iiI(false, true, 76);
/* 37 */            new I1oI0iiI(false, true, 64);
                }

                public I1oI0iiI(boolean z, boolean z2, int i) {
/* 1 */             I1oI0iO0oolo[] i1oI0iO0ooloArr = I1oI0iO0oolo.I00iOIl;
/* 6 */             this.I00000oIO = z;
/* 8 */             this.I00000oOI = z2;
/* 10 */            this.I0000Il00O = i;
/* 12 */            if (z && z2) {
/* 19 */                I000II.I000iOII("Failed requirement.");
/* 23 */                throw null;
                    }
/* 26 */            this.I0000O = i / 4;
                }

                public static byte[] I00000oIO(I1oI0iiI i1oI0iiI, String str) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    char c;
/* 3 */             int length = str.length();
/* 7 */             i1oI0iiI.getClass();
/* 15 */            iOI0OiiiOl1.I00000oIO(0, length, str.length());
/* 26 */            byte[] bytes = str.substring(0, length).getBytes(IO1IOI.I0000Il00O);
/* 30 */            int length2 = bytes.length;
/* 31 */            boolean z = i1oI0iiI.I00000oOI;
/* 34 */            iOI0OiiiOl1.I00000oIO(0, length2, bytes.length);
/* 37 */            int i5 = 1;
/* 40 */            int i6 = -2;
/* 41 */            if (length2 == 0) {
/* 43 */                i2 = 0;
                    } else {
/* 45 */                if (length2 == 1) {
/* 495 */                   I000II.I000iOII(Oi010OO0.I000oI1ioi(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
/* 487 */                   return null;
                        }
/* 47 */                if (z) {
/* 49 */                    i = length2;
/* 50 */                    int i7 = 0;
                            while (true) {
/* 51 */                        if (i7 >= length2) {
                                    break;
                                }
/* 59 */                        int i8 = I1oI0olIl.I00000oOI[bytes[i7] & 255];
/* 61 */                        if (i8 < 0) {
/* 63 */                            if (i8 == -2) {
/* 67 */                                i -= length2 - i7;
                                        break;
                                    }
                                    i--;
                                }
/* 71 */                        i7++;
                            }
                        } else if (bytes[length2 - 1] == 61) {
                            i = length2 - 1;
/* 86 */                    if (bytes[length2 - 2] == 61) {
                                i = length2 - 2;
                            }
                        } else {
/* 91 */                    i = length2;
                        }
/* 99 */                i2 = (int) ((i * 6) / 8);
                    }
/* 100 */           byte[] bArr = new byte[i2];
/* 109 */           int[] iArr = i1oI0iiI.I00000oIO ? I1oI0olIl.I0000O : I1oI0olIl.I00000oOI;
/* 111 */           int i9 = -8;
/* 112 */           int i10 = 0;
/* 113 */           int i11 = 0;
/* 114 */           int i12 = 0;
/* 115 */           int i13 = -8;
                    while (true) {
/* 120 */               int i14 = i5;
/* 124 */               if (i10 >= length2) {
/* 380 */                   i3 = 0;
                            break;
                        }
/* 126 */               if (i13 == i9) {
/* 128 */                   i4 = 8;
/* 130 */                   int i15 = i10 + 3;
/* 132 */                   if (i15 < length2) {
/* 156 */                       int i16 = i10 + 4;
/* 172 */                       int i17 = (iArr[bytes[i10] & 255] << 18) | (iArr[bytes[i10 + 1] & 255] << 12) | (iArr[bytes[i10 + 2] & 255] << 6) | iArr[bytes[i15] & 255];
/* 173 */                       if (i17 >= 0) {
/* 180 */                           bArr[i12] = (byte) (i17 >> 16);
/* 182 */                           int i18 = i12 + 2;
/* 187 */                           bArr[i12 + 1] = (byte) (i17 >> 8);
/* 189 */                           i12 += 3;
/* 192 */                           bArr[i18] = (byte) i17;
/* 194 */                           i5 = i14;
/* 196 */                           i10 = i16;
                                }
/* 200 */                       i6 = -2;
/* 201 */                       i9 = -8;
                            }
                        } else {
/* 203 */                   i4 = 8;
                        }
/* 207 */               int i19 = bytes[i10] & 255;
/* 209 */               int i20 = iArr[i19];
/* 211 */               if (i20 >= 0) {
/* 350 */                   c = '=';
/* 352 */                   i10++;
/* 356 */                   i11 = (i11 << 6) | i20;
/* 358 */                   int i21 = i13 + 6;
/* 360 */                   if (i21 >= 0) {
/* 367 */                       bArr[i12] = (byte) (i11 >>> i21);
/* 373 */                       i11 &= (i14 << i21) - 1;
                                i13 -= 2;
/* 362 */                       i12++;
                            } else {
/* 378 */                       i13 = i21;
                            }
                        } else if (i20 != -2) {
/* 298 */                   c = '=';
/* 300 */                   if (!z) {
/* 310 */                       char c2 = (char) i19;
/* 311 */                       iOlI1lIi0.I00000oIO(i4);
/* 349 */                       throw new IllegalArgumentException("Invalid symbol '" + c2 + "'(" + Integer.toString(i19, i4) + ") at index " + i10);
                            }
/* 302 */                   i10++;
                        } else {
/* 217 */                   if (i13 == -8) {
/* 294 */                       I000II.I000iOII(Oi010OO0.I000oI1ioi(i10, "Redundant pad character at index "));
/* 116 */                       return null;
                            }
/* 220 */                   if (i13 == -6) {
/* 281 */                       I1oI0iO0oolo[] i1oI0iO0ooloArr = I1oI0iO0oolo.I00iOIl;
                            } else if (i13 == -4) {
/* 236 */                       I1oI0iO0oolo[] i1oI0iO0ooloArr2 = I1oI0iO0oolo.I00iOIl;
/* 238 */                       int i22 = i10 + 1;
/* 240 */                       if (z) {
/* 243 */                           while (i22 < length2) {
/* 254 */                               if (I1oI0olIl.I00000oOI[bytes[i22] & 255] != -1) {
                                            break;
                                        }
/* 257 */                               i22++;
                                    }
                                }
/* 260 */                       if (i22 == length2 || bytes[i22] != 61) {
/* 277 */                           I000II.I000iOII(Oi010OO0.I000oI1ioi(i22, "Missing one pad character at index "));
/* 116 */                           return null;
                                }
/* 268 */                       i10 = i22 + 1;
/* 284 */                       i3 = i14;
/* 286 */                       i6 = -2;
                            } else if (i13 != -2) {
/* 232 */                       I000II.I001IO000("Unreachable");
/* 116 */                       return null;
                            }
/* 227 */                   i10++;
/* 284 */                   i3 = i14;
/* 286 */                   i6 = -2;
                        }
/* 305 */               i5 = i14;
/* 200 */               i6 = -2;
/* 201 */               i9 = -8;
                    }
/* 381 */           if (i13 == i6) {
/* 483 */               I000II.I000iOII("The last unit of input does not have enough bits");
/* 116 */               return null;
                    }
/* 384 */           if (i13 != -8 && i3 == 0) {
/* 389 */               I1oI0iO0oolo[] i1oI0iO0ooloArr3 = I1oI0iO0oolo.I00iOIl;
/* 393 */               I000II.I000iOII("The padding option is set to PRESENT, but the input is not properly padded");
/* 116 */               return null;
                    }
/* 397 */           if (i11 != 0) {
/* 477 */               I000II.I000iOII("The pad bits must be zeros");
/* 116 */               return null;
                    }
/* 399 */           if (z) {
/* 402 */               while (i10 < length2) {
/* 413 */                   if (I1oI0olIl.I00000oOI[bytes[i10] & 255] != -1) {
                                break;
                            }
/* 416 */                   i10++;
                        }
                    }
/* 419 */           if (i10 >= length2) {
/* 421 */               if (i12 == i2) {
/* 423 */                   return bArr;
                        }
/* 426 */               I000II.I001IO000("Check failed.");
/* 116 */               return null;
                    }
/* 432 */           int i23 = bytes[i10] & 255;
/* 438 */           StringBuilder sb = new StringBuilder("Symbol '");
/* 442 */           sb.append((char) i23);
/* 445 */           sb.append("'(");
/* 450 */           iOlI1lIi0.I00000oIO(8);
/* 457 */           sb.append(Integer.toString(i23, 8));
/* 460 */           sb.append(") at index ");
/* 471 */           I000II.I000iOII(IIl001iO0Io.I000lI(i10 - 1, " is prohibited after the pad character", sb));
/* 116 */           return null;
                }

                public static String I00000oOI(I1oI0iiI i1oI0iiI, byte[] bArr) {
                    int i;
/* 1 */             int length = bArr.length;
/* 2 */             int length2 = bArr.length;
/* 3 */             i1oI0iiI.getClass();
/* 7 */             iOI0OiiiOl1.I00000oIO(0, length, length2);
/* 10 */            int iI0000Il00O = i1oI0iiI.I0000Il00O(length);
/* 14 */            byte[] bArr2 = new byte[iI0000Il00O];
/* 17 */            iOI0OiiiOl1.I00000oIO(0, length, bArr.length);
/* 20 */            int iI0000Il00O2 = i1oI0iiI.I0000Il00O(length);
/* 25 */            if (iI0000Il00O < 0) {
/* 273 */               I000II.I0010o(Oi010OO0.I000oI1ioi(iI0000Il00O, "destination offset: 0, destination size: "));
/* 24 */                return null;
                    }
/* 27 */            if (iI0000Il00O2 < 0 || iI0000Il00O2 > iI0000Il00O) {
/* 263 */               I000II.I0010o(IIl001iO0Io.I000l1(iI0000Il00O, iI0000Il00O2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
/* 24 */                return null;
                    }
/* 38 */            byte[] bArr3 = i1oI0iiI.I00000oIO ? I1oI0olIl.I0000Il00O : I1oI0olIl.I00000oIO;
/* 47 */            int i2 = i1oI0iiI.I00000oOI ? i1oI0iiI.I0000O : Integer.MAX_VALUE;
/* 50 */            int i3 = 0;
/* 51 */            int i4 = 0;
                    while (true) {
/* 52 */                i = i3 + 2;
/* 55 */                if (i >= length) {
                            break;
                        }
/* 61 */                int iMin = Math.min((length - i3) / 3, i2);
/* 66 */                for (int i5 = 0; i5 < iMin; i5++) {
/* 72 */                    int i6 = bArr[i3] & 255;
/* 74 */                    int i7 = i3 + 2;
/* 78 */                    int i8 = bArr[i3 + 1] & 255;
/* 80 */                    i3 += 3;
/* 91 */                    int i9 = (i8 << 8) | (i6 << 16) | (bArr[i7] & 255);
/* 98 */                    bArr2[i4] = bArr3[i9 >>> 18];
/* 108 */                   bArr2[i4 + 1] = bArr3[(i9 >>> 12) & 63];
/* 110 */                   int i10 = i4 + 3;
/* 118 */                   bArr2[i4 + 2] = bArr3[(i9 >>> 6) & 63];
/* 120 */                   i4 += 4;
/* 126 */                   bArr2[i10] = bArr3[i9 & 63];
                        }
/* 131 */               if (iMin == i2 && i3 != length) {
/* 135 */                   int i11 = i4 + 1;
/* 137 */                   byte[] bArr4 = I0001Ioi1lo;
/* 141 */                   bArr2[i4] = bArr4[0];
/* 143 */                   i4 += 2;
/* 147 */                   bArr2[i11] = bArr4[1];
                        }
                    }
/* 150 */           int i12 = length - i3;
/* 154 */           if (i12 == 1) {
/* 212 */               int i13 = (bArr[i3] & 255) << 4;
/* 220 */               bArr2[i4] = bArr3[i13 >>> 6];
/* 228 */               bArr2[i4 + 1] = bArr3[i13 & 63];
/* 230 */               I1oI0iO0oolo[] i1oI0iO0ooloArr = I1oI0iO0oolo.I00iOIl;
/* 234 */               bArr2[i4 + 2] = 61;
/* 236 */               bArr2[i4 + 3] = 61;
/* 206 */               i3++;
                    } else if (i12 == 2) {
/* 173 */               int i14 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
/* 180 */               bArr2[i4] = bArr3[i14 >>> 12];
/* 190 */               bArr2[i4 + 1] = bArr3[(i14 >>> 6) & 63];
/* 198 */               bArr2[i4 + 2] = bArr3[i14 & 63];
/* 200 */               I1oI0iO0oolo[] i1oI0iO0ooloArr2 = I1oI0iO0oolo.I00iOIl;
/* 202 */               bArr2[i4 + 3] = 61;
/* 204 */               i3 = i;
                    }
/* 239 */           if (i3 == length) {
/* 245 */               return new String(bArr2, IO1IOI.I0000Il00O);
                    }
/* 251 */           I000II.I001IO000("Check failed.");
/* 24 */            return null;
                }

                public final int I0000Il00O(int i) {
/* 5 */             int i2 = (i / 3) * 4;
/* 7 */             if (i % 3 != 0) {
/* 9 */                 I1oI0iO0oolo[] i1oI0iO0ooloArr = I1oI0iO0oolo.I00iOIl;
/* 11 */                i2 += 4;
                    }
/* 16 */            if (i2 < 0) {
/* 37 */                I000II.I000iOII("Input is too big");
/* 13 */                return 0;
                    }
/* 20 */            if (this.I00000oOI) {
/* 29 */                i2 += ((i2 - 1) / this.I0000Il00O) * 2;
                    }
/* 30 */            if (i2 >= 0) {
/* 32 */                return i2;
                    }
/* 33 */            I000II.I000iOII("Input is too big");
/* 13 */            return 0;
                }
            }
