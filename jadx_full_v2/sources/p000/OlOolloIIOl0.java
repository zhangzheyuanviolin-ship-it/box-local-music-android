            package p000;
            
            public abstract class OlOolloIIOl0 extends OlOoll1I0 {
                public static boolean I000II(String str, String str2, boolean z) {
                    return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
                }

                public static boolean I000O01llI0(String str, String str2, boolean z) {
                    return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
                }

                public static final void I000OOo1O(String str) {
/* 49 */            throw new NumberFormatException(IIl001iO0Io.I000iOII('\'', "Invalid number format: '", str));
                }

                public static String I000OiO(int i, String str) {
/* 1 */             if (i < 0) {
/* 77 */                I000II.I0010I0i(Oi010OO0.I0010I0i("Count 'n' must be non-negative, but was ", i, '.'));
/* 80 */                return null;
                    }
/* 3 */             if (i == 0) {
/* 66 */                return "";
                    }
/* 5 */             int i2 = 1;
/* 6 */             if (i == 1) {
/* 61 */                return str.toString();
                    }
/* 8 */             int length = str.length();
/* 12 */            if (length == 0) {
/* 66 */                return "";
                    }
/* 14 */            if (length != 1) {
/* 23 */                StringBuilder sb = new StringBuilder(str.length() * i);
/* 26 */                if (1 <= i) {
                            while (true) {
/* 28 */                        sb.append((CharSequence) str);
/* 31 */                        if (i2 == i) {
                                    break;
                                }
/* 33 */                        i2++;
                            }
                        }
/* 36 */                return sb.toString();
                    }
/* 42 */            char cCharAt = str.charAt(0);
/* 46 */            char[] cArr = new char[i];
/* 48 */            for (int i3 = 0; i3 < i; i3++) {
/* 50 */                cArr[i3] = cCharAt;
                    }
/* 57 */            return new String(cArr);
                }

                public static String I000iOII(String str, String str2, String str3) {
/* 2 */             int iI001IIilI0O = OlOoOIi0o.I001IIilI0O(str, str2, 0, false);
/* 6 */             if (iI001IIilI0O < 0) {
/* 8 */                 return str;
                    }
/* 9 */             int length = str2.length();
/* 14 */            int i = length >= 1 ? length : 1;
/* 27 */            int length2 = str3.length() + (str.length() - length);
/* 28 */            if (length2 < 0) {
/* 215 */               throw new OutOfMemoryError();
                    }
/* 32 */            StringBuilder sb = new StringBuilder(length2);
/* 35 */            int i2 = 0;
/* 55 */            do {
/* 36 */                sb.append((CharSequence) str, i2, iI001IIilI0O);
/* 39 */                sb.append(str3);
/* 42 */                i2 = iI001IIilI0O + length;
/* 48 */                if (iI001IIilI0O >= str.length()) {
                            break;
                        }
/* 51 */                iI001IIilI0O = OlOoOIi0o.I001IIilI0O(str, str2, iI001IIilI0O + i, false);
/* 55 */            } while (iI001IIilI0O > 0);
/* 61 */            sb.append((CharSequence) str, i2, str.length());
/* 64 */            return sb.toString();
                }

                public static boolean I000l1(String str, String str2, boolean z) {
/* 1 */             if (!z) {
/* 3 */                 return str.startsWith(str2);
                    }
/* 8 */             int length = str2.length();
                    return !z ? str.regionMatches(0, str2, 0, length) : str.regionMatches(z, 0, str2, 0, length);
                }

                public static Integer I000lI(int i, String str) {
                    boolean z;
                    int i2;
                    int i3;
/* 1 */             iOlI1lIi0.I00000oIO(i);
/* 4 */             int length = str.length();
/* 8 */             if (length == 0) {
/* 79 */                return null;
                    }
/* 11 */            int i4 = 0;
/* 12 */            char cCharAt = str.charAt(0);
/* 22 */            int i5 = -2147483647;
/* 25 */            if (O0000Ioio00.I0000oI00(cCharAt, 48) < 0) {
/* 27 */                i2 = 1;
/* 28 */                if (length == 1) {
/* 79 */                    return null;
                        }
/* 33 */                if (cCharAt == '+') {
/* 44 */                    z = false;
                        } else {
/* 37 */                    if (cCharAt != '-') {
/* 79 */                        return null;
                            }
/* 40 */                    i5 = Integer.MIN_VALUE;
/* 42 */                    z = true;
                        }
                    } else {
/* 46 */                z = false;
/* 47 */                i2 = 0;
                    }
/* 51 */            int i6 = -59652323;
/* 52 */            while (i2 < length) {
/* 58 */                int iDigit = Character.digit((int) str.charAt(i2), i);
/* 62 */                if (iDigit < 0) {
/* 79 */                    return null;
                        }
/* 65 */                if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + iDigit) {
/* 79 */                    return null;
                        }
/* 81 */                i4 = i3 - iDigit;
/* 82 */                i2++;
                    }
                    return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
                }

                public static Long I000o00OoI0I(String str) {
                    boolean z;
/* 5 */             iOlI1lIi0.I00000oIO(10);
/* 8 */             int length = str.length();
/* 12 */            if (length == 0) {
/* 103 */               return null;
                    }
/* 15 */            int i = 0;
/* 16 */            char cCharAt = str.charAt(0);
/* 26 */            long j = -9223372036854775807L;
/* 31 */            if (O0000Ioio00.I0000oI00(cCharAt, 48) < 0) {
/* 33 */                z = true;
/* 34 */                if (length == 1) {
/* 103 */                   return null;
                        }
/* 39 */                if (cCharAt == '+') {
/* 52 */                    z = false;
/* 53 */                    i = 1;
                        } else {
/* 43 */                    if (cCharAt != '-') {
/* 103 */                       return null;
                            }
/* 46 */                    j = Long.MIN_VALUE;
/* 48 */                    i = 1;
                        }
                    } else {
/* 56 */                z = false;
                    }
/* 62 */            long j2 = 0;
/* 64 */            long j3 = -256204778801521550L;
/* 65 */            while (i < length) {
/* 71 */                int iDigit = Character.digit((int) str.charAt(i), 10);
/* 75 */                if (iDigit < 0) {
/* 103 */                   return null;
                        }
/* 82 */                if (j2 < j3) {
/* 86 */                    if (j3 != -256204778801521550L) {
/* 103 */                       return null;
                            }
/* 88 */                    j3 = j / 10;
/* 92 */                    if (j2 < j3) {
/* 103 */                       return null;
                            }
                        }
/* 95 */                long j4 = j2 * 10;
                        long j5 = iDigit;
/* 101 */               if (j4 < j + j5) {
/* 103 */                   return null;
                        }
/* 105 */               j2 = j4 - j5;
/* 106 */               i++;
                    }
                    return z ? Long.valueOf(j2) : Long.valueOf(-j2);
                }
            }
