            package p000;
            
            public final class I110iOiOllO extends I110ooool {
                public float I00000oIO;

                public I110iOiOllO(float f) {
/* 4 */             this.I00000oIO = f;
                }

                @Override
                public final float I00000oIO(int i) {
/* 1 */             if (i == 0) {
/* 3 */                 return this.I00000oIO;
                    }
/* 6 */             return 0.0f;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return 1;
                }

                @Override
                public final I110ooool I0000Il00O() {
/* 4 */             return new I110iOiOllO(0.0f);
                }

                @Override
                public final void I0000O() {
/* 2 */             this.I00000oIO = 0.0f;
                }

                @Override
                public final void I0000oI00(int i, float f) {
/* 1 */             if (i == 0) {
/* 3 */                 this.I00000oIO = f;
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof I110iOiOllO) && ((I110iOiOllO) obj).I00000oIO == this.I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Float.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 13 */            return "AnimationVector1D: value = " + this.I00000oIO;
                }
            }
