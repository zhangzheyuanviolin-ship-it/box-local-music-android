            package p000;

            import java.util.Iterator;
            
            public final class iilOoii extends iiOlI01i1iI {
                public final transient Object I00o0iI0io1;

                public iilOoii(Object obj) {
/* 3 */             super(9);
/* 6 */             this.I00o0iI0io1 = obj;
                }

                @Override
                public final int I00111O(Object[] objArr) {
/* 4 */             objArr[0] = this.I00o0iI0io1;
/* 6 */             return 1;
                }

                @Override
                public final OoiOOoOlo I001i1O0Ol() {
/* 5 */             return new iiOoiO0iO(this.I00o0iI0io1);
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00o0iI0io1.equals(obj);
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00o0iI0io1.hashCode();
                }

                @Override
                public final Iterator iterator() {
/* 5 */             return new iiOoiO0iO(this.I00o0iI0io1);
                }

                @Override
                public final int size() {
/* 1 */             return 1;
                }

                @Override
                public final String toString() {
/* 3 */             String string = this.I00o0iI0io1.toString();
/* 26 */            return IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
                }
            }
