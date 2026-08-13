            package p000;
            
            public abstract class liIilo01o {
                /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[PHI: r7
                  0x005e: PHI (r7v29 int) = (r7v5 int), (r7v18 int), (r7v18 int), (r7v21 int), (r7v28 int), (r7v37 int), (r7v38 int) binds: [B:90:0x014b, B:65:0x00dc, B:67:0x00e2, B:54:0x00ba, B:40:0x0084, B:28:0x0058, B:27:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final String I00000oIO(byte[] bArr, int i, int i2) {
                    int i3;
                    int i4;
                    int i5;
/* 3 */             int i6 = i;
/* 7 */             if (i6 < 0 || i2 > bArr.length || i6 > i2) {
/* 2160 */              throw new IndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i6 + " endIndex=" + i2);
                    }
/* 14 */            int i7 = i2 - i6;
/* 16 */            char[] cArr = new char[i7];
/* 19 */            int i8 = 0;
/* 20 */            while (i6 < i2) {
/* 22 */                byte b = bArr[i6];
/* 24 */                if (b >= 0) {
/* 27 */                    int i9 = i8 + 1;
/* 29 */                    cArr[i8] = (char) b;
/* 31 */                    i6++;
/* 33 */                    while (i6 < i2) {
/* 35 */                        byte b2 = bArr[i6];
/* 37 */                        if (b2 < 0) {
                                    break;
                                }
/* 39 */                        i6++;
/* 44 */                        cArr[i9] = (char) b2;
/* 42 */                        i9++;
                            }
/* 48 */                    i8 = i9;
                        } else {
/* 59 */                    if ((b >> 5) == -2) {
/* 61 */                        int i10 = i6 + 1;
/* 63 */                        if (i2 <= i10) {
/* 65 */                            i3 = i8 + 1;
/* 67 */                            cArr[i8] = 65533;
                                } else {
/* 71 */                            byte b3 = bArr[i10];
/* 75 */                            if ((b3 & 192) == 128) {
/* 81 */                                int i11 = (b << 6) ^ (b3 ^ 3968);
/* 82 */                                if (i11 < 128) {
/* 84 */                                    i3 = i8 + 1;
/* 86 */                                    cArr[i8] = 65533;
                                        } else {
/* 92 */                                    cArr[i8] = (char) i11;
/* 90 */                                    i3 = i8 + 1;
                                        }
                                    } else {
/* 97 */                                i3 = i8 + 1;
/* 99 */                                cArr[i8] = 65533;
                                    }
                                }
                            } else if ((b >> 4) == -2) {
/* 117 */                       int i12 = i6 + 2;
/* 119 */                       if (i2 <= i12) {
/* 121 */                           i3 = i8 + 1;
/* 123 */                           cArr[i8] = 65533;
/* 125 */                           int i13 = i6 + 1;
/* 127 */                           i5 = (i2 <= i13 || (bArr[i13] & 192) != 128) ? 1 : 2;
                                } else {
/* 138 */                           byte b4 = bArr[i6 + 1];
/* 142 */                           if ((b4 & 192) == 128) {
/* 144 */                               byte b5 = bArr[i12];
/* 148 */                               if ((b5 & 192) == 128) {
/* 159 */                                   int i14 = (b << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
/* 162 */                                   if (i14 < 2048) {
/* 164 */                                       i3 = i8 + 1;
/* 166 */                                       cArr[i8] = 65533;
                                            } else if (55296 > i14 || i14 >= 57344) {
/* 181 */                                       cArr[i8] = (char) i14;
/* 179 */                                       i3 = i8 + 1;
                                            } else {
/* 173 */                                       i3 = i8 + 1;
/* 175 */                                       cArr[i8] = 65533;
                                            }
/* 184 */                                   i5 = 3;
                                        } else {
/* 187 */                                   i3 = i8 + 1;
/* 189 */                                   cArr[i8] = 65533;
                                        }
                                    } else {
/* 192 */                               i3 = i8 + 1;
/* 194 */                               cArr[i8] = 65533;
                                    }
                                }
                            } else if ((b >> 3) == -2) {
/* 201 */                       int i15 = i6 + 3;
/* 203 */                       if (i2 <= i15) {
/* 205 */                           i3 = i8 + 1;
/* 207 */                           cArr[i8] = 65533;
/* 209 */                           int i16 = i6 + 1;
/* 211 */                           if (i2 > i16 && (bArr[i16] & 192) == 128) {
/* 219 */                               int i17 = i6 + 2;
/* 221 */                               if (i2 > i17 && (bArr[i17] & 192) == 128) {
/* 184 */                                   i5 = 3;
                                        }
                                    }
                                } else {
/* 232 */                           byte b6 = bArr[i6 + 1];
/* 236 */                           if ((b6 & 192) == 128) {
/* 240 */                               byte b7 = bArr[i6 + 2];
/* 244 */                               if ((b7 & 192) == 128) {
/* 246 */                                   byte b8 = bArr[i15];
/* 250 */                                   if ((b8 & 192) == 128) {
/* 264 */                                       int i18 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
/* 268 */                                       if (i18 > 1114111) {
/* 270 */                                           i3 = i8 + 1;
/* 272 */                                           cArr[i8] = 65533;
                                                } else if ((55296 > i18 || i18 >= 57344) && i18 >= 65536) {
/* 293 */                                           if (i18 != 65533) {
/* 304 */                                               cArr[i8] = (char) ((i18 >>> 10) + 55232);
/* 313 */                                               i4 = i8 + 2;
/* 315 */                                               cArr[i8 + 1] = (char) ((i18 & 1023) + 56320);
                                                    } else {
/* 320 */                                               cArr[i8] = 65533;
/* 318 */                                               i4 = i8 + 1;
                                                    }
/* 323 */                                           i3 = i4;
                                                } else {
/* 288 */                                           i3 = i8 + 1;
/* 290 */                                           cArr[i8] = 65533;
                                                }
/* 324 */                                       i5 = 4;
                                            } else {
/* 327 */                                       i3 = i8 + 1;
/* 329 */                                       cArr[i8] = 65533;
/* 184 */                                       i5 = 3;
                                            }
                                        } else {
/* 332 */                                   i3 = i8 + 1;
/* 334 */                                   cArr[i8] = 65533;
                                        }
                                    } else {
/* 338 */                               i3 = i8 + 1;
/* 340 */                               cArr[i8] = 65533;
                                    }
                                }
                            } else {
/* 344 */                       i3 = i8 + 1;
/* 346 */                       cArr[i8] = 65533;
/* 348 */                       i6++;
/* 103 */                       i8 = i3;
                            }
/* 102 */                   i6 += i5;
/* 103 */                   i8 = i3;
                        }
                    }
/* 352 */           iOI0OiiiOl1.I00000oIO(0, i8, i7);
/* 357 */           return new String(cArr, 0, i8);
                }
            }
