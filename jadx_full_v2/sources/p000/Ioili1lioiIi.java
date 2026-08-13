            package p000;

            import java.util.Iterator;
            import java.util.ListIterator;
            
/* 5 */     public final class Ioili1lioiIi extends IoillO0OOoo {
                public final transient IoillO0OOoo I00iiO;

                public Ioili1lioiIi(IoillO0OOoo ioillO0OOoo) {
/* 4 */             this.I00iiO = ioillO0OOoo;
                }

                @Override
                public final boolean I000OiO() {
/* 3 */             return this.I00iiO.I000OiO();
                }

                @Override
                public final IoillO0OOoo I0010I0i() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final IoillO0OOoo subList(int i, int i2) {
/* 1 */             IoillO0OOoo ioillO0OOoo = this.I00iiO;
/* 7 */             lII0I0I01I1l.I000O01llI0(i, i2, ioillO0OOoo.size());
/* 24 */            return ioillO0OOoo.subList(ioillO0OOoo.size() - i2, ioillO0OOoo.size() - i).I0010I0i();
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00iiO.contains(obj);
                }

                @Override
                public final Object get(int i) {
/* 1 */             IoillO0OOoo ioillO0OOoo = this.I00iiO;
/* 7 */             lII0I0I01I1l.I0000O(i, ioillO0OOoo.size());
/* 17 */            return ioillO0OOoo.get((ioillO0OOoo.size() - 1) - i);
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             int iLastIndexOf = this.I00iiO.lastIndexOf(obj);
/* 7 */             if (iLastIndexOf >= 0) {
/* 15 */                return (r0.size() - 1) - iLastIndexOf;
                    }
/* 17 */            return -1;
                }

                @Override
                public final Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 3 */             int iIndexOf = this.I00iiO.indexOf(obj);
/* 7 */             if (iIndexOf >= 0) {
/* 15 */                return (r0.size() - 1) - iIndexOf;
                    }
/* 17 */            return -1;
                }

                @Override
                public final ListIterator listIterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iiO.size();
                }

                @Override
/* 6 */         public final ListIterator listIterator(int i) {
/* 7 */             return listIterator(i);
                }
            }
