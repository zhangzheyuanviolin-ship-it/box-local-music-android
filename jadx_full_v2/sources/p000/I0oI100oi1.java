            package p000;
            
            public final class I0oI100oi1 {
                public float I00000oIO;
                public float I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I0oI100oi1)) {
/* 7 */                 return false;
                    }
/* 11 */            I0oI100oi1 i0oI100oi1 = (I0oI100oi1) obj;
                    return Float.compare(this.I00000oIO, i0oI100oi1.I00000oIO) == 0 && Float.compare(this.I00000oOI, i0oI100oi1.I00000oOI) == 0;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00000oOI) + (Float.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "FlingResult(distanceCoefficient=" + this.I00000oIO + ", velocityCoefficient=" + this.I00000oOI + ")";
                }
            }
