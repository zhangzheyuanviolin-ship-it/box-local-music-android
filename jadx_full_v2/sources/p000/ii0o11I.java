            package p000;

            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            
            public final class ii0o11I extends ii1llo {
                public final i1liloI1Ol1 I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ii0o11I(i1liloI1Ol1 i1liloi1ol1) {
/* 4 */             super(6);
/* 1 */             this.I00iiI = i1liloi1ol1;
                }

                @Override
                public final void clear() {
/* 3 */             this.I00iiI.clear();
                }

                @Override
                public final boolean contains(Object obj) {
/* 5 */             Set setEntrySet = this.I00iiI.I00iiI.entrySet();
/* 9 */             setEntrySet.getClass();
                    try {
/* 12 */                return setEntrySet.contains(obj);
                    } catch (ClassCastException | NullPointerException unused) {
/* 17 */                return false;
                    }
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iiI.isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 6 */             return new OIlo1IOiO0i(this.I00iiI, (char) 0);
                }

                @Override
                public final boolean remove(Object obj) {
                    Object objRemove;
/* 5 */             if (!contains(obj)) {
/* 7 */                 return false;
                    }
/* 9 */             Map.Entry entry = (Map.Entry) obj;
/* 11 */            Objects.requireNonNull(entry);
/* 14 */            Object key = entry.getKey();
/* 22 */            iii1IlooII iii1ilooii = (iii1IlooII) this.I00iiI.I00ilI0I1;
                    try {
/* 26 */                objRemove = iii1ilooii.I00iio.remove(key);
                    } catch (ClassCastException | NullPointerException unused) {
/* 31 */                objRemove = null;
                    }
/* 32 */            Collection collection = (Collection) objRemove;
/* 34 */            if (collection == null) {
/* 48 */                return true;
                    }
/* 36 */            int size = collection.size();
/* 40 */            collection.clear();
                    iii1ilooii.I00ilI0I1 -= size;
/* 48 */            return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
                    try {
/* 1 */                 if (collection != null) {
/* 6 */                     return lilol10O.I00000oOI(this, collection);
                        }
/* 12 */                throw null;
                    } catch (UnsupportedOperationException unused) {
/* 13 */                Iterator it = collection.iterator();
/* 17 */                boolean zRemove = false;
/* 22 */                while (it.hasNext()) {
/* 32 */                    zRemove |= remove(it.next());
                        }
/* 77 */                return zRemove;
                    }
                }

                @Override
                public final boolean retainAll(Collection collection) {
                    int iCeil;
                    try {
/* 1 */                 if (collection != null) {
/* 6 */                     return super.retainAll(collection);
                        }
/* 12 */                throw null;
                    } catch (UnsupportedOperationException unused) {
/* 13 */                int size = collection.size();
/* 20 */                if (size >= 3) {
/* 52 */                    iCeil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
                        } else {
/* 22 */                    if (size < 0) {
/* 33 */                        I000II.I000iOII(Oi010OO0.I000oI1ioi(size, "expectedSize cannot be negative but was: "));
/* 36 */                        return false;
                            }
/* 24 */                    iCeil = size + 1;
                        }
/* 55 */                HashSet hashSet = new HashSet(iCeil);
/* 66 */                for (Object obj : collection) {
/* 76 */                    if (contains(obj) && (obj instanceof Map.Entry)) {
/* 88 */                        hashSet.add(((Map.Entry) obj).getKey());
                            }
                        }
/* 104 */               return ((ii1llo) ((iii1IlooII) this.I00iiI.I00ilI0I1).I00000oOI()).retainAll(hashSet);
                    }
                }

                @Override
                public final int size() {
/* 5 */             return this.I00iiI.I00iiI.size();
                }
            }
