            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.database.Cursor;
            import android.graphics.Paint;
            import android.net.Uri;
            import android.os.Bundle;
            import android.util.Log;
            import com.box.gallery.R;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Set;
            import java.util.UUID;
            import kotlin.jvm.functions.Function1;
            
            public final class I0IO1io0I implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public I0IO1io0I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final Object invoke(Object obj) {
                    String str;
                    Intent intent;
                    Uri data;
                    Uri uri;
                    int columnIndex;
                    List listSubList;
/* 3 */             int i = this.I00iOIl;
/* 16 */            lastPathSegment = null;
/* 16 */            lastPathSegment = null;
/* 16 */            lastPathSegment = null;
/* 16 */            String lastPathSegment = null;
/* 17 */            int i2 = 2;
/* 18 */            Object[] objArr = 0;
/* 20 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 1909 */                  I0IO1OIi i0IO1OIi = (I0IO1OIi) this.I00iiO;
/* 1913 */                  IOiO1IOloOiO iOiO1IOloOiO = (IOiO1IOloOiO) this.I00iio;
/* 1917 */                  String str2 = (String) this.I00ilI0I1;
/* 1921 */                  iOI110IOi11i ioi110ioi11i = (iOI110IOi11i) this.I00ilO0;
/* 1925 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 1933 */                  I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(0);
/* 1936 */                  i0IOIlIOIII.I00iiI = oI10i0Il;
/* 1938 */                  VarHandle.storeStoreFence();
/* 1945 */                  i0IO1OIi.I00000oIO = iOiO1IOloOiO.I0000Il00O(str2, ioi110ioi11i, i0IOIlIOIII);
/* 1949 */                  I0IOIo0 i0IOIo0 = new I0IOIo0(0);
/* 1952 */                  i0IOIo0.I00000oOI = i0IO1OIi;
/* 1954 */                  VarHandle.storeStoreFence();
/* 1957 */                  return i0IOIo0;
                        case 1:
/* 1814 */                  Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00iiO;
/* 1818 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiI;
/* 1822 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iio;
/* 1826 */                  Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00ilI0I1;
/* 1830 */                  OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00ilO0;
/* 1834 */                  String str3 = (String) obj;
/* 1836 */                  ol1o1llOII.remove(str3);
/* 1849 */                  if (O0000Ioio00.I0000O((String) oI10i0Il2.getValue(), str3)) {
/* 1859 */                      oI10i0Il2.setValue((String) IOOi0Ool1i.I001lloI(ol1o1llOII.I00iiO));
                            }
/* 1866 */                  Ol0ioI1iI ol0ioI1iI = (Ol0ioI1iI) oI10i0Il3.getValue();
/* 1868 */                  if (ol0ioI1iI != null) {
/* 1870 */                      ol0o1OiOIIIl.getClass();
/* 1881 */                      if (ol0ioI1iI.I001IIilI0O().length() != 0) {
/* 1884 */                          IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(ol0o1OiOIIIl);
/* 1888 */                          IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 1898 */                          iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new Ol0o0I01iIO(ol0o1OiOIIIl, ol0ioI1iI, str3, (IOoil1iiIilo) null), 2);
                                }
                            }
/* 1903 */                  oI10i0Il4.setValue(Boolean.TRUE);
/* 1906 */                  return ooiIlOl1iI;
                        case 2:
/* 1750 */                  Oo0OI01Il oo0OI01Il = (Oo0OI01Il) this.I00iiO;
/* 1754 */                  I0oOiiOi0l i0oOiiOi0l = (I0oOiiOi0l) this.I00iio;
/* 1758 */                  IoiiO1O1 ioiiO1O1 = (IoiiO1O1) this.I00ilI0I1;
/* 1762 */                  O11IOOoiI10i o11IOOoiI10i = (O11IOOoiI10i) this.I00ilO0;
/* 1766 */                  Function1 function1 = (Function1) this.I00iiI;
/* 1770 */                  O0oIo1 o0oIo1 = (O0oIo1) obj;
/* 1772 */                  O0oIIIiiO1 o0oIIIiiO1 = i0oOiiOi0l.I00000oIO;
/* 1774 */                  o0oIo1.I000O01llI0 = oo0OI01Il;
/* 1776 */                  o0oIo1.I000OOo1O = ioiiO1O1;
/* 1778 */                  o0oIo1.I0000Il00O = o11IOOoiI10i;
/* 1780 */                  o0oIo1.I0000O = function1;
/* 1788 */                  o0oIo1.I0000oI00 = o0oIIIiiO1 != null ? o0oIIIiiO1.I00o0l1o1o0 : null;
/* 1796 */                  o0oIo1.I0001Ioi1lo = o0oIIIiiO1 != null ? o0oIIIiiO1.I00o101lO : null;
/* 1809 */                  o0oIo1.I000II = o0oIIIiiO1 != null ? (Oooii1o1) iiliIooIliOo.I00000oIO(o0oIIIiiO1, IOlO0o100i1i.I00111O) : null;
/* 1811 */                  return ooiIlOl1iI;
                        case 3:
/* 1704 */                  OO1lio oO1lio = (OO1lio) this.I00iiO;
/* 1708 */                  IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iio;
/* 1712 */                  OO1loiii oO1loiii = (OO1loiii) this.I00ilO0;
/* 1716 */                  String str4 = (String) this.I00ilI0I1;
/* 1720 */                  O0iOOoiioO o0iOOoiioO = (O0iOOoiioO) this.I00iiI;
/* 1730 */                  oO1lio.I00o0l1o1o0.addView(oO1lio, oO1lio.I00o101lO);
/* 1733 */                  oO1lio.I00100l0(illOOo00lI, oO1loiii, str4, o0iOOoiioO);
/* 1739 */                  I0IOIo0 i0IOIo02 = new I0IOIo0(2);
/* 1742 */                  i0IOIo02.I00000oOI = oO1lio;
/* 1744 */                  VarHandle.storeStoreFence();
/* 1747 */                  return i0IOIo02;
                        case 4:
/* 1661 */                  Object obj2 = this.I00iiO;
/* 1665 */                  Set set = (Set) this.I00iio;
/* 1669 */                  Set set2 = (Set) this.I00ilI0I1;
/* 1673 */                  OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iiI;
/* 1677 */                  OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00ilO0;
/* 1685 */                  Ii1iOiI01 ii1iOiI01 = new Ii1iOiI01();
/* 1688 */                  ii1iOiI01.I00000oIO = obj2;
/* 1690 */                  ii1iOiI01.I00000oOI = set;
/* 1692 */                  ii1iOiI01.I0000Il00O = set2;
/* 1694 */                  ii1iOiI01.I0000O = oI10i0Il5;
/* 1696 */                  ii1iOiI01.I0000oI00 = oI10i0Il6;
/* 1698 */                  VarHandle.storeStoreFence();
/* 1701 */                  return ii1iOiI01;
                        case 5:
/* 1181 */                  Ii1lo00I1 ii1lo00I1 = (Ii1lo00I1) this.I00iiO;
/* 1183 */                  Context context = ii1lo00I1.I00000oIO;
/* 1185 */                  SharedPreferences sharedPreferences = ii1lo00I1.I0000O;
/* 1189 */                  O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iio;
/* 1193 */                  IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00ilI0I1;
/* 1197 */                  UUID uuid = (UUID) this.I00ilO0;
/* 1201 */                  OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) this.I00iiI;
/* 1205 */                  i01Ii0ooO i01ii0ooo = (i01Ii0ooO) obj;
/* 1207 */                  if (i01ii0ooo != null) {
/* 1209 */                      i01IOiO1lO i01ioio1lo = i01ii0ooo.I00000oOI;
/* 1211 */                      Ii11I1OOII1 ii11I1OOII1 = i01ii0ooo.I0000oI00;
/* 1213 */                      int iOrdinal = i01ioio1lo.ordinal();
/* 1223 */                      if (iOrdinal == 0) {
/* 1611 */                          SharedPreferences.Editor editorEdit = sharedPreferences.edit();
/* 1621 */                          editorEdit.putLong(o1oIOiI11o0.I00000oIO, System.currentTimeMillis());
/* 1624 */                          editorEdit.apply();
/* 1627 */                          FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 1631 */                          if (firebaseAnalyticsI00000oIO != null) {
/* 1633 */                              Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 1657 */                              firebaseAnalyticsI00000oIO.I00000oIO("model_download", iOiIOo1010i.I00000oIO(new OIoi0IIoi("event_type", "start"), new OIoi0IIoi("model_id", o1oIOiI11o0.I00000oIO)));
                                    }
                                } else if (iOrdinal == 1) {
/* 1537 */                          long jI00000oOI = ii11I1OOII1.I00000oOI("KEY_MODEL_DOWNLOAD_RECEIVED_BYTES", 0L);
/* 1543 */                          long jI00000oOI2 = ii11I1OOII1.I00000oOI("KEY_MODEL_DOWNLOAD_RATE", 0L);
/* 1549 */                          long jI00000oOI3 = ii11I1OOII1.I00000oOI("KEY_MODEL_DOWNLOAD_REMAINING_SECONDS", 0L);
/* 1559 */                          if (ii11I1OOII1.I00000oIO("KEY_MODEL_START_UNZIPPING")) {
/* 1607 */                              illiIl1l11O.invoke(o1oIOiI11o0, new O1oIo0iI00(ModelDownloadStatusType.UNZIPPING, 0L, 0L, null, 0L, 0L, 62));
                                    } else if (jI00000oOI != 0) {
/* 1582 */                              illiIl1l11O.invoke(o1oIOiI11o0, new O1oIo0iI00(ModelDownloadStatusType.IN_PROGRESS, o1oIOiI11o0.I00IoiI, jI00000oOI, null, jI00000oOI2, jI00000oOI3, 8));
                                    }
                                } else if (iOrdinal == 2) {
/* 1403 */                          String.format("worker %s success", Arrays.copyOf(new Object[]{uuid.toString()}, 1));
/* 1427 */                          illiIl1l11O.invoke(o1oIOiI11o0, new O1oIo0iI00(ModelDownloadStatusType.SUCCEEDED, 0L, 0L, null, 0L, 0L, 62));
/* 1433 */                          String string = context.getString(R.string.notification_title_success);
/* 1440 */                          String string2 = context.getString(R.string.notification_content_success);
/* 1444 */                          String str5 = o1oIOiI11o0.I00000oIO;
/* 1455 */                          String str6 = String.format(string2, Arrays.copyOf(new Object[]{str5}, 1));
/* 1459 */                          if (oloIl1l1oOii == null || (str = oloIl1l1oOii.I00000oIO) == null) {
/* 1465 */                              str = "___";
                                    }
/* 1467 */                          ii1lo00I1.I00000oOI(string, str6, str, str5);
/* 1480 */                          long jCurrentTimeMillis = System.currentTimeMillis() - sharedPreferences.getLong(str5, 0L);
/* 1481 */                          FirebaseAnalytics firebaseAnalyticsI00000oIO2 = iOIii1ooOi0I.I00000oIO();
/* 1485 */                          if (firebaseAnalyticsI00000oIO2 != null) {
/* 1487 */                              Ilo0li0l1[] ilo0li0l1Arr2 = Ilo0li0l1.I00iOIl;
/* 1518 */                              firebaseAnalyticsI00000oIO2.I00000oIO("model_download", iOiIOo1010i.I00000oIO(new OIoi0IIoi("event_type", "success"), new OIoi0IIoi("model_id", str5), new OIoi0IIoi("duration_ms", Long.valueOf(jCurrentTimeMillis))));
                                    }
/* 1521 */                          SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
/* 1525 */                          editorEdit2.remove(str5);
/* 1528 */                          editorEdit2.apply();
                                } else if (iOrdinal == 3 || iOrdinal == 5) {
/* 1240 */                          ModelDownloadStatusType modelDownloadStatusType = ModelDownloadStatusType.FAILED;
/* 1246 */                          String strI0000Il00O = i01ii0ooo.I0000O.I0000Il00O("KEY_MODEL_DOWNLOAD_ERROR_MESSAGE");
/* 1250 */                          if (strI0000Il00O == null) {
/* 12 */                                strI0000Il00O = "";
                                    }
/* 1268 */                          String.format("worker %s FAILED or CANCELLED: %s", Arrays.copyOf(new Object[]{uuid.toString(), strI0000Il00O}, 2));
/* 1273 */                          if (i01ioio1lo == i01IOiO1lO.I00ilO0) {
/* 1275 */                              modelDownloadStatusType = ModelDownloadStatusType.NOT_DOWNLOADED;
                                    } else {
/* 1297 */                              ii1lo00I1.I00000oOI(context.getString(R.string.notification_title_fail), IlIi0I0.I000lI("\"", o1oIOiI11o0.I00000oIO, "\" download failed. Tap to retry."), "", "");
                                    }
/* 1320 */                          illiIl1l11O.invoke(o1oIOiI11o0, new O1oIo0iI00(modelDownloadStatusType, 0L, 0L, strI0000Il00O, 0L, 0L, 54));
/* 1323 */                          String str7 = o1oIOiI11o0.I00000oIO;
/* 1335 */                          long jCurrentTimeMillis2 = System.currentTimeMillis() - sharedPreferences.getLong(str7, 0L);
/* 1336 */                          FirebaseAnalytics firebaseAnalyticsI00000oIO3 = iOIii1ooOi0I.I00000oIO();
/* 1340 */                          if (firebaseAnalyticsI00000oIO3 != null) {
/* 1342 */                              Ilo0li0l1[] ilo0li0l1Arr3 = Ilo0li0l1.I00iOIl;
/* 1373 */                              firebaseAnalyticsI00000oIO3.I00000oIO("model_download", iOiIOo1010i.I00000oIO(new OIoi0IIoi("event_type", "failure"), new OIoi0IIoi("model_id", str7), new OIoi0IIoi("duration_ms", Long.valueOf(jCurrentTimeMillis2))));
                                    }
/* 1376 */                          SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
/* 1380 */                          editorEdit3.remove(str7);
/* 1383 */                          editorEdit3.apply();
                                }
                            }
/* 1660 */                  return ooiIlOl1iI;
                        case 6:
/* 1104 */                  List list = (List) this.I00iiO;
/* 1108 */                  Function1 function12 = (Function1) this.I00iio;
/* 1112 */                  Function1 function13 = (Function1) this.I00ilI0I1;
/* 1116 */                  OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00iiI;
/* 1120 */                  OI10i0Il oI10i0Il8 = (OI10i0Il) this.I00ilO0;
/* 1126 */                  int size = list.size();
/* 1134 */                  I0O11IOOo0OI i0O11IOOo0OI = new I0O11IOOo0OI(12);
/* 1137 */                  i0O11IOOo0OI.I00iiI = list;
/* 1139 */                  VarHandle.storeStoreFence();
/* 1144 */                  I0O11IOOo0OI i0O11IOOo0OI2 = new I0O11IOOo0OI(13);
/* 1147 */                  i0O11IOOo0OI2.I00iiI = list;
/* 1149 */                  VarHandle.storeStoreFence();
/* 1154 */                  Iloio01l0Il iloio01l0Il = new Iloio01l0Il(objArr == true ? 1 : 0);
/* 1157 */                  iloio01l0Il.I00iiI = list;
/* 1159 */                  iloio01l0Il.I00iiO = function12;
/* 1161 */                  iloio01l0Il.I00iio = function13;
/* 1163 */                  iloio01l0Il.I00ilI0I1 = oI10i0Il7;
/* 1165 */                  iloio01l0Il.I00ilO0 = oI10i0Il8;
/* 1167 */                  VarHandle.storeStoreFence();
/* 1175 */                  ((O0lolo) obj).I0000oI00(size, i0O11IOOo0OI, i0O11IOOo0OI2, new IOii1l(802480018, iloio01l0Il, true));
/* 1178 */                  return ooiIlOl1iI;
                        case 7:
/* 923 */                   Context context2 = (Context) this.I00iiO;
/* 927 */                   OI10i0Il oI10i0Il9 = (OI10i0Il) this.I00iiI;
/* 931 */                   OI10i0Il oI10i0Il10 = (OI10i0Il) this.I00iio;
/* 935 */                   OI10i0Il oI10i0Il11 = (OI10i0Il) this.I00ilI0I1;
/* 939 */                   OI10i0Il oI10i0Il12 = (OI10i0Il) this.I00ilO0;
/* 943 */                   I0IIOOO1O i0iiooo1o = (I0IIOOO1O) obj;
/* 947 */                   if (i0iiooo1o.I00iOIl == -1 && (intent = i0iiooo1o.I00iiI) != null && (data = intent.getData()) != null) {
/* 969 */                       if (O0000Ioio00.I0000O(data.getScheme(), "content")) {
/* 983 */                           Cursor cursorQuery = context2.getContentResolver().query(data, null, null, null, null);
/* 987 */                           uri = data;
/* 989 */                           if (cursorQuery != null) {
                                        try {
/* 995 */                                   if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_display_name")) != -1) {
/* 1005 */                                      lastPathSegment = cursorQuery.getString(columnIndex);
                                            }
/* 1009 */                                  cursorQuery.close();
                                        } finally {
                                        }
                                    }
                                } else {
/* 1021 */                          uri = data;
/* 1033 */                          if (O0000Ioio00.I0000O(uri.getScheme(), "file")) {
/* 1035 */                              lastPathSegment = uri.getLastPathSegment();
                                    }
                                }
/* 1039 */                      if (lastPathSegment != null && !OlOolloIIOl0.I000II(lastPathSegment, ".task", false) && !OlOolloIIOl0.I000II(lastPathSegment, ".litertlm", false) && !OlOolloIIOl0.I000II(lastPathSegment, ".gguf", true)) {
/* 1067 */                          oI10i0Il10.setValue(Boolean.TRUE);
                                } else if (lastPathSegment == null || !OlOoOIi0o.I000oI1ioi(lastPathSegment.toLowerCase(Locale.ROOT), "-web", false)) {
/* 1093 */                          oI10i0Il9.setValue(uri);
/* 1098 */                          oI10i0Il12.setValue(Boolean.TRUE);
                                } else {
/* 1089 */                          oI10i0Il11.setValue(Boolean.TRUE);
                                }
                            }
/* 1101 */                  return ooiIlOl1iI;
                        case 8:
/* 787 */                   O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiO;
/* 791 */                   IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) this.I00iio;
/* 795 */                   Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00ilI0I1;
/* 799 */                   OI10i0Il oI10i0Il13 = (OI10i0Il) this.I00iiI;
/* 803 */                   OI10i0Il oI10i0Il14 = (OI10i0Il) this.I00ilO0;
/* 807 */                   O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) obj;
/* 819 */                   List list2 = ((O1oiOloOo) o1ol100o0O.I000OOo1O.I00iOIl.getValue()).I00000oIO;
/* 825 */                   ArrayList arrayList = new ArrayList();
/* 836 */                   for (Object obj3 : list2) {
/* 845 */                       ArrayList arrayList2 = ((OloIl1l1oOii) obj3).I000OiO;
/* 847 */                       if (arrayList2 == null || !arrayList2.isEmpty()) {
/* 856 */                           Iterator it = arrayList2.iterator();
                                    while (true) {
/* 864 */                               if (!it.hasNext()) {
                                            break;
                                        }
/* 880 */                               if (O0000Ioio00.I0000O(((O1oIOiI11o0) it.next()).I00000oIO, o1oIOiI11o02.I00000oIO)) {
/* 882 */                                   arrayList.add(obj3);
                                        }
                                    }
                                }
                            }
/* 890 */                   if (arrayList.size() == 1) {
/* 896 */                       illiIl1l11O2.invoke(arrayList.get(0), o1oIOiI11o02);
                            } else if (arrayList.size() > 1) {
/* 906 */                       ol1o0O0O0.clear();
/* 909 */                       ol1o0O0O0.addAll(arrayList);
/* 912 */                       oI10i0Il13.setValue(o1oIOiI11o02);
/* 917 */                       oI10i0Il14.setValue(Boolean.TRUE);
                            }
/* 920 */                   return ooiIlOl1iI;
                        case 9:
/* 701 */                   List list3 = (List) this.I00iiO;
/* 705 */                   O1i1O1I o1i1O1I = (O1i1O1I) this.I00iio;
/* 709 */                   OI10i0Il oI10i0Il15 = (OI10i0Il) this.I00iiI;
/* 713 */                   OI10i0Il oI10i0Il16 = (OI10i0Il) this.I00ilI0I1;
/* 717 */                   OI10i0Il oI10i0Il17 = (OI10i0Il) this.I00ilO0;
/* 725 */                   O0o01OIl o0o01OIl = new O0o01OIl(13);
/* 728 */                   int size2 = list3.size();
/* 736 */                   I01i01OoI i01i01OoI = new I01i01OoI(20);
/* 739 */                   i01i01OoI.I00iiI = o0o01OIl;
/* 741 */                   i01i01OoI.I00iiO = list3;
/* 743 */                   VarHandle.storeStoreFence();
/* 750 */                   I0O11IOOo0OI i0O11IOOo0OI3 = new I0O11IOOo0OI(19);
/* 753 */                   i0O11IOOo0OI3.I00iiI = list3;
/* 755 */                   VarHandle.storeStoreFence();
/* 760 */                   Iloio01l0Il iloio01l0Il2 = new Iloio01l0Il(i2);
/* 763 */                   iloio01l0Il2.I00iiI = list3;
/* 765 */                   iloio01l0Il2.I00iiO = o1i1O1I;
/* 767 */                   iloio01l0Il2.I00ilI0I1 = oI10i0Il15;
/* 769 */                   iloio01l0Il2.I00ilO0 = oI10i0Il16;
/* 771 */                   iloio01l0Il2.I00iio = oI10i0Il17;
/* 773 */                   VarHandle.storeStoreFence();
/* 781 */                   ((O0lolo) obj).I0000oI00(size2, i01i01OoI, i0O11IOOo0OI3, new IOii1l(802480018, iloio01l0Il2, true));
/* 784 */                   return ooiIlOl1iI;
                        case 10:
/* 695 */                   iOi1II01i0.I0000O((Ii0110) this.I00iiO, null, null, new I000oI1ioi((Function1) this.I00iio, (byte[]) obj, (Ol010000lo00) this.I00ilI0I1, (Function1) this.I00ilO0, (OI10i0Il) this.I00iiI, null, 13), 3);
/* 698 */                   return ooiIlOl1iI;
                        case 11:
/* 520 */                   O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) this.I00iiO;
/* 525 */                   O1ol100o0O o1ol100o0O2 = (O1ol100o0O) this.I00iio;
/* 530 */                   Context context3 = (Context) this.I00ilI0I1;
/* 535 */                   OloIl1l1oOii oloIl1l1oOii2 = (OloIl1l1oOii) this.I00ilO0;
/* 539 */                   IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00iiI;
/* 543 */                   String str8 = (String) obj;
/* 545 */                   o1oIOiI11o03.I00Io1lO = false;
/* 547 */                   long j = o1oIOiI11o03.I000OOo1O;
/* 551 */                   if (o1oIOiI11o03.I00IlilI0i0i != null) {
/* 555 */                       o1ol100o0O2.I00IoO0(o1oIOiI11o03, O1oOl0.I00iiO, "");
/* 560 */                       if (o1oIOiI11o03.I00Io1o110i) {
/* 566 */                           O1ol100o0O.I000O01llI0(o1ol100o0O2, context3, oloIl1l1oOii2, o1oIOiI11o03, null, null, 24);
                                }
/* 569 */                       illOOo00lI2.invoke();
                            } else if (str8.length() > 0) {
/* 587 */                       File file = new File(o1oIOiI11o03.I00000oOI(context3, o1oIOiI11o03.I000OiO));
/* 592 */                       if (o1oIOiI11o03.I00IOO || o1oIOiI11o03.I0010I0i.length() != 0 || (file.exists() && (j <= 0 || file.length() >= j / 2))) {
/* 655 */                           o1ol100o0O2.I00IoO0(o1oIOiI11o03, O1oOl0.I00iio, str8);
                                } else {
/* 646 */                           Log.w("AGModelManagerViewModel", "Model '" + o1oIOiI11o03.I00000oIO + "' file missing or truncated — resetting to NOT_DOWNLOADED");
/* 649 */                           o1ol100o0O2.I000oI1ioi(o1oIOiI11o03);
                                }
                            }
/* 658 */                   return ooiIlOl1iI;
                        case 12:
/* 411 */                   OI0Iio01O oI0Iio01O = (OI0Iio01O) this.I00iiO;
/* 415 */                   OOo0ooi oOo0ooi = (OOo0ooi) this.I00iio;
/* 419 */                   OOo0lO oOo0lO = (OOo0lO) this.I00ilI0I1;
/* 423 */                   Oii00o1ll oii00o1ll = (Oii00o1ll) this.I00ilO0;
/* 427 */                   OOo0l0ii10l oOo0l0ii10l = (OOo0l0ii10l) this.I00iiI;
/* 433 */                   float fFloatValue = ((Float) obj).floatValue();
/* 439 */                   OI0IOO0iO0Oo oI0IOO0iO0OoI000II = OI0Iio01O.I000II(oI0Iio01O.I000II);
/* 443 */                   if (oI0IOO0iO0OoI000II != null) {
/* 445 */                       IoloOio0I ioloOio0I = oI0Iio01O.I0000oI00;
/* 447 */                       long j2 = oI0IOO0iO0OoI000II.I00000oOI;
/* 449 */                       long j3 = oI0IOO0iO0OoI000II.I00000oIO;
/* 462 */                       ((OooIlilo) ioloOio0I.I00iiI).I00000oIO(Float.intBitsToFloat((int) (j3 >> 32)), j2);
/* 476 */                       ((OooIlilo) ioloOio0I.I00iiO).I00000oIO(Float.intBitsToFloat((int) (j3 & 4294967295L)), j2);
/* 483 */                       OI0IOO0iO0Oo oI0IOO0iO0OoI00000oIO = ((OI0IOO0iO0Oo) oOo0ooi.I00iOIl).I00000oIO(oI0IOO0iO0OoI000II);
/* 487 */                       oOo0ooi.I00iOIl = oI0IOO0iO0OoI00000oIO;
/* 499 */                       oOo0lO.I00iOIl = oii00o1ll.I000OiO(oii00o1ll.I0001Ioi1lo(oI0IOO0iO0OoI00000oIO.I00000oIO));
/* 507 */                       oOo0l0ii10l.I00iOIl = !l1i1IillI.I00000oIO(r1 - fFloatValue);
                            }
/* 512 */                   return Boolean.valueOf(oI0IOO0iO0OoI000II != null);
                        case 13:
/* 354 */                   OOo0l0ii10l oOo0l0ii10l2 = (OOo0l0ii10l) this.I00iiO;
/* 358 */                   ArrayList arrayList3 = (ArrayList) this.I00iio;
/* 362 */                   OOo0ll111 oOo0ll111 = (OOo0ll111) this.I00ilI0I1;
/* 366 */                   OI1i0llli oI1i0llli = (OI1i0llli) this.I00ilO0;
/* 370 */                   Bundle bundle = (Bundle) this.I00iiI;
/* 374 */                   OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) obj;
/* 376 */                   oOo0l0ii10l2.I00iOIl = true;
/* 378 */                   int iIndexOf = arrayList3.indexOf(oI1OloOIO1O);
/* 382 */                   if (iIndexOf != -1) {
/* 386 */                       int i3 = iIndexOf + 1;
/* 387 */                       listSubList = arrayList3.subList(oOo0ll111.I00iOIl, i3);
/* 391 */                       oOo0ll111.I00iOIl = i3;
                            } else {
/* 394 */                       listSubList = Il01100l.I00iOIl;
                            }
/* 398 */                   oI1i0llli.I00000oIO(oI1OloOIO1O.I00iiI, bundle, oI1OloOIO1O, listSubList);
/* 401 */                   return ooiIlOl1iI;
                        default:
/* 27 */                    Ii0i1Iolo ii0i1Iolo = (Ii0i1Iolo) this.I00iiO;
/* 31 */                    OIOlOI oIOlOI = (OIOlOI) this.I00iio;
/* 35 */                    Oo0OI01Il oo0OI01Il2 = (Oo0OI01Il) this.I00ilI0I1;
/* 39 */                    O0oIlOolIO o0oIlOolIO = (O0oIlOolIO) this.I00ilO0;
/* 43 */                    III11l1I iII11l1I = (III11l1I) this.I00iiI;
/* 47 */                    O0iiliOio o0iiliOio = (O0iiliOio) obj;
/* 49 */                    o0iiliOio.I00000oOI();
/* 52 */                    IIolilIo iIolilIo = o0iiliOio.I00iOIl;
/* 56 */                    float fI000II = ii0i1Iolo.I0000Il00O.I000II();
/* 63 */                    if (fI000II != 0.0f) {
/* 74 */                        long j4 = oo0OI01Il2.I00000oOI;
/* 76 */                        int i4 = Oo0lI00l.I0000Il00O;
/* 81 */                        int iI000o00OoI0I = oIOlOI.I000o00OoI0I((int) (j4 >> 32));
/* 85 */                        Oo0il0olo1l oo0il0olo1lI0000O = o0oIlOolIO.I0000O();
/* 100 */                       OOo0IO oOo0IOI0000Il00O = oo0il0olo1lI0000O != null ? oo0il0olo1lI0000O.I00000oIO.I0000Il00O(iI000o00OoI0I) : new OOo0IO(0.0f, 0.0f, 0.0f, 0.0f);
/* 114 */                       float fFloor = (float) Math.floor(o0iiliOio.I00i0ilIl0i(2.0f));
/* 119 */                       if (fFloor < 1.0f) {
/* 121 */                           fFloor = 1.0f;
                                }
/* 124 */                       float f = fFloor / 2.0f;
/* 126 */                       float f2 = oOo0IOI0000Il00O.I00000oIO + f;
/* 138 */                       float fIntBitsToFloat = Float.intBitsToFloat((int) (iIolilIo.I0000oI00() >> 32)) - f;
/* 141 */                       if (f2 > fIntBitsToFloat) {
/* 143 */                           f2 = fIntBitsToFloat;
                                }
/* 146 */                       if (f2 >= f) {
/* 149 */                           f = f2;
                                }
/* 169 */                       float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
/* 186 */                       long jFloatToRawIntBits = (Float.floatToRawIntBits(fFloor2) << 32) | (Float.floatToRawIntBits(oOo0IOI0000Il00O.I00000oOI) & 4294967295L);
/* 204 */                       long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fFloor2) << 32) | (Float.floatToRawIntBits(oOo0IOI0000Il00O.I0000O) & 4294967295L);
/* 208 */                       IIolOo iIolOo = iIolilIo.I00iOIl.I0000Il00O;
/* 210 */                       I0oiil10Ili i0oiil10IliI00000oIO = iIolilIo.I00iio;
/* 212 */                       if (i0oiil10IliI00000oIO == null) {
/* 214 */                           i0oiil10IliI00000oIO = iOIlil0Il1i.I00000oIO();
/* 218 */                           i0oiil10IliI00000oIO.I001lIiIIo1O(1);
/* 221 */                           iIolilIo.I00iio = i0oiil10IliI00000oIO;
                                }
/* 225 */                       Paint paint = (Paint) i0oiil10IliI00000oIO.I00iiO;
/* 227 */                       if (iII11l1I != null) {
/* 233 */                           iII11l1I.I00000oIO(fI000II, iIolilIo.I0000oI00(), i0oiil10IliI00000oIO);
                                } else if (paint.getAlpha() / 255.0f != fI000II) {
/* 250 */                           i0oiil10IliI00000oIO.I00100l0(fI000II);
                                }
/* 261 */                       if (!O0000Ioio00.I0000O((IOOil0) i0oiil10IliI00000oIO.I00ilI0I1, null)) {
/* 263 */                           i0oiil10IliI00000oIO.I00111O(null);
                                }
/* 268 */                       if (i0oiil10IliI00000oIO.I00iiI != 3) {
/* 271 */                           i0oiil10IliI00000oIO.I0010I0i(3);
                                }
/* 280 */                       if (paint.getStrokeWidth() != fFloor) {
/* 283 */                           i0oiil10IliI00000oIO.I001l0I00(fFloor);
                                }
/* 294 */                       if (paint.getStrokeMiter() != 4.0f) {
/* 297 */                           paint.setStrokeMiter(4.0f);
                                }
/* 304 */                       if (i0oiil10IliI00000oIO.I000l1() != 0) {
/* 307 */                           i0oiil10IliI00000oIO.I001i1lo1io(0);
                                }
/* 314 */                       if (i0oiil10IliI00000oIO.I000lI() != 0) {
/* 317 */                           i0oiil10IliI00000oIO.I001iOo1i0O(0);
                                }
/* 328 */                       if (!O0000Ioio00.I0000O((I0ol1Ioloo) i0oiil10IliI00000oIO.I00ilO0, null)) {
/* 330 */                           i0oiil10IliI00000oIO.I001IO000(null);
                                }
/* 337 */                       if (!paint.isFilterBitmap()) {
/* 344 */                           i0oiil10IliI00000oIO.I001IIilI0O(1);
                                }
/* 348 */                       iIolOo.I000O01llI0(jFloatToRawIntBits, jFloatToRawIntBits2, i0oiil10IliI00000oIO);
                            }
/* 351 */                   return ooiIlOl1iI;
                    }
                }
            }
