            package p000;

            import java.util.ArrayList;
            
            public final class Olo0i0 {
                public ArrayList I00000oIO;
                public ArrayList I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof Olo0i0)) {
/* 32 */                return false;
                    }
/* 9 */             Olo0i0 olo0i0 = (Olo0i0) obj;
                    return this.I00000oIO.equals(olo0i0.I00000oIO) && this.I00000oOI.equals(olo0i0.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "TableLayoutResult(rowOffsets=" + this.I00000oIO + ", columnOffsets=" + this.I00000oOI + ")";
                }
            }
