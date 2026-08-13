            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class ii1oIilolI extends ii1llo {
                public final Map I00iiI;
                public final iii1IlooII I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ii1oIilolI(iii1IlooII iii1ilooii, Map map) {
/* 4 */             super(6);
/* 1 */             this.I00iiO = iii1ilooii;
/* 7 */             this.I00iiI = map;
                }

                @Override
                public final void clear() {
/* 1 */             Iterator it = iterator();
                    while (true) {
/* 6 */                 OIlo1IOiO0i oIlo1IOiO0i = (OIlo1IOiO0i) it;
/* 12 */                if (!oIlo1IOiO0i.hasNext()) {
/* 29 */                    return;
                        }
/* 14 */                oIlo1IOiO0i.next();
/* 17 */                oIlo1IOiO0i.remove();
                    }
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00iiI.containsKey(obj);
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 7 */             return this.I00iiI.keySet().containsAll(collection);
                }

                @Override
                public final boolean equals(Object obj) {
                    return this == obj || this.I00iiI.keySet().equals(obj);
                }

                @Override
                public final int hashCode() {
/* 7 */             return this.I00iiI.keySet().hashCode();
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iiI.isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 7 */             Iterator it = this.I00iiI.entrySet().iterator();
/* 15 */            OIlo1IOiO0i oIlo1IOiO0i = new OIlo1IOiO0i(8);
/* 18 */            oIlo1IOiO0i.I00iiO = it;
/* 20 */            oIlo1IOiO0i.I00iio = this;
/* 22 */            VarHandle.storeStoreFence();
/* 29 */            return oIlo1IOiO0i;
                }

                @Override
                public final boolean remove(Object obj) {
/* 7 */             Collection collection = (Collection) this.I00iiI.remove(obj);
/* 9 */             if (collection == null) {
/* 29 */                return false;
                    }
/* 11 */            int size = collection.size();
/* 15 */            collection.clear();
                    this.I00iiO.I00ilI0I1 -= size;
                    return size > 0;
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iiI.size();
                }
            }
