            package p000;
            
            public final class i001lolI1I {
                public final float I00000oIO;
                public final float I00000oOI;

                public i001lolI1I(float f, float f2) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
                }

                public final float[] I00000oIO() {
/* 1 */             float f = this.I00000oIO;
/* 3 */             float f2 = this.I00000oOI;
/* 14 */            return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof i001lolI1I)) {
/* 7 */                 return false;
                    }
/* 11 */            i001lolI1I i001loli1i = (i001lolI1I) obj;
                    return Float.compare(this.I00000oIO, i001loli1i.I00000oIO) == 0 && Float.compare(this.I00000oOI, i001loli1i.I00000oOI) == 0;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00000oOI) + (Float.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "WhitePoint(x=" + this.I00000oIO + ", y=" + this.I00000oOI + ")";
                }
            }
