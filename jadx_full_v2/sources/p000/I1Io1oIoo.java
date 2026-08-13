            package p000;

            import java.lang.reflect.Array;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            
/* 34 */    public final class I1Io1oIoo implements Collection, Set, O0IlOIOIoOI, O0Io11IiO0l {
                public int[] I00iOIl = iIIl1I0OIlO0.I00000oIO;
                public Object[] I00iiI = iIIl1I0OIlO0.I0000Il00O;
                public int I00iiO;

                public I1Io1oIoo(int i) {
                }

                public final Object I00000oOI(int i) {
/* 1 */             int i2 = this.I00iiO;
/* 3 */             Object[] objArr = this.I00iiI;
/* 5 */             Object obj = objArr[i];
/* 8 */             if (i2 <= 1) {
/* 10 */                clear();
/* 13 */                return obj;
                    }
                    int i3 = i2 - 1;
/* 16 */            int[] iArr = this.I00iOIl;
/* 22 */            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
/* 70 */                if (i < i3) {
/* 72 */                    int i4 = i + 1;
/* 74 */                    I1IoiO1l.I000O01llI0(i, i4, i2, iArr, iArr);
/* 77 */                    Object[] objArr2 = this.I00iiI;
/* 79 */                    I1IoiO1l.I000iOII(objArr2, i, objArr2, i4, i2);
                        }
/* 84 */                this.I00iiI[i3] = null;
                    } else {
/* 33 */                int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
/* 35 */                int[] iArr2 = new int[i5];
/* 37 */                this.I00iOIl = iArr2;
/* 41 */                this.I00iiI = new Object[i5];
/* 43 */                if (i > 0) {
/* 47 */                    I1IoiO1l.I000l1(0, i, 6, iArr, iArr2);
/* 52 */                    I1IoiO1l.I000oI1ioi(objArr, 0, this.I00iiI, i, 6);
                        }
/* 55 */                if (i < i3) {
/* 59 */                    int i6 = i + 1;
/* 61 */                    I1IoiO1l.I000O01llI0(i, i6, i2, iArr, this.I00iOIl);
/* 66 */                    I1IoiO1l.I000iOII(objArr, i, this.I00iiI, i6, i2);
                        }
                    }
/* 88 */            if (i2 == this.I00iiO) {
/* 90 */                this.I00iiO = i3;
/* 92 */                return obj;
                    }
/* 93 */            I000II.I001IIilI0O();
/* 19 */            return null;
                }

                @Override
                public final boolean add(Object obj) {
                    int i;
                    int iI00000oIO;
/* 1 */             int i2 = this.I00iiO;
/* 4 */             if (obj == null) {
/* 7 */                 iI00000oIO = iOO1OO01O.I00000oIO(this, null, 0);
/* 11 */                i = 0;
                    } else {
/* 13 */                int iHashCode = obj.hashCode();
/* 22 */                i = iHashCode;
/* 17 */                iI00000oIO = iOO1OO01O.I00000oIO(this, obj, iHashCode);
                    }
/* 24 */            if (iI00000oIO >= 0) {
/* 3 */                 return false;
                    }
/* 27 */            int i3 = ~iI00000oIO;
/* 28 */            int[] iArr = this.I00iOIl;
/* 31 */            if (i2 >= iArr.length) {
/* 33 */                int i4 = 8;
/* 35 */                if (i2 >= 8) {
/* 39 */                    i4 = (i2 >> 1) + i2;
                        } else if (i2 < 4) {
/* 45 */                    i4 = 4;
                        }
/* 46 */                Object[] objArr = this.I00iiI;
/* 48 */                int[] iArr2 = new int[i4];
/* 50 */                this.I00iOIl = iArr2;
/* 54 */                this.I00iiI = new Object[i4];
/* 58 */                if (i2 != this.I00iiO) {
/* 76 */                    I000II.I001IIilI0O();
/* 3 */                     return false;
                        }
/* 61 */                if (iArr2.length != 0) {
/* 66 */                    I1IoiO1l.I000l1(0, iArr.length, 6, iArr, iArr2);
/* 72 */                    I1IoiO1l.I000oI1ioi(objArr, 0, this.I00iiI, objArr.length, 6);
                        }
                    }
/* 80 */            if (i3 < i2) {
/* 82 */                int[] iArr3 = this.I00iOIl;
/* 84 */                int i5 = i3 + 1;
/* 86 */                I1IoiO1l.I000O01llI0(i5, i3, i2, iArr3, iArr3);
/* 89 */                Object[] objArr2 = this.I00iiI;
/* 91 */                I1IoiO1l.I000iOII(objArr2, i5, objArr2, i3, i2);
                    }
/* 94 */            int i6 = this.I00iiO;
/* 96 */            if (i2 == i6) {
/* 98 */                int[] iArr4 = this.I00iOIl;
/* 101 */               if (i3 < iArr4.length) {
/* 103 */                   iArr4[i3] = i;
/* 107 */                   this.I00iiI[i3] = obj;
/* 111 */                   this.I00iiO = i6 + 1;
/* 109 */                   return true;
                        }
                    }
/* 114 */           I000II.I001IIilI0O();
/* 3 */             return false;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 7 */             int size = collection.size() + this.I00iiO;
/* 8 */             int i = this.I00iiO;
/* 10 */            int[] iArr = this.I00iOIl;
/* 13 */            boolean zAdd = false;
/* 14 */            if (iArr.length < size) {
/* 16 */                Object[] objArr = this.I00iiI;
/* 18 */                int[] iArr2 = new int[size];
/* 20 */                this.I00iOIl = iArr2;
/* 24 */                this.I00iiI = new Object[size];
/* 26 */                if (i > 0) {
/* 29 */                    I1IoiO1l.I000l1(0, i, 6, iArr, iArr2);
/* 36 */                    I1IoiO1l.I000oI1ioi(objArr, 0, this.I00iiI, this.I00iiO, 6);
                        }
                    }
/* 41 */            if (this.I00iiO != i) {
/* 64 */                I000II.I001IIilI0O();
/* 13 */                return false;
                    }
/* 43 */            Iterator it = collection.iterator();
/* 51 */            while (it.hasNext()) {
/* 61 */                zAdd |= add(it.next());
                    }
/* 63 */            return zAdd;
                }

                @Override
                public final void clear() {
/* 1 */             int i = this.I00iiO;
/* 3 */             if (i != 0) {
/* 7 */                 this.I00iOIl = iIIl1I0OIlO0.I00000oIO;
/* 11 */                this.I00iiI = iIIl1I0OIlO0.I0000Il00O;
/* 13 */                i = 0;
/* 14 */                this.I00iiO = 0;
                    }
/* 16 */            if (i == 0) {
/* 18 */                return;
                    }
/* 19 */            I000II.I001IIilI0O();
                }

                @Override
                public final boolean contains(Object obj) {
                    return (obj == null ? iOO1OO01O.I00000oIO(this, null, 0) : iOO1OO01O.I00000oIO(this, obj, obj.hashCode())) >= 0;
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 1 */             Iterator it = collection.iterator();
/* 9 */             while (it.hasNext()) {
/* 19 */                if (!contains(it.next())) {
/* 21 */                    return false;
                        }
                    }
/* 23 */            return true;
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Set) || this.I00iiO != ((Set) obj).size()) {
/* 7 */                 return false;
                    }
                    try {
/* 22 */                int i = this.I00iiO;
/* 25 */                for (int i2 = 0; i2 < i; i2++) {
/* 38 */                    if (!((Set) obj).contains(this.I00iiI[i2])) {
/* 7 */                         return false;
                            }
                        }
/* 1 */                 return true;
                    } catch (ClassCastException | NullPointerException unused) {
/* 7 */                 return false;
                    }
                }

                @Override
                public final int hashCode() {
/* 1 */             int[] iArr = this.I00iOIl;
/* 3 */             int i = this.I00iiO;
/* 6 */             int i2 = 0;
/* 7 */             for (int i3 = 0; i3 < i; i3++) {
/* 11 */                i2 += iArr[i3];
                    }
/* 20 */            return i2;
                }

                @Override
                public final boolean isEmpty() {
                    return this.I00iiO <= 0;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             return new I1IlliII1i(this);
                }

                @Override
                public final boolean remove(Object obj) {
/* 14 */            int iI00000oIO = obj == null ? iOO1OO01O.I00000oIO(this, null, 0) : iOO1OO01O.I00000oIO(this, obj, obj.hashCode());
/* 18 */            if (iI00000oIO < 0) {
/* 1 */                 return false;
                    }
/* 20 */            I00000oOI(iI00000oIO);
/* 23 */            return true;
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             Iterator it = collection.iterator();
/* 5 */             boolean zRemove = false;
/* 10 */            while (it.hasNext()) {
/* 20 */                zRemove |= remove(it.next());
                    }
/* 29 */            return zRemove;
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 5 */             boolean z = false;
/* 7 */             for (int i = this.I00iiO - 1; -1 < i; i--) {
/* 20 */                if (!IOOi0Ool1i.I001i1O0Ol(collection, this.I00iiI[i])) {
/* 22 */                    I00000oOI(i);
/* 25 */                    z = true;
                        }
                    }
/* 29 */            return z;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Object[] toArray(Object[] objArr) {
/* 1 */             int i = this.I00iiO;
/* 4 */             if (objArr.length < i) {
/* 18 */                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
                    } else if (objArr.length > i) {
/* 25 */                objArr[i] = null;
                    }
/* 32 */            I1IoiO1l.I000iOII(this.I00iiI, 0, objArr, 0, this.I00iiO);
/* 77 */            return objArr;
                }

                public final String toString() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return "{}";
                    }
/* 16 */            StringBuilder sb = new StringBuilder(this.I00iiO * 14);
/* 21 */            sb.append('{');
/* 24 */            int i = this.I00iiO;
/* 27 */            for (int i2 = 0; i2 < i; i2++) {
/* 29 */                if (i2 > 0) {
/* 33 */                    sb.append(", ");
                        }
/* 38 */                Object obj = this.I00iiI[i2];
/* 40 */                if (obj != this) {
/* 42 */                    sb.append(obj);
                        } else {
/* 48 */                    sb.append("(this Set)");
                        }
                    }
/* 56 */            sb.append('}');
/* 59 */            return sb.toString();
                }

                @Override
/* 35 */        public final Object[] toArray() {
/* 36 */            return I1IoiO1l.I00100o1O0lo(this.I00iiI, 0, this.I00iiO);
                }
            }
