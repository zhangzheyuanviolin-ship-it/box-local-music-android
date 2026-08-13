            package p000;

            import java.text.ParseException;
            import java.text.ParsePosition;
            import java.util.Date;
            import java.util.GregorianCalendar;
            import java.util.TimeZone;
            
            public abstract class IoOll01o {
                public static final TimeZone I00000oIO = TimeZone.getTimeZone("UTC");

                public static boolean I00000oIO(String str, int i, char c) {
                    return i < str.length() && str.charAt(i) == c;
                }

                /* JADX WARN: Removed duplicated region for block: B:62:0x00f4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TRY_LEAVE, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:39:0x00a5, B:41:0x00ab, B:46:0x00b8, B:49:0x00c3, B:60:0x00ee, B:62:0x00f4, B:88:0x01a6, B:88:0x01a6, B:70:0x0106, B:70:0x0106, B:71:0x0121, B:71:0x0121, B:72:0x0122, B:72:0x0122, B:76:0x013f, B:76:0x013f, B:78:0x014c, B:78:0x014c, B:81:0x0155, B:81:0x0155, B:83:0x0174, B:83:0x0174, B:86:0x0183, B:86:0x0183, B:87:0x01a5, B:87:0x01a5, B:75:0x012e, B:75:0x012e, B:90:0x01d7, B:90:0x01d7, B:91:0x01de, B:91:0x01de, B:53:0x00d3, B:54:0x00d6, B:48:0x00bf), top: B:102:0x0004 }] */
                /* JADX WARN: Removed duplicated region for block: B:90:0x01d7 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:39:0x00a5, B:41:0x00ab, B:46:0x00b8, B:49:0x00c3, B:60:0x00ee, B:62:0x00f4, B:88:0x01a6, B:88:0x01a6, B:70:0x0106, B:70:0x0106, B:71:0x0121, B:71:0x0121, B:72:0x0122, B:72:0x0122, B:76:0x013f, B:76:0x013f, B:78:0x014c, B:78:0x014c, B:81:0x0155, B:81:0x0155, B:83:0x0174, B:83:0x0174, B:86:0x0183, B:86:0x0183, B:87:0x01a5, B:87:0x01a5, B:75:0x012e, B:75:0x012e, B:90:0x01d7, B:90:0x01d7, B:91:0x01de, B:91:0x01de, B:53:0x00d3, B:54:0x00d6, B:48:0x00bf), top: B:102:0x0004 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Date I00000oOI(String str, ParsePosition parsePosition) throws ParseException {
                    int i;
                    int i2;
                    int iI0000Il00O;
                    int iI0000Il00O2;
                    int length;
                    char cCharAt;
                    int length2;
                    try {
/* 5 */                 int index = parsePosition.getIndex();
/* 9 */                 int i3 = index + 4;
/* 11 */                int iI0000Il00O3 = I0000Il00O(index, i3, str);
/* 22 */                if (I00000oIO(str, i3, '-')) {
/* 24 */                    i3 = index + 5;
                        }
/* 26 */                int i4 = i3 + 2;
/* 28 */                int iI0000Il00O4 = I0000Il00O(i3, i4, str);
/* 36 */                if (I00000oIO(str, i4, '-')) {
/* 38 */                    i4 = i3 + 3;
                        }
/* 40 */                int i5 = i4 + 2;
/* 42 */                int iI0000Il00O5 = I0000Il00O(i4, i5, str);
/* 48 */                boolean zI00000oIO = I00000oIO(str, i5, 'T');
/* 54 */                if (!zI00000oIO && str.length() <= i5) {
/* 65 */                    GregorianCalendar gregorianCalendar = new GregorianCalendar(iI0000Il00O3, iI0000Il00O4 - 1, iI0000Il00O5);
/* 68 */                    gregorianCalendar.setLenient(false);
/* 71 */                    parsePosition.setIndex(i5);
/* 74 */                    return gregorianCalendar.getTime();
                        }
/* 87 */                if (zI00000oIO) {
/* 91 */                    int i6 = i4 + 5;
/* 93 */                    int iI0000Il00O6 = I0000Il00O(i4 + 3, i6, str);
/* 103 */                   if (I00000oIO(str, i6, ':')) {
/* 105 */                       i6 = i4 + 6;
                            }
/* 107 */                   int i7 = i6 + 2;
/* 109 */                   int iI0000Il00O7 = I0000Il00O(i6, i7, str);
/* 117 */                   if (I00000oIO(str, i7, ':')) {
/* 119 */                       i7 = i6 + 3;
                            }
/* 126 */                   if (str.length() > i7 && (cCharAt = str.charAt(i7)) != 'Z' && cCharAt != '+' && cCharAt != '-') {
/* 138 */                       int i8 = i7 + 2;
/* 140 */                       iI0000Il00O2 = I0000Il00O(i7, i8, str);
/* 146 */                       if (iI0000Il00O2 > 59 && iI0000Il00O2 < 63) {
/* 152 */                           iI0000Il00O2 = 59;
                                }
/* 160 */                       if (I00000oIO(str, i8, '.')) {
/* 162 */                           int i9 = i7 + 3;
/* 170 */                           for (int i10 = i7 + 4; i10 < str.length(); i10++) {
/* 172 */                               char cCharAt2 = str.charAt(i10);
/* 178 */                               if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                                        }
/* 190 */                               length2 = i10;
                                    }
/* 192 */                           length2 = str.length();
/* 198 */                           int iMin = Math.min(length2, i7 + 6);
/* 202 */                           iI0000Il00O = I0000Il00O(i9, iMin, str);
/* 206 */                           int i11 = iMin - i9;
/* 207 */                           if (i11 == 1) {
/* 215 */                               iI0000Il00O *= 100;
                                    } else if (i11 == 2) {
/* 212 */                               iI0000Il00O *= 10;
                                    }
/* 217 */                           i = iI0000Il00O6;
/* 218 */                           i5 = length2;
/* 219 */                           i2 = iI0000Il00O7;
                                } else {
/* 222 */                           i = iI0000Il00O6;
/* 223 */                           i5 = i8;
/* 224 */                           i2 = iI0000Il00O7;
/* 226 */                           iI0000Il00O = 0;
                                }
/* 243 */                       if (str.length() > i5) {
/* 479 */                           throw new IllegalArgumentException("No time zone indicator");
                                }
/* 245 */                       char cCharAt3 = str.charAt(i5);
/* 249 */                       TimeZone timeZone = I00000oIO;
/* 251 */                       if (cCharAt3 == 'Z') {
/* 253 */                           length = i5 + 1;
                                } else {
/* 256 */                           if (cCharAt3 != '+' && cCharAt3 != '-') {
/* 290 */                               throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + "'");
                                    }
/* 291 */                           String strSubstring = str.substring(i5);
/* 300 */                           if (strSubstring.length() < 5) {
/* 316 */                               strSubstring = strSubstring + "00";
                                    }
/* 324 */                           length = i5 + strSubstring.length();
/* 331 */                           if (!strSubstring.equals("+0000") && !strSubstring.equals("+00:00")) {
/* 355 */                               String str2 = "GMT" + strSubstring;
/* 359 */                               timeZone = TimeZone.getTimeZone(str2);
/* 363 */                               String id = timeZone.getID();
/* 371 */                               if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
/* 422 */                                   throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                                        }
                                    }
                                }
/* 425 */                       GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
/* 429 */                       gregorianCalendar2.setLenient(false);
/* 432 */                       gregorianCalendar2.set(1, iI0000Il00O3);
/* 437 */                       gregorianCalendar2.set(2, iI0000Il00O4 - 1);
/* 441 */                       gregorianCalendar2.set(5, iI0000Il00O5);
/* 446 */                       gregorianCalendar2.set(11, i);
/* 451 */                       gregorianCalendar2.set(12, i2);
/* 456 */                       gregorianCalendar2.set(13, iI0000Il00O2);
/* 461 */                       gregorianCalendar2.set(14, iI0000Il00O);
/* 464 */                       parsePosition.setIndex(length);
/* 467 */                       return gregorianCalendar2.getTime();
                            }
/* 229 */                   i5 = i7;
/* 230 */                   i = iI0000Il00O6;
/* 231 */                   i2 = iI0000Il00O7;
                        } else {
/* 236 */                   i = 0;
/* 237 */                   i2 = 0;
                        }
/* 233 */               iI0000Il00O = 0;
/* 234 */               iI0000Il00O2 = 0;
/* 243 */               if (str.length() > i5) {
                        }
                    } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
/* 488 */               String strI000iOII = str == null ? null : IIl001iO0Io.I000iOII('\"', "\"", str);
/* 492 */               String message = e.getMessage();
/* 496 */               if (message == null || message.isEmpty()) {
/* 527 */                   message = "(" + e.getClass().getName() + ")";
                        }
/* 545 */               ParseException parseException = new ParseException(IIl001iO0Io.I000oI1ioi("Failed to parse date [", strI000iOII, "]: ", message), parsePosition.getIndex());
/* 548 */               parseException.initCause(e);
/* 551 */               throw parseException;
                    }
                }

                public static int I0000Il00O(int i, int i2, String str) {
                    int i3;
                    int i4;
/* 1 */             if (i < 0 || i2 > str.length() || i > i2) {
/* 215 */               throw new NumberFormatException(str);
                    }
/* 15 */            if (i < i2) {
/* 17 */                i4 = i + 1;
/* 23 */                int iDigit = Character.digit(str.charAt(i), 10);
/* 27 */                if (iDigit < 0) {
/* 44 */                    throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
                        }
/* 29 */                i3 = -iDigit;
                    } else {
/* 45 */                i3 = 0;
/* 46 */                i4 = i;
                    }
/* 47 */            while (i4 < i2) {
/* 49 */                int i5 = i4 + 1;
/* 55 */                int iDigit2 = Character.digit(str.charAt(i4), 10);
/* 59 */                if (iDigit2 < 0) {
/* 79 */                    throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
                        }
/* 63 */                i3 = (i3 * 10) - iDigit2;
/* 64 */                i4 = i5;
                    }
/* 80 */            return -i3;
                }
            }
