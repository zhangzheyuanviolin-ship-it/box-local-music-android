            package p000;
            
            public abstract class liOiOioooO {
                public static int I00000oIO(byte[] bArr, int i, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             int i2 = i + 1;
/* 3 */             byte b = bArr[i];
/* 5 */             if (b < 0) {
/* 10 */                return I00000oOI(b, bArr, i2, i1o1ll0i0);
                    }
/* 7 */             i1o1ll0i0.I00000oIO = b;
/* 9 */             return i2;
                }

                public static int I00000oOI(int i, byte[] bArr, int i2, i1O1ll0i0 i1o1ll0i0) {
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

                public static int I0000Il00O(byte[] bArr, int i, i1O1ll0i0 i1o1ll0i0) {
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

                public static int I0000O(int i, byte[] bArr) {
/* 3 */             int i2 = bArr[i] & 255;
/* 9 */             int i3 = bArr[i + 1] & 255;
/* 15 */            int i4 = bArr[i + 2] & 255;
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
                }

                public static long I0000oI00(int i, byte[] bArr) {
/* 91 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
                }

                public static int I0001Ioi1lo(byte[] bArr, int i, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             int iI00000oIO = I00000oIO(bArr, i, i1o1ll0i0);
/* 5 */             int i2 = i1o1ll0i0.I00000oIO;
/* 7 */             if (i2 < 0) {
/* 26 */                iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 29 */                return 0;
                    }
/* 9 */             if (i2 == 0) {
/* 13 */                i1o1ll0i0.I0000Il00O = "";
/* 15 */                return iI00000oIO;
                    }
/* 20 */            i1o1ll0i0.I0000Il00O = iI1i1o0lIl1o.I0000O(bArr, iI00000oIO, i2);
/* 22 */            return iI00000oIO + i2;
                }

                public static int I000II(byte[] bArr, int i, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             int iI00000oIO = I00000oIO(bArr, i, i1o1ll0i0);
/* 5 */             int i2 = i1o1ll0i0.I00000oIO;
/* 8 */             if (i2 < 0) {
/* 37 */                iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 7 */                 return 0;
                    }
/* 12 */            if (i2 > bArr.length - iI00000oIO) {
/* 31 */                iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 7 */                 return 0;
                    }
/* 14 */            if (i2 == 0) {
/* 18 */                i1o1ll0i0.I0000Il00O = i1lIIl01O.I00iiI;
/* 20 */                return iI00000oIO;
                    }
/* 25 */            i1o1ll0i0.I0000Il00O = i1lIIl01O.I000lI(bArr, iI00000oIO, i2);
/* 27 */            return iI00000oIO + i2;
                }

                public static int I000O01llI0(Object obj, iI110OIoiOl ii110oioiol, byte[] bArr, int i, int i2, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             int iI00000oOI = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iI00000oOI = I00000oOI(i3, bArr, iI00000oOI, i1o1ll0i0);
/* 11 */                i3 = i1o1ll0i0.I00000oIO;
                    }
/* 13 */            int i4 = iI00000oOI;
/* 15 */            if (i3 < 0 || i3 > i2 - i4) {
/* 56 */                iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 14 */                return 0;
                    }
/* 22 */            int i5 = i1o1ll0i0.I0000O + 1;
/* 24 */            i1o1ll0i0.I0000O = i5;
/* 28 */            if (i5 >= 100) {
/* 50 */                iilo0lOo110.I000II("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 14 */                return 0;
                    }
/* 30 */            int i6 = i4 + i3;
/* 36 */            ii110oioiol.I000II(obj, bArr, i4, i6, i1o1ll0i0);
                    i1o1ll0i0.I0000O--;
/* 45 */            i1o1ll0i0.I0000Il00O = obj;
/* 47 */            return i6;
                }

                public static int I000OOo1O(Object obj, iI110OIoiOl ii110oioiol, byte[] bArr, int i, int i2, int i3, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             iI0oOI1oolI1 ii0ooi1ooli1 = (iI0oOI1oolI1) ii110oioiol;
/* 5 */             int i4 = i1o1ll0i0.I0000O + 1;
/* 7 */             i1o1ll0i0.I0000O = i4;
/* 11 */            if (i4 >= 100) {
/* 31 */                iilo0lOo110.I000II("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 34 */                return 0;
                    }
/* 16 */            int iI001i1O0Ol = ii0ooi1ooli1.I001i1O0Ol(obj, bArr, i, i2, i3, i1o1ll0i0);
                    i1o1ll0i0.I0000O--;
/* 26 */            i1o1ll0i0.I0000Il00O = obj;
/* 28 */            return iI001i1O0Ol;
                }

                public static int I000OiO(int i, byte[] bArr, int i2, int i3, iI00IlI1oII ii00ili1oii, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             i1oiI1lIo i1oii1lio = (i1oiI1lIo) ii00ili1oii;
/* 3 */             int iI00000oIO = I00000oIO(bArr, i2, i1o1ll0i0);
/* 9 */             i1oii1lio.I0001Ioi1lo(i1o1ll0i0.I00000oIO);
/* 12 */            while (iI00000oIO < i3) {
/* 14 */                int iI00000oIO2 = I00000oIO(bArr, iI00000oIO, i1o1ll0i0);
/* 20 */                if (i != i1o1ll0i0.I00000oIO) {
                            break;
                        }
/* 23 */                iI00000oIO = I00000oIO(bArr, iI00000oIO2, i1o1ll0i0);
/* 29 */                i1oii1lio.I0001Ioi1lo(i1o1ll0i0.I00000oIO);
                    }
/* 685 */           return iI00000oIO;
                }

                public static int I000iOII(byte[] bArr, int i, iI00IlI1oII ii00ili1oii, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             i1oiI1lIo i1oii1lio = (i1oiI1lIo) ii00ili1oii;
/* 3 */             int iI00000oIO = I00000oIO(bArr, i, i1o1ll0i0);
/* 9 */             int i2 = i1o1ll0i0.I00000oIO + iI00000oIO;
/* 10 */            while (iI00000oIO < i2) {
/* 12 */                iI00000oIO = I00000oIO(bArr, iI00000oIO, i1o1ll0i0);
/* 18 */                i1oii1lio.I0001Ioi1lo(i1o1ll0i0.I00000oIO);
                    }
/* 22 */            if (iI00000oIO == i2) {
/* 24 */                return iI00000oIO;
                    }
/* 27 */            iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 30 */            return 0;
                }

                public static int I000l1(iI110OIoiOl ii110oioiol, int i, byte[] bArr, int i2, int i3, iI00IlI1oII ii00ili1oii, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             i1oi01OllI i1oi01olliZza = ii110oioiol.zza();
/* 5 */             iI110OIoiOl ii110oioiol2 = ii110oioiol;
/* 6 */             byte[] bArr2 = bArr;
/* 8 */             int i4 = i3;
/* 9 */             i1O1ll0i0 i1o1ll0i02 = i1o1ll0i0;
/* 10 */            int iI000O01llI0 = I000O01llI0(i1oi01olliZza, ii110oioiol2, bArr2, i2, i4, i1o1ll0i02);
/* 14 */            ii110oioiol2.I0000Il00O(i1oi01olliZza);
/* 17 */            i1o1ll0i02.I0000Il00O = i1oi01olliZza;
/* 19 */            ii00ili1oii.add(i1oi01olliZza);
/* 22 */            while (iI000O01llI0 < i4) {
/* 24 */                i1O1ll0i0 i1o1ll0i03 = i1o1ll0i02;
/* 25 */                int i5 = i4;
/* 26 */                int iI00000oIO = I00000oIO(bArr2, iI000O01llI0, i1o1ll0i03);
/* 32 */                if (i != i1o1ll0i03.I00000oIO) {
                            break;
                        }
/* 35 */                byte[] bArr3 = bArr2;
/* 36 */                iI110OIoiOl ii110oioiol3 = ii110oioiol2;
/* 37 */                i1oi01OllI i1oi01olliZza2 = ii110oioiol3.zza();
/* 41 */                iI000O01llI0 = I000O01llI0(i1oi01olliZza2, ii110oioiol3, bArr3, iI00000oIO, i5, i1o1ll0i03);
/* 46 */                ii110oioiol2 = ii110oioiol3;
/* 47 */                bArr2 = bArr3;
/* 48 */                i4 = i5;
/* 49 */                i1o1ll0i02 = i1o1ll0i03;
/* 50 */                ii110oioiol2.I0000Il00O(i1oi01olliZza2);
/* 53 */                i1o1ll0i02.I0000Il00O = i1oi01olliZza2;
/* 55 */                ii00ili1oii.add(i1oi01olliZza2);
                    }
/* 965 */           return iI000O01llI0;
                }

                public static int I000lI(int i, byte[] bArr, int i2, int i3, iI1O01I1 ii1o01i1, i1O1ll0i0 i1o1ll0i0) {
/* 6 */             if ((i >>> 3) == 0) {
/* 184 */               iilo0lOo110.I000II("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 8 */             int i4 = i & 7;
/* 10 */            if (i4 == 0) {
/* 170 */               int iI0000Il00O = I0000Il00O(bArr, i2, i1o1ll0i0);
/* 180 */               ii1o01i1.I0000O(i, Long.valueOf(i1o1ll0i0.I00000oOI));
/* 183 */               return iI0000Il00O;
                    }
/* 13 */            if (i4 == 1) {
/* 162 */               ii1o01i1.I0000O(i, Long.valueOf(I0000oI00(i2, bArr)));
/* 165 */               return i2 + 8;
                    }
/* 16 */            if (i4 == 2) {
/* 112 */               int iI00000oIO = I00000oIO(bArr, i2, i1o1ll0i0);
/* 116 */               int i5 = i1o1ll0i0.I00000oIO;
/* 118 */               if (i5 < 0) {
/* 149 */                   iilo0lOo110.I000II("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 3 */                     return 0;
                        }
/* 122 */               if (i5 > bArr.length - iI00000oIO) {
/* 143 */                   iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 3 */                     return 0;
                        }
/* 124 */               if (i5 == 0) {
/* 128 */                   ii1o01i1.I0000O(i, i1lIIl01O.I00iiI);
                        } else {
/* 136 */                   ii1o01i1.I0000O(i, i1lIIl01O.I000lI(bArr, iI00000oIO, i5));
                        }
/* 139 */               return iI00000oIO + i5;
                    }
/* 19 */            if (i4 != 3) {
/* 22 */                if (i4 == 5) {
/* 32 */                    ii1o01i1.I0000O(i, Integer.valueOf(I0000O(i2, bArr)));
/* 35 */                    return i2 + 4;
                        }
/* 38 */                iilo0lOo110.I000II("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 44 */            int i6 = (i & (-8)) | 4;
/* 46 */            iI1O01I1 ii1o01i1I00000oIO = iI1O01I1.I00000oIO();
/* 52 */            int i7 = i1o1ll0i0.I0000O + 1;
/* 53 */            i1o1ll0i0.I0000O = i7;
/* 57 */            if (i7 >= 100) {
/* 106 */               iilo0lOo110.I000II("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 3 */                 return 0;
                    }
/* 59 */            int i8 = 0;
                    while (true) {
/* 60 */                if (i2 >= i3) {
                            break;
                        }
/* 62 */                int iI00000oIO2 = I00000oIO(bArr, i2, i1o1ll0i0);
/* 66 */                int i9 = i1o1ll0i0.I00000oIO;
/* 68 */                if (i9 == i6) {
/* 70 */                    i8 = i9;
/* 71 */                    i2 = iI00000oIO2;
                            break;
                        }
/* 78 */                i2 = I000lI(i9, bArr, iI00000oIO2, i3, ii1o01i1I00000oIO, i1o1ll0i0);
/* 82 */                i8 = i9;
                    }
                    i1o1ll0i0.I0000O--;
/* 90 */            if (i2 > i3 || i8 != i6) {
/* 100 */               iilo0lOo110.I000II("Failed to parse the message.");
/* 3 */                 return 0;
                    }
/* 94 */            ii1o01i1.I0000O(i, ii1o01i1I00000oIO);
/* 97 */            return i2;
                }

                public static int I000o00OoI0I(int i, byte[] bArr, int i2, int i3, i1O1ll0i0 i1o1ll0i0) {
/* 6 */             if ((i >>> 3) == 0) {
/* 78 */                iilo0lOo110.I000II("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 8 */             int i4 = i & 7;
/* 10 */            if (i4 == 0) {
/* 73 */                return I0000Il00O(bArr, i2, i1o1ll0i0);
                    }
/* 13 */            if (i4 == 1) {
/* 70 */                return i2 + 8;
                    }
/* 16 */            if (i4 == 2) {
/* 68 */                return I00000oIO(bArr, i2, i1o1ll0i0) + i1o1ll0i0.I00000oIO;
                    }
/* 19 */            if (i4 != 3) {
/* 22 */                if (i4 == 5) {
/* 24 */                    return i2 + 4;
                        }
/* 27 */                iilo0lOo110.I000II("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 33 */            int i5 = (i & (-8)) | 4;
/* 35 */            int i6 = 0;
/* 36 */            while (i2 < i3) {
/* 38 */                i2 = I00000oIO(bArr, i2, i1o1ll0i0);
/* 42 */                i6 = i1o1ll0i0.I00000oIO;
/* 44 */                if (i6 == i5) {
                            break;
                        }
/* 46 */                i2 = I000o00OoI0I(i6, bArr, i2, i3, i1o1ll0i0);
                    }
/* 51 */            if (i2 <= i3 && i6 == i5) {
/* 55 */                return i2;
                    }
/* 58 */            iilo0lOo110.I000II("Failed to parse the message.");
/* 3 */             return 0;
                }
            }
