            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
/* 27 */    public final class OoiOo0 extends AbstractList implements RandomAccess, O0o1lIo {
                public final O0o1O0olOll I00iOIl;

                public OoiOo0(O0o1O0olOll o0o1O0olOll) {
/* 4 */             this.I00iOIl = o0o1O0olOll;
                }

                @Override
                public final List I00000oIO() {
/* 5 */             return Collections.unmodifiableList(this.I00iOIl.I00iOIl);
                }

                @Override
                public final IIOII1 I00IoiI(int i) {
/* 3 */             return this.I00iOIl.I00IoiI(i);
                }

                @Override
                public final void I00Ol00(O1101ooIo0l o1101ooIo0l) {
/* 49 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object get(int i) {
/* 7 */             return (String) this.I00iOIl.get(i);
                }

                @Override
                public final Iterator iterator() {
/* 4 */             OoiOiiiIO ooiOiiiIO = new OoiOiiiIO(0);
/* 13 */            ooiOiiiIO.I00iiI = this.I00iOIl.iterator();
/* 15 */            VarHandle.storeStoreFence();
/* 29 */            return ooiOiiiIO;
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 4 */             OoiOi1l1lO ooiOi1l1lO = new OoiOi1l1lO(0);
/* 13 */            ooiOi1l1lO.I00iiI = this.I00iOIl.listIterator(i);
/* 15 */            VarHandle.storeStoreFence();
/* 49 */            return ooiOi1l1lO;
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.size();
                }

                @Override
/* 28 */        public final OoiOo0 I00100l0() {
/* 29 */            return this;
                }
            }
