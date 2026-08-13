            package p000;
            
            public final class OlIOOlill1o {
                public double I0000O;
                public double I0000oI00;
                public double I0001Ioi1lo;
                public double I000II;
                public double I000O01llI0;
                public double I00000oIO = Math.sqrt(1500.0d);
                public double I00000oOI = 0.5d;
                public boolean I0000Il00O = false;
                public double I000OOo1O = Double.MAX_VALUE;
                public Iio1o1I I000OiO = new Iio1o1I();

                public final Iio1o1I I00000oIO(double d, double d2, long j) {
                    double dSin;
                    double dCos;
/* 7 */             if (!this.I0000Il00O) {
/* 21 */                if (this.I000OOo1O == Double.MAX_VALUE) {
/* 291 */                   I000II.I001IO000("Error: Final position of the spring must be set before the animation starts");
/* 294 */                   return null;
                        }
/* 23 */                double d3 = this.I00000oOI;
/* 27 */                if (d3 > 1.0d) {
/* 30 */                    double d4 = this.I00000oIO;
/* 41 */                    this.I0001Ioi1lo = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
/* 43 */                    double d5 = this.I00000oOI;
/* 46 */                    double d6 = this.I00000oIO;
/* 57 */                    this.I000II = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
                        } else if (d3 >= 0.0d && d3 < 1.0d) {
/* 80 */                    this.I000O01llI0 = Math.sqrt(1.0d - (d3 * d3)) * this.I00000oIO;
                        }
/* 83 */                this.I0000Il00O = true;
                    }
/* 92 */            double d7 = j / 1000.0d;
/* 95 */            double d8 = d - this.I000OOo1O;
/* 97 */            double d9 = this.I00000oOI;
/* 106 */           if (d9 > 1.0d) {
/* 108 */               double d10 = this.I000II;
/* 118 */               double d11 = ((d10 * d8) - d2) / (d10 - this.I0001Ioi1lo);
/* 119 */               double d12 = d8 - d11;
/* 134 */               dSin = (Math.pow(2.718281828459045d, this.I0001Ioi1lo * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
/* 135 */               double d13 = this.I000II;
/* 143 */               double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
/* 144 */               double d14 = this.I0001Ioi1lo;
/* 153 */               dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
                    } else if (d9 == 1.0d) {
/* 158 */               double d15 = this.I00000oIO;
/* 162 */               double d16 = (d15 * d8) + d2;
/* 166 */               double d17 = (d16 * d7) + d8;
/* 173 */               double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
/* 182 */               double dPow3 = Math.pow(2.718281828459045d, (-this.I00000oIO) * d7) * d17;
/* 185 */               double d18 = -this.I00000oIO;
/* 193 */               dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
/* 194 */               dSin = dPow2;
                    } else {
/* 198 */               double d19 = 1.0d / this.I000O01llI0;
/* 199 */               double d20 = this.I00000oIO;
/* 206 */               double d21 = ((d9 * d20 * d8) + d2) * d19;
/* 231 */               dSin = ((Math.sin(this.I000O01llI0 * d7) * d21) + (Math.cos(this.I000O01llI0 * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
/* 232 */               double d22 = this.I00000oIO;
/* 236 */               double d23 = this.I00000oOI;
/* 238 */               double d24 = (-d22) * dSin * d23;
/* 247 */               double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
/* 251 */               double d25 = this.I000O01llI0;
/* 262 */               double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
/* 263 */               double d26 = this.I000O01llI0;
/* 275 */               dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
                    }
/* 277 */           Iio1o1I iio1o1I = this.I000OiO;
/* 283 */           iio1o1I.I00iOIl = (float) (dSin + this.I000OOo1O);
/* 286 */           iio1o1I.I00iiI = (float) dCos;
/* 288 */           return iio1o1I;
                }
            }
