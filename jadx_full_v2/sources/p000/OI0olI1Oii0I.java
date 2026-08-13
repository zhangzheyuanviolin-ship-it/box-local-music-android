            package p000;

            import java.util.Arrays;
            import java.util.Collection;
            
            public final class OI0olI1Oii0I {
                public long[] I00000oIO = OiO10oio.I00000oIO;
                public Object[] I00000oOI = iIIl1I0OIlO0.I0000Il00O;
                public long[] I0000Il00O = iO0oOllOli.I00000oIO;
                public int I0000O = Integer.MAX_VALUE;
                public int I0000oI00 = Integer.MAX_VALUE;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;

                public OI0olI1Oii0I(int i) {
/* 23 */            if (i >= 0) {
/* 29 */                I0001Ioi1lo(OiO10oio.I0000O(i));
                    } else {
/* 35 */                lO00l0o.I00000oIO("Capacity must be a positive value.");
/* 77 */                throw null;
                    }
                }

                public final boolean I00000oIO(Object obj) {
/* 1 */             int i = this.I000II;
/* 3 */             int iI0000O = I0000O(obj);
/* 9 */             this.I00000oOI[iI0000O] = obj;
/* 11 */            long[] jArr = this.I0000Il00O;
/* 13 */            int i2 = this.I0000O;
/* 26 */            jArr[iI0000O] = (i2 & 2147483647L) | 4611686016279904256L;
/* 31 */            if (i2 != Integer.MAX_VALUE) {
/* 48 */                jArr[i2] = ((iI0000O & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
                    }
/* 50 */            this.I0000O = iI0000O;
/* 54 */            if (this.I0000oI00 == Integer.MAX_VALUE) {
/* 56 */                this.I0000oI00 = iI0000O;
                    }
                    return this.I000II != i;
                }

                public final void I00000oOI() {
/* 2 */             this.I000II = 0;
/* 4 */             long[] jArr = this.I00000oIO;
/* 8 */             if (jArr != OiO10oio.I00000oIO) {
/* 15 */                I1IoiO1l.I0010o(-9187201950435737472L, jArr);
/* 18 */                long[] jArr2 = this.I00000oIO;
/* 20 */                int i = this.I0001Ioi1lo;
/* 22 */                int i2 = i >> 3;
/* 32 */                long j = 255 << ((i & 7) << 3);
/* 36 */                jArr2[i2] = (jArr2[i2] & (~j)) | j;
                    }
/* 43 */            Arrays.fill(this.I00000oOI, 0, this.I0001Ioi1lo, (Object) null);
/* 53 */            I1IoiO1l.I0010o(4611686018427387903L, this.I0000Il00O);
/* 59 */            this.I0000O = Integer.MAX_VALUE;
/* 61 */            this.I0000oI00 = Integer.MAX_VALUE;
/* 72 */            this.I000O01llI0 = OiO10oio.I00000oIO(this.I0001Ioi1lo) - this.I000II;
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
/* 23 */            int i3 = this.I0001Ioi1lo;
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
                    int i;
                    long j;
                    long j2;
                    long j3;
                    char c;
                    long[] jArr;
                    long[] jArr2;
                    long j4;
/* 14 */            int i2 = -862048943;
/* 17 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
/* 20 */            int i3 = iHashCode ^ (iHashCode << 16);
/* 21 */            int i4 = i3 >>> 7;
/* 23 */            int i5 = i3 & 127;
/* 25 */            int i6 = this.I0001Ioi1lo;
/* 27 */            int i7 = i4 & i6;
/* 29 */            int i8 = 0;
                    while (true) {
/* 30 */                long[] jArr3 = this.I00000oIO;
/* 32 */                int i9 = i7 >> 3;
/* 36 */                int i10 = (i7 & 7) << 3;
/* 56 */                long j5 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
                        long j6 = i5;
/* 67 */                long j7 = j5 ^ (j6 * 72340172838076673L);
/* 79 */                long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
/* 85 */                while (j8 != 0) {
/* 94 */                    int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
/* 95 */                    int i11 = i2;
/* 105 */                   if (O0000Ioio00.I0000O(this.I00000oOI[iNumberOfTrailingZeros], obj)) {
/* 107 */                       return iNumberOfTrailingZeros;
                            }
/* 112 */                   j8 &= j8 - 1;
/* 114 */                   i2 = i11;
                        }
/* 117 */               int i12 = i2;
/* 129 */               if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
/* 131 */                   int iI0000oI00 = I0000oI00(i4);
/* 137 */                   long j9 = 255;
/* 139 */                   if (this.I000O01llI0 != 0 || ((this.I00000oIO[iI0000oI00 >> 3] >> ((iI0000oI00 & 7) << 3)) & 255) == 254) {
/* 161 */                       i = 0;
/* 163 */                       j = j6;
/* 165 */                       j2 = 255;
/* 169 */                       j3 = 128;
                            } else {
/* 173 */                       int i13 = this.I0001Ioi1lo;
/* 180 */                       if (i13 > 8) {
/* 186 */                           c = 31;
/* 193 */                           j3 = 128;
/* 204 */                           if (Long.compareUnsigned(this.I000II * 32, i13 * 25) <= 0) {
/* 206 */                               long[] jArr4 = this.I00000oIO;
/* 208 */                               if (jArr4 == null) {
/* 210 */                                   i = 0;
/* 212 */                                   j = j6;
/* 214 */                                   j2 = 255;
                                        } else {
/* 218 */                                   int i14 = this.I0001Ioi1lo;
/* 220 */                                   Object[] objArr = this.I00000oOI;
/* 222 */                                   long[] jArr5 = this.I0000Il00O;
/* 224 */                                   long[] jArr6 = new long[i14];
/* 233 */                                   Arrays.fill(jArr6, 0, i14, 9223372034707292159L);
/* 238 */                                   i = 0;
/* 240 */                                   int i15 = (i14 + 7) >> 3;
/* 244 */                                   int i16 = 0;
/* 246 */                                   while (i16 < i15) {
/* 250 */                                       long j10 = j9;
/* 252 */                                       long j11 = jArr4[i16] & (-9187201950435737472L);
/* 254 */                                       int i17 = i16;
/* 266 */                                       jArr4[i17] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
/* 268 */                                       i16 = i17 + 1;
/* 270 */                                       j9 = j10;
                                            }
/* 273 */                                   j2 = j9;
/* 275 */                                   int length = jArr4.length;
                                            int i18 = length - 1;
                                            int i19 = length - 2;
/* 293 */                                   jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
/* 297 */                                   jArr4[i18] = jArr4[0];
/* 299 */                                   int i20 = 0;
/* 301 */                                   while (i20 != i14) {
/* 303 */                                       int i21 = i20 >> 3;
/* 309 */                                       int i22 = (i20 & 7) << 3;
/* 313 */                                       long j12 = (jArr4[i21] >> i22) & j2;
/* 317 */                                       if (j12 != 128 && j12 == 254) {
/* 327 */                                           Object obj2 = objArr[i20];
/* 338 */                                           int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
/* 349 */                                           int i23 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
/* 351 */                                           int iI0000oI002 = I0000oI00(i23);
/* 355 */                                           int i24 = i23 & i14;
/* 369 */                                           if (((iI0000oI002 - i24) & i14) / 8 == ((i20 - i24) & i14) / 8) {
/* 376 */                                               int i25 = i14;
/* 378 */                                               Object[] objArr2 = objArr;
/* 387 */                                               jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | ((r17 & 127) << i22);
/* 393 */                                               if (jArr6[i20] == 9223372034707292159L) {
                                                            long j13 = i20;
/* 399 */                                                   jArr6[i20] = j13 | (j13 << 32);
                                                        }
/* 406 */                                               jArr4[jArr4.length - 1] = jArr4[0];
/* 408 */                                               i20++;
/* 410 */                                               i14 = i25;
/* 412 */                                               objArr = objArr2;
                                                    } else {
/* 415 */                                               int i26 = i14;
/* 417 */                                               Object[] objArr3 = objArr;
/* 419 */                                               int i27 = iI0000oI002 >> 3;
/* 421 */                                               long j14 = jArr4[i27];
/* 425 */                                               int i28 = (iI0000oI002 & 7) << 3;
/* 438 */                                               if (((j14 >> i28) & j2) == 128) {
/* 458 */                                                   jArr4[i27] = (j14 & (~(j2 << i28))) | ((r17 & 127) << i28);
/* 473 */                                                   jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (128 << i22);
/* 477 */                                                   objArr3[iI0000oI002] = objArr3[i20];
/* 480 */                                                   objArr3[i20] = null;
/* 484 */                                                   jArr5[iI0000oI002] = jArr5[i20];
/* 491 */                                                   jArr5[i20] = 4611686018427387903L;
/* 499 */                                                   int i29 = (int) ((jArr6[i20] >> 32) & 4294967295L);
/* 503 */                                                   if (i29 != Integer.MAX_VALUE) {
/* 509 */                                                       j4 = j6;
/* 513 */                                                       jArr6[i29] = iI0000oI002 | (jArr6[i29] & (-4294967296L));
/* 521 */                                                       jArr6[i20] = (jArr6[i20] & 4294967295L) | (-4294967296L);
                                                            } else {
/* 524 */                                                       j4 = j6;
/* 533 */                                                       jArr6[i20] = 9223372032559808512L | iI0000oI002;
                                                            }
/* 540 */                                                   jArr6[iI0000oI002] = (i20 << 32) | 2147483647L;
                                                        } else {
/* 547 */                                                   j4 = j6;
/* 560 */                                                   jArr4[i27] = ((r17 & 127) << i28) | (j14 & (~(j2 << i28)));
/* 562 */                                                   Object obj3 = objArr3[iI0000oI002];
/* 566 */                                                   objArr3[iI0000oI002] = objArr3[i20];
/* 568 */                                                   objArr3[i20] = obj3;
/* 570 */                                                   long j15 = jArr5[iI0000oI002];
/* 574 */                                                   jArr5[iI0000oI002] = jArr5[i20];
/* 576 */                                                   jArr5[i20] = j15;
/* 584 */                                                   int i30 = (int) ((jArr6[i20] >> 32) & 4294967295L);
/* 588 */                                                   if (i30 != Integer.MAX_VALUE) {
                                                                long j16 = iI0000oI002;
/* 596 */                                                       jArr6[i30] = (jArr6[i30] & (-4294967296L)) | j16;
/* 605 */                                                       jArr6[i20] = (jArr6[i20] & 4294967295L) | (j16 << 32);
                                                            } else {
                                                                long j17 = iI0000oI002;
/* 612 */                                                       jArr6[i20] = j17 | (j17 << 32);
/* 614 */                                                       i30 = i20;
                                                            }
/* 620 */                                                   jArr6[iI0000oI002] = (i30 << 32) | i20;
                                                            i20--;
                                                        }
/* 629 */                                               jArr4[jArr4.length - 1] = jArr4[0];
/* 631 */                                               i20++;
/* 633 */                                               i14 = i26;
/* 635 */                                               objArr = objArr3;
/* 637 */                                               j6 = j4;
                                                    }
                                                } else {
/* 319 */                                           i20++;
                                                }
                                            }
/* 641 */                                   j = j6;
/* 657 */                                   this.I000O01llI0 = OiO10oio.I00000oIO(this.I0001Ioi1lo) - this.I000II;
/* 659 */                                   long[] jArr7 = this.I0000Il00O;
/* 661 */                                   int length2 = jArr7.length;
/* 664 */                                   for (int i31 = 0; i31 < length2; i31++) {
/* 666 */                                       long j18 = jArr7[i31];
/* 706 */                                       jArr7[i31] = (((j18 & (-4611686018427387904L)) | (((int) ((j18 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j18 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & 4294967295L));
                                            }
/* 711 */                                   int i32 = this.I0000O;
/* 716 */                                   if (i32 != Integer.MAX_VALUE) {
/* 723 */                                       this.I0000O = (int) (jArr6[i32] & 4294967295L);
                                            }
/* 725 */                                   int i33 = this.I0000oI00;
/* 727 */                                   if (i33 != Integer.MAX_VALUE) {
/* 734 */                                       this.I0000oI00 = (int) (jArr6[i33] & 4294967295L);
                                            }
                                        }
                                    }
/* 948 */                           iI0000oI00 = I0000oI00(i4);
                                } else {
/* 747 */                           c = 31;
/* 749 */                           j3 = 128;
                                }
/* 738 */                       i = 0;
/* 740 */                       j = j6;
/* 742 */                       j2 = 255;
/* 754 */                       int iI00000oOI = OiO10oio.I00000oOI(this.I0001Ioi1lo);
/* 758 */                       long[] jArr8 = this.I00000oIO;
/* 760 */                       Object[] objArr4 = this.I00000oOI;
/* 762 */                       long[] jArr9 = this.I0000Il00O;
/* 764 */                       int i34 = this.I0001Ioi1lo;
/* 766 */                       int[] iArr = new int[i34];
/* 768 */                       I0001Ioi1lo(iI00000oOI);
/* 771 */                       long[] jArr10 = this.I00000oIO;
/* 773 */                       Object[] objArr5 = this.I00000oOI;
/* 775 */                       long[] jArr11 = this.I0000Il00O;
/* 777 */                       int i35 = this.I0001Ioi1lo;
/* 779 */                       int i36 = 0;
/* 781 */                       while (i36 < i34) {
/* 797 */                           if (((jArr8[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
/* 799 */                               Object obj4 = objArr4[i36];
/* 810 */                               int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
/* 814 */                               int i37 = iHashCode3 ^ (iHashCode3 << 16);
/* 818 */                               int iI0000oI003 = I0000oI00(i37 >>> 7);
/* 824 */                               jArr = jArr10;
/* 826 */                               jArr2 = jArr8;
/* 822 */                               long j19 = i37 & 127;
/* 829 */                               int i38 = iI0000oI003 >> 3;
/* 833 */                               int i39 = (iI0000oI003 & 7) << 3;
/* 846 */                               long j20 = (jArr[i38] & (~(255 << i39))) | (j19 << i39);
/* 848 */                               jArr[i38] = j20;
/* 859 */                               jArr[(((iI0000oI003 - 7) & i35) + (i35 & 7)) >> 3] = j20;
/* 861 */                               objArr5[iI0000oI003] = obj4;
/* 865 */                               jArr11[iI0000oI003] = jArr9[i36];
/* 867 */                               iArr[i36] = iI0000oI003;
                                    } else {
/* 870 */                               jArr = jArr10;
/* 872 */                               jArr2 = jArr8;
                                    }
/* 874 */                           i36++;
/* 876 */                           jArr8 = jArr2;
/* 878 */                           jArr10 = jArr;
                                }
/* 881 */                       long[] jArr12 = this.I0000Il00O;
/* 883 */                       int length3 = jArr12.length;
/* 886 */                       for (int i40 = 0; i40 < length3; i40++) {
/* 888 */                           long j21 = jArr12[i40];
/* 924 */                           jArr12[i40] = (((j21 & (-4611686018427387904L)) | (((int) ((j21 >> c) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c) | (((int) (j21 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                                }
/* 932 */                       int i41 = this.I0000O;
/* 934 */                       if (i41 != Integer.MAX_VALUE) {
/* 938 */                           this.I0000O = iArr[i41];
                                }
/* 940 */                       int i42 = this.I0000oI00;
/* 942 */                       if (i42 != Integer.MAX_VALUE) {
/* 946 */                           this.I0000oI00 = iArr[i42];
                                }
/* 948 */                       iI0000oI00 = I0000oI00(i4);
                            }
                            this.I000II++;
/* 958 */                   int i43 = this.I000O01llI0;
/* 960 */                   long[] jArr13 = this.I00000oIO;
/* 962 */                   int i44 = iI0000oI00 >> 3;
/* 964 */                   long j22 = jArr13[i44];
/* 968 */                   int i45 = (iI0000oI00 & 7) << 3;
/* 976 */                   if (((j22 >> i45) & j2) == j3) {
/* 978 */                       i = 1;
                            }
/* 982 */                   this.I000O01llI0 = i43 - i;
/* 984 */                   int i46 = this.I0001Ioi1lo;
/* 992 */                   long j23 = (j22 & (~(j2 << i45))) | (j << i45);
/* 993 */                   jArr13[i44] = j23;
/* 1003 */                  jArr13[(((iI0000oI00 - 7) & i46) + (i46 & 7)) >> 3] = j23;
/* 1005 */                  return iI0000oI00;
                        }
/* 1010 */              i8 += 8;
/* 1013 */              i7 = (i7 + i8) & i6;
/* 1014 */              i2 = i12;
                    }
                }

                public final int I0000oI00(int i) {
/* 1 */             int i2 = this.I0001Ioi1lo;
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
                    long[] jArr2;
/* 14 */            int iMax = i > 0 ? Math.max(7, OiO10oio.I0000Il00O(i)) : 0;
/* 15 */            this.I0001Ioi1lo = iMax;
/* 17 */            if (iMax == 0) {
/* 19 */                jArr = OiO10oio.I00000oIO;
                    } else {
/* 26 */                int i2 = ((iMax + 15) & (-8)) >> 3;
/* 28 */                long[] jArr3 = new long[i2];
/* 35 */                Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
/* 38 */                jArr = jArr3;
                    }
/* 39 */            this.I00000oIO = jArr;
/* 41 */            int i3 = iMax >> 3;
/* 51 */            long j = 255 << ((iMax & 7) << 3);
/* 56 */            jArr[i3] = (jArr[i3] & (~j)) | j;
/* 67 */            this.I000O01llI0 = OiO10oio.I00000oIO(this.I0001Ioi1lo) - this.I000II;
/* 76 */            this.I00000oOI = iMax == 0 ? iIIl1I0OIlO0.I0000Il00O : new Object[iMax];
/* 78 */            if (iMax == 0) {
/* 80 */                jArr2 = iO0oOllOli.I00000oIO;
                    } else {
/* 83 */                long[] jArr4 = new long[iMax];
/* 90 */                Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
/* 93 */                jArr2 = jArr4;
                    }
/* 94 */            this.I0000Il00O = jArr2;
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
                public final boolean I000II(Object obj) {
                    int iNumberOfTrailingZeros;
/* 17 */            int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
/* 20 */            int i = iHashCode ^ (iHashCode << 16);
/* 21 */            int i2 = i & 127;
/* 23 */            int i3 = this.I0001Ioi1lo;
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
/* 118 */               I000O01llI0(iNumberOfTrailingZeros);
                    }
/* 121 */           return z;
                }

                public final void I000O01llI0(int i) {
                    this.I000II--;
/* 7 */             long[] jArr = this.I00000oIO;
/* 9 */             int i2 = this.I0001Ioi1lo;
/* 11 */            int i3 = i >> 3;
/* 15 */            int i4 = (i & 7) << 3;
/* 27 */            long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
/* 29 */            jArr[i3] = j;
/* 39 */            jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
/* 44 */            this.I00000oOI[i] = null;
/* 46 */            long[] jArr2 = this.I0000Il00O;
/* 48 */            long j2 = jArr2[i];
/* 58 */            int i5 = (int) ((j2 >> 31) & 2147483647L);
/* 60 */            int i6 = (int) (j2 & 2147483647L);
/* 64 */            if (i5 != Integer.MAX_VALUE) {
/* 75 */                jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (i6 & 2147483647L);
                    } else {
/* 78 */                this.I0000O = i6;
                    }
/* 80 */            if (i6 != Integer.MAX_VALUE) {
/* 95 */                jArr2[i6] = ((i5 & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
                    } else {
/* 98 */                this.I0000oI00 = i5;
                    }
/* 105 */           jArr2[i] = 4611686018427387903L;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000OOo1O(Collection collection) {
/* 3 */             Object[] objArr = this.I00000oOI;
/* 5 */             int i = this.I000II;
/* 7 */             long[] jArr = this.I00000oIO;
                    int length = jArr.length - 2;
/* 13 */            if (length >= 0) {
/* 15 */                int i2 = 0;
                        while (true) {
/* 16 */                    long j = jArr[i2];
/* 30 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 39 */                        int i3 = 8 - ((~(i2 - length)) >>> 31);
/* 42 */                        for (int i4 = 0; i4 < i3; i4++) {
/* 51 */                            if ((255 & j) < 128) {
/* 55 */                                int i5 = (i2 << 3) + i4;
/* 66 */                                if (!IOOi0Ool1i.I001i1O0Ol(collection, objArr[i5])) {
/* 68 */                                    I000O01llI0(i5);
                                        }
                                    }
/* 71 */                            j >>= 8;
                                }
/* 75 */                        if (i3 != 8) {
                                    break;
                                }
/* 77 */                        if (i2 == length) {
                                    break;
                                }
/* 79 */                        i2++;
                            }
                        }
                    }
                    return i != this.I000II;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OI0olI1Oii0I)) {
/* 7 */                 return false;
                    }
/* 11 */            OI0olI1Oii0I oI0olI1Oii0I = (OI0olI1Oii0I) obj;
/* 17 */            if (oI0olI1Oii0I.I000II != this.I000II) {
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
/* 65 */                            if ((255 & j) < 128 && !oI0olI1Oii0I.I0000Il00O(objArr[(i << 3) + i3])) {
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
/* 7 */             int iHashCode = (this.I0001Ioi1lo * 31) + this.I000II;
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

                public final String toString() {
/* 4 */             I10iOo0il1 i10iOo0il1 = new I10iOo0il1(this, 7);
/* 11 */            StringBuilder sb = new StringBuilder("[");
/* 14 */            Object[] objArr = this.I00000oOI;
/* 16 */            long[] jArr = this.I0000Il00O;
/* 18 */            int i = this.I0000oI00;
/* 20 */            int i2 = 0;
                    while (true) {
/* 24 */                if (i == Integer.MAX_VALUE) {
/* 69 */                    sb.append((CharSequence) "]");
                            break;
                        }
/* 35 */                int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
/* 36 */                Object obj = objArr[i];
/* 39 */                if (i2 == -1) {
/* 43 */                    sb.append((CharSequence) "...");
                            break;
                        }
/* 47 */                if (i2 != 0) {
/* 51 */                    sb.append((CharSequence) ", ");
                        }
/* 60 */                sb.append((CharSequence) i10iOo0il1.invoke(obj));
/* 63 */                i2++;
/* 65 */                i = i3;
                    }
/* 72 */            return sb.toString();
                }
            }
