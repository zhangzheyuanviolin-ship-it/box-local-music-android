            package p000;

            import java.util.Iterator;
            import java.util.ListIterator;
            
/* 5 */     public final class IoiliO10I01 extends IoillO0OOoo {
                public final transient int I00iiO;
                public final transient int I00iio;
                public final IoillO0OOoo I00ilI0I1;

                public IoiliO10I01(IoillO0OOoo ioillO0OOoo, int i, int i2) {
/* 1 */             this.I00ilI0I1 = ioillO0OOoo;
/* 6 */             this.I00iiO = i;
/* 8 */             this.I00iio = i2;
                }

                @Override
                public final Object[] I0000oI00() {
/* 3 */             return this.I00ilI0I1.I0000oI00();
                }

                @Override
                public final int I0001Ioi1lo() {
/* 12 */            return this.I00ilI0I1.I000OOo1O() + this.I00iiO + this.I00iio;
                }

                @Override
                public final int I000OOo1O() {
/* 9 */             return this.I00ilI0I1.I000OOo1O() + this.I00iiO;
                }

                @Override
                public final boolean I000OiO() {
/* 1 */             return true;
                }

                @Override
                public final IoillO0OOoo subList(int i, int i2) {
/* 3 */             lII0I0I01I1l.I000O01llI0(i, i2, this.I00iio);
/* 6 */             int i3 = this.I00iiO;
/* 12 */            return this.I00ilI0I1.subList(i + i3, i2 + i3);
                }

                @Override
                public final Object get(int i) {
/* 3 */             lII0I0I01I1l.I0000O(i, this.I00iio);
/* 11 */            return this.I00ilI0I1.get(i + this.I00iiO);
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
                public final int size() {
/* 1 */             return this.I00iio;
                }

                @Override
/* 6 */         public final ListIterator listIterator(int i) {
/* 7 */             return listIterator(i);
                }
            }
