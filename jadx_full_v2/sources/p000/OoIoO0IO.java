            package p000;
            
            public final class OoIoO0IO {
                public static OoIoO0IO I0000O;
                public long I00000oIO;
                public long I00000oOI;
                public int I0000Il00O;

                public final void I00000oIO(double d, double d2, long j) {
/* 20 */            double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
/* 74 */            double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
/* 122 */           double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d2) / 360.0d);
/* 137 */           double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
/* 146 */           double d4 = 0.01745329238474369d * d;
/* 175 */           double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d4))) / (Math.cos(dAsin) * Math.cos(d4));
/* 183 */           if (dSin3 >= 1.0d) {
/* 185 */               this.I0000Il00O = 1;
/* 187 */               this.I00000oIO = -1L;
/* 189 */               this.I00000oOI = -1L;
                    } else {
/* 197 */               if (dSin3 <= -1.0d) {
/* 199 */                   this.I0000Il00O = 0;
/* 201 */                   this.I00000oIO = -1L;
/* 203 */                   this.I00000oOI = -1L;
/* 205 */                   return;
                        }
/* 216 */               double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
/* 231 */               this.I00000oIO = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
/* 239 */               long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
/* 240 */               this.I00000oOI = jRound;
/* 244 */               if (jRound >= j || this.I00000oIO <= j) {
/* 255 */                   this.I0000Il00O = 1;
                        } else {
/* 252 */                   this.I0000Il00O = 0;
                        }
                    }
                }
            }
