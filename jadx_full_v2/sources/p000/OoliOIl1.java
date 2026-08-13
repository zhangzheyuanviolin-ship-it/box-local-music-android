            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.Arrays;
            
            public final class OoliOIl1 {
                public final int I00000oIO;

                public OoliOIl1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static int I0000Il00O(String str, byte[] bArr, int i, int i2) {
/* 3 */             byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
/* 10 */            if (bytes.length - i <= i2) {
/* 13 */                System.arraycopy(bytes, 0, bArr, i, bytes.length);
/* 17 */                return i + bytes.length;
                    }
/* 21 */            OoOil11Ol1o.I0010I0i("Not enough space in output buffer to encode UTF-8 string");
/* 9 */             return 0;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I00000oIO(byte[] bArr, int i, int i2) throws O0010I0o {
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
/* 147 */                                       throw O0010I0o.I00000oIO();
                                            }
/* 110 */                                   i += 2;
/* 112 */                                   byte b4 = bArr[i5];
/* 114 */                                   int i7 = i4 + 1;
/* 118 */                                   if (b2 < -62 || li0O10l0.I00000oIO(b4)) {
/* 142 */                                       throw O0010I0o.I00000oIO();
                                            }
/* 134 */                                   cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
/* 136 */                                   i4 = i7;
                                        } else {
/* 150 */                                   if (b2 >= -16) {
/* 220 */                                       if (i5 >= i3 - 2) {
/* 311 */                                           throw O0010I0o.I00000oIO();
                                                }
/* 224 */                                       byte b5 = bArr[i5];
/* 226 */                                       int i8 = i + 3;
/* 228 */                                       byte b6 = bArr[i + 2];
/* 230 */                                       i += 4;
/* 232 */                                       byte b7 = bArr[i8];
/* 234 */                                       int i9 = i4 + 1;
/* 240 */                                       if (!li0O10l0.I00000oIO(b5)) {
/* 249 */                                           if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !li0O10l0.I00000oIO(b6) && !li0O10l0.I00000oIO(b7)) {
/* 279 */                                               int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
/* 287 */                                               cArr[i4] = (char) ((i10 >>> 10) + 55232);
/* 296 */                                               cArr[i9] = (char) ((i10 & 1023) + 56320);
/* 298 */                                               i4 += 2;
                                                    }
                                                }
/* 306 */                                       throw O0010I0o.I00000oIO();
                                            }
/* 154 */                                   if (i5 >= i3 - 1) {
/* 217 */                                       throw O0010I0o.I00000oIO();
                                            }
/* 156 */                                   int i11 = i + 2;
/* 158 */                                   byte b8 = bArr[i5];
/* 160 */                                   i += 3;
/* 162 */                                   byte b9 = bArr[i11];
/* 164 */                                   int i12 = i4 + 1;
/* 170 */                                   if (li0O10l0.I00000oIO(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || li0O10l0.I00000oIO(b9)))) {
/* 212 */                                       throw O0010I0o.I00000oIO();
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
/* 8 */                     Charset charset = StandardCharsets.UTF_8;
/* 10 */                    String str = new String(bArr, i, i2, charset);
/* 20 */                    if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
/* 43 */                        throw O0010I0o.I00000oIO();
                            }
/* 38 */                    return str;
                    }
                }

                public final int I00000oOI(String str, byte[] bArr, int i, int i2) {
                    int i3;
                    int i4;
                    char cCharAt;
                    switch (this.I00000oIO) {
                        case 0:
/* 11 */                    int length = str.length();
/* 15 */                    int i5 = i + i2;
/* 18 */                    int i6 = 0;
/* 21 */                    while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
/* 34 */                        bArr[i4] = (byte) cCharAt;
/* 36 */                        i6++;
                            }
/* 39 */                    if (i6 == length) {
/* 41 */                        return i + length;
                            }
/* 45 */                    int i7 = i + i6;
/* 47 */                    while (i6 < length) {
/* 49 */                        char cCharAt2 = str.charAt(i6);
/* 53 */                        if (cCharAt2 < 128 && i7 < i5) {
/* 60 */                            bArr[i7] = (byte) cCharAt2;
/* 57 */                            i7++;
                                } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
/* 73 */                            int i8 = i7 + 1;
/* 80 */                            bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
/* 82 */                            i7 += 2;
/* 88 */                            bArr[i8] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
                                } else {
/* 97 */                            if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
/* 135 */                               if (i7 > i5 - 4) {
/* 206 */                                   if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
/* 228 */                                       return I0000Il00O(str, bArr, i, i2);
                                            }
/* 235 */                                   OoOil11Ol1o.I0010I0i("Not enough space in output buffer to encode UTF-8 string");
/* 17 */                                    return 0;
                                        }
/* 137 */                               i6++;
/* 143 */                               if (i6 != str.length()) {
/* 145 */                                   char cCharAt3 = str.charAt(i6);
/* 153 */                                   if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
/* 156 */                                       int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
/* 167 */                                       bArr[i7] = (byte) ((codePoint >>> 18) | 240);
/* 177 */                                       bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | Barcode.FORMAT_ITF);
/* 179 */                                       int i9 = i7 + 3;
/* 187 */                                       bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | Barcode.FORMAT_ITF);
/* 189 */                                       i7 += 4;
/* 195 */                                       bArr[i9] = (byte) ((codePoint & 63) | Barcode.FORMAT_ITF);
                                            }
                                        }
/* 201 */                               return I0000Il00O(str, bArr, i, i2);
                                    }
/* 112 */                           bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
/* 114 */                           int i10 = i7 + 2;
/* 122 */                           bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | Barcode.FORMAT_ITF);
/* 124 */                           i7 += 3;
/* 130 */                           bArr[i10] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
                                }
/* 197 */                       i6++;
                            }
/* 239 */                   return i7;
                        default:
/* 6 */                     return I0000Il00O(str, bArr, i, i2);
                    }
                }
            }
