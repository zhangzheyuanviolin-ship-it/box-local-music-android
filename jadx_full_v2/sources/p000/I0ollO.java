            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            
            public final class I0ollO implements O1iOIl0o10 {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                public I0ollO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    List list2;
                    List list3;
                    OIoi0IIoi oIoi0IIoi;
/* 7 */             int i = this.I00000oIO;
/* 9 */             Map map = Il011I1OiO0I.I00iOIl;
                    switch (i) {
                        case 0:
/* 275 */                   ((OO1lio) this.I00000oOI).setParentLayoutDirection((O0iOOoiioO) this.I0000Il00O);
/* 286 */                   return o1iOIoOiO0.I001i1lo1io(0, 0, map, new I01OoIoio00O(27));
                        default:
/* 20 */                    ArrayList arrayList3 = new ArrayList(list.size());
/* 24 */                    List list4 = list;
/* 26 */                    int size = list4.size();
/* 31 */                    for (int i2 = 0; i2 < size; i2++) {
/* 33 */                        Object obj = list.get(i2);
/* 46 */                        if (!(((O1iIo0ll) obj).I00II0Ol1O0l() instanceof Oo0lI1o11ll)) {
/* 48 */                            arrayList3.add(obj);
                                }
                            }
/* 62 */                    List list5 = (List) ((IllOOo00lI) this.I0000Il00O).invoke();
/* 64 */                    if (list5 != null) {
/* 72 */                        ArrayList arrayList4 = new ArrayList(list5.size());
/* 78 */                        int size2 = list5.size();
/* 82 */                        int i3 = 0;
/* 83 */                        while (i3 < size2) {
/* 89 */                            OOo0IO oOo0IO = (OOo0IO) list5.get(i3);
/* 91 */                            if (oOo0IO != null) {
/* 93 */                                float f = oOo0IO.I00000oOI;
/* 95 */                                float f2 = oOo0IO.I00000oIO;
/* 105 */                               O1iIo0ll o1iIo0ll = (O1iIo0ll) arrayList3.get(i3);
/* 110 */                               list2 = list4;
/* 118 */                               int iFloor = (int) Math.floor(oOo0IO.I0000Il00O - f2);
/* 121 */                               float f3 = oOo0IO.I0000O - f;
/* 122 */                               list3 = list5;
/* 131 */                               arrayList2 = arrayList3;
/* 166 */                               oIoi0IIoi = new OIoi0IIoi(o1iIo0ll.I001lllioOl(IOo0olo.I00000oOI(0, iFloor, 0, (int) Math.floor(f3), 5)), IooO0O.I00000oIO((Math.round(f) & 4294967295L) | (Math.round(f2) << 32)));
                                    } else {
/* 170 */                               arrayList2 = arrayList3;
/* 172 */                               list2 = list4;
/* 174 */                               list3 = list5;
/* 175 */                               oIoi0IIoi = null;
                                    }
/* 176 */                           if (oIoi0IIoi != null) {
/* 178 */                               arrayList4.add(oIoi0IIoi);
                                    }
/* 181 */                           i3++;
/* 183 */                           list5 = list3;
/* 184 */                           list4 = list2;
/* 186 */                           arrayList3 = arrayList2;
                                }
/* 189 */                       arrayList = arrayList4;
                            } else {
/* 193 */                       arrayList = null;
                            }
/* 190 */                   List list6 = list4;
/* 201 */                   ArrayList arrayList5 = new ArrayList(list.size());
/* 204 */                   int size3 = list6.size();
/* 209 */                   for (int i4 = 0; i4 < size3; i4++) {
/* 211 */                       Object obj2 = list.get(i4);
/* 224 */                       if (((O1iIo0ll) obj2).I00II0Ol1O0l() instanceof Oo0lI1o11ll) {
/* 226 */                           arrayList5.add(obj2);
                                }
                            }
/* 236 */                   ArrayList arrayListI0001Ioi1lo = iOOoI0OII.I0001Ioi1lo(arrayList5, (IllOOo00lI) this.I00000oOI);
/* 240 */                   int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 244 */                   int iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 252 */                   OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(16);
/* 255 */                   oiOi011iI1ol.I00iiI = arrayList;
/* 257 */                   oiOi011iI1ol.I00iiO = arrayListI0001Ioi1lo;
/* 259 */                   VarHandle.storeStoreFence();
/* 262 */                   return o1iOIoOiO0.I001i1lo1io(iI000OiO, iI000OOo1O, map, oiOi011iI1ol);
                    }
                }
            }
