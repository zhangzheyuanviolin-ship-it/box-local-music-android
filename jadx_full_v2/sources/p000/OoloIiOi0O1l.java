            package p000;

            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Member;
            import java.lang.reflect.Method;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OoloIiOi0O1l implements IIiOlII {
                public Method I00000oIO;
                public Method I00000oOI;
                public ArrayList I0000Il00O;
                public ArrayList I0000O;
                public ArrayList I0000oI00;

                @Override
                public final List I00000oIO() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final Member I00000oOI() {
/* 1 */             return null;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r6v2 */
                /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
                @Override
                public final Object I0000O(Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    ?? SingletonList;
/* 1 */             ArrayList arrayList = this.I0000Il00O;
/* 3 */             int length = objArr.length;
/* 16 */            ArrayList arrayList2 = new ArrayList(Math.min(IOOi1I.I0000O(arrayList, 10), length));
/* 24 */            int i = 0;
/* 29 */            for (Object obj : arrayList) {
/* 35 */                if (i >= length) {
                            break;
                        }
/* 46 */                arrayList2.add(new OIoi0IIoi(objArr[i], obj));
/* 37 */                i++;
                    }
/* 53 */            ArrayList arrayList3 = new ArrayList();
/* 56 */            Iterator it = arrayList2.iterator();
/* 65 */            while (it.hasNext()) {
/* 71 */                OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) it.next();
/* 73 */                Object obj2 = oIoi0IIoi.I00iOIl;
/* 77 */                List list = (List) oIoi0IIoi.I00iiI;
/* 79 */                if (list != null) {
/* 81 */                    List list2 = list;
/* 89 */                    SingletonList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 92 */                    Iterator it2 = list2.iterator();
/* 100 */                   while (it2.hasNext()) {
/* 112 */                       SingletonList.add(((Method) it2.next()).invoke(obj2, null));
                            }
                        } else {
/* 116 */                   SingletonList = Collections.singletonList(obj2);
                        }
/* 122 */               IOOii0O10Io0.I00100l0(arrayList3, (Iterable) SingletonList);
                    }
/* 128 */           Object[] array = arrayList3.toArray(new Object[0]);
/* 139 */           this.I00000oIO.invoke(null, Arrays.copyOf(array, array.length));
/* 149 */           return this.I00000oOI.invoke(null, Arrays.copyOf(array, array.length));
                }

                @Override
                public final Type I0001Ioi1lo() {
/* 3 */             return this.I00000oOI.getReturnType();
                }
            }
