            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class IOOi1I {
                public static ArrayList I00000oIO(Object... objArr) {
/* 2 */             if (objArr.length == 0) {
/* 6 */                 return new ArrayList();
                    }
/* 14 */            I1Il00 i1Il00 = new I1Il00();
/* 17 */            i1Il00.I00iOIl = objArr;
/* 20 */            i1Il00.I00iiI = true;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            return new ArrayList(i1Il00);
                }

                public static int I00000oOI(ArrayList arrayList, Comparable comparable) {
/* 1 */             int size = arrayList.size();
/* 5 */             int size2 = arrayList.size();
/* 11 */            if (size < 0) {
/* 34 */                I000II.I000iOII(IIlIOloOOO.I00100l0("fromIndex (0) is greater than toIndex (", size, ")."));
                    } else if (size > size2) {
/* 24 */                I000II.I0010o(Oi010OO0.I0010o("toIndex (", size, ") is greater than size (", size2, ")."));
                    }
                    int i = size - 1;
/* 39 */            int i2 = 0;
/* 40 */            while (i2 <= i) {
/* 44 */                int i3 = (i2 + i) >>> 1;
/* 52 */                int iI00000oIO = iii1OiiIi.I00000oIO((Comparable) arrayList.get(i3), comparable);
/* 56 */                if (iI00000oIO < 0) {
/* 58 */                    i2 = i3 + 1;
                        } else {
/* 61 */                    if (iI00000oIO <= 0) {
/* 66 */                        return i3;
                            }
                            i = i3 - 1;
                        }
                    }
/* 69 */            return -(i2 + 1);
                }

                public static O101lO1 I0000Il00O(O101lO1 o101lO1) {
/* 1 */             o101lO1.I000lI();
/* 5 */             o101lO1.I00iiO = true;
                    return o101lO1.I00iiI > 0 ? o101lO1 : O101lO1.I00iio;
                }

                public static int I0000O(Iterable iterable, int i) {
                    return iterable instanceof Collection ? ((Collection) iterable).size() : i;
                }

                public static O101lO1 I0000oI00() {
/* 5 */             return new O101lO1(10);
                }

                public static IooO11l I0001Ioi1lo(Collection collection) {
/* 10 */            return new IooO11l(0, collection.size() - 1, 1);
                }

                public static int I000II(List list) {
/* 5 */             return list.size() - 1;
                }

                public static List I000O01llI0(Object... objArr) {
                    return objArr.length > 0 ? Arrays.asList(objArr) : Il01100l.I00iOIl;
                }

                public static List I000OOo1O(Object obj) {
                    return obj != null ? Collections.singletonList(obj) : Il01100l.I00iOIl;
                }

                public static ArrayList I000OiO(Object... objArr) {
/* 2 */             if (objArr.length == 0) {
/* 6 */                 return new ArrayList();
                    }
/* 14 */            I1Il00 i1Il00 = new I1Il00();
/* 17 */            i1Il00.I00iOIl = objArr;
/* 20 */            i1Il00.I00iiI = true;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            return new ArrayList(i1Il00);
                }

                public static final List I000iOII(List list) {
/* 1 */             int size = list.size();
                    return size != 0 ? size != 1 ? list : Collections.singletonList(list.get(0)) : Il01100l.I00iOIl;
                }

                public static void I000l1() {
/* 29 */            throw new ArithmeticException("Count overflow has happened.");
                }

                public static void I000lI() {
/* 29 */            throw new ArithmeticException("Index overflow has happened.");
                }
            }
