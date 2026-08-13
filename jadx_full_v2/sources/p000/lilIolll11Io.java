            package p000;
            
            public abstract class lilIolll11Io {
                public static void I00000oIO(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
/* 5 */             if (!I0000O(b2)) {
/* 14 */                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !I0000O(b3) && !I0000O(b4)) {
/* 44 */                    int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
/* 52 */                    cArr[i] = (char) ((i2 >>> 10) + 55232);
/* 63 */                    cArr[i + 1] = (char) ((i2 & 1023) + 56320);
/* 65 */                    return;
                        }
                    }
/* 68 */            I000II.I000iOII("Invalid UTF-8");
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
                  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oOI(byte b, byte b2, byte b3, char[] cArr, int i) {
/* 5 */             if (!I0000O(b2)) {
/* 11 */                if (b != -32) {
/* 18 */                    if (b != -19) {
/* 27 */                        if (!I0000O(b3)) {
/* 42 */                            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
/* 44 */                            return;
                                }
                            } else if (b2 < -96) {
/* 22 */                        b = -19;
/* 27 */                        if (!I0000O(b3)) {
                                }
                            }
                        } else if (b2 >= -96) {
/* 15 */                    b = -32;
/* 18 */                    if (b != -19) {
                            }
                        }
                    }
/* 47 */            I000II.I000iOII("Invalid UTF-8");
                }

                public static void I0000Il00O(byte b, byte b2, char[] cArr, int i) {
/* 3 */             if (b < -62) {
/* 30 */                I000II.I000iOII("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
                    } else if (I0000O(b2)) {
/* 24 */                I000II.I000iOII("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
                    } else {
/* 19 */                cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
                    }
                }

                public static boolean I0000O(byte b) {
                    return b > -65;
                }
            }
