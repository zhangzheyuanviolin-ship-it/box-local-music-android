            package p000;
            
            public abstract class Oolio1l {
                public static final OoliIlOi I00000oIO;

                static {
/* 28 */            I00000oIO = (Ooil11Oi.I0000oI00 && Ooil11Oi.I0000O && !I0l1oIioiOi0.I00000oIO()) ? new OoliIlOi(1) : new OoliIlOi(0);
                }

                public static int I00000oIO(String str) {
/* 1 */             int length = str.length();
/* 6 */             int i = 0;
/* 7 */             while (i < length && str.charAt(i) < 128) {
/* 17 */                i++;
                    }
/* 20 */            int i2 = length;
                    while (true) {
/* 21 */                if (i >= length) {
                            break;
                        }
/* 23 */                char cCharAt = str.charAt(i);
/* 29 */                if (cCharAt < 2048) {
/* 35 */                    i2 += (127 - cCharAt) >>> 31;
/* 36 */                    i++;
                        } else {
/* 39 */                    int length2 = str.length();
/* 43 */                    int i3 = 0;
/* 44 */                    while (i < length2) {
/* 46 */                        char cCharAt2 = str.charAt(i);
/* 50 */                        if (cCharAt2 < 2048) {
/* 56 */                            i3 += (127 - cCharAt2) >>> 31;
                                } else {
/* 58 */                            i3 += 2;
/* 63 */                            if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
/* 76 */                                if (Character.codePointAt(str, i) < 65536) {
/* 86 */                                    throw new Oolii1(i, length2);
                                        }
/* 78 */                                i++;
                                    }
                                }
/* 87 */                        i++;
                            }
/* 90 */                    i2 += i3;
                        }
                    }
/* 91 */            if (i2 >= length) {
/* 93 */                return i2;
                    }
/* 101 */           OoOil11Ol1o.I000II(i2 + 4294967296L);
/* 5 */             return 0;
                }

                public static int I00000oOI(int i, int i2) {
/* 3 */             if (i > -12 || i2 > -65) {
/* 14 */                return -1;
                    }
/* 12 */            return i ^ (i2 << 8);
                }

                public static int I0000Il00O(int i, int i2, int i3) {
/* 3 */             if (i > -12 || i2 > -65 || i3 > -65) {
/* 19 */                return -1;
                    }
/* 17 */            return (i ^ (i2 << 8)) ^ (i3 << 16);
                }

                public static int I0000O(byte[] bArr, int i, int i2) {
/* 3 */             byte b = bArr[i - 1];
/* 5 */             int i3 = i2 - i;
/* 6 */             if (i3 == 0) {
/* 38 */                if (b > -12) {
/* 40 */                    return -1;
                        }
/* 215 */               return b;
                    }
/* 9 */             if (i3 == 1) {
/* 31 */                return I00000oOI(b, bArr[i]);
                    }
/* 12 */            if (i3 == 2) {
/* 19 */                return I0000Il00O(b, bArr[i], bArr[i + 1]);
                    }
/* 24 */            OoOil11Ol1o.I0000Il00O();
/* 27 */            return 0;
                }
            }
