            package p000;
            
            public final class OO0l00oiO1i1 implements Ii0010ol0 {
                public float I00000oIO;

                @Override
                public final float I00000oIO(long j, IiIooOOOI iiIooOOOI) {
/* 10 */            return (this.I00000oIO / 100.0f) * Ol0i1I.I0000O(j);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof OO0l00oiO1i1) && Float.compare(this.I00000oIO, ((OO0l00oiO1i1) obj).I00000oIO) == 0;
                }

                public final int hashCode() {
/* 3 */             return Float.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 18 */            return "CornerSize(size = " + this.I00000oIO + "%)";
                }
            }
