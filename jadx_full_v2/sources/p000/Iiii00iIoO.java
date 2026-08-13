            package p000;

            import android.os.Bundle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public final class Iiii00iIoO implements OiIoOil {
                public final int I00000oIO;
                public Object I00000oOI;

                public Iiii00iIoO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Bundle I00000oIO() {
                    OIoi0IIoi[] oIoi0IIoiArr;
/* 1 */             int i = this.I00000oIO;
/* 3 */             Object obj = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 197 */                   Map mapI0000O = ((OiIl0IIi0) obj).I0000O();
/* 203 */                   Bundle bundle = new Bundle();
/* 218 */                   for (Map.Entry entry : mapI0000O.entrySet()) {
/* 230 */                       String str = (String) entry.getKey();
/* 236 */                       List list = (List) entry.getValue();
/* 253 */                       bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                            }
/* 257 */                   return bundle;
                        case 1:
/* 190 */                   return ((Ill1OlOOl) obj).I00OIl();
                        default:
/* 8 */                     I1ii1o0 i1ii1o0 = (I1ii1o0) obj;
/* 30 */                    for (Map.Entry entry2 : O1Oii0O0loo.I000iOII((LinkedHashMap) i1ii1o0.I00ilI0I1).entrySet()) {
/* 54 */                        i1ii1o0.I00IoIO0lI((String) entry2.getKey(), ((OlO0OIIl1) entry2.getValue()).getValue());
                            }
/* 78 */                    for (Map.Entry entry3 : O1Oii0O0loo.I000iOII((LinkedHashMap) i1ii1o0.I00iiO).entrySet()) {
/* 102 */                       i1ii1o0.I00IoIO0lI((String) entry3.getKey(), ((OiIoOil) entry3.getValue()).I00000oIO());
                            }
/* 108 */                   LinkedHashMap linkedHashMap = (LinkedHashMap) i1ii1o0.I00iiI;
/* 115 */                   if (linkedHashMap.isEmpty()) {
/* 117 */                       oIoi0IIoiArr = new OIoi0IIoi[0];
                            } else {
/* 126 */                       ArrayList arrayList = new ArrayList(linkedHashMap.size());
/* 141 */                       for (Map.Entry entry4 : linkedHashMap.entrySet()) {
/* 164 */                           arrayList.add(new OIoi0IIoi((String) entry4.getKey(), entry4.getValue()));
                                }
/* 174 */                       oIoi0IIoiArr = (OIoi0IIoi[]) arrayList.toArray(new OIoi0IIoi[0]);
                            }
/* 183 */                   return iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(oIoi0IIoiArr, oIoi0IIoiArr.length));
                    }
                }
            }
