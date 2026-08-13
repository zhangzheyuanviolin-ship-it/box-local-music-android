            package p000;

            import java.util.Iterator;
            
            public abstract class iioOOo1l implements Iterator {
                public final Iterator I00iOIl;

                public iioOOo1l(Iterator it) {
/* 4 */             it.getClass();
/* 7 */             this.I00iOIl = it;
                }

                public abstract Object I00000oIO(Object obj);

                @Override
                public final boolean hasNext() {
/* 3 */             return this.I00iOIl.hasNext();
                }

                @Override
                public final Object next() {
/* 7 */             return I00000oIO(this.I00iOIl.next());
                }

                @Override
                public final void remove() {
/* 3 */             this.I00iOIl.remove();
                }
            }
