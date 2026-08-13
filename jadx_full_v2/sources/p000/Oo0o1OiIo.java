            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oo0o1OiIo {
                public static final Oo0o1iioOiO[] I00000oOI = {Oo0o1iioOiO.I00000oIO(0), Oo0o1iioOiO.I00000oIO(4294967296L), Oo0o1iioOiO.I00000oIO(8589934592L)};
                public static final long I0000Il00O = lOlilO1lOIO.I0000oI00(Float.NaN, 0);
                public long I00000oIO;

                public static final Oo0o1OiIo I00000oIO(long j) {
/* 3 */             Oo0o1OiIo oo0o1OiIo = new Oo0o1OiIo();
/* 6 */             oo0o1OiIo.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return oo0o1OiIo;
                }

                public static final boolean I00000oOI(long j, long j2) {
                    return j == j2;
                }

                public static final long I0000Il00O(long j) {
/* 15 */            return I00000oOI[(int) ((j & 1095216660480L) >>> 32)].I00000oIO;
                }

                public static final float I0000O(long j) {
/* 8 */             return Float.intBitsToFloat((int) (j & 4294967295L));
                }

                public static final boolean I0000oI00(long j) {
                    return (j & 1095216660480L) == 8589934592L;
                }

                public static String I0001Ioi1lo(long j) {
/* 1 */             long jI0000Il00O = I0000Il00O(j);
/* 11 */            if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 0L)) {
/* 13 */                return "Unspecified";
                    }
/* 25 */            if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 4294967296L)) {
/* 44 */                return I0000O(j) + ".sp";
                    }
/* 58 */            if (!Oo0o1iioOiO.I00000oOI(jI0000Il00O, 8589934592L)) {
/* 82 */                return "Invalid";
                    }
/* 77 */            return I0000O(j) + ".em";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Oo0o1OiIo) && this.I00000oIO == ((Oo0o1OiIo) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I0001Ioi1lo(this.I00000oIO);
                }
            }
