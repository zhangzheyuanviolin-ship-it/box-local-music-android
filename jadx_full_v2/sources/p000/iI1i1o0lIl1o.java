            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.nio.charset.StandardCharsets;
            
            public abstract class iI1i1o0lIl1o {
                static {
/* 1 */             int i = i1ioiooIiOol.I00000oIO;
                }

                public static boolean I00000oIO(byte[] bArr, int i, int i2) {
/* 1 */             while (i < i2 && bArr[i] >= 0) {
/* 7 */                 i++;
                    }
/* 11 */            if (i >= i2) {
/* 10 */                return true;
                    }
/* 14 */            while (i < i2) {
/* 17 */                int i3 = i + 1;
/* 19 */                byte b = bArr[i];
/* 21 */                if (b >= 0) {
/* 115 */                   i = i3;
                        } else {
/* 28 */                    if (b < -32) {
/* 30 */                        if (i3 < i2 && b >= -62) {
/* 37 */                            i += 2;
/* 41 */                            if (bArr[i3] > -65) {
                                    }
                                }
/* 27 */                        return false;
                            }
/* 46 */                    if (b >= -16) {
/* 84 */                        if (i3 >= i2 - 2) {
/* 27 */                            return false;
                                }
/* 87 */                        int i4 = i + 2;
/* 89 */                        byte b2 = bArr[i3];
/* 91 */                        if (b2 <= -65) {
/* 100 */                           if ((((b2 + 112) + (b << 28)) >> 30) == 0) {
/* 102 */                               int i5 = i + 3;
/* 106 */                               if (bArr[i4] <= -65) {
/* 108 */                                   i += 4;
/* 112 */                                   if (bArr[i5] > -65) {
                                            }
                                        }
                                    }
                                }
/* 27 */                        return false;
                            }
/* 50 */                    if (i3 >= i2 - 1) {
/* 27 */                        return false;
                            }
/* 53 */                    int i6 = i + 2;
/* 55 */                    byte b3 = bArr[i3];
/* 57 */                    if (b3 > -65 || (b == -32 && b3 < -96)) {
/* 27 */                        return false;
                            }
/* 69 */                    if (b == -19 && b3 >= -96) {
/* 27 */                        return false;
                            }
/* 75 */                    i += 3;
/* 79 */                    if (bArr[i6] > -65) {
/* 27 */                        return false;
                            }
                        }
                    }
/* 10 */            return true;
                }

                public static int I00000oOI(String str) {
/* 1 */             int length = str.length();
/* 5 */             int i = 0;
/* 6 */             int i2 = 0;
/* 7 */             while (i2 < length && str.charAt(i2) < 128) {
/* 17 */                i2++;
                    }
/* 20 */            int i3 = length;
                    while (true) {
/* 21 */                if (i2 >= length) {
                            break;
                        }
/* 23 */                char cCharAt = str.charAt(i2);
/* 29 */                if (cCharAt < 2048) {
/* 35 */                    i3 += (127 - cCharAt) >>> 31;
/* 36 */                    i2++;
                        } else {
                            try {
/* 39 */                        int length2 = str.length();
/* 43 */                        while (i2 < length2) {
/* 45 */                            char cCharAt2 = str.charAt(i2);
/* 49 */                            if (cCharAt2 < 2048) {
/* 55 */                                i += (127 - cCharAt2) >>> 31;
                                    } else {
/* 57 */                                i += 2;
/* 62 */                                if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
/* 75 */                                    if (Character.codePointAt(str, i2) < 65536) {
/* 95 */                                        throw new iI1i00ioi(i1O1ll0i0.I0000Il00O(length2, i2, (byte) 32, "Unpaired surrogate at index ", " of "));
                                            }
/* 77 */                                    i2++;
                                        }
                                    }
/* 96 */                            i2++;
                                }
/* 99 */                        i3 += i;
                            } catch (iI1i00ioi unused) {
/* 107 */                       return str.getBytes(StandardCharsets.UTF_8).length;
                            }
                        }
                    }
/* 109 */           if (i3 >= length) {
/* 111 */               return i3;
                    }
/* 120 */           long j = i3 + 4294967296L;
/* 133 */           StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 34);
/* 138 */           sb.append("UTF-8 length does not fit in int: ");
/* 141 */           sb.append(j);
/* 168 */           throw new IllegalArgumentException(sb.toString());
                }

                public static int I0000Il00O(String str, byte[] bArr, int i, int i2) {
                    int i3;
                    int i4;
                    int length;
                    int i5;
                    char cCharAt;
/* 1 */             int length2 = str.length();
/* 6 */             int i6 = 0;
                    while (true) {
/* 7 */                 i3 = i + i2;
/* 11 */                if (i6 >= length2 || (i5 = i6 + i) >= i3 || (cCharAt = str.charAt(i6)) >= 128) {
                            break;
                        }
/* 24 */                bArr[i5] = (byte) cCharAt;
/* 26 */                i6++;
                    }
/* 29 */            if (i6 == length2) {
/* 31 */                return i + length2;
                    }
/* 33 */            int i7 = i + i6;
/* 35 */            while (i6 < length2) {
/* 37 */                char cCharAt2 = str.charAt(i6);
/* 41 */                if (cCharAt2 < 128 && i7 < i3) {
/* 48 */                    bArr[i7] = (byte) cCharAt2;
/* 45 */                    i7++;
                        } else if (cCharAt2 < 2048 && i7 <= i3 - 2) {
/* 70 */                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
/* 76 */                    bArr[i7 + 1] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
/* 63 */                    i7 += 2;
                        } else {
/* 86 */                    if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i7 > i3 - 3) {
/* 127 */                       if (i7 <= i3 - 4) {
/* 129 */                           i6++;
/* 135 */                           if (i6 != str.length()) {
/* 137 */                               char cCharAt3 = str.charAt(i6);
/* 145 */                               if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
/* 152 */                                   int i8 = i7 + 3;
/* 154 */                                   int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
/* 163 */                                   bArr[i7] = (byte) ((codePoint >>> 18) | 240);
/* 171 */                                   bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | Barcode.FORMAT_ITF);
/* 179 */                                   bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | Barcode.FORMAT_ITF);
/* 181 */                                   i7 += 4;
/* 187 */                                   bArr[i8] = (byte) ((codePoint & 63) | Barcode.FORMAT_ITF);
                                        }
                                    }
/* 195 */                           byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
/* 199 */                           length = bytes.length;
/* 202 */                           if (length - i > i2) {
/* 209 */                               OoOil11Ol1o.I0010I0i("Not enough space in output buffer to encode UTF-8 string");
/* 5 */                                 return 0;
                                    }
/* 204 */                           System.arraycopy(bytes, 0, bArr, i, length);
                                } else {
/* 213 */                           if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i4 = i6 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
/* 254 */                               OoOil11Ol1o.I0010I0i("Not enough space in output buffer to encode UTF-8 string");
/* 5 */                                 return 0;
                                    }
/* 237 */                           byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
/* 241 */                           length = bytes2.length;
/* 244 */                           if (length - i > i2) {
/* 250 */                               OoOil11Ol1o.I0010I0i("Not enough space in output buffer to encode UTF-8 string");
/* 5 */                                 return 0;
                                    }
/* 246 */                           System.arraycopy(bytes2, 0, bArr, i, length);
                                }
/* 207 */                       return i + length;
                            }
/* 105 */                   bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
/* 113 */                   bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | Barcode.FORMAT_ITF);
/* 119 */                   bArr[i7 + 2] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
/* 98 */                    i7 += 3;
                        }
/* 189 */               i6++;
                    }
/* 1182 */          return i7;
                }

                public static String I0000O(byte[] bArr, int i, int i2) throws iI00lI {
/* 1 */             if (i2 == 0) {
/* 298 */               return "";
                    }
/* 3 */             int length = bArr.length;
/* 11 */            if ((((length - i) - i2) | i | i2) < 0) {
/* 294 */               OoOil11Ol1o.I000o00OoI0I("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)});
/* 10 */                return null;
                    }
/* 13 */            int i3 = i + i2;
/* 15 */            char[] cArr = new char[i2];
/* 18 */            int i4 = 0;
/* 19 */            while (i < i3) {
/* 21 */                byte b = bArr[i];
/* 23 */                if (b < 0) {
                            break;
                        }
/* 25 */                i++;
/* 30 */                cArr[i4] = (char) b;
/* 27 */                i4++;
                    }
/* 34 */            while (i < i3) {
/* 36 */                int i5 = i + 1;
/* 38 */                byte b2 = bArr[i];
/* 40 */                if (b2 >= 0) {
/* 45 */                    cArr[i4] = (char) b2;
/* 42 */                    i4++;
/* 48 */                    i = i5;
/* 49 */                    while (i < i3) {
/* 51 */                        byte b3 = bArr[i];
/* 53 */                        if (b3 >= 0) {
/* 55 */                            i++;
/* 60 */                            cArr[i4] = (char) b3;
/* 57 */                            i4++;
                                }
                            }
                        } else {
/* 68 */                    if (b2 >= -32) {
/* 110 */                       if (b2 >= -16) {
/* 180 */                           if (i5 >= i3 - 2) {
/* 266 */                               iilo0lOo110.I000II("Protocol message had invalid UTF-8.");
/* 10 */                                return null;
                                    }
/* 184 */                           byte b4 = bArr[i5];
/* 186 */                           int i6 = i + 3;
/* 188 */                           byte b5 = bArr[i + 2];
/* 190 */                           i += 4;
/* 192 */                           byte b6 = bArr[i6];
/* 198 */                           if (!liiIiol0.I00000oIO(b4)) {
/* 207 */                               if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !liiIiol0.I00000oIO(b5) && !liiIiol0.I00000oIO(b6)) {
/* 237 */                                   int i7 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
/* 245 */                                   cArr[i4] = (char) ((i7 >>> 10) + 55232);
/* 256 */                                   cArr[i4 + 1] = (char) ((i7 & 1023) + 56320);
/* 258 */                                   i4 += 2;
                                        }
                                    }
/* 262 */                           iilo0lOo110.I000II("Protocol message had invalid UTF-8.");
/* 10 */                            return null;
                                }
/* 114 */                       if (i5 >= i3 - 1) {
/* 174 */                           iilo0lOo110.I000II("Protocol message had invalid UTF-8.");
/* 10 */                            return null;
                                }
/* 116 */                       int i8 = i4 + 1;
/* 118 */                       int i9 = i + 2;
/* 120 */                       byte b7 = bArr[i5];
/* 122 */                       i += 3;
/* 124 */                       byte b8 = bArr[i9];
/* 130 */                       if (!liiIiol0.I00000oIO(b7)) {
/* 134 */                           if (b2 == -32) {
/* 136 */                               if (b7 >= -96) {
/* 138 */                                   b2 = -32;
                                        }
                                    }
/* 141 */                           if (b2 == -19) {
/* 143 */                               if (b7 < -96) {
/* 145 */                                   b2 = -19;
                                        }
                                    }
/* 150 */                           if (!liiIiol0.I00000oIO(b8)) {
/* 165 */                               cArr[i4] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
/* 167 */                               i4 = i8;
                                    }
                                }
/* 170 */                       iilo0lOo110.I000II("Protocol message had invalid UTF-8.");
/* 10 */                        return null;
                            }
/* 70 */                    if (i5 >= i3) {
/* 104 */                       iilo0lOo110.I000II("Protocol message had invalid UTF-8.");
/* 10 */                        return null;
                            }
/* 72 */                    int i10 = i4 + 1;
/* 74 */                    i += 2;
/* 76 */                    byte b9 = bArr[i5];
/* 80 */                    if (b2 < -62 || liiIiol0.I00000oIO(b9)) {
/* 100 */                       iilo0lOo110.I000II("Protocol message had invalid UTF-8.");
/* 10 */                        return null;
                            }
/* 96 */                    cArr[i4] = (char) ((b9 & 63) | ((b2 & 31) << 6));
/* 98 */                    i4 = i10;
                        }
                    }
/* 272 */           return new String(cArr, 0, i4);
                }
            }
