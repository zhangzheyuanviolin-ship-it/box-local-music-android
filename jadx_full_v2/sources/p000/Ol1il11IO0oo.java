            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ol1il11IO0oo implements Iio1i00IOI {
                public final int I00000oIO;

                public Ol1il11IO0oo(int i) {
/* 4 */             this.I00000oIO = i;
                }

                @Override
                public final Ooo1oiI0 I00000oIO(OoIoOiiO1 ooIoOiiO1) {
/* 3 */             IIi0oIl iIi0oIl = new IIi0oIl();
/* 8 */             iIi0oIl.I00iOIl = this.I00000oIO;
/* 10 */            VarHandle.storeStoreFence();
/* 29 */            return iIi0oIl;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Ol1il11IO0oo) && ((Ol1il11IO0oo) obj).I00000oIO == this.I00000oIO;
                }

                public final int hashCode() {
/* 1 */             return this.I00000oIO;
                }
            }
