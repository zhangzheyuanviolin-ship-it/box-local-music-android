            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
/* 15 */    public final class Il0l1iO11i implements Set, O0IlIoi {
                public final int I00iOIl;
                public OI10I1IoI0Ol I00iiI;

                public Il0l1iO11i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final boolean add(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final boolean addAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final void clear() {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final boolean contains(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 15 */                    if (!(obj instanceof Map.Entry)) {
/* 17 */                        return false;
                            }
/* 19 */                    Map.Entry entry = (Map.Entry) obj;
/* 35 */                    return O0000Ioio00.I0000O(this.I00iiI.I000II(entry.getKey()), entry.getValue());
                        default:
/* 8 */                     return this.I00iiI.I0000Il00O(obj);
                    }
                }

                @Override
                public final boolean containsAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 45 */                    Collection<Map.Entry> collection2 = collection;
/* 54 */                    if (!collection2.isEmpty()) {
/* 65 */                        for (Map.Entry entry : collection2) {
/* 91 */                            if (!O0000Ioio00.I0000O(this.I00iiI.I000II(entry.getKey()), entry.getValue())) {
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
/* 8 */                     Collection collection3 = collection;
/* 17 */                    if (!collection3.isEmpty()) {
/* 20 */                        Iterator it = collection3.iterator();
/* 28 */                        while (it.hasNext()) {
/* 40 */                            if (!this.I00iiI.I0000Il00O(it.next())) {
                                        break;
                                    }
                                }
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final boolean isEmpty() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI.I000OOo1O();
                }

                @Override
                public final Iterator iterator() {
/* 3 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    return OilOIIlI.I00000oIO(new Il0l11i(this, iOoil1iiIilo, 0));
                        default:
/* 13 */                    return OilOIIlI.I00000oIO(new Il0l11i(this, iOoil1iiIilo, 1));
                    }
                }

                @Override
                public final boolean remove(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final boolean removeAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final boolean retainAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                @Override
                public final int size() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI.I0000oI00;
                }

                @Override
                public final Object[] toArray() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return i1O0Ill0.I00000oIO(this);
                }

                @Override
/* 16 */        public final Object[] toArray(Object[] objArr) {
                    switch (this.I00iOIl) {
                    }
/* 17 */            return i1O0Ill0.I00000oOI(this, objArr);
                }
            }
