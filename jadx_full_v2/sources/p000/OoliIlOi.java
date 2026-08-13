            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.nio.charset.Charset;
            import java.util.Arrays;
            
            public final class OoliIlOi {
                public final int I00000oIO;

                public OoliIlOi(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static int I0000O(long j, byte[] bArr, int i, int i2) {
/* 1 */             if (i2 == 0) {
/* 39 */                OoliIlOi ooliIlOi = Oolio1l.I00000oIO;
/* 43 */                if (i > -12) {
/* 45 */                    return -1;
                        }
/* 483 */               return i;
                    }
/* 4 */             if (i2 == 1) {
/* 34 */                return Oolio1l.I00000oOI(i, Ooil11Oi.I0000oI00(j, bArr));
                    }
/* 7 */             if (i2 == 2) {
/* 20 */                return Oolio1l.I0000Il00O(i, Ooil11Oi.I0000oI00(j, bArr), Ooil11Oi.I0000oI00(j + 1, bArr));
                    }
/* 25 */            OoOil11Ol1o.I0000Il00O();
/* 28 */            return 0;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I00000oIO(byte[] bArr, int i, int i2) {
                    switch (this.I00000oIO) {
                        case 0:
/* 49 */                    if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
/* 336 */                       OoOil11Ol1o.I000o00OoI0I("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
/* 339 */                       return null;
                            }
/* 51 */                    int i3 = i + i2;
/* 53 */                    char[] cArr = new char[i2];
/* 56 */                    int i4 = 0;
/* 57 */                    while (i < i3) {
/* 59 */                        byte b = bArr[i];
/* 61 */                        if (b < 0) {
/* 72 */                            while (i < i3) {
/* 74 */                                int i5 = i + 1;
/* 76 */                                byte b2 = bArr[i];
/* 78 */                                if (b2 >= 0) {
/* 80 */                                    int i6 = i4 + 1;
/* 83 */                                    cArr[i4] = (char) b2;
/* 85 */                                    while (i5 < i3) {
/* 87 */                                        byte b3 = bArr[i5];
/* 89 */                                        if (b3 >= 0) {
/* 91 */                                            i5++;
/* 96 */                                            cArr[i6] = (char) b3;
/* 93 */                                            i6++;
                                                } else {
/* 100 */                                           i4 = i6;
/* 101 */                                           i = i5;
                                                }
                                            }
/* 100 */                                   i4 = i6;
/* 101 */                                   i = i5;
                                        } else if (b2 < -32) {
/* 107 */                                   if (i5 >= i3) {
/* 146 */                                       throw O000oiiiOI0.I00000oOI();
                                            }
/* 109 */                                   i += 2;
/* 111 */                                   byte b4 = bArr[i5];
/* 113 */                                   int i7 = i4 + 1;
/* 117 */                                   if (b2 < -62 || li0O0lIOl1i.I00000oIO(b4)) {
/* 141 */                                       throw O000oiiiOI0.I00000oOI();
                                            }
/* 133 */                                   cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
/* 135 */                                   i4 = i7;
                                        } else {
/* 149 */                                   if (b2 >= -16) {
/* 219 */                                       if (i5 >= i3 - 2) {
/* 310 */                                           throw O000oiiiOI0.I00000oOI();
                                                }
/* 223 */                                       byte b5 = bArr[i5];
/* 225 */                                       int i8 = i + 3;
/* 227 */                                       byte b6 = bArr[i + 2];
/* 229 */                                       i += 4;
/* 231 */                                       byte b7 = bArr[i8];
/* 233 */                                       int i9 = i4 + 1;
/* 239 */                                       if (!li0O0lIOl1i.I00000oIO(b5)) {
/* 248 */                                           if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !li0O0lIOl1i.I00000oIO(b6) && !li0O0lIOl1i.I00000oIO(b7)) {
/* 278 */                                               int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
/* 286 */                                               cArr[i4] = (char) ((i10 >>> 10) + 55232);
/* 295 */                                               cArr[i9] = (char) ((i10 & 1023) + 56320);
/* 297 */                                               i4 += 2;
                                                    }
                                                }
/* 305 */                                       throw O000oiiiOI0.I00000oOI();
                                            }
/* 153 */                                   if (i5 >= i3 - 1) {
/* 216 */                                       throw O000oiiiOI0.I00000oOI();
                                            }
/* 155 */                                   int i11 = i + 2;
/* 157 */                                   byte b8 = bArr[i5];
/* 159 */                                   i += 3;
/* 161 */                                   byte b9 = bArr[i11];
/* 163 */                                   int i12 = i4 + 1;
/* 169 */                                   if (li0O0lIOl1i.I00000oIO(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || li0O0lIOl1i.I00000oIO(b9)))) {
/* 211 */                                       throw O000oiiiOI0.I00000oOI();
                                            }
/* 202 */                                   cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & 15) << 12) | (b9 & 63));
/* 204 */                                   i4 = i12;
                                        }
                                    }
/* 313 */                           return new String(cArr, 0, i4);
                                }
/* 63 */                        i++;
/* 68 */                        cArr[i4] = (char) b;
/* 65 */                        i4++;
                            }
/* 72 */                    while (i < i3) {
                            }
/* 313 */                   return new String(cArr, 0, i4);
                        default:
/* 8 */                     Charset charset = Iool1iOO11.I00000oIO;
/* 10 */                    String str = new String(bArr, i, i2, charset);
/* 19 */                    if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
/* 42 */                        throw O000oiiiOI0.I00000oOI();
                            }
/* 37 */                    return str;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:71:0x0183  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0187  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00000oOI(String str, byte[] bArr, int i, int i2) {
                    int i3;
                    char cCharAt;
                    int i4;
                    int i5;
                    char cCharAt2;
/* 13 */            char c = 2048;
/* 15 */            char c2 = 128;
/* 17 */            char c3 = 55296;
                    switch (this.I00000oIO) {
                        case 0:
/* 360 */                   int length = str.length();
/* 364 */                   int i6 = i2 + i;
/* 365 */                   int i7 = 0;
/* 366 */                   while (i7 < length) {
/* 368 */                       int i8 = i7 + i;
/* 370 */                       if (i8 >= i6 || (cCharAt = str.charAt(i7)) >= 128) {
/* 386 */                           if (i7 != length) {
/* 388 */                               return i + length;
                                    }
/* 392 */                           int i9 = i + i7;
/* 393 */                           while (i7 < length) {
/* 395 */                               char cCharAt3 = str.charAt(i7);
/* 401 */                               if (cCharAt3 < 128 && i9 < i6) {
/* 408 */                                   bArr[i9] = (byte) cCharAt3;
/* 405 */                                   i9++;
                                        } else if (cCharAt3 < 2048 && i9 <= i6 - 2) {
/* 425 */                                   int i10 = i9 + 1;
/* 432 */                                   bArr[i9] = (byte) ((cCharAt3 >>> 6) | 960);
/* 434 */                                   i9 += 2;
/* 442 */                                   bArr[i10] = (byte) ((cCharAt3 & '?') | Barcode.FORMAT_ITF);
                                        } else {
/* 448 */                                   if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i9 > i6 - 3) {
/* 491 */                                       if (i9 > i6 - 4) {
/* 571 */                                           if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i3)))) {
/* 602 */                                               throw new Oolii1(i7, length);
                                                    }
/* 603 */                                           iilo0lOo110.I00000oIO(cCharAt3, i9);
/* 606 */                                           return 0;
                                                }
/* 493 */                                       int i11 = i7 + 1;
/* 499 */                                       if (i11 != str.length()) {
/* 501 */                                           char cCharAt4 = str.charAt(i11);
/* 509 */                                           if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
/* 511 */                                               int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
/* 522 */                                               bArr[i9] = (byte) ((codePoint >>> 18) | 240);
/* 534 */                                               bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | Barcode.FORMAT_ITF);
/* 536 */                                               int i12 = i9 + 3;
/* 544 */                                               bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | Barcode.FORMAT_ITF);
/* 546 */                                               i9 += 4;
/* 552 */                                               bArr[i12] = (byte) ((codePoint & 63) | Barcode.FORMAT_ITF);
/* 554 */                                               i7 = i11;
/* 555 */                                               i7++;
                                                    } else {
/* 559 */                                               i7 = i11;
                                                    }
                                                }
/* 567 */                                       throw new Oolii1(i7 - 1, length);
                                            }
/* 466 */                                   bArr[i9] = (byte) ((cCharAt3 >>> '\f') | 480);
/* 468 */                                   int i13 = i9 + 2;
/* 478 */                                   bArr[i9 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | Barcode.FORMAT_ITF);
/* 480 */                                   i9 += 3;
/* 486 */                                   bArr[i13] = (byte) ((cCharAt3 & '?') | Barcode.FORMAT_ITF);
                                        }
/* 555 */                               i7++;
                                    }
/* 608 */                           return i9;
                                }
/* 381 */                       bArr[i8] = (byte) cCharAt;
/* 383 */                       i7++;
                            }
/* 386 */                   if (i7 != length) {
                            }
                            break;
                        default:
                            long j = i;
/* 25 */                    long j2 = i2 + j;
/* 26 */                    int length2 = str.length();
/* 34 */                    if (length2 > i2 || bArr.length - i2 < i) {
/* 359 */                       throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                            }
/* 40 */                    int i14 = 0;
/* 43 */                    while (i14 < length2 && (cCharAt2 = str.charAt(i14)) < 128) {
/* 54 */                        Ooil11Oi.I000l1(bArr, j, (byte) cCharAt2);
/* 57 */                        i14++;
/* 51 */                        j++;
                            }
/* 62 */                    if (i14 != length2) {
/* 67 */                        while (i14 < length2) {
/* 69 */                            char cCharAt5 = str.charAt(i14);
/* 73 */                            if (cCharAt5 >= c2 || j >= j2) {
/* 91 */                                if (cCharAt5 >= c || j > j2 - 2) {
/* 122 */                                   i4 = i14;
/* 125 */                                   if ((cCharAt5 >= c3 && 57343 >= cCharAt5) || j > j2 - 3) {
/* 187 */                                       if (j > j2 - 4) {
/* 277 */                                           if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i4 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
/* 303 */                                               throw new Oolii1(i4, length2);
                                                    }
/* 327 */                                           throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                                }
/* 189 */                                       i14 = i4 + 1;
/* 191 */                                       if (i14 != length2) {
/* 193 */                                           char cCharAt6 = str.charAt(i14);
/* 201 */                                           if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
/* 203 */                                               int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
/* 214 */                                               Ooil11Oi.I000l1(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
/* 231 */                                               Ooil11Oi.I000l1(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | Barcode.FORMAT_ITF));
/* 234 */                                               long j3 = j + 3;
/* 242 */                                               Ooil11Oi.I000l1(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | Barcode.FORMAT_ITF));
/* 245 */                                               j += 4;
/* 251 */                                               Ooil11Oi.I000l1(bArr, j3, (byte) ((codePoint2 & 63) | Barcode.FORMAT_ITF));
                                                    }
                                                } else {
/* 265 */                                           i14 = i4;
                                                }
/* 273 */                                       throw new Oolii1(i14 - 1, length2);
                                            }
/* 151 */                                   Ooil11Oi.I000l1(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
/* 156 */                                   long j4 = j + 2;
/* 166 */                                   Ooil11Oi.I000l1(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | c2));
/* 169 */                                   j += 3;
/* 177 */                                   Ooil11Oi.I000l1(bArr, j4, (byte) ((cCharAt5 & '?') | Barcode.FORMAT_ITF));
                                        } else {
/* 99 */                                    i4 = i14;
/* 100 */                                   long j5 = j + 1;
/* 107 */                                   Ooil11Oi.I000l1(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
/* 110 */                                   j += 2;
/* 116 */                                   Ooil11Oi.I000l1(bArr, j5, (byte) ((cCharAt5 & '?') | c2));
                                        }
/* 119 */                               i14 = i4;
                                    } else {
/* 82 */                                Ooil11Oi.I000l1(bArr, j, (byte) cCharAt5);
/* 79 */                                j++;
                                    }
/* 254 */                           i14++;
/* 256 */                           c = 2048;
/* 258 */                           c2 = 128;
/* 260 */                           c3 = 55296;
                                }
                            }
/* 64 */                    return (int) j;
                    }
                }

                public boolean I0000Il00O(byte[] bArr, int i, int i2) {
                    boolean z;
                    byte b;
                    long j;
                    int i3;
/* 3 */             int i4 = i;
/* 13 */            int iI0000O = -1;
                    switch (this.I00000oIO) {
                        case 0:
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 303 */                   z = false;
/* 305 */                   while (i4 < i2 && bArr[i4] >= 0) {
/* 311 */                       i4++;
                            }
/* 314 */                   if (i4 >= i2) {
/* 159 */                       iI0000O = z ? 1 : 0;
                                break;
                            } else {
/* 317 */                       while (i4 < i2) {
/* 321 */                           int i5 = i4 + 1;
/* 323 */                           b = bArr[i4];
/* 325 */                           if (b >= 0) {
/* 415 */                               i4 = i5;
                                    } else if (b >= -32) {
/* 342 */                               if (b >= -16) {
/* 376 */                                   if (i5 < i2 - 2) {
/* 383 */                                       int i6 = i4 + 2;
/* 385 */                                       byte b2 = bArr[i5];
/* 387 */                                       if (b2 > -65) {
                                                    break;
                                                } else {
/* 396 */                                           if ((((b2 + 112) + (b << 28)) >> 30) != 0) {
                                                        break;
                                                    } else {
/* 398 */                                               int i7 = i4 + 3;
/* 402 */                                               if (bArr[i6] > -65) {
                                                            break;
                                                        } else {
/* 404 */                                                   i4 += 4;
/* 408 */                                                   if (bArr[i7] > -65) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
/* 378 */                                       iI0000O = Oolio1l.I0000O(bArr, i5, i2);
                                                break;
                                            }
                                        } else if (i5 >= i2 - 1) {
/* 348 */                                   iI0000O = Oolio1l.I0000O(bArr, i5, i2);
                                            break;
                                        } else {
/* 353 */                                   int i8 = i4 + 2;
/* 355 */                                   byte b3 = bArr[i5];
/* 357 */                                   if (b3 > -65 || ((b == -32 && b3 < -96) || (b == -19 && b3 >= -96))) {
                                                break;
                                            } else {
/* 367 */                                       i4 += 3;
/* 371 */                                       if (bArr[i8] > -65) {
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (i5 < i2) {
/* 333 */                               if (b < -62) {
                                            break;
                                        } else {
/* 335 */                                   i4 += 2;
/* 339 */                                   if (bArr[i5] > -65) {
                                                break;
                                            }
                                        }
                                    } else {
/* 169 */                               iI0000O = b;
                                        break;
                                    }
                                }
/* 159 */                       iI0000O = z ? 1 : 0;
                            }
                            break;
                        default:
/* 32 */                    if ((i4 | i2 | (bArr.length - i2)) >= 0) {
                                long j2 = i4;
/* 37 */                        int i9 = (int) (i2 - j2);
/* 40 */                        if (i9 < 16) {
/* 42 */                            z = false;
/* 44 */                            j = 1;
/* 46 */                            i3 = 0;
                                } else {
/* 51 */                            int i10 = 8 - (((int) j2) & 7);
/* 53 */                            long j3 = j2;
/* 54 */                            j = 1;
/* 56 */                            i3 = 0;
                                    while (true) {
/* 57 */                                if (i3 < i10) {
/* 59 */                                    long j4 = j3 + 1;
/* 65 */                                    if (Ooil11Oi.I0000oI00(j3, bArr) < 0) {
/* 67 */                                        z = false;
                                            } else {
/* 70 */                                        i3++;
/* 72 */                                        j3 = j4;
                                            }
                                        } else {
                                            while (true) {
/* 75 */                                        int i11 = i3 + 8;
/* 77 */                                        if (i11 <= i9) {
/* 83 */                                            z = false;
/* 102 */                                           if ((Ooil11Oi.I000OOo1O(Ooil11Oi.I0001Ioi1lo + j3, bArr) & (-9187201950435737472L)) == 0) {
/* 107 */                                               j3 += 8;
/* 108 */                                               i3 = i11;
                                                    }
                                                } else {
/* 111 */                                           z = false;
                                                }
                                            }
                                            while (true) {
/* 113 */                                       if (i3 < i9) {
/* 115 */                                           long j5 = j3 + 1;
/* 121 */                                           if (Ooil11Oi.I0000oI00(j3, bArr) >= 0) {
/* 124 */                                               i3++;
/* 126 */                                               j3 = j5;
                                                    }
                                                } else {
/* 128 */                                           i3 = i9;
                                                }
                                            }
                                        }
                                    }
                                }
/* 129 */                       int i12 = i9 - i3;
/* 131 */                       long j6 = j2 + i3;
                                while (true) {
/* 132 */                           b = z ? 1 : 0;
                                    while (true) {
/* 134 */                               if (i12 > 0) {
/* 136 */                                   long j7 = j6 + j;
/* 138 */                                   byte bI0000oI00 = Ooil11Oi.I0000oI00(j6, bArr);
/* 142 */                                   if (bI0000oI00 >= 0) {
                                                i12--;
/* 148 */                                       b = bI0000oI00;
/* 149 */                                       j6 = j7;
                                            } else {
/* 154 */                                       b = bI0000oI00;
/* 155 */                                       j6 = j7;
                                            }
                                        }
                                    }
/* 157 */                           if (i12 != 0) {
                                        int i13 = i12 - 1;
/* 165 */                               if (b >= -32) {
/* 188 */                                   if (b >= -16) {
/* 231 */                                       if (i13 >= 3) {
                                                    i12 -= 4;
/* 241 */                                           long j8 = j6 + j;
/* 243 */                                           byte bI0000oI002 = Ooil11Oi.I0000oI00(j6, bArr);
/* 247 */                                           if (bI0000oI002 > -65) {
                                                        break;
                                                    } else {
/* 256 */                                               if ((((bI0000oI002 + 112) + (b << 28)) >> 30) != 0) {
                                                            break;
                                                        } else {
/* 258 */                                                   long j9 = j6 + 2;
/* 264 */                                                   if (Ooil11Oi.I0000oI00(j8, bArr) > -65) {
                                                                break;
                                                            } else {
/* 268 */                                                       j6 += 3;
/* 273 */                                                       if (Ooil11Oi.I0000oI00(j9, bArr) > -65) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
/* 233 */                                           iI0000O = I0000O(j6, bArr, b, i13);
                                                    break;
                                                }
                                            } else if (i13 < 2) {
/* 193 */                                       iI0000O = I0000O(j6, bArr, b, i13);
                                                break;
                                            } else {
                                                i12 -= 3;
/* 203 */                                       long j10 = j6 + j;
/* 205 */                                       byte bI0000oI003 = Ooil11Oi.I0000oI00(j6, bArr);
/* 209 */                                       if (bI0000oI003 > -65 || ((b == -32 && bI0000oI003 < -96) || (b == -19 && bI0000oI003 >= -96))) {
                                                    break;
                                                } else {
/* 219 */                                           j6 += 2;
/* 224 */                                           if (Ooil11Oi.I0000oI00(j10, bArr) > -65) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (i13 != 0) {
                                            i12 -= 2;
/* 174 */                                   if (b < -62) {
                                                break;
                                            } else {
/* 176 */                                       long j11 = j6 + j;
/* 182 */                                       if (Ooil11Oi.I0000oI00(j6, bArr) > -65) {
                                                    break;
                                                } else {
/* 186 */                                           j6 = j11;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            } else {
/* 277 */                       z = false;
/* 298 */                       OoOil11Ol1o.I000o00OoI0I("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)});
                            }
/* 159 */                   iI0000O = z ? 1 : 0;
                            break;
                    }
/* 410 */           if (iI0000O == 0) {
/* 412 */               return true;
                    }
/* 414 */           return z;
                }
            }
