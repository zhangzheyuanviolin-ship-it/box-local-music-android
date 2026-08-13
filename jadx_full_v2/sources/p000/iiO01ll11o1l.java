            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class iiO01ll11o1l {
                /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
                /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
                /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
                /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final long I00000oIO(float f, float f2, float f3, float f4, IOOl0ll iOOl0ll) {
                    int i;
                    int i2;
                    int i3;
                    float fI00000oOI;
                    float fI00000oIO;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    float fI00000oOI2;
                    float fI00000oIO2;
                    int i8;
                    int i9;
                    int i10;
/* 16 */            if (iOOl0ll.I0000Il00O()) {
/* 24 */                float f5 = f4 < 0.0f ? 0.0f : f4;
/* 28 */                if (f5 > 1.0f) {
/* 30 */                    f5 = 1.0f;
                        }
/* 36 */                int i11 = ((int) ((f5 * 255.0f) + 0.5f)) << 24;
/* 44 */                float f6 = f < 0.0f ? 0.0f : f;
/* 48 */                if (f6 > 1.0f) {
/* 50 */                    f6 = 1.0f;
                        }
/* 56 */                int i12 = i11 | (((int) ((f6 * 255.0f) + 0.5f)) << 16);
/* 63 */                float f7 = f2 < 0.0f ? 0.0f : f2;
/* 67 */                if (f7 > 1.0f) {
/* 69 */                    f7 = 1.0f;
                        }
/* 75 */                int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 8);
/* 94 */                long j = (i13 | ((int) ((((f3 >= 0.0f ? f3 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
/* 95 */                int i14 = IOOiio0i.I000oI1ioi;
/* 97 */                return j;
                    }
/* 103 */           if (((int) (iOOl0ll.I00000oOI >> 32)) != 3) {
/* 108 */               Iolilol.I00000oIO("Color only works with ColorSpaces with 3 components");
                    }
/* 111 */           int i15 = iOOl0ll.I0000Il00O;
/* 114 */           if (i15 == -1) {
/* 119 */               Iolilol.I00000oIO("Unknown color space, please use a color space in ColorSpaces");
                    }
/* 123 */           float fI00000oOI3 = iOOl0ll.I00000oOI(0);
/* 127 */           float fI00000oIO3 = iOOl0ll.I00000oIO(0);
/* 133 */           if (f >= fI00000oOI3) {
/* 136 */               fI00000oOI3 = f;
                    }
/* 140 */           if (fI00000oOI3 <= fI00000oIO3) {
/* 143 */               fI00000oIO3 = fI00000oOI3;
                    }
/* 144 */           int iFloatToRawIntBits = Float.floatToRawIntBits(fI00000oIO3);
/* 148 */           int i16 = iFloatToRawIntBits >>> 31;
/* 154 */           int i17 = (iFloatToRawIntBits >>> 23) & 255;
/* 158 */           int i18 = iFloatToRawIntBits & 8388607;
/* 175 */           if (i17 == 255) {
/* 182 */               i2 = i18 != 0 ? 512 : 0;
/* 183 */               i = 31;
                    } else {
                        i = i17 - 112;
/* 187 */               if (i >= 31) {
/* 189 */                   i2 = 0;
/* 190 */                   i = 49;
                        } else if (i > 0) {
/* 215 */                   int i19 = i18 >> 13;
/* 219 */                   if ((iFloatToRawIntBits & Barcode.FORMAT_AZTEC) != 0) {
/* 227 */                       i3 = (((i << 10) | i19) + 1) | (i16 << 15);
/* 228 */                       short s = (short) i3;
/* 238 */                       fI00000oOI = iOOl0ll.I00000oOI(1);
/* 242 */                       fI00000oIO = iOOl0ll.I00000oIO(1);
/* 248 */                       if (f2 >= fI00000oOI) {
/* 251 */                           fI00000oOI = f2;
                                }
/* 255 */                       if (fI00000oOI <= fI00000oIO) {
/* 258 */                           fI00000oIO = fI00000oOI;
                                }
/* 259 */                       int iFloatToRawIntBits2 = Float.floatToRawIntBits(fI00000oIO);
/* 263 */                       int i20 = iFloatToRawIntBits2 >>> 31;
/* 267 */                       i4 = (iFloatToRawIntBits2 >>> 23) & 255;
/* 268 */                       int i21 = iFloatToRawIntBits2 & 8388607;
/* 270 */                       if (i4 != 255) {
/* 277 */                           i6 = i21 != 0 ? 512 : 0;
/* 278 */                           i5 = 31;
                                } else {
                                    i5 = i4 - 112;
/* 282 */                           if (i5 >= 31) {
/* 284 */                               i6 = 0;
/* 285 */                               i5 = 49;
                                    } else if (i5 > 0) {
/* 310 */                               int i22 = i21 >> 13;
/* 314 */                               if ((iFloatToRawIntBits2 & Barcode.FORMAT_AZTEC) != 0) {
/* 323 */                                   i7 = (((i5 << 10) | i22) + 1) | (i20 << 15);
/* 324 */                                   short s2 = (short) i7;
/* 336 */                                   fI00000oOI2 = iOOl0ll.I00000oOI(2);
/* 340 */                                   fI00000oIO2 = iOOl0ll.I00000oIO(2);
/* 346 */                                   if (f3 >= fI00000oOI2) {
/* 349 */                                       fI00000oOI2 = f3;
                                            }
/* 353 */                                   if (fI00000oOI2 <= fI00000oIO2) {
/* 356 */                                       fI00000oIO2 = fI00000oOI2;
                                            }
/* 357 */                                   int iFloatToRawIntBits3 = Float.floatToRawIntBits(fI00000oIO2);
/* 361 */                                   int i23 = iFloatToRawIntBits3 >>> 31;
/* 365 */                                   i8 = (iFloatToRawIntBits3 >>> 23) & 255;
/* 366 */                                   int i24 = 8388607 & iFloatToRawIntBits3;
/* 367 */                                   if (i8 == 255) {
/* 369 */                                       i9 = i24 != 0 ? 512 : 0;
/* 374 */                                       i = 31;
                                            } else {
                                                int i25 = i8 - 112;
/* 378 */                                       if (i25 >= 31) {
/* 380 */                                           i9 = 0;
/* 381 */                                           i = 49;
                                                } else if (i25 > 0) {
/* 404 */                                           int i26 = i24 >> 13;
/* 408 */                                           if ((iFloatToRawIntBits3 & Barcode.FORMAT_AZTEC) != 0) {
/* 416 */                                               i10 = (((i25 << 10) | i26) + 1) | (i23 << 15);
/* 477 */                                               long j2 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
/* 478 */                                               int i27 = IOOiio0i.I000oI1ioi;
/* 2230 */                                              return j2;
                                                    }
/* 419 */                                           i9 = i26;
/* 420 */                                           i = i25;
                                                } else if (i25 >= -10) {
/* 392 */                                           int i28 = (i24 | 8388608) >> (1 - i25);
/* 395 */                                           if ((i28 & Barcode.FORMAT_AZTEC) != 0) {
/* 397 */                                               i28 += 8192;
                                                    }
/* 399 */                                           i9 = i28 >> 13;
                                                } else {
/* 402 */                                           i9 = 0;
                                                }
                                            }
/* 426 */                                   i10 = i9 | (i23 << 15) | (i << 10);
                                            if (f4 >= 0.0f) {
                                            }
/* 477 */                                   long j22 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
/* 478 */                                   int i272 = IOOiio0i.I000oI1ioi;
/* 2230 */                                  return j22;
                                        }
/* 326 */                               i6 = i22;
                                    } else if (i5 >= -10) {
/* 296 */                               int i29 = (i21 | 8388608) >> (1 - i5);
/* 299 */                               if ((i29 & Barcode.FORMAT_AZTEC) != 0) {
/* 301 */                                   i29 += 8192;
                                        }
/* 303 */                               i6 = i29 >> 13;
/* 305 */                               i5 = 0;
                                    } else {
/* 307 */                               i6 = 0;
/* 308 */                               i5 = 0;
                                    }
                                }
/* 333 */                       i7 = i6 | (i20 << 15) | (i5 << 10);
/* 324 */                       short s22 = (short) i7;
/* 336 */                       fI00000oOI2 = iOOl0ll.I00000oOI(2);
/* 340 */                       fI00000oIO2 = iOOl0ll.I00000oIO(2);
/* 346 */                       if (f3 >= fI00000oOI2) {
                                }
/* 353 */                       if (fI00000oOI2 <= fI00000oIO2) {
                                }
/* 357 */                       int iFloatToRawIntBits32 = Float.floatToRawIntBits(fI00000oIO2);
/* 361 */                       int i232 = iFloatToRawIntBits32 >>> 31;
/* 365 */                       i8 = (iFloatToRawIntBits32 >>> 23) & 255;
/* 366 */                       int i242 = 8388607 & iFloatToRawIntBits32;
/* 367 */                       if (i8 == 255) {
                                }
/* 426 */                       i10 = i9 | (i232 << 15) | (i << 10);
                                if (f4 >= 0.0f) {
                                }
/* 477 */                       long j222 = (i15 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
/* 478 */                       int i2722 = IOOiio0i.I000oI1ioi;
/* 2230 */                      return j222;
                            }
/* 230 */                   i2 = i19;
                        } else if (i >= -10) {
/* 201 */                   int i30 = (i18 | 8388608) >> (1 - i);
/* 204 */                   if ((i30 & Barcode.FORMAT_AZTEC) != 0) {
/* 206 */                       i30 += 8192;
                            }
/* 208 */                   i2 = i30 >> 13;
/* 210 */                   i = 0;
                        } else {
/* 212 */                   i2 = 0;
/* 213 */                   i = 0;
                        }
                    }
/* 236 */           i3 = i2 | (i16 << 15) | (i << 10);
/* 228 */           short s3 = (short) i3;
/* 238 */           fI00000oOI = iOOl0ll.I00000oOI(1);
/* 242 */           fI00000oIO = iOOl0ll.I00000oIO(1);
/* 248 */           if (f2 >= fI00000oOI) {
                    }
/* 255 */           if (fI00000oOI <= fI00000oIO) {
                    }
/* 259 */           int iFloatToRawIntBits22 = Float.floatToRawIntBits(fI00000oIO);
/* 263 */           int i202 = iFloatToRawIntBits22 >>> 31;
/* 267 */           i4 = (iFloatToRawIntBits22 >>> 23) & 255;
/* 268 */           int i212 = iFloatToRawIntBits22 & 8388607;
/* 270 */           if (i4 != 255) {
                    }
/* 333 */           i7 = i6 | (i202 << 15) | (i5 << 10);
/* 324 */           short s222 = (short) i7;
/* 336 */           fI00000oOI2 = iOOl0ll.I00000oOI(2);
/* 340 */           fI00000oIO2 = iOOl0ll.I00000oIO(2);
/* 346 */           if (f3 >= fI00000oOI2) {
                    }
/* 353 */           if (fI00000oOI2 <= fI00000oIO2) {
                    }
/* 357 */           int iFloatToRawIntBits322 = Float.floatToRawIntBits(fI00000oIO2);
/* 361 */           int i2322 = iFloatToRawIntBits322 >>> 31;
/* 365 */           i8 = (iFloatToRawIntBits322 >>> 23) & 255;
/* 366 */           int i2422 = 8388607 & iFloatToRawIntBits322;
/* 367 */           if (i8 == 255) {
                    }
/* 426 */           i10 = i9 | (i2322 << 15) | (i << 10);
                    if (f4 >= 0.0f) {
                    }
/* 477 */           long j2222 = (i15 & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
/* 478 */           int i27222 = IOOiio0i.I000oI1ioi;
/* 2230 */          return j2222;
                }

                public static final long I00000oOI(int i) {
/* 4 */             long j = i << 32;
/* 5 */             int i2 = IOOiio0i.I000oI1ioi;
/* 29 */            return j;
                }

                public static final long I0000Il00O(long j) {
/* 3 */             long j2 = j << 32;
/* 4 */             int i = IOOiio0i.I000oI1ioi;
/* 29 */            return j2;
                }

                public static long I0000O(int i, int i2, int i3) {
/* 16 */            return I00000oOI(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final long I0000oI00(float f, float f2, float f3, float f4, IOOl0ll iOOl0ll) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
/* 13 */            if (iOOl0ll.I0000Il00O()) {
/* 42 */                long j = ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f))) << 32;
/* 43 */                int i10 = IOOiio0i.I000oI1ioi;
/* 45 */                return j;
                    }
/* 46 */            int iFloatToRawIntBits = Float.floatToRawIntBits(f);
/* 50 */            int i11 = iFloatToRawIntBits >>> 31;
/* 56 */            int i12 = (iFloatToRawIntBits >>> 23) & 255;
/* 60 */            int i13 = iFloatToRawIntBits & 8388607;
/* 66 */            int i14 = 49;
/* 68 */            int i15 = Barcode.FORMAT_UPC_A;
/* 70 */            int i16 = 0;
/* 73 */            if (i12 == 255) {
/* 79 */                i2 = i13 != 0 ? 512 : 0;
/* 80 */                i = 31;
                    } else {
                        i = i12 - 112;
/* 84 */                if (i >= 31) {
/* 86 */                    i = 49;
/* 87 */                    i2 = 0;
                        } else if (i > 0) {
/* 111 */                   int i17 = i13 >> 13;
/* 115 */                   if ((iFloatToRawIntBits & Barcode.FORMAT_AZTEC) != 0) {
/* 124 */                       i3 = (((i << 10) | i17) + 1) | (i11 << 15);
/* 125 */                       short s = (short) i3;
/* 135 */                       int iFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
/* 139 */                       int i18 = iFloatToRawIntBits2 >>> 31;
/* 143 */                       i4 = (iFloatToRawIntBits2 >>> 23) & 255;
/* 144 */                       int i19 = iFloatToRawIntBits2 & 8388607;
/* 146 */                       if (i4 != 255) {
/* 152 */                           i6 = i19 != 0 ? 512 : 0;
/* 153 */                           i5 = 31;
                                } else {
                                    i5 = i4 - 112;
/* 157 */                           if (i5 >= 31) {
/* 159 */                               i5 = 49;
/* 160 */                               i6 = 0;
                                    } else if (i5 > 0) {
/* 184 */                               int i20 = i19 >> 13;
/* 188 */                               if ((iFloatToRawIntBits2 & Barcode.FORMAT_AZTEC) != 0) {
/* 198 */                                   i7 = (((i5 << 10) | i20) + 1) | (i18 << 15);
/* 199 */                                   short s2 = (short) i7;
/* 210 */                                   int iFloatToRawIntBits3 = Float.floatToRawIntBits(f3);
/* 214 */                                   int i21 = iFloatToRawIntBits3 >>> 31;
/* 220 */                                   i8 = (iFloatToRawIntBits3 >>> 23) & 255;
/* 221 */                                   int i22 = 8388607 & iFloatToRawIntBits3;
/* 222 */                                   if (i8 != 255) {
                                                int i23 = i8 - 112;
/* 233 */                                       if (i23 < 31) {
/* 236 */                                           if (i23 > 0) {
/* 259 */                                               i16 = i22 >> 13;
/* 263 */                                               if ((iFloatToRawIntBits3 & Barcode.FORMAT_AZTEC) != 0) {
/* 272 */                                                   i9 = (((i23 << 10) | i16) + 1) | (i21 << 15);
                                                        } else {
/* 275 */                                                   i14 = i23;
                                                        }
                                                    } else if (i23 >= -10) {
/* 244 */                                               int i24 = (i22 | 8388608) >> (1 - i23);
/* 248 */                                               if ((i24 & Barcode.FORMAT_AZTEC) != 0) {
/* 250 */                                                   i24 += 8192;
                                                        }
/* 254 */                                               i14 = 0;
/* 252 */                                               i16 = i24 >> 13;
                                                    } else {
/* 257 */                                               i14 = 0;
                                                    }
                                                }
/* 334 */                                       long jMax = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (iOOl0ll.I0000Il00O & 63);
/* 335 */                                       int i25 = IOOiio0i.I000oI1ioi;
/* 399 */                                       return jMax;
                                            }
/* 224 */                                   if (i22 == 0) {
/* 227 */                                       i15 = 0;
                                            }
/* 228 */                                   i16 = i15;
/* 229 */                                   i14 = 31;
/* 281 */                                   i9 = (i21 << 15) | (i14 << 10) | i16;
/* 334 */                                   long jMax2 = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (iOOl0ll.I0000Il00O & 63);
/* 335 */                                   int i252 = IOOiio0i.I000oI1ioi;
/* 399 */                                   return jMax2;
                                        }
/* 201 */                               i6 = i20;
                                    } else if (i5 >= -10) {
/* 170 */                               int i26 = (i19 | 8388608) >> (1 - i5);
/* 173 */                               if ((i26 & Barcode.FORMAT_AZTEC) != 0) {
/* 175 */                                   i26 += 8192;
                                        }
/* 177 */                               i6 = i26 >> 13;
/* 179 */                               i5 = 0;
                                    } else {
/* 181 */                               i6 = 0;
/* 182 */                               i5 = 0;
                                    }
                                }
/* 208 */                       i7 = i6 | (i18 << 15) | (i5 << 10);
/* 199 */                       short s22 = (short) i7;
/* 210 */                       int iFloatToRawIntBits32 = Float.floatToRawIntBits(f3);
/* 214 */                       int i212 = iFloatToRawIntBits32 >>> 31;
/* 220 */                       i8 = (iFloatToRawIntBits32 >>> 23) & 255;
/* 221 */                       int i222 = 8388607 & iFloatToRawIntBits32;
/* 222 */                       if (i8 != 255) {
                                }
/* 281 */                       i9 = (i212 << 15) | (i14 << 10) | i16;
/* 334 */                       long jMax22 = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (iOOl0ll.I0000Il00O & 63);
/* 335 */                       int i2522 = IOOiio0i.I000oI1ioi;
/* 399 */                       return jMax22;
                            }
/* 127 */                   i2 = i17;
                        } else if (i >= -10) {
/* 97 */                    int i27 = (i13 | 8388608) >> (1 - i);
/* 100 */                   if ((i27 & Barcode.FORMAT_AZTEC) != 0) {
/* 102 */                       i27 += 8192;
                            }
/* 104 */                   i2 = i27 >> 13;
/* 106 */                   i = 0;
                        } else {
/* 108 */                   i2 = 0;
/* 109 */                   i = 0;
                        }
                    }
/* 133 */           i3 = i2 | (i11 << 15) | (i << 10);
/* 125 */           short s3 = (short) i3;
/* 135 */           int iFloatToRawIntBits22 = Float.floatToRawIntBits(f2);
/* 139 */           int i182 = iFloatToRawIntBits22 >>> 31;
/* 143 */           i4 = (iFloatToRawIntBits22 >>> 23) & 255;
/* 144 */           int i192 = iFloatToRawIntBits22 & 8388607;
/* 146 */           if (i4 != 255) {
                    }
/* 208 */           i7 = i6 | (i182 << 15) | (i5 << 10);
/* 199 */           short s222 = (short) i7;
/* 210 */           int iFloatToRawIntBits322 = Float.floatToRawIntBits(f3);
/* 214 */           int i2122 = iFloatToRawIntBits322 >>> 31;
/* 220 */           i8 = (iFloatToRawIntBits322 >>> 23) & 255;
/* 221 */           int i2222 = 8388607 & iFloatToRawIntBits322;
/* 222 */           if (i8 != 255) {
                    }
/* 281 */           i9 = (i2122 << 15) | (i14 << 10) | i16;
/* 334 */           long jMax222 = ((((short) i9) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (iOOl0ll.I0000Il00O & 63);
/* 335 */           int i25222 = IOOiio0i.I000oI1ioi;
/* 399 */           return jMax222;
                }

                public static final long I0001Ioi1lo(long j, long j2) {
                    float f;
                    float f2;
/* 5 */             long jI00000oOI = IOOiio0i.I00000oOI(j, IOOiio0i.I0001Ioi1lo(j2));
/* 9 */             float fI0000O = IOOiio0i.I0000O(j2);
/* 13 */            float fI0000O2 = IOOiio0i.I0000O(jI00000oOI);
/* 19 */            float f3 = 1.0f - fI0000O2;
/* 22 */            float f4 = (fI0000O * f3) + fI0000O2;
/* 23 */            float fI000O01llI0 = IOOiio0i.I000O01llI0(jI00000oOI);
/* 27 */            float fI000O01llI02 = IOOiio0i.I000O01llI0(j2);
/* 31 */            float f5 = 0.0f;
/* 34 */            if (f4 == 0.0f) {
/* 36 */                f = 0.0f;
                    } else {
/* 42 */                f = (((fI000O01llI02 * fI0000O) * f3) + (fI000O01llI0 * fI0000O2)) / f4;
                    }
/* 43 */            float fI000II = IOOiio0i.I000II(jI00000oOI);
/* 47 */            float fI000II2 = IOOiio0i.I000II(j2);
/* 51 */            if (f4 == 0.0f) {
/* 53 */                f2 = 0.0f;
                    } else {
/* 59 */                f2 = (((fI000II2 * fI0000O) * f3) + (fI000II * fI0000O2)) / f4;
                    }
/* 60 */            float fI0000oI00 = IOOiio0i.I0000oI00(jI00000oOI);
/* 64 */            float fI0000oI002 = IOOiio0i.I0000oI00(j2);
/* 68 */            if (f4 != 0.0f) {
/* 75 */                f5 = (((fI0000oI002 * fI0000O) * f3) + (fI0000oI00 * fI0000O2)) / f4;
                    }
/* 81 */            return I0000oI00(f, f2, f5, f4, IOOiio0i.I0001Ioi1lo(j2));
                }

                public static final long I000II(float f, long j, long j2) {
/* 1 */             OIOlo1 oIOlo1 = IOOlIOOi0O0.I001i1lo1io;
/* 3 */             long jI00000oOI = IOOiio0i.I00000oOI(j, oIOlo1);
/* 7 */             long jI00000oOI2 = IOOiio0i.I00000oOI(j2, oIOlo1);
/* 11 */            float fI0000O = IOOiio0i.I0000O(jI00000oOI);
/* 15 */            float fI000O01llI0 = IOOiio0i.I000O01llI0(jI00000oOI);
/* 19 */            float fI000II = IOOiio0i.I000II(jI00000oOI);
/* 23 */            float fI0000oI00 = IOOiio0i.I0000oI00(jI00000oOI);
/* 27 */            float fI0000O2 = IOOiio0i.I0000O(jI00000oOI2);
/* 31 */            float fI000O01llI02 = IOOiio0i.I000O01llI0(jI00000oOI2);
/* 35 */            float fI000II2 = IOOiio0i.I000II(jI00000oOI2);
/* 39 */            float fI0000oI002 = IOOiio0i.I0000oI00(jI00000oOI2);
/* 46 */            if (f < 0.0f) {
/* 48 */                f = 0.0f;
                    }
/* 53 */            if (f > 1.0f) {
/* 55 */                f = 1.0f;
                    }
/* 80 */            return IOOiio0i.I00000oOI(I0000oI00(l1I1Il.I00000oOI(fI000O01llI0, fI000O01llI02, f), l1I1Il.I00000oOI(fI000II, fI000II2, f), l1I1Il.I00000oOI(fI0000oI00, fI0000oI002, f), l1I1Il.I00000oOI(fI0000O, fI0000O2, f), oIOlo1), IOOiio0i.I0001Ioi1lo(j2));
                }

                public static final float I000O01llI0(long j) {
/* 1 */             IOOl0ll iOOl0llI0001Ioi1lo = IOOiio0i.I0001Ioi1lo(j);
/* 16 */            if (!iiO1i0O.I00000oIO(iOOl0llI0001Ioi1lo.I00000oOI, 12884901888L)) {
/* 30 */                Iolilol.I00000oIO("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(iiO1i0O.I00000oOI(iOOl0llI0001Ioi1lo.I00000oOI)));
                    }
/* 35 */            Oi1I1O1O0o oi1I1O1O0o = ((Oi1IOl) iOOl0llI0001Ioi1lo).I00100l0;
/* 42 */            double dI0000O = oi1I1O1O0o.I0000O(IOOiio0i.I000O01llI0(j));
/* 84 */            float fI0000O = (float) ((oi1I1O1O0o.I0000O(IOOiio0i.I0000oI00(j)) * 0.0722d) + (oi1I1O1O0o.I0000O(IOOiio0i.I000II(j)) * 0.7152d) + (dI0000O * 0.2126d));
/* 88 */            if (fI0000O < 0.0f) {
/* 90 */                fI0000O = 0.0f;
                    }
/* 95 */            if (fI0000O > 1.0f) {
/* 91 */                return 1.0f;
                    }
/* 168 */           return fI0000O;
                }

                public static final int I000OOo1O(long j) {
/* 1 */             float[] fArr = IOOlIOOi0O0.I00000oIO;
/* 12 */            return (int) (IOOiio0i.I00000oOI(j, IOOlIOOi0O0.I0000oI00) >>> 32);
                }
            }
