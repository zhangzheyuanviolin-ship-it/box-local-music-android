            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            
/* 4 */     public final class OI0oo0o implements O0Io11IiO0l, Set, O0IlIoi {
                public OI0olI1Oii0I I00iOIl;
                public OI0olI1Oii0I I00iiI;

                @Override
                public final boolean add(Object obj) {
/* 3 */             return this.I00iiI.I00000oIO(obj);
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             OI0olI1Oii0I oI0olI1Oii0I = this.I00iiI;
/* 5 */             int i = oI0olI1Oii0I.I000II;
/* 15 */            for (Object obj : collection) {
/* 21 */                int iI0000O = oI0olI1Oii0I.I0000O(obj);
/* 27 */                oI0olI1Oii0I.I00000oOI[iI0000O] = obj;
/* 29 */                long[] jArr = oI0olI1Oii0I.I0000Il00O;
/* 31 */                int i2 = oI0olI1Oii0I.I0000O;
/* 44 */                jArr[iI0000O] = (i2 & 2147483647L) | 4611686016279904256L;
/* 49 */                if (i2 != Integer.MAX_VALUE) {
/* 66 */                    jArr[i2] = ((iI0000O & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
                        }
/* 68 */                oI0olI1Oii0I.I0000O = iI0000O;
/* 72 */                if (oI0olI1Oii0I.I0000oI00 == Integer.MAX_VALUE) {
/* 74 */                    oI0olI1Oii0I.I0000oI00 = iI0000O;
                        }
                    }
                    return i != oI0olI1Oii0I.I000II;
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
/* 5 */             if (obj == null || OI0oo0o.class != obj.getClass()) {
/* 27 */                return false;
                    }
/* 22 */            return this.I00iOIl.equals(((OI0oo0o) obj).I00iOIl);
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                @Override
                public final boolean isEmpty() {
                    return this.I00iOIl.I000II == 0;
                }

                @Override
                public final Iterator iterator() {
/* 4 */             Io00llIoO1lO io00llIoO1lO = new Io00llIoO1lO(1);
/* 7 */             io00llIoO1lO.I00iio = this;
/* 10 */            io00llIoO1lO.I00iiI = -1;
/* 22 */            io00llIoO1lO.I00iiO = OilOIIlI.I00000oIO(new OI0oll(this, io00llIoO1lO, null));
/* 24 */            VarHandle.storeStoreFence();
/* 55 */            return io00llIoO1lO;
                }

                @Override
                public final boolean remove(Object obj) {
/* 3 */             return this.I00iiI.I000II(obj);
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
                
                    r18 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
                
                    if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
                
                    r15 = -1;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean removeAll(Collection collection) {
                    int i;
                    int iNumberOfTrailingZeros;
/* 3 */             OI0olI1Oii0I oI0olI1Oii0I = this.I00iiI;
/* 9 */             int i2 = oI0olI1Oii0I.I000II;
/* 11 */            Iterator it = collection.iterator();
                    while (true) {
/* 19 */                int i3 = 1;
/* 20 */                int i4 = 0;
/* 21 */                if (!it.hasNext()) {
                            break;
                        }
/* 23 */                Object next = it.next();
/* 38 */                int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
/* 41 */                int i5 = iHashCode ^ (iHashCode << 16);
/* 42 */                int i6 = i5 & 127;
/* 44 */                int i7 = oI0olI1Oii0I.I0001Ioi1lo;
/* 48 */                int i8 = (i5 >>> 7) & i7;
                        while (true) {
/* 49 */                    long[] jArr = oI0olI1Oii0I.I00000oIO;
/* 51 */                    int i9 = i8 >> 3;
/* 55 */                    int i10 = (i8 & 7) << 3;
/* 72 */                    long j = ((jArr[i9 + i3] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
/* 80 */                    long j2 = (i6 * 72340172838076673L) ^ j;
/* 90 */                    long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                            while (true) {
/* 95 */                        if (j3 == 0) {
                                    break;
                                }
/* 104 */                       iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i8) & i7;
/* 105 */                       int i11 = i3;
/* 115 */                       if (O0000Ioio00.I0000O(oI0olI1Oii0I.I00000oOI[iNumberOfTrailingZeros], next)) {
                                    break;
                                }
/* 122 */                       j3 &= j3 - 1;
/* 123 */                       i3 = i11;
                            }
/* 145 */                   i4 += 8;
/* 148 */                   i8 = (i8 + i4) & i7;
/* 149 */                   i3 = i;
                        }
/* 138 */               if (iNumberOfTrailingZeros >= 0) {
/* 140 */                   oI0olI1Oii0I.I000O01llI0(iNumberOfTrailingZeros);
                        }
                    }
                    return i2 != oI0olI1Oii0I.I000II;
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 3 */             return this.I00iiI.I000OOo1O(collection);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.I000II;
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
