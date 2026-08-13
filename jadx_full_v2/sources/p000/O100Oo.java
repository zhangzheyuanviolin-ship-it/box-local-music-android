            package p000;

            import java.util.AbstractSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            
            public final class O100Oo extends AbstractSet {
                public final int I00iOIl;
                public final O100l1O0IiiO I00iiI;

                public O100Oo(O100l1O0IiiO o100l1O0IiiO, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = o100l1O0IiiO;
                }

                @Override
                public final void clear() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O100l1O0IiiO o100l1O0IiiO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 12 */                    o100l1O0IiiO.clear();
                            break;
                        default:
/* 8 */                     o100l1O0IiiO.clear();
                            break;
                    }
                }

                @Override
                public final boolean contains(Object obj) {
                    O100l1 o100l1I00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 3 */             O100l1O0IiiO o100l1O0IiiO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 16 */                    if (!(obj instanceof Map.Entry)) {
/* 15 */                        return false;
                            }
/* 18 */                    Map.Entry entry = (Map.Entry) obj;
/* 20 */                    Object key = entry.getKey();
/* 24 */                    O100l1 o100l1 = null;
/* 25 */                    if (key != null) {
                                try {
/* 27 */                            o100l1I00000oIO = o100l1O0IiiO.I00000oIO(key, false);
                                } catch (ClassCastException unused) {
                                }
                            } else {
/* 32 */                        o100l1I00000oIO = null;
                            }
/* 33 */                    if (o100l1I00000oIO != null && Objects.equals(o100l1I00000oIO.I00iio, entry.getValue())) {
/* 47 */                        o100l1 = o100l1I00000oIO;
                            }
                            return o100l1 != null;
                        default:
/* 8 */                     return o100l1O0IiiO.containsKey(obj);
                    }
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O100l1O0IiiO o100l1O0IiiO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 18 */                    return new O100O1O(o100l1O0IiiO, 0);
                        default:
/* 11 */                    return new O100O1O(o100l1O0IiiO, 1);
                    }
                }

                @Override
                public final boolean remove(Object obj) {
                    O100l1 o100l1I00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 3 */             O100l1 o100l1I00000oIO2 = null;
/* 4 */             O100l1O0IiiO o100l1O0IiiO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 28 */                    if (obj instanceof Map.Entry) {
/* 31 */                        Map.Entry entry = (Map.Entry) obj;
/* 33 */                        Object key = entry.getKey();
/* 37 */                        if (key != null) {
                                    try {
/* 39 */                                o100l1I00000oIO = o100l1O0IiiO.I00000oIO(key, false);
                                    } catch (ClassCastException unused) {
                                    }
                                } else {
/* 44 */                            o100l1I00000oIO = null;
                                }
/* 45 */                        if (o100l1I00000oIO != null && Objects.equals(o100l1I00000oIO.I00iio, entry.getValue())) {
/* 59 */                            o100l1I00000oIO2 = o100l1I00000oIO;
                                }
/* 60 */                        if (o100l1I00000oIO2 != null) {
/* 63 */                            o100l1O0IiiO.I0000Il00O(o100l1I00000oIO2, true);
                                    break;
                                }
                            }
                            break;
                        default:
/* 11 */                    if (obj != null) {
                                try {
/* 13 */                            o100l1I00000oIO2 = o100l1O0IiiO.I00000oIO(obj, false);
                                } catch (ClassCastException unused2) {
                                }
                            }
/* 17 */                    if (o100l1I00000oIO2 != null) {
/* 19 */                        o100l1O0IiiO.I0000Il00O(o100l1I00000oIO2, true);
                            }
/* 22 */                    if (o100l1I00000oIO2 != null) {
                                break;
                            }
                            break;
                    }
/* 7 */             return true;
                }

                @Override
                public final int size() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O100l1O0IiiO o100l1O0IiiO = this.I00iiI;
                    switch (i) {
                    }
/* 8 */             return o100l1O0IiiO.I00iio;
                }
            }
