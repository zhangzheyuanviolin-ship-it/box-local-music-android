            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            
            public class O1100oOo0Ii extends AbstractList {
                public final List I00iOIl;

                public O1100oOo0Ii(List list) {
/* 4 */             list.getClass();
/* 9 */             this.I00iOIl = list;
                }

                public final int I00000oOI(int i) {
/* 3 */             int size = this.I00iOIl.size();
/* 7 */             lII0I0I01I1l.I000II(i, size);
/* 10 */            return size - i;
                }

                @Override
                public final void add(int i, Object obj) {
/* 7 */             this.I00iOIl.add(I00000oOI(i), obj);
                }

                @Override
                public final void clear() {
/* 3 */             this.I00iOIl.clear();
                }

                @Override
                public final Object get(int i) {
/* 1 */             List list = this.I00iOIl;
/* 3 */             int size = list.size();
/* 7 */             lII0I0I01I1l.I0000O(i, size);
/* 13 */            return list.get((size - 1) - i);
                }

                @Override
                public final Iterator iterator() {
/* 1 */             return listIterator();
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 7 */             ListIterator listIterator = this.I00iOIl.listIterator(I00000oOI(i));
/* 13 */            O1100010I o1100010i = new O1100010I();
/* 16 */            o1100010i.I00iiI = listIterator;
/* 18 */            o1100010i.I00iiO = this;
/* 20 */            VarHandle.storeStoreFence();
/* 49 */            return o1100010i;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             List list = this.I00iOIl;
/* 3 */             int size = list.size();
/* 7 */             lII0I0I01I1l.I0000O(i, size);
/* 13 */            return list.remove((size - 1) - i);
                }

                @Override
                public final void removeRange(int i, int i2) {
/* 5 */             subList(i, i2).clear();
                }

                @Override
                public final Object set(int i, Object obj) {
/* 1 */             List list = this.I00iOIl;
/* 3 */             int size = list.size();
/* 7 */             lII0I0I01I1l.I0000O(i, size);
/* 13 */            return list.set((size - 1) - i, obj);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.size();
                }

                @Override
                public final List subList(int i, int i2) {
/* 1 */             List list = this.I00iOIl;
/* 7 */             lII0I0I01I1l.I000O01llI0(i, i2, list.size());
/* 22 */            return l10oOI1I1o.I00000oIO(list.subList(I00000oOI(i2), I00000oOI(i)));
                }
            }
