            package p000;

            import android.view.KeyCharacterMap;
            import android.view.KeyEvent;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.jvm.functions.Function1;
            
            public final class I00oII extends IlllollI implements Function1 {
                public final int I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I00oII(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
/* 8 */             super(i, i2, cls, obj, str, str2);
/* 1 */             this.I00ioIO = i3;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:127:0x03cb  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    Object[] objArr;
                    int i;
                    Object[] objArr2;
                    int i2;
                    int i3;
                    int iNextIndex;
                    boolean z;
                    Integer numValueOf;
                    boolean zContains;
                    IOi0OoOOIlli iOi0OoOOIlli;
                    O0O1Ool o0O1OolI0010I0i;
                    Integer numValueOf2;
/* 3 */             int i4 = this.I00ioIO;
/* 5 */             int i5 = 7;
/* 12 */            boolean z2 = true;
/* 13 */            boolean z3 = false;
/* 14 */            Object[] objArr3 = 0;
/* 14 */            Object[] objArr4 = 0;
/* 14 */            Object[] objArr5 = 0;
/* 15 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 17 */            Object obj2 = this.I00iiI;
                    switch (i4) {
                        case 0:
/* 1608 */                  int i6 = 0;
/* 1614 */                  boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 1618 */                  I00oo1iO0ll i00oo1iO0ll = (I00oo1iO0ll) obj2;
/* 1620 */                  OI0lli1 oI0lli1 = i00oo1iO0ll.I0100i;
/* 1622 */                  if (zBooleanValue) {
/* 1624 */                      i00oo1iO0ll.I011IOil();
                            } else {
/* 1631 */                      if (i00oo1iO0ll.I00o101lO != null) {
/* 1633 */                          Object[] objArr6 = oI0lli1.I0000Il00O;
/* 1635 */                          long[] jArr = oI0lli1.I00000oIO;
/* 1638 */                          int length = jArr.length - 2;
/* 1639 */                          if (length >= 0) {
/* 1641 */                              int i7 = 0;
                                        while (true) {
/* 1643 */                                  long j = jArr[i7];
/* 1657 */                                  if ((((~j) << i5) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 1664 */                                      int i8 = 8;
/* 1666 */                                      int i9 = 8 - ((~(i7 - length)) >>> 31);
/* 1668 */                                      int i10 = i6;
/* 1670 */                                      while (i10 < i9) {
/* 1680 */                                          if ((j & 255) < 128) {
/* 1687 */                                              OOIII1oOoolO oOIII1oOoolO = (OOIII1oOoolO) objArr6[(i7 << 3) + i10];
/* 1693 */                                              i2 = i8;
/* 1697 */                                              objArr2 = objArr6;
/* 1699 */                                              i3 = i6;
/* 1704 */                                              iOi1II01i0.I0000O(i00oo1iO0ll.I00ooiO1I(), null, null, new I00olI(i00oo1iO0ll, oOIII1oOoolO, objArr4 == true ? 1 : 0, i3), 3);
                                                    } else {
/* 1708 */                                              objArr2 = objArr6;
/* 1710 */                                              i2 = i8;
/* 1712 */                                              i3 = i6;
                                                    }
/* 1714 */                                          j >>= i2;
/* 1716 */                                          i10++;
/* 1718 */                                          i8 = i2;
/* 1720 */                                          i6 = i3;
/* 1722 */                                          objArr6 = objArr2;
                                                }
/* 1726 */                                      objArr = objArr6;
/* 1729 */                                      i = i6;
/* 1731 */                                      if (i9 == i8) {
                                                }
                                            } else {
/* 1734 */                                      objArr = objArr6;
/* 1736 */                                      i = i6;
                                            }
/* 1738 */                                  if (i7 != length) {
/* 1740 */                                      i7++;
/* 1742 */                                      i6 = i;
/* 1744 */                                      objArr6 = objArr;
/* 1746 */                                      i5 = 7;
                                            }
                                        }
                                    }
/* 1748 */                          OOIII1oOoolO oOIII1oOoolO2 = i00oo1iO0ll.I010101Oo1lO;
/* 1750 */                          if (oOIII1oOoolO2 != null) {
/* 1762 */                              iOi1II01i0.I0000O(i00oo1iO0ll.I00ooiO1I(), null, null, new I00olI(i00oo1iO0ll, oOIII1oOoolO2, objArr3 == true ? 1 : 0, 1), 3);
                                    }
                                }
/* 1765 */                      oI0lli1.I00000oIO();
/* 1768 */                      i00oo1iO0ll.I010101Oo1lO = null;
/* 1770 */                      i00oo1iO0ll.I011Ill();
                            }
/* 1773 */                  return ooiIlOl1iI;
                        case 1:
/* 1571 */                  OlO0OIIl1 olO0OIIl1 = ((I1iOI11ioi1) obj2).I00000oOI;
/* 1604 */                  olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), null, 0, null, 0, (String) obj, null, null, null, null, 0.0f, null, null, 4079));
/* 1607 */                  return ooiIlOl1iI;
                        case 2:
/* 1560 */                  return ((IIIloOl0I1I) ((IIOIlI01) obj2)).I0000Il00O((IOoil1iiIilo) obj);
                        case 3:
/* 1547 */                  return ((IiOOllOI0io) obj2).I000o00OoI0I((String) obj);
                        case 4:
/* 1537 */                  return new IiOl1IoO1((IiOlI10iOI) obj2, (O0iIoIOO0O0) obj);
                        case 5:
/* 1473 */                  Io0oO1OiI io0oO1OiI = (Io0oO1OiI) obj2;
/* 1475 */                  io0oO1OiI.getClass();
/* 1486 */                  for (Io0lool io0lool : (List) obj) {
/* 1496 */                      if (io0lool instanceof Io0l0i) {
/* 1502 */                          io0oO1OiI.I00000oIO(((Io0l0i) io0lool).I00000oIO);
                                } else if (io0lool instanceof Io0li1o0) {
/* 1524 */                          iOi1II01i0.I0000O(io0oO1OiI.I00ilI0I1, null, Ii01I10.I00iio, new I0II0OiI(io0lool, (IOoil1iiIilo) (objArr5 == true ? 1 : 0), 21), 1);
                                }
                            }
/* 1528 */                  return ooiIlOl1iI;
                        case 6:
/* 1429 */                  OlO0OIIl1 olO0OIIl12 = ((IoiIII) obj2).I00000oOI;
/* 1465 */                  olO0OIIl12.I000lI(null, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl12.getValue(), (String) obj, null, 0, 0.0f, null, false, 0, 0, null, null, false, 0.0f, false, 7678));
/* 1468 */                  return ooiIlOl1iI;
                        case 7:
/* 1383 */                  OlO0OIIl1 olO0OIIl13 = ((IoiIII) obj2).I00000oOI;
/* 1419 */                  olO0OIIl13.I000lI(null, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl13.getValue(), null, (String) obj, 0, 0.0f, null, false, 0, 0, null, null, false, 0.0f, false, 8189));
/* 1422 */                  return ooiIlOl1iI;
                        case 8:
/* 1338 */                  OlO0OIIl1 olO0OIIl14 = ((IoiIII) obj2).I00000oOI;
/* 1373 */                  olO0OIIl14.I000lI(null, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl14.getValue(), null, null, 0, 0.0f, (IoiOlOo10l00) obj, false, 0, 0, null, null, false, 0.0f, false, 8175));
/* 1376 */                  return ooiIlOl1iI;
                        case 9:
/* 1204 */                  Set set = (Set) obj;
/* 1206 */                  O00IOI11 o00ioi11 = (O00IOI11) obj2;
/* 1208 */                  ReentrantLock reentrantLock = o00ioi11.I0000O;
/* 1210 */                  reentrantLock.lock();
                            try {
/* 1221 */                      List<OIOio0O1O> listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(o00ioi11.I0000Il00O.values());
/* 1225 */                      reentrantLock.unlock();
/* 1238 */                      for (OIOio0O1O oIOio0O1O : listI00iIi0i1o) {
/* 1246 */                          int[] iArr = oIOio0O1O.I00000oOI;
/* 1248 */                          int length2 = iArr.length;
/* 1249 */                          Set setI00000oIO = Il01llIol0.I00iOIl;
/* 1251 */                          if (length2 != 0) {
/* 1254 */                              if (length2 != 1) {
/* 1258 */                                  Oilolol11I oilolol11I = new Oilolol11I();
/* 1261 */                                  int length3 = iArr.length;
/* 1262 */                                  int i11 = 0;
/* 1264 */                                  int i12 = 0;
/* 1265 */                                  while (i11 < length3) {
/* 1269 */                                      int i13 = i12 + 1;
/* 1279 */                                      if (set.contains(Integer.valueOf(iArr[i11]))) {
/* 1285 */                                          oilolol11I.add(oIOio0O1O.I0000Il00O[i12]);
                                                }
/* 1288 */                                      i11++;
/* 1290 */                                      i12 = i13;
                                            }
/* 1292 */                                  setI00000oIO = Oio0lI.I00000oIO(oilolol11I);
                                        } else if (set.contains(Integer.valueOf(iArr[0]))) {
/* 1309 */                                  setI00000oIO = oIOio0O1O.I0000O;
                                        }
                                    }
/* 1318 */                          if (!setI00000oIO.isEmpty()) {
/* 1322 */                              oIOio0O1O.I00000oIO.I00000oIO(setI00000oIO);
                                    }
                                }
/* 1326 */                      return ooiIlOl1iI;
                            } catch (Throwable th) {
/* 1328 */                      reentrantLock.unlock();
/* 1331 */                      throw th;
                            }
                        case 10:
/* 1196 */                  ((O010olO) obj2).I000oI1ioi((Throwable) obj);
/* 1199 */                  return ooiIlOl1iI;
                        case 11:
/* 1185 */                  return ((O0l1oloIi) obj2).I00IlilI0i0i((OI1Iio0ii1) obj);
                        case 12:
/* 1174 */                  return ((O0l1oloIi) obj2).I00Io1lO((OI1Iio0ii1) obj);
                        case 13:
/* 683 */                   List list = (List) obj;
/* 687 */                   ((OOiOlo1l0I0o) obj2).getClass();
/* 691 */                   List<IIo0illOoI> list2 = list;
/* 695 */                   ArrayList arrayList = new ArrayList();
/* 706 */                   for (Object obj3 : list2) {
/* 717 */                       if (((IIo0illOoI) obj3) instanceof Oi01loi1ioi) {
/* 719 */                           arrayList.add(obj3);
                                }
                            }
/* 723 */                   list.removeAll(arrayList);
/* 730 */                   Iterator it = IOOi0Ool1i.I00OIo(arrayList).iterator();
/* 738 */                   while (it.hasNext()) {
/* 746 */                       list.add(0, (IIo0illOoI) it.next());
                            }
/* 754 */                   ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
/* 762 */                       if (!listIterator.hasPrevious()) {
/* 779 */                           iNextIndex = -1;
                                } else if (((IIo0illOoI) listIterator.previous()) instanceof Oi01o1o10O01) {
/* 774 */                           iNextIndex = listIterator.nextIndex();
                                }
                            }
/* 780 */                   if (iNextIndex > 0) {
/* 786 */                       Oi01o1o10O01 oi01o1o10O01 = (Oi01o1o10O01) list.get(iNextIndex);
/* 789 */                       for (int i14 = 0; i14 < iNextIndex; i14++) {
/* 795 */                           IIo0illOoI iIo0illOoI = (IIo0illOoI) list.remove(0);
/* 817 */                           IOi10loi iOi10loi = iIo0illOoI instanceof Oi01oOIIlo ? ((Oi01oOIIlo) iIo0illOoI).I00000oOI : iIo0illOoI instanceof Oi01o1o10O01 ? ((Oi01o1o10O01) iIo0illOoI).I00000oIO : null;
/* 818 */                           if (iOi10loi != null) {
/* 820 */                               IOi10loi iOi10loi2 = oi01o1o10O01.I00000oIO;
/* 825 */                               OIoO1Ol oIoO1Ol = new OIoO1Ol(6);
/* 828 */                               oIoO1Ol.I00iiI = iOi10loi;
/* 830 */                               VarHandle.storeStoreFence();
/* 833 */                               iOi10loi2.I00iiI(oIoO1Ol);
                                    }
/* 838 */                           if (iIo0illOoI instanceof Oi0O01) {
/* 844 */                               ((Oi0O01) iIo0illOoI).I00000oIO.I00000oIO(null);
                                    }
                                }
                            }
/* 852 */                   LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 859 */                   int i15 = 0;
/* 864 */                   for (IIo0illOoI iIo0illOoI2 : list2) {
/* 866 */                       int i16 = i15 + 1;
/* 876 */                       if (iIo0illOoI2 instanceof Oi0O01) {
/* 879 */                           Oi0O01 oi0O01 = (Oi0O01) iIo0illOoI2;
/* 883 */                           String str = oi0O01.I00000oIO.I00000oIO;
/* 897 */                           Set setI00iio = IOOi0Ool1i.I00iio(IOOi0Ool1i.I00OI1(oi0O01.I00000oOI, IIllI0o.I00000oIO(str)));
/* 901 */                           int size = list.size();
/* 905 */                           int i17 = i16;
/* 906 */                           while (i17 < size) {
/* 912 */                               IIo0illOoI iIo0illOoI3 = (IIo0illOoI) list.get(i17);
/* 914 */                               z = z3;
/* 918 */                               if (iIo0illOoI3 instanceof Oi01oOIIlo) {
/* 928 */                                   zContains = setI00iio.contains(IIllI0o.I00000oIO(((Oi01oOIIlo) iIo0illOoI3).I00000oIO));
                                        } else if (iIo0illOoI3 instanceof Oi0O01) {
/* 937 */                                   Oi0O01 oi0O012 = (Oi0O01) iIo0illOoI3;
/* 941 */                                   String str2 = oi0O012.I00000oIO.I00000oIO;
/* 975 */                                   zContains = (O0000Ioio00.I0000O(str, str2) || !setI00iio.equals(IOOi0Ool1i.I00iio(IOOi0Ool1i.I00OI1(oi0O012.I00000oOI, IIllI0o.I00000oIO(str2))))) ? true : z;
                                        }
/* 976 */                               if (zContains) {
/* 978 */                                   numValueOf = Integer.valueOf(i17);
                                        } else {
/* 983 */                                   i17++;
/* 985 */                                   z3 = z;
                                        }
                                    }
/* 989 */                           z = z3;
/* 991 */                           numValueOf = null;
                                } else {
/* 993 */                           z = z3;
/* 997 */                           if (iIo0illOoI2 instanceof Oi01oOIIlo) {
/* 999 */                               int size2 = list.size();
/* 1004 */                              for (int i18 = i16; i18 < size2; i18++) {
/* 1010 */                                  IIo0illOoI iIo0illOoI4 = (IIo0illOoI) list.get(i18);
/* 1014 */                                  if ((iIo0illOoI4 instanceof Oi01oOIIlo) && O0000Ioio00.I0000O(((Oi01oOIIlo) iIo0illOoI4).I00000oIO, ((Oi01oOIIlo) iIo0illOoI2).I00000oIO)) {
/* 1031 */                                      numValueOf = Integer.valueOf(i18);
                                            }
                                        }
/* 991 */                               numValueOf = null;
                                    } else {
/* 991 */                               numValueOf = null;
                                    }
                                }
/* 1039 */                      if (numValueOf != null) {
/* 1049 */                          IIo0illOoI iIo0illOoI5 = (IIo0illOoI) list.get(numValueOf.intValue());
/* 1051 */                          Objects.toString(iIo0illOoI2);
/* 1054 */                          Objects.toString(iIo0illOoI5);
/* 1061 */                          linkedHashSet.add(Integer.valueOf(i15));
/* 1066 */                          if ((iIo0illOoI2 instanceof Oi01oOIIlo) && (iIo0illOoI5 instanceof Oi01oOIIlo)) {
/* 1074 */                              IOi10loi iOi10loi3 = ((Oi01oOIIlo) iIo0illOoI5).I00000oOI;
/* 1078 */                              OIoO1Ol oIoO1Ol2 = new OIoO1Ol(i5);
/* 1083 */                              oIoO1Ol2.I00iiI = (Oi01oOIIlo) iIo0illOoI2;
/* 1085 */                              VarHandle.storeStoreFence();
/* 1088 */                              iOi10loi3.I00iiI(oIoO1Ol2);
                                    }
                                }
/* 1091 */                      i15 = i16;
/* 1092 */                      z3 = z;
                            }
/* 1099 */                  ArrayList arrayList2 = new ArrayList();
/* 1106 */                  Iterator it2 = IOOi0Ool1i.I00Ol10(linkedHashSet).iterator();
/* 1114 */                  while (it2.hasNext()) {
/* 1135 */                      arrayList2.add(list.remove(((Number) it2.next()).intValue() - arrayList2.size()));
                            }
/* 1139 */                  Iterator it3 = arrayList2.iterator();
/* 1147 */                  while (it3.hasNext()) {
/* 1153 */                      IIo0illOoI iIo0illOoI6 = (IIo0illOoI) it3.next();
/* 1157 */                      if (iIo0illOoI6 instanceof Oi0O01) {
/* 1163 */                          ((Oi0O01) iIo0illOoI6).I00000oIO.I00000oIO(null);
                                }
                            }
/* 1167 */                  return ooiIlOl1iI;
                        case 14:
/* 642 */                   boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
/* 648 */                   OlO0OIIl1 olO0OIIl15 = ((OilIlo) obj2).I00000oOI;
/* 677 */                   olO0OIIl15.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl15.getValue(), false, false, null, null, null, false, zBooleanValue2, false, false, null, 959));
/* 680 */                   return ooiIlOl1iI;
                        case 15:
/* 599 */                   boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
/* 605 */                   OlO0OIIl1 olO0OIIl16 = ((OilIlo) obj2).I00000oOI;
/* 634 */                   olO0OIIl16.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl16.getValue(), false, false, null, null, null, false, false, zBooleanValue3, false, null, 895));
/* 637 */                   return ooiIlOl1iI;
                        case 16:
/* 569 */                   OlO0OIIl1 olO0OIIl17 = ((OlI1IliO0I) obj2).I00000oOI;
/* 591 */                   olO0OIIl17.I000lI(null, OlI1Il1.I00000oIO((OlI1Il1) olO0OIIl17.getValue(), (String) obj, 0, false, 0.0f, null, null, 62));
/* 594 */                   return ooiIlOl1iI;
                        case 17:
/* 537 */                   OlO0OIIl1 olO0OIIl18 = ((OlI1i0) obj2).I00000oOI;
/* 559 */                   olO0OIIl18.I000lI(null, OlI1OoIO0.I00000oIO((OlI1OoIO0) olO0OIIl18.getValue(), (String) obj, 0, false, 0.0f, null, null, 62));
/* 562 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 505 */                   OlO0OIIl1 olO0OIIl19 = ((Oliii00iliIi) obj2).I00000oOI;
/* 527 */                   olO0OIIl19.I000lI(null, OliiOl0.I00000oIO((OliiOl0) olO0OIIl19.getValue(), (String) obj, false, 0, 0.0f, 0, null, 30));
/* 530 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 462 */                   int iIntValue = ((Number) obj).intValue();
/* 468 */                   OlO0OIIl1 olO0OIIl110 = ((Oliii00iliIi) obj2).I00000oOI;
/* 495 */                   olO0OIIl110.I000lI(null, OliiOl0.I00000oIO((OliiOl0) olO0OIIl110.getValue(), null, false, iIntValue < 0 ? 0 : iIntValue, 0.0f, 0, null, 59));
/* 498 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 422 */                   float fFloatValue = ((Number) obj).floatValue();
/* 428 */                   OlO0OIIl1 olO0OIIl111 = ((Oliii00iliIi) obj2).I00000oOI;
/* 454 */                   olO0OIIl111.I000lI(null, OliiOl0.I00000oIO((OliiOl0) olO0OIIl111.getValue(), null, false, 0, lIiioliIlo.I00000oOI(fFloatValue, 0.5f, 2.0f), 0, null, 55));
/* 457 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 413 */                   return ((IiIOI1ol0o) obj2).I00o0iI0io1((IOoil1iiIilo) obj);
                        case PoseLandmark.RIGHT_THUMB:
/* 358 */                   long j2 = ((OIOlIiiioi) obj).I00000oIO;
/* 361 */                   OlolIO ololIO = (OlolIO) obj2;
/* 363 */                   ololIO.getClass();
/* 373 */                   Ololli ololli = (Ololli) iiliIooIliOo.I00000oIO(ololIO, OloloO.I00000oIO);
/* 375 */                   if (ololli != null) {
/* 380 */                       Olol1l10iO0O olol1l10iO0O = new Olol1l10iO0O();
/* 383 */                       olol1l10iO0O.I00iiI = ololIO;
/* 385 */                       olol1l10iO0O.I00iOIl = j2;
/* 387 */                       VarHandle.storeStoreFence();
/* 403 */                       iOi1II01i0.I0000O(ololIO.I00ooiO1I(), null, null, new I00oO101o(ololIO, j2, ololli, olol1l10iO0O, (IOoil1iiIilo) null), 3);
                            }
/* 406 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 350 */                   ((OloilI0Ol) obj2).I00000oOI.I00000oOI((Function1) obj);
/* 353 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 82 */                    KeyEvent keyEvent = ((O0O1l0ilO) obj).I00000oIO;
/* 84 */                    Oo01IOO0O10 oo01IOO0O10 = (Oo01IOO0O10) obj2;
/* 86 */                    Oo0l1Ooo oo0l1Ooo = oo01IOO0O10.I0001Ioi1lo;
/* 88 */                    boolean z4 = oo01IOO0O10.I0000O;
/* 94 */                    if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
/* 193 */                       iOi0OoOOIlli = null;
                            } else {
/* 106 */                       Ii1Oilo1I ii1Oilo1I = oo01IOO0O10.I000OOo1O;
/* 108 */                       ii1Oilo1I.getClass();
/* 111 */                       int unicodeChar = keyEvent.getUnicodeChar();
/* 118 */                       if ((Integer.MIN_VALUE & unicodeChar) != 0) {
/* 128 */                           ii1Oilo1I.I00000oIO = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
/* 130 */                           numValueOf2 = null;
                                } else {
/* 132 */                           Integer num = ii1Oilo1I.I00000oIO;
/* 134 */                           if (num != null) {
/* 136 */                               ii1Oilo1I.I00000oIO = null;
/* 142 */                               int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
/* 146 */                               Integer numValueOf3 = Integer.valueOf(deadChar);
/* 150 */                               if (deadChar == 0) {
/* 152 */                                   numValueOf3 = null;
                                        }
/* 153 */                               if (numValueOf3 != null) {
/* 155 */                                   unicodeChar = numValueOf3.intValue();
                                        }
/* 159 */                               numValueOf2 = Integer.valueOf(unicodeChar);
                                    } else {
/* 164 */                               numValueOf2 = Integer.valueOf(unicodeChar);
                                    }
                                }
/* 168 */                       if (numValueOf2 != null) {
/* 189 */                           iOi0OoOOIlli = new IOi0OoOOIlli(new StringBuilder().appendCodePoint(numValueOf2.intValue()).toString(), 1);
                                }
                            }
/* 194 */                   if (iOi0OoOOIlli != null) {
/* 196 */                       if (z4) {
/* 202 */                           oo01IOO0O10.I00000oIO(Collections.singletonList(iOi0OoOOIlli));
/* 205 */                           oo0l1Ooo.I00000oIO = null;
                                } else {
/* 209 */                           z2 = false;
                                }
                            } else if (l0iloO.I00000oOI(keyEvent) == 2 && (o0O1OolI0010I0i = oo01IOO0O10.I000OiO.I0010I0i(keyEvent)) != null && (!o0O1OolI0010I0i.I00iOIl || z4)) {
/* 235 */                       OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 238 */                       oOo0l0ii10l.I00iOIl = true;
/* 244 */                       O11IOOoiI10i o11IOOoiI10i = new O11IOOoiI10i(15);
/* 247 */                       o11IOOoiI10i.I00iiI = o0O1OolI0010I0i;
/* 249 */                       o11IOOoiI10i.I00iiO = oo01IOO0O10;
/* 251 */                       o11IOOoiI10i.I00iio = oOo0l0ii10l;
/* 253 */                       VarHandle.storeStoreFence();
/* 258 */                       Oo0OI01Il oo0OI01Il = oo01IOO0O10.I0000Il00O;
/* 260 */                       OIOlOI oIOlOI = oo01IOO0O10.I000II;
/* 264 */                       Oo0il0olo1l oo0il0olo1lI0000O = oo01IOO0O10.I00000oIO.I0000O();
/* 268 */                       I1111OO10i i1111OO10i = oo0OI01Il.I00000oIO;
/* 270 */                       long j3 = oo0OI01Il.I00000oOI;
/* 274 */                       Oo0iil0o0oI oo0iil0o0oI = oo0il0olo1lI0000O != null ? oo0il0olo1lI0000O.I00000oIO : null;
/* 276 */                       Oo0I01o oo0I01o = new Oo0I01o();
/* 279 */                       oo0I01o.I00000oIO = i1111OO10i;
/* 281 */                       oo0I01o.I00000oOI = j3;
/* 283 */                       oo0I01o.I0000Il00O = oo0iil0o0oI;
/* 285 */                       oo0I01o.I0000O = oIOlOI;
/* 287 */                       oo0I01o.I0000oI00 = oo0l1Ooo;
/* 289 */                       oo0I01o.I0001Ioi1lo = j3;
/* 291 */                       oo0I01o.I000II = i1111OO10i;
/* 293 */                       oo0I01o.I000O01llI0 = oo0OI01Il;
/* 295 */                       oo0I01o.I000OOo1O = oo0il0olo1lI0000O;
/* 297 */                       VarHandle.storeStoreFence();
/* 300 */                       o11IOOoiI10i.invoke(oo0I01o);
/* 309 */                       if (!Oo0lI00l.I0000Il00O(oo0I01o.I0001Ioi1lo, j3) || !O0000Ioio00.I0000O(i1111OO10i, oo0OI01Il.I00000oIO)) {
/* 328 */                           oo01IOO0O10.I000iOII.invoke(Oo0OI01Il.I00000oIO(oo0OI01Il, i1111OO10i, oo0I01o.I0001Ioi1lo, 4));
                                }
/* 333 */                       oo01IOO0O10.I000O01llI0.I0000oI00 = true;
/* 335 */                       z2 = oOo0l0ii10l.I00iOIl;
                            }
/* 337 */                   return Boolean.valueOf(z2);
                        case PoseLandmark.LEFT_KNEE:
/* 74 */                    ((OoIoI0iii0) obj2).I0001Ioi1lo((String) obj);
/* 77 */                    return ooiIlOl1iI;
                        default:
/* 26 */                    float fFloatValue2 = ((Number) obj).floatValue();
/* 32 */                    OlO0OIIl1 olO0OIIl112 = ((OoIoI0iii0) obj2).I00000oOI;
/* 64 */                    olO0OIIl112.I000lI(null, OoIo10100O1.I00000oIO((OoIo10100O1) olO0OIIl112.getValue(), null, false, 0, lIiioliIlo.I00000oOI(fFloatValue2, 0.5f, 2.0f), 0, null, false, 0.0f, null, 503));
/* 67 */                    return ooiIlOl1iI;
                    }
                }
            }
