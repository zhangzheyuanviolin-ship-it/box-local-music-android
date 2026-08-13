            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            import java.util.function.BiFunction;
            import java.util.function.Function;
            
/* 7 */     public final class O1OiIoo1 implements Map, O0IlIoi {
                public OI10I1IoI0Ol I00iOIl;
                public Il0l1iO11i I00iiI;
                public Il0l1iO11i I00iiO;
                public Oli1ooI0oi I00iio;

                @Override
                public final void clear() {
/* 20 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final Object compute(Object obj, BiFunction biFunction) {
/* 37 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final Object computeIfAbsent(Object obj, Function function) {
/* 37 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final Object computeIfPresent(Object obj, BiFunction biFunction) {
/* 37 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 3 */             return this.I00iOIl.I0000Il00O(obj);
                }

                @Override
                public final boolean containsValue(Object obj) {
/* 3 */             return this.I00iOIl.I0000O(obj);
                }

                @Override
                public final Set entrySet() {
/* 1 */             Il0l1iO11i il0l1iO11i = this.I00iiI;
/* 3 */             if (il0l1iO11i != null) {
/* 5 */                 return il0l1iO11i;
                    }
/* 8 */             OI10I1IoI0Ol oI10I1IoI0Ol = this.I00iOIl;
/* 11 */            Il0l1iO11i il0l1iO11i2 = new Il0l1iO11i(0);
/* 14 */            il0l1iO11i2.I00iiI = oI10I1IoI0Ol;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            this.I00iiI = il0l1iO11i2;
/* 55 */            return il0l1iO11i2;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || O1OiIoo1.class != obj.getClass()) {
/* 27 */                return false;
                    }
/* 22 */            return this.I00iOIl.equals(((O1OiIoo1) obj).I00iOIl);
                }

                @Override
                public final Object get(Object obj) {
/* 3 */             return this.I00iOIl.I000II(obj);
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iOIl.I000OOo1O();
                }

                @Override
                public final Set keySet() {
/* 1 */             Il0l1iO11i il0l1iO11i = this.I00iiO;
/* 3 */             if (il0l1iO11i != null) {
/* 5 */                 return il0l1iO11i;
                    }
/* 8 */             OI10I1IoI0Ol oI10I1IoI0Ol = this.I00iOIl;
/* 11 */            Il0l1iO11i il0l1iO11i2 = new Il0l1iO11i(1);
/* 14 */            il0l1iO11i2.I00iiI = oI10I1IoI0Ol;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            this.I00iiO = il0l1iO11i2;
/* 55 */            return il0l1iO11i2;
                }

                @Override
                public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
/* 98 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
                public final Object putIfAbsent(Object obj, Object obj2) {
/* 37 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final Object remove(Object obj) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final Object replace(Object obj, Object obj2) {
/* 37 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final void replaceAll(BiFunction biFunction) {
/* 29 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.I0000oI00;
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.toString();
                }

                @Override
                public final Collection values() {
/* 1 */             Oli1ooI0oi oli1ooI0oi = this.I00iio;
/* 3 */             if (oli1ooI0oi != null) {
/* 5 */                 return oli1ooI0oi;
                    }
/* 8 */             OI10I1IoI0Ol oI10I1IoI0Ol = this.I00iOIl;
/* 11 */            Oli1ooI0oi oli1ooI0oi2 = new Oli1ooI0oi(1);
/* 14 */            oli1ooI0oi2.I00iiI = oI10I1IoI0Ol;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            this.I00iio = oli1ooI0oi2;
/* 55 */            return oli1ooI0oi2;
                }

                @Override
/* 8 */         public final boolean remove(Object obj, Object obj2) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
/* 8 */         public final boolean replace(Object obj, Object obj2, Object obj3) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
