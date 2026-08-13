            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
/* 18 */    public final class iooo000ioI extends AbstractList implements RandomAccess, illlOI {
                public final illiI0OI I00iOIl;

                public iooo000ioI(illiI0OI illii0oi) {
/* 4 */             this.I00iOIl = illii0oi;
                }

                @Override
                public final void I00OOll1(iiooOi11li iioooi11li) {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final Object get(int i) {
/* 3 */             return this.I00iOIl.get(i);
                }

                @Override
                public final Iterator iterator() {
/* 5 */             OoiOiiiIO ooiOiiiIO = new OoiOiiiIO(9);
/* 14 */            ooiOiiiIO.I00iiI = this.I00iOIl.iterator();
/* 16 */            VarHandle.storeStoreFence();
/* 20 */            return ooiOiiiIO;
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 4 */             OoiOi1l1lO ooiOi1l1lO = new OoiOi1l1lO(2);
/* 13 */            ooiOi1l1lO.I00iiI = this.I00iOIl.listIterator(i);
/* 15 */            VarHandle.storeStoreFence();
/* 29 */            return ooiOi1l1lO;
                }

                @Override
                public final int size() {
/* 5 */             return this.I00iOIl.I00iiI.size();
                }

                @Override
                public final Object zzf(int i) {
/* 5 */             return this.I00iOIl.I00iiI.get(i);
                }

                @Override
                public final List zzh() {
/* 5 */             return Collections.unmodifiableList(this.I00iOIl.I00iiI);
                }

                @Override
/* 19 */        public final illlOI zze() {
/* 20 */            return this;
                }
            }
