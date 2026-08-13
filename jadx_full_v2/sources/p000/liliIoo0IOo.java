            package p000;
            
            public abstract class liliIoo0IOo {
                public static int I00000oIO(byte[] bArr, int i, I1Il011OO i1Il011OO) throws ill0ll01OOOO {
/* 1 */             int iI0001Ioi1lo = I0001Ioi1lo(bArr, i, i1Il011OO);
/* 5 */             int i2 = i1Il011OO.I00000oIO;
/* 7 */             if (i2 < 0) {
/* 98 */                throw ill0ll01OOOO.I0000O();
                    }
/* 11 */            if (i2 > bArr.length - iI0001Ioi1lo) {
/* 32 */                throw ill0ll01OOOO.I0001Ioi1lo();
                    }
/* 13 */            if (i2 == 0) {
/* 17 */                i1Il011OO.I0000Il00O = iiooOi11li.I00iiO;
/* 19 */                return iI0001Ioi1lo;
                    }
/* 24 */            i1Il011OO.I0000Il00O = iiooOi11li.I000OOo1O(bArr, iI0001Ioi1lo, i2);
/* 26 */            return iI0001Ioi1lo + i2;
                }

                public static int I00000oOI(int i, byte[] bArr) {
/* 3 */             int i2 = bArr[i] & 255;
/* 9 */             int i3 = bArr[i + 1] & 255;
/* 15 */            int i4 = bArr[i + 2] & 255;
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
                }

                public static int I0000Il00O(ioO0I1oi1lio ioo0i1oi1lio, byte[] bArr, int i, int i2, int i3, I1Il011OO i1Il011OO) {
/* 1 */             ilOl10 ilol10Zze = ioo0i1oi1lio.zze();
/* 11 */            int iI000OOo1O = I000OOo1O(ilol10Zze, ioo0i1oi1lio, bArr, i, i2, i3, i1Il011OO);
/* 15 */            ioo0i1oi1lio.I00000oIO(ilol10Zze);
/* 18 */            i1Il011OO.I0000Il00O = ilol10Zze;
/* 685 */           return iI000OOo1O;
                }

                public static int I0000O(ioO0I1oi1lio ioo0i1oi1lio, int i, byte[] bArr, int i2, int i3, iliiiioo iliiiiooVar, I1Il011OO i1Il011OO) throws ill0ll01OOOO {
/* 1 */             ilOl10 ilol10Zze = ioo0i1oi1lio.zze();
/* 5 */             ioO0I1oi1lio ioo0i1oi1lio2 = ioo0i1oi1lio;
/* 6 */             byte[] bArr2 = bArr;
/* 8 */             int i4 = i3;
/* 9 */             I1Il011OO i1Il011OO2 = i1Il011OO;
/* 10 */            int iI000OiO = I000OiO(ilol10Zze, ioo0i1oi1lio2, bArr2, i2, i4, i1Il011OO2);
/* 14 */            ioo0i1oi1lio2.I00000oIO(ilol10Zze);
/* 17 */            i1Il011OO2.I0000Il00O = ilol10Zze;
/* 19 */            iliiiiooVar.add(ilol10Zze);
/* 22 */            while (iI000OiO < i4) {
/* 24 */                I1Il011OO i1Il011OO3 = i1Il011OO2;
/* 25 */                int i5 = i4;
/* 26 */                int iI0001Ioi1lo = I0001Ioi1lo(bArr2, iI000OiO, i1Il011OO3);
/* 32 */                if (i != i1Il011OO3.I00000oIO) {
                            break;
                        }
/* 35 */                byte[] bArr3 = bArr2;
/* 36 */                ioO0I1oi1lio ioo0i1oi1lio3 = ioo0i1oi1lio2;
/* 37 */                ilOl10 ilol10Zze2 = ioo0i1oi1lio3.zze();
/* 41 */                iI000OiO = I000OiO(ilol10Zze2, ioo0i1oi1lio3, bArr3, iI0001Ioi1lo, i5, i1Il011OO3);
/* 46 */                ioo0i1oi1lio2 = ioo0i1oi1lio3;
/* 47 */                bArr2 = bArr3;
/* 48 */                i4 = i5;
/* 49 */                i1Il011OO2 = i1Il011OO3;
/* 50 */                ioo0i1oi1lio2.I00000oIO(ilol10Zze2);
/* 53 */                i1Il011OO2.I0000Il00O = ilol10Zze2;
/* 55 */                iliiiiooVar.add(ilol10Zze2);
                    }
/* 965 */           return iI000OiO;
                }

                public static int I0000oI00(int i, byte[] bArr, int i2, int i3, iooIiiOli iooiiioli, I1Il011OO i1Il011OO) throws ill0ll01OOOO {
/* 5 */             if ((i >>> 3) == 0) {
/* 685 */               throw new ill0ll01OOOO("Protocol message contained an invalid tag (zero).");
                    }
/* 7 */             int i4 = i & 7;
/* 9 */             if (i4 == 0) {
/* 143 */               int iI000O01llI0 = I000O01llI0(bArr, i2, i1Il011OO);
/* 153 */               iooiiioli.I0000Il00O(i, Long.valueOf(i1Il011OO.I00000oOI));
/* 156 */               return iI000O01llI0;
                    }
/* 12 */            if (i4 == 1) {
/* 135 */               iooiiioli.I0000Il00O(i, Long.valueOf(I000iOII(i2, bArr)));
/* 138 */               return i2 + 8;
                    }
/* 15 */            if (i4 == 2) {
/* 87 */                int iI0001Ioi1lo = I0001Ioi1lo(bArr, i2, i1Il011OO);
/* 91 */                int i5 = i1Il011OO.I00000oIO;
/* 93 */                if (i5 < 0) {
/* 125 */                   throw ill0ll01OOOO.I0000O();
                        }
/* 97 */                if (i5 > bArr.length - iI0001Ioi1lo) {
/* 120 */                   throw ill0ll01OOOO.I0001Ioi1lo();
                        }
/* 99 */                if (i5 == 0) {
/* 103 */                   iooiiioli.I0000Il00O(i, iiooOi11li.I00iiO);
                        } else {
/* 111 */                   iooiiioli.I0000Il00O(i, iiooOi11li.I000OOo1O(bArr, iI0001Ioi1lo, i5));
                        }
/* 114 */               return iI0001Ioi1lo + i5;
                    }
/* 18 */            if (i4 != 3) {
/* 21 */                if (i4 != 5) {
/* 42 */                    throw new ill0ll01OOOO("Protocol message contained an invalid tag (zero).");
                        }
/* 31 */                iooiiioli.I0000Il00O(i, Integer.valueOf(I00000oOI(i2, bArr)));
/* 34 */                return i2 + 4;
                    }
/* 45 */            int i6 = (i & (-8)) | 4;
/* 47 */            iooIiiOli iooiiioliI00000oOI = iooIiiOli.I00000oOI();
/* 51 */            int i7 = 0;
                    while (true) {
/* 52 */                if (i2 >= i3) {
                            break;
                        }
/* 54 */                int iI0001Ioi1lo2 = I0001Ioi1lo(bArr, i2, i1Il011OO);
/* 58 */                i7 = i1Il011OO.I00000oIO;
/* 60 */                if (i7 == i6) {
/* 70 */                    i2 = iI0001Ioi1lo2;
                            break;
                        }
/* 65 */                i2 = I0000oI00(i7, bArr, iI0001Ioi1lo2, i3, iooiiioliI00000oOI, i1Il011OO);
                    }
/* 72 */            if (i2 > i3 || i7 != i6) {
/* 84 */                throw ill0ll01OOOO.I0000oI00();
                    }
/* 76 */            iooiiioli.I0000Il00O(i, iooiiioliI00000oOI);
/* 79 */            return i2;
                }

                public static int I0001Ioi1lo(byte[] bArr, int i, I1Il011OO i1Il011OO) {
/* 1 */             int i2 = i + 1;
/* 3 */             byte b = bArr[i];
/* 5 */             if (b < 0) {
/* 10 */                return I000II(b, bArr, i2, i1Il011OO);
                    }
/* 7 */             i1Il011OO.I00000oIO = b;
/* 9 */             return i2;
                }

                public static int I000II(int i, byte[] bArr, int i2, I1Il011OO i1Il011OO) {
/* 1 */             byte b = bArr[i2];
/* 3 */             int i3 = i2 + 1;
/* 5 */             int i4 = i & 127;
/* 7 */             if (b >= 0) {
/* 12 */                i1Il011OO.I00000oIO = i4 | (b << 7);
/* 14 */                return i3;
                    }
/* 19 */            int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
/* 20 */            int i6 = i2 + 2;
/* 22 */            byte b2 = bArr[i3];
/* 24 */            if (b2 >= 0) {
/* 29 */                i1Il011OO.I00000oIO = i5 | (b2 << 14);
/* 31 */                return i6;
                    }
/* 36 */            int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
/* 37 */            int i8 = i2 + 3;
/* 39 */            byte b3 = bArr[i6];
/* 41 */            if (b3 >= 0) {
/* 46 */                i1Il011OO.I00000oIO = i7 | (b3 << 21);
/* 48 */                return i8;
                    }
/* 53 */            int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
/* 54 */            int i10 = i2 + 4;
/* 56 */            byte b4 = bArr[i8];
/* 58 */            if (b4 >= 0) {
/* 63 */                i1Il011OO.I00000oIO = i9 | (b4 << 28);
/* 65 */                return i10;
                    }
/* 70 */            int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
                    while (true) {
/* 71 */                int i12 = i10 + 1;
/* 75 */                if (bArr[i10] >= 0) {
/* 79 */                    i1Il011OO.I00000oIO = i11;
/* 204 */                   return i12;
                        }
/* 77 */                i10 = i12;
                    }
                }

                public static int I000O01llI0(byte[] bArr, int i, I1Il011OO i1Il011OO) {
/* 1 */             long j = bArr[i];
/* 8 */             int i2 = i + 1;
/* 10 */            if (j >= 0) {
/* 12 */                i1Il011OO.I00000oOI = j;
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
/* 45 */            i1Il011OO.I00000oOI = j2;
/* 98 */            return i3;
                }

                public static int I000OOo1O(Object obj, ioO0I1oi1lio ioo0i1oi1lio, byte[] bArr, int i, int i2, int i3, I1Il011OO i1Il011OO) {
/* 6 */             int iI001l0I00 = ((io1ii1oO1iO) ioo0i1oi1lio).I001l0I00(obj, bArr, i, i2, i3, i1Il011OO);
/* 10 */            i1Il011OO.I0000Il00O = obj;
/* 965 */           return iI001l0I00;
                }

                public static int I000OiO(Object obj, ioO0I1oi1lio ioo0i1oi1lio, byte[] bArr, int i, int i2, I1Il011OO i1Il011OO) throws ill0ll01OOOO {
/* 1 */             int iI000II = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iI000II = I000II(i3, bArr, iI000II, i1Il011OO);
/* 11 */                i3 = i1Il011OO.I00000oIO;
                    }
/* 13 */            int i4 = iI000II;
/* 14 */            if (i3 < 0 || i3 > i2 - i4) {
/* 685 */               throw ill0ll01OOOO.I0001Ioi1lo();
                    }
/* 19 */            int i5 = i4 + i3;
/* 25 */            ioo0i1oi1lio.I000OOo1O(obj, bArr, i4, i5, i1Il011OO);
/* 28 */            i1Il011OO.I0000Il00O = obj;
/* 30 */            return i5;
                }

                public static long I000iOII(int i, byte[] bArr) {
/* 91 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
                }
            }
