            package p000;

            import android.graphics.Bitmap;
            import android.view.Choreographer;
            import android.view.InputDevice;
            import android.view.KeyEvent;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class I01i01OoI implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public I01i01OoI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:274:0x06bd  */
                /* JADX WARN: Type inference failed for: r10v5, types: [O0lIIOllO] */
                /* JADX WARN: Type inference failed for: r10v6 */
                /* JADX WARN: Type inference failed for: r10v8, types: [O0lIIloIool] */
                /* JADX WARN: Type inference failed for: r10v9, types: [O0lI1l0I, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v37, types: [I1ooIoloo0] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    O00olOO0 o00olOO0;
                    OIOOl1i101lO oIOOl1i101lO;
                    OOo010ill oOo010ill;
                    long j;
                    Oi00IilOloo0 oi00IilOloo0I00000oIO;
                    OI000ilOol oI000ilOol;
                    String str;
                    Object value;
                    O1i1IIoO1IIl o1i1IIoO1IIl;
                    ArrayList arrayList;
/* 11 */            int i = 5;
/* 13 */            int i2 = 2;
/* 14 */            boolean z = false;
/* 14 */            zI000O01llI0 = false;
/* 14 */            zI000O01llI0 = false;
/* 14 */            zI000O01llI0 = false;
/* 14 */            zI000O01llI0 = false;
/* 14 */            zI000O01llI0 = false;
/* 14 */            boolean zI000O01llI0 = false;
/* 14 */            z = false;
/* 14 */            z = false;
/* 14 */            boolean z2 = false;
/* 14 */            boolean z3 = false;
/* 14 */            z = false;
/* 14 */            z = false;
/* 14 */            z = false;
/* 14 */            z = false;
/* 14 */            z = false;
/* 15 */            int i3 = 1;
/* 16 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 1693 */                  Ol0IO1iloi ol0IO1iloi = (Ol0IO1iloi) this.I00iiI;
/* 1695 */                  o01l1ioOo0 o01l1iooo0 = ol0IO1iloi.I0000Il00O;
/* 1701 */                  O0iIo0i1 o0iIo0i1 = ((I01i1I) this.I00iiO).I00000oIO;
/* 1705 */                  I111oOiIiO0 i111oOiIiO0 = (I111oOiIiO0) obj;
/* 1709 */                  if (i111oOiIiO0 instanceof O0l1OOlI0OiO) {
/* 1711 */                      Object obj2 = o01l1iooo0.I00iOIl;
/* 1718 */                      if (((O0l1OOlI0OiO) i111oOiIiO0).I000II || ol0IO1iloi.I0000O == I11I1111oi0.I00ilO0) {
/* 1798 */                          z = true;
                                } else if (o0iIo0i1 != null) {
/* 1730 */                          OI1Iio0ii1 oI1Iio0ii1 = O0i1lI0o1io.I0000oI00;
/* 1736 */                          IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ((O0iIl1) o0iIo0i1).I00iOIl().I00100o1O0lo();
/* 1740 */                          if (iOIiO1lIl0lI00100o1O0lo != null && O0i1lI0o1io.I0010I0i(iOIiO1lIl0lI00100o1O0lo) != null) {
/* 1748 */                              Object obj3 = o01l1iooo0.I00iOIl;
/* 1750 */                              LinkedHashMap linkedHashMap = I11II1o.I0000Il00O;
/* 1754 */                              Object objI0000Il00O = I11II1o.I0000Il00O(i111oOiIiO0, OlIllOO11lOl.I00111O);
/* 1758 */                              if (objI0000Il00O != null) {
/* 1761 */                                  ArrayList arrayListI00000oIO = I11II1o.I00000oIO(objI0000Il00O, false);
/* 1769 */                                  if (!arrayListI00000oIO.isEmpty()) {
/* 1772 */                                      Iterator it = arrayListI00000oIO.iterator();
/* 1780 */                                      while (it.hasNext()) {
/* 1794 */                                          if (O0000Ioio00.I0000O((String) it.next(), "TYPE")) {
/* 1796 */                                              Object obj4 = o01l1iooo0.I00iOIl;
/* 1798 */                                              z = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
/* 1799 */                  return Boolean.valueOf(z);
                        case 1:
/* 1650 */                  OoOIo1ioI0 ooOIo1ioI0 = (OoOIo1ioI0) this.I00iiI;
/* 1654 */                  O00olOO0[] o00olOO0Arr = (O00olOO0[]) this.I00iiO;
/* 1660 */                  int iIntValue = ((Number) obj).intValue();
                            return (ooOIo1ioI0 == null || (o00olOO0 = (O00olOO0) ooOIo1ioI0.I00000oIO.get(Integer.valueOf(iIntValue))) == null) ? (iIntValue < 0 || iIntValue >= o00olOO0Arr.length) ? O00olOO0.I0000oI00 : o00olOO0Arr[iIntValue] : o00olOO0;
                        case 2:
/* 1578 */                  IoloiIIo0l ioloiIIo0l = (IoloiIIo0l) this.I00iiI;
                            synchronized (ioloiIIo0l.I0000Il00O) {
                                try {
/* 1583 */                          ioloiIIo0l.I0000oI00 = true;
/* 1585 */                          OI110O0 oi110o0 = ioloiIIo0l.I0000O;
/* 1587 */                          Object[] objArr = oi110o0.I00iOIl;
/* 1589 */                          int i4 = oi110o0.I00iiO;
/* 1591 */                          for (int i5 = 0; i5 < i4; i5++) {
/* 1601 */                              OIOOiOOI0oOi oIOOiOOI0oOi = (OIOOiOOI0oOi) ((i000iilOi) objArr[i5]).get();
/* 1603 */                              if (oIOOiOOI0oOi != null && (oOo010ill = (oIOOl1i101lO = (OIOOl1i101lO) oIOOiOOI0oOi).I00000oOI) != null) {
/* 1611 */                                  oOo010ill.closeConnection();
/* 1614 */                                  oIOOl1i101lO.I00000oOI = null;
                                        }
                                    }
/* 1623 */                          ioloiIIo0l.I0000O.I000II();
                                } catch (Throwable th) {
/* 1647 */                          throw th;
                                }
                            }
/* 1631 */                  Oo0Oo0 oo0Oo0 = ((I0olOi00O) this.I00iiO).I00iiI;
/* 1635 */                  oo0Oo0.I00000oOI.set(null);
/* 1640 */                  oo0Oo0.I00000oIO.I0000O();
/* 1643 */                  return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 1551 */                  I101OO01 i101oo01 = (I101OO01) this.I00iiI;
/* 1555 */                  I101Ooio111 i101Ooio111 = (I101Ooio111) this.I00iiO;
                            synchronized (i101oo01.I00iio) {
/* 1562 */                      i101oo01.I00ilO0.remove(i101Ooio111);
                            }
/* 1566 */                  return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 1539 */                  ((Choreographer) ((I101iI1i) this.I00iiI).I00iiI).removeFrameCallback((I101Ooio111) this.I00iiO);
/* 1542 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 1508 */                  ((Bitmap) this.I00iiI).recycle();
/* 1517 */                  ((OiIOol0) this.I00iiO).resumeWith(Boolean.TRUE);
/* 1520 */                  return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 1471 */                  IIoOoIol0Io0 iIoOoIol0Io0 = (IIoOoIol0Io0) this.I00iiI;
/* 1475 */                  if (((OI00i0io0i) obj).I00iOIl == 0) {
/* 1479 */                      iIoOoIol0Io0.resumeWith(Boolean.TRUE);
                            } else {
/* 1485 */                      I1o1Ii0I i1o1Ii0I = (I1o1Ii0I) this.I00iiO;
/* 1494 */                      iOi1II01i0.I0000O(i1o1Ii0I.I00000oOI, null, null, new I1o10oiO(iIoOoIol0Io0, i1o1Ii0I, null), 3);
                            }
/* 1497 */                  return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 1440 */                  int iIntValue2 = ((Number) obj).intValue();
/* 1460 */                  return ((I000OiO) this.I00iiI).invoke(Integer.valueOf(iIntValue2), ((List) this.I00iiO).get(iIntValue2));
                        case 8:
/* 1404 */                  if (((Oll1lO) obj) == Oll1lO.I00iiI) {
/* 1408 */                      IO1OIo01l1 iO1OIo01l1 = (IO1OIo01l1) this.I00iiI;
/* 1412 */                      Conversation conversation = (Conversation) this.I00iiO;
/* 1414 */                      IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(iO1OIo01l1);
/* 1418 */                      IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 1427 */                      iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new IO1O10IIi(iO1OIo01l1, conversation, iOoil1iiIilo, i3), 2);
/* 1430 */                      z3 = true;
                            }
/* 1431 */                  return Boolean.valueOf(z3);
                        case 9:
/* 1359 */                  Oi11lOiIoi oi11lOiIoi = (Oi11lOiIoi) obj;
/* 1375 */                  oi11lOiIoi.I001lllioOl(((Number) ((OlO01l1oOil) this.I00iiI).getValue()).floatValue());
/* 1392 */                  oi11lOiIoi.I0000Il00O(((Number) ((OlO01l1oOil) this.I00iiO).getValue()).floatValue());
/* 1395 */                  return OoiIlOl1iI.I00000oIO;
                        case 10:
                            try {
/* 1351 */                      ((OOlioiIOOO1) this.I00iiI).I0000O();
                            } catch (Throwable unused) {
                            }
/* 1354 */                  return OoiIlOl1iI.I00000oIO;
                        case 11:
/* 1304 */                  KeyEvent keyEvent = ((O0O1l0ilO) obj).I00000oIO;
/* 1316 */                  if (((O0oIlOolIO) this.I00iiI).I00000oIO() == Io11Oo11oO.I00iiI && keyEvent.getKeyCode() == 4 && l0iloO.I00000oOI(keyEvent) == 1) {
/* 1334 */                      ((Oo0IOoOi01) this.I00iiO).I0000O(null);
/* 1337 */                      z2 = true;
                            }
/* 1338 */                  return Boolean.valueOf(z2);
                        case 12:
/* 1227 */                  iOliil ioliil = (iOliil) this.I00iiI;
/* 1232 */                  IiOlI10iOI iiOlI10iOI = (IiOlI10iOI) this.I00iiO;
/* 1234 */                  IiOili0lOO1 iiOili0lOO1 = iiOlI10iOI.I00ll1;
/* 1238 */                  OI1Iio0ii1 oI1Iio0ii12 = (OI1Iio0ii1) obj;
/* 1248 */                  OOOl0lIlIoil oOOl0lIlIoil = (OOOl0lIlIoil) ((LinkedHashMap) ioliil.I00iiI).get(oI1Iio0ii12);
/* 1250 */                  if (oOOl0lIlIoil == null) {
/* 16 */                        return null;
                            }
/* 1258 */                  O1I0OloI o1I0OloI = (O1I0OloI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I00000oIO;
/* 1262 */                  O1I0II11i o1I0II11i = (O1I0II11i) ioliil.I00iio;
/* 1272 */                  O1I0OloI o1I0OloI2 = (O1I0OloI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I00000oIO;
/* 1278 */                  I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(12);
/* 1281 */                  i01illiil1Oo.I00iiO = iiOlI10iOI;
/* 1283 */                  i01illiil1Oo.I00iiI = oOOl0lIlIoil;
/* 1285 */                  VarHandle.storeStoreFence();
/* 1295 */                  return Il0liOool0.I00oIiI10(o1I0OloI, iiOlI10iOI, oI1Iio0ii12, o1I0II11i, new IiOillIi(o1I0OloI2, i01illiil1Oo), OlI1o0ooI.I00IO1);
                        case 13:
/* 1193 */                  Ol1l0OoOo ol1l0OoOo = (Ol1l0OoOo) obj;
                            synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 1198 */                      j = Ol1l1lI1Ili.I0000oI00;
/* 1203 */                      Ol1l1lI1Ili.I0000oI00 = 1 + j;
                            }
/* 1218 */                  return new OI10OloOOoi(j, ol1l0OoOo, (Function1) this.I00iiI, (Function1) this.I00iiO);
                        case 14:
/* 1168 */                  I1ii1l10IO i1ii1l10IO = (I1ii1l10IO) this.I00iiI;
/* 1170 */                  Object obj5 = i1ii1l10IO.I00000oOI;
/* 1174 */                  IIoOoIol0Io0 iIoOoIol0Io02 = (IIoOoIol0Io0) this.I00iiO;
                            synchronized (obj5) {
/* 1181 */                      ((ArrayList) i1ii1l10IO.I0000Il00O).remove(iIoOoIol0Io02);
                            }
/* 1185 */                  return OoiIlOl1iI.I00000oIO;
                        case 15:
/* 952 */                   O0l1oloIi o0l1oloIi = (O0l1oloIi) this.I00iiI;
/* 956 */                   o01l1ioOo0 o01l1iooo02 = (o01l1ioOo0) this.I00iiO;
/* 960 */                   OI1Iio0ii1 oI1Iio0ii13 = (OI1Iio0ii1) obj;
/* 962 */                   O1I0II11i o1I0II11i2 = o0l1oloIi.I0010I0i;
/* 964 */                   OI000ilOol oI000ilOol2 = o0l1oloIi.I000o00OoI0I;
/* 976 */                   if (((Set) o1I0II11i2.invoke()).contains(oI1Iio0ii13)) {
/* 984 */                       IOoI0IIOlolO iOoI0IIOlolO = (IOoI0IIOlolO) ((I0l1OOl1l10) o01l1iooo02.I00iOIl).I00000oOI;
/* 990 */                       IOIOill iOIOillI0000O = IiOiOOIo.I0001Ioi1lo(oI000ilOol2).I0000O(oI1Iio0ii13);
/* 994 */                       Ill0IO ill0IO = iOIOillI0000O.I00000oIO;
/* 1002 */                      String strReplace = iOIOillI0000O.I00000oOI.I00000oIO.I00000oIO.replace('.', '$');
/* 1012 */                      if (!ill0IO.I00000oIO.I0000Il00O()) {
/* 1033 */                          strReplace = ill0IO.I00000oIO.I00000oIO + '.' + strReplace;
                                }
/* 1039 */                      Class clsI00000oIO = lIlIilIioI.I00000oIO(iOoI0IIOlolO.I00000oIO, strReplace);
/* 1051 */                      OOo1oliI oOo1oliI = clsI00000oIO != null ? new OOo1oliI(clsI00000oIO) : null;
/* 1052 */                      if (oOo1oliI != null) {
/* 1056 */                          return new O0l1i0l(o01l1iooo02, oI000ilOol2, oOo1oliI, null);
                                }
/* 16 */                        return null;
                            }
/* 1073 */                  if (!((Set) o0l1oloIi.I0010o.invoke()).contains(oI1Iio0ii13)) {
/* 1119 */                      OOoIIOoo0o oOoIIOoo0o = (OOoIIOoo0o) ((Map) o0l1oloIi.I00111O.invoke()).get(oI1Iio0ii13);
/* 1121 */                      if (oOoIIOoo0o == null) {
/* 16 */                            return null;
                                }
/* 1130 */                      O1I0OloI o1I0OloI3 = (O1I0OloI) ((I0l1OOl1l10) o01l1iooo02.I00iOIl).I00000oIO;
/* 1134 */                      O0l1iillll0 o0l1iillll0 = new O0l1iillll0(i2);
/* 1137 */                      o0l1iillll0.I00iiI = o0l1oloIi;
/* 1139 */                      VarHandle.storeStoreFence();
/* 1157 */                      return Il0liOool0.I00oIiI10(o1I0OloI3, o0l1oloIi.I000o00OoI0I, oI1Iio0ii13, new O1I0II11i(o1I0OloI3, o0l1iillll0), l0oOo1lI000l.I00000oIO(o01l1iooo02, oOoIIOoo0o), l1I0oI.I000OiO(oOoIIOoo0o));
                            }
/* 1075 */                  O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 1079 */                  Object obj6 = o01l1iooo02.I00iOIl;
/* 1081 */                  O101lO1 o101lO1I0000Il00O = IOOi1I.I0000Il00O(o101lO1I0000oI00);
/* 1085 */                  int iI00000oOI = o101lO1I0000Il00O.I00000oOI();
/* 1089 */                  if (iI00000oOI == 0) {
/* 16 */                        return null;
                            }
/* 1091 */                  if (iI00000oOI == 1) {
/* 1098 */                      return (OI000ilOol) IOOi0Ool1i.I00OilO00Il(o101lO1I0000Il00O);
                            }
/* 1103 */                  IoOOl0iOl1io.I001lIiIIo1O("Multiple classes with same name are generated: ", o101lO1I0000Il00O);
/* 16 */                    return null;
                        case 16:
/* 910 */                   Ol0IioOo ol0IioOo = (Ol0IioOo) this.I00iiI;
/* 914 */                   O0l1oloIi o0l1oloIi2 = (O0l1oloIi) this.I00iiO;
/* 918 */                   OI1Iio0ii1 oI1Iio0ii14 = (OI1Iio0ii1) obj;
                            return O0000Ioio00.I0000O(ol0IioOo.getName(), oI1Iio0ii14) ? Collections.singletonList(ol0IioOo) : IOOi0Ool1i.I00O10llo(o0l1oloIi2.I00IlilI0i0i(oI1Iio0ii14), o0l1oloIi2.I00Io1lO(oI1Iio0ii14));
                        case 17:
/* 535 */                   O0lIOO01I1l o0lIOO01I1l = (O0lIOO01I1l) this.I00iiI;
/* 537 */                   o01l1ioOo0 o01l1iooo03 = o0lIOO01I1l.I00000oOI;
/* 541 */                   o01l1ioOo0 o01l1iooo04 = (o01l1ioOo0) this.I00iiO;
/* 545 */                   O0lI1IIii o0lI1IIii = (O0lI1IIii) obj;
/* 547 */                   O0lI0O1OOi1 o0lI0O1OOi1 = o0lIOO01I1l.I000oI1ioi;
/* 549 */                   Ill0IO ill0IO2 = o0lI0O1OOi1.I00ilI0I1;
/* 551 */                   OI1Iio0ii1 oI1Iio0ii15 = o0lI1IIii.I00000oIO;
/* 553 */                   Ill0OI0lo ill0OI0lo = ill0IO2.I00000oIO;
/* 555 */                   Ill0IO ill0IO3 = Ill0IO.I0000Il00O;
/* 561 */                   Ill0OI0lo ill0OI0lo2 = ililiol1o0i.I00000oIO(oI1Iio0ii15).I00000oIO;
/* 563 */                   ill0OI0lo2.I0000Il00O();
/* 566 */                   String str2 = ill0OI0lo2.I00000oIO;
/* 568 */                   OOo1oliI oOo1oliI2 = o0lI1IIii.I00000oOI;
/* 572 */                   I0l1OOl1l10 i0l1OOl1l10 = (I0l1OOl1l10) o01l1iooo04.I00iOIl;
/* 574 */                   if (oOo1oliI2 != null) {
/* 578 */                       OOoOIoio1i oOoOIoio1i = (OOoOIoio1i) i0l1OOl1l10.I0000Il00O;
/* 596 */                       ((i1O01oOIoI0I) ((IiOlOOll) ((I0l1OOl1l10) o01l1iooo03.I00iOIl).I0000O).I0000Il00O().I0000Il00O).getClass();
/* 599 */                       O1lili011o o1lili011o = O1lili011o.I000II;
/* 601 */                       Ill0IO ill0IOI0000Il00O = oOo1oliI2.I0000Il00O();
/* 619 */                       oi00IilOloo0I00000oIO = (ill0IOI0000Il00O == null || (str = ill0IOI0000Il00O.I00000oIO.I00000oIO) == null) ? null : oOoOIoio1i.I00000oIO(str);
                            } else {
/* 623 */                       OOoOIoio1i oOoOIoio1i2 = (OOoOIoio1i) i0l1OOl1l10.I0000Il00O;
/* 641 */                       ((i1O01oOIoI0I) ((IiOlOOll) ((I0l1OOl1l10) o01l1iooo03.I00iOIl).I0000O).I0000Il00O().I0000Il00O).getClass();
/* 644 */                       O1lili011o o1lili011o2 = O1lili011o.I000II;
/* 646 */                       String strReplace2 = str2.replace('.', '$');
/* 654 */                       if (!ill0OI0lo.I0000Il00O()) {
/* 671 */                           strReplace2 = ill0IO2 + '.' + strReplace2;
                                }
/* 675 */                       oi00IilOloo0I00000oIO = oOoOIoio1i2.I00000oIO(strReplace2);
                            }
/* 686 */                   OOoOI1lIOi oOoOI1lIOi = oi00IilOloo0I00000oIO != null ? (OOoOI1lIOi) oi00IilOloo0I00000oIO.I00iOIl : null;
/* 696 */                   IOIOill iOIOillI00000oIO = oOoOI1lIOi != null ? OOo1Io0I0.I00000oIO(oOoOI1lIOi.I00000oIO) : null;
/* 697 */                   if (iOIOillI00000oIO != null && (iOIOillI00000oIO.I000II() || iOIOillI00000oIO.I0000Il00O)) {
/* 16 */                        return null;
                            }
/* 711 */                   ?? o0lI1l0I = O0lIIOllO.I00000oIO;
/* 713 */                   if (oOoOI1lIOi != null) {
/* 724 */                       if (((O0i1lIiil) oOoOI1lIOi.I00000oOI.I0000Il00O) == O0i1lIiil.I00ilI0I1) {
/* 732 */                           IiOlOOll iiOlOOll = (IiOlOOll) ((I0l1OOl1l10) o01l1iooo03.I00iOIl).I0000O;
/* 734 */                           IOIO1OO1l10l iOIO1OO1l10lI000II = iiOlOOll.I000II(oOoOI1lIOi);
/* 738 */                           if (iOIO1OO1l10lI000II == null) {
/* 740 */                               oI000ilOol = null;
                                    } else {
/* 748 */                               IOIOiIiilIl iOIOiIiilIl = (IOIOiIiilIl) iiOlOOll.I0000Il00O().I0010o;
/* 752 */                               IOIOill iOIOillI00000oIO2 = OOo1Io0I0.I00000oIO(oOoOI1lIOi.I00000oIO);
/* 756 */                               ?? r4 = iOIOiIiilIl.I00000oOI;
/* 760 */                               IOIOOIoOIO iOIOOIoOIO = new IOIOOIoOIO();
/* 763 */                               iOIOOIoOIO.I00000oIO = iOIOillI00000oIO2;
/* 765 */                               iOIOOIoOIO.I00000oOI = iOIO1OO1l10lI000II;
/* 767 */                               VarHandle.storeStoreFence();
/* 774 */                               oI000ilOol = (OI000ilOol) r4.invoke(iOIOOIoOIO);
                                    }
/* 776 */                           if (oI000ilOol != null) {
/* 780 */                               o0lI1l0I = new O0lI1l0I();
/* 783 */                               o0lI1l0I.I00000oIO = oI000ilOol;
/* 785 */                               VarHandle.storeStoreFence();
                                    }
                                } else {
/* 789 */                           o0lI1l0I = O0lIIloIool.I00000oIO;
                                }
                            }
/* 793 */                   if (o0lI1l0I instanceof O0lI1l0I) {
/* 797 */                       return ((O0lI1l0I) o0lI1l0I).I00000oIO;
                            }
/* 803 */                   if (o0lI1l0I instanceof O0lIIloIool) {
/* 16 */                        return null;
                            }
/* 809 */                   if (!(o0lI1l0I instanceof O0lIIOllO)) {
/* 904 */                       I000II.I00000oIO();
/* 16 */                        return null;
                            }
/* 811 */                   if (oOo1oliI2 == null) {
/* 815 */                       IOoI0IIOlolO iOoI0IIOlolO2 = (IOoI0IIOlolO) i0l1OOl1l10.I00000oOI;
/* 817 */                       String strReplace3 = str2.replace('.', '$');
/* 825 */                       if (!ill0OI0lo.I0000Il00O()) {
/* 844 */                           strReplace3 = ill0OI0lo.I00000oIO + '.' + strReplace3;
                                }
/* 850 */                       Class clsI00000oIO2 = lIlIilIioI.I00000oIO(iOoI0IIOlolO2.I00000oIO, strReplace3);
/* 863 */                       oOo1oliI2 = clsI00000oIO2 != null ? new OOo1oliI(clsI00000oIO2) : null;
                            }
/* 864 */                   O0ol11[] o0ol11Arr = O0ol11.I00iOIl;
/* 873 */                   Ill0IO ill0IOI0000Il00O2 = oOo1oliI2 != null ? oOo1oliI2.I0000Il00O() : null;
/* 874 */                   if (ill0IOI0000Il00O2 == null || ill0IOI0000Il00O2.I00000oIO.I0000Il00O() || !ill0IOI0000Il00O2.I00000oOI().equals(o0lI0O1OOi1.I00ilI0I1)) {
/* 16 */                        return null;
                            }
/* 899 */                   return new O0l1i0l(o01l1iooo04, o0lI0O1OOi1, oOo1oliI2, null);
                        case PoseLandmark.RIGHT_PINKY:
/* 517 */                   IOi10loi iOi10loi = (IOi10loi) this.I00iiI;
/* 521 */                   O1Iioo1 o1Iioo1 = (O1Iioo1) this.I00iiO;
/* 525 */                   if (iOi10loi == o1Iioo1.I000O01llI0) {
/* 528 */                       o1Iioo1.I000O01llI0 = null;
                            }
/* 530 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 394 */                   boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 400 */                   O1i1O1I o1i1O1I = (O1i1O1I) this.I00iiI;
/* 408 */                   String strI001i1O0Ol = ((O1i1Ooo0ll) this.I00iiO).I00000oIO.I001i1O0Ol();
/* 412 */                   OlO0OIIl1 olO0OIIl1 = o1i1O1I.I0000O;
/* 506 */                   do {
/* 414 */                       value = olO0OIIl1.getValue();
/* 419 */                       o1i1IIoO1IIl = (O1i1IIoO1IIl) value;
/* 421 */                       List<O1i1Ooo0ll> list = o1i1IIoO1IIl.I00000oIO;
/* 433 */                       arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 444 */                       for (O1i1Ooo0ll o1i1Ooo0ll : list) {
/* 462 */                           if (O0000Ioio00.I0000O(o1i1Ooo0ll.I00000oIO.I001i1O0Ol(), strI001i1O0Ol)) {
/* 470 */                               O1i1OO0O10Io o1i1OO0O10Io = (O1i1OO0O10Io) o1i1Ooo0ll.I00000oIO.I00100o1O0lo();
/* 472 */                               o1i1OO0O10Io.I000O01llI0(zBooleanValue);
/* 487 */                               o1i1Ooo0ll = new O1i1Ooo0ll((O1i1OolO) o1i1OO0O10Io.I00000oOI(), o1i1Ooo0ll.I00000oOI, o1i1Ooo0ll.I0000Il00O);
                                    }
/* 491 */                           arrayList.add(o1i1Ooo0ll);
                                }
/* 495 */                       o1i1O1I.I000OiO(arrayList);
/* 506 */                   } while (!olO0OIIl1.I000iOII(value, O1i1IIoO1IIl.I00000oIO(o1i1IIoO1IIl, arrayList, false, null, 6)));
/* 508 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 385 */                   return ((O0o01OIl) this.I00iiI).invoke(((List) this.I00iiO).get(((Number) obj).intValue()));
                        case PoseLandmark.LEFT_THUMB:
/* 313 */                   KeyEvent keyEvent2 = ((O0O1l0ilO) obj).I00000oIO;
/* 317 */                   IiloOlIoIool iiloOlIoIool = (IiloOlIoIool) this.I00iiI;
/* 323 */                   if (!iiloOlIoIool.I0000Il00O() || l0iloO.I00000oOI(keyEvent2) != 1 || !O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent2.getKeyCode()), O0O11OI0i.I001IIilI0O)) {
/* 362 */                       return Boolean.FALSE;
                            }
/* 356 */                   iOi1II01i0.I0000O((Ii0110) this.I00iiO, null, null, new IoI0iiIi(iiloOlIoIool, iOoil1iiIilo, i), 3);
/* 359 */                   return Boolean.TRUE;
                        case PoseLandmark.RIGHT_THUMB:
/* 303 */                   ((l1il11Il) this.I00iiI).I00000oOI((IIiO00o1o) this.I00iiO, (IIiO00o1o) obj);
/* 306 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 286 */                   return ((OOii01Ioi1) this.I00iiI).invoke(((List) this.I00iiO).get(((Number) obj).intValue()));
                        case PoseLandmark.RIGHT_HIP:
/* 261 */                   return ((OOii01Ioi1) this.I00iiI).invoke(((List) this.I00iiO).get(((Number) obj).intValue()));
                        case PoseLandmark.LEFT_KNEE:
/* 236 */                   return ((OiioI1Io0o) this.I00iiI).invoke(((List) this.I00iiO).get(((Number) obj).intValue()));
                        case PoseLandmark.RIGHT_KNEE:
/* 211 */                   return ((OiioI1Io0o) this.I00iiI).invoke(((List) this.I00iiO).get(((Number) obj).intValue()));
                        case 27:
/* 49 */                    KeyEvent keyEvent3 = ((O0O1l0ilO) obj).I00000oIO;
/* 53 */                    Ili1iIl ili1iIl = (Ili1iIl) this.I00iiI;
/* 55 */                    InputDevice device = keyEvent3.getDevice();
/* 59 */                    if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent3.getSource() == 33554433) && l0iloO.I00000oOI(keyEvent3) == 2 && keyEvent3.getSource() != 257)) {
/* 110 */                       if (lOl0ilol.I00000oIO(19, keyEvent3)) {
/* 114 */                           zI000O01llI0 = ((Ili1ioOlo0oO) ili1iIl).I000O01llI0(5, true);
                                } else if (lOl0ilol.I00000oIO(20, keyEvent3)) {
/* 129 */                           zI000O01llI0 = ((Ili1ioOlo0oO) ili1iIl).I000O01llI0(6, true);
                                } else if (lOl0ilol.I00000oIO(21, keyEvent3)) {
/* 144 */                           zI000O01llI0 = ((Ili1ioOlo0oO) ili1iIl).I000O01llI0(3, true);
                                } else if (lOl0ilol.I00000oIO(22, keyEvent3)) {
/* 159 */                           zI000O01llI0 = ((Ili1ioOlo0oO) ili1iIl).I000O01llI0(4, true);
                                } else if (lOl0ilol.I00000oIO(23, keyEvent3)) {
/* 176 */                           Ol1oolo ol1oolo = ((O0oIlOolIO) this.I00iiO).I0000Il00O;
/* 178 */                           if (ol1oolo != null) {
/* 182 */                               ((IiIli1i1o) ol1oolo).I00000oOI();
                                    }
/* 185 */                           zI000O01llI0 = true;
                                }
                            }
/* 186 */                   return Boolean.valueOf(zI000O01llI0);
                        default:
/* 40 */                    return ((Oo011oIOO1) this.I00iiI).invoke(((List) this.I00iiO).get(((Number) obj).intValue()));
                    }
                }
            }
