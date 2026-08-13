            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iIooIioI1Oo0 {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v27, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r0v29 */
                /* JADX WARN: Type inference failed for: r0v44 */
                public static final void I00000oIO(O1ol100o0O o1ol100o0O, O1o1io0oi0ol o1o1io0oi0ol, IloI0lOlll1 iloI0lOlll1, int i) {
                    O1o1io0oi0ol o1o1io0oi0ol2;
                    IloI0lOlll1 iloI0lOlll12;
                    O1o1io0oi0ol o1o1io0oi0ol3;
                    boolean z;
                    Object obj;
                    O1o1io0oi0ol o1o1io0oi0ol4;
                    IloI0lOlll1 iloI0lOlll13;
                    boolean z2;
                    IloI0lOlll1 iloI0lOlll14;
                    OI10i0Il oI10i0Il;
                    O1ooIo101ll o1ooIo101ll;
                    O1o1io0oi0ol o1o1io0oi0ol5;
                    IloI0lOlll1 iloI0lOlll15;
                    ?? r0;
                    O1ooIo101ll o1ooIo101ll2;
                    boolean z3;
                    IloI0lOlll1 iloI0lOlll16;
/* 3 */             IloI0lOlll1 iloI0lOlll17 = iloI0lOlll1;
/* 8 */             iloI0lOlll17.I00i0O(1829589179);
/* 15 */            int i2 = 4;
/* 23 */            int i3 = i | (iloI0lOlll17.I000OOo1O(o1ol100o0O) ? 4 : 2) | 16;
/* 41 */            if (iloI0lOlll17.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 43 */                iloI0lOlll17.I00Ol00();
/* 48 */                if ((i & 1) == 0 || iloI0lOlll17.I001lloI()) {
/* 63 */                    Oool1Ii0I oool1Ii0II00000oIO = O11oIiol.I00000oIO(iloI0lOlll17);
/* 67 */                    if (oool1Ii0II00000oIO == null) {
/* 1342 */                      I000II.I001IO000("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
/* 1345 */                      return;
                            }
/* 93 */                    o1o1io0oi0ol3 = (O1o1io0oi0ol) li1ilo1Oli.I00000oIO(OOoOl0i.I00000oIO.I00000oOI(O1o1io0oi0ol.class), oool1Ii0II00000oIO, ilo0oII1O01.I00000oIO(li1iolIo.I00000oOI(oool1Ii0II00000oIO), iloI0lOlll17), li1iolIo.I00000oIO(oool1Ii0II00000oIO), iloI0lOlll17);
                        } else {
/* 57 */                    iloI0lOlll17.I00OilO00Il();
/* 60 */                    o1o1io0oi0ol3 = o1o1io0oi0ol;
                        }
/* 95 */                iloI0lOlll17.I0010o();
/* 100 */               OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(o1o1io0oi0ol3.I0000Il00O, iloI0lOlll17);
/* 106 */               OI10i0Il oI10i0IlI00000oOI2 = lOIoiooI1i01.I00000oOI(o1ol100o0O.I000OOo1O, iloI0lOlll17);
/* 116 */               O1oIOiI11o0 o1oIOiI11o0 = ((O1oiOloOo) oI10i0IlI00000oOI2.getValue()).I000II;
/* 132 */               O1oOil o1oOil = (O1oOil) ((O1oiOloOo) oI10i0IlI00000oOI2.getValue()).I0000O.get(o1oIOiI11o0.I00000oIO);
/* 147 */               boolean z4 = (o1oOil != null ? o1oOil.I00000oIO : null) == O1oOl0.I00iiO;
/* 155 */               Context context = (Context) iloI0lOlll17.I000iOII(I0lloOI0oio.I00000oOI);
/* 159 */               int i4 = 3;
/* 160 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(3);
/* 171 */               boolean zI000OOo1O = iloI0lOlll17.I000OOo1O(o1o1io0oi0ol3) | iloI0lOlll17.I000OOo1O(context);
/* 172 */               Object objI00O0i0ii = iloI0lOlll17.I00O0i0ii();
/* 176 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        Object obj2 = objI00O0i0ii;
/* 178 */               if (zI000OOo1O || objI00O0i0ii == iOO0o0I1l) {
/* 184 */                   O1lIIi o1lIIi = new O1lIIi(4);
/* 187 */                   o1lIIi.I00iiI = o1o1io0oi0ol3;
/* 189 */                   o1lIIi.I00iiO = context;
/* 191 */                   VarHandle.storeStoreFence();
/* 194 */                   iloI0lOlll17.I00iio(o1lIIi);
                            obj2 = o1lIIi;
                        }
/* 199 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj2, iloI0lOlll17, 0);
/* 203 */               Object objI00O0i0ii2 = iloI0lOlll17.I00O0i0ii();
/* 207 */               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 209 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 213 */                   iloI0lOlll17.I00iio(objI00O0i0ii2);
                        }
/* 216 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii2;
/* 221 */               I0IIiOoi1i i0IIiOoi1i2 = new I0IIiOoi1i(7);
/* 232 */               boolean zI000OOo1O2 = iloI0lOlll17.I000OOo1O(o1o1io0oi0ol3) | iloI0lOlll17.I000OOo1O(context);
/* 236 */               Object objI00O0i0ii3 = iloI0lOlll17.I00O0i0ii();
                        Object obj3 = objI00O0i0ii3;
/* 240 */               if (zI000OOo1O2 || objI00O0i0ii3 == iOO0o0I1l) {
/* 246 */                   O11IOOoiI10i o11IOOoiI10i = new O11IOOoiI10i(i2);
/* 249 */                   o11IOOoiI10i.I00iiI = oI10i0Il2;
/* 251 */                   o11IOOoiI10i.I00iiO = o1o1io0oi0ol3;
/* 253 */                   o11IOOoiI10i.I00iio = context;
/* 255 */                   VarHandle.storeStoreFence();
/* 258 */                   iloI0lOlll17.I00iio(o11IOOoiI10i);
                            obj3 = o11IOOoiI10i;
                        }
/* 263 */               O1OIi1 o1OIi1I00000oIO2 = iOI1O1I1O.I00000oIO(i0IIiOoi1i2, (Function1) obj3, iloI0lOlll17, 0);
/* 275 */               boolean zI000OOo1O3 = iloI0lOlll17.I000OOo1O(context) | iloI0lOlll17.I000OOo1O(o1OIi1I00000oIO2);
/* 276 */               Object objI00O0i0ii4 = iloI0lOlll17.I00O0i0ii();
                        Object obj4 = objI00O0i0ii4;
/* 280 */               if (zI000OOo1O3 || objI00O0i0ii4 == iOO0o0I1l) {
/* 288 */                   I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(29);
/* 291 */                   i0iI0O1IoIoI.I00iiI = context;
/* 293 */                   i0iI0O1IoIoI.I00iio = o1OIi1I00000oIO2;
/* 295 */                   i0iI0O1IoIoI.I00iiO = oI10i0Il2;
/* 297 */                   VarHandle.storeStoreFence();
/* 300 */                   iloI0lOlll17.I00iio(i0iI0O1IoIoI);
                            obj4 = i0iI0O1IoIoI;
                        }
/* 303 */               IllOOo00lI illOOo00lI = (IllOOo00lI) obj4;
/* 308 */               I0IIiOoi1i i0IIiOoi1i3 = new I0IIiOoi1i(5);
/* 311 */               boolean zI000II = iloI0lOlll17.I000II(illOOo00lI);
/* 315 */               Object objI00O0i0ii5 = iloI0lOlll17.I00O0i0ii();
                        Object obj5 = objI00O0i0ii5;
/* 319 */               if (zI000II || objI00O0i0ii5 == iOO0o0I1l) {
/* 325 */                   I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(7);
/* 328 */                   i11i0ol0l0.I00iiI = illOOo00lI;
/* 330 */                   VarHandle.storeStoreFence();
/* 333 */                   iloI0lOlll17.I00iio(i11i0ol0l0);
                            obj5 = i11i0ol0l0;
                        }
/* 338 */               O1OIi1 o1OIi1I00000oIO3 = iOI1O1I1O.I00000oIO(i0IIiOoi1i3, (Function1) obj5, iloI0lOlll17, 0);
/* 342 */               IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I0000Il00O;
/* 346 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 352 */               int iHashCode = Long.hashCode(iloI0lOlll17.I00OI1);
/* 356 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll17.I000lI();
/* 360 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll17, ilIl1Io0lii1);
/* 366 */               IOl0oi0lOl1.I000lI.getClass();
/* 369 */               iloI0lOlll17.I00i0oil();
/* 372 */               O1o1io0oi0ol o1o1io0oi0ol6 = o1o1io0oi0ol3;
/* 374 */               boolean z5 = iloI0lOlll17.I00O10llo;
/* 378 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 380 */               if (z5) {
/* 382 */                   iloI0lOlll17.I000l1(iloi111);
                        } else {
/* 388 */                   iloI0lOlll17.I00io1l();
                        }
/* 392 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 394 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll17, o1iOIl0o10I0000Il00O);
/* 397 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 399 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll17, oO0lO0l0I000lI);
/* 402 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 406 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 408 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll17, numValueOf);
/* 411 */               li01Ooiio01.I00000oOI(iloI0lOlll17);
/* 414 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 416 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll17, o1ooiI111iI0000Il00O);
/* 423 */               boolean z6 = z4;
/* 434 */               O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(iO0l10O.I0000Il00O(ilIl1Io0lii1, iO0l10O.I00000oOI(iloI0lOlll17), true), 24.0f);
/* 448 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(16.0f), i1O01oOIoI0I.I00o0l1o1o0, iloI0lOlll17, 54);
/* 456 */               int iHashCode2 = Long.hashCode(iloI0lOlll17.I00OI1);
/* 460 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll17.I000lI();
/* 464 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll17, o1ooiI111iI0001Ioi1lo);
/* 468 */               iloI0lOlll17.I00i0oil();
/* 473 */               if (iloI0lOlll17.I00O10llo) {
/* 475 */                   iloI0lOlll17.I000l1(iloi111);
                        } else {
/* 479 */                   iloI0lOlll17.I00io1l();
                        }
/* 482 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll17, iOOlo1O01OI00000oIO);
/* 485 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll17, oO0lO0l0I000lI2);
/* 488 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll17, iOioOOi0I3, iloI0lOlll17);
/* 491 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll17, o1ooiI111iI0000Il00O2);
/* 497 */               iloI0lOlll17.I00i01iIIliI(211768646);
/* 500 */               if (z6) {
/* 652 */                   iloI0lOlll17.I00i01iIIliI(212084907);
/* 655 */                   iloI0lOlll17.I0010I0i(false);
/* 667 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(12.0f), i1O01oOIoI0I.I00ll1, iloI0lOlll17, 6);
/* 674 */                   int iHashCode3 = Long.hashCode(iloI0lOlll17.I00OI1);
/* 678 */                   OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll17.I000lI();
/* 682 */                   O1ooIo101ll o1ooIo101ll3 = O1ooIo101ll.I00000oIO;
/* 684 */                   O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll17, o1ooIo101ll3);
/* 688 */                   iloI0lOlll17.I00i0oil();
/* 695 */                   if (iloI0lOlll17.I00O10llo) {
/* 697 */                       iloI0lOlll17.I000l1(iloi111);
                            } else {
/* 701 */                       iloI0lOlll17.I00io1l();
                            }
/* 704 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll17, oiI1iiIl1Oi0I00000oIO);
/* 707 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll17, oO0lO0l0I000lI3);
/* 710 */                   IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll17, iOioOOi0I3, iloI0lOlll17);
/* 713 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll17, o1ooiI111iI0000Il00O3);
/* 716 */                   boolean zI000OOo1O4 = iloI0lOlll17.I000OOo1O(o1OIi1I00000oIO);
/* 720 */                   Object objI00O0i0ii6 = iloI0lOlll17.I00O0i0ii();
                            Object obj6 = objI00O0i0ii6;
/* 724 */                   if (zI000OOo1O4 || objI00O0i0ii6 == iOO0o0I1l) {
/* 732 */                       I0O1I11 i0o1i11 = new I0O1I11(17);
/* 735 */                       i0o1i11.I00iiI = o1OIi1I00000oIO;
/* 737 */                       VarHandle.storeStoreFence();
/* 740 */                       iloI0lOlll17.I00iio(i0o1i11);
                                obj6 = i0o1i11;
                            }
/* 772 */                   iOiO0o0oi.I0000Il00O((IllOOo00lI) obj6, null, !((O1o1iOlI1) oI10i0IlI00000oOI.getValue()).I0000O, null, null, null, null, i1il1IIIo0.I00000oIO, iloI0lOlll1, 805306368, 506);
/* 789 */                   boolean zI000OOo1O5 = iloI0lOlll1.I000OOo1O(context) | iloI0lOlll1.I000II(illOOo00lI) | iloI0lOlll1.I000OOo1O(o1OIi1I00000oIO3);
/* 790 */                   Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 794 */                   if (zI000OOo1O5 || objI00O0i0ii7 == iOO0o0I1l) {
/* 804 */                       z = true;
/* 806 */                       O1lI0i1ili o1lI0i1ili = new O1lI0i1ili(1);
/* 809 */                       o1lI0i1ili.I00iiI = context;
/* 811 */                       o1lI0i1ili.I00iiO = illOOo00lI;
/* 813 */                       o1lI0i1ili.I00iio = o1OIi1I00000oIO3;
/* 815 */                       VarHandle.storeStoreFence();
/* 818 */                       iloI0lOlll1.I00iio(o1lI0i1ili);
                                obj = o1lI0i1ili;
                            } else {
/* 799 */                       z = true;
                                obj = objI00O0i0ii7;
                            }
/* 851 */                   iOiO0o0oi.I0000Il00O((IllOOo00lI) obj, null, !((O1o1iOlI1) oI10i0IlI00000oOI.getValue()).I0000O, null, null, null, null, i1il1IIIo0.I00000oOI, iloI0lOlll1, 805306368, 506);
/* 854 */                   IloI0lOlll1 iloI0lOlll18 = iloI0lOlll1;
/* 855 */                   iloI0lOlll18.I0010I0i(z);
/* 864 */                   Bitmap bitmap = ((O1o1iOlI1) oI10i0IlI00000oOI.getValue()).I00000oIO;
/* 868 */                   if (bitmap == null) {
/* 873 */                       iloI0lOlll18.I00i01iIIliI(213472652);
/* 877 */                       iloI0lOlll18.I0010I0i(false);
/* 880 */                       o1o1io0oi0ol4 = o1o1io0oi0ol6;
                                iloI0lOlll13 = iloI0lOlll18;
                            } else {
/* 886 */                       iloI0lOlll18.I00i01iIIliI(213472653);
/* 889 */                       O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll3, 1.0f);
/* 897 */                       II10lo1oIo iI10lo1oIo = new II10lo1oIo(i4);
/* 900 */                       iI10lo1oIo.I00iiI = bitmap;
/* 902 */                       VarHandle.storeStoreFence();
/* 919 */                       iOl111l1l.I0000oI00(o1ooiI111iI0000oI00, null, null, null, null, iiioOl1O.I00000oOI(-305968925, iI10lo1oIo, iloI0lOlll18), iloI0lOlll18, 196614);
/* 922 */                       o1o1io0oi0ol4 = o1o1io0oi0ol6;
/* 934 */                       boolean zI000OOo1O6 = iloI0lOlll18.I000OOo1O(o1o1io0oi0ol4) | iloI0lOlll18.I000OOo1O(o1oIOiI11o0);
/* 935 */                       Object objI00O0i0ii8 = iloI0lOlll18.I00O0i0ii();
                                Object obj7 = objI00O0i0ii8;
/* 939 */                       if (zI000OOo1O6 || objI00O0i0ii8 == iOO0o0I1l) {
/* 946 */                           O1l110o o1l110o = new O1l110o(5);
/* 949 */                           o1l110o.I00iiI = o1o1io0oi0ol4;
/* 951 */                           o1l110o.I00iiO = o1oIOiI11o0;
/* 953 */                           VarHandle.storeStoreFence();
/* 956 */                           iloI0lOlll18.I00iio(o1l110o);
                                    obj7 = o1l110o;
                                }
/* 988 */                       iOiO0o0oi.I00000oIO((IllOOo00lI) obj7, null, !((O1o1iOlI1) oI10i0IlI00000oOI.getValue()).I0000O, null, null, null, null, null, i1il1IIIo0.I0000Il00O, iloI0lOlll1, 805306368, 506);
/* 991 */                       IloI0lOlll1 iloI0lOlll19 = iloI0lOlll1;
/* 993 */                       iloI0lOlll19.I0010I0i(false);
                                iloI0lOlll13 = iloI0lOlll19;
                            }
/* 1004 */                  if (((O1o1iOlI1) oI10i0IlI00000oOI.getValue()).I0000O) {
/* 1009 */                      iloI0lOlll13.I00i01iIIliI(214436381);
/* 1032 */                      OOO0iOio0oil.I00000oIO(Ol0iOOO0.I000lI(o1ooIo101ll3, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, iloI0lOlll1, 390, 58);
/* 1035 */                      IloI0lOlll1 iloI0lOlll110 = iloI0lOlll1;
/* 1036 */                      z2 = false;
/* 1037 */                      iloI0lOlll110.I0010I0i(false);
                                iloI0lOlll14 = iloI0lOlll110;
                            } else {
/* 1041 */                      z2 = false;
/* 1045 */                      iloI0lOlll13.I00i01iIIliI(214542091);
/* 1048 */                      iloI0lOlll13.I0010I0i(false);
                                iloI0lOlll14 = iloI0lOlll13;
                            }
/* 1057 */                  String str = ((O1o1iOlI1) oI10i0IlI00000oOI.getValue()).I0000oI00;
/* 1059 */                  if (str == null) {
/* 1064 */                      iloI0lOlll14.I00i01iIIliI(214581801);
/* 1067 */                      iloI0lOlll14.I0010I0i(z2);
/* 1070 */                      o1o1io0oi0ol5 = o1o1io0oi0ol4;
/* 1072 */                      r0 = z2;
/* 1073 */                      o1ooIo101ll = o1ooIo101ll3;
/* 1075 */                      oI10i0Il = oI10i0IlI00000oOI;
                                iloI0lOlll15 = iloI0lOlll14;
                            } else {
/* 1081 */                      iloI0lOlll14.I00i01iIIliI(214581802);
/* 1084 */                      OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 1157 */                      oI10i0Il = oI10i0IlI00000oOI;
/* 1159 */                      o1ooIo101ll = o1ooIo101ll3;
/* 1163 */                      o1o1io0oi0ol5 = o1o1io0oi0ol4;
/* 1165 */                      boolean z7 = z2;
/* 1167 */                      Oo0i1oIIoOO.I00000oOI(str, null, ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol0)).I00000oIO.I001i1O0Ol, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol0)).I00000oOI.I000l1, iloI0lOlll1, 0, 0, 131066);
/* 1170 */                      IloI0lOlll1 iloI0lOlll111 = iloI0lOlll1;
/* 1172 */                      iloI0lOlll111.I0010I0i(z7);
                                r0 = z7;
                                iloI0lOlll15 = iloI0lOlll111;
                            }
/* 1181 */                  Float f = ((O1o1iOlI1) oI10i0Il.getValue()).I0000Il00O;
/* 1183 */                  if (f == null) {
/* 1188 */                      iloI0lOlll15.I00i01iIIliI(214763182);
/* 1191 */                      iloI0lOlll15.I0010I0i(r0);
/* 1194 */                      o1ooIo101ll2 = o1ooIo101ll;
                            } else {
/* 1200 */                      iloI0lOlll15.I00i01iIIliI(214763183);
/* 1203 */                      float fFloatValue = f.floatValue();
/* 1207 */                      o1ooIo101ll2 = o1ooIo101ll;
/* 1211 */                      O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(o1ooIo101ll2, 1.0f);
/* 1217 */                      O1o1OOO o1o1OOO = new O1o1OOO(r0);
/* 1220 */                      o1o1OOO.I00iiI = fFloatValue;
/* 1222 */                      VarHandle.storeStoreFence();
/* 1240 */                      iOl111l1l.I0000oI00(o1ooiI111iI0000oI002, null, null, null, null, iiioOl1O.I00000oOI(-1314441318, o1o1OOO, iloI0lOlll15), iloI0lOlll15, 196614);
/* 1243 */                      iloI0lOlll15.I0010I0i(r0);
                            }
/* 1260 */                  if (((O1o1iOlI1) oI10i0Il.getValue()).I00000oOI.isEmpty()) {
/* 1312 */                      iloI0lOlll15.I00i01iIIliI(217535947);
/* 1315 */                      iloI0lOlll15.I0010I0i(r0);
                            } else {
/* 1265 */                      iloI0lOlll15.I00i01iIIliI(215760019);
/* 1270 */                      O1ooiI111i o1ooiI111iI0000oI003 = Ol0iOOO0.I0000oI00(o1ooIo101ll2, 1.0f);
/* 1278 */                      I0O1IiI i0O1IiI = new I0O1IiI(15);
/* 1283 */                      i0O1IiI.I00iiI = oI10i0Il;
/* 1285 */                      VarHandle.storeStoreFence();
/* 1302 */                      iOl111l1l.I0000oI00(o1ooiI111iI0000oI003, null, null, null, null, iiioOl1O.I00000oOI(450626942, i0O1IiI, iloI0lOlll15), iloI0lOlll15, 196614);
/* 1305 */                      iloI0lOlll15.I0010I0i(r0);
                            }
/* 1324 */                  lOO1OIO00.I00000oIO(iloI0lOlll15, Ol0iOOO0.I000lI(o1ooIo101ll2, 8.0f));
/* 1327 */                  iloI0lOlll15.I0010I0i(r0);
/* 1330 */                  z3 = true;
                            iloI0lOlll16 = iloI0lOlll15;
                        } else {
/* 505 */                   iloI0lOlll17.I00i01iIIliI(211613056);
/* 511 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00io1l, false);
/* 517 */                   int iHashCode4 = Long.hashCode(iloI0lOlll17.I00OI1);
/* 521 */                   OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll17.I000lI();
/* 525 */                   O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll17, ilIl1Io0lii1);
/* 529 */                   iloI0lOlll17.I00i0oil();
/* 534 */                   if (iloI0lOlll17.I00O10llo) {
/* 536 */                       iloI0lOlll17.I000l1(iloi111);
                            } else {
/* 540 */                       iloI0lOlll17.I00io1l();
                            }
/* 543 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll17, o1iOIl0o10I0000Il00O2);
/* 546 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll17, oO0lO0l0I000lI4);
/* 549 */                   IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll17, iOioOOi0I3, iloI0lOlll17);
/* 552 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll17, o1ooiI111iI0000Il00O4);
/* 555 */                   OlO1iIi1ol0 olO1iIi1ol02 = O1OoilIO.I00000oOI;
/* 565 */                   Oo0lloOiiIOI oo0lloOiiIOI = ((O1OoiOIi1ooi) iloI0lOlll17.I000iOII(olO1iIi1ol02)).I00000oOI.I000iOII;
/* 626 */                   o1o1io0oi0ol5 = o1o1io0oi0ol6;
/* 630 */                   z3 = true;
/* 634 */                   Oo0i1oIIoOO.I00000oOI("Download and initialize a model to start identifying images", null, ((O1OoiOIi1ooi) iloI0lOlll17.I000iOII(olO1iIi1ol02)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, OloOOIoO1ii1.I00000oIO(3), 0L, 0, false, 0, 0, null, oo0lloOiiIOI, iloI0lOlll1, 6, 0, 130042);
/* 637 */                   IloI0lOlll1 iloI0lOlll112 = iloI0lOlll1;
/* 640 */                   Oi010OO0.I001l0I00(iloI0lOlll112, true, false, false);
                            iloI0lOlll16 = iloI0lOlll112;
                        }
/* 1331 */              iloI0lOlll16.I0010I0i(z3);
/* 1334 */              iloI0lOlll16.I0010I0i(z3);
/* 1337 */              o1o1io0oi0ol2 = o1o1io0oi0ol5;
                        iloI0lOlll12 = iloI0lOlll16;
                    } else {
/* 1346 */              iloI0lOlll17.I00OilO00Il();
/* 1349 */              o1o1io0oi0ol2 = o1o1io0oi0ol;
                        iloI0lOlll12 = iloI0lOlll17;
                    }
/* 1351 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1355 */          if (oOloioIlI001IO000 != null) {
/* 1361 */              Ilo0lI ilo0lI = new Ilo0lI(28);
/* 1366 */              ilo0lI.I00iiO = o1ol100o0O;
/* 1368 */              ilo0lI.I00iiI = o1o1io0oi0ol2;
/* 1370 */              VarHandle.storeStoreFence();
/* 1373 */              oOloioIlI001IO000.I0000O = ilo0lI;
                    }
                }
            }
