            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ol0i0ill1l extends Ioio0O {
                public final transient Object I00iio;

                public Ol0i0ill1l(Object obj) {
/* 4 */             obj.getClass();
/* 7 */             this.I00iio = obj;
                }

                @Override
                public final IoillO0OOoo I00000oOI() {
/* 1 */             IoilOOi ioilOOi = IoillO0OOoo.I00iiI;
/* 5 */             Object[] objArr = {this.I00iio};
/* 10 */            l1ioi1lI.I00000oIO(1, objArr);
/* 13 */            return IoillO0OOoo.I000lI(1, objArr);
                }

                @Override
                public final int I0000O(Object[] objArr) {
/* 4 */             objArr[0] = this.I00iio;
/* 6 */             return 1;
                }

                @Override
                public final boolean I000OiO() {
/* 1 */             return false;
                }

                @Override
                public final OoiOOoOlo iterator() {
/* 4 */             O00O0il o00O0il = new O00O0il(0);
/* 9 */             o00O0il.I00iiI = this.I00iio;
/* 11 */            VarHandle.storeStoreFence();
/* 29 */            return o00O0il;
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00iio.equals(obj);
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iio.hashCode();
                }

                @Override
                public final int size() {
/* 1 */             return 1;
                }

                @Override
                public final String toString() {
/* 22 */            return "[" + this.I00iio.toString() + ']';
                }
            }
