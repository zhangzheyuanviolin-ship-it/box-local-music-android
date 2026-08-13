            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.RandomAccess;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1iO1O1ill1 {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:103:0x01a8  */
                /* JADX WARN: Type inference failed for: r0v23 */
                /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r0v25 */
                /* JADX WARN: Type inference failed for: r2v1 */
                /* JADX WARN: Type inference failed for: r2v2, types: [int] */
                /* JADX WARN: Type inference failed for: r2v55 */
                /* JADX WARN: Type inference failed for: r2v56 */
                /* JADX WARN: Type inference failed for: r2v62 */
                /* JADX WARN: Type inference failed for: r45v0, types: [IloI0lOlll1] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(OiO1l101o0 oiO1l101o0, OII11i oII11i, O1ooiI111i o1ooiI111i, I0iolI1I11l1 i0iolI1I11l1, Function1 function1, Function1 function12, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    ?? r2;
                    float f;
                    int i3;
                    Object next;
                    float f2;
                    float f3;
                    boolean z;
                    ArrayList arrayList;
                    OI0o0olO1 oI0o0olO1;
                    Ol1o0O0O0 ol1o0O0O0;
                    Set set;
                    Object objPut;
                    int i4;
                    OiO1O1lil10 oiO1O1lil10;
                    OoI1Oi0l1I0o ooI1Oi0l1I0o;
                    IOoil1iiIilo iOoil1iiIilo;
                    boolean z2;
                    ?? r0;
                    boolean z3;
                    IOoil1iiIilo iOoil1iiIilo2;
/* 5 */             O1ooiI111i o1ooiI111i2 = o1ooiI111i;
/* 7 */             I0iolI1I11l1 i0iolI1I11l12 = i0iolI1I11l1;
/* 9 */             Function1 function13 = function1;
/* 11 */            Function1 function14 = function12;
/* 19 */            ArrayList arrayList2 = oiO1l101o0.I00000oIO;
/* 24 */            iloI0lOlll1.I00i0O(-303833701);
/* 29 */            if ((i & 6) == 0) {
/* 40 */                i2 = (iloI0lOlll1.I000II(oiO1l101o0) ? 4 : 2) | i;
                    } else {
/* 42 */                i2 = i;
                    }
/* 45 */            if ((i & 48) == 0) {
/* 58 */                i2 |= iloI0lOlll1.I000II(oII11i) ? 32 : 16;
                    }
/* 61 */            if ((i & 384) == 0) {
/* 74 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 77 */            if ((i & 3072) == 0) {
/* 90 */                i2 |= iloI0lOlll1.I000II(i0iolI1I11l12) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 94 */            if ((i & 24576) == 0) {
/* 107 */               i2 |= iloI0lOlll1.I000OOo1O(null) ? 16384 : 8192;
                    }
/* 114 */           if ((i & 196608) == 0) {
/* 127 */               i2 |= iloI0lOlll1.I000OOo1O(function13) ? 131072 : 65536;
                    }
/* 132 */           if ((i & 1572864) == 0) {
/* 145 */               i2 |= iloI0lOlll1.I000OOo1O(function14) ? 1048576 : 524288;
                    }
/* 150 */           if ((i & 12582912) == 0) {
/* 163 */               i2 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 8388608 : 4194304;
                    }
/* 171 */           boolean z4 = true;
/* 186 */           if (iloI0lOlll1.I00OIl(i2 & 1, (4793491 & i2) != 4793490)) {
/* 188 */               iloI0lOlll1.I00Ol00();
/* 193 */               if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 202 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 205 */               iloI0lOlll1.I0010o();
/* 208 */               OiO1O1lil10 oiO1O1lil102 = oiO1l101o0.I0000Il00O;
/* 210 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 214 */               Object obj = IOl11li.I00000oIO;
/* 216 */               if (objI00O0i0ii == obj) {
/* 220 */                   objI00O0i0ii = new Oii110oOoO(oiO1O1lil102);
/* 223 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 226 */               Oii110oOoO oii110oOoO = (Oii110oOoO) objI00O0i0ii;
/* 232 */               OoI1Oi0l1I0o ooI1Oi0l1I0oI0000oI00 = iO1IIloiOoiO.I0000oI00(oii110oOoO, "scene", iloI0lOlll1, 56, 0);
/* 236 */               I01O1lIi i01O1lIi = ooI1Oi0l1I0oI0000oI00.I00000oIO;
/* 238 */               OIooliIO0 oIooliIO0 = ooI1Oi0l1I0oI0000oI00.I0000O;
/* 248 */               boolean zI000II = iloI0lOlll1.I000II((OiO1O1lil10) i01O1lIi.I00olI());
/* 254 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 258 */               if (zI000II || objI00O0i0ii2 == obj) {
/* 262 */                   objI00O0i0ii2 = IOOi0Ool1i.I00iIi0i1o(arrayList2);
/* 266 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 269 */               List list = (List) objI00O0i0ii2;
/* 279 */               OiO1O1lil10 oiO1O1lil103 = (OiO1O1lil10) IOOi0Ool1i.I00IoIO0lI(oiO1l101o0.I0000O);
/* 289 */               OII1I1oi oII1I1oi = (OII1I1oi) oII11i.I00000oIO.getValue();
/* 293 */               boolean z5 = oII1I1oi instanceof OII11iIO;
/* 304 */               boolean z6 = z5 && oiO1O1lil103 != null;
/* 306 */               boolean z7 = oII1I1oi instanceof OII11i1lo0o0;
/* 310 */               if (z7) {
/* 312 */                   f = 0.0f;
                        } else {
/* 314 */                   if (!z5) {
/* 1668 */                      I000II.I00000oIO();
/* 1671 */                      return;
                            }
/* 322 */                   f = ((OII11iIO) oII1I1oi).I00000oIO.I00000oOI;
                        }
/* 324 */               if (z7) {
/* 326 */                   i3 = 2;
                        } else {
/* 329 */                   if (!z5) {
/* 1664 */                      I000II.I00000oIO();
/* 1667 */                      return;
                            }
/* 337 */                   i3 = ((OII11iIO) oII1I1oi).I00000oIO.I00000oIO;
                        }
/* 343 */               List list2 = list;
/* 347 */               int i5 = i2;
/* 355 */               ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 358 */               Iterator it = list2.iterator();
/* 366 */               while (it.hasNext()) {
/* 376 */                   arrayList3.add(((OI1llOooOl1) it.next()).I00000oOI);
                        }
/* 386 */               ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(arrayList2, 10));
/* 389 */               Iterator it2 = arrayList2.iterator();
/* 397 */               while (it2.hasNext()) {
/* 407 */                   arrayList4.add(((OI1llOooOl1) it2.next()).I00000oOI);
                        }
/* 423 */               if (O0000Ioio00.I0000O(IOOi0Ool1i.I001lllioOl(arrayList3), IOOi0Ool1i.I001lllioOl(arrayList4)) && arrayList4.size() <= arrayList3.size()) {
/* 442 */                   Iterator it3 = IOOi1I.I0001Ioi1lo(arrayList4).iterator();
                            while (true) {
/* 451 */                       if (!((IooO10lI) it3).I00iiO) {
/* 490 */                           next = null;
                                    break;
                                }
/* 456 */                       next = ((IooIlO1) it3).next();
/* 464 */                       int iIntValue = ((Number) next).intValue();
/* 468 */                       Iterator it4 = it3;
/* 482 */                       if (!O0000Ioio00.I0000O(arrayList4.get(iIntValue), arrayList3.get(iIntValue))) {
                                    break;
                                } else {
/* 485 */                           it3 = it4;
                                }
                            }
/* 505 */                   boolean z8 = ((Integer) next) == null && arrayList4.size() != arrayList3.size();
/* 507 */                   Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 511 */                   if (objI00O0i0ii3 == obj) {
/* 515 */                       objI00O0i0ii3 = new Ol1o1llOII();
/* 518 */                       iloI0lOlll1.I00iio(objI00O0i0ii3);
                            }
/* 522 */                   Ol1o1llOII ol1o1llOII = (Ol1o1llOII) objI00O0i0ii3;
/* 524 */                   Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 528 */                   if (objI00O0i0ii4 == obj) {
/* 530 */                       int i6 = OIOi1III0.I00000oIO;
/* 535 */                       objI00O0i0ii4 = new OI0o0olO1(6);
/* 538 */                       iloI0lOlll1.I00iio(objI00O0i0ii4);
                            }
/* 541 */                   OI0o0olO1 oI0o0olO12 = (OI0o0olO1) objI00O0i0ii4;
/* 551 */                   I10lool01 i10lool01 = new I10lool01((OiO1O1lil10) i01O1lIi.I00olI());
/* 564 */                   I10lool01 i10lool012 = new I10lool01((OiO1O1lil10) oIooliIO0.getValue());
/* 567 */                   int iI00000oOI = oI0o0olO12.I00000oOI(i10lool01);
/* 571 */                   if (iI00000oOI >= 0) {
/* 577 */                       f2 = oI0o0olO12.I0000Il00O[iI00000oOI];
                            } else {
/* 580 */                       f2 = 0.0f;
/* 581 */                       oI0o0olO12.I0001Ioi1lo(i10lool01, 0.0f);
                            }
/* 584 */                   float f4 = f2;
/* 628 */                   float fI0000Il00O = (z6 || O0000Ioio00.I0000O(oIooliIO0.getValue(), oiO1O1lil102) || oI0o0olO12.I00000oOI(i10lool012) < 0) ? i10lool01.equals(i10lool012) ? f4 : (z8 || z6) ? f4 - 1.0f : f4 + 1.0f : oI0o0olO12.I0000Il00O(i10lool012);
/* 634 */                   ol1o1llOII.put(i10lool012, oIooliIO0.getValue());
/* 637 */                   Ol1lII ol1lII = ol1o1llOII.I00iiI;
/* 639 */                   oI0o0olO12.I0001Ioi1lo(i10lool012, fI0000Il00O);
/* 642 */                   ArrayList arrayList5 = oiO1l101o0.I00000oOI;
/* 646 */                   Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 650 */                   if (objI00O0i0ii5 == obj) {
/* 654 */                       objI00O0i0ii5 = new Ol1o0O0O0();
/* 657 */                       iloI0lOlll1.I00iio(objI00O0i0ii5);
                            }
/* 660 */                   Ol1o0O0O0 ol1o0O0O02 = (Ol1o0O0O0) objI00O0i0ii5;
/* 662 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(arrayList5);
/* 666 */                   Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
/* 670 */                   if (zI000OOo1O || objI00O0i0ii6 == obj) {
/* 683 */                       f3 = fI0000Il00O;
/* 687 */                       z = z8;
/* 690 */                       objI00O0i0ii6 = new O00lOIIO(arrayList5, ol1o0O0O02, null, 18);
/* 693 */                       iloI0lOlll1.I00iio(objI00O0i0ii6);
                            } else {
/* 675 */                       z = z8;
/* 677 */                       f3 = fI0000Il00O;
                            }
/* 698 */                   iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii6, iloI0lOlll1, arrayList5);
/* 732 */                   boolean zI000II2 = iloI0lOlll1.I000II(IOOi0Ool1i.I00iIi0i1o(ol1lII)) | iloI0lOlll1.I000II(((OlO0o0) Ol1l1lI1Ili.I0010o(ol1o0O0O02.I00iOIl, ol1o0O0O02)).I0000Il00O) | iloI0lOlll1.I000II(oI0o0olO12.toString());
/* 733 */                   Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 737 */                   if (zI000II2 || objI00O0i0ii7 == obj) {
/* 752 */                       O1OOII o1ooii = new O1OOII();
/* 757 */                       ArrayList arrayList6 = new ArrayList();
/* 762 */                       arrayList = arrayList5;
/* 765 */                       II1liooilI iI1liooilI = new II1liooilI(4);
/* 768 */                       iI1liooilI.I00iiI = oI0o0olO12;
/* 770 */                       VarHandle.storeStoreFence();
/* 773 */                       List listI00Ol1ll1 = IOOi0Ool1i.I00Ol1ll1(ol1lII, iI1liooilI);
/* 781 */                       oI0o0olO1 = oI0o0olO12;
/* 789 */                       ArrayList arrayList7 = new ArrayList(IOOi1I.I0000O(listI00Ol1ll1, 10));
/* 792 */                       Iterator it5 = listI00Ol1ll1.iterator();
/* 800 */                       while (it5.hasNext()) {
/* 814 */                           arrayList7.add((OiO1O1lil10) ((Map.Entry) it5.next()).getValue());
                                }
/* 818 */                       Iterator it6 = arrayList7.iterator();
/* 826 */                       while (it6.hasNext()) {
/* 832 */                           OiO1O1lil10 oiO1O1lil104 = (OiO1O1lil10) it6.next();
/* 838 */                           if (!arrayList6.contains(oiO1O1lil104)) {
/* 840 */                               arrayList6.add(oiO1O1lil104);
                                    }
                                }
/* 844 */                       ArrayList arrayListI00O10llo = IOOi0Ool1i.I00O10llo(ol1o0O0O02, arrayList6);
/* 850 */                       LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 861 */                       boolean zI0000O = O0000Ioio00.I0000O(oIooliIO0.getValue(), IOOi0Ool1i.I001lllioOl(arrayList6));
/* 865 */                       int size = arrayListI00O10llo.size();
/* 869 */                       int i7 = 0;
/* 870 */                       while (i7 < size) {
/* 876 */                           boolean z9 = zI0000O;
/* 880 */                           OiO1O1lil10 oiO1O1lil105 = (OiO1O1lil10) arrayListI00O10llo.get(i7);
/* 886 */                           ArrayList arrayList8 = arrayListI00O10llo;
/* 882 */                           List listI0000O = oiO1O1lil105.I0000O();
/* 892 */                           int i8 = size;
/* 896 */                           Ol1o0O0O0 ol1o0O0O03 = ol1o0O0O02;
/* 898 */                           int i9 = i7;
/* 906 */                           ArrayList arrayList9 = new ArrayList(IOOi1I.I0000O(listI0000O, 10));
/* 909 */                           Iterator it7 = listI0000O.iterator();
/* 917 */                           while (it7.hasNext()) {
/* 927 */                               arrayList9.add(((OI1llOooOl1) it7.next()).I00000oOI);
                                    }
/* 933 */                           ArrayList arrayList10 = new ArrayList();
/* 936 */                           Iterator it8 = arrayList9.iterator();
/* 944 */                           while (it8.hasNext()) {
/* 946 */                               Object next2 = it8.next();
/* 954 */                               if (!linkedHashSet.contains(next2)) {
/* 956 */                                   arrayList10.add(next2);
                                        }
                                    }
/* 960 */                           Set setI00iio = IOOi0Ool1i.I00iio(arrayList10);
/* 964 */                           if (z9 || O0000Ioio00.I0000O(oIooliIO0.getValue(), oiO1O1lil105)) {
/* 1039 */                              set = setI00iio;
/* 1052 */                              objPut = o1ooii.put(new I10lool01(oiO1O1lil105), IOOi0Ool1i.I00iiO(linkedHashSet));
                                    } else {
/* 978 */                               I10lool01 i10lool013 = new I10lool01(oiO1O1lil105);
/* 987 */                               List listI0000O2 = ((OiO1O1lil10) oIooliIO0.getValue()).I0000O();
/* 995 */                               set = setI00iio;
/* 1003 */                              ArrayList arrayList11 = new ArrayList(IOOi1I.I0000O(listI0000O2, 10));
/* 1006 */                              Iterator it9 = listI0000O2.iterator();
/* 1014 */                              while (it9.hasNext()) {
/* 1024 */                                  arrayList11.add(((OI1llOooOl1) it9.next()).I00000oOI);
                                        }
/* 1032 */                              objPut = o1ooii.put(i10lool013, IOOi0Ool1i.I00iio(arrayList11));
                                    }
/* 1062 */                          linkedHashSet.addAll(set);
/* 1065 */                          i7 = i9 + 1;
/* 1068 */                          size = i8;
/* 1070 */                          zI0000O = z9;
/* 1072 */                          arrayListI00O10llo = arrayList8;
/* 1074 */                          ol1o0O0O02 = ol1o0O0O03;
                                }
/* 1080 */                      ol1o0O0O0 = ol1o0O0O02;
/* 1082 */                      if (!zI0000O) {
/* 1097 */                          o1ooii.put(new I10lool01((OiO1O1lil10) oIooliIO0.getValue()), Il01llIol0.I00iOIl);
                                }
/* 1100 */                      objI00O0i0ii7 = o1ooii.I00000oOI();
/* 1104 */                      iloI0lOlll1.I00iio(objI00O0i0ii7);
                            } else {
/* 742 */                       oI0o0olO1 = oI0o0olO12;
/* 744 */                       ol1o0O0O0 = ol1o0O0O02;
/* 746 */                       arrayList = arrayList5;
                            }
/* 1107 */                  Map map = (Map) objI00O0i0ii7;
/* 1124 */                  OiO1O1lil10 oiO1O1lil106 = f4 >= f3 ? (OiO1O1lil10) i01O1lIi.I00olI() : (OiO1O1lil10) oIooliIO0.getValue();
/* 1126 */                  if (z6) {
/* 1131 */                      iloI0lOlll1.I00i01iIIliI(-2006245323);
/* 1142 */                      if (O0000Ioio00.I0000O(i01O1lIi.I00olI(), oiO1O1lil103)) {
/* 1211 */                          i4 = i3;
/* 1213 */                          z3 = false;
/* 1214 */                          iOoil1iiIilo2 = null;
/* 1219 */                          iloI0lOlll1.I00i01iIIliI(-2005987961);
/* 1222 */                          iloI0lOlll1.I0010I0i(false);
                                } else {
/* 1147 */                          iloI0lOlll1.I00i01iIIliI(-2006191693);
/* 1150 */                          Float fValueOf = Float.valueOf(f);
/* 1167 */                          boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(oii110oOoO) | iloI0lOlll1.I0000O(f) | iloI0lOlll1.I000II(oiO1O1lil103);
/* 1168 */                          Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
/* 1172 */                          if (zI000OOo1O2 || objI00O0i0ii8 == obj) {
/* 1190 */                              i4 = i3;
/* 1192 */                              iOoil1iiIilo2 = null;
/* 1194 */                              OI1l1l oI1l1l = new OI1l1l(oii110oOoO, f, oiO1O1lil103, iOoil1iiIilo2, 0);
/* 1197 */                              iloI0lOlll1.I00iio(oI1l1l);
/* 1200 */                              objI00O0i0ii8 = oI1l1l;
                                    } else {
/* 1177 */                              i4 = i3;
/* 1179 */                              iOoil1iiIilo2 = null;
                                    }
/* 1203 */                          iIO0iiOiOl0l.I0000oI00(oiO1O1lil103, fValueOf, (IlliIl1l11O) objI00O0i0ii8, iloI0lOlll1);
/* 1206 */                          z3 = false;
/* 1207 */                          iloI0lOlll1.I0010I0i(false);
                                }
/* 1225 */                      iloI0lOlll1.I0010I0i(z3);
/* 1228 */                      ooI1Oi0l1I0o = ooI1Oi0l1I0oI0000oI00;
/* 1229 */                      iOoil1iiIilo = iOoil1iiIilo2;
                                z2 = z3;
                            } else {
/* 1232 */                      i4 = i3;
/* 1234 */                      IOoil1iiIilo iOoil1iiIilo3 = null;
/* 1239 */                      iloI0lOlll1.I00i01iIIliI(-2005910120);
/* 1255 */                      boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(oii110oOoO) | iloI0lOlll1.I000II(oiO1O1lil102) | iloI0lOlll1.I000II(ooI1Oi0l1I0oI0000oI00);
/* 1256 */                      Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
/* 1260 */                      if (zI000OOo1O3 || objI00O0i0ii9 == obj) {
/* 1278 */                          O1o1iI o1o1iI = new O1o1iI(oii110oOoO, oiO1O1lil102, ooI1Oi0l1I0oI0000oI00, iOoil1iiIilo3, 3);
/* 1281 */                          oiO1O1lil10 = oiO1O1lil102;
/* 1283 */                          ooI1Oi0l1I0o = ooI1Oi0l1I0oI0000oI00;
/* 1285 */                          iOoil1iiIilo = null;
/* 1287 */                          iloI0lOlll1.I00iio(o1o1iI);
/* 1290 */                          objI00O0i0ii9 = o1o1iI;
                                } else {
/* 1265 */                          ooI1Oi0l1I0o = ooI1Oi0l1I0oI0000oI00;
/* 1266 */                          oiO1O1lil10 = oiO1O1lil102;
/* 1267 */                          iOoil1iiIilo = null;
                                }
/* 1293 */                      iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii9, iloI0lOlll1, oiO1O1lil10);
/* 1296 */                      z2 = false;
/* 1297 */                      iloI0lOlll1.I0010I0i(false);
                            }
/* 1339 */                  boolean z10 = z;
/* 1354 */                  function14 = function12;
/* 1372 */                  boolean zI000O01llI0 = iloI0lOlll1.I000O01llI0(z6) | iloI0lOlll1.I000II(oiO1O1lil106) | iloI0lOlll1.I0000oI00(i4) | (((((i5 & 29360128) ^ 12582912) <= 8388608 || !iloI0lOlll1.I000II(illiIl1l11O)) && (i5 & 12582912) != 8388608) ? z2 : true) | iloI0lOlll1.I000O01llI0(z10) | (((((i5 & 3670016) ^ 1572864) <= 1048576 || !iloI0lOlll1.I000II(function14)) && (i5 & 1572864) != 1048576) ? z2 : true);
/* 1383 */                  if ((((i5 & 458752) ^ 196608) <= 131072 || !iloI0lOlll1.I000II(function1)) && (i5 & 196608) != 131072) {
/* 1396 */                      z4 = z2;
                            }
/* 1398 */                  boolean z11 = zI000O01llI0 | z4;
/* 1400 */                  Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                            Object obj2 = objI00O0i0ii10;
/* 1404 */                  if (z11 || objI00O0i0ii10 == obj) {
/* 1410 */                      OI1l0lO0i1 oI1l0lO0i1 = new OI1l0lO0i1();
/* 1413 */                      oI1l0lO0i1.I00iOIl = z6;
/* 1415 */                      oI1l0lO0i1.I00iiI = oiO1O1lil106;
/* 1417 */                      oI1l0lO0i1.I00iiO = i4;
/* 1419 */                      oI1l0lO0i1.I00iio = illiIl1l11O;
/* 1421 */                      oI1l0lO0i1.I00ilI0I1 = z10;
/* 1423 */                      oI1l0lO0i1.I00ilO0 = function14;
/* 1425 */                      oI1l0lO0i1.I00io1l = function1;
/* 1427 */                      VarHandle.storeStoreFence();
/* 1430 */                      iloI0lOlll1.I00iio(oI1l0lO0i1);
                                obj2 = oI1l0lO0i1;
                            }
/* 1433 */                  Function1 function15 = (Function1) obj2;
/* 1439 */                  float f5 = f3;
/* 1450 */                  boolean zI000II3 = iloI0lOlll1.I000II(function15) | iloI0lOlll1.I0000O(f5) | iloI0lOlll1.I000OOo1O(iOoil1iiIilo);
/* 1451 */                  Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                            Object obj3 = objI00O0i0ii11;
/* 1455 */                  if (zI000II3 || objI00O0i0ii11 == obj) {
/* 1462 */                      II1O00ioi iI1O00ioi = new II1O00ioi(2);
/* 1465 */                      iI1O00ioi.I00iiO = function15;
/* 1467 */                      iI1O00ioi.I00iiI = f5;
/* 1469 */                      VarHandle.storeStoreFence();
/* 1472 */                      iloI0lOlll1.I00iio(iI1O00ioi);
                                obj3 = iI1O00ioi;
                            }
/* 1476 */                  Function1 function16 = (Function1) obj3;
/* 1478 */                  Object objI00O0i0ii12 = iloI0lOlll1.I00O0i0ii();
/* 1482 */                  if (objI00O0i0ii12 == obj) {
/* 1488 */                      objI00O0i0ii12 = new O1o0i0Ol0Oo0(28);
/* 1491 */                      iloI0lOlll1.I00iio(objI00O0i0ii12);
                            }
/* 1499 */                  IloIIolo0oi iloIIolo0oi = new IloIIolo0oi(2);
/* 1502 */                  iloIIolo0oi.I00iiO = ooI1Oi0l1I0o;
/* 1504 */                  Ol1o0O0O0 ol1o0O0O04 = ol1o0O0O0;
/* 1506 */                  iloIIolo0oi.I00iio = ol1o0O0O04;
/* 1508 */                  iloIIolo0oi.I00iiI = map;
/* 1510 */                  VarHandle.storeStoreFence();
/* 1534 */                  o1ooiI111i2 = o1ooiI111i;
/* 1536 */                  i0iolI1I11l12 = i0iolI1I11l1;
/* 1538 */                  boolean z12 = z2;
/* 1543 */                  OI0o0olO1 oI0o0olO13 = oI0o0olO1;
/* 1545 */                  O1OIIoio0i1.I00000oIO(ooI1Oi0l1I0o, o1ooiI111i2, function16, i0iolI1I11l12, (Function1) objI00O0i0ii12, iiioOl1O.I00000oOI(-1167420988, iloIIolo0oi, iloI0lOlll1), iloI0lOlll1, ((i5 >> 3) & 112) | 221184 | (i5 & 7168));
/* 1556 */                  boolean zI000II4 = iloI0lOlll1.I000II(ooI1Oi0l1I0o) | iloI0lOlll1.I000OOo1O(oI0o0olO13);
/* 1557 */                  Object objI00O0i0ii13 = iloI0lOlll1.I00O0i0ii();
/* 1561 */                  if (zI000II4 || objI00O0i0ii13 == obj) {
/* 1577 */                      IOoil1iiIilo iOoil1iiIilo4 = iOoil1iiIilo;
/* 1579 */                      r2 = z12;
/* 1583 */                      function13 = function1;
/* 1585 */                      IiI110i1O iiI110i1O = new IiI110i1O(ooI1Oi0l1I0o, ol1o1llOII, oI0o0olO13, iOoil1iiIilo4, 27);
/* 1588 */                      r0 = iOoil1iiIilo4;
/* 1590 */                      iloI0lOlll1.I00iio(iiI110i1O);
/* 1593 */                      objI00O0i0ii13 = iiI110i1O;
                            } else {
/* 1566 */                      r0 = iOoil1iiIilo;
/* 1567 */                      function13 = function1;
/* 1568 */                      r2 = z12;
                            }
/* 1596 */                  iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii13, iloI0lOlll1, ooI1Oi0l1I0o);
                            int size2 = ol1o0O0O04.size() - 1;
/* 1605 */                  if (size2 >= 0) {
/* 1611 */                      if (ol1o0O0O04.get(size2) != null) {
/* 1660 */                          OIiilo1Ool0o.I00000oIO();
/* 1663 */                          return;
                                }
/* 1613 */                      Object objI00O0i0ii14 = iloI0lOlll1.I00O0i0ii();
/* 1617 */                      if (objI00O0i0ii14 == obj) {
/* 1619 */                          objI00O0i0ii14 = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 1623 */                          iloI0lOlll1.I00iio(objI00O0i0ii14);
                                }
/* 1631 */                      iloI0lOlll1.I00Ol1ll1(43488003, r0);
/* 1649 */                      lIo1lII.I00000oIO(O0000Ioio00.I0000O(IOOi0Ool1i.I00II0Ol1O0l(arrayList), r0) ? O0oOi0I.I00ilI0I1 : O0oOi0I.I00iio, iloI0lOlll1);
/* 1654 */                      O11looOii.I00000oIO.getClass();
/* 1657 */                      IOlO1IilOlOl iOlO1IilOlOl = OiO1il.I00000oIO;
/* 1659 */                      throw r0;
                            }
                        }
                    } else {
/* 1672 */              r2 = 0;
/* 1673 */              iloI0lOlll1.I00OilO00Il();
                    }
/* 1676 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 1680 */          if (oOloioIlI001IO000 != null) {
/* 1684 */              OI1l1Oo1i0o1 oI1l1Oo1i0o1 = new OI1l1Oo1i0o1(r2);
/* 1689 */              oI1l1Oo1i0o1.I00iio = oiO1l101o0;
/* 1693 */              oI1l1Oo1i0o1.I00ilI0I1 = oII11i;
/* 1695 */              oI1l1Oo1i0o1.I00ilO0 = o1ooiI111i2;
/* 1697 */              oI1l1Oo1i0o1.I00io1l = i0iolI1I11l12;
/* 1699 */              oI1l1Oo1i0o1.I00ioIO = function13;
/* 1701 */              oI1l1Oo1i0o1.I00l0I0l0lO1 = function14;
/* 1703 */              oI1l1Oo1i0o1.I00iiI = illiIl1l11O;
/* 1707 */              oI1l1Oo1i0o1.I00iiO = i;
/* 1709 */              VarHandle.storeStoreFence();
/* 1712 */              oOloioIlI001IO000.I0000O = oI1l1Oo1i0o1;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static final void I00000oOI(ArrayList arrayList, O1ooiI111i o1ooiI111i, I0iolI1I11l1 i0iolI1I11l1, List list, List list2, Function1 function1, Function1 function12, IlliIl1l11O illiIl1l11O, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    int i4;
                    int i5;
                    i1O01Ill i1o01ill;
                    OiO1l101o0 oiO1l101o0;
                    Object obj;
                    Object obj2;
/* 3 */             O1ooiI111i o1ooiI111i2 = o1ooiI111i;
/* 5 */             I0iolI1I11l1 i0iolI1I11l12 = i0iolI1I11l1;
/* 11 */            Function1 function13 = function1;
/* 13 */            Function1 function14 = function12;
/* 26 */            iloI0lOlll1.I00i0O(-1914095277);
/* 44 */            int i6 = (i & 6) == 0 ? (iloI0lOlll1.I000OOo1O(arrayList) ? 4 : 2) | i : i;
/* 47 */            if ((i & 48) == 0) {
/* 60 */                i6 |= iloI0lOlll1.I000II(o1ooiI111i2) ? 32 : 16;
                    }
/* 63 */            if ((i & 384) == 0) {
/* 76 */                i6 |= iloI0lOlll1.I000II(i0iolI1I11l12) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 79 */            if ((i & 3072) == 0) {
/* 92 */                i6 |= iloI0lOlll1.I000OOo1O(list) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 95 */            if ((i & 24576) == 0) {
/* 108 */               i6 |= iloI0lOlll1.I000OOo1O(list2) ? 16384 : 8192;
                    }
/* 113 */           if ((196608 & i) == 0) {
/* 126 */               i6 |= iloI0lOlll1.I000II(null) ? 131072 : 65536;
                    }
/* 130 */           if ((1572864 & i) == 0) {
/* 143 */               i6 |= iloI0lOlll1.I000OOo1O(null) ? 1048576 : 524288;
                    }
/* 147 */           if ((12582912 & i) == 0) {
/* 160 */               i6 |= iloI0lOlll1.I000OOo1O(function13) ? 8388608 : 4194304;
                    }
/* 164 */           if ((100663296 & i) == 0) {
/* 177 */               i6 |= iloI0lOlll1.I000OOo1O(function14) ? 67108864 : 33554432;
                    }
/* 181 */           if ((805306368 & i) == 0) {
/* 194 */               i6 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 536870912 : 268435456;
                    }
/* 211 */           int i7 = (i2 & 6) == 0 ? i2 | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) : i2;
/* 240 */           if (iloI0lOlll1.I00OIl(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
/* 242 */               iloI0lOlll1.I00Ol00();
/* 247 */               if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 256 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 259 */               iloI0lOlll1.I0010o();
/* 266 */               if (arrayList.isEmpty()) {
/* 885 */                   I000II.I000iOII("NavDisplay entries cannot be empty");
/* 888 */                   return;
                        }
/* 270 */               int i8 = i6 >> 6;
/* 289 */               int i9 = (i6 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i7 << 12) & 57344);
/* 290 */               lOO00IiI0li.I00000oOI(illOOo00lI, iloI0lOlll1);
/* 296 */               iloI0lOlll1.I00i01iIIliI(-984503628);
/* 300 */               iloI0lOlll1.I0010I0i(false);
/* 303 */               IOlO1IilOlOl iOlO1IilOlOl = OiO1il.I00000oIO;
/* 305 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 309 */               Object obj3 = IOl11li.I00000oIO;
/* 311 */               if (objI00O0i0ii == obj3) {
/* 315 */                   i5 = i6;
/* 319 */                   Ol1o1llOII ol1o1llOII = new Ol1o1llOII();
/* 326 */                   OIoO1Ol oIoO1Ol = new OIoO1Ol(20);
/* 329 */                   oIoO1Ol.I00iiI = ol1o1llOII;
/* 331 */                   VarHandle.storeStoreFence();
/* 338 */                   I0iII1i10I i0iII1i10I = new I0iII1i10I(18);
/* 341 */                   i0iII1i10I.I00iiI = ol1o1llOII;
/* 343 */                   VarHandle.storeStoreFence();
/* 355 */                   objI00O0i0ii = new OiO1iI1OI(oIoO1Ol, new IOii1l(-1714993007, i0iII1i10I, true));
/* 358 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        } else {
/* 362 */                   i5 = i6;
                        }
/* 368 */               OI10i0Il oI10i0IlI00000oOI = lOO00IiI0li.I00000oOI(arrayList, iloI0lOlll1);
/* 377 */               I0O1IiI i0O1IiI = new I0O1IiI(2);
/* 380 */               i0O1IiI.I00iiI = oI10i0IlI00000oOI;
/* 382 */               VarHandle.storeStoreFence();
/* 418 */               ArrayList arrayListI0000Il00O = il0ilIoI.I0000Il00O(arrayList, I1IoiO1l.I001IIilI0O(new OI1llilol0[]{null, (OiO1iI1OI) objI00O0i0ii, new OI1llilol0(new OI1lOo(1), iiioOl1O.I00000oOI(1077673004, i0O1IiI, iloI0lOlll1))}), iloI0lOlll1, i9 & 14);
/* 437 */               boolean zI000II = iloI0lOlll1.I000II(IOOi0Ool1i.I00iIi0i1o(list)) | iloI0lOlll1.I000II(arrayListI0000Il00O);
/* 438 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 442 */               if (zI000II || objI00O0i0ii2 == obj3) {
/* 454 */                   i1O01Ill i1o01ill2 = new i1O01Ill(15);
/* 468 */                   ArrayList arrayListI000OiO = IOOi1I.I000OiO(lO0o0ioo0.I00000oIO(i1o01ill2, arrayListI0000Il00O, list, list2));
/* 472 */                   IOOi0Ool1i.I00Io1o110i(arrayListI000OiO);
/* 475 */                   List listI001l0I00 = IOOi0Ool1i.I001l0I00(arrayListI000OiO);
/* 485 */                   ArrayList arrayList2 = new ArrayList(listI001l0I00.size());
/* 491 */                   int size = listI001l0I00.size();
/* 496 */                   for (int i10 = 0; i10 < size; i10++) {
/* 510 */                       arrayList2.add((OIlIii) ((OiO1O1lil10) listI001l0I00.get(i10)));
                            }
/* 520 */                   OiO1O1lil10 oiO1O1lil10 = (OiO1O1lil10) IOOi0Ool1i.I00Io1o110i(arrayListI000OiO);
/* 533 */                   ArrayList arrayListI000OiO2 = IOOi1I.I000OiO(IOOi0Ool1i.I001lllioOl(arrayListI000OiO));
                            while (true) {
/* 541 */                       OiO1O1lil10 oiO1O1lil102 = (OiO1O1lil10) IOOi0Ool1i.I00II0Ol1O0l(arrayListI000OiO2);
/* 550 */                       List listI00000oIO = oiO1O1lil102 != null ? oiO1O1lil102.I00000oIO() : null;
/* 553 */                       List list3 = listI00000oIO;
/* 555 */                       if (list3 == null || list3.isEmpty()) {
/* 563 */                           i1o01ill = i1o01ill2;
                                } else {
/* 571 */                           i1o01ill = i1o01ill2;
/* 574 */                           arrayListI000OiO2.add(0, lO0o0ioo0.I00000oIO(i1o01ill2, listI00000oIO, list, list2));
                                }
/* 577 */                       if (list3 == null || list3.isEmpty()) {
                                    break;
                                } else {
/* 586 */                           i1o01ill2 = i1o01ill;
                                }
                            }
/* 589 */                   arrayListI000OiO2.remove(oiO1O1lil10);
/* 594 */                   OiO1l101o0 oiO1l101o02 = new OiO1l101o0();
/* 597 */                   oiO1l101o02.I00000oIO = arrayListI0000Il00O;
/* 599 */                   oiO1l101o02.I00000oOI = arrayList2;
/* 601 */                   oiO1l101o02.I0000Il00O = oiO1O1lil10;
/* 603 */                   oiO1l101o02.I0000O = arrayListI000OiO2;
/* 605 */                   VarHandle.storeStoreFence();
/* 608 */                   iloI0lOlll1.I00iio(oiO1l101o02);
/* 611 */                   objI00O0i0ii2 = oiO1l101o02;
                        }
/* 612 */               OiO1l101o0 oiO1l101o03 = (OiO1l101o0) objI00O0i0ii2;
/* 614 */               OiO1O1lil10 oiO1O1lil103 = oiO1l101o03.I0000Il00O;
/* 618 */               Object oiO1Ooo0iil = new OiO1Ooo0iil(oiO1O1lil103);
/* 621 */               ArrayList arrayList3 = oiO1l101o03.I0000O;
/* 631 */               ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(arrayList3, 10));
/* 634 */               Iterator it = arrayList3.iterator();
/* 642 */               while (it.hasNext()) {
/* 655 */                   arrayList4.add(new OiO1Ooo0iil((OiO1O1lil10) it.next()));
                        }
/* 660 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 664 */               Object obj4 = Il01100l.I00iOIl;
                        Object obj5 = objI00O0i0ii3;
/* 666 */               if (objI00O0i0ii3 == obj3) {
/* 670 */                   OII11i oII11i = new OII11i();
/* 679 */                   oII11i.I00000oIO = lOO00IiI0li.I00000oIO(OII11i1lo0o0.I00000oIO);
/* 685 */                   oII11i.I00000oOI = lOO00IiI0li.I00000oIO(arrayList4);
/* 691 */                   oII11i.I0000Il00O = lOO00IiI0li.I00000oIO(oiO1Ooo0iil);
/* 697 */                   oII11i.I0000O = lOO00IiI0li.I00000oIO(obj4);
/* 699 */                   VarHandle.storeStoreFence();
/* 702 */                   iloI0lOlll1.I00iio(oII11i);
                            obj5 = oII11i;
                        }
/* 706 */               OII11i oII11i2 = (OII11i) obj5;
/* 722 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(oiO1Ooo0iil) | iloI0lOlll1.I000OOo1O(arrayList4) | iloI0lOlll1.I000OOo1O(obj4);
/* 726 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 730 */               if (zI000OOo1O || objI00O0i0ii4 == obj3) {
/* 740 */                   oiO1l101o0 = oiO1l101o03;
/* 744 */                   I0IoO01lIoO i0IoO01lIoO = new I0IoO01lIoO(26);
/* 747 */                   i0IoO01lIoO.I00iiI = oII11i2;
/* 749 */                   i0IoO01lIoO.I00iiO = oiO1Ooo0iil;
/* 751 */                   i0IoO01lIoO.I00iio = arrayList4;
/* 753 */                   i0IoO01lIoO.I00ilI0I1 = obj4;
/* 755 */                   VarHandle.storeStoreFence();
/* 758 */                   iloI0lOlll1.I00iio(i0IoO01lIoO);
                            obj = i0IoO01lIoO;
                        } else {
/* 735 */                   oiO1l101o0 = oiO1l101o03;
                            obj = objI00O0i0ii4;
                        }
/* 763 */               iIO0iiOiOl0l.I0001Ioi1lo((IllOOo00lI) obj, iloI0lOlll1);
                        boolean z = !oiO1O1lil103.I00000oIO().isEmpty();
/* 797 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(arrayList) | iloI0lOlll1.I000II(oiO1O1lil103) | ((i7 & 14) == 4);
/* 799 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 803 */               if (zI000OOo1O2 || objI00O0i0ii5 == obj3) {
/* 813 */                   O1oiilO o1oiilO = new O1oiilO(3);
/* 816 */                   o1oiilO.I00iiI = arrayList;
/* 818 */                   o1oiilO.I00iiO = oiO1O1lil103;
/* 820 */                   o1oiilO.I00iio = illOOo00lI;
/* 822 */                   VarHandle.storeStoreFence();
/* 825 */                   iloI0lOlll1.I00iio(o1oiilO);
                            obj2 = o1oiilO;
                        } else {
                            obj2 = objI00O0i0ii5;
                        }
/* 839 */               l1iOo1OIii.I00000oIO(oII11i2, z, null, (IllOOo00lI) obj2, iloI0lOlll1, 0);
/* 862 */               o1ooiI111i2 = o1ooiI111i;
/* 864 */               i0iolI1I11l12 = i0iolI1I11l1;
/* 866 */               function13 = function1;
/* 868 */               function14 = function12;
/* 872 */               i3 = i2;
/* 877 */               i4 = i;
/* 879 */               I00000oIO(oiO1l101o0, oII11i2, o1ooiI111i2, i0iolI1I11l12, function13, function14, illiIl1l11O, iloI0lOlll1, ((i5 << 3) & 8064) | (i8 & 57344) | (458752 & i8) | (3670016 & i8) | (i8 & 29360128));
                    } else {
/* 889 */               i3 = i2;
/* 891 */               i4 = i;
/* 892 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 895 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 899 */           if (oOloioIlI001IO000 != null) {
/* 903 */               OI1l0I oI1l0I = new OI1l0I();
/* 906 */               oI1l0I.I00iOIl = arrayList;
/* 908 */               oI1l0I.I00iiI = o1ooiI111i2;
/* 910 */               oI1l0I.I00iiO = i0iolI1I11l12;
/* 912 */               oI1l0I.I00iio = list;
/* 914 */               oI1l0I.I00ilI0I1 = list2;
/* 916 */               oI1l0I.I00ilO0 = function13;
/* 918 */               oI1l0I.I00io1l = function14;
/* 920 */               oI1l0I.I00ioIO = illiIl1l11O;
/* 922 */               oI1l0I.I00l0I0l0lO1 = illOOo00lI;
/* 924 */               oI1l0I.I00l0OO0IO = i4;
/* 926 */               oI1l0I.I00li1OI = i3;
/* 928 */               VarHandle.storeStoreFence();
/* 931 */               oOloioIlI001IO000.I0000O = oI1l0I;
                    }
                }

                public static final void I0000Il00O(List list, O1ooiI111i o1ooiI111i, I0iolI1I11l1 i0iolI1I11l1, IllOOo00lI illOOo00lI, List list2, List list3, List list4, Function1 function1, Function1 function12, IlliIl1l11O illiIl1l11O, Iil1olo iil1olo, IloI0lOlll1 iloI0lOlll1, int i) {
                    O1ooiI111i o1ooiI111i2;
                    I0iolI1I11l1 i0iolI1I11l12;
                    List list5;
                    List list6;
                    Function1 function13;
                    Function1 function14;
                    IlliIl1l11O illiIl1l11O2;
                    Function1 o1o0i0Ol0Oo0;
                    IlliIl1l11O iiI01lI;
                    int i2;
                    ArrayList arrayList;
/* 14 */            iloI0lOlll1.I00i0O(1398581072);
/* 33 */            int i3 = i | 8624 | (iloI0lOlll1.I000OOo1O(list3) ? 131072 : 65536) | 383254528;
/* 45 */            int i4 = 18;
/* 75 */            if (iloI0lOlll1.I00OIl(i3 & 1, ((306783379 & i3) == 306783378 && (((iloI0lOlll1.I000OOo1O(iil1olo) ? (char) 256 : (char) 128) | 18) & 147) == 146) ? false : true)) {
/* 77 */                iloI0lOlll1.I00Ol00();
/* 80 */                int i5 = i & 1;
/* 84 */                Object obj = IOl11li.I00000oIO;
/* 86 */                if (i5 == 0 || iloI0lOlll1.I001lloI()) {
/* 115 */                   II0O01li0 iI0O01li0 = i1O01oOIoI0I.I00iiO;
/* 117 */                   OiIil1il oiIil1ilI00000oIO = lO0OOOO0.I00000oIO(iloI0lOlll1);
/* 121 */                   boolean zI000II = iloI0lOlll1.I000II(oiIil1ilI00000oIO);
/* 125 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 129 */                   if (zI000II || objI00O0i0ii == obj) {
/* 137 */                       OiIii0oi10I oiIii0oi10I = new OiIii0oi10I(1);
/* 140 */                       oiIii0oi10I.I00iiI = oiIil1ilI00000oIO;
/* 142 */                       VarHandle.storeStoreFence();
/* 149 */                       I0iII1i10I i0iII1i10I = new I0iII1i10I(17);
/* 152 */                       i0iII1i10I.I00iiI = oiIil1ilI00000oIO;
/* 154 */                       VarHandle.storeStoreFence();
/* 165 */                       objI00O0i0ii = new OiIilol(oiIii0oi10I, new IOii1l(-1320822745, i0iII1i10I, true));
/* 168 */                       iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 173 */                   List listSingletonList = Collections.singletonList((OiIilol) objI00O0i0ii);
/* 181 */                   o1o0i0Ol0Oo0 = new O1o0i0Ol0Oo0(29);
/* 187 */                   OI1lOo oI1lOo = new OI1lOo(0);
/* 192 */                   iiI01lI = new IiI01lI(i4);
/* 199 */                   list5 = listSingletonList;
/* 200 */                   function14 = oI1lOo;
/* 201 */                   i0iolI1I11l12 = iI0O01li0;
/* 184 */                   i2 = i3 & (-1879105537);
/* 195 */                   o1ooiI111i2 = O1ooIo101ll.I00000oIO;
/* 197 */                   list6 = Il01100l.I00iOIl;
                        } else {
/* 95 */                    iloI0lOlll1.I00OilO00Il();
/* 98 */                    i2 = i3 & (-1879105537);
/* 100 */                   o1ooiI111i2 = o1ooiI111i;
/* 102 */                   i0iolI1I11l12 = i0iolI1I11l1;
/* 104 */                   list5 = list2;
/* 106 */                   list6 = list4;
/* 108 */                   o1o0i0Ol0Oo0 = function1;
/* 110 */                   function14 = function12;
/* 112 */                   iiI01lI = illiIl1l11O;
                        }
/* 205 */               iloI0lOlll1.I0010o();
/* 215 */               if (list.isEmpty()) {
/* 343 */                   I000II.I000iOII("NavDisplay backstack cannot be empty");
/* 346 */                   return;
                        }
/* 218 */               List list7 = list;
/* 224 */               boolean zI000II2 = iloI0lOlll1.I000II(IOOi0Ool1i.I00iIi0i1o(list7));
/* 228 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 232 */               if (zI000II2 || objI00O0i0ii2 == obj) {
/* 238 */                   if (list instanceof RandomAccess) {
/* 246 */                       arrayList = new ArrayList(list.size());
/* 252 */                       int size = list.size();
/* 257 */                       for (int i6 = 0; i6 < size; i6++) {
/* 269 */                           arrayList.add((OI1llOooOl1) iil1olo.invoke(list.get(i6)));
                                }
                            } else {
/* 285 */                       arrayList = new ArrayList(IOOi1I.I0000O(list7, 10));
/* 288 */                       Iterator it = list7.iterator();
/* 296 */                       while (it.hasNext()) {
/* 308 */                           arrayList.add((OI1llOooOl1) iil1olo.invoke(it.next()));
                                }
                            }
/* 275 */                   objI00O0i0ii2 = arrayList;
/* 312 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 331 */               illiIl1l11O2 = iiI01lI;
/* 334 */               function13 = o1o0i0Ol0Oo0;
/* 337 */               I00000oOI(il0ilIoI.I0000Il00O((List) objI00O0i0ii2, list5, iloI0lOlll1, 0), o1ooiI111i2, i0iolI1I11l12, list3, list6, function13, function14, illiIl1l11O2, illOOo00lI, iloI0lOlll1, ((i2 >> 6) & 7168) | 1794480, 6);
                    } else {
/* 347 */               iloI0lOlll1.I00OilO00Il();
/* 350 */               o1ooiI111i2 = o1ooiI111i;
/* 352 */               i0iolI1I11l12 = i0iolI1I11l1;
/* 354 */               list5 = list2;
/* 356 */               list6 = list4;
/* 358 */               function13 = function1;
/* 360 */               function14 = function12;
/* 362 */               illiIl1l11O2 = illiIl1l11O;
                    }
/* 364 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 368 */           if (oOloioIlI001IO000 != null) {
/* 372 */               OI1l01i0O oI1l01i0O = new OI1l01i0O();
/* 375 */               oI1l01i0O.I00iOIl = list;
/* 377 */               oI1l01i0O.I00iiI = o1ooiI111i2;
/* 379 */               oI1l01i0O.I00iiO = i0iolI1I11l12;
/* 383 */               oI1l01i0O.I00iio = illOOo00lI;
/* 385 */               oI1l01i0O.I00ilI0I1 = list5;
/* 387 */               oI1l01i0O.I00ilO0 = list3;
/* 389 */               oI1l01i0O.I00io1l = list6;
/* 391 */               oI1l01i0O.I00ioIO = function13;
/* 393 */               oI1l01i0O.I00l0I0l0lO1 = function14;
/* 395 */               oI1l01i0O.I00l0OO0IO = illiIl1l11O2;
/* 397 */               oI1l01i0O.I00li1OI = iil1olo;
/* 399 */               VarHandle.storeStoreFence();
/* 402 */               oOloioIlI001IO000.I0000O = oI1l01i0O;
                    }
                }
            }
