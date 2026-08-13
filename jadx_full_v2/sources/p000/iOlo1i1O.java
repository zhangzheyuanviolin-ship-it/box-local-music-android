            package p000;

            import java.util.AbstractSet;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class iOlo1i1O extends AbstractSet {
                public final int I00iOIl;
                public final iI0iIIo I00iiI;

                public iOlo1i1O(iI0iIIo ii0iiio, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = ii0iiio;
                }

                @Override
                public final void clear() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             iI0iIIo ii0iiio = this.I00iiI;
                    switch (i) {
                        case 0:
/* 12 */                    ii0iiio.clear();
                            break;
                        default:
/* 8 */                     ii0iiio.clear();
                            break;
                    }
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             iI0iIIo ii0iiio = this.I00iiI;
                    switch (i) {
                        case 0:
/* 13 */                    Map mapI000II = ii0iiio.I000II();
/* 17 */                    if (mapI000II != null) {
/* 23 */                        return mapI000II.entrySet().contains(obj);
                            }
/* 30 */                    if (obj instanceof Map.Entry) {
/* 32 */                        Map.Entry entry = (Map.Entry) obj;
/* 38 */                        int iI00111O = ii0iiio.I00111O(entry.getKey());
/* 43 */                        if (iI00111O != -1) {
/* 45 */                            Object[] objArr = ii0iiio.I00ilI0I1;
/* 47 */                            objArr.getClass();
/* 60 */                            if (ll1Oll0I0o1.I00000oIO(objArr[iI00111O], entry.getValue())) {
/* 62 */                                return true;
                                    }
                                }
                            }
/* 64 */                    return false;
                        default:
/* 8 */                     return ii0iiio.containsKey(obj);
                    }
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             iI0iIIo ii0iiio = this.I00iiI;
                    switch (i) {
                        case 0:
/* 31 */                    Map mapI000II = ii0iiio.I000II();
                            return mapI000II != null ? mapI000II.entrySet().iterator() : new iOioOl1O(ii0iiio, 1);
                        default:
/* 8 */                     Map mapI000II2 = ii0iiio.I000II();
                            return mapI000II2 != null ? mapI000II2.keySet().iterator() : new iOioOl1O(ii0iiio, 0);
                    }
                }

                @Override
                public final boolean remove(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 5 */             iI0iIIo ii0iiio = this.I00iiI;
                    switch (i) {
                        case 0:
/* 35 */                    Map mapI000II = ii0iiio.I000II();
/* 39 */                    if (mapI000II == null) {
/* 52 */                        if (obj instanceof Map.Entry) {
/* 54 */                            Map.Entry entry = (Map.Entry) obj;
/* 60 */                            if (!ii0iiio.I000o00OoI0I()) {
/* 63 */                                int iI0010I0i = ii0iiio.I0010I0i();
/* 67 */                                Object key = entry.getKey();
/* 71 */                                Object value = entry.getValue();
/* 75 */                                Object obj2 = ii0iiio.I00iiI;
/* 77 */                                obj2.getClass();
/* 80 */                                int[] iArr = ii0iiio.I00iiO;
/* 82 */                                iArr.getClass();
/* 85 */                                Object[] objArr = ii0iiio.I00iio;
/* 87 */                                objArr.getClass();
/* 90 */                                Object[] objArr2 = ii0iiio.I00ilI0I1;
/* 92 */                                objArr2.getClass();
/* 95 */                                int iI00000oIO = lil1Ool1oiiI.I00000oIO(key, value, iI0010I0i, obj2, iArr, objArr, objArr2);
/* 100 */                               if (iI00000oIO != -1) {
/* 103 */                                   ii0iiio.I000iOII(iI00000oIO, iI0010I0i);
                                            ii0iiio.I00io1l--;
                                            ii0iiio.I00ilO0 += 32;
                                            break;
                                        }
                                    }
                                }
                                break;
                            } else {
                                break;
                            }
                        default:
/* 10 */                    Map mapI000II2 = ii0iiio.I000II();
/* 14 */                    if (mapI000II2 == null) {
/* 31 */                        if (ii0iiio.I001i1lo1io(obj) == iI0iIIo.I00o0l1o1o0) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                    }
/* 4 */             return false;
                }

                @Override
                public final int size() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             iI0iIIo ii0iiio = this.I00iiI;
                    switch (i) {
                    }
/* 8 */             return ii0iiio.size();
                }
            }
