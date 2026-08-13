            package p000;

            import android.app.LocaleManager;
            import android.content.Context;
            import android.os.LocaleList;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Locale;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class OioI0O1lII1 implements Function3 {
                public final int I00iOIl;
                public Context I00iiI;
                public O1ol100o0O I00iiO;
                public OI10i0Il I00iio;

                public OioI0O1lII1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v7, types: [I0O1IO, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v8 */
                /* JADX WARN: Type inference failed for: r2v2, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r4v1, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.Object] */
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Iloi111 iloi111;
                    LocaleList emptyLocaleList;
                    Locale locale;
                    Object next;
                    I1IIIoOioIlI i1IIIoOioIlI;
/* 3 */             int i = this.I00iOIl;
/* 5 */             Iloi111 iloi1112 = O0iiOioolIi.I01101IOlO;
/* 7 */             I1IiOIiOli i1IiOIiOli = I1IiooiI1IlO.I0000Il00O;
/* 11 */            O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 13 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 15 */            Object obj4 = IOl11li.I00000oIO;
/* 18 */            int i2 = 0;
                    switch (i) {
                        case 0:
/* 3220 */                  O1ol100o0O o1ol100o0O = this.I00iiO;
/* 3222 */                  Context context = this.I00iiI;
/* 3224 */                  OI10i0Il oI10i0Il = this.I00iio;
/* 3228 */                  OI0IolOOIo oI0IolOOIo = (OI0IolOOIo) obj;
/* 3232 */                  ?? r4 = (IloI0lOlll1) obj2;
/* 3238 */                  int iIntValue = ((Integer) obj3).intValue();
/* 3242 */                  List list = OioIlii1iOO.I00000oIO;
/* 3246 */                  if ((iIntValue & 6) == 0) {
/* 3256 */                      iIntValue |= r4.I000II(oI0IolOOIo) ? 4 : 2;
                            }
/* 3272 */                  if (r4.I00OIl(iIntValue & 1, (iIntValue & 19) != 18)) {
/* 3281 */                      int i3 = 0;
/* 3286 */                      for (Object obj5 : list) {
/* 3292 */                          int i4 = i3 + 1;
/* 3294 */                          if (i3 < 0) {
/* 3421 */                              IOOi1I.I000lI();
/* 3424 */                              throw null;
                                    }
/* 3296 */                          Oo0oOoIo0ol oo0oOoIo0ol = (Oo0oOoIo0ol) obj5;
/* 3298 */                          OiiI0o101O0 oiiI0o101O0 = OiiI0o101O0.I00000oIO;
/* 3304 */                          OioOIi1o0I oioOIi1o0II0000O = OiiI0o101O0.I0000O(i3, list.size(), r4);
/* 3319 */                          boolean z = oo0oOoIo0ol == ((Oo0oOoIo0ol) oI10i0Il.getValue());
/* 3338 */                          boolean zI0000oI00 = r4.I0000oI00(oo0oOoIo0ol.I00000oIO()) | r4.I000OOo1O(o1ol100o0O) | r4.I000OOo1O(context);
/* 3339 */                          Function1 function1I00O0i0ii = r4.I00O0i0ii();
/* 3343 */                          if (zI0000oI00 || function1I00O0i0ii == obj4) {
/* 3355 */                              function1I00O0i0ii = new I0O1IO(23);
/* 3358 */                              function1I00O0i0ii.I00iiI = oo0oOoIo0ol;
/* 3360 */                              function1I00O0i0ii.I00iiO = o1ol100o0O;
/* 3362 */                              function1I00O0i0ii.I00iio = context;
/* 3364 */                              function1I00O0i0ii.I00ilI0I1 = oI10i0Il;
/* 3366 */                              VarHandle.storeStoreFence();
/* 3369 */                              r4.I00iio(function1I00O0i0ii);
                                    }
/* 3374 */                          Function1 function1 = function1I00O0i0ii;
/* 3380 */                          O1IIii o1IIii = new O1IIii(28);
/* 3383 */                          o1IIii.I00iiI = oo0oOoIo0ol;
/* 3385 */                          VarHandle.storeStoreFence();
/* 3415 */                          lO1Ii0lI.I00000oOI(oI0IolOOIo, z, function1, oioOIi1o0II0000O, null, false, null, null, null, null, iiioOl1O.I00000oOI(1959485578, o1IIii, r4), r4, iIntValue & 14);
/* 3418 */                          i3 = i4;
                                }
                            } else {
/* 3427 */                      r4.I00OilO00Il();
                            }
/* 3212 */                  return ooiIlOl1iI;
                        case 1:
/* 247 */                   Context context2 = this.I00iiI;
/* 249 */                   I1IIIoOioIlI i1IIIoOioIlI2 = null;
/* 251 */                   O1ol100o0O o1ol100o0O2 = this.I00iiO;
/* 253 */                   OI10i0Il oI10i0Il2 = this.I00iio;
/* 261 */                   ?? r2 = (IloI0lOlll1) obj2;
/* 267 */                   ((Integer) obj3).getClass();
/* 272 */                   I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(16.0f);
/* 276 */                   II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0iI0io1;
/* 278 */                   IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(i1IioII0000oI00, iI0IlloOiO0i, r2, 6);
/* 286 */                   int iHashCode = Long.hashCode(r2.I00OI1);
/* 290 */                   OO0lO0l0 oO0lO0l0I000lI = r2.I000lI();
/* 294 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(r2, o1ooIo101ll);
/* 300 */                   IOl0oi0lOl1.I000lI.getClass();
/* 303 */                   r2.I00i0oil();
/* 308 */                   if (r2.I00O10llo) {
/* 310 */                       r2.I000l1(iloi1112);
                            } else {
/* 314 */                       r2.I00io1l();
                            }
/* 317 */                   IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 319 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, r2, iOOlo1O01OI00000oIO);
/* 322 */                   IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 324 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI);
/* 327 */                   Integer numValueOf = Integer.valueOf(iHashCode);
/* 331 */                   IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 333 */                   li01Ooiio01.I0000Il00O(iOioOOi0I3, r2, numValueOf);
/* 336 */                   li01Ooiio01.I00000oOI(r2);
/* 339 */                   IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 341 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O);
/* 344 */                   O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 348 */                   Object objI00O0i0ii = r2.I00O0i0ii();
/* 352 */                   if (objI00O0i0ii == obj4) {
/* 356 */                       objI00O0i0ii = new OiioI1Io0o(6);
/* 359 */                       r2.I00iio(objI00O0i0ii);
                            }
/* 365 */                   O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111iI0000oI00, true, (Function1) objI00O0i0ii);
/* 370 */                   IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(i1IiOIiOli, iI0IlloOiO0i, r2, 0);
/* 376 */                   int iHashCode2 = Long.hashCode(r2.I00OI1);
/* 380 */                   OO0lO0l0 oO0lO0l0I000lI2 = r2.I000lI();
/* 384 */                   O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(r2, o1ooiI111iI00000oOI);
/* 388 */                   r2.I00i0oil();
/* 395 */                   if (r2.I00O10llo) {
/* 397 */                       r2.I000l1(iloi1112);
                            } else {
/* 401 */                       r2.I00io1l();
                            }
/* 404 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, r2, iOOlo1O01OI00000oIO2);
/* 407 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI2);
/* 410 */                   IIl001iO0Io.I001IIilI0O(iHashCode2, r2, iOioOOi0I3, r2);
/* 413 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O2);
/* 486 */                   Oo0i1oIIoOO.I00000oOI("Color Theme", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, Oo0lloOiiIOI.I00000oOI(liIoOiiO1Oi.I000OOo1O(r2).I000OOo1O, 0L, 0L, IlilIIiIiO.I00l0I0l0lO1, null, 0L, 0L, null, 16777211), r2, 6, 0, 131070);
/* 510 */                   Oo0i1oIIoOO.I00000oOI("System uses your wallpaper colors. Catppuccin and Dracula replace all surfaces and accents with their own palettes.", null, liIoOiiO1Oi.I000O01llI0(r2).I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(r2).I000l1, r2, 6, 0, 131066);
/* 515 */                   Object objI00O0i0ii2 = r2.I00O0i0ii();
/* 519 */                   if (objI00O0i0ii2 == obj4) {
/* 527 */                       objI00O0i0ii2 = lOO00IiI0li.I00000oIO(Oo0oii.I00000oOI.getValue());
/* 531 */                       r2.I00iio(objI00O0i0ii2);
                            }
/* 534 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii2;
/* 536 */                   Object objI00O0i0ii3 = r2.I00O0i0ii();
/* 540 */                   if (objI00O0i0ii3 == obj4) {
/* 548 */                       objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Oo0oii.I0000Il00O.getValue());
/* 552 */                       r2.I00iio(objI00O0i0ii3);
                            }
/* 555 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii3;
/* 557 */                   Object objI00O0i0ii4 = r2.I00O0i0ii();
/* 561 */                   if (objI00O0i0ii4 == obj4) {
/* 569 */                       objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Oo0oii.I0000O.getValue());
/* 573 */                       r2.I00iio(objI00O0i0ii4);
                            }
/* 576 */                   OI10i0Il oI10i0Il5 = (OI10i0Il) objI00O0i0ii4;
/* 578 */                   Object objI00O0i0ii5 = r2.I00O0i0ii();
/* 582 */                   if (objI00O0i0ii5 == obj4) {
/* 590 */                       objI00O0i0ii5 = lOO00IiI0li.I00000oIO(Oo0oii.I0000oI00.getValue());
/* 594 */                       r2.I00iio(objI00O0i0ii5);
                            }
/* 597 */                   OI10i0Il oI10i0Il6 = (OI10i0Il) objI00O0i0ii5;
/* 599 */                   Object objI00O0i0ii6 = r2.I00O0i0ii();
/* 603 */                   if (objI00O0i0ii6 == obj4) {
/* 611 */                       objI00O0i0ii6 = lOO00IiI0li.I00000oIO(Oo0oii.I0001Ioi1lo.getValue());
/* 615 */                       r2.I00iio(objI00O0i0ii6);
                            }
/* 618 */                   OI10i0Il oI10i0Il7 = (OI10i0Il) objI00O0i0ii6;
/* 622 */                   Object objI00O0i0ii7 = r2.I00O0i0ii();
/* 626 */                   if (objI00O0i0ii7 == obj4) {
/* 634 */                       objI00O0i0ii7 = lOO00IiI0li.I00000oIO(Oo0oii.I000II.getValue());
/* 638 */                       r2.I00iio(objI00O0i0ii7);
                            }
/* 641 */                   OI10i0Il oI10i0Il8 = (OI10i0Il) objI00O0i0ii7;
/* 643 */                   Ii0l1lo ii0l1lo = Ii0l1lo.I00iiI;
/* 645 */                   Ii0l1lo ii0l1lo2 = Ii0l1lo.I00iiO;
/* 647 */                   Ii0l1lo ii0l1lo3 = Ii0l1lo.I00iio;
/* 649 */                   Ii0l1lo ii0l1lo4 = Ii0l1lo.I00ilI0I1;
/* 651 */                   Ii0l1lo ii0l1lo5 = Ii0l1lo.I00ilO0;
/* 653 */                   Ii0l1lo ii0l1lo6 = Ii0l1lo.I00io1l;
/* 681 */                   List listI000O01llI0 = IOOi1I.I000O01llI0(ii0l1lo, ii0l1lo2, ii0l1lo3, ii0l1lo4, ii0l1lo5, ii0l1lo6);
/* 703 */                   O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
/* 717 */                   I1iO0OloOl i1iO0OloOl = new I1iO0OloOl(10);
/* 720 */                   i1iO0OloOl.I00iiI = listI000O01llI0;
/* 722 */                   i1iO0OloOl.I00iio = oI10i0Il3;
/* 724 */                   i1iO0OloOl.I00iiO = context2;
/* 726 */                   VarHandle.storeStoreFence();
/* 739 */                   lO1Ii0lI.I0000oI00(o1ooiI111iI000OiO, 0.0f, iiioOl1O.I00000oOI(-1887895996, i1iO0OloOl, r2), r2, 390);
/* 751 */                   boolean z2 = oI10i0Il3.getValue() == ii0l1lo;
/* 756 */                   OioI0O1lII1 oioI0O1lII1 = new OioI0O1lII1(2);
/* 759 */                   oioI0O1lII1.I00iiO = o1ol100o0O2;
/* 761 */                   oioI0O1lII1.I00iiI = context2;
/* 763 */                   oioI0O1lII1.I00iio = oI10i0Il2;
/* 765 */                   VarHandle.storeStoreFence();
/* 790 */                   O1OooO0IlOo.I0000O(z2, null, null, null, null, iiioOl1O.I00000oOI(1723465031, oioI0O1lII1, r2), r2, 1572870, 30);
/* 802 */                   boolean z3 = oI10i0Il3.getValue() == ii0l1lo3;
/* 808 */                   Oio1Io0ll oio1Io0ll = new Oio1Io0ll(9);
/* 811 */                   oio1Io0ll.I00iiO = oI10i0Il4;
/* 813 */                   oio1Io0ll.I00iio = oI10i0Il5;
/* 815 */                   oio1Io0ll.I00iiI = context2;
/* 817 */                   VarHandle.storeStoreFence();
/* 839 */                   O1OooO0IlOo.I0000O(z3, null, null, null, null, iiioOl1O.I00000oOI(1922100094, oio1Io0ll, r2), r2, 1572870, 30);
/* 851 */                   boolean z4 = oI10i0Il3.getValue() == ii0l1lo4;
/* 856 */                   I1iIoiiOO i1iIoiiOO = new I1iIoiiOO(1);
/* 859 */                   i1iIoiiOO.I00iiI = oI10i0Il6;
/* 861 */                   i1iIoiiOO.I00iiO = context2;
/* 863 */                   VarHandle.storeStoreFence();
/* 885 */                   O1OooO0IlOo.I0000O(z4, null, null, null, null, iiioOl1O.I00000oOI(1824767167, i1iIoiiOO, r2), r2, 1572870, 30);
/* 897 */                   boolean z5 = oI10i0Il3.getValue() == ii0l1lo5;
/* 902 */                   I1iIoiiOO i1iIoiiOO2 = new I1iIoiiOO(2);
/* 907 */                   i1iIoiiOO2.I00iiI = oI10i0Il7;
/* 909 */                   i1iIoiiOO2.I00iiO = context2;
/* 911 */                   VarHandle.storeStoreFence();
/* 933 */                   O1OooO0IlOo.I0000O(z5, null, null, null, null, iiioOl1O.I00000oOI(1727434240, i1iIoiiOO2, r2), r2, 1572870, 30);
/* 947 */                   boolean z6 = oI10i0Il3.getValue() == ii0l1lo6;
/* 952 */                   I1iIoiiOO i1iIoiiOO3 = new I1iIoiiOO(3);
/* 957 */                   i1iIoiiOO3.I00iiI = oI10i0Il8;
/* 959 */                   i1iIoiiOO3.I00iiO = context2;
/* 961 */                   VarHandle.storeStoreFence();
/* 983 */                   O1OooO0IlOo.I0000O(z6, null, null, null, null, iiioOl1O.I00000oOI(1630101313, i1iIoiiOO3, r2), r2, 1572870, 30);
/* 1002 */                  boolean z7 = oI10i0Il3.getValue() == ii0l1lo3 || oI10i0Il3.getValue() == ii0l1lo4;
/* 1007 */                  IloIlooo iloIlooo = new IloIlooo(6);
/* 1010 */                  iloIlooo.I00iiI = context2;
/* 1012 */                  VarHandle.storeStoreFence();
/* 1034 */                  O1OooO0IlOo.I0000O(z7, null, null, null, null, iiioOl1O.I00000oOI(1532768386, iloIlooo, r2), r2, 1572870, 30);
/* 1038 */                  r2.I0010I0i(true);
/* 1045 */                  O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 1056 */                  IOOlo1O01O iOOlo1O01OI00000oIO3 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), iI0IlloOiO0i, r2, 6);
/* 1062 */                  int iHashCode3 = Long.hashCode(r2.I00OI1);
/* 1066 */                  OO0lO0l0 oO0lO0l0I000lI3 = r2.I000lI();
/* 1070 */                  O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(r2, o1ooiI111iI0000oI002);
/* 1074 */                  r2.I00i0oil();
/* 1079 */                  if (r2.I00O10llo) {
/* 1081 */                      iloi111 = iloi1112;
/* 1083 */                      r2.I000l1(iloi111);
                            } else {
/* 1089 */                      iloi111 = iloi1112;
/* 1091 */                      r2.I00io1l();
                            }
/* 1095 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, r2, iOOlo1O01OI00000oIO3);
/* 1100 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI3);
/* 1105 */                  IIl001iO0Io.I001IIilI0O(iHashCode3, r2, iOioOOi0I3, r2);
/* 1110 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O3);
/* 1162 */                  Oo0i1oIIoOO.I00000oOI("Font", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(r2).I000OOo1O, r2, 6, 0, 131070);
/* 1165 */                  Object objI00O0i0ii8 = r2.I00O0i0ii();
/* 1171 */                  if (objI00O0i0ii8 == obj4) {
/* 1179 */                      objI00O0i0ii8 = lOO00IiI0li.I00000oIO(Oo0oii.I000O01llI0.getValue());
/* 1183 */                      r2.I00iio(objI00O0i0ii8);
                            }
/* 1186 */                  OI10i0Il oI10i0Il9 = (OI10i0Il) objI00O0i0ii8;
/* 1188 */                  Object objI00O0i0ii9 = r2.I00O0i0ii();
/* 1192 */                  if (objI00O0i0ii9 == obj4) {
/* 1196 */                      objI00O0i0ii9 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 1200 */                      r2.I00iio(objI00O0i0ii9);
                            }
/* 1203 */                  OI10i0Il oI10i0Il10 = (OI10i0Il) objI00O0i0ii9;
/* 1205 */                  II0O01li0 iI0O01li0 = i1O01oOIoI0I.I00iiO;
/* 1208 */                  O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 1214 */                  int iHashCode4 = Long.hashCode(r2.I00OI1);
/* 1218 */                  OO0lO0l0 oO0lO0l0I000lI4 = r2.I000lI();
/* 1224 */                  O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(r2, o1ooIo101ll);
/* 1228 */                  r2.I00i0oil();
/* 1235 */                  if (r2.I00O10llo) {
/* 1237 */                      r2.I000l1(iloi111);
                            } else {
/* 1241 */                      r2.I00io1l();
                            }
/* 1244 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, r2, o1iOIl0o10I0000Il00O);
/* 1247 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI4);
/* 1250 */                  IIl001iO0Io.I001IIilI0O(iHashCode4, r2, iOioOOi0I3, r2);
/* 1253 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O4);
/* 1256 */                  Object objI00O0i0ii10 = r2.I00O0i0ii();
                            Object obj6 = objI00O0i0ii10;
/* 1260 */                  if (objI00O0i0ii10 == obj4) {
/* 1266 */                      OioIO1o1 oioIO1o1 = new OioIO1o1(20);
/* 1269 */                      oioIO1o1.I00iiI = oI10i0Il10;
/* 1271 */                      VarHandle.storeStoreFence();
/* 1274 */                      r2.I00iio(oioIO1o1);
                                obj6 = oioIO1o1;
                            }
/* 1279 */                  IllOOo00lI illOOo00lI = (IllOOo00lI) obj6;
/* 1283 */                  O1ooiI111i o1ooiI111iI0000oI003 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 1291 */                  I0O1IiI i0O1IiI = new I0O1IiI(26);
/* 1294 */                  i0O1IiI.I00iiI = oI10i0Il9;
/* 1296 */                  VarHandle.storeStoreFence();
/* 1323 */                  iOiO0o0oi.I0000Il00O(illOOo00lI, o1ooiI111iI0000oI003, false, null, null, null, null, iiioOl1O.I00000oOI(1992231838, i0O1IiI, r2), r2, 805306422, 508);
/* 1332 */                  boolean zBooleanValue = ((Boolean) oI10i0Il10.getValue()).booleanValue();
/* 1336 */                  Object objI00O0i0ii11 = r2.I00O0i0ii();
                            Object obj7 = objI00O0i0ii11;
/* 1340 */                  if (objI00O0i0ii11 == obj4) {
/* 1346 */                      OioIO1o1 oioIO1o12 = new OioIO1o1(10);
/* 1349 */                      oioIO1o12.I00iiI = oI10i0Il10;
/* 1351 */                      VarHandle.storeStoreFence();
/* 1354 */                      r2.I00iio(oioIO1o12);
                                obj7 = oioIO1o12;
                            }
/* 1359 */                  IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj7;
/* 1364 */                  Oio1Io0ll oio1Io0ll2 = new Oio1Io0ll(4);
/* 1367 */                  oio1Io0ll2.I00iiI = context2;
/* 1369 */                  oio1Io0ll2.I00iiO = oI10i0Il9;
/* 1371 */                  oio1Io0ll2.I00iio = oI10i0Il10;
/* 1373 */                  VarHandle.storeStoreFence();
/* 1401 */                  iOIliO1I1i.I00000oIO(zBooleanValue, illOOo00lI2, null, 0L, null, null, null, 0L, 0.0f, iiioOl1O.I00000oOI(45351633, oio1Io0ll2, r2), r2, 48);
/* 1407 */                  O1ooiI111i o1ooiI111iI000l1 = Oi010OO0.I000l1(r2, true, true, o1ooIo101ll, 1.0f);
/* 1418 */                  IOOlo1O01O iOOlo1O01OI00000oIO4 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), iI0IlloOiO0i, r2, 6);
/* 1424 */                  int iHashCode5 = Long.hashCode(r2.I00OI1);
/* 1428 */                  OO0lO0l0 oO0lO0l0I000lI5 = r2.I000lI();
/* 1432 */                  O1ooiI111i o1ooiI111iI0000Il00O5 = iilOllOlO1.I0000Il00O(r2, o1ooiI111iI000l1);
/* 1436 */                  r2.I00i0oil();
/* 1441 */                  if (r2.I00O10llo) {
/* 1443 */                      r2.I000l1(iloi111);
                            } else {
/* 1447 */                      r2.I00io1l();
                            }
/* 1450 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, r2, iOOlo1O01OI00000oIO4);
/* 1453 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI5);
/* 1456 */                  IIl001iO0Io.I001IIilI0O(iHashCode5, r2, iOioOOi0I3, r2);
/* 1459 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O5);
/* 1511 */                  Oo0i1oIIoOO.I00000oOI("Language", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(r2).I000OOo1O, r2, 6, 0, 131070);
/* 1514 */                  Object objI00O0i0ii12 = r2.I00O0i0ii();
/* 1518 */                  if (objI00O0i0ii12 == obj4) {
/* 1522 */                      I1IIIoOioIlI.I00iiO.getClass();
/* 1531 */                      LocaleManager localeManager = (LocaleManager) context2.getSystemService(LocaleManager.class);
/* 1533 */                      if (localeManager == null || (emptyLocaleList = localeManager.getApplicationLocales()) == null) {
/* 1541 */                          emptyLocaleList = LocaleList.getEmptyLocaleList();
                                }
/* 1549 */                      if (emptyLocaleList.isEmpty() || (locale = emptyLocaleList.get(0)) == null) {
/* 1562 */                          i1IIIoOioIlI = I1IIIoOioIlI.I00iio;
                                } else {
/* 1565 */                          String languageTag = locale.toLanguageTag();
/* 1569 */                          Il0li01oOil il0li01oOil = I1IIIoOioIlI.I00ilO0;
/* 1571 */                          il0li01oOil.getClass();
/* 1576 */                          I01I0Iioooo0 i01I0Iioooo0 = new I01I0Iioooo0(il0li01oOil);
                                    while (true) {
/* 1583 */                              if (i01I0Iioooo0.hasNext()) {
/* 1585 */                                  next = i01I0Iioooo0.next();
/* 1590 */                                  I1IIIoOioIlI i1IIIoOioIlI3 = (I1IIIoOioIlI) next;
/* 1598 */                                  if (i1IIIoOioIlI3.I00iOIl.length() <= 0 || !i1IIIoOioIlI3.I00iOIl.equalsIgnoreCase(languageTag)) {
                                            }
                                        } else {
/* 1609 */                                  next = null;
                                        }
                                    }
/* 1612 */                          I1IIIoOioIlI i1IIIoOioIlI4 = (I1IIIoOioIlI) next;
/* 1614 */                          if (i1IIIoOioIlI4 == null) {
/* 1616 */                              Il0li01oOil il0li01oOil2 = I1IIIoOioIlI.I00ilO0;
/* 1618 */                              il0li01oOil2.getClass();
/* 1623 */                              I01I0Iioooo0 i01I0Iioooo02 = new I01I0Iioooo0(il0li01oOil2);
                                        while (true) {
/* 1630 */                                  if (i01I0Iioooo02.hasNext()) {
/* 1632 */                                      ?? next2 = i01I0Iioooo02.next();
/* 1637 */                                      I1IIIoOioIlI i1IIIoOioIlI5 = (I1IIIoOioIlI) next2;
/* 1645 */                                      if (i1IIIoOioIlI5.I00iOIl.length() > 0 && i1IIIoOioIlI5.I00iOIl.equalsIgnoreCase(locale.getLanguage())) {
/* 1659 */                                          i1IIIoOioIlI2 = next2;
                                                }
                                            }
                                        }
/* 1663 */                              i1IIIoOioIlI = i1IIIoOioIlI2;
/* 1665 */                              if (i1IIIoOioIlI == null) {
/* 1667 */                                  i1IIIoOioIlI = I1IIIoOioIlI.I00iio;
                                        }
                                    } else {
/* 1670 */                              i1IIIoOioIlI = i1IIIoOioIlI4;
                                    }
                                }
/* 1671 */                      objI00O0i0ii12 = lOO00IiI0li.I00000oIO(i1IIIoOioIlI);
/* 1675 */                      r2.I00iio(objI00O0i0ii12);
                            }
/* 1678 */                  OI10i0Il oI10i0Il11 = (OI10i0Il) objI00O0i0ii12;
/* 1680 */                  Object objI00O0i0ii13 = r2.I00O0i0ii();
/* 1684 */                  if (objI00O0i0ii13 == obj4) {
/* 1688 */                      objI00O0i0ii13 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 1692 */                      r2.I00iio(objI00O0i0ii13);
                            }
/* 1695 */                  OI10i0Il oI10i0Il12 = (OI10i0Il) objI00O0i0ii13;
/* 1700 */                  O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 1706 */                  int iHashCode6 = Long.hashCode(r2.I00OI1);
/* 1710 */                  OO0lO0l0 oO0lO0l0I000lI6 = r2.I000lI();
/* 1714 */                  O1ooiI111i o1ooiI111iI0000Il00O6 = iilOllOlO1.I0000Il00O(r2, o1ooIo101ll);
/* 1718 */                  r2.I00i0oil();
/* 1725 */                  if (r2.I00O10llo) {
/* 1727 */                      r2.I000l1(iloi111);
                            } else {
/* 1731 */                      r2.I00io1l();
                            }
/* 1734 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, r2, o1iOIl0o10I0000Il00O2);
/* 1737 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI6);
/* 1740 */                  IIl001iO0Io.I001IIilI0O(iHashCode6, r2, iOioOOi0I3, r2);
/* 1743 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O6);
/* 1746 */                  Object objI00O0i0ii14 = r2.I00O0i0ii();
                            Object obj8 = objI00O0i0ii14;
/* 1750 */                  if (objI00O0i0ii14 == obj4) {
/* 1756 */                      OioIO1o1 oioIO1o13 = new OioIO1o1(11);
/* 1759 */                      oioIO1o13.I00iiI = oI10i0Il12;
/* 1761 */                      VarHandle.storeStoreFence();
/* 1764 */                      r2.I00iio(oioIO1o13);
                                obj8 = oioIO1o13;
                            }
/* 1769 */                  IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj8;
/* 1773 */                  O1ooiI111i o1ooiI111iI0000oI004 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 1781 */                  I0O1IiI i0O1IiI2 = new I0O1IiI(22);
/* 1784 */                  i0O1IiI2.I00iiI = oI10i0Il11;
/* 1786 */                  VarHandle.storeStoreFence();
/* 1813 */                  iOiO0o0oi.I0000Il00O(illOOo00lI3, o1ooiI111iI0000oI004, false, null, null, null, null, iiioOl1O.I00000oOI(-1012692129, i0O1IiI2, r2), r2, 805306422, 508);
/* 1822 */                  boolean zBooleanValue2 = ((Boolean) oI10i0Il12.getValue()).booleanValue();
/* 1826 */                  Object objI00O0i0ii15 = r2.I00O0i0ii();
                            Object obj9 = objI00O0i0ii15;
/* 1832 */                  if (objI00O0i0ii15 == obj4) {
/* 1836 */                      OioIO1o1 oioIO1o14 = new OioIO1o1(12);
/* 1839 */                      oioIO1o14.I00iiI = oI10i0Il12;
/* 1841 */                      VarHandle.storeStoreFence();
/* 1844 */                      r2.I00iio(oioIO1o14);
                                obj9 = oioIO1o14;
                            }
/* 1849 */                  IllOOo00lI illOOo00lI4 = (IllOOo00lI) obj9;
/* 1854 */                  Oio1Io0ll oio1Io0ll3 = new Oio1Io0ll(5);
/* 1857 */                  oio1Io0ll3.I00iiI = context2;
/* 1859 */                  oio1Io0ll3.I00iiO = oI10i0Il11;
/* 1861 */                  oio1Io0ll3.I00iio = oI10i0Il12;
/* 1863 */                  VarHandle.storeStoreFence();
/* 1891 */                  iOIliO1I1i.I00000oIO(zBooleanValue2, illOOo00lI4, null, 0L, null, null, null, 0L, 0.0f, iiioOl1O.I00000oOI(1335394962, oio1Io0ll3, r2), r2, 48);
/* 1895 */                  r2.I0010I0i(true);
/* 1951 */                  Oo0i1oIIoOO.I00000oOI("Translations are still in progress — anything not yet translated stays in English.", null, liIoOiiO1Oi.I000O01llI0(r2).I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(r2).I000l1, r2, 6, 0, 131066);
/* 1955 */                  r2.I0010I0i(true);
/* 1960 */                  O1ooiI111i o1ooiI111iI0000oI005 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 1971 */                  IOOlo1O01O iOOlo1O01OI00000oIO5 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), iI0IlloOiO0i, r2, 6);
/* 1977 */                  int iHashCode7 = Long.hashCode(r2.I00OI1);
/* 1981 */                  OO0lO0l0 oO0lO0l0I000lI7 = r2.I000lI();
/* 1985 */                  O1ooiI111i o1ooiI111iI0000Il00O7 = iilOllOlO1.I0000Il00O(r2, o1ooiI111iI0000oI005);
/* 1989 */                  r2.I00i0oil();
/* 1994 */                  if (r2.I00O10llo) {
/* 1996 */                      r2.I000l1(iloi111);
                            } else {
/* 2000 */                      r2.I00io1l();
                            }
/* 2003 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, r2, iOOlo1O01OI00000oIO5);
/* 2006 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI7);
/* 2009 */                  IIl001iO0Io.I001IIilI0O(iHashCode7, r2, iOioOOi0I3, r2);
/* 2012 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O7);
/* 2064 */                  Oo0i1oIIoOO.I00000oOI("Chat font", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(r2).I000OOo1O, r2, 6, 0, 131070);
/* 2067 */                  Object objI00O0i0ii16 = r2.I00O0i0ii();
/* 2071 */                  if (objI00O0i0ii16 == obj4) {
/* 2079 */                      objI00O0i0ii16 = lOO00IiI0li.I00000oIO(Oo0oii.I000OOo1O.getValue());
/* 2083 */                      r2.I00iio(objI00O0i0ii16);
                            }
/* 2086 */                  OI10i0Il oI10i0Il13 = (OI10i0Il) objI00O0i0ii16;
/* 2088 */                  Object objI00O0i0ii17 = r2.I00O0i0ii();
/* 2092 */                  if (objI00O0i0ii17 == obj4) {
/* 2096 */                      objI00O0i0ii17 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 2100 */                      r2.I00iio(objI00O0i0ii17);
                            }
/* 2103 */                  OI10i0Il oI10i0Il14 = (OI10i0Il) objI00O0i0ii17;
/* 2108 */                  O1iOIl0o10 o1iOIl0o10I0000Il00O3 = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 2115 */                  int iHashCode8 = Long.hashCode(r2.I00OI1);
/* 2119 */                  OO0lO0l0 oO0lO0l0I000lI8 = r2.I000lI();
/* 2125 */                  O1ooiI111i o1ooiI111iI0000Il00O8 = iilOllOlO1.I0000Il00O(r2, o1ooIo101ll);
/* 2129 */                  r2.I00i0oil();
/* 2136 */                  if (r2.I00O10llo) {
/* 2138 */                      r2.I000l1(iloi111);
                            } else {
/* 2142 */                      r2.I00io1l();
                            }
/* 2145 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, r2, o1iOIl0o10I0000Il00O3);
/* 2148 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI8);
/* 2151 */                  IIl001iO0Io.I001IIilI0O(iHashCode8, r2, iOioOOi0I3, r2);
/* 2154 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O8);
/* 2157 */                  Object objI00O0i0ii18 = r2.I00O0i0ii();
                            Object obj10 = objI00O0i0ii18;
/* 2161 */                  if (objI00O0i0ii18 == obj4) {
/* 2167 */                      OioIO1o1 oioIO1o15 = new OioIO1o1(13);
/* 2170 */                      oioIO1o15.I00iiI = oI10i0Il14;
/* 2172 */                      VarHandle.storeStoreFence();
/* 2175 */                      r2.I00iio(oioIO1o15);
                                obj10 = oioIO1o15;
                            }
/* 2180 */                  IllOOo00lI illOOo00lI5 = (IllOOo00lI) obj10;
/* 2184 */                  O1ooiI111i o1ooiI111iI0000oI006 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 2192 */                  I0O1IiI i0O1IiI3 = new I0O1IiI(23);
/* 2195 */                  i0O1IiI3.I00iiI = oI10i0Il13;
/* 2197 */                  VarHandle.storeStoreFence();
/* 2224 */                  iOiO0o0oi.I0000Il00O(illOOo00lI5, o1ooiI111iI0000oI006, false, null, null, null, null, iiioOl1O.I00000oOI(277351200, i0O1IiI3, r2), r2, 805306422, 508);
/* 2233 */                  boolean zBooleanValue3 = ((Boolean) oI10i0Il14.getValue()).booleanValue();
/* 2237 */                  Object objI00O0i0ii19 = r2.I00O0i0ii();
                            Object obj11 = objI00O0i0ii19;
/* 2241 */                  if (objI00O0i0ii19 == obj4) {
/* 2247 */                      OioIO1o1 oioIO1o16 = new OioIO1o1(14);
/* 2250 */                      oioIO1o16.I00iiI = oI10i0Il14;
/* 2252 */                      VarHandle.storeStoreFence();
/* 2255 */                      r2.I00iio(oioIO1o16);
                                obj11 = oioIO1o16;
                            }
/* 2260 */                  IllOOo00lI illOOo00lI6 = (IllOOo00lI) obj11;
/* 2265 */                  Oio1Io0ll oio1Io0ll4 = new Oio1Io0ll(6);
/* 2268 */                  oio1Io0ll4.I00iiI = context2;
/* 2270 */                  oio1Io0ll4.I00iiO = oI10i0Il13;
/* 2272 */                  oio1Io0ll4.I00iio = oI10i0Il14;
/* 2274 */                  VarHandle.storeStoreFence();
/* 2302 */                  iOIliO1I1i.I00000oIO(zBooleanValue3, illOOo00lI6, null, 0L, null, null, null, 0L, 0.0f, iiioOl1O.I00000oOI(-1669529005, oio1Io0ll4, r2), r2, 48);
/* 2308 */                  O1ooiI111i o1ooiI111iI000l12 = Oi010OO0.I000l1(r2, true, true, o1ooIo101ll, 1.0f);
/* 2319 */                  IOOlo1O01O iOOlo1O01OI00000oIO6 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), iI0IlloOiO0i, r2, 6);
/* 2325 */                  int iHashCode9 = Long.hashCode(r2.I00OI1);
/* 2329 */                  OO0lO0l0 oO0lO0l0I000lI9 = r2.I000lI();
/* 2333 */                  O1ooiI111i o1ooiI111iI0000Il00O9 = iilOllOlO1.I0000Il00O(r2, o1ooiI111iI000l12);
/* 2337 */                  r2.I00i0oil();
/* 2342 */                  if (r2.I00O10llo) {
/* 2344 */                      r2.I000l1(iloi111);
                            } else {
/* 2348 */                      r2.I00io1l();
                            }
/* 2351 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, r2, iOOlo1O01OI00000oIO6);
/* 2354 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI9);
/* 2357 */                  IIl001iO0Io.I001IIilI0O(iHashCode9, r2, iOioOOi0I3, r2);
/* 2360 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O9);
/* 2412 */                  Oo0i1oIIoOO.I00000oOI("New / History / Import font", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(r2).I000OOo1O, r2, 6, 0, 131070);
/* 2415 */                  Object objI00O0i0ii20 = r2.I00O0i0ii();
/* 2419 */                  if (objI00O0i0ii20 == obj4) {
/* 2427 */                      objI00O0i0ii20 = lOO00IiI0li.I00000oIO(Oo0oii.I000OiO.getValue());
/* 2431 */                      r2.I00iio(objI00O0i0ii20);
                            }
/* 2434 */                  OI10i0Il oI10i0Il15 = (OI10i0Il) objI00O0i0ii20;
/* 2436 */                  Object objI00O0i0ii21 = r2.I00O0i0ii();
/* 2440 */                  if (objI00O0i0ii21 == obj4) {
/* 2444 */                      objI00O0i0ii21 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 2448 */                      r2.I00iio(objI00O0i0ii21);
                            }
/* 2451 */                  OI10i0Il oI10i0Il16 = (OI10i0Il) objI00O0i0ii21;
/* 2456 */                  O1iOIl0o10 o1iOIl0o10I0000Il00O4 = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 2462 */                  int iHashCode10 = Long.hashCode(r2.I00OI1);
/* 2466 */                  OO0lO0l0 oO0lO0l0I000lI10 = r2.I000lI();
/* 2470 */                  O1ooiI111i o1ooiI111iI0000Il00O10 = iilOllOlO1.I0000Il00O(r2, o1ooIo101ll);
/* 2474 */                  r2.I00i0oil();
/* 2481 */                  if (r2.I00O10llo) {
/* 2483 */                      r2.I000l1(iloi111);
                            } else {
/* 2487 */                      r2.I00io1l();
                            }
/* 2490 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, r2, o1iOIl0o10I0000Il00O4);
/* 2493 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI10);
/* 2496 */                  IIl001iO0Io.I001IIilI0O(iHashCode10, r2, iOioOOi0I3, r2);
/* 2499 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O10);
/* 2502 */                  Object objI00O0i0ii22 = r2.I00O0i0ii();
                            Object obj12 = objI00O0i0ii22;
/* 2506 */                  if (objI00O0i0ii22 == obj4) {
/* 2512 */                      OioIO1o1 oioIO1o17 = new OioIO1o1(15);
/* 2515 */                      oioIO1o17.I00iiI = oI10i0Il16;
/* 2517 */                      VarHandle.storeStoreFence();
/* 2520 */                      r2.I00iio(oioIO1o17);
                                obj12 = oioIO1o17;
                            }
/* 2525 */                  IllOOo00lI illOOo00lI7 = (IllOOo00lI) obj12;
/* 2529 */                  O1ooiI111i o1ooiI111iI0000oI007 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 2537 */                  I0O1IiI i0O1IiI4 = new I0O1IiI(24);
/* 2540 */                  i0O1IiI4.I00iiI = oI10i0Il15;
/* 2542 */                  VarHandle.storeStoreFence();
/* 2569 */                  iOiO0o0oi.I0000Il00O(illOOo00lI7, o1ooiI111iI0000oI007, false, null, null, null, null, iiioOl1O.I00000oOI(1567394529, i0O1IiI4, r2), r2, 805306422, 508);
/* 2578 */                  boolean zBooleanValue4 = ((Boolean) oI10i0Il16.getValue()).booleanValue();
/* 2582 */                  Object objI00O0i0ii23 = r2.I00O0i0ii();
                            Object obj13 = objI00O0i0ii23;
/* 2586 */                  if (objI00O0i0ii23 == obj4) {
/* 2592 */                      OioIO1o1 oioIO1o18 = new OioIO1o1(16);
/* 2595 */                      oioIO1o18.I00iiI = oI10i0Il16;
/* 2597 */                      VarHandle.storeStoreFence();
/* 2600 */                      r2.I00iio(oioIO1o18);
                                obj13 = oioIO1o18;
                            }
/* 2605 */                  IllOOo00lI illOOo00lI8 = (IllOOo00lI) obj13;
/* 2610 */                  Oio1Io0ll oio1Io0ll5 = new Oio1Io0ll(7);
/* 2613 */                  oio1Io0ll5.I00iiI = context2;
/* 2615 */                  oio1Io0ll5.I00iiO = oI10i0Il15;
/* 2617 */                  oio1Io0ll5.I00iio = oI10i0Il16;
/* 2619 */                  VarHandle.storeStoreFence();
/* 2647 */                  iOIliO1I1i.I00000oIO(zBooleanValue4, illOOo00lI8, null, 0L, null, null, null, 0L, 0.0f, iiioOl1O.I00000oOI(-379485676, oio1Io0ll5, r2), r2, 48);
/* 2653 */                  O1ooiI111i o1ooiI111iI000l13 = Oi010OO0.I000l1(r2, true, true, o1ooIo101ll, 1.0f);
/* 2664 */                  IOOlo1O01O iOOlo1O01OI00000oIO7 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), iI0IlloOiO0i, r2, 6);
/* 2670 */                  int iHashCode11 = Long.hashCode(r2.I00OI1);
/* 2674 */                  OO0lO0l0 oO0lO0l0I000lI11 = r2.I000lI();
/* 2678 */                  O1ooiI111i o1ooiI111iI0000Il00O11 = iilOllOlO1.I0000Il00O(r2, o1ooiI111iI000l13);
/* 2682 */                  r2.I00i0oil();
/* 2687 */                  if (r2.I00O10llo) {
/* 2689 */                      r2.I000l1(iloi111);
                            } else {
/* 2693 */                      r2.I00io1l();
                            }
/* 2696 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, r2, iOOlo1O01OI00000oIO7);
/* 2699 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI11);
/* 2702 */                  IIl001iO0Io.I001IIilI0O(iHashCode11, r2, iOioOOi0I3, r2);
/* 2705 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O11);
/* 2757 */                  Oo0i1oIIoOO.I00000oOI("Core / Image / Sound font", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(r2).I000OOo1O, r2, 6, 0, 131070);
/* 2760 */                  Object objI00O0i0ii24 = r2.I00O0i0ii();
/* 2764 */                  if (objI00O0i0ii24 == obj4) {
/* 2772 */                      objI00O0i0ii24 = lOO00IiI0li.I00000oIO(Oo0oii.I000iOII.getValue());
/* 2776 */                      r2.I00iio(objI00O0i0ii24);
                            }
/* 2779 */                  OI10i0Il oI10i0Il17 = (OI10i0Il) objI00O0i0ii24;
/* 2781 */                  Object objI00O0i0ii25 = r2.I00O0i0ii();
/* 2785 */                  if (objI00O0i0ii25 == obj4) {
/* 2789 */                      objI00O0i0ii25 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 2793 */                      r2.I00iio(objI00O0i0ii25);
                            }
/* 2796 */                  OI10i0Il oI10i0Il18 = (OI10i0Il) objI00O0i0ii25;
/* 2801 */                  O1iOIl0o10 o1iOIl0o10I0000Il00O5 = II1oOI10.I0000Il00O(iI0O01li0, false);
/* 2807 */                  int iHashCode12 = Long.hashCode(r2.I00OI1);
/* 2811 */                  OO0lO0l0 oO0lO0l0I000lI12 = r2.I000lI();
/* 2815 */                  O1ooiI111i o1ooiI111iI0000Il00O12 = iilOllOlO1.I0000Il00O(r2, o1ooIo101ll);
/* 2819 */                  r2.I00i0oil();
/* 2826 */                  if (r2.I00O10llo) {
/* 2828 */                      r2.I000l1(iloi111);
                            } else {
/* 2832 */                      r2.I00io1l();
                            }
/* 2835 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, r2, o1iOIl0o10I0000Il00O5);
/* 2838 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI12);
/* 2841 */                  IIl001iO0Io.I001IIilI0O(iHashCode12, r2, iOioOOi0I3, r2);
/* 2844 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O12);
/* 2847 */                  Object objI00O0i0ii26 = r2.I00O0i0ii();
/* 2851 */                  if (objI00O0i0ii26 == obj4) {
/* 2857 */                      objI00O0i0ii26 = new OioIO1o1(oI10i0Il18, 17);
/* 2860 */                      r2.I00iio(objI00O0i0ii26);
                            }
/* 2900 */                  iOiO0o0oi.I0000Il00O((IllOOo00lI) objI00O0i0ii26, Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), false, null, null, null, null, iiioOl1O.I00000oOI(-1437529438, new I0O1IiI(oI10i0Il17), r2), r2, 805306422, 508);
/* 2903 */                  boolean zI0000O = OioIlii1iOO.I0000O(oI10i0Il18);
/* 2907 */                  Object objI00O0i0ii27 = r2.I00O0i0ii();
/* 2911 */                  if (objI00O0i0ii27 == obj4) {
/* 2917 */                      objI00O0i0ii27 = new OioIO1o1(oI10i0Il18, 19);
/* 2920 */                      r2.I00iio(objI00O0i0ii27);
                            }
/* 2957 */                  iOIliO1I1i.I00000oIO(zI0000O, (IllOOo00lI) objI00O0i0ii27, null, 0L, null, null, null, 0L, 0.0f, iiioOl1O.I00000oOI(910557653, new Oio1Io0ll(context2, oI10i0Il17, oI10i0Il18), r2), r2, 48);
/* 2960 */                  r2.I00111O();
/* 2963 */                  r2.I00111O();
/* 3 */                     O1ooiI111i o1ooiI111iI0000oI008 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 2977 */                  IOOlo1O01O iOOlo1O01OI00000oIO8 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(4.0f), iI0IlloOiO0i, r2, 6);
/* 2985 */                  int iHashCode13 = Long.hashCode(iilI1O0il0.I00000oOI(r2));
/* 2989 */                  OO0lO0l0 oO0lO0l0I000lI13 = r2.I000lI();
/* 2993 */                  O1ooiI111i o1ooiI111iI0000Il00O13 = iilOllOlO1.I0000Il00O(r2, o1ooiI111iI0000oI008);
/* 2997 */                  r2.I00i0oil();
/* 3004 */                  if (r2.I00II0oii1o()) {
/* 3006 */                      r2.I000l1(iloi111);
                            } else {
/* 3010 */                      r2.I00io1l();
                            }
/* 3013 */                  li01Ooiio01.I0000Il00O(iOioOOi0I, r2, iOOlo1O01OI00000oIO8);
/* 3016 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, r2, oO0lO0l0I000lI13);
/* 3019 */                  IIl001iO0Io.I001IIilI0O(iHashCode13, r2, iOioOOi0I3, r2);
/* 3022 */                  li01Ooiio01.I0000Il00O(iOioOOi0I4, r2, o1ooiI111iI0000Il00O13);
/* 3025 */                  Object objI00O0i0ii28 = r2.I00O0i0ii();
/* 3029 */                  if (objI00O0i0ii28 == obj4) {
/* 3037 */                      objI00O0i0ii28 = lOO00IiI0li.I00000oIO(Oo0oii.I000l1.getValue());
/* 3041 */                      r2.I00iio(objI00O0i0ii28);
                            }
/* 3044 */                  OI10i0Il oI10i0Il19 = (OI10i0Il) objI00O0i0ii28;
/* 3118 */                  Oo0i1oIIoOO.I00000oOI(IIlIOloOOO.I00100l0("Text size — ", O1OooO0IlOo.I000II(((Number) oI10i0Il19.getValue()).floatValue() * 100.0f), "%"), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(r2).I000OOo1O, r2, 0, 0, 131070);
/* 3127 */                  float fFloatValue = ((Number) oI10i0Il19.getValue()).floatValue();
/* 3137 */                  IOO1O00oI iOO1O00oII0001Ioi1lo = lIiioliIlo.I0001Ioi1lo(0.8f, 1.4f);
/* 3141 */                  Object objI00O0i0ii29 = r2.I00O0i0ii();
/* 3145 */                  if (objI00O0i0ii29 == obj4) {
/* 3151 */                      objI00O0i0ii29 = new O1i0lolo(oI10i0Il19, 12);
/* 3154 */                      r2.I00iio(objI00O0i0ii29);
                            }
/* 3159 */                  Function1 function12 = (Function1) objI00O0i0ii29;
/* 3161 */                  boolean zI000OOo1O = r2.I000OOo1O(context2);
/* 3165 */                  Object objI00O0i0ii30 = r2.I00O0i0ii();
/* 3169 */                  if (zI000OOo1O || objI00O0i0ii30 == obj4) {
/* 3175 */                      objI00O0i0ii30 = new I1iO01O1oOo(oI10i0Il19, context2);
/* 3178 */                      r2.I00iio(objI00O0i0ii30);
                            }
/* 3202 */                  Ol10ooO01IO.I00000oIO(fFloatValue, function12, null, false, iOO1O00oII0001Ioi1lo, 11, (IllOOo00lI) objI00O0i0ii30, null, null, r2, 196656, 396);
/* 3205 */                  r2.I00111O();
/* 3208 */                  r2.I00111O();
/* 282 */                   return ooiIlOl1iI;
                        default:
/* 23 */                    O1ol100o0O o1ol100o0O3 = this.I00iiO;
/* 25 */                    Context context3 = this.I00iiI;
/* 27 */                    OI10i0Il oI10i0Il20 = this.I00iio;
/* 35 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 41 */                    ((Integer) obj3).getClass();
/* 44 */                    O1ooiI111i o1ooiI111iI0000oI009 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 48 */                    Object objI00O0i0ii31 = iloI0lOlll1.I00O0i0ii();
/* 52 */                    if (objI00O0i0ii31 == obj4) {
/* 56 */                        objI00O0i0ii31 = new OiioI1Io0o(6);
/* 59 */                        iloI0lOlll1.I00iio(objI00O0i0ii31);
                            }
/* 64 */                    O1ooiI111i o1ooiI111iI00000oOI2 = OiioloIlOlIi.I00000oOI(o1ooiI111iI0000oI009, true, (Function1) objI00O0i0ii31);
/* 70 */                    IOOlo1O01O iOOlo1O01OI00000oIO9 = IOOlio0Io0.I00000oIO(i1IiOIiOli, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll1, 0);
/* 76 */                    int iHashCode14 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 80 */                    OO0lO0l0 oO0lO0l0I000lI14 = iloI0lOlll1.I000lI();
/* 84 */                    O1ooiI111i o1ooiI111iI0000Il00O14 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oOI2);
/* 90 */                    IOl0oi0lOl1.I000lI.getClass();
/* 93 */                    iloI0lOlll1.I00i0oil();
/* 98 */                    if (iloI0lOlll1.I00O10llo) {
/* 100 */                       iloI0lOlll1.I000l1(iloi1112);
                            } else {
/* 104 */                       iloI0lOlll1.I00io1l();
                            }
/* 109 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, iOOlo1O01OI00000oIO9);
/* 114 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI14);
/* 123 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode14));
/* 126 */                   li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 131 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O14);
/* 206 */                   Oo0i1oIIoOO.I00000oOI("Light / dark mode", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, Oo0lloOiiIOI.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000OOo1O, 0L, 0L, IlilIIiIiO.I00l0I0l0lO1, null, 0L, 0L, null, 16777211), iloI0lOlll1, 6, 0, 131070);
/* 211 */                   OioI0O1lII1 oioI0O1lII12 = new OioI0O1lII1(i2);
/* 214 */                   oioI0O1lII12.I00iiO = o1ol100o0O3;
/* 216 */                   oioI0O1lII12.I00iiI = context3;
/* 218 */                   oioI0O1lII12.I00iio = oI10i0Il20;
/* 220 */                   VarHandle.storeStoreFence();
/* 240 */                   lO1Ii0lI.I00000oIO(null, 0.0f, iiioOl1O.I00000oOI(743137262, oioI0O1lII12, iloI0lOlll1), iloI0lOlll1, 384, 3);
/* 243 */                   iloI0lOlll1.I0010I0i(true);
/* 246 */                   return ooiIlOl1iI;
                    }
                }
            }
