            package p000;

            import java.util.Iterator;
            import java.util.ListIterator;
            
            public final class iIolllII1 extends OIlo1IOiO0i implements ListIterator {
                public i1liliil11 I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iIolllII1(i1liliil11 i1liliil11Var) {
/* 4 */             super(i1liliil11Var, (char) 0);
/* 1 */             this.I00ilI0I1 = i1liliil11Var;
                }

                @Override
                public final void add(Object obj) {
/* 1 */             i1liliil11 i1liliil11Var = this.I00ilI0I1;
/* 3 */             boolean zIsEmpty = i1liliil11Var.isEmpty();
/* 7 */             I00000oOI();
/* 16 */            ((ListIterator) ((Iterator) this.I00iiI)).add(obj);
                    ((iOIoo1lI) i1liliil11Var.I00io1l).I00iio++;
/* 29 */            if (zIsEmpty) {
/* 31 */                i1liliil11Var.zza();
                    }
                }

                @Override
                public final boolean hasPrevious() {
/* 1 */             I00000oOI();
/* 10 */            return ((ListIterator) ((Iterator) this.I00iiI)).hasPrevious();
                }

                @Override
                public final int nextIndex() {
/* 1 */             I00000oOI();
/* 10 */            return ((ListIterator) ((Iterator) this.I00iiI)).nextIndex();
                }

                @Override
                public final Object previous() {
/* 1 */             I00000oOI();
/* 10 */            return ((ListIterator) ((Iterator) this.I00iiI)).previous();
                }

                @Override
                public final int previousIndex() {
/* 1 */             I00000oOI();
/* 10 */            return ((ListIterator) ((Iterator) this.I00iiI)).previousIndex();
                }

                @Override
                public final void set(Object obj) {
/* 1 */             I00000oOI();
/* 10 */            ((ListIterator) ((Iterator) this.I00iiI)).set(obj);
                }
            }
