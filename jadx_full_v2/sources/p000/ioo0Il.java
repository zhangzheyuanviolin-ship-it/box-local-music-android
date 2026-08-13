            package p000;

            import java.util.ArrayList;
            
            public abstract class ioo0Il {
                public static final Object I00000oIO(Object obj, Object obj2) {
/* 1 */             if (obj == null) {
/* 3 */                 return obj2;
                    }
/* 6 */             if (obj instanceof ArrayList) {
/* 11 */                ((ArrayList) obj).add(obj2);
/* 14 */                return obj;
                    }
/* 18 */            ArrayList arrayList = new ArrayList(4);
/* 21 */            arrayList.add(obj);
/* 24 */            arrayList.add(obj2);
/* 89 */            return arrayList;
                }
            }
