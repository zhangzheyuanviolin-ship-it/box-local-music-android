            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class lIlo101 extends lIiI1010Ool {
                public final transient Object I00o0l1o1o0;

                public lIlo101(Object obj) {
/* 3 */             super(11);
/* 6 */             this.I00o0l1o1o0 = obj;
                }

                @Override
                public final int I000o00OoI0I(Object[] objArr) {
/* 4 */             objArr[0] = this.I00o0l1o1o0;
/* 6 */             return 1;
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00o0l1o1o0.equals(obj);
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00o0l1o1o0.hashCode();
                }

                @Override
                public final Iterator iterator() {
/* 5 */             lIiOIoOI0oO liioiooi0oo = new lIiOIoOI0oO(21);
/* 10 */            liioiooi0oo.I00iiI = this.I00o0l1o1o0;
/* 12 */            VarHandle.storeStoreFence();
/* 20 */            return liioiooi0oo;
                }

                @Override
                public final int size() {
/* 1 */             return 1;
                }

                @Override
                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("[", this.I00o0l1o1o0.toString(), "]");
                }
            }
