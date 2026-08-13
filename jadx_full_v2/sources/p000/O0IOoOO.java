            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            
            public final class O0IOoOO implements IllOOo00lI {
                public final int I00iOIl;
                public O0Ii1IOoiO I00iiI;
                public O0Ii0OOI I00iiO;

                public O0IOoOO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:108:0x0280  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
                /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r7v16 */
                /* JADX WARN: Type inference failed for: r7v18, types: [java.util.List] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() throws NoSuchFieldException {
                    Object o0i1oIiI0Oi;
                    String string;
                    String str;
                    ArrayList arrayList;
                    Field declaredField;
                    O0IOli0o0 o0IOli0o0I00000oOI;
                    OoOOoo11 ooOOoo11;
                    O0O10O o0o10o;
                    O0ioIllo0i1 o0ioIllo0i1;
                    O0Ii0OOI o0Ii0OOI;
/* 12 */            int i = 2;
/* 15 */            int i2 = 7;
/* 17 */            int i3 = 0;
/* 18 */            ArrayList arrayList2 = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 1367 */                  O0Ii1IOoiO o0Ii1IOoiO = this.I00iiI;
/* 1369 */                  O0Ii0OOI o0Ii0OOI2 = this.I00iiO;
/* 1375 */                  if (!OllOoiO.I00000oOI) {
/* 1628 */                      OI000ilOol oI000ilOolI00000oIO = o0Ii0OOI2.I00000oIO();
/* 1634 */                      if (!(oI000ilOolI00000oIO instanceof IlllOi0O)) {
/* 1787 */                          IiOlI10iOI iiOlI10iOI = oI000ilOolI00000oIO instanceof IiOlI10iOI ? (IiOlI10iOI) oI000ilOolI00000oIO : null;
/* 1788 */                          if (iiOlI10iOI != null) {
/* 1798 */                              return lIil0O.I0000Il00O(iiOlI10iOI.I00ilI0I1, (OI1IlOlol) iiOlI10iOI.I00ll1.I00iiO, false, 6);
                                    }
/* 18 */                            return null;
                                }
/* 1637 */                      IlllOi0O illlOi0O = (IlllOi0O) oI000ilOolI00000oIO;
/* 1639 */                      Illo0o illo0o = illlOi0O.I00io1l;
/* 1643 */                      if (!(illo0o instanceof Illo01lli)) {
/* 1776 */                          IOOlIIilOl0.I000OiO("Unsupported function type kind: ", illo0o, " (", oI000ilOolI00000oIO);
/* 18 */                            return null;
                                }
/* 1645 */                      int i4 = illlOi0O.I00ioIO;
/* 1649 */                      O0OoII0ii1li o0OoII0ii1li = new O0OoII0ii1li();
/* 1652 */                      ArrayList arrayList3 = o0OoII0ii1li.I0000Il00O;
/* 1660 */                      o0OoII0ii1li.I00000oOI = Oi010OO0.I000oI1ioi(i4, "kotlin/Function");
/* 1662 */                      IOIOll0I iOIOll0I = IOIOll0I.I00iiO;
/* 1664 */                      OillOo0 oillOo0 = I1i11o.I0000O;
/* 1666 */                      O0O00I1Ili[] o0O00I1IliArr = I1i11o.I00000oIO;
/* 1670 */                      O0O00I1Ili o0O00I1Ili = o0O00I1IliArr[9];
/* 1672 */                      oillOo0.I00100o1O0lo(o0OoII0ii1li, iOIOll0I);
/* 1675 */                      O1oIIOOO01II o1oIIOOO01II = O1oIIOOO01II.I00iio;
/* 1677 */                      OillOo0 oillOo02 = I1i11o.I00000oOI;
/* 1679 */                      O0O00I1Ili o0O00I1Ili2 = o0O00I1IliArr[7];
/* 1681 */                      oillOo02.I00100o1O0lo(o0OoII0ii1li, o1oIIOOO01II);
/* 1684 */                      OoooOoIO ooooOoIO = OoooOoIO.I00iiI;
/* 1686 */                      OillOo0 oillOo03 = I1i11o.I0000Il00O;
/* 1688 */                      O0O00I1Ili o0O00I1Ili3 = o0O00I1IliArr[8];
/* 1690 */                      oillOo03.I00100o1O0lo(o0OoII0ii1li, ooooOoIO);
/* 1693 */                      if (1 <= i4) {
/* 1695 */                          int i5 = 1;
                                    while (true) {
/* 1709 */                              arrayList3.add(new O0i0liO0oIO(0, Oi010OO0.I000oI1ioi(i5, OlIo0Ooi1loI.I000lI), i5, O0i0ol1o.I00iiI));
/* 1712 */                              if (i5 != i4) {
/* 1714 */                                  i5++;
                                        }
                                    }
                                }
/* 1717 */                      int i6 = i4 + 1;
/* 1727 */                      arrayList3.add(new O0i0liO0oIO(0, "R", i6, O0i0ol1o.I00iiO));
/* 1730 */                      ArrayList arrayList4 = o0OoII0ii1li.I0000O;
/* 1734 */                      O0i0iioIlO o0i0iioIlO = new O0i0iioIlO(0);
/* 1742 */                      o0i0iioIlO.I00000oOI = new O0OoOl10("kotlin/Function");
/* 1744 */                      ArrayList arrayList5 = o0i0iioIlO.I0000Il00O;
/* 1746 */                      O0i0ol1o o0i0ol1o = O0i0ol1o.I00iOIl;
/* 1750 */                      O0i0iioIlO o0i0iioIlO2 = new O0i0iioIlO(0);
/* 1758 */                      o0i0iioIlO2.I00000oOI = new O0OoiOIOI(i6);
/* 1765 */                      arrayList5.add(new O0i0o11i(o0i0ol1o, o0i0iioIlO2));
/* 1768 */                      arrayList4.add(o0i0iioIlO);
/* 1802 */                      return o0OoII0ii1li;
                            }
/* 1385 */                  Metadata metadata = (Metadata) o0Ii1IOoiO.I00iiI.getAnnotation(Metadata.class);
/* 1387 */                  if (metadata == null) {
/* 18 */                        return null;
                            }
/* 1394 */                  if (metadata.mv().length == 0) {
/* 1623 */                      I000II.I000iOII("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
/* 18 */                        return null;
                            }
/* 1412 */                  O1lili011o o1lili011o = new O1lili011o(metadata.mv(), (metadata.xi() & 8) != 0);
/* 1415 */                  boolean z = o1lili011o.I0001Ioi1lo;
/* 1417 */                  boolean zI00000oIO = o1lili011o.I00000oIO(1, 1, 0);
/* 1421 */                  if (!zI00000oIO) {
/* 1423 */                      if (zI00000oIO) {
/* 1429 */                          StringBuilder sb = new StringBuilder("while maximum supported version is ");
/* 1439 */                          sb.append(z ? O1lili011o.I000II : O1lili011o.I000O01llI0);
/* 1444 */                          sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
/* 1447 */                          string = sb.toString();
                                } else {
/* 1452 */                          string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
                                }
/* 1458 */                      OoOil11Ol1o.I0010o("Provided Metadata instance has version ", o1lili011o, ", ", string);
/* 18 */                        return null;
                            }
                            try {
/* 1463 */                      int iM18k = metadata.m18k();
/* 1467 */                      if (iM18k == 1) {
/* 1581 */                          o0i1oIiI0Oi = new O0i1oIiI0Oi(metadata);
                                } else if (iM18k == 2) {
/* 1560 */                          l0Oiiill1.I00000oIO(metadata);
/* 1569 */                          new O0I1i1OIIiIo(metadata.mv());
/* 1572 */                          metadata.xi();
/* 1575 */                          o0i1oIiI0Oi = new O0i1ol();
                                } else if (iM18k == 3) {
/* 1554 */                          o0i1oIiI0Oi = new O0i1ol(metadata);
                                } else if (iM18k == 4) {
/* 1530 */                          List listAsList = Arrays.asList(metadata.d1());
/* 1540 */                          new O0I1i1OIIiIo(metadata.mv());
/* 1543 */                          metadata.xi();
/* 1546 */                          O0i1olOiO1li o0i1olOiO1li = new O0i1olOiO1li();
/* 1549 */                          o0i1olOiO1li.I00000oIO = listAsList;
                                    o0i1oIiI0Oi = o0i1olOiO1li;
                                } else if (iM18k != 5) {
/* 1481 */                          Object o0i1ol = new O0i1ol();
/* 1490 */                          new O0I1i1OIIiIo(metadata.mv());
/* 1493 */                          metadata.xi();
/* 1496 */                          VarHandle.storeStoreFence();
                                    o0i1oIiI0Oi = o0i1ol;
                                } else {
/* 1502 */                          l0Oiiill1.I00000oIO(metadata);
/* 1505 */                          metadata.xs();
/* 1514 */                          new O0I1i1OIIiIo(metadata.mv());
/* 1517 */                          metadata.xi();
/* 1520 */                          o0i1oIiI0Oi = new O0i1ol();
                                }
/* 1591 */                      O0i1oIiI0Oi o0i1oIiI0Oi2 = o0i1oIiI0Oi instanceof O0i1oIiI0Oi ? (O0i1oIiI0Oi) o0i1oIiI0Oi : null;
/* 1592 */                      if (o0i1oIiI0Oi2 != null) {
/* 1594 */                          return o0i1oIiI0Oi2.I00000oIO;
                                }
/* 18 */                        return null;
                            } finally {
                            }
                        case 1:
/* 883 */                   O0Ii1IOoiO o0Ii1IOoiO2 = this.I00iiI;
/* 885 */                   O0Ii0OOI o0Ii0OOI3 = this.I00iiO;
/* 887 */                   Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 889 */                   Class cls = o0Ii1IOoiO2.I00iiI;
/* 897 */                   if (cls.equals(Object.class)) {
/* 899 */                       return Il01100l.I00iOIl;
                            }
/* 905 */                   if (OllOoiO.I00000oIO) {
/* 915 */                       Collection<O0iIl1> collectionI0000oI00 = o0Ii0OOI3.I00000oIO().I000OOo1O().I0000oI00();
/* 925 */                       ArrayList arrayList6 = new ArrayList(collectionI0000oI00.size());
/* 930 */                       O0Ii1IOoiO o0Ii1IOoiO3 = o0Ii0OOI3.I0010I0i;
/* 940 */                       for (O0iIl1 o0iIl1 : collectionI0000oI00) {
/* 954 */                           I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(20);
/* 957 */                           i01illiil1Oo.I00iiO = o0iIl1;
/* 959 */                           i01illiil1Oo.I00iiI = o0Ii1IOoiO3;
/* 961 */                           VarHandle.storeStoreFence();
/* 967 */                           arrayList6.add(new IiOOIlll(o0iIl1, i01illiil1Oo, false));
                                }
/* 971 */                       OI000ilOol oI000ilOolI00000oIO2 = o0Ii0OOI3.I00000oIO();
/* 975 */                       OI1Iio0ii1 oI1Iio0ii1 = O0i1lI0o1io.I0000oI00;
/* 983 */                       if (!O0i1lI0o1io.I00000oOI(oI000ilOolI00000oIO2, OlIllOO11lOl.I00000oIO) && !O0i1lI0o1io.I00000oOI(oI000ilOolI00000oIO2, OlIllOO11lOl.I00000oOI)) {
/* 998 */                           if (arrayList6.isEmpty()) {
/* 1050 */                              arrayList6.add(OlIlOIi.I00000oIO);
                                    } else {
/* 1001 */                              Iterator it = arrayList6.iterator();
/* 1009 */                              while (it.hasNext()) {
/* 1017 */                                  O0IiIl0il o0IiIl0ilI001IIilI0O = ((O0O01O0o) it.next()).I001IIilI0O();
/* 1028 */                                  O0Ii1IOoiO o0Ii1IOoiO4 = o0IiIl0ilI001IIilI0O instanceof O0Ii1IOoiO ? (O0Ii1IOoiO) o0IiIl0ilI001IIilI0O : null;
/* 1029 */                                  if (o0Ii1IOoiO4 == null || (o0Ii1IOoiO4.I00IoiI() != IOIOll0I.I00iiO && o0Ii1IOoiO4.I00IoiI() != IOIOll0I.I00ilO0)) {
                                            }
                                        }
/* 1050 */                              arrayList6.add(OlIlOIi.I00000oIO);
                                    }
                                }
/* 1053 */                      return iiIiiol0.I00000oOI(arrayList6);
                            }
/* 1061 */                  ArrayList arrayList7 = new ArrayList();
/* 1064 */                  O0OoII0ii1li o0OoII0ii1liI00000oOI = o0Ii0OOI3.I00000oOI();
/* 1073 */                  ArrayList<O0i0iioIlO> arrayList8 = o0OoII0ii1liI00000oOI != null ? o0OoII0ii1liI00000oOI.I0000O : null;
/* 1074 */                  if (arrayList8 != null) {
/* 1084 */                      for (O0i0iioIlO o0i0iioIlO3 : arrayList8) {
/* 1092 */                          l0lOoI l0looiI00000oIO = o0i0iioIlO3.I00000oIO();
/* 1103 */                          O0OoOl10 o0OoOl10 = l0looiI00000oIO instanceof O0OoOl10 ? (O0OoOl10) l0looiI00000oIO : null;
/* 1104 */                          if (o0OoOl10 == null || (str = o0OoOl10.I00000oIO) == null) {
/* 1177 */                              StringBuilder sb2 = new StringBuilder("Supertype of ");
/* 1180 */                              sb2.append(o0Ii1IOoiO2);
/* 1183 */                              l0lOoI l0looiI00000oIO2 = o0i0iioIlO3.I00000oIO();
/* 1189 */                              sb2.append(" not a class: ");
/* 1192 */                              sb2.append(l0looiI00000oIO2);
/* 1202 */                              throw new Ii01OOool(sb2.toString());
                                    }
/* 1110 */                          IOIOill iOIOillI0000O = iioOllll1.I0000O(str);
/* 1118 */                          Class clsI0001Ioi1lo = Oolli0oi0.I0001Ioi1lo(OOo1Io0I0.I0000O(cls), iOIOillI0000O, 0);
/* 1122 */                          if (clsI0001Ioi1lo == null) {
/* 1166 */                              IoOOl0iOl1io.I00100l0("Unsupported superclass of ", o0Ii1IOoiO2, ": ", iOIOillI0000O);
/* 18 */                                return null;
                                    }
/* 1124 */                          ClassLoader classLoaderI0000O = OOo1Io0I0.I0000O(cls);
/* 1128 */                          OOoOiOo01lo oOoOiOo01lo = o0Ii0OOI3.I000OOo1O;
/* 1132 */                          O0O00I1Ili o0O00I1Ili4 = O0Ii0OOI.I0010o[7];
/* 1138 */                          OoOOoo11 ooOOoo112 = (OoOOoo11) oOoOiOo01lo.invoke();
/* 1142 */                          II01oIlIII iI01oIlIII = new II01oIlIII(i2);
/* 1145 */                          iI01oIlIII.I00iiO = o0Ii1IOoiO2;
/* 1147 */                          iI01oIlIII.I00iiI = clsI0001Ioi1lo;
/* 1149 */                          iI01oIlIII.I00iio = iOIOillI0000O;
/* 1151 */                          VarHandle.storeStoreFence();
/* 1158 */                          arrayList7.add(iioOllll1.I0000oI00(o0i0iioIlO3, classLoaderI0000O, ooOOoo112, iI01oIlIII));
                                }
/* 1207 */                      if (cls.isArray()) {
/* 1211 */                          arrayList7.add(OlIlOIi.I0000Il00O);
                                }
/* 1220 */                      if (Serializable.class.isAssignableFrom(cls)) {
/* 1222 */                          O0O01O0o o0O01O0o = OlIlOIi.I0000O;
/* 1228 */                          if (!arrayList7.contains(o0O01O0o)) {
/* 1230 */                              OOoOiOo01lo oOoOiOo01lo2 = o0Ii0OOI3.I0001Ioi1lo;
/* 1234 */                              O0O00I1Ili o0O00I1Ili5 = O0Ii0OOI.I0010o[3];
/* 1240 */                              String str2 = (String) oOoOiOo01lo2.invoke();
/* 1242 */                              if (str2 != null && OlOolloIIOl0.I000l1(str2, "kotlin.", false)) {
/* 1252 */                                  arrayList7.add(o0O01O0o);
                                        }
                                    }
                                }
                            } else {
/* 1256 */                      Type genericSuperclass = cls.getGenericSuperclass();
/* 1260 */                      if (genericSuperclass != null) {
/* 1266 */                          if (genericSuperclass.equals(Object.class)) {
/* 1269 */                              genericSuperclass = null;
                                    }
/* 1270 */                          if (genericSuperclass != null) {
/* 1278 */                              arrayList7.add(iioOO0iI1.I0000oI00(genericSuperclass, il011I1OiO0I, OoOOOOl.I00iOIl, false, 4));
                                    }
                                }
/* 1287 */                      for (Type type : cls.getGenericInterfaces()) {
/* 1297 */                          arrayList7.add(iioOO0iI1.I0000oI00(type, il011I1OiO0I, OoOOOOl.I00iOIl, false, 4));
                                }
                            }
/* 1307 */                  if (arrayList7.isEmpty()) {
/* 1359 */                      arrayList7.add(OlIlOIi.I00000oIO);
                            } else {
/* 1310 */                      Iterator it2 = arrayList7.iterator();
/* 1318 */                      while (it2.hasNext()) {
/* 1326 */                          O0IiIl0il o0IiIl0ilI001IIilI0O2 = ((O0O01O0o) it2.next()).I001IIilI0O();
/* 1337 */                          O0Ii1IOoiO o0Ii1IOoiO5 = o0IiIl0ilI001IIilI0O2 instanceof O0Ii1IOoiO ? (O0Ii1IOoiO) o0IiIl0ilI001IIilI0O2 : null;
/* 1338 */                          if (o0Ii1IOoiO5 == null || (o0Ii1IOoiO5.I00IoiI() != IOIOll0I.I00iiO && o0Ii1IOoiO5.I00IoiI() != IOIOll0I.I00ilO0)) {
                                    }
                                }
/* 1359 */                      arrayList7.add(OlIlOIi.I00000oIO);
                            }
/* 1362 */                  return iiIiiol0.I00000oOI(arrayList7);
                        case 2:
/* 758 */                   O0Ii1IOoiO o0Ii1IOoiO6 = this.I00iiI;
/* 760 */                   O0Ii0OOI o0Ii0OOI4 = this.I00iiO;
/* 762 */                   Il01100l il01100l = Il01100l.I00iOIl;
/* 764 */                   Class cls2 = o0Ii1IOoiO6.I00iiI;
/* 766 */                   ClassLoader classLoaderI0000O2 = OOo1Io0I0.I0000O(cls2);
/* 770 */                   O0OoII0ii1li o0OoII0ii1liI00000oOI2 = o0Ii0OOI4.I00000oOI();
/* 774 */                   if (o0OoII0ii1liI00000oOI2 != null) {
/* 776 */                       ArrayList arrayList9 = o0OoII0ii1liI00000oOI2.I000l1;
/* 780 */                       ArrayList arrayList10 = new ArrayList();
/* 783 */                       Iterator it3 = arrayList9.iterator();
/* 791 */                       while (it3.hasNext()) {
/* 799 */                           O0IOli0o0 o0IOli0o0I00000oIO = iioOllll1.I00000oIO(classLoaderI0000O2, (String) it3.next());
/* 803 */                           if (o0IOli0o0I00000oIO != null) {
/* 805 */                               arrayList10.add(o0IOli0o0I00000oIO);
                                    }
                                }
/* 882 */                       return arrayList10;
                            }
/* 815 */                   Method method = (Method) l010lllOii.I00000oIO().I00iiI;
/* 833 */                   if (!O0000Ioio00.I0000O(method == null ? null : (Boolean) method.invoke(cls2, null), Boolean.TRUE)) {
/* 882 */                       return il01100l;
                            }
/* 841 */                   Method method2 = (Method) l010lllOii.I00000oIO().I00iiO;
/* 851 */                   Class[] clsArr = method2 == null ? null : (Class[]) method2.invoke(cls2, null);
/* 853 */                   if (clsArr != null) {
/* 858 */                       arrayList2 = new ArrayList(clsArr.length);
/* 861 */                       int length = clsArr.length;
/* 862 */                       while (i3 < length) {
/* 872 */                           arrayList2.add(OOoOl0i.I00000oIO.I00000oOI(clsArr[i3]));
/* 875 */                           i3++;
                                }
                            }
                            return arrayList2 == null ? il01100l : arrayList2;
                        case 3:
/* 652 */                   O0Ii0OOI o0Ii0OOI5 = this.I00iiO;
/* 656 */                   Class cls3 = this.I00iiI.I00iiI;
/* 658 */                   O0OoII0ii1li o0OoII0ii1liI00000oOI3 = o0Ii0OOI5.I00000oOI();
/* 662 */                   if (o0OoII0ii1liI00000oOI3 != null) {
/* 664 */                       String str3 = o0OoII0ii1liI00000oOI3.I00000oOI;
/* 666 */                       if (str3 == null) {
/* 727 */                           O0000Ioio00.I000OOo1O("name");
/* 730 */                           throw null;
                                }
/* 668 */                       IOIOill iOIOillI0000O2 = iioOllll1.I0000O(str3);
/* 672 */                       ClassLoader classLoaderI0000O3 = OOo1Io0I0.I0000O(cls3);
/* 676 */                       ArrayList arrayList11 = o0OoII0ii1liI00000oOI3.I000OOo1O;
/* 680 */                       arrayList = new ArrayList();
/* 683 */                       Iterator it4 = arrayList11.iterator();
/* 691 */                       while (it4.hasNext()) {
/* 707 */                           Class clsI0001Ioi1lo2 = Oolli0oi0.I0001Ioi1lo(classLoaderI0000O3, iOIOillI0000O2.I0000O(OI1Iio0ii1.I0000oI00((String) it4.next())), 0);
/* 720 */                           O0IOli0o0 o0IOli0o0I00000oOI2 = clsI0001Ioi1lo2 != null ? OOoOl0i.I00000oIO.I00000oOI(clsI0001Ioi1lo2) : null;
/* 721 */                           if (o0IOli0o0I00000oOI2 != null) {
/* 723 */                               arrayList.add(o0IOli0o0I00000oOI2);
                                    }
                                }
                            } else {
/* 731 */                       Class<?>[] declaredClasses = cls3.getDeclaredClasses();
/* 737 */                       arrayList = new ArrayList();
/* 740 */                       int length2 = declaredClasses.length;
/* 741 */                       while (i3 < length2) {
/* 751 */                           arrayList.add(OOoOl0i.I00000oIO.I00000oOI(declaredClasses[i3]));
/* 754 */                           i3++;
                                }
                            }
/* 757 */                   return arrayList;
                        case 4:
/* 533 */                   O0Ii0OOI o0Ii0OOI6 = this.I00iiO;
/* 537 */                   Class cls4 = this.I00iiI.I00iiI;
/* 539 */                   O0OoII0ii1li o0OoII0ii1liI00000oOI4 = o0Ii0OOI6.I00000oOI();
/* 543 */                   if (o0OoII0ii1liI00000oOI4 == null) {
/* 18 */                        return null;
                            }
/* 551 */                   if (I1i11o.I00000oIO(o0OoII0ii1liI00000oOI4) != IOIOll0I.I00io1l && I1i11o.I00000oIO(o0OoII0ii1liI00000oOI4) != IOIOll0I.I00ioIO) {
/* 18 */                        return null;
                            }
/* 568 */                   if (I1i11o.I00000oIO(o0OoII0ii1liI00000oOI4) == IOIOll0I.I00ioIO) {
/* 570 */                       LinkedHashSet linkedHashSet = IOi0lll110.I00000oIO;
/* 572 */                       String str4 = o0OoII0ii1liI00000oOI4.I00000oOI;
/* 574 */                       if (str4 == null) {
/* 637 */                           O0000Ioio00.I000OOo1O("name");
/* 640 */                           throw null;
                                }
/* 588 */                       if (IOOi0Ool1i.I001i1O0Ol(linkedHashSet, iioOllll1.I0000O(str4).I0000oI00())) {
/* 643 */                           declaredField = cls4.getDeclaredField("INSTANCE");
                                } else {
/* 590 */                           Class<?> enclosingClass = cls4.getEnclosingClass();
/* 594 */                           String str5 = o0OoII0ii1liI00000oOI4.I00000oOI;
/* 596 */                           if (str5 == null) {
/* 633 */                               O0000Ioio00.I000OOo1O("name");
/* 636 */                               throw null;
                                    }
/* 604 */                           if (OlOolloIIOl0.I000l1(str5, ".", false)) {
/* 629 */                               I000II.I0010I0i("Local class is not supported: ".concat(str5));
/* 18 */                                return null;
                                    }
/* 608 */                           String strI00O0i0ii = OlOoOIi0o.I00O0i0ii('/', str5, str5);
/* 618 */                           declaredField = enclosingClass.getDeclaredField(OlOoOIi0o.I00O0i0ii('.', strI00O0i0ii, strI00O0i0ii));
                                }
                            }
/* 647 */                   return declaredField.get(null);
                        case 5:
/* 341 */                   O0Ii0OOI o0Ii0OOI7 = this.I00iiO;
/* 343 */                   O0Ii1IOoiO o0Ii1IOoiO7 = this.I00iiI;
/* 347 */                   if (OllOoiO.I00000oIO) {
/* 353 */                       List listI00io1l = o0Ii0OOI7.I00000oIO().I00io1l();
/* 365 */                       ArrayList arrayList12 = new ArrayList(IOOi1I.I0000O(listI00io1l, 10));
/* 368 */                       Iterator it5 = listI00io1l.iterator();
/* 376 */                       while (it5.hasNext()) {
/* 389 */                           arrayList12.add(new O0O0iO(o0Ii1IOoiO7, (OoOOiO) it5.next()));
                                }
/* 532 */                       return arrayList12;
                            }
/* 397 */                   if (o0Ii0OOI7.I00000oOI() != null) {
/* 518 */                       OOoOiOo01lo oOoOiOo01lo3 = o0Ii0OOI7.I000OOo1O;
/* 522 */                       O0O00I1Ili o0O00I1Ili6 = O0Ii0OOI.I0010o[7];
/* 530 */                       return ((OoOOoo11) oOoOiOo01lo3.invoke()).I00000oIO;
                            }
/* 401 */                   TypeVariable[] typeParameters = o0Ii1IOoiO7.I00iiI.getTypeParameters();
/* 408 */                   int iI00000oIO = O1Oii0o0Oi.I00000oIO(typeParameters.length);
/* 416 */                   LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO >= 16 ? iI00000oIO : 16);
/* 421 */                   for (TypeVariable typeVariable : typeParameters) {
/* 440 */                       linkedHashMap.put(typeVariable, new O0O0iO(iioOO0iI1.I0000Il00O(typeVariable), typeVariable.getName(), O0O10O.I00iOIl));
                            }
/* 458 */                   for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 470 */                       TypeVariable typeVariable2 = (TypeVariable) entry.getKey();
/* 476 */                       O0O0iO o0O0iO = (O0O0iO) entry.getValue();
/* 478 */                       Type[] bounds = typeVariable2.getBounds();
/* 485 */                       ArrayList arrayList13 = new ArrayList(bounds.length);
/* 490 */                       for (Type type2 : bounds) {
/* 498 */                           arrayList13.add(iioOO0iI1.I0000oI00(type2, linkedHashMap, null, false, 6));
                                }
/* 504 */                       o0O0iO.I00ilO0 = arrayList13;
                            }
/* 513 */                   return IOOi0Ool1i.I00iIi0i1o(linkedHashMap.values());
                        default:
/* 22 */                    O0Ii0OOI o0Ii0OOI8 = this.I00iiO;
/* 24 */                    O0Ii1IOoiO o0Ii1IOoiO8 = this.I00iiI;
/* 30 */                    if (o0Ii0OOI8.I00000oOI() == null) {
/* 32 */                        return OoOOoo11.I0000O;
                            }
/* 36 */                    OoOOoo11 ooOOoo113 = OoOOoo11.I0000O;
/* 42 */                    ArrayList arrayList14 = o0Ii0OOI8.I00000oOI().I0000Il00O;
/* 46 */                    Class<?> enclosingClass2 = o0Ii1IOoiO8.I00iiI.getEnclosingClass();
/* 50 */                    if (enclosingClass2 != null) {
/* 52 */                        O0OoII0ii1li o0OoII0ii1liI00000oOI5 = o0Ii0OOI8.I00000oOI();
/* 56 */                        I00Ol00 i00Ol00 = I1i11o.I0000oI00;
/* 60 */                        O0O00I1Ili o0O00I1Ili7 = I1i11o.I00000oIO[10];
/* 66 */                        if (!i00Ol00.I000OiO(o0OoII0ii1liI00000oOI5)) {
/* 69 */                            enclosingClass2 = null;
                                }
/* 79 */                        o0IOli0o0I00000oOI = enclosingClass2 != null ? OOoOl0i.I00000oIO.I00000oOI(enclosingClass2) : null;
                            }
/* 87 */                    O0Ii1IOoiO o0Ii1IOoiO9 = o0IOli0o0I00000oOI instanceof O0Ii1IOoiO ? (O0Ii1IOoiO) o0IOli0o0I00000oOI : null;
/* 88 */                    if (o0Ii1IOoiO9 == null || (o0ioIllo0i1 = o0Ii1IOoiO9.I00iiO) == null || (o0Ii0OOI = (O0Ii0OOI) o0ioIllo0i1.getValue()) == null) {
/* 115 */                       ooOOoo11 = null;
                            } else {
/* 102 */                       OOoOiOo01lo oOoOiOo01lo4 = o0Ii0OOI.I000OOo1O;
/* 106 */                       O0O00I1Ili o0O00I1Ili8 = O0Ii0OOI.I0010o[7];
/* 112 */                       ooOOoo11 = (OoOOoo11) oOoOiOo01lo4.invoke();
                            }
/* 118 */                   ClassLoader classLoaderI0000O4 = OOo1Io0I0.I0000O(o0Ii1IOoiO8.I00iiI);
/* 128 */                   ArrayList arrayList15 = new ArrayList(IOOi1I.I0000O(arrayList14, 10));
/* 131 */                   Iterator it6 = arrayList14.iterator();
/* 139 */                   while (it6.hasNext()) {
/* 145 */                       O0i0liO0oIO o0i0liO0oIO = (O0i0liO0oIO) it6.next();
/* 149 */                       String str6 = o0i0liO0oIO.I00000oOI;
/* 153 */                       int iOrdinal = o0i0liO0oIO.I0000O.ordinal();
/* 157 */                       if (iOrdinal == 0) {
/* 174 */                           o0o10o = O0O10O.I00iOIl;
                                } else if (iOrdinal == 1) {
/* 171 */                           o0o10o = O0O10O.I00iiI;
                                } else {
/* 161 */                           if (iOrdinal != i) {
/* 166 */                               I000II.I00000oIO();
/* 18 */                                return null;
                                    }
/* 163 */                           o0o10o = O0O10O.I00iiO;
                                }
/* 176 */                       I00Ol00 i00Ol002 = I1i11o.I000OiO;
/* 182 */                       O0O00I1Ili o0O00I1Ili9 = I1i11o.I00000oIO[49];
/* 184 */                       i00Ol002.I000OiO(o0i0liO0oIO);
/* 190 */                       arrayList15.add(new O0O0iO(o0Ii1IOoiO8, str6, o0o10o));
/* 193 */                       i = 2;
                            }
/* 195 */                   I1IollOi01 i1IollOi01I00ilI0I1 = IOOi0Ool1i.I00ilI0I1(arrayList14);
/* 203 */                   int iI00000oIO2 = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(i1IollOi01I00ilI0I1, 10));
/* 213 */                   LinkedHashMap linkedHashMap2 = new LinkedHashMap(iI00000oIO2 >= 16 ? iI00000oIO2 : 16);
/* 216 */                   Iterator it7 = i1IollOi01I00ilI0I1.iterator();
                            while (true) {
/* 221 */                       Iio0IIOo iio0IIOo = (Iio0IIOo) it7;
/* 229 */                       if (!iio0IIOo.I00iiI.hasNext()) {
/* 259 */                           OoOOoo11 ooOOoo114 = new OoOOoo11(arrayList15, linkedHashMap2, ooOOoo11);
/* 262 */                           Iterator it8 = arrayList15.iterator();
/* 270 */                           while (it8.hasNext()) {
/* 272 */                               int i7 = i3 + 1;
/* 278 */                               O0O0iO o0O0iO2 = (O0O0iO) it8.next();
/* 286 */                               ArrayList arrayList16 = ((O0i0liO0oIO) arrayList14.get(i3)).I0000oI00;
/* 294 */                               ?? arrayList17 = new ArrayList(IOOi1I.I0000O(arrayList16, 10));
/* 297 */                               Iterator it9 = arrayList16.iterator();
/* 305 */                               while (it9.hasNext()) {
/* 317 */                                   arrayList17.add(iioOllll1.I0000oI00((O0i0iioIlO) it9.next(), classLoaderI0000O4, ooOOoo114, null));
                                        }
/* 325 */                               if (arrayList17.isEmpty()) {
/* 329 */                                   arrayList17 = Collections.singletonList(OlIlOIi.I00000oOI);
                                        }
/* 335 */                               o0O0iO2.I00ilO0 = (List) arrayList17;
/* 337 */                               i3 = i7;
                                    }
/* 339 */                           return ooOOoo114;
                                }
/* 235 */                       Iol0oIiIOI iol0oIiIOI = (Iol0oIiIOI) iio0IIOo.next();
/* 253 */                       linkedHashMap2.put(Integer.valueOf(((O0i0liO0oIO) iol0oIiIOI.I00000oOI).I0000Il00O), arrayList15.get(iol0oIiIOI.I00000oIO));
                            }
                            break;
                    }
                }
            }
