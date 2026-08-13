            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class O1OOIoo01I extends I01Io001O {
                public final int I00iOIl;
                public final O1OOII I00iiI;

                public O1OOIoo01I(O1OOII o1ooii, int i) {
/* 1 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = o1ooii;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O1OOII o1ooii = this.I00iiI;
                    switch (i) {
                    }
/* 8 */             return o1ooii.I00l0I0l0lO1;
                }

                @Override
                public final boolean add(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 19 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final boolean addAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final void clear() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O1OOII o1ooii = this.I00iiI;
                    switch (i) {
                        case 0:
/* 12 */                    o1ooii.clear();
                            break;
                        default:
/* 8 */                     o1ooii.clear();
                            break;
                    }
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O1OOII o1ooii = this.I00iiI;
                    switch (i) {
                        case 0:
/* 16 */                    if (!(obj instanceof Map.Entry)) {
/* 15 */                        return false;
                            }
/* 19 */                    Map.Entry entry = (Map.Entry) obj;
/* 25 */                    int iI000O01llI0 = o1ooii.I000O01llI0(entry.getKey());
/* 29 */                    if (iI000O01llI0 < 0) {
/* 15 */                        return false;
                            }
/* 40 */                    return O0000Ioio00.I0000O(o1ooii.I00iiI[iI000O01llI0], entry.getValue());
                        default:
/* 8 */                     return o1ooii.containsKey(obj);
                    }
                }

                @Override
                public boolean containsAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 11 */                    O1OOII o1ooii = this.I00iiI;
/* 21 */                    for (Object obj : collection) {
/* 28 */                        if (obj == null) {
/* 27 */                            return false;
                                }
                                try {
/* 30 */                            Map.Entry entry = (Map.Entry) obj;
/* 36 */                            int iI000O01llI0 = o1ooii.I000O01llI0(entry.getKey());
/* 56 */                            if (!(iI000O01llI0 < 0 ? false : O0000Ioio00.I0000O(o1ooii.I00iiI[iI000O01llI0], entry.getValue()))) {
/* 27 */                                return false;
                                    }
                                } catch (ClassCastException unused) {
/* 27 */                            return false;
                                }
                            }
/* 59 */                    return true;
                        default:
/* 6 */                     return super.containsAll(collection);
                    }
                }

                @Override
                public final boolean isEmpty() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O1OOII o1ooii = this.I00iiI;
                    switch (i) {
                    }
/* 8 */             return o1ooii.isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O1OOII o1ooii = this.I00iiI;
                    switch (i) {
                        case 0:
/* 18 */                    return new O1OIoioOO1lo(o1ooii, 0);
                        default:
/* 11 */                    return new O1OIoioOO1lo(o1ooii, 1);
                    }
                }

                @Override
                public final boolean remove(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 5 */             O1OOII o1ooii = this.I00iiI;
                    switch (i) {
                        case 0:
/* 27 */                    if (obj instanceof Map.Entry) {
/* 30 */                        Map.Entry entry = (Map.Entry) obj;
/* 32 */                        o1ooii.I0000Il00O();
/* 39 */                        int iI000O01llI0 = o1ooii.I000O01llI0(entry.getKey());
/* 43 */                        if (iI000O01llI0 >= 0 && O0000Ioio00.I0000O(o1ooii.I00iiI[iI000O01llI0], entry.getValue())) {
/* 62 */                            o1ooii.I000iOII(iI000O01llI0);
                                    break;
                                }
                            }
                            break;
                        default:
/* 10 */                    o1ooii.I0000Il00O();
/* 13 */                    int iI000O01llI02 = o1ooii.I000O01llI0(obj);
/* 17 */                    if (iI000O01llI02 >= 0) {
/* 21 */                        o1ooii.I000iOII(iI000O01llI02);
                                break;
                            } else {
                                break;
                            }
                    }
/* 3 */             return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O1OOII o1ooii = this.I00iiI;
                    switch (i) {
                        case 0:
/* 16 */                    o1ooii.I0000Il00O();
                            break;
                        default:
/* 8 */                     o1ooii.I0000Il00O();
                            break;
                    }
/* 11 */            return super.removeAll(collection);
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O1OOII o1ooii = this.I00iiI;
                    switch (i) {
                        case 0:
/* 16 */                    o1ooii.I0000Il00O();
                            break;
                        default:
/* 8 */                     o1ooii.I0000Il00O();
                            break;
                    }
/* 11 */            return super.retainAll(collection);
                }
            }
