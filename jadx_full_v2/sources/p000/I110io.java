            package p000;
            
            public final class I110io extends I110ooool {
                public float I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;

                public I110io(float f, float f2, float f3) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
/* 8 */             this.I0000Il00O = f3;
                }

                @Override
                public final float I00000oIO(int i) {
/* 1 */             if (i == 0) {
/* 17 */                return this.I00000oIO;
                    }
/* 4 */             if (i == 1) {
/* 14 */                return this.I00000oOI;
                    }
/* 7 */             if (i != 2) {
/* 9 */                 return 0.0f;
                    }
/* 11 */            return this.I0000Il00O;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return 3;
                }

                @Override
                public final I110ooool I0000Il00O() {
/* 4 */             return new I110io(0.0f, 0.0f, 0.0f);
                }

                @Override
                public final void I0000O() {
/* 2 */             this.I00000oIO = 0.0f;
/* 4 */             this.I00000oOI = 0.0f;
/* 6 */             this.I0000Il00O = 0.0f;
                }

                @Override
                public final void I0000oI00(int i, float f) {
/* 1 */             if (i == 0) {
/* 16 */                this.I00000oIO = f;
                    } else if (i == 1) {
/* 13 */                this.I00000oOI = f;
                    } else {
/* 7 */                 if (i != 2) {
/* 9 */                     return;
                        }
/* 10 */                this.I0000Il00O = f;
                    }
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof I110io)) {
/* 33 */                return false;
                    }
/* 5 */             I110io i110io = (I110io) obj;
                    return i110io.I00000oIO == this.I00000oIO && i110io.I00000oOI == this.I00000oOI && i110io.I0000Il00O == this.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Float.hashCode(this.I0000Il00O) + OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 1 */             float f = this.I00000oIO;
/* 3 */             float f2 = this.I00000oOI;
/* 5 */             float f3 = this.I0000Il00O;
/* 13 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
/* 17 */            sbI00100l0.append(f3);
/* 20 */            return sbI00100l0.toString();
                }
            }
