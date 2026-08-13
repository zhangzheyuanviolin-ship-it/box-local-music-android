            package p000;

            import java.io.Serializable;
            import java.util.AbstractSequentialList;
            import java.util.List;
            import java.util.ListIterator;
            
/* 15 */    public final class i10I1iI extends AbstractSequentialList implements Serializable {
                public final int I00iOIl = 0;
                public final List I00iiI;
                public final Object I00iiO;

                public i10I1iI(List list, i101o1l1I1ii i101o1l1i1ii) {
/* 7 */             list.getClass();
/* 12 */            this.I00iiI = list;
/* 14 */            this.I00iiO = i101o1l1i1ii;
                }

                @Override
                public final boolean isEmpty() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI.isEmpty();
                }

                @Override
                public final ListIterator listIterator(int i) {
                    switch (this.I00iOIl) {
                        case 0:
/* 28 */                    return new i10I1OIOOlo(this, this.I00iiI.listIterator(i), 1);
                        default:
/* 15 */                    return new iiIolOOOOOIO(this, this.I00iiI.listIterator(i), 1);
                    }
                }

                @Override
                public final void removeRange(int i, int i2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 22 */                    this.I00iiI.subList(i, i2).clear();
                            break;
                        default:
/* 12 */                    this.I00iiI.subList(i, i2).clear();
                            break;
                    }
                }

                @Override
                public final int size() {
                    switch (this.I00iOIl) {
                    }
/* 8 */             return this.I00iiI.size();
                }

/* 16 */        public i10I1iI(List list, lolii010oOiI lolii010ooii) {
/* 18 */            list.getClass();
/* 19 */            this.I00iiI = list;
/* 20 */            this.I00iiO = lolii010ooii;
                }
            }
