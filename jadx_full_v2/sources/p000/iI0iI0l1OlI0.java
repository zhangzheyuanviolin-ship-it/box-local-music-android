            package p000;

            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            public final class iI0iI0l1OlI0 extends ii1llo {
                public final i1liloI1Ol1 I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iI0iI0l1OlI0(i1liloI1Ol1 i1liloi1ol1) {
/* 4 */             super(4);
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
/* 6 */             return new OIlo1IOiO0i(this.I00iiI, (byte) 0);
                }

                @Override
                public final boolean remove(Object obj) {
                    Object objRemove;
/* 5 */             if (!contains(obj)) {
/* 7 */                 return false;
                    }
/* 9 */             Map.Entry entry = (Map.Entry) obj;
/* 11 */            entry.getClass();
/* 18 */            iOIoo1lI ioioo1li = (iOIoo1lI) this.I00iiI.I00ilI0I1;
/* 20 */            Object key = entry.getKey();
/* 24 */            iI0iIIo ii0iiio = ioioo1li.I00iiO;
/* 26 */            ii0iiio.getClass();
                    try {
/* 29 */                objRemove = ii0iiio.remove(key);
                    } catch (ClassCastException | NullPointerException unused) {
/* 34 */                objRemove = null;
                    }
/* 35 */            Collection collection = (Collection) objRemove;
/* 37 */            if (collection == null) {
/* 51 */                return true;
                    }
/* 39 */            int size = collection.size();
/* 43 */            collection.clear();
                    ioioo1li.I00iio -= size;
/* 51 */            return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
                    try {
/* 1 */                 if (collection != null) {
/* 3 */                     return liliiIOlo.I00000oIO(this, collection);
                        }
/* 9 */                 throw null;
                    } catch (UnsupportedOperationException unused) {
/* 10 */                Iterator it = collection.iterator();
/* 14 */                boolean zRemove = false;
/* 19 */                while (it.hasNext()) {
/* 29 */                    zRemove |= remove(it.next());
                        }
/* 77 */                return zRemove;
                    }
                }

                @Override
                public final boolean retainAll(Collection collection) {
                    int iCeil;
                    try {
/* 1 */                 if (collection != null) {
/* 3 */                     return super.retainAll(collection);
                        }
/* 9 */                 throw null;
                    } catch (UnsupportedOperationException unused) {
/* 10 */                int size = collection.size();
/* 17 */                if (size >= 3) {
/* 49 */                    iCeil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
                        } else {
/* 19 */                    if (size < 0) {
/* 30 */                        I000II.I000iOII(Oi010OO0.I000oI1ioi(size, "expectedSize cannot be negative but was: "));
/* 33 */                        return false;
                            }
/* 21 */                    iCeil = size + 1;
                        }
/* 52 */                HashSet hashSet = new HashSet(iCeil);
/* 63 */                for (Object obj : collection) {
/* 73 */                    if (contains(obj) && (obj instanceof Map.Entry)) {
/* 85 */                        hashSet.add(((Map.Entry) obj).getKey());
                            }
                        }
/* 93 */                iOIoo1lI ioioo1li = (iOIoo1lI) this.I00iiI.I00ilI0I1;
/* 95 */                iIOo111l iioo111l = ioioo1li.I00iOIl;
/* 97 */                if (iioo111l == null) {
/* 103 */                   iioo111l = new iIOo111l(ioioo1li, ioioo1li.I00iiO);
/* 106 */                   ioioo1li.I00iOIl = iioo111l;
                        }
/* 108 */               return iioo111l.retainAll(hashSet);
                    }
                }

                @Override
                public final int size() {
/* 5 */             return this.I00iiI.I00iiI.size();
                }
            }
