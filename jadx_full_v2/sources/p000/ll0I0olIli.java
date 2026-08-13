            package p000;
            
            public abstract class ll0I0olIli {
                public static int I00000oIO(byte[] bArr, int i, i111i0I1 i111i0i1) {
/* 1 */             int iI0001Ioi1lo = I0001Ioi1lo(bArr, i, i111i0i1);
/* 5 */             int i2 = i111i0i1.I00000oIO;
/* 8 */             if (i2 < 0) {
/* 37 */                iilo0lOo110.I0001Ioi1lo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 7 */                 return 0;
                    }
/* 12 */            if (i2 > bArr.length - iI0001Ioi1lo) {
/* 31 */                iilo0lOo110.I0001Ioi1lo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 7 */                 return 0;
                    }
/* 14 */            if (i2 == 0) {
/* 18 */                i111i0i1.I0000Il00O = l1l1O1i.I00iiI;
/* 20 */                return iI0001Ioi1lo;
                    }
/* 25 */            i111i0i1.I0000Il00O = l1l1O1i.I000OOo1O(bArr, iI0001Ioi1lo, i2);
/* 27 */            return iI0001Ioi1lo + i2;
                }

                public static int I00000oOI(int i, byte[] bArr) {
/* 3 */             int i2 = bArr[i] & 255;
/* 9 */             int i3 = bArr[i + 1] & 255;
/* 15 */            int i4 = bArr[i + 2] & 255;
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
                }

                public static int I0000Il00O(lO1liolI0IO lo1lioli0io, int i, byte[] bArr, int i2, int i3, lIOIoo1O lioioo1o, i111i0I1 i111i0i1) {
/* 1 */             Object objZze = lo1lioli0io.zze();
/* 5 */             lO1liolI0IO lo1lioli0io2 = lo1lioli0io;
/* 6 */             byte[] bArr2 = bArr;
/* 8 */             int i4 = i3;
/* 9 */             i111i0I1 i111i0i12 = i111i0i1;
/* 10 */            int iI000iOII = I000iOII(objZze, lo1lioli0io2, bArr2, i2, i4, i111i0i12);
/* 14 */            lo1lioli0io2.I00000oIO(objZze);
/* 17 */            i111i0i12.I0000Il00O = objZze;
/* 19 */            lioioo1o.add(objZze);
/* 22 */            while (iI000iOII < i4) {
/* 24 */                i111i0I1 i111i0i13 = i111i0i12;
/* 25 */                int i5 = i4;
/* 26 */                int iI0001Ioi1lo = I0001Ioi1lo(bArr2, iI000iOII, i111i0i13);
/* 32 */                if (i != i111i0i13.I00000oIO) {
                            break;
                        }
/* 35 */                byte[] bArr3 = bArr2;
/* 36 */                lO1liolI0IO lo1lioli0io3 = lo1lioli0io2;
/* 37 */                Object objZze2 = lo1lioli0io3.zze();
/* 41 */                iI000iOII = I000iOII(objZze2, lo1lioli0io3, bArr3, iI0001Ioi1lo, i5, i111i0i13);
/* 46 */                lo1lioli0io2 = lo1lioli0io3;
/* 47 */                bArr2 = bArr3;
/* 48 */                i4 = i5;
/* 49 */                i111i0i12 = i111i0i13;
/* 50 */                lo1lioli0io2.I00000oIO(objZze2);
/* 53 */                i111i0i12.I0000Il00O = objZze2;
/* 55 */                lioioo1o.add(objZze2);
                    }
/* 965 */           return iI000iOII;
                }

                public static int I0000O(byte[] bArr, int i, lIOIoo1O lioioo1o, i111i0I1 i111i0i1) {
/* 1 */             lIIOOOli10 liioooli10 = (lIIOOOli10) lioioo1o;
/* 3 */             int iI0001Ioi1lo = I0001Ioi1lo(bArr, i, i111i0i1);
/* 9 */             int i2 = i111i0i1.I00000oIO + iI0001Ioi1lo;
/* 10 */            while (iI0001Ioi1lo < i2) {
/* 12 */                iI0001Ioi1lo = I0001Ioi1lo(bArr, iI0001Ioi1lo, i111i0i1);
/* 18 */                liioooli10.I0000oI00(i111i0i1.I00000oIO);
                    }
/* 22 */            if (iI0001Ioi1lo == i2) {
/* 24 */                return iI0001Ioi1lo;
                    }
/* 27 */            iilo0lOo110.I0001Ioi1lo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 30 */            return 0;
                }

                public static int I0000oI00(int i, byte[] bArr, int i2, int i3, lOOlilii loolilii, i111i0I1 i111i0i1) {
/* 6 */             if ((i >>> 3) == 0) {
/* 184 */               iilo0lOo110.I0001Ioi1lo("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 8 */             int i4 = i & 7;
/* 10 */            if (i4 == 0) {
/* 170 */               int iI000OOo1O = I000OOo1O(bArr, i2, i111i0i1);
/* 180 */               loolilii.I0000Il00O(i, Long.valueOf(i111i0i1.I00000oOI));
/* 183 */               return iI000OOo1O;
                    }
/* 13 */            if (i4 == 1) {
/* 162 */               loolilii.I0000Il00O(i, Long.valueOf(I000lI(i2, bArr)));
/* 165 */               return i2 + 8;
                    }
/* 16 */            if (i4 == 2) {
/* 112 */               int iI0001Ioi1lo = I0001Ioi1lo(bArr, i2, i111i0i1);
/* 116 */               int i5 = i111i0i1.I00000oIO;
/* 118 */               if (i5 < 0) {
/* 149 */                   iilo0lOo110.I0001Ioi1lo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 3 */                     return 0;
                        }
/* 122 */               if (i5 > bArr.length - iI0001Ioi1lo) {
/* 143 */                   iilo0lOo110.I0001Ioi1lo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 3 */                     return 0;
                        }
/* 124 */               if (i5 == 0) {
/* 128 */                   loolilii.I0000Il00O(i, l1l1O1i.I00iiI);
                        } else {
/* 136 */                   loolilii.I0000Il00O(i, l1l1O1i.I000OOo1O(bArr, iI0001Ioi1lo, i5));
                        }
/* 139 */               return iI0001Ioi1lo + i5;
                    }
/* 19 */            if (i4 != 3) {
/* 22 */                if (i4 == 5) {
/* 32 */                    loolilii.I0000Il00O(i, Integer.valueOf(I00000oOI(i2, bArr)));
/* 35 */                    return i2 + 4;
                        }
/* 38 */                iilo0lOo110.I0001Ioi1lo("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 44 */            int i6 = (i & (-8)) | 4;
/* 46 */            lOOlilii looliliiI00000oOI = lOOlilii.I00000oOI();
/* 52 */            int i7 = i111i0i1.I0000O + 1;
/* 53 */            i111i0i1.I0000O = i7;
/* 57 */            if (i7 >= 100) {
/* 106 */               iilo0lOo110.I0001Ioi1lo("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 3 */                 return 0;
                    }
/* 59 */            int i8 = 0;
                    while (true) {
/* 60 */                if (i2 >= i3) {
                            break;
                        }
/* 62 */                int iI0001Ioi1lo2 = I0001Ioi1lo(bArr, i2, i111i0i1);
/* 66 */                int i9 = i111i0i1.I00000oIO;
/* 68 */                if (i9 == i6) {
/* 70 */                    i8 = i9;
/* 71 */                    i2 = iI0001Ioi1lo2;
                            break;
                        }
/* 78 */                i2 = I0000oI00(i9, bArr, iI0001Ioi1lo2, i3, looliliiI00000oOI, i111i0i1);
/* 82 */                i8 = i9;
                    }
                    i111i0i1.I0000O--;
/* 90 */            if (i2 > i3 || i8 != i6) {
/* 100 */               iilo0lOo110.I0001Ioi1lo("Failed to parse the message.");
/* 3 */                 return 0;
                    }
/* 94 */            loolilii.I0000Il00O(i, looliliiI00000oOI);
/* 97 */            return i2;
                }

                public static int I0001Ioi1lo(byte[] bArr, int i, i111i0I1 i111i0i1) {
/* 1 */             int i2 = i + 1;
/* 3 */             byte b = bArr[i];
/* 5 */             if (b < 0) {
/* 10 */                return I000II(b, bArr, i2, i111i0i1);
                    }
/* 7 */             i111i0i1.I00000oIO = b;
/* 9 */             return i2;
                }

                public static int I000II(int i, byte[] bArr, int i2, i111i0I1 i111i0i1) {
/* 1 */             byte b = bArr[i2];
/* 3 */             int i3 = i2 + 1;
/* 5 */             int i4 = i & 127;
/* 7 */             if (b >= 0) {
/* 12 */                i111i0i1.I00000oIO = i4 | (b << 7);
/* 14 */                return i3;
                    }
/* 19 */            int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
/* 20 */            int i6 = i2 + 2;
/* 22 */            byte b2 = bArr[i3];
/* 24 */            if (b2 >= 0) {
/* 29 */                i111i0i1.I00000oIO = i5 | (b2 << 14);
/* 31 */                return i6;
                    }
/* 36 */            int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
/* 37 */            int i8 = i2 + 3;
/* 39 */            byte b3 = bArr[i6];
/* 41 */            if (b3 >= 0) {
/* 46 */                i111i0i1.I00000oIO = i7 | (b3 << 21);
/* 48 */                return i8;
                    }
/* 53 */            int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
/* 54 */            int i10 = i2 + 4;
/* 56 */            byte b4 = bArr[i8];
/* 58 */            if (b4 >= 0) {
/* 63 */                i111i0i1.I00000oIO = i9 | (b4 << 28);
/* 65 */                return i10;
                    }
/* 70 */            int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
                    while (true) {
/* 71 */                int i12 = i10 + 1;
/* 75 */                if (bArr[i10] >= 0) {
/* 79 */                    i111i0i1.I00000oIO = i11;
/* 204 */                   return i12;
                        }
/* 77 */                i10 = i12;
                    }
                }

                public static int I000O01llI0(int i, byte[] bArr, int i2, int i3, lIOIoo1O lioioo1o, i111i0I1 i111i0i1) {
/* 1 */             lIIOOOli10 liioooli10 = (lIIOOOli10) lioioo1o;
/* 3 */             int iI0001Ioi1lo = I0001Ioi1lo(bArr, i2, i111i0i1);
/* 9 */             liioooli10.I0000oI00(i111i0i1.I00000oIO);
/* 12 */            while (iI0001Ioi1lo < i3) {
/* 14 */                int iI0001Ioi1lo2 = I0001Ioi1lo(bArr, iI0001Ioi1lo, i111i0i1);
/* 20 */                if (i != i111i0i1.I00000oIO) {
                            break;
                        }
/* 23 */                iI0001Ioi1lo = I0001Ioi1lo(bArr, iI0001Ioi1lo2, i111i0i1);
/* 29 */                liioooli10.I0000oI00(i111i0i1.I00000oIO);
                    }
/* 685 */           return iI0001Ioi1lo;
                }

                public static int I000OOo1O(byte[] bArr, int i, i111i0I1 i111i0i1) {
/* 1 */             long j = bArr[i];
/* 8 */             int i2 = i + 1;
/* 10 */            if (j >= 0) {
/* 12 */                i111i0i1.I00000oOI = j;
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
/* 45 */            i111i0i1.I00000oOI = j2;
/* 98 */            return i3;
                }

                public static int I000OiO(Object obj, lO1liolI0IO lo1lioli0io, byte[] bArr, int i, int i2, int i3, i111i0I1 i111i0i1) {
/* 1 */             lO0Oi0 lo0oi0 = (lO0Oi0) lo1lioli0io;
/* 5 */             int i4 = i111i0i1.I0000O + 1;
/* 7 */             i111i0i1.I0000O = i4;
/* 11 */            if (i4 >= 100) {
/* 31 */                iilo0lOo110.I0001Ioi1lo("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 34 */                return 0;
                    }
/* 16 */            int iI00100o1O0lo = lo0oi0.I00100o1O0lo(obj, bArr, i, i2, i3, i111i0i1);
                    i111i0i1.I0000O--;
/* 26 */            i111i0i1.I0000Il00O = obj;
/* 28 */            return iI00100o1O0lo;
                }

                public static int I000iOII(Object obj, lO1liolI0IO lo1lioli0io, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) {
/* 1 */             int iI000II = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iI000II = I000II(i3, bArr, iI000II, i111i0i1);
/* 11 */                i3 = i111i0i1.I00000oIO;
                    }
/* 13 */            int i4 = iI000II;
/* 15 */            if (i3 < 0 || i3 > i2 - i4) {
/* 56 */                iilo0lOo110.I0001Ioi1lo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 14 */                return 0;
                    }
/* 22 */            int i5 = i111i0i1.I0000O + 1;
/* 24 */            i111i0i1.I0000O = i5;
/* 28 */            if (i5 >= 100) {
/* 50 */                iilo0lOo110.I0001Ioi1lo("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 14 */                return 0;
                    }
/* 30 */            int i6 = i4 + i3;
/* 36 */            lo1lioli0io.I000O01llI0(obj, bArr, i4, i6, i111i0i1);
                    i111i0i1.I0000O--;
/* 45 */            i111i0i1.I0000Il00O = obj;
/* 47 */            return i6;
                }

                public static int I000l1(int i, byte[] bArr, int i2, int i3, i111i0I1 i111i0i1) {
/* 6 */             if ((i >>> 3) == 0) {
/* 78 */                iilo0lOo110.I0001Ioi1lo("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 8 */             int i4 = i & 7;
/* 10 */            if (i4 == 0) {
/* 73 */                return I000OOo1O(bArr, i2, i111i0i1);
                    }
/* 13 */            if (i4 == 1) {
/* 70 */                return i2 + 8;
                    }
/* 16 */            if (i4 == 2) {
/* 68 */                return I0001Ioi1lo(bArr, i2, i111i0i1) + i111i0i1.I00000oIO;
                    }
/* 19 */            if (i4 != 3) {
/* 22 */                if (i4 == 5) {
/* 24 */                    return i2 + 4;
                        }
/* 27 */                iilo0lOo110.I0001Ioi1lo("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 33 */            int i5 = (i & (-8)) | 4;
/* 35 */            int i6 = 0;
/* 36 */            while (i2 < i3) {
/* 38 */                i2 = I0001Ioi1lo(bArr, i2, i111i0i1);
/* 42 */                i6 = i111i0i1.I00000oIO;
/* 44 */                if (i6 == i5) {
                            break;
                        }
/* 46 */                i2 = I000l1(i6, bArr, i2, i3, i111i0i1);
                    }
/* 51 */            if (i2 <= i3 && i6 == i5) {
/* 55 */                return i2;
                    }
/* 58 */            iilo0lOo110.I0001Ioi1lo("Failed to parse the message.");
/* 3 */             return 0;
                }

                public static long I000lI(int i, byte[] bArr) {
/* 91 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
                }
            }
