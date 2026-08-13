            package p000;

            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            import kotlin.jvm.functions.Function1;
            
            public abstract class IOOii0O10Io0 extends IOOiOil {
                public static void I00100l0(Collection collection, Iterable iterable) {
/* 3 */             if (iterable instanceof Collection) {
/* 7 */                 collection.addAll((Collection) iterable);
/* 10 */                return;
                    }
/* 11 */            Iterator it = iterable.iterator();
/* 19 */            while (it.hasNext()) {
/* 25 */                collection.add(it.next());
                    }
                }

                public static void I00100o1O0lo(Collection collection, Object[] objArr) {
/* 7 */             collection.addAll(Arrays.asList(objArr));
                }

                public static void I0010I0i(List list, Function1 function1) {
                    int iI000II;
/* 4 */             if (!(list instanceof RandomAccess)) {
/* 8 */                 if ((list instanceof O0IlIoi) && !(list instanceof O0IlOIOIoOI)) {
/* 17 */                    OoOOI1100oI0.I0001Ioi1lo("kotlin.collections.MutableIterable", list);
/* 21 */                    throw null;
                        }
                        try {
/* 24 */                    Iterator it = list.iterator();
/* 32 */                    while (it.hasNext()) {
/* 48 */                        if (((Boolean) function1.invoke(it.next())).booleanValue()) {
/* 50 */                            it.remove();
                                }
                            }
/* 551 */                   return;
                        } catch (ClassCastException e) {
/* 61 */                    O0000Ioio00.I000O01llI0(e, OoOOI1100oI0.class.getName());
/* 64 */                    throw e;
                        }
                    }
/* 65 */            int iI000II2 = IOOi1I.I000II(list);
/* 69 */            int i = 0;
/* 70 */            if (iI000II2 >= 0) {
/* 72 */                int i2 = 0;
                        while (true) {
/* 73 */                    Object obj = list.get(i);
/* 87 */                    if (!((Boolean) function1.invoke(obj)).booleanValue()) {
/* 90 */                        if (i2 != i) {
/* 92 */                            list.set(i2, obj);
                                }
/* 95 */                        i2++;
                            }
/* 97 */                    if (i == iI000II2) {
                                break;
                            } else {
/* 99 */                        i++;
                            }
                        }
/* 102 */               i = i2;
                    }
/* 107 */           if (i >= list.size() || i > (iI000II = IOOi1I.I000II(list))) {
/* 551 */               return;
                    }
                    while (true) {
/* 115 */               list.remove(iI000II);
/* 118 */               if (iI000II == i) {
/* 551 */                   return;
                        } else {
                            iI000II--;
                        }
                    }
                }

                public static Object I0010o(List list) {
/* 5 */             if (!list.isEmpty()) {
/* 8 */                 return list.remove(0);
                    }
/* 15 */            OIiilo1Ool0o.I000II("List is empty.");
/* 18 */            return null;
                }

                public static Object I00111O(List list) {
/* 5 */             if (!list.isEmpty()) {
/* 11 */                return list.remove(IOOi1I.I000II(list));
                    }
/* 18 */            OIiilo1Ool0o.I000II("List is empty.");
/* 21 */            return null;
                }

                public static Object I001IIilI0O(List list) {
/* 5 */             if (list.isEmpty()) {
/* 7 */                 return null;
                    }
/* 13 */            return list.remove(IOOi1I.I000II(list));
                }
            }
