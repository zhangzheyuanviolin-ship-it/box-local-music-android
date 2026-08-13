            package p000;

            import java.lang.reflect.Array;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            
            public abstract class i1O0Ill0 {
                public static final Object[] I00000oIO = new Object[0];

                public static final Object[] I00000oIO(Collection collection) {
/* 1 */             int size = collection.size();
/* 5 */             Object[] objArr = I00000oIO;
/* 7 */             if (size == 0) {
/* 9 */                 return objArr;
                    }
/* 10 */            Iterator it = collection.iterator();
/* 18 */            if (!it.hasNext()) {
/* 20 */                return objArr;
                    }
/* 21 */            Object[] objArrCopyOf = new Object[size];
/* 23 */            int i = 0;
                    while (true) {
/* 24 */                int i2 = i + 1;
/* 30 */                objArrCopyOf[i] = it.next();
/* 33 */                if (i2 >= objArrCopyOf.length) {
/* 39 */                    if (!it.hasNext()) {
/* 41 */                        return objArrCopyOf;
                            }
/* 46 */                    int i3 = ((i2 * 3) + 1) >>> 1;
/* 48 */                    if (i3 <= i2) {
/* 50 */                        i3 = 2147483645;
/* 53 */                        if (i2 >= 2147483645) {
/* 61 */                            throw new OutOfMemoryError();
                                }
                            }
/* 62 */                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                        } else if (!it.hasNext()) {
/* 74 */                    return Arrays.copyOf(objArrCopyOf, i2);
                        }
/* 66 */                i = i2;
                    }
                }

                public static final Object[] I00000oOI(Collection collection, Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             int size = collection.size();
/* 9 */             int i = 0;
/* 10 */            if (size != 0) {
/* 18 */                Iterator it = collection.iterator();
/* 26 */                if (it.hasNext()) {
/* 51 */                    Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                            while (true) {
/* 53 */                        int i2 = i + 1;
/* 59 */                        objArrCopyOf[i] = it.next();
/* 62 */                        if (i2 >= objArrCopyOf.length) {
/* 68 */                            if (!it.hasNext()) {
/* 70 */                                return objArrCopyOf;
                                    }
/* 75 */                            int i3 = ((i2 * 3) + 1) >>> 1;
/* 77 */                            if (i3 <= i2) {
/* 79 */                                i3 = 2147483645;
/* 82 */                                if (i2 >= 2147483645) {
/* 90 */                                    throw new OutOfMemoryError();
                                        }
                                    }
/* 91 */                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                                } else if (!it.hasNext()) {
/* 103 */                           if (objArrCopyOf != objArr) {
/* 108 */                               return Arrays.copyOf(objArrCopyOf, i2);
                                    }
/* 105 */                           objArr[i2] = null;
/* 107 */                           return objArr;
                                }
/* 95 */                        i = i2;
                            }
                        } else if (objArr.length > 0) {
/* 31 */                    objArr[0] = null;
                        }
                    } else if (objArr.length > 0) {
/* 15 */                objArr[0] = null;
/* 17 */                return objArr;
                    }
/* 33 */            return objArr;
                }
            }
