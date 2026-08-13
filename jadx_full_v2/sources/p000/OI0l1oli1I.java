            package p000;

            import java.util.Arrays;
            
/* 31 */    public final class OI0l1oli1I extends IooIolI {
                public int I0001Ioi1lo;

                public OI0l1oli1I(int i) {
/* 6 */             this.I00000oIO = OiO10oio.I00000oIO;
/* 10 */            this.I00000oOI = IooOIoI.I00000oIO;
/* 14 */            this.I0000Il00O = iIIl1I0OIlO0.I0000Il00O;
/* 16 */            if (i >= 0) {
/* 22 */                I0001Ioi1lo(OiO10oio.I0000O(i));
                    } else {
/* 28 */                lO00l0o.I00000oIO("Capacity must be a positive value.");
/* 77 */                throw null;
                    }
                }

                public final void I0000Il00O() {
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

                public final int I0000O(int i) {
                    long j;
                    long j2;
                    int i2;
                    long j3;
                    long[] jArr;
                    long[] jArr2;
                    int[] iArr;
                    Object[] objArr;
                    int i3;
/* 7 */             int i4 = -862048943;
/* 10 */            int iHashCode = Integer.hashCode(i) * (-862048943);
/* 13 */            int i5 = iHashCode ^ (iHashCode << 16);
/* 14 */            int i6 = i5 >>> 7;
/* 16 */            int i7 = i5 & 127;
/* 18 */            int i8 = this.I0000O;
/* 20 */            int i9 = i6 & i8;
/* 22 */            int i10 = 0;
                    while (true) {
/* 23 */                long[] jArr3 = this.I00000oIO;
/* 25 */                int i11 = i9 >> 3;
/* 29 */                int i12 = (i9 & 7) << 3;
/* 34 */                int i13 = 1;
/* 47 */                long j4 = ((jArr3[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr3[i11] >>> i12);
                        long j5 = i7;
/* 56 */                int i14 = i10;
/* 58 */                int i15 = 0;
/* 59 */                long j6 = j4 ^ (j5 * 72340172838076673L);
/* 70 */                long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
/* 75 */                while (j7 != 0) {
/* 85 */                    int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
/* 87 */                    int i16 = i4;
/* 93 */                    int i17 = i15;
/* 97 */                    if (this.I00000oOI[iNumberOfTrailingZeros] == i) {
/* 99 */                        return iNumberOfTrailingZeros;
                            }
/* 104 */                   j7 &= j7 - 1;
/* 106 */                   i4 = i16;
/* 108 */                   i15 = i17;
                        }
/* 111 */               int i18 = i4;
/* 113 */               int i19 = i15;
/* 126 */               if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
/* 128 */                   int iI0000oI00 = I0000oI00(i6);
/* 134 */                   long j8 = 255;
/* 136 */                   if (this.I0001Ioi1lo != 0 || ((this.I00000oIO[iI0000oI00 >> 3] >> ((iI0000oI00 & 7) << 3)) & 255) == 254) {
/* 158 */                       j = 255;
/* 160 */                       j2 = j5;
/* 162 */                       i2 = 1;
/* 166 */                       j3 = 128;
                            } else {
/* 170 */                       int i20 = this.I0000O;
/* 172 */                       if (i20 > 8) {
/* 176 */                           j3 = 128;
/* 192 */                           if (Long.compareUnsigned(this.I0000oI00 * 32, i20 * 25) <= 0) {
/* 194 */                               long[] jArr4 = this.I00000oIO;
/* 196 */                               int i21 = this.I0000O;
/* 198 */                               int[] iArr2 = this.I00000oOI;
/* 200 */                               Object[] objArr2 = this.I0000Il00O;
/* 204 */                               int i22 = (i21 + 7) >> 3;
/* 208 */                               int i23 = i19;
/* 210 */                               while (i23 < i22) {
/* 214 */                                   long j9 = j8;
/* 216 */                                   long j10 = jArr4[i23] & (-9187201950435737472L);
/* 232 */                                   jArr4[i23] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
/* 234 */                                   i23++;
/* 236 */                                   j5 = j5;
/* 238 */                                   j8 = j9;
                                        }
/* 241 */                               j = j8;
/* 243 */                               j2 = j5;
/* 247 */                               int length = jArr4.length;
                                        int i24 = length - 1;
                                        int i25 = length - 2;
/* 254 */                               long j11 = 72057594037927935L;
/* 263 */                               jArr4[i25] = (jArr4[i25] & 72057594037927935L) | (-72057594037927936L);
/* 267 */                               jArr4[i24] = jArr4[i19];
/* 269 */                               int i26 = i19;
/* 271 */                               while (i26 != i21) {
/* 273 */                                   int i27 = i26 >> 3;
/* 279 */                                   int i28 = (i26 & 7) << 3;
/* 282 */                                   long j12 = (jArr4[i27] >> i28) & j;
/* 286 */                                   if (j12 != 128 && j12 == 254) {
/* 302 */                                       int iHashCode2 = Integer.hashCode(iArr2[i26]) * i18;
/* 307 */                                       int i29 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
/* 309 */                                       int iI0000oI002 = I0000oI00(i29);
/* 313 */                                       int i30 = i29 & i21;
/* 326 */                                       if (((iI0000oI002 - i30) & i21) / 8 == ((i26 - i30) & i21) / 8) {
/* 333 */                                           long j13 = j11;
/* 341 */                                           jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & jArr4[i27]);
/* 351 */                                           jArr4[jArr4.length - i13] = (jArr4[i19] & j13) | Long.MIN_VALUE;
/* 353 */                                           i26++;
/* 355 */                                           j11 = j13;
                                                } else {
/* 358 */                                           long j14 = j11;
/* 360 */                                           int i31 = iI0000oI002 >> 3;
/* 362 */                                           long j15 = jArr4[i31];
/* 366 */                                           int i32 = (iI0000oI002 & 7) << 3;
/* 374 */                                           if (((j15 >> i32) & j) == 128) {
/* 378 */                                               i3 = i13;
/* 383 */                                               iArr = iArr2;
/* 385 */                                               objArr = objArr2;
/* 394 */                                               jArr4[i31] = ((~(j << i32)) & j15) | ((r8 & 127) << i32);
/* 405 */                                               jArr4[i27] = (jArr4[i27] & (~(j << i28))) | (128 << i28);
/* 409 */                                               iArr[iI0000oI002] = iArr[i26];
/* 411 */                                               iArr[i26] = i19;
/* 415 */                                               objArr[iI0000oI002] = objArr[i26];
/* 418 */                                               objArr[i26] = null;
                                                    } else {
/* 421 */                                               iArr = iArr2;
/* 423 */                                               objArr = objArr2;
/* 425 */                                               i3 = i13;
/* 438 */                                               jArr4[i31] = ((r8 & 127) << i32) | ((~(j << i32)) & j15);
/* 440 */                                               int i33 = iArr[iI0000oI002];
/* 444 */                                               iArr[iI0000oI002] = iArr[i26];
/* 446 */                                               iArr[i26] = i33;
/* 448 */                                               Object obj = objArr[iI0000oI002];
/* 452 */                                               objArr[iI0000oI002] = objArr[i26];
/* 454 */                                               objArr[i26] = obj;
                                                        i26--;
                                                    }
/* 467 */                                           jArr4[jArr4.length - 1] = (jArr4[i19] & j14) | Long.MIN_VALUE;
/* 469 */                                           i26++;
/* 471 */                                           j11 = j14;
/* 473 */                                           i13 = i3;
/* 475 */                                           iArr2 = iArr;
/* 477 */                                           objArr2 = objArr;
                                                }
                                            } else {
/* 288 */                                       i26++;
                                            }
                                        }
/* 481 */                               i2 = i13;
/* 492 */                               this.I0001Ioi1lo = OiO10oio.I00000oIO(this.I0000O) - this.I0000oI00;
                                    }
/* 622 */                           iI0000oI00 = I0000oI00(i6);
                                } else {
/* 505 */                           j3 = 128;
                                }
/* 496 */                       j = 255;
/* 498 */                       j2 = j5;
/* 500 */                       i2 = 1;
/* 510 */                       int iI00000oOI = OiO10oio.I00000oOI(this.I0000O);
/* 514 */                       long[] jArr5 = this.I00000oIO;
/* 516 */                       int[] iArr3 = this.I00000oOI;
/* 518 */                       Object[] objArr3 = this.I0000Il00O;
/* 520 */                       int i34 = this.I0000O;
/* 522 */                       I0001Ioi1lo(iI00000oOI);
/* 525 */                       long[] jArr6 = this.I00000oIO;
/* 527 */                       int[] iArr4 = this.I00000oOI;
/* 529 */                       Object[] objArr4 = this.I0000Il00O;
/* 531 */                       int i35 = this.I0000O;
/* 533 */                       int i36 = i19;
/* 535 */                       while (i36 < i34) {
/* 550 */                           if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
/* 552 */                               int i37 = iArr3[i36];
/* 558 */                               int iHashCode3 = Integer.hashCode(i37) * i18;
/* 562 */                               int i38 = iHashCode3 ^ (iHashCode3 << 16);
/* 565 */                               int iI0000oI003 = I0000oI00(i38 >>> 7);
/* 569 */                               long j16 = i38 & 127;
/* 572 */                               int i39 = iI0000oI003 >> 3;
/* 576 */                               int i40 = (iI0000oI003 & 7) << 3;
/* 580 */                               jArr = jArr6;
/* 582 */                               jArr2 = jArr5;
/* 591 */                               long j17 = (jArr6[i39] & (~(255 << i40))) | (j16 << i40);
/* 592 */                               jArr[i39] = j17;
/* 602 */                               jArr[(((iI0000oI003 - 7) & i35) + (i35 & 7)) >> 3] = j17;
/* 604 */                               iArr4[iI0000oI003] = i37;
/* 608 */                               objArr4[iI0000oI003] = objArr3[i36];
                                    } else {
/* 611 */                               jArr = jArr6;
/* 613 */                               jArr2 = jArr5;
                                    }
/* 615 */                           i36++;
/* 617 */                           jArr5 = jArr2;
/* 619 */                           jArr6 = jArr;
                                }
/* 622 */                       iI0000oI00 = I0000oI00(i6);
                            }
                            this.I0000oI00++;
/* 632 */                   int i41 = this.I0001Ioi1lo;
/* 634 */                   long[] jArr7 = this.I00000oIO;
/* 636 */                   int i42 = iI0000oI00 >> 3;
/* 638 */                   long j18 = jArr7[i42];
/* 642 */                   int i43 = (iI0000oI00 & 7) << 3;
/* 650 */                   if (((j18 >> i43) & j) != j3) {
/* 653 */                       i2 = i19;
                            }
/* 657 */                   this.I0001Ioi1lo = i41 - i2;
/* 659 */                   int i44 = this.I0000O;
/* 667 */                   long j19 = (j18 & (~(j << i43))) | (j2 << i43);
/* 668 */                   jArr7[i42] = j19;
/* 678 */                   jArr7[(((iI0000oI00 - 7) & i44) + (i44 & 7)) >> 3] = j19;
/* 680 */                   return iI0000oI00;
                        }
/* 683 */               i10 = i14 + 8;
/* 686 */               i9 = (i9 + i10) & i8;
/* 687 */               i4 = i18;
                    }
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
/* 71 */            this.I00000oOI = new int[iMax];
/* 75 */            this.I0000Il00O = new Object[iMax];
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
                
                    if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
                
                    r10 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(int i) {
                    int iNumberOfTrailingZeros;
/* 8 */             int iHashCode = Integer.hashCode(i) * (-862048943);
/* 11 */            int i2 = iHashCode ^ (iHashCode << 16);
/* 12 */            int i3 = i2 & 127;
/* 14 */            int i4 = this.I0000O;
/* 18 */            int i5 = (i2 >>> 7) & i4;
/* 19 */            int i6 = 0;
                    loop0: while (true) {
/* 20 */                long[] jArr = this.I00000oIO;
/* 22 */                int i7 = i5 >> 3;
/* 26 */                int i8 = (i5 & 7) << 3;
/* 44 */                long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
/* 52 */                long j2 = (i3 * 72340172838076673L) ^ j;
/* 62 */                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
/* 67 */                    if (j3 == 0) {
                                break;
                            }
/* 76 */                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
/* 81 */                    if (this.I00000oOI[iNumberOfTrailingZeros] == i) {
                                break loop0;
                            }
/* 88 */                    j3 &= j3 - 1;
                        }
/* 109 */               i6 += 8;
/* 112 */               i5 = (i5 + i6) & i4;
                    }
/* 100 */           if (iNumberOfTrailingZeros >= 0) {
/* 102 */               return I000O01llI0(iNumberOfTrailingZeros);
                    }
/* 107 */           return null;
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

                public final void I000OOo1O(int i, Object obj) {
/* 1 */             int iI0000O = I0000O(i);
/* 7 */             this.I00000oOI[iI0000O] = i;
/* 11 */            this.I0000Il00O[iI0000O] = obj;
                }

/* 32 */        public OI0l1oli1I() {
/* 33 */            this(6);
                }
            }
