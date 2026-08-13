            package p000;
            
            public abstract class Ooll0IoO {
                public static final OoliOoI00o I00000oIO;

                static {
/* 28 */            I00000oIO = (OoilIIl.I0000oI00 && OoilIIl.I0000O && !I0lI0iiol.I00000oIO()) ? new OoliOoI00o(1) : new OoliOoI00o(0);
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
/* 86 */                                    throw new Oolio1Illi00(i, length2);
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
            }
