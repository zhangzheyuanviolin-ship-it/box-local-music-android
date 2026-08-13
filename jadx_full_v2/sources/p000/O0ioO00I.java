            package p000;

            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            
            public final class O0ioO00I implements Map {
                public OOoli1l I00iOIl;

                @Override
                public final void clear() {
/* 29 */            throw new UnsupportedOperationException("Dagger map bindings are immutable");
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 3 */             if (obj instanceof Class) {
/* 13 */                return this.I00iOIl.containsKey(((Class) obj).getName());
                    }
/* 20 */            I000II.I000iOII("Key must be a class");
/* 23 */            return false;
                }

                @Override
                public final boolean containsValue(Object obj) {
/* 3 */             return this.I00iOIl.containsValue(obj);
                }

                @Override
                public final Set entrySet() {
/* 29 */            throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
                }

                @Override
                public final Object get(Object obj) {
/* 3 */             if (obj instanceof Class) {
/* 13 */                return this.I00iOIl.get(((Class) obj).getName());
                    }
/* 20 */            I000II.I000iOII("Key must be a class");
/* 23 */            return null;
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iOIl.isEmpty();
                }

                @Override
                public final Set keySet() {
/* 29 */            throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 89 */            throw new UnsupportedOperationException("Dagger map bindings are immutable");
                }

                @Override
                public final void putAll(Map map) {
/* 49 */            throw new UnsupportedOperationException("Dagger map bindings are immutable");
                }

                @Override
                public final Object remove(Object obj) {
/* 49 */            throw new UnsupportedOperationException("Dagger map bindings are immutable");
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.I00iio;
                }

                @Override
                public final Collection values() {
/* 1 */             OOoli1l oOoli1l = this.I00iOIl;
/* 5 */             OOolII0o oOolII0o = (OOolII0o) oOoli1l.I00io1l;
/* 7 */             if (oOolII0o != null) {
/* 29 */                return oOolII0o;
                    }
/* 16 */            OOolII0o oOolII0o2 = new OOolII0o(oOoli1l.I00iiO, 1, oOoli1l.I00iio);
/* 19 */            oOoli1l.I00io1l = oOolII0o2;
/* 29 */            return oOolII0o2;
                }
            }
