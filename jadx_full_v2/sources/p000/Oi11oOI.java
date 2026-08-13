            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.ListIterator;
            
/* 23 */    public final class Oi11oOI extends I01Io000 {
                public final ArrayList I00iOIl;

                public Oi11oOI(ArrayList arrayList) {
/* 4 */             this.I00iOIl = arrayList;
                }

                @Override
                public final int I00000oOI() {
/* 3 */             return this.I00iOIl.size();
                }

                @Override
                public final Object I0000O(int i) {
/* 7 */             return this.I00iOIl.remove(IOOi0Ool1i.I00OIO1(i, this));
                }

                @Override
                public final void add(int i, Object obj) {
/* 7 */             this.I00iOIl.add(IOOi0Ool1i.I00OIl(i, this), obj);
                }

                @Override
                public final void clear() {
/* 3 */             this.I00iOIl.clear();
                }

                @Override
                public final Object get(int i) {
/* 7 */             return this.I00iOIl.get(IOOi0Ool1i.I00OIO1(i, this));
                }

                @Override
                public final Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 4 */             Oi11lo1liI0l oi11lo1liI0l = new Oi11lo1liI0l(0);
/* 7 */             oi11lo1liI0l.I00iiO = this;
/* 19 */            oi11lo1liI0l.I00iiI = this.I00iOIl.listIterator(IOOi0Ool1i.I00OIl(i, this));
/* 21 */            VarHandle.storeStoreFence();
/* 49 */            return oi11lo1liI0l;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 7 */             return this.I00iOIl.set(IOOi0Ool1i.I00OIO1(i, this), obj);
                }

                @Override
/* 24 */        public final ListIterator listIterator() {
/* 25 */            return listIterator(0);
                }
            }
