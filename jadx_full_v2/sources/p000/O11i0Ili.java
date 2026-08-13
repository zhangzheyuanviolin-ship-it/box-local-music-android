            package p000;

            import android.content.Context;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class O11i0Ili implements Function3 {
                public OOo0ll111 I00iOIl;
                public OOo0o0oO I00iiI;
                public O11iO00I1o I00iiO;
                public O1oIOiI11o0 I00iio;
                public String I00ilI0I1;
                public long I00ilO0;
                public Function1 I00io1l;
                public OOo0l0ii10l I00ioIO;
                public Function1 I00l0I0l0lO1;
                public IllOOo00lI I00l0OO0IO;

                /* JADX WARN: Removed duplicated region for block: B:128:0x02ae  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x015d  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x01a5  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z;
                    Function1 function1;
                    String str;
                    String str2;
                    String str3;
                    boolean z2;
                    OlO0OIIl1 olO0OIIl1;
                    String str4;
                    OOo0o0oO oOo0o0oO;
                    String str5;
                    Function1 function12;
                    OOo0ll111 oOo0ll111;
                    String str6;
                    int i;
                    boolean z3;
                    Context context;
                    O11101IIlil1 o11101IIlil1;
                    int i2;
                    Object value;
/* 3 */             OOo0ll111 oOo0ll1112 = this.I00iOIl;
/* 5 */             OOo0o0oO oOo0o0oO2 = this.I00iiI;
/* 7 */             O11iO00I1o o11iO00I1o = this.I00iiO;
/* 9 */             O1oIOiI11o0 o1oIOiI11o0 = this.I00iio;
/* 11 */            String str7 = this.I00ilI0I1;
/* 13 */            long j = this.I00ilO0;
/* 15 */            Function1 function13 = this.I00io1l;
/* 17 */            OOo0l0ii10l oOo0l0ii10l = this.I00ioIO;
/* 19 */            Function1 function14 = this.I00l0I0l0lO1;
/* 21 */            IllOOo00lI illOOo00lI = this.I00l0OO0IO;
/* 25 */            String str8 = (String) obj;
/* 31 */            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
/* 37 */            String str9 = (String) obj3;
/* 43 */            if (str8.length() > 0) {
/* 47 */                z = true;
/* 49 */                if (oOo0ll1112.I00iOIl == 0) {
/* 55 */                    oOo0o0oO2.I00iOIl = System.currentTimeMillis();
                        }
                        oOo0ll1112.I00iOIl++;
                    } else {
/* 64 */                z = true;
                    }
/* 73 */            if (!OlOolloIIOl0.I000l1(str8, "<ctrl", false)) {
/* 75 */                IO1OO01i0 iO1OO01i0I0001Ioi1lo = o11iO00I1o.I0001Ioi1lo(o1oIOiI11o0);
/* 79 */                OlO0OIIl1 olO0OIIl12 = o11iO00I1o.I00000oOI;
/* 81 */                String str10 = o1oIOiI11o0.I00000oIO;
/* 98 */                boolean z4 = (iO1OO01i0I0001Ioi1lo != null ? iO1OO01i0I0001Ioi1lo.I00000oIO : null) == IO1iIoo.I00io1l ? z : false;
/* 99 */                if (z4) {
/* 101 */                   o11iO00I1o.I000OOo1O(o1oIOiI11o0);
                        }
/* 117 */               boolean z5 = (str9 == null || str9.length() <= 0) ? false : z;
/* 114 */               boolean z6 = z4;
/* 119 */               IO1OO01i0 iO1OO01i0I0001Ioi1lo2 = o11iO00I1o.I0001Ioi1lo(o1oIOiI11o0);
/* 131 */               if (z5) {
/* 141 */                   if ((iO1OO01i0I0001Ioi1lo2 != null ? iO1OO01i0I0001Ioi1lo2.I00000oIO : null) != IO1iIoo.I00lli11) {
/* 143 */                       IO1loo iO1loo = IO1loo.I00iOIl;
/* 168 */                       o11iO00I1o.I0000oI00(o1oIOiI11o0, new IO1iII(z, (iO1OO01i0I0001Ioi1lo2 != null ? iO1OO01i0I0001Ioi1lo2.I00000oIO : null) == IO1iIoo.I00ll1 ? z : false, "", str7));
                            }
/* 181 */                   LinkedHashMap linkedHashMap = new LinkedHashMap(((IO1looOIi) olO0OIIl12.getValue()).I0000O);
/* 188 */                   List list = (List) linkedHashMap.get(str10);
/* 202 */                   ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
/* 209 */                   if (!arrayList.isEmpty()) {
/* 215 */                       IO1OO01i0 iO1OO01i0 = (IO1OO01i0) IOOi0Ool1i.I00Io1o110i(arrayList);
/* 219 */                       if (iO1OO01i0 instanceof IO1iII) {
/* 221 */                           IO1iII iO1iII = (IO1iII) iO1OO01i0;
/* 229 */                           String strI000iOII = OlOolloIIOl0.I000iOII(iO1iII.I000II.concat(str9), "\\n", "\n");
/* 235 */                           boolean z7 = iO1iII.I000O01llI0;
/* 237 */                           IO1loo iO1loo2 = IO1loo.I00iOIl;
/* 243 */                           IO1iII iO1iII2 = new IO1iII(z7, iO1iII.I000OOo1O, strI000iOII, iO1iII.I000OiO);
/* 250 */                           i2 = 1;
/* 252 */                           arrayList.remove(arrayList.size() - 1);
/* 255 */                           arrayList.add(iO1iII2);
                                } else {
/* 259 */                           i2 = 1;
                                }
/* 260 */                       linkedHashMap.put(str10, arrayList);
/* 281 */                       IO1looOIi iO1looOIiI00000oIO = IO1looOIi.I00000oIO((IO1looOIi) olO0OIIl12.getValue(), false, false, false, linkedHashMap, 23);
/* 296 */                       do {
/* 285 */                           value = olO0OIIl12.getValue();
/* 296 */                       } while (!olO0OIIl12.I000iOII(value, iO1looOIiI00000oIO));
/* 298 */                       oOo0ll111 = oOo0ll1112;
/* 300 */                       oOo0o0oO = oOo0o0oO2;
/* 302 */                       function12 = function14;
/* 304 */                       i = i2;
/* 305 */                       str6 = str10;
                            }
                        } else {
/* 315 */                   IO1iIoo iO1iIoo = iO1OO01i0I0001Ioi1lo2 != null ? iO1OO01i0I0001Ioi1lo2.I00000oIO : null;
/* 316 */                   IO1iIoo iO1iIoo2 = IO1iIoo.I00lli11;
/* 318 */                   if (iO1iIoo == iO1iIoo2) {
/* 320 */                       IO1iII iO1iII3 = (IO1iII) iO1OO01i0I0001Ioi1lo2;
/* 324 */                       if (iO1iII3.I000O01llI0) {
/* 326 */                           String str11 = iO1iII3.I000II;
/* 328 */                           IO1loo iO1loo3 = IO1loo.I00iOIl;
/* 330 */                           function1 = function14;
/* 336 */                           str = str8;
/* 125 */                           str2 = "\n";
/* 346 */                           o11iO00I1o.I000OiO(o1oIOiI11o0, new IO1iII(false, iO1iII3.I000OOo1O, str11, iO1iII3.I000OiO));
                                } else {
/* 350 */                           function1 = function14;
/* 352 */                           str = str8;
/* 125 */                           str2 = "\n";
                                }
/* 357 */                       IO1OO01i0 iO1OO01i0I0001Ioi1lo3 = o11iO00I1o.I0001Ioi1lo(o1oIOiI11o0);
/* 369 */                       if ((iO1OO01i0I0001Ioi1lo3 != null ? iO1OO01i0I0001Ioi1lo3.I00000oIO : null) == IO1iIoo.I00iio && iO1OO01i0I0001Ioi1lo3.I0000O() == IO1loo.I00iiI) {
/* 380 */                           olO0OIIl1 = olO0OIIl12;
/* 382 */                           str4 = str;
/* 384 */                           i = 1;
/* 385 */                           oOo0o0oO = oOo0o0oO2;
/* 387 */                           str5 = str2;
/* 389 */                           function12 = function1;
/* 391 */                           oOo0ll111 = oOo0ll1112;
/* 393 */                           str6 = str10;
                                } else {
/* 397 */                           IO1loo iO1loo4 = IO1loo.I00iiI;
/* 407 */                           if ((iO1OO01i0I0001Ioi1lo3 != null ? iO1OO01i0I0001Ioi1lo3.I00000oIO : null) == IO1iIoo.I00ll1) {
/* 422 */                               str3 = str10;
/* 423 */                               z2 = true;
/* 433 */                               olO0OIIl1 = olO0OIIl12;
/* 435 */                               str4 = str;
/* 437 */                               oOo0o0oO = oOo0o0oO2;
/* 439 */                               str5 = str2;
/* 441 */                               function12 = function1;
/* 443 */                               oOo0ll111 = oOo0ll1112;
/* 445 */                               str6 = str3;
/* 446 */                               i = 1;
/* 450 */                               o11iO00I1o.I0000oI00(o1oIOiI11o0, new IO1iI1i("", iO1loo4, 0.0f, str7, z2, 156));
                                    } else {
/* 415 */                               if ((iO1OO01i0I0001Ioi1lo3 != null ? iO1OO01i0I0001Ioi1lo3.I00000oIO : null) != iO1iIoo2) {
/* 418 */                                   str3 = str10;
/* 419 */                                   z2 = false;
                                        }
/* 433 */                               olO0OIIl1 = olO0OIIl12;
/* 435 */                               str4 = str;
/* 437 */                               oOo0o0oO = oOo0o0oO2;
/* 439 */                               str5 = str2;
/* 441 */                               function12 = function1;
/* 443 */                               oOo0ll111 = oOo0ll1112;
/* 445 */                               str6 = str3;
/* 446 */                               i = 1;
/* 450 */                               o11iO00I1o.I0000oI00(o1oIOiI11o0, new IO1iI1i("", iO1loo4, 0.0f, str7, z2, 156));
                                    }
                                }
/* 462 */                       long jCurrentTimeMillis = zBooleanValue ? System.currentTimeMillis() - j : -1L;
/* 468 */                       if (str4.length() > 0 || z6 || zBooleanValue) {
                                    float f = jCurrentTimeMillis;
/* 486 */                           LinkedHashMap linkedHashMap2 = new LinkedHashMap(((IO1looOIi) olO0OIIl1.getValue()).I0000O);
/* 493 */                           List list2 = (List) linkedHashMap2.get(str6);
/* 507 */                           ArrayList arrayList2 = list2 != null ? new ArrayList(list2) : new ArrayList();
/* 514 */                           if (!arrayList2.isEmpty()) {
/* 520 */                               IO1OO01i0 iO1OO01i02 = (IO1OO01i0) IOOi0Ool1i.I00Io1o110i(arrayList2);
/* 524 */                               if (iO1OO01i02 instanceof IO1iI1i) {
/* 526 */                                   IO1iI1i iO1iI1i = (IO1iI1i) iO1OO01i02;
/* 567 */                                   IO1iI1i iO1iI1i2 = new IO1iI1i(OlOolloIIOl0.I000iOII(iO1iI1i.I000II + str4, "\\n", str5), iO1iI1i.I000O01llI0, f, iO1iI1i.I000l1, iO1iI1i.I000lI, 152);
/* 577 */                                   arrayList2.remove(arrayList2.size() - i);
/* 580 */                                   arrayList2.add(iO1iI1i2);
                                        }
                                    }
/* 583 */                           linkedHashMap2.put(str6, arrayList2);
/* 604 */                           IO1looOIi iO1looOIiI00000oIO2 = IO1looOIi.I00000oIO((IO1looOIi) olO0OIIl1.getValue(), false, false, false, linkedHashMap2, 23);
                                    while (true) {
/* 608 */                               Object value2 = olO0OIIl1.getValue();
/* 615 */                               OlO0OIIl1 olO0OIIl13 = olO0OIIl1;
/* 621 */                               if (olO0OIIl13.I000iOII(value2, iO1looOIiI00000oIO2)) {
                                            break;
                                        }
/* 898 */                               olO0OIIl1 = olO0OIIl13;
                                    }
/* 627 */                           if (str4.length() > 0) {
/* 629 */                               function13.invoke(str4);
                                    }
                                }
                            }
                        }
/* 634 */               if (oOo0l0ii10l.I00iOIl) {
/* 637 */                   oOo0l0ii10l.I00iOIl = false;
/* 639 */                   o11iO00I1o.I000lI(false);
/* 644 */                   function12.invoke(o1oIOiI11o0);
                        }
/* 647 */               if (zBooleanValue) {
/* 649 */                   IO1OO01i0 iO1OO01i0I0001Ioi1lo4 = o11iO00I1o.I0001Ioi1lo(o1oIOiI11o0);
/* 661 */                   if ((iO1OO01i0I0001Ioi1lo4 != null ? iO1OO01i0I0001Ioi1lo4.I00000oIO : null) == IO1iIoo.I00lli11) {
/* 663 */                       IO1iII iO1iII4 = (IO1iII) iO1OO01i0I0001Ioi1lo4;
/* 667 */                       if (iO1iII4.I000O01llI0) {
/* 669 */                           String str12 = iO1iII4.I000II;
/* 671 */                           IO1loo iO1loo5 = IO1loo.I00iOIl;
/* 679 */                           z3 = false;
/* 683 */                           o11iO00I1o.I000OiO(o1oIOiI11o0, new IO1iII(false, iO1iII4.I000OOo1O, str12, iO1iII4.I000OiO));
                                } else {
/* 687 */                           z3 = false;
                                }
/* 688 */                       o11iO00I1o.I000iOII(z3);
/* 691 */                       illOOo00lI.invoke();
/* 694 */                       O11il1ilio1o o11il1ilio1oI00000oIO = l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0);
/* 708 */                       if ((o11il1ilio1oI00000oIO instanceof O1111lilIi0 ? (O1111lilIi0) o11il1ilio1oI00000oIO : null) != null && (o11101IIlil1 = (O11101IIlil1) O1111lilIi0.I0000Il00O.get(str6)) != null) {
/* 753 */                           o11iO00I1o.I000o00OoI0I(o1oIOiI11o0, new IO1Oii(Collections.singletonList(new OlO00Io()), O1Oii0O0loo.I0000oI00(new OIoi0IIoi("tps", Float.valueOf(o11101IIlil1.I00000oOI)))));
                                }
/* 764 */                       long jCurrentTimeMillis2 = System.currentTimeMillis() - oOo0o0oO.I00iOIl;
/* 772 */                       if (!(l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0) instanceof O1111lilIi0)) {
/* 778 */                           if (oOo0ll111.I00iOIl > 2 && jCurrentTimeMillis2 > 0 && (context = o11iO00I1o.I0000oI00) != null && context.getSharedPreferences("box_settings", 0).getBoolean("chat_show_tps", false) == i) {
/* 845 */                               o11iO00I1o.I000o00OoI0I(o1oIOiI11o0, new IO1Oii(Collections.singletonList(new OlO00Io()), O1Oii0O0loo.I0000oI00(new OIoi0IIoi("tps", Float.valueOf(((r8.I00iOIl - i) * 1000.0f) / jCurrentTimeMillis2)))));
                                    }
                                }
/* 848 */                       IO1iIoo iO1iIoo3 = IO1iIoo.I00iOIl;
/* 852 */                       IO1OO01i0 iO1OO01i0I000O01llI0 = o11iO00I1o.I000O01llI0(o1oIOiI11o0, IO1loo.I00iiI);
/* 858 */                       if (iO1OO01i0I000O01llI0 instanceof IO1iI1i) {
/* 860 */                           IO1iI1i iO1iI1i3 = (IO1iI1i) iO1OO01i0I000O01llI0;
/* 868 */                           if (iO1iI1i3.I000II.length() > 0) {
/* 870 */                               String str13 = iO1iI1i3.I000II;
/* 874 */                               long j2 = (long) iO1iI1i3.I000OOo1O;
/* 875 */                               IO1loOo1o iO1loOo1oI00100l0 = o11iO00I1o.I00100l0();
/* 879 */                               IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(o11iO00I1o);
/* 883 */                               IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 894 */                               iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new O11iI11(o11iO00I1o, iO1loOo1oI00100l0, str13, j2, null), 2);
                                    }
                                }
                            }
                        }
                    }
/* 902 */           return OoiIlOl1iI.I00000oIO;
                }
            }
