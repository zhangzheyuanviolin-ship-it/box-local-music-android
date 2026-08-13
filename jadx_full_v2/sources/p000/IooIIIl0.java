            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IooIIIl0 implements O0O01001OOII {
                public static final IooIIIl0 I00000oIO = new IooIIIl0();
                public static final OOIii1ili I00000oOI = new OOIii1ili("kotlin.time.Instant", OOIOoio0iiI.I000OiO);

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:194:0x046e  */
                /* JADX WARN: Removed duplicated region for block: B:195:0x0484  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    char cCharAt;
                    Ioo1oiOl ioo1oiOlI0000Il00O;
                    char cCharAt2;
/* 1 */             Ioo1Ololi1 ioo1Ololi1 = Ioo1Ololi1.I00iiO;
/* 3 */             String strI0010o = ii1iO1O.I0010o();
/* 11 */            if (strI0010o.length() == 0) {
/* 17 */                ioo1oiOlI0000Il00O = new Ioo1oiOl("An empty string is not a valid Instant", strI0010o);
                    } else {
/* 23 */                char cCharAt3 = strI0010o.charAt(0);
/* 34 */                if (cCharAt3 == '+' || cCharAt3 == '-') {
/* 41 */                    i = 1;
                        } else {
/* 38 */                    i = 0;
/* 39 */                    cCharAt3 = ' ';
                        }
/* 42 */                int iCharAt = 0;
/* 43 */                int i5 = i;
/* 52 */                while (i5 < strI0010o.length() && '0' <= (cCharAt2 = strI0010o.charAt(i5)) && cCharAt2 < ':') {
/* 69 */                    iCharAt = (iCharAt * 10) + (strI0010o.charAt(i5) - '0');
/* 70 */                    i5++;
                        }
/* 73 */                int i6 = i5 - i;
/* 79 */                if (i6 > 10) {
/* 98 */                    ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Expected at most 10 digits for the year number, got " + i6 + " digits");
                        } else if (i6 == 10 && O0000Ioio00.I0000oI00(strI0010o.charAt(i), 50) >= 0) {
/* 135 */                   ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
                        } else if (i6 < 4) {
/* 161 */                   ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "The year number must be padded to 4 digits, got " + i6 + " digits");
                        } else if (cCharAt3 == '+' && i6 == 4) {
/* 173 */                   ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
                        } else if (cCharAt3 != ' ' || i6 == 4) {
/* 191 */                   if (cCharAt3 == '-') {
/* 193 */                       iCharAt = -iCharAt;
                            }
/* 198 */                   int i7 = i5 + 16;
/* 200 */                   if (strI0010o.length() < i7) {
/* 204 */                       ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "The input string is too short");
                            } else {
/* 219 */                       Ioo1oiOl ioo1oiOlI00000oOI = iIo1li.I00000oOI(strI0010o, "'-'", i5, new IoI0IiI0(15));
/* 223 */                       if (ioo1oiOlI00000oOI != null) {
/* 225 */                           ioo1oiOlI0000Il00O = ioo1oiOlI00000oOI;
                                    break;
                                }
/* 239 */                       Ioo1oiOl ioo1oiOlI00000oOI2 = iIo1li.I00000oOI(strI0010o, "'-'", i5 + 3, new IoI0IiI0(16));
                                ioo1oiOlI0000Il00O = ioo1oiOlI00000oOI2;
/* 243 */                       if (ioo1oiOlI00000oOI2 == null) {
/* 258 */                           Ioo1oiOl ioo1oiOlI00000oOI3 = iIo1li.I00000oOI(strI0010o, "'T' or 't'", i5 + 6, new IoI0IiI0(17));
                                    ioo1oiOlI0000Il00O = ioo1oiOlI00000oOI3;
/* 262 */                           if (ioo1oiOlI00000oOI3 == null) {
/* 277 */                               Ioo1oiOl ioo1oiOlI00000oOI4 = iIo1li.I00000oOI(strI0010o, "':'", i5 + 9, new IoI0IiI0(18));
                                        ioo1oiOlI0000Il00O = ioo1oiOlI00000oOI4;
/* 281 */                               if (ioo1oiOlI00000oOI4 == null) {
/* 294 */                                   Ioo1oiOl ioo1oiOlI00000oOI5 = iIo1li.I00000oOI(strI0010o, "':'", i5 + 12, new IoI0IiI0(19));
                                            ioo1oiOlI0000Il00O = ioo1oiOlI00000oOI5;
/* 298 */                                   if (ioo1oiOlI00000oOI5 == null) {
/* 303 */                                       for (int i8 = 0; i8 < 10; i8++) {
/* 319 */                                           ioo1oiOlI00000oOI = iIo1li.I00000oOI(strI0010o, "an ASCII digit", iIo1li.I00000oOI[i8] + i5, new IoI0IiI0(20));
/* 323 */                                           if (ioo1oiOlI00000oOI != null) {
/* 225 */                                               ioo1oiOlI0000Il00O = ioo1oiOlI00000oOI;
                                                        break;
                                                    }
                                                }
/* 331 */                                       int iI0000O = iIo1li.I0000O(i5 + 1, strI0010o);
/* 337 */                                       int iI0000O2 = iIo1li.I0000O(i5 + 4, strI0010o);
/* 343 */                                       int iI0000O3 = iIo1li.I0000O(i5 + 7, strI0010o);
/* 349 */                                       int iI0000O4 = iIo1li.I0000O(i5 + 10, strI0010o);
/* 355 */                                       int iI0000O5 = iIo1li.I0000O(i5 + 13, strI0010o);
/* 359 */                                       int i9 = i5 + 15;
/* 369 */                                       if (strI0010o.charAt(i9) == '.') {
/* 371 */                                           i9 = i7;
/* 372 */                                           int iCharAt2 = 0;
/* 377 */                                           while (i9 < strI0010o.length() && '0' <= (cCharAt = strI0010o.charAt(i9)) && cCharAt < ':') {
/* 394 */                                               iCharAt2 = (iCharAt2 * 10) + (strI0010o.charAt(i9) - '0');
/* 395 */                                               i9++;
                                                    }
/* 398 */                                           int i10 = i9 - i7;
/* 400 */                                           if (1 > i10 || i10 >= 10) {
/* 431 */                                               ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "1..9 digits are supported for the fraction of the second, got " + i10 + " digits");
                                                    } else {
/* 412 */                                               i2 = iCharAt2 * iIo1li.I00000oIO[9 - i10];
                                                    }
                                                } else {
/* 437 */                                           i2 = 0;
                                                }
/* 442 */                                       if (i9 >= strI0010o.length()) {
/* 446 */                                           ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "The UTC offset at the end of the string is missing");
                                                } else {
/* 452 */                                           char cCharAt4 = strI0010o.charAt(i9);
/* 465 */                                           if (cCharAt4 == '+' || cCharAt4 == '-') {
/* 545 */                                               int length = strI0010o.length() - i9;
/* 546 */                                               if (length > 9) {
/* 585 */                                                   ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "The UTC offset string \"" + iIo1li.I0000oI00(16, strI0010o.subSequence(i9, strI0010o.length()).toString()) + "\" is too long");
                                                        } else if (length % 3 != 0) {
/* 626 */                                                   ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Invalid UTC offset string \"" + strI0010o.subSequence(i9, strI0010o.length()).toString() + '\"');
                                                        } else {
/* 632 */                                                   int i11 = 0;
/* 633 */                                                   for (int i12 = 2; i11 < i12; i12 = 2) {
/* 639 */                                                       int i13 = i9 + iIo1li.I0000Il00O[i11];
/* 645 */                                                       if (i13 >= strI0010o.length()) {
                                                                    break;
                                                                }
/* 652 */                                                       if (strI0010o.charAt(i13) != ':') {
/* 656 */                                                           StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Expected ':' at index ", i13, ", got '");
/* 664 */                                                           sbI00100o1O0lo.append(strI0010o.charAt(i13));
/* 669 */                                                           sbI00100o1O0lo.append('\'');
/* 676 */                                                           ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, sbI00100o1O0lo.toString());
                                                                    break;
                                                                }
/* 682 */                                                       i11++;
                                                            }
/* 688 */                                                   int i14 = 0;
/* 690 */                                                   while (i14 < 6 && (i4 = iIo1li.I0000O[i14] + i9) < strI0010o.length()) {
/* 704 */                                                       char cCharAt5 = strI0010o.charAt(i4);
/* 708 */                                                       int i15 = i14;
/* 712 */                                                       if ('0' > cCharAt5 || cCharAt5 >= ':') {
/* 722 */                                                           StringBuilder sbI00100o1O0lo2 = IlIi0I0.I00100o1O0lo("Expected an ASCII digit at index ", i4, ", got '");
/* 730 */                                                           sbI00100o1O0lo2.append(strI0010o.charAt(i4));
/* 735 */                                                           sbI00100o1O0lo2.append('\'');
/* 742 */                                                           ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, sbI00100o1O0lo2.toString());
                                                                    break;
                                                                }
/* 716 */                                                       i14 = i15 + 1;
                                                            }
/* 750 */                                                   int iI0000O6 = iIo1li.I0000O(i9 + 1, strI0010o);
/* 765 */                                                   int iI0000O7 = length > 3 ? iIo1li.I0000O(i9 + 4, strI0010o) : 0;
/* 778 */                                                   int iI0000O8 = length > 6 ? iIo1li.I0000O(i9 + 7, strI0010o) : 0;
/* 780 */                                                   if (iI0000O7 > 59) {
/* 796 */                                                       ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Expected offset-minute-of-hour in 0..59, got " + iI0000O7);
                                                            } else if (iI0000O8 > 59) {
/* 818 */                                                       ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Expected offset-second-of-minute in 0..59, got " + iI0000O8);
                                                            } else if (iI0000O6 <= 17 || (iI0000O6 == 18 && iI0000O7 == 0 && iI0000O8 == 0)) {
/* 882 */                                                       i3 = ((iI0000O7 * 60) + (iI0000O6 * 3600) + iI0000O8) * (cCharAt4 == '-' ? -1 : 1);
/* 885 */                                                       if (1 <= iI0000O || iI0000O >= 13) {
/* 1171 */                                                          ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Expected a month number in 1..12, got " + iI0000O);
                                                                } else if (1 > iI0000O2) {
/* 1141 */                                                          StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("Expected a valid day-of-month for month ", iI0000O, " of year ", iCharAt, ", got ");
/* 1145 */                                                          sbI0010I0i.append(iI0000O2);
/* 1152 */                                                          ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, sbI0010I0i.toString());
                                                                } else {
/* 893 */                                                           int i16 = iCharAt & 3;
/* 939 */                                                           if (iI0000O2 <= (iI0000O != 2 ? (iI0000O == 4 || iI0000O == 6 || iI0000O == 9 || iI0000O == 11) ? 30 : 31 : i16 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
/* 943 */                                                               if (iI0000O3 > 23) {
/* 959 */                                                                   ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Expected hour in 0..23, got " + iI0000O3);
                                                                        } else if (iI0000O4 > 59) {
/* 983 */                                                                   ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Expected minute-of-hour in 0..59, got " + iI0000O4);
                                                                        } else if (iI0000O5 > 59) {
/* 1005 */                                                                  ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Expected second-of-minute in 0..59, got " + iI0000O5);
                                                                        } else {
                                                                            long j = iCharAt;
/* 1014 */                                                                  long j2 = 365 * j;
/* 1082 */                                                                  long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (((iI0000O * 367) - 362) / 12) + (iI0000O2 - 1);
/* 1084 */                                                                  if (iI0000O > 2) {
/* 1103 */                                                                      j3 = (i16 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                                            }
/* 1124 */                                                                  IooI0ilii iooI0ilii = new IooI0ilii();
/* 1127 */                                                                  iooI0ilii.I00000oIO = (((j3 - 719528) * 86400) + (((iI0000O4 * 60) + (iI0000O3 * 3600)) + iI0000O5)) - i3;
/* 1129 */                                                                  iooI0ilii.I00000oOI = i2;
/* 1131 */                                                                  VarHandle.storeStoreFence();
                                                                            ioo1oiOlI0000Il00O = iooI0ilii;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
/* 862 */                                                       ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Expected an offset in -18:00..+18:00, got " + strI0010o.subSequence(i9, strI0010o.length()).toString());
                                                            }
                                                        }
                                                    } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
/* 512 */                                               int i17 = i9 + 1;
/* 514 */                                               if (strI0010o.length() == i17) {
/* 516 */                                                   i3 = 0;
/* 885 */                                                   if (1 <= iI0000O) {
/* 1171 */                                                      ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Expected a month number in 1..12, got " + iI0000O);
                                                            }
                                                        } else {
/* 535 */                                                   ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Extra text after the instant at position " + i17);
                                                        }
                                                    } else {
/* 502 */                                               ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "Expected the UTC offset at position " + i9 + ", got '" + cCharAt4 + '\'');
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
/* 185 */                   ioo1oiOlI0000Il00O = iIo1li.I0000Il00O(strI0010o, "A '+' or '-' sign is required for year numbers longer than 4 digits");
                        }
                    }
/* 1175 */          return ioo1oiOlI0000Il00O.toInstant();
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 7 */             il0I1ii.I001lloI(((Ioo1Ololi1) obj).toString());
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return I00000oOI;
                }
            }
