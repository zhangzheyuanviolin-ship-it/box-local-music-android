            package p000;
            
            public abstract class iOo0OoO0l {
                public static final int I00000oIO = 0;

                static {
/* 1 */             int i = iOl10iIiIiOi.I00000oIO;
                }

                public static boolean I00000oIO(byte[] bArr, int i, int i2) {
/* 1 */             while (i < i2 && bArr[i] >= 0) {
/* 7 */                 i++;
                    }
/* 11 */            if (i >= i2) {
/* 10 */                return true;
                    }
/* 14 */            while (i < i2) {
/* 17 */                int i3 = i + 1;
/* 19 */                byte b = bArr[i];
/* 21 */                if (b >= 0) {
/* 115 */                   i = i3;
                        } else {
/* 28 */                    if (b < -32) {
/* 30 */                        if (i3 < i2 && b >= -62) {
/* 37 */                            i += 2;
/* 41 */                            if (bArr[i3] > -65) {
                                    }
                                }
/* 27 */                        return false;
                            }
/* 46 */                    if (b >= -16) {
/* 84 */                        if (i3 >= i2 - 2) {
/* 27 */                            return false;
                                }
/* 87 */                        int i4 = i + 2;
/* 89 */                        byte b2 = bArr[i3];
/* 91 */                        if (b2 <= -65) {
/* 100 */                           if ((((b2 + 112) + (b << 28)) >> 30) == 0) {
/* 102 */                               int i5 = i + 3;
/* 106 */                               if (bArr[i4] <= -65) {
/* 108 */                                   i += 4;
/* 112 */                                   if (bArr[i5] > -65) {
                                            }
                                        }
                                    }
                                }
/* 27 */                        return false;
                            }
/* 50 */                    if (i3 >= i2 - 1) {
/* 27 */                        return false;
                            }
/* 53 */                    int i6 = i + 2;
/* 55 */                    byte b3 = bArr[i3];
/* 57 */                    if (b3 > -65 || (b == -32 && b3 < -96)) {
/* 27 */                        return false;
                            }
/* 69 */                    if (b == -19 && b3 >= -96) {
/* 27 */                        return false;
                            }
/* 75 */                    i += 3;
/* 79 */                    if (bArr[i6] > -65) {
/* 27 */                        return false;
                            }
                        }
                    }
/* 10 */            return true;
                }
            }
