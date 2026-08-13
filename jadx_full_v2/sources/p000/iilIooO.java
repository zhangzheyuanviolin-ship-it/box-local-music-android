            package p000;

            import java.util.Iterator;
            
            public final class iilIooO extends iiOlI01i1iI {
                public static final Object[] I00oIiI10;
                public static final iilIooO I00oO101o;
                public final transient Object[] I00o0iI0io1;
                public final transient int I00o0l1o1o0;
                public final transient Object[] I00o101lO;
                public final transient int I00oI0i;
                public final transient int I00oII;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             I00oIiI10 = objArr;
/* 15 */            I00oO101o = new iilIooO(objArr, 0, objArr, 0, 0);
                }

                public iilIooO(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 3 */             super(9);
/* 6 */             this.I00o0iI0io1 = objArr;
/* 8 */             this.I00o0l1o1o0 = i;
/* 10 */            this.I00o101lO = objArr2;
/* 12 */            this.I00oI0i = i2;
/* 14 */            this.I00oII = i3;
                }

                @Override
                public final Object[] I00100o1O0lo() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final int I0010I0i() {
/* 1 */             return 0;
                }

                @Override
                public final int I0010o() {
/* 1 */             return this.I00oII;
                }

                @Override
                public final int I00111O(Object[] objArr) {
/* 2 */             Object[] objArr2 = this.I00o0iI0io1;
/* 4 */             int i = this.I00oII;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 29 */            return i;
                }

                @Override
                public final OoiOOoOlo I001i1O0Ol() {
/* 6 */             return I001lIiIIo1O().listIterator(0);
                }

                @Override
                public final iiIooIlooool I001lllioOl() {
/* 1 */             iiIi1O0 iiii1o0 = iiIooIlooool.I00lll10;
/* 3 */             int i = this.I00oII;
                    return i == 0 ? iii11O110.I00o101lO : new iii11O110(this.I00o0iI0io1, i);
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             if (obj == null) {
/* 35 */                return false;
                    }
/* 3 */             Object[] objArr = this.I00o101lO;
/* 6 */             if (objArr.length == 0) {
/* 35 */                return false;
                    }
/* 12 */            int iI00000oIO = lilOIIIlIO.I00000oIO(obj.hashCode());
                    while (true) {
/* 18 */                int i = iI00000oIO & this.I00oI0i;
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
/* 1 */             return this.I00o0l1o1o0;
                }

                @Override
                public final Iterator iterator() {
/* 6 */             return I001lIiIIo1O().listIterator(0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00oII;
                }
            }
