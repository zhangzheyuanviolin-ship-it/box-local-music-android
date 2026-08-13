            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.OoOil11Ol1o;
            
            final class zzaiu {
                public static void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzagr {
/* 5 */             if (!zze(b2)) {
/* 14 */                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !zze(b3) && !zze(b4)) {
/* 44 */                    int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
/* 52 */                    cArr[i] = (char) ((i2 >>> 10) + 55232);
/* 63 */                    cArr[i + 1] = (char) ((i2 & 1023) + 56320);
/* 65 */                    return;
                        }
                    }
/* 68 */            OoOil11Ol1o.I001i1O0Ol("Protocol message had invalid UTF-8.");
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
                  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void zzb(byte b, byte b2, byte b3, char[] cArr, int i) throws zzagr {
/* 5 */             if (!zze(b2)) {
/* 11 */                if (b != -32) {
/* 18 */                    if (b != -19) {
/* 27 */                        if (!zze(b3)) {
/* 42 */                            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
/* 44 */                            return;
                                }
                            } else if (b2 < -96) {
/* 22 */                        b = -19;
/* 27 */                        if (!zze(b3)) {
                                }
                            }
                        } else if (b2 >= -96) {
/* 15 */                    b = -32;
/* 18 */                    if (b != -19) {
                            }
                        }
                    }
/* 47 */            OoOil11Ol1o.I001i1O0Ol("Protocol message had invalid UTF-8.");
                }

                public static void zzc(byte b, byte b2, char[] cArr, int i) throws zzagr {
/* 3 */             if (b < -62 || zze(b2)) {
/* 24 */                OoOil11Ol1o.I001i1O0Ol("Protocol message had invalid UTF-8.");
                    } else {
/* 19 */                cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
                    }
                }

                public static boolean zzd(byte b) {
                    return b >= 0;
                }

                private static boolean zze(byte b) {
                    return b > -65;
                }
            }
