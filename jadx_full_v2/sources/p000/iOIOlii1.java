            package p000;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            
            public abstract class iOIOlii1 {
                public static Set I00000oIO(String... strArr) {
                    return strArr.length == 0 ? Collections.EMPTY_SET : Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
                }

                public static Map I00000oOI(Map map, Set set) {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 18 */            for (Map.Entry entry : map.entrySet()) {
/* 30 */                String str = (String) entry.getKey();
/* 36 */                String str2 = (String) entry.getValue();
/* 40 */                lII1IoI.I0000Il00O("additional parameter keys cannot be null", str);
/* 45 */                lII1IoI.I0000Il00O("additional parameter values cannot be null", str2);
/* 52 */                if (set.contains(str)) {
/* 66 */                    I000II.I000iOII(IlIi0I0.I000lI("Parameter ", str, " is directly supported via the authorization request builder, use the builder method instead"));
/* 69 */                    return null;
                        }
/* 54 */                linkedHashMap.put(str, str2);
                    }
/* 71 */            return Collections.unmodifiableMap(linkedHashMap);
                }
            }
