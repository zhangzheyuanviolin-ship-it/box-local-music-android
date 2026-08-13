            package p000;

            import java.util.ArrayList;
            
            public final class I1l01I0lo0 {
                public OlioOil I00000oIO;
                public OlioOil I00000oOI;
                public ArrayList I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 40 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1l01I0lo0)) {
/* 42 */                return false;
                    }
/* 8 */             I1l01I0lo0 i1l01I0lo0 = (I1l01I0lo0) obj;
                    return this.I00000oIO.equals(i1l01I0lo0.I00000oIO) && this.I00000oOI.equals(i1l01I0lo0.I00000oOI) && this.I0000Il00O.equals(i1l01I0lo0.I0000Il00O);
                }

                public final int hashCode() {
/* 26 */            return this.I0000Il00O.hashCode() ^ ((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003);
                }

                public final String toString() {
/* 38 */            return "In{primarySurfaceEdge=" + this.I00000oIO + ", secondarySurfaceEdge=" + this.I00000oOI + ", outConfigs=" + this.I0000Il00O + "}";
                }
            }
