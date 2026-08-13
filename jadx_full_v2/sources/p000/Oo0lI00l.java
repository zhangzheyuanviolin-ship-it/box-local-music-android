            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oo0lI00l {
                public static final long I00000oOI = lOliOi0Oi.I00000oIO(0, 0);
                public static final int I0000Il00O = 0;
                public long I00000oIO;

                public static final Oo0lI00l I00000oIO(long j) {
/* 3 */             Oo0lI00l oo0lI00l = new Oo0lI00l();
/* 6 */             oo0lI00l.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return oo0lI00l;
                }

                public static boolean I00000oOI(long j, Object obj) {
                    return (obj instanceof Oo0lI00l) && j == ((Oo0lI00l) obj).I00000oIO;
                }

                public static final boolean I0000Il00O(long j, long j2) {
                    return j == j2;
                }

                public static final boolean I0000O(long j) {
                    return ((int) (j >> 32)) == ((int) (j & 4294967295L));
                }

                public static final int I0000oI00(long j) {
/* 9 */             return I0001Ioi1lo(j) - I000II(j);
                }

                public static final int I0001Ioi1lo(long j) {
/* 13 */            return Math.max((int) (j >> 32), (int) (j & 4294967295L));
                }

                public static final int I000II(long j) {
/* 13 */            return Math.min((int) (j >> 32), (int) (j & 4294967295L));
                }

                public static final boolean I000O01llI0(long j) {
                    return ((int) (j >> 32)) > ((int) (j & 4294967295L));
                }

                public static String I000OOo1O(long j) {
/* 19 */            return Oi010OO0.I0010o("TextRange(", (int) (j >> 32), ", ", (int) (j & 4294967295L), ")");
                }

                public final boolean equals(Object obj) {
/* 3 */             return I00000oOI(this.I00000oIO, obj);
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I000OOo1O(this.I00000oIO);
                }
            }
