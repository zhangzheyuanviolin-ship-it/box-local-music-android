            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import p000.OoOil11Ol1o;
            
            final class zzaiy {
                static {
                    try {
/* 7 */                 if (System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") != null) {
/* 55 */                    return;
                        }
                    } catch (SecurityException unused) {
                    }
/* 14 */            if (zzait.zzx() && zzait.zzy()) {
/* 22 */                int i = zzaes.zza;
                    }
                }

                public static int zza(String str, byte[] bArr, int i, int i2) {
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
/* 35 */            while (i6 < length) {
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
/* 125 */                       if (i7 > i3 - 4) {
/* 196 */                           if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i4 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
/* 218 */                               return zzaiv.zza(str, bArr, i, i2);
                                    }
/* 225 */                           OoOil11Ol1o.I0010I0i("Not enough space in output buffer to encode UTF-8 string");
/* 5 */                             return 0;
                                }
/* 127 */                       i6++;
/* 133 */                       if (i6 != str.length()) {
/* 135 */                           char cCharAt3 = str.charAt(i6);
/* 143 */                           if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
/* 150 */                               int i8 = i7 + 3;
/* 152 */                               int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
/* 161 */                               bArr[i7] = (byte) ((codePoint >>> 18) | 240);
/* 169 */                               bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | Barcode.FORMAT_ITF);
/* 177 */                               bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | Barcode.FORMAT_ITF);
/* 179 */                               i7 += 4;
/* 185 */                               bArr[i8] = (byte) ((codePoint & 63) | Barcode.FORMAT_ITF);
                                    }
                                }
/* 191 */                       return zzaiv.zza(str, bArr, i, i2);
                            }
/* 105 */                   bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
/* 113 */                   bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | Barcode.FORMAT_ITF);
/* 119 */                   bArr[i7 + 2] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
/* 98 */                    i7 += 3;
                        }
/* 187 */               i6++;
                    }
/* 1182 */          return i7;
                }

                public static int zzb(String str) {
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
                            try {
/* 39 */                        int length2 = str.length();
/* 43 */                        int i3 = 0;
/* 44 */                        while (i < length2) {
/* 46 */                            char cCharAt2 = str.charAt(i);
/* 50 */                            if (cCharAt2 < 2048) {
/* 56 */                                i3 += (127 - cCharAt2) >>> 31;
                                    } else {
/* 58 */                                i3 += 2;
/* 63 */                                if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
/* 76 */                                    if (Character.codePointAt(str, i) < 65536) {
/* 86 */                                        throw new zzaix(i, length2);
                                            }
/* 78 */                                    i++;
                                        }
                                    }
/* 87 */                            i++;
                                }
/* 90 */                        i2 += i3;
                            } catch (zzaix unused) {
/* 98 */                        return str.getBytes(zzagp.zza).length;
                            }
                        }
                    }
/* 100 */           if (i2 >= length) {
/* 102 */               return i2;
                    }
/* 110 */           OoOil11Ol1o.I000II(i2 + 4294967296L);
/* 5 */             return 0;
                }

                public static String zzc(byte[] bArr, int i, int i2) {
                    int i3;
/* 1 */             if (i2 == 0) {
/* 182 */               return "";
                    }
/* 3 */             int length = bArr.length;
/* 11 */            if ((((length - i) - i2) | i | i2) < 0) {
/* 178 */               OoOil11Ol1o.I000o00OoI0I("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)});
/* 10 */                return null;
                    }
/* 13 */            int i4 = i + i2;
/* 15 */            char[] cArr = new char[i2];
/* 18 */            int i5 = 0;
/* 19 */            while (i < i4) {
/* 21 */                byte b = bArr[i];
/* 27 */                if (!zzaiu.zzd(b)) {
                            break;
                        }
/* 29 */                i++;
/* 34 */                cArr[i5] = (char) b;
/* 31 */                i5++;
                    }
/* 38 */            int i6 = i5;
/* 39 */            while (i < i4) {
/* 41 */                int i7 = i + 1;
/* 43 */                byte b2 = bArr[i];
/* 49 */                if (zzaiu.zzd(b2)) {
/* 54 */                    cArr[i6] = (char) b2;
/* 51 */                    i6++;
/* 57 */                    i = i7;
/* 58 */                    while (i < i4) {
/* 60 */                        byte b3 = bArr[i];
/* 66 */                        if (zzaiu.zzd(b3)) {
/* 68 */                            i++;
/* 73 */                            cArr[i6] = (char) b3;
/* 70 */                            i6++;
                                }
                            }
                        } else {
/* 81 */                    if (b2 < -32) {
/* 83 */                        if (i7 >= i4) {
/* 96 */                            OoOil11Ol1o.I001i1O0Ol("Protocol message had invalid UTF-8.");
/* 10 */                            return null;
                                }
/* 85 */                        i3 = i6 + 1;
/* 87 */                        i += 2;
/* 91 */                        zzaiu.zzc(b2, bArr[i7], cArr, i6);
                            } else if (b2 < -16) {
/* 106 */                       if (i7 >= i4 - 1) {
/* 122 */                           OoOil11Ol1o.I001i1O0Ol("Protocol message had invalid UTF-8.");
/* 10 */                            return null;
                                }
/* 108 */                       i3 = i6 + 1;
/* 110 */                       int i8 = i + 2;
/* 114 */                       i += 3;
/* 118 */                       zzaiu.zzb(b2, bArr[i7], bArr[i8], cArr, i6);
                            } else {
/* 128 */                       if (i7 >= i4 - 2) {
/* 150 */                           OoOil11Ol1o.I001i1O0Ol("Protocol message had invalid UTF-8.");
/* 10 */                            return null;
                                }
/* 132 */                       byte b4 = bArr[i7];
/* 134 */                       int i9 = i + 3;
/* 136 */                       byte b5 = bArr[i + 2];
/* 138 */                       i += 4;
/* 144 */                       zzaiu.zza(b2, b4, b5, bArr[i9], cArr, i6);
/* 147 */                       i6 += 2;
                            }
/* 94 */                    i6 = i3;
                        }
                    }
/* 156 */           return new String(cArr, 0, i6);
                }
            }
