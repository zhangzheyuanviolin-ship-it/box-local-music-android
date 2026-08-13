            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.math.RoundingMode;
            import p000.I000II;
            import p000.OoOil11Ol1o;
            
            public final class zzil {
                public static int zza(int i, int i2, RoundingMode roundingMode) {
/* 1 */             roundingMode.getClass();
/* 4 */             if (i2 == 0) {
/* 88 */                throw new ArithmeticException("/ by zero");
                    }
/* 6 */             int i3 = i / i2;
/* 10 */            int i4 = i - (i2 * i3);
/* 12 */            if (i4 == 0) {
/* 76 */                return i3;
                    }
/* 27 */            int i5 = ((i ^ i2) >> 31) | 1;
                    switch (zzik.zza[roundingMode.ordinal()]) {
                        case 1:
/* 77 */                    zzim.zza(false);
/* 80 */                    return i3;
                        case 2:
/* 76 */                    return i3;
                        case 3:
/* 73 */                    if (i5 >= 0) {
/* 76 */                        return i3;
                            }
                            break;
                        case 4:
                            break;
                        case 5:
/* 69 */                    if (i5 <= 0) {
/* 72 */                        return i3;
                            }
                            break;
                        case 6:
                        case 7:
                        case 8:
/* 36 */                    int iAbs = Math.abs(i4);
/* 45 */                    int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
/* 46 */                    if (iAbs2 == 0) {
/* 50 */                        if (roundingMode != RoundingMode.HALF_UP) {
/* 61 */                            if ((i3 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
/* 64 */                                return i3;
                                    }
                                }
                            } else if (iAbs2 <= 0) {
/* 68 */                        return i3;
                            }
                            break;
                        default:
/* 32 */                    OoOil11Ol1o.I0000Il00O();
/* 28 */                    return 0;
                    }
/* 75 */            return i3 + i5;
                }

                public static int zzb(int i, RoundingMode roundingMode) {
/* 1 */             if (i <= 0) {
/* 63 */                I000II.I000iOII("x (0) must be > 0");
/* 66 */                return 0;
                    }
                    switch (zzik.zza[roundingMode.ordinal()]) {
                        case 1:
/* 51 */                    zzim.zza(((i + (-1)) & i) == 0);
                            break;
                        case 2:
                        case 3:
                            break;
                        case 4:
                        case 5:
/* 40 */                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                        case 6:
                        case 7:
                        case 8:
/* 19 */                    int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
/* 32 */                    return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i) >>> 31);
                        default:
/* 14 */                    OoOil11Ol1o.I0000Il00O();
/* 17 */                    return 0;
                    }
/* 58 */            return 31 - Integer.numberOfLeadingZeros(i);
                }
            }
