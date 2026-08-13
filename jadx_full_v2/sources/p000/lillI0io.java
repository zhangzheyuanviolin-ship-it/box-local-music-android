            package p000;
            
            public abstract class lillI0io {
                public static int I00000oIO(byte[] bArr, int i, i111i0I1 i111i0i1) {
/* 1 */             int iI000O01llI0 = I000O01llI0(bArr, i, i111i0i1);
/* 5 */             int i2 = i111i0i1.I00000oIO;
/* 8 */             if (i2 < 0) {
/* 37 */                iilo0lOo110.I0000oI00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 7 */                 return 0;
                    }
/* 12 */            if (i2 > bArr.length - iI000O01llI0) {
/* 31 */                iilo0lOo110.I0000oI00("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 7 */                 return 0;
                    }
/* 14 */            if (i2 == 0) {
/* 18 */                i111i0i1.I0000Il00O = il1oII0OlIo.I00iiI;
/* 20 */                return iI000O01llI0;
                    }
/* 25 */            i111i0i1.I0000Il00O = il1oII0OlIo.I001IO000(bArr, iI000O01llI0, i2);
/* 27 */            return iI000O01llI0 + i2;
                }

                public static int I00000oOI(int i, byte[] bArr, int i2, int i3, ill0o1o ill0o1oVar, illI0ll illi0ll, i111i0I1 i111i0i1) {
/* 965 */           throw null;
                }

                public static int I0000Il00O(int i, byte[] bArr) {
/* 3 */             int i2 = bArr[i] & 255;
/* 9 */             int i3 = bArr[i + 1] & 255;
/* 15 */            int i4 = bArr[i + 2] & 255;
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
                }

                public static int I0000O(iooIIllo iooiillo, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) {
/* 1 */             Object objZze = iooiillo.zze();
/* 10 */            int iI000lI = I000lI(objZze, iooiillo, bArr, i, i2, i111i0i1);
/* 14 */            iooiillo.I00000oIO(objZze);
/* 17 */            i111i0i1.I0000Il00O = objZze;
/* 399 */           return iI000lI;
                }

                public static int I0000oI00(iooIIllo iooiillo, int i, byte[] bArr, int i2, int i3, iloOl100 ilool100, i111i0I1 i111i0i1) {
/* 1 */             int iI0000O = I0000O(iooiillo, bArr, i2, i3, i111i0i1);
/* 7 */             ilool100.add(i111i0i1.I0000Il00O);
/* 10 */            while (iI0000O < i3) {
/* 12 */                int iI000O01llI0 = I000O01llI0(bArr, iI0000O, i111i0i1);
/* 18 */                if (i != i111i0i1.I00000oIO) {
                            break;
                        }
/* 21 */                iI0000O = I0000O(iooiillo, bArr, iI000O01llI0, i3, i111i0i1);
/* 27 */                ilool100.add(i111i0i1.I0000Il00O);
                    }
/* 965 */           return iI0000O;
                }

                public static int I0001Ioi1lo(byte[] bArr, int i, iloOl100 ilool100, i111i0I1 i111i0i1) {
/* 1 */             illiooo1io0I illiooo1io0i = (illiooo1io0I) ilool100;
/* 3 */             int iI000O01llI0 = I000O01llI0(bArr, i, i111i0i1);
/* 9 */             int i2 = i111i0i1.I00000oIO + iI000O01llI0;
/* 10 */            while (iI000O01llI0 < i2) {
/* 12 */                iI000O01llI0 = I000O01llI0(bArr, iI000O01llI0, i111i0i1);
/* 18 */                illiooo1io0i.I0000O(i111i0i1.I00000oIO);
                    }
/* 22 */            if (iI000O01llI0 == i2) {
/* 24 */                return iI000O01llI0;
                    }
/* 27 */            iilo0lOo110.I0000oI00("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 30 */            return 0;
                }

                public static int I000II(int i, byte[] bArr, int i2, int i3, l01IO0I1I l01io0i1i, i111i0I1 i111i0i1) {
/* 6 */             if ((i >>> 3) == 0) {
/* 184 */               iilo0lOo110.I0000oI00("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 8 */             int i4 = i & 7;
/* 10 */            if (i4 == 0) {
/* 170 */               int iI000iOII = I000iOII(bArr, i2, i111i0i1);
/* 180 */               l01io0i1i.I0000Il00O(i, Long.valueOf(i111i0i1.I00000oOI));
/* 183 */               return iI000iOII;
                    }
/* 13 */            if (i4 == 1) {
/* 162 */               l01io0i1i.I0000Il00O(i, Long.valueOf(I000oI1ioi(i2, bArr)));
/* 165 */               return i2 + 8;
                    }
/* 16 */            if (i4 == 2) {
/* 112 */               int iI000O01llI0 = I000O01llI0(bArr, i2, i111i0i1);
/* 116 */               int i5 = i111i0i1.I00000oIO;
/* 118 */               if (i5 < 0) {
/* 149 */                   iilo0lOo110.I0000oI00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 3 */                     return 0;
                        }
/* 122 */               if (i5 > bArr.length - iI000O01llI0) {
/* 143 */                   iilo0lOo110.I0000oI00("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 3 */                     return 0;
                        }
/* 124 */               if (i5 == 0) {
/* 128 */                   l01io0i1i.I0000Il00O(i, il1oII0OlIo.I00iiI);
                        } else {
/* 136 */                   l01io0i1i.I0000Il00O(i, il1oII0OlIo.I001IO000(bArr, iI000O01llI0, i5));
                        }
/* 139 */               return iI000O01llI0 + i5;
                    }
/* 19 */            if (i4 != 3) {
/* 22 */                if (i4 == 5) {
/* 32 */                    l01io0i1i.I0000Il00O(i, Integer.valueOf(I0000Il00O(i2, bArr)));
/* 35 */                    return i2 + 4;
                        }
/* 38 */                iilo0lOo110.I0000oI00("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 44 */            int i6 = (i & (-8)) | 4;
/* 46 */            l01IO0I1I l01io0i1iI00000oOI = l01IO0I1I.I00000oOI();
/* 52 */            int i7 = i111i0i1.I0000O + 1;
/* 53 */            i111i0i1.I0000O = i7;
/* 57 */            if (i7 >= 100) {
/* 106 */               iilo0lOo110.I0000oI00("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
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
/* 78 */                i2 = I000II(i9, bArr, iI000O01llI02, i3, l01io0i1iI00000oOI, i111i0i1);
/* 82 */                i8 = i9;
                    }
                    i111i0i1.I0000O--;
/* 90 */            if (i2 > i3 || i8 != i6) {
/* 100 */               iilo0lOo110.I0000oI00("Failed to parse the message.");
/* 3 */                 return 0;
                    }
/* 94 */            l01io0i1i.I0000Il00O(i, l01io0i1iI00000oOI);
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

                public static int I000OiO(int i, byte[] bArr, int i2, int i3, iloOl100 ilool100, i111i0I1 i111i0i1) {
/* 1 */             illiooo1io0I illiooo1io0i = (illiooo1io0I) ilool100;
/* 3 */             int iI000O01llI0 = I000O01llI0(bArr, i2, i111i0i1);
/* 9 */             illiooo1io0i.I0000O(i111i0i1.I00000oIO);
/* 12 */            while (iI000O01llI0 < i3) {
/* 14 */                int iI000O01llI02 = I000O01llI0(bArr, iI000O01llI0, i111i0i1);
/* 20 */                if (i != i111i0i1.I00000oIO) {
                            break;
                        }
/* 23 */                iI000O01llI0 = I000O01llI0(bArr, iI000O01llI02, i111i0i1);
/* 29 */                illiooo1io0i.I0000O(i111i0i1.I00000oIO);
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

                public static int I000l1(Object obj, iooIIllo iooiillo, byte[] bArr, int i, int i2, int i3, i111i0I1 i111i0i1) {
/* 1 */             ioOioO0Oo iooioo0oo = (ioOioO0Oo) iooiillo;
/* 5 */             int i4 = i111i0i1.I0000O + 1;
/* 7 */             i111i0i1.I0000O = i4;
/* 11 */            if (i4 >= 100) {
/* 31 */                iilo0lOo110.I0000oI00("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 34 */                return 0;
                    }
/* 16 */            int iI00100o1O0lo = iooioo0oo.I00100o1O0lo(obj, bArr, i, i2, i3, i111i0i1);
                    i111i0i1.I0000O--;
/* 26 */            i111i0i1.I0000Il00O = obj;
/* 28 */            return iI00100o1O0lo;
                }

                public static int I000lI(Object obj, iooIIllo iooiillo, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) {
/* 1 */             int iI000OOo1O = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iI000OOo1O = I000OOo1O(i3, bArr, iI000OOo1O, i111i0i1);
/* 11 */                i3 = i111i0i1.I00000oIO;
                    }
/* 13 */            int i4 = iI000OOo1O;
/* 15 */            if (i3 < 0 || i3 > i2 - i4) {
/* 56 */                iilo0lOo110.I0000oI00("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 14 */                return 0;
                    }
/* 22 */            int i5 = i111i0i1.I0000O + 1;
/* 24 */            i111i0i1.I0000O = i5;
/* 28 */            if (i5 >= 100) {
/* 50 */                iilo0lOo110.I0000oI00("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 14 */                return 0;
                    }
/* 30 */            int i6 = i4 + i3;
/* 36 */            iooiillo.I000II(obj, bArr, i4, i6, i111i0i1);
                    i111i0i1.I0000O--;
/* 45 */            i111i0i1.I0000Il00O = obj;
/* 47 */            return i6;
                }

                public static int I000o00OoI0I(int i, byte[] bArr, int i2, int i3, i111i0I1 i111i0i1) {
/* 6 */             if ((i >>> 3) == 0) {
/* 78 */                iilo0lOo110.I0000oI00("Protocol message contained an invalid tag (zero).");
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
/* 27 */                iilo0lOo110.I0000oI00("Protocol message contained an invalid tag (zero).");
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
/* 58 */            iilo0lOo110.I0000oI00("Failed to parse the message.");
/* 3 */             return 0;
                }

                public static long I000oI1ioi(int i, byte[] bArr) {
/* 91 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
                }
            }
