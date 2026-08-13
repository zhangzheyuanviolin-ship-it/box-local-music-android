            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public abstract class iO1o1Io1 {
                public static final List I00000oIO(ArrayList arrayList) {
/* 1 */             int size = arrayList.size();
                    return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(IOOi0Ool1i.I001lllioOl(arrayList)) : Il01100l.I00iOIl;
                }

                public static final Map I00000oOI(Map map) {
/* 1 */             int size = map.size();
/* 5 */             if (size == 0) {
/* 45 */                return Il011I1OiO0I.I00iOIl;
                    }
/* 8 */             if (size != 1) {
/* 15 */                return Collections.unmodifiableMap(new LinkedHashMap(map));
                    }
/* 30 */            Map.Entry entry = (Map.Entry) IOOi0Ool1i.I001lIiIIo1O(map.entrySet());
/* 40 */            return Collections.singletonMap(entry.getKey(), entry.getValue());
                }
            }
