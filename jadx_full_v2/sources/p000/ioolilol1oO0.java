            package p000;

            import java.util.AbstractMap;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import java.util.SortedMap;
            import java.util.TreeMap;
            
            public final class ioolilol1oO0 extends AbstractMap {
                public static final int I00io1l = 0;
                public Object[] I00iOIl;
                public int I00iiI;
                public Map I00iiO;
                public boolean I00iio;
                public volatile I1IlioI1o1I I00ilI0I1;
                public Map I00ilO0;

                public ioolilol1oO0() {
/* 4 */             Map map = Collections.EMPTY_MAP;
/* 6 */             this.I00iiO = map;
/* 8 */             this.I00ilO0 = map;
                }

                public final Set I00000oIO() {
/* 16 */            return this.I00iiO.isEmpty() ? Collections.EMPTY_SET : this.I00iiO.entrySet();
                }

                @Override
                public final Object put(Comparable comparable, Object obj) {
/* 1 */             I000OOo1O();
/* 4 */             int iI0000O = I0000O(comparable);
/* 8 */             if (iI0000O >= 0) {
/* 16 */                return ((ioooi010) this.I00iOIl[iI0000O]).setValue(obj);
                    }
/* 21 */            I000OOo1O();
/* 24 */            Object[] objArr = this.I00iOIl;
/* 28 */            if (objArr == null) {
/* 30 */                objArr = new Object[16];
/* 32 */                this.I00iOIl = objArr;
                    }
/* 36 */            int i = -(iI0000O + 1);
/* 37 */            if (i >= 16) {
/* 43 */                return I000O01llI0().put(comparable, obj);
                    }
/* 50 */            if (this.I00iiI == 16) {
/* 56 */                ioooi010 ioooi010Var = (ioooi010) objArr[15];
/* 58 */                this.I00iiI = 15;
/* 68 */                I000O01llI0().put(ioooi010Var.I00iOIl, ioooi010Var.I00iiI);
                    }
/* 71 */            Object[] objArr2 = this.I00iOIl;
/* 75 */            int length = objArr2.length;
/* 78 */            System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
/* 88 */            this.I00iOIl[i] = new ioooi010(this, comparable, obj);
                    this.I00iiI++;
/* 96 */            return null;
                }

                public final ioooi010 I0000Il00O(int i) {
/* 3 */             if (i < this.I00iiI) {
/* 9 */                 return (ioooi010) this.I00iOIl[i];
                    }
/* 29 */            throw new ArrayIndexOutOfBoundsException(i);
                }

                public final int I0000O(Comparable comparable) {
/* 1 */             int i = this.I00iiI;
                    int i2 = i - 1;
/* 5 */             int i3 = 0;
/* 6 */             if (i2 >= 0) {
/* 16 */                int iCompareTo = comparable.compareTo(((ioooi010) this.I00iOIl[i2]).I00iOIl);
/* 20 */                if (iCompareTo > 0) {
/* 24 */                    return -(i + 1);
                        }
/* 26 */                if (iCompareTo == 0) {
/* 29 */                    return i2;
                        }
                    }
/* 30 */            while (i3 <= i2) {
/* 34 */                int i4 = (i3 + i2) / 2;
/* 44 */                int iCompareTo2 = comparable.compareTo(((ioooi010) this.I00iOIl[i4]).I00iOIl);
/* 48 */                if (iCompareTo2 < 0) {
                            i2 = i4 - 1;
                        } else {
/* 53 */                    if (iCompareTo2 <= 0) {
/* 58 */                        return i4;
                            }
/* 55 */                    i3 = i4 + 1;
                        }
                    }
/* 61 */            return -(i3 + 1);
                }

                public final Object I000II(int i) {
/* 1 */             I000OOo1O();
/* 4 */             Object[] objArr = this.I00iOIl;
/* 10 */            Object obj = ((ioooi010) objArr[i]).I00iiI;
/* 19 */            System.arraycopy(objArr, i + 1, objArr, i, (this.I00iiI - i) - 1);
                    this.I00iiI--;
/* 34 */            if (!this.I00iiO.isEmpty()) {
/* 44 */                Iterator it = I000O01llI0().entrySet().iterator();
/* 48 */                Object[] objArr2 = this.I00iOIl;
/* 50 */                int i2 = this.I00iiI;
/* 58 */                Map.Entry entry = (Map.Entry) it.next();
/* 73 */                objArr2[i2] = new ioooi010(this, (Comparable) entry.getKey(), entry.getValue());
                        this.I00iiI++;
/* 81 */                it.remove();
                    }
/* 168 */           return obj;
                }

                public final SortedMap I000O01llI0() {
/* 1 */             I000OOo1O();
/* 10 */            if (this.I00iiO.isEmpty() && !(this.I00iiO instanceof TreeMap)) {
/* 20 */                TreeMap treeMap = new TreeMap();
/* 23 */                this.I00iiO = treeMap;
/* 29 */                this.I00ilO0 = treeMap.descendingMap();
                    }
/* 33 */            return (SortedMap) this.I00iiO;
                }

                public final void I000OOo1O() {
/* 3 */             if (this.I00iio) {
/* 6 */                 OIiilo1Ool0o.I000lI();
                    }
                }

                @Override
                public final void clear() {
/* 1 */             I000OOo1O();
/* 6 */             if (this.I00iiI != 0) {
/* 9 */                 this.I00iOIl = null;
/* 12 */                this.I00iiI = 0;
                    }
/* 20 */            if (this.I00iiO.isEmpty()) {
/* 55 */                return;
                    }
/* 24 */            this.I00iiO.clear();
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
                    return I0000O(comparable) >= 0 || this.I00iiO.containsKey(comparable);
                }

                @Override
                public final Set entrySet() {
/* 3 */             if (this.I00ilI0I1 == null) {
/* 12 */                this.I00ilI0I1 = new I1IlioI1o1I(this, 8);
                    }
/* 14 */            return this.I00ilI0I1;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 64 */                return true;
                    }
/* 6 */             if (!(obj instanceof ioolilol1oO0)) {
/* 8 */                 return super.equals(obj);
                    }
/* 13 */            ioolilol1oO0 ioolilol1oo0 = (ioolilol1oO0) obj;
/* 15 */            int size = size();
/* 24 */            if (size == ioolilol1oo0.size()) {
/* 26 */                int i = this.I00iiI;
/* 30 */                if (i != ioolilol1oo0.I00iiI) {
/* 74 */                    return entrySet().equals(ioolilol1oo0.entrySet());
                        }
/* 33 */                for (int i2 = 0; i2 < i; i2++) {
/* 47 */                    if (I0000Il00O(i2).equals(ioolilol1oo0.I0000Il00O(i2))) {
                            }
                        }
/* 53 */                if (i != size) {
/* 59 */                    return this.I00iiO.equals(ioolilol1oo0.I00iiO);
                        }
/* 64 */                return true;
                    }
/* 23 */            return false;
                }

                @Override
                public final Object get(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
/* 3 */             int iI0000O = I0000O(comparable);
                    return iI0000O >= 0 ? ((ioooi010) this.I00iOIl[iI0000O]).I00iiI : this.I00iiO.get(comparable);
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
/* 1 */             I000OOo1O();
/* 4 */             Comparable comparable = (Comparable) obj;
/* 6 */             int iI0000O = I0000O(comparable);
/* 10 */            if (iI0000O >= 0) {
/* 12 */                return I000II(iI0000O);
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
