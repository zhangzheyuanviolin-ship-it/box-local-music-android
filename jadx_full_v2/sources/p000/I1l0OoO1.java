            package p000;

            import java.util.ArrayList;
            
            public final class I1l0OoO1 {
                public String I00000oIO;
                public ArrayList I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1l0OoO1)) {
/* 32 */                return false;
                    }
/* 8 */             I1l0OoO1 i1l0OoO1 = (I1l0OoO1) obj;
                    return this.I00000oIO.equals(i1l0OoO1.I00000oIO) && this.I00000oOI.equals(i1l0OoO1.I00000oOI);
                }

                public final int hashCode() {
/* 18 */            return this.I00000oOI.hashCode() ^ ((this.I00000oIO.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "HeartBeatResult{userAgent=" + this.I00000oIO + ", usedDates=" + this.I00000oOI + "}";
                }
            }
