            package p000;

            import java.io.Serializable;
            import java.lang.reflect.Array;
            import java.util.AbstractCollection;
            import java.util.Arrays;
            import java.util.Collection;
            
/* 173 */   public abstract class iO1i1OI0 extends AbstractCollection implements Serializable {
                public static final Object[] I00iiI = new Object[0];
                public static final Object[] I00iiO = new Object[0];
                public static final Object[] I00iio = new Object[0];
                public final int I00iOIl;

                public abstract int I00000oOI(Object[] objArr);

                public int I0000O() {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    throw new UnsupportedOperationException();
                        case 1:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                public int I0000oI00() {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    throw new UnsupportedOperationException();
                        case 1:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                public Object[] I0001Ioi1lo() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return null;
                }

                @Override
                public final boolean add(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    throw new UnsupportedOperationException();
                        case 1:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final boolean addAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    throw new UnsupportedOperationException();
                        case 1:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final void clear() {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    throw new UnsupportedOperationException();
                        case 1:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final boolean remove(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    throw new UnsupportedOperationException();
                        case 1:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final boolean removeAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    throw new UnsupportedOperationException();
                        case 1:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final boolean retainAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    throw new UnsupportedOperationException();
                        case 1:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public final Object[] toArray(Object[] objArr) {
                    switch (this.I00iOIl) {
                        case 0:
/* 121 */                   objArr.getClass();
/* 124 */                   int size = size();
/* 128 */                   int length = objArr.length;
/* 129 */                   if (length < size) {
/* 131 */                       Object[] objArrI0001Ioi1lo = I0001Ioi1lo();
/* 135 */                       if (objArrI0001Ioi1lo != null) {
                                    break;
                                } else {
/* 137 */                           if (length != 0) {
/* 140 */                               objArr = Arrays.copyOf(objArr, 0);
                                    }
/* 144 */                           objArr = Arrays.copyOf(objArr, size);
                                }
                            } else if (length > size) {
/* 168 */                       objArr[size] = null;
                            }
/* 170 */                   I00000oOI(objArr);
                            break;
                        case 1:
/* 64 */                    objArr.getClass();
/* 67 */                    int size2 = size();
/* 71 */                    int length2 = objArr.length;
/* 72 */                    if (length2 < size2) {
/* 74 */                        Object[] objArrI0001Ioi1lo2 = I0001Ioi1lo();
/* 78 */                        if (objArrI0001Ioi1lo2 != null) {
                                    break;
                                } else {
/* 92 */                            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size2);
                                }
                            } else if (length2 > size2) {
/* 114 */                       objArr[size2] = null;
                            }
/* 116 */                   I00000oOI(objArr);
                            break;
                        default:
/* 7 */                     objArr.getClass();
/* 10 */                    int size3 = size();
/* 14 */                    int length3 = objArr.length;
/* 15 */                    if (length3 < size3) {
/* 17 */                        Object[] objArrI0001Ioi1lo3 = I0001Ioi1lo();
/* 21 */                        if (objArrI0001Ioi1lo3 != null) {
                                    break;
                                } else {
/* 35 */                            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size3);
                                }
                            } else if (length3 > size3) {
/* 57 */                        objArr[size3] = null;
                            }
/* 59 */                    I00000oOI(objArr);
                            break;
                    }
/* 62 */            return objArr;
                }

                @Override
/* 174 */       public final Object[] toArray() {
                    switch (this.I00iOIl) {
                        case 0:
/* 177 */                   return toArray(I00iiI);
                        case 1:
/* 176 */                   return toArray(I00iiO);
                        default:
/* 175 */                   return toArray(I00iio);
                    }
                }
            }
