            package p000;

            import java.util.Arrays;
            
            public final class OI0ll0OIiO {
                public long[] I00000oIO = OiO10oio.I00000oIO;
                public long[] I00000oOI = O1IOii.I00000oIO;
                public int[] I0000Il00O = IooOIoI.I00000oIO;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;

                public OI0ll0OIiO(int i) {
/* 16 */            if (i >= 0) {
/* 22 */                I0000O(OiO10oio.I0000O(i));
                    } else {
/* 28 */                lO00l0o.I00000oIO("Capacity must be a positive value.");
/* 77 */                throw null;
                    }
                }

                public final int I00000oIO(int i) {
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

                public final int I00000oOI(long j) {
/* 8 */             int iHashCode = Long.hashCode(j) * (-862048943);
/* 11 */            int i = iHashCode ^ (iHashCode << 16);
/* 12 */            int i2 = i & 127;
/* 14 */            int i3 = this.I0000O;
/* 18 */            int i4 = (i >>> 7) & i3;
/* 19 */            int i5 = 0;
                    while (true) {
/* 20 */                long[] jArr = this.I00000oIO;
/* 22 */                int i6 = i4 >> 3;
/* 26 */                int i7 = (i4 & 7) << 3;
/* 44 */                long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
/* 52 */                long j3 = (i2 * 72340172838076673L) ^ j2;
/* 67 */                for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
/* 76 */                    int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
/* 83 */                    if (this.I00000oOI[iNumberOfTrailingZeros] == j) {
/* 85 */                        return iNumberOfTrailingZeros;
                            }
                        }
/* 99 */                if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
/* 101 */                   return -1;
                        }
/* 103 */               i5 += 8;
/* 106 */               i4 = (i4 + i5) & i3;
                    }
                }

                public final int I0000Il00O(long j) {
/* 1 */             int iI00000oOI = I00000oOI(j);
/* 5 */             if (iI00000oOI >= 0) {
/* 9 */                 return this.I0000Il00O[iI00000oOI];
                    }
/* 26 */            lO00l0o.I0000Il00O("Cannot find value for key " + j);
/* 77 */            throw null;
                }

                public final void I0000O(int i) {
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
/* 75 */            this.I0000Il00O = new int[iMax];
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
                
                    r19 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
                
                    if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L60;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
                
                    r1 = I00000oIO(r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
                
                    if (r38.I0001Ioi1lo != 0) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
                
                    if (((r38.I00000oIO[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
                
                    r25 = 255;
                    r29 = r10;
                    r27 = 0;
                    r18 = 1;
                    r20 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
                
                    r1 = r38.I0000O;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
                
                    if (r1 <= 8) goto L42;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
                
                    r20 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
                
                    if (java.lang.Long.compareUnsigned(r38.I0000oI00 * 32, r1 * 25) > 0) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
                
                    r1 = r38.I00000oIO;
                    r2 = r38.I0000O;
                    r4 = r38.I00000oOI;
                    r5 = r38.I0000Il00O;
                    r6 = (r2 + 7) >> 3;
                    r25 = 255;
                    r7 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
                
                    if (r7 >= r6) goto L64;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
                
                    r9 = r1[r7] & (-9187201950435737472L);
                    r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
                    r7 = r7 + 1;
                    r13 = r13;
                    r12 = r12;
                    r10 = r10;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x00ee, code lost:
                
                    r29 = r10;
                    r27 = r12;
                    r11 = r13;
                    r8 = 7;
                    r6 = r1.length;
                    r7 = r6 - 1;
                    r6 = r6 - 2;
                    r12 = 72057594037927935L;
                    r1[r6] = (r1[r6] & 72057594037927935L) | (-72057594037927936L);
                    r1[r7] = r1[r27];
                    r6 = r27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x010c, code lost:
                
                    if (r6 == r2) goto L65;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x010e, code lost:
                
                    r7 = r6 >> 3;
                    r14 = (r6 & 7) << 3;
                    r9 = (r1[r7] >> r14) & 255;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x011b, code lost:
                
                    if (r9 != 128) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x011d, code lost:
                
                    r6 = r6 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0122, code lost:
                
                    if (r9 == 254) goto L66;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0125, code lost:
                
                    r9 = java.lang.Long.hashCode(r4[r6]) * r19;
                    r10 = (r9 ^ (r9 << 16)) >>> 7;
                    r15 = I00000oIO(r10);
                    r10 = r10 & r2;
                    r28 = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0146, code lost:
                
                    if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L67;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x0148, code lost:
                
                    r10 = r11;
                    r35 = r12;
                    r1[r7] = ((r9 & 127) << r14) | (r1[r7] & (~(255 << r14)));
                    r1[r1.length - r10] = (r1[r27] & r35) | Long.MIN_VALUE;
                    r6 = r6 + 1;
                    r11 = r10;
                    r8 = r28;
                    r12 = r35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x016b, code lost:
                
                    r10 = r11;
                    r35 = r12;
                    r8 = r15 >> 3;
                    r11 = r1[r8];
                    r13 = (r15 & 7) << 3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x017c, code lost:
                
                    if (((r11 >> r13) & 255) != 128) goto L38;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x017e, code lost:
                
                    r18 = r10;
                    r12 = r4;
                    r37 = r5;
                    r1[r8] = (r11 & (~(255 << r13))) | ((r9 & 127) << r13);
                    r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
                    r12[r15] = r12[r6];
                    r12[r6] = 0;
                    r37[r15] = r37[r6];
                    r37[r6] = r27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x01aa, code lost:
                
                    r37 = r5;
                    r18 = r10;
                    r12 = r4;
                    r1[r8] = ((r9 & 127) << r13) | (r11 & (~(255 << r13)));
                    r4 = r12[r15];
                    r12[r15] = r12[r6];
                    r12[r6] = r4;
                    r4 = r37[r15];
                    r37[r15] = r37[r6];
                    r37[r6] = r4;
                    r6 = r6 - 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x01cf, code lost:
                
                    r1[r1.length - 1] = (r1[r27] & r35) | Long.MIN_VALUE;
                    r6 = r6 + 1;
                    r4 = r12;
                    r11 = r18;
                    r8 = r28;
                    r12 = r35;
                    r5 = r37;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x01e7, code lost:
                
                    r18 = r11;
                    r38.I0001Ioi1lo = p000.OiO10oio.I00000oIO(r38.I0000O) - r38.I0000oI00;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x01f8, code lost:
                
                    r25 = 255;
                    r29 = r10;
                    r27 = 0;
                    r18 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x0203, code lost:
                
                    r20 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x0206, code lost:
                
                    r1 = p000.OiO10oio.I00000oOI(r38.I0000O);
                    r2 = r38.I00000oIO;
                    r4 = r38.I00000oOI;
                    r5 = r38.I0000Il00O;
                    r6 = r38.I0000O;
                    I0000O(r1);
                    r1 = r38.I00000oIO;
                    r7 = r38.I00000oOI;
                    r8 = r38.I0000Il00O;
                    r9 = r38.I0000O;
                    r10 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x0221, code lost:
                
                    if (r10 >= r6) goto L75;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:46:0x0230, code lost:
                
                    if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x0232, code lost:
                
                    r11 = r4[r10];
                    r13 = java.lang.Long.hashCode(r11) * r19;
                    r13 = r13 ^ (r13 << 16);
                    r14 = I00000oIO(r13 >>> 7);
                    r16 = r1;
                    r15 = r2;
                    r1 = r13 & 127;
                    r13 = r14 >> 3;
                    r17 = (r14 & 7) << 3;
                    r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
                    r16[r13] = r1;
                    r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
                    r7[r14] = r11;
                    r8[r14] = r5[r10];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x0270, code lost:
                
                    r16 = r1;
                    r15 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x0273, code lost:
                
                    r10 = r10 + 1;
                    r2 = r15;
                    r1 = r16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0279, code lost:
                
                    r1 = I00000oIO(r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x027d, code lost:
                
                    r38.I0000oI00++;
                    r2 = r38.I0001Ioi1lo;
                    r3 = r38.I00000oIO;
                    r4 = r1 >> 3;
                    r5 = r3[r4];
                    r7 = (r1 & 7) << 3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x0295, code lost:
                
                    if (((r5 >> r7) & r25) != r20) goto L54;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x0298, code lost:
                
                    r18 = r27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x029a, code lost:
                
                    r38.I0001Ioi1lo = r2 - r18;
                    r2 = r38.I0000O;
                    r5 = (r5 & (~(r25 << r7))) | (r29 << r7);
                    r3[r4] = r5;
                    r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r5;
                    r1 = ~r1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000oI00(int i, long j) {
                    int i2;
                    int i3;
/* 7 */             int i4 = -862048943;
/* 10 */            int iHashCode = Long.hashCode(j) * (-862048943);
/* 13 */            int i5 = iHashCode ^ (iHashCode << 16);
/* 14 */            int i6 = i5 >>> 7;
/* 16 */            int i7 = i5 & 127;
/* 18 */            int i8 = this.I0000O;
/* 20 */            int i9 = i6 & i8;
/* 22 */            int i10 = 0;
                    loop0: while (true) {
/* 23 */                long[] jArr = this.I00000oIO;
/* 25 */                int i11 = i9 >> 3;
/* 29 */                int i12 = (i9 & 7) << 3;
/* 34 */                int i13 = 1;
/* 47 */                long j2 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
                        long j3 = i7;
/* 56 */                int i14 = i10;
/* 58 */                int i15 = 0;
/* 59 */                long j4 = j2 ^ (j3 * 72340172838076673L);
/* 70 */                long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
/* 75 */                    if (j5 == 0) {
                                break;
                            }
/* 85 */                    int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j5) >> 3)) & i8;
/* 87 */                    int i16 = i4;
/* 95 */                    if (this.I00000oOI[iNumberOfTrailingZeros] == j) {
/* 97 */                        i3 = iNumberOfTrailingZeros;
                                break loop0;
                            } else {
/* 105 */                       j5 &= j5 - 1;
/* 107 */                       i4 = i16;
                            }
                        }
/* 709 */               i10 = i14 + 8;
/* 712 */               i9 = (i9 + i10) & i8;
/* 713 */               i4 = i2;
                    }
/* 693 */           if (i3 < 0) {
/* 695 */               i3 = ~i3;
                    }
/* 698 */           this.I00000oOI[i3] = j;
/* 702 */           this.I0000Il00O[i3] = i;
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
/* 12 */            if (!(obj instanceof OI0ll0OIiO)) {
/* 11 */                return false;
                    }
/* 15 */            OI0ll0OIiO oI0ll0OIiO = (OI0ll0OIiO) obj;
/* 21 */            if (oI0ll0OIiO.I0000oI00 != this.I0000oI00) {
/* 11 */                return false;
                    }
/* 24 */            long[] jArr = this.I00000oOI;
/* 26 */            int[] iArr = this.I0000Il00O;
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
/* 78 */                                int i5 = iArr[i4];
/* 80 */                                int iI00000oOI = oI0ll0OIiO.I00000oOI(j2);
/* 84 */                                if (iI00000oOI < 0 || i5 != oI0ll0OIiO.I0000Il00O[iI00000oOI]) {
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
/* 1 */             long[] jArr = this.I00000oOI;
/* 3 */             int[] iArr = this.I0000Il00O;
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
/* 68 */                            iHashCode += Integer.hashCode(iArr[i4]) ^ Long.hashCode(j2);
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

                public final String toString() {
                    int i;
                    int i2;
/* 5 */             if (this.I0000oI00 == 0) {
/* 7 */                 return "{}";
                    }
/* 14 */            StringBuilder sb = new StringBuilder("{");
/* 17 */            long[] jArr = this.I00000oOI;
/* 19 */            int[] iArr = this.I0000Il00O;
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
/* 74 */                                int i8 = iArr[i7];
/* 76 */                                sb.append(j2);
/* 81 */                                sb.append("=");
/* 84 */                                sb.append(i8);
/* 87 */                                i4++;
/* 91 */                                if (i4 < this.I0000oI00) {
/* 95 */                                    sb.append(", ");
                                        }
                                    } else {
/* 99 */                                i2 = i3;
                                    }
/* 101 */                           j >>= 8;
/* 102 */                           i6++;
/* 104 */                           i3 = i2;
                                }
/* 107 */                       int i9 = i3;
/* 109 */                       if (i5 != 8) {
                                    break;
                                }
/* 111 */                       i = i9;
                            } else {
/* 114 */                       i = i3;
                            }
/* 115 */                   if (i == length) {
                                break;
                            }
/* 117 */                   i3 = i + 1;
                        }
                    }
/* 122 */           sb.append('}');
/* 125 */           return sb.toString();
                }
            }
