            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.TreeMap;
            
/* 10 */    public final class l1oo00Iio10 extends iIIoIiOoOoiO {
                public final int I00iiO;
                public Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public l1oo00Iio10(lOiIIOo loiiioo, i000IO i000io) {
/* 8 */             super("getValue");
/* 2 */             this.I00iiO = 1;
/* 4 */             this.I00iio = i000io;
                }

                @Override
                public final iO0iIIoO11 I00000oIO(OillOo0 oillOo0, List list) {
                    TreeMap treeMap;
/* 1 */             int i = this.I00iiO;
/* 4 */             String str = this.I00iOIl;
/* 9 */             iOOl1i1 iool1i1 = iO0iIIoO11.I00Ol1ll1;
/* 11 */            String str2 = null;
                    switch (i) {
                        case 0:
/* 305 */                   ll00I0ii.I00000oIO(str, 3, list);
/* 322 */                   String strZzc = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) list.get(0)).zzc();
/* 330 */                   iO0iIIoO11 io0iiioo11 = (iO0iIIoO11) list.get(1);
/* 334 */                   OoOlO1O0o ooOlO1O0o = (OoOlO1O0o) oillOo0.I00iiO;
/* 352 */                   long jI000O01llI0 = (long) ll00I0ii.I000O01llI0(ooOlO1O0o.I000OiO(oillOo0, io0iiioo11).zzd().doubleValue());
/* 359 */                   iO0iIIoO11 io0iiioo11I000OiO = ooOlO1O0o.I000OiO(oillOo0, (iO0iIIoO11) list.get(2));
/* 376 */                   HashMap mapI000OiO = io0iiioo11I000OiO instanceof iIlIIIl11I1I ? ll00I0ii.I000OiO((iIlIIIl11I1I) io0iiioo11I000OiO) : new HashMap();
/* 381 */                   OlilOlOiI olilOlOiI = (OlilOlOiI) this.I00iio;
/* 383 */                   olilOlOiI.getClass();
/* 388 */                   HashMap map = new HashMap();
/* 403 */                   for (String str3 : mapI000OiO.keySet()) {
/* 415 */                       HashMap map2 = ((i1IO0oi1I) olilOlOiI.I00iiI).I0000Il00O;
/* 437 */                       map.put(str3, i1IO0oi1I.I00000oOI(map2.containsKey(str3) ? map2.get(str3) : null, str3, mapI000OiO.get(str3)));
                            }
/* 450 */                   ((ArrayList) olilOlOiI.I00iio).add(new i1IO0oi1I(strZzc, jI000O01llI0, map));
/* 453 */                   return iool1i1;
                        case 1:
/* 226 */                   ll00I0ii.I00000oIO("getValue", 2, list);
/* 239 */                   iO0iIIoO11 io0iiioo11I000OiO2 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) list.get(0));
/* 253 */                   iO0iIIoO11 io0iiioo11I000OiO3 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) list.get(1));
/* 257 */                   String strZzc2 = io0iiioo11I000OiO2.zzc();
/* 263 */                   i000IO i000io = (i000IO) this.I00iio;
/* 279 */                   Map map3 = (Map) ((l0l1ol11) i000io.I00iiO).I00iio.get((String) i000io.I00iiI);
/* 281 */                   if (map3 != null && map3.containsKey(strZzc2)) {
/* 295 */                       str2 = (String) map3.get(strZzc2);
                            }
                            return str2 != null ? new iOO00I0O(str2) : io0iiioo11I000OiO3;
                        case 2:
/* 223 */                   return iool1i1;
                        case 3:
                            try {
/* 219 */                       return ll01OOOOii.I00000oIO(((l0il00l0iI) this.I00iio).call());
                            } catch (Exception unused) {
/* 223 */                       return iool1i1;
                            }
                        default:
/* 15 */                    ll00I0ii.I00000oIO(str, 3, list);
/* 32 */                    ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) list.get(0)).zzc();
/* 39 */                    iO0iIIoO11 io0iiioo112 = (iO0iIIoO11) list.get(1);
/* 43 */                    OoOlO1O0o ooOlO1O0o2 = (OoOlO1O0o) oillOo0.I00iiO;
/* 45 */                    iO0iIIoO11 io0iiioo11I000OiO4 = ooOlO1O0o2.I000OiO(oillOo0, io0iiioo112);
/* 51 */                    if (io0iiioo11I000OiO4 instanceof iIolollI1) {
/* 59 */                        iO0iIIoO11 io0iiioo11I000OiO5 = ooOlO1O0o2.I000OiO(oillOo0, (iO0iIIoO11) list.get(2));
/* 65 */                        if (io0iiioo11I000OiO5 instanceof iIlIIIl11I1I) {
/* 67 */                            iIlIIIl11I1I iiliiil11i1i = (iIlIIIl11I1I) io0iiioo11I000OiO5;
/* 69 */                            HashMap map4 = iiliiil11i1i.I00iOIl;
/* 77 */                            if (map4.containsKey("type")) {
/* 83 */                                String strZzc3 = iiliiil11i1i.I0000O("type").zzc();
/* 112 */                               int iI000II = map4.containsKey("priority") ? ll00I0ii.I000II(iiliiil11i1i.I0000O("priority").zzd().doubleValue()) : 1000;
/* 116 */                               OoOlO1O0o ooOlO1O0o3 = (OoOlO1O0o) this.I00iio;
/* 118 */                               iIolollI1 iiololli1 = (iIolollI1) io0iiioo11I000OiO4;
/* 120 */                               ooOlO1O0o3.getClass();
/* 129 */                               if ("create".equals(strZzc3)) {
/* 133 */                                   treeMap = (TreeMap) ooOlO1O0o3.I00iiO;
                                        } else if ("edit".equals(strZzc3)) {
/* 146 */                                   treeMap = (TreeMap) ooOlO1O0o3.I00iiI;
                                        } else {
/* 187 */                                   I000II.I001IO000("Unknown callback type: ".concat(String.valueOf(strZzc3)));
                                        }
/* 156 */                               if (treeMap.containsKey(Integer.valueOf(iI000II))) {
/* 168 */                                   iI000II = ((Integer) treeMap.lastKey()).intValue() + 1;
                                        }
/* 173 */                               treeMap.put(Integer.valueOf(iI000II), iiololli1);
/* 210 */                               return iool1i1;
                                    }
/* 194 */                           I000II.I000iOII("Undefined rule type");
                                } else {
/* 200 */                           I000II.I000iOII("Invalid callback params");
                                }
                            } else {
/* 206 */                       I000II.I000iOII("Invalid callback type");
                            }
/* 11 */                    return null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public l1oo00Iio10(String str, int i) {
                    super(str);
/* 12 */            this.I00iiO = i;
                }
            }
