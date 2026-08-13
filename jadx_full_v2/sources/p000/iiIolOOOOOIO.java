            package p000;

            import java.util.AbstractList;
            import java.util.ListIterator;
            
            public final class iiIolOOOOOIO extends iioOOo1l implements ListIterator {
                public final int I00iiI;
                public final AbstractList I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iiIolOOOOOIO(AbstractList abstractList, ListIterator listIterator, int i) {
/* 5 */             super(listIterator);
/* 1 */             this.I00iiI = i;
/* 3 */             this.I00iiO = abstractList;
                }

                @Override
                public final Object I00000oIO(Object obj) {
/* 1 */             int i = this.I00iiI;
/* 3 */             AbstractList abstractList = this.I00iiO;
                    switch (i) {
                        case 0:
/* 25 */                    return ((lolii010oOiI) ((i10I1i1o0oO) abstractList).I00iiO).zza(obj);
                        default:
/* 14 */                    return ((lolii010oOiI) ((i10I1iI) abstractList).I00iiO).zza(obj);
                    }
                }

                @Override
                public final void add(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean hasPrevious() {
/* 5 */             return ((ListIterator) this.I00iOIl).hasPrevious();
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
                public final void set(Object obj) {
/* 29 */            throw new UnsupportedOperationException();
                }
            }
