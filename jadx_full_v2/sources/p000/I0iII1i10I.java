            package p000;

            import android.graphics.Bitmap;
            import com.google.ai.edge.gallery.common.SkillTryOutChip;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class I0iII1i10I implements Function3 {
                public final int I00iOIl;
                public Object I00iiI;

                public I0iII1i10I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:255:0x083c  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long j;
/* 7 */             int i = this.I00iOIl;
/* 9 */             int i2 = 12;
/* 19 */            Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 21 */            IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 23 */            O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 30 */            boolean z = true;
/* 31 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 34 */            Object obj4 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 2549 */                  SkillTryOutChip skillTryOutChip = (SkillTryOutChip) obj4;
/* 2555 */                  IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 2559 */                  int iIntValue = ((Integer) obj3).intValue();
/* 2573 */                  if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 2595 */                      IoOoiI1II00i.I00000oIO(skillTryOutChip.getIcon(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 20.0f), 0L, iloI0lOlll1, 432, 8);
/* 2604 */                      lOO1OIO00.I00000oIO(iloI0lOlll1, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 4.0f));
/* 2650 */                      Oo0i1oIIoOO.I00000oOI(skillTryOutChip.getLabel(), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll1, 0, 0, 262142);
                            } else {
/* 2654 */                      iloI0lOlll1.I00OilO00Il();
                            }
/* 2657 */                  return ooiIlOl1iI;
                        case 1:
/* 2323 */                  II0IOO1i iI0IOO1i = (II0IOO1i) obj4;
/* 2329 */                  IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj2;
/* 2333 */                  int iIntValue2 = ((Integer) obj3).intValue();
/* 2349 */                  if (iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
/* 2351 */                      II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 2355 */                      I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(8.0f);
/* 2371 */                      O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(O1ooIo101ll.I00000oIO, 0.0f, 0.0f, 0.0f, 16.0f, 7);
/* 2375 */                      OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(i1IioII0000oI00, iI0O000iIl, iloI0lOlll12, 54);
/* 2381 */                      int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 2385 */                      OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 2389 */                      O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI000OiO);
/* 2395 */                      IOl0oi0lOl1.I000lI.getClass();
/* 2398 */                      iloI0lOlll12.I00i0oil();
/* 2403 */                      if (iloI0lOlll12.I00O10llo) {
/* 2405 */                          iloI0lOlll12.I000l1(iloi111);
                                } else {
/* 2409 */                          iloI0lOlll12.I00io1l();
                                }
/* 2414 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll12, oiI1iiIl1Oi0I00000oIO);
/* 2419 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll12, oO0lO0l0I000lI);
/* 2428 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll12, Integer.valueOf(iHashCode));
/* 2431 */                      li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 2436 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 2439 */                      boolean zI000OOo1O = iloI0lOlll12.I000OOo1O(iI0IOO1i);
/* 2443 */                      Object objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
                                Object obj5 = objI00O0i0ii;
/* 2447 */                      if (zI000OOo1O || objI00O0i0ii == iOO0o0I1l) {
/* 2453 */                          II01011ioIl iI01011ioIl = new II01011ioIl(false ? 1 : 0);
/* 2456 */                          iI01011ioIl.I00iiI = iI0IOO1i;
/* 2458 */                          VarHandle.storeStoreFence();
/* 2461 */                          iloI0lOlll12.I00iio(iI01011ioIl);
                                    obj5 = iI01011ioIl;
                                }
/* 2468 */                      OIo1i1 oIo1i1 = OollloolI.I00000oIO;
/* 2488 */                      iOiO0o0oi.I0000Il00O((IllOOo00lI) obj5, null, false, null, null, null, oIo1i1, i1OOl00lO.I0000O, iloI0lOlll12, 817889280, 382);
/* 2491 */                      boolean zI000OOo1O2 = iloI0lOlll12.I000OOo1O(iI0IOO1i);
/* 2495 */                      Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                                Object obj6 = objI00O0i0ii2;
/* 2499 */                      if (zI000OOo1O2 || objI00O0i0ii2 == iOO0o0I1l) {
/* 2505 */                          II01011ioIl iI01011ioIl2 = new II01011ioIl(true ? 1 : 0);
/* 2508 */                          iI01011ioIl2.I00iiI = iI0IOO1i;
/* 2510 */                          VarHandle.storeStoreFence();
/* 2513 */                          iloI0lOlll12.I00iio(iI01011ioIl2);
                                    obj6 = iI01011ioIl2;
                                }
/* 2538 */                      iOiO0o0oi.I0000Il00O((IllOOo00lI) obj6, null, false, null, null, null, oIo1i1, i1OOl00lO.I0000oI00, iloI0lOlll12, 817889280, 382);
/* 2541 */                      iloI0lOlll12.I0010I0i(true);
                            } else {
/* 2545 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 2548 */                  return ooiIlOl1iI;
                        case 2:
/* 2281 */                  OIo1Oi1l1lI oIo1Oi1l1lI = (OIo1Oi1l1lI) obj4;
/* 2287 */                  IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj2;
/* 2291 */                  int iIntValue3 = ((Integer) obj3).intValue();
/* 2305 */                  if (iloI0lOlll13.I00OIl(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
/* 2315 */                      lOO1OIO00.I00000oIO(iloI0lOlll13, Ol0iOOO0.I000II(o1ooIo101ll, oIo1Oi1l1lI.I00000oIO()));
                            } else {
/* 2319 */                      iloI0lOlll13.I00OilO00Il();
                            }
/* 2322 */                  return ooiIlOl1iI;
                        case 3:
/* 2268 */                  I1iO0OloOl i1iO0OloOl = new I1iO0OloOl(4);
/* 2271 */                  i1iO0OloOl.I00iiI = obj3;
/* 2273 */                  i1iO0OloOl.I00iiO = (IIIII1OI1) obj4;
/* 2275 */                  i1iO0OloOl.I00iio = (OiiIl0O1I11) obj;
/* 2277 */                  VarHandle.storeStoreFence();
/* 2280 */                  return i1iO0OloOl;
                        case 4:
/* 2257 */                  ((O0l0IlolloIO) obj4).invoke((Throwable) obj);
/* 2260 */                  return ooiIlOl1iI;
                        case 5:
/* 2221 */                  IloI0lOlll1 iloI0lOlll14 = (IloI0lOlll1) obj2;
/* 2226 */                  ((Integer) obj3).getClass();
/* 2247 */                  OoOo1IIiiO.I00000oIO(((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00100l0, ((OIooi1iOiOol) obj4).I000II(), null, iloI0lOlll14, 0);
/* 2250 */                  return ooiIlOl1iI;
                        case 6:
/* 2065 */                  Ii000lllIiI ii000lllIiI = (Ii000lllIiI) obj4;
/* 2069 */                  int iIntValue4 = ((Integer) obj).intValue();
/* 2077 */                  int iIntValue5 = ((Integer) obj2).intValue();
/* 2083 */                  boolean zBooleanValue = ((Boolean) obj3).booleanValue();
/* 2087 */                  if (!zBooleanValue) {
/* 2092 */                      iIntValue4 = ii000lllIiI.I00ol1.I000O01llI0(iIntValue4);
                            }
/* 2096 */                  if (!zBooleanValue) {
/* 2101 */                      iIntValue5 = ii000lllIiI.I00ol1.I000O01llI0(iIntValue5);
                            }
/* 2107 */                  if (ii000lllIiI.I00oO101o) {
/* 2113 */                      long j2 = ii000lllIiI.I00oI0i.I00000oOI;
/* 2115 */                      int i3 = Oo0lI00l.I0000Il00O;
/* 2122 */                      if (iIntValue4 != ((int) (j2 >> 32)) || iIntValue5 != ((int) (j2 & 4294967295L))) {
/* 2138 */                          if (Math.min(iIntValue4, iIntValue5) < 0 || Math.max(iIntValue4, iIntValue5) > ii000lllIiI.I00oI0i.I00000oIO.I00iiI.length()) {
/* 2199 */                              Oo0IOoOi01 oo0IOoOi01 = ii000lllIiI.I00olI;
/* 2201 */                              oo0IOoOi01.I001IIilI0O(false);
/* 2206 */                              oo0IOoOi01.I0010I0i(Io11Oo11oO.I00iOIl);
/* 2109 */                              z = false;
                                    } else {
/* 2156 */                              if (zBooleanValue || iIntValue4 == iIntValue5) {
/* 2167 */                                  Oo0IOoOi01 oo0IOoOi012 = ii000lllIiI.I00olI;
/* 2169 */                                  oo0IOoOi012.I001IIilI0O(false);
/* 2174 */                                  oo0IOoOi012.I0010I0i(Io11Oo11oO.I00iOIl);
                                        } else {
/* 2163 */                                  ii000lllIiI.I00olI.I0000oI00(true);
                                        }
/* 2195 */                              ii000lllIiI.I00oII.I001IO000.invoke(new Oo0OI01Il(ii000lllIiI.I00oI0i.I00000oIO, lOliOi0Oi.I00000oIO(iIntValue4, iIntValue5), (Oo0lI00l) null));
                                    }
                                }
                            } else {
/* 2109 */                      z = false;
                            }
/* 2210 */                  return Boolean.valueOf(z);
                        case 7:
/* 2061 */                  ((Function1) obj4).invoke(OIOlIiiioi.I00000oIO(((OO1il00lI) obj2).I0000Il00O));
/* 2064 */                  return ooiIlOl1iI;
                        case 8:
/* 1693 */                  OOloilI1OO oOloilI1OO = (OOloilI1OO) obj4;
/* 1699 */                  IloI0lOlll1 iloI0lOlll15 = (IloI0lOlll1) obj2;
/* 1703 */                  int iIntValue6 = ((Integer) obj3).intValue();
/* 1719 */                  if (iloI0lOlll15.I00OIl(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
/* 1721 */                      O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(o1ooIo101ll, 12.0f);
/* 1731 */                      OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, i1O01oOIoI0I.I00lli11, iloI0lOlll15, 48);
/* 1737 */                      int iHashCode2 = Long.hashCode(iloI0lOlll15.I00OI1);
/* 1741 */                      OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll15.I000lI();
/* 1745 */                      O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll15, o1ooiI111iI0001Ioi1lo);
/* 1751 */                      IOl0oi0lOl1.I000lI.getClass();
/* 1754 */                      iloI0lOlll15.I00i0oil();
/* 1759 */                      if (iloI0lOlll15.I00O10llo) {
/* 1761 */                          iloI0lOlll15.I000l1(iloi111);
                                } else {
/* 1765 */                          iloI0lOlll15.I00io1l();
                                }
/* 1768 */                      IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 1770 */                      li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll15, oiI1iiIl1Oi0I00000oIO2);
/* 1773 */                      IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 1775 */                      li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll15, oO0lO0l0I000lI2);
/* 1778 */                      Integer numValueOf = Integer.valueOf(iHashCode2);
/* 1782 */                      IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 1784 */                      li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll15, numValueOf);
/* 1787 */                      li01Ooiio01.I00000oOI(iloI0lOlll15);
/* 1790 */                      IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 1792 */                      li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll15, o1ooiI111iI0000Il00O2);
/* 1795 */                      Bitmap bitmap = oOloilI1OO.I00000oIO;
/* 1797 */                      String str = oOloilI1OO.I00000oOI;
/* 1828 */                      ioO0II.I00000oOI(new I0oO00o(bitmap), null, ii0OOOOo0i.I00000oIO(Ol0iOOO0.I000lI(o1ooIo101ll, 64.0f), OiI11O1i1.I00000oIO), IOoOIiOl1llI.I00000oIO, iloI0lOlll15, 24624, 232);
/* 1835 */                      lOO1OIO00.I00000oIO(iloI0lOlll15, Ol0iOOO0.I000lI(o1ooIo101ll, 12.0f));
/* 1842 */                      IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll15, 0);
/* 1848 */                      int iHashCode3 = Long.hashCode(iloI0lOlll15.I00OI1);
/* 1852 */                      OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll15.I000lI();
/* 1856 */                      O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll15, o1ooIo101ll);
/* 1860 */                      iloI0lOlll15.I00i0oil();
/* 1865 */                      if (iloI0lOlll15.I00O10llo) {
/* 1867 */                          iloI0lOlll15.I000l1(iloi111);
                                } else {
/* 1871 */                          iloI0lOlll15.I00io1l();
                                }
/* 1874 */                      li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll15, iOOlo1O01OI00000oIO);
/* 1877 */                      li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll15, oO0lO0l0I000lI3);
/* 1880 */                      IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll15, iOioOOi0I3, iloI0lOlll15);
/* 1883 */                      li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll15, o1ooiI111iI0000Il00O3);
/* 1893 */                      String str2 = str == null ? "Unknown" : str;
/* 1895 */                      OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 1905 */                      Oo0lloOiiIOI oo0lloOiiIOI = ((O1OoiOIi1ooi) iloI0lOlll15.I000iOII(olO1iIi1ol0)).I00000oOI.I000O01llI0;
/* 1907 */                      if (str != null) {
/* 1912 */                          iloI0lOlll15.I00i01iIIliI(-2118225533);
/* 1923 */                          j = ((O1OoiOIi1ooi) iloI0lOlll15.I000iOII(olO1iIi1ol0)).I00000oIO.I00000oIO;
/* 1925 */                          iloI0lOlll15.I0010I0i(false);
                                } else {
/* 1934 */                          iloI0lOlll15.I00i01iIIliI(-2118223380);
/* 1945 */                          j = ((O1OoiOIi1ooi) iloI0lOlll15.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o;
/* 1947 */                          iloI0lOlll15.I0010I0i(false);
                                }
/* 1990 */                      Oo0i1oIIoOO.I00000oOI(str2, null, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, oo0lloOiiIOI, iloI0lOlll15, 0, 0, 131066);
/* 2031 */                      Oo0i1oIIoOO.I00000oOI(IIlIOloOOO.I00100l0("match ", (int) (oOloilI1OO.I0000Il00O * 100.0f), "%"), null, ((O1OoiOIi1ooi) iloI0lOlll15.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll15.I000iOII(olO1iIi1ol0)).I00000oOI.I000l1, iloI0lOlll15, 0, 0, 131066);
/* 2034 */                      iloI0lOlll15.I0010I0i(true);
/* 2037 */                      iloI0lOlll15.I0010I0i(true);
                            } else {
/* 2041 */                      iloI0lOlll15.I00OilO00Il();
                            }
/* 2044 */                  return ooiIlOl1iI;
                        case 9:
/* 1612 */                  OI1OIlllll0 oI1OIlllll0 = (OI1OIlllll0) obj4;
/* 1615 */                  II1oilIoOO iI1oilIoOO = (II1oilIoOO) obj;
/* 1619 */                  IloI0lOlll1 iloI0lOlll16 = (IloI0lOlll1) obj2;
/* 1624 */                  int iIntValue7 = ((Integer) obj3).intValue();
/* 1630 */                  if ((iIntValue7 & 6) == 0) {
/* 1639 */                      iIntValue7 |= iloI0lOlll16.I000II(iI1oilIoOO) ? 4 : 2;
                            }
/* 1654 */                  if (!iloI0lOlll16.I00OIl(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
/* 1689 */                      iloI0lOlll16.I00OilO00Il();
                            } else if (oI1OIlllll0 != null) {
/* 1661 */                      iloI0lOlll16.I00i01iIIliI(752496690);
/* 1672 */                      Iloo0ilo.I00II0Ol1O0l(oI1OIlllll0, false, false, iI1oilIoOO.I00000oIO(), iloI0lOlll16, 432);
/* 1675 */                      iloI0lOlll16.I0010I0i(false);
                            } else {
/* 1682 */                      iloI0lOlll16.I00i01iIIliI(752813820);
/* 1685 */                      iloI0lOlll16.I0010I0i(false);
                            }
/* 1692 */                  return ooiIlOl1iI;
                        case 10:
/* 1371 */                  OI1O101 oi1o101 = (OI1O101) obj4;
/* 1377 */                  IloI0lOlll1 iloI0lOlll17 = (IloI0lOlll1) obj2;
/* 1381 */                  int iIntValue8 = ((Integer) obj3).intValue();
/* 1395 */                  if (iloI0lOlll17.I00OIl(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
/* 1397 */                      O1ooiI111i o1ooiI111iI0001Ioi1lo2 = iO01II.I0001Ioi1lo(o1ooIo101ll, 12.0f);
/* 1410 */                      IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(6.0f), i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll17, 6);
/* 1416 */                      int iHashCode4 = Long.hashCode(iloI0lOlll17.I00OI1);
/* 1420 */                      OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll17.I000lI();
/* 1424 */                      O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll17, o1ooiI111iI0001Ioi1lo2);
/* 1430 */                      IOl0oi0lOl1.I000lI.getClass();
/* 1433 */                      iloI0lOlll17.I00i0oil();
/* 1438 */                      if (iloI0lOlll17.I00O10llo) {
/* 1440 */                          iloI0lOlll17.I000l1(iloi111);
                                } else {
/* 1444 */                          iloI0lOlll17.I00io1l();
                                }
/* 1449 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll17, iOOlo1O01OI00000oIO2);
/* 1454 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll17, oO0lO0l0I000lI4);
/* 1463 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll17, Integer.valueOf(iHashCode4));
/* 1466 */                      li01Ooiio01.I00000oOI(iloI0lOlll17);
/* 1471 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll17, o1ooiI111iI0000Il00O4);
/* 1474 */                      IoiOolO1iOo ioiOolO1iOo = oi1o101.I00iiO;
/* 1476 */                      OlO1iIi1ol0 olO1iIi1ol02 = O1OoilIO.I00000oOI;
/* 1506 */                      IoOoiI1II00i.I00000oIO(ioiOolO1iOo, null, Ol0iOOO0.I000lI(o1ooIo101ll, 24.0f), ((O1OoiOIi1ooi) iloI0lOlll17.I000iOII(olO1iIi1ol02)).I00000oIO.I00000oIO, iloI0lOlll17, 432, 0);
/* 1562 */                      Oo0i1oIIoOO.I00000oOI(oi1o101.I00iOIl, null, 0L, null, 0L, null, IlilIIiIiO.I00l0I0l0lO1, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll17.I000iOII(olO1iIi1ol02)).I00000oOI.I000lI, iloI0lOlll17, 1572864, 0, 131006);
/* 1600 */                      Oo0i1oIIoOO.I00000oOI(oi1o101.I00iiI, null, ((O1OoiOIi1ooi) iloI0lOlll17.I000iOII(olO1iIi1ol02)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll17.I000iOII(olO1iIi1ol02)).I00000oOI.I000l1, iloI0lOlll17, 0, 0, 131066);
/* 1603 */                      iloI0lOlll17.I0010I0i(true);
                            } else {
/* 1607 */                      iloI0lOlll17.I00OilO00Il();
                            }
/* 1610 */                  return ooiIlOl1iI;
                        case 11:
/* 1316 */                  Oloi1OI oloi1OI = (Oloi1OI) obj4;
/* 1318 */                  Oi1O00I1 oi1O00I1 = (Oi1O00I1) obj;
/* 1322 */                  IloI0lOlll1 iloI0lOlll18 = (IloI0lOlll1) obj2;
/* 1326 */                  int iIntValue9 = ((Integer) obj3).intValue();
/* 1332 */                  if ((iIntValue9 & 6) == 0) {
/* 1341 */                      iIntValue9 |= iloI0lOlll18.I000II(oi1O00I1) ? 4 : 2;
                            }
/* 1356 */                  if (iloI0lOlll18.I00OIl(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
/* 1363 */                      l1I011i1o1I.I00000oIO(oi1O00I1, oloi1OI.I00000oIO, null, iloI0lOlll18, iIntValue9 & 14);
                            } else {
/* 1367 */                      iloI0lOlll18.I00OilO00Il();
                            }
/* 1370 */                  return ooiIlOl1iI;
                        case 12:
/* 1261 */                  Oloi1Ilio oloi1Ilio = (Oloi1Ilio) obj4;
/* 1263 */                  Oi1O00I1 oi1O00I12 = (Oi1O00I1) obj;
/* 1267 */                  IloI0lOlll1 iloI0lOlll19 = (IloI0lOlll1) obj2;
/* 1271 */                  int iIntValue10 = ((Integer) obj3).intValue();
/* 1277 */                  if ((iIntValue10 & 6) == 0) {
/* 1286 */                      iIntValue10 |= iloI0lOlll19.I000II(oi1O00I12) ? 4 : 2;
                            }
/* 1301 */                  if (iloI0lOlll19.I00OIl(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
/* 1308 */                      l1I011i1o1I.I00000oIO(oi1O00I12, oloi1Ilio.I00000oIO, null, iloI0lOlll19, iIntValue10 & 14);
                            } else {
/* 1312 */                      iloI0lOlll19.I00OilO00Il();
                            }
/* 1315 */                  return ooiIlOl1iI;
                        case 13:
/* 1200 */                  OI0IlliOIlO oI0IlliOIlO = (OI0IlliOIlO) obj4;
/* 1204 */                  IloI0lOlll1 iloI0lOlll110 = (IloI0lOlll1) obj2;
/* 1208 */                  int iIntValue11 = ((Integer) obj3).intValue();
/* 1214 */                  if ((iIntValue11 & 6) == 0) {
/* 1232 */                      iIntValue11 |= (iIntValue11 & 8) == 0 ? iloI0lOlll110.I000II(obj) : iloI0lOlll110.I000OOo1O(obj) ? 4 : 2;
                            }
/* 1247 */                  if (iloI0lOlll110.I00OIl(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
/* 1253 */                      iloI0lOlll110.I00IOO(oI0IlliOIlO, iloI0lOlll110.I000lI(), obj, false);
                            } else {
/* 1257 */                      iloI0lOlll110.I00OilO00Il();
                            }
/* 1260 */                  return ooiIlOl1iI;
                        case 14:
/* 1179 */                  OI1I0OoOl oI1I0OoOl = (OI1I0OoOl) obj4;
/* 1193 */                  OI1I0OoOl.I000OOo1O.set(oI1I0OoOl, null);
/* 1196 */                  oI1I0OoOl.I00000oOI(null);
/* 1199 */                  return ooiIlOl1iI;
                        case 15:
/* 1139 */                  IlliIl1l11O illiIl1l11O = (IlliIl1l11O) obj4;
/* 1145 */                  IloI0lOlll1 iloI0lOlll111 = (IloI0lOlll1) obj2;
/* 1149 */                  int iIntValue12 = ((Integer) obj3).intValue();
/* 1165 */                  if (iloI0lOlll111.I00OIl(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
/* 1171 */                      illiIl1l11O.invoke(iloI0lOlll111, 0);
                            } else {
/* 1175 */                      iloI0lOlll111.I00OilO00Il();
                            }
/* 1178 */                  return ooiIlOl1iI;
                        case 16:
/* 1076 */                  OOio00 oOio00 = (OOio00) obj4;
/* 1082 */                  IloI0lOlll1 iloI0lOlll112 = (IloI0lOlll1) obj2;
/* 1086 */                  int iIntValue13 = ((Integer) obj3).intValue();
/* 1102 */                  if (iloI0lOlll112.I00OIl(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
/* 1115 */                      Iterator it = IOOi0Ool1i.I00i01iIIliI(oOio00.I0000O, 4).iterator();
/* 1123 */                      while (it.hasNext()) {
/* 1131 */                          iO0iil1loOI0.I000OOo1O((Oi10ooi) it.next(), iloI0lOlll112, 0);
                                }
                            } else {
/* 1135 */                      iloI0lOlll112.I00OilO00Il();
                            }
/* 1138 */                  return ooiIlOl1iI;
                        case 17:
/* 1007 */                  OiIil1il oiIil1il = (OiIil1il) obj4;
/* 1009 */                  OI1llOooOl1 oI1llOooOl1 = (OI1llOooOl1) obj;
/* 1013 */                  IloI0lOlll1 iloI0lOlll113 = (IloI0lOlll1) obj2;
/* 1017 */                  int iIntValue14 = ((Integer) obj3).intValue();
/* 1023 */                  if ((iIntValue14 & 6) == 0) {
/* 1032 */                      iIntValue14 |= iloI0lOlll113.I000II(oI1llOooOl1) ? 4 : 2;
                            }
/* 1045 */                  if (iloI0lOlll113.I00OIl(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
/* 1047 */                      Object obj7 = oI1llOooOl1.I00000oOI;
/* 1051 */                      I1loOO0IOiI i1loOO0IOiI = new I1loOO0IOiI(true ? 1 : 0);
/* 1054 */                      i1loOO0IOiI.I00iiI = oI1llOooOl1;
/* 1056 */                      VarHandle.storeStoreFence();
/* 1068 */                      oiIil1il.I00000oOI(obj7, iiioOl1O.I00000oOI(121262920, i1loOO0IOiI, iloI0lOlll113), iloI0lOlll113, 48);
                            } else {
/* 1072 */                      iloI0lOlll113.I00OilO00Il();
                            }
/* 1075 */                  return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 837 */                   Ol1o1llOII ol1o1llOII = (Ol1o1llOII) obj4;
/* 839 */                   OI1llOooOl1 oI1llOooOl12 = (OI1llOooOl1) obj;
/* 843 */                   IloI0lOlll1 iloI0lOlll114 = (IloI0lOlll1) obj2;
/* 847 */                   int iIntValue15 = ((Integer) obj3).intValue();
/* 853 */                   if ((iIntValue15 & 6) == 0) {
/* 866 */                       iIntValue15 |= iloI0lOlll114.I000II(oI1llOooOl12) ? 4 : 2;
                            }
/* 882 */                   if (iloI0lOlll114.I00OIl(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
/* 884 */                       Object obj8 = oI1llOooOl12.I00000oOI;
/* 898 */                       if (((Set) iloI0lOlll114.I000iOII(OiO1il.I00000oIO)).contains(obj8)) {
/* 996 */                           iloI0lOlll114.I00i01iIIliI(1576267665);
/* 999 */                           iloI0lOlll114.I0010I0i(false);
                                } else {
/* 903 */                           iloI0lOlll114.I00i01iIIliI(1574916499);
/* 909 */                           iloI0lOlll114.I00Ol1ll1(1159182959, obj8);
/* 912 */                           Object objI00O0i0ii3 = iloI0lOlll114.I00O0i0ii();
/* 916 */                           if (objI00O0i0ii3 == iOO0o0I1l) {
/* 918 */                               Object iOii1l = ol1o1llOII.get(obj8);
/* 922 */                               if (iOii1l == null) {
/* 926 */                                   OI0IlliOIlO oI0IlliOIlO2 = new OI0IlliOIlO();
/* 929 */                                   VarHandle.storeStoreFence();
/* 936 */                                   I0iII1i10I i0iII1i10I = new I0iII1i10I(13);
/* 939 */                                   i0iII1i10I.I00iiI = oI0IlliOIlO2;
/* 941 */                                   VarHandle.storeStoreFence();
/* 949 */                                   iOii1l = new IOii1l(1032736913, i0iII1i10I, true);
/* 952 */                                   ol1o1llOII.put(obj8, iOii1l);
                                        }
/* 955 */                               objI00O0i0ii3 = (Function3) iOii1l;
/* 957 */                               iloI0lOlll114.I00iio(objI00O0i0ii3);
                                    }
/* 964 */                           I1loOO0IOiI i1loOO0IOiI2 = new I1loOO0IOiI(i);
/* 967 */                           i1loOO0IOiI2.I00iiI = oI1llOooOl12;
/* 969 */                           VarHandle.storeStoreFence();
/* 983 */                           ((Function3) objI00O0i0ii3).invoke(iiioOl1O.I00000oOI(-804085656, i1loOO0IOiI2, iloI0lOlll114), iloI0lOlll114, 54);
/* 986 */                           iloI0lOlll114.I0010I0i(false);
/* 989 */                           iloI0lOlll114.I0010I0i(false);
                                }
                            } else {
/* 1003 */                      iloI0lOlll114.I00OilO00Il();
                            }
/* 1006 */                  return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 709 */                   Oiill0lI1il1 oiill0lI1il1 = (Oiill0lI1il1) obj4;
/* 711 */                   O1ooiI111i o1ooiI111i = (O1ooiI111i) obj;
/* 715 */                   IloI0lOlll1 iloI0lOlll115 = (IloI0lOlll1) obj2;
/* 719 */                   ((Integer) obj3).getClass();
/* 725 */                   iloI0lOlll115.I00i01iIIliI(-1914520728);
/* 734 */                   IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll115.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 736 */                   Object objI00O0i0ii4 = iloI0lOlll115.I00O0i0ii();
                            Object obj9 = objI00O0i0ii4;
/* 740 */                   if (objI00O0i0ii4 == iOO0o0I1l) {
/* 746 */                       OIooliIO0 oIooliIO0I00000oIO = lOO00IiI0li.I00000oIO(IooOl0ol01.I00000oIO(0L));
/* 750 */                       iloI0lOlll115.I00iio(oIooliIO0I00000oIO);
                                obj9 = oIooliIO0I00000oIO;
                            }
/* 753 */                   OI10i0Il oI10i0Il = (OI10i0Il) obj9;
/* 755 */                   boolean zI000OOo1O3 = iloI0lOlll115.I000OOo1O(oiill0lI1il1);
/* 759 */                   Object objI00O0i0ii5 = iloI0lOlll115.I00O0i0ii();
                            Object obj10 = objI00O0i0ii5;
/* 763 */                   if (zI000OOo1O3 || objI00O0i0ii5 == iOO0o0I1l) {
/* 771 */                       O1l110o o1l110o = new O1l110o(18);
/* 774 */                       o1l110o.I00iiI = oiill0lI1il1;
/* 776 */                       o1l110o.I00iiO = oI10i0Il;
/* 778 */                       VarHandle.storeStoreFence();
/* 781 */                       iloI0lOlll115.I00iio(o1l110o);
                                obj10 = o1l110o;
                            }
/* 784 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) obj10;
/* 786 */                   boolean zI000II = iloI0lOlll115.I000II(iiIooOOOI);
/* 790 */                   Object objI00O0i0ii6 = iloI0lOlll115.I00O0i0ii();
                            Object obj11 = objI00O0i0ii6;
/* 794 */                   if (zI000II || objI00O0i0ii6 == iOO0o0I1l) {
/* 800 */                       Oiilo01i oiilo01i = new Oiilo01i(false ? 1 : 0);
/* 803 */                       oiilo01i.I00iiI = iiIooOOOI;
/* 805 */                       oiilo01i.I00iiO = oI10i0Il;
/* 807 */                       VarHandle.storeStoreFence();
/* 810 */                       iloI0lOlll115.I00iio(oiilo01i);
                                obj11 = oiilo01i;
                            }
/* 815 */                   I110ilOOl0io i110ilOOl0io = OiilOllIOIli.I00000oIO;
/* 819 */                   OiilIIooooo1 oiilIIooooo1 = new OiilIIooooo1(false ? 1 : 0);
/* 822 */                   oiilIIooooo1.I00iiO = illOOo00lI;
/* 824 */                   oiilIIooooo1.I00iiI = (Function1) obj11;
/* 826 */                   VarHandle.storeStoreFence();
/* 829 */                   O1ooiI111i o1ooiI111iI00000oIO = iilOllOlO1.I00000oIO(o1ooiI111i, oiilIIooooo1);
/* 833 */                   iloI0lOlll115.I0010I0i(false);
/* 836 */                   return o1ooiI111iI00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 705 */                   ((Oil0ll) obj4).I0000oI00();
/* 708 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 642 */                   O101lO1 o101lO1 = (O101lO1) obj4;
/* 648 */                   IloI0lOlll1 iloI0lOlll116 = (IloI0lOlll1) obj2;
/* 652 */                   int iIntValue16 = ((Integer) obj3).intValue();
/* 668 */                   if (iloI0lOlll116.I00OIl(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
/* 670 */                       Iterator<E> it2 = o101lO1.iterator();
/* 678 */                       while (it2.hasNext()) {
/* 686 */                           iO0oI1oIoli0.I00000oIO((String) it2.next(), iloI0lOlll116, 0);
                                }
                            } else {
/* 690 */                       iloI0lOlll116.I00OilO00Il();
                            }
/* 693 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 571 */                   Ol111o0 ol111o0 = (Ol111o0) obj4;
/* 573 */                   O1iOIoOiO0 o1iOIoOiO0 = (O1iOIoOiO0) obj;
/* 583 */                   OO1I0001000i oO1I0001000iI001lllioOl = ((O1iIo0ll) obj2).I001lllioOl(((IOo0oO11ll1O) obj3).I00000oIO);
/* 609 */                   int iI00l0OO0IO = Iil1010O.I0000Il00O(Float.NaN, Float.NaN) ? ol111o0.I0000Il00O() ? oO1I0001000iI001lllioOl.I00iOIl / 2 : oO1I0001000iI001lllioOl.I00iiI / 2 : o1iOIoOiO0.I00l0OO0IO(Float.NaN);
/* 613 */                   int i4 = oO1I0001000iI001lllioOl.I00iOIl;
/* 615 */                   int i5 = oO1I0001000iI001lllioOl.I00iiI;
/* 623 */                   Map mapSingletonMap = Collections.singletonMap(Ol10ooO01IO.I00000oIO, Integer.valueOf(iI00l0OO0IO));
/* 629 */                   I0li0o i0li0o = new I0li0o(i2);
/* 632 */                   i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 634 */                   VarHandle.storeStoreFence();
/* 637 */                   return o1iOIoOiO0.I001i1lo1io(i4, i5, mapSingletonMap, i0li0o);
                        case PoseLandmark.LEFT_HIP:
/* 466 */                   OliiOl0 oliiOl0 = (OliiOl0) obj4;
/* 472 */                   IloI0lOlll1 iloI0lOlll117 = (IloI0lOlll1) obj2;
/* 476 */                   int iIntValue17 = ((Integer) obj3).intValue();
/* 490 */                   if (iloI0lOlll117.I00OIl(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
/* 542 */                       Oo0i1oIIoOO.I00000oOI(Oi010OO0.I000oI1ioi(oliiOl0.I0000Il00O + 1, "Voice "), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll117, 0, 0, 262142);
/* 561 */                       IoOoiI1II00i.I00000oIO(iOOI0Oli1.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, iloI0lOlll117, 432, 8);
                            } else {
/* 567 */                       iloI0lOlll117.I00OilO00Il();
                            }
/* 570 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 368 */                   Olll1Oi olll1Oi = (Olll1Oi) obj4;
/* 374 */                   IloI0lOlll1 iloI0lOlll118 = (IloI0lOlll1) obj2;
/* 378 */                   ((Integer) obj3).getClass();
/* 384 */                   iloI0lOlll118.I00i01iIIliI(-1541271084);
/* 387 */                   float f = olll1Oi.I00000oOI;
/* 389 */                   OI0I0o oI0I0o = OI0I0o.I00iOIl;
/* 395 */                   OlO01l1oOil olO01l1oOilI00000oIO = I10i0IOl.I00000oIO(f, l1i1II.I00000oOI(oI0I0o, iloI0lOlll118), iloI0lOlll118, 0, 12);
/* 405 */                   OlO01l1oOil olO01l1oOilI00000oIO2 = I10i0IOl.I00000oIO(olll1Oi.I00000oIO, l1i1II.I00000oOI(oI0I0o, iloI0lOlll118), iloI0lOlll118, 0, 12);
/* 415 */                   O1ooiI111i o1ooiI111iI00111O = Ol0iOOO0.I00111O(Ol0iOOO0.I0000oI00((O1ooiI111i) obj, 1.0f), i1O01oOIoI0I.I00l0I0l0lO1, 2);
/* 419 */                   boolean zI000II2 = iloI0lOlll118.I000II(olO01l1oOilI00000oIO2);
/* 423 */                   Object objI00O0i0ii7 = iloI0lOlll118.I00O0i0ii();
                            Object obj12 = objI00O0i0ii7;
/* 427 */                   if (zI000II2 || objI00O0i0ii7 == iOO0o0I1l) {
/* 433 */                       I11OloI0 i11OloI0 = new I11OloI0(i);
/* 436 */                       i11OloI0.I00iiI = olO01l1oOilI00000oIO2;
/* 438 */                       VarHandle.storeStoreFence();
/* 441 */                       iloI0lOlll118.I00iio(i11OloI0);
                                obj12 = i11OloI0;
                            }
/* 458 */                   O1ooiI111i o1ooiI111iI00100o1O0lo = Ol0iOOO0.I00100o1O0lo(iO0100loIol.I00000oIO(o1ooiI111iI00111O, (Function1) obj12), ((Iil1010O) olO01l1oOilI00000oIO.getValue()).I00iOIl);
/* 462 */                   iloI0lOlll118.I0010I0i(false);
/* 465 */                   return o1ooiI111iI00100o1O0lo;
                        case PoseLandmark.LEFT_KNEE:
/* 242 */                   Oo0IOoOi01 oo0IOoOi013 = (Oo0IOoOi01) obj4;
/* 244 */                   O1ooiI111i o1ooiI111i2 = (O1ooiI111i) obj;
/* 248 */                   IloI0lOlll1 iloI0lOlll119 = (IloI0lOlll1) obj2;
/* 252 */                   ((Integer) obj3).getClass();
/* 258 */                   iloI0lOlll119.I00i01iIIliI(1980580247);
/* 267 */                   IiIooOOOI iiIooOOOI2 = (IiIooOOOI) iloI0lOlll119.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 269 */                   Object objI00O0i0ii8 = iloI0lOlll119.I00O0i0ii();
                            Object obj13 = objI00O0i0ii8;
/* 273 */                   if (objI00O0i0ii8 == iOO0o0I1l) {
/* 279 */                       OIooliIO0 oIooliIO0I00000oIO2 = lOO00IiI0li.I00000oIO(IooOl0ol01.I00000oIO(0L));
/* 283 */                       iloI0lOlll119.I00iio(oIooliIO0I00000oIO2);
                                obj13 = oIooliIO0I00000oIO2;
                            }
/* 286 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) obj13;
/* 288 */                   boolean zI000OOo1O4 = iloI0lOlll119.I000OOo1O(oo0IOoOi013);
/* 292 */                   Object objI00O0i0ii9 = iloI0lOlll119.I00O0i0ii();
                            Object obj14 = objI00O0i0ii9;
/* 296 */                   if (zI000OOo1O4 || objI00O0i0ii9 == iOO0o0I1l) {
/* 302 */                       OlolIi000l ololIi000l = new OlolIi000l(i);
/* 305 */                       ololIi000l.I00iiI = oo0IOoOi013;
/* 307 */                       ololIi000l.I00iiO = oI10i0Il2;
/* 309 */                       VarHandle.storeStoreFence();
/* 312 */                       iloI0lOlll119.I00iio(ololIi000l);
                                obj14 = ololIi000l;
                            }
/* 315 */                   IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj14;
/* 317 */                   boolean zI000II3 = iloI0lOlll119.I000II(iiIooOOOI2);
/* 321 */                   Object objI00O0i0ii10 = iloI0lOlll119.I00O0i0ii();
                            Object obj15 = objI00O0i0ii10;
/* 325 */                   if (zI000II3 || objI00O0i0ii10 == iOO0o0I1l) {
/* 331 */                       Oiilo01i oiilo01i2 = new Oiilo01i(i);
/* 334 */                       oiilo01i2.I00iiI = iiIooOOOI2;
/* 336 */                       oiilo01i2.I00iiO = oI10i0Il2;
/* 338 */                       VarHandle.storeStoreFence();
/* 341 */                       iloI0lOlll119.I00iio(oiilo01i2);
                                obj15 = oiilo01i2;
                            }
/* 346 */                   I110ilOOl0io i110ilOOl0io2 = OiilOllIOIli.I00000oIO;
/* 350 */                   OiilIIooooo1 oiilIIooooo12 = new OiilIIooooo1(false ? 1 : 0);
/* 353 */                   oiilIIooooo12.I00iiO = illOOo00lI2;
/* 355 */                   oiilIIooooo12.I00iiI = (Function1) obj15;
/* 357 */                   VarHandle.storeStoreFence();
/* 360 */                   O1ooiI111i o1ooiI111iI00000oIO2 = iilOllOlO1.I00000oIO(o1ooiI111i2, oiilIIooooo12);
/* 364 */                   iloI0lOlll119.I0010I0i(false);
/* 367 */                   return o1ooiI111iI00000oIO2;
                        default:
/* 39 */                    O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) obj4;
/* 45 */                    IloI0lOlll1 iloI0lOlll120 = (IloI0lOlll1) obj2;
/* 49 */                    int iIntValue18 = ((Integer) obj3).intValue();
/* 63 */                    if (iloI0lOlll120.I00OIl(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
/* 69 */                        O1ooiI111i o1ooiI111iI0001Ioi1lo3 = iO01II.I0001Ioi1lo(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 12.0f);
/* 81 */                        OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO3 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(10.0f), i1O01oOIoI0I.I00lli11, iloI0lOlll120, 54);
/* 87 */                        int iHashCode5 = Long.hashCode(iloI0lOlll120.I00OI1);
/* 91 */                        OO0lO0l0 oO0lO0l0I000lI5 = iloI0lOlll120.I000lI();
/* 95 */                        O1ooiI111i o1ooiI111iI0000Il00O5 = iilOllOlO1.I0000Il00O(iloI0lOlll120, o1ooiI111iI0001Ioi1lo3);
/* 101 */                       IOl0oi0lOl1.I000lI.getClass();
/* 104 */                       iloI0lOlll120.I00i0oil();
/* 109 */                       if (iloI0lOlll120.I00O10llo) {
/* 111 */                           iloI0lOlll120.I000l1(iloi111);
                                } else {
/* 115 */                           iloI0lOlll120.I00io1l();
                                }
/* 120 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll120, oiI1iiIl1Oi0I00000oIO3);
/* 125 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll120, oO0lO0l0I000lI5);
/* 134 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll120, Integer.valueOf(iHashCode5));
/* 137 */                       li01Ooiio01.I00000oOI(iloI0lOlll120);
/* 142 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll120, o1ooiI111iI0000Il00O5);
/* 165 */                       OOO0iOio0oil.I00000oIO(Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, 0.0f, 0L, 0, 0.0f, iloI0lOlll120, 6, 62);
/* 231 */                       Oo0i1oIIoOO.I00000oOI(IlIi0I0.I000lI("Loading ", o1oIOiI11o0.I00000oIO, "…"), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll120.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000l1, iloI0lOlll120, 0, 0, 131070);
/* 234 */                       iloI0lOlll120.I0010I0i(true);
                            } else {
/* 238 */                       iloI0lOlll120.I00OilO00Il();
                            }
/* 241 */                   return ooiIlOl1iI;
                    }
                }
            }
