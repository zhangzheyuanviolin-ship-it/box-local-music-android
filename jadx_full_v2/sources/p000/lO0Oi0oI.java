            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
/* 11 */    public final class lO0Oi0oI extends ii1llo {
                public final int I00iiI = 0;
                public final Map I00iiO;

                public lO0Oi0oI(o10liooI o10liooi, Map map) {
/* 4 */             super(1);
/* 7 */             map.getClass();
/* 10 */            this.I00iiO = map;
                }

                @Override
                public final void clear() {
                    switch (this.I00iiI) {
                        case 0:
/* 31 */                    ((i1liloI1Ol1) this.I00iiO).clear();
                            break;
                        default:
/* 6 */                     Iterator it = iterator();
                            while (true) {
/* 11 */                        i1olOio i1oloio = (i1olOio) it;
/* 17 */                        if (!i1oloio.hasNext()) {
                                    break;
                                } else {
/* 19 */                            i1oloio.next();
/* 22 */                            i1oloio.remove();
                                }
                            }
                    }
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             int i = this.I00iiI;
/* 3 */             Map map = this.I00iiO;
                    switch (i) {
                        case 0:
/* 17 */                    Set setEntrySet = ((i1liloI1Ol1) map).I00iiI.entrySet();
/* 21 */                    setEntrySet.getClass();
                            try {
/* 24 */                        return setEntrySet.contains(obj);
                            } catch (ClassCastException | NullPointerException unused) {
/* 29 */                        return false;
                            }
                        default:
/* 8 */                     return map.containsKey(obj);
                    }
                }

                @Override
                public boolean containsAll(Collection collection) {
                    switch (this.I00iiI) {
                        case 1:
/* 17 */                    return this.I00iiO.keySet().containsAll(collection);
                        default:
/* 6 */                     return super.containsAll(collection);
                    }
                }

                @Override
                public boolean equals(Object obj) {
                    switch (this.I00iiI) {
                        case 1:
                            return this == obj || this.I00iiO.keySet().equals(obj);
                        default:
/* 6 */                     return super.equals(obj);
                    }
                }

                @Override
                public int hashCode() {
                    switch (this.I00iiI) {
                        case 1:
/* 17 */                    return this.I00iiO.keySet().hashCode();
                        default:
/* 6 */                     return super.hashCode();
                    }
                }

                @Override
                public final boolean isEmpty() {
/* 1 */             int i = this.I00iiI;
/* 3 */             Map map = this.I00iiO;
                    switch (i) {
                        case 0:
/* 15 */                    return ((i1liloI1Ol1) map).isEmpty();
                        default:
/* 8 */                     return map.isEmpty();
                    }
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int i = this.I00iiI;
/* 3 */             Map map = this.I00iiO;
                    switch (i) {
                        case 0:
/* 33 */                    return new OIlo1IOiO0i((i1liloI1Ol1) map, (short) 0);
                        default:
/* 12 */                    Iterator it = map.entrySet().iterator();
/* 19 */                    i1olOio i1oloio = new i1olOio(2);
/* 22 */                    i1oloio.I00iiO = it;
/* 24 */                    VarHandle.storeStoreFence();
/* 27 */                    return i1oloio;
                    }
                }

                @Override
                public final boolean remove(Object obj) {
                    Object objRemove;
/* 1 */             int i = this.I00iiI;
/* 5 */             Map map = this.I00iiO;
                    switch (i) {
                        case 0:
/* 33 */                    if (contains(obj)) {
/* 36 */                        Map.Entry entry = (Map.Entry) obj;
/* 38 */                        entry.getClass();
/* 43 */                        Object key = entry.getKey();
/* 51 */                        iI0iIIo ii0iiio = ((o10liooI) ((i1liloI1Ol1) map).I00ilI0I1).I00iiO;
/* 53 */                        ii0iiio.getClass();
                                try {
/* 56 */                            objRemove = ii0iiio.remove(key);
                                } catch (ClassCastException | NullPointerException unused) {
/* 61 */                            objRemove = null;
                                }
/* 62 */                        Collection collection = (Collection) objRemove;
/* 64 */                        if (collection != null) {
/* 66 */                            collection.size();
/* 69 */                            collection.clear();
                                }
                                break;
                            }
                            break;
                        default:
/* 14 */                    Collection collection2 = (Collection) map.remove(obj);
/* 16 */                    if (collection2 != null) {
/* 18 */                        int size = collection2.size();
/* 22 */                        collection2.clear();
/* 25 */                        if (size > 0) {
                                    break;
                                }
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public boolean removeAll(Collection collection) {
                    switch (this.I00iiI) {
                        case 0:
                            try {
/* 11 */                        if (collection != null) {
/* 13 */                            return lilOO00olo0.I00000oIO(this, collection);
                                }
/* 19 */                        throw null;
                            } catch (UnsupportedOperationException unused) {
/* 20 */                        Iterator it = collection.iterator();
/* 24 */                        boolean zRemove = false;
/* 29 */                        while (it.hasNext()) {
/* 39 */                            zRemove |= remove(it.next());
                                }
/* 41 */                        return zRemove;
                            }
                        default:
/* 6 */                     return super.removeAll(collection);
                    }
                }

                @Override
                public boolean retainAll(Collection collection) {
                    int iCeil;
                    switch (this.I00iiI) {
                        case 0:
                            try {
/* 11 */                        if (collection != null) {
/* 13 */                            return super.retainAll(collection);
                                }
/* 19 */                        throw null;
                            } catch (UnsupportedOperationException unused) {
/* 20 */                        int size = collection.size();
/* 27 */                        if (size >= 3) {
/* 59 */                            iCeil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
                                } else {
/* 29 */                            if (size < 0) {
/* 40 */                                I000II.I000iOII(Oi010OO0.I000oI1ioi(size, "expectedSize cannot be negative but was: "));
/* 43 */                                return false;
                                    }
/* 31 */                            iCeil = size + 1;
                                }
/* 62 */                        HashSet hashSet = new HashSet(iCeil);
/* 73 */                        for (Object obj : collection) {
/* 83 */                            if (contains(obj) && (obj instanceof Map.Entry)) {
/* 95 */                                hashSet.add(((Map.Entry) obj).getKey());
                                    }
                                }
/* 105 */                       o10liooI o10liooi = (o10liooI) ((i1liloI1Ol1) this.I00iiO).I00ilI0I1;
/* 107 */                       lO0Oi0oI lo0oi0oi = o10liooi.I00iOIl;
/* 109 */                       if (lo0oi0oi == null) {
/* 115 */                           lo0oi0oi = new lO0Oi0oI(o10liooi, o10liooi.I00iiO);
/* 118 */                           o10liooi.I00iOIl = lo0oi0oi;
                                }
/* 120 */                       return lo0oi0oi.retainAll(hashSet);
                            }
                        default:
/* 6 */                     return super.retainAll(collection);
                    }
                }

                @Override
                public final int size() {
/* 1 */             int i = this.I00iiI;
/* 3 */             Map map = this.I00iiO;
                    switch (i) {
                        case 0:
/* 17 */                    return ((i1liloI1Ol1) map).I00iiI.size();
                        default:
/* 8 */                     return map.size();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public lO0Oi0oI(i1liloI1Ol1 i1liloi1ol1) {
/* 14 */            super(1);
/* 13 */            this.I00iiO = i1liloi1ol1;
                }
            }
