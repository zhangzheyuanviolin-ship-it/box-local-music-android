            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.Set;
            
            public final class Ol1I1i1 implements Map {
                public Object[] I00iOIl;

                public final int I00000oIO(Object obj) {
/* 6 */             if (!isEmpty() && obj != null) {
/* 11 */                int i = 0;
                        while (true) {
/* 12 */                    Object[] objArr = this.I00iOIl;
/* 15 */                    if (i >= objArr.length) {
                                break;
                            }
/* 23 */                    if (obj.equals(objArr[i])) {
/* 25 */                        return i;
                            }
/* 26 */                    i += 2;
                        }
                    }
/* 5 */             return -1;
                }

                @Override
                public final void clear() {
/* 2 */             this.I00iOIl = null;
                }

                @Override
                public final boolean containsKey(Object obj) {
                    return I00000oIO(obj) >= 0;
                }

                @Override
                public final boolean containsValue(Object obj) {
/* 6 */             int i = -1;
/* 7 */             if (!isEmpty() && obj != null) {
/* 12 */                int i2 = 1;
                        while (true) {
/* 13 */                    Object[] objArr = this.I00iOIl;
/* 16 */                    if (i2 >= objArr.length) {
                                break;
                            }
/* 24 */                    if (obj.equals(objArr[i2])) {
/* 26 */                        i = i2;
                                break;
                            }
/* 28 */                    i2 += 2;
                        }
                    }
                    return i >= 0;
                }

                @Override
                public final Set entrySet() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return Collections.EMPTY_SET;
                    }
/* 12 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 19 */            for (int i = 0; i < this.I00iOIl.length; i += 2) {
/* 23 */                Ol1I0iOo ol1I0iOo = new Ol1I0iOo();
/* 26 */                ol1I0iOo.I00iiI = this;
/* 28 */                ol1I0iOo.I00iOIl = i;
/* 30 */                VarHandle.storeStoreFence();
/* 33 */                linkedHashSet.add(ol1I0iOo);
                    }
/* 39 */            return Collections.unmodifiableSet(linkedHashSet);
                }

                @Override
                public final Object get(Object obj) {
/* 1 */             int iI00000oIO = I00000oIO(obj);
/* 5 */             if (iI00000oIO < 0) {
/* 7 */                 return null;
                    }
/* 13 */            return this.I00iOIl[iI00000oIO + 1];
                }

                @Override
                public final boolean isEmpty() {
/* 1 */             Object[] objArr = this.I00iOIl;
                    return objArr == null || objArr.length == 0;
                }

                @Override
                public final Set keySet() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return Collections.EMPTY_SET;
                    }
/* 12 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 15 */            int i = 0;
                    while (true) {
/* 16 */                Object[] objArr = this.I00iOIl;
/* 19 */                if (i >= objArr.length) {
/* 29 */                    return Collections.unmodifiableSet(linkedHashSet);
                        }
/* 23 */                linkedHashSet.add(objArr[i]);
/* 26 */                i += 2;
                    }
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 2 */             if (obj == null || obj2 == null) {
/* 52 */                IOOlIIilOl0.I000II("Key or value must not be null.");
/* 1 */                 return null;
                    }
/* 8 */             if (this.I00iOIl == null) {
/* 14 */                this.I00iOIl = new Object[]{obj, obj2};
/* 1 */                 return null;
                    }
/* 17 */            int iI00000oIO = I00000oIO(obj);
/* 21 */            Object[] objArr = this.I00iOIl;
/* 23 */            if (iI00000oIO >= 0) {
/* 43 */                int i = iI00000oIO + 1;
/* 45 */                Object obj3 = objArr[i];
/* 47 */                objArr[i] = obj2;
/* 49 */                return obj3;
                    }
/* 25 */            int length = objArr.length;
/* 28 */            Object[] objArr2 = new Object[length + 2];
/* 31 */            System.arraycopy(objArr, 0, objArr2, 0, length);
/* 34 */            objArr2[length] = obj;
/* 38 */            objArr2[length + 1] = obj2;
/* 40 */            this.I00iOIl = objArr2;
/* 1 */             return null;
                }

                @Override
                public final void putAll(Map map) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 5 */             int i = 0;
/* 6 */             if (objArr == null || objArr.length == 0) {
/* 118 */               this.I00iOIl = new Object[map.size() << 1];
/* 132 */               for (Map.Entry entry : map.entrySet()) {
/* 144 */                   if (entry.getKey() == null || entry.getValue() == null) {
/* 173 */                       IOOlIIilOl0.I000II("Key or value must not be null.");
/* 186 */                       return;
                            }
/* 154 */                   int i2 = i + 1;
/* 160 */                   this.I00iOIl[i] = entry.getKey();
/* 164 */                   i += 2;
/* 170 */                   this.I00iOIl[i2] = entry.getValue();
                        }
/* 186 */               return;
                    }
/* 12 */            int length = objArr.length;
/* 19 */            int size = (map.size() << 1) + length;
/* 20 */            Object[] objArr2 = new Object[size];
/* 24 */            System.arraycopy(this.I00iOIl, 0, objArr2, 0, length);
/* 39 */            for (Map.Entry entry2 : map.entrySet()) {
/* 51 */                if (entry2.getKey() == null || entry2.getValue() == null) {
/* 95 */                    IOOlIIilOl0.I000II("Key or value must not be null.");
/* 98 */                    return;
                        }
/* 63 */                int iI00000oIO = I00000oIO(entry2.getKey());
/* 67 */                if (iI00000oIO >= 0) {
/* 75 */                    objArr2[iI00000oIO + 1] = entry2.getValue();
                        } else {
/* 78 */                    int i3 = length + 1;
/* 84 */                    objArr2[length] = entry2.getKey();
/* 86 */                    length += 2;
/* 92 */                    objArr2[i3] = entry2.getValue();
                        }
                    }
/* 99 */            if (length < size) {
/* 101 */               Object[] objArr3 = new Object[length];
/* 103 */               System.arraycopy(objArr2, 0, objArr3, 0, length);
/* 106 */               objArr2 = objArr3;
                    }
/* 107 */           this.I00iOIl = objArr2;
                }

                @Override
                public final Object remove(Object obj) {
/* 1 */             int iI00000oIO = I00000oIO(obj);
/* 6 */             if (iI00000oIO < 0) {
/* 5 */                 return null;
                    }
/* 9 */             Object[] objArr = this.I00iOIl;
/* 13 */            Object obj2 = objArr[iI00000oIO + 1];
/* 15 */            int length = objArr.length;
/* 17 */            if (length == 2) {
/* 19 */                this.I00iOIl = null;
/* 21 */                return obj2;
                    }
/* 24 */            Object[] objArr2 = new Object[length - 2];
/* 27 */            System.arraycopy(objArr, 0, objArr2, 0, iI00000oIO);
/* 36 */            System.arraycopy(this.I00iOIl, iI00000oIO + 2, objArr2, iI00000oIO, (length - iI00000oIO) - 2);
/* 39 */            this.I00iOIl = objArr2;
/* 49 */            return obj2;
                }

                @Override
                public final int size() {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 3 */             if (objArr == null) {
/* 5 */                 return 0;
                    }
/* 8 */             return objArr.length >> 1;
                }

                @Override
                public final Collection values() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return Collections.EMPTY_SET;
                    }
/* 15 */            int i = 1;
/* 17 */            ArrayList arrayList = new ArrayList(this.I00iOIl.length >> 1);
                    while (true) {
/* 20 */                Object[] objArr = this.I00iOIl;
/* 23 */                if (i >= objArr.length) {
/* 33 */                    return Collections.unmodifiableList(arrayList);
                        }
/* 27 */                arrayList.add(objArr[i]);
/* 30 */                i += 2;
                    }
                }
            }
