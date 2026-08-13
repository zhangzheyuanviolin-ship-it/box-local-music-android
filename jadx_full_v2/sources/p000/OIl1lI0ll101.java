            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIl1lI0ll101 {
                public int I00000oIO;

                public static final OIl1lI0ll101 I00000oIO(int i) {
/* 3 */             OIl1lI0ll101 oIl1lI0ll101 = new OIl1lI0ll101();
/* 6 */             oIl1lI0ll101.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return oIl1lI0ll101;
                }

                public static String I00000oOI(int i) {
/* 3 */             return Oi010OO0.I000oI1ioi(i, "Output-");
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OIl1lI0ll101) && this.I00000oIO == ((OIl1lI0ll101) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I00000oOI(this.I00000oIO);
                }
            }
