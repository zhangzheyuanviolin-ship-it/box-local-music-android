            package p000;

            import java.util.Iterator;
            
            public final class lIll1lOoI1 extends lIiI1010Ool {
                public static final Object[] I00oO101o;
                public static final lIll1lOoI1 I00oOio10iI1;
                public final transient Object[] I00o0l1o1o0;
                public final transient int I00o101lO;
                public final transient Object[] I00oI0i;
                public final transient int I00oII;
                public final transient int I00oIiI10;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             I00oO101o = objArr;
/* 15 */            I00oOio10iI1 = new lIll1lOoI1(objArr, 0, objArr, 0, 0);
                }

                public lIll1lOoI1(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 3 */             super(11);
/* 6 */             this.I00o0l1o1o0 = objArr;
/* 8 */             this.I00o101lO = i;
/* 10 */            this.I00oI0i = objArr2;
/* 12 */            this.I00oII = i2;
/* 14 */            this.I00oIiI10 = i3;
                }

                @Override
                public final int I000o00OoI0I(Object[] objArr) {
/* 1 */             Object[] objArr2 = this.I00o0l1o1o0;
/* 4 */             int i = this.I00oIiI10;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 29 */            return i;
                }

                @Override
                public final int I000oI1ioi() {
/* 1 */             return this.I00oIiI10;
                }

                @Override
                public final int I0010I0i() {
/* 1 */             return 0;
                }

                @Override
                public final Object[] I001IIilI0O() {
/* 1 */             return this.I00o0l1o1o0;
                }

                @Override
                public final boolean contains(Object obj) {
/* 1 */             if (obj == null) {
/* 50 */                return false;
                    }
/* 3 */             Object[] objArr = this.I00oI0i;
/* 6 */             if (objArr.length == 0) {
/* 50 */                return false;
                    }
/* 30 */            int iRotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
                    while (true) {
/* 33 */                int i = iRotateLeft & this.I00oII;
/* 34 */                Object obj2 = objArr[i];
/* 36 */                if (obj2 == null) {
/* 50 */                    return false;
                        }
/* 43 */                if (obj2.equals(obj)) {
/* 45 */                    return true;
                        }
/* 47 */                iRotateLeft = i + 1;
                    }
                }

                @Override
                public final int hashCode() {
/* 1 */             return this.I00o101lO;
                }

                @Override
                public final Iterator iterator() {
/* 1 */             lIOiOOl lioioolI001iOo1i0O = this.I00lll10;
/* 3 */             if (lioioolI001iOo1i0O == null) {
/* 9 */                 lioioolI001iOo1i0O = lIOiOOl.I001iOo1i0O(this.I00oIiI10, this.I00o0l1o1o0);
/* 13 */                this.I00lll10 = lioioolI001iOo1i0O;
                    }
/* 16 */            return lioioolI001iOo1i0O.listIterator(0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00oIiI10;
                }
            }
