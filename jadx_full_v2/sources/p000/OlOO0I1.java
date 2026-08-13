            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OlOO0I1 {
                public int I00000oIO;

                public static final OlOO0I1 I00000oIO(int i) {
/* 3 */             OlOO0I1 olOO0I1 = new OlOO0I1();
/* 6 */             olOO0I1.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return olOO0I1;
                }

                public static String I00000oOI(int i) {
/* 3 */             return Oi010OO0.I000oI1ioi(i, "Stream-");
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OlOO0I1) && this.I00000oIO == ((OlOO0I1) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I00000oOI(this.I00000oIO);
                }
            }
