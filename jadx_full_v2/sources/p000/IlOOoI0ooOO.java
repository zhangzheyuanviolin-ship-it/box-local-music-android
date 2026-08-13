            package p000;
            
/* 58 */    public final class IlOOoI0ooOO implements IlOO1o00IOi {
                public final float I00000oIO;
                public final OlIOi1loO0oO I00000oOI;

                public IlOOoI0ooOO(float f, float f2, float f3) {
/* 4 */             this.I00000oIO = f3;
/* 8 */             OlIOi1loO0oO olIOi1loO0oO = new OlIOi1loO0oO();
/* 13 */            olIOi1loO0oO.I00000oIO = 1.0f;
/* 21 */            olIOi1loO0oO.I00000oOI = Math.sqrt(50.0d);
/* 23 */            olIOi1loO0oO.I0000Il00O = 1.0f;
/* 28 */            if (f < 0.0f) {
/* 32 */                OO1olIl.I00000oIO("Damping ratio must be non-negative");
                    }
/* 35 */            olIOi1loO0oO.I0000Il00O = f;
/* 37 */            double d = olIOi1loO0oO.I00000oOI;
/* 43 */            if (((float) (d * d)) <= 0.0f) {
/* 47 */                OO1olIl.I00000oIO("Spring stiffness constant must be positive.");
                    }
/* 55 */            olIOi1loO0oO.I00000oOI = Math.sqrt(f2);
/* 57 */            this.I00000oOI = olIOi1loO0oO;
                }

                @Override
                public final float I00000oOI(long j, float f, float f2, float f3) {
/* 5 */             OlIOi1loO0oO olIOi1loO0oO = this.I00000oOI;
/* 7 */             olIOi1loO0oO.I00000oIO = f2;
/* 20 */            return Float.intBitsToFloat((int) (olIOi1loO0oO.I00000oIO(f, f3, j / 1000000) & 4294967295L));
                }

                /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long I0000Il00O(float f, float f2, float f3) {
                    double dLog;
                    long j;
                    double d;
/* 3 */             OlIOi1loO0oO olIOi1loO0oO = this.I00000oOI;
/* 5 */             double d2 = olIOi1loO0oO.I00000oOI;
/* 8 */             float f4 = (float) (d2 * d2);
/* 9 */             float f5 = olIOi1loO0oO.I0000Il00O;
/* 13 */            float f6 = this.I00000oIO;
/* 15 */            float f7 = (f - f2) / f6;
/* 16 */            float f8 = f3 / f6;
/* 21 */            if (f5 == 0.0f) {
/* 23 */                j = 9223372036854L;
                    } else {
                        double d3 = f4;
                        double d4 = f5;
                        double d5 = f8;
                        double d6 = f7;
/* 42 */                double dSqrt = Math.sqrt(d3) * d4 * 2.0d;
/* 49 */                double d7 = (dSqrt * dSqrt) - (d3 * 4.0d);
/* 59 */                double dSqrt2 = d7 < 0.0d ? 0.0d : Math.sqrt(d7);
/* 75 */                double d8 = -dSqrt;
/* 80 */                double d9 = (d8 + dSqrt2) * 0.5d;
/* 82 */                double dSqrt3 = (d7 < 0.0d ? Math.sqrt(Math.abs(d7)) : 0.0d) * 0.5d;
/* 86 */                double d10 = (d8 - dSqrt2) * 0.5d;
/* 90 */                if (d6 == 0.0d && d5 == 0.0d) {
/* 96 */                    j = 0;
                        } else {
/* 100 */                   if (d6 < 0.0d) {
/* 102 */                       d5 = -d5;
                            }
/* 103 */                   double dAbs = Math.abs(d6);
/* 107 */                   double d11 = 1.0d;
/* 111 */                   double d12 = -1.0d;
/* 120 */                   double dAbs2 = Double.MAX_VALUE;
/* 134 */                   if (d4 > 1.0d) {
/* 138 */                       double d13 = (d9 * dAbs) - d5;
/* 139 */                       double d14 = d9 - d10;
/* 141 */                       double d15 = d13 / d14;
/* 142 */                       double d16 = dAbs - d15;
/* 153 */                       dLog = Math.log(Math.abs(1.0d / d16)) / d9;
/* 165 */                       double dLog2 = Math.log(Math.abs(1.0d / d15)) / d10;
/* 174 */                       if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
/* 191 */                           dLog = dLog2;
                                } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
/* 186 */                           dLog = Math.max(dLog, dLog2);
                                }
/* 192 */                       double d17 = d16 * d9;
/* 206 */                       double dLog3 = Math.log(d17 / ((-d15) * d10)) / (d10 - d9);
/* 212 */                       if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
/* 257 */                           d11 = -1.0d;
/* 280 */                           d = d15 * d10;
/* 303 */                           if (Math.abs((Math.exp(d10 * dLog) * d) + (Math.exp(d9 * dLog) * d17)) >= 1.0E-4d) {
/* 307 */                               int i = 0;
/* 311 */                               while (dAbs2 > 0.001d && i < 100) {
/* 315 */                                   i++;
/* 317 */                                   double d18 = d9 * dLog;
/* 325 */                                   double d19 = d10 * dLog;
/* 352 */                                   double dExp = dLog - ((((Math.exp(d19) * d15) + (Math.exp(d18) * d16)) + d11) / ((Math.exp(d19) * d) + (Math.exp(d18) * d17)));
/* 355 */                                   dAbs2 = Math.abs(dLog - dExp);
/* 359 */                                   dLog = dExp;
                                        }
                                    }
                                } else {
/* 221 */                           if (dLog3 > 0.0d) {
/* 242 */                               if ((-((Math.exp(dLog3 * d10) * d15) + (Math.exp(d9 * dLog3) * d16))) < 1.0d) {
/* 255 */                                   dLog = (d15 <= 0.0d || d16 >= 0.0d) ? dLog : 0.0d;
/* 257 */                                   d11 = -1.0d;
/* 280 */                                   d = d15 * d10;
/* 303 */                                   if (Math.abs((Math.exp(d10 * dLog) * d) + (Math.exp(d9 * dLog) * d17)) >= 1.0E-4d) {
                                            }
                                        }
                                    }
/* 271 */                           dLog = Math.log((-((d15 * d10) * d10)) / (d17 * d9)) / d14;
/* 280 */                           d = d15 * d10;
/* 303 */                           if (Math.abs((Math.exp(d10 * dLog) * d) + (Math.exp(d9 * dLog) * d17)) >= 1.0E-4d) {
                                    }
                                }
                            } else if (d4 < 1.0d) {
/* 370 */                       double d20 = (d5 - (d9 * dAbs)) / dSqrt3;
/* 384 */                       dLog = Math.log(1.0d / Math.sqrt((d20 * d20) + (dAbs * dAbs))) / d9;
                            } else {
/* 388 */                       double d21 = d9 * dAbs;
/* 390 */                       double d22 = d5 - d21;
/* 401 */                       double dLog4 = Math.log(Math.abs(1.0d / dAbs)) / d9;
/* 409 */                       double dLog5 = Math.log(Math.abs(1.0d / d22));
/* 415 */                       double dLog6 = dLog5;
/* 419 */                       for (int i2 = 0; i2 < 6; i2++) {
/* 431 */                           dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d9));
                                }
/* 436 */                       double d23 = dLog6 / d9;
/* 446 */                       if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
/* 463 */                           dLog4 = d23;
                                } else if ((Double.doubleToRawLongBits(d23) & Long.MAX_VALUE) < 9218868437227405312L) {
/* 458 */                           dLog4 = Math.max(dLog4, d23);
                                }
/* 469 */                       double d24 = (-(d21 + d22)) / (d9 * d22);
/* 470 */                       double d25 = d9 * d24;
/* 485 */                       double dExp2 = (Math.exp(d25) * d22 * d24) + (Math.exp(d25) * dAbs);
/* 490 */                       if (!Double.isNaN(d24) && d24 > 0.0d) {
/* 499 */                           if (d24 <= 0.0d || (-dExp2) >= 1.0d) {
/* 525 */                               dLog4 = (-(2.0d / d9)) - (dAbs / d22);
/* 526 */                               d12 = 1.0d;
                                    } else {
/* 517 */                               dLog4 = (d22 >= 0.0d || dAbs <= 0.0d) ? dLog4 : 0.0d;
                                    }
                                }
/* 528 */                       dLog = dLog4;
/* 529 */                       int i3 = 0;
/* 533 */                       while (dAbs2 > 0.001d && i3 < 100) {
/* 537 */                           i3++;
/* 542 */                           double d26 = d9 * dLog;
/* 561 */                           double dExp3 = dLog - (((Math.exp(d26) * ((d22 * dLog) + dAbs)) + d12) / (Math.exp(d26) * (((d26 + 1.0d) * d22) + d21)));
/* 564 */                           dAbs2 = Math.abs(dLog - dExp3);
/* 568 */                           dLog = dExp3;
                                }
                            }
/* 576 */                   j = (long) (dLog * 1000.0d);
                        }
                    }
/* 580 */           return j * 1000000;
                }

                @Override
                public final float I0000O(float f, float f2, float f3) {
/* 1 */             return 0.0f;
                }

                @Override
                public final float I0000oI00(long j, float f, float f2, float f3) {
/* 5 */             OlIOi1loO0oO olIOi1loO0oO = this.I00000oOI;
/* 7 */             olIOi1loO0oO.I00000oIO = f2;
/* 17 */            return Float.intBitsToFloat((int) (olIOi1loO0oO.I00000oIO(f, f3, j / 1000000) >> 32));
                }

/* 59 */        public IlOOoI0ooOO(float f, float f2) {
/* 60 */            this(f, f2, 0.01f);
                }
            }
