            package p000;

            import java.math.RoundingMode;
            
            public abstract class iooili11 {
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
                
                    if (r0 > 0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
                
                    if (r4 > 0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
                
                    if (r4 < 0) goto L19;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static int I00000oIO(int i, int i2) {
/* 1 */             RoundingMode roundingMode = RoundingMode.CEILING;
/* 3 */             roundingMode.getClass();
/* 6 */             if (i2 == 0) {
/* 83 */                throw new ArithmeticException("/ by zero");
                    }
/* 8 */             int i3 = i / i2;
/* 12 */            int i4 = i - (i2 * i3);
/* 14 */            if (i4 != 0) {
/* 20 */                int i5 = ((i ^ i2) >> 31) | 1;
                        switch (IooIoOIl.I00000oIO[roundingMode.ordinal()]) {
                            case 1:
/* 65 */                        if (i4 != 0) {
/* 75 */                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                            case 2:
/* 67 */                        return i3;
                            case 3:
                                break;
                            case 4:
/* 63 */                        return i3 + i5;
                            case 5:
                                break;
                            case 6:
                            case 7:
                            case 8:
/* 38 */                        int iAbs = Math.abs(i4);
/* 47 */                        int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
/* 48 */                        if (iAbs2 == 0) {
/* 50 */                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
/* 52 */                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                                }
/* 67 */                        return i3;
                            default:
/* 33 */                        OoOil11Ol1o.I0000Il00O();
/* 36 */                        return 0;
                        }
                    }
/* 67 */            return i3;
                }

                public static int I00000oOI(int i) {
/* 1 */             RoundingMode roundingMode = RoundingMode.UNNECESSARY;
/* 3 */             if (i <= 0) {
/* 87 */                I000II.I000iOII(IIlIOloOOO.I00100l0("x (", i, ") must be > 0"));
/* 90 */                return 0;
                    }
                    switch (IooIoOIl.I00000oIO[roundingMode.ordinal()]) {
                        case 1:
/* 62 */                    if (!((i > 0) & (((i + (-1)) & i) == 0))) {
/* 78 */                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                            break;
                        case 2:
                        case 3:
                            break;
                        case 4:
                        case 5:
/* 44 */                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                        case 6:
                        case 7:
                        case 8:
/* 22 */                    int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
/* 37 */                    return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
                        default:
/* 17 */                    OoOil11Ol1o.I0000Il00O();
/* 20 */                    return 0;
                    }
/* 68 */            return 31 - Integer.numberOfLeadingZeros(i);
                }
            }
