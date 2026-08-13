            package p000;

            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            
            public final class IoI011li implements IlliIl1l11O {
                public final int I00iOIl;
                public O1ol100o0O I00iiI;

                public IoI011li(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 7 */             int i2 = 2;
/* 9 */             int i3 = 0;
/* 10 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 12 */            O1ol100o0O o1ol100o0O = this.I00iiI;
                    switch (i) {
                        case 0:
/* 382 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 388 */                   int iIntValue = ((Integer) obj2).intValue();
/* 404 */                   if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 449 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 406 */                       boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(o1ol100o0O);
/* 410 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii;
/* 414 */                       if (zI000OOo1O || objI00O0i0ii == iOO0o0I1l) {
/* 420 */                           Io1o0l0iOl io1o0l0iOl = new Io1o0l0iOl(z ? 1 : 0);
/* 423 */                           io1o0l0iOl.I00iiI = o1ol100o0O;
/* 425 */                           VarHandle.storeStoreFence();
/* 428 */                           iloI0lOlll1.I00iio(io1o0l0iOl);
                                    obj3 = io1o0l0iOl;
                                }
/* 445 */                       iOiO0o0oi.I0000O((IllOOo00lI) obj3, null, false, null, null, null, i1i11ioIIlOl.I0000O, iloI0lOlll1, 805306368, 510);
                                break;
                            }
                        case 1:
/* 311 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 317 */                   int iIntValue2 = ((Integer) obj2).intValue();
/* 331 */                   if (!iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
/* 376 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 333 */                       boolean zI000OOo1O2 = iloI0lOlll12.I000OOo1O(o1ol100o0O);
/* 337 */                       Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                                Object obj4 = objI00O0i0ii2;
/* 341 */                       if (zI000OOo1O2 || objI00O0i0ii2 == iOO0o0I1l) {
/* 347 */                           Io1o0l0iOl io1o0l0iOl2 = new Io1o0l0iOl(i2);
/* 350 */                           io1o0l0iOl2.I00iiI = o1ol100o0O;
/* 352 */                           VarHandle.storeStoreFence();
/* 355 */                           iloI0lOlll12.I00iio(io1o0l0iOl2);
                                    obj4 = io1o0l0iOl2;
                                }
/* 372 */                       iOiO0o0oi.I0000O((IllOOo00lI) obj4, null, false, null, null, null, i1i11ioIIlOl.I0000oI00, iloI0lOlll12, 805306368, 510);
                                break;
                            }
                        case 2:
/* 89 */                    long jLongValue = ((Long) obj2).longValue();
/* 93 */                    OOli1O oOli1O = o1ol100o0O.I000OOo1O;
/* 95 */                    O1oIOiI11o0 o1oIOiI11o0I000OiO = O1ol100o0O.I000OiO(jLongValue, (String) obj);
/* 99 */                    String str = o1oIOiI11o0I000OiO.I00000oIO;
/* 115 */                   OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) IOOi0Ool1i.I00II0Ol1O0l(o1ol100o0O.I001i1lo1io(Collections.singleton("image_gen")));
/* 117 */                   if (oloIl1l1oOii != null) {
/* 121 */                       ArrayList arrayList = oloIl1l1oOii.I000OiO;
/* 123 */                       Iterator it = arrayList.iterator();
                                while (true) {
/* 131 */                           if (it.hasNext()) {
/* 137 */                               O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) it.next();
/* 145 */                               if (!O0000Ioio00.I0000O(o1oIOiI11o0.I00000oIO, str) || !o1oIOiI11o0.I00IOO) {
/* 152 */                                   i3++;
                                        }
                                    } else {
/* 155 */                               i3 = -1;
                                    }
                                }
/* 156 */                       if (i3 >= 0) {
/* 158 */                           arrayList.remove(i3);
                                }
/* 161 */                       arrayList.add(o1oIOiI11o0I000OiO);
/* 164 */                       o1oIOiI11o0I000OiO.I0000Il00O();
/* 177 */                       oloIl1l1oOii.I0010o.setValue(Long.valueOf(System.currentTimeMillis()));
/* 180 */                       OlO0OIIl1 olO0OIIl1 = oOli1O.I00iOIl;
/* 192 */                       LinkedHashMap linkedHashMap = new LinkedHashMap(((O1oiOloOo) olO0OIIl1.getValue()).I0000Il00O);
/* 205 */                       LinkedHashMap linkedHashMap2 = new LinkedHashMap(((O1oiOloOo) olO0OIIl1.getValue()).I0000O);
/* 223 */                       linkedHashMap.put(str, new O1oIo0iI00(ModelDownloadStatusType.SUCCEEDED, jLongValue, jLongValue, null, 0L, 0L, 56));
/* 233 */                       linkedHashMap2.put(str, new O1oOil(O1oOl0.I00iOIl));
/* 236 */                       OlO0OIIl1 olO0OIIl12 = o1ol100o0O.I000O01llI0;
                                while (true) {
/* 238 */                           Object value = olO0OIIl12.getValue();
/* 293 */                           LinkedHashMap linkedHashMap3 = linkedHashMap;
/* 294 */                           LinkedHashMap linkedHashMap4 = linkedHashMap2;
/* 303 */                           if (olO0OIIl12.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) olO0OIIl1.getValue(), IOOi0Ool1i.I00iIi0i1o(((O1oiOloOo) olO0OIIl1.getValue()).I00000oIO), null, linkedHashMap3, linkedHashMap4, false, null, null, null, 0L, System.currentTimeMillis(), null, 0.0f, null, null, false, 32242))) {
                                        break;
                                    } else {
/* 306 */                               linkedHashMap = linkedHashMap3;
/* 307 */                               linkedHashMap2 = linkedHashMap4;
                                    }
                                }
                            }
                            break;
                        case 3:
/* 77 */                    o1ol100o0O.I0001Ioi1lo(((Long) obj2).longValue(), (String) obj);
                            break;
                        case 4:
/* 61 */                    o1ol100o0O.I0000oI00(((Long) obj2).longValue(), (String) obj);
                            break;
                        case 5:
/* 45 */                    o1ol100o0O.I0000oI00(((Long) obj2).longValue(), (String) obj);
                            break;
                        default:
/* 29 */                    o1ol100o0O.I0001Ioi1lo(((Long) obj2).longValue(), (String) obj);
                            break;
                    }
/* 32 */            return ooiIlOl1iI;
                }
            }
