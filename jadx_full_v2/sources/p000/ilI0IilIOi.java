            package p000;

            import java.util.concurrent.TimeUnit;
            
            public abstract class ilI0IilIOi {
                public static final long I00000oIO(long j, long j2) {
/* 13 */            if (j != 4611686018427387903L && j != -4611686018427387903L) {
                        return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : lIiioliIlo.I0000O(j + j2, -4611686018427387903L, 4611686018427387903L);
                    }
/* 49 */            if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
/* 64 */                return 9223372036854759646L;
                    }
/* 63 */            return j;
                }

                public static final long I00000oOI(long j) {
/* 7 */             long j2 = (j << 1) + 1;
/* 8 */             Iio1OlIo0.I00iiI.getClass();
/* 11 */            int i = Iio1i11.I00000oIO;
/* 49 */            return j2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:170:0x029a, code lost:
                
                    p000.I000II.I000iOII("");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:171:0x029d, code lost:
                
                    return 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:75:0x010a, code lost:
                
                    r25 = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
                
                    if (r5 == r26.length()) goto L194;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:78:0x0116, code lost:
                
                    if (r2 == '+') goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:79:0x0118, code lost:
                
                    if (r2 == '-') goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:0x011a, code lost:
                
                    r2 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:0x011c, code lost:
                
                    r2 = r18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x0120, code lost:
                
                    if (r5 == (r23 + r2)) goto L195;
                 */
                /* JADX WARN: Removed duplicated region for block: B:106:0x0195 A[LOOP:7: B:105:0x0193->B:106:0x0195, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:109:0x01a3  */
                /* JADX WARN: Removed duplicated region for block: B:115:0x01b4  */
                /* JADX WARN: Removed duplicated region for block: B:192:0x0104 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:196:0x020f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:211:0x0108 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:99:0x0172  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static long I0000Il00O(String str) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    long j;
                    int i5;
                    int i6;
                    int iMin;
                    int i7;
                    double d;
                    long jI000O01llI0;
                    char cCharAt;
                    int i8;
                    int i9;
                    char cCharAt2;
/* 7 */             if (str.length() == 0) {
/* 727 */               I000II.I000iOII("The string is empty");
/* 723 */               return 0L;
                    }
/* 10 */            char cCharAt3 = str.charAt(0);
/* 14 */            int i10 = 1;
/* 15 */            char c = '-';
/* 17 */            char c2 = '+';
/* 19 */            if (cCharAt3 != '+') {
/* 26 */                i2 = cCharAt3 != '-' ? 0 : 1;
/* 24 */                i = i2;
                    } else {
/* 28 */                i = 0;
/* 29 */                i2 = 1;
                    }
/* 34 */            if (str.length() <= i2) {
/* 719 */               I000II.I000iOII("No components");
/* 715 */               return 0L;
                    }
/* 44 */            if (str.charAt(i2) != 'P') {
/* 711 */               I000II.I000iOII("");
/* 709 */               return 0L;
                    }
/* 46 */            int i11 = i2 + 1;
/* 51 */            if (i11 == str.length()) {
/* 705 */               I000II.I000iOII("");
/* 703 */               return 0L;
                    }
/* 53 */            int i12 = 0;
/* 54 */            Iio1llolooo iio1llolooo = null;
/* 55 */            long jI00000oIO = 0;
/* 57 */            long j2 = 0;
/* 65 */            while (i11 < str.length()) {
/* 67 */                char cCharAt4 = str.charAt(i11);
/* 73 */                if (cCharAt4 != 'T') {
/* 91 */                    O1IO1OilOO o1IO1OilOO = O1IO1OilOO.I0000Il00O;
/* 93 */                    int i13 = i10;
/* 95 */                    char cCharAt5 = str.charAt(i11);
/* 99 */                    if (cCharAt5 == c2) {
/* 114 */                       i3 = i11 + 1;
                            } else {
/* 101 */                       if (cCharAt5 == c) {
/* 107 */                           i3 = i11 + 1;
/* 111 */                           i4 = -1;
/* 123 */                           while (i3 < str.length() && str.charAt(i3) == '0') {
/* 131 */                               i3++;
                                    }
/* 136 */                           j = 0;
                                    while (true) {
/* 144 */                               if (i3 >= str.length()) {
/* 146 */                                   char cCharAt6 = str.charAt(i3);
/* 150 */                                   i5 = i11;
/* 154 */                                   if ('0' <= cCharAt6 && cCharAt6 < ':') {
                                                i8 = cCharAt6 - '0';
/* 160 */                                       i9 = i;
/* 161 */                                       long j3 = o1IO1OilOO.I00000oIO;
/* 165 */                                       if (j <= j3 && (j != j3 || i8 <= o1IO1OilOO.I00000oOI)) {
/* 193 */                                           j = (j << 3) + (j << i13) + i8;
/* 195 */                                           i3++;
/* 197 */                                           i11 = i5;
/* 199 */                                           o1IO1OilOO = o1IO1OilOO;
/* 201 */                                           i = i9;
                                                }
                                            }
                                        } else {
/* 265 */                                   i5 = i11;
                                        }
                                    }
/* 178 */                           int i14 = i9;
/* 210 */                           while (i3 < str.length() && '0' <= (cCharAt2 = str.charAt(i3)) && cCharAt2 < ':') {
/* 224 */                               i3++;
                                    }
/* 231 */                           if (i3 != str.length()) {
/* 247 */                               if (i3 != i5 + ((cCharAt4 == '+' || cCharAt4 == '-') ? i13 : 0)) {
/* 249 */                                   j = 4611686018427387903L;
/* 258 */                                   long j4 = j;
/* 298 */                                   if (str.charAt(i3) == '.') {
/* 300 */                                       int i15 = i3 + 1;
/* 308 */                                       int iMin2 = Math.min(i3 + 7, str.length());
/* 313 */                                       int i16 = 0;
/* 314 */                                       for (int i17 = i15; i17 < iMin2; i17++) {
/* 316 */                                           char cCharAt7 = str.charAt(i17);
/* 322 */                                           if ('0' > cCharAt7 || cCharAt7 >= ':') {
/* 347 */                                               for (i6 = 0; i6 < 6 - (i17 - i15); i6++) {
/* 353 */                                                   i16 = (i16 << 1) + (i16 << 3);
                                                        }
/* 363 */                                               iMin = Math.min(i17 + 9, str.length());
/* 367 */                                               i3 = i17;
/* 368 */                                               int i18 = 0;
/* 369 */                                               while (i3 < iMin) {
/* 371 */                                                   char cCharAt8 = str.charAt(i3);
/* 375 */                                                   int i19 = iMin;
/* 379 */                                                   if ('0' > cCharAt8 || cCharAt8 >= ':') {
/* 404 */                                                       for (i7 = 0; i7 < 9 - (i3 - i17); i7++) {
/* 410 */                                                           i18 = (i18 << 1) + (i18 << 3);
                                                                }
/* 418 */                                                       while (i3 < str.length() && '0' <= (cCharAt = str.charAt(i3)) && cCharAt < ':') {
/* 432 */                                                           i3++;
                                                                }
/* 435 */                                                       if (i3 == i15 || i3 == str.length() || str.charAt(i3) != 'S') {
/* 528 */                                                           I000II.I000iOII("");
/* 59 */                                                            return 0L;
                                                                }
/* 458 */                                                       long j5 = (i16 * 1000000000) + i18;
                                                                long j6 = i4;
/* 460 */                                                       Iio1llolooo iio1llolooo2 = Iio1llolooo.I00iio;
                                                                double d2 = j5;
                                                                switch (iio1llolooo2.ordinal()) {
                                                                    case 0:
/* 514 */                                                               d = 1.0E-15d;
/* 521 */                                                               jI000O01llI0 = O1OooO0IlOo.I000O01llI0(d2 * d);
                                                                        break;
                                                                    case 1:
/* 508 */                                                               d = 1.0E-12d;
/* 521 */                                                               jI000O01llI0 = O1OooO0IlOo.I000O01llI0(d2 * d);
                                                                        break;
                                                                    case 2:
/* 502 */                                                               d = 1.0E-9d;
/* 521 */                                                               jI000O01llI0 = O1OooO0IlOo.I000O01llI0(d2 * d);
                                                                        break;
                                                                    case 3:
/* 496 */                                                               d = 1.0E-6d;
/* 521 */                                                               jI000O01llI0 = O1OooO0IlOo.I000O01llI0(d2 * d);
                                                                        break;
                                                                    case 4:
/* 490 */                                                               d = 6.0E-5d;
/* 521 */                                                               jI000O01llI0 = O1OooO0IlOo.I000O01llI0(d2 * d);
                                                                        break;
                                                                    case 5:
/* 484 */                                                               d = 0.0036d;
/* 521 */                                                               jI000O01llI0 = O1OooO0IlOo.I000O01llI0(d2 * d);
                                                                        break;
                                                                    case 6:
/* 478 */                                                               d = 0.0864d;
/* 521 */                                                               jI000O01llI0 = O1OooO0IlOo.I000O01llI0(d2 * d);
                                                                        break;
                                                                    default:
/* 472 */                                                               IOOlIIilOl0.I000lI("Unknown unit: ", iio1llolooo2);
/* 475 */                                                               jI000O01llI0 = 0;
                                                                        break;
                                                                }
/* 525 */                                                       j2 = jI000O01llI0 * j6;
                                                            } else {
/* 392 */                                                       i18 = (cCharAt8 - '0') + (i18 << 3) + (i18 << 1);
/* 394 */                                                       i3++;
/* 396 */                                                       iMin = i19;
                                                            }
                                                        }
/* 404 */                                               while (i7 < 9 - (i3 - i17)) {
                                                        }
/* 418 */                                               while (i3 < str.length()) {
/* 432 */                                                   i3++;
                                                        }
/* 435 */                                               if (i3 == i15) {
                                                        }
/* 528 */                                               I000II.I000iOII("");
/* 59 */                                                return 0L;
                                                    }
/* 335 */                                           i16 = (cCharAt7 - '0') + (i16 << 3) + (i16 << 1);
                                                }
/* 347 */                                       while (i6 < 6 - (i17 - i15)) {
                                                }
/* 363 */                                       iMin = Math.min(i17 + 9, str.length());
/* 367 */                                       i3 = i17;
/* 368 */                                       int i182 = 0;
/* 369 */                                       while (i3 < iMin) {
                                                }
/* 404 */                                       while (i7 < 9 - (i3 - i17)) {
                                                }
/* 418 */                                       while (i3 < str.length()) {
                                                }
/* 435 */                                       if (i3 == i15) {
                                                }
/* 528 */                                       I000II.I000iOII("");
/* 59 */                                        return 0L;
                                            }
/* 532 */                                   char cCharAt9 = str.charAt(i3);
/* 563 */                                   Iio1llolooo iio1llolooo3 = cCharAt9 != 'D' ? cCharAt9 != 'H' ? cCharAt9 != 'M' ? cCharAt9 != 'S' ? null : Iio1llolooo.I00iio : Iio1llolooo.I00ilI0I1 : Iio1llolooo.I00ilO0 : Iio1llolooo.I00io1l;
/* 565 */                                   if (iio1llolooo3 == null) {
/* 666 */                                       throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                            }
/* 567 */                                   if (iio1llolooo != null && iio1llolooo.compareTo(iio1llolooo3) <= 0) {
/* 578 */                                       I000II.I000iOII("Unexpected order of duration components");
/* 59 */                                        return 0L;
                                            }
/* 584 */                                   if (iio1llolooo3 == Iio1llolooo.I00io1l) {
/* 586 */                                       if (i12 != 0) {
/* 596 */                                           I000II.I000iOII("");
/* 59 */                                            return 0L;
                                                }
/* 593 */                                       jI00000oIO = ilI0OOIilo0.I00000oIO(j4, iio1llolooo3) * i4;
                                            } else {
/* 600 */                                       if (i12 == 0) {
/* 639 */                                           I000II.I000iOII("");
/* 59 */                                            return 0L;
                                                }
/* 608 */                                       long jI00000oIO2 = I00000oIO(jI00000oIO, ilI0OOIilo0.I00000oIO(j4, iio1llolooo3) * i4);
/* 619 */                                       if (jI00000oIO2 == 9223372036854759646L) {
/* 635 */                                           I000II.I000iOII("");
/* 59 */                                            return 0L;
                                                }
/* 621 */                                       jI00000oIO = jI00000oIO2;
                                            }
/* 622 */                                   i11 = i3 + 1;
/* 624 */                                   iio1llolooo = iio1llolooo3;
/* 625 */                                   i10 = i13;
/* 627 */                                   i = i14;
/* 629 */                                   c = '-';
/* 631 */                                   c2 = '+';
                                        }
                                    }
/* 261 */                           I000II.I000iOII("");
/* 59 */                            return 0L;
                                }
/* 103 */                       i3 = i11;
                            }
/* 104 */                   i4 = i13;
/* 123 */                   while (i3 < str.length()) {
/* 131 */                       i3++;
                            }
/* 136 */                   j = 0;
                            while (true) {
/* 144 */                       if (i3 >= str.length()) {
                                }
/* 193 */                       j = (j << 3) + (j << i13) + i8;
/* 195 */                       i3++;
/* 197 */                       i11 = i5;
/* 199 */                       o1IO1OilOO = o1IO1OilOO;
/* 201 */                       i = i9;
                            }
/* 178 */                   int i142 = i9;
/* 210 */                   while (i3 < str.length()) {
/* 224 */                       i3++;
                            }
/* 231 */                   if (i3 != str.length()) {
                            }
/* 261 */                   I000II.I000iOII("");
/* 59 */                    return 0L;
                        }
/* 75 */                if (i12 != 0 || (i11 = i11 + 1) == str.length()) {
/* 87 */                    I000II.I000iOII("");
/* 59 */                    return 0L;
                        }
/* 85 */                i12 = i10;
                    }
/* 671 */           int i20 = i;
/* 685 */           long jI0001Ioi1lo = Iio1OlIo0.I0001Ioi1lo(I0000O(jI00000oIO, Iio1llolooo.I00iiO), I0000O(j2, Iio1llolooo.I00iiI));
                    return (i20 == 0 || jI0001Ioi1lo == Iio1OlIo0.I00ilI0I1) ? jI0001Ioi1lo : Iio1OlIo0.I000O01llI0(jI0001Ioi1lo);
                }

                public static final long I0000O(long j, Iio1llolooo iio1llolooo) {
/* 1 */             Iio1llolooo iio1llolooo2 = Iio1llolooo.I00iiI;
/* 3 */             TimeUnit timeUnit = iio1llolooo.I00iOIl;
/* 10 */            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
/* 12 */            long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
/* 19 */            if ((-jConvert) <= j && j <= jConvert) {
/* 25 */                long jConvert2 = timeUnit2.convert(j, timeUnit);
/* 29 */                IOO0o0I1l iOO0o0I1l = Iio1OlIo0.I00iiI;
/* 32 */                long j2 = jConvert2 << 1;
/* 33 */                int i = Iio1i11.I00000oIO;
/* 35 */                return j2;
                    }
/* 42 */            if (iio1llolooo.compareTo(Iio1llolooo.I00iiO) < 0) {
/* 93 */                return I00000oOI(lIiioliIlo.I0000O(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
                    }
/* 44 */            long jSignum = Long.signum(j);
/* 56 */            if (j < -9223372036854775807L) {
/* 58 */                j = -9223372036854775807L;
                    }
/* 68 */            return I00000oOI(ilI0OOIilo0.I00000oIO(Math.abs(j), iio1llolooo) * jSignum);
                }
            }
