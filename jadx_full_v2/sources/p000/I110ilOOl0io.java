            package p000;
            
            public final class I110ilOOl0io extends I110ooool {
                public float I00000oIO;
                public float I00000oOI;

                public I110ilOOl0io(float f, float f2) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
                }

                @Override
                public final float I00000oIO(int i) {
/* 1 */             if (i == 0) {
/* 11 */                return this.I00000oIO;
                    }
/* 4 */             if (i != 1) {
/* 6 */                 return 0.0f;
                    }
/* 8 */             return this.I00000oOI;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return 2;
                }

                @Override
                public final I110ooool I0000Il00O() {
/* 4 */             return new I110ilOOl0io(0.0f, 0.0f);
                }

                @Override
                public final void I0000O() {
/* 2 */             this.I00000oIO = 0.0f;
/* 4 */             this.I00000oOI = 0.0f;
                }

                @Override
                public final void I0000oI00(int i, float f) {
/* 1 */             if (i == 0) {
/* 10 */                this.I00000oIO = f;
                    } else {
/* 4 */                 if (i != 1) {
/* 6 */                     return;
                        }
/* 7 */                 this.I00000oOI = f;
                    }
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof I110ilOOl0io)) {
/* 25 */                return false;
                    }
/* 5 */             I110ilOOl0io i110ilOOl0io = (I110ilOOl0io) obj;
                    return i110ilOOl0io.I00000oIO == this.I00000oIO && i110ilOOl0io.I00000oOI == this.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00000oOI) + (Float.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 23 */            return "AnimationVector2D: v1 = " + this.I00000oIO + ", v2 = " + this.I00000oOI;
                }
            }
