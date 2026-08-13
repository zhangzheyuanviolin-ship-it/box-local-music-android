            package p000;
            
            public abstract class li0lloi1l {
                public static int I00000oIO(int i, int i2) {
/* 3 */             if (i > -12 || i2 > -65) {
/* 14 */                return -1;
                    }
/* 12 */            return i ^ (i2 << 8);
                }

                public static int I00000oOI(byte[] bArr, int i, int i2) {
/* 3 */             byte b = bArr[i - 1];
/* 5 */             int i3 = i2 - i;
/* 9 */             if (i3 == 0) {
/* 51 */                if (b > -12) {
/* 6 */                     return -1;
                        }
/* 215 */               return b;
                    }
/* 12 */            if (i3 == 1) {
/* 46 */                return I00000oIO(b, bArr[i]);
                    }
/* 15 */            if (i3 != 2) {
/* 39 */                OoOil11Ol1o.I0000Il00O();
/* 42 */                return 0;
                    }
/* 17 */            byte b2 = bArr[i];
/* 20 */            byte b3 = bArr[i + 1];
/* 22 */            if (b > -12 || b2 > -65 || b3 > -65) {
/* 6 */                 return -1;
                    }
/* 36 */            return (b3 << 16) ^ ((b2 << 8) ^ b);
                }

                public static int I0000Il00O(byte[] bArr, int i, int i2) {
/* 1 */             while (i < i2 && bArr[i] >= 0) {
/* 7 */                 i++;
                    }
/* 11 */            if (i >= i2) {
/* 10 */                return 0;
                    }
/* 14 */            while (i < i2) {
/* 17 */                int i3 = i + 1;
/* 19 */                byte b = bArr[i];
/* 21 */                if (b >= 0) {
/* 119 */                   i = i3;
                        } else if (b < -32) {
/* 29 */                    if (i3 >= i2) {
/* 31 */                        return b;
                            }
/* 34 */                    if (b < -62) {
/* 117 */                       return -1;
                            }
/* 36 */                    i += 2;
/* 40 */                    if (bArr[i3] > -65) {
/* 117 */                       return -1;
                            }
                        } else if (b < -16) {
/* 49 */                    if (i3 >= i2 - 1) {
/* 51 */                        return I00000oOI(bArr, i3, i2);
                            }
/* 56 */                    int i4 = i + 2;
/* 58 */                    byte b2 = bArr[i3];
/* 60 */                    if (b2 > -65) {
/* 117 */                       return -1;
                            }
/* 64 */                    if (b == -32 && b2 < -96) {
/* 117 */                       return -1;
                            }
/* 70 */                    if (b == -19 && b2 >= -96) {
/* 117 */                       return -1;
                            }
/* 74 */                    i += 3;
/* 78 */                    if (bArr[i4] > -65) {
/* 117 */                       return -1;
                            }
                        } else {
/* 83 */                    if (i3 >= i2 - 2) {
/* 85 */                        return I00000oOI(bArr, i3, i2);
                            }
/* 90 */                    int i5 = i + 2;
/* 92 */                    byte b3 = bArr[i3];
/* 94 */                    if (b3 > -65) {
/* 117 */                       return -1;
                            }
/* 103 */                   if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
/* 117 */                       return -1;
                            }
/* 105 */                   int i6 = i + 3;
/* 109 */                   if (bArr[i5] > -65) {
/* 117 */                       return -1;
                            }
/* 111 */                   i += 4;
/* 115 */                   if (bArr[i6] > -65) {
/* 117 */                       return -1;
                            }
                        }
                    }
/* 10 */            return 0;
                }
            }
