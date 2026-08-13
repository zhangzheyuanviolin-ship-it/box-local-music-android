            package p000;

            import java.util.AbstractMap;
            import java.util.AbstractSet;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import java.util.SortedMap;
            import java.util.TreeMap;
            
            public final class Ol1Ili0 extends AbstractMap {
                public static final int I00io1l = 0;
                public Object[] I00iOIl;
                public int I00iiI;
                public Map I00iiO;
                public boolean I00iio;
                public volatile I1IlioI1o1I I00ilI0I1;
                public Map I00ilO0;

                public static Ol1Ili0 I000O01llI0() {
/* 3 */             Ol1Ili0 ol1Ili0 = new Ol1Ili0();
/* 6 */             Map map = Collections.EMPTY_MAP;
/* 8 */             ol1Ili0.I00iiO = map;
/* 10 */            ol1Ili0.I00ilO0 = map;
/* 29 */            return ol1Ili0;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00000oIO(Comparable comparable) {
                    int i;
                    int i2;
/* 1 */             int i3 = this.I00iiI;
                    int i4 = i3 - 1;
/* 5 */             if (i4 < 0) {
/* 28 */                i = 0;
/* 29 */                while (i <= i4) {
/* 33 */                    int i5 = (i + i4) / 2;
/* 43 */                    int iCompareTo = comparable.compareTo(((Ol1IolOO) this.I00iOIl[i5]).I00iOIl);
/* 47 */                    if (iCompareTo < 0) {
                                i4 = i5 - 1;
                            } else {
/* 53 */                        if (iCompareTo <= 0) {
/* 59 */                            return i5;
                                }
/* 55 */                        i = i5 + 1;
                            }
                        }
/* 60 */                i2 = i + 1;
                    } else {
/* 15 */                int iCompareTo2 = comparable.compareTo(((Ol1IolOO) this.I00iOIl[i4]).I00iOIl);
/* 19 */                if (iCompareTo2 > 0) {
/* 21 */                    i2 = i3 + 1;
                        } else {
/* 25 */                    if (iCompareTo2 == 0) {
/* 27 */                        return i4;
                            }
/* 28 */                    i = 0;
/* 29 */                    while (i <= i4) {
                            }
/* 60 */                    i2 = i + 1;
                        }
                    }
/* 23 */            return -i2;
                }

                public final void I00000oOI() {
/* 3 */             if (this.I00iio) {
/* 6 */                 OIiilo1Ool0o.I000lI();
                    }
                }

                public final Ol1IolOO I0000Il00O(int i) {
/* 3 */             if (i < this.I00iiI) {
/* 9 */                 return (Ol1IolOO) this.I00iOIl[i];
                    }
/* 49 */            throw new ArrayIndexOutOfBoundsException(i);
                }

                public final Set I0000O() {
/* 16 */            return this.I00iiO.isEmpty() ? Collections.EMPTY_SET : this.I00iiO.entrySet();
                }

                public final SortedMap I000II() {
/* 1 */             I00000oOI();
/* 10 */            if (this.I00iiO.isEmpty() && !(this.I00iiO instanceof TreeMap)) {
/* 20 */                TreeMap treeMap = new TreeMap();
/* 23 */                this.I00iiO = treeMap;
/* 29 */                this.I00ilO0 = treeMap.descendingMap();
                    }
/* 33 */            return (SortedMap) this.I00iiO;
                }

                @Override
                public final Object put(Comparable comparable, Object obj) {
/* 1 */             I00000oOI();
/* 4 */             int iI00000oIO = I00000oIO(comparable);
/* 8 */             if (iI00000oIO >= 0) {
/* 16 */                return ((Ol1IolOO) this.I00iOIl[iI00000oIO]).setValue(obj);
                    }
/* 21 */            I00000oOI();
/* 24 */            Object[] objArr = this.I00iOIl;
/* 28 */            if (objArr == null) {
/* 30 */                objArr = new Object[16];
/* 32 */                this.I00iOIl = objArr;
                    }
/* 36 */            int i = -(iI00000oIO + 1);
/* 37 */            if (i >= 16) {
/* 43 */                return I000II().put(comparable, obj);
                    }
/* 48 */            int i2 = this.I00iiI;
/* 50 */            if (i2 == 16) {
/* 56 */                Ol1IolOO ol1IolOO = (Ol1IolOO) objArr[15];
/* 60 */                this.I00iiI = i2 - 1;
/* 70 */                I000II().put(ol1IolOO.I00iOIl, ol1IolOO.I00iiI);
                    }
/* 73 */            Object[] objArr2 = this.I00iOIl;
/* 81 */            System.arraycopy(objArr2, i, objArr2, i + 1, (objArr2.length - i) - 1);
/* 91 */            this.I00iOIl[i] = new Ol1IolOO(this, comparable, obj);
                    this.I00iiI++;
/* 99 */            return null;
                }

                public final Object I000OiO(int i) {
/* 1 */             I00000oOI();
/* 4 */             Object[] objArr = this.I00iOIl;
/* 10 */            Object obj = ((Ol1IolOO) objArr[i]).I00iiI;
/* 19 */            System.arraycopy(objArr, i + 1, objArr, i, (this.I00iiI - i) - 1);
                    this.I00iiI--;
/* 34 */            if (!this.I00iiO.isEmpty()) {
/* 44 */                Iterator it = I000II().entrySet().iterator();
/* 48 */                Object[] objArr2 = this.I00iOIl;
/* 50 */                int i2 = this.I00iiI;
/* 58 */                Map.Entry entry = (Map.Entry) it.next();
/* 73 */                objArr2[i2] = new Ol1IolOO(this, (Comparable) entry.getKey(), entry.getValue());
                        this.I00iiI++;
/* 81 */                it.remove();
                    }
/* 186 */           return obj;
                }

                @Override
                public final void clear() {
/* 1 */             I00000oOI();
/* 6 */             if (this.I00iiI != 0) {
/* 9 */                 this.I00iOIl = null;
/* 12 */                this.I00iiI = 0;
                    }
/* 20 */            if (this.I00iiO.isEmpty()) {
/* 29 */                return;
                    }
/* 24 */            this.I00iiO.clear();
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
                    return I00000oIO(comparable) >= 0 || this.I00iiO.containsKey(comparable);
                }

                @Override
                public final Set entrySet() {
/* 3 */             if (this.I00ilI0I1 == null) {
/* 11 */                this.I00ilI0I1 = new I1IlioI1o1I(this, 1);
                    }
/* 13 */            return this.I00ilI0I1;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 80 */                return true;
                    }
/* 6 */             if (!(obj instanceof Ol1Ili0)) {
/* 8 */                 return super.equals(obj);
                    }
/* 13 */            Ol1Ili0 ol1Ili0 = (Ol1Ili0) obj;
/* 15 */            int size = size();
/* 24 */            if (size == ol1Ili0.size()) {
/* 27 */                int i = this.I00iiI;
/* 31 */                if (i != ol1Ili0.I00iiI) {
/* 43 */                    return ((AbstractSet) entrySet()).equals(ol1Ili0.entrySet());
                        }
/* 49 */                for (int i2 = 0; i2 < i; i2++) {
/* 63 */                    if (I0000Il00O(i2).equals(ol1Ili0.I0000Il00O(i2))) {
                            }
                        }
/* 69 */                if (i != size) {
/* 75 */                    return this.I00iiO.equals(ol1Ili0.I00iiO);
                        }
/* 80 */                return true;
                    }
/* 23 */            return false;
                }

                @Override
                public final Object get(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
/* 3 */             int iI00000oIO = I00000oIO(comparable);
                    return iI00000oIO >= 0 ? ((Ol1IolOO) this.I00iOIl[iI00000oIO]).I00iiI : this.I00iiO.get(comparable);
                }

                @Override
                public final int hashCode() {
/* 1 */             int i = this.I00iiI;
/* 4 */             int iHashCode = 0;
/* 5 */             for (int i2 = 0; i2 < i; i2++) {
/* 15 */                iHashCode += this.I00iOIl[i2].hashCode();
                    }
                    return this.I00iiO.size() > 0 ? this.I00iiO.hashCode() + iHashCode : iHashCode;
                }

                @Override
                public final Object remove(Object obj) {
/* 1 */             I00000oOI();
/* 4 */             Comparable comparable = (Comparable) obj;
/* 6 */             int iI00000oIO = I00000oIO(comparable);
/* 10 */            if (iI00000oIO >= 0) {
/* 12 */                return I000OiO(iI00000oIO);
                    }
/* 23 */            if (this.I00iiO.isEmpty()) {
/* 25 */                return null;
                    }
/* 29 */            return this.I00iiO.remove(comparable);
                }

                @Override
                public final int size() {
/* 9 */             return this.I00iiO.size() + this.I00iiI;
                }
            }
