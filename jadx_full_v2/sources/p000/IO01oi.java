            package p000;

            import java.util.Map;
            
            public final class IO01oi implements IO01oi0 {
                public final Map I00iOIl;
                public final Map I00iiI;

                public IO01oi(Map map, Map map2) {
/* 4 */             this.I00iOIl = map;
/* 6 */             this.I00iiI = map2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof IO01oi)) {
/* 32 */                return false;
                    }
/* 9 */             IO01oi iO01oi = (IO01oi) obj;
                    return this.I00iOIl.equals(iO01oi.I00iOIl) && this.I00iiI.equals(iO01oi.I00iiI);
                }

                public final int hashCode() {
/* 15 */            return this.I00iiI.hashCode() + (this.I00iOIl.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "Success(deferred=" + this.I00iOIl + ", outputSurfaceMap=" + this.I00iiI + ')';
                }
            }
