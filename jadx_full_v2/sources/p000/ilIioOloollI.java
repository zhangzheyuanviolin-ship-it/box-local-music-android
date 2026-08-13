            package p000;

            import java.io.Serializable;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            public final class ilIioOloollI extends iioil1o11o implements Set {
                public transient il0II0OO1 I00iiI;
                public final int I00iiO;
                public final transient ii01iIOliOOI I00iio;
                public final transient Serializable I00ilI0I1;

                public ilIioOloollI(ii01iIOliOOI ii01iioliooi, Serializable serializable, int i) {
/* 1 */             this.I00iiO = i;
/* 6 */             this.I00iio = ii01iioliooi;
/* 8 */             this.I00ilI0I1 = serializable;
                }

                @Override
                public final int I00000oOI(Object[] objArr, int i) {
                    switch (this.I00iiO) {
                        case 0:
/* 15 */                    il0II0OO1 ilioli = this.I00iiI;
/* 17 */                    if (ilioli == null) {
/* 21 */                        ilioli = new ilIOlI(this);
/* 24 */                        this.I00iiI = ilioli;
                            }
/* 26 */                    return ilioli.I00000oOI(objArr, i);
                        default:
/* 10 */                    return ((ilIol1o) this.I00ilI0I1).I00000oOI(objArr, i);
                    }
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             int i = this.I00iiO;
/* 5 */             ii01iIOliOOI ii01iioliooi = this.I00iio;
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
/* 2 */             if (obj == this || this == obj) {
/* 1 */                 return true;
                    }
/* 10 */            if (obj instanceof Set) {
/* 12 */                Set set = (Set) obj;
                        try {
/* 22 */                    if (size() == set.size()) {
/* 28 */                        if (containsAll(set)) {
/* 1 */                             return true;
                                }
                            }
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
/* 31 */            return false;
                }

                @Override
                public final int hashCode() {
/* 1 */             return lilol10O.I00000oIO(this);
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00iiO) {
                        case 0:
/* 16 */                    il0II0OO1 ilioli = this.I00iiI;
/* 18 */                    if (ilioli == null) {
/* 22 */                        ilioli = new ilIOlI(this);
/* 25 */                        this.I00iiI = ilioli;
                            }
/* 27 */                    return ilioli.listIterator(0);
                        default:
/* 11 */                    return ((ilIol1o) this.I00ilI0I1).listIterator(0);
                    }
                }

                @Override
                public final int size() {
                    switch (this.I00iiO) {
                    }
/* 6 */             return 1;
                }
            }
