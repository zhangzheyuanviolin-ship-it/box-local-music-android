            package p000;

            import java.util.AbstractSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            
            public final class i1ii1ol00I0 extends AbstractSet {
                public final int I00iOIl;
                public final iI0iIIo I00iiI;

                public i1ii1ol00I0(iI0iIIo ii0iiio, int i) {
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
/* 60 */                    return ii0iiio.containsKey(obj);
                        default:
/* 8 */                     Map mapI000II = ii0iiio.I000II();
/* 12 */                    if (mapI000II != null) {
/* 18 */                        return mapI000II.entrySet().contains(obj);
                            }
/* 25 */                    if (obj instanceof Map.Entry) {
/* 27 */                        Map.Entry entry = (Map.Entry) obj;
/* 33 */                        int iI001IO000 = ii0iiio.I001IO000(entry.getKey());
/* 38 */                        if (iI001IO000 != -1 && lil0l1lIi1.I00000oIO(ii0iiio.I0000Il00O()[iI001IO000], entry.getValue())) {
/* 56 */                            return true;
                                }
                            }
/* 58 */                    return false;
                    }
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             iI0iIIo ii0iiio = this.I00iiI;
                    switch (i) {
                        case 0:
/* 31 */                    Map mapI000II = ii0iiio.I000II();
                            return mapI000II != null ? mapI000II.keySet().iterator() : new o0IiO1iO(ii0iiio, 0);
                        default:
/* 8 */                     Map mapI000II2 = ii0iiio.I000II();
                            return mapI000II2 != null ? mapI000II2.entrySet().iterator() : new o0IiO1iO(ii0iiio, 1);
                    }
                }

                @Override
                public final boolean remove(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 5 */             iI0iIIo ii0iiio = this.I00iiI;
                    switch (i) {
                        case 0:
/* 90 */                    Map mapI000II = ii0iiio.I000II();
/* 94 */                    if (mapI000II == null) {
/* 111 */                       if (ii0iiio.I001iOo1i0O(obj) != iI0iIIo.I00li1OI) {
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        default:
/* 10 */                    Map mapI000II2 = ii0iiio.I000II();
/* 14 */                    if (mapI000II2 == null) {
/* 27 */                        if (obj instanceof Map.Entry) {
/* 29 */                            Map.Entry entry = (Map.Entry) obj;
/* 35 */                            if (!ii0iiio.I00100l0()) {
/* 38 */                                int iI0010o = ii0iiio.I0010o();
/* 42 */                                Object key = entry.getKey();
/* 46 */                                Object value = entry.getValue();
/* 50 */                                Object obj2 = ii0iiio.I00iiI;
/* 52 */                                Objects.requireNonNull(obj2);
/* 67 */                                int iI00000oIO = liiIi1O.I00000oIO(key, value, iI0010o, obj2, ii0iiio.I00000oIO(), ii0iiio.I00000oOI(), ii0iiio.I0000Il00O());
/* 72 */                                if (iI00000oIO != -1) {
/* 74 */                                    ii0iiio.I000lI(iI00000oIO, iI0010o);
                                            ii0iiio.I00io1l--;
                                            ii0iiio.I00ilO0 += 32;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
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
