            package p000;

            import android.util.Log;
            import com.google.ai.edge.gallery.data.AllowedModel;
            import com.google.ai.edge.gallery.data.ModelAllowlist;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.ai.edge.gallery.data.RuntimeType;
            import com.google.ai.edge.gallery.data.SocModelFile;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            
            public final class O1oio1O extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final O1ol100o0O I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1oio1O(O1ol100o0O o1ol100o0O, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = o1ol100o0O;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O1ol100o0O o1ol100o0O = this.I00iiI;
                    switch (i) {
                        case 0:
/* 25 */                    return new O1oio1O(o1ol100o0O, iOoil1iiIilo, 0);
                        case 1:
/* 18 */                    return new O1oio1O(o1ol100o0O, iOoil1iiIilo, 1);
                        default:
/* 11 */                    return new O1oio1O(o1ol100o0O, iOoil1iiIilo, 2);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 38 */                    ((O1oio1O) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 28 */                    ((O1oio1O) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((O1oio1O) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object value;
                    Object next;
                    Object next2;
                    Iterator<AllowedModel> it;
                    Map<String, SocModelFile> socToModelFiles;
                    Object value2;
                    Oo1O0Ol0ll oo1O0Ol0ll;
                    OOli1O oOli1O;
                    String str;
                    I01lO1io10 i01lO1io10;
/* 3 */             int i = this.I00iOIl;
/* 5 */             O1ol100o0O o1ol100o0O = this.I00iiI;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 1077 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 1079 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1092 */                  List list = ((O1oiOloOo) o1ol100o0O.I000OOo1O.I00iOIl.getValue()).I00000oIO;
/* 1098 */                  ArrayList arrayList = new ArrayList();
/* 1101 */                  Iterator it2 = list.iterator();
/* 1109 */                  while (it2.hasNext()) {
/* 1119 */                      IOOii0O10Io0.I00100l0(arrayList, ((OloIl1l1oOii) it2.next()).I000OiO);
                            }
/* 1125 */                  ArrayList arrayList2 = new ArrayList();
/* 1128 */                  Iterator it3 = arrayList.iterator();
/* 1136 */                  while (it3.hasNext()) {
/* 1138 */                      Object next3 = it3.next();
/* 1149 */                      if (((O1oIOiI11o0) next3).I00100l0 == RuntimeType.AICORE) {
/* 1151 */                          arrayList2.add(next3);
                                }
                            }
/* 1157 */                  HashSet hashSet = new HashSet();
/* 1162 */                  ArrayList arrayList3 = new ArrayList();
/* 1165 */                  Iterator it4 = arrayList2.iterator();
/* 1173 */                  while (it4.hasNext()) {
/* 1175 */                      Object next4 = it4.next();
/* 1188 */                      if (hashSet.add(((O1oIOiI11o0) next4).I00000oIO)) {
/* 1190 */                          arrayList3.add(next4);
                                }
                            }
/* 1194 */                  Iterator it5 = arrayList3.iterator();
/* 1202 */                  while (it5.hasNext()) {
/* 1211 */                      o1ol100o0O.I00100o1O0lo(null, (O1oIOiI11o0) it5.next());
                            }
                            break;
                        case 1:
/* 180 */                   OOli1O oOli1O2 = o1ol100o0O.I000OOo1O;
/* 182 */                   OlO0OIIl1 olO0OIIl1 = o1ol100o0O.I000O01llI0;
/* 184 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 186 */                   lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 191 */                       OOo0ooi oOo0ooi = new OOo0ooi();
/* 196 */                       ModelAllowlist modelAllowlistI00IioO0OiOi = o1ol100o0O.I00IioO0OiOi("model_allowlist_test.json");
/* 200 */                       oOo0ooi.I00iOIl = modelAllowlistI00IioO0OiOi;
/* 204 */                       if (modelAllowlistI00IioO0OiOi == null) {
/* 206 */                           modelAllowlistI00IioO0OiOi = o1ol100o0O.I00IOO();
/* 210 */                           oOo0ooi.I00iOIl = modelAllowlistI00IioO0OiOi;
/* 212 */                           if (modelAllowlistI00IioO0OiOi == null) {
/* 216 */                               Log.w("AGModelManagerViewModel", "Failed to load model allowlist from assets. Trying disk cache");
/* 221 */                               modelAllowlistI00IioO0OiOi = o1ol100o0O.I00IioO0OiOi("model_allowlist.json");
/* 225 */                               oOo0ooi.I00iOIl = modelAllowlistI00IioO0OiOi;
                                    }
                                }
/* 231 */                       if (modelAllowlistI00IioO0OiOi == null) {
/* 282 */                           do {
/* 233 */                               value2 = olO0OIIl1.getValue();
/* 282 */                           } while (!olO0OIIl1.I000iOII(value2, O1oiOloOo.I00000oIO((O1oiOloOo) oOli1O2.I00iOIl.getValue(), null, null, null, null, false, "Failed to load model list", null, null, 0L, 0L, null, 0.0f, null, null, false, 32719)));
                                } else {
/* 286 */                           Objects.toString(modelAllowlistI00IioO0OiOi);
/* 293 */                           IlIi0Il ilIi0Il = new IlIi0Il(22);
/* 296 */                           ilIi0Il.I00iiI = oOo0ooi;
/* 298 */                           VarHandle.storeStoreFence();
/* 303 */                           OllO00oiil ollO00oiil = new OllO00oiil(ilIi0Il);
/* 308 */                           List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(o1ol100o0O.I0000oI00);
/* 316 */                           int i2 = 10;
/* 322 */                           ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(listI00iIi0i1o, 10));
/* 325 */                           Iterator it6 = listI00iIi0i1o.iterator();
/* 333 */                           while (it6.hasNext()) {
/* 345 */                               arrayList4.add(((Ii0ioo10iO0) it6.next()).I00000oOI());
                                    }
/* 351 */                           LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 362 */                           Iterator<AllowedModel> it7 = ((ModelAllowlist) oOo0ooi.I00iOIl).getModels().iterator();
                                    while (true) {
/* 370 */                               int i3 = 0;
/* 371 */                               if (it7.hasNext()) {
/* 373 */                                   AllowedModel next5 = it7.next();
/* 389 */                                   if (!O0000Ioio00.I0000O(next5.getDisabled(), Boolean.TRUE) && (next5.getRuntimeType() != RuntimeType.AICORE || ((Boolean) ollO00oiil.getValue()).booleanValue())) {
/* 417 */                                       String accelerators = next5.getDefaultConfig().getAccelerators();
/* 421 */                                       if (accelerators == null) {
/* 423 */                                           accelerators = "";
                                                }
/* 432 */                                       List listI00IoIO0lI = OlOoOIi0o.I00IoIO0lI(accelerators, new String[]{","}, 6);
/* 444 */                                       ArrayList arrayList5 = new ArrayList(IOOi1I.I0000O(listI00IoIO0lI, i2));
/* 447 */                                       Iterator it8 = listI00IoIO0lI.iterator();
/* 455 */                                       while (it8.hasNext()) {
/* 471 */                                           arrayList5.add(OlOoOIi0o.I00OIo((String) it8.next()).toString());
                                                }
/* 477 */                                       ArrayList arrayList6 = new ArrayList();
/* 480 */                                       Iterator it9 = arrayList5.iterator();
/* 488 */                                       while (it9.hasNext()) {
/* 490 */                                           Object next6 = it9.next();
/* 501 */                                           if (((String) next6).length() > 0) {
/* 503 */                                               arrayList6.add(next6);
                                                    }
                                                }
/* 512 */                                       if (arrayList6.size() != 1 || !O0000Ioio00.I0000O(arrayList6.get(0), "npu") || (socToModelFiles = next5.getSocToModelFiles()) == null || socToModelFiles.containsKey(IOo1Oilol.I0000O)) {
/* 545 */                                           O1oIOiI11o0 model = next5.toModel();
/* 549 */                                           String str2 = model.I00000oIO;
/* 551 */                                           String str3 = model.I00000oIO;
/* 553 */                                           linkedHashMap.put(str2, model);
/* 568 */                                           for (String str4 : next5.getTaskTypes()) {
/* 576 */                                               Iterator it10 = arrayList4.iterator();
                                                        while (true) {
/* 584 */                                                   if (it10.hasNext()) {
/* 586 */                                                       next2 = it10.next();
/* 600 */                                                       if (O0000Ioio00.I0000O(((OloIl1l1oOii) next2).I00000oIO, str4)) {
                                                                }
                                                            } else {
/* 606 */                                                       next2 = null;
                                                            }
                                                        }
/* 610 */                                               OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) next2;
/* 612 */                                               if (oloIl1l1oOii != null) {
/* 614 */                                                   ArrayList arrayList7 = oloIl1l1oOii.I000OiO;
/* 616 */                                                   if (arrayList7 == null || !arrayList7.isEmpty()) {
/* 627 */                                                       Iterator it11 = arrayList7.iterator();
/* 635 */                                                       while (it11.hasNext()) {
/* 641 */                                                           it = it7;
/* 653 */                                                           if (!O0000Ioio00.I0000O(((O1oIOiI11o0) it11.next()).I00000oIO, str3)) {
/* 656 */                                                               it7 = it;
                                                                    }
                                                                }
/* 624 */                                                       it = it7;
/* 659 */                                                       arrayList7.add(model);
                                                            } else {
/* 624 */                                                       it = it7;
/* 659 */                                                       arrayList7.add(model);
                                                            }
                                                        } else {
/* 663 */                                                   it = it7;
                                                        }
/* 677 */                                               if (O0000Ioio00.I0000O(oloIl1l1oOii != null ? oloIl1l1oOii.I00000oIO : null, "llm_tiny_garden")) {
/* 685 */                                                   ArrayList arrayList8 = new ArrayList(model.I0000O);
/* 690 */                                                   arrayList8.add(O1ol11oi.I00000oIO);
/* 693 */                                                   model.I0000O = arrayList8;
                                                        }
/* 695 */                                               it7 = it;
                                                    }
/* 701 */                                           Iterator<AllowedModel> it12 = it7;
/* 713 */                                           if (O0000Ioio00.I0000O(next5.getLlmSupportAudio(), Boolean.TRUE)) {
/* 715 */                                               Iterator it13 = arrayList4.iterator();
                                                        while (true) {
/* 723 */                                                   if (it13.hasNext()) {
/* 725 */                                                       next = it13.next();
/* 740 */                                                       if (O0000Ioio00.I0000O(((OloIl1l1oOii) next).I00000oIO, "translator")) {
                                                                }
                                                            } else {
/* 743 */                                                       next = null;
                                                            }
                                                        }
/* 744 */                                               OloIl1l1oOii oloIl1l1oOii2 = (OloIl1l1oOii) next;
/* 746 */                                               if (oloIl1l1oOii2 != null) {
/* 748 */                                                   ArrayList arrayList9 = oloIl1l1oOii2.I000OiO;
/* 750 */                                                   if (arrayList9 == null || !arrayList9.isEmpty()) {
/* 759 */                                                       Iterator it14 = arrayList9.iterator();
/* 767 */                                                       while (it14.hasNext()) {
/* 781 */                                                           if (O0000Ioio00.I0000O(((O1oIOiI11o0) it14.next()).I00000oIO, str3)) {
                                                                    }
                                                                }
                                                            }
/* 789 */                                                   arrayList9.add(model);
                                                        }
                                                    }
/* 783 */                                           it7 = it12;
/* 785 */                                           i2 = 10;
                                                } else {
/* 540 */                                           next5.getName();
                                                }
                                            }
                                        } else {
/* 793 */                                   Iterator it15 = arrayList4.iterator();
/* 801 */                                   while (it15.hasNext()) {
/* 807 */                                       OloIl1l1oOii oloIl1l1oOii3 = (OloIl1l1oOii) it15.next();
/* 809 */                                       List list2 = oloIl1l1oOii3.I000iOII;
/* 811 */                                       ArrayList arrayList10 = oloIl1l1oOii3.I000OiO;
/* 819 */                                       if (!list2.isEmpty()) {
/* 831 */                                           for (String str5 : oloIl1l1oOii3.I000iOII) {
/* 843 */                                               O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) linkedHashMap.get(str5);
/* 845 */                                               if (o1oIOiI11o0 == null) {
/* 879 */                                                   Log.w("AGModelManagerViewModel", "Model '" + str5 + "' in task '" + oloIl1l1oOii3.I00000oOI + "' not found in allowlist.");
                                                        } else {
/* 883 */                                                   if (arrayList10 == null || !arrayList10.isEmpty()) {
/* 892 */                                                       Iterator it16 = arrayList10.iterator();
/* 900 */                                                       while (it16.hasNext()) {
/* 916 */                                                           if (O0000Ioio00.I0000O(((O1oIOiI11o0) it16.next()).I00000oIO, o1oIOiI11o0.I00000oIO)) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
/* 919 */                                                   arrayList10.add(o1oIOiI11o0);
                                                        }
                                                    }
                                                }
                                            }
/* 927 */                                   o1ol100o0O.I000OOo1O(linkedHashMap.values());
/* 930 */                                   o1ol100o0O.I00IO1();
                                            while (true) {
/* 933 */                                       Object value3 = olO0OIIl1.getValue();
/* 938 */                                       O1oiOloOo o1oiOloOo = (O1oiOloOo) value3;
/* 980 */                                       ArrayList arrayList11 = arrayList4;
/* 990 */                                       if (olO0OIIl1.I000iOII(value3, O1oiOloOo.I00000oIO(o1ol100o0O.I000o00OoI0I(), arrayList11, o1ol100o0O.I001l0I00(), null, null, false, null, null, null, 0L, 0L, null, 0.0f, null, o1oiOloOo.I000o00OoI0I, o1oiOloOo.I000oI1ioi, 8172))) {
/* 994 */                                           lOIIilOlOl0i.I00000oIO(o1ol100o0O.I0001Ioi1lo);
/* 997 */                                           o1ol100o0O.I00II0oii1o();
/* 1000 */                                          IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(o1ol100o0O);
/* 1004 */                                          IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 1015 */                                          iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, O1OI1l011OO1.I00000oIO, null, new O1oio1O(o1ol100o0O, null, i3), 2);
                                                    break;
                                                } else {
/* 1019 */                                          arrayList4 = arrayList11;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e) {
/* 1022 */                      e.printStackTrace();
/* 1074 */                      do {
/* 1025 */                          value = olO0OIIl1.getValue();
/* 1074 */                      } while (!olO0OIIl1.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) oOli1O2.I00iOIl.getValue(), null, null, null, null, false, "An unexpected error occurred while loading model list", null, null, 0L, 0L, null, 0.0f, null, null, false, 32719)));
                            }
                            break;
                        default:
/* 12 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 22 */                    O1ol100o0O o1ol100o0O2 = this.I00iiI;
/* 24 */                    Oo1O0Ol0ll oo1O0Ol0llI001iOo1i0O = o1ol100o0O2.I001iOo1i0O();
/* 28 */                    OOli1O oOli1O3 = o1ol100o0O2.I000OOo1O;
/* 48 */                    for (OloIl1l1oOii oloIl1l1oOii4 : ((O1oiOloOo) oOli1O3.I00iOIl.getValue()).I00000oIO) {
/* 59 */                        Iterator it17 = oloIl1l1oOii4.I000OiO.iterator();
/* 67 */                        while (it17.hasNext()) {
/* 73 */                            O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) it17.next();
/* 75 */                            String str6 = o1oIOiI11o02.I00000oIO;
/* 81 */                            if (!linkedHashSet.contains(str6)) {
/* 98 */                                O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) ((O1oiOloOo) oOli1O3.I00iOIl.getValue()).I0000Il00O.get(str6);
/* 108 */                               if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.PARTIALLY_DOWNLOADED) {
/* 114 */                                   if (oo1O0Ol0llI001iOo1i0O.I00000oIO == Oo1O0IIl.I00iiO && (i01lO1io10 = oo1O0Ol0llI001iOo1i0O.I00000oOI) != null) {
/* 124 */                                       o1oIOiI11o02.I00Iooi00oi = i01lO1io10.I0010I0i();
                                            }
/* 149 */                                   oOli1O = oOli1O3;
/* 153 */                                   oo1O0Ol0ll = oo1O0Ol0llI001iOo1i0O;
/* 157 */                                   str = str6;
/* 162 */                                   o1ol100o0O2.I00000oOI.I00000oIO(oloIl1l1oOii4, o1oIOiI11o02, new IliI1Ii1II(2, o1ol100o0O2, O1ol100o0O.class, "setDownloadStatus", "setDownloadStatus(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;)V", 0, 6));
                                        } else {
/* 166 */                                   oo1O0Ol0ll = oo1O0Ol0llI001iOo1i0O;
/* 168 */                                   oOli1O = oOli1O3;
/* 170 */                                   str = str6;
                                        }
/* 171 */                               linkedHashSet.add(str);
/* 174 */                               oo1O0Ol0llI001iOo1i0O = oo1O0Ol0ll;
/* 176 */                               oOli1O3 = oOli1O;
                                    }
                                }
                            }
                            break;
                    }
/* 179 */           return ooiIlOl1iI;
                }
            }
