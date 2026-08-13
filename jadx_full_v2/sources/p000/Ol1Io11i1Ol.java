            package p000;

            import java.util.AbstractMap;
            import java.util.AbstractSet;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.SortedMap;
            import java.util.TreeMap;
            
            public final class Ol1Io11i1Ol extends AbstractMap {
                public static final int I00ilO0 = 0;
                public List I00iOIl;
                public Map I00iiI;
                public boolean I00iiO;
                public volatile I1IlioI1o1I I00iio;
                public Map I00ilI0I1;

                public static Ol1Io11i1Ol I000O01llI0() {
/* 3 */             Ol1Io11i1Ol ol1Io11i1Ol = new Ol1Io11i1Ol();
/* 8 */             ol1Io11i1Ol.I00iOIl = Collections.EMPTY_LIST;
/* 10 */            Map map = Collections.EMPTY_MAP;
/* 12 */            ol1Io11i1Ol.I00iiI = map;
/* 14 */            ol1Io11i1Ol.I00ilI0I1 = map;
/* 20 */            return ol1Io11i1Ol;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00000oIO(Comparable comparable) {
                    int i;
                    int i2;
/* 3 */             int size = this.I00iOIl.size();
                    int i3 = size - 1;
/* 9 */             if (i3 < 0) {
/* 34 */                i = 0;
/* 35 */                while (i <= i3) {
/* 39 */                    int i4 = (i + i3) / 2;
/* 51 */                    int iCompareTo = comparable.compareTo(((Ol1O01Ii) this.I00iOIl.get(i4)).I00iOIl);
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
/* 21 */                int iCompareTo2 = comparable.compareTo(((Ol1O01Ii) this.I00iOIl.get(i3)).I00iOIl);
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
/* 3 */             if (this.I00iiO) {
/* 6 */                 OIiilo1Ool0o.I000lI();
                    }
                }

                public final Map.Entry I0000Il00O(int i) {
/* 7 */             return (Map.Entry) this.I00iOIl.get(i);
                }

                public final Set I0000O() {
/* 16 */            return this.I00iiI.isEmpty() ? Collections.EMPTY_SET : this.I00iiI.entrySet();
                }

                public final SortedMap I000II() {
/* 1 */             I00000oOI();
/* 10 */            if (this.I00iiI.isEmpty() && !(this.I00iiI instanceof TreeMap)) {
/* 20 */                TreeMap treeMap = new TreeMap();
/* 23 */                this.I00iiI = treeMap;
/* 29 */                this.I00ilI0I1 = treeMap.descendingMap();
                    }
/* 33 */            return (SortedMap) this.I00iiI;
                }

                @Override
                public final Object put(Comparable comparable, Object obj) {
/* 1 */             I00000oOI();
/* 4 */             int iI00000oIO = I00000oIO(comparable);
/* 8 */             if (iI00000oIO >= 0) {
/* 18 */                return ((Ol1O01Ii) this.I00iOIl.get(iI00000oIO)).setValue(obj);
                    }
/* 23 */            I00000oOI();
/* 34 */            if (this.I00iOIl.isEmpty() && !(this.I00iOIl instanceof ArrayList)) {
/* 47 */                this.I00iOIl = new ArrayList(16);
                    }
/* 51 */            int i = -(iI00000oIO + 1);
/* 52 */            if (i >= 16) {
/* 58 */                return I000II().put(comparable, obj);
                    }
/* 69 */            if (this.I00iOIl.size() == 16) {
/* 79 */                Ol1O01Ii ol1O01Ii = (Ol1O01Ii) this.I00iOIl.remove(15);
/* 89 */                I000II().put(ol1O01Ii.I00iOIl, ol1O01Ii.I00iiI);
                    }
/* 99 */            this.I00iOIl.add(i, new Ol1O01Ii(this, comparable, obj));
/* 102 */           return null;
                }

                public final Object I000OiO(int i) {
/* 1 */             I00000oOI();
/* 12 */            Object obj = ((Ol1O01Ii) this.I00iOIl.remove(i)).I00iiI;
/* 20 */            if (!this.I00iiI.isEmpty()) {
/* 30 */                Iterator it = I000II().entrySet().iterator();
/* 34 */                List list = this.I00iOIl;
/* 42 */                Map.Entry entry = (Map.Entry) it.next();
/* 57 */                list.add(new Ol1O01Ii(this, (Comparable) entry.getKey(), entry.getValue()));
/* 60 */                it.remove();
                    }
/* 77 */            return obj;
                }

                @Override
                public final void clear() {
/* 1 */             I00000oOI();
/* 10 */            if (!this.I00iOIl.isEmpty()) {
/* 14 */                this.I00iOIl.clear();
                    }
/* 23 */            if (this.I00iiI.isEmpty()) {
/* 55 */                return;
                    }
/* 27 */            this.I00iiI.clear();
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
                    return I00000oIO(comparable) >= 0 || this.I00iiI.containsKey(comparable);
                }

                @Override
                public final Set entrySet() {
/* 3 */             if (this.I00iio == null) {
/* 11 */                this.I00iio = new I1IlioI1o1I(this, 3);
                    }
/* 13 */            return this.I00iio;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 88 */                return true;
                    }
/* 6 */             if (!(obj instanceof Ol1Io11i1Ol)) {
/* 8 */                 return super.equals(obj);
                    }
/* 13 */            Ol1Io11i1Ol ol1Io11i1Ol = (Ol1Io11i1Ol) obj;
/* 15 */            int size = size();
/* 24 */            if (size == ol1Io11i1Ol.size()) {
/* 29 */                int size2 = this.I00iOIl.size();
/* 39 */                if (size2 != ol1Io11i1Ol.I00iOIl.size()) {
/* 51 */                    return ((AbstractSet) entrySet()).equals(ol1Io11i1Ol.entrySet());
                        }
/* 57 */                for (int i = 0; i < size2; i++) {
/* 71 */                    if (I0000Il00O(i).equals(ol1Io11i1Ol.I0000Il00O(i))) {
                            }
                        }
/* 77 */                if (size2 != size) {
/* 83 */                    return this.I00iiI.equals(ol1Io11i1Ol.I00iiI);
                        }
/* 88 */                return true;
                    }
/* 23 */            return false;
                }

                @Override
                public final Object get(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
/* 3 */             int iI00000oIO = I00000oIO(comparable);
                    return iI00000oIO >= 0 ? ((Ol1O01Ii) this.I00iOIl.get(iI00000oIO)).I00iiI : this.I00iiI.get(comparable);
                }

                @Override
                public final int hashCode() {
/* 3 */             int size = this.I00iOIl.size();
/* 8 */             int iHashCode = 0;
/* 9 */             for (int i = 0; i < size; i++) {
/* 23 */                iHashCode += ((Ol1O01Ii) this.I00iOIl.get(i)).hashCode();
                    }
                    return this.I00iiI.size() > 0 ? this.I00iiI.hashCode() + iHashCode : iHashCode;
                }

                @Override
                public final Object remove(Object obj) {
/* 1 */             I00000oOI();
/* 4 */             Comparable comparable = (Comparable) obj;
/* 6 */             int iI00000oIO = I00000oIO(comparable);
/* 10 */            if (iI00000oIO >= 0) {
/* 12 */                return I000OiO(iI00000oIO);
                    }
/* 23 */            if (this.I00iiI.isEmpty()) {
/* 25 */                return null;
                    }
/* 29 */            return this.I00iiI.remove(comparable);
                }

                @Override
                public final int size() {
/* 13 */            return this.I00iiI.size() + this.I00iOIl.size();
                }
            }
