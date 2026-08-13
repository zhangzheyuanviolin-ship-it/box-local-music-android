            package p000;
            
            public abstract class liOI1I0oIO {
                public static int I00000oIO(byte[] bArr, int i, i111i0I1 i111i0i1) {
/* 1 */             int iI000O01llI0 = I000O01llI0(bArr, i, i111i0i1);
/* 5 */             int i2 = i111i0i1.I00000oIO;
/* 8 */             if (i2 < 0) {
/* 37 */                OoOil11Ol1o.I001IIilI0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 7 */                 return 0;
                    }
/* 12 */            if (i2 > bArr.length - iI000O01llI0) {
/* 31 */                OoOil11Ol1o.I001IIilI0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 7 */                 return 0;
                    }
/* 14 */            if (i2 == 0) {
/* 18 */                i111i0i1.I0000Il00O = i11I0IiII0Ol.I00iiI;
/* 20 */                return iI000O01llI0;
                    }
/* 25 */            i111i0i1.I0000Il00O = i11I0IiII0Ol.I000OOo1O(bArr, iI000O01llI0, i2);
/* 27 */            return iI000O01llI0 + i2;
                }

                public static int I00000oOI(int i, byte[] bArr) {
/* 3 */             int i2 = bArr[i] & 255;
/* 9 */             int i3 = bArr[i + 1] & 255;
/* 15 */            int i4 = bArr[i + 2] & 255;
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
                }

                public static int I0000Il00O(i11lo1 i11lo1Var, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) {
/* 1 */             Object objI000OOo1O = i11lo1Var.I000OOo1O();
/* 10 */            int iI000lI = I000lI(objI000OOo1O, i11lo1Var, bArr, i, i2, i111i0i1);
/* 14 */            i11lo1Var.I0000oI00(objI000OOo1O);
/* 17 */            i111i0i1.I0000Il00O = objI000OOo1O;
/* 399 */           return iI000lI;
                }

                public static int I0000O(i11lo1 i11lo1Var, int i, byte[] bArr, int i2, int i3, i11Oi1oO i11oi1oo, i111i0I1 i111i0i1) {
/* 1 */             int iI0000Il00O = I0000Il00O(i11lo1Var, bArr, i2, i3, i111i0i1);
/* 7 */             i11oi1oo.add(i111i0i1.I0000Il00O);
/* 10 */            while (iI0000Il00O < i3) {
/* 12 */                int iI000O01llI0 = I000O01llI0(bArr, iI0000Il00O, i111i0i1);
/* 18 */                if (i != i111i0i1.I00000oIO) {
                            break;
                        }
/* 21 */                iI0000Il00O = I0000Il00O(i11lo1Var, bArr, iI000O01llI0, i3, i111i0i1);
/* 27 */                i11oi1oo.add(i111i0i1.I0000Il00O);
                    }
/* 965 */           return iI0000Il00O;
                }

                public static int I0000oI00(byte[] bArr, int i, i11Oi1oO i11oi1oo, i111i0I1 i111i0i1) {
/* 1 */             i11OIo i11oio = (i11OIo) i11oi1oo;
/* 3 */             int iI000O01llI0 = I000O01llI0(bArr, i, i111i0i1);
/* 9 */             int i2 = i111i0i1.I00000oIO + iI000O01llI0;
/* 10 */            while (iI000O01llI0 < i2) {
/* 12 */                iI000O01llI0 = I000O01llI0(bArr, iI000O01llI0, i111i0i1);
/* 18 */                i11oio.I0000oI00(i111i0i1.I00000oIO);
                    }
/* 22 */            if (iI000O01llI0 == i2) {
/* 24 */                return iI000O01llI0;
                    }
/* 27 */            OoOil11Ol1o.I001IIilI0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 30 */            return 0;
                }

                public static int I0001Ioi1lo(byte[] bArr, int i, i111i0I1 i111i0i1) {
/* 1 */             int iI000O01llI0 = I000O01llI0(bArr, i, i111i0i1);
/* 5 */             int i2 = i111i0i1.I00000oIO;
/* 8 */             if (i2 < 0) {
/* 316 */               OoOil11Ol1o.I001IIilI0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 7 */                 return 0;
                    }
/* 10 */            if (i2 == 0) {
/* 14 */                i111i0i1.I0000Il00O = "";
/* 16 */                return iI000O01llI0;
                    }
/* 17 */            int i3 = i11oIi1.I00000oIO;
/* 19 */            int length = bArr.length;
/* 26 */            if ((((length - iI000O01llI0) - i2) | iI000O01llI0 | i2) < 0) {
/* 310 */               OoOil11Ol1o.I000o00OoI0I("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iI000O01llI0), Integer.valueOf(i2)});
/* 7 */                 return 0;
                    }
/* 28 */            int i4 = iI000O01llI0 + i2;
/* 30 */            char[] cArr = new char[i2];
/* 32 */            int i5 = 0;
/* 33 */            while (iI000O01llI0 < i4) {
/* 35 */                byte b = bArr[iI000O01llI0];
/* 37 */                if (b < 0) {
                            break;
                        }
/* 39 */                iI000O01llI0++;
/* 44 */                cArr[i5] = (char) b;
/* 41 */                i5++;
                    }
/* 48 */            while (iI000O01llI0 < i4) {
/* 50 */                int i6 = iI000O01llI0 + 1;
/* 52 */                byte b2 = bArr[iI000O01llI0];
/* 54 */                if (b2 >= 0) {
/* 59 */                    cArr[i5] = (char) b2;
/* 56 */                    i5++;
/* 62 */                    iI000O01llI0 = i6;
/* 63 */                    while (iI000O01llI0 < i4) {
/* 65 */                        byte b3 = bArr[iI000O01llI0];
/* 67 */                        if (b3 >= 0) {
/* 69 */                            iI000O01llI0++;
/* 74 */                            cArr[i5] = (char) b3;
/* 71 */                            i5++;
                                }
                            }
                        } else {
/* 82 */                    if (b2 >= -32) {
/* 124 */                       if (b2 >= -16) {
/* 194 */                           if (i6 >= i4 - 2) {
/* 280 */                               OoOil11Ol1o.I001IIilI0O("Protocol message had invalid UTF-8.");
/* 7 */                                 return 0;
                                    }
/* 198 */                           byte b4 = bArr[i6];
/* 200 */                           int i7 = iI000O01llI0 + 3;
/* 202 */                           byte b5 = bArr[iI000O01llI0 + 2];
/* 204 */                           iI000O01llI0 += 4;
/* 206 */                           byte b6 = bArr[i7];
/* 212 */                           if (!liOIooOo1OII.I00000oIO(b4)) {
/* 221 */                               if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !liOIooOo1OII.I00000oIO(b5) && !liOIooOo1OII.I00000oIO(b6)) {
/* 251 */                                   int i8 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
/* 259 */                                   cArr[i5] = (char) ((i8 >>> 10) + 55232);
/* 270 */                                   cArr[i5 + 1] = (char) ((i8 & 1023) + 56320);
/* 272 */                                   i5 += 2;
                                        }
                                    }
/* 276 */                           OoOil11Ol1o.I001IIilI0O("Protocol message had invalid UTF-8.");
/* 7 */                             return 0;
                                }
/* 128 */                       if (i6 >= i4 - 1) {
/* 188 */                           OoOil11Ol1o.I001IIilI0O("Protocol message had invalid UTF-8.");
/* 7 */                             return 0;
                                }
/* 130 */                       int i9 = i5 + 1;
/* 132 */                       int i10 = iI000O01llI0 + 2;
/* 134 */                       byte b7 = bArr[i6];
/* 136 */                       iI000O01llI0 += 3;
/* 138 */                       byte b8 = bArr[i10];
/* 144 */                       if (!liOIooOo1OII.I00000oIO(b7)) {
/* 148 */                           if (b2 == -32) {
/* 150 */                               if (b7 >= -96) {
/* 152 */                                   b2 = -32;
                                        }
                                    }
/* 155 */                           if (b2 == -19) {
/* 157 */                               if (b7 < -96) {
/* 159 */                                   b2 = -19;
                                        }
                                    }
/* 164 */                           if (!liOIooOo1OII.I00000oIO(b8)) {
/* 179 */                               cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
/* 181 */                               i5 = i9;
                                    }
                                }
/* 184 */                       OoOil11Ol1o.I001IIilI0O("Protocol message had invalid UTF-8.");
/* 7 */                         return 0;
                            }
/* 84 */                    if (i6 >= i4) {
/* 118 */                       OoOil11Ol1o.I001IIilI0O("Protocol message had invalid UTF-8.");
/* 7 */                         return 0;
                            }
/* 86 */                    int i11 = i5 + 1;
/* 88 */                    iI000O01llI0 += 2;
/* 90 */                    byte b9 = bArr[i6];
/* 94 */                    if (b2 < -62 || liOIooOo1OII.I00000oIO(b9)) {
/* 114 */                       OoOil11Ol1o.I001IIilI0O("Protocol message had invalid UTF-8.");
/* 7 */                         return 0;
                            }
/* 110 */                   cArr[i5] = (char) ((b9 & 63) | ((b2 & 31) << 6));
/* 112 */                   i5 = i11;
                        }
                    }
/* 289 */           i111i0i1.I0000Il00O = new String(cArr, 0, i5);
/* 291 */           return i4;
                }

                public static int I000II(int i, byte[] bArr, int i2, int i3, i11o1i i11o1iVar, i111i0I1 i111i0i1) {
/* 6 */             if ((i >>> 3) == 0) {
/* 184 */               OoOil11Ol1o.I001IIilI0O("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 8 */             int i4 = i & 7;
/* 10 */            if (i4 == 0) {
/* 170 */               int iI000iOII = I000iOII(bArr, i2, i111i0i1);
/* 180 */               i11o1iVar.I0000Il00O(i, Long.valueOf(i111i0i1.I00000oOI));
/* 183 */               return iI000iOII;
                    }
/* 13 */            if (i4 == 1) {
/* 162 */               i11o1iVar.I0000Il00O(i, Long.valueOf(I000oI1ioi(i2, bArr)));
/* 165 */               return i2 + 8;
                    }
/* 16 */            if (i4 == 2) {
/* 112 */               int iI000O01llI0 = I000O01llI0(bArr, i2, i111i0i1);
/* 116 */               int i5 = i111i0i1.I00000oIO;
/* 118 */               if (i5 < 0) {
/* 149 */                   OoOil11Ol1o.I001IIilI0O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 3 */                     return 0;
                        }
/* 122 */               if (i5 > bArr.length - iI000O01llI0) {
/* 143 */                   OoOil11Ol1o.I001IIilI0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 3 */                     return 0;
                        }
/* 124 */               if (i5 == 0) {
/* 128 */                   i11o1iVar.I0000Il00O(i, i11I0IiII0Ol.I00iiI);
                        } else {
/* 136 */                   i11o1iVar.I0000Il00O(i, i11I0IiII0Ol.I000OOo1O(bArr, iI000O01llI0, i5));
                        }
/* 139 */               return iI000O01llI0 + i5;
                    }
/* 19 */            if (i4 != 3) {
/* 22 */                if (i4 == 5) {
/* 32 */                    i11o1iVar.I0000Il00O(i, Integer.valueOf(I00000oOI(i2, bArr)));
/* 35 */                    return i2 + 4;
                        }
/* 38 */                OoOil11Ol1o.I001IIilI0O("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 44 */            int i6 = (i & (-8)) | 4;
/* 46 */            i11o1i i11o1iVarI00000oOI = i11o1i.I00000oOI();
/* 52 */            int i7 = i111i0i1.I0000O + 1;
/* 53 */            i111i0i1.I0000O = i7;
/* 57 */            if (i7 >= 100) {
/* 106 */               OoOil11Ol1o.I001IIilI0O("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 3 */                 return 0;
                    }
/* 59 */            int i8 = 0;
                    while (true) {
/* 60 */                if (i2 >= i3) {
                            break;
                        }
/* 62 */                int iI000O01llI02 = I000O01llI0(bArr, i2, i111i0i1);
/* 66 */                int i9 = i111i0i1.I00000oIO;
/* 68 */                if (i9 == i6) {
/* 70 */                    i8 = i9;
/* 71 */                    i2 = iI000O01llI02;
                            break;
                        }
/* 78 */                i2 = I000II(i9, bArr, iI000O01llI02, i3, i11o1iVarI00000oOI, i111i0i1);
/* 82 */                i8 = i9;
                    }
                    i111i0i1.I0000O--;
/* 90 */            if (i2 > i3 || i8 != i6) {
/* 100 */               OoOil11Ol1o.I001IIilI0O("Failed to parse the message.");
/* 3 */                 return 0;
                    }
/* 94 */            i11o1iVar.I0000Il00O(i, i11o1iVarI00000oOI);
/* 97 */            return i2;
                }

                public static int I000O01llI0(byte[] bArr, int i, i111i0I1 i111i0i1) {
/* 1 */             int i2 = i + 1;
/* 3 */             byte b = bArr[i];
/* 5 */             if (b < 0) {
/* 10 */                return I000OOo1O(b, bArr, i2, i111i0i1);
                    }
/* 7 */             i111i0i1.I00000oIO = b;
/* 9 */             return i2;
                }

                public static int I000OOo1O(int i, byte[] bArr, int i2, i111i0I1 i111i0i1) {
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

                public static int I000OiO(int i, byte[] bArr, int i2, int i3, i11Oi1oO i11oi1oo, i111i0I1 i111i0i1) {
/* 1 */             i11OIo i11oio = (i11OIo) i11oi1oo;
/* 3 */             int iI000O01llI0 = I000O01llI0(bArr, i2, i111i0i1);
/* 9 */             i11oio.I0000oI00(i111i0i1.I00000oIO);
/* 12 */            while (iI000O01llI0 < i3) {
/* 14 */                int iI000O01llI02 = I000O01llI0(bArr, iI000O01llI0, i111i0i1);
/* 20 */                if (i != i111i0i1.I00000oIO) {
                            break;
                        }
/* 23 */                iI000O01llI0 = I000O01llI0(bArr, iI000O01llI02, i111i0i1);
/* 29 */                i11oio.I0000oI00(i111i0i1.I00000oIO);
                    }
/* 685 */           return iI000O01llI0;
                }

                public static int I000iOII(byte[] bArr, int i, i111i0I1 i111i0i1) {
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

                public static int I000l1(Object obj, i11lo1 i11lo1Var, byte[] bArr, int i, int i2, int i3, i111i0I1 i111i0i1) {
/* 1 */             i11lOO i11loo = (i11lOO) i11lo1Var;
/* 5 */             int i4 = i111i0i1.I0000O + 1;
/* 7 */             i111i0i1.I0000O = i4;
/* 11 */            if (i4 >= 100) {
/* 31 */                OoOil11Ol1o.I001IIilI0O("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 34 */                return 0;
                    }
/* 16 */            int iI0010o = i11loo.I0010o(obj, bArr, i, i2, i3, i111i0i1);
                    i111i0i1.I0000O--;
/* 26 */            i111i0i1.I0000Il00O = obj;
/* 28 */            return iI0010o;
                }

                public static int I000lI(Object obj, i11lo1 i11lo1Var, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) {
/* 1 */             int iI000OOo1O = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iI000OOo1O = I000OOo1O(i3, bArr, iI000OOo1O, i111i0i1);
/* 11 */                i3 = i111i0i1.I00000oIO;
                    }
/* 13 */            int i4 = iI000OOo1O;
/* 15 */            if (i3 < 0 || i3 > i2 - i4) {
/* 56 */                OoOil11Ol1o.I001IIilI0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 14 */                return 0;
                    }
/* 22 */            int i5 = i111i0i1.I0000O + 1;
/* 24 */            i111i0i1.I0000O = i5;
/* 28 */            if (i5 >= 100) {
/* 50 */                OoOil11Ol1o.I001IIilI0O("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 14 */                return 0;
                    }
/* 30 */            int i6 = i4 + i3;
/* 36 */            i11lo1Var.I00000oOI(obj, bArr, i4, i6, i111i0i1);
                    i111i0i1.I0000O--;
/* 45 */            i111i0i1.I0000Il00O = obj;
/* 47 */            return i6;
                }

                public static int I000o00OoI0I(int i, byte[] bArr, int i2, int i3, i111i0I1 i111i0i1) {
/* 6 */             if ((i >>> 3) == 0) {
/* 78 */                OoOil11Ol1o.I001IIilI0O("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 8 */             int i4 = i & 7;
/* 10 */            if (i4 == 0) {
/* 73 */                return I000iOII(bArr, i2, i111i0i1);
                    }
/* 13 */            if (i4 == 1) {
/* 70 */                return i2 + 8;
                    }
/* 16 */            if (i4 == 2) {
/* 68 */                return I000O01llI0(bArr, i2, i111i0i1) + i111i0i1.I00000oIO;
                    }
/* 19 */            if (i4 != 3) {
/* 22 */                if (i4 == 5) {
/* 24 */                    return i2 + 4;
                        }
/* 27 */                OoOil11Ol1o.I001IIilI0O("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 33 */            int i5 = (i & (-8)) | 4;
/* 35 */            int i6 = 0;
/* 36 */            while (i2 < i3) {
/* 38 */                i2 = I000O01llI0(bArr, i2, i111i0i1);
/* 42 */                i6 = i111i0i1.I00000oIO;
/* 44 */                if (i6 == i5) {
                            break;
                        }
/* 46 */                i2 = I000o00OoI0I(i6, bArr, i2, i3, i111i0i1);
                    }
/* 51 */            if (i2 <= i3 && i6 == i5) {
/* 55 */                return i2;
                    }
/* 58 */            OoOil11Ol1o.I001IIilI0O("Failed to parse the message.");
/* 3 */             return 0;
                }

                public static long I000oI1ioi(int i, byte[] bArr) {
/* 91 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
                }
            }
