            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.util.Log;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.WorkProgress;
            import androidx.work.impl.model.WorkSpec;
            import androidx.work.impl.model.WorkSpecDao;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.UUID;
            import kotlin.jvm.functions.Function1;
            
            public final class O1oiilO implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public O1oiilO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:88:0x0252  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() throws Exception {
                    OOo0IO oOo0IOI00000oIO;
                    OOo0IO oOo0IOI00000oIO2;
                    int i;
                    boolean z;
/* 6 */             int i2 = 1;
/* 8 */             Object[] objArr = 0;
/* 8 */             Object[] objArr2 = 0;
/* 8 */             Object[] objArr3 = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 1554 */                  O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iiI;
/* 1558 */                  O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiO;
/* 1562 */                  IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iio;
/* 1564 */                  o1oIOiI11o0.I00IlilI0i0i = null;
/* 1566 */                  o1oIOiI11o0.I00Io1lO = false;
/* 1572 */                  o1ol100o0O.I00IoO0(o1oIOiI11o0, O1oOl0.I00iOIl, "");
/* 1575 */                  illOOo00lI.invoke();
/* 1578 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 1530 */                  String str = (String) this.I00iiI;
/* 1534 */                  String str2 = (String) this.I00iiO;
/* 1538 */                  Function1 function1 = (Function1) this.I00iio;
/* 1544 */                  if (!str.equals(str2)) {
/* 1546 */                      function1.invoke(str2);
                            }
/* 1549 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 1507 */                  O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00iiI;
/* 1511 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 1515 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iio;
/* 1517 */                  oI10i0Il.setValue(o1oIOiI11o02);
/* 1522 */                  oI10i0Il2.setValue(Boolean.TRUE);
/* 1525 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 1471 */                  ArrayList arrayList = (ArrayList) this.I00iiI;
/* 1475 */                  OiO1O1lil10 oiO1O1lil10 = (OiO1O1lil10) this.I00iiO;
/* 1479 */                  IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00iio;
/* 1493 */                  int size = arrayList.size() - oiO1O1lil10.I00000oIO().size();
/* 1494 */                  for (int i3 = 0; i3 < size; i3++) {
/* 1496 */                      illOOo00lI2.invoke();
                            }
/* 1502 */                  return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 1354 */                  Function1 function12 = (Function1) this.I00iiI;
/* 1358 */                  OIIlIII0Ili oIIlIII0Ili = (OIIlIII0Ili) this.I00iiO;
/* 1362 */                  OOo0l0ii10l oOo0l0ii10l = (OOo0l0ii10l) this.I00iio;
/* 1364 */                  OOo0IO oOo0IO = OOo0IO.I0000oI00;
/* 1366 */                  Oi11lOiIoi oi11lOiIoi = OIIlIII0Ili.I011IO1I11OI;
/* 1368 */                  function12.invoke(oi11lOiIoi);
/* 1375 */                  boolean zI0000O = O0000Ioio00.I0000O(oIIlIII0Ili.I010iIIOlo, oi11lOiIoi.I00o0iI0io1);
/* 1383 */                  Object[] objArr4 = oIIlIII0Ili.I010l10O != oi11lOiIoi.I00o0l1o1o0 ? 1 : null;
/* 1394 */                  l1lOoiII1l l1looiii1lI00000oIO = oi11lOiIoi.I00o0iI0io1.I00000oIO(oi11lOiIoi.I00oI0i, oi11lOiIoi.I00oO101o, oi11lOiIoi.I00oIiI10);
/* 1398 */                  oi11lOiIoi.I00olI = l1looiii1lI00000oIO;
/* 1400 */                  OOo0IO oOo0IO2 = oIIlIII0Ili.I010ioo;
/* 1402 */                  if (l1looiii1lI00000oIO == null || (oOo0IOI00000oIO = l1looiii1lI00000oIO.I00000oIO()) == null) {
/* 1410 */                      oOo0IOI00000oIO = oOo0IO;
                            }
/* 1411 */                  boolean zI0000O2 = O0000Ioio00.I0000O(oOo0IO2, oOo0IOI00000oIO);
/* 1417 */                  oOo0l0ii10l.I00iOIl = !zI0000O2;
/* 1419 */                  if (!zI0000O || objArr4 != null || !zI0000O2) {
/* 1427 */                      oIIlIII0Ili.I010iIIOlo = oi11lOiIoi.I00o0iI0io1;
/* 1431 */                      oIIlIII0Ili.I010l10O = oi11lOiIoi.I00o0l1o1o0;
/* 1433 */                      l1lOoiII1l l1looiii1l = oi11lOiIoi.I00olI;
/* 1435 */                      if (l1looiii1l != null && (oOo0IOI00000oIO2 = l1looiii1l.I00000oIO()) != null) {
/* 1444 */                          oOo0IO = oOo0IOI00000oIO2;
                                }
/* 1445 */                      oIIlIII0Ili.I010ioo = oOo0IO;
/* 1449 */                      if (oIIlIII0Ili.I010l1O && (objArr4 != null || (oIIlIII0Ili.I010l10O && !zI0000O))) {
/* 1461 */                          oIIlIII0Ili.I00oO101o.I00IioO0OiOi();
                                }
                            }
/* 1464 */                  oIIlIII0Ili.I010l1O = true;
/* 1466 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 1250 */                  Ilo1iIi1OI01 ilo1iIi1OI01 = (Ilo1iIi1OI01) this.I00iiI;
/* 1254 */                  Ol11il011o0 ol11il011o0 = (Ol11il011o0) this.I00iiO;
/* 1258 */                  OIiOolI1lio oIiOolI1lio = (OIiOolI1lio) this.I00iio;
/* 1260 */                  if (ilo1iIi1OI01 != null) {
/* 1269 */                      ol11il011o0.I00000oIO(ol11il011o0.I0000Il00O(ilo1iIi1OI01) - ol11il011o0.I00111O);
                            }
/* 1274 */                  List listI00000oIO = iilI1OO1.I00000oIO(ol11il011o0, null, ol11il011o0.I00111O, null);
/* 1282 */                  IOl0o1 iOl0o1 = (IOl0o1) IOOi0Ool1i.I00IoIO0lI(listI00000oIO);
/* 1289 */                  Integer num = iOl0o1 != null ? iOl0o1.I00000oOI : null;
/* 1290 */                  List listI000l1 = oIiOolI1lio.I000l1(num);
/* 1294 */                  if (num != null && !listI000l1.isEmpty()) {
/* 1330 */                      listI000l1 = IOOi0Ool1i.I00O10llo(Collections.singletonList(new IOl0o1(((IOl0o1) IOOi0Ool1i.I001lllioOl(listI000l1)).I00000oIO, null, num)), IOOi0Ool1i.I001iOo1i0O(listI000l1, 1));
                            }
/* 1348 */                  return new IOl0l1Io(IOOi0Ool1i.I00O10llo(listI00000oIO, listI000l1), oIiOolI1lio.I00111O());
                        case 6:
/* 1242 */                  iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new O1iIlllIoo((IOO0IOIll) this.I00iiO, (OlO01l1oOil) this.I00iio, objArr == true ? 1 : 0, 11), 3);
/* 1245 */                  return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 1196 */                  Ili1iIl ili1iIl = (Ili1iIl) this.I00iiI;
/* 1200 */                  Function1 function13 = (Function1) this.I00iiO;
/* 1204 */                  OlO01l1oOil olO01l1oOil = (OlO01l1oOil) this.I00iio;
/* 1206 */                  Ili1iIl.I00000oIO(ili1iIl);
/* 1217 */                  function13.invoke(((I1111OO10i) olO01l1oOil.getValue()).I00iiI);
/* 1220 */                  return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 1075 */                  O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 1079 */                  I1Oo1iio0 i1Oo1iio0 = (I1Oo1iio0) this.I00iiI;
/* 1085 */                  long j = ((II1olOOOiIO) this.I00iiO).I00000oOI;
/* 1089 */                  IiIooOOOI iiIooOOOI = (IiIooOOOI) this.I00iio;
/* 1099 */                  OIoOo11 oIoOo11I00000oIO = ((I1Oo0lO0) i1Oo1iio0.I00o0l1o1o0.getValue()).I00000oIO();
/* 1109 */                  Ol0i1I ol0i1II00000oIO = oIoOo11I00000oIO != null ? Ol0i1I.I00000oIO(oIoOo11I00000oIO.I000OOo1O()) : null;
/* 1113 */                  if (ol0i1II00000oIO != null) {
/* 1115 */                      long j2 = ol0i1II00000oIO.I00000oIO;
/* 1124 */                      if (j2 != 9205357640488583168L && Ol0i1I.I0000oI00(j2) != Float.POSITIVE_INFINITY && Ol0i1I.I0000Il00O(j2) != Float.POSITIVE_INFINITY) {
/* 1146 */                          float fI0000oI00 = Ol0i1I.I0000oI00(j2);
/* 1150 */                          float fI0000Il00O = Ol0i1I.I0000Il00O(j2);
/* 1170 */                          float fI000OiO = fI0000oI00 > ((float) IOo0oO11ll1O.I000OiO(j)) ? IOo0oO11ll1O.I000OiO(j) / fI0000oI00 : 1.0f;
/* 1182 */                          return Ol0iOOO0.I000o00OoI0I(o1ooIo101ll, iiIooOOOI.I00OIO1(fI0000oI00 * fI000OiO), iiIooOOOI.I00OIO1(fI0000Il00O * fI000OiO));
                                }
                            }
/* 1189 */                  return Ol0iOOO0.I000lI(o1ooIo101ll, 64.0f);
                        case 9:
/* 1069 */                  iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, null, new O1iIlllIoo((String) this.I00iiO, (IOO0IOIll) this.I00iio, objArr2 == true ? 1 : 0, 19), 3);
/* 1072 */                  return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 1008 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiI;
/* 1012 */                  IO0l1oi1O1 iO0l1oi1O1 = (IO0l1oi1O1) this.I00iiO;
/* 1016 */                  Context context = (Context) this.I00iio;
/* 1018 */                  oI10i0Il3.setValue(iO0l1oi1O1);
/* 1023 */                  Oo0oii.I0000O.setValue(iO0l1oi1O1);
/* 1044 */                  context.getSharedPreferences("box_settings", 0).edit().putString("catppuccin_accent", iO0l1oi1O1.I00iiI).apply();
/* 1047 */                  return OoiIlOl1iI.I00000oIO;
                        case 11:
/* 964 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiI;
/* 968 */                   Ii0l1lo ii0l1lo = (Ii0l1lo) this.I00iiO;
/* 972 */                   Context context2 = (Context) this.I00iio;
/* 974 */                   oI10i0Il4.setValue(ii0l1lo);
/* 979 */                   Oo0oii.I00000oOI.setValue(ii0l1lo);
/* 1000 */                  context2.getSharedPreferences("box_settings", 0).edit().putString("custom_theme", ii0l1lo.I00iOIl).apply();
/* 1003 */                  return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 920 */                   OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iiI;
/* 924 */                   Iil1l0lo1lOo iil1l0lo1lOo = (Iil1l0lo1lOo) this.I00iiO;
/* 928 */                   Context context3 = (Context) this.I00iio;
/* 930 */                   oI10i0Il5.setValue(iil1l0lo1lOo);
/* 935 */                   Oo0oii.I0000oI00.setValue(iil1l0lo1lOo);
/* 956 */                   context3.getSharedPreferences("box_settings", 0).edit().putString("dracula_accent", iil1l0lo1lOo.I00iiI).apply();
/* 959 */                   return OoiIlOl1iI.I00000oIO;
                        case 13:
/* 876 */                   OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iiI;
/* 880 */                   IO0liII0O iO0liII0O = (IO0liII0O) this.I00iiO;
/* 884 */                   Context context4 = (Context) this.I00iio;
/* 886 */                   oI10i0Il6.setValue(iO0liII0O);
/* 891 */                   Oo0oii.I0000Il00O.setValue(iO0liII0O);
/* 912 */                   context4.getSharedPreferences("box_settings", 0).edit().putString("catppuccin_flavor", iO0liII0O.I00iiI).apply();
/* 915 */                   return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 843 */                   Ii0110 ii0110 = (Ii0110) this.I00iiI;
/* 847 */                   OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00iiO;
/* 851 */                   OI10i0Il oI10i0Il8 = (OI10i0Il) this.I00iio;
/* 855 */                   oI10i0Il7.setValue(Boolean.TRUE);
/* 858 */                   oI10i0Il8.setValue(null);
/* 868 */                   iOi1II01i0.I0000O(ii0110, null, null, new OO11OilO(oI10i0Il8, oI10i0Il7, objArr3 == true ? 1 : 0, 13), 3);
/* 871 */                   return OoiIlOl1iI.I00000oIO;
                        case 15:
/* 835 */                   ((Function1) this.I00iiI).invoke(Boolean.valueOf(!O0000Ioio00.I0000O(((OOo0ooi) this.I00iiO).I00iOIl, ((Ol0o1OiOIIIl) this.I00iio).I000iOII())));
/* 838 */                   return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 770 */                   OI10i0Il oI10i0Il9 = (OI10i0Il) this.I00iiI;
/* 774 */                   OI10i0Il oI10i0Il10 = (OI10i0Il) this.I00iiO;
/* 778 */                   OI10i0Il oI10i0Il11 = (OI10i0Il) this.I00iio;
/* 784 */                   I0O1io1lOO i0O1io1lOO = (I0O1io1lOO) oI10i0Il9.getValue();
/* 786 */                   if (i0O1io1lOO != null && i0O1io1lOO == I0O1io1lOO.I00iiI) {
/* 794 */                       oI10i0Il10.setValue(Boolean.TRUE);
                            }
/* 799 */                   oI10i0Il11.setValue(Boolean.FALSE);
/* 802 */                   oI10i0Il9.setValue(null);
/* 805 */                   return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 713 */                   Function1 function14 = (Function1) this.I00iiI;
/* 717 */                   I0O1io1100 i0O1io1100 = (I0O1io1100) this.I00iiO;
/* 721 */                   IllOOo00lI illOOo00lI3 = (IllOOo00lI) this.I00iio;
/* 723 */                   function14.invoke(i0O1io1100);
/* 726 */                   FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 730 */                   if (firebaseAnalyticsI00000oIO != null) {
/* 732 */                       Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 738 */                       Bundle bundle = new Bundle();
/* 745 */                       bundle.putString("event_type", "agent_skills_add_skill");
/* 756 */                       bundle.putString("button_id", i0O1io1100.I00000oIO.toString());
/* 759 */                       firebaseAnalyticsI00000oIO.I00000oIO("button_clicked", bundle);
                            }
/* 762 */                   illOOo00lI3.invoke();
/* 765 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_PINKY:
/* 691 */                   Ii0110 ii01102 = (Ii0110) this.I00iiI;
/* 695 */                   O0o0I1i0O o0o0I1i0O = (O0o0I1i0O) this.I00iiO;
/* 699 */                   OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iio;
/* 701 */                   Ol0lllilO0Ol.I0001Ioi1lo(ii01102, o0o0I1i0O);
/* 705 */                   oIooi1iOiOol.I000O01llI0(-1);
/* 708 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 668 */                   Function1 function15 = (Function1) this.I00iiI;
/* 672 */                   OoI1lOl ooI1lOl = (OoI1lOl) this.I00iiO;
/* 680 */                   ((OI10i0Il) this.I00iio).setValue(Boolean.FALSE);
/* 683 */                   function15.invoke(ooI1lOl);
/* 686 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 556 */                   Oilo101I11l0 oilo101I11l0 = (Oilo101I11l0) this.I00iiI;
/* 561 */                   IIlioOio1 iIlioOio1 = (IIlioOio1) this.I00iiO;
/* 566 */                   Io101ll1ol io101ll1ol = (Io101ll1ol) this.I00iio;
/* 592 */                   OillooOlI oillooOlI = ((Oilloi0llol1) oilo101I11l0.I0000oI00.getValue()).I0000Il00O() ? (OillooOlI) oilo101I11l0.I0001Ioi1lo.getValue() : null;
/* 593 */                   if (oillooOlI != null) {
/* 597 */                       int i4 = oillooOlI.I000O01llI0;
/* 599 */                       if (i4 == 1) {
/* 601 */                           i = 1;
                                } else if (i4 == 0) {
/* 595 */                           i = 0;
                                } else {
/* 606 */                           if (i4 == 0 || i4 == 1) {
/* 657 */                               Log.e("CXCP", "Custom operating mode " + i4 + " conflicts with standard modes");
/* 662 */                               I000II.I000iOII("kotlin.Unit");
/* 8 */                                 return null;
                                    }
/* 610 */                           i = i4;
                                }
                            }
/* 631 */                   return iIlioOio1.I00000oIO(i, oillooOlI, false, io101ll1ol, null, (Map) oilo101I11l0.I0000Il00O.getValue(), (Map) oilo101I11l0.I0000O.getValue());
                        case PoseLandmark.LEFT_THUMB:
/* 529 */                   I0100o111I i0100o111I = (I0100o111I) this.I00iiI;
/* 533 */                   I0oIl0io0II1 i0oIl0io0II1 = (I0oIl0io0II1) this.I00iiO;
/* 537 */                   OoOil11Ol1o ooOil11Ol1o = (OoOil11Ol1o) this.I00iio;
/* 539 */                   i0100o111I.removeOnAttachStateChangeListener(i0oIl0io0II1);
/* 548 */                   lI1o0o0.I00000oIO(i0100o111I).I00000oIO.remove(ooOil11Ol1o);
/* 551 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_THUMB:
/* 493 */                   O1OIi1 o1OIi1 = (O1OIi1) this.I00iiI;
/* 497 */                   i001ll1 i001ll1Var = (i001ll1) this.I00iiO;
/* 513 */                   if (((Boolean) ((OI10i0Il) this.I00iio).getValue()).booleanValue()) {
/* 521 */                       i001ll1Var.I0001Ioi1lo();
                            } else {
/* 517 */                       o1OIi1.I00000oIO("android.permission.RECORD_AUDIO");
                            }
/* 524 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 370 */                   i01O1I0 i01o1i0 = (i01O1I0) this.I00iiI;
/* 374 */                   UUID uuid = (UUID) this.I00iiO;
/* 378 */                   Ii11I1OOII1 ii11I1OOII1 = (Ii11I1OOII1) this.I00iio;
/* 380 */                   String str3 = i01O1I0.I00iiO;
/* 384 */                   String string = uuid.toString();
/* 388 */                   IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 392 */                   uuid.toString();
/* 395 */                   Objects.toString(ii11I1OOII1);
/* 398 */                   iIi0oIlI000II.getClass();
/* 401 */                   WorkDatabase workDatabase = i01o1i0.I00iOIl;
/* 403 */                   workDatabase.I00000oOI();
                            try {
/* 410 */                       WorkSpec workSpec = workDatabase.I001lIiIIo1O().getWorkSpec(string);
/* 414 */                       if (workSpec == null) {
/* 475 */                           throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                                }
/* 420 */                       if (workSpec.state == i01IOiO1lO.I00iiI) {
/* 431 */                           workDatabase.I001l0I00().insert(new WorkProgress(string, ii11I1OOII1));
                                } else {
/* 458 */                           IIi0oIl.I000II().I000l1(str3, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                                }
/* 461 */                       workDatabase.I0010o();
/* 8 */                         return null;
                            } catch (Throwable th) {
                                try {
/* 482 */                           IIi0oIl.I000II().I0001Ioi1lo(str3, "Error updating Worker progress", th);
/* 485 */                           throw th;
                                } finally {
/* 487 */                           workDatabase.I000lI();
                                }
                            }
                        default:
/* 15 */                    i01IlOO i01iloo = (i01IlOO) this.I00iiI;
/* 20 */                    String str4 = (String) this.I00iiO;
/* 24 */                    i01OOII i01ooii = (i01OOII) this.I00iio;
/* 26 */                    OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 30 */                    WorkSpecDao workSpecDaoI001lIiIIo1O = i01iloo.I0000Il00O.I001lIiIIo1O();
/* 34 */                    List<i01Oil0> workSpecIdAndStatesForName = workSpecDaoI001lIiIIo1O.getWorkSpecIdAndStatesForName(str4);
/* 42 */                    if (workSpecIdAndStatesForName.size() > 1) {
/* 364 */                       OoOil11Ol1o.I000OiO("Can't apply UPDATE policy to the chains of work.");
/* 8 */                         return null;
                            }
/* 48 */                    i01Oil0 i01oil0 = (i01Oil0) IOOi0Ool1i.I00II0Ol1O0l(workSpecIdAndStatesForName);
/* 50 */                    if (i01oil0 == null) {
/* 64 */                        Il0Olo.I00000oIO(new i01I0IOOI10(i01iloo, str4, Il1OO1ilo0o1.I00iiI, Collections.singletonList(i01ooii), null));
                            } else {
/* 70 */                        String str5 = i01oil0.I00000oIO;
/* 72 */                        WorkSpec workSpec2 = workSpecDaoI001lIiIIo1O.getWorkSpec(str5);
/* 76 */                        if (workSpec2 == null) {
/* 358 */                           I000II.I001IO000(Oi010OO0.I001IO000("WorkSpec with ", str5, ", that matches a name \"", str4, "\", wasn't found"));
/* 8 */                             return null;
                                }
/* 82 */                        if (!workSpec2.isPeriodic()) {
/* 344 */                           OoOil11Ol1o.I000OiO("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
/* 8 */                             return null;
                                }
/* 88 */                        if (i01oil0.I00000oOI == i01IOiO1lO.I00ilO0) {
/* 90 */                            workSpecDaoI001lIiIIo1O.delete(str5);
/* 105 */                           Il0Olo.I00000oIO(new i01I0IOOI10(i01iloo, str4, Il1OO1ilo0o1.I00iiI, Collections.singletonList(i01ooii), null));
                                } else {
/* 161 */                           WorkSpec workSpecCopy$default = WorkSpec.copy$default(i01ooii.I00000oOI, i01oil0.I00000oIO, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554430, null);
/* 165 */                           OOIo1i0 oOIo1i0 = i01iloo.I0001Ioi1lo;
/* 167 */                           WorkDatabase workDatabase2 = i01iloo.I0000Il00O;
/* 169 */                           IOllii iOllii = i01iloo.I00000oOI;
/* 171 */                           List list = i01iloo.I0000oI00;
/* 173 */                           Set set = i01ooii.I0000Il00O;
/* 179 */                           String str6 = workSpecCopy$default.id;
/* 185 */                           WorkSpec workSpec3 = workDatabase2.I001lIiIIo1O().getWorkSpec(str6);
/* 189 */                           if (workSpec3 == null) {
/* 338 */                               I000II.I000iOII(IlIi0I0.I000lI("Worker with ", str6, " doesn't exist"));
/* 8 */                                 return null;
                                    }
/* 197 */                           if (workSpec3.state.I00000oIO()) {
/* 199 */                               i01IioIOl0l0[] i01iioiol0l0Arr = i01IioIOl0l0.I00iOIl;
                                    } else {
/* 212 */                               if (workSpec3.isPeriodic() ^ workSpecCopy$default.isPeriodic()) {
/* 293 */                                   StringBuilder sb = new StringBuilder("Can't update ");
/* 305 */                                   sb.append(workSpec3.isPeriodic() ? "Periodic" : "OneTime");
/* 310 */                                   sb.append(" Worker to ");
/* 329 */                                   throw new UnsupportedOperationException(IIl001iO0Io.I00100l0(sb, workSpecCopy$default.isPeriodic() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
                                        }
                                        synchronized (oOIo1i0.I000iOII) {
/* 221 */                                   z = oOIo1i0.I0000Il00O(str6) != null;
                                        }
/* 225 */                               if (!z) {
/* 230 */                                   Iterator it = list.iterator();
/* 238 */                                   while (it.hasNext()) {
/* 246 */                                       ((OiOI1oIoooI) it.next()).I0000oI00(str6);
                                            }
                                        }
/* 252 */                               I1oli1o0I1O0 i1oli1o0I1O0 = new I1oli1o0I1O0(i2);
/* 255 */                               i1oli1o0I1O0.I00iio = workDatabase2;
/* 257 */                               i1oli1o0I1O0.I00ilI0I1 = workSpec3;
/* 259 */                               i1oli1o0I1O0.I00ilO0 = workSpecCopy$default;
/* 261 */                               i1oli1o0I1O0.I00iiI = list;
/* 263 */                               i1oli1o0I1O0.I00io1l = str6;
/* 265 */                               i1oli1o0I1O0.I00ioIO = set;
/* 267 */                               i1oli1o0I1O0.I00iiO = z;
/* 269 */                               VarHandle.storeStoreFence();
/* 272 */                               workDatabase2.I0010I0i(i1oli1o0I1O0);
/* 275 */                               if (!z) {
/* 277 */                                   OiOIOI.I00000oOI(iOllii, workDatabase2, list);
                                        }
/* 280 */                               i01IioIOl0l0[] i01iioiol0l0Arr2 = i01IioIOl0l0.I00iOIl;
                                    }
                                }
                            }
/* 67 */                    return ooiIlOl1iI;
                    }
                }
            }
