            package p000;

            import java.util.Map;
            
            public final class Oi1Oi0 {
                public I1111OO10i I00000oIO;
                public Map I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oi1Oi0)) {
/* 32 */                return false;
                    }
/* 11 */            Oi1Oi0 oi1Oi0 = (Oi1Oi0) obj;
                    return this.I00000oIO.equals(oi1Oi0.I00000oIO) && this.I00000oOI.equals(oi1Oi0.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }
            }
