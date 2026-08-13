            package p000;

            import android.content.Context;
            import android.speech.tts.TextToSpeech;
            import com.google.ai.edge.gallery.customtasks.agentchat.AgentTools;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import kotlin.jvm.functions.Function1;
            
/* 19 */    public final class I0O0o00OlIoi implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;

                public I0O0o00OlIoi(O11iO00I1o o11iO00I1o, TextToSpeech textToSpeech, OoIoI0iii0 ooIoI0iii0, OI10i0Il oI10i0Il, IllOOo00lI illOOo00lI, OI10i0Il oI10i0Il2) {
/* 3 */             this.I00iOIl = 8;
/* 8 */             this.I00iiO = o11iO00I1o;
/* 10 */            this.I00iio = textToSpeech;
/* 12 */            this.I00ilI0I1 = ooIoI0iii0;
/* 14 */            this.I00iiI = oI10i0Il;
/* 16 */            this.I00ilO0 = illOOo00lI;
/* 18 */            this.I00io1l = oI10i0Il2;
                }

                @Override
                public final Object invoke(Object obj) throws Exception {
                    OoiIlOl1iI ooiIlOl1iI;
/* 3 */             int i = this.I00iOIl;
/* 10 */            int i2 = 0;
/* 11 */            OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 1181 */                  List list = (List) this.I00iiO;
/* 1185 */                  I101liloIo1 i101liloIo1 = (I101liloIo1) this.I00iio;
/* 1189 */                  Function1 function1 = (Function1) this.I00ilI0I1;
/* 1193 */                  Set set = (Set) this.I00ilO0;
/* 1197 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 1201 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00io1l;
/* 1207 */                  int size = list.size();
/* 1214 */                  I0O11IOOo0OI i0O11IOOo0OI = new I0O11IOOo0OI(0);
/* 1217 */                  i0O11IOOo0OI.I00iiI = list;
/* 1219 */                  VarHandle.storeStoreFence();
/* 1224 */                  I0O11IiiOi i0O11IiiOi = new I0O11IiiOi(0);
/* 1227 */                  i0O11IiiOi.I00iiI = list;
/* 1229 */                  i0O11IiiOi.I00ilI0I1 = i101liloIo1;
/* 1231 */                  i0O11IiiOi.I00iiO = function1;
/* 1233 */                  i0O11IiiOi.I00ilO0 = set;
/* 1235 */                  i0O11IiiOi.I00iio = oI10i0Il;
/* 1237 */                  i0O11IiiOi.I00io1l = oI10i0Il2;
/* 1239 */                  VarHandle.storeStoreFence();
/* 1247 */                  ((O0lolo) obj).I0000oI00(size, null, i0O11IOOo0OI, new IOii1l(802480018, i0O11IiiOi, true));
/* 1177 */                  return ooiIlOl1iI2;
                        case 1:
/* 1121 */                  O11OliOlOII o11OliOlOII = (O11OliOlOII) this.I00iiO;
/* 1126 */                  O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iio;
/* 1131 */                  Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00ilI0I1;
/* 1136 */                  AgentTools agentTools = (AgentTools) this.I00ilO0;
/* 1140 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiI;
/* 1144 */                  String str = (String) this.I00io1l;
/* 1150 */                  oI10i0Il3.setValue((String) obj);
/* 1158 */                  String str2 = (String) oI10i0Il3.getValue();
/* 1163 */                  I00o101lO i00o101lO = new I00o101lO(7);
/* 1166 */                  i00o101lO.I00iiI = o11OliOlOII;
/* 1168 */                  i00o101lO.I00iiO = str;
/* 1170 */                  VarHandle.storeStoreFence();
/* 1173 */                  IO0O0o0O1Ol.I0000Il00O(o11OliOlOII, o1ol100o0O, ol0o1OiOIIIl, str2, agentTools, i00o101lO);
/* 1116 */                  return ooiIlOl1iI2;
                        case 2:
/* 1047 */                  List list2 = (List) this.I00iiO;
/* 1051 */                  Function1 function12 = (Function1) this.I00ilI0I1;
/* 1055 */                  Ii0110 ii0110 = (Ii0110) this.I00iio;
/* 1059 */                  Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00ilO0;
/* 1063 */                  OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiI;
/* 1067 */                  String str3 = (String) this.I00io1l;
/* 1073 */                  int size2 = list2.size();
/* 1079 */                  I0O11IOOo0OI i0O11IOOo0OI2 = new I0O11IOOo0OI(1);
/* 1082 */                  i0O11IOOo0OI2.I00iiI = list2;
/* 1084 */                  VarHandle.storeStoreFence();
/* 1089 */                  I0O11IiiOi i0O11IiiOi2 = new I0O11IiiOi(i);
/* 1092 */                  i0O11IiiOi2.I00iiI = list2;
/* 1094 */                  i0O11IiiOi2.I00iiO = function12;
/* 1096 */                  i0O11IiiOi2.I00ilI0I1 = ii0110;
/* 1098 */                  i0O11IiiOi2.I00ilO0 = ol010000lo00;
/* 1100 */                  i0O11IiiOi2.I00iio = oI10i0Il4;
/* 1102 */                  i0O11IiiOi2.I00io1l = str3;
/* 1104 */                  VarHandle.storeStoreFence();
/* 1112 */                  ((O0lolo) obj).I0000oI00(size2, null, i0O11IOOo0OI2, new IOii1l(802480018, i0O11IiiOi2, true));
/* 1043 */                  return ooiIlOl1iI2;
                        case 3:
/* 871 */                   I1ii1o0 i1ii1o0 = (I1ii1o0) this.I00iiO;
/* 875 */                   OiI101I1oIi oiI101I1oIi = (OiI101I1oIi) this.I00iio;
/* 879 */                   OOo0lO oOo0lO = (OOo0lO) this.I00ilI0I1;
/* 883 */                   OOo0ooi oOo0ooi = (OOo0ooi) this.I00ilO0;
/* 887 */                   I0ol0lI i0ol0lI = (I0ol0lI) this.I00iiI;
/* 892 */                   III11l1I iII11l1I = (III11l1I) this.I00io1l;
/* 896 */                   IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 908 */                   float fFloatValue = Float.valueOf(((Oli0o0o1) i1ii1o0.I00iiO).I00iOIl).floatValue();
/* 915 */                   if (fFloatValue < 0.0f) {
/* 917 */                       fFloatValue = 0.0f;
                            }
/* 943 */                   i = 2.0f * fFloatValue <= Math.min(Math.abs(oiI101I1oIi.I00000oOI()), Math.abs(oiI101I1oIi.I00000oIO())) ? 0 : 1;
/* 951 */                   if (oOo0lO.I00iOIl == fFloatValue) {
/* 953 */                       ooiIlOl1iI = ooiIlOl1iI2;
                            } else {
/* 956 */                       i0ol0lI.I000O01llI0();
/* 959 */                       I0ol0lI.I0000Il00O(i0ol0lI, oiI101I1oIi);
/* 962 */                       if (i == 0) {
/* 964 */                           I0ol0lI i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 984 */                           ooiIlOl1iI = ooiIlOl1iI2;
/* 1015 */                          I0ol0lI.I0000Il00O(i0ol0lII00000oIO, new OiI101I1oIi(oiI101I1oIi.I00000oIO + fFloatValue, oiI101I1oIi.I00000oOI + fFloatValue, oiI101I1oIi.I0000Il00O - fFloatValue, oiI101I1oIi.I0000O - fFloatValue, iOi0i1l1i0IO.I00000oIO(fFloatValue, oiI101I1oIi.I0000oI00), iOi0i1l1i0IO.I00000oIO(fFloatValue, oiI101I1oIi.I0001Ioi1lo), iOi0i1l1i0IO.I00000oIO(fFloatValue, oiI101I1oIi.I000II), iOi0i1l1i0IO.I00000oIO(fFloatValue, oiI101I1oIi.I000O01llI0)));
/* 1019 */                          i0ol0lI.I000II(i0ol0lI, i0ol0lII00000oIO, 0);
                                } else {
/* 1023 */                          ooiIlOl1iI = ooiIlOl1iI2;
                                }
/* 1025 */                      oOo0ooi.I00iOIl = i0ol0lI;
/* 1027 */                      oOo0lO.I00iOIl = fFloatValue;
                            }
/* 1039 */                  IilloIOOO0i.I00OIo(iilloIOOO0i, (I0ol0lI) oOo0ooi.I00iOIl, iII11l1I, 0.0f, null, null, 60);
/* 1042 */                  return ooiIlOl1iI;
                        case 4:
/* 805 */                   OO1I0001000i[] oO1I0001000iArr = (OO1I0001000i[]) this.I00iio;
/* 809 */                   List list3 = (List) this.I00iiO;
/* 813 */                   O1iOIoOiO0 o1iOIoOiO0 = (O1iOIoOiO0) this.I00ilI0I1;
/* 817 */                   OOo0ll111 oOo0ll111 = (OOo0ll111) this.I00ilO0;
/* 821 */                   OOo0ll111 oOo0ll1112 = (OOo0ll111) this.I00iiI;
/* 825 */                   II1oOo0O iI1oOo0O = (II1oOo0O) this.I00io1l;
/* 829 */                   OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 831 */                   int length = oO1I0001000iArr.length;
/* 832 */                   int i3 = 0;
/* 833 */                   while (i2 < length) {
/* 860 */                       II1oOI10.I0000O(oO11o0IO, oO1I0001000iArr[i2], (O1iIo0ll) list3.get(i3), o1iOIoOiO0.getLayoutDirection(), oOo0ll111.I00iOIl, oOo0ll1112.I00iOIl, iI1oOo0O.I00000oIO);
/* 863 */                       i2++;
/* 837 */                       i3++;
                            }
/* 868 */                   return ooiIlOl1iI2;
                        case 5:
/* 754 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iiO;
/* 758 */                   Context context = (Context) this.I00iio;
/* 762 */                   O1OIi1 o1OIi1 = (O1OIi1) this.I00ilI0I1;
/* 766 */                   O1ol100o0O o1ol100o0O2 = (O1ol100o0O) this.I00ilO0;
/* 770 */                   OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) this.I00io1l;
/* 774 */                   OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iiI;
/* 780 */                   o1oIOiI11o0.I00Iooi00oi = (String) obj;
/* 782 */                   OIo1i1 oIo1i1 = OollloolI.I00000oIO;
/* 790 */                   if (iOI10i0I11.I00000oIO(context, "android.permission.POST_NOTIFICATIONS") == 0) {
/* 792 */                       o1ol100o0O2.I00100o1O0lo(oloIl1l1oOii, o1oIOiI11o0);
                            } else {
/* 796 */                       o1OIi1.I00000oIO("android.permission.POST_NOTIFICATIONS");
                            }
/* 799 */                   Iil0O0iOiIil.I0000Il00O(oI10i0Il5, false);
/* 802 */                   return ooiIlOl1iI2;
                        case 6:
/* 297 */                   O1ol100o0O o1ol100o0O3 = (O1ol100o0O) this.I00iiO;
/* 301 */                   OI1o1o1iO1l oI1o1o1iO1l = (OI1o1o1iO1l) this.I00iio;
/* 305 */                   OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iiI;
/* 309 */                   OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00io1l;
/* 313 */                   OI10i0Il oI10i0Il8 = (OI10i0Il) this.I00ilI0I1;
/* 317 */                   OI10i0Il oI10i0Il9 = (OI10i0Il) this.I00ilO0;
/* 321 */                   OI1o0olI oI1o0olI = (OI1o0olI) obj;
/* 325 */                   Ilo0oi ilo0oi = new Ilo0oi();
/* 328 */                   ilo0oi.I00iOIl = o1ol100o0O3;
/* 330 */                   ilo0oi.I00iiI = oI1o1o1iO1l;
/* 332 */                   ilo0oi.I00iiO = oI10i0Il6;
/* 334 */                   ilo0oi.I00iio = oI10i0Il7;
/* 336 */                   ilo0oi.I00ilI0I1 = oI10i0Il8;
/* 338 */                   ilo0oi.I00ilO0 = oI10i0Il9;
/* 340 */                   VarHandle.storeStoreFence();
/* 360 */                   l1iO1oo0Ilo.I00000oIO(oI1o0olI, "homepage", null, null, null, new IOii1l(-381246958, ilo0oi, true), 254);
/* 366 */                   Ilo10O1IlOl ilo10O1IlOl = new Ilo10O1IlOl(3);
/* 373 */                   Ilo10O1IlOl ilo10O1IlOl2 = new Ilo10O1IlOl(10);
/* 378 */                   Ilo0oI1O0I ilo0oI1O0I = new Ilo0oI1O0I(i);
/* 381 */                   ilo0oI1O0I.I00iiO = oI10i0Il7;
/* 383 */                   ilo0oI1O0I.I00iiI = o1ol100o0O3;
/* 385 */                   ilo0oI1O0I.I00iio = oI1o1o1iO1l;
/* 387 */                   ilo0oI1O0I.I00ilI0I1 = oI10i0Il8;
/* 389 */                   ilo0oI1O0I.I00ilO0 = oI10i0Il6;
/* 391 */                   VarHandle.storeStoreFence();
/* 410 */                   l1iO1oo0Ilo.I00000oIO(oI1o0olI, "model_list", null, ilo10O1IlOl, ilo10O1IlOl2, new IOii1l(-1287252855, ilo0oI1O0I, true), 230);
/* 426 */                   List listSingletonList = Collections.singletonList(l1iII010.I00000oIO("taskId", new Ilo10O1IlOl(11)));
/* 434 */                   Ilo10O1IlOl ilo10O1IlOl3 = new Ilo10O1IlOl(12);
/* 441 */                   Ilo10O1IlOl ilo10O1IlOl4 = new Ilo10O1IlOl(13);
/* 446 */                   Ilo10OO0 ilo10OO0 = new Ilo10OO0(3);
/* 449 */                   ilo10OO0.I00iiO = o1ol100o0O3;
/* 451 */                   ilo10OO0.I00iiI = oI1o1o1iO1l;
/* 453 */                   ilo10OO0.I00iio = oI10i0Il8;
/* 455 */                   VarHandle.storeStoreFence();
/* 474 */                   l1iO1oo0Ilo.I00000oIO(oI1o0olI, "route_task_direct/{taskId}", listSingletonList, ilo10O1IlOl3, ilo10O1IlOl4, new IOii1l(-123671670, ilo10OO0, true), 228);
/* 544 */                   List listI000O01llI0 = IOOi1I.I000O01llI0(l1iII010.I00000oIO("taskId", new Ilo10O1IlOl(14)), l1iII010.I00000oIO("modelName", new Ilo10O1IlOl(15)), l1iII010.I00000oIO("conversationId", new Iil0iiOiI(24)), l1iII010.I00000oIO("autoResume", new Iil0iiOiI(25)), l1iII010.I00000oIO("voiceMode", new Iil0iiOiI(26)));
/* 552 */                   Iil0iiOiI iil0iiOiI = new Iil0iiOiI(27);
/* 559 */                   Iil0iiOiI iil0iiOiI2 = new Iil0iiOiI(28);
/* 564 */                   Ilo10I0 ilo10I0 = new Ilo10I0();
/* 567 */                   ilo10I0.I00iOIl = o1ol100o0O3;
/* 569 */                   ilo10I0.I00iiI = oI1o1o1iO1l;
/* 571 */                   ilo10I0.I00iiO = oI10i0Il9;
/* 573 */                   ilo10I0.I00iio = oI10i0Il8;
/* 575 */                   VarHandle.storeStoreFence();
/* 590 */                   l1iO1oo0Ilo.I00000oIO(oI1o0olI, "route_model/{taskId}/{modelName}?conversationId={conversationId}&autoResume={autoResume}&voiceMode={voiceMode}", listI000O01llI0, iil0iiOiI, iil0iiOiI2, new IOii1l(1039909515, ilo10I0, true), 228);
/* 604 */                   List listSingletonList2 = Collections.singletonList(l1iII010.I00000oIO("startImport", new Ilo10O1IlOl(0)));
/* 610 */                   Ilo10O1IlOl ilo10O1IlOl5 = new Ilo10O1IlOl(1);
/* 616 */                   Ilo10O1IlOl ilo10O1IlOl6 = new Ilo10O1IlOl(2);
/* 621 */                   Ilo10OO0 ilo10OO02 = new Ilo10OO0(i2);
/* 624 */                   ilo10OO02.I00iiO = o1ol100o0O3;
/* 626 */                   ilo10OO02.I00iiI = oI1o1o1iO1l;
/* 628 */                   ilo10OO02.I00iio = oI10i0Il6;
/* 630 */                   VarHandle.storeStoreFence();
/* 645 */                   l1iO1oo0Ilo.I00000oIO(oI1o0olI, "model_manager?startImport={startImport}", listSingletonList2, ilo10O1IlOl5, ilo10O1IlOl6, new IOii1l(-2091476596, ilo10OO02, true), 228);
/* 651 */                   Ilo10O1IlOl ilo10O1IlOl7 = new Ilo10O1IlOl(4);
/* 657 */                   Ilo10O1IlOl ilo10O1IlOl8 = new Ilo10O1IlOl(5);
/* 662 */                   Ilo10OO0 ilo10OO03 = new Ilo10OO0(i);
/* 665 */                   ilo10OO03.I00iiI = oI1o1o1iO1l;
/* 667 */                   ilo10OO03.I00iiO = o1ol100o0O3;
/* 669 */                   ilo10OO03.I00iio = oI10i0Il6;
/* 671 */                   VarHandle.storeStoreFence();
/* 689 */                   l1iO1oo0Ilo.I00000oIO(oI1o0olI, "chat_history", null, ilo10O1IlOl7, ilo10O1IlOl8, new IOii1l(-927895411, ilo10OO03, true), 230);
/* 702 */                   List listSingletonList3 = Collections.singletonList(l1iII010.I00000oIO("modelName", new Ilo10O1IlOl(6)));
/* 709 */                   Ilo10O1IlOl ilo10O1IlOl9 = new Ilo10O1IlOl(7);
/* 716 */                   Ilo10O1IlOl ilo10O1IlOl10 = new Ilo10O1IlOl(9);
/* 722 */                   Ilo10OO0 ilo10OO04 = new Ilo10OO0(2);
/* 725 */                   ilo10OO04.I00iiO = o1ol100o0O3;
/* 727 */                   ilo10OO04.I00iiI = oI1o1o1iO1l;
/* 729 */                   ilo10OO04.I00iio = oI10i0Il8;
/* 731 */                   VarHandle.storeStoreFence();
/* 748 */                   l1iO1oo0Ilo.I00000oIO(oI1o0olI, "benchmark/{modelName}", listSingletonList3, ilo10O1IlOl9, ilo10O1IlOl10, new IOii1l(235685774, ilo10OO04, true), 228);
/* 751 */                   return ooiIlOl1iI2;
                        case 7:
/* 224 */                   O0oiOi o0oiOi = (O0oiOi) this.I00iiO;
/* 228 */                   IIo0l1 iIo0l1 = (IIo0l1) this.I00iio;
/* 232 */                   OI10i0Il oI10i0Il10 = (OI10i0Il) this.I00iiI;
/* 236 */                   long[] jArr = (long[]) this.I00ilI0I1;
/* 240 */                   OI10i0Il oI10i0Il11 = (OI10i0Il) this.I00io1l;
/* 244 */                   OI10i0Il oI10i0Il12 = (OI10i0Il) this.I00ilO0;
/* 248 */                   Context context2 = (Context) obj;
/* 252 */                   OOIIooi oOIIooi = new OOIIooi(context2);
/* 255 */                   Executor mainExecutor = context2.getMainExecutor();
/* 259 */                   OOIl1Io0 oOIl1Io0 = OOIl1Io0.I00000oOI;
/* 261 */                   IO0oo1I0oIO iO0oo1I0oIOI00000oIO = lIIOO11.I00000oIO(context2);
/* 267 */                   IloOo1O iloOo1O = new IloOo1O();
/* 270 */                   iloOo1O.I00iOIl = context2;
/* 272 */                   iloOo1O.I00iiI = o0oiOi;
/* 274 */                   iloOo1O.I00iiO = iIo0l1;
/* 276 */                   iloOo1O.I00iio = oOIIooi;
/* 278 */                   iloOo1O.I00ilI0I1 = mainExecutor;
/* 280 */                   iloOo1O.I00ilO0 = oI10i0Il10;
/* 282 */                   iloOo1O.I00io1l = jArr;
/* 284 */                   iloOo1O.I00ioIO = oI10i0Il11;
/* 286 */                   iloOo1O.I00l0I0l0lO1 = oI10i0Il12;
/* 288 */                   VarHandle.storeStoreFence();
/* 291 */                   iO0oo1I0oIOI00000oIO.addListener(iloOo1O, mainExecutor);
/* 294 */                   return oOIIooi;
                        case 8:
/* 139 */                   O11iO00I1o o11iO00I1o = (O11iO00I1o) this.I00iiO;
/* 143 */                   TextToSpeech textToSpeech = (TextToSpeech) this.I00iio;
/* 147 */                   OoIoI0iii0 ooIoI0iii0 = (OoIoI0iii0) this.I00ilI0I1;
/* 151 */                   OI10i0Il oI10i0Il13 = (OI10i0Il) this.I00iiI;
/* 155 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00ilO0;
/* 159 */                   OI10i0Il oI10i0Il14 = (OI10i0Il) this.I00io1l;
/* 163 */                   O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) obj;
/* 171 */                   if (o11iO00I1o.I0001Ioi1lo(o1oIOiI11o02) instanceof IO1i11) {
/* 173 */                       o11iO00I1o.I000OOo1O(o1oIOiI11o02);
                            }
/* 176 */                   o11iO00I1o.I000iOII(false);
/* 183 */                   l1Oo0iIiO1i.I00000oIO(o1oIOiI11o02).I0000oI00(o1oIOiI11o02);
/* 186 */                   textToSpeech.stop();
/* 189 */                   ooIoI0iii0.I000O01llI0();
/* 196 */                   O010OIi o010OIi = (O010OIi) oI10i0Il13.getValue();
/* 198 */                   if (o010OIi != null) {
/* 200 */                       o010OIi.I000II(null);
                            }
/* 203 */                   oI10i0Il13.setValue(null);
/* 216 */                   if (((Boolean) oI10i0Il14.getValue()).booleanValue()) {
/* 218 */                       illOOo00lI.invoke();
                            }
/* 221 */                   return ooiIlOl1iI2;
                        case 9:
/* 90 */                    OOIIOiolI oOIIOiolI = (OOIIOiolI) this.I00iiO;
/* 95 */                    OI10i0Il oI10i0Il15 = (OI10i0Il) this.I00iiI;
/* 100 */                   O0oiOi o0oiOi2 = (O0oiOi) this.I00iio;
/* 105 */                   Ioi1Io1o ioi1Io1o = (Ioi1Io1o) this.I00ilI0I1;
/* 110 */                   OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00ilO0;
/* 115 */                   OI10i0Il oI10i0Il16 = (OI10i0Il) this.I00io1l;
/* 123 */                   OOIIooi oOIIooi2 = new OOIIooi((Context) obj);
/* 130 */                   oOIIOiolI.I00IO1oi11O(oOIIooi2.getSurfaceProvider());
/* 133 */                   l1O0o1.I0000O(oI10i0Il15, o0oiOi2, oOIIOiolI, ioi1Io1o, oIooi1iOiOol, oI10i0Il16);
/* 136 */                   return oOIIooi2;
                        default:
/* 19 */                    Ol0o1OiOIIIl ol0o1OiOIIIl2 = (Ol0o1OiOIIIl) this.I00iiO;
/* 23 */                    OI10i0Il oI10i0Il17 = (OI10i0Il) this.I00iiI;
/* 27 */                    OI10i0Il oI10i0Il18 = (OI10i0Il) this.I00io1l;
/* 31 */                    OI10i0Il oI10i0Il19 = (OI10i0Il) this.I00iio;
/* 35 */                    OI10i0Il oI10i0Il20 = (OI10i0Il) this.I00ilI0I1;
/* 39 */                    OI10i0Il oI10i0Il21 = (OI10i0Il) this.I00ilO0;
/* 45 */                    ol0o1OiOIIIl2.I00100o1O0lo(null);
/* 48 */                    I0O1io1lOO i0O1io1lOO = ((I0O1io1100) obj).I00000oIO;
/* 50 */                    oI10i0Il17.setValue(i0O1io1lOO);
/* 53 */                    int iOrdinal = i0O1io1lOO.ordinal();
/* 57 */                    if (iOrdinal == 0) {
/* 78 */                        oI10i0Il18.setValue(Boolean.TRUE);
                            } else if (iOrdinal == 1) {
/* 72 */                        oI10i0Il19.setValue(Boolean.TRUE);
                            } else if (iOrdinal == 2) {
/* 66 */                        oI10i0Il20.setValue(Boolean.TRUE);
                            }
/* 83 */                    oI10i0Il21.setValue(Boolean.FALSE);
/* 86 */                    return ooiIlOl1iI2;
                    }
                }

/* 20 */        public I0O0o00OlIoi(int i) {
/* 21 */            this.I00iOIl = i;
                }
            }
