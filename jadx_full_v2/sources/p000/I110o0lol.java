            package p000;
            
            public final class I110o0lol extends I110ooool {
                public float I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;

                public I110o0lol(float f, float f2, float f3, float f4) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
/* 8 */             this.I0000Il00O = f3;
/* 10 */            this.I0000O = f4;
                }

                @Override
                public final float I00000oIO(int i) {
/* 1 */             if (i == 0) {
/* 23 */                return this.I00000oIO;
                    }
/* 4 */             if (i == 1) {
/* 20 */                return this.I00000oOI;
                    }
/* 7 */             if (i == 2) {
/* 17 */                return this.I0000Il00O;
                    }
/* 10 */            if (i != 3) {
/* 12 */                return 0.0f;
                    }
/* 14 */            return this.I0000O;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return 4;
                }

                @Override
                public final I110ooool I0000Il00O() {
/* 4 */             return new I110o0lol(0.0f, 0.0f, 0.0f, 0.0f);
                }

                @Override
                public final void I0000O() {
/* 2 */             this.I00000oIO = 0.0f;
/* 4 */             this.I00000oOI = 0.0f;
/* 6 */             this.I0000Il00O = 0.0f;
/* 8 */             this.I0000O = 0.0f;
                }

                @Override
                public final void I0000oI00(int i, float f) {
/* 1 */             if (i == 0) {
/* 22 */                this.I00000oIO = f;
/* 37 */                return;
                    }
/* 4 */             if (i == 1) {
/* 19 */                this.I00000oOI = f;
                    } else if (i == 2) {
/* 16 */                this.I0000Il00O = f;
                    } else {
/* 10 */                if (i != 3) {
/* 12 */                    return;
                        }
/* 13 */                this.I0000O = f;
                    }
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof I110o0lol)) {
/* 41 */                return false;
                    }
/* 5 */             I110o0lol i110o0lol = (I110o0lol) obj;
                    return i110o0lol.I00000oIO == this.I00000oIO && i110o0lol.I00000oOI == this.I00000oOI && i110o0lol.I0000Il00O == this.I0000Il00O && i110o0lol.I0000O == this.I0000O;
                }

                public final int hashCode() {
/* 28 */            return Float.hashCode(this.I0000O) + OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
                }

                public final String toString() {
/* 1 */             float f = this.I00000oIO;
/* 3 */             float f2 = this.I00000oOI;
/* 5 */             float f3 = this.I0000Il00O;
/* 7 */             float f4 = this.I0000O;
/* 15 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
/* 19 */            sbI00100l0.append(f3);
/* 24 */            sbI00100l0.append(", v4 = ");
/* 27 */            sbI00100l0.append(f4);
/* 30 */            return sbI00100l0.toString();
                }
            }
