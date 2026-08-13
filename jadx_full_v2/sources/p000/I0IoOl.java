            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Trace;
            import android.speech.SpeechRecognizer;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.ValueType;
            import com.google.ai.edge.gallery.ui.common.SavedSystemPrompt;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.mlkit.vision.barcode.BarcodeScanner;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.face.FaceDetector;
            import com.google.mlkit.vision.label.ImageLabeler;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.google.mlkit.vision.text.TextRecognizer;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            
            public final class I0IoOl implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public I0IoOl(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    Object value;
                    Object value2;
                    Object value3;
                    Ol0loOOoo ol0loOOoo;
                    ArrayList arrayList;
/* 3 */             int i = this.I00iOIl;
/* 5 */             int i2 = 3;
/* 6 */             int i3 = 0;
/* 7 */             int i4 = 1;
/* 11 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 12 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 1823 */                  Ii0110 ii0110 = (Ii0110) this.I00iio;
/* 1827 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 1831 */                  Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00ilO0;
/* 1835 */                  IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiO;
/* 1839 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 1843 */                  oI10i0Il.setValue(Boolean.TRUE);
/* 1851 */                  iOi1II01i0.I0000O(ii0110, null, null, new I0O0i0Olo0(ol010000lo00, illOOo00lI, null, 1), 3);
/* 1856 */                  oI10i0Il2.setValue(Boolean.FALSE);
/* 1859 */                  return ooiIlOl1iI;
                        case 1:
/* 1722 */                  Uri uri = (Uri) this.I00iio;
/* 1726 */                  Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00ilI0I1;
/* 1730 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiI;
/* 1734 */                  IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00iiO;
/* 1738 */                  IllOOo00lI illOOo00lI3 = (IllOOo00lI) this.I00ilO0;
/* 1740 */                  if (uri != null) {
/* 1744 */                      String strI00000oOI = Ol0o1l0ll0i.I00000oOI(ol0o1OiOIIIl.I0000Il00O, uri);
/* 1791 */                      if (strI00000oOI.length() != 0 ? IlIl10.I000iOII(ol0o1OiOIIIl.I0000Il00O.getFilesDir(), "skills/".concat(Pattern.compile("\\s+").matcher(strI00000oOI).replaceAll("-"))).exists() : false) {
/* 1795 */                          oI10i0Il3.setValue(Boolean.TRUE);
                                } else {
/* 1801 */                          I0O11iiio1 i0O11iiio1 = new I0O11iiio1(1);
/* 1804 */                          i0O11iiio1.I00iiI = illOOo00lI2;
/* 1806 */                          i0O11iiio1.I00iiO = illOOo00lI3;
/* 1808 */                          VarHandle.storeStoreFence();
/* 1817 */                          ol0o1OiOIIIl.I0010I0i(i0O11iiio1, new I01OoIoio00O(7));
                                }
                            }
/* 1820 */                  return ooiIlOl1iI;
                        case 2:
/* 1716 */                  iOi1II01i0.I0000O((IOO11li1OoII) this.I00iio, IiiIil1lOIO.I00000oIO, null, new I0iOI0o1i((I0iOIl) this.I00iiI, (Context) this.I00ilI0I1, (O1oIOiI11o0) this.I00ilO0, (I0IO1io0I) this.I00iiO, (IOoil1iiIilo) null, 0), 2);
/* 1719 */                  return ooiIlOl1iI;
                        case 3:
/* 1679 */                  ((OO1lio) this.I00iio).I00100l0((IllOOo00lI) this.I00iiO, (OO1loiii) this.I00iiI, (String) this.I00ilI0I1, (O0iOOoiioO) this.I00ilO0);
/* 1682 */                  return ooiIlOl1iI;
                        case 4:
/* 1426 */                  II0IOO1i iI0IOO1i = (II0IOO1i) this.I00ilO0;
/* 1430 */                  Ii0110 ii01102 = (Ii0110) this.I00iio;
/* 1434 */                  OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiI;
/* 1438 */                  OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00ilI0I1;
/* 1442 */                  OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iiO;
/* 1446 */                  oI10i0Il4.setValue(Boolean.TRUE);
/* 1451 */                  oI10i0Il5.setValue(Boolean.FALSE);
/* 1458 */                  String str = (String) oI10i0Il6.getValue();
/* 1460 */                  OlO0OIIl1 olO0OIIl1 = iI0IOO1i.I0000O;
/* 1474 */                  ArrayList arrayList2 = new ArrayList(((II0I0ili0) olO0OIIl1.getValue()).I00000oIO);
/* 1477 */                  Iterator it = arrayList2.iterator();
                            while (true) {
/* 1486 */                      if (!it.hasNext()) {
/* 1506 */                          i3 = -1;
                                } else if (!O0000Ioio00.I0000O(((II00Ol1Ii) it.next()).I00000oIO, str)) {
/* 1503 */                          i3++;
                                }
                            }
/* 1507 */                  if (i3 != -1) {
/* 1514 */                      II00Ol1Ii iI00Ol1Ii = (II00Ol1Ii) arrayList2.remove(i3);
/* 1548 */                      do {
/* 1516 */                          value = olO0OIIl1.getValue();
/* 1548 */                      } while (!olO0OIIl1.I000iOII(value, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), arrayList2, null, false, false, 0, 0, null, 126)));
/* 1550 */                      String str2 = iI00Ol1Ii.I00000oIO;
/* 1562 */                      II00Ol1Ii iI00Ol1Ii2 = ((II0I0ili0) iI0IOO1i.I0000oI00.I00iOIl.getValue()).I00000oOI;
/* 1574 */                      if (O0000Ioio00.I0000O(str2, iI00Ol1Ii2 != null ? iI00Ol1Ii2.I00000oIO : null)) {
/* 1610 */                          do {
/* 1576 */                              value2 = olO0OIIl1.getValue();
/* 1610 */                          } while (!olO0OIIl1.I000iOII(value2, II0I0ili0.I00000oIO((II0I0ili0) olO0OIIl1.getValue(), null, null, false, false, 0, 0, null, 125)));
                                }
/* 1612 */                      Ii1liIllli0 ii1liIllli0 = iI0IOO1i.I0000Il00O;
/* 1614 */                      ii1liIllli0.getClass();
/* 1622 */                      iOi1IOoIO0l.I00000oOI(new I1oO0ooi001(ii1liIllli0, i3, iOoil1iiIilo, i4));
                            } else {
/* 1647 */                      Log.w("AGBenchmarkVM", "Benchmark result with id " + str + " not found.");
                            }
/* 1655 */                  iOi1II01i0.I0000O(ii01102, null, null, new II01OoOI1(oI10i0Il4, iOoil1iiIilo, i4), 3);
/* 1658 */                  return ooiIlOl1iI;
                        case 5:
/* 1258 */                  II0IOO1i iI0IOO1i2 = (II0IOO1i) this.I00iio;
/* 1262 */                  Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00ilO0;
/* 1266 */                  OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00iiI;
/* 1270 */                  OI10i0Il oI10i0Il8 = (OI10i0Il) this.I00ilI0I1;
/* 1274 */                  OI10i0Il oI10i0Il9 = (OI10i0Il) this.I00iiO;
/* 1285 */                  O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) oI10i0Il7.getValue();
/* 1289 */                  Object obj = ol1o1llOII.get("Accelerator");
/* 1304 */                  String str3 = (String) iilooIoO0I.I00000oIO(obj != null ? obj : "", ValueType.STRING);
/* 1308 */                  Object obj2 = ol1o1llOII.get("Prefill tokens");
/* 1312 */                  if (obj2 == null) {
/* 1314 */                      obj2 = obj;
                            }
/* 1315 */                  ValueType valueType = ValueType.INT;
/* 1323 */                  int iIntValue = ((Integer) iilooIoO0I.I00000oIO(obj2, valueType)).intValue();
/* 1329 */                  Object obj3 = ol1o1llOII.get("Decode tokens");
/* 1333 */                  if (obj3 == null) {
/* 1335 */                      obj3 = obj;
                            }
/* 1342 */                  int iIntValue2 = ((Integer) iilooIoO0I.I00000oIO(obj3, valueType)).intValue();
/* 1348 */                  Object obj4 = ol1o1llOII.get("Number of runs");
/* 1379 */                  iOi1II01i0.I0000O(OooiooIOO.I00000oIO(iI0IOO1i2), IiiIil1lOIO.I00000oIO, null, new II0IOII0i0I(iI0IOO1i2, ((Integer) iilooIoO0I.I00000oIO(obj4 != null ? obj4 : 0, valueType)).intValue(), o1oIOiI11o0, str3, iIntValue, iIntValue2, null), 2);
/* 1382 */                  FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 1386 */                  if (firebaseAnalyticsI00000oIO != null) {
/* 1388 */                      Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 1392 */                      Bundle bundle = new Bundle();
/* 1399 */                      bundle.putString("event_type", "run_benchmark");
/* 1410 */                      bundle.putString("model_id", (String) oI10i0Il8.getValue());
/* 1415 */                      firebaseAnalyticsI00000oIO.I00000oIO("button_clicked", bundle);
                            }
/* 1420 */                  oI10i0Il9.setValue(Boolean.FALSE);
/* 1423 */                  return ooiIlOl1iI;
                        case 6:
/* 1169 */                  Context context = (Context) this.I00iio;
/* 1173 */                  OI10i0Il oI10i0Il10 = (OI10i0Il) this.I00iiI;
/* 1177 */                  OI10i0Il oI10i0Il11 = (OI10i0Il) this.I00ilI0I1;
/* 1181 */                  OI10i0Il oI10i0Il12 = (OI10i0Il) this.I00ilO0;
/* 1185 */                  OI10i0Il oI10i0Il13 = (OI10i0Il) this.I00iiO;
/* 1197 */                  if (!OlOoOIi0o.I001l0I00((String) oI10i0Il10.getValue())) {
/* 1236 */                      ArrayList arrayListI00OI1 = IOOi0Ool1i.I00OI1((List) oI10i0Il11.getValue(), new SavedSystemPrompt(null, OlOoOIi0o.I00OIo((String) oI10i0Il10.getValue()).toString(), (String) oI10i0Il12.getValue(), 1, null));
/* 1240 */                      oI10i0Il11.setValue(arrayListI00OI1);
/* 1243 */                      OiIlo1o1i.I00000oIO(context, arrayListI00OI1);
/* 1246 */                      oI10i0Il10.setValue("");
/* 1251 */                      oI10i0Il13.setValue(Boolean.FALSE);
                            }
/* 1254 */                  return ooiIlOl1iI;
                        case 7:
/* 1112 */                  Ii0110 ii01103 = (Ii0110) this.I00iio;
/* 1116 */                  OI10i0Il oI10i0Il14 = (OI10i0Il) this.I00iiI;
/* 1121 */                  OI10i0Il oI10i0Il15 = (OI10i0Il) this.I00ilI0I1;
/* 1126 */                  OI10i0Il oI10i0Il16 = (OI10i0Il) this.I00ilO0;
/* 1131 */                  ImageLabeler imageLabeler = (ImageLabeler) this.I00iiO;
/* 1138 */                  Bitmap bitmap = (Bitmap) oI10i0Il14.getValue();
/* 1140 */                  if (bitmap != null) {
/* 1145 */                      oI10i0Il15.setValue(Boolean.TRUE);
/* 1148 */                      oI10i0Il16.setValue("");
/* 1151 */                      IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 1163 */                      iOi1II01i0.I0000O(ii01103, Ii1oo1ooill0.I00iiI, null, new I0iOI0o1i(imageLabeler, bitmap, oI10i0Il16, oI10i0Il15, (IOoil1iiIilo) null, 23), 2);
                            }
/* 1166 */                  return ooiIlOl1iI;
                        case 8:
/* 1055 */                  Ii0110 ii01104 = (Ii0110) this.I00iio;
/* 1059 */                  OI10i0Il oI10i0Il17 = (OI10i0Il) this.I00iiI;
/* 1064 */                  OI10i0Il oI10i0Il18 = (OI10i0Il) this.I00ilI0I1;
/* 1069 */                  OI10i0Il oI10i0Il19 = (OI10i0Il) this.I00ilO0;
/* 1074 */                  TextRecognizer textRecognizer = (TextRecognizer) this.I00iiO;
/* 1081 */                  Bitmap bitmap2 = (Bitmap) oI10i0Il17.getValue();
/* 1083 */                  if (bitmap2 != null) {
/* 1088 */                      oI10i0Il18.setValue(Boolean.TRUE);
/* 1091 */                      oI10i0Il19.setValue("");
/* 1094 */                      IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 1106 */                      iOi1II01i0.I0000O(ii01104, Ii1oo1ooill0.I00iiI, null, new I0iOI0o1i(textRecognizer, bitmap2, oI10i0Il19, oI10i0Il18, (IOoil1iiIilo) null, 25), 2);
                            }
/* 1109 */                  return ooiIlOl1iI;
                        case 9:
/* 1000 */                  Ii0110 ii01105 = (Ii0110) this.I00iio;
/* 1004 */                  OI10i0Il oI10i0Il20 = (OI10i0Il) this.I00iiI;
/* 1009 */                  OI10i0Il oI10i0Il21 = (OI10i0Il) this.I00ilI0I1;
/* 1014 */                  OI10i0Il oI10i0Il22 = (OI10i0Il) this.I00ilO0;
/* 1019 */                  BarcodeScanner barcodeScanner = (BarcodeScanner) this.I00iiO;
/* 1026 */                  Bitmap bitmap3 = (Bitmap) oI10i0Il20.getValue();
/* 1028 */                  if (bitmap3 != null) {
/* 1033 */                      oI10i0Il21.setValue(Boolean.TRUE);
/* 1036 */                      oI10i0Il22.setValue("");
/* 1039 */                      IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 1049 */                      iOi1II01i0.I0000O(ii01105, Ii1oo1ooill0.I00iiI, null, new IlolO00ol(barcodeScanner, bitmap3, oI10i0Il22, oI10i0Il21, null), 2);
                            }
/* 1052 */                  return ooiIlOl1iI;
                        case 10:
/* 943 */                   Ii0110 ii01106 = (Ii0110) this.I00iio;
/* 947 */                   OI10i0Il oI10i0Il23 = (OI10i0Il) this.I00iiI;
/* 952 */                   OI10i0Il oI10i0Il24 = (OI10i0Il) this.I00ilI0I1;
/* 957 */                   OI10i0Il oI10i0Il25 = (OI10i0Il) this.I00ilO0;
/* 962 */                   FaceDetector faceDetector = (FaceDetector) this.I00iiO;
/* 969 */                   Bitmap bitmap4 = (Bitmap) oI10i0Il23.getValue();
/* 971 */                   if (bitmap4 != null) {
/* 976 */                       oI10i0Il24.setValue(Boolean.TRUE);
/* 979 */                       oI10i0Il25.setValue("");
/* 982 */                       IiI0oillOO10 iiI0oillOO104 = IiiIil1lOIO.I00000oIO;
/* 994 */                       iOi1II01i0.I0000O(ii01106, Ii1oo1ooill0.I00iiI, null, new I0iOI0o1i(faceDetector, bitmap4, oI10i0Il25, oI10i0Il24, (IOoil1iiIilo) null, 22), 2);
                            }
/* 997 */                   return ooiIlOl1iI;
                        case 11:
/* 867 */                   IllOOo00lI illOOo00lI4 = (IllOOo00lI) this.I00iiO;
/* 871 */                   IllOOo00lI illOOo00lI5 = (IllOOo00lI) this.I00iio;
/* 875 */                   i001ll1 i001ll1Var = (i001ll1) this.I00iiI;
/* 879 */                   OilIlo oilIlo = (OilIlo) this.I00ilI0I1;
/* 883 */                   SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.I00ilO0;
/* 889 */                   O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) illOOo00lI4.invoke();
/* 895 */                   O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) illOOo00lI5.invoke();
/* 897 */                   if (o1oIOiI11o02 != null) {
/* 899 */                       i001ll1Var.I000II(o1oIOiI11o02);
                            } else if (o1oIOiI11o03 != null) {
/* 905 */                       oilIlo.I000O01llI0(o1oIOiI11o03);
                            } else {
/* 909 */                       if (speechRecognizer != null) {
/* 911 */                           speechRecognizer.stopListening();
                                }
/* 914 */                       OlO0OIIl1 olO0OIIl12 = i001ll1Var.I00000oOI;
/* 937 */                       olO0OIIl12.I000lI(null, i001ilIoI.I00000oIO((i001ilIoI) olO0OIIl12.getValue(), false, false, null, null, false, 0.0f, null, 124));
                            }
/* 940 */                   return ooiIlOl1iI;
                        case 12:
/* 821 */                   IllOOo00lI illOOo00lI6 = (IllOOo00lI) this.I00iiO;
/* 825 */                   IllOOo00lI illOOo00lI7 = (IllOOo00lI) this.I00iio;
/* 829 */                   i001ll1 i001ll1Var2 = (i001ll1) this.I00iiI;
/* 833 */                   OilIlo oilIlo2 = (OilIlo) this.I00ilI0I1;
/* 837 */                   IllOOo00lI illOOo00lI8 = (IllOOo00lI) this.I00ilO0;
/* 843 */                   O1oIOiI11o0 o1oIOiI11o04 = (O1oIOiI11o0) illOOo00lI6.invoke();
/* 849 */                   if (illOOo00lI7.invoke() != null) {
/* 851 */                       i001ll1Var2.I0001Ioi1lo();
                            } else if (o1oIOiI11o04 != null) {
/* 857 */                       oilIlo2.I000II(o1oIOiI11o04);
                            } else {
/* 861 */                       illOOo00lI8.invoke();
                            }
/* 864 */                   return ooiIlOl1iI;
                        case 13:
/* 781 */                   O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iio;
/* 786 */                   Context context2 = (Context) this.I00iiI;
/* 791 */                   OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) this.I00ilI0I1;
/* 796 */                   O1oIOiI11o0 o1oIOiI11o05 = (O1oIOiI11o0) this.I00ilO0;
/* 800 */                   O11iO00I1o o11iO00I1o = (O11iO00I1o) this.I00iiO;
/* 805 */                   O1ol100o0O.I001lIiIIo1O(o1ol100o0O, context2, oloIl1l1oOii, o1oIOiI11o05, null, 24);
/* 815 */                   o11iO00I1o.I0000oI00(o1oIOiI11o05, new IO1iIooiI("Session re-initialized"));
/* 818 */                   return ooiIlOl1iI;
                        case 14:
/* 725 */                   Context context3 = (Context) this.I00iio;
/* 730 */                   O1oIOiI11o0 o1oIOiI11o06 = (O1oIOiI11o0) this.I00iiI;
/* 736 */                   List list = (List) this.I00ilI0I1;
/* 740 */                   O1ol100o0O o1ol100o0O2 = (O1ol100o0O) this.I00ilO0;
/* 744 */                   I0IoiIiOoi i0IoiIiOoi = (I0IoiIiOoi) this.I00iiO;
/* 746 */                   O111ooi11li o111ooi11li = O111ooi11li.I00000oIO;
/* 750 */                   O11IOOoiI10i o11IOOoiI10i = new O11IOOoiI10i(i2);
/* 753 */                   o11IOOoiI10i.I00iio = o1ol100o0O2;
/* 755 */                   o11IOOoiI10i.I00iiI = o1oIOiI11o06;
/* 757 */                   o11IOOoiI10i.I00iiO = i0IoiIiOoi;
/* 759 */                   VarHandle.storeStoreFence();
/* 49 */                    o111ooi11li.I0000O(context3, o1oIOiI11o06, false, false, o11IOOoiI10i, (Barcode.FORMAT_UPC_A & 64) != 0 ? null : O1o0l1li1ii.I00000oIO(), (Barcode.FORMAT_UPC_A & Barcode.FORMAT_ITF) != 0 ? Il01100l.I00iOIl : list, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_QR_CODE) == 0, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_UPC_A) != 0 ? null : null);
/* 777 */                   return ooiIlOl1iI;
                        case 15:
/* 487 */                   Ol0o1OiOIIIl ol0o1OiOIIIl2 = (Ol0o1OiOIIIl) this.I00iio;
/* 491 */                   Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00ilO0;
/* 495 */                   OI10i0Il oI10i0Il26 = (OI10i0Il) this.I00iiI;
/* 499 */                   OI10i0Il oI10i0Il27 = (OI10i0Il) this.I00ilI0I1;
/* 503 */                   OI10i0Il oI10i0Il28 = (OI10i0Il) this.I00iiO;
/* 509 */                   if (Ol0lllilO0Ol.I0000oI00(oI10i0Il26)) {
/* 511 */                       Set setI00iio = IOOi0Ool1i.I00iio(ol1o0O0O0);
/* 515 */                       OlO0OIIl1 olO0OIIl13 = ol0o1OiOIIIl2.I0000O;
/* 523 */                       List list2 = ((Ol0loOOoo) olO0OIIl13.getValue()).I00000oOI;
/* 529 */                       ArrayList arrayList3 = new ArrayList();
/* 540 */                       for (Object obj5 : list2) {
/* 559 */                           if (setI00iio.contains(((Ol0oI1llIloI) obj5).I00000oIO.I001i1O0Ol())) {
/* 561 */                               arrayList3.add(obj5);
                                    }
                                }
/* 573 */                       ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(arrayList3, 10));
/* 576 */                       Iterator it2 = arrayList3.iterator();
/* 584 */                       while (it2.hasNext()) {
/* 594 */                           arrayList4.add(((Ol0oI1llIloI) it2.next()).I00000oIO);
                                }
/* 602 */                       if (!arrayList4.isEmpty()) {
/* 677 */                           do {
/* 605 */                               value3 = olO0OIIl13.getValue();
/* 610 */                               ol0loOOoo = (Ol0loOOoo) value3;
/* 612 */                               List list3 = ol0loOOoo.I00000oOI;
/* 618 */                               arrayList = new ArrayList();
/* 629 */                               for (Object obj6 : list3) {
/* 648 */                                   if (!setI00iio.contains(((Ol0oI1llIloI) obj6).I00000oIO.I001i1O0Ol())) {
/* 650 */                                       arrayList.add(obj6);
                                            }
                                        }
/* 677 */                           } while (!olO0OIIl13.I000iOII(value3, Ol0loOOoo.I00000oIO(ol0loOOoo, false, arrayList, false, null, null, false, null, null, 253)));
/* 679 */                           IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(ol0o1OiOIIIl2);
/* 683 */                           IiI0oillOO10 iiI0oillOO105 = IiiIil1lOIO.I00000oIO;
/* 695 */                           iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new OO11OilO(arrayList4, ol0o1OiOIIIl2, setI00iio, null, 14), 2);
                                }
/* 700 */                       oI10i0Il26.setValue(Boolean.FALSE);
/* 703 */                       ol1o0O0O0.clear();
                            } else {
/* 713 */                       ol0o1OiOIIIl2.I000II((String) oI10i0Il27.getValue());
                            }
/* 718 */                   oI10i0Il28.setValue(Boolean.FALSE);
/* 721 */                   return ooiIlOl1iI;
                        case 16:
/* 480 */                   iOi1II01i0.I0000O((Ii0110) this.I00iio, null, null, new O1o1iI((Ol010000lo00) this.I00ilO0, (Function1) this.I00iiI, (OOo0ooi) this.I00ilI0I1, (Ol0o1OiOIIIl) this.I00iiO, (IOoil1iiIilo) null, 10), 3);
/* 483 */                   return ooiIlOl1iI;
                        case 17:
/* 281 */                   OlI1IliO0I olI1IliO0I = (OlI1IliO0I) this.I00iio;
/* 285 */                   O1oIOiI11o0 o1oIOiI11o07 = (O1oIOiI11o0) this.I00ilO0;
/* 289 */                   Context context4 = (Context) this.I00iiO;
/* 299 */                   iO10II1oIll0.I00000oOI((OI10i0Il) this.I00iiI, (OI10i0Il) this.I00ilI0I1);
/* 302 */                   OlO0OIIl1 olO0OIIl14 = olI1IliO0I.I00000oOI;
/* 304 */                   Object obj7 = o1oIOiI11o07.I00IlilI0i0i;
/* 314 */                   OlI0o1 olI0o1 = obj7 instanceof OlI0o1 ? (OlI0o1) obj7 : null;
/* 315 */                   if (olI0o1 == null) {
/* 337 */                       olO0OIIl14.I000lI(null, OlI1Il1.I00000oIO((OlI1Il1) olO0OIIl14.getValue(), null, 0, false, 0.0f, null, "Model not loaded.", 31));
                            } else {
/* 353 */                       String string = OlOoOIi0o.I00OIo(((OlI1Il1) olO0OIIl14.getValue()).I00000oIO).toString();
/* 361 */                       if (string.length() == 0) {
/* 383 */                           olO0OIIl14.I000lI(null, OlI1Il1.I00000oIO((OlI1Il1) olO0OIIl14.getValue(), null, 0, false, 0.0f, null, "Enter a description first.", 31));
                                } else if (!((OlI1Il1) olO0OIIl14.getValue()).I0000Il00O) {
/* 421 */                           olO0OIIl14.I000lI(null, OlI1Il1.I00000oIO((OlI1Il1) olO0OIIl14.getValue(), null, 0, true, 0.0f, null, null, 3));
/* 445 */                           olI1IliO0I.I0000O = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(olI1IliO0I), IiiIil1lOIO.I00000oIO, null, new O1o1iI((Object) olI0o1, string, (OooioIIoi0O) olI1IliO0I, context4.getApplicationContext(), (IOoil1iiIilo) null, 12), 2);
                                }
                            }
/* 447 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 111 */                   OlI1i0 olI1i0 = (OlI1i0) this.I00iio;
/* 115 */                   O1oIOiI11o0 o1oIOiI11o08 = (O1oIOiI11o0) this.I00ilO0;
/* 119 */                   Context context5 = (Context) this.I00iiO;
/* 129 */                   iO10OIiI0i.I00000oOI((OI10i0Il) this.I00iiI, (OI10i0Il) this.I00ilI0I1);
/* 132 */                   OlO0OIIl1 olO0OIIl15 = olI1i0.I00000oOI;
/* 134 */                   Object obj8 = o1oIOiI11o08.I00IlilI0i0i;
/* 144 */                   OlI0iOo olI0iOo = obj8 instanceof OlI0iOo ? (OlI0iOo) obj8 : null;
/* 145 */                   if (olI0iOo == null) {
/* 167 */                       olO0OIIl15.I000lI(null, OlI1OoIO0.I00000oIO((OlI1OoIO0) olO0OIIl15.getValue(), null, 0, false, 0.0f, null, "Model not loaded.", 31));
                            } else {
/* 183 */                       String string2 = OlOoOIi0o.I00OIo(((OlI1OoIO0) olO0OIIl15.getValue()).I00000oIO).toString();
/* 191 */                       if (string2.length() == 0) {
/* 213 */                           olO0OIIl15.I000lI(null, OlI1OoIO0.I00000oIO((OlI1OoIO0) olO0OIIl15.getValue(), null, 0, false, 0.0f, null, "Enter a description first.", 31));
                                } else if (!((OlI1OoIO0) olO0OIIl15.getValue()).I0000Il00O) {
/* 251 */                           olO0OIIl15.I000lI(null, OlI1OoIO0.I00000oIO((OlI1OoIO0) olO0OIIl15.getValue(), null, 0, true, 0.0f, null, null, 3));
/* 275 */                           olI1i0.I0000O = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(olI1i0), IiiIil1lOIO.I00000oIO, null, new O1o1iI((Object) olI0iOo, string2, (OooioIIoi0O) olI1i0, context5.getApplicationContext(), (IOoil1iiIilo) null, 14), 2);
                                }
                            }
/* 277 */                   return ooiIlOl1iI;
                        default:
/* 19 */                    Oli0oiO oli0oiO = (Oli0oiO) this.I00iio;
/* 23 */                    IiIooOOOI iiIooOOOI = (IiIooOOOI) this.I00iiI;
/* 27 */                    Oli100iIoOOO oli100iIoOOO = (Oli100iIoOOO) this.I00ilI0I1;
/* 31 */                    Oli100iIoOOO oli100iIoOOO2 = (Oli100iIoOOO) this.I00ilO0;
/* 35 */                    OOo0ll111 oOo0ll111 = (OOo0ll111) this.I00iiO;
/* 37 */                    Oi0iOio oi0iOio = oli0oiO.I00oII;
/* 39 */                    Oli01I0I01 oli01I0I01 = oli0oiO.I00oI0i;
/* 41 */                    oi0iOio.getClass();
/* 46 */                    Trace.beginSection("Compose:Styles:build");
                            try {
/* 49 */                        oi0iOio.I00iiI = oli0oiO;
/* 55 */                        oi0iOio.I00iOIl = iiIooOOOI.I00000oIO();
/* 57 */                        Oli100iIoOOO oli100iIoOOO3 = oi0iOio.I00iiO;
/* 59 */                        Oli100iIoOOO oli100iIoOOO4 = oi0iOio.I00iio;
/* 61 */                        if (oli100iIoOOO4 != null) {
/* 65 */                            Oli1010II.I000o00OoI0I.I0001Ioi1lo(oli100iIoOOO4);
                                } else {
/* 71 */                            oli100iIoOOO4 = new Oli100iIoOOO();
                                }
/* 74 */                        oi0iOio.I00iiO = oli100iIoOOO4;
/* 76 */                        oi0iOio.I00iio = oli100iIoOOO3;
/* 78 */                        oi0iOio.I00l0I0l0lO1 = null;
/* 80 */                        oli01I0I01.I00000oIO(oi0iOio);
/* 83 */                        oi0iOio.I0000O();
/* 86 */                        Trace.endSection();
/* 89 */                        oi0iOio.I000OOo1O(0, oli100iIoOOO);
/* 92 */                        oli0oiO.I00oIiI10 = oli100iIoOOO;
/* 94 */                        oli0oiO.I00oO101o = oli100iIoOOO2;
/* 100 */                       oOo0ll111.I00iOIl = oi0iOio.I0001Ioi1lo();
/* 102 */                       return ooiIlOl1iI;
                            } catch (Throwable th) {
/* 104 */                       Trace.endSection();
/* 107 */                       throw th;
                            }
                    }
                }
            }
