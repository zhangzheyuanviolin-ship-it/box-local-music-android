            package p000;

            import java.util.HashMap;
            import java.util.Map;
            
            public final class I1oiIIi0i1l extends InheritableThreadLocal {
                @Override
                public final Object childValue(Object obj) {
/* 1 */             Map map = (Map) obj;
/* 3 */             if (map == null) {
/* 5 */                 return null;
                    }
/* 9 */             return new HashMap(map);
                }
            }
