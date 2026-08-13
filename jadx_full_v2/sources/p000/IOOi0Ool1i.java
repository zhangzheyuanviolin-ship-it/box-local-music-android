            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.AbstractCollection;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public abstract class IOOi0Ool1i extends IOOii0O10Io0 {
                public static I1Iolliil0i I001IO000(Iterable iterable) {
/* 4 */             I1Iolliil0i i1Iolliil0i = new I1Iolliil0i(1);
/* 7 */             i1Iolliil0i.I00000oOI = iterable;
/* 9 */             VarHandle.storeStoreFence();
/* 49 */            return i1Iolliil0i;
                }

                public static boolean I001i1O0Ol(Iterable iterable, Object obj) {
                    return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : I00IO1(iterable, obj) >= 0;
                }

                public static List I001i1lo1io(Iterable iterable) {
/* 5 */             return I00iIi0i1o(I00iiO(iterable));
                }

                public static List I001iOo1i0O(Iterable iterable, int i) {
                    ArrayList arrayList;
/* 1 */             if (i < 0) {
/* 133 */               I000II.I0010I0i(IIlIOloOOO.I00100l0("Requested element count ", i, " is less than zero."));
/* 136 */               return null;
                    }
/* 3 */             if (i == 0) {
/* 5 */                 return I00iIi0i1o(iterable);
                    }
/* 12 */            if (iterable instanceof Collection) {
/* 21 */                int size = ((Collection) iterable).size() - i;
/* 22 */                if (size <= 0) {
/* 24 */                    return Il01100l.I00iOIl;
                        }
/* 28 */                if (size == 1) {
/* 34 */                    return Collections.singletonList(I00Io1lO(iterable));
                        }
/* 41 */                arrayList = new ArrayList(size);
/* 46 */                if (iterable instanceof List) {
/* 50 */                    if (iterable instanceof RandomAccess) {
/* 52 */                        List list = (List) iterable;
/* 54 */                        int size2 = list.size();
/* 58 */                        while (i < size2) {
/* 64 */                            arrayList.add(list.get(i));
/* 67 */                            i++;
                                }
                            } else {
/* 72 */                        ListIterator listIterator = ((List) iterable).listIterator(i);
/* 80 */                        while (listIterator.hasNext()) {
/* 86 */                            arrayList.add(listIterator.next());
                                }
                            }
/* 90 */                    return arrayList;
                        }
                    } else {
/* 93 */                arrayList = new ArrayList();
                    }
/* 100 */           int i2 = 0;
/* 105 */           for (Object obj : iterable) {
/* 111 */               if (i2 >= i) {
/* 113 */                   arrayList.add(obj);
                        } else {
/* 117 */                   i2++;
                        }
                    }
/* 120 */           return IOOi1I.I000iOII(arrayList);
                }

                public static List I001l0I00(List list) {
/* 2 */             List list2 = list;
                    int size = list.size() - 1;
/* 10 */            if (size < 0) {
/* 12 */                size = 0;
                    }
/* 13 */            return I00i01iIIliI(list2, size);
                }

                public static Object I001lIiIIo1O(Iterable iterable) {
/* 3 */             if (iterable instanceof List) {
/* 7 */                 return I001lllioOl((List) iterable);
                    }
/* 12 */            Iterator it = iterable.iterator();
/* 20 */            if (it.hasNext()) {
/* 22 */                return it.next();
                    }
/* 29 */            OIiilo1Ool0o.I000II("Collection is empty.");
/* 32 */            return null;
                }

                public static Object I001lllioOl(List list) {
/* 5 */             if (!list.isEmpty()) {
/* 8 */                 return list.get(0);
                    }
/* 15 */            OIiilo1Ool0o.I000II("List is empty.");
/* 18 */            return null;
                }

                public static Object I001lloI(Iterable iterable) {
/* 3 */             if (iterable instanceof List) {
/* 5 */                 List list = (List) iterable;
/* 11 */                if (list.isEmpty()) {
/* 30 */                    return null;
                        }
/* 15 */                return list.get(0);
                    }
/* 20 */            Iterator it = iterable.iterator();
/* 28 */            if (it.hasNext()) {
/* 32 */                return it.next();
                    }
/* 30 */            return null;
                }

                public static Object I00II0Ol1O0l(List list) {
/* 5 */             if (list.isEmpty()) {
/* 7 */                 return null;
                    }
/* 10 */            return list.get(0);
                }

                public static Object I00II0oii1o(int i, List list) {
/* 1 */             if (i < 0 || i >= list.size()) {
/* 14 */                return null;
                    }
/* 9 */             return list.get(i);
                }

                public static int I00IO1(Iterable iterable, Object obj) {
/* 3 */             if (iterable instanceof List) {
/* 7 */                 return ((List) iterable).indexOf(obj);
                    }
/* 16 */            int i = 0;
/* 21 */            for (Object obj2 : iterable) {
/* 27 */                if (i < 0) {
/* 39 */                    IOOi1I.I000lI();
/* 43 */                    throw null;
                        }
/* 33 */                if (O0000Ioio00.I0000O(obj, obj2)) {
/* 35 */                    return i;
                        }
/* 36 */                i++;
                    }
/* 44 */            return -1;
                }

                public static LinkedHashSet I00IO1oi11O(Iterable iterable, Iterable iterable2) {
/* 3 */             if (!(iterable2 instanceof Collection)) {
/* 8 */                 iterable2 = I00iIi0i1o(iterable2);
                    }
/* 5 */             Collection collection = (Collection) iterable2;
/* 15 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 26 */            for (Object obj : iterable) {
/* 36 */                if (collection.contains(obj)) {
/* 38 */                    linkedHashSet.add(obj);
                        }
                    }
/* 89 */            return linkedHashSet;
                }

                public static final void I00IOO(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1) throws IOException {
/* 1 */             appendable.append(charSequence2);
/* 8 */             int i2 = 0;
/* 13 */            for (Object obj : iterable) {
/* 19 */                i2++;
/* 22 */                if (i2 > 1) {
/* 24 */                    appendable.append(charSequence);
                        }
/* 27 */                if (i >= 0 && i2 > i) {
                            break;
                        } else {
/* 31 */                    OlOoOOooiIll.I00000oIO(appendable, obj, function1);
                        }
                    }
/* 35 */            if (i >= 0 && i2 > i) {
/* 39 */                appendable.append(charSequence4);
                    }
/* 42 */            appendable.append(charSequence3);
                }

                public static void I00IioO0OiOi(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i) throws IOException {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 str = ", ";
                    }
/* 7 */             String str4 = str;
/* 16 */            String str5 = (i & 4) != 0 ? "" : str2;
/* 23 */            String str6 = (i & 8) != 0 ? "" : str3;
/* 26 */            if ((i & 64) != 0) {
/* 28 */                function1 = null;
                    }
/* 35 */            I00IOO(iterable, appendable, str4, str5, str6, -1, "...", function1);
                }

                public static String I00IlilI0i0i(Iterable iterable, String str, String str2, String str3, Function1 function1, int i) throws IOException {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = ", ";
                    }
/* 7 */             String str4 = str;
/* 16 */            String str5 = (i & 2) != 0 ? "" : str2;
/* 23 */            String str6 = (i & 4) != 0 ? "" : str3;
/* 31 */            int i2 = (i & 8) != 0 ? -1 : 5;
/* 35 */            if ((i & 32) != 0) {
/* 37 */                function1 = null;
                    }
/* 41 */            StringBuilder sb = new StringBuilder();
/* 47 */            I00IOO(iterable, sb, str4, str5, str6, i2, "...", function1);
/* 50 */            return sb.toString();
                }

                public static Object I00Io1lO(Iterable iterable) {
/* 3 */             if (iterable instanceof List) {
/* 7 */                 return I00Io1o110i((List) iterable);
                    }
/* 12 */            Iterator it = iterable.iterator();
/* 20 */            if (!it.hasNext()) {
/* 40 */                OIiilo1Ool0o.I000II("Collection is empty.");
/* 43 */                return null;
                    }
/* 22 */            Object next = it.next();
/* 30 */            while (it.hasNext()) {
/* 32 */                next = it.next();
                    }
/* 37 */            return next;
                }

                public static Object I00Io1o110i(List list) {
/* 5 */             if (!list.isEmpty()) {
/* 11 */                return list.get(IOOi1I.I000II(list));
                    }
/* 18 */            OIiilo1Ool0o.I000II("List is empty.");
/* 21 */            return null;
                }

                public static Object I00IoIO0lI(List list) {
/* 5 */             if (list.isEmpty()) {
/* 7 */                 return null;
                    }
/* 15 */            return list.get(list.size() - 1);
                }

                public static Comparable I00IoO0(ArrayList arrayList) {
/* 1 */             Iterator it = arrayList.iterator();
/* 9 */             if (!it.hasNext()) {
/* 11 */                return null;
                    }
/* 17 */            Comparable comparable = (Comparable) it.next();
/* 23 */            while (it.hasNext()) {
/* 29 */                Comparable comparable2 = (Comparable) it.next();
/* 35 */                if (comparable.compareTo(comparable2) < 0) {
/* 37 */                    comparable = comparable2;
                        }
                    }
/* 49 */            return comparable;
                }

                public static Comparable I00IoiI(ArrayList arrayList) {
/* 1 */             Iterator it = arrayList.iterator();
/* 9 */             if (!it.hasNext()) {
/* 11 */                return null;
                    }
/* 17 */            Comparable comparable = (Comparable) it.next();
/* 23 */            while (it.hasNext()) {
/* 29 */                Comparable comparable2 = (Comparable) it.next();
/* 35 */                if (comparable.compareTo(comparable2) > 0) {
/* 37 */                    comparable = comparable2;
                        }
                    }
/* 49 */            return comparable;
                }

                public static ArrayList I00Iooi00oi(Iterable iterable, Object obj) {
/* 9 */             ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iterable, 10));
/* 17 */            boolean z = false;
/* 22 */            for (Object obj2 : iterable) {
/* 28 */                boolean z2 = true;
/* 29 */                if (!z && O0000Ioio00.I0000O(obj2, obj)) {
/* 37 */                    z = true;
/* 38 */                    z2 = false;
                        }
/* 39 */                if (z2) {
/* 41 */                    arrayList.add(obj2);
                        }
                    }
/* 89 */            return arrayList;
                }

                public static ArrayList I00O0i0ii(Iterable iterable, Iterable iterable2) {
/* 3 */             if (iterable instanceof Collection) {
/* 7 */                 return I00O10llo((Collection) iterable, iterable2);
                    }
/* 14 */            ArrayList arrayList = new ArrayList();
/* 17 */            IOOii0O10Io0.I00100l0(arrayList, iterable);
/* 20 */            IOOii0O10Io0.I00100l0(arrayList, iterable2);
/* 89 */            return arrayList;
                }

                public static ArrayList I00O0o1oo(Iterable iterable, Object obj) {
/* 3 */             if (iterable instanceof Collection) {
/* 7 */                 return I00OI1((Collection) iterable, obj);
                    }
/* 14 */            ArrayList arrayList = new ArrayList();
/* 17 */            IOOii0O10Io0.I00100l0(arrayList, iterable);
/* 20 */            arrayList.add(obj);
/* 89 */            return arrayList;
                }

                public static ArrayList I00O10llo(Collection collection, Iterable iterable) {
/* 3 */             if (!(iterable instanceof Collection)) {
/* 30 */                ArrayList arrayList = new ArrayList(collection);
/* 33 */                IOOii0O10Io0.I00100l0(arrayList, iterable);
/* 89 */                return arrayList;
                    }
/* 11 */            Collection collection2 = (Collection) iterable;
/* 18 */            ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
/* 21 */            arrayList2.addAll(collection);
/* 24 */            arrayList2.addAll(collection2);
/* 27 */            return arrayList2;
                }

                public static ArrayList I00OI1(Collection collection, Object obj) {
/* 9 */             ArrayList arrayList = new ArrayList(collection.size() + 1);
/* 12 */            arrayList.addAll(collection);
/* 15 */            arrayList.add(obj);
/* 89 */            return arrayList;
                }

                public static final int I00OIO1(int i, List list) {
/* 1 */             if (i >= 0 && i <= IOOi1I.I000II(list)) {
/* 13 */                return IOOi1I.I000II(list) - i;
                    }
/* 21 */            StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Element index ", i, " must be in range [");
/* 36 */            sbI00100o1O0lo.append(new IooO11l(0, IOOi1I.I000II(list), 1));
/* 41 */            sbI00100o1O0lo.append("].");
/* 89 */            throw new IndexOutOfBoundsException(sbI00100o1O0lo.toString());
                }

                public static final int I00OIl(int i, List list) {
/* 1 */             if (i >= 0 && i <= list.size()) {
/* 13 */                return list.size() - i;
                    }
/* 21 */            StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Position index ", i, " must be in range [");
/* 36 */            sbI00100o1O0lo.append(new IooO11l(0, list.size(), 1));
/* 41 */            sbI00100o1O0lo.append("].");
/* 89 */            throw new IndexOutOfBoundsException(sbI00100o1O0lo.toString());
                }

                public static List I00OIo(Iterable iterable) {
/* 3 */             if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
/* 15 */                return I00iIi0i1o(iterable);
                    }
/* 20 */            List listI00iiI = I00iiI(iterable);
/* 24 */            Collections.reverse(listI00iiI);
/* 49 */            return listI00iiI;
                }

                public static Object I00OOll1(Iterable iterable) {
/* 3 */             if (iterable instanceof List) {
/* 7 */                 return I00OilO00Il((List) iterable);
                    }
/* 12 */            Iterator it = iterable.iterator();
/* 21 */            if (!it.hasNext()) {
/* 42 */                OIiilo1Ool0o.I000II("Collection is empty.");
/* 20 */                return null;
                    }
/* 23 */            Object next = it.next();
/* 31 */            if (!it.hasNext()) {
/* 33 */                return next;
                    }
/* 36 */            I000II.I000iOII("Collection has more than one element.");
/* 20 */            return null;
                }

                public static Object I00OilO00Il(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 25 */                OIiilo1Ool0o.I000II("List is empty.");
/* 5 */                 return null;
                    }
/* 9 */             if (size == 1) {
/* 12 */                return list.get(0);
                    }
/* 19 */            I000II.I000iOII("List has more than one element.");
/* 5 */             return null;
                }

                public static Object I00Oio(Iterable iterable) {
/* 4 */             if (iterable instanceof List) {
/* 6 */                 List list = (List) iterable;
/* 13 */                if (list.size() == 1) {
/* 16 */                    return list.get(0);
                        }
/* 3 */                 return null;
                    }
/* 22 */            Iterator it = iterable.iterator();
/* 30 */            if (!it.hasNext()) {
/* 3 */                 return null;
                    }
/* 33 */            Object next = it.next();
/* 41 */            if (it.hasNext()) {
/* 3 */                 return null;
                    }
/* 49 */            return next;
                }

                public static Object I00Ol00(List list) {
/* 6 */             if (list.size() == 1) {
/* 9 */                 return list.get(0);
                    }
/* 14 */            return null;
                }

                public static List I00Ol10(Iterable iterable) {
/* 3 */             if (!(iterable instanceof Collection)) {
/* 41 */                List listI00iiI = I00iiI(iterable);
/* 45 */                IOOiOil.I000o00OoI0I(listI00iiI);
/* 49 */                return listI00iiI;
                    }
/* 6 */             Collection collection = (Collection) iterable;
/* 13 */            if (collection.size() <= 1) {
/* 15 */                return I00iIi0i1o(iterable);
                    }
/* 23 */            Object[] array = collection.toArray(new Comparable[0]);
/* 28 */            Comparable[] comparableArr = (Comparable[]) array;
/* 31 */            if (comparableArr.length > 1) {
/* 33 */                Arrays.sort(comparableArr);
                    }
/* 36 */            return Arrays.asList(array);
                }

                public static List I00Ol1ll1(Iterable iterable, Comparator comparator) {
/* 3 */             if (!(iterable instanceof Collection)) {
/* 38 */                List listI00iiI = I00iiI(iterable);
/* 42 */                IOOiOil.I000oI1ioi(listI00iiI, comparator);
/* 89 */                return listI00iiI;
                    }
/* 6 */             Collection collection = (Collection) iterable;
/* 13 */            if (collection.size() <= 1) {
/* 15 */                return I00iIi0i1o(iterable);
                    }
/* 23 */            Object[] array = collection.toArray(new Object[0]);
/* 28 */            if (array.length > 1) {
/* 30 */                Arrays.sort(array, comparator);
                    }
/* 33 */            return Arrays.asList(array);
                }

                public static long I00OloOo(Iterable iterable) {
/* 1 */             Iterator it = iterable.iterator();
/* 5 */             long jLongValue = 0;
/* 11 */            while (it.hasNext()) {
/* 23 */                jLongValue += ((Number) it.next()).longValue();
                    }
/* 49 */            return jLongValue;
                }

                public static List I00i01iIIliI(Iterable iterable, int i) {
/* 1 */             if (i < 0) {
/* 77 */                I000II.I0010I0i(IIlIOloOOO.I00100l0("Requested element count ", i, " is less than zero."));
/* 80 */                return null;
                    }
/* 3 */             if (i == 0) {
/* 5 */                 return Il01100l.I00iOIl;
                    }
/* 11 */            if (iterable instanceof Collection) {
/* 20 */                if (i >= ((Collection) iterable).size()) {
/* 22 */                    return I00iIi0i1o(iterable);
                        }
/* 27 */                if (i == 1) {
/* 33 */                    return Collections.singletonList(I001lIiIIo1O(iterable));
                        }
                    }
/* 40 */            ArrayList arrayList = new ArrayList(i);
/* 43 */            Iterator it = iterable.iterator();
/* 47 */            int i2 = 0;
/* 52 */            while (it.hasNext()) {
/* 58 */                arrayList.add(it.next());
/* 61 */                i2++;
/* 62 */                if (i2 == i) {
                            break;
                        }
                    }
/* 64 */            return IOOi1I.I000iOII(arrayList);
                }

                public static List I00i0O(int i, List list) {
/* 1 */             if (i < 0) {
/* 84 */                I000II.I0010I0i(IIlIOloOOO.I00100l0("Requested element count ", i, " is less than zero."));
/* 87 */                return null;
                    }
/* 3 */             if (i == 0) {
/* 5 */                 return Il01100l.I00iOIl;
                    }
/* 8 */             int size = list.size();
/* 12 */            if (i >= size) {
/* 16 */                return I00iIi0i1o(list);
                    }
/* 22 */            if (i == 1) {
/* 28 */                return Collections.singletonList(I00Io1o110i(list));
                    }
/* 35 */            ArrayList arrayList = new ArrayList(i);
/* 40 */            if (list instanceof RandomAccess) {
/* 44 */                for (int i2 = size - i; i2 < size; i2++) {
/* 50 */                    arrayList.add(list.get(i2));
                        }
                    } else {
/* 57 */                ListIterator listIterator = list.listIterator(size - i);
/* 65 */                while (listIterator.hasNext()) {
/* 71 */                    arrayList.add(listIterator.next());
                        }
                    }
/* 75 */            return arrayList;
                }

                public static final void I00i0ilIl0i(Iterable iterable, AbstractCollection abstractCollection) {
/* 1 */             Iterator it = iterable.iterator();
/* 9 */             while (it.hasNext()) {
/* 15 */                abstractCollection.add(it.next());
                    }
                }

                public static float[] I00i0oil(Collection collection) {
/* 5 */             float[] fArr = new float[collection.size()];
/* 7 */             Iterator it = collection.iterator();
/* 11 */            int i = 0;
/* 16 */            while (it.hasNext()) {
/* 30 */                fArr[i] = ((Number) it.next()).floatValue();
/* 28 */                i++;
                    }
/* 49 */            return fArr;
                }

                public static int[] I00iIO(Collection collection) {
/* 5 */             int[] iArr = new int[collection.size()];
/* 7 */             Iterator it = collection.iterator();
/* 11 */            int i = 0;
/* 16 */            while (it.hasNext()) {
/* 30 */                iArr[i] = ((Number) it.next()).intValue();
/* 28 */                i++;
                    }
/* 49 */            return iArr;
                }

                public static List I00iIi0i1o(Iterable iterable) {
/* 3 */             if (!(iterable instanceof Collection)) {
/* 55 */                return IOOi1I.I000iOII(I00iiI(iterable));
                    }
/* 6 */             Collection collection = (Collection) iterable;
/* 8 */             int size = collection.size();
/* 12 */            if (size == 0) {
/* 48 */                return Il01100l.I00iOIl;
                    }
/* 15 */            if (size != 1) {
/* 19 */                return new ArrayList(collection);
                    }
/* 43 */            return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }

                public static long[] I00iOIl(Collection collection) {
/* 5 */             long[] jArr = new long[collection.size()];
/* 7 */             Iterator it = collection.iterator();
/* 11 */            int i = 0;
/* 16 */            while (it.hasNext()) {
/* 30 */                jArr[i] = ((Number) it.next()).longValue();
/* 28 */                i++;
                    }
/* 49 */            return jArr;
                }

                public static final List I00iiI(Iterable iterable) {
/* 3 */             if (iterable instanceof Collection) {
/* 9 */                 return new ArrayList((Collection) iterable);
                    }
/* 15 */            ArrayList arrayList = new ArrayList();
/* 18 */            I00i0ilIl0i(iterable, arrayList);
/* 49 */            return arrayList;
                }

                public static Set I00iiO(Iterable iterable) {
/* 3 */             if (iterable instanceof Collection) {
/* 9 */                 return new LinkedHashSet((Collection) iterable);
                    }
/* 15 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 18 */            I00i0ilIl0i(iterable, linkedHashSet);
/* 49 */            return linkedHashSet;
                }

                public static Set I00iio(Iterable iterable) {
/* 4 */             if (iterable instanceof Collection) {
/* 7 */                 Collection collection = (Collection) iterable;
/* 9 */                 int size = collection.size();
/* 13 */                if (size != 0) {
/* 15 */                    if (size == 1) {
/* 54 */                        return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                            }
/* 27 */                    LinkedHashSet linkedHashSet = new LinkedHashSet(O1Oii0o0Oi.I00000oIO(collection.size()));
/* 30 */                    I00i0ilIl0i(iterable, linkedHashSet);
/* 33 */                    return linkedHashSet;
                        }
                    } else {
/* 61 */                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
/* 64 */                I00i0ilIl0i(iterable, linkedHashSet2);
/* 67 */                int size2 = linkedHashSet2.size();
/* 71 */                if (size2 != 0) {
                            return size2 != 1 ? linkedHashSet2 : Collections.singleton(linkedHashSet2.iterator().next());
                        }
                    }
/* 89 */            return Il01llIol0.I00iOIl;
                }

                public static I1IollOi01 I00ilI0I1(Iterable iterable) {
/* 7 */             I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(21);
/* 10 */            i0OIOO00l0O.I00iiI = iterable;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            return new I1IollOi01(i0OIOO00l0O);
                }

                public static ArrayList I00ilO0(Iterable iterable, Iterable iterable2) {
/* 1 */             Iterator it = iterable.iterator();
/* 5 */             Iterator it2 = iterable2.iterator();
/* 25 */            ArrayList arrayList = new ArrayList(Math.min(IOOi1I.I0000O(iterable, 10), IOOi1I.I0000O(iterable2, 10)));
/* 32 */            while (it.hasNext() && it2.hasNext()) {
/* 53 */                arrayList.add(new OIoi0IIoi(it.next(), it2.next()));
                    }
/* 89 */            return arrayList;
                }
            }
