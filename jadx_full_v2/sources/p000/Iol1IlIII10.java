            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Iol1IlIII10 {
                public int I00000oIO;

                public static final Iol1IlIII10 I00000oIO(int i) {
/* 3 */             Iol1IlIII10 iol1IlIII10 = new Iol1IlIII10();
/* 6 */             iol1IlIII10.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iol1IlIII10;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Iol1IlIII10) && this.I00000oIO == ((Iol1IlIII10) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 7 */             return IIlIOloOOO.I00100l0("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.I00000oIO, ")");
                }
            }
