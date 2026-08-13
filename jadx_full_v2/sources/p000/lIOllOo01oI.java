            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            
            public final class lIOllOo01oI extends iIlIIIl11I1I {
                public OlilOlOiI I00iiI;

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override
                public final iO0iIIoO11 I00000oOI(String str, OillOo0 oillOo0, ArrayList arrayList) {
/* 1 */             OlilOlOiI olilOlOiI = this.I00iiI;
                    switch (str.hashCode()) {
                        case 21624207:
/* 293 */                   if (str.equals("getEventName")) {
/* 295 */                       ll00I0ii.I00000oIO("getEventName", 0, arrayList);
/* 306 */                       return new iOO00I0O(((i1IO0oi1I) olilOlOiI.I00iiO).I00000oIO);
                            }
                            break;
                        case 45521504:
/* 265 */                   if (str.equals("getTimestamp")) {
/* 267 */                       ll00I0ii.I00000oIO("getTimestamp", 0, arrayList);
/* 283 */                       return new iII01l(Double.valueOf(((i1IO0oi1I) olilOlOiI.I00iiO).I00000oOI));
                            }
                            break;
                        case 146575578:
/* 215 */                   if (str.equals("getParamValue")) {
/* 217 */                       ll00I0ii.I00000oIO("getParamValue", 1, arrayList);
/* 234 */                       String strZzc = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzc();
/* 242 */                       HashMap map = ((i1IO0oi1I) olilOlOiI.I00iiO).I0000Il00O;
/* 254 */                       return ll01OOOOii.I00000oIO(map.containsKey(strZzc) ? map.get(strZzc) : null);
                            }
                            break;
                        case 700587132:
/* 160 */                   if (str.equals("getParams")) {
/* 162 */                       ll00I0ii.I00000oIO("getParams", 0, arrayList);
/* 169 */                       HashMap map2 = ((i1IO0oi1I) olilOlOiI.I00iiO).I0000Il00O;
/* 173 */                       iIlIIIl11I1I iiliiil11i1i = new iIlIIIl11I1I();
/* 188 */                       for (String str2 : map2.keySet()) {
/* 204 */                           iiliiil11i1i.I0000oI00(str2, ll01OOOOii.I00000oIO(map2.get(str2)));
                                }
/* 208 */                       return iiliiil11i1i;
                            }
                            break;
                        case 920706790:
/* 88 */                    if (str.equals("setParamValue")) {
/* 91 */                        ll00I0ii.I00000oIO("setParamValue", 2, arrayList);
/* 108 */                       String strZzc2 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0)).zzc();
/* 122 */                       iO0iIIoO11 io0iiioo11I000OiO = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
/* 128 */                       i1IO0oi1I i1io0oi1i = (i1IO0oi1I) olilOlOiI.I00iiO;
/* 130 */                       Object objI000OOo1O = ll00I0ii.I000OOo1O(io0iiioo11I000OiO);
/* 134 */                       HashMap map3 = i1io0oi1i.I0000Il00O;
/* 136 */                       if (objI000OOo1O == null) {
/* 138 */                           map3.remove(strZzc2);
/* 141 */                           return io0iiioo11I000OiO;
                                }
/* 150 */                       map3.put(strZzc2, i1IO0oi1I.I00000oOI(map3.get(strZzc2), strZzc2, objI000OOo1O));
/* 153 */                       return io0iiioo11I000OiO;
                            }
                            break;
                        case 1570616835:
/* 21 */                    if (str.equals("setEventName")) {
/* 23 */                        ll00I0ii.I00000oIO("setEventName", 1, arrayList);
/* 36 */                        iO0iIIoO11 io0iiioo11I000OiO2 = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
/* 46 */                        if (iO0iIIoO11.I00Ol1ll1.equals(io0iiioo11I000OiO2) || iO0iIIoO11.I00OloOo.equals(io0iiioo11I000OiO2)) {
/* 78 */                            I000II.I000iOII("Illegal event name");
/* 7 */                             return null;
                                }
/* 64 */                        ((i1IO0oi1I) olilOlOiI.I00iiO).I00000oIO = io0iiioo11I000OiO2.zzc();
/* 72 */                        return new iOO00I0O(io0iiioo11I000OiO2.zzc());
                            }
                            break;
                    }
/* 310 */           return super.I00000oOI(str, oillOo0, arrayList);
                }
            }
