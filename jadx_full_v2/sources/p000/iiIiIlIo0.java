            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class iiIiIlIo0 extends iOo0iiol {
                public transient iOlloIll11 I00o0iI0io1;
                public transient Object[] I00o0l1o1o0;
                public transient int I00o101lO;

                @Override
                public final int I000o00OoI0I(Object[] objArr) {
/* 5 */             return I001i1O0Ol().I000o00OoI0I(objArr);
                }

                @Override
                public final boolean contains(Object obj) {
/* 4 */             if (obj instanceof Map.Entry) {
/* 6 */                 Map.Entry entry = (Map.Entry) obj;
/* 8 */                 Object key = entry.getKey();
/* 12 */                Object value = entry.getValue();
/* 16 */                if (value != null && value.equals(this.I00o0iI0io1.get(key))) {
/* 30 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public final Iterator iterator() {
/* 6 */             return I001i1O0Ol().listIterator(0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o101lO;
                }
            }
