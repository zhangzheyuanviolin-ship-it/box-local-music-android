            package p000;

            import java.util.Iterator;
            
            public final class i0IlO1il1o extends i0Ii1O10ol0 {
                public static final Object[] I00oIiI10;
                public static final i0IlO1il1o I00oO101o;
                public final transient Object[] I00o0iI0io1;
                public final transient int I00o0l1o1o0;
                public final transient Object[] I00o101lO;
                public final transient int I00oI0i;
                public final transient int I00oII;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             I00oIiI10 = objArr;
/* 15 */            I00oO101o = new i0IlO1il1o(objArr, 0, objArr, 0, 0);
                }

                public i0IlO1il1o(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 2 */             super(0);
/* 5 */             this.I00o0iI0io1 = objArr;
/* 7 */             this.I00o0l1o1o0 = i;
/* 9 */             this.I00o101lO = objArr2;
/* 11 */            this.I00oI0i = i2;
/* 13 */            this.I00oII = i3;
                }

                @Override
                public final int I00000oOI(Object[] objArr) {
/* 1 */             Object[] objArr2 = this.I00o0iI0io1;
/* 4 */             int i = this.I00oII;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 49 */            return i;
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00oII;
                }

                @Override
                public final int I0000oI00() {
/* 1 */             return 0;
                }

                @Override
                public final Object[] I0001Ioi1lo() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             if (obj == null) {
/* 36 */                return false;
                    }
/* 3 */             Object[] objArr = this.I00o101lO;
/* 6 */             if (objArr.length == 0) {
/* 36 */                return false;
                    }
/* 13 */            int iI00000oIO = liIl1O0ollo.I00000oIO(obj.hashCode());
                    while (true) {
/* 19 */                int i = iI00000oIO & this.I00oI0i;
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
/* 1 */             return this.I00o0l1o1o0;
                }

                @Override
                public final Iterator iterator() {
/* 1 */             i0IOo0 i0ioo0I001lIiIIo1O = this.I00lll10;
/* 3 */             if (i0ioo0I001lIiIIo1O == null) {
/* 9 */                 i0ioo0I001lIiIIo1O = i0IOo0.I001lIiIIo1O(this.I00oII, this.I00o0iI0io1);
/* 13 */                this.I00lll10 = i0ioo0I001lIiIIo1O;
                    }
/* 16 */            return i0ioo0I001lIiIIo1O.listIterator(0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00oII;
                }
            }
