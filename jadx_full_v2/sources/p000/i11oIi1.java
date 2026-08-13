            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class i11oIi1 {
                public static final int I00000oIO = 0;

                static {
/* 3 */             if (i11oI1O.I0000oI00 && i11oI1O.I0000O) {
/* 9 */                 int i = i111I1I110lI.I00000oIO;
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
/* 227 */                               throw new i11oIOIIoOO(i6, length);
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
/* 198 */                       throw new i11oIOIIoOO(i6 - 1, length);
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
/* 86 */                                    throw new i11oIOIIoOO(i, length2);
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

                /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x007a A[ORIG_RETURN, RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static boolean I0000O(byte[] bArr, int i, int i2) {
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
