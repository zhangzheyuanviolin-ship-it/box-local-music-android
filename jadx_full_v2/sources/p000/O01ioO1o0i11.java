            package p000;

            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            import java.util.function.BiFunction;
            import java.util.function.Function;
            
            @Oili0O(with = O01l1I.class)
/* 7 */     public final class O01ioO1o0i11 extends O01O0o1iI implements Map<String, O01O0o1iI>, O0IlIoi {
                public static final O01io1l Companion = new O01io1l();
                public final Map I00iOIl;

                public O01ioO1o0i11(Map map) {
/* 4 */             this.I00iOIl = map;
                }

                @Override
                public final void clear() {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final O01O0o1iI compute(String str, BiFunction<? super String, ? super O01O0o1iI, ? extends O01O0o1iI> biFunction) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final O01O0o1iI computeIfAbsent(String str, Function<? super String, ? extends O01O0o1iI> function) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final O01O0o1iI computeIfPresent(String str, BiFunction<? super String, ? super O01O0o1iI, ? extends O01O0o1iI> biFunction) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 3 */             if (!(obj instanceof String)) {
/* 5 */                 return false;
                    }
/* 11 */            return this.I00iOIl.containsKey((String) obj);
                }

                @Override
                public final boolean containsValue(Object obj) {
/* 3 */             if (!(obj instanceof O01O0o1iI)) {
/* 5 */                 return false;
                    }
/* 11 */            return this.I00iOIl.containsValue((O01O0o1iI) obj);
                }

                @Override
                public final Set<Map.Entry<String, O01O0o1iI>> entrySet() {
/* 3 */             return this.I00iOIl.entrySet();
                }

                @Override
                public final boolean equals(Object obj) {
/* 3 */             return O0000Ioio00.I0000O(this.I00iOIl, obj);
                }

                @Override
                public final O01O0o1iI get(Object obj) {
/* 3 */             if (!(obj instanceof String)) {
/* 5 */                 return null;
                    }
/* 15 */            return (O01O0o1iI) this.I00iOIl.get((String) obj);
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iOIl.isEmpty();
                }

                @Override
                public final Set<String> keySet() {
/* 3 */             return this.I00iOIl.keySet();
                }

                @Override
                public final O01O0o1iI merge(String str, O01O0o1iI o01O0o1iI, BiFunction<? super O01O0o1iI, ? super O01O0o1iI, ? extends O01O0o1iI> biFunction) {
/* 215 */           throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final O01O0o1iI put(String str, O01O0o1iI o01O0o1iI) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void putAll(Map<? extends String, ? extends O01O0o1iI> map) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final O01O0o1iI putIfAbsent(String str, O01O0o1iI o01O0o1iI) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final O01O0o1iI remove(Object obj) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final O01O0o1iI replace(String str, O01O0o1iI o01O0o1iI) {
/* 89 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void replaceAll(BiFunction<? super String, ? super O01O0o1iI, ? extends O01O0o1iI> biFunction) {
/* 49 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.size();
                }

                public final String toString() {
/* 25 */            return IOOi0Ool1i.I00IlilI0i0i(this.I00iOIl.entrySet(), ",", "{", "}", new IoI0IiI0(22), 24);
                }

                @Override
                public final Collection<O01O0o1iI> values() {
/* 3 */             return this.I00iOIl.values();
                }

                @Override
/* 8 */         public final boolean remove(Object obj, Object obj2) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
/* 8 */         public final boolean replace(String str, O01O0o1iI o01O0o1iI, O01O0o1iI o01O0o1iI2) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
