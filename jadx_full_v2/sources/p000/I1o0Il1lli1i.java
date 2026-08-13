            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.util.Size;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            import java.util.Set;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
/* 18 */    public final class I1o0Il1lli1i implements Function3 {
                public final int I00iOIl;
                public Object I00iiI;
                public OI10i0Il I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;

                public I1o0Il1lli1i(Ii0110 ii0110, Ol010000lo00 ol010000lo00, OilIoI11 oilIoI11, Function1 function1, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2) {
/* 2 */             this.I00iOIl = 1;
/* 7 */             this.I00iiI = ii0110;
/* 9 */             this.I00iio = ol010000lo00;
/* 11 */            this.I00ilI0I1 = oilIoI11;
/* 13 */            this.I00ilO0 = function1;
/* 15 */            this.I00iiO = oI10i0Il;
/* 17 */            this.I00io1l = oI10i0Il2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v45, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v46, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v54, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r8v7, types: [IloI0lOlll1] */
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object obj4;
                    OilIoI11 oilIoI11;
                    Function1 function1;
                    OI10i0Il oI10i0Il;
                    OI10i0Il oI10i0Il2;
                    O0oiOi o0oiOi;
                    OOIIOiolI oOIIOiolI;
                    Ioi1Io1o ioi1Io1o;
                    OIooi1iOiOol oIooi1iOiOol;
                    OI10i0Il oI10i0Il3;
                    OI10i0Il oI10i0Il4;
                    Object obj5;
                    ?? I001i1lo1io;
                    Object obj6;
                    Object obj7;
/* 3 */             int i = this.I00iOIl;
/* 5 */             O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 10 */            Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 14 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 16 */            Object obj8 = IOl11li.I00000oIO;
                    switch (i) {
                        case 0:
/* 1937 */                  Bitmap bitmap = (Bitmap) this.I00iio;
/* 1941 */                  Bitmap bitmap2 = (Bitmap) this.I00ilI0I1;
/* 1945 */                  O1OIi1 o1OIi1 = (O1OIi1) this.I00ilO0;
/* 1949 */                  Ii0110 ii0110 = (Ii0110) this.I00iiI;
/* 1953 */                  Context context = (Context) this.I00io1l;
/* 1955 */                  OI10i0Il oI10i0Il5 = this.I00iiO;
/* 1963 */                  IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 1969 */                  int iIntValue = ((Integer) obj3).intValue();
/* 1989 */                  if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 1993 */                      O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(o1ooIo101ll, 12.0f);
/* 2007 */                      IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), i1O01oOIoI0I.I00o0l1o1o0, iloI0lOlll1, 54);
/* 2013 */                      int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 2017 */                      OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 2021 */                      O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0001Ioi1lo);
/* 2027 */                      IOl0oi0lOl1.I000lI.getClass();
/* 2030 */                      iloI0lOlll1.I00i0oil();
/* 2035 */                      if (iloI0lOlll1.I00O10llo) {
/* 2037 */                          iloI0lOlll1.I000l1(iloi111);
                                } else {
/* 2041 */                          iloI0lOlll1.I00io1l();
                                }
/* 2044 */                      IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 2046 */                      li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, iOOlo1O01OI00000oIO);
/* 2049 */                      IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 2051 */                      li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 2054 */                      Integer numValueOf = Integer.valueOf(iHashCode);
/* 2058 */                      IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 2060 */                      li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 2063 */                      li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 2066 */                      IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 2068 */                      li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 2071 */                      if (bitmap != null) {
/* 2074 */                          bitmap2 = bitmap;
                                }
/* 2085 */                      float width = bitmap2.getWidth() / bitmap2.getHeight();
/* 2095 */                      boolean z = bitmap != null;
/* 2112 */                      O1ooiI111i o1ooiI111iI00000oIO = ii0OOOOo0i.I00000oIO(Oi1oIiilI.I00000oIO(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), width), OiI11O1i1.I00000oOI(8.0f));
/* 2119 */                      O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 2128 */                      int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 2132 */                      OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 2136 */                      O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oIO);
/* 2140 */                      iloI0lOlll1.I00i0oil();
/* 2147 */                      if (iloI0lOlll1.I00O10llo) {
/* 2149 */                          iloI0lOlll1.I000l1(iloi111);
                                } else {
/* 2153 */                          iloI0lOlll1.I00io1l();
                                }
/* 2156 */                      li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 2159 */                      li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 2162 */                      IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 2165 */                      li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 2168 */                      if (z) {
/* 2173 */                          iloI0lOlll1.I00i01iIIliI(-1304333392);
/* 2179 */                          i0O0lO1il0.I00000oOI(Ol0iOOO0.I0000Il00O, iloI0lOlll1, 6);
/* 2183 */                          iloI0lOlll1.I0010I0i(false);
                                } else {
/* 2191 */                          iloI0lOlll1.I00i01iIIliI(-1304149841);
/* 2194 */                          iloI0lOlll1.I0010I0i(false);
                                }
/* 2224 */                      ioO0II.I00000oOI(new I0oO00o(bitmap2), bitmap != null ? "Result" : "Source", Ol0iOOO0.I0000Il00O, null, iloI0lOlll1, 384, 248);
/* 2230 */                      iloI0lOlll1.I0010I0i(true);
/* 2235 */                      O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 2245 */                      OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oOI, i1O01oOIoI0I.I00lli11, iloI0lOlll1, 54);
/* 2251 */                      int iHashCode3 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 2255 */                      OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll1.I000lI();
/* 2259 */                      O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000oI00);
/* 2263 */                      iloI0lOlll1.I00i0oil();
/* 2268 */                      if (iloI0lOlll1.I00O10llo) {
/* 2270 */                          iloI0lOlll1.I000l1(iloi111);
                                } else {
/* 2274 */                          iloI0lOlll1.I00io1l();
                                }
/* 2277 */                      li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 2280 */                      li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI3);
/* 2283 */                      IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 2286 */                      li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O3);
/* 2289 */                      boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(o1OIi1);
/* 2293 */                      Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj9 = objI00O0i0ii;
/* 2297 */                      if (zI000OOo1O || objI00O0i0ii == obj8) {
/* 2304 */                          I0O1I11 i0o1i11 = new I0O1I11(2);
/* 2307 */                          i0o1i11.I00iiI = o1OIi1;
/* 2309 */                          VarHandle.storeStoreFence();
/* 2312 */                          iloI0lOlll1.I00iio(i0o1i11);
                                    obj9 = i0o1i11;
                                }
/* 2335 */                      iIo1101O.I00000oIO((IllOOo00lI) obj9, null, false, null, null, i1OOiOiI1lI.I00000oIO, iloI0lOlll1, 1572864, 62);
/* 2338 */                      if (bitmap != null) {
/* 2343 */                          iloI0lOlll1.I00i01iIIliI(1459502430);
/* 2363 */                          boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context) | iloI0lOlll1.I000OOo1O(bitmap);
/* 2364 */                          Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                                    Object obj10 = objI00O0i0ii2;
/* 2368 */                          if (zI000OOo1O2 || objI00O0i0ii2 == obj8) {
/* 2375 */                              I0IoO01lIoO i0IoO01lIoO = new I0IoO01lIoO(7);
/* 2378 */                              i0IoO01lIoO.I00iiI = ii0110;
/* 2380 */                              i0IoO01lIoO.I00iio = context;
/* 2382 */                              i0IoO01lIoO.I00ilI0I1 = bitmap;
/* 2386 */                              i0IoO01lIoO.I00iiO = oI10i0Il5;
/* 2388 */                              VarHandle.storeStoreFence();
/* 2391 */                              iloI0lOlll1.I00iio(i0IoO01lIoO);
                                        obj10 = i0IoO01lIoO;
                                    }
/* 2414 */                          iIo1101O.I00000oIO((IllOOo00lI) obj10, null, false, null, null, i1OOiOiI1lI.I00000oOI, iloI0lOlll1, 1572864, 62);
/* 2430 */                          boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(context) | iloI0lOlll1.I000OOo1O(bitmap);
/* 2431 */                          Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                                    Object obj11 = objI00O0i0ii3;
/* 2435 */                          if (zI000OOo1O3 || objI00O0i0ii3 == obj8) {
/* 2442 */                              I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(4);
/* 2445 */                              i0iI0O1IoIoI.I00iiI = ii0110;
/* 2447 */                              i0iI0O1IoIoI.I00iiO = context;
/* 2449 */                              i0iI0O1IoIoI.I00iio = bitmap;
/* 2451 */                              VarHandle.storeStoreFence();
/* 2454 */                              iloI0lOlll1.I00iio(i0iI0O1IoIoI);
                                        obj11 = i0iI0O1IoIoI;
                                    }
/* 2477 */                          iIo1101O.I00000oIO((IllOOo00lI) obj11, null, false, null, null, i1OOiOiI1lI.I0000Il00O, iloI0lOlll1, 1572864, 62);
/* 2481 */                          iloI0lOlll1.I0010I0i(false);
                                } else {
/* 2490 */                          iloI0lOlll1.I00i01iIIliI(1460289489);
/* 2493 */                          iloI0lOlll1.I0010I0i(false);
                                }
/* 2497 */                      iloI0lOlll1.I0010I0i(true);
/* 2500 */                      iloI0lOlll1.I0010I0i(true);
                                break;
                            } else {
/* 2505 */                      iloI0lOlll1.I00OilO00Il();
                                break;
                            }
                        case 1:
/* 972 */                   OoiIlOl1iI ooiIlOl1iI2 = ooiIlOl1iI;
/* 976 */                   Ii0110 ii01102 = (Ii0110) this.I00iiI;
/* 980 */                   Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00iio;
/* 984 */                   OilIoI11 oilIoI112 = (OilIoI11) this.I00ilI0I1;
/* 988 */                   Function1 function12 = (Function1) this.I00ilO0;
/* 990 */                   OI10i0Il oI10i0Il6 = this.I00iiO;
/* 994 */                   OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00io1l;
/* 1002 */                  ?? r8 = (IloI0lOlll1) obj2;
/* 1008 */                  int iIntValue2 = ((Integer) obj3).intValue();
/* 1012 */                  iOl0lOIi11 iol0loii11 = iOl0lOIi11.I00iiO;
/* 1028 */                  if (r8.I00OIl(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
/* 1036 */                      O0oiOi o0oiOi2 = (O0oiOi) r8.I000iOII(O11looOii.I00000oIO);
/* 1038 */                      Object objI00O0i0ii4 = r8.I00O0i0ii();
/* 1042 */                      if (objI00O0i0ii4 == obj8) {
/* 1049 */                          objI00O0i0ii4 = new IIl0lo1oi(1).I00000oOI();
/* 1053 */                          r8.I00iio(objI00O0i0ii4);
                                }
/* 1056 */                      OOIIOiolI oOIIOiolI2 = (OOIIOiolI) objI00O0i0ii4;
/* 1058 */                      Object objI00O0i0ii5 = r8.I00O0i0ii();
/* 1062 */                      if (objI00O0i0ii5 == obj8) {
/* 1074 */                          Oi0Oo11I oi0Oo11I = new Oi0Oo11I(1, new Size(Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A));
/* 1079 */                          Oi0Oliol oi0Oliol = new Oi0Oliol();
/* 1082 */                          oi0Oliol.I00000oIO = iol0loii11;
/* 1084 */                          oi0Oliol.I00000oOI = oi0Oo11I;
/* 1086 */                          VarHandle.storeStoreFence();
/* 1093 */                          Oi0Oooi oi0Oooi = new Oi0Oooi(12);
/* 1102 */                          ((OI0oiliol10O) oi0Oooi.I00iiI).I0010I0i(IoiIli1i0Oil.I001lllioOl, oi0Oliol);
/* 1105 */                          objI00O0i0ii5 = oi0Oooi.I000OiO();
/* 1109 */                          r8.I00iio(objI00O0i0ii5);
                                }
/* 1112 */                      Ioi1Io1o ioi1Io1o2 = (Ioi1Io1o) objI00O0i0ii5;
/* 1114 */                      Object objI00O0i0ii6 = r8.I00O0i0ii();
/* 1118 */                      if (objI00O0i0ii6 == obj8) {
/* 1120 */                          obj4 = null;
/* 1122 */                          objI00O0i0ii6 = lOO00IiI0li.I00000oIO(null);
/* 1126 */                          r8.I00iio(objI00O0i0ii6);
                                } else {
/* 1130 */                          obj4 = null;
                                }
/* 1134 */                      OI10i0Il oI10i0Il8 = (OI10i0Il) objI00O0i0ii6;
/* 1136 */                      Object objI00O0i0ii7 = r8.I00O0i0ii();
/* 1140 */                      if (objI00O0i0ii7 == obj8) {
/* 1142 */                          objI00O0i0ii7 = lOO00IiI0li.I00000oIO(obj4);
/* 1146 */                          r8.I00iio(objI00O0i0ii7);
                                }
/* 1151 */                      OI10i0Il oI10i0Il9 = (OI10i0Il) objI00O0i0ii7;
/* 1159 */                      Context context2 = (Context) r8.I000iOII(I0lloOI0oio.I00000oOI);
/* 1161 */                      Object objI00O0i0ii8 = r8.I00O0i0ii();
/* 1165 */                      if (objI00O0i0ii8 == obj8) {
/* 1170 */                          objI00O0i0ii8 = new OIooi1iOiOol(1);
/* 1173 */                          r8.I00iio(objI00O0i0ii8);
                                }
/* 1178 */                      OIooi1iOiOol oIooi1iOiOol2 = (OIooi1iOiOol) objI00O0i0ii8;
/* 1180 */                      Object objI00O0i0ii9 = r8.I00O0i0ii();
/* 1184 */                      if (objI00O0i0ii9 == obj8) {
/* 1186 */                          objI00O0i0ii9 = Executors.newSingleThreadExecutor();
/* 1190 */                          r8.I00iio(objI00O0i0ii9);
                                }
/* 1193 */                      ExecutorService executorService = (ExecutorService) objI00O0i0ii9;
/* 1215 */                      boolean zI000OOo1O4 = r8.I000OOo1O(context2) | r8.I000OOo1O(o0oiOi2) | r8.I000OOo1O(oOIIOiolI2) | r8.I000OOo1O(ioi1Io1o2);
/* 1219 */                      Object objI00O0i0ii10 = r8.I00O0i0ii();
/* 1223 */                      if (zI000OOo1O4 || objI00O0i0ii10 == obj8) {
/* 1245 */                          objI00O0i0ii10 = new IIo11OIl1O1O(context2, oI10i0Il8, o0oiOi2, oOIIOiolI2, ioi1Io1o2, oIooi1iOiOol2, oI10i0Il9, null);
/* 1250 */                          oI10i0Il8 = oI10i0Il8;
/* 1252 */                          oIooi1iOiOol2 = oIooi1iOiOol2;
/* 1254 */                          oI10i0Il9 = oI10i0Il9;
/* 1256 */                          r8.I00iio(objI00O0i0ii10);
                                }
/* 1263 */                      iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii10, r8, ooiIlOl1iI2);
/* 1270 */                      Integer numValueOf2 = Integer.valueOf(oIooi1iOiOol2.I000II());
/* 1288 */                      boolean zI000OOo1O5 = r8.I000OOo1O(o0oiOi2) | r8.I000OOo1O(oOIIOiolI2) | r8.I000OOo1O(ioi1Io1o2);
/* 1292 */                      Object objI00O0i0ii11 = r8.I00O0i0ii();
/* 1296 */                      if (zI000OOo1O5 || objI00O0i0ii11 == obj8) {
/* 1333 */                          oilIoI11 = oilIoI112;
/* 1335 */                          function1 = function12;
/* 1337 */                          oI10i0Il = oI10i0Il6;
/* 1330 */                          objI00O0i0ii11 = new Ilo1I0li1Ol(oI10i0Il8, o0oiOi2, oOIIOiolI2, ioi1Io1o2, oIooi1iOiOol2, oI10i0Il9, null, 1);
/* 1341 */                          oI10i0Il2 = oI10i0Il8;
/* 1343 */                          o0oiOi = o0oiOi2;
/* 1345 */                          oOIIOiolI = oOIIOiolI2;
/* 1347 */                          ioi1Io1o = ioi1Io1o2;
/* 1349 */                          oIooi1iOiOol = oIooi1iOiOol2;
/* 1351 */                          oI10i0Il3 = oI10i0Il9;
/* 1353 */                          r8.I00iio(objI00O0i0ii11);
                                } else {
/* 1301 */                          oilIoI11 = oilIoI112;
/* 1303 */                          function1 = function12;
/* 1305 */                          oI10i0Il = oI10i0Il6;
/* 1307 */                          ioi1Io1o = ioi1Io1o2;
/* 1308 */                          oI10i0Il2 = oI10i0Il8;
/* 1310 */                          oIooi1iOiOol = oIooi1iOiOol2;
/* 1312 */                          oI10i0Il3 = oI10i0Il9;
/* 1314 */                          oOIIOiolI = oOIIOiolI2;
/* 1315 */                          o0oiOi = o0oiOi2;
                                }
/* 1358 */                      iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii11, r8, numValueOf2);
/* 1361 */                      boolean zI000OOo1O6 = r8.I000OOo1O(executorService);
/* 1365 */                      Object objI00O0i0ii12 = r8.I00O0i0ii();
                                Object obj12 = objI00O0i0ii12;
/* 1369 */                      if (zI000OOo1O6 || objI00O0i0ii12 == obj8) {
/* 1377 */                          IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(29);
/* 1380 */                          iiioilIl1Il.I00iiI = executorService;
/* 1382 */                          iiioilIl1Il.I00iiO = oI10i0Il2;
/* 1384 */                          VarHandle.storeStoreFence();
/* 1387 */                          r8.I00iio(iiioilIl1Il);
                                    obj12 = iiioilIl1Il;
                                }
/* 1392 */                      iIO0iiOiOl0l.I00000oOI(ooiIlOl1iI2, (Function1) obj12, r8);
/* 1395 */                      IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I0000Il00O;
/* 1399 */                      ooiIlOl1iI2 = ooiIlOl1iI2;
/* 1402 */                      O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 1411 */                      int iHashCode4 = Long.hashCode(r8.I00OI1);
/* 1415 */                      OO0lO0l0 oO0lO0l0I000lI4 = r8.I000lI();
/* 1421 */                      O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(r8, ilIl1Io0lii1);
/* 1427 */                      IOl0oi0lOl1.I000lI.getClass();
/* 1430 */                      r8.I00i0oil();
/* 1437 */                      if (r8.I00O10llo) {
/* 1439 */                          r8.I000l1(iloi111);
                                } else {
/* 1443 */                          r8.I00io1l();
                                }
/* 1448 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, r8, o1iOIl0o10I0000Il00O2);
/* 1453 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, r8, oO0lO0l0I000lI4);
/* 1462 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, r8, Integer.valueOf(iHashCode4));
/* 1465 */                      li01Ooiio01.I00000oOI(r8);
/* 1470 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, r8, o1ooiI111iI0000Il00O4);
/* 1486 */                      boolean zI000OOo1O7 = r8.I000OOo1O(oOIIOiolI) | r8.I000OOo1O(o0oiOi) | r8.I000OOo1O(ioi1Io1o);
/* 1487 */                      Object objI00O0i0ii13 = r8.I00O0i0ii();
                                Object obj13 = objI00O0i0ii13;
/* 1491 */                      if (zI000OOo1O7 || objI00O0i0ii13 == obj8) {
/* 1499 */                          I0O0o00OlIoi i0O0o00OlIoi = new I0O0o00OlIoi(9);
/* 1502 */                          i0O0o00OlIoi.I00iiO = oOIIOiolI;
/* 1504 */                          i0O0o00OlIoi.I00iiI = oI10i0Il2;
/* 1506 */                          i0O0o00OlIoi.I00iio = o0oiOi;
/* 1508 */                          i0O0o00OlIoi.I00ilI0I1 = ioi1Io1o;
/* 1510 */                          i0O0o00OlIoi.I00ilO0 = oIooi1iOiOol;
/* 1512 */                          i0O0o00OlIoi.I00io1l = oI10i0Il3;
/* 1514 */                          VarHandle.storeStoreFence();
/* 1517 */                          r8.I00iio(i0O0o00OlIoi);
                                    obj13 = i0O0o00OlIoi;
                                }
/* 1525 */                      O0000Ioio00.I00000oIO((Function1) obj13, ilIl1Io0lii1, null, r8, 48);
/* 1528 */                      int i2 = IoOo1I0lIl.I00000oIO;
/* 1530 */                      OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 1554 */                      IoOo11l0iI ioOo11l0iII00000oOI = IoOo1I0lIl.I00000oOI(((O1OoiOIi1ooi) r8.I000iOII(olO1iIi1ol0)).I00000oIO.I0010I0i, 0L, 0L, 0L, r8, 14);
/* 1564 */                      O1ooiI111i o1ooiI111iI00000oOI = iO0100loIol.I00000oOI(o1ooIo101ll, -8.0f, 8.0f);
/* 1568 */                      II0O01li0 iI0O01li0 = i1O01oOIoI0I.I00ilI0I1;
/* 1570 */                      II1oili iI1oili = II1oili.I00000oIO;
/* 1572 */                      O1ooiI111i o1ooiI111iI00000oOI2 = iI1oili.I00000oOI(o1ooiI111iI00000oOI, iI0O01li0);
/* 1588 */                      boolean zI000OOo1O8 = r8.I000OOo1O(ii01102) | r8.I000II(ol010000lo00);
/* 1589 */                      Object objI00O0i0ii14 = r8.I00O0i0ii();
/* 1593 */                      if (zI000OOo1O8 || objI00O0i0ii14 == obj8) {
/* 1604 */                          II00oOO11l iI00oOO11l = new II00oOO11l(2);
/* 1607 */                          iI00oOO11l.I00iiI = ii01102;
/* 1609 */                          iI00oOO11l.I00iiO = ol010000lo00;
/* 1611 */                          oI10i0Il4 = oI10i0Il;
/* 1613 */                          iI00oOO11l.I00iio = oI10i0Il4;
/* 1615 */                          VarHandle.storeStoreFence();
/* 1618 */                          r8.I00iio(iI00oOO11l);
                                    obj5 = iI00oOO11l;
                                } else {
/* 1598 */                          oI10i0Il4 = oI10i0Il;
                                    obj5 = objI00O0i0ii14;
                                }
/* 1637 */                      iIo1101O.I00000oIO((IllOOo00lI) obj5, o1ooiI111iI00000oOI2, false, ioOo11l0iII00000oOI, null, i1iO101.I000o00OoI0I, r8, 1572864, 52);
/* 1662 */                      IoOo11l0iI ioOo11l0iII00000oOI2 = IoOo1I0lIl.I00000oOI(((O1OoiOIi1ooi) r8.I000iOII(olO1iIi1ol0)).I00000oIO.I00000oIO, 0L, 0L, 0L, r8, 14);
/* 1708 */                      O1ooiI111i o1ooiI111iI00000oIO2 = iOi0OiI.I00000oIO(Ol0iOOO0.I000lI(iO01II.I000OiO(iI1oili.I00000oOI(o1ooIo101ll, i1O01oOIoI0I.I00l0OO0IO), 0.0f, 0.0f, 0.0f, 32.0f, 7), 64.0f), 2.0f, ((O1OoiOIi1ooi) r8.I000iOII(olO1iIi1ol0)).I00000oIO.I00000oOI, OiI11O1i1.I00000oIO);
/* 1712 */                      OilIoI11 oilIoI113 = oilIoI11;
/* 1718 */                      Function1 function13 = function1;
/* 1744 */                      boolean zI000OOo1O9 = r8.I000OOo1O(oilIoI113) | r8.I000II(function13) | r8.I000OOo1O(ii01102) | r8.I000II(ol010000lo00) | r8.I000OOo1O(ioi1Io1o) | r8.I000OOo1O(executorService);
/* 1745 */                      Object objI00O0i0ii15 = r8.I00O0i0ii();
                                Object obj14 = objI00O0i0ii15;
/* 1749 */                      if (zI000OOo1O9 || objI00O0i0ii15 == obj8) {
/* 1756 */                          I0IliI0i i0IliI0i = new I0IliI0i(4);
/* 1759 */                          i0IliI0i.I00ilO0 = ioi1Io1o;
/* 1761 */                          i0IliI0i.I00iiO = executorService;
/* 1763 */                          i0IliI0i.I00iio = oilIoI113;
/* 1765 */                          i0IliI0i.I00ilI0I1 = function13;
/* 1767 */                          i0IliI0i.I00io1l = ii01102;
/* 1769 */                          i0IliI0i.I00ioIO = ol010000lo00;
/* 1771 */                          i0IliI0i.I00iiI = oI10i0Il4;
/* 1773 */                          VarHandle.storeStoreFence();
/* 1776 */                          r8.I00iio(i0IliI0i);
                                    obj14 = i0IliI0i;
                                }
/* 1795 */                      iIo1101O.I00000oIO((IllOOo00lI) obj14, o1ooiI111iI00000oIO2, false, ioOo11l0iII00000oOI2, null, i1iO101.I000oI1ioi, r8, 1572864, 52);
/* 1808 */                      if (((Boolean) oI10i0Il7.getValue()).booleanValue()) {
/* 1813 */                          r8.I00i01iIIliI(-1485666381);
/* 1838 */                          IoOo11l0iI ioOo11l0iII00000oOI3 = IoOo1I0lIl.I00000oOI(((O1OoiOIi1ooi) r8.I000iOII(olO1iIi1ol0)).I00000oIO.I000O01llI0, 0L, 0L, 0L, r8, 14);
/* 1862 */                          O1ooiI111i o1ooiI111iI000lI = Ol0iOOO0.I000lI(iO01II.I000OiO(iI1oili.I00000oOI(o1ooIo101ll, i1O01oOIoI0I.I00li1OI), 0.0f, 0.0f, 32.0f, 40.0f, 3), 48.0f);
/* 1866 */                          Object objI00O0i0ii16 = r8.I00O0i0ii();
                                    Object obj15 = objI00O0i0ii16;
/* 1870 */                          if (objI00O0i0ii16 == obj8) {
/* 1876 */                              IlIi0Il ilIi0Il = new IlIi0Il(18);
/* 1879 */                              ilIi0Il.I00iiI = oIooi1iOiOol;
/* 1881 */                              VarHandle.storeStoreFence();
/* 1884 */                              r8.I00iio(ilIi0Il);
                                        obj15 = ilIi0Il;
                                    }
/* 1904 */                          iIo1101O.I00000oIO((IllOOo00lI) obj15, o1ooiI111iI000lI, false, ioOo11l0iII00000oOI3, null, i1iO101.I00100l0, r8, 1572870, 52);
/* 1908 */                          r8.I0010I0i(false);
                                } else {
/* 1917 */                          r8.I00i01iIIliI(-1484810781);
/* 1920 */                          r8.I0010I0i(false);
                                }
/* 1924 */                      r8.I0010I0i(true);
                                break;
                            } else {
/* 1929 */                      r8.I00OilO00Il();
                                break;
                            }
                        case 2:
/* 746 */                   Set set = (Set) this.I00iio;
/* 748 */                   Object obj16 = this.I00ilI0I1;
/* 752 */                   Set set2 = (Set) this.I00ilO0;
/* 754 */                   OI10i0Il oI10i0Il10 = this.I00iiO;
/* 758 */                   List list = (List) this.I00iiI;
/* 762 */                   OI1llOooOl1 oI1llOooOl1 = (OI1llOooOl1) this.I00io1l;
/* 766 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj2;
/* 772 */                   int iIntValue3 = ((Integer) obj3).intValue();
/* 792 */                   if (iloI0lOlll12.I00OIl(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
/* 812 */                       boolean zI000OOo1O10 = iloI0lOlll12.I000OOo1O(set) | iloI0lOlll12.I000OOo1O(obj16) | iloI0lOlll12.I000OOo1O(set2) | iloI0lOlll12.I000II(oI10i0Il10);
/* 813 */                       Object objI00O0i0ii17 = iloI0lOlll12.I00O0i0ii();
                                Object obj17 = objI00O0i0ii17;
/* 817 */                       if (zI000OOo1O10 || objI00O0i0ii17 == obj8) {
/* 824 */                           I0O1IO i0o1io = new I0O1IO(6);
/* 827 */                           i0o1io.I00iiI = set;
/* 829 */                           i0o1io.I00iiO = obj16;
/* 831 */                           i0o1io.I00iio = set2;
/* 833 */                           i0o1io.I00ilI0I1 = oI10i0Il10;
/* 835 */                           VarHandle.storeStoreFence();
/* 838 */                           iloI0lOlll12.I00iio(i0o1io);
                                    obj17 = i0o1io;
                                }
/* 843 */                       iIO0iiOiOl0l.I00000oOI(obj16, (Function1) obj17, iloI0lOlll12);
/* 849 */                       iloI0lOlll12.I00i01iIIliI(358947325);
/* 854 */                       if (list instanceof RandomAccess) {
/* 862 */                           OI10IIO oi10iio = new OI10IIO(list.size());
/* 871 */                           I001i1lo1io = new ArrayList(list.size());
/* 877 */                           int size = list.size();
/* 882 */                           for (int i3 = 0; i3 < size; i3++) {
/* 884 */                               Object obj18 = list.get(i3);
/* 892 */                               if (oi10iio.I00000oIO(obj18)) {
/* 894 */                                   I001i1lo1io.add(obj18);
                                        }
                                    }
                                } else {
/* 902 */                           I001i1lo1io = IOOi0Ool1i.I001i1lo1io(list);
                                }
/* 910 */                       if (!I001i1lo1io.isEmpty()) {
/* 916 */                           ListIterator listIterator = I001i1lo1io.listIterator(I001i1lo1io.size());
                                    oI1llOooOl1 = oI1llOooOl1;
/* 924 */                           while (listIterator.hasPrevious()) {
/* 930 */                               OI1llilol0 oI1llilol0 = (OI1llilol0) listIterator.previous();
/* 938 */                               I0illI1iI i0illI1iI = new I0illI1iI(8);
/* 941 */                               i0illI1iI.I00iiI = oI1llilol0;
/* 943 */                               i0illI1iI.I00iiO = oI1llOooOl1;
/* 945 */                               VarHandle.storeStoreFence();
/* 955 */                               oI1llOooOl1 = new OI1llOooOl1(oI1llOooOl1, iiioOl1O.I00000oOI(-330823412, i0illI1iI, iloI0lOlll12));
                                    }
                                }
/* 961 */                       iloI0lOlll12.I0010I0i(false);
/* 964 */                       oI1llOooOl1.I00000oIO(0, iloI0lOlll12);
                                break;
                            } else {
/* 968 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            }
                        case 3:
/* 584 */                   Ii0ioo10iO0 ii0ioo10iO0 = (Ii0ioo10iO0) this.I00iio;
/* 589 */                   O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00ilI0I1;
/* 594 */                   String str = (String) this.I00ilO0;
/* 596 */                   OI10i0Il oI10i0Il11 = this.I00iiO;
/* 600 */                   OI10i0Il oI10i0Il12 = (OI10i0Il) this.I00iiI;
/* 604 */                   OI10i0Il oI10i0Il13 = (OI10i0Il) this.I00io1l;
/* 608 */                   Iil1010O iil1010O = (Iil1010O) obj;
/* 612 */                   IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj2;
/* 618 */                   int iIntValue4 = ((Integer) obj3).intValue();
/* 624 */                   if ((iIntValue4 & 6) == 0) {
/* 637 */                       iIntValue4 |= iloI0lOlll13.I0000O(iil1010O.I00iOIl) ? 4 : 2;
                            }
/* 654 */                   if (iloI0lOlll13.I00OIl(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
/* 656 */                       float f = iil1010O.I00iOIl;
/* 658 */                       Object objI00O0i0ii18 = iloI0lOlll13.I00O0i0ii();
                                Object obj19 = objI00O0i0ii18;
/* 664 */                       if (objI00O0i0ii18 == obj8) {
/* 669 */                           IlI0iIl011 ilI0iIl011 = new IlI0iIl011(5);
/* 672 */                           ilI0iIl011.I00iiI = oI10i0Il11;
/* 674 */                           VarHandle.storeStoreFence();
/* 677 */                           iloI0lOlll13.I00iio(ilI0iIl011);
                                    obj19 = ilI0iIl011;
                                }
/* 681 */                       Function1 function14 = (Function1) obj19;
/* 683 */                       Object objI00O0i0ii19 = iloI0lOlll13.I00O0i0ii();
                                Object obj20 = objI00O0i0ii19;
/* 687 */                       if (objI00O0i0ii19 == obj8) {
/* 692 */                           IlI0iIl011 ilI0iIl0112 = new IlI0iIl011(6);
/* 695 */                           ilI0iIl0112.I00iiI = oI10i0Il12;
/* 697 */                           VarHandle.storeStoreFence();
/* 700 */                           iloI0lOlll13.I00iio(ilI0iIl0112);
                                    obj20 = ilI0iIl0112;
                                }
/* 704 */                       Function1 function15 = (Function1) obj20;
/* 706 */                       Object objI00O0i0ii20 = iloI0lOlll13.I00O0i0ii();
                                Object obj21 = objI00O0i0ii20;
/* 710 */                       if (objI00O0i0ii20 == obj8) {
/* 714 */                           IlI0iIl011 ilI0iIl0113 = new IlI0iIl011(7);
/* 717 */                           ilI0iIl0113.I00iiI = oI10i0Il13;
/* 719 */                           VarHandle.storeStoreFence();
/* 722 */                           iloI0lOlll13.I00iio(ilI0iIl0113);
                                    obj21 = ilI0iIl0113;
                                }
/* 734 */                       ii0ioo10iO0.I00000oIO(new Ii0l0Olio10(o1ol100o0O, f, function14, function15, (Function1) obj21, str), iloI0lOlll13, 0);
                                break;
                            } else {
/* 738 */                       iloI0lOlll13.I00OilO00Il();
                                break;
                            }
                        default:
/* 21 */                    IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00ilI0I1;
/* 23 */                    IOioOOi0I iOioOOi0I6 = lolOiIoiillI.I00ioIO;
/* 25 */                    IOioOOi0I iOioOOi0I7 = lolOiIoiillI.I00ilO0;
/* 27 */                    IOioOOi0I iOioOOi0I8 = lolOiIoiillI.I00io1l;
/* 33 */                    Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00iio;
/* 37 */                    IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00ilI0I1;
/* 41 */                    Ii0110 ii01103 = (Ii0110) this.I00iiI;
/* 45 */                    Ol010000lo00 ol010000lo002 = (Ol010000lo00) this.I00ilO0;
/* 47 */                    OI10i0Il oI10i0Il14 = this.I00iiO;
/* 51 */                    OI10i0Il oI10i0Il15 = (OI10i0Il) this.I00io1l;
/* 59 */                    IloI0lOlll1 iloI0lOlll14 = (IloI0lOlll1) obj2;
/* 65 */                    int iIntValue5 = ((Integer) obj3).intValue();
/* 83 */                    if (!iloI0lOlll14.I00OIl(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
/* 574 */                       iloI0lOlll14.I00OilO00Il();
                                break;
                            } else {
/* 87 */                        O1ooIo101ll o1ooIo101ll2 = O1ooIo101ll.I00000oIO;
/* 99 */                        O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(o1ooIo101ll2, 0.0f, 0.0f, 0.0f, 16.0f, 7);
/* 116 */                       IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll14, 6);
/* 120 */                       Object obj22 = obj8;
/* 123 */                       int iHashCode5 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 127 */                       OO0lO0l0 oO0lO0l0I000lI5 = iloI0lOlll14.I000lI();
/* 131 */                       O1ooiI111i o1ooiI111iI0000Il00O5 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI000OiO);
/* 137 */                       IOl0oi0lOl1.I000lI.getClass();
/* 140 */                       iloI0lOlll14.I00i0oil();
/* 147 */                       if (iloI0lOlll14.I00O10llo) {
/* 149 */                           iloI0lOlll14.I000l1(iloi111);
                                } else {
/* 153 */                           iloI0lOlll14.I00io1l();
                                }
/* 156 */                       li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll14, iOOlo1O01OI00000oIO2);
/* 159 */                       li01Ooiio01.I0000Il00O(iOioOOi0I7, iloI0lOlll14, oO0lO0l0I000lI5);
/* 166 */                       li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll14, Integer.valueOf(iHashCode5));
/* 169 */                       li01Ooiio01.I00000oOI(iloI0lOlll14);
/* 172 */                       li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll14, o1ooiI111iI0000Il00O5);
/* 178 */                       String strI00000oOI = lOOoli.I00000oOI(R.string.model_manager_select_task_title, iloI0lOlll14);
/* 182 */                       OlO1iIi1ol0 olO1iIi1ol02 = O1OoilIO.I00000oOI;
/* 216 */                       O1ooIo101ll o1ooIo101ll3 = o1ooIo101ll2;
/* 271 */                       Oo0i1oIIoOO.I00000oOI(strI00000oOI, iO01II.I000OiO(iO01II.I000OiO(o1ooIo101ll2, 0.0f, 0.0f, 0.0f, 8.0f, 7), 16.0f, 0.0f, 0.0f, 0.0f, 14), ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol02)).I00000oIO.I00100o1O0lo, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol02)).I00000oOI.I000II, iloI0lOlll14, 48, 0, 131064);
/* 277 */                       iloI0lOlll14.I00i01iIIliI(-1547919655);
/* 280 */                       ListIterator listIterator2 = ol1o0O0O0.listIterator();
                                IloI0lOlll1 iloI0lOlll15 = iloI0lOlll14;
                                while (true) {
/* 285 */                           Io1ioiIIO1lI io1ioiIIO1lI = (Io1ioiIIO1lI) listIterator2;
/* 291 */                           if (!io1ioiIIO1lI.hasNext()) {
/* 565 */                               iloI0lOlll15.I0010I0i(false);
/* 568 */                               iloI0lOlll15.I0010I0i(true);
                                        break;
                                    } else {
/* 297 */                               OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) io1ioiIIO1lI.next();
/* 299 */                               II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 301 */                               ListIterator listIterator3 = listIterator2;
/* 303 */                               Object obj23 = obj22;
/* 307 */                               O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(o1ooIo101ll3, 1.0f);
/* 331 */                               boolean zI000II = iloI0lOlll15.I000II(illiIl1l11O) | iloI0lOlll15.I000OOo1O(oloIl1l1oOii) | iloI0lOlll15.I000OOo1O(ii01103) | iloI0lOlll15.I000II(ol010000lo002);
/* 335 */                               Object objI00O0i0ii21 = iloI0lOlll15.I00O0i0ii();
/* 339 */                               O1ooIo101ll o1ooIo101ll4 = o1ooIo101ll3;
/* 343 */                               if (zI000II || objI00O0i0ii21 == obj23) {
/* 353 */                                   obj6 = obj23;
/* 356 */                                   I0iI0llll1 i0iI0llll1 = new I0iI0llll1(4);
/* 359 */                                   i0iI0llll1.I00ilI0I1 = illiIl1l11O;
/* 361 */                                   i0iI0llll1.I00ilO0 = oloIl1l1oOii;
/* 363 */                                   i0iI0llll1.I00io1l = ii01103;
/* 365 */                                   i0iI0llll1.I00iiI = oI10i0Il14;
/* 367 */                                   i0iI0llll1.I00iio = ol010000lo002;
/* 369 */                                   i0iI0llll1.I00iiO = oI10i0Il15;
/* 371 */                                   VarHandle.storeStoreFence();
/* 374 */                                   iloI0lOlll15.I00iio(i0iI0llll1);
                                            obj7 = i0iI0llll1;
                                        } else {
/* 348 */                                   obj6 = obj23;
                                            obj7 = objI00O0i0ii21;
                                        }
/* 381 */                               OI10i0Il oI10i0Il16 = oI10i0Il15;
/* 383 */                               IlliIl1l11O illiIl1l11O2 = illiIl1l11O;
/* 395 */                               O1ooiI111i o1ooiI111iI000II = iO01II.I000II(i1Ioo1o0.I00000oOI(o1ooiI111iI0000oI002, false, null, (IllOOo00lI) obj7, 15), 16.0f, 4.0f);
/* 403 */                               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0001Ioi1lo, iI0O000iIl, iloI0lOlll15, 54);
/* 409 */                               int iHashCode6 = Long.hashCode(iloI0lOlll15.I00OI1);
/* 413 */                               OO0lO0l0 oO0lO0l0I000lI6 = iloI0lOlll15.I000lI();
/* 417 */                               O1ooiI111i o1ooiI111iI0000Il00O6 = iilOllOlO1.I0000Il00O(iloI0lOlll15, o1ooiI111iI000II);
/* 423 */                               IOl0oi0lOl1.I000lI.getClass();
/* 426 */                               iloI0lOlll15.I00i0oil();
/* 431 */                               if (iloI0lOlll15.I00O10llo) {
/* 433 */                                   iloI0lOlll15.I000l1(iloi111);
                                        } else {
/* 437 */                                   iloI0lOlll15.I00io1l();
                                        }
/* 440 */                               li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll15, oiI1iiIl1Oi0I00000oIO2);
/* 443 */                               li01Ooiio01.I0000Il00O(iOioOOi0I7, iloI0lOlll15, oO0lO0l0I000lI6);
/* 450 */                               li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll15, Integer.valueOf(iHashCode6));
/* 453 */                               li01Ooiio01.I00000oOI(iloI0lOlll15);
/* 456 */                               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll15, o1ooiI111iI0000Il00O6);
/* 459 */                               String str2 = oloIl1l1oOii.I00000oOI;
/* 461 */                               OlO1iIi1ol0 olO1iIi1ol03 = O1OoilIO.I00000oOI;
/* 522 */                               IloI0lOlll1 iloI0lOlll16 = iloI0lOlll15;
/* 526 */                               Oo0i1oIIoOO.I00000oOI(str2, null, ((O1OoiOIi1ooi) iloI0lOlll15.I000iOII(olO1iIi1ol03)).I00000oIO.I00100o1O0lo, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll15.I000iOII(olO1iIi1ol03)).I00000oOI.I000O01llI0, iloI0lOlll16, 0, 0, 131066);
/* 539 */                               OloIoll10li.I00000oIO(oloIl1l1oOii, null, 40.0f, 0.0f, iloI0lOlll16, 384);
/* 544 */                               IloI0lOlll1 iloI0lOlll17 = iloI0lOlll16;
/* 546 */                               iloI0lOlll17.I0010I0i(true);
/* 549 */                               listIterator2 = listIterator3;
/* 552 */                               o1ooIo101ll3 = o1ooIo101ll4;
/* 554 */                               obj22 = obj6;
/* 556 */                               oI10i0Il15 = oI10i0Il16;
/* 558 */                               illiIl1l11O = illiIl1l11O2;
                                        iloI0lOlll15 = iloI0lOlll17;
                                    }
                                }
                            }
                    }
/* 572 */           return ooiIlOl1iI;
                }

/* 19 */        public I1o0Il1lli1i(int i) {
/* 20 */            this.I00iOIl = i;
                }
            }
