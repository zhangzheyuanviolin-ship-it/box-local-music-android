            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class iOi110 {
                public static final ArrayList I00000oIO(List list, List list2, float f) {
/* 9 */             int iMax = Math.max(list.size(), list2.size());
/* 15 */            ArrayList arrayList = new ArrayList(iMax);
/* 19 */            for (int i = 0; i < iMax; i++) {
/* 65 */                arrayList.add(IOOiio0i.I00000oIO(iiO01ll11o1l.I000II(f, ((IOOiio0i) list.get(Math.min(i, list.size() - 1))).I00000oIO, ((IOOiio0i) list2.get(Math.min(i, list2.size() - 1))).I00000oIO)));
                    }
/* 98 */            return arrayList;
                }

                public static final ArrayList I00000oOI(List list, List list2, float f) {
/* 1 */             if (list2 == null || list == null) {
/* 81 */                return null;
                    }
/* 14 */            int iMax = Math.max(list.size(), list2.size());
/* 20 */            ArrayList arrayList = new ArrayList(iMax);
/* 24 */            for (int i = 0; i < iMax; i++) {
/* 74 */                arrayList.add(Float.valueOf(l1I1Il.I00000oOI(((Number) list.get(Math.min(i, list.size() - 1))).floatValue(), ((Number) list2.get(Math.min(i, list2.size() - 1))).floatValue(), f)));
                    }
/* 80 */            return arrayList;
                }

                public static final long I0000Il00O(float f, long j, long j2) {
                    return (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && (((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) ? l1ioo00OI0oo.I00000oOI(f, j, j2) : f < 0.5f ? j : j2;
                }
            }
