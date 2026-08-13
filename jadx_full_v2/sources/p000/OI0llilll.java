            package p000;

            import java.util.Arrays;
            
            public final class OI0llilll {
                public long[] I00000oIO = OiO10oio.I00000oIO;
                public long[] I00000oOI = O1IOii.I00000oIO;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;

                public OI0llilll(int i) {
/* 12 */            if (i >= 0) {
/* 18 */                I0000Il00O(OiO10oio.I0000O(i));
                    } else {
/* 24 */                lO00l0o.I00000oIO("Capacity must be a positive value.");
/* 29 */                throw null;
                    }
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
                public final boolean I00000oIO(long j) {
                    int iNumberOfTrailingZeros;
/* 10 */            int iHashCode = Long.hashCode(j) * (-862048943);
/* 13 */            int i = iHashCode ^ (iHashCode << 16);
/* 14 */            int i2 = i & 127;
/* 16 */            int i3 = this.I0000Il00O;
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

                public final int I00000oOI(int i) {
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

                public final void I0000Il00O(int i) {
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
/* 71 */            this.I00000oOI = new long[iMax];
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OI0llilll)) {
/* 7 */                 return false;
                    }
/* 11 */            OI0llilll oI0llilll = (OI0llilll) obj;
/* 17 */            if (oI0llilll.I0000O != this.I0000O) {
/* 7 */                 return false;
                    }
/* 20 */            long[] jArr = this.I00000oOI;
/* 22 */            long[] jArr2 = this.I00000oIO;
                    int length = jArr2.length - 2;
/* 27 */            if (length >= 0) {
/* 29 */                int i = 0;
                        while (true) {
/* 30 */                    long j = jArr2[i];
/* 44 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 53 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 56 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 65 */                            if ((255 & j) < 128 && !oI0llilll.I00000oIO(jArr[(i << 3) + i3])) {
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
/* 1 */             long[] jArr = this.I00000oOI;
/* 3 */             long[] jArr2 = this.I00000oIO;
                    int length = jArr2.length - 2;
/* 9 */             if (length < 0) {
/* 8 */                 return 0;
                    }
/* 11 */            int i = 0;
/* 12 */            int iHashCode = 0;
                    while (true) {
/* 13 */                long j = jArr2[i];
/* 27 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 36 */                    int i2 = 8 - ((~(i - length)) >>> 31);
/* 39 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 48 */                        if ((255 & j) < 128) {
/* 59 */                            iHashCode = Long.hashCode(jArr[(i << 3) + i3]) + iHashCode;
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
/* 11 */            long[] jArr = this.I00000oOI;
/* 13 */            long[] jArr2 = this.I00000oIO;
                    int length = jArr2.length - 2;
/* 18 */            if (length >= 0) {
/* 21 */                int i = 0;
/* 22 */                int i2 = 0;
                        loop0: while (true) {
/* 23 */                    long j = jArr2[i];
/* 37 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 46 */                        int i3 = 8 - ((~(i - length)) >>> 31);
/* 49 */                        for (int i4 = 0; i4 < i3; i4++) {
/* 58 */                            if ((255 & j) < 128) {
/* 63 */                                long j2 = jArr[(i << 3) + i4];
/* 66 */                                if (i2 == -1) {
/* 70 */                                    sb.append((CharSequence) "...");
                                            break loop0;
                                        }
/* 74 */                                if (i2 != 0) {
/* 78 */                                    sb.append((CharSequence) ", ");
                                        }
/* 81 */                                sb.append(j2);
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
            }
