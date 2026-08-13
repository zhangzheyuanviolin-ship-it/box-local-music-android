            package p000;

            import java.util.AbstractList;
            import java.util.Iterator;
            import java.util.ListIterator;
            
            public final class i10I1OIOOlo implements ListIterator, Iterator {
                public final Iterator I00iOIl;
                public final int I00iiI;
                public final AbstractList I00iiO;

                public i10I1OIOOlo(AbstractList abstractList, ListIterator listIterator, int i) {
/* 1 */             this.I00iiI = i;
/* 3 */             this.I00iiO = abstractList;
/* 8 */             listIterator.getClass();
/* 11 */            this.I00iOIl = listIterator;
                }

                public final Object I00000oIO(Object obj) {
/* 1 */             int i = this.I00iiI;
/* 3 */             AbstractList abstractList = this.I00iiO;
                    switch (i) {
                        case 0:
/* 25 */                    return ((i101o1l1I1ii) ((i10I1i1o0oO) abstractList).I00iiO).zba(obj);
                        default:
/* 14 */                    return ((i101o1l1I1ii) ((i10I1iI) abstractList).I00iiO).zba(obj);
                    }
                }

                @Override
                public final void add(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean hasNext() {
/* 3 */             return this.I00iOIl.hasNext();
                }

                @Override
                public final boolean hasPrevious() {
/* 5 */             return ((ListIterator) this.I00iOIl).hasPrevious();
                }

                @Override
                public final Object next() {
/* 7 */             return I00000oIO(this.I00iOIl.next());
                }

                @Override
                public final int nextIndex() {
/* 5 */             return ((ListIterator) this.I00iOIl).nextIndex();
                }

                @Override
                public final Object previous() {
/* 9 */             return I00000oIO(((ListIterator) this.I00iOIl).previous());
                }

                @Override
                public final int previousIndex() {
/* 5 */             return ((ListIterator) this.I00iOIl).previousIndex();
                }

                @Override
                public final void remove() {
/* 3 */             this.I00iOIl.remove();
                }

                @Override
                public final void set(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }
            }
