            package p000;

            import android.app.UiModeManager;
            import android.content.Context;
            import android.os.Bundle;
            import android.speech.SpeechRecognizer;
            import android.speech.tts.TextToSpeech;
            import android.widget.Toast;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.BufferedInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.net.HttpURLConnection;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            
/* 15 */    public final class I0O1IO implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public I0O1IO(Function1 function1, O1ol100o0O o1ol100o0O, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2) {
/* 3 */             this.I00iOIl = 17;
/* 8 */             this.I00iiI = function1;
/* 10 */            this.I00iiO = o1ol100o0O;
/* 12 */            this.I00ilI0I1 = oI10i0Il;
/* 14 */            this.I00iio = oI10i0Il2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:337:0x0bf2  */
                /* JADX WARN: Removed duplicated region for block: B:340:0x0c02  */
                /* JADX WARN: Removed duplicated region for block: B:342:0x0c05  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x02fa  */
                /* JADX WARN: Type inference failed for: r15v9, types: [java.util.Set] */
                /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v25, types: [Ii1l01l] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) throws I1o1lOlooI1, IOException {
                    IoOIoo ioOIoo;
                    BufferedInputStream bufferedInputStream;
                    BufferedInputStream bufferedInputStream2;
                    IIIoloiiI1 oOlI10o1ol;
                    InputStream inputStream;
                    IOoOloI0iI iOoOloI0iII00000oIO;
                    IIIoloiiI1 ii1l01l;
                    int i;
                    Iterator it;
                    int i2;
                    OoiIlOl1iI ooiIlOl1iI;
                    long j;
                    O1oIOiI11o0 o1oIOiI11o0;
                    OloIl1l1oOii oloIl1l1oOiiI00000oOI;
                    ArrayList arrayList;
                    Object next;
/* 3 */             int i3 = this.I00iOIl;
/* 7 */             Il01100l il01100l = Il01100l.I00iOIl;
/* 9 */             int i4 = 24;
/* 11 */            String str = "";
/* 16 */            int i5 = 3;
/* 17 */            int i6 = 2;
/* 18 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 19 */            int i7 = 0;
/* 20 */            int i8 = 1;
/* 21 */            OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
                    switch (i3) {
                        case 0:
/* 3110 */                  Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00iiI;
/* 3114 */                  IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiO;
/* 3118 */                  IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00iio;
/* 3122 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 3130 */                  I0O11iiio1 i0O11iiio1 = new I0O11iiio1(2);
/* 3133 */                  i0O11iiio1.I00iiI = illOOo00lI;
/* 3135 */                  i0O11iiio1.I00iiO = illOOo00lI2;
/* 3137 */                  VarHandle.storeStoreFence();
/* 3144 */                  I0Il0IoIIOll i0Il0IoIIOll = new I0Il0IoIIOll(10);
/* 3147 */                  i0Il0IoIIOll.I00iiI = oI10i0Il;
/* 3149 */                  VarHandle.storeStoreFence();
/* 3152 */                  ol0o1OiOIIIl.I0010o(i0O11iiio1, (String) obj, i0Il0IoIIOll);
                            break;
                        case 1:
/* 2694 */                  Ii00l101O ii00l101O = (Ii00l101O) this.I00iiI;
/* 2698 */                  IOiOol0 iOiOol0 = (IOiOol0) this.I00iiO;
/* 2702 */                  OIio0oloI1I oIio0oloI1I = (OIio0oloI1I) this.I00iio;
/* 2706 */                  Ilo0Ooi ilo0Ooi = (Ilo0Ooi) this.I00ilI0I1;
/* 2710 */                  HttpURLConnection httpURLConnection = (HttpURLConnection) obj;
/* 2712 */                  int responseCode = httpURLConnection.getResponseCode();
/* 2716 */                  String responseMessage = httpURLConnection.getResponseMessage();
/* 2720 */                  if (responseMessage != null) {
/* 2724 */                      ioOIoo = new IoOIoo(responseCode, responseMessage);
                            } else {
/* 2738 */                      IoOIoo ioOIoo2 = (IoOIoo) IoOIoo.I00ioIO.get(Integer.valueOf(responseCode));
/* 2740 */                      if (ioOIoo2 == null) {
/* 2746 */                          ioOIoo2 = new IoOIoo(responseCode, "Unknown Status Code");
                                }
/* 2749 */                      ioOIoo = ioOIoo2;
                            }
/* 2778 */                  if (IOOi1I.I000O01llI0(304, 204).contains(Integer.valueOf(responseCode))) {
/* 2782 */                      IIIoloiiI1.I00000oIO.getClass();
/* 2785 */                      oOlI10o1ol = IIIolloil.I00000oOI;
                            } else {
                                try {
/* 2790 */                          inputStream = httpURLConnection.getInputStream();
                                } catch (IOException unused) {
/* 2812 */                          InputStream errorStream = httpURLConnection.getErrorStream();
/* 2816 */                          if (errorStream != null) {
/* 2820 */                              if (errorStream instanceof BufferedInputStream) {
/* 2822 */                                  bufferedInputStream2 = (BufferedInputStream) errorStream;
                                        } else {
/* 2827 */                                  bufferedInputStream = new BufferedInputStream(errorStream, 8192);
                                        }
                                    }
                                }
/* 2794 */                      if (inputStream == null) {
/* 2810 */                          bufferedInputStream2 = null;
                                } else if (inputStream instanceof BufferedInputStream) {
/* 2800 */                          bufferedInputStream2 = (BufferedInputStream) inputStream;
                                } else {
/* 2805 */                          bufferedInputStream = new BufferedInputStream(inputStream, 8192);
/* 2808 */                          bufferedInputStream2 = bufferedInputStream;
                                }
/* 2831 */                      if (bufferedInputStream2 != null) {
/* 2833 */                          int i9 = IIIioiO0Io.I00000oIO;
/* 2837 */                          int i10 = O0I0ooIlIiO0.I00000oIO;
/* 2841 */                          Ioo00OOI0II ioo00OOI0II = new Ioo00OOI0II();
/* 2844 */                          ioo00OOI0II.I00iOIl = bufferedInputStream2;
/* 2846 */                          VarHandle.storeStoreFence();
/* 2849 */                          oOlI10o1ol = new OOlI10o1ol(ioo00OOI0II, ii00l101O);
                                } else {
/* 2855 */                          IIIoloiiI1.I00000oIO.getClass();
/* 2858 */                          oOlI10o1ol = IIIolloil.I00000oOI;
                                }
                            }
/* 2860 */                  Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
/* 2874 */                  LinkedHashMap linkedHashMap = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(headerFields.size()));
/* 2883 */                  Iterator it2 = headerFields.entrySet().iterator();
/* 2891 */                  while (it2.hasNext()) {
/* 2897 */                      Map.Entry entry = (Map.Entry) it2.next();
/* 2903 */                      String str2 = (String) entry.getKey();
/* 2921 */                      linkedHashMap.put(str2 != null ? str2.toLowerCase(Locale.getDefault()) : "", entry.getValue());
                            }
/* 2927 */                  LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 2942 */                  for (Map.Entry entry2 : linkedHashMap.entrySet()) {
/* 2960 */                      if (!OlOoOIi0o.I001l0I00((CharSequence) entry2.getKey())) {
/* 2970 */                          linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                }
                            }
/* 2976 */                  Io1OIO1 io1OIO1 = new Io1OIO1(linkedHashMap2, true);
/* 2991 */                  if (((OiIO00I) ((IOlOl10) iOiOol0.I00io1l).I0000O(IoO110.I00000oIO)) != null) {
/* 2995 */                      String strI000iOII = io1OIO1.I000iOII("Content-Type");
/* 2999 */                      if (strI000iOII != null) {
/* 3001 */                          IOoOloI0iI iOoOloI0iI = IOoOloI0iI.I0000oI00;
/* 3003 */                          iOoOloI0iII00000oIO = iioIIll1.I00000oIO(strI000iOII);
                                } else {
/* 3008 */                          iOoOloI0iII00000oIO = null;
                                }
/* 3015 */                      if (!(((OIio0oloI1I) iOiOol0.I00ilI0I1) instanceof OiIIoIIIii) || O0000Ioio00.I0000O(((IOlOl10) iOiOol0.I00io1l).I0000O(OiIOOIOIo.I0000O), Boolean.TRUE)) {
/* 3075 */                          ii1l01l = null;
/* 3076 */                          if (ii1l01l != null) {
/* 3078 */                              oOlI10o1ol = ii1l01l;
                                    }
                                } else if (ioOIoo.equals(IoOIoo.I00iiO)) {
/* 3057 */                          if (!O0000Ioio00.I0000O(iOoOloI0iII00000oIO != null ? iOoOloI0iII00000oIO.I0000Il00O() : null, IOoOiii0.I00000oOI)) {
                                    }
/* 3071 */                          ii1l01l = new Ii1l01l((OiIIoIIIii) oIio0oloI1I, oOlI10o1ol);
/* 3076 */                          if (ii1l01l != null) {
                                    }
                                } else {
/* 3065 */                          if (ioOIoo.equals(IoOIoo.I00ilI0I1)) {
/* 3071 */                              ii1l01l = new Ii1l01l((OiIIoIIIii) oIio0oloI1I, oOlI10o1ol);
                                    }
/* 3076 */                          if (ii1l01l != null) {
                                    }
                                }
                            }
/* 3081 */                  IoO1ollo10 ioO1ollo10 = new IoO1ollo10();
/* 3084 */                  ioO1ollo10.I00000oIO = ioOIoo;
/* 3086 */                  ioO1ollo10.I00000oOI = ilo0Ooi;
/* 3088 */                  ioO1ollo10.I0000Il00O = io1OIO1;
/* 3090 */                  ioO1ollo10.I0000O = oOlI10o1ol;
/* 3092 */                  ioO1ollo10.I0000oI00 = ii00l101O;
/* 3100 */                  ioO1ollo10.I0001Ioi1lo = Ii1Oii0oIo.I00000oIO(null);
/* 3102 */                  VarHandle.storeStoreFence();
                            break;
                        case 2:
/* 2620 */                  I10i01 i10i01 = (I10i01) this.I00iiI;
/* 2624 */                  I110IiI1I1 i110IiI1I1 = (I110IiI1I1) this.I00iiO;
/* 2628 */                  Function1 function1 = (Function1) this.I00iio;
/* 2632 */                  OOo0l0ii10l oOo0l0ii10l = (OOo0l0ii10l) this.I00ilI0I1;
/* 2636 */                  I110IIooo i110IIooo = (I110IIooo) obj;
/* 2640 */                  lOiIo0.I000OOo1O(i110IIooo, i10i01.I0000Il00O);
/* 2643 */                  OIooliIO0 oIooliIO0 = i110IIooo.I0000oI00;
/* 2649 */                  Object objI00000oOI = i10i01.I00000oOI(oIooliIO0.getValue());
/* 2661 */                  if (O0000Ioio00.I0000O(objI00000oOI, oIooliIO0.getValue())) {
/* 2686 */                      if (function1 != null) {
/* 2688 */                          function1.invoke(i10i01);
                                    break;
                                }
                            } else {
/* 2667 */                      i10i01.I0000Il00O.I00iiI.setValue(objI00000oOI);
/* 2672 */                      i110IiI1I1.I00iiI.setValue(objI00000oOI);
/* 2675 */                      if (function1 != null) {
/* 2677 */                          function1.invoke(i10i01);
                                }
/* 2680 */                      i110IIooo.I00000oIO();
/* 2683 */                      oOo0l0ii10l.I00iOIl = true;
                                break;
                            }
                            break;
                        case 3:
/* 2588 */                  IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iiI;
/* 2592 */                  O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00iiO;
/* 2596 */                  Ili1iIl ili1iIl = (Ili1iIl) this.I00iio;
/* 2600 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 2606 */                  illiIl1l11O.invoke(o1oIOiI11o02, (List) obj);
/* 2609 */                  oI10i0Il2.setValue("");
/* 2612 */                  Ili1iIl.I00000oIO(ili1iIl);
                            break;
                        case 4:
/* 2519 */                  OIOOoO1O1oO oIOOoO1O1oO = (OIOOoO1O1oO) this.I00iiI;
/* 2523 */                  Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00iiO;
/* 2527 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00ilI0I1;
/* 2531 */                  OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iio;
/* 2545 */                  oI10i0Il3.setValue(Boolean.valueOf(((IliI0101O0Oi) obj).I00000oOI()));
/* 2558 */                  if (!((Boolean) oI10i0Il3.getValue()).booleanValue()) {
/* 2580 */                      oI10i0Il4.setValue(IOll1OIIi0O1.I000II(oIOOoO1O1oO.I000II, ((Float) ol1o1llOII.get(oIOOoO1O1oO.I0000Il00O.I00000oOI)).floatValue()));
                                break;
                            }
                            break;
                        case 5:
/* 2439 */                  O0oIlOolIO o0oIlOolIO = (O0oIlOolIO) this.I00iiI;
/* 2443 */                  Oo0Oo0 oo0Oo0 = (Oo0Oo0) this.I00iiO;
/* 2447 */                  Oo0OI01Il oo0OI01Il = (Oo0OI01Il) this.I00iio;
/* 2451 */                  IoiiO1O1 ioiiO1O1 = (IoiiO1O1) this.I00ilI0I1;
/* 2461 */                  if (o0oIlOolIO.I00000oOI()) {
/* 2463 */                      I1I0i0Ilo1Oi i1I0i0Ilo1Oi = o0oIlOolIO.I0000O;
/* 2465 */                      IOooI1o iOooI1o = o0oIlOolIO.I001IO000;
/* 2467 */                      IOooI1o iOooI1o2 = o0oIlOolIO.I001i1O0Ol;
/* 2471 */                      OOo0ooi oOo0ooi = new OOo0ooi();
/* 2478 */                      O11IOOoiI10i o11IOOoiI10i = new O11IOOoiI10i(14);
/* 2481 */                      o11IOOoiI10i.I00iiI = i1I0i0Ilo1Oi;
/* 2483 */                      o11IOOoiI10i.I00iiO = iOooI1o;
/* 2485 */                      o11IOOoiI10i.I00iio = oOo0ooi;
/* 2487 */                      VarHandle.storeStoreFence();
/* 2490 */                      OO1OOi oO1OOi = oo0Oo0.I00000oIO;
/* 2492 */                      oO1OOi.I0000Il00O(oo0OI01Il, ioiiO1O1, o11IOOoiI10i, iOooI1o2);
/* 2497 */                      Oo0i01111o oo0i01111o = new Oo0i01111o(oo0Oo0, oO1OOi);
/* 2502 */                      oo0Oo0.I00000oOI.set(oo0i01111o);
/* 2505 */                      oOo0ooi.I00iOIl = oo0i01111o;
/* 2507 */                      o0oIlOolIO.I0000oI00 = oo0i01111o;
                            }
                            break;
                        case 6:
/* 2401 */                  Set set = (Set) this.I00iiI;
/* 2403 */                  Object obj2 = this.I00iiO;
/* 2407 */                  Set set2 = (Set) this.I00iio;
/* 2411 */                  OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00ilI0I1;
/* 2417 */                  set.add(obj2);
/* 2422 */                  Ii1iOil1o ii1iOil1o = new Ii1iOil1o();
/* 2425 */                  ii1iOil1o.I00000oIO = set;
/* 2427 */                  ii1iOil1o.I00000oOI = obj2;
/* 2429 */                  ii1iOil1o.I0000Il00O = set2;
/* 2431 */                  ii1iOil1o.I0000O = oI10i0Il5;
/* 2433 */                  VarHandle.storeStoreFence();
                            break;
                        case 7:
/* 2318 */                  OOo0lO oOo0lO = (OOo0lO) this.I00iiI;
/* 2322 */                  OiOiliiO oiOiliiO = (OiOiliiO) this.I00iiO;
/* 2326 */                  OOo0lO oOo0lO2 = (OOo0lO) this.I00iio;
/* 2330 */                  Ii1oIilI ii1oIilI = (Ii1oIilI) this.I00ilI0I1;
/* 2334 */                  I110IIooo i110IIooo2 = (I110IIooo) obj;
/* 2350 */                  float fFloatValue = ((Number) i110IIooo2.I0000oI00.getValue()).floatValue() - oOo0lO.I00iOIl;
/* 2351 */                  float fI00000oIO = oiOiliiO.I00000oIO(fFloatValue);
/* 2367 */                  oOo0lO.I00iOIl = ((Number) i110IIooo2.I0000oI00.getValue()).floatValue();
/* 2379 */                  oOo0lO2.I00iOIl = ((Number) i110IIooo2.I00000oOI()).floatValue();
/* 2390 */                  if (Math.abs(fFloatValue - fI00000oIO) > 0.5f) {
/* 2392 */                      i110IIooo2.I00000oIO();
                            }
/* 2395 */                  ii1oIilI.getClass();
                            break;
                        case 8:
/* 2206 */                  ArrayList arrayList2 = (ArrayList) this.I00iiI;
/* 2210 */                  ArrayList arrayList3 = (ArrayList) this.I00iiO;
/* 2214 */                  Function1 function12 = (Function1) this.I00iio;
/* 2218 */                  Context context = (Context) this.I00ilI0I1;
/* 2222 */                  O0lolo o0lolo = (O0lolo) obj;
/* 2228 */                  O0lolo.I0000O(o0lolo, null, i1i0IooiOOI.I0000oI00, 3);
/* 2236 */                  int size = (arrayList2.size() + 1) / 2;
/* 2239 */                  int i11 = 0;
/* 2240 */                  IloIllo1i0 iloIllo1i0 = new IloIllo1i0(i11);
/* 2243 */                  iloIllo1i0.I00iiI = arrayList2;
/* 2245 */                  iloIllo1i0.I00iiO = function12;
/* 2247 */                  VarHandle.storeStoreFence();
/* 4 */                     o0lolo.I0000oI00(size, null, IiOi0I1.I00ol1, new IOii1l(1307313588, iloIllo1i0, true));
/* 2263 */                  IloIlooo iloIlooo = new IloIlooo(i11);
/* 2266 */                  iloIlooo.I00iiI = context;
/* 2268 */                  VarHandle.storeStoreFence();
/* 2281 */                  O0lolo.I0000O(o0lolo, null, new IOii1l(818164358, iloIlooo, true), 3);
/* 2289 */                  int size2 = (arrayList3.size() + 1) / 2;
/* 2292 */                  IloIllo1i0 iloIllo1i02 = new IloIllo1i0(i8);
/* 2295 */                  iloIllo1i02.I00iiI = arrayList3;
/* 2297 */                  iloIllo1i02.I00iiO = function12;
/* 2299 */                  VarHandle.storeStoreFence();
/* 4 */                     o0lolo.I0000oI00(size2, null, IiOi0I1.I00ol1, new IOii1l(-1777628515, iloIllo1i02, true));
                            break;
                        case 9:
/* 1737 */                  O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiI;
/* 1741 */                  Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 1745 */                  OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00ilI0I1;
/* 1750 */                  Ol1OlloIO ol1OlloIO = (Ol1OlloIO) this.I00iio;
/* 1754 */                  Ioiol1OIol ioiol1OIol = (Ioiol1OIol) obj;
/* 1756 */                  Ii1liIllli0 ii1liIllli0 = o1ol100o0O.I0000Il00O;
/* 1758 */                  OOli1O oOli1O = o1ol100o0O.I000OOo1O;
/* 1760 */                  ioiol1OIol.toString();
/* 1763 */                  O1oIOiI11o0 o1oIOiI11o0I000lI = O1ol100o0O.I000lI(ioiol1OIol);
/* 1767 */                  String str3 = o1oIOiI11o0I000lI.I00000oIO;
/* 1793 */                  Iterator it3 = o1ol100o0O.I001i1lo1io(Oio0lI.I0000O("llm_chat", "llm_ask_image", "llm_ask_audio", "llm_prompt_lab", "llm_mobile_actions", "llm_agent_chat")).iterator();
/* 1801 */                  while (it3.hasNext()) {
/* 1807 */                      OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) it3.next();
/* 1809 */                      ArrayList arrayList4 = oloIl1l1oOii.I000OiO;
/* 1811 */                      String str4 = oloIl1l1oOii.I00000oIO;
/* 1813 */                      Iterator it4 = arrayList4.iterator();
/* 1817 */                      int i12 = i7;
                                while (true) {
/* 1823 */                          if (it4.hasNext()) {
/* 1831 */                              O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) it4.next();
/* 1837 */                              it = it3;
/* 1845 */                              if (O0000Ioio00.I0000O(ioiol1OIol.I0010I0i(), o1oIOiI11o03.I00000oIO) && o1oIOiI11o03.I00IOO) {
/* 1851 */                                  i2 = i12;
                                        } else {
/* 1854 */                                  i12++;
/* 1856 */                                  it3 = it;
                                        }
                                    } else {
/* 1861 */                              it = it3;
/* 1863 */                              i2 = -1;
                                    }
                                }
/* 1864 */                      if (i2 >= 0) {
/* 1866 */                          arrayList4.remove(i2);
                                }
/* 1875 */                      if ((O0000Ioio00.I0000O(str4, "llm_ask_image") && o1oIOiI11o0I000lI.I001i1O0Ol) || (O0000Ioio00.I0000O(str4, "llm_ask_audio") && o1oIOiI11o0I000lI.I001i1lo1io)) {
/* 1882 */                          ooiIlOl1iI = ooiIlOl1iI2;
                                } else {
/* 1903 */                          ooiIlOl1iI = ooiIlOl1iI2;
/* 1905 */                          if ((!O0000Ioio00.I0000O(str4, "llm_mobile_actions") || !o1oIOiI11o0I000lI.I001l0I00) && (O0000Ioio00.I0000O(str4, "llm_ask_image") || O0000Ioio00.I0000O(str4, "llm_ask_audio") || O0000Ioio00.I0000O(str4, "llm_mobile_actions"))) {
                                    }
/* 1945 */                          oloIl1l1oOii.I0010o.setValue(Long.valueOf(System.currentTimeMillis()));
/* 1948 */                          it3 = it;
/* 1950 */                          ooiIlOl1iI2 = ooiIlOl1iI;
/* 1954 */                          i7 = 0;
                                }
/* 1929 */                      arrayList4.add(o1oIOiI11o0I000lI);
/* 1932 */                      o1oIOiI11o0I000lI.I0000Il00O();
/* 1945 */                      oloIl1l1oOii.I0010o.setValue(Long.valueOf(System.currentTimeMillis()));
/* 1948 */                      it3 = it;
/* 1950 */                      ooiIlOl1iI2 = ooiIlOl1iI;
/* 1954 */                      i7 = 0;
                            }
/* 1957 */                  OoiIlOl1iI ooiIlOl1iI3 = ooiIlOl1iI2;
/* 1959 */                  OlO0OIIl1 olO0OIIl1 = oOli1O.I00iOIl;
/* 1971 */                  LinkedHashMap linkedHashMap3 = new LinkedHashMap(((O1oiOloOo) olO0OIIl1.getValue()).I0000Il00O);
/* 1984 */                  LinkedHashMap linkedHashMap4 = new LinkedHashMap(((O1oiOloOo) olO0OIIl1.getValue()).I0000O);
/* 2012 */                  linkedHashMap3.put(str3, new O1oIo0iI00(ModelDownloadStatusType.SUCCEEDED, ioiol1OIol.I0010o(), ioiol1OIol.I0010o(), null, 0L, 0L, 56));
/* 2022 */                  linkedHashMap4.put(str3, new O1oOil(O1oOl0.I00iOIl));
/* 2025 */                  OlO0OIIl1 olO0OIIl12 = o1ol100o0O.I000O01llI0;
                            while (true) {
/* 2027 */                      Object value = olO0OIIl12.getValue();
/* 2084 */                      LinkedHashMap linkedHashMap5 = linkedHashMap3;
/* 2086 */                      LinkedHashMap linkedHashMap6 = linkedHashMap4;
/* 2096 */                      if (olO0OIIl12.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) olO0OIIl1.getValue(), IOOi0Ool1i.I00iIi0i1o(((O1oiOloOo) olO0OIIl1.getValue()).I00000oIO), null, linkedHashMap5, linkedHashMap6, false, null, null, null, 0L, System.currentTimeMillis(), null, 0.0f, null, null, false, 32242))) {
/* 2098 */                          ii1liIllli0.getClass();
/* 2121 */                          ArrayList arrayList5 = new ArrayList((List) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1l100(ii1liIllli0, null, 13)));
/* 2124 */                          Iterator it5 = arrayList5.iterator();
/* 2128 */                          int i13 = 0;
                                    while (true) {
/* 2133 */                              if (!it5.hasNext()) {
/* 2160 */                                  i = -1;
                                        } else if (O0000Ioio00.I0000O(ioiol1OIol.I0010I0i(), ((Ioiol1OIol) it5.next()).I0010I0i())) {
/* 2155 */                                  i = i13;
                                        } else {
/* 2157 */                                  i13++;
                                        }
                                    }
/* 2161 */                          if (i >= 0) {
/* 2163 */                              arrayList5.remove(i);
                                    }
/* 2166 */                          arrayList5.add(ioiol1OIol);
/* 2172 */                          IOoil1iiIilo iOoil1iiIilo2 = null;
/* 2176 */                          iOi1IOoIO0l.I00000oOI(new Ii1lOii(ii1liIllli0, arrayList5, iOoil1iiIilo2, 0));
/* 2181 */                          oI10i0Il6.setValue(Boolean.FALSE);
/* 2192 */                          iOi1II01i0.I0000O(ii0110, null, null, new IO1lI1l0Oi(ol1OlloIO, iOoil1iiIilo2, 11), 3);
                                    break;
                                } else {
/* 2196 */                          linkedHashMap3 = linkedHashMap5;
/* 2198 */                          linkedHashMap4 = linkedHashMap6;
                                }
                            }
                            break;
                        case 10:
/* 1445 */                  Io1Ooo1 io1Ooo1 = (Io1Ooo1) this.I00iiI;
/* 1449 */                  String str5 = (String) this.I00iiO;
/* 1453 */                  String str6 = (String) this.I00iio;
/* 1457 */                  OOI0IO111Ii oOI0IO111Ii = (OOI0IO111Ii) this.I00ilI0I1;
/* 1461 */                  OI0ooi10l oI0ooi10l = (OI0ooi10l) obj;
/* 1463 */                  io1Ooo1.getClass();
/* 1470 */                  OOI0IO111Ii oOI0IO111Ii2 = Io1Ooo1.I0000O;
/* 1472 */                  Object objI0000Il00O = oI0ooi10l.I0000Il00O(oOI0IO111Ii2);
/* 1476 */                  if (objI0000Il00O == null) {
/* 11 */                        objI0000Il00O = "";
                            }
/* 1485 */                  if (((String) objI0000Il00O).equals(str5)) {
/* 1487 */                      OOI0IO111Ii oOI0IO111IiI0000Il00O = Io1Ooo1.I0000Il00O(oI0ooi10l, str5);
/* 1491 */                      if (oOI0IO111IiI0000Il00O != null && !oOI0IO111IiI0000Il00O.I00000oIO.equals(str6)) {
/* 1505 */                          Io1Ooo1.I0000O(oI0ooi10l, str5);
/* 1512 */                          HashSet hashSet = new HashSet();
/* 1515 */                          ?? I0000Il00O = oI0ooi10l.I0000Il00O(oOI0IO111Ii);
/* 1519 */                          if (I0000Il00O != 0) {
/* 1522 */                              hashSet = I0000Il00O;
                                    }
/* 1525 */                          HashSet hashSet2 = new HashSet(hashSet);
/* 1528 */                          hashSet2.add(str5);
/* 1531 */                          oI0ooi10l.I0000O(oOI0IO111Ii, hashSet2);
                                    break;
                                }
                            } else {
/* 1536 */                      OOI0IO111Ii oOI0IO111Ii3 = Io1Ooo1.I0000Il00O;
/* 1538 */                      Object objI0000Il00O2 = oI0ooi10l.I0000Il00O(oOI0IO111Ii3);
/* 1542 */                      if (objI0000Il00O2 == null) {
/* 1544 */                          objI0000Il00O2 = 0L;
                                }
/* 1547 */                      long jLongValue = ((Long) objI0000Il00O2).longValue();
/* 1551 */                      long j2 = 1;
/* 1559 */                      if (jLongValue + 1 == 30) {
/* 1561 */                          ?? I0000Il00O2 = oI0ooi10l.I0000Il00O(oOI0IO111Ii3);
/* 1571 */                          long jLongValue2 = (I0000Il00O2 != 0 ? I0000Il00O2 : 0L).longValue();
/* 1577 */                          HashSet hashSet3 = new HashSet();
/* 1592 */                          String str7 = null;
/* 1597 */                          for (Map.Entry entry3 : oI0ooi10l.I00000oIO().entrySet()) {
/* 1611 */                              if (entry3.getValue() instanceof Set) {
/* 1617 */                                  ?? r15 = (Set) entry3.getValue();
/* 1627 */                                  for (String str8 : r15) {
/* 1633 */                                      long j3 = j2;
/* 1639 */                                      if (str7 == null || str7.compareTo(str8) > 0) {
/* 1653 */                                          str = ((OOI0IO111Ii) entry3.getKey()).I00000oIO;
/* 1656 */                                          str7 = str8;
/* 1657 */                                          hashSet3 = r15;
                                                }
/* 1658 */                                      j2 = j3;
                                            }
                                        }
/* 1663 */                              j2 = j2;
                                    }
/* 1666 */                          j = j2;
/* 1670 */                          HashSet hashSet4 = new HashSet(hashSet3);
/* 1673 */                          hashSet4.remove(str7);
/* 1681 */                          oI0ooi10l.I0000O(new OOI0IO111Ii(str), hashSet4);
/* 1684 */                          jLongValue = jLongValue2 - j;
/* 1690 */                          oI0ooi10l.I0000O(oOI0IO111Ii3, Long.valueOf(jLongValue));
                                } else {
/* 1694 */                          j = 1;
                                }
/* 1700 */                      HashSet hashSet5 = new HashSet();
/* 1703 */                      ?? I0000Il00O3 = oI0ooi10l.I0000Il00O(oOI0IO111Ii);
/* 1707 */                      if (I0000Il00O3 != 0) {
/* 1710 */                          hashSet5 = I0000Il00O3;
                                }
/* 1713 */                      HashSet hashSet6 = new HashSet(hashSet5);
/* 1716 */                      hashSet6.add(str5);
/* 1721 */                      oI0ooi10l.I0000O(oOI0IO111Ii, hashSet6);
/* 1728 */                      oI0ooi10l.I0000O(oOI0IO111Ii3, Long.valueOf(jLongValue + j));
/* 1731 */                      oI0ooi10l.I0000O(oOI0IO111Ii2, str5);
                                break;
                            }
                            break;
                        case 11:
/* 1237 */                  OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00ilI0I1;
/* 1241 */                  IolIiIl iolIiIl = (IolIiIl) this.I00iiI;
/* 1245 */                  OOo0lO oOo0lO3 = (OOo0lO) this.I00iiO;
/* 1249 */                  Ii0110 ii01102 = (Ii0110) this.I00iio;
/* 1255 */                  long jLongValue3 = ((Long) obj).longValue();
/* 1263 */                  OlO01l1oOil olO01l1oOil = (OlO01l1oOil) oI10i0Il7.getValue();
/* 1278 */                  long jLongValue4 = olO01l1oOil != null ? ((Number) olO01l1oOil.getValue()).longValue() : jLongValue3;
/* 1279 */                  long j4 = iolIiIl.I0000Il00O;
/* 1281 */                  OI110O0 oi110o0 = iolIiIl.I00000oIO;
/* 1287 */                  if (j4 == Long.MIN_VALUE || oOo0lO3.I00iOIl != lOiIo0.I000O01llI0(ii01102.I00000oIO())) {
/* 1304 */                      iolIiIl.I0000Il00O = jLongValue3;
/* 1306 */                      Object[] objArr = oi110o0.I00iOIl;
/* 1308 */                      int i14 = oi110o0.I00iiO;
/* 1311 */                      for (int i15 = 0; i15 < i14; i15++) {
/* 1317 */                          ((IolIOll) objArr[i15]).I00io1l = true;
                                }
/* 1330 */                      oOo0lO3.I00iOIl = lOiIo0.I000O01llI0(ii01102.I00000oIO());
                            }
/* 1332 */                  float f = oOo0lO3.I00iOIl;
/* 1337 */                  if (f == 0.0f) {
/* 1339 */                      Object[] objArr2 = oi110o0.I00iOIl;
/* 1341 */                      int i16 = oi110o0.I00iiO;
/* 1343 */                      while (i7 < i16) {
/* 1347 */                          IolIOll iolIOll = (IolIOll) objArr2[i7];
/* 1355 */                          iolIOll.I00iio.setValue(iolIOll.I00ilI0I1.I0000Il00O);
/* 1358 */                          iolIOll.I00io1l = true;
/* 1360 */                          i7++;
                                }
                                break;
                            } else {
/* 1368 */                      long j5 = (long) ((jLongValue4 - iolIiIl.I0000Il00O) / f);
/* 1369 */                      Object[] objArr3 = oi110o0.I00iOIl;
/* 1371 */                      int i17 = oi110o0.I00iiO;
/* 1374 */                      boolean z = true;
/* 1375 */                      for (int i18 = 0; i18 < i17; i18++) {
/* 1379 */                          IolIOll iolIOll2 = (IolIOll) objArr3[i18];
/* 1381 */                          boolean zI0000oI00 = iolIOll2.I00ilO0;
/* 1383 */                          if (!zI0000oI00) {
/* 1391 */                              iolIOll2.I00l0I0l0lO1.I00000oOI.setValue(Boolean.FALSE);
/* 1396 */                              if (iolIOll2.I00io1l) {
/* 1398 */                                  iolIOll2.I00io1l = false;
/* 1400 */                                  iolIOll2.I00ioIO = j5;
                                        }
/* 1404 */                              long j6 = j5 - iolIOll2.I00ioIO;
/* 1414 */                              iolIOll2.I00iio.setValue(iolIOll2.I00ilI0I1.I000II(j6));
/* 1419 */                              zI0000oI00 = iolIOll2.I00ilI0I1.I0000oI00(j6);
/* 1423 */                              iolIOll2.I00ilO0 = zI0000oI00;
                                    }
/* 1425 */                          if (!zI0000oI00) {
/* 1427 */                              z = false;
                                    }
                                }
/* 1439 */                      iolIiIl.I0000O.setValue(Boolean.valueOf(!z));
                                break;
                            }
                        case 12:
/* 1140 */                  ArrayList arrayList6 = (ArrayList) this.I00iiI;
/* 1144 */                  OOo0ll111 oOo0ll111 = (OOo0ll111) this.I00iiO;
/* 1148 */                  List list = (List) this.I00iio;
/* 1152 */                  O0l0i1O o0l0i1O = (O0l0i1O) this.I00ilI0I1;
/* 1156 */                  OOI1io1Ioo oOI1io1Ioo = (OOI1io1Ioo) obj;
/* 1158 */                  Oli1o0 oli1o0 = oOI1io1Ioo.I0000oI00;
/* 1167 */                  int iI0000O = oli1o0 != null ? oli1o0.I0000O() : 0;
/* 1168 */                  int iI0000Il00O = 0;
/* 1169 */                  while (i7 < iI0000O) {
/* 1171 */                      OIilII oIilII = o0l0i1O.I0010I0i;
/* 1173 */                      OIilII oIilII2 = OIilII.I00iOIl;
/* 1175 */                      Oli1o0 oli1o02 = oOI1io1Ioo.I0000oI00;
/* 1207 */                      iI0000Il00O += (int) (oIilII == oIilII2 ? (oli1o02 != null ? oli1o02.I0000Il00O(i7) : 0L) & 4294967295L : (oli1o02 != null ? oli1o02.I0000Il00O(i7) : 0L) >> 32);
/* 1208 */                      i7++;
                            }
/* 1211 */                  if (arrayList6 != null) {
/* 1217 */                      arrayList6.add(Integer.valueOf(iI0000Il00O));
                            }
/* 1226 */                  if (oOo0ll111.I00iOIl != list.size()) {
                                oOo0ll111.I00iOIl++;
                                break;
                            }
                            break;
                        case 13:
/* 1089 */                  O0llioI1 o0llioI1 = (O0llioI1) this.I00iiI;
/* 1093 */                  O0liI0l o0liI0l = (O0liI0l) this.I00iiO;
/* 1097 */                  Oli1o0i oli1o0i = (Oli1o0i) this.I00iio;
/* 1101 */                  OOI1lioOOo0 oOI1lioOOo0 = (OOI1lioOOo0) this.I00ilI0I1;
/* 1109 */                  I1ii1l10IO i1ii1l10IO = new I1ii1l10IO();
/* 1112 */                  i1ii1l10IO.I00000oOI = o0liI0l;
/* 1114 */                  i1ii1l10IO.I0000Il00O = oli1o0i;
/* 1116 */                  i1ii1l10IO.I0000O = oOI1lioOOo0;
/* 1118 */                  i1ii1l10IO.I00000oIO = true;
/* 1120 */                  VarHandle.storeStoreFence();
/* 1123 */                  o0llioI1.I0000Il00O = i1ii1l10IO;
/* 1129 */                  I0IOIo0 i0IOIo0 = new I0IOIo0(21);
/* 1132 */                  i0IOIo0.I00000oOI = o0llioI1;
/* 1134 */                  VarHandle.storeStoreFence();
                            break;
                        case 14:
/* 943 */                   O1ol100o0O o1ol100o0O2 = (O1ol100o0O) this.I00iiI;
/* 947 */                   OoIoI0iii0 ooIoI0iii0 = (OoIoI0iii0) this.I00iiO;
/* 951 */                   OI10i0Il oI10i0Il8 = (OI10i0Il) this.I00ilI0I1;
/* 955 */                   TextToSpeech textToSpeech = (TextToSpeech) this.I00iio;
/* 1009 */                  String string = OlOoOIi0o.I00OIo(Pattern.compile("`+[^`]*`+").matcher(Pattern.compile("\\*{1,3}(.+?)\\*{1,3}").matcher(Pattern.compile("#+\\s").matcher((String) obj).replaceAll("")).replaceAll("$1")).replaceAll("")).toString();
/* 1015 */                  Ii0ioo10iO0 ii0ioo10iO0I00111O = o1ol100o0O2.I00111O("tts");
/* 1019 */                  if (ii0ioo10iO0I00111O == null || (oloIl1l1oOiiI00000oOI = ii0ioo10iO0I00111O.I00000oOI()) == null || (arrayList = oloIl1l1oOiiI00000oOI.I000OiO) == null) {
/* 1059 */                      o1oIOiI11o0 = null;
                            } else {
/* 1031 */                      Iterator it6 = arrayList.iterator();
                                while (true) {
/* 1039 */                          if (it6.hasNext()) {
/* 1041 */                              next = it6.next();
/* 1052 */                              if (((O1oIOiI11o0) next).I00IlilI0i0i instanceof II1olI) {
                                        }
                                    } else {
/* 1055 */                              next = null;
                                    }
                                }
/* 1056 */                      o1oIOiI11o0 = (O1oIOiI11o0) next;
                            }
/* 1060 */                  if (o1oIOiI11o0 != null) {
/* 1062 */                      ooIoI0iii0.I0001Ioi1lo(string);
/* 1065 */                      ooIoI0iii0.I000II(o1oIOiI11o0);
                                break;
                            } else if (((Boolean) oI10i0Il8.getValue()).booleanValue()) {
/* 1083 */                      textToSpeech.speak(string, 0, null, "voice_reply");
                                break;
                            }
                            break;
                        case 15:
/* 893 */                   SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.I00iiI;
/* 897 */                   OI10i0Il oI10i0Il9 = (OI10i0Il) this.I00ilI0I1;
/* 901 */                   IllOOo00lI illOOo00lI3 = (IllOOo00lI) this.I00iiO;
/* 905 */                   OI10i0Il oI10i0Il10 = (OI10i0Il) this.I00iio;
/* 911 */                   if (speechRecognizer != null) {
/* 915 */                       O11OOlloi o11OOlloi = new O11OOlloi();
/* 918 */                       o11OOlloi.I00000oIO = oI10i0Il9;
/* 920 */                       o11OOlloi.I00000oOI = illOOo00lI3;
/* 922 */                       o11OOlloi.I0000Il00O = oI10i0Il10;
/* 924 */                       VarHandle.storeStoreFence();
/* 927 */                       speechRecognizer.setRecognitionListener(o11OOlloi);
                            }
/* 932 */                   I0IOIo0 i0IOIo02 = new I0IOIo0(i4);
/* 935 */                   i0IOIo02.I00000oOI = speechRecognizer;
/* 937 */                   VarHandle.storeStoreFence();
                            break;
                        case 16:
/* 818 */                   O1i1OolO o1i1OolO = (O1i1OolO) this.I00iiI;
/* 822 */                   O1i1O1I o1i1O1I = (O1i1O1I) this.I00iiO;
/* 826 */                   OI10i0Il oI10i0Il11 = (OI10i0Il) this.I00ilI0I1;
/* 830 */                   OI10i0Il oI10i0Il12 = (OI10i0Il) this.I00iio;
/* 836 */                   Iool1IOO1o0i iool1IOO1o0iI001IO000 = o1i1OolO.I001IO000();
/* 840 */                   int size3 = iool1IOO1o0iI001IO000.size();
/* 846 */                   O1iIlOl o1iIlOl = new O1iIlOl(0);
/* 849 */                   o1iIlOl.I00iiI = iool1IOO1o0iI001IO000;
/* 851 */                   VarHandle.storeStoreFence();
/* 856 */                   O1iIlOl o1iIlOl2 = new O1iIlOl(1);
/* 859 */                   o1iIlOl2.I00iiI = iool1IOO1o0iI001IO000;
/* 861 */                   VarHandle.storeStoreFence();
/* 866 */                   Iloio01l0Il iloio01l0Il = new Iloio01l0Il(i5);
/* 869 */                   iloio01l0Il.I00iiI = iool1IOO1o0iI001IO000;
/* 871 */                   iloio01l0Il.I00iiO = o1i1O1I;
/* 873 */                   iloio01l0Il.I00iio = o1i1OolO;
/* 875 */                   iloio01l0Il.I00ilI0I1 = oI10i0Il11;
/* 877 */                   iloio01l0Il.I00ilO0 = oI10i0Il12;
/* 879 */                   VarHandle.storeStoreFence();
/* 887 */                   ((O0lolo) obj).I0000oI00(size3, o1iIlOl, o1iIlOl2, new IOii1l(802480018, iloio01l0Il, true));
                            break;
                        case 17:
/* 769 */                   Function1 function13 = (Function1) this.I00iiI;
/* 773 */                   O1ol100o0O o1ol100o0O3 = (O1ol100o0O) this.I00iiO;
/* 777 */                   OI10i0Il oI10i0Il13 = (OI10i0Il) this.I00ilI0I1;
/* 781 */                   OI10i0Il oI10i0Il14 = (OI10i0Il) this.I00iio;
/* 785 */                   String str9 = (String) obj;
/* 803 */                   function13.invoke(l1O0o1.I0000oI00((List) oI10i0Il13.getValue(), (List) oI10i0Il14.getValue(), str9));
/* 806 */                   oI10i0Il13.setValue(il01100l);
/* 809 */                   oI10i0Il14.setValue(il01100l);
/* 812 */                   o1ol100o0O3.I00IO1oi11O(str9);
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 685 */                   OOo0lO oOo0lO4 = (OOo0lO) this.I00iiI;
/* 689 */                   OI0Iio01O oI0Iio01O = (OI0Iio01O) this.I00iiO;
/* 693 */                   OiOol0il0il oiOol0il0il = (OiOol0il0il) this.I00iio;
/* 697 */                   I0IO1io0I i0IO1io0I = (I0IO1io0I) this.I00ilI0I1;
/* 701 */                   I110IIooo i110IIooo3 = (I110IIooo) obj;
/* 717 */                   float fFloatValue2 = ((Number) i110IIooo3.I0000oI00.getValue()).floatValue() - oOo0lO4.I00iOIl;
/* 722 */                   if (l1i1IillI.I00000oIO(fFloatValue2)) {
/* 761 */                       if (((Boolean) i0IO1io0I.invoke(Float.valueOf(oOo0lO4.I00iOIl))).booleanValue()) {
/* 763 */                           i110IIooo3.I00000oIO();
                                    break;
                                }
                            } else if (!l1i1IillI.I00000oIO(fFloatValue2 - oI0Iio01O.I0000Il00O(oiOol0il0il, fFloatValue2))) {
/* 736 */                       i110IIooo3.I00000oIO();
                                break;
                            } else {
                                oOo0lO4.I00iOIl += fFloatValue2;
/* 761 */                       if (((Boolean) i0IO1io0I.invoke(Float.valueOf(oOo0lO4.I00iOIl))).booleanValue()) {
                                }
                            }
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 677 */                   ((OOo0l0ii10l) this.I00iiI).I00iOIl = true;
/* 679 */                   ((OI1i0llli) this.I00iiO).I00000oIO((OI1ilOI1ioo0) this.I00iio, (Bundle) this.I00ilI0I1, (OI1OloOIO1O) obj, il01100l);
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 600 */                   OOl1OlI0 oOl1OlI0 = (OOl1OlI0) this.I00iiI;
/* 604 */                   Ii0l0Olio10 ii0l0Olio10 = (Ii0l0Olio10) this.I00iiO;
/* 608 */                   OI10i0Il oI10i0Il15 = (OI10i0Il) this.I00ilI0I1;
/* 612 */                   OI10i0Il oI10i0Il16 = (OI10i0Il) this.I00iio;
/* 628 */                   if (!OlOoOIi0o.I001l0I00((String) oI10i0Il15.getValue()) && !((Boolean) oI10i0Il16.getValue()).booleanValue()) {
/* 650 */                       oOl1OlI0.I0000oI00((String) oI10i0Il15.getValue(), ii0l0Olio10.I00000oIO);
/* 653 */                       oI10i0Il15.setValue("");
                                break;
                            }
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 515 */                   OI10i0Il oI10i0Il17 = (OI10i0Il) this.I00ilI0I1;
/* 519 */                   OOl1OlI0 oOl1OlI02 = (OOl1OlI0) this.I00iiI;
/* 523 */                   OI10i0Il oI10i0Il18 = (OI10i0Il) this.I00iiO;
/* 527 */                   OI10i0Il oI10i0Il19 = (OI10i0Il) this.I00iio;
/* 537 */                   List list2 = (List) oI10i0Il17.getValue();
/* 542 */                   OOii01Ioi1 oOii01Ioi1 = new OOii01Ioi1(5);
/* 545 */                   int size4 = list2.size();
/* 551 */                   I01i01OoI i01i01OoI = new I01i01OoI(i4);
/* 554 */                   i01i01OoI.I00iiI = oOii01Ioi1;
/* 556 */                   i01i01OoI.I00iiO = list2;
/* 558 */                   VarHandle.storeStoreFence();
/* 565 */                   I0O11IOOo0OI i0O11IOOo0OI = new I0O11IOOo0OI(25);
/* 568 */                   i0O11IOOo0OI.I00iiI = list2;
/* 570 */                   VarHandle.storeStoreFence();
/* 575 */                   Io0IlIIo0 io0IlIIo0 = new Io0IlIIo0(i8);
/* 578 */                   io0IlIIo0.I00iiI = list2;
/* 580 */                   io0IlIIo0.I00iiO = oOl1OlI02;
/* 582 */                   io0IlIIo0.I00iio = oI10i0Il18;
/* 584 */                   io0IlIIo0.I00ilI0I1 = oI10i0Il19;
/* 586 */                   VarHandle.storeStoreFence();
/* 594 */                   ((O0lolo) obj).I0000oI00(size4, i01i01OoI, i0O11IOOo0OI, new IOii1l(802480018, io0IlIIo0, true));
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 423 */                   OI10i0Il oI10i0Il20 = (OI10i0Il) this.I00ilI0I1;
/* 427 */                   Context context2 = (Context) this.I00iiI;
/* 431 */                   OI10i0Il oI10i0Il21 = (OI10i0Il) this.I00iiO;
/* 435 */                   OI10i0Il oI10i0Il22 = (OI10i0Il) this.I00iio;
/* 439 */                   O0lolo o0lolo2 = (O0lolo) obj;
/* 443 */                   Oio1Io0ll oio1Io0ll = new Oio1Io0ll(i6);
/* 446 */                   oio1Io0ll.I00iiI = context2;
/* 448 */                   oio1Io0ll.I00iiO = oI10i0Il21;
/* 450 */                   oio1Io0ll.I00iio = oI10i0Il22;
/* 452 */                   VarHandle.storeStoreFence();
/* 463 */                   O0lolo.I0000O(o0lolo2, null, new IOii1l(-882361301, oio1Io0ll, true), 3);
/* 470 */                   List list3 = (List) oI10i0Il20.getValue();
/* 472 */                   int size5 = list3.size();
/* 480 */                   I0O11IOOo0OI i0O11IOOo0OI2 = new I0O11IOOo0OI(27);
/* 483 */                   i0O11IOOo0OI2.I00iiI = list3;
/* 485 */                   VarHandle.storeStoreFence();
/* 490 */                   IOll1Iool00 iOll1Iool00 = new IOll1Iool00(i8);
/* 493 */                   iOll1Iool00.I00iiI = list3;
/* 495 */                   iOll1Iool00.I00iiO = context2;
/* 497 */                   iOll1Iool00.I00iio = oI10i0Il21;
/* 499 */                   iOll1Iool00.I00ilI0I1 = oI10i0Il22;
/* 501 */                   VarHandle.storeStoreFence();
/* 509 */                   o0lolo2.I0000oI00(size5, null, i0O11IOOo0OI2, new IOii1l(802480018, iOll1Iool00, true));
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 346 */                   Oo0oOoIo0ol oo0oOoIo0ol = (Oo0oOoIo0ol) this.I00iiI;
/* 350 */                   O1ol100o0O o1ol100o0O4 = (O1ol100o0O) this.I00iiO;
/* 354 */                   Context context3 = (Context) this.I00iio;
/* 358 */                   OI10i0Il oI10i0Il23 = (OI10i0Il) this.I00ilI0I1;
/* 364 */                   ((Boolean) obj).getClass();
/* 367 */                   oI10i0Il23.setValue(oo0oOoIo0ol);
/* 372 */                   Oo0oii.I00000oIO.setValue(oo0oOoIo0ol);
/* 375 */                   Ii1liIllli0 ii1liIllli02 = o1ol100o0O4.I0000Il00O;
/* 377 */                   ii1liIllli02.getClass();
/* 386 */                   iOi1IOoIO0l.I00000oOI(new Ii1O001loIoO(ii1liIllli02, oo0oOoIo0ol, iOoil1iiIilo, 7));
/* 399 */                   UiModeManager uiModeManager = (UiModeManager) context3.getApplicationContext().getSystemService("uimode");
/* 403 */                   if (oo0oOoIo0ol == Oo0oOoIo0ol.THEME_AUTO) {
/* 405 */                       uiModeManager.setApplicationNightMode(0);
                                break;
                            } else if (oo0oOoIo0ol == Oo0oOoIo0ol.THEME_LIGHT) {
/* 413 */                       uiModeManager.setApplicationNightMode(1);
                                break;
                            } else {
/* 417 */                       uiModeManager.setApplicationNightMode(2);
                                break;
                            }
                        case PoseLandmark.RIGHT_HIP:
/* 276 */                   OlOI1O olOI1O = (OlOI1O) this.I00iiI;
/* 280 */                   IiIOI1ol0o iiIOI1ol0o = (IiIOI1ol0o) this.I00iiO;
/* 284 */                   OlO1ooI0i olO1ooI0i = (OlO1ooI0i) this.I00iio;
/* 288 */                   Ool1lo ool1lo = (Ool1lo) this.I00ilI0I1;
/* 292 */                   Throwable th = (Throwable) obj;
/* 296 */                   if (!(th instanceof Ioi1lIO) || ((Ioi1lIO) th).I00iOIl != 3) {
/* 318 */                       IOi10loi iOi10loi = olO1ooI0i.I0000O;
/* 320 */                       if (th != null) {
/* 324 */                           if (th instanceof CancellationException) {
/* 328 */                               iOi10loi.I001IIilI0O((CancellationException) th);
                                        break;
                                    } else {
/* 332 */                               iOi10loi.I00iIO(th);
                                        break;
                                    }
                                } else {
/* 340 */                           iOi10loi.I00O10llo(iiIOI1ol0o.I000O01llI0());
                                    break;
                                }
                            } else {
/* 314 */                       iOi1II01i0.I0000O(olOI1O.I00000oOI.I0000oI00, null, null, new I1iIiIIIio0(olOI1O, ool1lo, olO1ooI0i, (IOoil1iiIilo) null), 3);
                                break;
                            }
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 270 */                   iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new O1o1iI((Ol010000lo00) this.I00iio, (Function1) this.I00ilI0I1, (String) obj, (IllOOo00lI) this.I00iiO, (IOoil1iiIilo) null, 17), 3);
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 169 */                   List list4 = (List) this.I00iiI;
/* 173 */                   Function1 function14 = (Function1) this.I00iiO;
/* 177 */                   Ii0110 ii01103 = (Ii0110) this.I00iio;
/* 181 */                   Function1 function15 = (Function1) this.I00ilI0I1;
/* 187 */                   int size6 = list4.size();
/* 193 */                   Oo0OlIO oo0OlIO = new Oo0OlIO(0);
/* 196 */                   oo0OlIO.I00iiI = list4;
/* 198 */                   VarHandle.storeStoreFence();
/* 203 */                   Oo0OlIO oo0OlIO2 = new Oo0OlIO(1);
/* 206 */                   oo0OlIO2.I00iiI = list4;
/* 208 */                   VarHandle.storeStoreFence();
/* 213 */                   Io0IlIIo0 io0IlIIo02 = new Io0IlIIo0(i6);
/* 216 */                   io0IlIIo02.I00iiI = list4;
/* 218 */                   io0IlIIo02.I00iio = function14;
/* 220 */                   io0IlIIo02.I00iiO = ii01103;
/* 222 */                   io0IlIIo02.I00ilI0I1 = function15;
/* 224 */                   VarHandle.storeStoreFence();
/* 232 */                   ((O0lolo) obj).I0000oI00(size6, oo0OlIO, oo0OlIO2, new IOii1l(802480018, io0IlIIo02, true));
                            break;
                        case 27:
/* 81 */                    OI10i0Il oI10i0Il24 = (OI10i0Il) this.I00ilI0I1;
/* 85 */                    OoIO11oiiiil ooIO11oiiiil = (OoIO11oiiiil) this.I00iiI;
/* 89 */                    IOO0i0o1O0l iOO0i0o1O0l = (IOO0i0o1O0l) this.I00iiO;
/* 93 */                    Context context4 = (Context) this.I00iio;
/* 105 */                   List list5 = ((OoIIo0oOI1) oI10i0Il24.getValue()).I0000oI00;
/* 111 */                   Oo011oIOO1 oo011oIOO1 = new Oo011oIOO1(17);
/* 114 */                   int size7 = list5.size();
/* 122 */                   I01i01OoI i01i01OoI2 = new I01i01OoI(28);
/* 125 */                   i01i01OoI2.I00iiI = oo011oIOO1;
/* 127 */                   i01i01OoI2.I00iiO = list5;
/* 129 */                   VarHandle.storeStoreFence();
/* 134 */                   Oo0OlIO oo0OlIO3 = new Oo0OlIO(2);
/* 137 */                   oo0OlIO3.I00iiI = list5;
/* 139 */                   VarHandle.storeStoreFence();
/* 144 */                   Io0IlIIo0 io0IlIIo03 = new Io0IlIIo0(i5);
/* 147 */                   io0IlIIo03.I00iiI = list5;
/* 149 */                   io0IlIIo03.I00iiO = ooIO11oiiiil;
/* 151 */                   io0IlIIo03.I00iio = iOO0i0o1O0l;
/* 153 */                   io0IlIIo03.I00ilI0I1 = context4;
/* 155 */                   VarHandle.storeStoreFence();
/* 163 */                   ((O0lolo) obj).I0000oI00(size7, i01i01OoI2, oo0OlIO3, new IOii1l(802480018, io0IlIIo03, true));
                            break;
                        default:
/* 28 */                    OoIO11oiiiil ooIO11oiiiil2 = (OoIO11oiiiil) this.I00iiI;
/* 32 */                    Context context5 = (Context) this.I00iiO;
/* 36 */                    O1oIOiI11o0 o1oIOiI11o04 = (O1oIOiI11o0) this.I00iio;
/* 40 */                    OI10i0Il oI10i0Il25 = (OI10i0Il) this.I00ilI0I1;
/* 46 */                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 54 */                    OoIIOoO ooIIOoO = (OoIIOoO) oI10i0Il25.getValue();
/* 56 */                    oI10i0Il25.setValue(null);
/* 59 */                    if (!zBooleanValue || ooIIOoO == null) {
/* 67 */                        if (!zBooleanValue) {
/* 75 */                            Toast.makeText(context5, "Microphone permission required", 0).show();
                                    break;
                                }
                            } else {
/* 63 */                        ooIO11oiiiil2.I0001Ioi1lo(context5, o1oIOiI11o04, ooIIOoO);
                                break;
                            }
                            break;
                    }
/* 78 */            return ooiIlOl1iI2;
                }

/* 16 */        public I0O1IO(int i) {
/* 17 */            this.I00iOIl = i;
                }
            }
