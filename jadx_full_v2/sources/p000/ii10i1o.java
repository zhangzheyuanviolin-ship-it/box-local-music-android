            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class ii10i1o {
                static {
/* 3 */             if (ii10Oo1I0.I0000oI00 && ii10Oo1I0.I0000O) {
/* 9 */                 int i = ii010oO01I.I00000oIO;
                    }
                }

                public static int I00000oIO(byte[] bArr, int i, int i2) {
/* 1 */             int i3 = i2 - i;
/* 4 */             byte b = bArr[i - 1];
/* 8 */             if (i3 == 0) {
/* 53 */                if (b <= -12) {
/* 55 */                    return b;
                        }
/* 56 */                return -1;
                    }
/* 13 */            if (i3 == 1) {
/* 42 */                byte b2 = bArr[i];
/* 44 */                if (b > -12 || b2 > -65) {
/* 56 */                    return -1;
                        }
/* 51 */                return (b2 << 8) ^ b;
                    }
/* 16 */            if (i3 != 2) {
/* 37 */                OoOil11Ol1o.I0000Il00O();
/* 40 */                return 0;
                    }
/* 18 */            byte b3 = bArr[i];
/* 21 */            byte b4 = bArr[i + 1];
/* 23 */            if (b > -12 || b3 > -65 || b4 > -65) {
/* 56 */                return -1;
                    }
/* 35 */            return (b4 << 16) ^ ((b3 << 8) ^ b);
                }

                public static int I00000oOI(String str, byte[] bArr, int i, int i2) {
                    int i3;
                    int i4;
                    int i5;
                    char cCharAt;
/* 1 */             int length = str.length();
/* 6 */             int i6 = 0;
                    while (true) {
/* 7 */                 i3 = i + i2;
/* 11 */                if (i6 >= length || (i5 = i6 + i) >= i3 || (cCharAt = str.charAt(i6)) >= 128) {
                            break;
                        }
/* 24 */                bArr[i5] = (byte) cCharAt;
/* 26 */                i6++;
                    }
/* 29 */            if (i6 == length) {
/* 31 */                return i + length;
                    }
/* 33 */            int i7 = i + i6;
/* 34 */            while (i6 < length) {
/* 36 */                char cCharAt2 = str.charAt(i6);
/* 40 */                if (cCharAt2 < 128 && i7 < i3) {
/* 47 */                    bArr[i7] = (byte) cCharAt2;
/* 44 */                    i7++;
                        } else if (cCharAt2 < 2048 && i7 <= i3 - 2) {
/* 69 */                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
/* 75 */                    bArr[i7 + 1] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
/* 62 */                    i7 += 2;
                        } else {
/* 85 */                    if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i7 > i3 - 3) {
/* 124 */                       if (i7 > i3 - 4) {
/* 199 */                           if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i4 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
/* 227 */                               throw new ii10OoO1o(i6, length);
                                    }
/* 228 */                           iilo0lOo110.I00000oIO(cCharAt2, i7);
/* 5 */                             return 0;
                                }
/* 126 */                       int i8 = i6 + 1;
/* 132 */                       if (i8 != str.length()) {
/* 134 */                           char cCharAt3 = str.charAt(i8);
/* 142 */                           if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
/* 148 */                               int i9 = i7 + 3;
/* 150 */                               int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
/* 159 */                               bArr[i7] = (byte) ((codePoint >>> 18) | 240);
/* 167 */                               bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | Barcode.FORMAT_ITF);
/* 175 */                               bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | Barcode.FORMAT_ITF);
/* 177 */                               i7 += 4;
/* 183 */                               bArr[i9] = (byte) ((codePoint & 63) | Barcode.FORMAT_ITF);
/* 185 */                               i6 = i8;
                                    } else {
/* 190 */                               i6 = i8;
                                    }
                                }
/* 198 */                       throw new ii10OoO1o(i6 - 1, length);
                            }
/* 104 */                   bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
/* 112 */                   bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | Barcode.FORMAT_ITF);
/* 118 */                   bArr[i7 + 2] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
/* 97 */                    i7 += 3;
                        }
/* 186 */               i6++;
                    }
/* 1182 */          return i7;
                }

                public static int I0000Il00O(String str) {
/* 1 */             int length = str.length();
/* 6 */             int i = 0;
/* 7 */             while (i < length && str.charAt(i) < 128) {
/* 17 */                i++;
                    }
/* 20 */            int i2 = length;
                    while (true) {
/* 21 */                if (i >= length) {
                            break;
                        }
/* 23 */                char cCharAt = str.charAt(i);
/* 29 */                if (cCharAt < 2048) {
/* 35 */                    i2 += (127 - cCharAt) >>> 31;
/* 36 */                    i++;
                        } else {
/* 39 */                    int length2 = str.length();
/* 43 */                    int i3 = 0;
/* 44 */                    while (i < length2) {
/* 46 */                        char cCharAt2 = str.charAt(i);
/* 50 */                        if (cCharAt2 < 2048) {
/* 56 */                            i3 += (127 - cCharAt2) >>> 31;
                                } else {
/* 58 */                            i3 += 2;
/* 63 */                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
/* 76 */                                if (Character.codePointAt(str, i) < 65536) {
/* 86 */                                    throw new ii10OoO1o(i, length2);
                                        }
/* 78 */                                i++;
                                    }
                                }
/* 87 */                        i++;
                            }
/* 90 */                    i2 += i3;
                        }
                    }
/* 91 */            if (i2 >= length) {
/* 93 */                return i2;
                    }
/* 101 */           OoOil11Ol1o.I000II(i2 + 4294967296L);
/* 5 */             return 0;
                }

                public static String I0000O(byte[] bArr, int i, int i2) {
/* 1 */             int length = bArr.length;
/* 9 */             if ((((length - i) - i2) | i | i2) < 0) {
/* 292 */               OoOil11Ol1o.I000o00OoI0I("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)});
/* 8 */                 return null;
                    }
/* 11 */            int i3 = i + i2;
/* 13 */            char[] cArr = new char[i2];
/* 16 */            int i4 = 0;
/* 17 */            while (i < i3) {
/* 19 */                byte b = bArr[i];
/* 21 */                if (b < 0) {
                            break;
                        }
/* 23 */                i++;
/* 28 */                cArr[i4] = (char) b;
/* 25 */                i4++;
                    }
/* 32 */            while (i < i3) {
/* 34 */                int i5 = i + 1;
/* 36 */                byte b2 = bArr[i];
/* 38 */                if (b2 >= 0) {
/* 43 */                    cArr[i4] = (char) b2;
/* 40 */                    i4++;
/* 46 */                    i = i5;
/* 47 */                    while (i < i3) {
/* 49 */                        byte b3 = bArr[i];
/* 51 */                        if (b3 >= 0) {
/* 53 */                            i++;
/* 58 */                            cArr[i4] = (char) b3;
/* 55 */                            i4++;
                                }
                            }
                        } else {
/* 66 */                    if (b2 >= -32) {
/* 108 */                       if (b2 >= -16) {
/* 178 */                           if (i5 >= i3 - 2) {
/* 264 */                               OoOil11Ol1o.I001iOo1i0O("Protocol message had invalid UTF-8.");
/* 8 */                                 return null;
                                    }
/* 182 */                           byte b4 = bArr[i5];
/* 184 */                           int i6 = i + 3;
/* 186 */                           byte b5 = bArr[i + 2];
/* 188 */                           i += 4;
/* 190 */                           byte b6 = bArr[i6];
/* 196 */                           if (!lilIII0OOi.I00000oIO(b4)) {
/* 205 */                               if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !lilIII0OOi.I00000oIO(b5) && !lilIII0OOi.I00000oIO(b6)) {
/* 235 */                                   int i7 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
/* 243 */                                   cArr[i4] = (char) ((i7 >>> 10) + 55232);
/* 254 */                                   cArr[i4 + 1] = (char) ((i7 & 1023) + 56320);
/* 256 */                                   i4 += 2;
                                        }
                                    }
/* 260 */                           OoOil11Ol1o.I001iOo1i0O("Protocol message had invalid UTF-8.");
/* 8 */                             return null;
                                }
/* 112 */                       if (i5 >= i3 - 1) {
/* 172 */                           OoOil11Ol1o.I001iOo1i0O("Protocol message had invalid UTF-8.");
/* 8 */                             return null;
                                }
/* 114 */                       int i8 = i4 + 1;
/* 116 */                       int i9 = i + 2;
/* 118 */                       byte b7 = bArr[i5];
/* 120 */                       i += 3;
/* 122 */                       byte b8 = bArr[i9];
/* 128 */                       if (!lilIII0OOi.I00000oIO(b7)) {
/* 132 */                           if (b2 == -32) {
/* 134 */                               if (b7 >= -96) {
/* 136 */                                   b2 = -32;
                                        }
                                    }
/* 139 */                           if (b2 == -19) {
/* 141 */                               if (b7 < -96) {
/* 143 */                                   b2 = -19;
                                        }
                                    }
/* 148 */                           if (!lilIII0OOi.I00000oIO(b8)) {
/* 163 */                               cArr[i4] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
/* 165 */                               i4 = i8;
                                    }
                                }
/* 168 */                       OoOil11Ol1o.I001iOo1i0O("Protocol message had invalid UTF-8.");
/* 8 */                         return null;
                            }
/* 68 */                    if (i5 >= i3) {
/* 102 */                       OoOil11Ol1o.I001iOo1i0O("Protocol message had invalid UTF-8.");
/* 8 */                         return null;
                            }
/* 70 */                    int i10 = i4 + 1;
/* 72 */                    i += 2;
/* 74 */                    byte b9 = bArr[i5];
/* 78 */                    if (b2 < -62 || lilIII0OOi.I00000oIO(b9)) {
/* 98 */                        OoOil11Ol1o.I001iOo1i0O("Protocol message had invalid UTF-8.");
/* 8 */                         return null;
                            }
/* 94 */                    cArr[i4] = (char) ((b9 & 63) | ((b2 & 31) << 6));
/* 96 */                    i4 = i10;
                        }
                    }
/* 270 */           return new String(cArr, 0, i4);
                }

                /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x007a A[ORIG_RETURN, RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static boolean I0000oI00(byte[] bArr, int i, int i2) {
/* 1 */             while (i < i2 && bArr[i] >= 0) {
/* 7 */                 i++;
                    }
/* 10 */            if (i >= i2) {
/* 123 */               return true;
                    }
/* 14 */            while (i < i2) {
/* 16 */                int i3 = i + 1;
/* 18 */                int iI00000oIO = bArr[i];
/* 20 */                if (iI00000oIO >= 0) {
/* 121 */                   i = i3;
                        } else if (iI00000oIO < -32) {
/* 28 */                    if (i3 >= i2) {
                                return iI00000oIO == 0;
                            }
/* 33 */                    if (iI00000oIO < -62) {
/* 119 */                       return false;
                            }
/* 35 */                    i += 2;
/* 39 */                    if (bArr[i3] > 65471) {
/* 119 */                       return false;
                            }
                        } else if (iI00000oIO < -16) {
/* 48 */                    if (i3 >= i2 - 1) {
/* 50 */                        iI00000oIO = I00000oIO(bArr, i3, i2);
                                if (iI00000oIO == 0) {
                                }
                            } else {
/* 55 */                        int i4 = i + 2;
/* 57 */                        char c = bArr[i3];
/* 59 */                        if (c > 65471) {
/* 119 */                           return false;
                                }
/* 63 */                        if (iI00000oIO == -32 && c < 65440) {
/* 119 */                           return false;
                                }
/* 69 */                        if (iI00000oIO == -19 && c >= 65440) {
/* 119 */                           return false;
                                }
/* 73 */                        i += 3;
/* 77 */                        if (bArr[i4] > 65471) {
/* 119 */                           return false;
                                }
                            }
                        } else if (i3 >= i2 - 2) {
/* 84 */                    iI00000oIO = I00000oIO(bArr, i3, i2);
                            if (iI00000oIO == 0) {
                            }
                        } else {
/* 91 */                    int i5 = i + 2;
/* 93 */                    int i6 = bArr[i3];
/* 95 */                    if (i6 > -65) {
/* 119 */                       return false;
                            }
/* 104 */                   if ((((i6 + 112) + (iI00000oIO << 28)) >> 30) != 0) {
/* 119 */                       return false;
                            }
/* 106 */                   int i7 = i + 3;
/* 110 */                   if (bArr[i5] > 65471) {
/* 119 */                       return false;
                            }
/* 112 */                   i += 4;
/* 116 */                   if (bArr[i7] > 65471) {
/* 119 */                       return false;
                            }
                        }
                    }
/* 123 */           return true;
                }
            }
