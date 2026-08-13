            package p000;
            
            public final class OOoliIo1ol extends Ioio0O {
                public static final Object[] I00l0I0l0lO1;
                public static final OOoliIo1ol I00l0OO0IO;
                public final transient Object[] I00iio;
                public final transient int I00ilI0I1;
                public final transient Object[] I00ilO0;
                public final transient int I00io1l;
                public final transient int I00ioIO;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             I00l0I0l0lO1 = objArr;
/* 15 */            I00l0OO0IO = new OOoliIo1ol(objArr, 0, objArr, 0, 0);
                }

                public OOoliIo1ol(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 4 */             this.I00iio = objArr;
/* 6 */             this.I00ilI0I1 = i;
/* 8 */             this.I00ilO0 = objArr2;
/* 10 */            this.I00io1l = i2;
/* 12 */            this.I00ioIO = i3;
                }

                @Override
                public final int I0000O(Object[] objArr) {
/* 1 */             Object[] objArr2 = this.I00iio;
/* 4 */             int i = this.I00ioIO;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 49 */            return i;
                }

                @Override
                public final Object[] I0000oI00() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final int I0001Ioi1lo() {
/* 1 */             return this.I00ioIO;
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return 0;
                }

                @Override
                public final boolean I000OiO() {
/* 1 */             return false;
                }

                @Override
                public final OoiOOoOlo iterator() {
/* 6 */             return I00000oOI().listIterator(0);
                }

                @Override
                public final IoillO0OOoo I000oI1ioi() {
/* 5 */             return IoillO0OOoo.I000lI(this.I00ioIO, this.I00iio);
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             if (obj == null) {
/* 36 */                return false;
                    }
/* 3 */             Object[] objArr = this.I00ilO0;
/* 6 */             if (objArr.length == 0) {
/* 36 */                return false;
                    }
/* 13 */            int iI00000oIO = illii0liI.I00000oIO(obj.hashCode());
                    while (true) {
/* 19 */                int i = iI00000oIO & this.I00io1l;
/* 20 */                Object obj2 = objArr[i];
/* 22 */                if (obj2 == null) {
/* 36 */                    return false;
                        }
/* 29 */                if (obj2.equals(obj)) {
/* 31 */                    return true;
                        }
/* 33 */                iI00000oIO = i + 1;
                    }
                }

                @Override
                public final int hashCode() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00ioIO;
                }
            }
