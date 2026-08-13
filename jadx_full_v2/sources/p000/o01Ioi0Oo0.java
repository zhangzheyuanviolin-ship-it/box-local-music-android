            package p000;

            import java.text.ParseException;
            import java.text.ParsePosition;
            import java.util.Date;
            import java.util.GregorianCalendar;
            import java.util.TimeZone;
            
            public abstract class o01Ioi0Oo0 {
                public static final TimeZone I00000oIO = TimeZone.getTimeZone("UTC");

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
                public static Date I00000oIO(String str, ParsePosition parsePosition) throws ParseException {
                    ParsePosition parsePosition2;
                    String string;
                    int i;
                    int i2;
                    int i3;
                    int iI0000Il00O;
                    int iI0000Il00O2;
                    int length;
                    char cCharAt;
/* 7 */             ?? r3 = "Mismatching time zone indicator: ";
                    try {
/* 17 */                int index = parsePosition.getIndex();
/* 21 */                int i4 = index + 4;
/* 23 */                int iI0000Il00O3 = I0000Il00O(index, i4, str);
/* 34 */                if (I00000oOI(str, i4, '-')) {
/* 36 */                    i4 = index + 5;
                        }
/* 38 */                int i5 = i4 + 2;
/* 40 */                int iI0000Il00O4 = I0000Il00O(i4, i5, str);
/* 48 */                if (I00000oOI(str, i5, '-')) {
/* 50 */                    i5 = i4 + 3;
                        }
/* 52 */                int length2 = i5 + 2;
/* 54 */                int iI0000Il00O5 = I0000Il00O(i5, length2, str);
/* 60 */                boolean zI00000oOI = I00000oOI(str, length2, 'T');
/* 65 */                if (!zI00000oOI && str.length() <= length2) {
/* 77 */                    GregorianCalendar gregorianCalendar = new GregorianCalendar(iI0000Il00O3, iI0000Il00O4 - 1, iI0000Il00O5);
/* 80 */                    gregorianCalendar.setLenient(false);
/* 83 */                    parsePosition.setIndex(length2);
/* 86 */                    return gregorianCalendar.getTime();
                        }
/* 97 */                if (zI00000oOI) {
/* 101 */                   int i6 = i5 + 5;
/* 103 */                   int iI0000Il00O6 = I0000Il00O(i5 + 3, i6, str);
/* 113 */                   if (I00000oOI(str, i6, ':')) {
/* 115 */                       i6 = i5 + 6;
                            }
/* 117 */                   int i7 = i6 + 2;
/* 119 */                   int iI0000Il00O7 = I0000Il00O(i6, i7, str);
/* 132 */                   int i8 = I00000oOI(str, i7, ':') ? i6 + 3 : i7;
/* 137 */                   if (str.length() <= i8 || (cCharAt = str.charAt(i8)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
/* 256 */                       length2 = i8;
/* 257 */                       i3 = iI0000Il00O7;
/* 259 */                       i2 = iI0000Il00O6;
/* 261 */                       iI0000Il00O = 0;
                            } else {
/* 153 */                       int i9 = i8 + 2;
/* 155 */                       iI0000Il00O = I0000Il00O(i8, i9, str);
/* 161 */                       if (iI0000Il00O > 59 && iI0000Il00O < 63) {
/* 167 */                           iI0000Il00O = 59;
                                }
/* 175 */                       if (I00000oOI(str, i9, '.')) {
/* 177 */                           int i10 = i8 + 3;
/* 179 */                           int i11 = i8 + 4;
/* 187 */                           while (i11 < str.length()) {
/* 189 */                               char cCharAt2 = str.charAt(i11);
/* 193 */                               int i12 = i11;
/* 197 */                               if (cCharAt2 >= '0' && cCharAt2 <= '9') {
/* 204 */                                   i11 = i12 + 1;
                                        }
/* 207 */                               length2 = i12;
                                    }
/* 210 */                           length2 = str.length();
/* 217 */                           int iMin = Math.min(length2, i8 + 6);
/* 221 */                           iI0000Il00O2 = I0000Il00O(i10, iMin, str);
/* 225 */                           int i13 = iMin - i10;
/* 227 */                           if (i13 == 1) {
/* 236 */                               iI0000Il00O2 *= 100;
                                    } else if (i13 == 2) {
/* 233 */                               iI0000Il00O2 *= 10;
                                    }
/* 238 */                           i3 = iI0000Il00O7;
/* 240 */                           i2 = iI0000Il00O6;
/* 242 */                           i = iI0000Il00O4;
                                } else {
/* 247 */                           length2 = i9;
/* 248 */                           i3 = iI0000Il00O7;
/* 250 */                           i2 = iI0000Il00O6;
                                }
                            }
/* 252 */                   iI0000Il00O2 = 0;
/* 242 */                   i = iI0000Il00O4;
                        } else {
/* 263 */                   i = iI0000Il00O4;
/* 265 */                   i2 = 0;
/* 266 */                   i3 = 0;
/* 267 */                   iI0000Il00O = 0;
/* 268 */                   iI0000Il00O2 = 0;
                        }
                        try {
/* 273 */                   if (str.length() <= length2) {
/* 557 */                       throw new IllegalArgumentException("No time zone indicator");
                            }
/* 275 */                   char cCharAt3 = str.charAt(length2);
/* 279 */                   TimeZone timeZone = I00000oIO;
                            try {
/* 283 */                       if (cCharAt3 == 'Z') {
/* 287 */                           length = length2 + 1;
                                } else {
/* 295 */                           if (cCharAt3 != '+' && cCharAt3 != '-') {
/* 316 */                               StringBuilder sb = new StringBuilder(String.valueOf(cCharAt3).length() + 30);
/* 319 */                               sb.append("Invalid time zone indicator '");
/* 322 */                               sb.append(cCharAt3);
/* 325 */                               sb.append("'");
/* 335 */                               throw new IndexOutOfBoundsException(sb.toString());
                                    }
/* 341 */                           String strSubstring = str.substring(length2);
/* 350 */                           if (strSubstring.length() < 5) {
/* 362 */                               StringBuilder sb2 = new StringBuilder(strSubstring.length() + 2);
/* 365 */                               sb2.append(strSubstring);
/* 368 */                               sb2.append("00");
/* 371 */                               strSubstring = sb2.toString();
                                    }
/* 379 */                           length = length2 + strSubstring.length();
/* 386 */                           if (!strSubstring.equals("+0000") && !strSubstring.equals("+00:00")) {
/* 405 */                               StringBuilder sb3 = new StringBuilder(strSubstring.length() + 3);
/* 408 */                               sb3.append("GMT");
/* 411 */                               sb3.append(strSubstring);
/* 414 */                               String string2 = sb3.toString();
/* 418 */                               timeZone = TimeZone.getTimeZone(string2);
/* 422 */                               String id = timeZone.getID();
/* 430 */                               if (!id.equals(string2) && !id.replace(":", "").equals(string2)) {
/* 450 */                                   String id2 = timeZone.getID();
/* 471 */                                   StringBuilder sb4 = new StringBuilder(string2.length() + 53 + String.valueOf(id2).length());
/* 474 */                                   sb4.append("Mismatching time zone indicator: ");
/* 477 */                                   sb4.append(string2);
/* 480 */                                   sb4.append(" given, resolves to ");
/* 483 */                                   sb4.append(id2);
/* 493 */                                   throw new IndexOutOfBoundsException(sb4.toString());
                                        }
                                    }
                                }
/* 496 */                       GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
/* 500 */                       gregorianCalendar2.setLenient(false);
/* 504 */                       gregorianCalendar2.set(1, iI0000Il00O3);
/* 510 */                       gregorianCalendar2.set(2, i - 1);
/* 514 */                       gregorianCalendar2.set(5, iI0000Il00O5);
/* 519 */                       gregorianCalendar2.set(11, i2);
/* 524 */                       gregorianCalendar2.set(12, i3);
/* 529 */                       gregorianCalendar2.set(13, iI0000Il00O);
/* 534 */                       gregorianCalendar2.set(14, iI0000Il00O2);
/* 539 */                       parsePosition.setIndex(length);
/* 542 */                       return gregorianCalendar2.getTime();
                            } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
/* 336 */                       e = e;
/* 337 */                       parsePosition2 = parsePosition;
/* 558 */                       if (str == null) {
/* 560 */                           string = null;
                                } else {
/* 572 */                           StringBuilder sb5 = new StringBuilder(str.length() + 2);
/* 577 */                           sb5.append("\"");
/* 580 */                           sb5.append(str);
/* 583 */                           sb5.append("\"");
/* 586 */                           string = sb5.toString();
                                }
/* 590 */                       String message = e.getMessage();
/* 594 */                       if (message == null || message.isEmpty()) {
/* 606 */                           String name = e.getClass().getName();
/* 620 */                           StringBuilder sb6 = new StringBuilder(name.length() + 2);
/* 625 */                           sb6.append("(");
/* 628 */                           sb6.append(name);
/* 633 */                           sb6.append(")");
/* 636 */                           message = sb6.toString();
                                }
/* 674 */                       ParseException parseException = new ParseException(IIl001iO0Io.I00100o1O0lo(new StringBuilder(message.length() + String.valueOf(string).length() + 25), "Failed to parse date [", string, "]: ", message), parsePosition2.getIndex());
/* 677 */                       parseException.initCause(e);
/* 2988 */                      throw parseException;
                            }
                        } catch (IllegalArgumentException | IndexOutOfBoundsException e2) {
/* 547 */                   e = e2;
                            parsePosition2 = r3;
                        }
                    } catch (IllegalArgumentException | IndexOutOfBoundsException e3) {
/* 91 */                e = e3;
/* 92 */                parsePosition2 = parsePosition;
                    }
                }

                public static boolean I00000oOI(String str, int i, char c) {
                    return i < str.length() && str.charAt(i) == c;
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
