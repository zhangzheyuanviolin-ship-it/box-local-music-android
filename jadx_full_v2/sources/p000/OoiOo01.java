            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
/* 27 */    public final class OoiOo01 extends AbstractList implements O0o1ioOoo00, RandomAccess {
                public final O0o1O1lill1 I00iOIl;

                public OoiOo01(O0o1O1lill1 o0o1O1lill1) {
/* 4 */             this.I00iOIl = o0o1O1lill1;
                }

                @Override
                public final List I00000oIO() {
/* 5 */             return Collections.unmodifiableList(this.I00iOIl.I00iiI);
                }

                @Override
                public final void I00IioO0OiOi(IIOI1Ii1I iIOI1Ii1I) {
/* 49 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object I00iiI(int i) {
/* 5 */             return this.I00iOIl.I00iiI.get(i);
                }

                @Override
                public final Object get(int i) {
/* 7 */             return (String) this.I00iOIl.get(i);
                }

                @Override
                public final Iterator iterator() {
/* 4 */             OoiOiiiIO ooiOiiiIO = new OoiOiiiIO(1);
/* 13 */            ooiOiiiIO.I00iiI = this.I00iOIl.iterator();
/* 15 */            VarHandle.storeStoreFence();
/* 29 */            return ooiOiiiIO;
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 4 */             OoiOi1l1lO ooiOi1l1lO = new OoiOi1l1lO(1);
/* 13 */            ooiOi1l1lO.I00iiI = this.I00iOIl.listIterator(i);
/* 15 */            VarHandle.storeStoreFence();
/* 49 */            return ooiOi1l1lO;
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iOIl.size();
                }

                @Override
/* 28 */        public final O0o1ioOoo00 I00100l0() {
/* 29 */            return this;
                }
            }
