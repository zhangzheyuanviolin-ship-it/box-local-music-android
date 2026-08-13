            package p000;

            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1iIIII1 {
                public static final ArrayList I00000oIO(Map map, Function1 function1) {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 18 */            for (Map.Entry entry : map.entrySet()) {
/* 30 */                OI1Oi1 oI1Oi1 = (OI1Oi1) entry.getValue();
/* 46 */                if (!(oI1Oi1 != null ? Boolean.valueOf(oI1Oi1.I00000oOI) : null).booleanValue() && !oI1Oi1.I0000Il00O) {
/* 60 */                    linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 64 */            Set setKeySet = linkedHashMap.keySet();
/* 72 */            ArrayList arrayList = new ArrayList();
/* 83 */            for (Object obj : setKeySet) {
/* 102 */               if (((Boolean) function1.invoke((String) obj)).booleanValue()) {
/* 104 */                   arrayList.add(obj);
                        }
                    }
/* 332 */           return arrayList;
                }
            }
