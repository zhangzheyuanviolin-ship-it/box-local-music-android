            package p000;

            import java.util.Arrays;
            
/* 27 */    public final class OI0lOIOi1l {
                public long[] I00000oIO;
                public int[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;

                public OI0lOIOi1l(int i) {
/* 6 */             this.I00000oIO = OiO10oio.I00000oIO;
/* 10 */            this.I00000oOI = IooOIoI.I00000oIO;
/* 12 */            if (i >= 0) {
/* 18 */                I0000oI00(OiO10oio.I0000O(i));
                    } else {
/* 24 */                lO00l0o.I00000oIO("Capacity must be a positive value.");
/* 29 */                throw null;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
                
                    r22 = r4;
                    r8 = (r8 & ((~r8) << 6)) & (-9187201950435737472L);
                    r8 = '\b';
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
                
                    if (r8 == 0) goto L61;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
                
                    r3 = I0000O(r5);
                    r12 = 255;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
                
                    if (r37.I0000oI00 != 0) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
                
                    if (((r37.I00000oIO[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
                
                    r25 = 255;
                    r29 = true;
                    r20 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
                
                    r3 = r37.I0000Il00O;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
                
                    if (r3 <= 8) goto L43;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
                
                    r20 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
                
                    if (java.lang.Long.compareUnsigned(r37.I0000O * 32, r3 * 25) > 0) goto L42;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x00c1, code lost:
                
                    r3 = r37.I00000oIO;
                    r4 = r37.I0000Il00O;
                    r6 = r37.I00000oOI;
                    r7 = (r4 + 7) >> 3;
                    r14 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
                
                    if (r14 >= r7) goto L65;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
                
                    r27 = r8;
                    r8 = r3[r14] & (-9187201950435737472L);
                    r3[r14] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
                    r14 = r14 + 1;
                    r12 = r12;
                    r8 = r27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x00ec, code lost:
                
                    r25 = r12;
                    r7 = r3.length;
                    r8 = r7 - 1;
                    r7 = r7 - 2;
                    r3[r7] = (r3[r7] & 72057594037927935L) | (-72057594037927936L);
                    r3[r8] = r3[0];
                    r7 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x010c, code lost:
                
                    if (r7 == r4) goto L66;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x010e, code lost:
                
                    r8 = r7 >> 3;
                    r9 = (r7 & 7) << 3;
                    r12 = (r3[r8] >> r9) & r25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x011b, code lost:
                
                    if (r12 != 128) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x011d, code lost:
                
                    r7 = r7 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0122, code lost:
                
                    if (r12 == 254) goto L67;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0125, code lost:
                
                    r12 = java.lang.Integer.hashCode(r6[r7]) * r22;
                    r13 = (r12 ^ (r12 << 16)) >>> 7;
                    r14 = I0000O(r13);
                    r13 = r13 & r4;
                    r29 = r15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0146, code lost:
                
                    if ((((r14 - r13) & r4) / 8) != (((r7 - r13) & r4) / 8)) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x0148, code lost:
                
                    r28 = r6;
                    r3[r8] = ((~(r25 << r9)) & r3[r8]) | ((r12 & 127) << r9);
                    r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
                    r7 = r7 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x0166, code lost:
                
                    r6 = r28;
                    r15 = r29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x016b, code lost:
                
                    r28 = r6;
                    r32 = r7;
                    r6 = r14 >> 3;
                    r33 = r3[r6];
                    r7 = (r14 & 7) << 3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x017d, code lost:
                
                    if (((r33 >> r7) & r25) != 128) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x017f, code lost:
                
                    r3[r6] = (r33 & (~(r25 << r7))) | ((r12 & 127) << r7);
                    r3[r8] = (r3[r8] & (~(r25 << r9))) | (128 << r9);
                    r28[r14] = r28[r32];
                    r28[r32] = 0;
                    r7 = r32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x01a3, code lost:
                
                    r3[r6] = ((r12 & 127) << r7) | (r33 & (~(r25 << r7)));
                    r6 = r28[r14];
                    r28[r14] = r28[r32];
                    r28[r32] = r6;
                    r7 = r32 - 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x01bd, code lost:
                
                    r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
                    r7 = r7 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x01cb, code lost:
                
                    r29 = r15;
                    r37.I0000oI00 = p000.OiO10oio.I00000oIO(r37.I0000Il00O) - r37.I0000O;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x01da, code lost:
                
                    r25 = 255;
                    r29 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x01e1, code lost:
                
                    r20 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x01e4, code lost:
                
                    r3 = p000.OiO10oio.I00000oOI(r37.I0000Il00O);
                    r4 = r37.I00000oIO;
                    r6 = r37.I00000oOI;
                    r7 = r37.I0000Il00O;
                    I0000oI00(r3);
                    r3 = r37.I00000oIO;
                    r8 = r37.I00000oOI;
                    r9 = r37.I0000Il00O;
                    r12 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x01fb, code lost:
                
                    if (r12 >= r7) goto L73;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x020a, code lost:
                
                    if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r20) goto L49;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x020c, code lost:
                
                    r13 = r6[r12];
                    r14 = java.lang.Integer.hashCode(r13) * r22;
                    r14 = r14 ^ (r14 << 16);
                    r15 = I0000O(r14 >>> 7);
                    r19 = r3;
                    r18 = r4;
                    r3 = r14 & 127;
                    r14 = r15 >> 3;
                    r23 = (r15 & 7) << 3;
                    r3 = (r19[r14] & (~(255 << r23))) | (r3 << r23);
                    r19[r14] = r3;
                    r19[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
                    r8[r15] = r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x0247, code lost:
                
                    r19 = r3;
                    r18 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x024b, code lost:
                
                    r12 = r12 + 1;
                    r4 = r18;
                    r3 = r19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0252, code lost:
                
                    r3 = I0000O(r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x0256, code lost:
                
                    r14 = r3;
                    r37.I0000O++;
                    r3 = r37.I0000oI00;
                    r4 = r37.I00000oIO;
                    r5 = r14 >> 3;
                    r6 = r4[r5];
                    r8 = (r14 & 7) << 3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x026f, code lost:
                
                    if (((r6 >> r8) & r25) != r20) goto L55;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x0271, code lost:
                
                    r9 = r29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x0274, code lost:
                
                    r9 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x0276, code lost:
                
                    r37.I0000oI00 = r3 - r9;
                    r3 = r37.I0000Il00O;
                    r6 = (r6 & (~(r25 << r8))) | (r10 << r8);
                    r4[r5] = r6;
                    r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r9v3 */
                /* JADX WARN: Type inference failed for: r9v4, types: [int] */
                /* JADX WARN: Type inference failed for: r9v5 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00000oIO(int i) {
                    int i2;
                    boolean z;
                    int iNumberOfTrailingZeros;
/* 5 */             int i3 = this.I0000O;
/* 11 */            int i4 = -862048943;
/* 14 */            int iHashCode = Integer.hashCode(i) * (-862048943);
/* 17 */            int i5 = iHashCode ^ (iHashCode << 16);
/* 18 */            int i6 = i5 >>> 7;
/* 20 */            int i7 = i5 & 127;
/* 22 */            int i8 = this.I0000Il00O;
/* 24 */            int i9 = i6 & i8;
/* 26 */            int i10 = 0;
                    loop0: while (true) {
/* 27 */                long[] jArr = this.I00000oIO;
/* 29 */                int i11 = i9 >> 3;
/* 33 */                int i12 = (i9 & 7) << 3;
/* 38 */                boolean z2 = true;
/* 46 */                int i13 = i10;
/* 56 */                long j = (((-i12) >> 63) & (jArr[i11 + 1] << (64 - i12))) | (jArr[i11] >>> i12);
                        long j2 = i7;
/* 67 */                long j3 = j ^ (j2 * 72340172838076673L);
/* 79 */                long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
                        while (true) {
/* 85 */                    if (j4 == 0) {
                                break;
                            }
/* 94 */                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i9) & i8;
/* 95 */                    int i14 = i4;
/* 101 */                   if (this.I00000oOI[iNumberOfTrailingZeros] == i) {
/* 103 */                       z = true;
                                break loop0;
                            }
/* 111 */                   j4 &= j4 - 1;
/* 113 */                   i4 = i14;
                        }
/* 667 */               i10 = i13 + 8;
/* 670 */               i9 = (i9 + i10) & i8;
/* 671 */               i4 = i2;
                    }
/* 657 */           this.I00000oOI[iNumberOfTrailingZeros] = i;
/* 661 */           if (this.I0000O != i3) {
/* 663 */               return z;
                    }
/* 48 */            return false;
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
/* 47 */            this.I0000oI00 = OiO10oio.I00000oIO(this.I0000Il00O) - this.I0000O;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
                
                    if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
                
                    r10 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0000Il00O(int i) {
                    int iNumberOfTrailingZeros;
/* 10 */            int iHashCode = Integer.hashCode(i) * (-862048943);
/* 13 */            int i2 = iHashCode ^ (iHashCode << 16);
/* 14 */            int i3 = i2 & 127;
/* 16 */            int i4 = this.I0000Il00O;
/* 20 */            int i5 = (i2 >>> 7) & i4;
/* 22 */            int i6 = 0;
                    loop0: while (true) {
/* 23 */                long[] jArr = this.I00000oIO;
/* 25 */                int i7 = i5 >> 3;
/* 29 */                int i8 = (i5 & 7) << 3;
/* 47 */                long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
/* 55 */                long j2 = (i3 * 72340172838076673L) ^ j;
/* 65 */                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
/* 70 */                    if (j3 == 0) {
                                break;
                            }
/* 79 */                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
/* 86 */                    if (this.I00000oOI[iNumberOfTrailingZeros] == i) {
                                break loop0;
                            }
/* 93 */                    j3 &= j3 - 1;
                        }
/* 110 */               i6 += 8;
/* 113 */               i5 = (i5 + i6) & i4;
                    }
                    return iNumberOfTrailingZeros >= 0;
                }

                public final int I0000O(int i) {
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

                public final void I0000oI00(int i) {
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
/* 71 */            this.I00000oOI = new int[iMax];
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
                
                    if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
                
                    r10 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0001Ioi1lo(int i) {
                    int iNumberOfTrailingZeros;
/* 10 */            int iHashCode = Integer.hashCode(i) * (-862048943);
/* 13 */            int i2 = iHashCode ^ (iHashCode << 16);
/* 14 */            int i3 = i2 & 127;
/* 16 */            int i4 = this.I0000Il00O;
/* 20 */            int i5 = (i2 >>> 7) & i4;
/* 22 */            int i6 = 0;
                    loop0: while (true) {
/* 23 */                long[] jArr = this.I00000oIO;
/* 25 */                int i7 = i5 >> 3;
/* 29 */                int i8 = (i5 & 7) << 3;
/* 47 */                long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
/* 55 */                long j2 = (i3 * 72340172838076673L) ^ j;
/* 65 */                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
/* 70 */                    if (j3 == 0) {
                                break;
                            }
/* 79 */                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
/* 86 */                    if (this.I00000oOI[iNumberOfTrailingZeros] == i) {
                                break loop0;
                            }
/* 93 */                    j3 &= j3 - 1;
                        }
/* 115 */               i6 += 8;
/* 118 */               i5 = (i5 + i6) & i4;
                    }
/* 106 */           boolean z = iNumberOfTrailingZeros >= 0;
/* 109 */           if (z) {
/* 111 */               I000II(iNumberOfTrailingZeros);
                    }
/* 114 */           return z;
                }

                public final void I000II(int i) {
                    this.I0000O--;
/* 7 */             long[] jArr = this.I00000oIO;
/* 9 */             int i2 = this.I0000Il00O;
/* 11 */            int i3 = i >> 3;
/* 15 */            int i4 = (i & 7) << 3;
/* 27 */            long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
/* 29 */            jArr[i3] = j;
/* 39 */            jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OI0lOIOi1l)) {
/* 7 */                 return false;
                    }
/* 11 */            OI0lOIOi1l oI0lOIOi1l = (OI0lOIOi1l) obj;
/* 17 */            if (oI0lOIOi1l.I0000O != this.I0000O) {
/* 7 */                 return false;
                    }
/* 20 */            int[] iArr = this.I00000oOI;
/* 22 */            long[] jArr = this.I00000oIO;
                    int length = jArr.length - 2;
/* 27 */            if (length >= 0) {
/* 29 */                int i = 0;
                        while (true) {
/* 30 */                    long j = jArr[i];
/* 44 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 53 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 56 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 65 */                            if ((255 & j) < 128 && !oI0lOIOi1l.I0000Il00O(iArr[(i << 3) + i3])) {
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
/* 1 */             int[] iArr = this.I00000oOI;
/* 3 */             long[] jArr = this.I00000oIO;
                    int length = jArr.length - 2;
/* 9 */             if (length < 0) {
/* 8 */                 return 0;
                    }
/* 11 */            int i = 0;
/* 12 */            int iHashCode = 0;
                    while (true) {
/* 13 */                long j = jArr[i];
/* 27 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 36 */                    int i2 = 8 - ((~(i - length)) >>> 31);
/* 39 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 48 */                        if ((255 & j) < 128) {
/* 59 */                            iHashCode = Integer.hashCode(iArr[(i << 3) + i3]) + iHashCode;
                                }
/* 61 */                        j >>= 8;
                            }
/* 65 */                    if (i2 != 8) {
/* 68 */                        return iHashCode;
                            }
                        }
/* 69 */                if (i == length) {
/* 74 */                    return iHashCode;
                        }
/* 71 */                i++;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[PHI: r5
                  0x005b: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0024, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append((CharSequence) "[");
/* 11 */            int[] iArr = this.I00000oOI;
/* 13 */            long[] jArr = this.I00000oIO;
                    int length = jArr.length - 2;
/* 18 */            if (length >= 0) {
/* 21 */                int i = 0;
/* 22 */                int i2 = 0;
                        loop0: while (true) {
/* 23 */                    long j = jArr[i];
/* 37 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 46 */                        int i3 = 8 - ((~(i - length)) >>> 31);
/* 49 */                        for (int i4 = 0; i4 < i3; i4++) {
/* 58 */                            if ((255 & j) < 128) {
/* 63 */                                int i5 = iArr[(i << 3) + i4];
/* 66 */                                if (i2 == -1) {
/* 70 */                                    sb.append((CharSequence) "...");
                                            break loop0;
                                        }
/* 74 */                                if (i2 != 0) {
/* 78 */                                    sb.append((CharSequence) ", ");
                                        }
/* 81 */                                sb.append(i5);
/* 84 */                                i2++;
                                    }
/* 86 */                            j >>= 8;
                                }
/* 90 */                        if (i3 != 8) {
                                    break;
                                }
/* 92 */                        if (i == length) {
                                    break;
                                }
/* 94 */                        i++;
                            }
                        }
/* 99 */                sb.append((CharSequence) "]");
                    } else {
/* 99 */                sb.append((CharSequence) "]");
                    }
/* 102 */           return sb.toString();
                }

/* 28 */        public OI0lOIOi1l() {
/* 29 */            this(6);
                }
            }
