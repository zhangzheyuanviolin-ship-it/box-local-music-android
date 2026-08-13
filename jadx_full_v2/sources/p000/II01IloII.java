            package p000;

            import android.content.Context;
            import android.speech.tts.TextToSpeech;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import java.io.File;
            import java.io.InputStreamReader;
            import java.net.URL;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            import org.json.JSONObject;
            
/* 15 */    public final class II01IloII extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final Object I00iiI;
                public Object I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II01IloII(II1o0111IO0 iI1o0111IO0, O1OIi1 o1OIi1, Context context, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo) {
/* 13 */            super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 1;
/* 4 */             this.I00iiO = iI1o0111IO0;
/* 6 */             this.I00iio = o1OIi1;
/* 8 */             this.I00ilI0I1 = context;
/* 10 */            this.I00iiI = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iio;
/* 5 */             Object obj3 = this.I00iiI;
/* 7 */             Object obj4 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 165 */                   return new II01IloII((Ol1o0O0O0) this.I00iiO, (OI10i0Il) obj3, (String) obj4, (OI10i0Il) obj2, iOoil1iiIilo);
                        case 1:
/* 144 */                   return new II01IloII((II1o0111IO0) this.I00iiO, (O1OIi1) obj2, (Context) obj4, (OI10i0Il) obj3, iOoil1iiIilo);
                        case 2:
/* 121 */                   II01IloII iI01IloII = new II01IloII((OO1io0l0) obj3, (OlooOo) obj2, (Oo0IOoOi01) obj4, iOoil1iiIilo);
/* 124 */                   iI01IloII.I00iiO = obj;
/* 126 */                   return iI01IloII;
                        case 3:
/* 108 */                   return new II01IloII((O1ol100o0O) this.I00iiO, (OI1o1o1iO1l) obj4, (OI10i0Il) obj3, (OI10i0Il) obj2, iOoil1iiIilo);
                        case 4:
/* 87 */                    return new II01IloII((O1oIOiI11o0) this.I00iiO, (Map) obj3, (O1ol100o0O) obj2, (O1o10Iiio) obj4, iOoil1iiIilo, 4);
                        case 5:
/* 65 */                    return new II01IloII((String) obj4, (Ol0o1OiOIIIl) this.I00iiO, (Function1) obj3, (IllOOo00lI) obj2, iOoil1iiIilo);
                        case 6:
/* 44 */                    return new II01IloII((O1oIOiI11o0) this.I00iiO, (Context) obj3, (I0IO1io0I) obj2, (I1iO1OOoOiOO) obj4, iOoil1iiIilo, 6);
                        default:
/* 20 */                    II01IloII iI01IloII2 = new II01IloII((IOiOol0) obj3, iOoil1iiIilo, (Context) obj2, (String) obj4);
/* 23 */                    iI01IloII2.I00iiO = obj;
/* 25 */                    return iI01IloII2;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 117 */                   ((II01IloII) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 120 */                   return ooiIlOl1iI;
                        case 1:
/* 103 */                   ((II01IloII) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 106 */                   return ooiIlOl1iI;
                        case 2:
/* 89 */                    ((II01IloII) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 92 */                    return ooiIlOl1iI;
                        case 3:
/* 75 */                    ((II01IloII) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 78 */                    return ooiIlOl1iI;
                        case 4:
/* 61 */                    ((II01IloII) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 64 */                    return ooiIlOl1iI;
                        case 5:
/* 47 */                    ((II01IloII) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 50 */                    return ooiIlOl1iI;
                        case 6:
/* 33 */                    ((II01IloII) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 36 */                    return ooiIlOl1iI;
                        default:
/* 18 */                    return ((II01IloII) create((Map) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x01f0  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    O111OO1Oi o111OO1OiI0010I0i;
                    OloIl1l1oOii oloIl1l1oOiiI001i1O0Ol;
                    Object obj2;
                    Object value;
                    boolean z;
                    boolean z2;
                    String str;
                    File file;
                    int iOptInt;
                    switch (this.I00iOIl) {
                        case 0:
/* 1468 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 1470 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1475 */                  Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00iiO;
/* 1477 */                  ol1o0O0O0.clear();
/* 1490 */                  List list = ((II0I0ili0) ((OI10i0Il) this.I00iiI).getValue()).I00000oIO;
/* 1496 */                  String str2 = (String) this.I00ilI0I1;
/* 1500 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iio;
/* 1504 */                  ArrayList arrayList = new ArrayList();
/* 1515 */                  for (Object obj3 : list) {
/* 1522 */                      II00Ol1Ii iI00Ol1Ii = (II00Ol1Ii) obj3;
/* 1534 */                      if (!O0000Ioio00.I0000O((String) oI10i0Il.getValue(), str2)) {
/* 1538 */                          O111Oli o111OliI0010I0i = iI00Ol1Ii.I00000oOI.I0010I0i();
/* 1566 */                          if (O0000Ioio00.I0000O((o111OliI0010I0i == null || (o111OO1OiI0010I0i = o111OliI0010I0i.I0010I0i()) == null) ? null : o111OO1OiI0010I0i.I001i1O0Ol(), (String) oI10i0Il.getValue())) {
                                    }
                                }
/* 1568 */                      arrayList.add(obj3);
                            }
/* 1572 */                  ol1o0O0O0.addAll(arrayList);
/* 1575 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 1250 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 1252 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1258 */                  II1o0111IO0 iI1o0111IO0 = (II1o0111IO0) this.I00iiO;
/* 1260 */                  I1OI0i1lo i1OI0i1lo = iI1o0111IO0.I000O01llI0;
/* 1274 */                  float f = iI1o0111IO0.I00000oOI.getSharedPreferences("box_settings", 0).getFloat("boxassist_speech_rate", 0.0f);
/* 1278 */                  i1OI0i1lo.I0000oI00 = f;
/* 1282 */                  if (f > 0.0f && i1OI0i1lo.I0000Il00O) {
                                try {
/* 1288 */                          TextToSpeech textToSpeech = i1OI0i1lo.I00000oOI;
/* 1290 */                          if (textToSpeech != null) {
/* 1292 */                              textToSpeech.setSpeechRate(f);
                                    }
                                } catch (Throwable th) {
/* 1297 */                          lIoii1l01l0i.I00000oIO(th);
                                }
                            }
/* 1316 */                  iI1o0111IO0.I000O01llI0.I000O01llI0 = iI1o0111IO0.I00000oOI.getSharedPreferences("box_settings", 0).getBoolean("boxassist_haptics", true);
/* 1330 */                  iI1o0111IO0.I000l1 = iI1o0111IO0.I00000oOI.getSharedPreferences("box_settings", 0).getBoolean("boxassist_hazards_only", false);
/* 1347 */                  iI1o0111IO0.I001l0I00 = iI1o0111IO0.I00000oOI.getSharedPreferences("box_settings", 0).getFloat("boxassist_score_threshold", 0.3f);
/* 1359 */                  if (!((II1l1O1oi01) iI1o0111IO0.I0000Il00O.getValue()).I00000oOI) {
/* 1362 */                      OlO0OIIl1 olO0OIIl1 = iI1o0111IO0.I0000Il00O;
/* 1384 */                      olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), null, false, "Loading models…", null, false, 27));
/* 1397 */                      iOi1II01i0.I0000O(OooiooIOO.I00000oIO(iI1o0111IO0), null, null, new II1loOl(iI1o0111IO0, null), 3);
                            }
/* 1402 */                  Context context = (Context) this.I00ilI0I1;
/* 1406 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiI;
/* 1408 */                  O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 1422 */                  if (!((Boolean) oI10i0Il2.getValue()).booleanValue()) {
/* 1426 */                      o101lO1I0000oI00.add("android.permission.CAMERA");
                            }
/* 1435 */                  if (iOI10i0I11.I00000oIO(context, "android.permission.RECORD_AUDIO") != 0) {
/* 1437 */                      o101lO1I0000oI00.add("android.permission.RECORD_AUDIO");
                            }
/* 1440 */                  O101lO1 o101lO1I0000Il00O = IOOi1I.I0000Il00O(o101lO1I0000oI00);
/* 1448 */                  if (!o101lO1I0000Il00O.isEmpty()) {
/* 1461 */                      ((O1OIi1) this.I00iio).I00000oIO(o101lO1I0000Il00O.toArray(new String[0]));
                            }
/* 1464 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 1203 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 1205 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1210 */                  Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 1212 */                  Ii01I10 ii01I10 = Ii01I10.I00iio;
/* 1218 */                  OO1io0l0 oO1io0l0 = (OO1io0l0) this.I00iiI;
/* 1224 */                  IOoil1iiIilo iOoil1iiIilo = null;
/* 1230 */                  iOi1II01i0.I0000O(ii0110, null, ii01I10, new IOoolOIio0lO(oO1io0l0, (OlooOo) this.I00iio, iOoil1iiIilo, 0), 1);
/* 1244 */                  iOi1II01i0.I0000O(ii0110, null, ii01I10, new I00oI0i(oO1io0l0, (Oo0IOoOi01) this.I00ilI0I1, iOoil1iiIilo, 26), 1);
/* 1247 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 996 */                   O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiO;
/* 998 */                   OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 1000 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 1002 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1007 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiI;
/* 1009 */                  Ii0i0o1lliO1 ii0i0o1lliO1 = Ilo1IoOo.I00000oIO;
/* 1017 */                  String str3 = ((O1oiOloOo) oI10i0Il3.getValue()).I000o00OoI0I;
/* 1019 */                  if (str3 != null && !((O1oiOloOo) oI10i0Il3.getValue()).I0000oI00 && (oloIl1l1oOiiI001i1O0Ol = o1ol100o0O.I001i1O0Ol(str3)) != null) {
/* 1043 */                      ArrayList arrayList2 = oloIl1l1oOiiI001i1O0Ol.I000OiO;
/* 1055 */                      Map map = ((O1oiOloOo) o1ol100o0O.I000OOo1O.I00iOIl.getValue()).I0000Il00O;
/* 1057 */                      Iterator it = arrayList2.iterator();
                                while (true) {
/* 1065 */                          if (it.hasNext()) {
/* 1067 */                              Object next = it.next();
/* 1080 */                              O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) map.get(((O1oIOiI11o0) next).I00000oIO);
/* 1090 */                              if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.SUCCEEDED) {
/* 1092 */                                  obj2 = next;
                                        }
                                    } else {
/* 1095 */                              obj2 = null;
                                    }
                                }
/* 1097 */                      O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) obj2;
/* 1099 */                      if (o1oIOiI11o0 != null || (o1oIOiI11o0 = (O1oIOiI11o0) IOOi0Ool1i.I00II0Ol1O0l(arrayList2)) != null) {
/* 1112 */                          O1oIOiI11o0 o1oIOiI11o02 = o1oIOiI11o0;
/* 1114 */                          OlO0OIIl1 olO0OIIl12 = o1ol100o0O.I000O01llI0;
/* 1157 */                          do {
/* 1116 */                              value = olO0OIIl12.getValue();
/* 1157 */                          } while (!olO0OIIl12.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) value, null, null, null, null, false, null, null, null, 0L, 0L, null, 0.0f, null, null, false, 8191)));
/* 1163 */                          ((OI10i0Il) this.I00iio).setValue("");
/* 1176 */                          String str4 = ((O1oiOloOo) oI10i0Il3.getValue()).I000oI1ioi ? "&voiceMode=true" : "";
/* 1180 */                          OI1o1o1iO1l oI1o1o1iO1l = (OI1o1o1iO1l) this.I00ilI0I1;
/* 1188 */                          StringBuilder sbI00111O = IIl001iO0Io.I00111O("route_model/", str3, "/", o1oIOiI11o02.I00000oIO, "?autoResume=false");
/* 1192 */                          sbI00111O.append(str4);
/* 1199 */                          OI1o1o1iO1l.I0000Il00O(oI1o1o1iO1l, sbI00111O.toString());
                                }
                            }
/* 1202 */                  return ooiIlOl1iI;
                        case 4:
/* 928 */                   Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 930 */                   lIoii1l01l0i.I00000oOI(obj);
/* 935 */                   O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) this.I00iiO;
/* 947 */                   if (!O0000Ioio00.I0000O(o1oIOiI11o03.I00IoIO0lI, (Map) this.I00iiI)) {
/* 960 */                       ((O1ol100o0O) this.I00iio).I00Io1o110i(o1oIOiI11o03, new O1oOil(O1oOl0.I00iOIl));
/* 965 */                       O1o10Iiio o1o10Iiio = (O1o10Iiio) this.I00ilI0I1;
/* 970 */                       O1o10Iiio.I0001Ioi1lo(o1o10Iiio.I00000oOI, false);
/* 974 */                       o1o10Iiio.I000OiO(true);
/* 979 */                       o1o10Iiio.I000iOII("'");
/* 982 */                       o1o10Iiio.I000II();
/* 985 */                       o1o10Iiio.I000O01llI0(false);
/* 988 */                       o1o10Iiio.I0000oI00();
                            }
/* 991 */                   return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 587 */                   Function1 function1 = (Function1) this.I00iiI;
/* 589 */                   OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 593 */                   Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00iiO;
/* 603 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 605 */                   lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 610 */                       String strI00100o1O0lo = (String) this.I00ilI0I1;
/* 617 */                       if (OlOolloIIOl0.I000II(strI00100o1O0lo, "/SKILL.md", false)) {
                                    try {
/* 621 */                               strI00100o1O0lo = OlOoOIi0o.I00100o1O0lo(9, strI00100o1O0lo);
                                    } catch (Throwable th2) {
/* 626 */                               th = th2;
/* 627 */                               z = false;
/* 924 */                               ol0o1OiOIIIl.I00100l0(z);
/* 927 */                               throw th;
                                    }
                                }
/* 634 */                       if (OlOolloIIOl0.I000II(strI00100o1O0lo, "/", false)) {
/* 637 */                           strI00100o1O0lo = OlOoOIi0o.I00100o1O0lo(1, strI00100o1O0lo);
                                }
/* 641 */                       String str5 = strI00100o1O0lo;
/* 647 */                       String strConcat = str5.concat("/SKILL.md");
                                try {
/* 666 */                           InputStreamReader inputStreamReader = new InputStreamReader(new URL(strConcat).openConnection().getInputStream());
                                    try {
/* 670 */                               String strI00000oOI = lOliOoIi.I00000oOI(inputStreamReader);
/* 674 */                               inputStreamReader.close();
/* 681 */                               if (strI00000oOI.length() == 0) {
/* 683 */                                   String strConcat2 = "SKILL.md is empty at ".concat(strConcat);
/* 687 */                                   ol0o1OiOIIIl.I00100o1O0lo(strConcat2);
/* 690 */                                   function1.invoke(strConcat2);
/* 693 */                                   z2 = false;
                                        } else {
/* 708 */                                   OIoi0IIoi oIoi0IIoiI0001Ioi1lo = Ol0o1OiOIIIl.I0001Ioi1lo((Ol0o1OiOIIIl) this.I00iiO, strI00000oOI, false, str5, null, 16);
/* 714 */                                   Ol0ioI1iI ol0ioI1iI = (Ol0ioI1iI) oIoi0IIoiI0001Ioi1lo.I00iOIl;
/* 718 */                                   List list2 = (List) oIoi0IIoiI0001Ioi1lo.I00iiI;
/* 727 */                                   if (!list2.isEmpty()) {
/* 759 */                                       String str6 = "Error parsing SKILL.md from " + strConcat + ": " + IOOi0Ool1i.I00IlilI0i0i(list2, ", ", null, null, null, 62);
/* 763 */                                       ol0o1OiOIIIl.I00100o1O0lo(str6);
/* 766 */                                       function1.invoke(str6);
/* 769 */                                       z2 = false;
                                            } else if (ol0ioI1iI != null) {
/* 775 */                                       IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iio;
/* 785 */                                       List list3 = ((Ol0loOOoo) ol0o1OiOIIIl.I0000O.getValue()).I00000oOI;
/* 791 */                                       if (!(list3 instanceof Collection) || !list3.isEmpty()) {
/* 803 */                                           Iterator it2 = list3.iterator();
/* 811 */                                           while (it2.hasNext()) {
/* 833 */                                               if (O0000Ioio00.I0000O(((Ol0oI1llIloI) it2.next()).I00000oIO.I001i1O0Ol(), ol0ioI1iI.I001i1O0Ol())) {
/* 857 */                                                   String str7 = "A skill with the name '" + ol0ioI1iI.I001i1O0Ol() + "' already exists.";
/* 861 */                                                   ol0o1OiOIIIl.I00100o1O0lo(str7);
/* 864 */                                                   function1.invoke(str7);
/* 867 */                                                   z2 = false;
                                                        }
                                                    }
                                                }
/* 870 */                                       ol0o1OiOIIIl.I0000oI00(ol0ioI1iI);
/* 873 */                                       illOOo00lI.invoke();
/* 876 */                                       z2 = false;
                                            } else {
/* 876 */                                       z2 = false;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        try {
/* 883 */                                   throw th3;
                                        } catch (Throwable th4) {
/* 885 */                                   ii1OOii.I00000oIO(inputStreamReader, th3);
/* 888 */                                   throw th4;
                                        }
                                    }
                                } catch (Exception e) {
/* 895 */                           Log.e("AGSkillManagerVM", "Error fetching SKILL.md from ".concat(strConcat), e);
/* 910 */                           String str8 = "Failed to fetch SKILL.md: " + e.getMessage();
/* 914 */                           ol0o1OiOIIIl.I00100o1O0lo(str8);
/* 917 */                           function1.invoke(str8);
/* 920 */                           z2 = false;
                                }
/* 694 */                       ol0o1OiOIIIl.I00100l0(z2);
/* 923 */                       return ooiIlOl1iI2;
                            } catch (Throwable th5) {
/* 643 */                       th = th5;
/* 644 */                       z = false;
/* 924 */                       ol0o1OiOIIIl.I00100l0(z);
/* 927 */                       throw th;
                            }
                        case 6:
/* 54 */                    OoiIlOl1iI ooiIlOl1iI3 = OoiIlOl1iI.I00000oIO;
/* 58 */                    I0IO1io0I i0IO1io0I = (I0IO1io0I) this.I00iio;
/* 60 */                    Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 62 */                    lIoii1l01l0i.I00000oOI(obj);
/* 67 */                    O1oIOiI11o0 o1oIOiI11o04 = (O1oIOiI11o0) this.I00iiO;
/* 71 */                    Context context2 = (Context) this.I00iiI;
/* 73 */                    String str9 = o1oIOiI11o04.I000OiO;
/* 75 */                    String str10 = o1oIOiI11o04.I000O01llI0;
/* 77 */                    String str11 = o1oIOiI11o04.I00000oIO;
/* 79 */                    boolean z3 = o1oIOiI11o04.I00IOO;
/* 81 */                    String strI00000oOI2 = o1oIOiI11o04.I00000oOI(context2, str9);
/* 87 */                    File file2 = new File(strI00000oOI2);
/* 90 */                    File parentFile = file2.getParentFile();
/* 94 */                    if (parentFile == null || !file2.exists()) {
/* 579 */                       i0IO1io0I.invoke("TTS model file not found at ".concat(strI00000oOI2));
/* 102 */                       return ooiIlOl1iI3;
                            }
/* 123 */                   if (OlOolloIIOl0.I000l1(str11, "Kokoro", false)) {
/* 127 */                       File file3 = new File(parentFile, "voices.bin");
/* 134 */                       if (!file3.exists()) {
/* 136 */                           file3.getAbsolutePath();
/* 145 */                           if (I1iO1OOoOiOO.I0000oI00(file3, "https://huggingface.co/csukuangfj/kokoro-en-v0_19/resolve/main/voices.bin")) {
/* 158 */                               File file4 = new File(parentFile, "tokens.txt");
/* 165 */                               if (file4.exists() || I1iO1OOoOiOO.I0000oI00(file4, "https://huggingface.co/csukuangfj/kokoro-en-v0_19/resolve/main/tokens.txt")) {
/* 185 */                                   if (!lOoIi0i0i.I00000oOI(file2, "sample_rate")) {
/* 189 */                                       lOoIi0i0i.I00000oIO(file2, "sample_rate", "24000");
                                            }
/* 198 */                                   if (!lOoIi0i0i.I00000oOI(file2, "n_speakers")) {
/* 200 */                                       lOoIi0i0i.I00000oIO(file2, "n_speakers", "1");
                                            }
/* 209 */                                   if (!lOoIi0i0i.I00000oOI(file2, "has_espeak")) {
/* 211 */                                       lOoIi0i0i.I00000oIO(file2, "has_espeak", "1");
                                            }
/* 220 */                                   if (!lOoIi0i0i.I00000oOI(file2, "style_dim")) {
/* 224 */                                       lOoIi0i0i.I00000oIO(file2, "style_dim", "256");
                                            }
/* 229 */                                   II1olI iI1olI = new II1olI();
/* 242 */                                   if (iI1olI.I0000Il00O(context2, parentFile.getAbsolutePath(), "model.onnx", "voices.bin")) {
/* 244 */                                       o1oIOiI11o04.I00IlilI0i0i = iI1olI;
/* 246 */                                       i0IO1io0I.invoke("");
                                            } else {
/* 252 */                                       i0IO1io0I.invoke("Failed to load Kokoro model");
                                            }
                                        } else {
/* 177 */                                   i0IO1io0I.invoke("Failed to download Kokoro tokens.txt");
                                        }
                                    } else {
/* 149 */                               i0IO1io0I.invoke("Failed to download Kokoro voices.bin");
                                    }
                                }
/* 152 */                       return ooiIlOl1iI3;
                            }
/* 272 */                   File file5 = new File(parentFile, Oi010OO0.I00111O(file2.getName(), ".json"));
/* 279 */                   if (!file5.exists()) {
/* 296 */                       I1iO1OOoOiOO.I0000oI00(file5, str10 + ".json");
                            }
/* 301 */                   File file6 = new File(parentFile, "tokens.txt");
/* 308 */                   if (file6.exists()) {
/* 408 */                       str = strI00000oOI2;
/* 410 */                       file = file5;
                            } else {
/* 312 */                       file = file5;
/* 315 */                       str = strI00000oOI2;
/* 318 */                       int iI001lllioOl = OlOoOIi0o.I001lllioOl(str10, '/', 0, 6);
/* 332 */                       String strConcat3 = iI001lllioOl <= 0 ? null : str10.substring(0, iI001lllioOl + 1).concat("tokens.txt");
/* 336 */                       if ((strConcat3 == null || !I1iO1OOoOiOO.I0000oI00(file6, strConcat3)) && !I1iO1OOoOiOO.I0000oI00(file6, "https://huggingface.co/csukuangfj/vits-piper-en_US-amy-medium/resolve/main/tokens.txt")) {
/* 353 */                           if (z3) {
/* 378 */                               i0IO1io0I.invoke("Failed to download tokens.txt. Place it next to " + file2.getName() + ".");
/* 258 */                               return ooiIlOl1iI3;
                                    }
/* 404 */                           Log.w("TtsTask", "tokens.txt unavailable for " + str11 + " — continuing anyway");
                                }
                            }
/* 418 */                   if (!lOoIi0i0i.I00000oOI(file2, "sample_rate")) {
/* 420 */                       if (z3) {
/* 422 */                           i0IO1io0I.invoke("Not a supported Piper VITS model. Import a .onnx file from a Piper voice (e.g. from huggingface.co/csukuangfj/vits-piper-*).");
/* 258 */                           return ooiIlOl1iI3;
                                }
/* 431 */                       if (!file.exists()) {
/* 435 */                           i0IO1io0I.invoke("Model file appears incompatible (missing sample_rate metadata). Please re-download.");
/* 258 */                           return ooiIlOl1iI3;
                                }
/* 446 */                       if (!lOoIi0i0i.I00000oIO(file2, "sample_rate", "22050")) {
/* 450 */                           i0IO1io0I.invoke("Failed to prepare model (metadata patch failed)");
/* 258 */                           return ooiIlOl1iI3;
                                }
                            }
/* 459 */                   if (!lOoIi0i0i.I00000oOI(file2, "n_speakers")) {
/* 461 */                       if (z3) {
/* 463 */                           i0IO1io0I.invoke("Not a supported Piper VITS model. Import a .onnx file from a Piper voice (e.g. from huggingface.co/csukuangfj/vits-piper-*).");
/* 258 */                           return ooiIlOl1iI3;
                                }
/* 472 */                       if (file.exists()) {
                                    try {
/* 487 */                               iOptInt = new JSONObject(IlIl10.I000OOo1O(file)).optInt("num_speakers", 1);
                                    } catch (Throwable unused) {
                                    }
/* 497 */                           int i = iOptInt < 1 ? 1 : iOptInt;
/* 503 */                           lOoIi0i0i.I00000oIO(file2, "n_speakers", String.valueOf(i));
                                }
                            }
/* 512 */                   if (!lOoIi0i0i.I00000oOI(file2, "language")) {
/* 516 */                       lOoIi0i0i.I00000oIO(file2, "language", "en");
                            }
/* 521 */                   File file7 = new File(parentFile, "voices.bin");
/* 526 */                   II1olI iI1olI2 = new II1olI();
/* 553 */                   if (!iI1olI2.I0000Il00O(context2, parentFile.getAbsolutePath(), file2.getName(), file7.exists() ? file7.getName() : "")) {
/* 569 */                       i0IO1io0I.invoke("Failed to load TTS model from ".concat(str));
/* 258 */                       return ooiIlOl1iI3;
                            }
/* 555 */                   o1oIOiI11o04.I00IlilI0i0i = iI1olI2;
/* 557 */                   i0IO1io0I.invoke("");
/* 258 */                   return ooiIlOl1iI3;
                        default:
/* 13 */                    Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 15 */                    lIoii1l01l0i.I00000oOI(obj);
/* 30 */                    o0l0iIlo0O o0l0iilo0o = (o0l0iIlo0O) ((Map) this.I00iiO).remove((String) this.I00ilI0I1);
                            return o0l0iilo0o != null ? Boolean.valueOf(IOiOol0.I00O0i0ii((IOiOol0) this.I00iiI, (Context) this.I00iio, o0l0iilo0o)) : Boolean.FALSE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public II01IloII(IOiOol0 iOiOol0, IOoil1iiIilo iOoil1iiIilo, Context context, String str) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 7;
/* 17 */            this.I00ilI0I1 = str;
                    this.I00iiI = iOiOol0;
                    this.I00iio = context;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public II01IloII(O1oIOiI11o0 o1oIOiI11o0, Object obj, Object obj2, Object obj3, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 18 */            this.I00iOIl = i;
                    this.I00iiO = o1oIOiI11o0;
                    this.I00iiI = obj;
                    this.I00iio = obj2;
                    this.I00ilI0I1 = obj3;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public II01IloII(O1ol100o0O o1ol100o0O, OI1o1o1iO1l oI1o1o1iO1l, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 3;
/* 19 */            this.I00iiO = o1ol100o0O;
                    this.I00ilI0I1 = oI1o1o1iO1l;
                    this.I00iiI = oI10i0Il;
                    this.I00iio = oI10i0Il2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 19 */        public II01IloII(OO1io0l0 oO1io0l0, OlooOo olooOo, Oo0IOoOi01 oo0IOoOi01, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 2;
/* 20 */            this.I00iiI = oO1io0l0;
                    this.I00iio = olooOo;
                    this.I00ilI0I1 = oo0IOoOi01;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 20 */        public II01IloII(Ol1o0O0O0 ol1o0O0O0, OI10i0Il oI10i0Il, String str, OI10i0Il oI10i0Il2, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 0;
/* 21 */            this.I00iiO = ol1o0O0O0;
                    this.I00iiI = oI10i0Il;
                    this.I00ilI0I1 = str;
                    this.I00iio = oI10i0Il2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 21 */        public II01IloII(String str, Ol0o1OiOIIIl ol0o1OiOIIIl, Function1 function1, IllOOo00lI illOOo00lI, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 5;
/* 22 */            this.I00ilI0I1 = str;
                    this.I00iiO = ol0o1OiOIIIl;
                    this.I00iiI = function1;
                    this.I00iio = illOOo00lI;
                }
            }
