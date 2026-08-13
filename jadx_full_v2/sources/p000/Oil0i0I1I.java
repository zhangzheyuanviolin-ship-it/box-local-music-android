            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Comparator;
            import java.util.List;
            
            public abstract class Oil0i0I1I {
                public static final Comparator[] I00000oIO;
                public static final OiO01i I00000oOI;

                static {
/* 2 */             Comparator[] comparatorArr = new Comparator[2];
/* 4 */             int i = 0;
/* 5 */             while (i < 2) {
/* 12 */                IliIiio1 iliIiio1 = i == 0 ? IliIiio1.I00ilO0 : IliIiio1.I00iiO;
/* 18 */                II1liooilI iI1liooilI = new II1liooilI(8);
/* 21 */                iI1liooilI.I00iiI = iliIiio1;
/* 23 */                VarHandle.storeStoreFence();
/* 30 */                II1liooilI iI1liooilI2 = new II1liooilI(9);
/* 33 */                iI1liooilI2.I00iiI = iI1liooilI;
/* 35 */                VarHandle.storeStoreFence();
/* 38 */                comparatorArr[i] = iI1liooilI2;
/* 40 */                i++;
                    }
/* 43 */            I00000oIO = comparatorArr;
/* 52 */            I00000oOI = new OiO01i(28);
                }

                public static final void I00000oIO(Oil000 oil000, ArrayList arrayList, IIOIlOoI111 iIOIlOoI111, IIOIlOoI111 iIOIlOoI1112, OI0l1oli1I oI0l1oli1I) {
/* 1 */             OiioiIIlooo oiioiIIlooo = oil000.I0000O;
/* 7 */             Object objI000II = oiioiIIlooo.I00iOIl.I000II(Oil0I1O.I000o00OoI0I);
/* 11 */            if (objI000II == null) {
/* 13 */                objI000II = Boolean.FALSE;
                    }
/* 17 */            boolean zBooleanValue = ((Boolean) objI000II).booleanValue();
/* 21 */            if ((zBooleanValue || ((Boolean) iIOIlOoI1112.invoke(oil000)).booleanValue()) && ((Boolean) iIOIlOoI111.invoke(oil000)).booleanValue()) {
/* 47 */                arrayList.add(oil000);
                    }
/* 51 */            if (zBooleanValue) {
/* 63 */                oI0l1oli1I.I000OOo1O(oil000.I0001Ioi1lo, I00000oOI(oil000, iIOIlOoI111, iIOIlOoI1112, oil000.I000OOo1O((4 & 1) != 0 ? !oil000.I00000oOI : false, (4 & 2) == 0)));
/* 66 */                return;
                    }
/* 18 */            List listI000OOo1O = oil000.I000OOo1O((4 & 1) != 0 ? !oil000.I00000oOI : false, (4 & 2) == 0);
/* 74 */            int size = listI000OOo1O.size();
/* 79 */            for (int i = 0; i < size; i++) {
/* 87 */                I00000oIO((Oil000) listI000OOo1O.get(i), arrayList, iIOIlOoI111, iIOIlOoI1112, oI0l1oli1I);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final ArrayList I00000oOI(Oil000 oil000, IIOIlOoI111 iIOIlOoI111, IIOIlOoI111 iIOIlOoI1112, List list) {
/* 5 */             OI0l1oli1I oI0l1oli1I = IooO001.I00000oIO;
/* 9 */             OI0l1oli1I oI0l1oli1I2 = new OI0l1oli1I();
/* 14 */            ArrayList arrayList = new ArrayList();
/* 20 */            int size = list.size();
/* 25 */            for (int i = 0; i < size; i++) {
/* 35 */                I00000oIO((Oil000) list.get(i), arrayList, iIOIlOoI111, iIOIlOoI1112, oI0l1oli1I2);
                    }
/* 53 */            char c = oil000.I0000Il00O.I00oo1iO0ll == O0iOOoiioO.I00iiI ? (char) 1 : (char) 0;
/* 62 */            ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
/* 65 */            int iI000II = IOOi1I.I000II(arrayList);
/* 69 */            if (iI000II >= 0) {
/* 71 */                int i2 = 0;
                        while (true) {
/* 76 */                    Oil000 oil0002 = (Oil000) arrayList.get(i2);
/* 78 */                    if (i2 != 0) {
/* 84 */                        float f = oil0002.I000O01llI0().I00000oOI;
/* 90 */                        float f2 = oil0002.I000O01llI0().I0000O;
/* 98 */                        boolean z = f >= f2;
/* 99 */                        int iI000II2 = IOOi1I.I000II(arrayList2);
/* 103 */                       if (iI000II2 >= 0) {
/* 105 */                           int i3 = 0;
                                    while (true) {
/* 114 */                               OOo0IO oOo0IO = (OOo0IO) ((OIoi0IIoi) arrayList2.get(i3)).I00iOIl;
/* 116 */                               float f3 = oOo0IO.I00000oOI;
/* 120 */                               float f4 = oOo0IO.I0000O;
/* 129 */                               boolean z2 = f3 >= f4;
/* 131 */                               if (!z && !z2 && Math.max(f, f3) < Math.min(f2, f4)) {
/* 190 */                                   arrayList2.set(i3, new OIoi0IIoi(new OOo0IO(Math.max(oOo0IO.I00000oIO, 0.0f), Math.max(oOo0IO.I00000oOI, f), Math.min(oOo0IO.I0000Il00O, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((OIoi0IIoi) arrayList2.get(i3)).I00iiI));
/* 203 */                                   ((List) ((OIoi0IIoi) arrayList2.get(i3)).I00iiI).add(oil0002);
                                            break;
                                        }
/* 207 */                               if (i3 == iI000II2) {
                                            break;
                                        }
/* 209 */                               i3++;
                                    }
                                }
/* 231 */                       arrayList2.add(new OIoi0IIoi(oil0002.I000O01llI0(), IOOi1I.I000OiO(oil0002)));
/* 234 */                       if (i2 == iI000II) {
                                    break;
                                }
/* 236 */                       i2++;
                            }
                        }
                    }
/* 244 */           IOOiOil.I000oI1ioi(arrayList2, IliIiio1.I00io1l);
/* 249 */           ArrayList arrayList3 = new ArrayList();
/* 256 */           Comparator comparator = I00000oIO[c ^ 1];
/* 258 */           int size2 = arrayList2.size();
/* 263 */           for (int i4 = 0; i4 < size2; i4++) {
/* 269 */               OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) arrayList2.get(i4);
/* 275 */               IOOiOil.I000oI1ioi((List) oIoi0IIoi.I00iiI, comparator);
/* 282 */               arrayList3.addAll((Collection) oIoi0IIoi.I00iiI);
                    }
/* 291 */           I0oloIO0 i0oloIO0 = new I0oloIO0(7);
/* 294 */           VarHandle.storeStoreFence();
/* 297 */           IOOiOil.I000oI1ioi(arrayList3, i0oloIO0);
/* 300 */           int size3 = 0;
/* 305 */           while (size3 <= IOOi1I.I000II(arrayList3)) {
/* 319 */               List list2 = (List) oI0l1oli1I2.I00000oOI(((Oil000) arrayList3.get(size3)).I0001Ioi1lo);
/* 321 */               if (list2 != null) {
/* 337 */                   if (((Boolean) iIOIlOoI1112.invoke(arrayList3.get(size3))).booleanValue()) {
/* 343 */                       size3++;
                            } else {
/* 339 */                       arrayList3.remove(size3);
                            }
/* 348 */                   arrayList3.addAll(size3, list2);
/* 355 */                   size3 += list2.size();
                        } else {
/* 357 */                   size3++;
                        }
                    }
/* 1182 */          return arrayList3;
                }
            }
