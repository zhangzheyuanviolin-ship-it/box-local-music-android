            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Array;
            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.RandomAccess;
            
/* 78 */    public final class Ol1O1o01 extends AbstractList implements RandomAccess {
                public int I00iOIl;
                public Object I00iiI;

                public static void I00000oOI(int i) {
/* 19 */            String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 34 */            Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
                    switch (i) {
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                        case 7:
/* 52 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                            break;
                        case 4:
/* 49 */                    objArr[0] = "a";
                            break;
                        default:
/* 44 */                    objArr[0] = "elements";
                            break;
                    }
/* 57 */            if (i == 2 || i == 3) {
/* 75 */                objArr[1] = "iterator";
                    } else if (i == 5 || i == 6 || i == 7) {
/* 70 */                objArr[1] = "toArray";
                    } else {
/* 67 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                    }
                    switch (i) {
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                        case 7:
                            break;
                        case 4:
/* 85 */                    objArr[2] = "toArray";
                            break;
                        default:
/* 82 */                    objArr[2] = "<init>";
                            break;
                    }
/* 87 */            String str2 = String.format(str, objArr);
/* 91 */            if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
/* 112 */               throw new IllegalArgumentException(str2);
                    }
/* 112 */           throw new IllegalStateException(str2);
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             if (i < 0 || i > (i2 = this.I00iOIl)) {
/* 76 */                OIiilo1Ool0o.I0000Il00O(this.I00iOIl, IlIi0I0.I00100o1O0lo("Index: ", i, ", Size: "));
/* 89 */                return;
                    }
/* 8 */             if (i2 == 0) {
/* 10 */                this.I00iiI = obj;
                    } else if (i2 == 1 && i == 0) {
/* 23 */                this.I00iiI = new Object[]{obj, this.I00iiI};
                    } else {
/* 28 */                Object[] objArr = new Object[i2 + 1];
/* 30 */                Object obj2 = this.I00iiI;
/* 33 */                if (i2 == 1) {
/* 35 */                    objArr[0] = obj2;
                        } else {
/* 38 */                    Object[] objArr2 = (Object[]) obj2;
/* 40 */                    System.arraycopy(objArr2, 0, objArr, 0, i);
/* 48 */                    System.arraycopy(objArr2, i, objArr, i + 1, this.I00iOIl - i);
                        }
/* 51 */                objArr[i] = obj;
/* 53 */                this.I00iiI = objArr;
                    }
                    this.I00iOIl++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final void clear() {
/* 2 */             this.I00iiI = null;
/* 5 */             this.I00iOIl = 0;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object get(int i) {
                    int i2;
/* 1 */             if (i < 0 || i >= (i2 = this.I00iOIl)) {
/* 28 */                OIiilo1Ool0o.I0000Il00O(this.I00iOIl, IlIi0I0.I00100o1O0lo("Index: ", i, ", Size: "));
/* 31 */                return null;
                    }
/* 7 */             Object obj = this.I00iiI;
                    return i2 == 1 ? obj : ((Object[]) obj)[i];
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             if (i == 0) {
/* 5 */                 return Ol1O1i.I00iiI;
                    }
/* 9 */             if (i == 1) {
/* 13 */                Ol1O1liO ol1O1liO = new Ol1O1liO();
/* 16 */                ol1O1liO.I00iiO = this;
/* 20 */                ol1O1liO.I00iiI = ((AbstractList) this).modCount;
/* 22 */                VarHandle.storeStoreFence();
/* 25 */                return ol1O1liO;
                    }
/* 26 */            Iterator it = super.iterator();
/* 30 */            if (it != null) {
/* 32 */                return it;
                    }
/* 34 */            I00000oOI(3);
/* 113 */           throw null;
                }

                @Override
                public final Object remove(int i) {
                    int i2;
/* 2 */             if (i < 0 || i >= (i2 = this.I00iOIl)) {
/* 65 */                OIiilo1Ool0o.I0000Il00O(this.I00iOIl, IlIi0I0.I00100o1O0lo("Index: ", i, ", Size: "));
/* 1 */                 return null;
                    }
/* 8 */             Object obj = this.I00iiI;
/* 11 */            if (i2 == 1) {
/* 13 */                this.I00iiI = null;
                    } else {
/* 16 */                Object[] objArr = (Object[]) obj;
/* 18 */                Object obj2 = objArr[i];
/* 21 */                if (i2 == 2) {
/* 27 */                    this.I00iiI = objArr[1 - i];
                        } else {
/* 31 */                    int i3 = (i2 - i) - 1;
/* 32 */                    if (i3 > 0) {
/* 36 */                        System.arraycopy(objArr, i + 1, objArr, i, i3);
                            }
/* 39 */                    i2 = this.I00iOIl;
/* 43 */                    objArr[i2 - 1] = null;
                        }
/* 45 */                obj = obj2;
                    }
/* 47 */            this.I00iOIl = i2 - 1;
                    ((AbstractList) this).modCount++;
/* 54 */            return obj;
                }

                @Override
                public final Object set(int i, Object obj) {
                    int i2;
/* 1 */             if (i < 0 || i >= (i2 = this.I00iOIl)) {
/* 32 */                OIiilo1Ool0o.I0000Il00O(this.I00iOIl, IlIi0I0.I00100o1O0lo("Index: ", i, ", Size: "));
/* 35 */                return null;
                    }
/* 7 */             Object obj2 = this.I00iiI;
/* 10 */            if (i2 == 1) {
/* 12 */                this.I00iiI = obj;
/* 14 */                return obj2;
                    }
/* 15 */            Object[] objArr = (Object[]) obj2;
/* 17 */            Object obj3 = objArr[i];
/* 19 */            objArr[i] = obj;
/* 21 */            return obj3;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final void sort(Comparator comparator) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             if (i >= 2) {
/* 11 */                Arrays.sort((Object[]) this.I00iiI, 0, i, comparator);
                    }
                }

                @Override
                public final Object[] toArray(Object[] objArr) {
/* 2 */             if (objArr == null) {
/* 74 */                I00000oOI(4);
/* 186 */               throw null;
                    }
/* 4 */             int length = objArr.length;
/* 5 */             int i = this.I00iOIl;
/* 9 */             if (i == 1) {
/* 11 */                if (length == 0) {
/* 30 */                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
/* 34 */                    objArr2[0] = this.I00iiI;
/* 36 */                    return objArr2;
                        }
/* 15 */                objArr[0] = this.I00iiI;
                    } else {
/* 37 */                if (length < i) {
/* 47 */                    Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.I00iiI, i, objArr.getClass());
/* 51 */                    if (objArrCopyOf != null) {
/* 53 */                        return objArrCopyOf;
                            }
/* 55 */                    I00000oOI(6);
/* 58 */                    throw null;
                        }
/* 59 */                if (i != 0) {
/* 63 */                    System.arraycopy(this.I00iiI, 0, objArr, 0, i);
                        }
                    }
/* 66 */            int i2 = this.I00iOIl;
/* 68 */            if (length > i2) {
/* 70 */                objArr[i2] = null;
                    }
/* 72 */            return objArr;
                }

                @Override
/* 79 */        public final boolean add(Object obj) {
/* 80 */            int i = this.I00iOIl;
                    if (i == 0) {
/* 81 */                this.I00iiI = obj;
                    } else {
/* 82 */                Object obj2 = this.I00iiI;
                        if (i == 1) {
/* 84 */                    this.I00iiI = new Object[]{obj2, obj};
                        } else {
/* 85 */                    Object[] objArr = (Object[]) obj2;
/* 86 */                    int length = objArr.length;
                            if (i >= length) {
/* 87 */                        int iI001IIilI0O = IlIi0I0.I001IIilI0O(length, 3, 2, 1);
                                int i2 = i + 1;
                                if (iI001IIilI0O < i2) {
                                    iI001IIilI0O = i2;
                                }
/* 88 */                        Object[] objArr2 = new Object[iI001IIilI0O];
                                this.I00iiI = objArr2;
/* 89 */                        System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
/* 90 */                    i = this.I00iOIl;
                            objArr[i] = obj;
                        }
                    }
/* 91 */            this.I00iOIl = i + 1;
                    ((AbstractList) this).modCount++;
                    return true;
                }
            }
