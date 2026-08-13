            package p000;

            import java.io.EOFException;
            
            public abstract class I00000oOI {
                public static final byte[] I00000oIO = "0123456789abcdef".getBytes(IO1IOI.I00000oIO);
                public static final long[] I00000oOI = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

                public static final long I00000oIO(III1o0lOio0 iII1o0lOio0, IIOIIi1ilIO iIOIIi1ilIO, long j, long j2, int i) {
                    Oii1OOIOo oii1OOIOo;
/* 3 */             long j3 = j;
/* 5 */             long j4 = j2;
                    long j5 = i;
/* 17 */            iO1oO1OoOoii.I00000oOI(iIOIIi1ilIO.I00000oOI(), 0L, j5);
/* 22 */            if (i <= 0) {
/* 300 */               I000II.I000iOII("byteCount == 0");
/* 20 */                return 0L;
                    }
/* 26 */            if (j3 < 0) {
/* 292 */               I000II.I0010I0i(IlIi0I0.I000iOII(j3, "fromIndex < 0: "));
/* 20 */                return 0L;
                    }
/* 30 */            if (j3 > j4) {
/* 263 */               StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j3, "fromIndex > toIndex: ", " > ");
/* 267 */               sbI001iOo1i0O.append(j4);
/* 283 */               throw new IllegalArgumentException(sbI001iOo1i0O.toString().toString());
                    }
/* 32 */            long j6 = iII1o0lOio0.I00iiI;
/* 36 */            if (j4 > j6) {
/* 38 */                j4 = j6;
                    }
/* 41 */            if (j3 == j4 || (oii1OOIOo = iII1o0lOio0.I00iOIl) == null) {
/* 256 */               return -1L;
                    }
/* 55 */            long j7 = 0;
/* 58 */            if (j6 - j3 < j3) {
/* 62 */                while (j6 > j3) {
/* 64 */                    oii1OOIOo = oii1OOIOo.I000II;
/* 76 */                    j6 -= oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
                        }
/* 82 */                byte[] bArrI0001Ioi1lo = iIOIIi1ilIO.I0001Ioi1lo();
/* 86 */                byte b = bArrI0001Ioi1lo[0];
/* 93 */                long jMin = Math.min(j4, (iII1o0lOio0.I00iiI - j5) + 1);
/* 99 */                while (j6 < jMin) {
/* 101 */                   byte[] bArr = oii1OOIOo.I00000oIO;
/* 115 */                   int iMin = (int) Math.min(oii1OOIOo.I0000Il00O, (oii1OOIOo.I00000oOI + jMin) - j6);
/* 122 */                   for (int i2 = (int) ((oii1OOIOo.I00000oOI + j3) - j6); i2 < iMin; i2++) {
/* 126 */                       if (bArr[i2] == b && I00000oOI(oii1OOIOo, i2 + 1, bArrI0001Ioi1lo, 1, i)) {
/* 140 */                           return (i2 - oii1OOIOo.I00000oOI) + j6;
                                }
                            }
/* 151 */                   j6 += oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 152 */                   oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 154 */                   j3 = j6;
                        }
/* 256 */               return -1L;
                    }
                    while (true) {
/* 166 */               long j8 = j7 + (oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI);
/* 170 */               if (j8 > j3) {
                            break;
                        }
/* 172 */               oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 174 */               j7 = j8;
                    }
/* 177 */           byte[] bArrI0001Ioi1lo2 = iIOIIi1ilIO.I0001Ioi1lo();
/* 181 */           byte b2 = bArrI0001Ioi1lo2[0];
/* 188 */           long jMin2 = Math.min(j4, (iII1o0lOio0.I00iiI - j5) + 1);
/* 194 */           while (j7 < jMin2) {
/* 196 */               byte[] bArr2 = oii1OOIOo.I00000oIO;
/* 211 */               int iMin2 = (int) Math.min(oii1OOIOo.I0000Il00O, (oii1OOIOo.I00000oOI + jMin2) - j7);
/* 219 */               for (int i3 = (int) ((oii1OOIOo.I00000oOI + j3) - j7); i3 < iMin2; i3++) {
/* 223 */                   if (bArr2[i3] == b2 && I00000oOI(oii1OOIOo, i3 + 1, bArrI0001Ioi1lo2, 1, i)) {
/* 237 */                       return (i3 - oii1OOIOo.I00000oOI) + j7;
                            }
                        }
/* 249 */               j7 += oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI;
/* 251 */               oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 253 */               j3 = j7;
                    }
/* 256 */           return -1L;
                }

                public static final boolean I00000oOI(Oii1OOIOo oii1OOIOo, int i, byte[] bArr, int i2, int i3) {
/* 1 */             int i4 = oii1OOIOo.I0000Il00O;
/* 3 */             byte[] bArr2 = oii1OOIOo.I00000oIO;
/* 5 */             while (i2 < i3) {
/* 7 */                 if (i == i4) {
/* 9 */                     oii1OOIOo = oii1OOIOo.I0001Ioi1lo;
/* 11 */                    byte[] bArr3 = oii1OOIOo.I00000oIO;
/* 18 */                    bArr2 = bArr3;
/* 13 */                    i = oii1OOIOo.I00000oOI;
/* 15 */                    i4 = oii1OOIOo.I0000Il00O;
                        }
/* 25 */                if (bArr2[i] != bArr[i2]) {
/* 27 */                    return false;
                        }
/* 29 */                i++;
/* 31 */                i2++;
                    }
/* 34 */            return true;
                }

                public static final String I0000Il00O(III1o0lOio0 iII1o0lOio0, long j) throws EOFException {
/* 7 */             if (j > 0) {
/* 9 */                 long j2 = j - 1;
/* 17 */                if (iII1o0lOio0.I000O01llI0(j2) == 13) {
/* 21 */                    String strI00OOll1 = iII1o0lOio0.I00OOll1(j2, IO1IOI.I00000oIO);
/* 27 */                    iII1o0lOio0.skip(2L);
/* 30 */                    return strI00OOll1;
                        }
                    }
/* 33 */            String strI00OOll12 = iII1o0lOio0.I00OOll1(j, IO1IOI.I00000oIO);
/* 37 */            iII1o0lOio0.skip(1L);
/* 89 */            return strI00OOll12;
                }

                /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
                
                    if (r18 == false) goto L37;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
                
                    return -2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
                
                    return r9;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final int I0000O(III1o0lOio0 iII1o0lOio0, OIil0IiIo oIil0IiIo, boolean z) {
                    int i;
                    int i2;
                    int i3;
                    Oii1OOIOo oii1OOIOo;
                    int i4;
/* 3 */             Oii1OOIOo oii1OOIOo2 = iII1o0lOio0.I00iOIl;
/* 6 */             if (oii1OOIOo2 != null) {
/* 12 */                byte[] bArr = oii1OOIOo2.I00000oIO;
/* 14 */                int i5 = oii1OOIOo2.I00000oOI;
/* 16 */                int i6 = oii1OOIOo2.I0000Il00O;
/* 20 */                int[] iArr = oIil0IiIo.I00iiI;
/* 23 */                Oii1OOIOo oii1OOIOo3 = oii1OOIOo2;
/* 24 */                int i7 = -1;
/* 25 */                int i8 = 0;
                        loop0: while (true) {
/* 26 */                    int i9 = i8 + 1;
/* 28 */                    int i10 = iArr[i8];
/* 30 */                    int i11 = i8 + 2;
/* 32 */                    int i12 = iArr[i9];
/* 34 */                    if (i12 != -1) {
/* 36 */                        i7 = i12;
                            }
/* 37 */                    if (oii1OOIOo3 == null) {
                                break;
                            }
/* 41 */                    if (i10 >= 0) {
/* 106 */                       int i13 = i5 + 1;
/* 110 */                       int i14 = bArr[i5] & 255;
/* 112 */                       int i15 = i11 + i10;
/* 114 */                       while (i11 != i15) {
/* 119 */                           if (i14 == iArr[i11]) {
/* 122 */                               i = iArr[i11 + i10];
/* 124 */                               if (i13 == i6) {
/* 126 */                                   oii1OOIOo3 = oii1OOIOo3.I0001Ioi1lo;
/* 128 */                                   int i16 = oii1OOIOo3.I00000oOI;
/* 130 */                                   byte[] bArr2 = oii1OOIOo3.I00000oIO;
/* 132 */                                   i2 = oii1OOIOo3.I0000Il00O;
/* 134 */                                   if (oii1OOIOo3 == oii1OOIOo2) {
/* 137 */                                       i3 = i16;
/* 138 */                                       bArr = bArr2;
/* 139 */                                       oii1OOIOo3 = null;
                                            } else {
/* 142 */                                       i3 = i16;
/* 143 */                                       bArr = bArr2;
                                            }
                                        } else {
/* 145 */                                   i2 = i6;
/* 146 */                                   i3 = i13;
                                        }
/* 147 */                               if (i >= 0) {
/* 149 */                                   return i;
                                        }
/* 151 */                               int i17 = i2;
/* 150 */                               i8 = -i;
/* 153 */                               i5 = i3;
/* 154 */                               i6 = i17;
                                    } else {
/* 157 */                               i11++;
                                    }
                                }
                                break loop0;
                            }
/* 45 */                    int i18 = (i10 * (-1)) + i11;
                            while (true) {
/* 47 */                        int i19 = i5 + 1;
/* 53 */                        int i20 = i11 + 1;
/* 57 */                        if ((bArr[i5] & 255) != iArr[i11]) {
                                    break loop0;
                                }
/* 64 */                        boolean z2 = i20 == i18;
/* 65 */                        if (i19 == i6) {
/* 67 */                            Oii1OOIOo oii1OOIOo4 = oii1OOIOo3.I0001Ioi1lo;
/* 69 */                            i3 = oii1OOIOo4.I00000oOI;
/* 71 */                            byte[] bArr3 = oii1OOIOo4.I00000oIO;
/* 73 */                            i4 = oii1OOIOo4.I0000Il00O;
/* 75 */                            if (oii1OOIOo4 != oii1OOIOo2) {
/* 87 */                                oii1OOIOo = oii1OOIOo4;
/* 88 */                                bArr = bArr3;
                                    } else {
/* 77 */                                if (!z2) {
                                            break loop0;
                                        }
/* 79 */                                bArr = bArr3;
/* 80 */                                oii1OOIOo = null;
                                    }
                                } else {
/* 90 */                            oii1OOIOo = oii1OOIOo3;
/* 91 */                            i4 = i6;
/* 92 */                            i3 = i19;
                                }
/* 93 */                        if (z2) {
/* 95 */                            i = iArr[i20];
/* 97 */                            int i21 = i4;
/* 98 */                            oii1OOIOo3 = oii1OOIOo;
/* 99 */                            i2 = i21;
                                    break;
                                }
/* 101 */                       i5 = i3;
/* 102 */                       i6 = i4;
/* 103 */                       oii1OOIOo3 = oii1OOIOo;
/* 104 */                       i11 = i20;
                            }
                        }
                    } else {
                        return z ? -2 : -1;
                    }
                }
            }
