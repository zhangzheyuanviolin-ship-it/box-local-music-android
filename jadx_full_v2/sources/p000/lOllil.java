            package p000;

            import java.util.Iterator;
            
            public final class lOllil extends lOO110IoOiI {
                public static final Object[] I00ioIO;
                public static final lOllil I00l0I0l0lO1;
                public final transient Object[] I00iiO;
                public final transient int I00iio;
                public final transient Object[] I00ilI0I1;
                public final transient int I00ilO0;
                public final transient int I00io1l;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             I00ioIO = objArr;
/* 15 */            I00l0I0l0lO1 = new lOllil(objArr, 0, objArr, 0, 0);
                }

                public lOllil(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 4 */             this.I00iiO = objArr;
/* 6 */             this.I00iio = i;
/* 8 */             this.I00ilI0I1 = objArr2;
/* 10 */            this.I00ilO0 = i2;
/* 12 */            this.I00io1l = i3;
                }

                @Override
                public final Object[] I00000oOI() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final int I0000O() {
/* 1 */             return 0;
                }

                @Override
                public final int I0000oI00() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final int I000OiO(Object[] objArr) {
/* 2 */             Object[] objArr2 = this.I00iiO;
/* 4 */             int i = this.I00io1l;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 29 */            return i;
                }

                @Override
                public final OoiOOoOlo I000iOII() {
/* 6 */             return I0001Ioi1lo().listIterator(0);
                }

                @Override
                public final lOI1lll1l10 I000o00OoI0I() {
/* 5 */             return lOI1lll1l10.I000oI1ioi(this.I00io1l, this.I00iiO);
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             if (obj == null) {
/* 35 */                return false;
                    }
/* 3 */             Object[] objArr = this.I00ilI0I1;
/* 6 */             if (objArr.length == 0) {
/* 35 */                return false;
                    }
/* 12 */            int iI00000oIO = ll0l01liOO1.I00000oIO(obj.hashCode());
                    while (true) {
/* 18 */                int i = iI00000oIO & this.I00ilO0;
/* 19 */                Object obj2 = objArr[i];
/* 21 */                if (obj2 == null) {
/* 35 */                    return false;
                        }
/* 28 */                if (obj2.equals(obj)) {
/* 30 */                    return true;
                        }
/* 32 */                iI00000oIO = i + 1;
                    }
                }

                @Override
                public final int hashCode() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final Iterator iterator() {
/* 6 */             return I0001Ioi1lo().listIterator(0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00io1l;
                }
            }
