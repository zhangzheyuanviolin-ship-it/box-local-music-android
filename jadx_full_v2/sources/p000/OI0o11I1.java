            package p000;

            import java.util.Arrays;
            
/* 31 */    public final class OI0o11I1 {
                public long[] I00000oIO;
                public Object[] I00000oOI;
                public int[] I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;

                public OI0o11I1(int i) {
/* 6 */             this.I00000oIO = OiO10oio.I00000oIO;
/* 10 */            this.I00000oOI = iIIl1I0OIlO0.I0000Il00O;
/* 14 */            this.I0000Il00O = IooOIoI.I00000oIO;
/* 16 */            if (i >= 0) {
/* 22 */                I0000oI00(OiO10oio.I0000O(i));
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
/* 43 */            Arrays.fill(this.I00000oOI, 0, this.I0000O, (Object) null);
/* 55 */            this.I0001Ioi1lo = OiO10oio.I00000oIO(this.I0000O) - this.I0000oI00;
                }

                public final int I00000oOI(int i) {
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

                public final int I0000Il00O(Object obj) {
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
/* 130 */                   int iI00000oOI = I00000oOI(i4);
/* 136 */                   long j8 = 255;
/* 138 */                   if (this.I0001Ioi1lo != 0 || ((this.I00000oIO[iI00000oOI >> 3] >> ((iI00000oOI & 7) << 3)) & 255) == 254) {
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
/* 201 */                               int[] iArr = this.I0000Il00O;
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
/* 253 */                               long j11 = 72057594037927935L;
/* 262 */                               jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
/* 266 */                               jArr4[i20] = jArr4[0];
/* 268 */                               int i22 = 0;
/* 269 */                               while (i22 != i16) {
/* 271 */                                   int i23 = i22 >> 3;
/* 277 */                                   int i24 = (i22 & 7) << 3;
/* 280 */                                   long j12 = (jArr4[i23] >> i24) & j;
/* 284 */                                   if (j12 != 128 && j12 == 254) {
/* 294 */                                       Object obj2 = objArr2[i22];
/* 304 */                                       int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
/* 309 */                                       int i25 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
/* 311 */                                       int iI00000oOI2 = I00000oOI(i25);
/* 315 */                                       int i26 = i25 & i16;
/* 320 */                                       long j13 = j11;
/* 330 */                                       if (((iI00000oOI2 - i26) & i16) / 8 == ((i22 - i26) & i16) / i19) {
/* 348 */                                           jArr4[i23] = ((r8 & 127) << i24) | (jArr4[i23] & (~(j << i24)));
/* 359 */                                           jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
/* 361 */                                           i22++;
/* 363 */                                           i19 = i19;
/* 365 */                                           j11 = j13;
                                                } else {
/* 368 */                                           int i27 = i19;
/* 372 */                                           int i28 = iI00000oOI2 >> 3;
/* 374 */                                           long j14 = jArr4[i28];
/* 378 */                                           int i29 = (iI00000oOI2 & 7) << 3;
/* 386 */                                           if (((j14 >> i29) & j) == 128) {
/* 390 */                                               i = i16;
/* 391 */                                               objArr = objArr2;
/* 403 */                                               jArr4[i28] = ((~(j << i29)) & j14) | ((r8 & 127) << i29);
/* 414 */                                               jArr4[i23] = (jArr4[i23] & (~(j << i24))) | (128 << i24);
/* 418 */                                               objArr[iI00000oOI2] = objArr[i22];
/* 421 */                                               objArr[i22] = null;
/* 425 */                                               iArr[iI00000oOI2] = iArr[i22];
/* 427 */                                               iArr[i22] = 0;
                                                    } else {
/* 430 */                                               i = i16;
/* 431 */                                               objArr = objArr2;
/* 442 */                                               jArr4[i28] = ((r8 & 127) << i29) | ((~(j << i29)) & j14);
/* 444 */                                               Object obj3 = objArr[iI00000oOI2];
/* 448 */                                               objArr[iI00000oOI2] = objArr[i22];
/* 450 */                                               objArr[i22] = obj3;
/* 452 */                                               int i30 = iArr[iI00000oOI2];
/* 456 */                                               iArr[iI00000oOI2] = iArr[i22];
/* 458 */                                               iArr[i22] = i30;
                                                        i22--;
                                                    }
/* 471 */                                           jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
/* 473 */                                           i22++;
/* 475 */                                           i16 = i;
/* 476 */                                           i19 = i27;
/* 478 */                                           j11 = j13;
/* 480 */                                           objArr2 = objArr;
                                                }
                                            } else {
/* 286 */                                       i22++;
                                            }
                                        }
/* 493 */                               this.I0001Ioi1lo = OiO10oio.I00000oIO(this.I0000O) - this.I0000oI00;
                                    }
/* 625 */                           iI00000oOI = I00000oOI(i4);
                                }
/* 497 */                       j = 255;
/* 499 */                       j2 = j5;
/* 501 */                       j3 = 128;
/* 509 */                       int iI00000oOI3 = OiO10oio.I00000oOI(this.I0000O);
/* 513 */                       long[] jArr5 = this.I00000oIO;
/* 515 */                       Object[] objArr3 = this.I00000oOI;
/* 517 */                       int[] iArr2 = this.I0000Il00O;
/* 519 */                       int i31 = this.I0000O;
/* 521 */                       I0000oI00(iI00000oOI3);
/* 524 */                       long[] jArr6 = this.I00000oIO;
/* 526 */                       Object[] objArr4 = this.I00000oOI;
/* 528 */                       int[] iArr3 = this.I0000Il00O;
/* 530 */                       int i32 = this.I0000O;
/* 532 */                       int i33 = 0;
/* 533 */                       while (i33 < i31) {
/* 548 */                           if (((jArr5[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < 128) {
/* 550 */                               Object obj4 = objArr3[i33];
/* 560 */                               int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
/* 564 */                               int i34 = iHashCode3 ^ (iHashCode3 << 16);
/* 567 */                               int iI00000oOI4 = I00000oOI(i34 >>> 7);
/* 573 */                               jArr = jArr6;
/* 575 */                               jArr2 = jArr5;
/* 571 */                               long j15 = i34 & 127;
/* 577 */                               int i35 = iI00000oOI4 >> 3;
/* 581 */                               int i36 = (iI00000oOI4 & 7) << 3;
/* 594 */                               long j16 = (jArr[i35] & (~(255 << i36))) | (j15 << i36);
/* 596 */                               jArr[i35] = j16;
/* 607 */                               jArr[(((iI00000oOI4 - 7) & i32) + (i32 & 7)) >> 3] = j16;
/* 609 */                               objArr4[iI00000oOI4] = obj4;
/* 613 */                               iArr3[iI00000oOI4] = iArr2[i33];
                                    } else {
/* 616 */                               jArr = jArr6;
/* 618 */                               jArr2 = jArr5;
                                    }
/* 619 */                           i33++;
/* 621 */                           jArr5 = jArr2;
/* 622 */                           jArr6 = jArr;
                                }
/* 625 */                       iI00000oOI = I00000oOI(i4);
                            }
                            this.I0000oI00++;
/* 635 */                   int i37 = this.I0001Ioi1lo;
/* 637 */                   long[] jArr7 = this.I00000oIO;
/* 639 */                   int i38 = iI00000oOI >> 3;
/* 641 */                   long j17 = jArr7[i38];
/* 645 */                   int i39 = (iI00000oOI & 7) << 3;
/* 658 */                   this.I0001Ioi1lo = i37 - (((j17 >> i39) & j) == j3 ? 1 : 0);
/* 660 */                   int i40 = this.I0000O;
/* 668 */                   long j18 = (j17 & (~(j << i39))) | (j2 << i39);
/* 669 */                   jArr7[i38] = j18;
/* 679 */                   jArr7[(((iI00000oOI - 7) & i40) + (i40 & 7)) >> 3] = j18;
/* 681 */                   return ~iI00000oOI;
                        }
/* 685 */               i8 += 8;
/* 688 */               i7 = (i7 + i8) & i6;
/* 689 */               i5 = i11;
/* 691 */               i2 = i13;
                    }
                }

                public final int I0000O(Object obj) {
/* 1 */             int i = 0;
/* 13 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
/* 16 */            int i2 = iHashCode ^ (iHashCode << 16);
/* 17 */            int i3 = i2 & 127;
/* 19 */            int i4 = this.I0000O;
/* 21 */            int i5 = i2 >>> 7;
                    while (true) {
/* 23 */                int i6 = i5 & i4;
/* 24 */                long[] jArr = this.I00000oIO;
/* 26 */                int i7 = i6 >> 3;
/* 30 */                int i8 = (i6 & 7) << 3;
/* 48 */                long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
/* 56 */                long j2 = (i3 * 72340172838076673L) ^ j;
/* 71 */                for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
/* 80 */                    int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
/* 89 */                    if (O0000Ioio00.I0000O(this.I00000oOI[iNumberOfTrailingZeros], obj)) {
/* 91 */                        return iNumberOfTrailingZeros;
                            }
                        }
/* 105 */               if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
/* 107 */                   return -1;
                        }
/* 109 */               i += 8;
/* 111 */               i5 = i6 + i;
                    }
                }

                public final void I0000oI00(int i) {
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
/* 71 */            this.I00000oOI = new Object[iMax];
/* 75 */            this.I0000Il00O = new int[iMax];
                }

                public final void I0001Ioi1lo(int i) {
                    this.I0000oI00--;
/* 7 */             long[] jArr = this.I00000oIO;
/* 9 */             int i2 = this.I0000O;
/* 11 */            int i3 = i >> 3;
/* 15 */            int i4 = (i & 7) << 3;
/* 27 */            long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
/* 29 */            jArr[i3] = j;
/* 39 */            jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
/* 44 */            this.I00000oOI[i] = null;
                }

                public final void I000II(int i, Object obj) {
/* 1 */             int iI0000Il00O = I0000Il00O(obj);
/* 5 */             if (iI0000Il00O < 0) {
/* 7 */                 iI0000Il00O = ~iI0000Il00O;
                    }
/* 10 */            this.I00000oOI[iI0000Il00O] = obj;
/* 14 */            this.I0000Il00O[iI0000Il00O] = i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
                
                    return false;
                 */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
/* 6 */             if (obj == this) {
/* 5 */                 return true;
                    }
/* 12 */            if (!(obj instanceof OI0o11I1)) {
/* 11 */                return false;
                    }
/* 15 */            OI0o11I1 oI0o11I1 = (OI0o11I1) obj;
/* 21 */            if (oI0o11I1.I0000oI00 != this.I0000oI00) {
/* 11 */                return false;
                    }
/* 24 */            Object[] objArr = this.I00000oOI;
/* 26 */            int[] iArr = this.I0000Il00O;
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
/* 78 */                                int i5 = iArr[i4];
/* 80 */                                int iI0000O = oI0o11I1.I0000O(obj2);
/* 84 */                                if (iI0000O < 0 || i5 != oI0o11I1.I0000Il00O[iI0000O]) {
                                            break loop0;
                                        }
                                    }
/* 93 */                            j >>= 8;
                                }
/* 97 */                        if (i2 != 8) {
                                    break;
                                }
/* 99 */                        if (i == length) {
                                    break;
                                }
/* 101 */                       i++;
                            }
                        }
                    }
/* 5 */             return true;
                }

                public final int hashCode() {
/* 1 */             Object[] objArr = this.I00000oOI;
/* 3 */             int[] iArr = this.I0000Il00O;
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
/* 72 */                            iHashCode += Integer.hashCode(iArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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

                /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
                  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
/* 5 */             if (this.I0000oI00 == 0) {
/* 7 */                 return "{}";
                    }
/* 14 */            StringBuilder sb = new StringBuilder("{");
/* 17 */            Object[] objArr = this.I00000oOI;
/* 19 */            int[] iArr = this.I0000Il00O;
/* 21 */            long[] jArr = this.I00000oIO;
                    int length = jArr.length - 2;
/* 26 */            if (length >= 0) {
/* 29 */                int i = 0;
/* 30 */                int i2 = 0;
                        while (true) {
/* 31 */                    long j = jArr[i];
/* 45 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 54 */                        int i3 = 8 - ((~(i - length)) >>> 31);
/* 57 */                        for (int i4 = 0; i4 < i3; i4++) {
/* 66 */                            if ((255 & j) < 128) {
/* 70 */                                int i5 = (i << 3) + i4;
/* 71 */                                Object obj = objArr[i5];
/* 73 */                                int i6 = iArr[i5];
/* 75 */                                if (obj == this) {
/* 77 */                                    obj = "(this)";
                                        }
/* 79 */                                sb.append(obj);
/* 84 */                                sb.append("=");
/* 87 */                                sb.append(i6);
/* 90 */                                i2++;
/* 94 */                                if (i2 < this.I0000oI00) {
/* 98 */                                    sb.append(", ");
                                        }
                                    }
/* 101 */                           j >>= 8;
                                }
/* 105 */                       if (i3 != 8) {
                                    break;
                                }
/* 107 */                       if (i == length) {
                                    break;
                                }
/* 109 */                       i++;
                            }
                        }
                    }
/* 114 */           sb.append('}');
/* 117 */           return sb.toString();
                }

/* 32 */        public OI0o11I1() {
/* 33 */            this(6);
                }
            }
