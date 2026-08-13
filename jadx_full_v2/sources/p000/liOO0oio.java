            package p000;
            
            public abstract class liOO0oio {
                public static int I00000oIO(byte[] bArr, int i, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             int iI0001Ioi1lo = I0001Ioi1lo(bArr, i, i1o1ll0i0);
/* 5 */             int i2 = i1o1ll0i0.I00000oIO;
/* 7 */             if (i2 < 0) {
/* 98 */                throw new i1ioIilo10("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
/* 11 */            if (i2 > bArr.length - iI0001Ioi1lo) {
/* 35 */                throw new i1ioIilo10("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
/* 13 */            if (i2 == 0) {
/* 17 */                i1o1ll0i0.I0000Il00O = i1OOli0lO.I00iiO;
/* 19 */                return iI0001Ioi1lo;
                    }
/* 24 */            i1o1ll0i0.I0000Il00O = i1OOli0lO.I000OOo1O(bArr, iI0001Ioi1lo, i2);
/* 26 */            return iI0001Ioi1lo + i2;
                }

                public static int I00000oOI(int i, byte[] bArr) {
/* 3 */             int i2 = bArr[i] & 255;
/* 9 */             int i3 = bArr[i + 1] & 255;
/* 15 */            int i4 = bArr[i + 2] & 255;
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
                }

                public static int I0000Il00O(i1o1Oo i1o1oo, byte[] bArr, int i, int i2, int i3, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             i1ii0Io i1ii0ioZzd = i1o1oo.zzd();
/* 11 */            int iI000OOo1O = I000OOo1O(i1ii0ioZzd, i1o1oo, bArr, i, i2, i3, i1o1ll0i0);
/* 15 */            i1o1oo.zze(i1ii0ioZzd);
/* 18 */            i1o1ll0i0.I0000Il00O = i1ii0ioZzd;
/* 685 */           return iI000OOo1O;
                }

                public static int I0000O(i1o1Oo i1o1oo, int i, byte[] bArr, int i2, int i3, i1iliO0I i1ilio0i, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             i1ii0Io i1ii0ioZzd = i1o1oo.zzd();
/* 5 */             i1o1Oo i1o1oo2 = i1o1oo;
/* 6 */             byte[] bArr2 = bArr;
/* 8 */             int i4 = i3;
/* 9 */             i1O1ll0i0 i1o1ll0i02 = i1o1ll0i0;
/* 10 */            int iI000OiO = I000OiO(i1ii0ioZzd, i1o1oo2, bArr2, i2, i4, i1o1ll0i02);
/* 14 */            i1o1oo2.zze(i1ii0ioZzd);
/* 17 */            i1o1ll0i02.I0000Il00O = i1ii0ioZzd;
/* 19 */            i1ilio0i.add(i1ii0ioZzd);
/* 22 */            while (iI000OiO < i4) {
/* 24 */                i1O1ll0i0 i1o1ll0i03 = i1o1ll0i02;
/* 25 */                int i5 = i4;
/* 26 */                int iI0001Ioi1lo = I0001Ioi1lo(bArr2, iI000OiO, i1o1ll0i03);
/* 32 */                if (i != i1o1ll0i03.I00000oIO) {
                            break;
                        }
/* 35 */                byte[] bArr3 = bArr2;
/* 36 */                i1o1Oo i1o1oo3 = i1o1oo2;
/* 37 */                i1ii0Io i1ii0ioZzd2 = i1o1oo3.zzd();
/* 41 */                iI000OiO = I000OiO(i1ii0ioZzd2, i1o1oo3, bArr3, iI0001Ioi1lo, i5, i1o1ll0i03);
/* 46 */                i1o1oo2 = i1o1oo3;
/* 47 */                bArr2 = bArr3;
/* 48 */                i4 = i5;
/* 49 */                i1o1ll0i02 = i1o1ll0i03;
/* 50 */                i1o1oo2.zze(i1ii0ioZzd2);
/* 53 */                i1o1ll0i02.I0000Il00O = i1ii0ioZzd2;
/* 55 */                i1ilio0i.add(i1ii0ioZzd2);
                    }
/* 965 */           return iI000OiO;
                }

                public static int I0000oI00(int i, byte[] bArr, int i2, int i3, i1oi1lOoII1 i1oi1looii1, i1O1ll0i0 i1o1ll0i0) {
/* 5 */             if ((i >>> 3) == 0) {
/* 685 */               throw new i1ioIilo10("Protocol message contained an invalid tag (zero).");
                    }
/* 7 */             int i4 = i & 7;
/* 9 */             if (i4 == 0) {
/* 179 */               int iI000O01llI0 = I000O01llI0(bArr, i2, i1o1ll0i0);
/* 189 */               i1oi1looii1.I00000oOI(i, Long.valueOf(i1o1ll0i0.I00000oOI));
/* 192 */               return iI000O01llI0;
                    }
/* 12 */            if (i4 == 1) {
/* 171 */               i1oi1looii1.I00000oOI(i, Long.valueOf(I000iOII(i2, bArr)));
/* 174 */               return i2 + 8;
                    }
/* 15 */            if (i4 == 2) {
/* 117 */               int iI0001Ioi1lo = I0001Ioi1lo(bArr, i2, i1o1ll0i0);
/* 121 */               int i5 = i1o1ll0i0.I00000oIO;
/* 123 */               if (i5 < 0) {
/* 161 */                   throw new i1ioIilo10("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                        }
/* 127 */               if (i5 > bArr.length - iI0001Ioi1lo) {
/* 153 */                   throw new i1ioIilo10("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
/* 129 */               if (i5 == 0) {
/* 133 */                   i1oi1looii1.I00000oOI(i, i1OOli0lO.I00iiO);
                        } else {
/* 141 */                   i1oi1looii1.I00000oOI(i, i1OOli0lO.I000OOo1O(bArr, iI0001Ioi1lo, i5));
                        }
/* 144 */               return iI0001Ioi1lo + i5;
                    }
/* 18 */            if (i4 != 3) {
/* 21 */                if (i4 != 5) {
/* 42 */                    throw new i1ioIilo10("Protocol message contained an invalid tag (zero).");
                        }
/* 31 */                i1oi1looii1.I00000oOI(i, Integer.valueOf(I00000oOI(i2, bArr)));
/* 34 */                return i2 + 4;
                    }
/* 45 */            int i6 = (i & (-8)) | 4;
/* 47 */            i1oi1lOoII1 i1oi1looii1I00000oIO = i1oi1lOoII1.I00000oIO();
/* 53 */            int i7 = i1o1ll0i0.I0000O + 1;
/* 54 */            i1o1ll0i0.I0000O = i7;
/* 58 */            if (i7 >= 100) {
/* 114 */               throw new i1ioIilo10("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
/* 60 */            int i8 = 0;
                    while (true) {
/* 61 */                if (i2 >= i3) {
                            break;
                        }
/* 63 */                int iI0001Ioi1lo2 = I0001Ioi1lo(bArr, i2, i1o1ll0i0);
/* 67 */                int i9 = i1o1ll0i0.I00000oIO;
/* 69 */                if (i9 == i6) {
/* 71 */                    i8 = i9;
/* 72 */                    i2 = iI0001Ioi1lo2;
                            break;
                        }
/* 79 */                i2 = I0000oI00(i9, bArr, iI0001Ioi1lo2, i3, i1oi1looii1I00000oIO, i1o1ll0i0);
/* 83 */                i8 = i9;
                    }
                    i1o1ll0i0.I0000O--;
/* 91 */            if (i2 > i3 || i8 != i6) {
/* 106 */               throw new i1ioIilo10("Failed to parse the message.");
                    }
/* 95 */            i1oi1looii1.I00000oOI(i, i1oi1looii1I00000oIO);
/* 98 */            return i2;
                }

                public static int I0001Ioi1lo(byte[] bArr, int i, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             int i2 = i + 1;
/* 3 */             byte b = bArr[i];
/* 5 */             if (b < 0) {
/* 10 */                return I000II(b, bArr, i2, i1o1ll0i0);
                    }
/* 7 */             i1o1ll0i0.I00000oIO = b;
/* 9 */             return i2;
                }

                public static int I000II(int i, byte[] bArr, int i2, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             byte b = bArr[i2];
/* 3 */             int i3 = i2 + 1;
/* 5 */             int i4 = i & 127;
/* 7 */             if (b >= 0) {
/* 12 */                i1o1ll0i0.I00000oIO = i4 | (b << 7);
/* 14 */                return i3;
                    }
/* 19 */            int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
/* 20 */            int i6 = i2 + 2;
/* 22 */            byte b2 = bArr[i3];
/* 24 */            if (b2 >= 0) {
/* 29 */                i1o1ll0i0.I00000oIO = i5 | (b2 << 14);
/* 31 */                return i6;
                    }
/* 36 */            int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
/* 37 */            int i8 = i2 + 3;
/* 39 */            byte b3 = bArr[i6];
/* 41 */            if (b3 >= 0) {
/* 46 */                i1o1ll0i0.I00000oIO = i7 | (b3 << 21);
/* 48 */                return i8;
                    }
/* 53 */            int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
/* 54 */            int i10 = i2 + 4;
/* 56 */            byte b4 = bArr[i8];
/* 58 */            if (b4 >= 0) {
/* 63 */                i1o1ll0i0.I00000oIO = i9 | (b4 << 28);
/* 65 */                return i10;
                    }
/* 70 */            int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
                    while (true) {
/* 71 */                int i12 = i10 + 1;
/* 75 */                if (bArr[i10] >= 0) {
/* 79 */                    i1o1ll0i0.I00000oIO = i11;
/* 204 */                   return i12;
                        }
/* 77 */                i10 = i12;
                    }
                }

                public static int I000O01llI0(byte[] bArr, int i, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             long j = bArr[i];
/* 8 */             int i2 = i + 1;
/* 10 */            if (j >= 0) {
/* 12 */                i1o1ll0i0.I00000oOI = j;
/* 14 */                return i2;
                    }
/* 15 */            int i3 = i + 2;
/* 17 */            byte b = bArr[i2];
/* 27 */            long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
/* 28 */            int i4 = 7;
/* 29 */            while (b < 0) {
/* 31 */                int i5 = i3 + 1;
/* 35 */                i4 += 7;
/* 40 */                j2 |= (r10 & Byte.MAX_VALUE) << i4;
/* 33 */                b = bArr[i3];
/* 43 */                i3 = i5;
                    }
/* 45 */            i1o1ll0i0.I00000oOI = j2;
/* 98 */            return i3;
                }

                public static int I000OOo1O(Object obj, i1o1Oo i1o1oo, byte[] bArr, int i, int i2, int i3, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             i1lo1lloo01 i1lo1lloo01Var = (i1lo1lloo01) i1o1oo;
/* 5 */             int i4 = i1o1ll0i0.I0000O + 1;
/* 7 */             i1o1ll0i0.I0000O = i4;
/* 11 */            if (i4 >= 100) {
/* 965 */               throw new i1ioIilo10("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
/* 16 */            int iI000OOo1O = i1lo1lloo01Var.I000OOo1O(obj, bArr, i, i2, i3, i1o1ll0i0);
                    i1o1ll0i0.I0000O--;
/* 26 */            i1o1ll0i0.I0000Il00O = obj;
/* 28 */            return iI000OOo1O;
                }

                public static int I000OiO(Object obj, i1o1Oo i1o1oo, byte[] bArr, int i, int i2, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             int iI000II = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iI000II = I000II(i3, bArr, iI000II, i1o1ll0i0);
/* 11 */                i3 = i1o1ll0i0.I00000oIO;
                    }
/* 13 */            int i4 = iI000II;
/* 14 */            if (i3 < 0 || i3 > i2 - i4) {
/* 685 */               throw new i1ioIilo10("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
/* 21 */            int i5 = i1o1ll0i0.I0000O + 1;
/* 23 */            i1o1ll0i0.I0000O = i5;
/* 27 */            if (i5 >= 100) {
/* 54 */                throw new i1ioIilo10("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
/* 29 */            int i6 = i4 + i3;
/* 35 */            i1o1oo.I0000Il00O(obj, bArr, i4, i6, i1o1ll0i0);
                    i1o1ll0i0.I0000O--;
/* 44 */            i1o1ll0i0.I0000Il00O = obj;
/* 46 */            return i6;
                }

                public static long I000iOII(int i, byte[] bArr) {
/* 91 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
                }
            }
