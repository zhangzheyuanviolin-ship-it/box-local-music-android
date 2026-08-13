            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            
            public abstract class I01Io11IiiiO extends I01IO0oio {
                public abstract I01Io11IiiiO I0000O(int i, Object obj);

                public abstract I01Io11IiiiO I000OOo1O(Object obj);

                public I01Io11IiiiO I000OiO(Collection collection) {
/* 1 */             OO100II1 oo100ii1I000iOII = I000iOII();
/* 5 */             oo100ii1I000iOII.addAll(collection);
/* 8 */             return oo100ii1I000iOII.I000OOo1O();
                }

                public abstract OO100II1 I000iOII();

                public abstract I01Io11IiiiO I000lI(I01Io1 i01Io1);

                public abstract I01Io11IiiiO I000o00OoI0I(int i);

                public abstract I01Io11IiiiO I000oI1ioi(int i, Object obj);

                @Override
                public final boolean contains(Object obj) {
                    return indexOf(obj) != -1;
                }

                @Override
                public final boolean containsAll(Collection collection) {
/* 1 */             Collection collection2 = collection;
/* 6 */             if ((collection2 instanceof Collection) && collection2.isEmpty()) {
/* 5 */                 return true;
                    }
/* 18 */            Iterator it = collection2.iterator();
/* 26 */            while (it.hasNext()) {
/* 36 */                if (!contains(it.next())) {
/* 38 */                    return false;
                        }
                    }
/* 5 */             return true;
                }

                @Override
                public final Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final ListIterator listIterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final List subList(int i, int i2) {
/* 3 */             return new Ioiliol0(this, i, i2);
                }
            }
