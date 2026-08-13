            package p000;

            import android.content.Context;
            import android.graphics.Typeface;
            import android.media.Image;
            import android.util.Log;
            import android.view.View;
            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.data.local.entities.FaceRecord;
            import com.google.mlkit.vision.barcode.BarcodeScanner;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.face.FaceDetector;
            import com.google.mlkit.vision.label.ImageLabeler;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.google.mlkit.vision.text.TextRecognizer;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class IiioilIl1Il implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public IiioilIl1Il(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:272:0x0792  */
                /* JADX WARN: Removed duplicated region for block: B:273:0x0794  */
                /* JADX WARN: Type inference failed for: r10v15, types: [IlilIIiIiO] */
                /* JADX WARN: Type inference failed for: r10v16 */
                /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r10v18 */
                /* JADX WARN: Type inference failed for: r10v19 */
                /* JADX WARN: Type inference failed for: r10v20 */
                /* JADX WARN: Type inference failed for: r10v21 */
                /* JADX WARN: Type inference failed for: r10v24, types: [IlilIIiIiO] */
                /* JADX WARN: Type inference failed for: r10v25 */
                /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r10v27 */
                /* JADX WARN: Type inference failed for: r10v28 */
                /* JADX WARN: Type inference failed for: r10v29 */
                /* JADX WARN: Type inference failed for: r10v30 */
                /* JADX WARN: Type inference failed for: r10v32, types: [IlilIIiIiO] */
                /* JADX WARN: Type inference failed for: r10v33 */
                /* JADX WARN: Type inference failed for: r10v34, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r10v35 */
                /* JADX WARN: Type inference failed for: r10v36 */
                /* JADX WARN: Type inference failed for: r10v37 */
                /* JADX WARN: Type inference failed for: r10v38 */
                /* JADX WARN: Type inference failed for: r10v42 */
                /* JADX WARN: Type inference failed for: r10v43 */
                /* JADX WARN: Type inference failed for: r10v44 */
                /* JADX WARN: Type inference failed for: r10v45 */
                /* JADX WARN: Type inference failed for: r10v46 */
                /* JADX WARN: Type inference failed for: r10v47 */
                /* JADX WARN: Type inference failed for: r11v12 */
                /* JADX WARN: Type inference failed for: r11v13 */
                /* JADX WARN: Type inference failed for: r11v14 */
                /* JADX WARN: Type inference failed for: r11v16 */
                /* JADX WARN: Type inference failed for: r11v18 */
                /* JADX WARN: Type inference failed for: r11v19 */
                /* JADX WARN: Type inference failed for: r11v2, types: [IlilIIiIiO] */
                /* JADX WARN: Type inference failed for: r11v20, types: [IlilIIiIiO] */
                /* JADX WARN: Type inference failed for: r11v21 */
                /* JADX WARN: Type inference failed for: r11v26 */
                /* JADX WARN: Type inference failed for: r11v27 */
                /* JADX WARN: Type inference failed for: r11v28 */
                /* JADX WARN: Type inference failed for: r11v29 */
                /* JADX WARN: Type inference failed for: r11v30, types: [IlilIIiIiO] */
                /* JADX WARN: Type inference failed for: r11v31 */
                /* JADX WARN: Type inference failed for: r11v36 */
                /* JADX WARN: Type inference failed for: r11v37 */
                /* JADX WARN: Type inference failed for: r11v38 */
                /* JADX WARN: Type inference failed for: r11v40 */
                /* JADX WARN: Type inference failed for: r11v41 */
                /* JADX WARN: Type inference failed for: r11v5 */
                /* JADX WARN: Type inference failed for: r11v6, types: [IlilIIiIiO] */
                /* JADX WARN: Type inference failed for: r11v7 */
                /* JADX WARN: Type inference failed for: r12v10 */
                /* JADX WARN: Type inference failed for: r12v11 */
                /* JADX WARN: Type inference failed for: r12v12 */
                /* JADX WARN: Type inference failed for: r12v2 */
                /* JADX WARN: Type inference failed for: r12v3, types: [IlilIIiIiO] */
                /* JADX WARN: Type inference failed for: r12v4 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) throws Exception {
                    OIoi0IIoi oIoi0IIoi;
                    Object objInvoke;
                    List list;
                    IlilIIiIiO ililIIiIiO;
                    OlO01l1oOil ooOlioiilil;
                    Typeface typefaceI0000O;
                    OoOlioiilil ooOlioiilil2;
/* 5 */             int i = 14;
/* 7 */             int i2 = 3;
/* 8 */             int i3 = 4;
/* 9 */             int i4 = 2;
/* 10 */            int i5 = 1;
/* 11 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 12 */            int i6 = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 2188 */                  ((Function1) this.I00iiI).invoke(((O1ol100o0O) this.I00iiO).I000iOII);
/* 2191 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 2168 */                  ((Il10IO1II1Io) this.I00iiI).I00000oOI.I00000oOI((Il101oliii) this.I00iiO);
/* 2171 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 2095 */                  View view = (View) this.I00iiI;
/* 2099 */                  IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiO;
/* 2107 */                  Il1io01O0 il1io01O0 = new Il1io01O0();
/* 2110 */                  il1io01O0.I00iiI = view;
/* 2112 */                  il1io01O0.I00iiO = illOOo00lI;
/* 2114 */                  view.addOnAttachStateChangeListener(il1io01O0);
/* 2119 */                  if (!il1io01O0.I00iOIl && view.isAttachedToWindow()) {
/* 2132 */                      view.getViewTreeObserver().addOnGlobalLayoutListener(il1io01O0);
/* 2136 */                      il1io01O0.I00iOIl = true;
                            }
/* 2138 */                  VarHandle.storeStoreFence();
/* 2145 */                  I0IOIo0 i0IOIo0 = new I0IOIo0(8);
/* 2148 */                  i0IOIo0.I00000oOI = il1io01O0;
/* 2150 */                  VarHandle.storeStoreFence();
/* 2153 */                  return i0IOIo0;
                        case 3:
/* 2009 */                  IlI001 ilI001 = (IlI001) this.I00iiI;
/* 2013 */                  FaceRecord faceRecord = (FaceRecord) this.I00iiO;
/* 2017 */                  Olil0III olil0III = (Olil0III) obj;
/* 2019 */                  IOol1o01iII iOol1o01iII = ilI001.I00000oOI;
/* 2021 */                  long j = -1;
/* 2023 */                  if (faceRecord == null) {
/* 2025 */                      iOol1o01iII.getClass();
                            } else {
/* 2029 */                      iOol1o01iII.getClass();
/* 2034 */                      OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("INSERT OR ABORT INTO `faces` (`id`,`name`,`embedding`,`thumbnail`,`created_at`) VALUES (nullif(?, 0),?,?,?,?)");
                                try {
/* 2038 */                          iOol1o01iII.I00000oIO(oiIIl0O1l0lI00000oIO, faceRecord);
/* 2041 */                          oiIIl0O1l0lI00000oIO.I00ol1();
/* 2045 */                          iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 2052 */                          if (lO01iO1I1lOi.I00000oIO(olil0III) != 0) {
/* 2057 */                              OiIIl0O1l0l oiIIl0O1l0lI00000oIO2 = olil0III.I00000oIO("SELECT last_insert_rowid()");
                                        try {
/* 2061 */                                  oiIIl0O1l0lI00000oIO2.I00ol1();
/* 2065 */                                  j = oiIIl0O1l0lI00000oIO2.getLong(0);
/* 2069 */                                  iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO2, null);
                                        } finally {
                                        }
                                    }
                                } finally {
                                }
                            }
/* 2072 */                  return Long.valueOf(j);
                        case 4:
/* 1972 */                  String str = (String) this.I00iiI;
/* 1976 */                  String str2 = (String) this.I00iiO;
/* 1982 */                  OiIIl0O1l0l oiIIl0O1l0lI00000oIO3 = ((Olil0III) obj).I00000oIO("UPDATE faces SET name = ? WHERE name = ?");
                            try {
/* 1987 */                      oiIIl0O1l0lI00000oIO3.I00Io1o110i(1, str);
/* 1990 */                      oiIIl0O1l0lI00000oIO3.I00Io1o110i(2, str2);
/* 1993 */                      oiIIl0O1l0lI00000oIO3.I00ol1();
/* 1996 */                      oiIIl0O1l0lI00000oIO3.close();
/* 1999 */                      return OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th) {
/* 2003 */                      oiIIl0O1l0lI00000oIO3.close();
/* 2006 */                      throw th;
                            }
                        case 5:
/* 1962 */                  ((OI0lOIiOIOOo) this.I00iiI).I00000oOI((Ili10looIi0) this.I00iiO);
/* 1965 */                  return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 1054 */                  IliOI01OIIII iliOI01OIIII = (IliOI01OIIII) this.I00iiI;
/* 1058 */                  OoOlII ooOlII = (OoOlII) this.I00iiO;
/* 1062 */                  Function1 function1 = (Function1) obj;
/* 1064 */                  IliOlliiOO iliOlliiOO = iliOI01OIIII.I0000O;
/* 1066 */                  I0oIIIl00 i0oIIIl00 = iliOI01OIIII.I00000oIO;
/* 1068 */                  Iil1olo iil1olo = iliOI01OIIII.I0001Ioi1lo;
/* 1070 */                  IliO1o11o iliO1o11o = ooOlII.I00000oIO;
/* 1074 */                  if (iliO1o11o instanceof IliOii1lO) {
/* 1081 */                      List list2 = ((IliOii1lO) iliO1o11o).I00ilO0;
/* 1083 */                      IlilIIiIiO ililIIiIiO2 = ooOlII.I00000oOI;
/* 1085 */                      int i7 = ooOlII.I0000Il00O;
/* 1093 */                      ArrayList arrayList = new ArrayList(list2.size());
/* 1097 */                      List list3 = list2;
/* 1099 */                      int size = list3.size();
/* 1103 */                      int i8 = 0;
/* 1104 */                      while (i8 < size) {
/* 1106 */                          Object obj2 = list2.get(i8);
/* 1110 */                          IOoil1iiIilo iOoil1iiIilo2 = iOoil1iiIilo;
/* 1113 */                          Oi0l1olOi oi0l1olOi = (Oi0l1olOi) obj2;
/* 1121 */                          if (O0000Ioio00.I0000O(oi0l1olOi.I00000oOI, ililIIiIiO2) && oi0l1olOi.I0000Il00O == i7) {
/* 1127 */                              arrayList.add(obj2);
                                    }
/* 1130 */                          i8++;
/* 1132 */                          iOoil1iiIilo = iOoil1iiIilo2;
                                }
/* 1137 */                      IOoil1iiIilo iOoil1iiIilo3 = iOoil1iiIilo;
/* 1143 */                      if (arrayList.isEmpty()) {
/* 1153 */                          ArrayList arrayList2 = new ArrayList(list2.size());
/* 1156 */                          int size2 = list3.size();
/* 1161 */                          for (int i9 = 0; i9 < size2; i9++) {
/* 1163 */                              Object obj3 = list2.get(i9);
/* 1172 */                              if (((Oi0l1olOi) obj3).I0000Il00O == i7) {
/* 1174 */                                  arrayList2.add(obj3);
                                        }
                                    }
/* 1184 */                          if (!arrayList2.isEmpty()) {
/* 1187 */                              list2 = arrayList2;
                                    }
/* 1188 */                          List list4 = list2;
/* 1192 */                          int iCompareTo = ililIIiIiO2.compareTo(IlilIIiIiO.I00iiI);
/* 1196 */                          int i10 = ililIIiIiO2.I00iOIl;
/* 1198 */                          if (iCompareTo < 0) {
/* 1201 */                              List list5 = list4;
/* 1203 */                              int size3 = list5.size();
/* 1207 */                              IOoil1iiIilo iOoil1iiIilo4 = iOoil1iiIilo3;
/* 1209 */                              ?? r11 = iOoil1iiIilo4;
/* 1210 */                              int i11 = 0;
                                        ?? r10 = iOoil1iiIilo4;
                                        while (true) {
/* 1211 */                                  if (i11 < size3) {
/* 1219 */                                      IlilIIiIiO ililIIiIiO3 = ((Oi0l1olOi) list4.get(i11)).I00000oOI;
/* 1221 */                                      int i12 = ililIIiIiO3.I00iOIl;
/* 1227 */                                      if (O0000Ioio00.I0000oI00(i12, i10) < 0) {
/* 1229 */                                          if (r10 == 0 || O0000Ioio00.I0000oI00(i12, r10.I00iOIl) > 0) {
/* 1239 */                                              r10 = ililIIiIiO3;
                                                    }
                                                } else if (O0000Ioio00.I0000oI00(i12, i10) <= 0) {
/* 1261 */                                          r10 = ililIIiIiO3;
/* 1262 */                                          r11 = r10;
                                                } else if (r11 == null || O0000Ioio00.I0000oI00(i12, r11.I00iOIl) < 0) {
/* 1257 */                                          r11 = ililIIiIiO3;
                                                }
/* 1258 */                                      i11++;
                                                r10 = r10;
                                            }
                                        }
/* 1263 */                              if (r10 == 0) {
/* 1265 */                                  r10 = r11;
                                        }
/* 1272 */                              arrayList = new ArrayList(list4.size());
/* 1275 */                              int size4 = list5.size();
/* 1280 */                              for (int i13 = 0; i13 < size4; i13++) {
/* 1282 */                                  Object obj4 = list4.get(i13);
/* 1295 */                                  if (O0000Ioio00.I0000O(((Oi0l1olOi) obj4).I00000oOI, r10)) {
/* 1297 */                                      arrayList.add(obj4);
                                            }
                                        }
                                    } else {
/* 1303 */                              IlilIIiIiO ililIIiIiO4 = IlilIIiIiO.I00iiO;
/* 1309 */                              if (ililIIiIiO2.compareTo(ililIIiIiO4) > 0) {
/* 1312 */                                  List list6 = list4;
/* 1314 */                                  int size5 = list6.size();
/* 1318 */                                  IOoil1iiIilo iOoil1iiIilo5 = iOoil1iiIilo3;
/* 1320 */                                  ?? r112 = iOoil1iiIilo5;
/* 1321 */                                  int i14 = 0;
                                            ?? r102 = iOoil1iiIilo5;
                                            while (true) {
/* 1322 */                                      if (i14 < size5) {
/* 1330 */                                          IlilIIiIiO ililIIiIiO5 = ((Oi0l1olOi) list4.get(i14)).I00000oOI;
/* 1332 */                                          int i15 = ililIIiIiO5.I00iOIl;
/* 1338 */                                          if (O0000Ioio00.I0000oI00(i15, i10) < 0) {
/* 1340 */                                              if (r102 == 0 || O0000Ioio00.I0000oI00(i15, r102.I00iOIl) > 0) {
/* 1350 */                                                  r102 = ililIIiIiO5;
                                                        }
                                                    } else if (O0000Ioio00.I0000oI00(i15, i10) <= 0) {
/* 1372 */                                              r102 = ililIIiIiO5;
/* 1373 */                                              r112 = r102;
                                                    } else if (r112 == null || O0000Ioio00.I0000oI00(i15, r112.I00iOIl) < 0) {
/* 1368 */                                              r112 = ililIIiIiO5;
                                                    }
/* 1369 */                                          i14++;
                                                    r102 = r102;
                                                }
                                            }
/* 1374 */                                  if (r112 != null) {
/* 1377 */                                      r102 = r112;
                                            }
/* 1384 */                                  arrayList = new ArrayList(list4.size());
/* 1387 */                                  int size6 = list6.size();
/* 1392 */                                  for (int i16 = 0; i16 < size6; i16++) {
/* 1394 */                                      Object obj5 = list4.get(i16);
/* 1407 */                                      if (O0000Ioio00.I0000O(((Oi0l1olOi) obj5).I00000oOI, r102)) {
/* 1409 */                                          arrayList.add(obj5);
                                                }
                                            }
                                        } else {
/* 1416 */                                  List list7 = list4;
/* 1418 */                                  int size7 = list7.size();
/* 1422 */                                  IOoil1iiIilo iOoil1iiIilo6 = iOoil1iiIilo3;
/* 1424 */                                  ?? r12 = iOoil1iiIilo6;
/* 1425 */                                  int i17 = 0;
                                            ?? r113 = iOoil1iiIilo6;
                                            while (true) {
/* 1426 */                                      if (i17 < size7) {
/* 1434 */                                          IlilIIiIiO ililIIiIiO6 = ((Oi0l1olOi) list4.get(i17)).I00000oOI;
/* 1438 */                                          list = list7;
/* 1446 */                                          if (O0000Ioio00.I0000oI00(ililIIiIiO6.I00iOIl, ililIIiIiO4.I00iOIl) <= 0) {
/* 1449 */                                              int i18 = ililIIiIiO6.I00iOIl;
/* 1455 */                                              if (O0000Ioio00.I0000oI00(i18, i10) < 0) {
/* 1457 */                                                  if (r113 == 0 || O0000Ioio00.I0000oI00(i18, r113.I00iOIl) > 0) {
/* 1467 */                                                      r113 = ililIIiIiO6;
                                                            }
                                                        } else if (O0000Ioio00.I0000oI00(i18, i10) <= 0) {
/* 1491 */                                                  IlilIIiIiO ililIIiIiO7 = ililIIiIiO6;
/* 1492 */                                                  r12 = ililIIiIiO7;
                                                            ililIIiIiO = ililIIiIiO7;
                                                        } else if (r12 == null || O0000Ioio00.I0000oI00(i18, r12.I00iOIl) < 0) {
/* 1485 */                                                  r12 = ililIIiIiO6;
                                                        }
                                                    }
/* 1486 */                                          i17++;
/* 1488 */                                          list7 = list;
                                                    r113 = r113;
                                                } else {
/* 1494 */                                          list = list7;
                                                    ililIIiIiO = r113;
                                                }
                                            }
/* 1496 */                                  if (r12 != null) {
/* 1499 */                                      ililIIiIiO = r12;
                                            }
/* 1506 */                                  arrayList = new ArrayList(list4.size());
/* 1509 */                                  int size8 = list.size();
/* 1514 */                                  for (int i19 = 0; i19 < size8; i19++) {
/* 1516 */                                      Object obj6 = list4.get(i19);
/* 1529 */                                      if (O0000Ioio00.I0000O(((Oi0l1olOi) obj6).I00000oOI, ililIIiIiO)) {
/* 1531 */                                          arrayList.add(obj6);
                                                }
                                            }
/* 1541 */                                  if (arrayList.isEmpty()) {
/* 1543 */                                      IlilIIiIiO ililIIiIiO8 = IlilIIiIiO.I00iiO;
/* 1545 */                                      int size9 = list.size();
/* 1549 */                                      IOoil1iiIilo iOoil1iiIilo7 = iOoil1iiIilo3;
/* 1551 */                                      ?? r114 = iOoil1iiIilo7;
/* 1552 */                                      int i20 = 0;
                                                ?? r103 = iOoil1iiIilo7;
                                                while (true) {
/* 1553 */                                          if (i20 < size9) {
/* 1561 */                                              IlilIIiIiO ililIIiIiO9 = ((Oi0l1olOi) list4.get(i20)).I00000oOI;
/* 1563 */                                              if (ililIIiIiO8 == null || O0000Ioio00.I0000oI00(ililIIiIiO9.I00iOIl, ililIIiIiO8.I00iOIl) >= 0) {
/* 1576 */                                                  int i21 = ililIIiIiO9.I00iOIl;
/* 1582 */                                                  if (O0000Ioio00.I0000oI00(i21, i10) < 0) {
/* 1584 */                                                      if (r103 == 0 || O0000Ioio00.I0000oI00(i21, r103.I00iOIl) > 0) {
/* 1594 */                                                          r103 = ililIIiIiO9;
                                                                }
                                                            } else if (O0000Ioio00.I0000oI00(i21, i10) <= 0) {
/* 1616 */                                                      r103 = ililIIiIiO9;
/* 1617 */                                                      r114 = r103;
                                                            } else if (r114 == null || O0000Ioio00.I0000oI00(i21, r114.I00iOIl) < 0) {
/* 1612 */                                                      r114 = ililIIiIiO9;
                                                            }
                                                        }
/* 1613 */                                              i20++;
                                                        r103 = r103;
                                                    }
                                                }
/* 1618 */                                      if (r114 != null) {
/* 1621 */                                          r103 = r114;
                                                }
/* 1628 */                                      arrayList = new ArrayList(list4.size());
/* 1631 */                                      int size10 = list.size();
/* 1636 */                                      for (int i22 = 0; i22 < size10; i22++) {
/* 1638 */                                          Object obj7 = list4.get(i22);
/* 1651 */                                          if (O0000Ioio00.I0000O(((Oi0l1olOi) obj7).I00000oOI, r103)) {
/* 1653 */                                              arrayList.add(obj7);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
/* 1659 */                      IOO000ilo iOO000ilo = iliOlliiOO.I00000oIO;
/* 1665 */                      if (arrayList.size() > 0) {
/* 1672 */                          Oi0l1olOi oi0l1olOi2 = (Oi0l1olOi) arrayList.get(0);
/* 1674 */                          oi0l1olOi2.getClass();
                                    synchronized (((looil0O1Io1) iOO000ilo.I00iio)) {
                                        try {
/* 1684 */                                  I1Ool100l i1Ool100l = new I1Ool100l(oi0l1olOi2);
/* 1695 */                                  I1Ool1 i1Ool1 = (I1Ool1) ((O1Il00) iOO000ilo.I00iiI).I0000Il00O(i1Ool100l);
/* 1697 */                                  if (i1Ool1 == null) {
/* 1708 */                                      i1Ool1 = (I1Ool1) ((OI10I1IoI0Ol) iOO000ilo.I00iiO).I000II(i1Ool100l);
                                            }
/* 1713 */                                  if (i1Ool1 != null) {
/* 1715 */                                      objInvoke = i1Ool1.I00000oIO;
                                            } else {
                                                try {
/* 1720 */                                          objInvoke = i0oIIIl00.I00000oIO(oi0l1olOi2);
                                                } catch (Exception unused) {
/* 1725 */                                          objInvoke = iil1olo.invoke(ooOlII);
                                                }
/* 1729 */                                      iOO000ilo.getClass();
/* 1734 */                                      I1Ool100l i1Ool100l2 = new I1Ool100l(oi0l1olOi2);
                                                synchronized (((looil0O1Io1) iOO000ilo.I00iio)) {
                                                    try {
/* 1742 */                                              if (objInvoke == null) {
/* 1752 */                                                  ((OI10I1IoI0Ol) iOO000ilo.I00iiO).I000lI(i1Ool100l2, I1Ool1.I00000oIO(iOoil1iiIilo3));
                                                        } else {
/* 1766 */                                                  ((O1Il00) iOO000ilo.I00iiI).I0000O(i1Ool100l2, I1Ool1.I00000oIO(objInvoke));
                                                        }
                                                    } catch (Throwable th2) {
/* 1795 */                                              throw th2;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
/* 1797 */                                  throw th3;
                                        }
                                    }
/* 1770 */                          if (objInvoke == null) {
/* 1772 */                              objInvoke = iil1olo.invoke(ooOlII);
                                    }
/* 1790 */                          oIoi0IIoi = new OIoi0IIoi(iOoil1iiIilo3, iliioilIlo1.I00000oIO(ooOlII.I0000O, objInvoke, oi0l1olOi2, ooOlII.I00000oOI, ooOlII.I0000Il00O));
                                } else {
/* 1805 */                          oIoi0IIoi = new OIoi0IIoi(null, iil1olo.invoke(ooOlII));
                                }
/* 1810 */                      List list8 = (List) oIoi0IIoi.I00iOIl;
/* 1812 */                      Object obj8 = oIoi0IIoi.I00iiI;
/* 1814 */                      if (list8 == null) {
/* 1819 */                          ooOlioiilil = new OoOlioiilil(obj8, true);
                                } else {
/* 1826 */                          I1Oli1lO0IoO i1Oli1lO0IoO = new I1Oli1lO0IoO();
/* 1829 */                          i1Oli1lO0IoO.I00iOIl = list8;
/* 1831 */                          i1Oli1lO0IoO.I00iiI = ooOlII;
/* 1833 */                          i1Oli1lO0IoO.I00iiO = function1;
/* 1839 */                          i1Oli1lO0IoO.I00iio = lOO00IiI0li.I00000oIO(obj8);
/* 1841 */                          i1Oli1lO0IoO.I00ilI0I1 = true;
/* 1843 */                          VarHandle.storeStoreFence();
/* 1858 */                          iOi1II01i0.I0000O(iliOlliiOO.I00000oOI, null, Ii01I10.I00iio, new I0II0OiI(i1Oli1lO0IoO, (IOoil1iiIilo) null, 19), 1);
/* 1863 */                          OoOli1ilo ooOli1ilo = new OoOli1ilo();
/* 1866 */                          ooOli1ilo.I00iOIl = i1Oli1lO0IoO;
/* 1868 */                          VarHandle.storeStoreFence();
                                    ooOlioiilil = ooOli1ilo;
                                }
                            } else {
/* 1076 */                      ooOlioiilil = null;
                            }
/* 1871 */                  if (ooOlioiilil != null) {
/* 1948 */                      return ooOlioiilil;
                            }
/* 1877 */                  O1oO0lOoI1 o1oO0lOoI1 = (O1oO0lOoI1) iliOI01OIIII.I0000oI00.I00iiI;
/* 1879 */                  IliO1o11o iliO1o11o2 = ooOlII.I00000oIO;
/* 1881 */                  int i23 = ooOlII.I0000Il00O;
/* 1883 */                  IlilIIiIiO ililIIiIiO10 = ooOlII.I00000oOI;
/* 1885 */                  if (iliO1o11o2 == null || (iliO1o11o2 instanceof Ii1oOOlo1I0l)) {
/* 1923 */                      o1oO0lOoI1.getClass();
/* 1927 */                      typefaceI0000O = O1oO0lOoI1.I0000O(null, ililIIiIiO10, i23);
                            } else if (iliO1o11o2 instanceof Io010i0) {
/* 1898 */                      o1oO0lOoI1.getClass();
/* 1903 */                      typefaceI0000O = O1oO0lOoI1.I0000O(((Io010i0) iliO1o11o2).I00ilO0, ililIIiIiO10, i23);
                            } else {
/* 1910 */                      if (!(iliO1o11o2 instanceof O11lI0Oll0)) {
/* 1921 */                          ooOlioiilil2 = null;
/* 1937 */                          if (ooOlioiilil2 == null) {
/* 1939 */                              return ooOlioiilil2;
                                    }
/* 1943 */                          I000II.I001IO000("Could not load font");
/* 1946 */                          return null;
                                }
/* 1918 */                      typefaceI0000O = (Typeface) ((O11lI0Oll0) iliO1o11o2).I00ilO0.I00iiI;
                            }
/* 1934 */                  ooOlioiilil2 = new OoOlioiilil(typefaceI0000O, true);
/* 1937 */                  if (ooOlioiilil2 == null) {
                            }
                            break;
                        case 7:
/* 1046 */                  OI1o1o1iO1l.I0000Il00O((OI1o1o1iO1l) this.I00iiI, "route_model/" + ((OloIl1l1oOii) this.I00iiO).I00000oIO + "/" + ((O1oIOiI11o0) obj).I00000oIO);
/* 1049 */                  return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 968 */                   O0oiOi o0oiOi = (O0oiOi) this.I00iiI;
/* 972 */                   O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiO;
/* 980 */                   I01oi1lO0O1o i01oi1lO0O1o = new I01oi1lO0O1o(i5);
/* 983 */                   i01oi1lO0O1o.I00iiI = o1ol100o0O;
/* 985 */                   VarHandle.storeStoreFence();
/* 992 */                   o0oiOi.I000iOII().I00li1OI(i01oi1lO0O1o);
/* 997 */                   I1loO00 i1loO00 = new I1loO00(i4);
/* 1000 */                  i1loO00.I00000oOI = o0oiOi;
/* 1002 */                  i1loO00.I0000Il00O = i01oi1lO0O1o;
/* 1004 */                  VarHandle.storeStoreFence();
/* 1007 */                  return i1loO00;
                        case 9:
/* 882 */                   ImageLabeler imageLabeler = (ImageLabeler) this.I00iiI;
/* 886 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 890 */                   IoiO1IO1I1i ioiO1IO1I1i = (IoiO1IO1I1i) obj;
/* 892 */                   Image imageI00ll1 = ioiO1IO1I1i.I00ll1();
/* 896 */                   if (imageI00ll1 != null) {
/* 910 */                       OloIIoII1oo oloIIoII1ooProcess = imageLabeler.process(InputImage.fromMediaImage(imageI00ll1, ioiO1IO1I1i.I00i0oil().I0000Il00O()));
/* 918 */                       IlI0iIl011 ilI0iIl011 = new IlI0iIl011(12);
/* 921 */                       ilI0iIl011.I00iiI = oI10i0Il;
/* 923 */                       VarHandle.storeStoreFence();
/* 928 */                       I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(i);
/* 931 */                       i0IOIlIOIII.I00iiI = ilI0iIl011;
/* 933 */                       VarHandle.storeStoreFence();
/* 936 */                       o0IiOl o0iiol = (o0IiOl) oloIIoII1ooProcess;
/* 938 */                       o0iiol.getClass();
/* 943 */                       o0iiol.I0000oI00(OloIo0oOIO0.I00000oIO, i0IOIlIOIII);
/* 948 */                       IloIii0l0o iloIii0l0o = new IloIii0l0o(4);
/* 951 */                       iloIii0l0o.I00iiI = ioiO1IO1I1i;
/* 953 */                       VarHandle.storeStoreFence();
/* 956 */                       o0iiol.I000OiO(iloIii0l0o);
                            } else {
/* 960 */                       ioiO1IO1I1i.close();
                            }
/* 963 */                   return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 835 */                   O0oiOi o0oiOi2 = (O0oiOi) this.I00iiI;
/* 839 */                   Ioi1Io1o ioi1Io1o = (Ioi1Io1o) this.I00iiO;
/* 843 */                   Context context = (Context) obj;
/* 847 */                   OOIIooi oOIIooi = new OOIIooi(context);
/* 850 */                   Executor mainExecutor = context.getMainExecutor();
/* 854 */                   OOIl1Io0 oOIl1Io0 = OOIl1Io0.I00000oOI;
/* 856 */                   IO0oo1I0oIO iO0oo1I0oIOI00000oIO = lIIOO11.I00000oIO(context);
/* 862 */                   IIl1IO iIl1IO = new IIl1IO(i4);
/* 865 */                   iIl1IO.I00iiI = context;
/* 867 */                   iIl1IO.I00iiO = o0oiOi2;
/* 869 */                   iIl1IO.I00iio = ioi1Io1o;
/* 871 */                   iIl1IO.I00ilI0I1 = oOIIooi;
/* 873 */                   VarHandle.storeStoreFence();
/* 876 */                   iO0oo1I0oIOI00000oIO.addListener(iIl1IO, mainExecutor);
/* 879 */                   return oOIIooi;
                        case 11:
/* 746 */                   TextRecognizer textRecognizer = (TextRecognizer) this.I00iiI;
/* 750 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 754 */                   IoiO1IO1I1i ioiO1IO1I1i2 = (IoiO1IO1I1i) obj;
/* 756 */                   Image imageI00ll12 = ioiO1IO1I1i2.I00ll1();
/* 760 */                   if (imageI00ll12 != null) {
/* 774 */                       OloIIoII1oo oloIIoII1ooProcess2 = textRecognizer.process(InputImage.fromMediaImage(imageI00ll12, ioiO1IO1I1i2.I00i0oil().I0000Il00O()));
/* 782 */                       IlI0iIl011 ilI0iIl0112 = new IlI0iIl011(13);
/* 785 */                       ilI0iIl0112.I00iiI = oI10i0Il2;
/* 787 */                       VarHandle.storeStoreFence();
/* 794 */                       I0IOIlIOIII i0IOIlIOIII2 = new I0IOIlIOIII(15);
/* 797 */                       i0IOIlIOIII2.I00iiI = ilI0iIl0112;
/* 799 */                       VarHandle.storeStoreFence();
/* 802 */                       o0IiOl o0iiol2 = (o0IiOl) oloIIoII1ooProcess2;
/* 804 */                       o0iiol2.getClass();
/* 809 */                       o0iiol2.I0000oI00(OloIo0oOIO0.I00000oIO, i0IOIlIOIII2);
/* 815 */                       IloIii0l0o iloIii0l0o2 = new IloIii0l0o(5);
/* 818 */                       iloIii0l0o2.I00iiI = ioiO1IO1I1i2;
/* 820 */                       VarHandle.storeStoreFence();
/* 823 */                       o0iiol2.I000OiO(iloIii0l0o2);
                            } else {
/* 827 */                       ioiO1IO1I1i2.close();
                            }
/* 830 */                   return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 660 */                   BarcodeScanner barcodeScanner = (BarcodeScanner) this.I00iiI;
/* 664 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiO;
/* 668 */                   IoiO1IO1I1i ioiO1IO1I1i3 = (IoiO1IO1I1i) obj;
/* 670 */                   Image imageI00ll13 = ioiO1IO1I1i3.I00ll1();
/* 674 */                   if (imageI00ll13 != null) {
/* 688 */                       OloIIoII1oo oloIIoII1ooProcess3 = barcodeScanner.process(InputImage.fromMediaImage(imageI00ll13, ioiO1IO1I1i3.I00i0oil().I0000Il00O()));
/* 694 */                       int i24 = 11;
/* 696 */                       IlI0iIl011 ilI0iIl0113 = new IlI0iIl011(i24);
/* 699 */                       ilI0iIl0113.I00iiI = oI10i0Il3;
/* 701 */                       VarHandle.storeStoreFence();
/* 706 */                       I0IOIlIOIII i0IOIlIOIII3 = new I0IOIlIOIII(i24);
/* 709 */                       i0IOIlIOIII3.I00iiI = ilI0iIl0113;
/* 711 */                       VarHandle.storeStoreFence();
/* 714 */                       o0IiOl o0iiol3 = (o0IiOl) oloIIoII1ooProcess3;
/* 716 */                       o0iiol3.getClass();
/* 721 */                       o0iiol3.I0000oI00(OloIo0oOIO0.I00000oIO, i0IOIlIOIII3);
/* 726 */                       IloIii0l0o iloIii0l0o3 = new IloIii0l0o(1);
/* 729 */                       iloIii0l0o3.I00iiI = ioiO1IO1I1i3;
/* 731 */                       VarHandle.storeStoreFence();
/* 734 */                       o0iiol3.I000OiO(iloIii0l0o3);
                            } else {
/* 738 */                       ioiO1IO1I1i3.close();
                            }
/* 741 */                   return OoiIlOl1iI.I00000oIO;
                        case 13:
/* 574 */                   FaceDetector faceDetector = (FaceDetector) this.I00iiI;
/* 578 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiO;
/* 582 */                   IoiO1IO1I1i ioiO1IO1I1i4 = (IoiO1IO1I1i) obj;
/* 584 */                   Image imageI00ll14 = ioiO1IO1I1i4.I00ll1();
/* 588 */                   if (imageI00ll14 != null) {
/* 602 */                       OloIIoII1oo oloIIoII1ooProcess4 = faceDetector.process(InputImage.fromMediaImage(imageI00ll14, ioiO1IO1I1i4.I00i0oil().I0000Il00O()));
/* 608 */                       int i25 = 10;
/* 610 */                       IlI0iIl011 ilI0iIl0114 = new IlI0iIl011(i25);
/* 613 */                       ilI0iIl0114.I00iiI = oI10i0Il4;
/* 615 */                       VarHandle.storeStoreFence();
/* 620 */                       I0IOIlIOIII i0IOIlIOIII4 = new I0IOIlIOIII(i25);
/* 623 */                       i0IOIlIOIII4.I00iiI = ilI0iIl0114;
/* 625 */                       VarHandle.storeStoreFence();
/* 628 */                       o0IiOl o0iiol4 = (o0IiOl) oloIIoII1ooProcess4;
/* 630 */                       o0iiol4.getClass();
/* 635 */                       o0iiol4.I0000oI00(OloIo0oOIO0.I00000oIO, i0IOIlIOIII4);
/* 640 */                       IloIii0l0o iloIii0l0o4 = new IloIii0l0o(0);
/* 643 */                       iloIii0l0o4.I00iiI = ioiO1IO1I1i4;
/* 645 */                       VarHandle.storeStoreFence();
/* 648 */                       o0iiol4.I000OiO(iloIii0l0o4);
                            } else {
/* 652 */                       ioiO1IO1I1i4.close();
                            }
/* 655 */                   return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 566 */                   iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new Ii1O001loIoO((BoxChatDatabase) this.I00iiO, (Conversation) obj, iOoil1iiIilo, i), 3);
/* 569 */                   return OoiIlOl1iI.I00000oIO;
                        case 15:
/* 543 */                   ((Io11l1li) this.I00iiI).I00iiI.removeCallbacks((Io11iII11ll) this.I00iiO);
/* 546 */                   return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 507 */                   Io1Ooo1 io1Ooo1 = (Io1Ooo1) this.I00iiI;
/* 511 */                   String str3 = (String) this.I00iiO;
/* 515 */                   OI0ooi10l oI0ooi10l = (OI0ooi10l) obj;
/* 517 */                   io1Ooo1.getClass();
/* 522 */                   oI0ooi10l.I0000O(Io1Ooo1.I0000O, str3);
/* 525 */                   Io1Ooo1.I0000O(oI0ooi10l, str3);
/* 11 */                    return null;
                        case 17:
/* 466 */                   I0ol0lI i0ol0lI = (I0ol0lI) this.I00iiI;
/* 470 */                   Iol1I0loo0 iol1I0loo0 = (Iol1I0loo0) this.I00iiO;
/* 474 */                   O0iiliOio o0iiliOio = (O0iiliOio) obj;
/* 476 */                   o0iiliOio.I00000oOI();
/* 499 */                   IilloIOOO0i.I00OIo(o0iiliOio, i0ol0lI, new OlI00IIlOO(((IOOiio0i) iol1I0loo0.I00olI.I0000O()).I00000oIO), 0.0f, null, null, 60);
/* 502 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_PINKY:
/* 428 */                   IolIiIl iolIiIl = (IolIiIl) this.I00iiI;
/* 432 */                   IolIOll iolIOll = (IolIOll) this.I00iiO;
/* 440 */                   iolIiIl.I00000oIO.I00000oOI(iolIOll);
/* 447 */                   iolIiIl.I00000oOI.setValue(Boolean.TRUE);
/* 452 */                   I1loO00 i1loO002 = new I1loO00(i2);
/* 455 */                   i1loO002.I00000oOI = iolIiIl;
/* 457 */                   i1loO002.I0000Il00O = iolIOll;
/* 459 */                   VarHandle.storeStoreFence();
/* 462 */                   return i1loO002;
                        case PoseLandmark.LEFT_INDEX:
/* 405 */                   IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00iiI;
/* 409 */                   Throwable th4 = (Throwable) this.I00iiO;
/* 413 */                   O0Il0I1001 o0Il0I1001 = (O0Il0I1001) obj;
/* 419 */                   o0Il0I1001.I00000oIO = l1O0oi0o11i.I00000oIO(illOOo00lI2);
/* 421 */                   o0Il0I1001.I00000oOI = th4;
/* 423 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 327 */                   I0oiil10Ili i0oiil10Ili = (I0oiil10Ili) this.I00iiI;
/* 331 */                   O0l0O0I1 o0l0O0I1 = (O0l0O0I1) this.I00iiO;
/* 341 */                   IlilOiIoo ililOiIooI000OiO = i0oiil10Ili.I000OiO(((Integer) obj).intValue());
/* 345 */                   int i26 = ililOiIooI000OiO.I00000oIO;
/* 349 */                   List list9 = ililOiIooI000OiO.I00000oOI;
/* 355 */                   ArrayList arrayList3 = new ArrayList(list9.size());
/* 361 */                   int size11 = list9.size();
/* 365 */                   int i27 = 0;
/* 366 */                   while (i6 < size11) {
/* 376 */                       int i28 = (int) ((Io10ioOo1) list9.get(i6)).I00000oIO;
/* 394 */                       arrayList3.add(new OIoi0IIoi(Integer.valueOf(i26), IOo0oO11ll1O.I00000oIO(o0l0O0I1.I00000oIO(i27, i28))));
/* 397 */                       i26++;
/* 398 */                       i27 += i28;
/* 399 */                       i6++;
                            }
/* 402 */                   return arrayList3;
                        case PoseLandmark.LEFT_THUMB:
/* 290 */                   O0l0O0I1 o0l0O0I12 = (O0l0O0I1) this.I00iiI;
/* 295 */                   O0l0IoOl o0l0IoOl = (O0l0IoOl) this.I00iiO;
/* 301 */                   int iIntValue = ((Integer) obj).intValue();
/* 305 */                   I0oiil10Ili i0oiil10Ili2 = o0l0O0I12.I0000oI00;
/* 307 */                   int i29 = i0oiil10Ili2.I00iiI;
/* 309 */                   int iI001lloI = i0oiil10Ili2.I001lloI(iIntValue);
/* 320 */                   return o0l0IoOl.I010OIo1l(iIntValue, 0, iI001lloI, o0l0O0I12.I00000oIO(0, iI001lloI), o0l0IoOl.I00iio);
                        case PoseLandmark.RIGHT_THUMB:
/* 262 */                   O0o0oil1l1o o0o0oil1l1o = (O0o0oil1l1o) this.I00iiI;
/* 264 */                   Object obj9 = this.I00iiO;
/* 272 */                   o0o0oil1l1o.I00iiO.I000OOo1O(obj9);
/* 277 */                   I1loO00 i1loO003 = new I1loO00(i3);
/* 280 */                   i1loO003.I00000oOI = o0o0oil1l1o;
/* 282 */                   i1loO003.I0000Il00O = obj9;
/* 284 */                   VarHandle.storeStoreFence();
/* 287 */                   return i1loO003;
                        case PoseLandmark.LEFT_HIP:
/* 256 */                   return new O0o0oil1l1o((OiIiol10) this.I00iiI, (Map) obj, (OiIil1il) this.I00iiO);
                        case PoseLandmark.RIGHT_HIP:
/* 188 */                   OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 194 */                   ArrayList arrayListI0001Ioi1lo = iOOoI0OII.I0001Ioi1lo((List) this.I00iiI, (IllOOo00lI) ((O100loO1) this.I00iiO).I00000oOI);
/* 198 */                   if (arrayListI0001Ioi1lo != null) {
/* 200 */                       int size12 = arrayListI0001Ioi1lo.size();
/* 204 */                       while (i6 < size12) {
/* 210 */                           OIoi0IIoi oIoi0IIoi2 = (OIoi0IIoi) arrayListI0001Ioi1lo.get(i6);
/* 214 */                           OO1I0001000i oO1I0001000i = (OO1I0001000i) oIoi0IIoi2.I00iOIl;
/* 218 */                           IllOOo00lI illOOo00lI3 = (IllOOo00lI) oIoi0IIoi2.I00iiI;
/* 233 */                           OO11o0IO.I000OiO(oO11o0IO, oO1I0001000i, illOOo00lI3 != null ? ((IooO0O) illOOo00lI3.invoke()).I00000oIO : 0L);
/* 236 */                           i6++;
                                }
                            }
/* 239 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_KNEE:
/* 151 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iiI;
/* 155 */                   Function3 function3 = (Function3) this.I00iiO;
/* 165 */                   O1111lilIi0.I0000Il00O.put(o1oIOiI11o0.I00000oIO, (O11101IIlil1) obj);
/* 172 */                   function3.invoke("", Boolean.TRUE, null);
/* 175 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_KNEE:
/* 120 */                   O11iO00I1o o11iO00I1o = (O11iO00I1o) this.I00iiO;
/* 134 */                   Log.e("AGLlmChatViewModel", "Error occurred while running inference");
/* 137 */                   o11iO00I1o.I000iOII(false);
/* 140 */                   o11iO00I1o.I000lI(false);
/* 143 */                   ((Function1) this.I00iiI).invoke((String) obj);
/* 146 */                   return OoiIlOl1iI.I00000oIO;
                        case 27:
/* 66 */                    O1I10OIO o1i10oio = (O1I10OIO) this.I00iiI;
/* 70 */                    OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iiO;
/* 76 */                    ((Boolean) obj).getClass();
/* 112 */                   oI10i0Il5.setValue(((Set) oI10i0Il5.getValue()).contains(o1i10oio) ? Oio0lI.I00000oOI((Set) oI10i0Il5.getValue(), o1i10oio) : Oio0lI.I0001Ioi1lo((Set) oI10i0Il5.getValue(), o1i10oio));
/* 115 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_ANKLE:
/* 58 */                    ((O1l1iIi0i) this.I00iiI).I00000oOI.I0000Il00O((Olil0III) obj, (List) this.I00iiO);
/* 61 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 18 */                    ExecutorService executorService = (ExecutorService) this.I00iiI;
/* 22 */                    OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iiO;
/* 31 */                    I1loO00 i1loO004 = new I1loO00(6);
/* 34 */                    i1loO004.I00000oOI = executorService;
/* 36 */                    i1loO004.I0000Il00O = oI10i0Il6;
/* 38 */                    VarHandle.storeStoreFence();
/* 41 */                    return i1loO004;
                    }
                }
            }
