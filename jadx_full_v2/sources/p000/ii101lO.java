            package p000;

            import java.io.Serializable;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            public final class ii101lO extends i0IIio0oIoio implements Set {
                public transient iO10llOoIiI0 I00lll10;
                public final int I00o0iI0io1;
                public final transient ii01iIOliOOI I00o0l1o1o0;
                public final transient Serializable I00o101lO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ii101lO(ii01iIOliOOI ii01iioliooi, Serializable serializable, int i) {
/* 4 */             super(4);
/* 1 */             this.I00o0iI0io1 = i;
/* 7 */             this.I00o0l1o1o0 = ii01iioliooi;
/* 9 */             this.I00o101lO = serializable;
                }

                @Override
                public final int I000o00OoI0I(Object[] objArr) {
                    switch (this.I00o0iI0io1) {
                        case 0:
/* 15 */                    iO10llOoIiI0 ii0o1oiVar = this.I00lll10;
/* 17 */                    if (ii0o1oiVar == null) {
/* 21 */                        ii0o1oiVar = new ii0o1oi(this);
/* 24 */                        this.I00lll10 = ii0o1oiVar;
                            }
/* 26 */                    return ii0o1oiVar.I000o00OoI0I(objArr);
                        default:
/* 10 */                    return ((ii1IOlol1) this.I00o101lO).I000o00OoI0I(objArr);
                    }
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             int i = this.I00o0iI0io1;
/* 5 */             ii01iIOliOOI ii01iioliooi = this.I00o0l1o1o0;
                    switch (i) {
                        case 0:
/* 20 */                    if (obj instanceof Map.Entry) {
/* 22 */                        Map.Entry entry = (Map.Entry) obj;
/* 24 */                        Object key = entry.getKey();
/* 28 */                        Object value = entry.getValue();
/* 32 */                        if (value != null && value.equals(ii01iioliooi.get(key))) {
                                    break;
                                }
                            }
                            break;
                        default:
/* 14 */                    if (ii01iioliooi.get(obj) != null) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this || obj == this) {
/* 1 */                 return true;
                    }
/* 10 */            if (obj instanceof Set) {
/* 12 */                Set set = (Set) obj;
                        try {
/* 22 */                    if (size() == set.size()) {
                                return containsAll(set);
                            }
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
/* 9 */             return false;
                }

                @Override
                public final int hashCode() {
/* 1 */             Iterator it = iterator();
/* 6 */             int iHashCode = 0;
/* 11 */            while (it.hasNext()) {
/* 13 */                Object next = it.next();
/* 25 */                iHashCode += next != null ? next.hashCode() : 0;
                    }
/* 55 */            return iHashCode;
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00o0iI0io1) {
                        case 0:
/* 16 */                    iO10llOoIiI0 ii0o1oiVar = this.I00lll10;
/* 18 */                    if (ii0o1oiVar == null) {
/* 22 */                        ii0o1oiVar = new ii0o1oi(this);
/* 25 */                        this.I00lll10 = ii0o1oiVar;
                            }
/* 27 */                    return ii0o1oiVar.listIterator(0);
                        default:
/* 11 */                    return ((ii1IOlol1) this.I00o101lO).listIterator(0);
                    }
                }

                @Override
                public final int size() {
                    switch (this.I00o0iI0io1) {
                    }
/* 6 */             return 1;
                }
            }
