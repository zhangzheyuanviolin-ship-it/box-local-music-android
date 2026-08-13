            package p000;
            
            public final class Oo0OOlO0 {
                public static final Oo0OOlO0 I0000Il00O = new Oo0OOlO0(1.0f, 0.0f);
                public final float I00000oIO;
                public final float I00000oOI;

                public Oo0OOlO0(float f, float f2) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oo0OOlO0)) {
/* 7 */                 return false;
                    }
/* 11 */            Oo0OOlO0 oo0OOlO0 = (Oo0OOlO0) obj;
                    return this.I00000oIO == oo0OOlO0.I00000oIO && this.I00000oOI == oo0OOlO0.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00000oOI) + (Float.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "TextGeometricTransform(scaleX=" + this.I00000oIO + ", skewX=" + this.I00000oOI + ")";
                }
            }
