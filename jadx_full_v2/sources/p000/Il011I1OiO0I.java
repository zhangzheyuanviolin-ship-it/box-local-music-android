            package p000;

            import java.io.Serializable;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            
/* 7 */     public final class Il011I1OiO0I implements Map, Serializable, O0IlIoi {
                public static final Il011I1OiO0I I00iOIl = new Il011I1OiO0I();

                @Override
                public final void clear() {
/* 20 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 1 */             return false;
                }

                @Override
                public final boolean containsValue(Object obj) {
/* 1 */             return false;
                }

                @Override
                public final Set entrySet() {
/* 1 */             return Il01llIol0.I00iOIl;
                }

                @Override
                public final boolean equals(Object obj) {
                    return (obj instanceof Map) && ((Map) obj).isEmpty();
                }

                @Override
                public final Object get(Object obj) {
/* 1 */             return null;
                }

                @Override
                public final int hashCode() {
/* 1 */             return 0;
                }

                @Override
                public final boolean isEmpty() {
/* 1 */             return true;
                }

                @Override
                public final Set keySet() {
/* 1 */             return Il01llIol0.I00iOIl;
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 37 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void putAll(Map map) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final Object remove(Object obj) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
/* 1 */             return 0;
                }

                public final String toString() {
/* 1 */             return "{}";
                }

                @Override
                public final Collection values() {
/* 1 */             return Il01100l.I00iOIl;
                }

                @Override
/* 8 */         public final boolean remove(Object obj, Object obj2) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
