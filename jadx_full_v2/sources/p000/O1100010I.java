            package p000;

            import java.util.ListIterator;
            
            public final class O1100010I implements ListIterator {
                public boolean I00iOIl;
                public ListIterator I00iiI;
                public O1100oOo0Ii I00iiO;

                @Override
                public final void add(Object obj) {
/* 1 */             ListIterator listIterator = this.I00iiI;
/* 3 */             listIterator.add(obj);
/* 6 */             listIterator.previous();
/* 10 */            this.I00iOIl = false;
                }

                @Override
                public final boolean hasNext() {
/* 3 */             return this.I00iiI.hasPrevious();
                }

                @Override
                public final boolean hasPrevious() {
/* 3 */             return this.I00iiI.hasNext();
                }

                @Override
                public final Object next() {
/* 1 */             ListIterator listIterator = this.I00iiI;
/* 7 */             if (listIterator.hasPrevious()) {
/* 10 */                this.I00iOIl = true;
/* 12 */                return listIterator.previous();
                    }
/* 17 */            IoOOl0iOl1io.I00000oOI();
/* 20 */            return null;
                }

                @Override
                public final int nextIndex() {
/* 9 */             return this.I00iiO.I00000oOI(this.I00iiI.nextIndex());
                }

                @Override
                public final Object previous() {
/* 1 */             ListIterator listIterator = this.I00iiI;
/* 7 */             if (listIterator.hasNext()) {
/* 10 */                this.I00iOIl = true;
/* 12 */                return listIterator.next();
                    }
/* 17 */            IoOOl0iOl1io.I00000oOI();
/* 20 */            return null;
                }

                @Override
                public final int previousIndex() {
/* 5 */             return nextIndex() - 1;
                }

                @Override
                public final void remove() {
/* 5 */             lII0I0I01I1l.I000OOo1O("no calls to next() since the last call to remove()", this.I00iOIl);
/* 10 */            this.I00iiI.remove();
/* 14 */            this.I00iOIl = false;
                }

                @Override
                public final void set(Object obj) {
/* 3 */             if (this.I00iOIl) {
/* 7 */                 this.I00iiI.set(obj);
                    } else {
/* 11 */                IOOlIIilOl0.I000iOII();
                    }
                }
            }
