            package p000;

            import java.util.Arrays;
            
/* 27 */    public final class OI10IIO {
                public long[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;

                public OI10IIO(int i) {
/* 6 */             this.I00000oIO = OiO10oio.I00000oIO;
/* 10 */            this.I00000oOI = iIIl1I0OIlO0.I0000Il00O;
/* 12 */            if (i >= 0) {
/* 18 */                I0001Ioi1lo(OiO10oio.I0000O(i));
                    } else {
/* 24 */                lO00l0o.I00000oIO("Capacity must be a positive value.");
/* 29 */                throw null;
                    }
                }

                public final boolean I00000oIO(Object obj) {
/* 1 */             int i = this.I0000O;
/* 9 */             this.I00000oOI[I0000O(obj)] = obj;
                    return this.I0000O != i;
                }

                public final void I00000oOI() {
/* 2 */             this.I0000O = 0;
/* 4 */             long[] jArr = this.I00000oIO;
/* 8 */             if (jArr != OiO10oio.I00000oIO) {
/* 15 */                I1IoiO1l.I0010o(-9187201950435737472L, jArr);
/* 18 */                long[] jArr2 = this.I00000oIO;
/* 20 */                int i = this.I0000Il00O;
/* 22 */                int i2 = i >> 3;
/* 32 */                long j = 255 << ((i & 7) << 3);
/* 36 */                jArr2[i2] = (jArr2[i2] & (~j)) | j;
                    }
/* 43 */            Arrays.fill(this.I00000oOI, 0, this.I0000Il00O, (Object) null);
/* 55 */            this.I0000oI00 = OiO10oio.I00000oIO(this.I0000Il00O) - this.I0000O;
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
/* 23 */            int i3 = this.I0000Il00O;
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

                public final int I0000O(Object obj) {
                    long j;
                    long j2;
                    long j3;
                    long[] jArr;
                    long[] jArr2;
                    int i;
                    Object[] objArr;
                    int i2;
/* 13 */            int i3 = -862048943;
/* 16 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
/* 19 */            int i4 = iHashCode ^ (iHashCode << 16);
/* 20 */            int i5 = i4 >>> 7;
/* 22 */            int i6 = i4 & 127;
/* 24 */            int i7 = this.I0000Il00O;
/* 26 */            int i8 = i5 & i7;
/* 28 */            int i9 = 0;
                    while (true) {
/* 29 */                long[] jArr3 = this.I00000oIO;
/* 31 */                int i10 = i8 >> 3;
/* 35 */                int i11 = (i8 & 7) << 3;
/* 55 */                long j4 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
                        long j5 = i6;
/* 64 */                int i12 = i6;
/* 67 */                long j6 = j4 ^ (j5 * 72340172838076673L);
/* 78 */                long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
/* 83 */                while (j7 != 0) {
/* 93 */                    int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
/* 95 */                    int i13 = i3;
/* 105 */                   if (O0000Ioio00.I0000O(this.I00000oOI[iNumberOfTrailingZeros], obj)) {
/* 107 */                       return iNumberOfTrailingZeros;
                            }
/* 112 */                   j7 &= j7 - 1;
/* 114 */                   i3 = i13;
                        }
/* 117 */               int i14 = i3;
/* 128 */               if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
/* 130 */                   int iI0000oI00 = I0000oI00(i5);
/* 136 */                   long j8 = 255;
/* 138 */                   if (this.I0000oI00 != 0 || ((this.I00000oIO[iI0000oI00 >> 3] >> ((iI0000oI00 & 7) << 3)) & 255) == 254) {
/* 160 */                       j = 255;
/* 162 */                       j2 = j5;
/* 166 */                       j3 = 128;
                            } else {
/* 170 */                       int i15 = this.I0000Il00O;
/* 172 */                       if (i15 > 8) {
/* 176 */                           int i16 = 8;
/* 193 */                           if (Long.compareUnsigned(this.I0000O * 32, i15 * 25) <= 0) {
/* 195 */                               long[] jArr4 = this.I00000oIO;
/* 197 */                               int i17 = this.I0000Il00O;
/* 199 */                               Object[] objArr2 = this.I00000oOI;
/* 203 */                               int i18 = (i17 + 7) >> 3;
/* 205 */                               int i19 = 0;
/* 206 */                               j3 = 128;
/* 208 */                               while (i19 < i18) {
/* 212 */                                   long j9 = j8;
/* 214 */                                   long j10 = jArr4[i19] & (-9187201950435737472L);
/* 229 */                                   jArr4[i19] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
/* 231 */                                   i19++;
/* 233 */                                   i16 = i16;
/* 234 */                                   j5 = j5;
/* 236 */                                   j8 = j9;
                                        }
/* 239 */                               j = j8;
/* 241 */                               j2 = j5;
/* 243 */                               int i20 = i16;
/* 244 */                               int length = jArr4.length;
                                        int i21 = length - 1;
                                        int i22 = length - 2;
/* 251 */                               long j11 = 72057594037927935L;
/* 260 */                               jArr4[i22] = (jArr4[i22] & 72057594037927935L) | (-72057594037927936L);
/* 264 */                               jArr4[i21] = jArr4[0];
/* 266 */                               int i23 = 0;
/* 267 */                               while (i23 != i17) {
/* 269 */                                   int i24 = i23 >> 3;
/* 275 */                                   int i25 = (i23 & 7) << 3;
/* 278 */                                   long j12 = (jArr4[i24] >> i25) & j;
/* 282 */                                   if (j12 != 128 && j12 == 254) {
/* 292 */                                       Object obj2 = objArr2[i23];
/* 302 */                                       int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i14;
/* 307 */                                       int i26 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
/* 309 */                                       int iI0000oI002 = I0000oI00(i26);
/* 313 */                                       int i27 = i26 & i17;
/* 324 */                                       if (((iI0000oI002 - i27) & i17) / i20 == ((i23 - i27) & i17) / i20) {
/* 331 */                                           long j13 = j11;
/* 339 */                                           jArr4[i24] = ((r7 & 127) << i25) | ((~(j << i25)) & jArr4[i24]);
/* 350 */                                           jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
/* 352 */                                           i23++;
/* 354 */                                           j11 = j13;
                                                } else {
/* 357 */                                           long j14 = j11;
/* 359 */                                           int i28 = iI0000oI002 >> 3;
/* 361 */                                           long j15 = jArr4[i28];
/* 365 */                                           int i29 = (iI0000oI002 & 7) << 3;
/* 373 */                                           if (((j15 >> i29) & j) == 128) {
/* 377 */                                               i2 = i20;
/* 382 */                                               i = i17;
/* 384 */                                               objArr = objArr2;
/* 393 */                                               jArr4[i28] = ((~(j << i29)) & j15) | ((r7 & 127) << i29);
/* 404 */                                               jArr4[i24] = (jArr4[i24] & (~(j << i25))) | (128 << i25);
/* 408 */                                               objArr[iI0000oI002] = objArr[i23];
/* 411 */                                               objArr[i23] = null;
                                                    } else {
/* 414 */                                               i = i17;
/* 416 */                                               objArr = objArr2;
/* 418 */                                               i2 = i20;
/* 431 */                                               jArr4[i28] = ((r7 & 127) << i29) | ((~(j << i29)) & j15);
/* 433 */                                               Object obj3 = objArr[iI0000oI002];
/* 437 */                                               objArr[iI0000oI002] = objArr[i23];
/* 439 */                                               objArr[i23] = obj3;
                                                        i23--;
                                                    }
/* 452 */                                           jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
/* 454 */                                           i23++;
/* 456 */                                           j11 = j14;
/* 458 */                                           i20 = i2;
/* 460 */                                           i17 = i;
/* 462 */                                           objArr2 = objArr;
                                                }
                                            } else {
/* 284 */                                       i23++;
                                            }
                                        }
/* 475 */                               this.I0000oI00 = OiO10oio.I00000oIO(this.I0000Il00O) - this.I0000O;
                                    }
/* 597 */                           iI0000oI00 = I0000oI00(i5);
                                }
/* 479 */                       j = 255;
/* 481 */                       j2 = j5;
/* 483 */                       j3 = 128;
/* 491 */                       int iI00000oOI = OiO10oio.I00000oOI(this.I0000Il00O);
/* 495 */                       long[] jArr5 = this.I00000oIO;
/* 497 */                       Object[] objArr3 = this.I00000oOI;
/* 499 */                       int i30 = this.I0000Il00O;
/* 501 */                       I0001Ioi1lo(iI00000oOI);
/* 504 */                       long[] jArr6 = this.I00000oIO;
/* 506 */                       Object[] objArr4 = this.I00000oOI;
/* 508 */                       int i31 = this.I0000Il00O;
/* 510 */                       int i32 = 0;
/* 511 */                       while (i32 < i30) {
/* 526 */                           if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
/* 528 */                               Object obj4 = objArr3[i32];
/* 538 */                               int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i14;
/* 542 */                               int i33 = iHashCode3 ^ (iHashCode3 << 16);
/* 545 */                               int iI0000oI003 = I0000oI00(i33 >>> 7);
/* 549 */                               long j16 = i33 & 127;
/* 552 */                               int i34 = iI0000oI003 >> 3;
/* 556 */                               int i35 = (iI0000oI003 & 7) << 3;
/* 560 */                               jArr = jArr6;
/* 562 */                               jArr2 = jArr5;
/* 570 */                               long j17 = (jArr6[i34] & (~(255 << i35))) | (j16 << i35);
/* 571 */                               jArr[i34] = j17;
/* 581 */                               jArr[(((iI0000oI003 - 7) & i31) + (i31 & 7)) >> 3] = j17;
/* 583 */                               objArr4[iI0000oI003] = obj4;
                                    } else {
/* 586 */                               jArr = jArr6;
/* 588 */                               jArr2 = jArr5;
                                    }
/* 590 */                           i32++;
/* 592 */                           jArr5 = jArr2;
/* 594 */                           jArr6 = jArr;
                                }
/* 597 */                       iI0000oI00 = I0000oI00(i5);
                            }
                            this.I0000O++;
/* 607 */                   int i36 = this.I0000oI00;
/* 609 */                   long[] jArr7 = this.I00000oIO;
/* 611 */                   int i37 = iI0000oI00 >> 3;
/* 613 */                   long j18 = jArr7[i37];
/* 617 */                   int i38 = (iI0000oI00 & 7) << 3;
/* 630 */                   this.I0000oI00 = i36 - (((j18 >> i38) & j) == j3 ? 1 : 0);
/* 632 */                   int i39 = this.I0000Il00O;
/* 640 */                   long j19 = (j18 & (~(j << i38))) | (j2 << i38);
/* 641 */                   jArr7[i37] = j19;
/* 651 */                   jArr7[(((iI0000oI00 - 7) & i39) + (i39 & 7)) >> 3] = j19;
/* 653 */                   return iI0000oI00;
                        }
/* 656 */               i9 += 8;
/* 659 */               i8 = (i8 + i9) & i7;
/* 660 */               i6 = i12;
/* 662 */               i3 = i14;
                    }
                }

                public final int I0000oI00(int i) {
/* 1 */             int i2 = this.I0000Il00O;
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

                public final void I0001Ioi1lo(int i) {
                    long[] jArr;
/* 14 */            int iMax = i > 0 ? Math.max(7, OiO10oio.I0000Il00O(i)) : 0;
/* 15 */            this.I0000Il00O = iMax;
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
/* 67 */            this.I0000oI00 = OiO10oio.I00000oIO(this.I0000Il00O) - this.I0000O;
/* 76 */            this.I00000oOI = iMax == 0 ? iIIl1I0OIlO0.I0000Il00O : new Object[iMax];
                }

                public final boolean I000II() {
                    return this.I0000O == 0;
                }

                public final boolean I000O01llI0() {
                    return this.I0000O != 0;
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
                
                    if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
                
                    r10 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000OOo1O(Object obj) {
                    int iNumberOfTrailingZeros;
/* 1 */             int i = 0;
/* 13 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
/* 16 */            int i2 = iHashCode ^ (iHashCode << 16);
/* 17 */            int i3 = i2 & 127;
/* 19 */            int i4 = this.I0000Il00O;
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
                            } else {
/* 96 */                        j3 &= j3 - 1;
                            }
                        }
/* 114 */               i += 8;
/* 116 */               i5 = i6 + i;
                    }
/* 108 */           if (iNumberOfTrailingZeros >= 0) {
/* 110 */               I000lI(iNumberOfTrailingZeros);
                    }
                }

                public final void I000OiO(OI10IIO oi10iio) {
/* 1 */             Object[] objArr = oi10iio.I00000oOI;
/* 3 */             long[] jArr = oi10iio.I00000oIO;
                    int length = jArr.length - 2;
/* 8 */             if (length < 0) {
/* 77 */                return;
                    }
/* 11 */            int i = 0;
                    while (true) {
/* 12 */                long j = jArr[i];
/* 26 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 35 */                    int i2 = 8 - ((~(i - length)) >>> 31);
/* 38 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 47 */                        if ((255 & j) < 128) {
/* 54 */                            I000iOII(objArr[(i << 3) + i3]);
                                }
/* 57 */                        j >>= 8;
                            }
/* 61 */                    if (i2 != 8) {
/* 77 */                        return;
                            }
                        }
/* 63 */                if (i == length) {
/* 77 */                    return;
                        } else {
/* 65 */                    i++;
                        }
                    }
                }

                public final void I000iOII(Object obj) {
/* 7 */             this.I00000oOI[I0000O(obj)] = obj;
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
                
                    if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
                
                    r11 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000l1(Object obj) {
                    int iNumberOfTrailingZeros;
/* 17 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
/* 20 */            int i = iHashCode ^ (iHashCode << 16);
/* 21 */            int i2 = i & 127;
/* 23 */            int i3 = this.I0000Il00O;
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
/* 122 */               i5 += 8;
/* 125 */               i4 = (i4 + i5) & i3;
                    }
/* 113 */           boolean z = iNumberOfTrailingZeros >= 0;
/* 116 */           if (z) {
/* 118 */               I000lI(iNumberOfTrailingZeros);
                    }
/* 121 */           return z;
                }

                public final void I000lI(int i) {
                    this.I0000O--;
/* 7 */             long[] jArr = this.I00000oIO;
/* 9 */             int i2 = this.I0000Il00O;
/* 11 */            int i3 = i >> 3;
/* 15 */            int i4 = (i & 7) << 3;
/* 27 */            long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
/* 29 */            jArr[i3] = j;
/* 39 */            jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
/* 44 */            this.I00000oOI[i] = null;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OI10IIO)) {
/* 7 */                 return false;
                    }
/* 11 */            OI10IIO oi10iio = (OI10IIO) obj;
/* 17 */            if (oi10iio.I0000O != this.I0000O) {
/* 7 */                 return false;
                    }
/* 20 */            Object[] objArr = this.I00000oOI;
/* 22 */            long[] jArr = this.I00000oIO;
                    int length = jArr.length - 2;
/* 27 */            if (length >= 0) {
/* 29 */                int i = 0;
                        while (true) {
/* 30 */                    long j = jArr[i];
/* 44 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 53 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 56 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 65 */                            if ((255 & j) < 128 && !oi10iio.I0000Il00O(objArr[(i << 3) + i3])) {
/* 7 */                                 return false;
                                    }
/* 79 */                            j >>= 8;
                                }
/* 83 */                        if (i2 != 8) {
                                    break;
                                }
/* 85 */                        if (i == length) {
                                    break;
                                }
/* 87 */                        i++;
                            }
                        }
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = (this.I0000Il00O * 31) + this.I0000O;
/* 8 */             Object[] objArr = this.I00000oOI;
/* 10 */            long[] jArr = this.I00000oIO;
                    int length = jArr.length - 2;
/* 15 */            if (length >= 0) {
/* 18 */                int i = 0;
                        while (true) {
/* 19 */                    long j = jArr[i];
/* 33 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 42 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 45 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 54 */                            if ((255 & j) < 128) {
/* 59 */                                Object obj = objArr[(i << 3) + i3];
/* 65 */                                if (!O0000Ioio00.I0000O(obj, this)) {
/* 75 */                                    iHashCode += obj != null ? obj.hashCode() : 0;
                                        }
                                    }
/* 76 */                            j >>= 8;
                                }
/* 80 */                        if (i2 != 8) {
/* 83 */                            return iHashCode;
                                }
                            }
/* 84 */                    if (i == length) {
                                break;
                            }
/* 86 */                    i++;
                        }
                    }
/* 110 */           return iHashCode;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[PHI: r8
                  0x0065: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x002a, B:18:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
/* 7 */             I10iOo0il1 i10iOo0il1 = new I10iOo0il1(this, 8);
/* 14 */            StringBuilder sb = new StringBuilder("[");
/* 17 */            Object[] objArr = this.I00000oOI;
/* 19 */            long[] jArr = this.I00000oIO;
                    int length = jArr.length - 2;
/* 24 */            if (length >= 0) {
/* 27 */                int i = 0;
/* 28 */                int i2 = 0;
                        loop0: while (true) {
/* 29 */                    long j = jArr[i];
/* 43 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 50 */                        int i3 = 8 - ((~(i - length)) >>> 31);
/* 53 */                        for (int i4 = 0; i4 < i3; i4++) {
/* 62 */                            if ((255 & j) < 128) {
/* 67 */                                Object obj = objArr[(i << 3) + i4];
/* 70 */                                if (i2 == -1) {
/* 74 */                                    sb.append((CharSequence) "...");
                                            break loop0;
                                        }
/* 78 */                                if (i2 != 0) {
/* 82 */                                    sb.append((CharSequence) ", ");
                                        }
/* 91 */                                sb.append((CharSequence) i10iOo0il1.invoke(obj));
/* 94 */                                i2++;
                                    }
/* 96 */                            j >>= 8;
                                }
/* 100 */                       if (i3 != 8) {
                                    break;
                                }
/* 102 */                       if (i == length) {
                                    break;
                                }
/* 104 */                       i++;
                            }
                        }
/* 109 */               sb.append((CharSequence) "]");
                    } else {
/* 109 */               sb.append((CharSequence) "]");
                    }
/* 112 */           return sb.toString();
                }

/* 28 */        public OI10IIO() {
/* 29 */            this(6);
                }
            }
