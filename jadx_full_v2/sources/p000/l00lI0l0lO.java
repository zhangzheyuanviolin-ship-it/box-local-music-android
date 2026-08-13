            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class l00lI0l0lO extends ioOoI0l00I {
                public final transient Object I00o0iI0io1;

                public l00lI0l0lO(Object obj) {
/* 3 */             super(10);
/* 6 */             this.I00o0iI0io1 = obj;
                }

                @Override
                public final int I000o00OoI0I(Object[] objArr) {
/* 4 */             objArr[0] = this.I00o0iI0io1;
/* 6 */             return 1;
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
/* 5 */             ioiIlio0lioo ioiilio0lioo = new ioiIlio0lioo(20);
/* 10 */            ioiilio0lioo.I00iiI = this.I00o0iI0io1;
/* 12 */            VarHandle.storeStoreFence();
/* 20 */            return ioiilio0lioo;
                }

                @Override
                public final int size() {
/* 1 */             return 1;
                }

                @Override
                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("[", this.I00o0iI0io1.toString(), "]");
                }
            }
