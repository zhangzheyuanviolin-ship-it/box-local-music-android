            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.nio.charset.Charset;
            import java.util.Arrays;
            
            public final class OoliOoI00o {
                public final int I00000oIO;

                public OoliOoI00o(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I00000oIO(byte[] bArr, int i, int i2) throws O0011oo {
                    switch (this.I00000oIO) {
                        case 0:
/* 50 */                    if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
/* 337 */                       OoOil11Ol1o.I000o00OoI0I("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
/* 340 */                       return null;
                            }
/* 52 */                    int i3 = i + i2;
/* 54 */                    char[] cArr = new char[i2];
/* 57 */                    int i4 = 0;
/* 58 */                    while (i < i3) {
/* 60 */                        byte b = bArr[i];
/* 62 */                        if (b < 0) {
/* 73 */                            while (i < i3) {
/* 75 */                                int i5 = i + 1;
/* 77 */                                byte b2 = bArr[i];
/* 79 */                                if (b2 >= 0) {
/* 81 */                                    int i6 = i4 + 1;
/* 84 */                                    cArr[i4] = (char) b2;
/* 86 */                                    while (i5 < i3) {
/* 88 */                                        byte b3 = bArr[i5];
/* 90 */                                        if (b3 >= 0) {
/* 92 */                                            i5++;
/* 97 */                                            cArr[i6] = (char) b3;
/* 94 */                                            i6++;
                                                } else {
/* 101 */                                           i4 = i6;
/* 102 */                                           i = i5;
                                                }
                                            }
/* 101 */                                   i4 = i6;
/* 102 */                                   i = i5;
                                        } else if (b2 < -32) {
/* 108 */                                   if (i5 >= i3) {
/* 147 */                                       throw O0011oo.I00000oIO();
                                            }
/* 110 */                                   i += 2;
/* 112 */                                   byte b4 = bArr[i5];
/* 114 */                                   int i7 = i4 + 1;
/* 118 */                                   if (b2 < -62 || li0OiO0i.I00000oIO(b4)) {
/* 142 */                                       throw O0011oo.I00000oIO();
                                            }
/* 134 */                                   cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
/* 136 */                                   i4 = i7;
                                        } else {
/* 150 */                                   if (b2 >= -16) {
/* 220 */                                       if (i5 >= i3 - 2) {
/* 311 */                                           throw O0011oo.I00000oIO();
                                                }
/* 224 */                                       byte b5 = bArr[i5];
/* 226 */                                       int i8 = i + 3;
/* 228 */                                       byte b6 = bArr[i + 2];
/* 230 */                                       i += 4;
/* 232 */                                       byte b7 = bArr[i8];
/* 234 */                                       int i9 = i4 + 1;
/* 240 */                                       if (!li0OiO0i.I00000oIO(b5)) {
/* 249 */                                           if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !li0OiO0i.I00000oIO(b6) && !li0OiO0i.I00000oIO(b7)) {
/* 279 */                                               int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
/* 287 */                                               cArr[i4] = (char) ((i10 >>> 10) + 55232);
/* 296 */                                               cArr[i9] = (char) ((i10 & 1023) + 56320);
/* 298 */                                               i4 += 2;
                                                    }
                                                }
/* 306 */                                       throw O0011oo.I00000oIO();
                                            }
/* 154 */                                   if (i5 >= i3 - 1) {
/* 217 */                                       throw O0011oo.I00000oIO();
                                            }
/* 156 */                                   int i11 = i + 2;
/* 158 */                                   byte b8 = bArr[i5];
/* 160 */                                   i += 3;
/* 162 */                                   byte b9 = bArr[i11];
/* 164 */                                   int i12 = i4 + 1;
/* 170 */                                   if (li0OiO0i.I00000oIO(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || li0OiO0i.I00000oIO(b9)))) {
/* 212 */                                       throw O0011oo.I00000oIO();
                                            }
/* 203 */                                   cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & 15) << 12) | (b9 & 63));
/* 205 */                                   i4 = i12;
                                        }
                                    }
/* 314 */                           return new String(cArr, 0, i4);
                                }
/* 64 */                        i++;
/* 69 */                        cArr[i4] = (char) b;
/* 66 */                        i4++;
                            }
/* 73 */                    while (i < i3) {
                            }
/* 314 */                   return new String(cArr, 0, i4);
                        default:
/* 8 */                     Charset charset = IoolIIolo1lI.I00000oIO;
/* 10 */                    String str = new String(bArr, i, i2, charset);
/* 20 */                    if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
/* 43 */                        throw O0011oo.I00000oIO();
                            }
/* 38 */                    return str;
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
/* 602 */                                               throw new Oolio1Illi00(i7, length);
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
/* 567 */                                       throw new Oolio1Illi00(i7 - 1, length);
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
/* 54 */                        OoilIIl.I000OiO(bArr, j, (byte) cCharAt2);
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
/* 303 */                                               throw new Oolio1Illi00(i4, length2);
                                                    }
/* 327 */                                           throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                                }
/* 189 */                                       i14 = i4 + 1;
/* 191 */                                       if (i14 != length2) {
/* 193 */                                           char cCharAt6 = str.charAt(i14);
/* 201 */                                           if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
/* 203 */                                               int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
/* 214 */                                               OoilIIl.I000OiO(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
/* 231 */                                               OoilIIl.I000OiO(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | Barcode.FORMAT_ITF));
/* 234 */                                               long j3 = j + 3;
/* 242 */                                               OoilIIl.I000OiO(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | Barcode.FORMAT_ITF));
/* 245 */                                               j += 4;
/* 251 */                                               OoilIIl.I000OiO(bArr, j3, (byte) ((codePoint2 & 63) | Barcode.FORMAT_ITF));
                                                    }
                                                } else {
/* 265 */                                           i14 = i4;
                                                }
/* 273 */                                       throw new Oolio1Illi00(i14 - 1, length2);
                                            }
/* 151 */                                   OoilIIl.I000OiO(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
/* 156 */                                   long j4 = j + 2;
/* 166 */                                   OoilIIl.I000OiO(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | c2));
/* 169 */                                   j += 3;
/* 177 */                                   OoilIIl.I000OiO(bArr, j4, (byte) ((cCharAt5 & '?') | Barcode.FORMAT_ITF));
                                        } else {
/* 99 */                                    i4 = i14;
/* 100 */                                   long j5 = j + 1;
/* 107 */                                   OoilIIl.I000OiO(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
/* 110 */                                   j += 2;
/* 116 */                                   OoilIIl.I000OiO(bArr, j5, (byte) ((cCharAt5 & '?') | c2));
                                        }
/* 119 */                               i14 = i4;
                                    } else {
/* 82 */                                OoilIIl.I000OiO(bArr, j, (byte) cCharAt5);
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
            }
