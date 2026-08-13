            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OloOOIoO1ii1 {
                public int I00000oIO;

                public static final OloOOIoO1ii1 I00000oIO(int i) {
/* 3 */             OloOOIoO1ii1 oloOOIoO1ii1 = new OloOOIoO1ii1();
/* 6 */             oloOOIoO1ii1.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return oloOOIoO1ii1;
                }

                public static String I00000oOI(int i) {
                    return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == 0 ? "Unspecified" : "Invalid";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OloOOIoO1ii1) && this.I00000oIO == ((OloOOIoO1ii1) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I00000oOI(this.I00000oIO);
                }
            }
