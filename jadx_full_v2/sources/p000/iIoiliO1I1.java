            package p000;

            import java.util.AbstractSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            
            public final class iIoiliO1I1 extends AbstractSet {
                public final int I00iOIl;
                public final iI0iIIo I00iiI;

                public iIoiliO1I1(iI0iIIo ii0iiio, int i) {
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
/* 38 */                        int iI001IO000 = ii0iiio.I001IO000(entry.getKey());
/* 43 */                        if (iI001IO000 != -1 && ll0o0IOO.I00000oIO(ii0iiio.I0000Il00O()[iI001IO000], entry.getValue())) {
/* 61 */                            return true;
                                }
                            }
/* 63 */                    return false;
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
                            return mapI000II != null ? mapI000II.entrySet().iterator() : new iIii1ilO1o0i(ii0iiio, 1);
                        default:
/* 8 */                     Map mapI000II2 = ii0iiio.I000II();
                            return mapI000II2 != null ? mapI000II2.keySet().iterator() : new iIii1ilO1o0i(ii0iiio, 0);
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
/* 60 */                            if (!ii0iiio.I00100l0()) {
/* 63 */                                int iI0010o = ii0iiio.I0010o();
/* 67 */                                Object key = entry.getKey();
/* 71 */                                Object value = entry.getValue();
/* 75 */                                Object obj2 = ii0iiio.I00iiI;
/* 77 */                                Objects.requireNonNull(obj2);
/* 92 */                                int iI00000oIO = liilllI1l.I00000oIO(key, value, iI0010o, obj2, ii0iiio.I00000oIO(), ii0iiio.I00000oOI(), ii0iiio.I0000Il00O());
/* 97 */                                if (iI00000oIO != -1) {
/* 99 */                                    ii0iiio.I000lI(iI00000oIO, iI0010o);
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
/* 31 */                        if (ii0iiio.I001iOo1i0O(obj) == iI0iIIo.I00lll10) {
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
