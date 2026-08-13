            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oo0o1iioOiO {
                public long I00000oIO;

                public static final Oo0o1iioOiO I00000oIO(long j) {
/* 3 */             Oo0o1iioOiO oo0o1iioOiO = new Oo0o1iioOiO();
/* 6 */             oo0o1iioOiO.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return oo0o1iioOiO;
                }

                public static final boolean I00000oOI(long j, long j2) {
                    return j == j2;
                }

                public static String I0000Il00O(long j) {
                    return I00000oOI(j, 0L) ? "Unspecified" : I00000oOI(j, 4294967296L) ? "Sp" : I00000oOI(j, 8589934592L) ? "Em" : "Invalid";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Oo0o1iioOiO) && this.I00000oIO == ((Oo0o1iioOiO) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I0000Il00O(this.I00000oIO);
                }
            }
