            package p000;

            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.logging.Level;
            
            public final class il0oiIoi1oO extends i1Io0lIii {
                public static final Set I0001Ioi1lo;
                public static final ii1llo1liOl0 I000II;
                public static final il0iloOO01 I000O01llI0;
                public String I00000oOI;
                public Level I0000Il00O;
                public Set I0000O;
                public ii1llo1liOl0 I0000oI00;

                static {
/* 20 */            Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(loO1I0io.I00000oIO, iOiIli0IO00i.I00000oIO, iOiolIio1.I00000oIO)));
/* 24 */            I0001Ioi1lo = setUnmodifiableSet;
/* 26 */            ii1llo1liOl0 ii1llo1liol0I00000oIO = iO1l0i0I0I.I00000oIO(setUnmodifiableSet);
/* 32 */            ii1llo1liOl0 ii1llo1liol0 = new ii1llo1liOl0();
/* 37 */            HashMap map = new HashMap();
/* 40 */            ii1llo1liol0.I00000oIO = map;
/* 44 */            HashMap map2 = new HashMap();
/* 47 */            ii1llo1liol0.I00000oOI = map2;
/* 51 */            map.putAll(ii1llo1liol0I00000oIO.I00000oIO);
/* 56 */            map2.putAll(ii1llo1liol0I00000oIO.I00000oOI);
/* 61 */            ii1llo1liol0.I0000Il00O = ii1llo1liol0I00000oIO.I0000Il00O;
/* 65 */            ii1llo1liol0.I0000O = ii1llo1liol0I00000oIO.I0000O;
/* 67 */            VarHandle.storeStoreFence();
/* 70 */            I000II = ii1llo1liol0;
/* 74 */            Level level = Level.ALL;
/* 76 */            il0iloOO01 il0ilooo01 = new il0iloOO01();
/* 79 */            il0ilooo01.I00000oIO = level;
/* 81 */            il0ilooo01.I00000oOI = setUnmodifiableSet;
/* 83 */            il0ilooo01.I0000Il00O = ii1llo1liol0;
/* 85 */            VarHandle.storeStoreFence();
/* 88 */            I000O01llI0 = il0ilooo01;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:169:0x030f  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x0330  */
                /* JADX WARN: Removed duplicated region for block: B:189:0x0347  */
                /* JADX WARN: Removed duplicated region for block: B:193:0x0357  */
                /* JADX WARN: Removed duplicated region for block: B:221:0x03d1  */
                /* JADX WARN: Removed duplicated region for block: B:224:0x03ee  */
                /* JADX WARN: Removed duplicated region for block: B:228:0x03fc  */
                /* JADX WARN: Removed duplicated region for block: B:307:0x0350 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I000II(lIOl0o0 liol0o0, String str, Level level, Set set, ii1llo1liOl0 ii1llo1liol0) {
                    int i;
                    int i2;
                    iilIloo0I111 iililoo0i111;
                    iilOlo01ooO iilolo01ooo;
                    Level level2;
                    boolean z;
                    int i3;
                    int i4;
                    iOloO1 ioloo1;
                    int i5;
                    String str2;
                    int i6;
                    iOliO0I iolio0i;
                    int i7;
                    IOOOI0 ilo1oooli0oi;
                    int i8;
                    Object[] objArr;
                    int i9;
                    boolean z2;
                    String string;
/* 3 */             lilI1ii lili1iiI0000O = liol0o0.I0000O();
/* 7 */             Level level3 = liol0o0.I00000oIO;
/* 15 */            Boolean bool = (Boolean) lili1iiI0000O.I0000Il00O(iOiolIio1.I00000oIO);
/* 17 */            if (bool == null || !bool.booleanValue()) {
/* 29 */                ((iioiOOllOioi) iilio10l1i.I00000oIO).getClass();
/* 34 */                lilI1ii lili1iiI00000oIO = il0Ii1.I00000oOI.I00000oIO();
/* 38 */                lilI1ii lili1iiI0000O2 = liol0o0.I0000O();
/* 42 */                int iI00000oIO = lili1iiI0000O2.I00000oIO();
/* 48 */                int i10 = -1;
/* 49 */                if (iI00000oIO == 0) {
/* 51 */                    iilolo01ooo = iilOlo01ooO.I00000oIO;
/* 53 */                    i = 1;
/* 54 */                    i2 = 0;
                        } else {
/* 60 */                    if (iI00000oIO <= 28) {
/* 64 */                        iil1lo iil1loVar = new iil1lo();
/* 67 */                        iil1loVar.I00000oOI = lili1iiI00000oIO;
/* 69 */                        iil1loVar.I0000Il00O = lili1iiI0000O2;
/* 71 */                        int iI00000oIO2 = lili1iiI0000O2.I00000oIO();
/* 80 */                        if (!(iI00000oIO2 <= 28)) {
/* 167 */                           I000II.I000iOII("metadata size too large");
/* 170 */                           return;
                                }
/* 82 */                        int[] iArr = new int[iI00000oIO2];
/* 84 */                        iil1loVar.I0000O = iArr;
/* 86 */                        long j = 0;
/* 88 */                        int i11 = 0;
/* 89 */                        int i12 = 0;
/* 90 */                        while (i11 < iI00000oIO2) {
/* 92 */                            iIIoI1 iiioi1I0000O = iil1loVar.I0000O(i11);
/* 101 */                           long j2 = iiioi1I0000O.I0000oI00 | j;
/* 104 */                           if (j2 == j) {
/* 106 */                               int i13 = 0;
                                        while (true) {
/* 108 */                                   if (i13 >= i12) {
/* 127 */                                       i13 = -1;
                                                break;
                                            } else if (iiioi1I0000O.equals(iil1loVar.I0000O(iArr[i13] & 31))) {
                                                break;
                                            } else {
/* 124 */                                       i13++;
                                            }
                                        }
/* 128 */                               if (i13 != -1) {
/* 143 */                                   iArr[i13] = iiioi1I0000O.I0000Il00O ? iArr[i13] | (1 << (i11 + 4)) : i11;
                                        } else {
/* 148 */                                   iArr[i12] = i11;
/* 146 */                                   i12++;
                                        }
                                    }
/* 151 */                           i11++;
/* 153 */                           j = j2;
                                }
/* 155 */                       i = 1;
/* 156 */                       i2 = 0;
/* 158 */                       iil1loVar.I0000oI00 = i12;
/* 160 */                       VarHandle.storeStoreFence();
                                iililoo0i111 = iil1loVar;
                            } else {
/* 171 */                       i = 1;
/* 172 */                       i2 = 0;
/* 176 */                       iilIloo0I111 iililoo0i1112 = new iilIloo0I111();
/* 181 */                       LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 184 */                       iilIloo0I111.I0000O(linkedHashMap, lili1iiI00000oIO);
/* 187 */                       iilIloo0I111.I0000O(linkedHashMap, lili1iiI0000O2);
/* 202 */                       for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 218 */                           if (((iIIoI1) entry.getKey()).I0000Il00O) {
/* 230 */                               entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                                    }
                                }
/* 238 */                       iililoo0i1112.I00000oOI = Collections.unmodifiableMap(linkedHashMap);
/* 240 */                       VarHandle.storeStoreFence();
                                iililoo0i111 = iililoo0i1112;
                            }
/* 163 */                   iilolo01ooo = iililoo0i111;
                        }
/* 256 */               int i14 = level3.intValue() < level.intValue() ? i : i2;
/* 261 */               if (i14 == 0) {
/* 263 */                   int i15 = iio0o1.I00000oIO;
/* 267 */                   if (liol0o0.I0001Ioi1lo != null || iilolo01ooo.I00000oIO() > set.size() || !set.containsAll(iilolo01ooo.I00000oOI())) {
/* 314 */                       StringBuilder sb = new StringBuilder();
/* 317 */                       o10lOOOlo o10looolo = liol0o0.I0000O;
/* 319 */                       if (o10looolo == null) {
/* 1329 */                          I000II.I001IO000("cannot request log site information prior to postProcess()");
/* 2230 */                          return;
                                }
/* 325 */                       if (lil1II.I00000oIO(2, o10looolo, sb)) {
/* 329 */                           sb.append(" ");
                                }
/* 332 */                       if (i14 == 0 || liol0o0.I0001Ioi1lo == null) {
/* 354 */                           iio1i1IiOl10 iio1i1iiol10 = liol0o0.I0001Ioi1lo;
/* 356 */                           if (iio1i1iiol10 != null) {
/* 360 */                               String str3 = "cannot get arguments unless a template context exists";
/* 362 */                               if (iio1i1iiol10 == null) {
/* 1225 */                                  I000II.I001IO000("cannot get arguments unless a template context exists");
/* 1228 */                                  return;
                                        }
/* 364 */                               Object[] objArr2 = liol0o0.I000II;
/* 366 */                               iOlI10l ioli10l = new iOlI10l();
/* 369 */                               int i16 = i2;
/* 371 */                               ioli10l.I00000oIO = i16;
/* 373 */                               ioli10l.I00000oOI = -1;
/* 375 */                               String str4 = iio1i1iiol10.I00000oIO;
/* 377 */                               ilOIl0OOIi iloil0ooii = ilOIl0OOIi.I00000oOI;
/* 379 */                               ioli10l.I0000oI00 = i16;
/* 383 */                               lio00OOillO.I00000oIO("arguments", objArr2);
/* 386 */                               ioli10l.I0000Il00O = objArr2;
/* 388 */                               ioli10l.I0000O = sb;
/* 390 */                               VarHandle.storeStoreFence();
/* 393 */                               int iI00000oOI = ilOlIoo01io.I00000oOI(i16, str4);
/* 397 */                               int i17 = -1;
/* 398 */                               int i18 = 0;
/* 399 */                               while (iI00000oOI >= 0) {
/* 401 */                                   int i19 = iI00000oOI + 1;
/* 403 */                                   int i20 = i19;
/* 404 */                                   int i21 = 0;
/* 406 */                                   int i22 = 3;
/* 414 */                                   while (i20 < str4.length()) {
/* 416 */                                       int i23 = i20 + 1;
/* 418 */                                       char cCharAt = str4.charAt(i20);
/* 422 */                                       Level level4 = level3;
/* 426 */                                       char c = (char) (cCharAt - '0');
/* 427 */                                       int i24 = i20;
/* 431 */                                       if (c >= '\n') {
/* 460 */                                           if (cCharAt != '$') {
/* 518 */                                               i3 = -1;
/* 521 */                                               if (cCharAt != '<') {
/* 561 */                                                   int i25 = i18;
/* 559 */                                                   i18++;
/* 564 */                                                   i4 = i25;
                                                        } else {
/* 523 */                                                   if (i17 == -1) {
/* 558 */                                                       throw IOiIIo1l.I0000O(iI00000oOI, i23, "invalid relative parameter", str4);
                                                            }
/* 529 */                                                   if (i23 == str4.length()) {
/* 551 */                                                       throw new IOiIIo1l(IOiIIo1l.I0001Ioi1lo(iI00000oOI, -1, "unterminated parameter", str4), 18);
                                                            }
/* 533 */                                                   str4.charAt(i23);
/* 536 */                                                   i19 = i23;
/* 537 */                                                   i4 = i17;
/* 531 */                                                   i23 = i24 + 2;
                                                        }
                                                    } else {
/* 464 */                                               if (i24 - i19 == 0) {
/* 517 */                                                   throw IOiIIo1l.I0000O(iI00000oOI, i23, "missing index", str4);
                                                        }
/* 470 */                                               if (str4.charAt(i19) == '0') {
/* 510 */                                                   throw IOiIIo1l.I0000O(iI00000oOI, i23, "index has leading zero", str4);
                                                        }
                                                        int i26 = i21 - 1;
/* 478 */                                               if (i23 == str4.length()) {
/* 503 */                                                   throw new IOiIIo1l(IOiIIo1l.I0001Ioi1lo(iI00000oOI, -1, "unterminated parameter", str4), 18);
                                                        }
/* 482 */                                               str4.charAt(i23);
/* 485 */                                               i19 = i23;
/* 486 */                                               i4 = i26;
/* 480 */                                               i23 = i24 + 2;
/* 489 */                                               i3 = -1;
                                                    }
/* 566 */                                           int i27 = i23 + i3;
/* 571 */                                           while (i27 < str4.length()) {
/* 584 */                                               if (((char) ((str4.charAt(i27) & 65503) - 65)) < 26) {
/* 586 */                                                   char cCharAt2 = str4.charAt(i27);
/* 590 */                                                   int i28 = cCharAt2 & ' ';
/* 596 */                                                   boolean z3 = i28 == 0;
/* 597 */                                                   iOloO1 ioloo12 = iOloO1.I0000oI00;
/* 599 */                                                   if (i19 != i27 || z3) {
/* 619 */                                                       int i29 = true != z3 ? 0 : Barcode.FORMAT_ITF;
/* 621 */                                                       while (i19 != i27) {
/* 630 */                                                           int i30 = i19 + 1;
/* 632 */                                                           i5 = i28;
/* 634 */                                                           char cCharAt3 = str4.charAt(i19);
/* 638 */                                                           str2 = str3;
/* 642 */                                                           i6 = i18;
/* 646 */                                                           if (cCharAt3 >= ' ' && cCharAt3 <= '0') {
                                                                        int i31 = ((int) ((iOloO1.I0000O >>> ((cCharAt3 - ' ') * 3)) & 7)) - 1;
/* 672 */                                                               if (i31 >= 0) {
/* 699 */                                                                   int i32 = 1 << i31;
/* 703 */                                                                   if ((i29 & i32) != 0) {
/* 721 */                                                                       throw IOiIIo1l.I00000oOI("repeated flag", i19, str4);
                                                                            }
/* 705 */                                                                   i29 |= i32;
/* 706 */                                                                   i19 = i30;
/* 708 */                                                                   i28 = i5;
/* 710 */                                                                   str3 = str2;
/* 712 */                                                                   i18 = i6;
                                                                        } else {
/* 676 */                                                                   if (cCharAt3 != '.') {
/* 695 */                                                                       throw IOiIIo1l.I00000oOI("invalid flag", i19, str4);
                                                                            }
/* 687 */                                                                   ioloo1 = new iOloO1(i29, -1, iOloO1.I0000oI00(i30, i27, str4));
/* 764 */                                                                   iolio0i = iOliO0I.I00ilO0[(cCharAt2 | ' ') - 97];
/* 767 */                                                                   if (i5 == 0 && (iolio0i == null || (iolio0i.I00iiO & Barcode.FORMAT_ITF) == 0)) {
/* 779 */                                                                       iolio0i = null;
                                                                            }
/* 780 */                                                                   int i33 = i27 + 1;
/* 782 */                                                                   if (iolio0i == null) {
/* 784 */                                                                       ioloo1.getClass();
/* 787 */                                                                       int i34 = iolio0i.I00iiO;
/* 789 */                                                                       int i35 = iolio0i.I00iiI;
/* 792 */                                                                       if (i35 == 1) {
/* 807 */                                                                           z2 = true;
/* 815 */                                                                           if (!ioloo1.I0000O(i34, z2)) {
/* 855 */                                                                               throw IOiIIo1l.I0000O(iI00000oOI, i33, "invalid format specifier", str4);
                                                                                    }
/* 819 */                                                                           if (i4 < 10) {
/* 821 */                                                                               Map map = ilO1liIO.I0000O;
/* 842 */                                                                               ilo1oooli0oi = ioloo1.I00000oOI() ? ((ilO1liIO[]) ilO1liIO.I0000O.get(iolio0i))[i4] : new ilO1liIO(i4, iolio0i, ioloo1);
                                                                                    }
                                                                                } else if (i35 == 2 || i35 == i22 || i35 == 4) {
/* 810 */                                                                           z2 = false;
/* 815 */                                                                           if (!ioloo1.I0000O(i34, z2)) {
                                                                                    }
                                                                                } else {
/* 805 */                                                                           if (i35 != 5) {
/* 809 */                                                                               throw null;
                                                                                    }
/* 807 */                                                                           z2 = true;
/* 815 */                                                                           if (!ioloo1.I0000O(i34, z2)) {
                                                                                    }
                                                                                }
/* 972 */                                                                       i8 = ilo1oooli0oi.I00000oIO;
/* 976 */                                                                       if (i8 < 32) {
                                                                                    ioli10l.I00000oIO |= i7 << i8;
                                                                                }
/* 991 */                                                                       ioli10l.I00000oOI = Math.max(ioli10l.I00000oOI, i8);
/* 995 */                                                                       ilOlIoo01io.I00000oIO(ioli10l.I0000oI00, iI00000oOI, str4, sb);
/* 1000 */                                                                      objArr = (Object[]) ioli10l.I0000Il00O;
/* 1002 */                                                                      i9 = ilo1oooli0oi.I00000oIO;
/* 1005 */                                                                      if (i9 >= objArr.length) {
/* 1007 */                                                                          Object obj = objArr[i9];
/* 1009 */                                                                          if (obj != null) {
/* 1011 */                                                                              ilo1oooli0oi.I00O0o1oo(ioli10l, obj);
                                                                                    } else {
/* 1017 */                                                                              sb.append("null");
                                                                                    }
                                                                                } else {
/* 1023 */                                                                          sb.append("[ERROR: MISSING LOG ARGUMENT]");
                                                                                }
/* 1026 */                                                                      ioli10l.I0000oI00 = i33;
/* 1028 */                                                                      iI00000oOI = ilOlIoo01io.I00000oOI(i33, str4);
/* 1032 */                                                                      i17 = i4;
/* 1033 */                                                                      level3 = level4;
/* 1035 */                                                                      str3 = str2;
/* 1037 */                                                                      i18 = i6;
/* 1039 */                                                                      i10 = -1;
                                                                            } else if (cCharAt2 == 't' || cCharAt2 == 'T') {
/* 906 */                                                                       if (!ioloo1.I0000O(160, false)) {
/* 1061 */                                                                          throw IOiIIo1l.I0000O(iI00000oOI, i33, "invalid format specification", str4);
                                                                                }
/* 908 */                                                                       int i36 = i27 + 2;
/* 914 */                                                                       if (i36 > str4.length()) {
/* 1056 */                                                                          throw IOiIIo1l.I00000oOI("truncated format specifier", iI00000oOI, str4);
                                                                                }
/* 930 */                                                                       ilIl0OII ilil0oii = (ilIl0OII) ilIl0OII.I00iiI.get(Character.valueOf(str4.charAt(i33)));
/* 932 */                                                                       if (ilil0oii == null) {
/* 1049 */                                                                          throw IOiIIo1l.I00000oOI("illegal date/time conversion", i33, str4);
                                                                                }
/* 936 */                                                                       ilIloiOili ililoioili = new ilIloiOili(ioloo1, i4);
/* 939 */                                                                       ililoioili.I0000Il00O = ilil0oii;
/* 945 */                                                                       StringBuilder sb2 = new StringBuilder("%");
/* 948 */                                                                       ioloo1.I00000oIO(sb2);
/* 955 */                                                                       i7 = 1;
/* 959 */                                                                       sb2.append(true != ioloo1.I0000Il00O() ? 't' : 'T');
/* 964 */                                                                       sb2.append(ilil0oii.I00iOIl);
/* 967 */                                                                       VarHandle.storeStoreFence();
/* 970 */                                                                       ilo1oooli0oi = ililoioili;
/* 971 */                                                                       i33 = i36;
/* 972 */                                                                       i8 = ilo1oooli0oi.I00000oIO;
/* 976 */                                                                       if (i8 < 32) {
                                                                                }
/* 991 */                                                                       ioli10l.I00000oOI = Math.max(ioli10l.I00000oOI, i8);
/* 995 */                                                                       ilOlIoo01io.I00000oIO(ioli10l.I0000oI00, iI00000oOI, str4, sb);
/* 1000 */                                                                      objArr = (Object[]) ioli10l.I0000Il00O;
/* 1002 */                                                                      i9 = ilo1oooli0oi.I00000oIO;
/* 1005 */                                                                      if (i9 >= objArr.length) {
                                                                                }
/* 1026 */                                                                      ioli10l.I0000oI00 = i33;
/* 1028 */                                                                      iI00000oOI = ilOlIoo01io.I00000oOI(i33, str4);
/* 1032 */                                                                      i17 = i4;
/* 1033 */                                                                      level3 = level4;
/* 1035 */                                                                      str3 = str2;
/* 1037 */                                                                      i18 = i6;
/* 1039 */                                                                      i10 = -1;
                                                                            } else {
/* 872 */                                                                       if (cCharAt2 != 'h' && cCharAt2 != 'H') {
/* 884 */                                                                           throw IOiIIo1l.I0000O(iI00000oOI, i33, "invalid format specification", str4);
                                                                                }
/* 889 */                                                                       if (!ioloo1.I0000O(160, false)) {
/* 901 */                                                                           throw IOiIIo1l.I0000O(iI00000oOI, i33, "invalid format specification", str4);
                                                                                }
/* 893 */                                                                       ilo1oooli0oi = new ilO1ooOli0oi(ioloo1, i4);
                                                                            }
/* 846 */                                                                   i7 = 1;
/* 972 */                                                                   i8 = ilo1oooli0oi.I00000oIO;
/* 976 */                                                                   if (i8 < 32) {
                                                                            }
/* 991 */                                                                   ioli10l.I00000oOI = Math.max(ioli10l.I00000oOI, i8);
/* 995 */                                                                   ilOlIoo01io.I00000oIO(ioli10l.I0000oI00, iI00000oOI, str4, sb);
/* 1000 */                                                                  objArr = (Object[]) ioli10l.I0000Il00O;
/* 1002 */                                                                  i9 = ilo1oooli0oi.I00000oIO;
/* 1005 */                                                                  if (i9 >= objArr.length) {
                                                                            }
/* 1026 */                                                                  ioli10l.I0000oI00 = i33;
/* 1028 */                                                                  iI00000oOI = ilOlIoo01io.I00000oOI(i33, str4);
/* 1032 */                                                                  i17 = i4;
/* 1033 */                                                                  level3 = level4;
/* 1035 */                                                                  str3 = str2;
/* 1037 */                                                                  i18 = i6;
/* 1039 */                                                                  i10 = -1;
                                                                        }
                                                                    } else {
/* 724 */                                                               if (cCharAt3 > '9') {
/* 1104 */                                                                  throw IOiIIo1l.I00000oOI("invalid flag", i19, str4);
                                                                        }
                                                                        int i37 = cCharAt3 - '0';
/* 728 */                                                               int i38 = i30;
                                                                        while (true) {
/* 730 */                                                                   if (i38 == i27) {
/* 735 */                                                                       ioloo1 = new iOloO1(i29, i37, -1);
                                                                                break;
                                                                            }
/* 739 */                                                                   int i39 = i38 + 1;
/* 741 */                                                                   char cCharAt4 = str4.charAt(i38);
/* 747 */                                                                   if (cCharAt4 == '.') {
/* 755 */                                                                       ioloo1 = new iOloO1(i29, i37, iOloO1.I0000oI00(i39, i27, str4));
                                                                                break;
                                                                            }
/* 1068 */                                                                  char c2 = (char) (cCharAt4 - '0');
/* 1071 */                                                                  if (c2 >= '\n') {
/* 1099 */                                                                      throw IOiIIo1l.I00000oOI("invalid width character", i38, str4);
                                                                            }
/* 1075 */                                                                  i37 = (i37 * 10) + c2;
/* 1079 */                                                                  if (i37 > 999999) {
/* 1092 */                                                                      throw IOiIIo1l.I0000O(i19, i27, "width too large", str4);
                                                                            }
/* 1081 */                                                                  i38 = i39;
/* 1082 */                                                                  i22 = 3;
                                                                        }
                                                                    }
                                                                }
/* 626 */                                                       ioloo1 = new iOloO1(i29, -1, -1);
                                                            } else {
/* 605 */                                                       ioloo1 = iOloO1.I0000oI00;
                                                            }
/* 607 */                                                   i5 = i28;
/* 609 */                                                   str2 = str3;
/* 611 */                                                   i6 = i18;
/* 764 */                                                   iolio0i = iOliO0I.I00ilO0[(cCharAt2 | ' ') - 97];
/* 767 */                                                   if (i5 == 0) {
/* 779 */                                                       iolio0i = null;
                                                            }
/* 780 */                                                   int i332 = i27 + 1;
/* 782 */                                                   if (iolio0i == null) {
                                                            }
/* 846 */                                                   i7 = 1;
/* 972 */                                                   i8 = ilo1oooli0oi.I00000oIO;
/* 976 */                                                   if (i8 < 32) {
                                                            }
/* 991 */                                                   ioli10l.I00000oOI = Math.max(ioli10l.I00000oOI, i8);
/* 995 */                                                   ilOlIoo01io.I00000oIO(ioli10l.I0000oI00, iI00000oOI, str4, sb);
/* 1000 */                                                  objArr = (Object[]) ioli10l.I0000Il00O;
/* 1002 */                                                  i9 = ilo1oooli0oi.I00000oIO;
/* 1005 */                                                  if (i9 >= objArr.length) {
                                                            }
/* 1026 */                                                  ioli10l.I0000oI00 = i332;
/* 1028 */                                                  iI00000oOI = ilOlIoo01io.I00000oOI(i332, str4);
/* 1032 */                                                  i17 = i4;
/* 1033 */                                                  level3 = level4;
/* 1035 */                                                  str3 = str2;
/* 1037 */                                                  i18 = i6;
/* 1039 */                                                  i10 = -1;
                                                        } else {
/* 1111 */                                                  i27++;
/* 1113 */                                                  i22 = 3;
                                                        }
                                                    }
/* 1129 */                                          throw new IOiIIo1l(IOiIIo1l.I0001Ioi1lo(iI00000oOI, -1, "unterminated parameter", str4), 18);
                                                }
/* 435 */                                       int i40 = (i21 * 10) + c;
/* 440 */                                       if (i40 >= 1000000) {
/* 455 */                                           throw IOiIIo1l.I0000O(iI00000oOI, i23, "index too large", str4);
                                                }
/* 442 */                                       i21 = i40;
/* 444 */                                       i20 = i23;
/* 445 */                                       level3 = level4;
/* 447 */                                       i10 = -1;
                                            }
/* 1142 */                                  throw new IOiIIo1l(IOiIIo1l.I0001Ioi1lo(iI00000oOI, i10, "unterminated parameter", str4), 18);
                                        }
/* 1143 */                              level2 = level3;
/* 1145 */                              int i41 = i10;
/* 1146 */                              String str5 = str3;
/* 1148 */                              int i42 = ioli10l.I00000oIO;
/* 1153 */                              if (((i42 + 1) & i42) != 0 || (ioli10l.I00000oOI > 31 && i42 != i41)) {
/* 1222 */                                  throw new IOiIIo1l(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i42))), 18);
                                        }
/* 1169 */                              ilOlIoo01io.I00000oIO(ioli10l.I0000oI00, str4.length(), str4, sb);
/* 1174 */                              if (liol0o0.I0001Ioi1lo == null) {
/* 1192 */                                  I000II.I001IO000(str5);
/* 1195 */                                  return;
                                        } else {
/* 1183 */                                  if (liol0o0.I000II.length > ioli10l.I00000oOI + 1) {
/* 1187 */                                      sb.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                                            }
/* 1190 */                                  z = false;
                                        }
                                    } else {
/* 1229 */                              level2 = level3;
/* 1231 */                              if (iio1i1iiol10 != null) {
/* 1323 */                                  I000II.I001IO000("cannot get literal argument if a template context exists");
/* 1326 */                                  return;
                                        } else {
/* 1235 */                                  z = false;
/* 1242 */                                  sb.append(ii0iOOOo.I00000oIO(liol0o0.I000II[0]));
                                        }
                                    }
/* 1245 */                          int i43 = iio0o1.I00000oIO;
/* 1249 */                          iOoO1O iooo1o = new iOoO1O();
/* 1252 */                          iooo1o.I00000oOI = z;
/* 1254 */                          iooo1o.I00000oIO = sb;
/* 1256 */                          VarHandle.storeStoreFence();
/* 1261 */                          iilolo01ooo.I0000Il00O(ii1llo1liol0, iooo1o);
/* 1266 */                          if (iooo1o.I00000oOI) {
/* 1270 */                              sb.append(" ]");
                                    }
                                } else {
/* 340 */                           sb.append("(REDACTED) ");
/* 347 */                           sb.append(liol0o0.I0001Ioi1lo.I00000oIO);
/* 350 */                           level2 = level3;
                                }
/* 1273 */                      string = sb.toString();
                            } else if (liol0o0.I0001Ioi1lo != null) {
/* 308 */                       I000II.I001IO000("cannot get literal argument if a template context exists");
/* 311 */                       return;
                            } else {
/* 300 */                       string = ii0iOOOo.I00000oIO(liol0o0.I000II[i2]);
/* 304 */                       level2 = level3;
                            }
                        }
/* 1287 */              Throwable th = (Throwable) liol0o0.I0000O().I0000Il00O(loO1I0io.I00000oIO);
/* 1289 */              int iI00000oOI2 = lillI0.I00000oOI(level2);
/* 1294 */              if (iI00000oOI2 == 2 || iI00000oOI2 == 3) {
/* 1322 */                  return;
                        }
/* 1300 */              if (iI00000oOI2 == 4) {
/* 1319 */                  Log.i(str, string, th);
                        } else if (iI00000oOI2 != 5) {
/* 1307 */                  Log.e(str, string, th);
                        } else {
/* 1313 */                  Log.w(str, string, th);
                        }
                    }
                }

                @Override
                public final void I0000Il00O(lIOl0o0 liol0o0) {
/* 9 */             I000II(liol0o0, this.I00000oOI, this.I0000Il00O, this.I0000O, this.I0000oI00);
                }

                @Override
                public final boolean I0001Ioi1lo(Level level) {
/* 1 */             String str = this.I00000oOI;
/* 3 */             int iI00000oOI = lillI0.I00000oOI(level);
                    return Log.isLoggable(str, iI00000oOI) || Log.isLoggable("all", iI00000oOI);
                }
            }
