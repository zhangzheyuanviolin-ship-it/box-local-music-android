            package p000;

            import java.util.GregorianCalendar;
            import java.util.Locale;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            public abstract class iioiIiIlo {
                public static int I00000oIO(String str, int i, int i2, boolean z) {
/* 1 */             while (i < i2) {
/* 3 */                 char cCharAt = str.charAt(i);
/* 55 */                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
/* 57 */                    return i;
                        }
/* 58 */                i++;
                    }
/* 483 */           return i2;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static long I00000oOI(int i, String str) throws NumberFormatException {
/* 2 */             int iI00000oIO = I00000oIO(str, 0, i, false);
/* 8 */             Matcher matcher = IOoll0l1oOO.I000lI.matcher(str);
/* 13 */            int i2 = -1;
/* 14 */            int i3 = -1;
/* 15 */            int i4 = -1;
/* 16 */            int iI001i1lo1io = -1;
/* 17 */            int i5 = -1;
/* 18 */            int i6 = -1;
/* 21 */            while (iI00000oIO < i) {
/* 25 */                int iI00000oIO2 = I00000oIO(str, iI00000oIO + 1, i, true);
/* 29 */                matcher.region(iI00000oIO, iI00000oIO2);
/* 32 */                if (i3 == -1 && matcher.usePattern(IOoll0l1oOO.I000lI).matches()) {
/* 50 */                    i3 = Integer.parseInt(matcher.group(1));
/* 58 */                    i5 = Integer.parseInt(matcher.group(2));
/* 67 */                    i6 = Integer.parseInt(matcher.group(3));
                        } else if (i4 == -1 && matcher.usePattern(IOoll0l1oOO.I000l1).matches()) {
/* 90 */                    i4 = Integer.parseInt(matcher.group(1));
                        } else if (iI001i1lo1io == -1) {
/* 97 */                    Pattern pattern = IOoll0l1oOO.I000iOII;
/* 107 */                   if (matcher.usePattern(pattern).matches()) {
/* 128 */                       iI001i1lo1io = OlOoOIi0o.I001i1lo1io(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                            } else if (i2 == -1 && matcher.usePattern(IOoll0l1oOO.I000OiO).matches()) {
/* 149 */                       i2 = Integer.parseInt(matcher.group(1));
                            }
                        }
/* 155 */               iI00000oIO = I00000oIO(str, iI00000oIO2 + 1, i, false);
                    }
/* 163 */           if (70 <= i2 && i2 < 100) {
/* 169 */               i2 += 1900;
                    }
/* 171 */           if (i2 >= 0 && i2 < 70) {
/* 175 */               i2 += 2000;
                    }
/* 183 */           if (i2 < 1601) {
/* 275 */               I000II.I000iOII("Failed requirement.");
/* 179 */               return 0L;
                    }
/* 185 */           if (iI001i1lo1io == -1) {
/* 271 */               I000II.I000iOII("Failed requirement.");
/* 179 */               return 0L;
                    }
/* 187 */           if (1 > i4 || i4 >= 32) {
/* 267 */               I000II.I000iOII("Failed requirement.");
/* 179 */               return 0L;
                    }
/* 193 */           if (i3 < 0 || i3 >= 24) {
/* 263 */               I000II.I000iOII("Failed requirement.");
/* 179 */               return 0L;
                    }
/* 199 */           if (i5 < 0 || i5 >= 60) {
/* 259 */               I000II.I000iOII("Failed requirement.");
/* 179 */               return 0L;
                    }
/* 205 */           if (i6 < 0 || i6 >= 60) {
/* 255 */               I000II.I000iOII("Failed requirement.");
/* 179 */               return 0L;
                    }
/* 213 */           GregorianCalendar gregorianCalendar = new GregorianCalendar(OollIoI001lo.I0000oI00);
/* 216 */           gregorianCalendar.setLenient(false);
/* 219 */           gregorianCalendar.set(1, i2);
/* 223 */           gregorianCalendar.set(2, iI001i1lo1io - 1);
/* 227 */           gregorianCalendar.set(5, i4);
/* 232 */           gregorianCalendar.set(11, i3);
/* 237 */           gregorianCalendar.set(12, i5);
/* 242 */           gregorianCalendar.set(13, i6);
/* 247 */           gregorianCalendar.set(14, 0);
/* 250 */           return gregorianCalendar.getTimeInMillis();
                }
            }
