            package p000;
            
            public final class I1Ii1iol {
                public float I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;
                public float I0000oI00;
                public float I0001Ioi1lo;
                public float I000II;
                public float I000O01llI0;
                public float I000OOo1O;
                public float[] I000OiO;
                public float I000iOII;
                public float I000l1;
                public float I000lI;
                public float I000o00OoI0I;
                public float I000oI1ioi;
                public boolean I00100l0;
                public float I00100o1O0lo;
                public float I0010I0i;

                public final float I00000oIO() {
/* 5 */             float f = this.I000o00OoI0I * this.I000OOo1O;
/* 25 */            return f * this.I000lI * (this.I000l1 / ((float) Math.hypot(f, (-this.I000oI1ioi) * this.I000O01llI0)));
                }

                public final float I00000oOI() {
/* 5 */             float f = this.I000o00OoI0I * this.I000OOo1O;
/* 11 */            float f2 = (-this.I000oI1ioi) * this.I000O01llI0;
/* 25 */            return f2 * this.I000lI * (this.I000l1 / ((float) Math.hypot(f, f2)));
                }

                public final void I0000Il00O(float f) {
/* 19 */            float f2 = (this.I000lI == -1.0f ? this.I00000oOI - f : f - this.I00000oIO) * this.I000iOII;
/* 20 */            float f3 = 0.0f;
/* 23 */            if (f2 > 0.0f) {
/* 26 */                f3 = 1.0f;
/* 30 */                if (f2 < 1.0f) {
/* 35 */                    float f4 = f2 * 100.0f;
/* 36 */                    int i = (int) f4;
/* 39 */                    float[] fArr = this.I000OiO;
/* 41 */                    float f5 = fArr[i];
/* 49 */                    f3 = ((fArr[i + 1] - f5) * (f4 - i)) + f5;
                        }
                    }
/* 53 */            double d = f3 * 1.5707964f;
/* 60 */            this.I000O01llI0 = (float) Math.sin(d);
/* 67 */            this.I000OOo1O = (float) Math.cos(d);
                }
            }
