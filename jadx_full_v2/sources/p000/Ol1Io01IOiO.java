            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractMap;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.SortedMap;
            import java.util.TreeMap;
            
            public final class Ol1Io01IOiO extends AbstractMap {
                public static final int I00ilO0 = 0;
                public int I00iOIl;
                public List I00iiI;
                public Map I00iiO;
                public boolean I00iio;
                public volatile I1IlioI1o1I I00ilI0I1;

                public static Ol1Io01IOiO I000II(int i) {
/* 3 */             Ol1Io01IOiO ol1Io01IOiO = new Ol1Io01IOiO();
/* 6 */             ol1Io01IOiO.I00iOIl = i;
/* 10 */            ol1Io01IOiO.I00iiI = Collections.EMPTY_LIST;
/* 14 */            ol1Io01IOiO.I00iiO = Collections.EMPTY_MAP;
/* 16 */            VarHandle.storeStoreFence();
/* 49 */            return ol1Io01IOiO;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00000oIO(Comparable comparable) {
                    int i;
                    int i2;
/* 3 */             int size = this.I00iiI.size();
                    int i3 = size - 1;
/* 9 */             if (i3 < 0) {
/* 34 */                i = 0;
/* 35 */                while (i <= i3) {
/* 39 */                    int i4 = (i + i3) / 2;
/* 51 */                    int iCompareTo = comparable.compareTo(((Ol1Ioo1) this.I00iiI.get(i4)).I00iOIl);
/* 55 */                    if (iCompareTo < 0) {
                                i3 = i4 - 1;
                            } else {
/* 61 */                        if (iCompareTo <= 0) {
/* 67 */                            return i4;
                                }
/* 63 */                        i = i4 + 1;
                            }
                        }
/* 68 */                i2 = i + 1;
                    } else {
/* 21 */                int iCompareTo2 = comparable.compareTo(((Ol1Ioo1) this.I00iiI.get(i3)).I00iOIl);
/* 25 */                if (iCompareTo2 > 0) {
/* 27 */                    i2 = size + 1;
                        } else {
/* 31 */                    if (iCompareTo2 == 0) {
/* 33 */                        return i3;
                            }
/* 34 */                    i = 0;
/* 35 */                    while (i <= i3) {
                            }
/* 68 */                    i2 = i + 1;
                        }
                    }
/* 29 */            return -i2;
                }

                public final void I00000oOI() {
/* 3 */             if (this.I00iio) {
/* 6 */                 OIiilo1Ool0o.I000lI();
                    }
                }

                public final Iterable I0000Il00O() {
                    return this.I00iiO.isEmpty() ? iO0oioo0loli.I00000oOI : this.I00iiO.entrySet();
                }

                public final SortedMap I0000O() {
/* 1 */             I00000oOI();
/* 10 */            if (this.I00iiO.isEmpty() && !(this.I00iiO instanceof TreeMap)) {
/* 23 */                this.I00iiO = new TreeMap();
                    }
/* 27 */            return (SortedMap) this.I00iiO;
                }

                @Override
                public final Object put(Comparable comparable, Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             I00000oOI();
/* 6 */             int iI00000oIO = I00000oIO(comparable);
/* 10 */            if (iI00000oIO >= 0) {
/* 20 */                return ((Ol1Ioo1) this.I00iiI.get(iI00000oIO)).setValue(obj);
                    }
/* 25 */            I00000oOI();
/* 34 */            if (this.I00iiI.isEmpty() && !(this.I00iiI instanceof ArrayList)) {
/* 47 */                this.I00iiI = new ArrayList(i);
                    }
/* 51 */            int i2 = -(iI00000oIO + 1);
/* 52 */            if (i2 >= i) {
/* 58 */                return I0000O().put(comparable, obj);
                    }
/* 69 */            if (this.I00iiI.size() == i) {
/* 79 */                Ol1Ioo1 ol1Ioo1 = (Ol1Ioo1) this.I00iiI.remove(i - 1);
/* 89 */                I0000O().put(ol1Ioo1.I00iOIl, ol1Ioo1.I00iiI);
                    }
/* 99 */            this.I00iiI.add(i2, new Ol1Ioo1(this, comparable, obj));
/* 102 */           return null;
                }

                public final Object I000OOo1O(int i) {
/* 1 */             I00000oOI();
/* 12 */            Object obj = ((Ol1Ioo1) this.I00iiI.remove(i)).I00iiI;
/* 20 */            if (!this.I00iiO.isEmpty()) {
/* 30 */                Iterator it = I0000O().entrySet().iterator();
/* 34 */                List list = this.I00iiI;
/* 42 */                Map.Entry entry = (Map.Entry) it.next();
/* 57 */                list.add(new Ol1Ioo1(this, (Comparable) entry.getKey(), entry.getValue()));
/* 60 */                it.remove();
                    }
/* 186 */           return obj;
                }

                @Override
                public final void clear() {
/* 1 */             I00000oOI();
/* 10 */            if (!this.I00iiI.isEmpty()) {
/* 14 */                this.I00iiI.clear();
                    }
/* 23 */            if (this.I00iiO.isEmpty()) {
/* 113 */               return;
                    }
/* 27 */            this.I00iiO.clear();
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
                    return I00000oIO(comparable) >= 0 || this.I00iiO.containsKey(comparable);
                }

                @Override
                public final Set entrySet() {
/* 3 */             if (this.I00ilI0I1 == null) {
/* 11 */                this.I00ilI0I1 = new I1IlioI1o1I(this, 2);
                    }
/* 13 */            return this.I00ilI0I1;
                }

                @Override
                public final Object get(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
/* 3 */             int iI00000oIO = I00000oIO(comparable);
                    return iI00000oIO >= 0 ? ((Ol1Ioo1) this.I00iiI.get(iI00000oIO)).I00iiI : this.I00iiO.get(comparable);
                }

                @Override
                public final Object remove(Object obj) {
/* 1 */             I00000oOI();
/* 4 */             Comparable comparable = (Comparable) obj;
/* 6 */             int iI00000oIO = I00000oIO(comparable);
/* 10 */            if (iI00000oIO >= 0) {
/* 12 */                return I000OOo1O(iI00000oIO);
                    }
/* 23 */            if (this.I00iiO.isEmpty()) {
/* 25 */                return null;
                    }
/* 29 */            return this.I00iiO.remove(comparable);
                }

                @Override
                public final int size() {
/* 13 */            return this.I00iiO.size() + this.I00iiI.size();
                }
            }
