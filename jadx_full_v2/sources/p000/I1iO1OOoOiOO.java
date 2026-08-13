            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.gallery.stablediffusion.StableDiffusion;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.net.HttpURLConnection;
            import java.net.URL;
            
            public final class I1iO1OOoOiOO implements Ii0ioo10iO0 {
                public final int I00000oIO;
                public OloIl1l1oOii I00000oOI;

                public I1iO1OOoOiOO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static boolean I0000oI00(File file, String str) {
/* 2 */             String str2 = str;
/* 5 */             for (int i = 0; i < 5; i++) {
                        try {
/* 16 */                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
/* 20 */                    httpURLConnection.setConnectTimeout(20000);
/* 25 */                    httpURLConnection.setReadTimeout(30000);
/* 28 */                    httpURLConnection.setInstanceFollowRedirects(false);
/* 35 */                    httpURLConnection.setRequestProperty("User-Agent", "Box-App/1.0");
/* 38 */                    httpURLConnection.connect();
/* 41 */                    int responseCode = httpURLConnection.getResponseCode();
/* 47 */                    if (300 > responseCode || responseCode >= 400) {
/* 116 */                       InputStream inputStream = httpURLConnection.getInputStream();
                                try {
/* 122 */                           FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    try {
/* 125 */                               iOiOlIoI.I00000oIO(inputStream, fileOutputStream);
/* 128 */                               fileOutputStream.close();
/* 131 */                               inputStream.close();
/* 135 */                               httpURLConnection.disconnect();
/* 134 */                               return true;
                                    } finally {
                                    }
                                } finally {
                                }
                            } else {
/* 55 */                        String headerField = httpURLConnection.getHeaderField("Location");
/* 59 */                        if (headerField == null) {
                                    break;
                                }
/* 62 */                        httpURLConnection.disconnect();
/* 71 */                        if (OlOolloIIOl0.I000l1(headerField, "/", false)) {
/* 75 */                            URL url = new URL(str2);
/* 105 */                           str2 = url.getProtocol() + "://" + url.getHost() + headerField;
                                } else {
/* 112 */                           str2 = headerField;
                                }
                            }
                        } catch (Throwable th) {
/* 162 */                   Log.e("TtsTask", "downloadFile failed for ".concat(str), th);
                            try {
/* 165 */                       file.delete();
                            } catch (Throwable unused) {
                            }
                        }
                    }
/* 1 */             return false;
                }

                @Override
                public final void I00000oIO(Object obj, IloI0lOlll1 iloI0lOlll1, int i) {
/* 5 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 9 */             int i2 = 29;
/* 11 */            int i3 = 10;
/* 13 */            int i4 = 12;
/* 15 */            int i5 = 8;
/* 17 */            int i6 = 14;
                    switch (this.I00000oIO) {
                        case 0:
/* 1671 */                  iloI0lOlll12.I00i0O(921413060);
/* 1682 */                  int i7 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 1696 */                  if (iloI0lOlll12.I00OIl(i7 & 1, (i7 & 3) != 2)) {
/* 1703 */                      i01IoIoO00oO.I00000oIO(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 1707 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 1710 */                  OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1714 */                  if (oOloioIlI001IO000 != null) {
/* 1719 */                      I0Il0I1o i0Il0I1o = new I0Il0I1o(7);
/* 1722 */                      i0Il0I1o.I00iiO = this;
/* 1724 */                      i0Il0I1o.I00iiI = obj;
/* 1726 */                      VarHandle.storeStoreFence();
/* 1729 */                      oOloioIlI001IO000.I0000O = i0Il0I1o;
                                break;
                            }
                            break;
                        case 1:
/* 1609 */                  iloI0lOlll12.I00i0O(-929859413);
/* 1620 */                  int i8 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 1634 */                  if (iloI0lOlll12.I00OIl(i8 & 1, (i8 & 3) != 2)) {
/* 1640 */                      i0O0lO1il0.I00000oIO((Ii0l0Olio10) obj, iloI0lOlll12, i8 & 14);
                            } else {
/* 1644 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 1647 */                  OOloioIl oOloioIlI001IO0002 = iloI0lOlll12.I001IO000();
/* 1651 */                  if (oOloioIlI001IO0002 != null) {
/* 1655 */                      I0Il0I1o i0Il0I1o2 = new I0Il0I1o(i5);
/* 1658 */                      i0Il0I1o2.I00iiO = this;
/* 1660 */                      i0Il0I1o2.I00iiI = obj;
/* 1662 */                      VarHandle.storeStoreFence();
/* 1665 */                      oOloioIlI001IO0002.I0000O = i0Il0I1o2;
                                break;
                            }
                            break;
                        case 2:
/* 1546 */                  iloI0lOlll12.I00i0O(1838196034);
/* 1557 */                  int i9 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 1571 */                  if (iloI0lOlll12.I00OIl(i9 & 1, (i9 & 3) != 2)) {
/* 1578 */                      i1IiolOOl.I00000oIO(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 1582 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 1585 */                  OOloioIl oOloioIlI001IO0003 = iloI0lOlll12.I001IO000();
/* 1589 */                  if (oOloioIlI001IO0003 != null) {
/* 1593 */                      I0Il0I1o i0Il0I1o3 = new I0Il0I1o(i4);
/* 1596 */                      i0Il0I1o3.I00iiO = this;
/* 1598 */                      i0Il0I1o3.I00iiI = obj;
/* 1600 */                      VarHandle.storeStoreFence();
/* 1603 */                      oOloioIlI001IO0003.I0000O = i0Il0I1o3;
                                break;
                            }
                            break;
                        case 3:
/* 1483 */                  iloI0lOlll12.I00i0O(1823020760);
/* 1494 */                  int i10 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 1508 */                  if (iloI0lOlll12.I00OIl(i10 & 1, (i10 & 3) != 2)) {
/* 1515 */                      i1IlIoiI10OI.I00000oIO(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 1519 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 1522 */                  OOloioIl oOloioIlI001IO0004 = iloI0lOlll12.I001IO000();
/* 1526 */                  if (oOloioIlI001IO0004 != null) {
/* 1530 */                      I0Il0I1o i0Il0I1o4 = new I0Il0I1o(i6);
/* 1533 */                      i0Il0I1o4.I00iiO = this;
/* 1535 */                      i0Il0I1o4.I00iiI = obj;
/* 1537 */                      VarHandle.storeStoreFence();
/* 1540 */                      oOloioIlI001IO0004.I0000O = i0Il0I1o4;
                                break;
                            }
                            break;
                        case 4:
/* 1418 */                  iloI0lOlll12.I00i0O(-1314791273);
/* 1429 */                  int i11 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 1443 */                  if (iloI0lOlll12.I00OIl(i11 & 1, (i11 & 3) != 2)) {
/* 1450 */                      iIO1ioiI.I0000oI00(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 1454 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 1457 */                  OOloioIl oOloioIlI001IO0005 = iloI0lOlll12.I001IO000();
/* 1461 */                  if (oOloioIlI001IO0005 != null) {
/* 1467 */                      I0Il0I1o i0Il0I1o5 = new I0Il0I1o(27);
/* 1470 */                      i0Il0I1o5.I00iiO = this;
/* 1472 */                      i0Il0I1o5.I00iiI = obj;
/* 1474 */                      VarHandle.storeStoreFence();
/* 1477 */                      oOloioIlI001IO0005.I0000O = i0Il0I1o5;
                                break;
                            }
                            break;
                        case 5:
/* 1355 */                  iloI0lOlll12.I00i0O(-1270348444);
/* 1366 */                  int i12 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 1380 */                  if (iloI0lOlll12.I00OIl(i12 & 1, (i12 & 3) != 2)) {
/* 1387 */                      iIlilIl011l.I00000oIO(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 1391 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 1394 */                  OOloioIl oOloioIlI001IO0006 = iloI0lOlll12.I001IO000();
/* 1398 */                  if (oOloioIlI001IO0006 != null) {
/* 1402 */                      I0Il0I1o i0Il0I1o6 = new I0Il0I1o(i2);
/* 1405 */                      i0Il0I1o6.I00iiO = this;
/* 1407 */                      i0Il0I1o6.I00iiI = obj;
/* 1409 */                      VarHandle.storeStoreFence();
/* 1412 */                      oOloioIlI001IO0006.I0000O = i0Il0I1o6;
                                break;
                            }
                            break;
                        case 6:
/* 1292 */                  iloI0lOlll12.I00i0O(1620541114);
/* 1303 */                  int i13 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 1317 */                  if (iloI0lOlll12.I00OIl(i13 & 1, (i13 & 3) != 2)) {
/* 1323 */                      Iloo0ilo.I00000oOI((Ii0l0Olio10) obj, iloI0lOlll12, i13 & 14);
                            } else {
/* 1327 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 1330 */                  OOloioIl oOloioIlI001IO0007 = iloI0lOlll12.I001IO000();
/* 1334 */                  if (oOloioIlI001IO0007 != null) {
/* 1339 */                      Ilo0lI ilo0lI = new Ilo0lI(5);
/* 1342 */                      ilo0lI.I00iiI = this;
/* 1344 */                      ilo0lI.I00iiO = obj;
/* 1346 */                      VarHandle.storeStoreFence();
/* 1349 */                      oOloioIlI001IO0007.I0000O = ilo0lI;
                                break;
                            }
                            break;
                        case 7:
/* 1229 */                  iloI0lOlll12.I00i0O(1102032743);
/* 1240 */                  int i14 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 1254 */                  if (iloI0lOlll12.I00OIl(i14 & 1, (i14 & 3) != 2)) {
/* 1261 */                      iIo1OOi0Ii1.I0000O(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 1265 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 1268 */                  OOloioIl oOloioIlI001IO0008 = iloI0lOlll12.I001IO000();
/* 1272 */                  if (oOloioIlI001IO0008 != null) {
/* 1276 */                      Ilo0lI ilo0lI2 = new Ilo0lI(10);
/* 1279 */                      ilo0lI2.I00iiI = this;
/* 1281 */                      ilo0lI2.I00iiO = obj;
/* 1283 */                      VarHandle.storeStoreFence();
/* 1286 */                      oOloioIlI001IO0008.I0000O = ilo0lI2;
                                break;
                            }
                            break;
                        case 8:
/* 1156 */                  iloI0lOlll12.I00i0O(-1208997618);
/* 1167 */                  int i15 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 1179 */                  if (iloI0lOlll12.I00OIl(i15 & 1, (i15 & 3) != 2)) {
/* 1182 */                      Ii0l0ll1 ii0l0ll1 = (Ii0l0ll1) obj;
/* 1196 */                      O11Oio.I000II(ii0l0ll1.I00000oIO, ii0l0ll1.I00000oOI, null, null, iloI0lOlll12, 0);
                            } else {
/* 1200 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 1203 */                  OOloioIl oOloioIlI001IO0009 = iloI0lOlll12.I001IO000();
/* 1207 */                  if (oOloioIlI001IO0009 != null) {
/* 1213 */                      Ilo0lI ilo0lI3 = new Ilo0lI(15);
/* 1216 */                      ilo0lI3.I00iiI = this;
/* 1218 */                      ilo0lI3.I00iiO = obj;
/* 1220 */                      VarHandle.storeStoreFence();
/* 1223 */                      oOloioIlI001IO0009.I0000O = ilo0lI3;
                                break;
                            }
                            break;
                        case 9:
/* 1083 */                  iloI0lOlll12.I00i0O(390543763);
/* 1094 */                  int i16 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 1106 */                  if (iloI0lOlll12.I00OIl(i16 & 1, (i16 & 3) != 2)) {
/* 1109 */                      Ii0l0ll1 ii0l0ll12 = (Ii0l0ll1) obj;
/* 1123 */                      O11Oio.I000O01llI0(ii0l0ll12.I00000oIO, ii0l0ll12.I00000oOI, null, null, iloI0lOlll12, 0);
                            } else {
/* 1127 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 1130 */                  OOloioIl oOloioIlI001IO00010 = iloI0lOlll12.I001IO000();
/* 1134 */                  if (oOloioIlI001IO00010 != null) {
/* 1140 */                      Ilo0lI ilo0lI4 = new Ilo0lI(16);
/* 1143 */                      ilo0lI4.I00iiI = this;
/* 1145 */                      ilo0lI4.I00iiO = obj;
/* 1147 */                      VarHandle.storeStoreFence();
/* 1150 */                      oOloioIlI001IO00010.I0000O = ilo0lI4;
                                break;
                            }
                            break;
                        case 10:
/* 933 */                   iloI0lOlll12.I00i0O(-1332360183);
/* 944 */                   int i17 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 956 */                   if (iloI0lOlll12.I00OIl(i17 & 1, (i17 & 3) != 2)) {
/* 959 */                       Ii0l0ll1 ii0l0ll13 = (Ii0l0ll1) obj;
/* 961 */                       Oool1Ii0I oool1Ii0II00000oIO = O11oIiol.I00000oIO(iloI0lOlll12);
/* 965 */                       if (oool1Ii0II00000oIO == null) {
/* 1050 */                          I000II.I001IO000("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    break;
                                } else {
/* 1042 */                          O11Oio.I000OOo1O(ii0l0ll13.I00000oIO, ii0l0ll13.I00000oOI, null, null, null, null, null, null, null, (O11OliOlOII) li1ilo1Oli.I00000oIO(OOoOl0i.I00000oIO.I00000oOI(O11OliOlOII.class), oool1Ii0II00000oIO, ilo0oII1O01.I00000oIO(li1iolIo.I00000oOI(oool1Ii0II00000oIO), iloI0lOlll12), li1iolIo.I00000oIO(oool1Ii0II00000oIO), iloI0lOlll12), true, null, null, i1i1ooOIOi.I00000oIO, null, null, true, true, ii0l0ll13.I0000Il00O, ii0l0ll13.I0000O, ii0l0ll13.I0000oI00, iloI0lOlll1, 0, 14158854, 2152956);
/* 1045 */                          iloI0lOlll12 = iloI0lOlll1;
                                }
                            } else {
/* 1054 */                      iloI0lOlll12.I00OilO00Il();
                            }
/* 1057 */                  OOloioIl oOloioIlI001IO00011 = iloI0lOlll12.I001IO000();
/* 1061 */                  if (oOloioIlI001IO00011 != null) {
/* 1067 */                      Ilo0lI ilo0lI5 = new Ilo0lI(17);
/* 1070 */                      ilo0lI5.I00iiI = this;
/* 1072 */                      ilo0lI5.I00iiO = obj;
/* 1074 */                      VarHandle.storeStoreFence();
/* 1077 */                      oOloioIlI001IO00011.I0000O = ilo0lI5;
                                break;
                            }
                            break;
                        case 11:
/* 860 */                   iloI0lOlll12.I00i0O(-1162636266);
/* 871 */                   int i18 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 883 */                   if (iloI0lOlll12.I00OIl(i18 & 1, (i18 & 3) != 2)) {
/* 886 */                       Ii0l0ll1 ii0l0ll14 = (Ii0l0ll1) obj;
/* 900 */                       l110i1iI.I00000oIO(ii0l0ll14.I00000oIO, ii0l0ll14.I00000oOI, null, null, iloI0lOlll12, 0);
                            } else {
/* 904 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 907 */                   OOloioIl oOloioIlI001IO00012 = iloI0lOlll12.I001IO000();
/* 911 */                   if (oOloioIlI001IO00012 != null) {
/* 917 */                       Ilo0lI ilo0lI6 = new Ilo0lI(18);
/* 920 */                       ilo0lI6.I00iiI = this;
/* 922 */                       ilo0lI6.I00iiO = obj;
/* 924 */                       VarHandle.storeStoreFence();
/* 927 */                       oOloioIlI001IO00012.I0000O = ilo0lI6;
                                break;
                            }
                            break;
                        case 12:
/* 795 */                   iloI0lOlll12.I00i0O(1016881948);
/* 806 */                   int i19 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 820 */                   if (iloI0lOlll12.I00OIl(i19 & 1, (i19 & 3) != 2)) {
/* 827 */                       iIoo10I.I00000oIO(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 831 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 834 */                   OOloioIl oOloioIlI001IO00013 = iloI0lOlll12.I001IO000();
/* 838 */                   if (oOloioIlI001IO00013 != null) {
/* 844 */                       Ilo0lI ilo0lI7 = new Ilo0lI(26);
/* 847 */                       ilo0lI7.I00iiI = this;
/* 849 */                       ilo0lI7.I00iiO = obj;
/* 851 */                       VarHandle.storeStoreFence();
/* 854 */                       oOloioIlI001IO00013.I0000O = ilo0lI7;
                                break;
                            }
                            break;
                        case 13:
/* 732 */                   iloI0lOlll12.I00i0O(-1076666113);
/* 743 */                   int i20 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 757 */                   if (iloI0lOlll12.I00OIl(i20 & 1, (i20 & 3) != 2)) {
/* 764 */                       iIooIioI1Oo0.I00000oIO(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 768 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 771 */                   OOloioIl oOloioIlI001IO00014 = iloI0lOlll12.I001IO000();
/* 775 */                   if (oOloioIlI001IO00014 != null) {
/* 779 */                       Ilo0lI ilo0lI8 = new Ilo0lI(29);
/* 782 */                       ilo0lI8.I00iiI = this;
/* 784 */                       ilo0lI8.I00iiO = obj;
/* 786 */                       VarHandle.storeStoreFence();
/* 789 */                       oOloioIlI001IO00014.I0000O = ilo0lI8;
                                break;
                            }
                            break;
                        case 14:
/* 670 */                   iloI0lOlll12.I00i0O(310842492);
/* 681 */                   int i21 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 695 */                   if (iloI0lOlll12.I00OIl(i21 & 1, (i21 & 3) != 2)) {
/* 701 */                       iO0iil1loOI0.I000O01llI0(i21 & 14, (Ii0l0Olio10) obj, iloI0lOlll12, null);
                            } else {
/* 705 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 708 */                   OOloioIl oOloioIlI001IO00015 = iloI0lOlll12.I001IO000();
/* 712 */                   if (oOloioIlI001IO00015 != null) {
/* 716 */                       O1oiiIIo111o o1oiiIIo111o = new O1oiiIIo111o(8);
/* 719 */                       o1oiiIIo111o.I00iiI = this;
/* 721 */                       o1oiiIIo111o.I00iiO = obj;
/* 723 */                       VarHandle.storeStoreFence();
/* 726 */                       oOloioIlI001IO00015.I0000O = o1oiiIIo111o;
                                break;
                            }
                            break;
                        case 15:
/* 607 */                   iloI0lOlll12.I00i0O(-642172552);
/* 618 */                   int i22 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 632 */                   if (iloI0lOlll12.I00OIl(i22 & 1, (i22 & 3) != 2)) {
/* 639 */                       iO0oI1oIoli0.I00000oOI(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 643 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 646 */                   OOloioIl oOloioIlI001IO00016 = iloI0lOlll12.I001IO000();
/* 650 */                   if (oOloioIlI001IO00016 != null) {
/* 654 */                       O1oiiIIo111o o1oiiIIo111o2 = new O1oiiIIo111o(14);
/* 657 */                       o1oiiIIo111o2.I00iiI = this;
/* 659 */                       o1oiiIIo111o2.I00iiO = obj;
/* 661 */                       VarHandle.storeStoreFence();
/* 664 */                       oOloioIlI001IO00016.I0000O = o1oiiIIo111o2;
                                break;
                            }
                            break;
                        case 16:
/* 542 */                   iloI0lOlll12.I00i0O(520324795);
/* 553 */                   int i23 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 567 */                   if (iloI0lOlll12.I00OIl(i23 & 1, (i23 & 3) != 2)) {
/* 574 */                       iO10II1oIll0.I00000oIO(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 578 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 581 */                   OOloioIl oOloioIlI001IO00017 = iloI0lOlll12.I001IO000();
/* 585 */                   if (oOloioIlI001IO00017 != null) {
/* 591 */                       O1oiiIIo111o o1oiiIIo111o3 = new O1oiiIIo111o(19);
/* 594 */                       o1oiiIIo111o3.I00iiI = this;
/* 596 */                       o1oiiIIo111o3.I00iiO = obj;
/* 598 */                       VarHandle.storeStoreFence();
/* 601 */                       oOloioIlI001IO00017.I0000O = o1oiiIIo111o3;
                                break;
                            }
                            break;
                        case 17:
/* 477 */                   iloI0lOlll12.I00i0O(1688529567);
/* 488 */                   int i24 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 502 */                   if (iloI0lOlll12.I00OIl(i24 & 1, (i24 & 3) != 2)) {
/* 509 */                       iO10II1oIll0.I00000oIO(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 513 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 516 */                   OOloioIl oOloioIlI001IO00018 = iloI0lOlll12.I001IO000();
/* 520 */                   if (oOloioIlI001IO00018 != null) {
/* 526 */                       O1oiiIIo111o o1oiiIIo111o4 = new O1oiiIIo111o(21);
/* 529 */                       o1oiiIIo111o4.I00iiI = this;
/* 531 */                       o1oiiIIo111o4.I00iiO = obj;
/* 533 */                       VarHandle.storeStoreFence();
/* 536 */                       oOloioIlI001IO00018.I0000O = o1oiiIIo111o4;
                                break;
                            }
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 412 */                   iloI0lOlll12.I00i0O(-1416873829);
/* 423 */                   int i25 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 437 */                   if (iloI0lOlll12.I00OIl(i25 & 1, (i25 & 3) != 2)) {
/* 444 */                       iO10OIiI0i.I00000oIO(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 448 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 451 */                   OOloioIl oOloioIlI001IO00019 = iloI0lOlll12.I001IO000();
/* 455 */                   if (oOloioIlI001IO00019 != null) {
/* 461 */                       O1oiiIIo111o o1oiiIIo111o5 = new O1oiiIIo111o(23);
/* 464 */                       o1oiiIIo111o5.I00iiI = this;
/* 466 */                       o1oiiIIo111o5.I00iiO = obj;
/* 468 */                       VarHandle.storeStoreFence();
/* 471 */                       oOloioIlI001IO00019.I0000O = o1oiiIIo111o5;
                                break;
                            }
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 347 */                   iloI0lOlll12.I00i0O(-465293910);
/* 358 */                   int i26 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 372 */                   if (iloI0lOlll12.I00OIl(i26 & 1, (i26 & 3) != 2)) {
/* 379 */                       iO11I0o0i.I00000oIO(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 383 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 386 */                   OOloioIl oOloioIlI001IO00020 = iloI0lOlll12.I001IO000();
/* 390 */                   if (oOloioIlI001IO00020 != null) {
/* 396 */                       O1oiiIIo111o o1oiiIIo111o6 = new O1oiiIIo111o(25);
/* 399 */                       o1oiiIIo111o6.I00iiI = this;
/* 401 */                       o1oiiIIo111o6.I00iiO = obj;
/* 403 */                       VarHandle.storeStoreFence();
/* 406 */                       oOloioIlI001IO00020.I0000O = o1oiiIIo111o6;
                                break;
                            }
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 283 */                   iloI0lOlll12.I00i0O(-1506870622);
/* 295 */                   int i27 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 309 */                   if (iloI0lOlll12.I00OIl(i27 & 1, (i27 & 3) != 2)) {
/* 316 */                       iO1IOIoilO.I0000Il00O(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 320 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 323 */                   OOloioIl oOloioIlI001IO00021 = iloI0lOlll12.I001IO000();
/* 327 */                   if (oOloioIlI001IO00021 != null) {
/* 331 */                       Oo00iIooiI oo00iIooiI = new Oo00iIooiI(i);
/* 334 */                       oo00iIooiI.I00iiI = this;
/* 336 */                       oo00iIooiI.I00iiO = obj;
/* 338 */                       VarHandle.storeStoreFence();
/* 341 */                       oOloioIlI001IO00021.I0000O = oo00iIooiI;
                                break;
                            }
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 219 */                   iloI0lOlll12.I00i0O(-1943127049);
/* 230 */                   int i28 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 244 */                   if (iloI0lOlll12.I00OIl(i28 & 1, (i28 & 3) != 2)) {
/* 251 */                       iO1Ill0.I00000oOI(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 255 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 258 */                   OOloioIl oOloioIlI001IO00022 = iloI0lOlll12.I001IO000();
/* 262 */                   if (oOloioIlI001IO00022 != null) {
/* 267 */                       Oo00iIooiI oo00iIooiI2 = new Oo00iIooiI(6);
/* 270 */                       oo00iIooiI2.I00iiI = this;
/* 272 */                       oo00iIooiI2.I00iiO = obj;
/* 274 */                       VarHandle.storeStoreFence();
/* 277 */                       oOloioIlI001IO00022.I0000O = oo00iIooiI2;
                                break;
                            }
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 156 */                   iloI0lOlll12.I00i0O(343333267);
/* 167 */                   int i29 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 181 */                   if (iloI0lOlll12.I00OIl(i29 & 1, (i29 & 3) != 2)) {
/* 188 */                       iO1Ioi0.I00000oIO(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 192 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 195 */                   OOloioIl oOloioIlI001IO00023 = iloI0lOlll12.I001IO000();
/* 199 */                   if (oOloioIlI001IO00023 != null) {
/* 203 */                       Oo00iIooiI oo00iIooiI3 = new Oo00iIooiI(i5);
/* 206 */                       oo00iIooiI3.I00iiI = this;
/* 208 */                       oo00iIooiI3.I00iiO = obj;
/* 210 */                       VarHandle.storeStoreFence();
/* 213 */                       oOloioIlI001IO00023.I0000O = oo00iIooiI3;
                                break;
                            }
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 93 */                    iloI0lOlll12.I00i0O(-1971795034);
/* 104 */                   int i30 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 118 */                   if (iloI0lOlll12.I00OIl(i30 & 1, (i30 & 3) != 2)) {
/* 125 */                       iO1OIlOO.I00000oOI(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 129 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 132 */                   OOloioIl oOloioIlI001IO00024 = iloI0lOlll12.I001IO000();
/* 136 */                   if (oOloioIlI001IO00024 != null) {
/* 140 */                       Oo00iIooiI oo00iIooiI4 = new Oo00iIooiI(i3);
/* 143 */                       oo00iIooiI4.I00iiI = this;
/* 145 */                       oo00iIooiI4.I00iiO = obj;
/* 147 */                       VarHandle.storeStoreFence();
/* 150 */                       oOloioIlI001IO00024.I0000O = oo00iIooiI4;
                                break;
                            }
                            break;
                        default:
/* 30 */                    iloI0lOlll12.I00i0O(117812891);
/* 41 */                    int i31 = i | (iloI0lOlll12.I000OOo1O(obj) ? 4 : 2);
/* 55 */                    if (iloI0lOlll12.I00OIl(i31 & 1, (i31 & 3) != 2)) {
/* 62 */                        iO1OoolI.I00000oIO(((Ii0l0Olio10) obj).I00000oIO, null, iloI0lOlll12, 0);
                            } else {
/* 66 */                        iloI0lOlll12.I00OilO00Il();
                            }
/* 69 */                    OOloioIl oOloioIlI001IO00025 = iloI0lOlll12.I001IO000();
/* 73 */                    if (oOloioIlI001IO00025 != null) {
/* 77 */                        Oo00iIooiI oo00iIooiI5 = new Oo00iIooiI(i4);
/* 80 */                        oo00iIooiI5.I00iiI = this;
/* 82 */                        oo00iIooiI5.I00iiO = obj;
/* 84 */                        VarHandle.storeStoreFence();
/* 87 */                        oOloioIlI001IO00025.I0000O = oo00iIooiI5;
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final OloIl1l1oOii I00000oOI() {
                    switch (this.I00000oIO) {
                    }
/* 6 */             return this.I00000oOI;
                }

                @Override
                public final void I0000Il00O(Context context, IOO11li1OoII iOO11li1OoII, O1oIOiI11o0 o1oIOiI11o0, I0IO1io0I i0IO1io0I) {
                    switch (this.I00000oIO) {
                        case 0:
/* 397 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new I0iOI0o1i(4, i0IO1io0I, (IOoil1iiIilo) null, o1oIOiI11o0, context), 2);
                            break;
                        case 1:
/* 381 */                   i0IO1io0I.invoke("");
                            break;
                        case 2:
/* 377 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new II10oiOO(0, i0IO1io0I, null, o1oIOiI11o0, context), 2);
                            break;
                        case 3:
/* 359 */                   o1oIOiI11o0.I00IlilI0i0i = liIoOiiO1Oi.I00iiO;
/* 361 */                   i0IO1io0I.invoke("");
                            break;
                        case 4:
/* 353 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new I0iOI0o1i(17, i0IO1io0I, (IOoil1iiIilo) null, o1oIOiI11o0, context), 2);
                            break;
                        case 5:
/* 336 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new II10oiOO(1, i0IO1io0I, null, o1oIOiI11o0, context), 2);
                            break;
                        case 6:
/* 320 */                   i0IO1io0I.invoke("");
                            break;
                        case 7:
/* 316 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new I000oI1ioi(o1oIOiI11o0, context, i0IO1io0I, null, 10), 2);
                            break;
                        case 8:
/* 281 */                   O11il1ilio1o o11il1ilio1oI00000oIO = l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0);
/* 287 */                   String str = this.I00000oOI.I00000oIO;
/* 49 */                    o11il1ilio1oI00000oIO.I0000O(context, o1oIOiI11o0, false, true, i0IO1io0I, (Barcode.FORMAT_UPC_A & 64) != 0 ? null : null, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_ITF) != 0 ? Il01100l.I00iOIl : null, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_QR_CODE) == 0, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_UPC_A) != 0 ? null : iOO11li1OoII);
                            break;
                        case 9:
/* 259 */                   O11il1ilio1o o11il1ilio1oI00000oIO2 = l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0);
/* 265 */                   String str2 = this.I00000oOI.I00000oIO;
/* 49 */                    o11il1ilio1oI00000oIO2.I0000O(context, o1oIOiI11o0, true, false, i0IO1io0I, (Barcode.FORMAT_UPC_A & 64) != 0 ? null : null, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_ITF) != 0 ? Il01100l.I00iOIl : null, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_QR_CODE) == 0, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_UPC_A) != 0 ? null : iOO11li1OoII);
                            break;
                        case 10:
/* 235 */                   O11il1ilio1o o11il1ilio1oI00000oIO3 = l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0);
/* 241 */                   String str3 = this.I00000oOI.I00000oIO;
/* 49 */                    o11il1ilio1oI00000oIO3.I0000O(context, o1oIOiI11o0, o1oIOiI11o0.I001i1O0Ol, o1oIOiI11o0.I001i1lo1io, i0IO1io0I, (Barcode.FORMAT_UPC_A & 64) != 0 ? null : null, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_ITF) != 0 ? Il01100l.I00iOIl : null, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_QR_CODE) == 0, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_UPC_A) != 0 ? null : iOO11li1OoII);
                            break;
                        case 11:
/* 215 */                   O111ooi11li o111ooi11li = O111ooi11li.I00000oIO;
/* 219 */                   String str4 = this.I00000oOI.I00000oIO;
/* 49 */                    o111ooi11li.I0000O(context, o1oIOiI11o0, false, false, i0IO1io0I, (Barcode.FORMAT_UPC_A & 64) != 0 ? null : null, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_ITF) != 0 ? Il01100l.I00iOIl : null, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_QR_CODE) == 0, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_UPC_A) != 0 ? null : null);
                            break;
                        case 12:
/* 211 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new I0iOI0o1i(28, i0IO1io0I, (IOoil1iiIilo) null, o1oIOiI11o0, context), 2);
                            break;
                        case 13:
/* 194 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new O1o1iI(o1oIOiI11o0, context, i0IO1io0I, (IOoil1iiIilo) null, 0), 2);
                            break;
                        case 14:
/* 178 */                   i0IO1io0I.invoke("");
                            break;
                        case 15:
/* 174 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new I000oI1ioi(o1oIOiI11o0, context, i0IO1io0I, null, 20), 2);
                            break;
                        case 16:
/* 157 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new OlI10loO0oio(0, i0IO1io0I, null, o1oIOiI11o0, context), 2);
                            break;
                        case 17:
/* 141 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new OlI10loO0oio(1, i0IO1io0I, null, o1oIOiI11o0, context), 2);
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 125 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new O1o1iI(context, o1oIOiI11o0, i0IO1io0I, (IOoil1iiIilo) null), 2);
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 114 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new O1o1iI(o1oIOiI11o0, context, i0IO1io0I, (IOoil1iiIilo) null, 15), 2);
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 79 */                    O11il1ilio1o o11il1ilio1oI00000oIO4 = l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0);
/* 85 */                    String str5 = this.I00000oOI.I00000oIO;
/* 49 */                    o11il1ilio1oI00000oIO4.I0000O(context, o1oIOiI11o0, false, true, i0IO1io0I, (Barcode.FORMAT_UPC_A & 64) != 0 ? null : null, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_ITF) != 0 ? Il01100l.I00iOIl : null, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_QR_CODE) == 0, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_UPC_A) != 0 ? null : iOO11li1OoII);
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 60 */                    IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 75 */                    iOi1II01i0.I0000O(iOO11li1OoII, Ii1oo1ooill0.I00iiI, null, new II01IloII(o1oIOiI11o0, context, i0IO1io0I, this, null, 6), 2);
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 56 */                    iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new O1o1iI(o1oIOiI11o0, context, i0IO1io0I, (IOoil1iiIilo) null, 21), 2);
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 39 */                    iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new I000oI1ioi(o1oIOiI11o0, context, i0IO1io0I, null, 25), 2);
                            break;
                        default:
/* 22 */                    iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new II10oiOO(2, i0IO1io0I, null, o1oIOiI11o0, context), 2);
                            break;
                    }
                }

                @Override
                public final void I0000O(IOO11li1OoII iOO11li1OoII, O1oIOiI11o0 o1oIOiI11o0, O1oiilO o1oiilO) throws Exception {
                    switch (this.I00000oIO) {
                        case 0:
/* 475 */                   Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 484 */                   WhisperEngine whisperEngine = obj instanceof WhisperEngine ? (WhisperEngine) obj : null;
/* 485 */                   if (whisperEngine != null) {
/* 498 */                       iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new I1iO0ilI0Il(whisperEngine, o1oiilO, null, 0), 2);
                                break;
                            } else {
/* 487 */                       o1oiilO.invoke();
                                break;
                            }
                        case 1:
/* 471 */                   o1oiilO.invoke();
                            break;
                        case 2:
/* 443 */                   Object obj2 = o1oIOiI11o0.I00IlilI0i0i;
/* 452 */                   II10ili1 iI10ili1 = obj2 instanceof II10ili1 ? (II10ili1) obj2 : null;
/* 453 */                   if (iI10ili1 != null) {
/* 467 */                       iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new I1iIil1I(iI10ili1, o1oiilO, null, 6), 2);
                                break;
                            } else {
/* 455 */                       o1oiilO.invoke();
                                break;
                            }
                        case 3:
/* 437 */                   o1oIOiI11o0.I00IlilI0i0i = null;
/* 439 */                   o1oiilO.invoke();
                            break;
                        case 4:
/* 408 */                   Object obj3 = o1oIOiI11o0.I00IlilI0i0i;
/* 417 */                   IlI00iOi1 ilI00iOi1 = obj3 instanceof IlI00iOi1 ? (IlI00iOi1) obj3 : null;
/* 418 */                   if (ilI00iOi1 != null) {
/* 433 */                       iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new Ii1O001loIoO(ilI00iOi1, o1oiilO, null, 10), 2);
                                break;
                            } else {
/* 420 */                       o1oiilO.invoke();
                                break;
                            }
                        case 5:
/* 379 */                   Object obj4 = o1oIOiI11o0.I00IlilI0i0i;
/* 388 */                   Ili000 ili000 = obj4 instanceof Ili000 ? (Ili000) obj4 : null;
/* 389 */                   if (ili000 != null) {
/* 404 */                       iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new I1iIil1I(ili000, o1oiilO, null, 22), 2);
                                break;
                            } else {
/* 391 */                       o1oiilO.invoke();
                                break;
                            }
                        case 6:
/* 375 */                   o1oiilO.invoke();
                            break;
                        case 7:
/* 348 */                   Object obj5 = o1oIOiI11o0.I00IlilI0i0i;
/* 357 */                   StableDiffusion stableDiffusion = obj5 instanceof StableDiffusion ? (StableDiffusion) obj5 : null;
/* 358 */                   if (stableDiffusion != null) {
/* 371 */                       iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new I1iIil1I(stableDiffusion, o1oiilO, null, 28), 2);
                                break;
                            } else {
/* 360 */                       o1oiilO.invoke();
                                break;
                            }
                        case 8:
/* 344 */                   l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0).I00000oIO(o1oIOiI11o0, o1oiilO);
                            break;
                        case 9:
/* 336 */                   l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0).I00000oIO(o1oIOiI11o0, o1oiilO);
                            break;
                        case 10:
/* 328 */                   l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0).I00000oIO(o1oIOiI11o0, o1oiilO);
                            break;
                        case 11:
/* 320 */                   O111ooi11li.I00000oIO.I00000oIO(o1oIOiI11o0, o1oiilO);
                            break;
                        case 12:
/* 289 */                   Object obj6 = o1oIOiI11o0.I00IlilI0i0i;
/* 298 */                   O1lo00 o1lo00 = obj6 instanceof O1lo00 ? (O1lo00) obj6 : null;
/* 299 */                   if (o1lo00 != null) {
/* 314 */                       iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new O00lOIIO(o1lo00, o1oiilO, null, 13), 2);
                                break;
                            } else {
/* 301 */                       o1oiilO.invoke();
                                break;
                            }
                        case 13:
/* 285 */                   iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new O00lOIIO(o1oIOiI11o0, o1oiilO, null, 16), 2);
                            break;
                        case 14:
/* 272 */                   o1oiilO.invoke();
                            break;
                        case 15:
/* 245 */                   Object obj7 = o1oIOiI11o0.I00IlilI0i0i;
/* 254 */                   Oil1lO oil1lO = obj7 instanceof Oil1lO ? (Oil1lO) obj7 : null;
/* 255 */                   if (oil1lO != null) {
/* 268 */                       iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new O00lOIIO(oil1lO, o1oiilO, null, 28), 2);
                                break;
                            } else {
/* 257 */                       o1oiilO.invoke();
                                break;
                            }
                        case 16:
/* 218 */                   Object obj8 = o1oIOiI11o0.I00IlilI0i0i;
/* 227 */                   OlI0o1 olI0o1 = obj8 instanceof OlI0o1 ? (OlI0o1) obj8 : null;
/* 228 */                   if (olI0o1 != null) {
/* 241 */                       iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new OlI10lo(olI0o1, o1oiilO, null, 0), 2);
                                break;
                            } else {
/* 230 */                       o1oiilO.invoke();
                                break;
                            }
                        case 17:
/* 191 */                   Object obj9 = o1oIOiI11o0.I00IlilI0i0i;
/* 200 */                   OlI0o1 olI0o12 = obj9 instanceof OlI0o1 ? (OlI0o1) obj9 : null;
/* 201 */                   if (olI0o12 != null) {
/* 214 */                       iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new OlI10lo(olI0o12, o1oiilO, null, 1), 2);
                                break;
                            } else {
/* 203 */                       o1oiilO.invoke();
                                break;
                            }
                        case PoseLandmark.RIGHT_PINKY:
/* 163 */                   Object obj10 = o1oIOiI11o0.I00IlilI0i0i;
/* 172 */                   OlI0iOo olI0iOo = obj10 instanceof OlI0iOo ? (OlI0iOo) obj10 : null;
/* 173 */                   if (olI0iOo != null) {
/* 187 */                       iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new Ol0Oli(olI0iOo, o1oiilO, (IOoil1iiIilo) null, 5), 2);
                                break;
                            } else {
/* 175 */                       o1oiilO.invoke();
                                break;
                            }
                        case PoseLandmark.LEFT_INDEX:
/* 134 */                   Object obj11 = o1oIOiI11o0.I00IlilI0i0i;
/* 143 */                   OliiOI oliiOI = obj11 instanceof OliiOI ? (OliiOI) obj11 : null;
/* 144 */                   if (oliiOI != null) {
/* 159 */                       iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new Ol0Oli(oliiOI, o1oiilO, (IOoil1iiIilo) null, 8), 2);
                                break;
                            } else {
/* 146 */                       o1oiilO.invoke();
                                break;
                            }
                        case PoseLandmark.RIGHT_INDEX:
/* 130 */                   l1Oo0iIiO1i.I00000oIO(o1oIOiI11o0).I00000oIO(o1oIOiI11o0, o1oiilO);
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 97 */                    Object obj12 = o1oIOiI11o0.I00IlilI0i0i;
/* 106 */                   II1olI iI1olI = obj12 instanceof II1olI ? (II1olI) obj12 : null;
/* 107 */                   if (iI1olI != null) {
/* 122 */                       iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new Ol0Oli(iI1olI, o1oiilO, (IOoil1iiIilo) null, 14), 2);
                                break;
                            } else {
/* 109 */                       o1oiilO.invoke();
                                break;
                            }
                        case PoseLandmark.RIGHT_THUMB:
/* 68 */                    Object obj13 = o1oIOiI11o0.I00IlilI0i0i;
/* 77 */                    Ool0OI ool0OI = obj13 instanceof Ool0OI ? (Ool0OI) obj13 : null;
/* 78 */                    if (ool0OI != null) {
/* 93 */                        iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new Ol0Oli(ool0OI, o1oiilO, (IOoil1iiIilo) null, 15), 2);
                                break;
                            } else {
/* 80 */                        o1oiilO.invoke();
                                break;
                            }
                        case PoseLandmark.LEFT_HIP:
/* 41 */                    Object obj14 = o1oIOiI11o0.I00IlilI0i0i;
/* 50 */                    WhisperEngine whisperEngine2 = obj14 instanceof WhisperEngine ? (WhisperEngine) obj14 : null;
/* 51 */                    if (whisperEngine2 != null) {
/* 64 */                        iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new I1iO0ilI0Il(whisperEngine2, o1oiilO, null, 1), 2);
                                break;
                            } else {
/* 53 */                        o1oiilO.invoke();
                                break;
                            }
                        default:
/* 12 */                    Object obj15 = o1oIOiI11o0.I00IlilI0i0i;
/* 21 */                    i0I00l i0i00l = obj15 instanceof i0I00l ? (i0I00l) obj15 : null;
/* 22 */                    if (i0i00l != null) {
/* 37 */                        iOi1II01i0.I0000O(iOO11li1OoII, IiiIil1lOIO.I00000oIO, null, new Ol0Oli(i0i00l, o1oiilO, (IOoil1iiIilo) null, 18), 2);
                                break;
                            } else {
/* 24 */                        o1oiilO.invoke();
                                break;
                            }
                    }
                }
            }
