            package p000;

            import java.util.Arrays;
            
/* 31 */    public final class OI0lli1 {
                public long[] I00000oIO;
                public long[] I00000oOI;
                public Object[] I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;

                public OI0lli1(int i) {
/* 6 */             this.I00000oIO = OiO10oio.I00000oIO;
/* 10 */            this.I00000oOI = O1IOii.I00000oIO;
/* 14 */            this.I0000Il00O = iIIl1I0OIlO0.I0000Il00O;
/* 16 */            if (i >= 0) {
/* 22 */                I0001Ioi1lo(OiO10oio.I0000O(i));
                    } else {
/* 28 */                lO00l0o.I00000oIO("Capacity must be a positive value.");
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
/* 55 */            this.I0001Ioi1lo = OiO10oio.I00000oIO(this.I0000O) - this.I0000oI00;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
                
                    if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
                
                    r10 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00000oOI(long j) {
                    int iNumberOfTrailingZeros;
/* 10 */            int iHashCode = Long.hashCode(j) * (-862048943);
/* 13 */            int i = iHashCode ^ (iHashCode << 16);
/* 14 */            int i2 = i & 127;
/* 16 */            int i3 = this.I0000O;
/* 20 */            int i4 = (i >>> 7) & i3;
/* 22 */            int i5 = 0;
                    loop0: while (true) {
/* 23 */                long[] jArr = this.I00000oIO;
/* 25 */                int i6 = i4 >> 3;
/* 29 */                int i7 = (i4 & 7) << 3;
/* 47 */                long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
/* 55 */                long j3 = (i2 * 72340172838076673L) ^ j2;
/* 65 */                long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
/* 70 */                    if (j4 == 0) {
                                break;
                            }
/* 79 */                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
/* 86 */                    if (this.I00000oOI[iNumberOfTrailingZeros] == j) {
                                break loop0;
                            }
/* 93 */                    j4 &= j4 - 1;
                        }
/* 109 */               i5 += 8;
/* 112 */               i4 = (i4 + i5) & i3;
                    }
                    return iNumberOfTrailingZeros >= 0;
                }

                public final int I0000Il00O(long j) {
                    long j2;
                    long j3;
                    int i;
                    int i2;
                    long j4;
                    long[] jArr;
                    long[] jArr2;
                    long j5;
                    Object[] objArr;
                    int i3;
                    long[] jArr3;
/* 7 */             int i4 = -862048943;
/* 10 */            int iHashCode = Long.hashCode(j) * (-862048943);
/* 13 */            int i5 = iHashCode ^ (iHashCode << 16);
/* 14 */            int i6 = i5 >>> 7;
/* 16 */            int i7 = i5 & 127;
/* 18 */            int i8 = this.I0000O;
/* 20 */            int i9 = i6 & i8;
/* 22 */            int i10 = 0;
                    while (true) {
/* 23 */                long[] jArr4 = this.I00000oIO;
/* 25 */                int i11 = i9 >> 3;
/* 29 */                int i12 = (i9 & 7) << 3;
/* 34 */                int i13 = 1;
/* 47 */                long j6 = ((jArr4[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr4[i11] >>> i12);
                        long j7 = i7;
/* 56 */                int i14 = i10;
/* 58 */                int i15 = 0;
/* 59 */                long j8 = j6 ^ (j7 * 72340172838076673L);
/* 70 */                long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
/* 75 */                while (j9 != 0) {
/* 85 */                    int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j9) >> 3)) & i8;
/* 87 */                    int i16 = i4;
/* 95 */                    if (this.I00000oOI[iNumberOfTrailingZeros] == j) {
/* 97 */                        return iNumberOfTrailingZeros;
                            }
/* 102 */                   j9 &= j9 - 1;
/* 104 */                   i4 = i16;
                        }
/* 107 */               int i17 = i4;
/* 118 */               if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
/* 120 */                   int iI0000O = I0000O(i6);
/* 128 */                   if (this.I0001Ioi1lo != 0 || ((this.I00000oIO[iI0000O >> 3] >> ((iI0000O & 7) << 3)) & 255) == 254) {
/* 150 */                       j2 = 255;
/* 152 */                       j3 = j7;
/* 154 */                       i = 0;
/* 156 */                       i2 = 1;
/* 158 */                       j4 = 128;
                            } else {
/* 164 */                       int i18 = this.I0000O;
/* 166 */                       if (i18 > 8) {
/* 170 */                           j4 = 128;
/* 186 */                           if (Long.compareUnsigned(this.I0000oI00 * 32, i18 * 25) <= 0) {
/* 188 */                               long[] jArr5 = this.I00000oIO;
/* 190 */                               int i19 = this.I0000O;
/* 192 */                               long[] jArr6 = this.I00000oOI;
/* 194 */                               Object[] objArr2 = this.I0000Il00O;
/* 200 */                               int i20 = (i19 + 7) >> 3;
/* 202 */                               j2 = 255;
/* 204 */                               int i21 = 0;
/* 205 */                               while (i21 < i20) {
/* 212 */                                   long j10 = jArr5[i21] & (-9187201950435737472L);
/* 226 */                                   jArr5[i21] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
/* 228 */                                   i21++;
/* 230 */                                   i13 = i13;
/* 231 */                                   i15 = i15;
/* 233 */                                   j7 = j7;
                                        }
/* 236 */                               j3 = j7;
/* 238 */                               i = i15;
/* 240 */                               int i22 = i13;
/* 241 */                               char c = 7;
/* 242 */                               int length = jArr5.length;
                                        int i23 = length - 1;
                                        int i24 = length - 2;
/* 249 */                               long j11 = 72057594037927935L;
/* 258 */                               jArr5[i24] = (jArr5[i24] & 72057594037927935L) | (-72057594037927936L);
/* 262 */                               jArr5[i23] = jArr5[i];
/* 264 */                               int i25 = i;
/* 266 */                               while (i25 != i19) {
/* 268 */                                   int i26 = i25 >> 3;
/* 274 */                                   int i27 = (i25 & 7) << 3;
/* 277 */                                   long j12 = (jArr5[i26] >> i27) & 255;
/* 281 */                                   if (j12 != 128 && j12 == 254) {
/* 297 */                                       int iHashCode2 = Long.hashCode(jArr6[i25]) * i17;
/* 302 */                                       int i28 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
/* 304 */                                       int iI0000O2 = I0000O(i28);
/* 308 */                                       int i29 = i28 & i19;
/* 313 */                                       char c2 = c;
/* 324 */                                       if (((iI0000O2 - i29) & i19) / 8 == ((i25 - i29) & i19) / 8) {
/* 331 */                                           int i30 = i22;
/* 332 */                                           j5 = j11;
/* 341 */                                           jArr5[i26] = ((r9 & 127) << i27) | (jArr5[i26] & (~(255 << i27)));
/* 351 */                                           jArr5[jArr5.length - i30] = (jArr5[i] & j5) | Long.MIN_VALUE;
/* 353 */                                           i25++;
/* 355 */                                           i22 = i30;
/* 356 */                                           c = c2;
                                                } else {
/* 361 */                                           int i31 = i22;
/* 362 */                                           j5 = j11;
/* 364 */                                           int i32 = iI0000O2 >> 3;
/* 366 */                                           long j13 = jArr5[i32];
/* 370 */                                           int i33 = (iI0000O2 & 7) << 3;
/* 378 */                                           if (((j13 >> i33) & 255) == 128) {
/* 382 */                                               i3 = i31;
/* 387 */                                               jArr3 = jArr6;
/* 388 */                                               objArr = objArr2;
/* 398 */                                               jArr5[i32] = (j13 & (~(255 << i33))) | ((r9 & 127) << i33);
/* 409 */                                               jArr5[i26] = (jArr5[i26] & (~(255 << i27))) | (128 << i27);
/* 413 */                                               jArr3[iI0000O2] = jArr3[i25];
/* 415 */                                               jArr3[i25] = 0;
/* 419 */                                               objArr[iI0000O2] = objArr[i25];
/* 422 */                                               objArr[i25] = null;
                                                    } else {
/* 425 */                                               objArr = objArr2;
/* 427 */                                               i3 = i31;
/* 431 */                                               jArr3 = jArr6;
/* 442 */                                               jArr5[i32] = ((r9 & 127) << i33) | (j13 & (~(255 << i33)));
/* 444 */                                               long j14 = jArr3[iI0000O2];
/* 448 */                                               jArr3[iI0000O2] = jArr3[i25];
/* 450 */                                               jArr3[i25] = j14;
/* 452 */                                               Object obj = objArr[iI0000O2];
/* 456 */                                               objArr[iI0000O2] = objArr[i25];
/* 458 */                                               objArr[i25] = obj;
                                                        i25--;
                                                    }
/* 471 */                                           jArr5[jArr5.length - 1] = (jArr5[i] & j5) | Long.MIN_VALUE;
/* 473 */                                           i25++;
/* 475 */                                           jArr6 = jArr3;
/* 476 */                                           i22 = i3;
/* 478 */                                           c = c2;
/* 480 */                                           objArr2 = objArr;
                                                }
/* 358 */                                       j11 = j5;
                                            } else {
/* 283 */                                       i25++;
                                            }
                                        }
/* 485 */                               i2 = i22;
/* 496 */                               this.I0001Ioi1lo = OiO10oio.I00000oIO(this.I0000O) - this.I0000oI00;
                                    }
/* 629 */                           iI0000O = I0000O(i6);
                                } else {
/* 511 */                           j4 = 128;
                                }
/* 500 */                       j2 = 255;
/* 502 */                       j3 = j7;
/* 504 */                       i = 0;
/* 506 */                       i2 = 1;
/* 516 */                       int iI00000oOI = OiO10oio.I00000oOI(this.I0000O);
/* 520 */                       long[] jArr7 = this.I00000oIO;
/* 522 */                       long[] jArr8 = this.I00000oOI;
/* 524 */                       Object[] objArr3 = this.I0000Il00O;
/* 526 */                       int i34 = this.I0000O;
/* 528 */                       I0001Ioi1lo(iI00000oOI);
/* 531 */                       long[] jArr9 = this.I00000oIO;
/* 533 */                       long[] jArr10 = this.I00000oOI;
/* 535 */                       Object[] objArr4 = this.I0000Il00O;
/* 537 */                       int i35 = this.I0000O;
/* 539 */                       int i36 = 0;
/* 541 */                       while (i36 < i34) {
/* 556 */                           if (((jArr7[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j4) {
/* 558 */                               long j15 = jArr8[i36];
/* 564 */                               int iHashCode3 = Long.hashCode(j15) * i17;
/* 568 */                               int i37 = iHashCode3 ^ (iHashCode3 << 16);
/* 571 */                               int iI0000O3 = I0000O(i37 >>> 7);
/* 577 */                               jArr = jArr9;
/* 579 */                               jArr2 = jArr7;
/* 575 */                               long j16 = i37 & 127;
/* 581 */                               int i38 = iI0000O3 >> 3;
/* 585 */                               int i39 = (iI0000O3 & 7) << 3;
/* 598 */                               long j17 = (jArr[i38] & (~(255 << i39))) | (j16 << i39);
/* 600 */                               jArr[i38] = j17;
/* 611 */                               jArr[(((iI0000O3 - 7) & i35) + (i35 & 7)) >> 3] = j17;
/* 613 */                               jArr10[iI0000O3] = j15;
/* 617 */                               objArr4[iI0000O3] = objArr3[i36];
                                    } else {
/* 620 */                               jArr = jArr9;
/* 622 */                               jArr2 = jArr7;
                                    }
/* 623 */                           i36++;
/* 625 */                           jArr7 = jArr2;
/* 626 */                           jArr9 = jArr;
                                }
/* 629 */                       iI0000O = I0000O(i6);
                            }
                            this.I0000oI00++;
/* 639 */                   int i40 = this.I0001Ioi1lo;
/* 641 */                   long[] jArr11 = this.I00000oIO;
/* 643 */                   int i41 = iI0000O >> 3;
/* 645 */                   long j18 = jArr11[i41];
/* 649 */                   int i42 = (iI0000O & 7) << 3;
/* 657 */                   if (((j18 >> i42) & j2) != j4) {
/* 660 */                       i2 = i;
                            }
/* 664 */                   this.I0001Ioi1lo = i40 - i2;
/* 666 */                   int i43 = this.I0000O;
/* 674 */                   long j19 = (j18 & (~(j2 << i42))) | (j3 << i42);
/* 675 */                   jArr11[i41] = j19;
/* 685 */                   jArr11[(((iI0000O - 7) & i43) + (i43 & 7)) >> 3] = j19;
/* 687 */                   return iI0000O;
                        }
/* 692 */               i10 = i14 + 8;
/* 695 */               i9 = (i9 + i10) & i8;
/* 696 */               i4 = i17;
                    }
                }

                public final int I0000O(int i) {
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

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
                
                    if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
                
                    r10 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000oI00(long j) {
                    int iNumberOfTrailingZeros;
/* 8 */             int iHashCode = Long.hashCode(j) * (-862048943);
/* 11 */            int i = iHashCode ^ (iHashCode << 16);
/* 12 */            int i2 = i & 127;
/* 14 */            int i3 = this.I0000O;
/* 18 */            int i4 = (i >>> 7) & i3;
/* 19 */            int i5 = 0;
                    loop0: while (true) {
/* 20 */                long[] jArr = this.I00000oIO;
/* 22 */                int i6 = i4 >> 3;
/* 26 */                int i7 = (i4 & 7) << 3;
/* 44 */                long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
/* 52 */                long j3 = (i2 * 72340172838076673L) ^ j2;
/* 62 */                long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
/* 67 */                    if (j4 == 0) {
                                break;
                            }
/* 76 */                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
/* 83 */                    if (this.I00000oOI[iNumberOfTrailingZeros] == j) {
                                break loop0;
                            }
/* 90 */                    j4 &= j4 - 1;
                        }
/* 111 */               i5 += 8;
/* 114 */               i4 = (i4 + i5) & i3;
                    }
/* 102 */           if (iNumberOfTrailingZeros >= 0) {
/* 106 */               return this.I0000Il00O[iNumberOfTrailingZeros];
                    }
/* 109 */           return null;
                }

                public final void I0001Ioi1lo(int i) {
                    long[] jArr;
/* 14 */            int iMax = i > 0 ? Math.max(7, OiO10oio.I0000Il00O(i)) : 0;
/* 15 */            this.I0000O = iMax;
/* 17 */            if (iMax == 0) {
/* 19 */                jArr = OiO10oio.I00000oIO;
                    } else {
/* 26 */                int i2 = ((iMax + 15) & (-8)) >> 3;
/* 28 */                long[] jArr2 = new long[i2];
/* 35 */                Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
/* 38 */                jArr = jArr2;
                    }
/* 39 */            this.I00000oIO = jArr;
/* 41 */            int i3 = iMax >> 3;
/* 51 */            long j = 255 << ((iMax & 7) << 3);
/* 56 */            jArr[i3] = (jArr[i3] & (~j)) | j;
/* 67 */            this.I0001Ioi1lo = OiO10oio.I00000oIO(this.I0000O) - this.I0000oI00;
/* 71 */            this.I00000oOI = new long[iMax];
/* 75 */            this.I0000Il00O = new Object[iMax];
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
                
                    if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
                
                    r10 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(long j) {
                    int iNumberOfTrailingZeros;
/* 8 */             int iHashCode = Long.hashCode(j) * (-862048943);
/* 11 */            int i = iHashCode ^ (iHashCode << 16);
/* 12 */            int i2 = i & 127;
/* 14 */            int i3 = this.I0000O;
/* 18 */            int i4 = (i >>> 7) & i3;
/* 19 */            int i5 = 0;
                    loop0: while (true) {
/* 20 */                long[] jArr = this.I00000oIO;
/* 22 */                int i6 = i4 >> 3;
/* 26 */                int i7 = (i4 & 7) << 3;
/* 44 */                long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
/* 52 */                long j3 = (i2 * 72340172838076673L) ^ j2;
/* 62 */                long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
/* 67 */                    if (j4 == 0) {
                                break;
                            }
/* 76 */                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
/* 83 */                    if (this.I00000oOI[iNumberOfTrailingZeros] == j) {
                                break loop0;
                            }
/* 90 */                    j4 &= j4 - 1;
                        }
/* 111 */               i5 += 8;
/* 114 */               i4 = (i4 + i5) & i3;
                    }
/* 102 */           if (iNumberOfTrailingZeros >= 0) {
/* 104 */               return I000O01llI0(iNumberOfTrailingZeros);
                    }
/* 109 */           return null;
                }

                public final Object I000O01llI0(int i) {
                    this.I0000oI00--;
/* 7 */             long[] jArr = this.I00000oIO;
/* 9 */             int i2 = this.I0000O;
/* 11 */            int i3 = i >> 3;
/* 15 */            int i4 = (i & 7) << 3;
/* 27 */            long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
/* 29 */            jArr[i3] = j;
/* 39 */            jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
/* 41 */            Object[] objArr = this.I0000Il00O;
/* 43 */            Object obj = objArr[i];
/* 46 */            objArr[i] = null;
/* 77 */            return obj;
                }

                public final void I000OOo1O(long j, Object obj) {
/* 1 */             int iI0000Il00O = I0000Il00O(j);
/* 7 */             this.I00000oOI[iI0000Il00O] = j;
/* 11 */            this.I0000Il00O[iI0000Il00O] = obj;
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
/* 12 */            if (!(obj instanceof OI0lli1)) {
/* 11 */                return false;
                    }
/* 15 */            OI0lli1 oI0lli1 = (OI0lli1) obj;
/* 21 */            if (oI0lli1.I0000oI00 != this.I0000oI00) {
/* 11 */                return false;
                    }
/* 24 */            long[] jArr = this.I00000oOI;
/* 26 */            Object[] objArr = this.I0000Il00O;
/* 28 */            long[] jArr2 = this.I00000oIO;
                    int length = jArr2.length - 2;
/* 33 */            if (length >= 0) {
/* 35 */                int i = 0;
                        loop0: while (true) {
/* 36 */                    long j = jArr2[i];
/* 50 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 59 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 62 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 71 */                            if ((255 & j) < 128) {
/* 75 */                                int i4 = (i << 3) + i3;
/* 76 */                                long j2 = jArr[i4];
/* 78 */                                Object obj2 = objArr[i4];
/* 80 */                                if (obj2 == null) {
/* 86 */                                    if (oI0lli1.I0000oI00(j2) != null || !oI0lli1.I00000oOI(j2)) {
                                                break loop0;
                                            }
                                        } else if (!obj2.equals(oI0lli1.I0000oI00(j2))) {
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
/* 1 */             long[] jArr = this.I00000oOI;
/* 3 */             Object[] objArr = this.I0000Il00O;
/* 5 */             long[] jArr2 = this.I00000oIO;
                    int length = jArr2.length - 2;
/* 11 */            if (length < 0) {
/* 10 */                return 0;
                    }
/* 13 */            int i = 0;
/* 14 */            int iHashCode = 0;
                    while (true) {
/* 15 */                long j = jArr2[i];
/* 29 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 38 */                    int i2 = 8 - ((~(i - length)) >>> 31);
/* 41 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 50 */                        if ((255 & j) < 128) {
/* 54 */                            int i4 = (i << 3) + i3;
/* 55 */                            long j2 = jArr[i4];
/* 57 */                            Object obj = objArr[i4];
/* 72 */                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
                                }
/* 73 */                        j >>= 8;
                            }
/* 77 */                    if (i2 != 8) {
/* 80 */                        return iHashCode;
                            }
                        }
/* 81 */                if (i == length) {
/* 86 */                    return iHashCode;
                        }
/* 83 */                i++;
                    }
                }

                public final String toString() {
                    int i;
                    int i2;
/* 5 */             if (this.I0000oI00 == 0) {
/* 7 */                 return "{}";
                    }
/* 14 */            StringBuilder sb = new StringBuilder("{");
/* 17 */            long[] jArr = this.I00000oOI;
/* 19 */            Object[] objArr = this.I0000Il00O;
/* 21 */            long[] jArr2 = this.I00000oIO;
                    int length = jArr2.length - 2;
/* 26 */            if (length >= 0) {
/* 28 */                int i3 = 0;
/* 29 */                int i4 = 0;
                        while (true) {
/* 30 */                    long j = jArr2[i3];
/* 44 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 53 */                        int i5 = 8 - ((~(i3 - length)) >>> 31);
/* 55 */                        int i6 = 0;
/* 56 */                        while (i6 < i5) {
/* 65 */                            if ((255 & j) < 128) {
/* 69 */                                int i7 = (i3 << 3) + i6;
/* 70 */                                i2 = i3;
/* 72 */                                long j2 = jArr[i7];
/* 74 */                                Object obj = objArr[i7];
/* 76 */                                sb.append(j2);
/* 81 */                                sb.append("=");
/* 84 */                                if (obj == this) {
/* 86 */                                    obj = "(this)";
                                        }
/* 88 */                                sb.append(obj);
/* 91 */                                i4++;
/* 95 */                                if (i4 < this.I0000oI00) {
/* 99 */                                    sb.append(", ");
                                        }
                                    } else {
/* 103 */                               i2 = i3;
                                    }
/* 105 */                           j >>= 8;
/* 106 */                           i6++;
/* 108 */                           i3 = i2;
                                }
/* 111 */                       int i8 = i3;
/* 113 */                       if (i5 != 8) {
                                    break;
                                }
/* 115 */                       i = i8;
                            } else {
/* 118 */                       i = i3;
                            }
/* 119 */                   if (i == length) {
                                break;
                            }
/* 121 */                   i3 = i + 1;
                        }
                    }
/* 126 */           sb.append('}');
/* 129 */           return sb.toString();
                }

/* 32 */        public OI0lli1() {
/* 33 */            this(6);
                }
            }
