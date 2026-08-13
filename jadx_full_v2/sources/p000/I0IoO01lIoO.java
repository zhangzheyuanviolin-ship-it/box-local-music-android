            package p000;

            import android.app.LocaleManager;
            import android.content.Context;
            import android.graphics.Bitmap;
            import android.os.LocaleList;
            import android.os.SystemClock;
            import android.os.Trace;
            import android.speech.tts.TextToSpeech;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.ai.edge.gallery.data.ValueType;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizer;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.ByteArrayOutputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
/* 15 */    public final class I0IoO01lIoO implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public I0IoO01lIoO(TextToSpeech textToSpeech, OoIoI0iii0 ooIoI0iii0, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2) {
/* 3 */             this.I00iOIl = 20;
/* 8 */             this.I00iiI = textToSpeech;
/* 10 */            this.I00iio = ooIoI0iii0;
/* 12 */            this.I00iiO = oI10i0Il;
/* 14 */            this.I00ilI0I1 = oI10i0Il2;
                }

                @Override
                public final Object invoke() throws Exception {
                    O1oIOiI11o0 o1oIOiI11o0;
                    ArrayList arrayList;
                    Object obj;
                    String str;
                    String str2;
/* 3 */             int i = this.I00iOIl;
/* 5 */             int i2 = 7;
/* 19 */            int i3 = 1;
/* 22 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 23 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 2058 */                  Ii0110 ii0110 = (Ii0110) this.I00iiI;
/* 2062 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 2066 */                  Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00iio;
/* 2070 */                  IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00ilI0I1;
/* 2074 */                  oI10i0Il.setValue(Boolean.TRUE);
/* 2084 */                  iOi1II01i0.I0000O(ii0110, null, null, new I0O0i0Olo0(ol010000lo00, illOOo00lI, null, 0), 3);
/* 2087 */                  return ooiIlOl1iI;
                        case 1:
/* 2052 */                  iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new I00oIiI10((IOO0IOIll) this.I00iiO, (String) this.I00iio, (IlliIl1l11O) this.I00ilI0I1, null, 2), 3);
/* 2055 */                  return ooiIlOl1iI;
                        case 2:
/* 1985 */                  Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00iiI;
/* 1989 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 1993 */                  IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00ilI0I1;
/* 1997 */                  IllOOo00lI illOOo00lI3 = (IllOOo00lI) this.I00iio;
/* 2001 */                  oI10i0Il2.setValue(Boolean.FALSE);
/* 2007 */                  I0O11iiio1 i0O11iiio1 = new I0O11iiio1(0);
/* 2010 */                  i0O11iiio1.I00iiI = illOOo00lI2;
/* 2012 */                  i0O11iiio1.I00iiO = illOOo00lI3;
/* 2014 */                  VarHandle.storeStoreFence();
/* 2022 */                  ol0o1OiOIIIl.I0010I0i(i0O11iiio1, new I01OoIoio00O(7));
/* 2025 */                  return ooiIlOl1iI;
                        case 3:
/* 1948 */                  I1O01ol i1O01ol = (I1O01ol) this.I00iiI;
/* 1952 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiO;
/* 1956 */                  OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iio;
/* 1960 */                  OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00ilI0I1;
/* 1970 */                  i1O01ol.I00000oOI.I00O10llo((String) oI10i0Il3.getValue());
/* 1975 */                  oI10i0Il4.setValue(Boolean.FALSE);
/* 1979 */                  oI10i0Il5.setValue(null);
/* 1982 */                  return ooiIlOl1iI;
                        case 4:
/* 1942 */                  ((Iii0oiil) this.I00iiI).I000II((IllOOo00lI) this.I00ilI0I1, (Iii0io0OooO) this.I00iiO, (O0iOOoiioO) this.I00iio);
/* 1945 */                  return ooiIlOl1iI;
                        case 5:
/* 1888 */                  OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iiO;
/* 1892 */                  ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.I00iiI;
/* 1896 */                  IllOOo00lI illOOo00lI4 = (IllOOo00lI) this.I00ilI0I1;
/* 1900 */                  OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00iio;
/* 1912 */                  if (((Boolean) oI10i0Il7.getValue()).booleanValue()) {
/* 1914 */                      iOOOoIOlo.I00000oOI(oI10i0Il6, byteArrayOutputStream);
/* 1919 */                      oI10i0Il7.setValue(Boolean.FALSE);
                            }
/* 1922 */                  illOOo00lI4.invoke();
/* 1925 */                  return ooiIlOl1iI;
                        case 6:
/* 1859 */                  OI10i0Il oI10i0Il8 = (OI10i0Il) this.I00iiO;
/* 1863 */                  ByteArrayOutputStream byteArrayOutputStream2 = (ByteArrayOutputStream) this.I00iiI;
/* 1867 */                  Function1 function1 = (Function1) this.I00iio;
/* 1871 */                  OI10i0Il oI10i0Il9 = (OI10i0Il) this.I00ilI0I1;
/* 1877 */                  function1.invoke(iOOOoIOlo.I00000oOI(oI10i0Il8, byteArrayOutputStream2));
/* 1882 */                  oI10i0Il9.setValue(Boolean.FALSE);
/* 1885 */                  return ooiIlOl1iI;
                        case 7:
/* 1853 */                  iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new I00oIiI10((Context) this.I00iio, (Bitmap) this.I00ilI0I1, (OI10i0Il) this.I00iiO, null, 11), 3);
/* 1856 */                  return ooiIlOl1iI;
                        case 8:
/* 1745 */                  Ol010000lo00 ol010000lo002 = (Ol010000lo00) this.I00iio;
/* 1749 */                  Ii0110 ii01102 = (Ii0110) this.I00iiI;
/* 1753 */                  I10i01 i10i01 = (I10i01) this.I00iiO;
/* 1757 */                  IllOOo00lI illOOo00lI5 = (IllOOo00lI) this.I00ilI0I1;
/* 1765 */                  if (ol010000lo002.I0000Il00O() == Ol010l0o0O.I00iiI && ol010000lo002.I0000oI00.I0000Il00O().I0000Il00O(Ol010l0o0O.I00iiO)) {
/* 1784 */                      IOoil1iiIilo iOoil1iiIilo2 = null;
/* 1788 */                      iOi1II01i0.I0000O(ii01102, null, null, new II1OIi(ol010000lo002, iOoil1iiIilo2, 0), 3);
/* 1796 */                      iOi1II01i0.I0000O(ii01102, null, null, new I0II0OiI(i10i01, iOoil1iiIilo2, i2), 3);
                            } else {
/* 1806 */                      OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(ii01102, null, null, new II1OIi(ol010000lo002, null, i3), 3);
/* 1812 */                      II1Io10 iI1Io10 = new II1Io10(1);
/* 1815 */                      iI1Io10.I00iiI = ol010000lo002;
/* 1817 */                      iI1Io10.I00iiO = illOOo00lI5;
/* 1819 */                      VarHandle.storeStoreFence();
/* 1822 */                      olIl0iI0000O.I00iiI(iI1Io10);
                            }
/* 1825 */                  return ooiIlOl1iI;
                        case 9:
/* 1636 */                  Context context = (Context) this.I00iiI;
/* 1640 */                  I1ioIOoI1o0 i1ioIOoI1o0 = (I1ioIOoI1o0) this.I00iiO;
/* 1644 */                  IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) this.I00iio;
/* 1648 */                  IIlio101Io iIlio101Io = (IIlio101Io) this.I00ilI0I1;
/* 1652 */                  Trace.beginSection("CameraFactoryAdapter#appComponent");
/* 1655 */                  long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
/* 1669 */                  IIloOiil iIloOiil = (IIloOiil) ((OllO00oiil) iIlOoolol0ll.I00iiI).getValue();
/* 1673 */                  IIlOO01iI iIlOO01iI = (IIlOO01iI) iIlOoolol0ll.I00io1l;
/* 1677 */                  IIoO11o iIoO11o = (IIoO11o) iIlOoolol0ll.I00ilO0;
/* 1680 */                  I0Oi111ii i0Oi111ii = new I0Oi111ii(5);
/* 1683 */                  i0Oi111ii.I00iiI = context;
/* 1685 */                  i0Oi111ii.I00iiO = i1ioIOoI1o0;
/* 1687 */                  i0Oi111ii.I00iio = iIloOiil;
/* 1689 */                  i0Oi111ii.I00ilI0I1 = iIlio101Io;
/* 1691 */                  i0Oi111ii.I00ilO0 = iIlOO01iI;
/* 1693 */                  i0Oi111ii.I00io1l = iIoO11o;
/* 1695 */                  VarHandle.storeStoreFence();
/* 1700 */                  Ii10Ioo00l ii10Ioo00l = new Ii10Ioo00l();
/* 1703 */                  ii10Ioo00l.I00000oOI = ii10Ioo00l;
/* 1705 */                  ii10Ioo00l.I00000oIO = i0Oi111ii;
/* 1707 */                  VarHandle.storeStoreFence();
/* 1714 */                  if (l11I11lO.I0000O(3, "CXCP")) {
/* 1736 */                      String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                            }
/* 1742 */                  return ii10Ioo00l;
                        case 10:
/* 1513 */                  IIli01O iIli01O = (IIli01O) this.I00iiI;
/* 1517 */                  Context context2 = (Context) this.I00iiO;
/* 1521 */                  I1ioIOoI1o0 i1ioIOoI1o02 = (I1ioIOoI1o0) this.I00iio;
/* 1525 */                  Iio1ilIOl10o iio1ilIOl10o = (Iio1ilIOl10o) this.I00ilI0I1;
                            try {
/* 1529 */                      Trace.beginSection("Create CameraPipe");
/* 1532 */                      long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
/* 1538 */                      Context contextI00000oIO = IOoiioOI.I00000oIO(context2);
/* 1546 */                      OilOiO10IO oilOiO10IOI00000oIO = iOioo01l0.I00000oIO(i1ioIOoI1o02.I00000oIO);
/* 1554 */                      if ((119 & 8) != 0) {
/* 1556 */                          oilOiO10IOI00000oIO = null;
                                }
/* 1557 */                      IIloIo1I0i iIloIo1I0i = new IIloIo1I0i();
/* 1560 */                      iIloIo1I0i.I00000oIO = oilOiO10IOI00000oIO;
/* 1562 */                      VarHandle.storeStoreFence();
/* 1567 */                      IIlio101Io iIlio101Io2 = iIli01O.I00000oIO;
/* 1571 */                      IIlo0I1io1O0 iIlo0I1io1O0 = (IIlo0I1io1O0) iIlio101Io2.I00iiI;
/* 1575 */                      I1I0i0Ilo1Oi i1I0i0Ilo1Oi = (I1I0i0Ilo1Oi) iIlio101Io2.I00iiO;
/* 1577 */                      IIlo110 iIlo110 = new IIlo110();
/* 1580 */                      iIlo110.I00000oIO = iIlo0I1io1O0;
/* 1582 */                      iIlo110.I00000oOI = i1I0i0Ilo1Oi;
/* 1584 */                      iIlo110.I0000Il00O = iio1ilIOl10o;
/* 1586 */                      VarHandle.storeStoreFence();
/* 1592 */                      IIloOiil iIloOiilI00000oIO = IIlooO.I00000oIO(new IIloIII11(contextI00000oIO, iIloIo1I0i, iIlo110));
/* 1600 */                      if (l11I11lO.I0000O(3, "CXCP")) {
/* 1622 */                          String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos2) / 1000000.0d)}, 1));
                                }
/* 1628 */                      return iIloOiilI00000oIO;
                            } finally {
/* 1630 */                      Trace.endSection();
                            }
                        case 11:
/* 1452 */                  IO1OIo01l1 iO1OIo01l1 = (IO1OIo01l1) this.I00iiI;
/* 1457 */                  Conversation conversation = (Conversation) this.I00iio;
/* 1461 */                  OI10i0Il oI10i0Il10 = (OI10i0Il) this.I00iiO;
/* 1465 */                  OI10i0Il oI10i0Il11 = (OI10i0Il) this.I00ilI0I1;
/* 1477 */                  String string = OlOoOIi0o.I00OIo((String) oI10i0Il10.getValue()).toString();
/* 1485 */                  IOoil1iiIilo iOoil1iiIilo3 = null;
/* 1486 */                  if (string.length() != 0) {
/* 1489 */                      IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(iO1OIo01l1);
/* 1493 */                      IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 1504 */                      iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I00oIiI10(iO1OIo01l1, conversation, string, iOoil1iiIilo3, 24), 2);
                            }
/* 1507 */                  oI10i0Il11.setValue(null);
/* 1510 */                  return ooiIlOl1iI;
                        case 12:
/* 1416 */                  Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00iiI;
/* 1420 */                  Function3 function3 = (Function3) this.I00iio;
/* 1424 */                  String str3 = (String) this.I00ilI0I1;
/* 1428 */                  OI10i0Il oI10i0Il12 = (OI10i0Il) this.I00iiO;
/* 1430 */                  Objects.toString(ol1o1llOII);
/* 1445 */                  function3.invoke(ol1o1llOII.I0000Il00O().I0000Il00O, str3, (String) oI10i0Il12.getValue());
/* 1448 */                  return ooiIlOl1iI;
                        case 13:
/* 1370 */                  String str4 = (String) this.I00iiI;
/* 1374 */                  Ili1lII ili1lII = (Ili1lII) this.I00iiO;
/* 1378 */                  Il1iOloo il1iOloo = (Il1iOloo) this.I00iio;
/* 1382 */                  Ol1oolo ol1oolo = (Ol1oolo) this.I00ilI0I1;
/* 1390 */                  if (str4.equals("PrimaryEditable")) {
/* 1392 */                      Ili1lII.I00000oIO(ili1lII);
                            }
/* 1395 */                  il1iOloo.invoke();
/* 1402 */                  if (str4.equals("PrimaryEditable") && ol1oolo != null) {
/* 1408 */                      ((IiIli1i1o) ol1oolo).I00000oOI();
                            }
/* 1411 */                  return Boolean.TRUE;
                        case 14:
/* 1310 */                  Bitmap[] bitmapArr = (Bitmap[]) this.I00iiI;
/* 1315 */                  IlI1loI1lO1 ilI1loI1lO1 = (IlI1loI1lO1) this.I00iiO;
/* 1320 */                  Context context3 = (Context) this.I00iio;
/* 1324 */                  O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00ilI0I1;
/* 1328 */                  Bitmap bitmap = bitmapArr[0];
/* 1330 */                  if (bitmap != null) {
/* 1332 */                      Object obj2 = o1oIOiI11o02.I00IlilI0i0i;
/* 1342 */                      IlI00iOi1 ilI00iOi1 = obj2 instanceof IlI00iOi1 ? (IlI00iOi1) obj2 : null;
/* 1343 */                      if (ilI00iOi1 == null) {
/* 1347 */                          ilI1loI1lO1.I000O01llI0("Model not ready");
                                } else {
/* 1364 */                          iOi1II01i0.I0000O(OooiooIOO.I00000oIO(ilI1loI1lO1), IiiIil1lOIO.I00000oIO, null, new IlI10l0(ilI1loI1lO1, bitmap, context3, ilI00iOi1, (IOoil1iiIilo) null), 2);
                                }
                            }
/* 1367 */                  return ooiIlOl1iI;
                        case 15:
/* 1280 */                  IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iiI;
/* 1284 */                  String str5 = (String) this.I00iio;
/* 1288 */                  OI10i0Il oI10i0Il13 = (OI10i0Il) this.I00iiO;
/* 1292 */                  OI10i0Il oI10i0Il14 = (OI10i0Il) this.I00ilI0I1;
/* 1300 */                  illiIl1l11O.invoke(str5, (String) oI10i0Il13.getValue());
/* 1304 */                  oI10i0Il14.setValue(null);
/* 1307 */                  return ooiIlOl1iI;
                        case 16:
/* 1159 */                  O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiI;
/* 1163 */                  OI1o1o1iO1l oI1o1o1iO1l = (OI1o1o1iO1l) this.I00iio;
/* 1167 */                  OI10i0Il oI10i0Il15 = (OI10i0Il) this.I00iiO;
/* 1171 */                  OI10i0Il oI10i0Il16 = (OI10i0Il) this.I00ilI0I1;
/* 1175 */                  OloIl1l1oOii oloIl1l1oOiiI001i1O0Ol = o1ol100o0O.I001i1O0Ol("llm_chat");
/* 1189 */                  Map map = ((O1oiOloOo) o1ol100o0O.I000OOo1O.I00iOIl.getValue()).I0000Il00O;
/* 1191 */                  if (oloIl1l1oOiiI001i1O0Ol == null || (arrayList = oloIl1l1oOiiI001i1O0Ol.I000OiO) == null) {
/* 1238 */                      o1oIOiI11o0 = null;
                            } else {
/* 1197 */                      Iterator it = arrayList.iterator();
                                while (true) {
/* 1205 */                          if (it.hasNext()) {
/* 1207 */                              Object next = it.next();
/* 1220 */                              O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) map.get(((O1oIOiI11o0) next).I00000oIO);
/* 1230 */                              if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.SUCCEEDED) {
/* 1232 */                                  obj = next;
                                        }
                                    } else {
/* 1234 */                              obj = null;
                                    }
                                }
/* 1235 */                      o1oIOiI11o0 = (O1oIOiI11o0) obj;
                            }
/* 1239 */                  if (o1oIOiI11o0 != null) {
/* 1241 */                      oI10i0Il15.setValue("");
/* 1265 */                      OI1o1o1iO1l.I0000Il00O(oI1o1o1iO1l, "route_model/llm_chat/" + o1oIOiI11o0.I00000oIO + "?autoResume=false");
                            } else {
/* 1269 */                      oI10i0Il16.setValue(oloIl1l1oOiiI001i1O0Ol);
/* 1274 */                      OI1o1o1iO1l.I0000Il00O(oI1o1o1iO1l, "model_list");
                            }
/* 1277 */                  return ooiIlOl1iI;
                        case 17:
/* 1081 */                  IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) this.I00iiI;
/* 1085 */                  IO0ooOiO0OOo iO0ooOiO0OOo = (IO0ooOiO0OOo) this.I00iiO;
/* 1089 */                  Ol11i0 ol11i0 = (Ol11i0) this.I00iio;
/* 1093 */                  OI0Iol1O oI0Iol1O = (OI0Iol1O) this.I00ilI0I1;
/* 1095 */                  IOl11o0IIoI iOl11o0IIoI = iloI0lOlll1.I00IoIO0lI;
/* 1097 */                  IO0ooOiO0OOo iO0ooOiO0OOo2 = iOl11o0IIoI.I00000oOI;
                            try {
/* 1099 */                      iOl11o0IIoI.I00000oOI = iO0ooOiO0OOo;
/* 1101 */                      Ol11i0 ol11i02 = iloI0lOlll1.I00IO1oi11O;
/* 1103 */                      int[] iArr = iloI0lOlll1.I000oI1ioi;
/* 1105 */                      OI0l1oli1I oI0l1oli1I = iloI0lOlll1.I001IO000;
/* 1108 */                      iloI0lOlll1.I000oI1ioi = null;
/* 1110 */                      iloI0lOlll1.I001IO000 = null;
                                try {
/* 1112 */                          iloI0lOlll1.I00IO1oi11O = ol11i0;
/* 1114 */                          boolean z = iOl11o0IIoI.I0000oI00;
                                    try {
/* 1117 */                              iOl11o0IIoI.I0000oI00 = false;
/* 1125 */                              iloI0lOlll1.I00IOO(oI0Iol1O.I00000oIO, oI0Iol1O.I000II, oI0Iol1O.I00000oOI, true);
/* 1138 */                              return ooiIlOl1iI;
                                    } finally {
/* 1144 */                              iOl11o0IIoI.I0000oI00 = z;
                                    }
                                } finally {
/* 1147 */                          iloI0lOlll1.I00IO1oi11O = ol11i02;
/* 1149 */                          iloI0lOlll1.I000oI1ioi = iArr;
/* 1151 */                          iloI0lOlll1.I001IO000 = oI0l1oli1I;
                                }
                            } finally {
/* 1154 */                      iOl11o0IIoI.I00000oOI = iO0ooOiO0OOo2;
                            }
                        case PoseLandmark.RIGHT_PINKY:
/* 1046 */                  IllOOo00lI illOOo00lI6 = (IllOOo00lI) this.I00ilI0I1;
/* 1050 */                  OI10i0Il oI10i0Il17 = (OI10i0Il) this.I00iiO;
/* 1054 */                  Ii0110 ii01103 = (Ii0110) this.I00iiI;
/* 1058 */                  SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.I00iio;
/* 1070 */                  if (((Boolean) oI10i0Il17.getValue()).booleanValue()) {
/* 1072 */                      Iloo0ilo.I001lIiIIo1O(ii01103, speechRecognizer, oI10i0Il17);
                            }
/* 1075 */                  illOOo00lI6.invoke();
/* 1078 */                  return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 983 */                   Float f = (Float) this.I00iiI;
/* 987 */                   IolIOll iolIOll = (IolIOll) this.I00iiO;
/* 992 */                   Float f2 = (Float) this.I00iio;
/* 997 */                   IolIOIloiI00 iolIOIloiI00 = (IolIOIloiI00) this.I00ilI0I1;
/* 1005 */                  if (!f.equals(iolIOll.I00iOIl) || !f2.equals(iolIOll.I00iiI)) {
/* 1015 */                      iolIOll.I00iOIl = f;
/* 1017 */                      iolIOll.I00iiI = f2;
/* 1027 */                      iolIOll.I00ilI0I1 = new OloIIOlO(iolIOIloiI00, iolIOll.I00iiO, f, f2, null);
/* 1035 */                      iolIOll.I00l0I0l0lO1.I00000oOI.setValue(Boolean.TRUE);
/* 1039 */                      iolIOll.I00ilO0 = false;
/* 1041 */                      iolIOll.I00io1l = true;
                            }
/* 1043 */                  return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 914 */                   TextToSpeech textToSpeech = (TextToSpeech) this.I00iiI;
/* 918 */                   OoIoI0iii0 ooIoI0iii0 = (OoIoI0iii0) this.I00iio;
/* 922 */                   OI10i0Il oI10i0Il18 = (OI10i0Il) this.I00iiO;
/* 926 */                   OI10i0Il oI10i0Il19 = (OI10i0Il) this.I00ilI0I1;
/* 938 */                   if (((Boolean) oI10i0Il19.getValue()).booleanValue()) {
/* 940 */                       textToSpeech.stop();
/* 943 */                       ooIoI0iii0.I000O01llI0();
/* 950 */                       O010OIi o010OIi = (O010OIi) oI10i0Il18.getValue();
/* 953 */                       if (o010OIi != null) {
/* 955 */                           o010OIi.I000II(null);
                                }
/* 958 */                       oI10i0Il18.setValue(null);
                            }
/* 976 */                   oI10i0Il19.setValue(Boolean.valueOf(!((Boolean) oI10i0Il19.getValue()).booleanValue()));
/* 979 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 681 */                   O1i1O1I o1i1O1I = (O1i1O1I) this.I00iiI;
/* 685 */                   O1i1OolO o1i1OolO = (O1i1OolO) this.I00iio;
/* 689 */                   O1iI0OiI o1iI0OiI = (O1iI0OiI) this.I00ilI0I1;
/* 694 */                   OI10i0Il oI10i0Il20 = (OI10i0Il) this.I00iiO;
/* 696 */                   String strI001i1O0Ol = o1i1OolO.I001i1O0Ol();
/* 700 */                   String strI001IO000 = o1iI0OiI.I001IO000();
/* 704 */                   OlO0OIIl1 olO0OIIl1 = o1i1O1I.I0000O;
                            while (true) {
/* 706 */                       Object value = olO0OIIl1.getValue();
/* 711 */                       O1i1IIoO1IIl o1i1IIoO1IIl = (O1i1IIoO1IIl) value;
/* 713 */                       List<O1i1Ooo0ll> list = o1i1IIoO1IIl.I00000oIO;
/* 719 */                       int i4 = 10;
/* 725 */                       ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list, 10));
/* 736 */                       for (O1i1Ooo0ll o1i1Ooo0ll : list) {
/* 744 */                           O1i1OolO o1i1OolO2 = o1i1Ooo0ll.I00000oIO;
/* 754 */                           if (O0000Ioio00.I0000O(o1i1OolO2.I001i1O0Ol(), strI001i1O0Ol)) {
/* 756 */                               Iool1IOO1o0i<O1iI0OiI> iool1IOO1o0iI001IO000 = o1i1OolO2.I001IO000();
/* 766 */                               ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(iool1IOO1o0iI001IO000, i4));
/* 777 */                               for (O1iI0OiI o1iI0OiI2 : iool1IOO1o0iI001IO000) {
/* 793 */                                   if (O0000Ioio00.I0000O(o1iI0OiI2.I001IO000(), strI001IO000)) {
/* 799 */                                       O1i1oiOO0O o1i1oiOO0O = (O1i1oiOO0O) o1iI0OiI2.I00100o1O0lo();
/* 801 */                                       o1i1oiOO0O.I0000O();
/* 808 */                                       str2 = strI001i1O0Ol;
/* 811 */                                       ((O1iI0OiI) o1i1oiOO0O.I00iiI).I001i1lo1io(false);
/* 819 */                                       o1iI0OiI2 = (O1iI0OiI) o1i1oiOO0O.I00000oOI();
                                            } else {
/* 822 */                                       str2 = strI001i1O0Ol;
                                            }
/* 824 */                                   arrayList3.add(o1iI0OiI2);
/* 827 */                                   strI001i1O0Ol = str2;
                                        }
/* 832 */                               str = strI001i1O0Ol;
/* 838 */                               O1i1OO0O10Io o1i1OO0O10Io = (O1i1OO0O10Io) o1i1OolO2.I00100o1O0lo();
/* 840 */                               o1i1OO0O10Io.I0000O();
/* 847 */                               ((O1i1OolO) o1i1OO0O10Io.I00iiI).I0010o();
/* 850 */                               o1i1OO0O10Io.I000II(arrayList3);
/* 865 */                               o1i1Ooo0ll = new O1i1Ooo0ll((O1i1OolO) o1i1OO0O10Io.I00000oOI(), o1i1Ooo0ll.I00000oOI, o1i1Ooo0ll.I0000Il00O);
                                    } else {
/* 869 */                               str = strI001i1O0Ol;
                                    }
/* 871 */                           arrayList2.add(o1i1Ooo0ll);
/* 874 */                           strI001i1O0Ol = str;
/* 877 */                           i4 = 10;
                                }
/* 883 */                       String str6 = strI001i1O0Ol;
/* 885 */                       o1i1O1I.I000OiO(arrayList2);
/* 899 */                       if (olO0OIIl1.I000iOII(value, O1i1IIoO1IIl.I00000oIO(o1i1IIoO1IIl, arrayList2, false, null, 6))) {
/* 901 */                           oI10i0Il20.setValue(null);
/* 904 */                           return ooiIlOl1iI;
                                }
/* 908 */                       strI001i1O0Ol = str6;
                            }
                        case PoseLandmark.RIGHT_THUMB:
/* 321 */                   Ol1o1llOII ol1o1llOII2 = (Ol1o1llOII) this.I00iiI;
/* 325 */                   Function1 function12 = (Function1) this.I00iio;
/* 329 */                   OI10i0Il oI10i0Il21 = (OI10i0Il) this.I00iiO;
/* 333 */                   OIool0l11 oIool0l11 = (OIool0l11) this.I00ilI0I1;
/* 355 */                   List listI00IoIO0lI = OlOoOIi0o.I00IoIO0lI((String) iilooIoO0I.I00000oIO(ol1o1llOII2.get("Compatible accelerators"), ValueType.STRING), new String[]{","}, 6);
/* 361 */                   Object obj3 = ol1o1llOII2.get("Default max tokens");
/* 365 */                   ValueType valueType = ValueType.INT;
/* 373 */                   int iIntValue = ((Integer) iilooIoO0I.I00000oIO(obj3, valueType)).intValue();
/* 389 */                   int iIntValue2 = ((Integer) iilooIoO0I.I00000oIO(ol1o1llOII2.get("Default TopK"), valueType)).intValue();
/* 395 */                   Object obj4 = ol1o1llOII2.get("Default TopP");
/* 399 */                   ValueType valueType2 = ValueType.FLOAT;
/* 407 */                   float fFloatValue = ((Float) iilooIoO0I.I00000oIO(obj4, valueType2)).floatValue();
/* 423 */                   float fFloatValue2 = ((Float) iilooIoO0I.I00000oIO(ol1o1llOII2.get("Default temperature"), valueType2)).floatValue();
/* 429 */                   Object obj5 = ol1o1llOII2.get("Support image / vision / video");
/* 433 */                   ValueType valueType3 = ValueType.BOOLEAN;
/* 441 */                   boolean zBooleanValue = ((Boolean) iilooIoO0I.I00000oIO(obj5, valueType3)).booleanValue();
/* 457 */                   boolean zBooleanValue2 = ((Boolean) iilooIoO0I.I00000oIO(ol1o1llOII2.get("Support audio"), valueType3)).booleanValue();
/* 473 */                   boolean zBooleanValue3 = ((Boolean) iilooIoO0I.I00000oIO(ol1o1llOII2.get("Support mobile actions"), valueType3)).booleanValue();
/* 489 */                   boolean zBooleanValue4 = ((Boolean) iilooIoO0I.I00000oIO(ol1o1llOII2.get("Support thinking"), valueType3)).booleanValue();
/* 505 */                   boolean zBooleanValue5 = ((Boolean) iilooIoO0I.I00000oIO(ol1o1llOII2.get("Support speculative decoding"), valueType3)).booleanValue();
/* 509 */                   IoioiiIi1 ioioiiIi1I001IIilI0O = Ioiol1OIol.I001IIilI0O();
/* 517 */                   String str7 = (String) oI10i0Il21.getValue();
/* 519 */                   ioioiiIi1I001IIilI0O.I0000O();
/* 526 */                   ((Ioiol1OIol) ioioiiIi1I001IIilI0O.I00iiI).I001IO000(str7);
/* 531 */                   long jI000II = oIool0l11.I000II();
/* 535 */                   ioioiiIi1I001IIilI0O.I0000O();
/* 542 */                   ((Ioiol1OIol) ioioiiIi1I001IIilI0O.I00iiI).I001i1O0Ol(jI000II);
/* 545 */                   O11iO1i o11iO1iI00II0oii1o = O11iil.I00II0oii1o();
/* 553 */                   o11iO1iI00II0oii1o.I0000O();
/* 560 */                   ((O11iil) o11iO1iI00II0oii1o.I00iiI).I0010I0i(listI00IoIO0lI);
/* 563 */                   o11iO1iI00II0oii1o.I0000O();
/* 570 */                   ((O11iil) o11iO1iI00II0oii1o.I00iiI).I00IO1(iIntValue);
/* 573 */                   o11iO1iI00II0oii1o.I0000O();
/* 580 */                   ((O11iil) o11iO1iI00II0oii1o.I00iiI).I00IOO(iIntValue2);
/* 583 */                   o11iO1iI00II0oii1o.I0000O();
/* 590 */                   ((O11iil) o11iO1iI00II0oii1o.I00iiI).I00IioO0OiOi(fFloatValue);
/* 593 */                   o11iO1iI00II0oii1o.I0000O();
/* 600 */                   ((O11iil) o11iO1iI00II0oii1o.I00iiI).I00IO1oi11O(fFloatValue2);
/* 603 */                   o11iO1iI00II0oii1o.I0000O();
/* 610 */                   ((O11iil) o11iO1iI00II0oii1o.I00iiI).I00Io1lO(zBooleanValue);
/* 613 */                   o11iO1iI00II0oii1o.I0000O();
/* 620 */                   ((O11iil) o11iO1iI00II0oii1o.I00iiI).I00IlilI0i0i(zBooleanValue2);
/* 623 */                   o11iO1iI00II0oii1o.I0000O();
/* 630 */                   ((O11iil) o11iO1iI00II0oii1o.I00iiI).I00Io1o110i(zBooleanValue3);
/* 633 */                   o11iO1iI00II0oii1o.I0000O();
/* 640 */                   ((O11iil) o11iO1iI00II0oii1o.I00iiI).I00IoO0(zBooleanValue4);
/* 643 */                   o11iO1iI00II0oii1o.I0000O();
/* 650 */                   ((O11iil) o11iO1iI00II0oii1o.I00iiI).I00IoIO0lI(zBooleanValue5);
/* 657 */                   O11iil o11iil = (O11iil) o11iO1iI00II0oii1o.I00000oOI();
/* 659 */                   ioioiiIi1I001IIilI0O.I0000O();
/* 666 */                   ((Ioiol1OIol) ioioiiIi1I001IIilI0O.I00iiI).I001i1lo1io(o11iil);
/* 675 */                   function12.invoke((Ioiol1OIol) ioioiiIi1I001IIilI0O.I00000oOI());
/* 678 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 295 */                   IiloOlIoIool iiloOlIoIool = (IiloOlIoIool) this.I00iiI;
/* 299 */                   IiIooOOOI iiIooOOOI = (IiIooOOOI) this.I00iiO;
/* 303 */                   IlIoO1ilo1 ilIoO1ilo1 = (IlIoO1ilo1) this.I00iio;
/* 307 */                   IlIoO1ilo1 ilIoO1ilo12 = (IlIoO1ilo1) this.I00ilI0I1;
/* 311 */                   iiloOlIoIool.I0000Il00O.setValue(iiIooOOOI);
/* 314 */                   iiloOlIoIool.I0000O = ilIoO1ilo1;
/* 316 */                   iiloOlIoIool.I0000oI00 = ilIoO1ilo12;
/* 318 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 266 */                   String str8 = (String) this.I00iio;
/* 270 */                   Ii0110 ii01104 = (Ii0110) this.I00iiI;
/* 274 */                   OI10i0Il oI10i0Il22 = (OI10i0Il) this.I00iiO;
/* 278 */                   OI10i0Il oI10i0Il23 = (OI10i0Il) this.I00ilI0I1;
/* 280 */                   oI10i0Il22.setValue(str8);
/* 289 */                   iOi1II01i0.I0000O(ii01104, null, null, new II01OoOI1(oI10i0Il23, iOoil1iiIilo, 4), 3);
/* 292 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 211 */                   OOl1OlI0 oOl1OlI0 = (OOl1OlI0) this.I00iiI;
/* 215 */                   Ii0l0Olio10 ii0l0Olio10 = (Ii0l0Olio10) this.I00iio;
/* 219 */                   OI10i0Il oI10i0Il24 = (OI10i0Il) this.I00iiO;
/* 223 */                   OI10i0Il oI10i0Il25 = (OI10i0Il) this.I00ilI0I1;
/* 235 */                   if (!OlOoOIi0o.I001l0I00((String) oI10i0Il24.getValue()) && !((Boolean) oI10i0Il25.getValue()).booleanValue()) {
/* 257 */                       oOl1OlI0.I0000oI00((String) oI10i0Il24.getValue(), ii0l0Olio10.I00000oIO);
/* 260 */                       oI10i0Il24.setValue("");
                            }
/* 263 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 179 */                   OII11i oII11i = (OII11i) this.I00iiI;
/* 183 */                   OiO1Ooo0iil oiO1Ooo0iil = (OiO1Ooo0iil) this.I00iiO;
/* 187 */                   List list2 = (List) this.I00iio;
/* 191 */                   List list3 = (List) this.I00ilI0I1;
/* 195 */                   oII11i.I0000Il00O.setValue(oiO1Ooo0iil);
/* 200 */                   oII11i.I00000oOI.setValue(list2);
/* 205 */                   oII11i.I0000O.setValue(list3);
/* 208 */                   return ooiIlOl1iI;
                        case 27:
/* 141 */                   O1OIi1 o1OIi1 = (O1OIi1) this.I00iiI;
/* 145 */                   OilIlo oilIlo = (OilIlo) this.I00iio;
/* 149 */                   O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) this.I00ilI0I1;
/* 165 */                   if (((Boolean) ((OI10i0Il) this.I00iiO).getValue()).booleanValue()) {
/* 173 */                       oilIlo.I000II(o1oIOiI11o03);
                            } else {
/* 169 */                       o1OIi1.I00000oIO("android.permission.RECORD_AUDIO");
                            }
/* 176 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_ANKLE:
/* 81 */                    OI10i0Il oI10i0Il26 = (OI10i0Il) this.I00iiO;
/* 85 */                    I1IIIoOioIlI i1IIIoOioIlI = (I1IIIoOioIlI) this.I00iiI;
/* 89 */                    Context context4 = (Context) this.I00iio;
/* 93 */                    OI10i0Il oI10i0Il27 = (OI10i0Il) this.I00ilI0I1;
/* 95 */                    oI10i0Il26.setValue(i1IIIoOioIlI);
/* 100 */                   oI10i0Il27.setValue(Boolean.FALSE);
/* 105 */                   I1IIIoOioIlI.I00iiO.getClass();
/* 108 */                   String str9 = i1IIIoOioIlI.I00iOIl;
/* 116 */                   LocaleManager localeManager = (LocaleManager) context4.getSystemService(LocaleManager.class);
/* 118 */                   if (localeManager != null) {
/* 135 */                       localeManager.setApplicationLocales(str9.length() == 0 ? LocaleList.getEmptyLocaleList() : LocaleList.forLanguageTags(str9));
                            }
/* 138 */                   return ooiIlOl1iI;
                        default:
/* 30 */                    OI10i0Il oI10i0Il28 = (OI10i0Il) this.I00iiO;
/* 34 */                    OOii0O oOii0O = (OOii0O) this.I00iiI;
/* 38 */                    Context context5 = (Context) this.I00iio;
/* 42 */                    OI10i0Il oI10i0Il29 = (OI10i0Il) this.I00ilI0I1;
/* 44 */                    oI10i0Il28.setValue(oOii0O);
/* 49 */                    Oo0oii.I0001Ioi1lo.setValue(oOii0O);
/* 70 */                    context5.getSharedPreferences("box_settings", 0).edit().putString("ptyxis_palette", oOii0O.I00iOIl).apply();
/* 75 */                    oI10i0Il29.setValue(Boolean.FALSE);
/* 78 */                    return ooiIlOl1iI;
                    }
                }

/* 16 */        public I0IoO01lIoO(int i) {
/* 17 */            this.I00iOIl = i;
                }
            }
