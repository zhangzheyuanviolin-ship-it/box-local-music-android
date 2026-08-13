            package p000;

            import android.graphics.Bitmap;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class I0Il0o1i00 implements Function3 {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public OI10i0Il I00iiO;

                public I0Il0o1i00(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String strI00000oOI;
/* 3 */             int i = this.I00iOIl;
/* 5 */             Object obj4 = IOl11li.I00000oIO;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 11 */            int i2 = 2;
                    switch (i) {
                        case 0:
/* 424 */                   OI10i0Il oI10i0Il = this.I00iiI;
/* 426 */                   OI10i0Il oI10i0Il2 = this.I00iiO;
/* 430 */                   Il1ii01 il1ii01 = (Il1ii01) obj;
/* 434 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 440 */                   int iIntValue = ((Integer) obj3).intValue();
/* 446 */                   if ((iIntValue & 6) == 0) {
/* 466 */                       iIntValue |= (iIntValue & 8) == 0 ? iloI0lOlll1.I000II(il1ii01) : iloI0lOlll1.I000OOo1O(il1ii01) ? 4 : 2;
                            }
/* 467 */                   int i3 = iIntValue;
/* 484 */                   if (!iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 1014 */                      iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 492 */                       int iOrdinal = ((O1i0O00) oI10i0Il.getValue()).ordinal();
/* 499 */                       if (iOrdinal == 0) {
/* 556 */                           iloI0lOlll1.I00i01iIIliI(1600811771);
/* 559 */                           strI00000oOI = lOOoli.I00000oOI(R.string.mcp_server_auth_none, iloI0lOlll1);
/* 563 */                           iloI0lOlll1.I0010I0i(false);
                                } else if (iOrdinal == 1) {
/* 539 */                           iloI0lOlll1.I00i01iIIliI(1600815781);
/* 545 */                           strI00000oOI = lOOoli.I00000oOI(R.string.mcp_server_auth_request_header, iloI0lOlll1);
/* 549 */                           iloI0lOlll1.I0010I0i(false);
                                } else if (iOrdinal != 2) {
/* 508 */                           iloI0lOlll1.I00i01iIIliI(1600821627);
/* 511 */                           strI00000oOI = lOOoli.I00000oOI(R.string.mcp_server_auth_none, iloI0lOlll1);
/* 515 */                           iloI0lOlll1.I0010I0i(false);
                                } else {
/* 522 */                           iloI0lOlll1.I00i01iIIliI(1600819168);
/* 528 */                           strI00000oOI = lOOoli.I00000oOI(R.string.mcp_server_auth_oauth_wip, iloI0lOlll1);
/* 532 */                           iloI0lOlll1.I0010I0i(false);
                                }
/* 574 */                       O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(Il1ii01.I00000oOI(il1ii01, "PrimaryEditable"), 1.0f);
/* 578 */                       OOiIOoiOO oOiIOoiOO = O1OoilIO.I00000oOI;
/* 588 */                       Oo0lloOiiIOI oo0lloOiiIOI = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00000oOI.I000l1;
/* 592 */                       long jI0000oI00 = IOOl0iiliOl.I0000oI00(OIioo00l.I00111O, iloI0lOlll1);
/* 598 */                       long jI0000oI002 = IOOl0iiliOl.I0000oI00(OIioo00l.I001iOo1i0O, iloI0lOlll1);
/* 610 */                       long jI0000Il00O = IOOiio0i.I0000Il00O(OIioo00l.I0000Il00O, IOOl0iiliOl.I0000oI00(OIioo00l.I00000oOI, iloI0lOlll1));
/* 616 */                       long jI0000oI003 = IOOl0iiliOl.I0000oI00(OIioo00l.I000oI1ioi, iloI0lOlll1);
/* 620 */                       long j = IOOiio0i.I000lI;
/* 624 */                       long jI0000oI004 = IOOl0iiliOl.I0000oI00(OIioo00l.I00000oIO, iloI0lOlll1);
/* 630 */                       long jI0000oI005 = IOOl0iiliOl.I0000oI00(OIioo00l.I000o00OoI0I, iloI0lOlll1);
/* 642 */                       Oo0lOii10o10 oo0lOii10o10 = (Oo0lOii10o10) iloI0lOlll1.I000iOII(Oo0lOio.I00000oIO);
/* 646 */                       long jI0000oI006 = IOOl0iiliOl.I0000oI00(OIioo00l.I001i1O0Ol, iloI0lOlll1);
/* 652 */                       long jI0000oI007 = IOOl0iiliOl.I0000oI00(OIioo00l.I001lllioOl, iloI0lOlll1);
/* 664 */                       long jI0000Il00O2 = IOOiio0i.I0000Il00O(OIioo00l.I000OOo1O, IOOl0iiliOl.I0000oI00(OIioo00l.I000O01llI0, iloI0lOlll1));
/* 670 */                       long jI0000oI008 = IOOl0iiliOl.I0000oI00(OIioo00l.I0010I0i, iloI0lOlll1);
/* 676 */                       long jI0000oI009 = IOOl0iiliOl.I0000oI00(OIioo00l.I001IO000, iloI0lOlll1);
/* 682 */                       long jI0000oI0010 = IOOl0iiliOl.I0000oI00(OIioo00l.I001lIiIIo1O, iloI0lOlll1);
/* 694 */                       long jI0000Il00O3 = IOOiio0i.I0000Il00O(OIioo00l.I000II, IOOl0iiliOl.I0000oI00(OIioo00l.I0001Ioi1lo, iloI0lOlll1));
/* 700 */                       long jI0000oI0011 = IOOl0iiliOl.I0000oI00(OIioo00l.I00100o1O0lo, iloI0lOlll1);
/* 706 */                       long jI0000oI0012 = IOOl0iiliOl.I0000oI00(OIioo00l.I001i1lo1io, iloI0lOlll1);
/* 712 */                       long jI0000oI0013 = IOOl0iiliOl.I0000oI00(OIioo00l.I00II0Ol1O0l, iloI0lOlll1);
/* 724 */                       long jI0000Il00O4 = IOOiio0i.I0000Il00O(OIioo00l.I000lI, IOOl0iiliOl.I0000oI00(OIioo00l.I000l1, iloI0lOlll1));
/* 730 */                       long jI0000oI0014 = IOOl0iiliOl.I0000oI00(OIioo00l.I0010o, iloI0lOlll1);
/* 736 */                       long jI0000oI0015 = IOOl0iiliOl.I0000oI00(OIioo00l.I001IIilI0O, iloI0lOlll1);
/* 742 */                       long jI0000oI0016 = IOOl0iiliOl.I0000oI00(OIioo00l.I001l0I00, iloI0lOlll1);
/* 754 */                       long jI0000Il00O5 = IOOiio0i.I0000Il00O(OIioo00l.I0000oI00, IOOl0iiliOl.I0000oI00(OIioo00l.I0000O, iloI0lOlll1));
/* 760 */                       long jI0000oI0017 = IOOl0iiliOl.I0000oI00(OIioo00l.I00100l0, iloI0lOlll1);
/* 764 */                       IOOl0iI iOOl0iI = OIioo00l.I001lloI;
/* 766 */                       long jI0000oI0018 = IOOl0iiliOl.I0000oI00(iOOl0iI, iloI0lOlll1);
/* 770 */                       long jI0000oI0019 = IOOl0iiliOl.I0000oI00(iOOl0iI, iloI0lOlll1);
/* 774 */                       IOOl0iI iOOl0iI2 = OIioo00l.I000OiO;
/* 778 */                       long jI0000oI0020 = IOOl0iiliOl.I0000oI00(iOOl0iI2, iloI0lOlll1);
/* 782 */                       float f = OIioo00l.I000iOII;
/* 784 */                       long jI0000Il00O6 = IOOiio0i.I0000Il00O(f, jI0000oI0020);
/* 788 */                       long jI0000oI0021 = IOOl0iiliOl.I0000oI00(iOOl0iI, iloI0lOlll1);
/* 792 */                       long jI0000oI0022 = IOOl0iiliOl.I0000oI00(iOOl0iI, iloI0lOlll1);
/* 796 */                       long jI0000oI0023 = IOOl0iiliOl.I0000oI00(iOOl0iI, iloI0lOlll1);
/* 804 */                       long jI0000Il00O7 = IOOiio0i.I0000Il00O(f, IOOl0iiliOl.I0000oI00(iOOl0iI2, iloI0lOlll1));
/* 808 */                       long jI0000oI0024 = IOOl0iiliOl.I0000oI00(iOOl0iI, iloI0lOlll1);
/* 812 */                       long jI0000oI0025 = IOOl0iiliOl.I0000oI00(iOOl0iI, iloI0lOlll1);
/* 816 */                       long jI0000oI0026 = IOOl0iiliOl.I0000oI00(iOOl0iI, iloI0lOlll1);
/* 824 */                       long jI0000Il00O8 = IOOiio0i.I0000Il00O(f, IOOl0iiliOl.I0000oI00(iOOl0iI2, iloI0lOlll1));
/* 828 */                       long jI0000oI0027 = IOOl0iiliOl.I0000oI00(iOOl0iI, iloI0lOlll1);
/* 832 */                       long j2 = IOOiio0i.I000o00OoI0I;
/* 858 */                       OloooOlO10oI oloooOlO10oII00000oOI = iolOOiI.I000lI(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00000oIO, iloI0lOlll1).I00000oOI(jI0000oI00, jI0000oI002, jI0000Il00O, jI0000oI003, j, j, j, j, jI0000oI004, jI0000oI005, oo0lOii10o10, jI0000oI006, jI0000oI007, jI0000Il00O2, jI0000oI008, jI0000oI009, jI0000oI0010, jI0000Il00O3, jI0000oI0011, jI0000oI0012, jI0000oI0013, jI0000Il00O4, jI0000oI0014, jI0000oI0015, jI0000oI0016, jI0000Il00O5, jI0000oI0017, jI0000oI0018, jI0000oI0019, jI0000Il00O6, jI0000oI0021, j2, j2, j2, j2, jI0000oI0022, jI0000oI0023, jI0000Il00O7, jI0000oI0024, jI0000oI0025, jI0000oI0026, jI0000Il00O8, jI0000oI0027);
/* 862 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 866 */                       if (objI00O0i0ii == obj4) {
/* 871 */                           objI00O0i0ii = new I01OoIoio00O(5);
/* 874 */                           iloI0lOlll1.I00iio(objI00O0i0ii);
                                }
/* 878 */                       Function1 function1 = (Function1) objI00O0i0ii;
/* 882 */                       I0Il1IoilolI i0Il1IoilolI = new I0Il1IoilolI(i2);
/* 885 */                       i0Il1IoilolI.I00iiI = oI10i0Il2;
/* 887 */                       VarHandle.storeStoreFence();
/* 932 */                       l1liIOil0i1o.I00000oOI(strI00000oOI, function1, o1ooiI111iI0000oI00, false, true, oo0lloOiiIOI, null, null, null, iiioOl1O.I00000oOI(756383109, i0Il1IoilolI, iloI0lOlll1), null, false, null, null, null, false, 0, 0, null, oloooOlO10oII00000oOI, iloI0lOlll1, 805330992, 0, 4193736);
/* 941 */                       boolean zBooleanValue = ((Boolean) oI10i0Il2.getValue()).booleanValue();
/* 945 */                       Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                                Object obj5 = objI00O0i0ii2;
/* 949 */                       if (objI00O0i0ii2 == obj4) {
/* 953 */                           I0Il0000oli i0Il0000oli = new I0Il0000oli(2);
/* 956 */                           i0Il0000oli.I00iiI = oI10i0Il2;
/* 958 */                           VarHandle.storeStoreFence();
/* 961 */                           iloI0lOlll1.I00iio(i0Il0000oli);
                                    obj5 = i0Il0000oli;
                                }
/* 970 */                       I0Il0o1i00 i0Il0o1i00 = new I0Il0o1i00(1);
/* 973 */                       i0Il0o1i00.I00iiI = oI10i0Il;
/* 975 */                       i0Il0o1i00.I00iiO = oI10i0Il2;
/* 977 */                       VarHandle.storeStoreFence();
/* 1008 */                      il1ii01.I00000oIO(zBooleanValue, (IllOOo00lI) obj5, null, null, false, null, 0L, 0.0f, iiioOl1O.I00000oOI(1010973644, i0Il0o1i00, iloI0lOlll1), iloI0lOlll1, 48, 6 | ((i3 << 3) & 112));
                                break;
                            }
                        case 1:
/* 260 */                   OI10i0Il oI10i0Il3 = this.I00iiI;
/* 262 */                   OI10i0Il oI10i0Il4 = this.I00iiO;
/* 270 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj2;
/* 276 */                   int iIntValue2 = ((Integer) obj3).intValue();
/* 292 */                   if (!iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
/* 420 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 294 */                       Object objI00O0i0ii3 = iloI0lOlll12.I00O0i0ii();
                                Object obj6 = objI00O0i0ii3;
/* 298 */                       if (objI00O0i0ii3 == obj4) {
/* 302 */                           I0IlOO10Ii1 i0IlOO10Ii1 = new I0IlOO10Ii1(0);
/* 305 */                           i0IlOO10Ii1.I00iiI = oI10i0Il3;
/* 307 */                           i0IlOO10Ii1.I00iiO = oI10i0Il4;
/* 309 */                           VarHandle.storeStoreFence();
/* 312 */                           iloI0lOlll12.I00iio(i0IlOO10Ii1);
                                    obj6 = i0IlOO10Ii1;
                                }
/* 331 */                       iOIliO1I1i.I00000oOI(i1O11iOo0.I00000oOI, (IllOOo00lI) obj6, null, null, false, null, null, iloI0lOlll12, 54, 508);
/* 336 */                       Object objI00O0i0ii4 = iloI0lOlll12.I00O0i0ii();
                                Object obj7 = objI00O0i0ii4;
/* 340 */                       if (objI00O0i0ii4 == obj4) {
/* 344 */                           I0IlOO10Ii1 i0IlOO10Ii12 = new I0IlOO10Ii1(1);
/* 347 */                           i0IlOO10Ii12.I00iiI = oI10i0Il3;
/* 349 */                           i0IlOO10Ii12.I00iiO = oI10i0Il4;
/* 351 */                           VarHandle.storeStoreFence();
/* 354 */                           iloI0lOlll12.I00iio(i0IlOO10Ii12);
                                    obj7 = i0IlOO10Ii12;
                                }
/* 373 */                       iOIliO1I1i.I00000oOI(i1O11iOo0.I0000Il00O, (IllOOo00lI) obj7, null, null, false, null, null, iloI0lOlll12, 54, 508);
/* 376 */                       Object objI00O0i0ii5 = iloI0lOlll12.I00O0i0ii();
                                Object obj8 = objI00O0i0ii5;
/* 380 */                       if (objI00O0i0ii5 == obj4) {
/* 384 */                           I0IlOO10Ii1 i0IlOO10Ii13 = new I0IlOO10Ii1(2);
/* 387 */                           i0IlOO10Ii13.I00iiI = oI10i0Il3;
/* 389 */                           i0IlOO10Ii13.I00iiO = oI10i0Il4;
/* 391 */                           VarHandle.storeStoreFence();
/* 394 */                           iloI0lOlll12.I00iio(i0IlOO10Ii13);
                                    obj8 = i0IlOO10Ii13;
                                }
/* 414 */                       iOIliO1I1i.I00000oOI(i1O11iOo0.I0000O, (IllOOo00lI) obj8, null, null, false, null, null, iloI0lOlll12, 196662, 476);
                                break;
                            }
                        default:
/* 17 */                    OI10i0Il oI10i0Il5 = this.I00iiI;
/* 19 */                    OI10i0Il oI10i0Il6 = this.I00iiO;
/* 27 */                    IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj2;
/* 33 */                    int iIntValue3 = ((Integer) obj3).intValue();
/* 49 */                    if (!iloI0lOlll13.I00OIl(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
/* 256 */                       iloI0lOlll13.I00OilO00Il();
                                break;
                            } else {
/* 57 */                        boolean zBooleanValue2 = ((Boolean) oI10i0Il5.getValue()).booleanValue();
/* 61 */                        O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 65 */                        if (!zBooleanValue2) {
/* 169 */                           iloI0lOlll13.I00i01iIIliI(1824183670);
/* 184 */                           IoOoiI1II00i.I00000oIO(iOOl1liI01io.I00000oIO(), null, null, 0L, iloI0lOlll13, 48, 12);
/* 191 */                           lOO1OIO00.I00000oIO(iloI0lOlll13, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 8.0f));
/* 247 */                           Oo0i1oIIoOO.I00000oOI(((Bitmap) oI10i0Il6.getValue()) != null ? "Remove Again" : "Remove Background", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll13, 0, 0, 262142);
/* 252 */                           iloI0lOlll13.I0010I0i(false);
                                    break;
                                } else {
/* 70 */                            iloI0lOlll13.I00i01iIIliI(1823796914);
/* 105 */                           OOO0iOio0oil.I00000oIO(Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00000oOI, 2.0f, 0L, 0, 0.0f, iloI0lOlll13, 390, 56);
/* 114 */                           lOO1OIO00.I00000oIO(iloI0lOlll13, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 8.0f));
/* 157 */                           Oo0i1oIIoOO.I00000oOI("Removing background…", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll13, 6, 0, 262142);
/* 162 */                           iloI0lOlll13.I0010I0i(false);
                                    break;
                                }
                            }
                    }
/* 259 */           return ooiIlOl1iI;
                }
            }
