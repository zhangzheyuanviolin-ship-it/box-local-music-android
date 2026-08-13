            package p000;

            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class I0O10ll implements Function1 {
                public final int I00iOIl;
                public String I00iiI;
                public OI10i0Il I00iiO;
                public OI10i0Il I00iio;

                @Override
                public final Object invoke(Object obj) {
                    Map mapSingletonMap;
                    Map mapSingletonMap2;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 59 */                    String str = this.I00iiI;
/* 61 */                    OI10i0Il oI10i0Il = this.I00iiO;
/* 63 */                    OI10i0Il oI10i0Il2 = this.I00iio;
/* 65 */                    String str2 = (String) obj;
/* 77 */                    oI10i0Il.setValue(Oio0lI.I00000oOI((Set) oI10i0Il.getValue(), str));
/* 84 */                    Map map = (Map) oI10i0Il2.getValue();
/* 90 */                    if (map.isEmpty()) {
/* 92 */                        mapSingletonMap = Collections.singletonMap(str, str2);
                            } else {
/* 99 */                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
/* 102 */                       linkedHashMap.put(str, str2);
/* 105 */                       mapSingletonMap = linkedHashMap;
                            }
/* 106 */                   oI10i0Il2.setValue(mapSingletonMap);
                            break;
                        default:
/* 8 */                     String str3 = this.I00iiI;
/* 10 */                    OI10i0Il oI10i0Il3 = this.I00iiO;
/* 12 */                    OI10i0Il oI10i0Il4 = this.I00iio;
/* 14 */                    String str4 = (String) obj;
/* 26 */                    oI10i0Il3.setValue(Oio0lI.I00000oOI((Set) oI10i0Il3.getValue(), str3));
/* 33 */                    Map map2 = (Map) oI10i0Il4.getValue();
/* 39 */                    if (map2.isEmpty()) {
/* 41 */                        mapSingletonMap2 = Collections.singletonMap(str3, str4);
                            } else {
/* 48 */                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
/* 51 */                        linkedHashMap2.put(str3, str4);
/* 54 */                        mapSingletonMap2 = linkedHashMap2;
                            }
/* 55 */                    oI10i0Il4.setValue(mapSingletonMap2);
                            break;
                    }
/* 58 */            return ooiIlOl1iI;
                }
            }
