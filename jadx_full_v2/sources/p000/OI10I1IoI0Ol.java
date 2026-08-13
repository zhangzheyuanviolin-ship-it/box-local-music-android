            package p000;

            import java.util.Arrays;
            
/* 29 */    public final class OI10I1IoI0Ol {
                public long[] I00000oIO;
                public Object[] I00000oOI;
                public Object[] I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;

                public OI10I1IoI0Ol(int i) {
/* 6 */             this.I00000oIO = OiO10oio.I00000oIO;
/* 8 */             Object[] objArr = iIIl1I0OIlO0.I0000Il00O;
/* 10 */            this.I00000oOI = objArr;
/* 12 */            this.I0000Il00O = objArr;
/* 14 */            if (i >= 0) {
/* 20 */                I000O01llI0(OiO10oio.I0000O(i));
                    } else {
/* 26 */                lO00l0o.I00000oIO("Capacity must be a positive value.");
/* 77 */                throw null;
                    }
                }

                public final void I00000oIO() {
/* 2 */             this.I0000oI00 = 0;
/* 4 */             long[] jArr = this.I00000oIO;
/* 8 */             if (jArr != OiO10oio.I00000oIO) {
/* 15 */                I1IoiO1l.I0010o(-9187201950435737472L, jArr);
/* 18 */                long[] jArr2 = this.I00000oIO;
/* 20 */                int i = this.I0000O;
/* 22 */                int i2 = i >> 3;
/* 32 */                long j = 255 << ((i & 7) << 3);
/* 36 */                jArr2[i2] = (jArr2[i2] & (~j)) | j;
                    }
/* 43 */            Arrays.fill(this.I0000Il00O, 0, this.I0000O, (Object) null);
/* 50 */            Arrays.fill(this.I00000oOI, 0, this.I0000O, (Object) null);
/* 62 */            this.I0001Ioi1lo = OiO10oio.I00000oIO(this.I0000O) - this.I0000oI00;
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
                
                    if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
                
                    r11 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00000oOI(Object obj) {
                    int iNumberOfTrailingZeros;
/* 17 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
/* 20 */            int i = iHashCode ^ (iHashCode << 16);
/* 21 */            int i2 = i & 127;
/* 23 */            int i3 = this.I0000O;
/* 27 */            int i4 = (i >>> 7) & i3;
/* 28 */            int i5 = 0;
                    loop0: while (true) {
/* 29 */                long[] jArr = this.I00000oIO;
/* 31 */                int i6 = i4 >> 3;
/* 35 */                int i7 = (i4 & 7) << 3;
/* 53 */                long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
/* 61 */                long j2 = (i2 * 72340172838076673L) ^ j;
/* 71 */                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
/* 76 */                    if (j3 == 0) {
                                break;
                            }
/* 85 */                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
/* 94 */                    if (O0000Ioio00.I0000O(this.I00000oOI[iNumberOfTrailingZeros], obj)) {
                                break loop0;
                            }
/* 101 */                   j3 &= j3 - 1;
                        }
/* 117 */               i5 += 8;
/* 120 */               i4 = (i4 + i5) & i3;
                    }
                    return iNumberOfTrailingZeros >= 0;
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
                
                    if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
                
                    r11 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0000Il00O(Object obj) {
                    int iNumberOfTrailingZeros;
/* 17 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
/* 20 */            int i = iHashCode ^ (iHashCode << 16);
/* 21 */            int i2 = i & 127;
/* 23 */            int i3 = this.I0000O;
/* 27 */            int i4 = (i >>> 7) & i3;
/* 28 */            int i5 = 0;
                    loop0: while (true) {
/* 29 */                long[] jArr = this.I00000oIO;
/* 31 */                int i6 = i4 >> 3;
/* 35 */                int i7 = (i4 & 7) << 3;
/* 53 */                long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
/* 61 */                long j2 = (i2 * 72340172838076673L) ^ j;
/* 71 */                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
/* 76 */                    if (j3 == 0) {
                                break;
                            }
/* 85 */                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
/* 94 */                    if (O0000Ioio00.I0000O(this.I00000oOI[iNumberOfTrailingZeros], obj)) {
                                break loop0;
                            }
/* 101 */                   j3 &= j3 - 1;
                        }
/* 117 */               i5 += 8;
/* 120 */               i4 = (i4 + i5) & i3;
                    }
                    return iNumberOfTrailingZeros >= 0;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0000O(Object obj) {
/* 1 */             Object[] objArr = this.I0000Il00O;
/* 3 */             long[] jArr = this.I00000oIO;
                    int length = jArr.length - 2;
/* 9 */             if (length >= 0) {
/* 11 */                int i = 0;
                        while (true) {
/* 12 */                    long j = jArr[i];
/* 26 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 35 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 38 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 47 */                            if ((255 & j) < 128 && O0000Ioio00.I0000O(obj, objArr[(i << 3) + i3])) {
/* 60 */                                return true;
                                    }
/* 62 */                            j >>= 8;
                                }
/* 66 */                        if (i2 != 8) {
                                    break;
                                }
/* 68 */                        if (i == length) {
                                    break;
                                }
/* 70 */                        i++;
                            }
                        }
                    }
/* 8 */             return false;
                }

                public final int I0000oI00(int i) {
/* 1 */             int i2 = this.I0000O;
/* 3 */             int i3 = i & i2;
/* 4 */             int i4 = 0;
                    while (true) {
/* 5 */                 long[] jArr = this.I00000oIO;
/* 7 */                 int i5 = i3 >> 3;
/* 11 */                int i6 = (i3 & 7) << 3;
/* 29 */                long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
/* 39 */                long j2 = j & ((~j) << 7) & (-9187201950435737472L);
/* 44 */                if (j2 != 0) {
/* 53 */                    return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
                        }
/* 56 */                i4 += 8;
/* 59 */                i3 = (i3 + i4) & i2;
                    }
                }

                public final int I0001Ioi1lo(Object obj) {
                    long j;
                    long j2;
                    long j3;
                    long[] jArr;
                    long[] jArr2;
                    int i;
                    Object[] objArr;
/* 13 */            int i2 = -862048943;
/* 16 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
/* 19 */            int i3 = iHashCode ^ (iHashCode << 16);
/* 20 */            int i4 = i3 >>> 7;
/* 22 */            int i5 = i3 & 127;
/* 24 */            int i6 = this.I0000O;
/* 26 */            int i7 = i4 & i6;
/* 28 */            int i8 = 0;
                    while (true) {
/* 29 */                long[] jArr3 = this.I00000oIO;
/* 31 */                int i9 = i7 >> 3;
/* 35 */                int i10 = (i7 & 7) << 3;
/* 55 */                long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
                        long j5 = i5;
/* 64 */                int i11 = i5;
/* 67 */                long j6 = j4 ^ (j5 * 72340172838076673L);
/* 78 */                long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
/* 83 */                while (j7 != 0) {
/* 93 */                    int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
/* 95 */                    int i12 = i2;
/* 105 */                   if (O0000Ioio00.I0000O(this.I00000oOI[iNumberOfTrailingZeros], obj)) {
/* 107 */                       return iNumberOfTrailingZeros;
                            }
/* 112 */                   j7 &= j7 - 1;
/* 114 */                   i2 = i12;
                        }
/* 117 */               int i13 = i2;
/* 128 */               if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
/* 130 */                   int iI0000oI00 = I0000oI00(i4);
/* 136 */                   long j8 = 255;
/* 138 */                   if (this.I0001Ioi1lo != 0 || ((this.I00000oIO[iI0000oI00 >> 3] >> ((iI0000oI00 & 7) << 3)) & 255) == 254) {
/* 160 */                       j = 255;
/* 162 */                       j2 = j5;
/* 166 */                       j3 = 128;
                            } else {
/* 170 */                       int i14 = this.I0000O;
/* 172 */                       if (i14 > 8) {
/* 176 */                           int i15 = 8;
/* 193 */                           if (Long.compareUnsigned(this.I0000oI00 * 32, i14 * 25) <= 0) {
/* 195 */                               long[] jArr4 = this.I00000oIO;
/* 197 */                               int i16 = this.I0000O;
/* 199 */                               Object[] objArr2 = this.I00000oOI;
/* 201 */                               Object[] objArr3 = this.I0000Il00O;
/* 205 */                               j3 = 128;
/* 207 */                               int i17 = (i16 + 7) >> 3;
/* 209 */                               int i18 = 0;
/* 210 */                               while (i18 < i17) {
/* 214 */                                   long j9 = j8;
/* 216 */                                   long j10 = jArr4[i18] & (-9187201950435737472L);
/* 231 */                                   jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
/* 233 */                                   i18++;
/* 235 */                                   i15 = i15;
/* 236 */                                   j5 = j5;
/* 238 */                                   j8 = j9;
                                        }
/* 241 */                               j = j8;
/* 243 */                               j2 = j5;
/* 245 */                               int i19 = i15;
/* 246 */                               int length = jArr4.length;
                                        int i20 = length - 1;
                                        int i21 = length - 2;
/* 262 */                               jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
/* 266 */                               jArr4[i20] = jArr4[0];
/* 268 */                               int i22 = 0;
/* 269 */                               while (i22 != i16) {
/* 271 */                                   int i23 = i22 >> 3;
/* 277 */                                   int i24 = (i22 & 7) << 3;
/* 280 */                                   long j11 = (jArr4[i23] >> i24) & j;
/* 284 */                                   if (j11 != 128 && j11 == 254) {
/* 294 */                                       Object obj2 = objArr2[i22];
/* 304 */                                       int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
/* 309 */                                       int i25 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
/* 311 */                                       int iI0000oI002 = I0000oI00(i25);
/* 315 */                                       int i26 = i25 & i16;
/* 324 */                                       if (((iI0000oI002 - i26) & i16) / i19 == ((i22 - i26) & i16) / i19) {
/* 342 */                                           jArr4[i23] = ((r8 & 127) << i24) | (jArr4[i23] & (~(j << i24)));
/* 349 */                                           jArr4[jArr4.length - 1] = jArr4[0];
/* 351 */                                           i22++;
/* 353 */                                           i19 = i19;
                                                } else {
/* 356 */                                           int i27 = i19;
/* 358 */                                           int i28 = iI0000oI002 >> 3;
/* 360 */                                           long j12 = jArr4[i28];
/* 364 */                                           int i29 = (iI0000oI002 & 7) << 3;
/* 372 */                                           if (((j12 >> i29) & j) == 128) {
/* 376 */                                               i = i16;
/* 378 */                                               objArr = objArr2;
/* 390 */                                               jArr4[i28] = ((~(j << i29)) & j12) | ((r8 & 127) << i29);
/* 401 */                                               jArr4[i23] = (jArr4[i23] & (~(j << i24))) | (128 << i24);
/* 405 */                                               objArr[iI0000oI002] = objArr[i22];
/* 408 */                                               objArr[i22] = null;
/* 412 */                                               objArr3[iI0000oI002] = objArr3[i22];
/* 414 */                                               objArr3[i22] = null;
                                                    } else {
/* 417 */                                               i = i16;
/* 419 */                                               objArr = objArr2;
/* 430 */                                               jArr4[i28] = ((r8 & 127) << i29) | ((~(j << i29)) & j12);
/* 432 */                                               Object obj3 = objArr[iI0000oI002];
/* 436 */                                               objArr[iI0000oI002] = objArr[i22];
/* 438 */                                               objArr[i22] = obj3;
/* 440 */                                               Object obj4 = objArr3[iI0000oI002];
/* 444 */                                               objArr3[iI0000oI002] = objArr3[i22];
/* 446 */                                               objArr3[i22] = obj4;
                                                        i22--;
                                                    }
/* 455 */                                           jArr4[jArr4.length - 1] = jArr4[0];
/* 457 */                                           i22++;
/* 459 */                                           i19 = i27;
/* 461 */                                           i16 = i;
/* 463 */                                           objArr2 = objArr;
                                                }
                                            } else {
/* 286 */                                       i22++;
                                            }
                                        }
/* 476 */                               this.I0001Ioi1lo = OiO10oio.I00000oIO(this.I0000O) - this.I0000oI00;
                                    }
/* 608 */                           iI0000oI00 = I0000oI00(i4);
                                }
/* 480 */                       j = 255;
/* 482 */                       j2 = j5;
/* 484 */                       j3 = 128;
/* 492 */                       int iI00000oOI = OiO10oio.I00000oOI(this.I0000O);
/* 496 */                       long[] jArr5 = this.I00000oIO;
/* 498 */                       Object[] objArr4 = this.I00000oOI;
/* 500 */                       Object[] objArr5 = this.I0000Il00O;
/* 502 */                       int i30 = this.I0000O;
/* 504 */                       I000O01llI0(iI00000oOI);
/* 507 */                       long[] jArr6 = this.I00000oIO;
/* 509 */                       Object[] objArr6 = this.I00000oOI;
/* 511 */                       Object[] objArr7 = this.I0000Il00O;
/* 513 */                       int i31 = this.I0000O;
/* 515 */                       int i32 = 0;
/* 516 */                       while (i32 < i30) {
/* 531 */                           if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
/* 533 */                               Object obj5 = objArr4[i32];
/* 543 */                               int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
/* 547 */                               int i33 = iHashCode3 ^ (iHashCode3 << 16);
/* 550 */                               int iI0000oI003 = I0000oI00(i33 >>> 7);
/* 556 */                               jArr = jArr6;
/* 558 */                               jArr2 = jArr5;
/* 554 */                               long j13 = i33 & 127;
/* 560 */                               int i34 = iI0000oI003 >> 3;
/* 564 */                               int i35 = (iI0000oI003 & 7) << 3;
/* 577 */                               long j14 = (jArr[i34] & (~(255 << i35))) | (j13 << i35);
/* 579 */                               jArr[i34] = j14;
/* 590 */                               jArr[(((iI0000oI003 - 7) & i31) + (i31 & 7)) >> 3] = j14;
/* 592 */                               objArr6[iI0000oI003] = obj5;
/* 596 */                               objArr7[iI0000oI003] = objArr5[i32];
                                    } else {
/* 599 */                               jArr = jArr6;
/* 601 */                               jArr2 = jArr5;
                                    }
/* 602 */                           i32++;
/* 604 */                           jArr5 = jArr2;
/* 605 */                           jArr6 = jArr;
                                }
/* 608 */                       iI0000oI00 = I0000oI00(i4);
                            }
                            this.I0000oI00++;
/* 618 */                   int i36 = this.I0001Ioi1lo;
/* 620 */                   long[] jArr7 = this.I00000oIO;
/* 622 */                   int i37 = iI0000oI00 >> 3;
/* 624 */                   long j15 = jArr7[i37];
/* 628 */                   int i38 = (iI0000oI00 & 7) << 3;
/* 641 */                   this.I0001Ioi1lo = i36 - (((j15 >> i38) & j) == j3 ? 1 : 0);
/* 643 */                   int i39 = this.I0000O;
/* 651 */                   long j16 = (j15 & (~(j << i38))) | (j2 << i38);
/* 652 */                   jArr7[i37] = j16;
/* 662 */                   jArr7[(((iI0000oI00 - 7) & i39) + (i39 & 7)) >> 3] = j16;
/* 664 */                   return ~iI0000oI00;
                        }
/* 668 */               i8 += 8;
/* 671 */               i7 = (i7 + i8) & i6;
/* 672 */               i5 = i11;
/* 674 */               i2 = i13;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
                
                    if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
                
                    r10 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(Object obj) {
                    int iNumberOfTrailingZeros;
/* 1 */             int i = 0;
/* 13 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
/* 16 */            int i2 = iHashCode ^ (iHashCode << 16);
/* 17 */            int i3 = i2 & 127;
/* 19 */            int i4 = this.I0000O;
/* 21 */            int i5 = i2 >>> 7;
                    loop0: while (true) {
/* 23 */                int i6 = i5 & i4;
/* 24 */                long[] jArr = this.I00000oIO;
/* 26 */                int i7 = i6 >> 3;
/* 30 */                int i8 = (i6 & 7) << 3;
/* 48 */                long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
/* 56 */                long j2 = (i3 * 72340172838076673L) ^ j;
/* 66 */                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
/* 71 */                    if (j3 == 0) {
                                break;
                            }
/* 80 */                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
/* 89 */                    if (O0000Ioio00.I0000O(this.I00000oOI[iNumberOfTrailingZeros], obj)) {
                                break loop0;
                            }
/* 96 */                    j3 &= j3 - 1;
                        }
/* 117 */               i += 8;
/* 119 */               i5 = i6 + i;
                    }
/* 108 */           if (iNumberOfTrailingZeros >= 0) {
/* 112 */               return this.I0000Il00O[iNumberOfTrailingZeros];
                    }
/* 115 */           return null;
                }

                public final void I000O01llI0(int i) {
                    long[] jArr;
/* 14 */            int iMax = i > 0 ? Math.max(7, OiO10oio.I0000Il00O(i)) : 0;
/* 15 */            this.I0000O = iMax;
/* 17 */            if (iMax == 0) {
/* 19 */                jArr = OiO10oio.I00000oIO;
                    } else {
/* 26 */                int i2 = ((iMax + 15) & (-8)) >> 3;
/* 28 */                long[] jArr2 = new long[i2];
/* 35 */                Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
/* 38 */                int i3 = iMax >> 3;
/* 48 */                long j = 255 << ((iMax & 7) << 3);
/* 52 */                jArr2[i3] = (jArr2[i3] & (~j)) | j;
/* 54 */                jArr = jArr2;
                    }
/* 55 */            this.I00000oIO = jArr;
/* 66 */            this.I0001Ioi1lo = OiO10oio.I00000oIO(this.I0000O) - this.I0000oI00;
/* 68 */            Object[] objArr = iIIl1I0OIlO0.I0000Il00O;
/* 76 */            this.I00000oOI = iMax == 0 ? objArr : new Object[iMax];
/* 78 */            if (iMax != 0) {
/* 81 */                objArr = new Object[iMax];
                    }
/* 83 */            this.I0000Il00O = objArr;
                }

                public final boolean I000OOo1O() {
                    return this.I0000oI00 == 0;
                }

                public final boolean I000OiO() {
                    return this.I0000oI00 != 0;
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
                
                    if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
                
                    r10 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000iOII(Object obj) {
                    int iNumberOfTrailingZeros;
/* 1 */             int i = 0;
/* 13 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
/* 16 */            int i2 = iHashCode ^ (iHashCode << 16);
/* 17 */            int i3 = i2 & 127;
/* 19 */            int i4 = this.I0000O;
/* 21 */            int i5 = i2 >>> 7;
                    loop0: while (true) {
/* 23 */                int i6 = i5 & i4;
/* 24 */                long[] jArr = this.I00000oIO;
/* 26 */                int i7 = i6 >> 3;
/* 30 */                int i8 = (i6 & 7) << 3;
/* 48 */                long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
/* 56 */                long j2 = (i3 * 72340172838076673L) ^ j;
/* 66 */                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
/* 71 */                    if (j3 == 0) {
                                break;
                            }
/* 80 */                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
/* 89 */                    if (O0000Ioio00.I0000O(this.I00000oOI[iNumberOfTrailingZeros], obj)) {
                                break loop0;
                            }
/* 96 */                    j3 &= j3 - 1;
                        }
/* 117 */               i += 8;
/* 119 */               i5 = i6 + i;
                    }
/* 108 */           if (iNumberOfTrailingZeros >= 0) {
/* 110 */               return I000l1(iNumberOfTrailingZeros);
                    }
/* 115 */           return null;
                }

                public final Object I000l1(int i) {
                    this.I0000oI00--;
/* 7 */             long[] jArr = this.I00000oIO;
/* 9 */             int i2 = this.I0000O;
/* 11 */            int i3 = i >> 3;
/* 15 */            int i4 = (i & 7) << 3;
/* 27 */            long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
/* 29 */            jArr[i3] = j;
/* 39 */            jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
/* 44 */            this.I00000oOI[i] = null;
/* 46 */            Object[] objArr = this.I0000Il00O;
/* 48 */            Object obj = objArr[i];
/* 50 */            objArr[i] = null;
/* 77 */            return obj;
                }

                public final void I000lI(Object obj, Object obj2) {
/* 1 */             int iI0001Ioi1lo = I0001Ioi1lo(obj);
/* 5 */             if (iI0001Ioi1lo < 0) {
/* 7 */                 iI0001Ioi1lo = ~iI0001Ioi1lo;
                    }
/* 10 */            this.I00000oOI[iI0001Ioi1lo] = obj;
/* 14 */            this.I0000Il00O[iI0001Ioi1lo] = obj2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
                
                    return false;
                 */
                /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
/* 6 */             if (obj == this) {
/* 5 */                 return true;
                    }
/* 12 */            if (!(obj instanceof OI10I1IoI0Ol)) {
/* 11 */                return false;
                    }
/* 15 */            OI10I1IoI0Ol oI10I1IoI0Ol = (OI10I1IoI0Ol) obj;
/* 21 */            if (oI10I1IoI0Ol.I0000oI00 != this.I0000oI00) {
/* 11 */                return false;
                    }
/* 24 */            Object[] objArr = this.I00000oOI;
/* 26 */            Object[] objArr2 = this.I0000Il00O;
/* 28 */            long[] jArr = this.I00000oIO;
                    int length = jArr.length - 2;
/* 33 */            if (length >= 0) {
/* 35 */                int i = 0;
                        loop0: while (true) {
/* 36 */                    long j = jArr[i];
/* 50 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 59 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 62 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 71 */                            if ((255 & j) < 128) {
/* 75 */                                int i4 = (i << 3) + i3;
/* 76 */                                Object obj2 = objArr[i4];
/* 78 */                                Object obj3 = objArr2[i4];
/* 80 */                                if (obj3 == null) {
/* 86 */                                    if (oI10I1IoI0Ol.I000II(obj2) != null || !oI10I1IoI0Ol.I0000Il00O(obj2)) {
                                                break loop0;
                                            }
                                        } else if (!obj3.equals(oI10I1IoI0Ol.I000II(obj2))) {
/* 11 */                                    return false;
                                        }
                                    }
/* 106 */                           j >>= 8;
                                }
/* 110 */                       if (i2 != 8) {
                                    break;
                                }
/* 112 */                       if (i == length) {
                                    break;
                                }
/* 114 */                       i++;
                            }
                        }
                    }
/* 5 */             return true;
                }

                public final int hashCode() {
/* 1 */             Object[] objArr = this.I00000oOI;
/* 3 */             Object[] objArr2 = this.I0000Il00O;
/* 5 */             long[] jArr = this.I00000oIO;
                    int length = jArr.length - 2;
/* 11 */            if (length < 0) {
/* 10 */                return 0;
                    }
/* 13 */            int i = 0;
/* 14 */            int iHashCode = 0;
                    while (true) {
/* 15 */                long j = jArr[i];
/* 29 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 38 */                    int i2 = 8 - ((~(i - length)) >>> 31);
/* 41 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 50 */                        if ((255 & j) < 128) {
/* 54 */                            int i4 = (i << 3) + i3;
/* 55 */                            Object obj = objArr[i4];
/* 57 */                            Object obj2 = objArr2[i4];
/* 76 */                            iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                                }
/* 77 */                        j >>= 8;
                            }
/* 81 */                    if (i2 != 8) {
/* 84 */                        return iHashCode;
                            }
                        }
/* 85 */                if (i == length) {
/* 90 */                    return iHashCode;
                        }
/* 87 */                i++;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[PHI: r8
                  0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
/* 7 */             if (I000OOo1O()) {
/* 9 */                 return "{}";
                    }
/* 16 */            StringBuilder sb = new StringBuilder("{");
/* 19 */            Object[] objArr = this.I00000oOI;
/* 21 */            Object[] objArr2 = this.I0000Il00O;
/* 23 */            long[] jArr = this.I00000oIO;
                    int length = jArr.length - 2;
/* 28 */            if (length >= 0) {
/* 31 */                int i = 0;
/* 32 */                int i2 = 0;
                        while (true) {
/* 33 */                    long j = jArr[i];
/* 47 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 56 */                        int i3 = 8 - ((~(i - length)) >>> 31);
/* 59 */                        for (int i4 = 0; i4 < i3; i4++) {
/* 68 */                            if ((255 & j) < 128) {
/* 72 */                                int i5 = (i << 3) + i4;
/* 73 */                                Object obj = objArr[i5];
/* 75 */                                Object obj2 = objArr2[i5];
/* 79 */                                if (obj == this) {
/* 77 */                                    obj = "(this)";
                                        }
/* 83 */                                sb.append(obj);
/* 88 */                                sb.append("=");
/* 91 */                                if (obj2 == this) {
/* 77 */                                    obj2 = "(this)";
                                        }
/* 95 */                                sb.append(obj2);
/* 98 */                                i2++;
/* 102 */                               if (i2 < this.I0000oI00) {
/* 106 */                                   sb.append(", ");
                                        }
                                    }
/* 109 */                           j >>= 8;
                                }
/* 113 */                       if (i3 != 8) {
                                    break;
                                }
/* 115 */                       if (i == length) {
                                    break;
                                }
/* 117 */                       i++;
                            }
                        }
                    }
/* 122 */           sb.append('}');
/* 125 */           return sb.toString();
                }

/* 30 */        public OI10I1IoI0Ol() {
/* 31 */            this(6);
                }
            }
