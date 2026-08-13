            package p000;
            
            public final class OlIOi1loO0oO {
                public float I00000oIO;
                public double I00000oOI;
                public float I0000Il00O;

                public final long I00000oIO(float f, float f2, long j) {
                    double dSin;
                    double dCos;
                    double dExp;
                    double dExp2;
/* 7 */             float f3 = f - this.I00000oIO;
/* 17 */            double d = j / 1000.0d;
/* 18 */            float f4 = this.I0000Il00O;
/* 22 */            double d2 = f4 * f4;
/* 25 */            double d3 = this.I00000oOI;
/* 27 */            double d4 = (-f4) * d3;
/* 34 */            if (f4 > 1.0f) {
/* 41 */                double dSqrt = Math.sqrt(d2 - 1.0d) * d3;
/* 42 */                double d5 = d4 + dSqrt;
/* 44 */                double d6 = d4 - dSqrt;
                        double d7 = f3;
/* 52 */                double d8 = ((d6 * d7) - f2) / (d6 - d5);
/* 53 */                double d9 = d7 - d8;
/* 54 */                double d10 = d6 * d;
/* 61 */                double d11 = d * d5;
/* 68 */                dSin = (Math.exp(d11) * d8) + (Math.exp(d10) * d9);
/* 75 */                dExp = Math.exp(d10) * d9 * d6;
/* 81 */                dExp2 = Math.exp(d11) * d8 * d5;
                    } else {
/* 86 */                if (f4 != 1.0f) {
/* 124 */                   double dSqrt2 = Math.sqrt(1.0d - d2) * d3;
                            double d12 = f3;
/* 131 */                   double d13 = (((-d4) * d12) + f2) * (1.0d / dSqrt2);
/* 132 */                   double d14 = dSqrt2 * d;
/* 134 */                   double d15 = d * d4;
/* 153 */                   dSin = ((Math.sin(d14) * d13) + (Math.cos(d14) * d12)) * Math.exp(d15);
/* 176 */                   dCos = (((Math.cos(d14) * dSqrt2 * d13) + (Math.sin(d14) * (-dSqrt2) * d12)) * Math.exp(d15)) + (d4 * dSin);
/* 204 */                   return (Float.floatToRawIntBits((float) dCos) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + this.I00000oIO)) << 32);
                        }
                        double d16 = f3;
/* 92 */                double d17 = (d3 * d16) + f2;
/* 94 */                double d18 = (-d3) * d;
/* 96 */                double d19 = (d * d17) + d16;
/* 101 */               dSin = Math.exp(d18) * d19;
/* 111 */               dExp = Math.exp(d18) * d19 * (-this.I00000oOI);
/* 116 */               dExp2 = Math.exp(d18) * d17;
                    }
/* 82 */            dCos = dExp2 + dExp;
/* 204 */           return (Float.floatToRawIntBits((float) dCos) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + this.I00000oIO)) << 32);
                }
            }
