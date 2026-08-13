            package p000;

            import java.io.Serializable;
            
            public final class I0i110Oli0 implements Cloneable, Serializable {
                public double I00iOIl;
                public double I00iiI;
                public double I00iiO;
                public double I00iio;
                public double I00ilI0I1;
                public double I00ilO0;

                public final void I00000oIO() {
/* 3 */             double d = this.I00iOIl;
/* 12 */            double d2 = this.I00iiO;
/* 16 */            double d3 = 0.0d * d2;
/* 18 */            double d4 = (1000.0d * d) + d3;
/* 19 */            double d5 = this.I00iiI;
/* 25 */            double d6 = this.I00iio;
/* 27 */            double d7 = 0.0d * d6;
/* 31 */            double d8 = d7 + (1000.0d * d5);
/* 33 */            double d9 = d * 0.0d;
/* 37 */            double d10 = (d2 * 1000.0d) + d9;
/* 38 */            double d11 = d5 * 0.0d;
/* 46 */            double d12 = d3 + d9 + this.I00ilI0I1;
/* 51 */            double d13 = d7 + d11 + this.I00ilO0;
/* 53 */            this.I00iOIl = d4;
/* 55 */            this.I00iiI = d8;
/* 57 */            this.I00iiO = d10;
/* 59 */            this.I00iio = (d6 * 1000.0d) + d11;
/* 61 */            this.I00ilI0I1 = d12;
/* 63 */            this.I00ilO0 = d13;
                }

                public final void I00000oOI(float[] fArr, float[] fArr2) {
/* 1 */             int i = 0;
/* 3 */             int i2 = 1;
/* 4 */             int i3 = 0;
                    while (true) {
                        i2--;
/* 7 */                 if (i2 < 0) {
/* 89 */                    return;
                        }
/* 9 */                 float f = fArr[i];
                        double d = f;
/* 13 */                double d2 = fArr[i + 1];
/* 28 */                fArr2[i3] = (float) ((this.I00iiO * d2) + (this.I00iOIl * d) + this.I00ilI0I1);
/* 43 */                fArr2[i3 + 1] = (float) ((d2 * this.I00iio) + (d * this.I00iiI) + this.I00ilO0);
/* 45 */                i += 2;
/* 47 */                i3 += 2;
                    }
                }

                public final Object clone() {
                    try {
/* 1 */                 return super.clone();
                    } catch (CloneNotSupportedException unused) {
/* 29 */                throw new InternalError();
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I0i110Oli0) {
/* 10 */                I0i110Oli0 i0i110Oli0 = (I0i110Oli0) obj;
/* 18 */                if (this.I00iOIl == i0i110Oli0.I00iOIl && this.I00iiO == i0i110Oli0.I00iiO && this.I00ilI0I1 == i0i110Oli0.I00ilI0I1 && this.I00iiI == i0i110Oli0.I00iiI && this.I00iio == i0i110Oli0.I00iio && this.I00ilO0 == i0i110Oli0.I00ilO0) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final String toString() {
/* 71 */            return I0i110Oli0.class.getName() + "[[" + this.I00iOIl + ", " + this.I00iiO + ", " + this.I00ilI0I1 + "], [" + this.I00iiI + ", " + this.I00iio + ", " + this.I00ilO0 + "]]";
                }
            }
