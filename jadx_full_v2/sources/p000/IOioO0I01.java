            package p000;

            import android.os.Handler;
            import android.os.HandlerThread;
            import com.box.gallery.R;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.net.SocketTimeoutException;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.WeakHashMap;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class IOioO0I01 implements Function3 {
                public final int I00iOIl;

                public IOioO0I01(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 3 */             int i = this.I00iOIl;
/* 11 */            O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 15 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 2482 */                  IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 2488 */                  int iIntValue = ((Integer) obj3).intValue();
/* 2502 */                  if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 2504 */                      IoiOolO1iOo ioiOolO1iOoI00000oIO = il0liO.I00000oIO();
/* 2508 */                      OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 2518 */                      long j = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o;
/* 2520 */                      O1ooIo101ll o1ooIo101ll2 = O1ooIo101ll.I00000oIO;
/* 2531 */                      IoOoiI1II00i.I00000oIO(ioiOolO1iOoI00000oIO, null, Ol0iOOO0.I000lI(o1ooIo101ll2, 18.0f), j, iloI0lOlll1, 432, 0);
/* 2604 */                      Oo0i1oIIoOO.I00000oOI(lOOoli.I00000oOI(R.string.delete, iloI0lOlll1), iO01II.I000OiO(o1ooIo101ll2, 4.0f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000o00OoI0I, iloI0lOlll1, 48, 0, 131068);
                            } else {
/* 2608 */                      iloI0lOlll1.I00OilO00Il();
                            }
/* 2611 */                  return ooiIlOl1iI;
                        case 1:
/* 2398 */                  IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj2;
/* 2404 */                  int iIntValue2 = ((Integer) obj3).intValue();
/* 2418 */                  if (iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
/* 2466 */                      Oo0i1oIIoOO.I00000oOI(lOOoli.I00000oOI(R.string.turn_on_all, iloI0lOlll12), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll12, 0, 0, 262142);
                            } else {
/* 2472 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 2475 */                  return ooiIlOl1iI;
                        case 2:
/* 2320 */                  Ol1OiolO0 ol1OiolO0 = (Ol1OiolO0) obj;
/* 2324 */                  IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj2;
/* 2330 */                  int iIntValue3 = ((Integer) obj3).intValue();
/* 2336 */                  if ((iIntValue3 & 6) == 0) {
/* 2347 */                      iIntValue3 |= iloI0lOlll13.I000II(ol1OiolO0) ? 4 : 2;
                            }
/* 2362 */                  if (iloI0lOlll13.I00OIl(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
/* 2382 */                      lOIlo1.I0000Il00O(ol1OiolO0, null, null, 0L, 0L, 0L, 0L, 0L, iloI0lOlll13, iIntValue3 & 14);
                            } else {
/* 2388 */                      iloI0lOlll13.I00OilO00Il();
                            }
/* 2391 */                  return ooiIlOl1iI;
                        case 3:
/* 2223 */                  IloI0lOlll1 iloI0lOlll14 = (IloI0lOlll1) obj2;
/* 2229 */                  int iIntValue4 = ((Integer) obj3).intValue();
/* 2243 */                  if (iloI0lOlll14.I00OIl(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
/* 2260 */                      IoOoiI1II00i.I00000oIO(illI1o.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, iloI0lOlll14, 432, 8);
/* 2267 */                      lOO1OIO00.I00000oIO(iloI0lOlll14, Ol0iOOO0.I000lI(o1ooIo101ll, 8.0f));
/* 2310 */                      Oo0i1oIIoOO.I00000oOI("Generate", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll14, 6, 0, 262142);
                            } else {
/* 2314 */                      iloI0lOlll14.I00OilO00Il();
                            }
/* 2317 */                  return ooiIlOl1iI;
                        case 4:
/* 2122 */                  IloI0lOlll1 iloI0lOlll15 = (IloI0lOlll1) obj2;
/* 2128 */                  int iIntValue5 = ((Integer) obj3).intValue();
/* 2142 */                  if (iloI0lOlll15.I00OIl(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
/* 2159 */                      IoOoiI1II00i.I00000oIO(lO0O0Ii0ooIl.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, iloI0lOlll15, 432, 8);
/* 2166 */                      lOO1OIO00.I00000oIO(iloI0lOlll15, Ol0iOOO0.I000lI(o1ooIo101ll, 8.0f));
/* 2209 */                      Oo0i1oIIoOO.I00000oOI("Export", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll15, 6, 0, 262142);
                            } else {
/* 2213 */                      iloI0lOlll15.I00OilO00Il();
                            }
/* 2216 */                  return ooiIlOl1iI;
                        case 5:
/* 2021 */                  IloI0lOlll1 iloI0lOlll16 = (IloI0lOlll1) obj2;
/* 2027 */                  int iIntValue6 = ((Integer) obj3).intValue();
/* 2041 */                  if (iloI0lOlll16.I00OIl(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
/* 2058 */                      IoOoiI1II00i.I00000oIO(lOI1lI0.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, iloI0lOlll16, 432, 8);
/* 2065 */                      lOO1OIO00.I00000oIO(iloI0lOlll16, Ol0iOOO0.I000lI(o1ooIo101ll, 8.0f));
/* 2108 */                      Oo0i1oIIoOO.I00000oOI("Share", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll16, 6, 0, 262142);
                            } else {
/* 2112 */                      iloI0lOlll16.I00OilO00Il();
                            }
/* 2115 */                  return ooiIlOl1iI;
                        case 6:
/* 1920 */                  IloI0lOlll1 iloI0lOlll17 = (IloI0lOlll1) obj2;
/* 1926 */                  int iIntValue7 = ((Integer) obj3).intValue();
/* 1940 */                  if (iloI0lOlll17.I00OIl(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
/* 1957 */                      IoOoiI1II00i.I00000oIO(illI1o.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, iloI0lOlll17, 432, 8);
/* 1964 */                      lOO1OIO00.I00000oIO(iloI0lOlll17, Ol0iOOO0.I000lI(o1ooIo101ll, 8.0f));
/* 2007 */                      Oo0i1oIIoOO.I00000oOI("Generate", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll17, 6, 0, 262142);
                            } else {
/* 2011 */                      iloI0lOlll17.I00OilO00Il();
                            }
/* 2014 */                  return ooiIlOl1iI;
                        case 7:
/* 1819 */                  IloI0lOlll1 iloI0lOlll18 = (IloI0lOlll1) obj2;
/* 1825 */                  int iIntValue8 = ((Integer) obj3).intValue();
/* 1839 */                  if (iloI0lOlll18.I00OIl(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
/* 1856 */                      IoOoiI1II00i.I00000oIO(lO0O0Ii0ooIl.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, iloI0lOlll18, 432, 8);
/* 1863 */                      lOO1OIO00.I00000oIO(iloI0lOlll18, Ol0iOOO0.I000lI(o1ooIo101ll, 8.0f));
/* 1906 */                      Oo0i1oIIoOO.I00000oOI("Export", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll18, 6, 0, 262142);
                            } else {
/* 1910 */                      iloI0lOlll18.I00OilO00Il();
                            }
/* 1913 */                  return ooiIlOl1iI;
                        case 8:
/* 1718 */                  IloI0lOlll1 iloI0lOlll19 = (IloI0lOlll1) obj2;
/* 1724 */                  int iIntValue9 = ((Integer) obj3).intValue();
/* 1738 */                  if (iloI0lOlll19.I00OIl(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
/* 1755 */                      IoOoiI1II00i.I00000oIO(lOI1lI0.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, iloI0lOlll19, 432, 8);
/* 1762 */                      lOO1OIO00.I00000oIO(iloI0lOlll19, Ol0iOOO0.I000lI(o1ooIo101ll, 8.0f));
/* 1805 */                      Oo0i1oIIoOO.I00000oOI("Share", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll19, 6, 0, 262142);
                            } else {
/* 1809 */                      iloI0lOlll19.I00OilO00Il();
                            }
/* 1812 */                  return ooiIlOl1iI;
                        case 9:
/* 1666 */                  IloI0lOlll1 iloI0lOlll110 = (IloI0lOlll1) obj2;
/* 1672 */                  int iIntValue10 = ((Integer) obj3).intValue();
/* 1686 */                  if (iloI0lOlll110.I00OIl(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
/* 1704 */                      IoOoiI1II00i.I00000oIO(lOOli0OI1l0.I00000oIO(), "Stop", Ol0iOOO0.I000lI(o1ooIo101ll, 36.0f), 0L, iloI0lOlll110, 432, 8);
                            } else {
/* 1708 */                      iloI0lOlll110.I00OilO00Il();
                            }
/* 1711 */                  return ooiIlOl1iI;
                        case 10:
/* 1614 */                  IloI0lOlll1 iloI0lOlll111 = (IloI0lOlll1) obj2;
/* 1620 */                  int iIntValue11 = ((Integer) obj3).intValue();
/* 1634 */                  if (iloI0lOlll111.I00OIl(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
/* 1652 */                      IoOoiI1II00i.I00000oIO(lI11o0Ili1IO.I00000oIO(), "Speak", Ol0iOOO0.I000lI(o1ooIo101ll, 36.0f), 0L, iloI0lOlll111, 432, 8);
                            } else {
/* 1656 */                      iloI0lOlll111.I00OilO00Il();
                            }
/* 1659 */                  return ooiIlOl1iI;
                        case 11:
/* 1530 */                  IloI0lOlll1 iloI0lOlll112 = (IloI0lOlll1) obj2;
/* 1536 */                  int iIntValue12 = ((Integer) obj3).intValue();
/* 1550 */                  if (iloI0lOlll112.I00OIl(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
/* 1598 */                      Oo0i1oIIoOO.I00000oOI(lOOoli.I00000oOI(R.string.ok, iloI0lOlll112), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll112, 0, 0, 262142);
                            } else {
/* 1604 */                      iloI0lOlll112.I00OilO00Il();
                            }
/* 1607 */                  return ooiIlOl1iI;
                        case 12:
/* 1446 */                  IloI0lOlll1 iloI0lOlll113 = (IloI0lOlll1) obj2;
/* 1452 */                  int iIntValue13 = ((Integer) obj3).intValue();
/* 1466 */                  if (iloI0lOlll113.I00OIl(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
/* 1514 */                      Oo0i1oIIoOO.I00000oOI(lOOoli.I00000oOI(R.string.cancel, iloI0lOlll113), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll113, 0, 0, 262142);
                            } else {
/* 1520 */                      iloI0lOlll113.I00OilO00Il();
                            }
/* 1523 */                  return ooiIlOl1iI;
                        case 13:
/* 1354 */                  IloI0lOlll1 iloI0lOlll114 = (IloI0lOlll1) obj2;
/* 1360 */                  int iIntValue14 = ((Integer) obj3).intValue();
/* 1374 */                  if (iloI0lOlll114.I00OIl(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
/* 1388 */                      IoOoiI1II00i.I00000oIO(ilOIiolOol1.I00000oIO(), null, null, 0L, iloI0lOlll114, 48, 12);
/* 1432 */                      Oo0i1oIIoOO.I00000oOI("  Import .onnx model", null, 0L, null, 0L, null, IlilIIiIiO.I00l0OO0IO, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll114, 1572870, 0, 262078);
                            } else {
/* 1436 */                      iloI0lOlll114.I00OilO00Il();
                            }
/* 1439 */                  return ooiIlOl1iI;
                        case 14:
/* 1256 */                  IloI0lOlll1 iloI0lOlll115 = (IloI0lOlll1) obj2;
/* 1262 */                  int iIntValue15 = ((Integer) obj3).intValue();
/* 1276 */                  if (iloI0lOlll115.I00OIl(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
/* 1290 */                      IoOoiI1II00i.I00000oIO(lOOli0OI1l0.I00000oIO(), null, null, 0L, iloI0lOlll115, 48, 12);
/* 1297 */                      lOO1OIO00.I00000oIO(iloI0lOlll115, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 8.0f));
/* 1340 */                      Oo0i1oIIoOO.I00000oOI("Stop", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll115, 6, 0, 262142);
                            } else {
/* 1344 */                      iloI0lOlll115.I00OilO00Il();
                            }
/* 1347 */                  return ooiIlOl1iI;
                        case 15:
/* 1158 */                  IloI0lOlll1 iloI0lOlll116 = (IloI0lOlll1) obj2;
/* 1164 */                  int iIntValue16 = ((Integer) obj3).intValue();
/* 1178 */                  if (iloI0lOlll116.I00OIl(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
/* 1192 */                      IoOoiI1II00i.I00000oIO(li1oiOOloO1.I00000oIO(), null, null, 0L, iloI0lOlll116, 48, 12);
/* 1199 */                      lOO1OIO00.I00000oIO(iloI0lOlll116, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 8.0f));
/* 1242 */                      Oo0i1oIIoOO.I00000oOI("Speak", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll116, 6, 0, 262142);
                            } else {
/* 1246 */                      iloI0lOlll116.I00OilO00Il();
                            }
/* 1249 */                  return ooiIlOl1iI;
                        case 16:
/* 1057 */                  IloI0lOlll1 iloI0lOlll117 = (IloI0lOlll1) obj2;
/* 1063 */                  int iIntValue17 = ((Integer) obj3).intValue();
/* 1077 */                  if (iloI0lOlll117.I00OIl(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
/* 1094 */                      IoOoiI1II00i.I00000oIO(iOOiIIllIi.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, iloI0lOlll117, 432, 8);
/* 1101 */                      lOO1OIO00.I00000oIO(iloI0lOlll117, Ol0iOOO0.I000lI(o1ooIo101ll, 8.0f));
/* 1144 */                      Oo0i1oIIoOO.I00000oOI("Upscale", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll117, 6, 0, 262142);
                            } else {
/* 1148 */                      iloI0lOlll117.I00OilO00Il();
                            }
/* 1151 */                  return ooiIlOl1iI;
                        case 17:
/* 1005 */                  IloI0lOlll1 iloI0lOlll118 = (IloI0lOlll1) obj2;
/* 1011 */                  int iIntValue18 = ((Integer) obj3).intValue();
/* 1025 */                  if (iloI0lOlll118.I00OIl(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
/* 1043 */                      IoOoiI1II00i.I00000oIO(lOOli0OI1l0.I00000oIO(), "Stop", Ol0iOOO0.I000lI(o1ooIo101ll, 36.0f), 0L, iloI0lOlll118, 432, 8);
                            } else {
/* 1047 */                      iloI0lOlll118.I00OilO00Il();
                            }
/* 1050 */                  return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 953 */                   IloI0lOlll1 iloI0lOlll119 = (IloI0lOlll1) obj2;
/* 959 */                   int iIntValue19 = ((Integer) obj3).intValue();
/* 973 */                   if (iloI0lOlll119.I00OIl(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
/* 991 */                       IoOoiI1II00i.I00000oIO(l1Oi1iIOOo01.I00000oIO(), "Record", Ol0iOOO0.I000lI(o1ooIo101ll, 36.0f), 0L, iloI0lOlll119, 432, 8);
                            } else {
/* 995 */                       iloI0lOlll119.I00OilO00Il();
                            }
/* 998 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 861 */                   IloI0lOlll1 iloI0lOlll120 = (IloI0lOlll1) obj2;
/* 867 */                   int iIntValue20 = ((Integer) obj3).intValue();
/* 881 */                   if (iloI0lOlll120.I00OIl(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
/* 895 */                       IoOoiI1II00i.I00000oIO(ilOIiolOol1.I00000oIO(), null, null, 0L, iloI0lOlll120, 48, 12);
/* 939 */                       Oo0i1oIIoOO.I00000oOI("  Import .bin model", null, 0L, null, 0L, null, IlilIIiIiO.I00l0OO0IO, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll120, 1572870, 0, 262078);
                            } else {
/* 943 */                       iloI0lOlll120.I00OilO00Il();
                            }
/* 946 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 760 */                   IloI0lOlll1 iloI0lOlll121 = (IloI0lOlll1) obj2;
/* 766 */                   int iIntValue21 = ((Integer) obj3).intValue();
/* 780 */                   if (iloI0lOlll121.I00OIl(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
/* 797 */                       IoOoiI1II00i.I00000oIO(iOOiIIllIi.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, iloI0lOlll121, 432, 8);
/* 804 */                       lOO1OIO00.I00000oIO(iloI0lOlll121, Ol0iOOO0.I000lI(o1ooIo101ll, 8.0f));
/* 847 */                       Oo0i1oIIoOO.I00000oOI("Generate", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll121, 6, 0, 262142);
                            } else {
/* 851 */                       iloI0lOlll121.I00OilO00Il();
                            }
/* 854 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 659 */                   IloI0lOlll1 iloI0lOlll122 = (IloI0lOlll1) obj2;
/* 665 */                   int iIntValue22 = ((Integer) obj3).intValue();
/* 679 */                   if (iloI0lOlll122.I00OIl(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
/* 696 */                       IoOoiI1II00i.I00000oIO(iOl011O00i.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, iloI0lOlll122, 432, 8);
/* 703 */                       lOO1OIO00.I00000oIO(iloI0lOlll122, Ol0iOOO0.I000lI(o1ooIo101ll, 8.0f));
/* 746 */                       Oo0i1oIIoOO.I00000oOI("Cancel", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll122, 6, 0, 262142);
                            } else {
/* 750 */                       iloI0lOlll122.I00OilO00Il();
                            }
/* 753 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 558 */                   IloI0lOlll1 iloI0lOlll123 = (IloI0lOlll1) obj2;
/* 564 */                   int iIntValue23 = ((Integer) obj3).intValue();
/* 578 */                   if (iloI0lOlll123.I00OIl(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
/* 595 */                       IoOoiI1II00i.I00000oIO(lO0O0Ii0ooIl.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), 0L, iloI0lOlll123, 432, 8);
/* 602 */                       lOO1OIO00.I00000oIO(iloI0lOlll123, Ol0iOOO0.I000lI(o1ooIo101ll, 8.0f));
/* 645 */                       Oo0i1oIIoOO.I00000oOI("Save to gallery", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll123, 6, 0, 262142);
                            } else {
/* 649 */                       iloI0lOlll123.I00OilO00Il();
                            }
/* 652 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 458 */                   Iio1oiI iio1oiI = (Iio1oiI) obj;
/* 468 */                   Map map = Collections.EMPTY_MAP;
/* 470 */                   Iio1000IOoi1 iio1000IOoi1 = new Iio1000IOoi1();
/* 473 */                   iio1000IOoi1.I0000oI00 = 0;
/* 475 */                   iio1000IOoi1.I0001Ioi1lo = false;
/* 482 */                   iio1000IOoi1.I000II = new AtomicBoolean(false);
/* 489 */                   iio1000IOoi1.I000O01llI0 = new LinkedHashMap();
/* 495 */                   HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
/* 498 */                   iio1000IOoi1.I00000oOI = handlerThread;
/* 500 */                   handlerThread.start();
/* 509 */                   Handler handler = new Handler(handlerThread.getLooper());
/* 512 */                   iio1000IOoi1.I0000O = handler;
/* 519 */                   iio1000IOoi1.I0000Il00O = new Io11oioo(handler);
/* 523 */                   Iio0oli1Ool iio0oli1Ool = new Iio0oli1Ool();
/* 527 */                   iio0oli1Ool.I00lll10 = -1;
/* 529 */                   iio0oli1Ool.I00o0iI0io1 = -1;
/* 531 */                   iio0oli1Ool.I00o0l1o1o0 = (IOlO11lll0l) obj2;
/* 533 */                   iio0oli1Ool.I00o101lO = (IOlO11lll0l) obj3;
/* 535 */                   VarHandle.storeStoreFence();
/* 538 */                   iio1000IOoi1.I00000oIO = iio0oli1Ool;
                            try {
/* 540 */                       iio1000IOoi1.I000II(iio1oiI);
/* 543 */                       VarHandle.storeStoreFence();
/* 546 */                       return iio1000IOoi1;
                            } catch (RuntimeException e) {
/* 548 */                       iio1000IOoi1.I00000oIO();
/* 551 */                       throw e;
                            }
                        case PoseLandmark.RIGHT_HIP:
/* 416 */                   IloI0lOlll1 iloI0lOlll124 = (IloI0lOlll1) obj2;
/* 422 */                   int iIntValue24 = ((Integer) obj3).intValue();
/* 438 */                   if (iloI0lOlll124.I00OIl(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
/* 443 */                       iloI0lOlll124.I00i01iIIliI(-1105580800);
/* 446 */                       iloI0lOlll124.I0010I0i(false);
                            } else {
/* 450 */                       iloI0lOlll124.I00OilO00Il();
                            }
/* 453 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 332 */                   IloI0lOlll1 iloI0lOlll125 = (IloI0lOlll1) obj2;
/* 338 */                   int iIntValue25 = ((Integer) obj3).intValue();
/* 352 */                   if (iloI0lOlll125.I00OIl(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
/* 400 */                       Oo0i1oIIoOO.I00000oOI(lOOoli.I00000oOI(R.string.tos_dialog_agree_and_continue_button_label, iloI0lOlll125), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll125, 0, 0, 262142);
                            } else {
/* 406 */                       iloI0lOlll125.I00OilO00Il();
                            }
/* 409 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 295 */                   Throwable th = (Throwable) obj3;
/* 297 */                   O1I1OOiol o1I1OOiol = IoO1lI1l.I00000oIO;
/* 299 */                   Throwable thI00000oIO = ilIiI1O0.I00000oIO(th);
/* 321 */                   return Boolean.valueOf(((thI00000oIO instanceof IoO1lOO0l1l) || (thI00000oIO instanceof IOlo0l11illI) || (thI00000oIO instanceof SocketTimeoutException) || (th instanceof CancellationException)) ? false : true);
                        case 27:
/* 268 */                   int i2 = ((Ii1olII1lO1) obj3).I0000O().I00iOIl;
/* 280 */                   return Boolean.valueOf(500 <= i2 && i2 < 600);
                        case PoseLandmark.RIGHT_ANKLE:
/* 239 */                   ((Integer) obj3).getClass();
/* 248 */                   iI1oIlO1llo.I00000oIO.invoke((IloI0lOlll1) obj2, 0);
/* 251 */                   return ooiIlOl1iI;
                        default:
/* 24 */                    O1ooiI111i o1ooiI111i = (O1ooiI111i) obj;
/* 28 */                    IloI0lOlll1 iloI0lOlll126 = (IloI0lOlll1) obj2;
/* 34 */                    ((Integer) obj3).getClass();
/* 40 */                    iloI0lOlll126.I00i01iIIliI(-488122430);
/* 43 */                    Object objI00O0i0ii = iloI0lOlll126.I00O0i0ii();
/* 47 */                    Object obj4 = IOl11li.I00000oIO;
/* 49 */                    if (objI00O0i0ii == obj4) {
/* 53 */                        objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 57 */                        iloI0lOlll126.I00iio(objI00O0i0ii);
                            }
/* 60 */                    OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 62 */                    Object objI00O0i0ii2 = iloI0lOlll126.I00O0i0ii();
/* 66 */                    if (objI00O0i0ii2 == obj4) {
/* 70 */                        objI00O0i0ii2 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 74 */                        iloI0lOlll126.I00iio(objI00O0i0ii2);
                            }
/* 78 */                    OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii2;
/* 90 */                    if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 95 */                        iloI0lOlll126.I00i01iIIliI(1104112491);
/* 98 */                        WeakHashMap weakHashMap = i00lIlOOll0.I001i1O0Ol;
/* 104 */                       I10OOlO i10OOlO = liIIiol0oI10.I00000oIO(iloI0lOlll126).I0000Il00O;
/* 124 */                       boolean z = i10OOlO.I0000oI00().I0000O > 0;
/* 132 */                       Object obj5 = (Ili1iIl) iloI0lOlll126.I000iOII(IOlO0o100i1i.I000OOo1O);
/* 134 */                       Boolean boolValueOf = Boolean.valueOf(z);
/* 146 */                       boolean zI000O01llI0 = iloI0lOlll126.I000O01llI0(z) | iloI0lOlll126.I000OOo1O(obj5);
/* 147 */                       Object objI00O0i0ii3 = iloI0lOlll126.I00O0i0ii();
/* 151 */                       if (zI000O01llI0 || objI00O0i0ii3 == obj4) {
/* 159 */                           Object ii1li0iio0i = new Ii1li0iio0i(obj5, null, z, oI10i0Il2, 3);
/* 162 */                           iloI0lOlll126.I00iio(ii1li0iio0i);
/* 165 */                           objI00O0i0ii3 = ii1li0iio0i;
                                }
/* 168 */                       iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii3, iloI0lOlll126, boolValueOf);
/* 171 */                       iloI0lOlll126.I0010I0i(false);
                            } else {
/* 178 */                       iloI0lOlll126.I00i01iIIliI(1104440192);
/* 181 */                       iloI0lOlll126.I0010I0i(false);
                            }
/* 184 */                   Object objI00O0i0ii4 = iloI0lOlll126.I00O0i0ii();
                            Object obj6 = objI00O0i0ii4;
/* 188 */                   if (objI00O0i0ii4 == obj4) {
/* 194 */                       I0IoiIiOoi i0IoiIiOoi = new I0IoiIiOoi(11);
/* 197 */                       i0IoiIiOoi.I00iiI = oI10i0Il;
/* 199 */                       i0IoiIiOoi.I00iiO = oI10i0Il2;
/* 201 */                       VarHandle.storeStoreFence();
/* 204 */                       iloI0lOlll126.I00iio(i0IoiIiOoi);
                                obj6 = i0IoiIiOoi;
                            }
/* 211 */                   Ili0io0O1lO ili0io0O1lO = new Ili0io0O1lO();
/* 214 */                   ili0io0O1lO.I00000oIO = (Function1) obj6;
/* 216 */                   VarHandle.storeStoreFence();
/* 219 */                   O1ooiI111i o1ooiI111iI0000O = o1ooiI111i.I0000O(ili0io0O1lO);
/* 223 */                   iloI0lOlll126.I0010I0i(false);
/* 226 */                   return o1ooiI111iI0000O;
                    }
                }
            }
