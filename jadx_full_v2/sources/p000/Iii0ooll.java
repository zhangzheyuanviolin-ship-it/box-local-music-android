            package p000;
            
            public final class Iii0ooll {
                public float I00000oIO;
                public float I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Iii0ooll)) {
/* 7 */                 return false;
                    }
/* 11 */            Iii0ooll iii0ooll = (Iii0ooll) obj;
                    return Float.compare(this.I00000oIO, iii0ooll.I00000oIO) == 0 && Float.compare(this.I00000oOI, iii0ooll.I00000oOI) == 0 && this.I0000Il00O == iii0ooll.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.I0000Il00O) + OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 19 */            return IIl001iO0Io.I000lI(this.I0000Il00O, ")", IlIi0I0.I00100l0("DiarSegment(startSec=", this.I00000oIO, ", endSec=", this.I00000oOI, ", speakerIdx="));
                }
            }
