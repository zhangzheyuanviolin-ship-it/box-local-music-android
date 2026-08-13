            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            public abstract class I01Ii0ll10O implements Map, O0IlIoi {
                public abstract Set I00000oIO();

                public abstract Set I00000oOI();

                public abstract int I0000Il00O();

                public abstract Collection I0000O();

                @Override
                public final void clear() {
/* 20 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean containsValue(Object obj) {
/* 1 */             Set setI00000oIO = I00000oIO();
/* 9 */             if (setI00000oIO.isEmpty()) {
/* 40 */                return false;
                    }
/* 12 */            Iterator it = setI00000oIO.iterator();
/* 20 */            while (it.hasNext()) {
/* 36 */                if (O0000Ioio00.I0000O(((Map.Entry) it.next()).getValue(), obj)) {
/* 38 */                    return true;
                        }
                    }
/* 40 */            return false;
                }

                @Override
                public final Set entrySet() {
/* 1 */             return I00000oIO();
                }

                @Override
                public boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 90 */                return true;
                    }
/* 6 */             if (!(obj instanceof Map)) {
/* 88 */                return false;
                    }
/* 13 */            Map map = (Map) obj;
/* 19 */            if (I0000Il00O() != map.size()) {
/* 88 */                return false;
                    }
/* 22 */            Set<Map.Entry> setEntrySet = map.entrySet();
/* 30 */            if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
/* 90 */                return true;
                    }
/* 50 */            for (Map.Entry entry : setEntrySet) {
/* 58 */                if (entry == null) {
/* 88 */                    return false;
                        }
/* 61 */                Object key = entry.getKey();
/* 65 */                Object value = entry.getValue();
/* 69 */                Object obj2 = get(key);
/* 77 */                if (!O0000Ioio00.I0000O(value, obj2)) {
/* 88 */                    return false;
                        }
/* 80 */                if (obj2 == null && !containsKey(key)) {
/* 88 */                    return false;
                        }
                    }
/* 90 */            return true;
                }

                @Override
                public int hashCode() {
/* 5 */             return I00000oIO().hashCode();
                }

                @Override
                public final boolean isEmpty() {
                    return I0000Il00O() == 0;
                }

                @Override
                public final Set keySet() {
/* 1 */             return I00000oOI();
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
/* 1 */             return I0000Il00O();
                }

                public final String toString() {
/* 1 */             Set setI00000oIO = I00000oIO();
/* 8 */             IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(3);
/* 11 */            iIOIlOoI111.I00iiI = this;
/* 13 */            VarHandle.storeStoreFence();
/* 24 */            return IOOi0Ool1i.I00IlilI0i0i(setI00000oIO, ", ", "{", "}", iIOIlOoI111, 24);
                }

                @Override
                public final Collection values() {
/* 1 */             return I0000O();
                }
            }
