            package p000;
            
            public abstract class iI0oiIOi1 {
                public static final int I00000oIO = 0;

                static {
/* 3 */             if (iI0lo1Oli.I0000oI00 && iI0lo1Oli.I0000O) {
/* 9 */                 int i = i1i1oioIl0.I00000oIO;
                    }
                }

                public static int I00000oIO(byte[] bArr, int i, int i2) {
/* 1 */             int i3 = i2 - i;
/* 4 */             byte b = bArr[i - 1];
/* 8 */             if (i3 == 0) {
/* 53 */                if (b <= -12) {
/* 55 */                    return b;
                        }
/* 56 */                return -1;
                    }
/* 13 */            if (i3 == 1) {
/* 42 */                byte b2 = bArr[i];
/* 44 */                if (b > -12 || b2 > -65) {
/* 56 */                    return -1;
                        }
/* 51 */                return (b2 << 8) ^ b;
                    }
/* 16 */            if (i3 != 2) {
/* 37 */                OoOil11Ol1o.I0000Il00O();
/* 40 */                return 0;
                    }
/* 18 */            byte b3 = bArr[i];
/* 21 */            byte b4 = bArr[i + 1];
/* 23 */            if (b > -12 || b3 > -65 || b4 > -65) {
/* 56 */                return -1;
                    }
/* 35 */            return (b4 << 16) ^ ((b3 << 8) ^ b);
                }

                /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x007a A[ORIG_RETURN, RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static boolean I00000oOI(byte[] bArr, int i, int i2) {
/* 1 */             while (i < i2 && bArr[i] >= 0) {
/* 7 */                 i++;
                    }
/* 10 */            if (i >= i2) {
/* 123 */               return true;
                    }
/* 14 */            while (i < i2) {
/* 16 */                int i3 = i + 1;
/* 18 */                int iI00000oIO = bArr[i];
/* 20 */                if (iI00000oIO >= 0) {
/* 121 */                   i = i3;
                        } else if (iI00000oIO < -32) {
/* 28 */                    if (i3 >= i2) {
                                return iI00000oIO == 0;
                            }
/* 33 */                    if (iI00000oIO < -62) {
/* 119 */                       return false;
                            }
/* 35 */                    i += 2;
/* 39 */                    if (bArr[i3] > 65471) {
/* 119 */                       return false;
                            }
                        } else if (iI00000oIO < -16) {
/* 48 */                    if (i3 >= i2 - 1) {
/* 50 */                        iI00000oIO = I00000oIO(bArr, i3, i2);
                                if (iI00000oIO == 0) {
                                }
                            } else {
/* 55 */                        int i4 = i + 2;
/* 57 */                        char c = bArr[i3];
/* 59 */                        if (c > 65471) {
/* 119 */                           return false;
                                }
/* 63 */                        if (iI00000oIO == -32 && c < 65440) {
/* 119 */                           return false;
                                }
/* 69 */                        if (iI00000oIO == -19 && c >= 65440) {
/* 119 */                           return false;
                                }
/* 73 */                        i += 3;
/* 77 */                        if (bArr[i4] > 65471) {
/* 119 */                           return false;
                                }
                            }
                        } else if (i3 >= i2 - 2) {
/* 84 */                    iI00000oIO = I00000oIO(bArr, i3, i2);
                            if (iI00000oIO == 0) {
                            }
                        } else {
/* 91 */                    int i5 = i + 2;
/* 93 */                    int i6 = bArr[i3];
/* 95 */                    if (i6 > -65) {
/* 119 */                       return false;
                            }
/* 104 */                   if ((((i6 + 112) + (iI00000oIO << 28)) >> 30) != 0) {
/* 119 */                       return false;
                            }
/* 106 */                   int i7 = i + 3;
/* 110 */                   if (bArr[i5] > 65471) {
/* 119 */                       return false;
                            }
/* 112 */                   i += 4;
/* 116 */                   if (bArr[i7] > 65471) {
/* 119 */                       return false;
                            }
                        }
                    }
/* 123 */           return true;
                }
            }
