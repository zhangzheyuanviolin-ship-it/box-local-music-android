            package p000;

            import java.math.RoundingMode;
            
            public abstract class li01o0OiI0l {
                static {
/* 3 */             Math.log(2.0d);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static long I00000oIO(double d) {
                    double dRint;
                    long j;
                    long j2;
/* 1 */             RoundingMode roundingMode = RoundingMode.FLOOR;
/* 9 */             if (Math.getExponent(d) > 1023) {
/* 222 */               throw new ArithmeticException("input is infinite or NaN");
                    }
                    switch (li00II00lI.I00000oIO[roundingMode.ordinal()]) {
                        case 1:
/* 128 */                   if (!I00000oOI(d)) {
/* 214 */                       throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
/* 130 */                   dRint = d;
/* 153 */                   if (!((-9.223372036854776E18d) - dRint >= 1.0d) || !(dRint < 9.223372036854776E18d)) {
/* 155 */                       return (long) dRint;
                            }
/* 159 */                   String strValueOf = String.valueOf(roundingMode);
/* 180 */                   StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 59 + strValueOf.length());
/* 185 */                   sb.append("rounded value is out of range for input ");
/* 188 */                   sb.append(d);
/* 193 */                   sb.append(" and rounding mode ");
/* 196 */                   sb.append(strValueOf);
/* 206 */                   throw new ArithmeticException(sb.toString());
                        case 2:
/* 111 */                   if (d < 0.0d && !I00000oOI(d)) {
/* 120 */                       j = (long) d;
/* 121 */                       j2 = -1;
/* 106 */                       dRint = j + j2;
/* 153 */                       if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                                }
                            }
/* 130 */                   dRint = d;
/* 153 */                   if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                            }
                            break;
                        case 3:
/* 94 */                    if (d > 0.0d && !I00000oOI(d)) {
/* 103 */                       j = (long) d;
/* 104 */                       j2 = 1;
/* 106 */                       dRint = j + j2;
/* 153 */                       if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                                }
                            }
/* 130 */                   dRint = d;
/* 153 */                   if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                            }
                            break;
                        case 4:
/* 130 */                   dRint = d;
/* 153 */                   if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                            }
                            break;
                        case 5:
/* 77 */                    if (!I00000oOI(d)) {
/* 89 */                        dRint = ((long) d) + (d > 0.0d ? 1 : -1);
                            }
/* 153 */                   if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                            }
                            break;
                        case 6:
/* 68 */                    dRint = Math.rint(d);
/* 153 */                   if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                            }
                            break;
                        case 7:
/* 48 */                    dRint = Math.rint(d);
/* 60 */                    if (Math.abs(d - dRint) == 0.5d) {
/* 66 */                        dRint = Math.copySign(0.5d, d) + d;
                            }
/* 153 */                   if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                            }
                            break;
                        case 8:
/* 33 */                    dRint = Math.rint(d);
/* 45 */                    if (Math.abs(d - dRint) == 0.5d) {
                            }
/* 153 */                   if (!(((-9.223372036854776E18d) - dRint >= 1.0d) & (dRint < 9.223372036854776E18d))) {
                            }
                            break;
                        default:
/* 27 */                    OoOil11Ol1o.I0000Il00O();
/* 30 */                    return 0L;
                    }
                }

                public static boolean I00000oOI(double d) {
/* 8 */             if (Math.getExponent(d) > 1023) {
/* 5 */                 return false;
                    }
/* 15 */            if (d != 0.0d) {
/* 28 */                ll0OlOllOl.I00000oIO("not a normal value", Math.getExponent(d) <= 1023);
/* 31 */                int exponent = Math.getExponent(d);
/* 44 */                long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
/* 64 */                if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L) > Math.getExponent(d)) {
/* 5 */                     return false;
                        }
                    }
/* 14 */            return true;
                }
            }
