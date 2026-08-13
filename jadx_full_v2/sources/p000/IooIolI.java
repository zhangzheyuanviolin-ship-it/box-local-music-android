            package p000;
            
            public abstract class IooIolI {
                public long[] I00000oIO;
                public int[] I00000oOI;
                public Object[] I0000Il00O;
                public int I0000O;
                public int I0000oI00;

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
                
                    if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
                
                    r10 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00000oIO(int i) {
                    int iNumberOfTrailingZeros;
/* 10 */            int iHashCode = Integer.hashCode(i) * (-862048943);
/* 13 */            int i2 = iHashCode ^ (iHashCode << 16);
/* 14 */            int i3 = i2 & 127;
/* 16 */            int i4 = this.I0000O;
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

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
                
                    if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
                
                    r10 = -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(int i) {
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
/* 104 */               return this.I0000Il00O[iNumberOfTrailingZeros];
                    }
/* 107 */           return null;
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
/* 12 */            if (!(obj instanceof IooIolI)) {
/* 11 */                return false;
                    }
/* 15 */            IooIolI iooIolI = (IooIolI) obj;
/* 21 */            if (iooIolI.I0000oI00 != this.I0000oI00) {
/* 11 */                return false;
                    }
/* 24 */            int[] iArr = this.I00000oOI;
/* 26 */            Object[] objArr = this.I0000Il00O;
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
/* 78 */                                Object obj2 = objArr[i4];
/* 80 */                                if (obj2 == null) {
/* 86 */                                    if (iooIolI.I00000oOI(i5) != null || !iooIolI.I00000oIO(i5)) {
                                                break loop0;
                                            }
                                        } else if (!obj2.equals(iooIolI.I00000oOI(i5))) {
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
/* 1 */             int[] iArr = this.I00000oOI;
/* 3 */             Object[] objArr = this.I0000Il00O;
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
/* 57 */                            Object obj = objArr[i4];
/* 72 */                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i5);
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
/* 17 */            int[] iArr = this.I00000oOI;
/* 19 */            Object[] objArr = this.I0000Il00O;
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
/* 73 */                                Object obj = objArr[i5];
/* 75 */                                sb.append(i6);
/* 80 */                                sb.append("=");
/* 83 */                                if (obj == this) {
/* 85 */                                    obj = "(this)";
                                        }
/* 87 */                                sb.append(obj);
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
            }
