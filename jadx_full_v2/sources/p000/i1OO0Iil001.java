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
            
            public final class i1OO0Iil001 extends i1Io0lIii {
                public static final Set I0001Ioi1lo;
                public static final OillOo0 I000II;
                public static final i1OI00l0 I000O01llI0;
                public String I00000oOI;
                public Level I0000Il00O;
                public Set I0000O;
                public OillOo0 I0000oI00;

                static {
/* 20 */            Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(o0o11001.I00000oIO, o10iiOi0.I0000Il00O, o10ioO.I00000oIO)));
/* 24 */            I0001Ioi1lo = setUnmodifiableSet;
/* 26 */            o01l1ioOo0 o01l1iooo0I00000oIO = iO1loiilii.I00000oIO(setUnmodifiableSet);
/* 34 */            OillOo0 oillOo0 = new OillOo0(24);
/* 39 */            HashMap map = new HashMap();
/* 42 */            oillOo0.I00iiI = map;
/* 46 */            HashMap map2 = new HashMap();
/* 49 */            oillOo0.I00iiO = map2;
/* 55 */            map.putAll((HashMap) o01l1iooo0I00000oIO.I00iOIl);
/* 62 */            map2.putAll((HashMap) o01l1iooo0I00000oIO.I00iiI);
/* 69 */            oillOo0.I00iio = (o11IoIoIOI0l) o01l1iooo0I00000oIO.I00iiO;
/* 75 */            oillOo0.I00ilI0I1 = (o11O11o) o01l1iooo0I00000oIO.I00iio;
/* 77 */            VarHandle.storeStoreFence();
/* 80 */            I000II = oillOo0;
/* 84 */            Level level = Level.ALL;
/* 86 */            i1OI00l0 i1oi00l0 = new i1OI00l0();
/* 89 */            i1oi00l0.I00000oIO = level;
/* 91 */            i1oi00l0.I00000oOI = setUnmodifiableSet;
/* 93 */            i1oi00l0.I0000Il00O = oillOo0;
/* 95 */            VarHandle.storeStoreFence();
/* 98 */            I000O01llI0 = i1oi00l0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:183:0x0321  */
                /* JADX WARN: Removed duplicated region for block: B:198:0x0342  */
                /* JADX WARN: Removed duplicated region for block: B:203:0x035e  */
                /* JADX WARN: Removed duplicated region for block: B:207:0x036e  */
                /* JADX WARN: Removed duplicated region for block: B:235:0x03e8  */
                /* JADX WARN: Removed duplicated region for block: B:238:0x0405  */
                /* JADX WARN: Removed duplicated region for block: B:242:0x0413  */
                /* JADX WARN: Removed duplicated region for block: B:337:0x0367 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I000II(o0llO01llII1 o0llo01llii1, String str, Level level, Set set, OillOo0 oillOo0) {
                    int i;
                    int i2;
                    o1I0iIli0ll o1i0iili0ll;
                    i1Ii10O i1ii10o;
                    Level level2;
                    boolean z;
                    int i3;
                    int i4;
                    o10o1Oo o10o1oo;
                    int i5;
                    int i6;
                    String str2;
                    o10lIo101o o10lio101o;
                    int i7;
                    IOOOI0 i1i00iVar;
                    int i8;
                    Object[] objArr;
                    int i9;
                    boolean z2;
                    String string;
/* 3 */             ll1lIIo ll1liioI0000Il00O = o0llo01llii1.I0000Il00O();
/* 7 */             Level level3 = o0llo01llii1.I00000oIO;
/* 15 */            Boolean bool = (Boolean) ll1liioI0000Il00O.I0000O(o10ioO.I00000oIO);
/* 17 */            if (bool == null || !bool.booleanValue()) {
/* 31 */                ((i1O00ooO) i1IiI1.I00000oIO).getClass();
/* 36 */                ll1lIIo ll1liioI0000Il00O2 = i1O1illoiii.I00000oOI.I0000Il00O();
/* 40 */                ll1lIIo ll1liioI0000Il00O3 = o0llo01llii1.I0000Il00O();
/* 44 */                int iI00000oIO = ll1liioI0000Il00O3.I00000oIO();
/* 50 */                int i10 = -1;
/* 51 */                if (iI00000oIO == 0) {
/* 53 */                    i1ii10o = i1Ii10O.I00000oIO;
/* 55 */                    i = 1;
/* 56 */                    i2 = 0;
                        } else {
/* 62 */                    if (iI00000oIO <= 28) {
/* 66 */                        o1I0O0l1o0l o1i0o0l1o0l = new o1I0O0l1o0l();
/* 69 */                        o1i0o0l1o0l.I00000oOI = ll1liioI0000Il00O2;
/* 71 */                        o1i0o0l1o0l.I0000Il00O = ll1liioI0000Il00O3;
/* 73 */                        int iI00000oIO2 = ll1liioI0000Il00O3.I00000oIO();
/* 82 */                        if (!(iI00000oIO2 <= 28)) {
/* 169 */                           I000II.I000iOII("metadata size too large");
/* 172 */                           return;
                                }
/* 84 */                        int[] iArr = new int[iI00000oIO2];
/* 86 */                        o1i0o0l1o0l.I0000O = iArr;
/* 88 */                        long j = 0;
/* 90 */                        int i11 = 0;
/* 91 */                        int i12 = 0;
/* 92 */                        while (i11 < iI00000oIO2) {
/* 94 */                            o0oooliI o0oooliiI0000O = o1i0o0l1o0l.I0000O(i11);
/* 103 */                           long j2 = o0oooliiI0000O.I0000oI00 | j;
/* 106 */                           if (j2 == j) {
/* 108 */                               int i13 = 0;
                                        while (true) {
/* 110 */                                   if (i13 >= i12) {
/* 129 */                                       i13 = -1;
                                                break;
                                            } else if (o0oooliiI0000O.equals(o1i0o0l1o0l.I0000O(iArr[i13] & 31))) {
                                                break;
                                            } else {
/* 126 */                                       i13++;
                                            }
                                        }
/* 130 */                               if (i13 != -1) {
/* 145 */                                   iArr[i13] = o0oooliiI0000O.I0000Il00O ? iArr[i13] | (1 << (i11 + 4)) : i11;
                                        } else {
/* 150 */                                   iArr[i12] = i11;
/* 148 */                                   i12++;
                                        }
                                    }
/* 153 */                           i11++;
/* 155 */                           j = j2;
                                }
/* 157 */                       i = 1;
/* 158 */                       i2 = 0;
/* 160 */                       o1i0o0l1o0l.I0000oI00 = i12;
/* 162 */                       VarHandle.storeStoreFence();
                                o1i0iili0ll = o1i0o0l1o0l;
                            } else {
/* 173 */                       i = 1;
/* 174 */                       i2 = 0;
/* 178 */                       o1I0iIli0ll o1i0iili0ll2 = new o1I0iIli0ll();
/* 183 */                       LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 186 */                       o1I0iIli0ll.I0000O(linkedHashMap, ll1liioI0000Il00O2);
/* 189 */                       o1I0iIli0ll.I0000O(linkedHashMap, ll1liioI0000Il00O3);
/* 204 */                       for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 220 */                           if (((o0oooliI) entry.getKey()).I0000Il00O) {
/* 232 */                               entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                                    }
                                }
/* 240 */                       o1i0iili0ll2.I00000oOI = Collections.unmodifiableMap(linkedHashMap);
/* 242 */                       VarHandle.storeStoreFence();
                                o1i0iili0ll = o1i0iili0ll2;
                            }
/* 165 */                   i1ii10o = o1i0iili0ll;
                        }
/* 258 */               int i14 = level3.intValue() < level.intValue() ? i : i2;
/* 265 */               if (i14 == 0) {
/* 267 */                   int i15 = i1IlIOO.I00000oIO;
/* 271 */                   if (o0llo01llii1.I0001Ioi1lo == null && i1ii10o.I00000oOI() <= set.size() && set.containsAll(i1ii10o.I0000Il00O())) {
/* 298 */                       if (o0llo01llii1.I0001Ioi1lo != null) {
/* 301 */                           i = i2;
                                }
/* 303 */                       if (i == 0) {
/* 323 */                           I000II.I001IO000("cannot get literal argument if a template context exists");
/* 326 */                           return;
                                }
/* 305 */                       Object[] objArr2 = o0llo01llii1.I000II;
/* 307 */                       if (objArr2 == null) {
/* 319 */                           I000II.I001IO000("cannot get literal argument before calling log()");
/* 322 */                           return;
                                } else {
/* 311 */                           string = o11I00.I00000oIO(objArr2[i2]);
/* 315 */                           level2 = level3;
                                }
                            } else {
/* 329 */                       StringBuilder sb = new StringBuilder();
/* 332 */                       o0oOlOiI o0ooloii = o0llo01llii1.I0000O;
/* 334 */                       if (o0ooloii == null) {
/* 1377 */                          I000II.I001IO000("cannot request log site information prior to postProcess()");
/* 2230 */                          return;
                                }
/* 340 */                       if (ll1lIIi1oii.I00000oIO(2, o0ooloii, sb)) {
/* 344 */                           sb.append(" ");
                                }
/* 347 */                       if (i14 == 0 || o0llo01llii1.I0001Ioi1lo == null) {
/* 369 */                           i1IlOOOi0 i1iloooi0 = o0llo01llii1.I0001Ioi1lo;
/* 371 */                           if (i1iloooi0 != null) {
/* 381 */                               String str3 = "cannot get arguments unless a template context exists";
/* 383 */                               if ((i1iloooi0 != null ? i : i2) == 0) {
/* 1262 */                                  I000II.I001IO000("cannot get arguments unless a template context exists");
/* 1265 */                                  return;
                                        }
/* 385 */                               Object[] objArr3 = o0llo01llii1.I000II;
/* 389 */                               if (objArr3 == null) {
/* 1256 */                                  I000II.I001IO000("cannot get arguments before calling log()");
/* 1259 */                                  return;
                                        }
/* 391 */                               iOlI10l ioli10l = new iOlI10l();
/* 394 */                               int i16 = i2;
/* 396 */                               ioli10l.I00000oIO = i16;
/* 398 */                               ioli10l.I00000oOI = -1;
/* 400 */                               String str4 = i1iloooi0.I00000oIO;
/* 402 */                               i1i0IlOI i1i0iloi = i1i0IlOI.I00000oOI;
/* 404 */                               ioli10l.I0000oI00 = i16;
/* 406 */                               ioli10l.I0000Il00O = objArr3;
/* 408 */                               ioli10l.I0000O = sb;
/* 410 */                               VarHandle.storeStoreFence();
/* 413 */                               int iI00000oOI = i1i1l0ii.I00000oOI(i16, str4);
/* 417 */                               int i17 = -1;
/* 418 */                               int i18 = 0;
/* 419 */                               while (iI00000oOI >= 0) {
/* 421 */                                   int i19 = iI00000oOI + 1;
/* 423 */                                   int i20 = i19;
/* 424 */                                   int i21 = 0;
/* 426 */                                   int i22 = 3;
/* 434 */                                   while (i20 < str4.length()) {
/* 436 */                                       int i23 = i20 + 1;
/* 438 */                                       char cCharAt = str4.charAt(i20);
/* 442 */                                       Level level4 = level3;
/* 446 */                                       char c = (char) (cCharAt - '0');
/* 447 */                                       int i24 = i20;
/* 451 */                                       if (c >= '\n') {
/* 480 */                                           if (cCharAt != '$') {
/* 539 */                                               i3 = -1;
/* 542 */                                               if (cCharAt != '<') {
/* 580 */                                                   i4 = i18 + 1;
/* 583 */                                                   i17 = i18;
                                                        } else {
/* 544 */                                                   if (i17 == -1) {
/* 579 */                                                       throw IOiIIo1l.I00000oIO(iI00000oOI, i23, "invalid relative parameter", str4);
                                                            }
/* 550 */                                                   if (i23 == str4.length()) {
/* 572 */                                                       throw new IOiIIo1l(IOiIIo1l.I0000oI00(iI00000oOI, -1, "unterminated parameter", str4), 14);
                                                            }
/* 554 */                                                   str4.charAt(i23);
/* 557 */                                                   i19 = i23;
/* 558 */                                                   i4 = i18;
/* 552 */                                                   i23 = i24 + 2;
                                                        }
                                                    } else {
/* 484 */                                               if (i24 - i19 == 0) {
/* 538 */                                                   throw IOiIIo1l.I00000oIO(iI00000oOI, i23, "missing index", str4);
                                                        }
/* 490 */                                               if (str4.charAt(i19) == '0') {
/* 531 */                                                   throw IOiIIo1l.I00000oIO(iI00000oOI, i23, "index has leading zero", str4);
                                                        }
                                                        int i25 = i21 - 1;
/* 498 */                                               if (i23 == str4.length()) {
/* 524 */                                                   throw new IOiIIo1l(IOiIIo1l.I0000oI00(iI00000oOI, -1, "unterminated parameter", str4), 14);
                                                        }
/* 502 */                                               str4.charAt(i23);
/* 505 */                                               i19 = i23;
/* 506 */                                               i4 = i18;
/* 507 */                                               i17 = i25;
/* 500 */                                               i23 = i24 + 2;
/* 510 */                                               i3 = -1;
                                                    }
/* 584 */                                           int i26 = i23 + i3;
/* 589 */                                           while (i26 < str4.length()) {
/* 602 */                                               if (((char) ((str4.charAt(i26) & 65503) - 65)) < 26) {
/* 604 */                                                   char cCharAt2 = str4.charAt(i26);
/* 608 */                                                   int i27 = cCharAt2 & ' ';
/* 614 */                                                   boolean z3 = i27 == 0;
/* 615 */                                                   o10o1Oo o10o1oo2 = o10o1Oo.I0000oI00;
/* 617 */                                                   if (i19 != i26 || z3) {
/* 637 */                                                       int i28 = true != z3 ? 0 : Barcode.FORMAT_ITF;
/* 639 */                                                       while (i19 != i26) {
/* 648 */                                                           int i29 = i19 + 1;
/* 650 */                                                           i5 = i27;
/* 652 */                                                           char cCharAt3 = str4.charAt(i19);
/* 656 */                                                           i6 = i4;
/* 660 */                                                           str2 = str3;
/* 664 */                                                           if (cCharAt3 >= ' ' && cCharAt3 <= '0') {
                                                                        int i30 = ((int) ((o10o1Oo.I0000O >>> ((cCharAt3 - ' ') * 3)) & 7)) - 1;
/* 690 */                                                               if (i30 >= 0) {
/* 717 */                                                                   int i31 = 1 << i30;
/* 721 */                                                                   if ((i28 & i31) != 0) {
/* 739 */                                                                       throw IOiIIo1l.I0000Il00O("repeated flag", i19, str4);
                                                                            }
/* 723 */                                                                   i28 |= i31;
/* 724 */                                                                   i19 = i29;
/* 726 */                                                                   i27 = i5;
/* 728 */                                                                   i4 = i6;
/* 730 */                                                                   str3 = str2;
                                                                        } else {
/* 694 */                                                                   if (cCharAt3 != '.') {
/* 713 */                                                                       throw IOiIIo1l.I0000Il00O("invalid flag", i19, str4);
                                                                            }
/* 705 */                                                                   o10o1oo = new o10o1Oo(i28, -1, o10o1Oo.I0000oI00(i29, i26, str4));
/* 782 */                                                                   o10lio101o = o10lIo101o.I00ilO0[(cCharAt2 | ' ') - 97];
/* 785 */                                                                   if (i5 == 0 && (o10lio101o == null || (o10lio101o.I00iiO & Barcode.FORMAT_ITF) == 0)) {
/* 797 */                                                                       o10lio101o = null;
                                                                            }
/* 798 */                                                                   int i32 = i26 + 1;
/* 800 */                                                                   if (o10lio101o == null) {
/* 802 */                                                                       o10o1oo.getClass();
/* 805 */                                                                       int i33 = o10lio101o.I00iiO;
/* 807 */                                                                       int i34 = o10lio101o.I00iiI;
/* 810 */                                                                       if (i34 == 1) {
/* 825 */                                                                           z2 = true;
/* 833 */                                                                           if (!o10o1oo.I00000oOI(i33, z2)) {
/* 878 */                                                                               throw IOiIIo1l.I00000oIO(iI00000oOI, i32, "invalid format specifier", str4);
                                                                                    }
/* 837 */                                                                           if (i17 < 10) {
/* 839 */                                                                               Map map = i1Oool.I0000O;
/* 845 */                                                                               if (o10o1oo.I00000oIO()) {
/* 853 */                                                                                   IOOOI0[] ioooi0Arr = (i1Oool[]) i1Oool.I0000O.get(o10lio101o);
/* 857 */                                                                                   liOOo1l1O.I00000oIO("default parameter", ioooi0Arr);
/* 860 */                                                                                   i1i00iVar = ioooi0Arr[i17];
                                                                                        } else {
/* 865 */                                                                                   i1i00iVar = new i1Oool(i17, o10lio101o, o10o1oo);
                                                                                        }
                                                                                    }
                                                                                } else if (i34 == 2 || i34 == i22 || i34 == 4) {
/* 828 */                                                                           z2 = false;
/* 833 */                                                                           if (!o10o1oo.I00000oOI(i33, z2)) {
                                                                                    }
                                                                                } else {
/* 823 */                                                                           if (i34 != 5) {
/* 827 */                                                                               throw null;
                                                                                    }
/* 825 */                                                                           z2 = true;
/* 833 */                                                                           if (!o10o1oo.I00000oOI(i33, z2)) {
                                                                                    }
                                                                                }
/* 995 */                                                                       i8 = i1i00iVar.I00000oIO;
/* 999 */                                                                       if (i8 < 32) {
                                                                                    ioli10l.I00000oIO |= i7 << i8;
                                                                                }
/* 1014 */                                                                      ioli10l.I00000oOI = Math.max(ioli10l.I00000oOI, i8);
/* 1018 */                                                                      i1i1l0ii.I00000oIO(ioli10l.I0000oI00, iI00000oOI, str4, sb);
/* 1023 */                                                                      objArr = (Object[]) ioli10l.I0000Il00O;
/* 1025 */                                                                      i9 = i1i00iVar.I00000oIO;
/* 1028 */                                                                      if (i9 >= objArr.length) {
/* 1030 */                                                                          Object obj = objArr[i9];
/* 1032 */                                                                          if (obj != null) {
/* 1034 */                                                                              i1i00iVar.I00O10llo(ioli10l, obj);
                                                                                    } else {
/* 1040 */                                                                              sb.append("null");
                                                                                    }
                                                                                } else {
/* 1046 */                                                                          sb.append("[ERROR: MISSING LOG ARGUMENT]");
                                                                                }
/* 1049 */                                                                      ioli10l.I0000oI00 = i32;
/* 1051 */                                                                      iI00000oOI = i1i1l0ii.I00000oOI(i32, str4);
/* 1055 */                                                                      level3 = level4;
/* 1057 */                                                                      i18 = i6;
/* 1059 */                                                                      str3 = str2;
/* 1061 */                                                                      i10 = -1;
                                                                            } else if (cCharAt2 == 't' || cCharAt2 == 'T') {
/* 929 */                                                                       if (!o10o1oo.I00000oOI(160, false)) {
/* 1083 */                                                                          throw IOiIIo1l.I00000oIO(iI00000oOI, i32, "invalid format specification", str4);
                                                                                }
/* 931 */                                                                       int i35 = i26 + 2;
/* 937 */                                                                       if (i35 > str4.length()) {
/* 1078 */                                                                          throw IOiIIo1l.I0000Il00O("truncated format specifier", iI00000oOI, str4);
                                                                                }
/* 953 */                                                                       i1Olo0i11o1o i1olo0i11o1o = (i1Olo0i11o1o) i1Olo0i11o1o.I00iiI.get(Character.valueOf(str4.charAt(i32)));
/* 955 */                                                                       if (i1olo0i11o1o == null) {
/* 1071 */                                                                          throw IOiIIo1l.I0000Il00O("illegal date/time conversion", i32, str4);
                                                                                }
/* 959 */                                                                       i1Oo0lloI i1oo0lloi = new i1Oo0lloI(o10o1oo, i17);
/* 962 */                                                                       i1oo0lloi.I0000Il00O = i1olo0i11o1o;
/* 968 */                                                                       StringBuilder sb2 = new StringBuilder("%");
/* 971 */                                                                       o10o1oo.I0000O(sb2);
/* 978 */                                                                       i7 = 1;
/* 982 */                                                                       sb2.append(true != o10o1oo.I0000Il00O() ? 't' : 'T');
/* 987 */                                                                       sb2.append(i1olo0i11o1o.I00iOIl);
/* 990 */                                                                       VarHandle.storeStoreFence();
/* 993 */                                                                       i1i00iVar = i1oo0lloi;
/* 994 */                                                                       i32 = i35;
/* 995 */                                                                       i8 = i1i00iVar.I00000oIO;
/* 999 */                                                                       if (i8 < 32) {
                                                                                }
/* 1014 */                                                                      ioli10l.I00000oOI = Math.max(ioli10l.I00000oOI, i8);
/* 1018 */                                                                      i1i1l0ii.I00000oIO(ioli10l.I0000oI00, iI00000oOI, str4, sb);
/* 1023 */                                                                      objArr = (Object[]) ioli10l.I0000Il00O;
/* 1025 */                                                                      i9 = i1i00iVar.I00000oIO;
/* 1028 */                                                                      if (i9 >= objArr.length) {
                                                                                }
/* 1049 */                                                                      ioli10l.I0000oI00 = i32;
/* 1051 */                                                                      iI00000oOI = i1i1l0ii.I00000oOI(i32, str4);
/* 1055 */                                                                      level3 = level4;
/* 1057 */                                                                      i18 = i6;
/* 1059 */                                                                      str3 = str2;
/* 1061 */                                                                      i10 = -1;
                                                                            } else {
/* 895 */                                                                       if (cCharAt2 != 'h' && cCharAt2 != 'H') {
/* 907 */                                                                           throw IOiIIo1l.I00000oIO(iI00000oOI, i32, "invalid format specification", str4);
                                                                                }
/* 912 */                                                                       if (!o10o1oo.I00000oOI(160, false)) {
/* 924 */                                                                           throw IOiIIo1l.I00000oIO(iI00000oOI, i32, "invalid format specification", str4);
                                                                                }
/* 916 */                                                                       i1i00iVar = new i1i00i(o10o1oo, i17);
                                                                            }
/* 869 */                                                                   i7 = 1;
/* 995 */                                                                   i8 = i1i00iVar.I00000oIO;
/* 999 */                                                                   if (i8 < 32) {
                                                                            }
/* 1014 */                                                                  ioli10l.I00000oOI = Math.max(ioli10l.I00000oOI, i8);
/* 1018 */                                                                  i1i1l0ii.I00000oIO(ioli10l.I0000oI00, iI00000oOI, str4, sb);
/* 1023 */                                                                  objArr = (Object[]) ioli10l.I0000Il00O;
/* 1025 */                                                                  i9 = i1i00iVar.I00000oIO;
/* 1028 */                                                                  if (i9 >= objArr.length) {
                                                                            }
/* 1049 */                                                                  ioli10l.I0000oI00 = i32;
/* 1051 */                                                                  iI00000oOI = i1i1l0ii.I00000oOI(i32, str4);
/* 1055 */                                                                  level3 = level4;
/* 1057 */                                                                  i18 = i6;
/* 1059 */                                                                  str3 = str2;
/* 1061 */                                                                  i10 = -1;
                                                                        }
                                                                    } else {
/* 742 */                                                               if (cCharAt3 > '9') {
/* 1126 */                                                                  throw IOiIIo1l.I0000Il00O("invalid flag", i19, str4);
                                                                        }
                                                                        int i36 = cCharAt3 - '0';
/* 746 */                                                               int i37 = i29;
                                                                        while (true) {
/* 748 */                                                                   if (i37 == i26) {
/* 753 */                                                                       o10o1oo = new o10o1Oo(i28, i36, -1);
                                                                                break;
                                                                            }
/* 757 */                                                                   int i38 = i37 + 1;
/* 759 */                                                                   char cCharAt4 = str4.charAt(i37);
/* 765 */                                                                   if (cCharAt4 == '.') {
/* 773 */                                                                       o10o1oo = new o10o1Oo(i28, i36, o10o1Oo.I0000oI00(i38, i26, str4));
                                                                                break;
                                                                            }
/* 1090 */                                                                  char c2 = (char) (cCharAt4 - '0');
/* 1093 */                                                                  if (c2 >= '\n') {
/* 1121 */                                                                      throw IOiIIo1l.I0000Il00O("invalid width character", i37, str4);
                                                                            }
/* 1097 */                                                                  i36 = (i36 * 10) + c2;
/* 1101 */                                                                  if (i36 > 999999) {
/* 1114 */                                                                      throw IOiIIo1l.I00000oIO(i19, i26, "width too large", str4);
                                                                            }
/* 1103 */                                                                  i37 = i38;
/* 1104 */                                                                  i22 = 3;
                                                                        }
                                                                    }
                                                                }
/* 644 */                                                       o10o1oo = new o10o1Oo(i28, -1, -1);
                                                            } else {
/* 623 */                                                       o10o1oo = o10o1Oo.I0000oI00;
                                                            }
/* 625 */                                                   i5 = i27;
/* 627 */                                                   i6 = i4;
/* 629 */                                                   str2 = str3;
/* 782 */                                                   o10lio101o = o10lIo101o.I00ilO0[(cCharAt2 | ' ') - 97];
/* 785 */                                                   if (i5 == 0) {
/* 797 */                                                       o10lio101o = null;
                                                            }
/* 798 */                                                   int i322 = i26 + 1;
/* 800 */                                                   if (o10lio101o == null) {
                                                            }
/* 869 */                                                   i7 = 1;
/* 995 */                                                   i8 = i1i00iVar.I00000oIO;
/* 999 */                                                   if (i8 < 32) {
                                                            }
/* 1014 */                                                  ioli10l.I00000oOI = Math.max(ioli10l.I00000oOI, i8);
/* 1018 */                                                  i1i1l0ii.I00000oIO(ioli10l.I0000oI00, iI00000oOI, str4, sb);
/* 1023 */                                                  objArr = (Object[]) ioli10l.I0000Il00O;
/* 1025 */                                                  i9 = i1i00iVar.I00000oIO;
/* 1028 */                                                  if (i9 >= objArr.length) {
                                                            }
/* 1049 */                                                  ioli10l.I0000oI00 = i322;
/* 1051 */                                                  iI00000oOI = i1i1l0ii.I00000oOI(i322, str4);
/* 1055 */                                                  level3 = level4;
/* 1057 */                                                  i18 = i6;
/* 1059 */                                                  str3 = str2;
/* 1061 */                                                  i10 = -1;
                                                        } else {
/* 1133 */                                                  i26++;
/* 1135 */                                                  i22 = 3;
                                                        }
                                                    }
/* 1151 */                                          throw new IOiIIo1l(IOiIIo1l.I0000oI00(iI00000oOI, -1, "unterminated parameter", str4), 14);
                                                }
/* 455 */                                       int i39 = (i21 * 10) + c;
/* 460 */                                       if (i39 >= 1000000) {
/* 475 */                                           throw IOiIIo1l.I00000oIO(iI00000oOI, i23, "index too large", str4);
                                                }
/* 462 */                                       i21 = i39;
/* 464 */                                       i20 = i23;
/* 465 */                                       level3 = level4;
/* 467 */                                       i10 = -1;
                                            }
/* 1164 */                                  throw new IOiIIo1l(IOiIIo1l.I0000oI00(iI00000oOI, i10, "unterminated parameter", str4), 14);
                                        }
/* 1165 */                              level2 = level3;
/* 1167 */                              int i40 = i10;
/* 1168 */                              String str5 = str3;
/* 1170 */                              int i41 = ioli10l.I00000oIO;
/* 1175 */                              if (((i41 + 1) & i41) != 0 || (ioli10l.I00000oOI > 31 && i41 != i40)) {
/* 1255 */                                  throw new IOiIIo1l(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i41))), 14);
                                        }
/* 1191 */                              i1i1l0ii.I00000oIO(ioli10l.I0000oI00, str4.length(), str4, sb);
/* 1201 */                              if (!(o0llo01llii1.I0001Ioi1lo != null)) {
/* 1225 */                                  I000II.I001IO000(str5);
/* 1228 */                                  return;
                                        }
/* 1203 */                              Object[] objArr4 = o0llo01llii1.I000II;
/* 1205 */                              if (objArr4 == null) {
/* 1221 */                                  I000II.I001IO000("cannot get arguments before calling log()");
/* 1224 */                                  return;
                                        } else {
/* 1212 */                                  if (objArr4.length > ioli10l.I00000oOI + 1) {
/* 1216 */                                      sb.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                                            }
/* 1219 */                                  z = false;
                                        }
                                    } else {
/* 1266 */                              level2 = level3;
/* 1273 */                              if ((i1iloooi0 == null ? i : 0) == 0) {
/* 1371 */                                  I000II.I001IO000("cannot get literal argument if a template context exists");
/* 1374 */                                  return;
                                        }
/* 1275 */                              Object[] objArr5 = o0llo01llii1.I000II;
/* 1277 */                              if (objArr5 == null) {
/* 1367 */                                  I000II.I001IO000("cannot get literal argument before calling log()");
/* 1370 */                                  return;
                                        } else {
/* 1279 */                                  z = false;
/* 1286 */                                  sb.append(o11I00.I00000oIO(objArr5[0]));
                                        }
                                    }
/* 1289 */                          int i42 = i1IlIOO.I00000oIO;
/* 1293 */                          o1101OI1l o1101oi1l = new o1101OI1l();
/* 1296 */                          o1101oi1l.I00000oOI = z;
/* 1298 */                          o1101oi1l.I00000oIO = sb;
/* 1300 */                          VarHandle.storeStoreFence();
/* 1305 */                          i1ii10o.I00000oIO(oillOo0, o1101oi1l);
/* 1310 */                          if (o1101oi1l.I00000oOI) {
/* 1314 */                              sb.append(" ]");
                                    }
                                } else {
/* 355 */                           sb.append("(REDACTED) ");
/* 362 */                           sb.append(o0llo01llii1.I0001Ioi1lo.I00000oIO);
/* 365 */                           level2 = level3;
                                }
/* 1317 */                      string = sb.toString();
                            }
                        }
/* 1331 */              Throwable th = (Throwable) o0llo01llii1.I0000Il00O().I0000O(o0o11001.I00000oIO);
/* 1333 */              int iI00000oOI2 = liOO0O01.I00000oOI(level2);
/* 1338 */              if (iI00000oOI2 == 2 || iI00000oOI2 == 3) {
/* 1366 */                  return;
                        }
/* 1344 */              if (iI00000oOI2 == 4) {
/* 1363 */                  Log.i(str, string, th);
                        } else if (iI00000oOI2 != 5) {
/* 1351 */                  Log.e(str, string, th);
                        } else {
/* 1357 */                  Log.w(str, string, th);
                        }
                    }
                }

                @Override
                public final boolean I00000oOI(Level level) {
/* 1 */             String str = this.I00000oOI;
/* 3 */             int iI00000oOI = liOO0O01.I00000oOI(level);
                    return Log.isLoggable(str, iI00000oOI) || Log.isLoggable("all", iI00000oOI);
                }

                @Override
                public final void I0000O(o0llO01llII1 o0llo01llii1) {
/* 9 */             I000II(o0llo01llii1, this.I00000oOI, this.I0000Il00O, this.I0000O, this.I0000oI00);
                }
            }
