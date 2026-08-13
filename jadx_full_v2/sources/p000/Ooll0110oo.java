            package p000;

            import java.nio.charset.StandardCharsets;
            
            public abstract class Ooll0110oo {
                public static final OoliOIl1 I00000oIO;

                static {
/* 29 */            I00000oIO = (!I0lI0Ooo.I00000oIO() && Ooil1O.I0000oI00 && Ooil1O.I0000O) ? new OoliOIl1(1) : new OoliOIl1(0);
                }

                public static int I00000oIO(String str) throws Oolio0o0olIO {
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
                            try {
/* 39 */                        int length2 = str.length();
/* 43 */                        int i3 = 0;
/* 44 */                        while (i < length2) {
/* 46 */                            char cCharAt2 = str.charAt(i);
/* 50 */                            if (cCharAt2 < 2048) {
/* 56 */                                i3 += (127 - cCharAt2) >>> 31;
                                    } else {
/* 58 */                                i3 += 2;
/* 63 */                                if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
/* 76 */                                    if (Character.codePointAt(str, i) < 65536) {
/* 108 */                                       throw new Oolio0o0olIO("Unpaired surrogate at index " + i + " of " + length2);
                                            }
/* 78 */                                    i++;
                                        }
                                    }
/* 109 */                           i++;
                                }
/* 112 */                       i2 += i3;
                            } catch (Oolio0o0olIO unused) {
/* 120 */                       return str.getBytes(StandardCharsets.UTF_8).length;
                            }
                        }
                    }
/* 122 */           if (i2 >= length) {
/* 124 */               return i2;
                    }
/* 132 */           OoOil11Ol1o.I000II(i2 + 4294967296L);
/* 5 */             return 0;
                }
            }
