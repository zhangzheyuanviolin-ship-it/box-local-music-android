            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            
/* 4 */     public final class OI10OiOo implements O0Io11IiO0l, Set, O0IlIoi {
                public OI10IIO I00iOIl;
                public OI10IIO I00iiI;

                @Override
                public final boolean add(Object obj) {
/* 3 */             return this.I00iiI.I00000oIO(obj);
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             OI10IIO oi10iio = this.I00iiI;
/* 7 */             int i = oi10iio.I0000O;
/* 9 */             Iterator it = collection.iterator();
/* 17 */            while (it.hasNext()) {
/* 23 */                oi10iio.I000iOII(it.next());
                    }
                    return i != oi10iio.I0000O;
                }

                @Override
                public final void clear() {
/* 3 */             this.I00iiI.I00000oOI();
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00iOIl.I0000Il00O(obj);
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 3 */             Iterator it = collection.iterator();
/* 11 */            while (it.hasNext()) {
/* 23 */                if (!this.I00iOIl.I0000Il00O(it.next())) {
/* 25 */                    return false;
                        }
                    }
/* 27 */            return true;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || OI10OiOo.class != obj.getClass()) {
/* 27 */                return false;
                    }
/* 22 */            return this.I00iOIl.equals(((OI10OiOo) obj).I00iOIl);
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                @Override
                public final boolean isEmpty() {
/* 3 */             return this.I00iOIl.I000II();
                }

                @Override
                public final Iterator iterator() {
/* 4 */             Io00llIoO1lO io00llIoO1lO = new Io00llIoO1lO(2);
/* 7 */             io00llIoO1lO.I00iio = this;
/* 10 */            io00llIoO1lO.I00iiI = -1;
/* 22 */            io00llIoO1lO.I00iiO = OilOIIlI.I00000oIO(new OI10OiIlI(this, io00llIoO1lO, null));
/* 24 */            VarHandle.storeStoreFence();
/* 55 */            return io00llIoO1lO;
                }

                @Override
                public final boolean remove(Object obj) {
/* 3 */             return this.I00iiI.I000l1(obj);
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             OI10IIO oi10iio = this.I00iiI;
/* 5 */             int i = oi10iio.I0000O;
/* 7 */             Iterator it = collection.iterator();
/* 15 */            while (it.hasNext()) {
/* 21 */                oi10iio.I000OOo1O(it.next());
                    }
                    return i != oi10iio.I0000O;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean retainAll(Collection collection) {
/* 3 */             OI10IIO oi10iio = this.I00iiI;
/* 5 */             Object[] objArr = oi10iio.I00000oOI;
/* 7 */             int i = oi10iio.I0000O;
/* 9 */             long[] jArr = oi10iio.I00000oIO;
                    int length = jArr.length - 2;
/* 15 */            if (length >= 0) {
/* 17 */                int i2 = 0;
                        while (true) {
/* 18 */                    long j = jArr[i2];
/* 32 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 41 */                        int i3 = 8 - ((~(i2 - length)) >>> 31);
/* 44 */                        for (int i4 = 0; i4 < i3; i4++) {
/* 53 */                            if ((255 & j) < 128) {
/* 57 */                                int i5 = (i2 << 3) + i4;
/* 68 */                                if (!IOOi0Ool1i.I001i1O0Ol(collection, objArr[i5])) {
/* 70 */                                    oi10iio.I000lI(i5);
                                        }
                                    }
/* 73 */                            j >>= 8;
                                }
/* 77 */                        if (i3 != 8) {
                                    break;
                                }
/* 79 */                        if (i2 == length) {
                                    break;
                                }
/* 81 */                        i2++;
                            }
                        }
                    }
                    return i != oi10iio.I0000O;
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.I0000O;
                }

                @Override
                public final Object[] toArray() {
/* 1 */             return i1O0Ill0.I00000oIO(this);
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.toString();
                }

                @Override
/* 5 */         public final Object[] toArray(Object[] objArr) {
/* 6 */             return i1O0Ill0.I00000oOI(this, objArr);
                }
            }
