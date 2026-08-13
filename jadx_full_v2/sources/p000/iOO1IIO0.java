            package p000;
            
            public abstract class iOO1IIO0 {
                public static int I00000oIO(byte[] bArr, int i, I1Il011OO i1Il011OO) throws O000oiiiOI0 {
/* 1 */             int iI000OOo1O = I000OOo1O(bArr, i, i1Il011OO);
/* 5 */             int i2 = i1Il011OO.I00000oIO;
/* 7 */             if (i2 < 0) {
/* 215 */               throw O000oiiiOI0.I0000oI00();
                    }
/* 11 */            if (i2 > bArr.length - iI000OOo1O) {
/* 32 */                throw O000oiiiOI0.I000II();
                    }
/* 13 */            if (i2 == 0) {
/* 17 */                i1Il011OO.I0000Il00O = IIOI1Ii1I.I00iiI;
/* 19 */                return iI000OOo1O;
                    }
/* 24 */            i1Il011OO.I0000Il00O = IIOI1Ii1I.I0000oI00(bArr, iI000OOo1O, i2);
/* 26 */            return iI000OOo1O + i2;
                }

                public static int I00000oOI(int i, byte[] bArr) {
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
                }

                public static long I0000Il00O(int i, byte[] bArr) {
/* 76 */            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
                }

                public static int I0000O(OiOIiIO0 oiOIiIO0, int i, byte[] bArr, int i2, int i3, Iool0o0iOI iool0o0iOI, I1Il011OO i1Il011OO) throws O000oiiiOI0 {
/* 1 */             Object objI0000O = oiOIiIO0.I0000O();
/* 5 */             OiOIiIO0 oiOIiIO02 = oiOIiIO0;
/* 6 */             byte[] bArr2 = bArr;
/* 8 */             int i4 = i3;
/* 9 */             I1Il011OO i1Il011OO2 = i1Il011OO;
/* 10 */            int iI000l1 = I000l1(objI0000O, oiOIiIO02, bArr2, i2, i4, i1Il011OO2);
/* 14 */            oiOIiIO02.I00000oOI(objI0000O);
/* 17 */            i1Il011OO2.I0000Il00O = objI0000O;
/* 19 */            iool0o0iOI.add(objI0000O);
/* 22 */            while (iI000l1 < i4) {
/* 24 */                I1Il011OO i1Il011OO3 = i1Il011OO2;
/* 25 */                int i5 = i4;
/* 26 */                int iI000OOo1O = I000OOo1O(bArr2, iI000l1, i1Il011OO3);
/* 32 */                if (i != i1Il011OO3.I00000oIO) {
                            break;
                        }
/* 35 */                byte[] bArr3 = bArr2;
/* 36 */                OiOIiIO0 oiOIiIO03 = oiOIiIO02;
/* 37 */                Object objI0000O2 = oiOIiIO03.I0000O();
/* 41 */                iI000l1 = I000l1(objI0000O2, oiOIiIO03, bArr3, iI000OOo1O, i5, i1Il011OO3);
/* 46 */                oiOIiIO02 = oiOIiIO03;
/* 47 */                bArr2 = bArr3;
/* 48 */                i4 = i5;
/* 49 */                i1Il011OO2 = i1Il011OO3;
/* 50 */                oiOIiIO02.I00000oOI(objI0000O2);
/* 53 */                i1Il011OO2.I0000Il00O = objI0000O2;
/* 55 */                iool0o0iOI.add(objI0000O2);
                    }
/* 429 */           return iI000l1;
                }

                public static int I0000oI00(byte[] bArr, int i, I1Il011OO i1Il011OO) throws O000oiiiOI0 {
/* 1 */             int iI000OOo1O = I000OOo1O(bArr, i, i1Il011OO);
/* 5 */             int i2 = i1Il011OO.I00000oIO;
/* 7 */             if (i2 < 0) {
/* 215 */               throw O000oiiiOI0.I0000oI00();
                    }
/* 9 */             if (i2 == 0) {
/* 13 */                i1Il011OO.I0000Il00O = "";
/* 15 */                return iI000OOo1O;
                    }
/* 23 */            i1Il011OO.I0000Il00O = new String(bArr, iI000OOo1O, i2, Iool1iOO11.I00000oIO);
/* 25 */            return iI000OOo1O + i2;
                }

                public static int I0001Ioi1lo(byte[] bArr, int i, I1Il011OO i1Il011OO) throws O000oiiiOI0 {
/* 1 */             int iI000OOo1O = I000OOo1O(bArr, i, i1Il011OO);
/* 5 */             int i2 = i1Il011OO.I00000oIO;
/* 7 */             if (i2 < 0) {
/* 215 */               throw O000oiiiOI0.I0000oI00();
                    }
/* 9 */             if (i2 == 0) {
/* 13 */                i1Il011OO.I0000Il00O = "";
/* 15 */                return iI000OOo1O;
                    }
/* 22 */            i1Il011OO.I0000Il00O = Oolio1l.I00000oIO.I00000oIO(bArr, iI000OOo1O, i2);
/* 24 */            return iI000OOo1O + i2;
                }

                public static int I000II(int i, byte[] bArr, int i2, int i3, OoiO0I1O1II ooiO0I1O1II, I1Il011OO i1Il011OO) throws O000oiiiOI0 {
/* 3 */             if ((i >>> 3) == 0) {
/* 1294 */              throw O000oiiiOI0.I00000oIO();
                    }
/* 5 */             int i4 = i & 7;
/* 7 */             if (i4 == 0) {
/* 141 */               int iI000iOII = I000iOII(bArr, i2, i1Il011OO);
/* 151 */               ooiO0I1O1II.I0000O(i, Long.valueOf(i1Il011OO.I00000oOI));
/* 154 */               return iI000iOII;
                    }
/* 10 */            if (i4 == 1) {
/* 133 */               ooiO0I1O1II.I0000O(i, Long.valueOf(I0000Il00O(i2, bArr)));
/* 136 */               return i2 + 8;
                    }
/* 13 */            if (i4 == 2) {
/* 85 */                int iI000OOo1O = I000OOo1O(bArr, i2, i1Il011OO);
/* 89 */                int i5 = i1Il011OO.I00000oIO;
/* 91 */                if (i5 < 0) {
/* 123 */                   throw O000oiiiOI0.I0000oI00();
                        }
/* 95 */                if (i5 > bArr.length - iI000OOo1O) {
/* 118 */                   throw O000oiiiOI0.I000II();
                        }
/* 97 */                if (i5 == 0) {
/* 101 */                   ooiO0I1O1II.I0000O(i, IIOI1Ii1I.I00iiI);
                        } else {
/* 109 */                   ooiO0I1O1II.I0000O(i, IIOI1Ii1I.I0000oI00(bArr, iI000OOo1O, i5));
                        }
/* 112 */               return iI000OOo1O + i5;
                    }
/* 16 */            if (i4 != 3) {
/* 19 */                if (i4 != 5) {
/* 39 */                    throw O000oiiiOI0.I00000oIO();
                        }
/* 29 */                ooiO0I1O1II.I0000O(i, Integer.valueOf(I00000oOI(i2, bArr)));
/* 32 */                return i2 + 4;
                    }
/* 40 */            OoiO0I1O1II ooiO0I1O1III0000Il00O = OoiO0I1O1II.I0000Il00O();
/* 46 */            int i6 = (i & (-8)) | 4;
/* 48 */            int i7 = 0;
                    while (true) {
/* 49 */                if (i2 >= i3) {
                            break;
                        }
/* 51 */                int iI000OOo1O2 = I000OOo1O(bArr, i2, i1Il011OO);
/* 55 */                i7 = i1Il011OO.I00000oIO;
/* 57 */                if (i7 == i6) {
/* 59 */                    i2 = iI000OOo1O2;
                            break;
                        }
/* 65 */                i2 = I000II(i7, bArr, iI000OOo1O2, i3, ooiO0I1O1III0000Il00O, i1Il011OO);
                    }
/* 70 */            if (i2 > i3 || i7 != i6) {
/* 82 */                throw O000oiiiOI0.I0001Ioi1lo();
                    }
/* 74 */            ooiO0I1O1II.I0000O(i, ooiO0I1O1III0000Il00O);
/* 77 */            return i2;
                }

                public static int I000O01llI0(int i, byte[] bArr, int i2, I1Il011OO i1Il011OO) {
/* 1 */             int i3 = i & 127;
/* 3 */             int i4 = i2 + 1;
/* 5 */             byte b = bArr[i2];
/* 7 */             if (b >= 0) {
/* 12 */                i1Il011OO.I00000oIO = i3 | (b << 7);
/* 14 */                return i4;
                    }
/* 19 */            int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
/* 20 */            int i6 = i2 + 2;
/* 22 */            byte b2 = bArr[i4];
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
/* 483 */                   return i12;
                        }
/* 77 */                i10 = i12;
                    }
                }

                public static int I000OOo1O(byte[] bArr, int i, I1Il011OO i1Il011OO) {
/* 1 */             int i2 = i + 1;
/* 3 */             byte b = bArr[i];
/* 5 */             if (b < 0) {
/* 10 */                return I000O01llI0(b, bArr, i2, i1Il011OO);
                    }
/* 7 */             i1Il011OO.I00000oIO = b;
/* 9 */             return i2;
                }

                public static int I000OiO(int i, byte[] bArr, int i2, int i3, Iool0o0iOI iool0o0iOI, I1Il011OO i1Il011OO) {
/* 1 */             IooIOOO0I iooIOOO0I = (IooIOOO0I) iool0o0iOI;
/* 3 */             int iI000OOo1O = I000OOo1O(bArr, i2, i1Il011OO);
/* 9 */             iooIOOO0I.I0000O(i1Il011OO.I00000oIO);
/* 12 */            while (iI000OOo1O < i3) {
/* 14 */                int iI000OOo1O2 = I000OOo1O(bArr, iI000OOo1O, i1Il011OO);
/* 20 */                if (i != i1Il011OO.I00000oIO) {
                            break;
                        }
/* 23 */                iI000OOo1O = I000OOo1O(bArr, iI000OOo1O2, i1Il011OO);
/* 29 */                iooIOOO0I.I0000O(i1Il011OO.I00000oIO);
                    }
/* 1294 */          return iI000OOo1O;
                }

                public static int I000iOII(byte[] bArr, int i, I1Il011OO i1Il011OO) {
/* 1 */             int i2 = i + 1;
/* 3 */             long j = bArr[i];
/* 10 */            if (j >= 0) {
/* 12 */                i1Il011OO.I00000oOI = j;
/* 14 */                return i2;
                    }
/* 18 */            int i3 = i + 2;
/* 20 */            byte b = bArr[i2];
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
/* 215 */           return i3;
                }

                public static int I000l1(Object obj, OiOIiIO0 oiOIiIO0, byte[] bArr, int i, int i2, I1Il011OO i1Il011OO) throws O000oiiiOI0 {
/* 1 */             int iI000O01llI0 = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iI000O01llI0 = I000O01llI0(i3, bArr, iI000O01llI0, i1Il011OO);
/* 11 */                i3 = i1Il011OO.I00000oIO;
                    }
/* 13 */            int i4 = iI000O01llI0;
/* 14 */            if (i3 < 0 || i3 > i2 - i4) {
/* 1294 */              throw O000oiiiOI0.I000II();
                    }
/* 19 */            int i5 = i4 + i3;
/* 25 */            oiOIiIO0.I000OOo1O(obj, bArr, i4, i5, i1Il011OO);
/* 28 */            i1Il011OO.I0000Il00O = obj;
/* 30 */            return i5;
                }
            }
