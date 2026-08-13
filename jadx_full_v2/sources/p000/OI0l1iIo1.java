            package p000;

            import java.util.Arrays;
            
/* 29 */    public final class OI0l1iIo1 {
                public long[] I00000oIO;
                public int[] I00000oOI;
                public int[] I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;

                public OI0l1iIo1(int i) {
/* 6 */             this.I00000oIO = OiO10oio.I00000oIO;
/* 8 */             int[] iArr = IooOIoI.I00000oIO;
/* 10 */            this.I00000oOI = iArr;
/* 12 */            this.I0000Il00O = iArr;
/* 14 */            if (i >= 0) {
/* 20 */                I0000oI00(OiO10oio.I0000O(i));
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
/* 47 */            this.I0001Ioi1lo = OiO10oio.I00000oIO(this.I0000O) - this.I0000oI00;
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

                public final int I0000Il00O(int i) {
/* 8 */             int iHashCode = Integer.hashCode(i) * (-862048943);
/* 11 */            int i2 = iHashCode ^ (iHashCode << 16);
/* 12 */            int i3 = i2 & 127;
/* 14 */            int i4 = this.I0000O;
/* 18 */            int i5 = (i2 >>> 7) & i4;
/* 19 */            int i6 = 0;
                    while (true) {
/* 20 */                long[] jArr = this.I00000oIO;
/* 22 */                int i7 = i5 >> 3;
/* 26 */                int i8 = (i5 & 7) << 3;
/* 44 */                long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
/* 52 */                long j2 = (i3 * 72340172838076673L) ^ j;
/* 67 */                for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
/* 76 */                    int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
/* 81 */                    if (this.I00000oOI[iNumberOfTrailingZeros] == i) {
/* 83 */                        return iNumberOfTrailingZeros;
                            }
                        }
/* 97 */                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
/* 99 */                    return -1;
                        }
/* 101 */               i6 += 8;
/* 104 */               i5 = (i5 + i6) & i4;
                    }
                }

                public final int I0000O(int i) {
/* 1 */             int iI0000Il00O = I0000Il00O(i);
/* 5 */             if (iI0000Il00O >= 0) {
/* 9 */                 return this.I0000Il00O[iI0000Il00O];
                    }
/* 12 */            return -1;
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
/* 71 */            this.I00000oOI = new int[iMax];
/* 75 */            this.I0000Il00O = new int[iMax];
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
                
                    r21 = r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
                
                    if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L59;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
                
                    r2 = I00000oOI(r4);
                    r11 = 255;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
                
                    if (r37.I0001Ioi1lo != 0) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
                
                    if (((r37.I00000oIO[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
                
                    r27 = r9;
                    r25 = 255;
                    r18 = 1;
                    r32 = 0;
                    r19 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
                
                    r2 = r37.I0000O;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
                
                    if (r2 <= 8) goto L42;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
                
                    r19 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
                
                    if (java.lang.Long.compareUnsigned(r37.I0000oI00 * 32, r2 * 25) > 0) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
                
                    r2 = r37.I00000oIO;
                    r3 = r37.I0000O;
                    r5 = r37.I00000oOI;
                    r6 = r37.I0000Il00O;
                    r13 = (r3 + 7) >> 3;
                    r7 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
                
                    if (r7 >= r13) goto L63;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
                
                    r8 = r2[r7] & (-9187201950435737472L);
                    r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
                    r7 = r7 + 1;
                    r11 = r11;
                    r9 = r9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x00ec, code lost:
                
                    r27 = r9;
                    r25 = r11;
                    r12 = 7;
                    r7 = r2.length;
                    r8 = r7 - 1;
                    r7 = r7 - 2;
                    r2[r7] = (r2[r7] & 72057594037927935L) | (-72057594037927936L);
                    r2[r8] = r2[0];
                    r7 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x010a, code lost:
                
                    if (r7 == r3) goto L64;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x010c, code lost:
                
                    r8 = r7 >> 3;
                    r11 = (r7 & 7) << 3;
                    r9 = (r2[r8] >> r11) & r25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0119, code lost:
                
                    if (r9 != 128) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x011b, code lost:
                
                    r7 = r7 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0120, code lost:
                
                    if (r9 == 254) goto L65;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0123, code lost:
                
                    r9 = java.lang.Integer.hashCode(r5[r7]) * r21;
                    r10 = (r9 ^ (r9 << 16)) >>> 7;
                    r13 = I00000oOI(r10);
                    r10 = r10 & r3;
                    r29 = r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0144, code lost:
                
                    if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L66;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x0146, code lost:
                
                    r32 = r15;
                    r2[r8] = ((r9 & 127) << r11) | (r2[r8] & (~(r25 << r11)));
                    r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
                    r7 = r7 + 1;
                    r14 = r14;
                    r12 = r29;
                    r15 = r32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x016b, code lost:
                
                    r18 = r14;
                    r32 = r15;
                    r10 = r13 >> 3;
                    r14 = r2[r10];
                    r12 = (r13 & 7) << 3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x017d, code lost:
                
                    if (((r14 >> r12) & r25) != 128) goto L38;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x017f, code lost:
                
                    r33 = r5;
                    r34 = r6;
                    r2[r10] = ((~(r25 << r12)) & r14) | ((r9 & 127) << r12);
                    r2[r8] = (r2[r8] & (~(r25 << r11))) | (128 << r11);
                    r33[r13] = r33[r7];
                    r33[r7] = r32;
                    r34[r13] = r34[r7];
                    r34[r7] = r32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x01a9, code lost:
                
                    r33 = r5;
                    r34 = r6;
                    r2[r10] = ((r9 & 127) << r12) | ((~(r25 << r12)) & r14);
                    r5 = r33[r13];
                    r33[r13] = r33[r7];
                    r33[r7] = r5;
                    r5 = r34[r13];
                    r34[r13] = r34[r7];
                    r34[r7] = r5;
                    r7 = r7 - 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x01ca, code lost:
                
                    r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
                    r7 = r7 + 1;
                    r14 = r18;
                    r12 = r29;
                    r15 = r32;
                    r5 = r33;
                    r6 = r34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x01e3, code lost:
                
                    r18 = r14;
                    r32 = r15;
                    r37.I0001Ioi1lo = p000.OiO10oio.I00000oIO(r37.I0000O) - r37.I0000oI00;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x01f6, code lost:
                
                    r27 = r9;
                    r25 = 255;
                    r18 = 1;
                    r32 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x0201, code lost:
                
                    r19 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x0204, code lost:
                
                    r2 = p000.OiO10oio.I00000oOI(r37.I0000O);
                    r3 = r37.I00000oIO;
                    r5 = r37.I00000oOI;
                    r6 = r37.I0000Il00O;
                    r7 = r37.I0000O;
                    I0000oI00(r2);
                    r2 = r37.I00000oIO;
                    r8 = r37.I00000oOI;
                    r9 = r37.I0000Il00O;
                    r10 = r37.I0000O;
                    r11 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x021f, code lost:
                
                    if (r11 >= r7) goto L74;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:46:0x022e, code lost:
                
                    if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L48;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x0230, code lost:
                
                    r12 = r5[r11];
                    r13 = java.lang.Integer.hashCode(r12) * r21;
                    r13 = r13 ^ (r13 << 16);
                    r14 = I00000oOI(r13 >>> 7);
                    r15 = r2;
                    r1 = r13 & 127;
                    r13 = r14 >> 3;
                    r16 = (r14 & 7) << 3;
                    r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
                    r15[r13] = r1;
                    r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
                    r8[r14] = r12;
                    r9[r14] = r6[r11];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x026c, code lost:
                
                    r15 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x026d, code lost:
                
                    r11 = r11 + 1;
                    r2 = r15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0273, code lost:
                
                    r2 = I00000oOI(r4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0277, code lost:
                
                    r37.I0000oI00++;
                    r1 = r37.I0001Ioi1lo;
                    r3 = r37.I00000oIO;
                    r4 = r2 >> 3;
                    r5 = r3[r4];
                    r7 = (r2 & 7) << 3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x028f, code lost:
                
                    if (((r5 >> r7) & r25) != r19) goto L54;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x0291, code lost:
                
                    r32 = r18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x0293, code lost:
                
                    r37.I0001Ioi1lo = r1 - r32;
                    r1 = r37.I0000O;
                    r5 = (r5 & (~(r25 << r7))) | (r27 << r7);
                    r3[r4] = r5;
                    r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
                    r13 = ~r2;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0001Ioi1lo(int i, int i2) {
                    int i3;
                    int iNumberOfTrailingZeros;
/* 3 */             int i4 = i;
/* 9 */             int i5 = -862048943;
/* 12 */            int iHashCode = Integer.hashCode(i4) * (-862048943);
/* 15 */            int i6 = iHashCode ^ (iHashCode << 16);
/* 16 */            int i7 = i6 >>> 7;
/* 18 */            int i8 = i6 & 127;
/* 20 */            int i9 = this.I0000O;
/* 22 */            int i10 = i7 & i9;
/* 24 */            int i11 = 0;
                    loop0: while (true) {
/* 25 */                long[] jArr = this.I00000oIO;
/* 27 */                int i12 = i10 >> 3;
/* 31 */                int i13 = (i10 & 7) << 3;
/* 36 */                int i14 = 1;
/* 43 */                int i15 = i11;
/* 45 */                int i16 = 0;
/* 52 */                long j = (((-i13) >> 63) & (jArr[i12 + 1] << (64 - i13))) | (jArr[i12] >>> i13);
                        long j2 = i8;
/* 63 */                long j3 = j ^ (j2 * 72340172838076673L);
/* 75 */                long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
                        while (true) {
/* 81 */                    if (j4 == 0) {
                                break;
                            }
/* 90 */                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i10) & i9;
/* 91 */                    int i17 = i5;
/* 97 */                    if (this.I00000oOI[iNumberOfTrailingZeros] == i4) {
                                break loop0;
                            }
/* 105 */                   j4 &= j4 - 1;
/* 107 */                   i5 = i17;
                        }
/* 702 */               i11 = i15 + 8;
/* 705 */               i10 = (i10 + i11) & i9;
/* 706 */               i4 = i;
/* 708 */               i5 = i3;
                    }
/* 686 */           if (iNumberOfTrailingZeros < 0) {
/* 688 */               iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
                    }
/* 691 */           this.I00000oOI[iNumberOfTrailingZeros] = i;
/* 695 */           this.I0000Il00O[iNumberOfTrailingZeros] = i2;
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
/* 12 */            if (!(obj instanceof OI0l1iIo1)) {
/* 11 */                return false;
                    }
/* 15 */            OI0l1iIo1 oI0l1iIo1 = (OI0l1iIo1) obj;
/* 21 */            if (oI0l1iIo1.I0000oI00 != this.I0000oI00) {
/* 11 */                return false;
                    }
/* 24 */            int[] iArr = this.I00000oOI;
/* 26 */            int[] iArr2 = this.I0000Il00O;
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
/* 76 */                                int i5 = iArr[i4];
/* 78 */                                int i6 = iArr2[i4];
/* 80 */                                int iI0000Il00O = oI0l1iIo1.I0000Il00O(i5);
/* 84 */                                if (iI0000Il00O < 0 || i6 != oI0l1iIo1.I0000Il00O[iI0000Il00O]) {
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
/* 1 */             int[] iArr = this.I00000oOI;
/* 3 */             int[] iArr2 = this.I0000Il00O;
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
/* 55 */                            int i5 = iArr[i4];
/* 68 */                            iHashCode += Integer.hashCode(iArr2[i4]) ^ Integer.hashCode(i5);
                                }
/* 69 */                        j >>= 8;
                            }
/* 73 */                    if (i2 != 8) {
/* 76 */                        return iHashCode;
                            }
                        }
/* 77 */                if (i == length) {
/* 82 */                    return iHashCode;
                        }
/* 79 */                i++;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r8
                  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
/* 5 */             if (this.I0000oI00 == 0) {
/* 7 */                 return "{}";
                    }
/* 14 */            StringBuilder sb = new StringBuilder("{");
/* 17 */            int[] iArr = this.I00000oOI;
/* 19 */            int[] iArr2 = this.I0000Il00O;
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
/* 71 */                                int i6 = iArr[i5];
/* 73 */                                int i7 = iArr2[i5];
/* 75 */                                sb.append(i6);
/* 80 */                                sb.append("=");
/* 83 */                                sb.append(i7);
/* 86 */                                i2++;
/* 90 */                                if (i2 < this.I0000oI00) {
/* 94 */                                    sb.append(", ");
                                        }
                                    }
/* 97 */                            j >>= 8;
                                }
/* 101 */                       if (i3 != 8) {
                                    break;
                                }
/* 103 */                       if (i == length) {
                                    break;
                                }
/* 105 */                       i++;
                            }
                        }
                    }
/* 110 */           sb.append('}');
/* 113 */           return sb.toString();
                }

/* 30 */        public OI0l1iIo1() {
/* 31 */            this(6);
                }
            }
