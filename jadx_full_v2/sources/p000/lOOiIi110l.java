            package p000;

            import com.box.gallery.R;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class lOOiIi110l {
                /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0559  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0563  */
                /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(OloIl1l1oOii oloIl1l1oOii, O1oIOiI11o0 o1oIOiI11o0, O1oIo0iI00 o1oIo0iI00, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    O1ooiI111i o1ooiI111i3;
                    OOloioIl oOloioIlI001IO000;
                    long j;
                    boolean z;
/* 16 */            iloI0lOlll1.I00i0O(-1208756440);
/* 22 */            if ((i & 6) == 0) {
/* 33 */                i3 = (iloI0lOlll1.I000OOo1O(oloIl1l1oOii) ? 4 : 2) | i;
                    } else {
/* 35 */                i3 = i;
                    }
/* 38 */            if ((i & 48) == 0) {
/* 51 */                i3 |= iloI0lOlll1.I000OOo1O(o1oIOiI11o0) ? 32 : 16;
                    }
/* 54 */            if ((i & 384) == 0) {
/* 67 */                i3 |= iloI0lOlll1.I000II(o1oIo0iI00) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 68 */            int i4 = i2 & 8;
/* 70 */            if (i4 == 0) {
/* 79 */                if ((i & 3072) == 0) {
/* 81 */                    o1ooiI111i2 = o1ooiI111i;
/* 94 */                    i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                        }
/* 111 */               if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) == 1170)) {
/* 1370 */                  iloI0lOlll1.I00OilO00Il();
/* 1373 */                  o1ooiI111i3 = o1ooiI111i2;
                        } else {
/* 113 */                   O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 119 */                   O1ooiI111i o1ooiI111i4 = i4 != 0 ? o1ooIo101ll : o1ooiI111i2;
/* 126 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00, i1O01oOIoI0I.I00lli11, iloI0lOlll1, 54);
/* 132 */                   int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 136 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 140 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111i4);
/* 146 */                   IOl0oi0lOl1.I000lI.getClass();
/* 149 */                   iloI0lOlll1.I00i0oil();
/* 154 */                   if (iloI0lOlll1.I00O10llo) {
/* 158 */                       iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                            } else {
/* 162 */                       iloI0lOlll1.I00io1l();
                            }
/* 167 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 172 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 181 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 184 */                   li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 189 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 192 */                   if (oloIl1l1oOii != null) {
/* 197 */                       iloI0lOlll1.I00i01iIIliI(1963311773);
/* 210 */                       j = ((IOOiio0i) iiOl0IlIlll.I00000oIO(oloIl1l1oOii, iloI0lOlll1).get(1)).I00000oIO;
/* 212 */                       iloI0lOlll1.I0010I0i(false);
                            } else {
/* 219 */                       iloI0lOlll1.I00i01iIIliI(1963374083);
/* 232 */                       j = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00000oIO;
/* 234 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 246 */                   if (o1oIOiI11o0.I00100o1O0lo.length() > 0) {
/* 251 */                       iloI0lOlll1.I00i01iIIliI(1963498703);
/* 274 */                       o1ooiI111i3 = o1ooiI111i4;
/* 276 */                       IoOoiI1II00i.I00000oIO(iOlO1Ol0li.I00000oIO(), lOOoli.I00000oOI(R.string.cd_downloaded_icon, iloI0lOlll1), Ol0iOOO0.I000lI(o1ooIo101ll, IOo1Oilol.I0000Il00O), j, iloI0lOlll1, 384, 0);
/* 279 */                       iloI0lOlll1.I0010I0i(false);
/* 282 */                       z = true;
                            } else {
/* 285 */                       o1ooiI111i3 = o1ooiI111i4;
/* 289 */                       iloI0lOlll1.I00i01iIIliI(1963738891);
/* 297 */                       ModelDownloadStatusType modelDownloadStatusType = o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null;
/* 308 */                       int i5 = modelDownloadStatusType == null ? -1 : OlO1oIol1.I00000oIO[modelDownloadStatusType.ordinal()];
/* 310 */                       if (i5 == 1) {
/* 1356 */                          iloI0lOlll1.I00i01iIIliI(1963791188);
/* 1359 */                          iloI0lOlll1.I0010I0i(false);
                                } else if (i5 == 2) {
/* 1320 */                          iloI0lOlll1.I00i01iIIliI(1963858427);
/* 1346 */                          IoOoiI1II00i.I00000oIO(iOlO1Ol0li.I00000oIO(), lOOoli.I00000oOI(R.string.cd_downloaded_icon, iloI0lOlll1), Ol0iOOO0.I000lI(o1ooIo101ll, IOo1Oilol.I0000Il00O), j, iloI0lOlll1, 384, 0);
/* 1349 */                          iloI0lOlll1.I0010I0i(false);
                                } else if (i5 == 3) {
/* 1272 */                          iloI0lOlll1.I00i01iIIliI(1964139535);
/* 1310 */                          IoOoiI1II00i.I00000oIO(ilIOIIl.I00000oIO(), lOOoli.I00000oOI(R.string.cd_download_failed_icon, iloI0lOlll1), Ol0iOOO0.I000lI(o1ooIo101ll, IOo1Oilol.I0000Il00O), iiO01ll11o1l.I0000Il00O(4289331200L), iloI0lOlll1, 3456, 0);
/* 1313 */                          iloI0lOlll1.I0010I0i(false);
                                } else if (i5 != 4) {
/* 323 */                           iloI0lOlll1.I00i01iIIliI(1964631412);
/* 326 */                           iloI0lOlll1.I0010I0i(false);
                                } else {
/* 334 */                           iloI0lOlll1.I00i01iIIliI(-767915409);
/* 337 */                           IoiOolO1iOo ioiOolO1iOoI0000O = il1lO0liOi.I00000oIO;
/* 339 */                           if (ioiOolO1iOoI0000O == null) {
/* 363 */                               IoiOo1iI ioiOo1iI = new IoiOo1iI("Rounded.Downloading", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
/* 368 */                               int i6 = Ooo1iOO.I00000oIO;
/* 374 */                               OlI00IIlOO olI00IIlOO = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 383 */                               OO0Ii1 oO0Ii1I000II = IIl001iO0Io.I000II(17.33f, 3.55f);
/* 405 */                               oO0Ii1I000II.I0000oI00(-0.94f, -0.6f, -1.99f, -1.04f, -3.12f, -1.3f);
/* 424 */                               oO0Ii1I000II.I0000O(13.59f, 2.11f, 13.0f, 2.59f, 13.0f, 3.23f);
/* 430 */                               oO0Ii1I000II.I000oI1ioi(0.0f);
/* 450 */                               oO0Ii1I000II.I0000oI00(0.0f, 0.45f, 0.3f, 0.87f, 0.74f, 0.97f);
/* 471 */                               oO0Ii1I000II.I0000oI00(0.91f, 0.2f, 1.77f, 0.56f, 2.53f, 1.05f);
/* 491 */                               oO0Ii1I000II.I0000oI00(0.39f, 0.25f, 0.89f, 0.17f, 1.22f, -0.16f);
/* 494 */                               oO0Ii1I000II.I000OOo1O(0.0f, 0.0f);
/* 515 */                               oO0Ii1I000II.I0000O(17.94f, 4.64f, 17.87f, 3.89f, 17.33f, 3.55f);
/* 523 */                               IIl001iO0Io.I001i1O0Ol(oO0Ii1I000II, 20.77f, 11.0f, 20.77f, 11.0f);
/* 543 */                               oO0Ii1I000II.I0000oI00(0.64f, 0.0f, 1.13f, -0.59f, 0.98f, -1.21f);
/* 564 */                               oO0Ii1I000II.I0000oI00(-0.26f, -1.12f, -0.7f, -2.17f, -1.3f, -3.12f);
/* 585 */                               oO0Ii1I000II.I0000oI00(-0.34f, -0.54f, -1.1f, -0.61f, -1.55f, -0.16f);
/* 589 */                               oO0Ii1I000II.I000OOo1O(0.0f, 0.0f);
/* 610 */                               oO0Ii1I000II.I0000oI00(-0.32f, 0.32f, -0.4f, 0.83f, -0.16f, 1.22f);
/* 631 */                               oO0Ii1I000II.I0000oI00(0.49f, 0.77f, 0.85f, 1.62f, 1.05f, 2.53f);
/* 650 */                               oO0Ii1I000II.I0000O(19.9f, 10.7f, 20.31f, 11.0f, 20.77f, 11.0f);
/* 659 */                               IIl001iO0Io.I001i1O0Ol(oO0Ii1I000II, 18.9f, 17.49f, 18.9f, 17.49f);
/* 680 */                               oO0Ii1I000II.I0000oI00(0.45f, 0.45f, 1.21f, 0.38f, 1.55f, -0.15f);
/* 701 */                               oO0Ii1I000II.I0000oI00(0.6f, -0.94f, 1.04f, -1.99f, 1.3f, -3.11f);
/* 722 */                               oO0Ii1I000II.I0000oI00(0.14f, -0.62f, -0.35f, -1.21f, -0.98f, -1.21f);
/* 726 */                               oO0Ii1I000II.I000II(0.0f);
/* 746 */                               oO0Ii1I000II.I0000oI00(-0.45f, 0.0f, -0.87f, 0.3f, -0.97f, 0.74f);
/* 767 */                               oO0Ii1I000II.I0000oI00(-0.2f, 0.91f, -0.57f, 1.76f, -1.05f, 2.53f);
/* 787 */                               oO0Ii1I000II.I0000O(18.5f, 16.66f, 18.58f, 17.17f, 18.9f, 17.49f);
/* 795 */                               IIl001iO0Io.I001i1O0Ol(oO0Ii1I000II, 13.0f, 20.77f, 13.0f, 20.77f);
/* 815 */                               oO0Ii1I000II.I0000oI00(0.0f, 0.64f, 0.59f, 1.13f, 1.21f, 0.98f);
/* 836 */                               oO0Ii1I000II.I0000oI00(1.12f, -0.26f, 2.17f, -0.7f, 3.11f, -1.3f);
/* 857 */                               oO0Ii1I000II.I0000oI00(0.54f, -0.34f, 0.61f, -1.1f, 0.16f, -1.55f);
/* 861 */                               oO0Ii1I000II.I000OOo1O(0.0f, 0.0f);
/* 882 */                               oO0Ii1I000II.I0000oI00(-0.32f, -0.32f, -0.83f, -0.4f, -1.21f, -0.15f);
/* 903 */                               oO0Ii1I000II.I0000oI00(-0.76f, 0.49f, -1.61f, 0.85f, -2.53f, 1.05f);
/* 922 */                               oO0Ii1I000II.I0000O(13.3f, 19.9f, 13.0f, 20.31f, 13.0f, 20.77f);
/* 925 */                               oO0Ii1I000II.I0000Il00O();
/* 932 */                               oO0Ii1I000II.I000OiO(13.0f, 12.0f);
/* 937 */                               oO0Ii1I000II.I000o00OoI0I(8.0f);
/* 954 */                               oO0Ii1I000II.I0000oI00(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
/* 958 */                               oO0Ii1I000II.I000II(0.0f);
/* 973 */                               oO0Ii1I000II.I0000oI00(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
/* 978 */                               oO0Ii1I000II.I000oI1ioi(4.0f);
/* 984 */                               oO0Ii1I000II.I0001Ioi1lo(9.41f);
/* 1002 */                              oO0Ii1I000II.I0000oI00(-0.89f, 0.0f, -1.34f, 1.08f, -0.71f, 1.71f);
/* 1008 */                              oO0Ii1I000II.I000OOo1O(2.59f, 2.59f);
/* 1028 */                              oO0Ii1I000II.I0000oI00(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
/* 1037 */                              oO0Ii1I000II.I000OOo1O(2.59f, -2.59f);
/* 1058 */                              oO0Ii1I000II.I0000oI00(0.63f, -0.63f, 0.18f, -1.71f, -0.71f, -1.71f);
/* 1063 */                              oO0Ii1I000II.I0001Ioi1lo(13.0f);
/* 1066 */                              oO0Ii1I000II.I0000Il00O();
/* 1074 */                              oO0Ii1I000II.I000OiO(11.0f, 20.77f);
/* 1077 */                              oO0Ii1I000II.I000O01llI0(11.0f, 20.77f);
/* 1097 */                              oO0Ii1I000II.I0000oI00(0.0f, 0.64f, -0.59f, 1.13f, -1.21f, 0.99f);
/* 1114 */                              oO0Ii1I000II.I0000O(5.33f, 20.75f, 2.0f, 16.77f, 2.0f, 12.0f);
/* 1127 */                              oO0Ii1I000II.I000lI(3.33f, -8.75f, 7.79f, -9.75f);
/* 1146 */                              oO0Ii1I000II.I0000O(10.41f, 2.11f, 11.0f, 2.59f, 11.0f, 3.23f);
/* 1150 */                              oO0Ii1I000II.I000oI1ioi(0.0f);
/* 1170 */                              oO0Ii1I000II.I0000oI00(0.0f, 0.46f, -0.31f, 0.87f, -0.76f, 0.97f);
/* 1187 */                              oO0Ii1I000II.I0000O(6.67f, 5.0f, 4.0f, 8.19f, 4.0f, 12.0f);
/* 1201 */                              oO0Ii1I000II.I000lI(2.67f, 7.0f, 6.24f, 7.8f);
/* 1220 */                              oO0Ii1I000II.I0000O(10.69f, 19.9f, 11.0f, 20.31f, 11.0f, 20.77f);
/* 1223 */                              oO0Ii1I000II.I0000Il00O();
/* 1228 */                              IoiOo1iI.I00000oOI(ioiOo1iI, oO0Ii1I000II.I00000oIO, 0, olI00IIlOO);
/* 1231 */                              ioiOolO1iOoI0000O = ioiOo1iI.I0000O();
/* 1235 */                              il1lO0liOi.I00000oIO = ioiOolO1iOoI0000O;
                                    }
/* 1262 */                          IoOoiI1II00i.I00000oIO(ioiOolO1iOoI0000O, lOOoli.I00000oOI(R.string.cd_downloading_icon, iloI0lOlll1), Ol0iOOO0.I000lI(o1ooIo101ll, IOo1Oilol.I0000Il00O), 0L, iloI0lOlll1, 384, 8);
/* 1265 */                          iloI0lOlll1.I0010I0i(false);
                                }
/* 1362 */                      iloI0lOlll1.I0010I0i(false);
/* 1365 */                      z = true;
                            }
/* 1366 */                  iloI0lOlll1.I0010I0i(z);
                        }
/* 1374 */              oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 1378 */              if (oOloioIlI001IO000 == null) {
/* 1383 */                  I0oliIo i0oliIo = new I0oliIo(4);
/* 1386 */                  i0oliIo.I00iio = oloIl1l1oOii;
/* 1388 */                  i0oliIo.I00ilI0I1 = o1oIOiI11o0;
/* 1390 */                  i0oliIo.I00ilO0 = o1oIo0iI00;
/* 1392 */                  i0oliIo.I00io1l = o1ooiI111i3;
/* 1394 */                  i0oliIo.I00iiI = i;
/* 1396 */                  i0oliIo.I00iiO = i2;
/* 1398 */                  VarHandle.storeStoreFence();
/* 1401 */                  oOloioIlI001IO000.I0000O = i0oliIo;
/* 2665 */                  return;
                        }
/* 2665 */              return;
                    }
/* 72 */            i3 |= 3072;
/* 74 */            o1ooiI111i2 = o1ooiI111i;
/* 111 */           if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) == 1170)) {
                    }
/* 1374 */          oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 1378 */          if (oOloioIlI001IO000 == null) {
                    }
                }
            }
