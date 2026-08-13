            package p000;

            import java.util.AbstractSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            
            public final class iI0i1oi0OO0l extends AbstractSet {
                public final int I00iOIl;
                public final iI0o1i0o I00iiI;

                public iI0i1oi0OO0l(iI0o1i0o ii0o1i0o, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = ii0o1i0o;
                }

                @Override
                public final void clear() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             iI0o1i0o ii0o1i0o = this.I00iiI;
                    switch (i) {
                        case 0:
/* 12 */                    ii0o1i0o.clear();
                            break;
                        default:
/* 8 */                     ii0o1i0o.clear();
                            break;
                    }
                }

                @Override
                public final boolean contains(Object obj) {
                    iI0lliloO ii0llilooI00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 3 */             iI0o1i0o ii0o1i0o = this.I00iiI;
                    switch (i) {
                        case 0:
/* 16 */                    if (!(obj instanceof Map.Entry)) {
/* 15 */                        return false;
                            }
/* 18 */                    Map.Entry entry = (Map.Entry) obj;
/* 20 */                    Object key = entry.getKey();
/* 24 */                    iI0lliloO ii0lliloo = null;
/* 25 */                    if (key != null) {
                                try {
/* 27 */                            ii0llilooI00000oIO = ii0o1i0o.I00000oIO(key, false);
                                } catch (ClassCastException unused) {
                                }
                            } else {
/* 32 */                        ii0llilooI00000oIO = null;
                            }
/* 33 */                    if (ii0llilooI00000oIO != null && Objects.equals(ii0llilooI00000oIO.I00iiO, entry.getValue())) {
/* 47 */                        ii0lliloo = ii0llilooI00000oIO;
                            }
                            return ii0lliloo != null;
                        default:
/* 8 */                     return ii0o1i0o.containsKey(obj);
                    }
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             iI0o1i0o ii0o1i0o = this.I00iiI;
                    switch (i) {
                        case 0:
/* 18 */                    return new iI0i0I1(ii0o1i0o, 0);
                        default:
/* 11 */                    return new iI0i0I1(ii0o1i0o, 1);
                    }
                }

                @Override
                public final boolean remove(Object obj) {
                    iI0lliloO ii0llilooI00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 3 */             iI0lliloO ii0llilooI00000oIO2 = null;
/* 4 */             iI0o1i0o ii0o1i0o = this.I00iiI;
                    switch (i) {
                        case 0:
/* 28 */                    if (obj instanceof Map.Entry) {
/* 31 */                        Map.Entry entry = (Map.Entry) obj;
/* 33 */                        Object key = entry.getKey();
/* 37 */                        if (key != null) {
                                    try {
/* 39 */                                ii0llilooI00000oIO = ii0o1i0o.I00000oIO(key, false);
                                    } catch (ClassCastException unused) {
                                    }
                                } else {
/* 44 */                            ii0llilooI00000oIO = null;
                                }
/* 45 */                        if (ii0llilooI00000oIO != null && Objects.equals(ii0llilooI00000oIO.I00iiO, entry.getValue())) {
/* 59 */                            ii0llilooI00000oIO2 = ii0llilooI00000oIO;
                                }
/* 60 */                        if (ii0llilooI00000oIO2 != null) {
/* 62 */                            ii0o1i0o.I0000Il00O(ii0llilooI00000oIO2, true);
                                    break;
                                }
                            }
                            break;
                        default:
/* 11 */                    if (obj != null) {
                                try {
/* 13 */                            ii0llilooI00000oIO2 = ii0o1i0o.I00000oIO(obj, false);
                                } catch (ClassCastException unused2) {
                                }
                            }
/* 17 */                    if (ii0llilooI00000oIO2 != null) {
/* 19 */                        ii0o1i0o.I0000Il00O(ii0llilooI00000oIO2, true);
                            }
/* 22 */                    if (ii0llilooI00000oIO2 != null) {
                                break;
                            }
                            break;
                    }
/* 7 */             return true;
                }

                @Override
                public final int size() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             iI0o1i0o ii0o1i0o = this.I00iiI;
                    switch (i) {
                    }
/* 8 */             return ii0o1i0o.I00iiI;
                }
            }
