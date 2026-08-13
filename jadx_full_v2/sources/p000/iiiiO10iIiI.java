            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            public final class iiiiO10iIiI extends iiOlI01i1iI {
                public final transient OOoli1l I00o0iI0io1;
                public final transient Object[] I00o0l1o1o0;
                public final transient int I00o101lO;

                public iiiiO10iIiI(OOoli1l oOoli1l, Object[] objArr, int i) {
/* 3 */             super(9);
/* 6 */             this.I00o0iI0io1 = oOoli1l;
/* 8 */             this.I00o0l1o1o0 = objArr;
/* 10 */            this.I00o101lO = i;
                }

                @Override
                public final int I00111O(Object[] objArr) {
/* 5 */             return I001lIiIIo1O().I00111O(objArr);
                }

                @Override
                public final OoiOOoOlo I001i1O0Ol() {
/* 6 */             return I001lIiIIo1O().listIterator(0);
                }

                @Override
                public final iiIooIlooool I001lllioOl() {
/* 3 */             return new iiiIli1(this);
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             if (!(obj instanceof Map.Entry)) {
/* 31 */                return false;
                    }
/* 5 */             Map.Entry entry = (Map.Entry) obj;
/* 7 */             Object key = entry.getKey();
/* 11 */            Object value = entry.getValue();
                    return value != null && value.equals(this.I00o0iI0io1.get(key));
                }

                @Override
                public final Iterator iterator() {
/* 6 */             return I001lIiIIo1O().listIterator(0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00o101lO;
                }
            }
