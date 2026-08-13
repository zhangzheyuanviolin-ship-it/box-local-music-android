            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IooO0O {
                public long I00000oIO;

                public static final IooO0O I00000oIO(long j) {
/* 3 */             IooO0O iooO0O = new IooO0O();
/* 6 */             iooO0O.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iooO0O;
                }

                public static long I00000oOI(int i, int i2, int i3, long j) {
/* 5 */             if ((i3 & 1) != 0) {
/* 9 */                 i = (int) (j >> 32);
                    }
/* 17 */            if ((i3 & 2) != 0) {
/* 21 */                i2 = (int) (j & 4294967295L);
                    }
/* 26 */            return (i2 & 4294967295L) | (i << 32);
                }

                public static final boolean I0000Il00O(long j, long j2) {
                    return j == j2;
                }

                public static final long I0000O(long j, long j2) {
/* 25 */            return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
                }

                public static final long I0000oI00(long j, long j2) {
/* 25 */            return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
                }

                public static String I0001Ioi1lo(long j) {
/* 19 */            return Oi010OO0.I0010o("(", (int) (j >> 32), ", ", (int) (j & 4294967295L), ")");
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IooO0O) && this.I00000oIO == ((IooO0O) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I0001Ioi1lo(this.I00000oIO);
                }
            }
