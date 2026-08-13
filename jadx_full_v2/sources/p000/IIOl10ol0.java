            package p000;
            
/* 7 */     public final class IIOl10ol0 {
                public float I00000oIO;
                public float I00000oOI;

                public IIOl10ol0(float f, float f2) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IIOl10ol0)) {
/* 7 */                 return false;
                    }
/* 11 */            IIOl10ol0 iIOl10ol0 = (IIOl10ol0) obj;
                    return Float.compare(this.I00000oIO, iIOl10ol0.I00000oIO) == 0 && Float.compare(this.I00000oOI, iIOl10ol0.I00000oOI) == 0;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00000oOI) + (Float.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "CGPoint(x=" + this.I00000oIO + ", y=" + this.I00000oOI + ")";
                }

/* 8 */         public IIOl10ol0() {
/* 9 */             this(0.0f, 0.0f);
                }
            }
