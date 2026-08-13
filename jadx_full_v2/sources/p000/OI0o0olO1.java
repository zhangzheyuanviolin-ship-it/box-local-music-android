            package p000;

            import java.util.Arrays;
            
            public final class OI0o0olO1 {
                public long[] I00000oIO = OiO10oio.I00000oIO;
                public Object[] I00000oOI = iIIl1I0OIlO0.I0000Il00O;
                public float[] I0000Il00O = IlOOlO01I.I00000oIO;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;

                public OI0o0olO1(int i) {
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

                public final int I00000oOI(Object obj) {
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

                public final float I0000Il00O(Object obj) {
/* 1 */             int iI00000oOI = I00000oOI(obj);
/* 5 */             if (iI00000oOI >= 0) {
/* 9 */                 return this.I0000Il00O[iI00000oOI];
                    }
/* 31 */            lO00l0o.I0000Il00O("There is no key " + obj + " in the map");
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
/* 71 */            this.I00000oOI = new Object[iMax];
/* 75 */            this.I0000Il00O = new float[iMax];
                }

                public final void I0000oI00(int i) {
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

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
                
                    r20 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
                
                    if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L71;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
                
                    r2 = I00000oIO(r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
                
                    if (r37.I0001Ioi1lo != 0) goto L20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
                
                    if (((r37.I00000oIO[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
                
                    r23 = 255;
                    r27 = r11;
                    r18 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
                
                    r2 = r37.I0000O;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
                
                    if (r2 <= 8) goto L50;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
                
                    r18 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
                
                    if (java.lang.Long.compareUnsigned(r37.I0000oI00 * 32, r2 * 25) > 0) goto L49;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
                
                    r2 = r37.I00000oIO;
                    r3 = r37.I0000O;
                    r4 = r37.I00000oOI;
                    r6 = r37.I0000Il00O;
                    r7 = (r3 + 7) >> 3;
                    r23 = 255;
                    r8 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
                
                    if (r8 >= r7) goto L75;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
                
                    r10 = r2[r8] & r13;
                    r2[r8] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
                    r8 = r8 + 1;
                    r11 = r11;
                    r13 = -9187201950435737472L;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00f3, code lost:
                
                    r27 = r11;
                    r9 = 7;
                    r7 = r2.length;
                    r8 = r7 - 1;
                    r7 = r7 - 2;
                    r12 = 72057594037927935L;
                    r2[r7] = (r2[r7] & 72057594037927935L) | (-72057594037927936L);
                    r2[r8] = r2[0];
                    r7 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x010e, code lost:
                
                    if (r7 == r3) goto L77;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0110, code lost:
                
                    r8 = r7 >> 3;
                    r14 = (r7 & 7) << 3;
                    r10 = (r2[r8] >> r14) & 255;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x011d, code lost:
                
                    if (r10 != 128) goto L33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x011f, code lost:
                
                    r7 = r7 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x0124, code lost:
                
                    if (r10 == 254) goto L76;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x0127, code lost:
                
                    r10 = r4[r7];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
                
                    if (r10 == null) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x012b, code lost:
                
                    r10 = r10.hashCode();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x0130, code lost:
                
                    r10 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x0131, code lost:
                
                    r10 = r10 * r20;
                    r11 = (r10 ^ (r10 << 16)) >>> 7;
                    r25 = I00000oIO(r11);
                    r11 = r11 & r3;
                    r29 = r9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x014c, code lost:
                
                    if ((((r25 - r11) & r3) / 8) != (((r7 - r11) & r3) / 8)) goto L79;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x014e, code lost:
                
                    r32 = r12;
                    r2[r8] = ((r10 & 127) << r14) | (r2[r8] & (~(255 << r14)));
                    r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
                    r7 = r7 + 1;
                    r9 = r29;
                    r12 = r32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x0170, code lost:
                
                    r32 = r12;
                    r9 = r25 >> 3;
                    r11 = r2[r9];
                    r13 = (r25 & 7) << 3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x0180, code lost:
                
                    if (((r11 >> r13) & 255) != 128) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x0182, code lost:
                
                    r26 = r3;
                    r34 = r4;
                    r2[r9] = ((~(255 << r13)) & r11) | ((r10 & 127) << r13);
                    r2[r8] = (r2[r8] & (~(255 << r14))) | (128 << r14);
                    r34[r25] = r34[r7];
                    r34[r7] = null;
                    r6[r25] = r6[r7];
                    r6[r7] = 0.0f;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:46:0x01ae, code lost:
                
                    r26 = r3;
                    r34 = r4;
                    r2[r9] = ((~(255 << r13)) & r11) | ((r10 & 127) << r13);
                    r3 = r34[r25];
                    r34[r25] = r34[r7];
                    r34[r7] = r3;
                    r3 = r6[r25];
                    r6[r25] = r6[r7];
                    r6[r7] = r3;
                    r7 = r7 - 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x01d2, code lost:
                
                    r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
                    r7 = r7 + 1;
                    r3 = r26;
                    r9 = r29;
                    r12 = r32;
                    r4 = r34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x01e9, code lost:
                
                    r37.I0001Ioi1lo = p000.OiO10oio.I00000oIO(r37.I0000O) - r37.I0000oI00;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x01f8, code lost:
                
                    r23 = 255;
                    r27 = r11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x01ff, code lost:
                
                    r18 = 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0202, code lost:
                
                    r2 = p000.OiO10oio.I00000oOI(r37.I0000O);
                    r3 = r37.I00000oIO;
                    r4 = r37.I00000oOI;
                    r6 = r37.I0000Il00O;
                    r7 = r37.I0000O;
                    I0000O(r2);
                    r2 = r37.I00000oIO;
                    r8 = r37.I00000oOI;
                    r9 = r37.I0000Il00O;
                    r10 = r37.I0000O;
                    r11 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x021c, code lost:
                
                    if (r11 >= r7) goto L86;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x022b, code lost:
                
                    if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r18) goto L60;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x022d, code lost:
                
                    r12 = r4[r11];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x022f, code lost:
                
                    if (r12 == null) goto L58;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x0231, code lost:
                
                    r13 = r12.hashCode();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x0236, code lost:
                
                    r13 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x0237, code lost:
                
                    r13 = r13 * r20;
                    r13 = r13 ^ (r13 << 16);
                    r14 = I00000oIO(r13 >>> 7);
                    r17 = r2;
                    r1 = r13 & 127;
                    r13 = r14 >> 3;
                    r21 = (r14 & 7) << 3;
                    r1 = (r17[r13] & (~(255 << r21))) | (r1 << r21);
                    r17[r13] = r1;
                    r17[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
                    r8[r14] = r12;
                    r9[r14] = r6[r11];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x026e, code lost:
                
                    r17 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x0270, code lost:
                
                    r11 = r11 + 1;
                    r2 = r17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:62:0x0277, code lost:
                
                    r2 = I00000oIO(r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x027b, code lost:
                
                    r37.I0000oI00++;
                    r1 = r37.I0001Ioi1lo;
                    r3 = r37.I00000oIO;
                    r4 = r2 >> 3;
                    r5 = r3[r4];
                    r7 = (r2 & 7) << 3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x0293, code lost:
                
                    if (((r5 >> r7) & r23) != r18) goto L66;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x0295, code lost:
                
                    r15 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x0297, code lost:
                
                    r37.I0001Ioi1lo = r1 - r15;
                    r1 = r37.I0000O;
                    r5 = (r5 & (~(r23 << r7))) | (r27 << r7);
                    r3[r4] = r5;
                    r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
                    r1 = ~r2;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0001Ioi1lo(Object obj, float f) {
                    int i;
                    int i2;
/* 3 */             Object obj2 = obj;
/* 13 */            int i3 = -862048943;
/* 16 */            int iHashCode = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
/* 19 */            int i4 = iHashCode ^ (iHashCode << 16);
/* 20 */            int i5 = i4 >>> 7;
/* 22 */            int i6 = i4 & 127;
/* 24 */            int i7 = this.I0000O;
/* 26 */            int i8 = i5 & i7;
/* 28 */            int i9 = 0;
                    loop0: while (true) {
/* 29 */                long[] jArr = this.I00000oIO;
/* 31 */                int i10 = i8 >> 3;
/* 35 */                int i11 = (i8 & 7) << 3;
/* 55 */                long j = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
                        long j2 = i6;
/* 64 */                int i12 = i6;
/* 66 */                int i13 = 0;
/* 67 */                long j3 = j ^ (j2 * 72340172838076673L);
/* 73 */                long j4 = -9187201950435737472L;
/* 78 */                long j5 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
/* 83 */                    if (j5 == 0) {
                                break;
                            }
/* 93 */                    int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j5) >> 3)) & i7;
/* 95 */                    int i14 = i3;
/* 105 */                   if (O0000Ioio00.I0000O(this.I00000oOI[iNumberOfTrailingZeros], obj2)) {
/* 107 */                       i2 = iNumberOfTrailingZeros;
                                break loop0;
                            } else {
/* 115 */                       j5 &= j5 - 1;
/* 117 */                       i3 = i14;
                            }
                        }
/* 703 */               i9 += 8;
/* 706 */               i8 = (i8 + i9) & i7;
/* 707 */               obj2 = obj;
/* 709 */               i6 = i12;
/* 711 */               i3 = i;
                    }
/* 689 */           if (i2 < 0) {
/* 691 */               i2 = ~i2;
                    }
/* 694 */           this.I00000oOI[i2] = obj;
/* 698 */           this.I0000Il00O[i2] = f;
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
                
                    return false;
                 */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
/* 6 */             if (obj == this) {
/* 5 */                 return true;
                    }
/* 12 */            if (!(obj instanceof OI0o0olO1)) {
/* 11 */                return false;
                    }
/* 15 */            OI0o0olO1 oI0o0olO1 = (OI0o0olO1) obj;
/* 21 */            if (oI0o0olO1.I0000oI00 != this.I0000oI00) {
/* 11 */                return false;
                    }
/* 24 */            Object[] objArr = this.I00000oOI;
/* 26 */            float[] fArr = this.I0000Il00O;
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
/* 78 */                                float f = fArr[i4];
/* 80 */                                int iI00000oOI = oI0o0olO1.I00000oOI(obj2);
/* 84 */                                if (iI00000oOI < 0 || f != oI0o0olO1.I0000Il00O[iI00000oOI]) {
                                            break loop0;
                                        }
                                    }
/* 96 */                            j >>= 8;
                                }
/* 100 */                       if (i2 != 8) {
                                    break;
                                }
/* 102 */                       if (i == length) {
                                    break;
                                }
/* 104 */                       i++;
                            }
                        }
                    }
/* 5 */             return true;
                }

                public final int hashCode() {
/* 1 */             Object[] objArr = this.I00000oOI;
/* 3 */             float[] fArr = this.I0000Il00O;
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
/* 72 */                            iHashCode += Float.hashCode(fArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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
/* 19 */            float[] fArr = this.I0000Il00O;
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
/* 73 */                                float f = fArr[i5];
/* 75 */                                if (obj == this) {
/* 77 */                                    obj = "(this)";
                                        }
/* 79 */                                sb.append(obj);
/* 84 */                                sb.append("=");
/* 87 */                                sb.append(f);
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
