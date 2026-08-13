            package p000;
            
            public final class Ii0i0o1lliO1 implements IioIllI11l0I {
                public final float I00iOIl;
                public final float I00iiI;
                public final float I00iiO;
                public final float I00iio;
                public final float I00ilI0I1;
                public final float I00ilO0;

                public Ii0i0o1lliO1(float f, float f2, float f3, float f4) {
                    int iI00000oIO;
/* 14 */            this.I00iOIl = f;
/* 16 */            this.I00iiI = f2;
/* 18 */            this.I00iiO = f3;
/* 20 */            this.I00iio = f4;
/* 51 */            if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
/* 57 */                StringBuilder sbI00100l0 = IlIi0I0.I00100l0("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f, ", ", f2, ", ");
/* 61 */                sbI00100l0.append(f3);
/* 64 */                sbI00100l0.append(", ");
/* 67 */                sbI00100l0.append(f4);
/* 72 */                sbI00100l0.append(".");
/* 79 */                OO1olIl.I00000oIO(sbI00100l0.toString());
                    }
/* 83 */            float[] fArr = new float[5];
/* 90 */            float f5 = (f2 - 0.0f) * 3.0f;
/* 93 */            float f6 = (f4 - f2) * 3.0f;
/* 98 */            float f7 = (1.0f - f4) * 3.0f;
                    double d = f5;
                    double d2 = f6;
                    double d3 = f7;
/* 108 */           double d4 = d2 * 2.0d;
/* 112 */           double d5 = (d - d4) + d3;
/* 118 */           if (d5 == 0.0d) {
/* 135 */               iI00000oIO = d2 == d3 ? 0 : iOOoil.I00000oIO((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
                    } else {
/* 149 */               double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
/* 151 */               double d7 = (-d) + d2;
/* 158 */               int iI00000oIO2 = iOOoil.I00000oIO((float) ((-(d6 + d7)) / d5), fArr, 0);
/* 170 */               int iI00000oIO3 = iOOoil.I00000oIO((float) ((d6 - d7) / d5), fArr, iI00000oIO2) + iI00000oIO2;
/* 171 */               if (iI00000oIO3 > 1) {
/* 173 */                   float f8 = fArr[0];
/* 175 */                   float f9 = fArr[1];
/* 179 */                   if (f8 > f9) {
/* 181 */                       fArr[0] = f9;
/* 183 */                       fArr[1] = f8;
                            } else if (f8 == f9) {
                                iI00000oIO = iI00000oIO3 - 1;
                            }
/* 185 */                   iI00000oIO = iI00000oIO3;
                        } else {
/* 185 */                   iI00000oIO = iI00000oIO3;
                        }
                    }
/* 197 */           float f10 = (f6 - f5) * 2.0f;
/* 208 */           int iI00000oIO4 = iOOoil.I00000oIO((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, iI00000oIO) + iI00000oIO;
/* 209 */           float fMin = Math.min(0.0f, 1.0f);
/* 213 */           float fMax = Math.max(0.0f, 1.0f);
/* 217 */           for (int i = 0; i < iI00000oIO4; i++) {
/* 219 */               float f11 = fArr[i];
/* 239 */               float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - 0.0f) * f11) + (((f4 - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
/* 240 */               fMin = Math.min(fMin, f12);
/* 244 */               fMax = Math.max(fMax, f12);
                    }
/* 270 */           long jFloatToRawIntBits = (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
/* 278 */           this.I00ilI0I1 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
/* 286 */           this.I00ilO0 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r3
                  0x0092: PHI (r3v27 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v31 float), (r3v36 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[PHI: r12
                  0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final float I00000oIO(float f) {
                    float f2;
/* 8 */             if (f <= 0.0f || f >= 1.0f) {
/* 3 */                 return f;
                    }
/* 18 */            float fMax = Math.max(f, 1.1920929E-7f);
/* 24 */            float f3 = this.I00iOIl;
/* 28 */            float f4 = this.I00iiO;
/* 30 */            float f5 = f4 - fMax;
/* 22 */            double d = 0.0f - fMax;
/* 41 */            float f6 = 0.0f;
/* 49 */            double d2 = ((d - ((f3 - fMax) * 2.0d)) + f5) * 3.0d;
/* 55 */            double d3 = (r7 - r5) * 3.0d;
/* 69 */            double d4 = ((r7 - f5) * 3.0d) + (-r5) + (1.0f - fMax);
/* 90 */            float f7 = Float.NaN;
/* 92 */            if (Math.abs(d4 - 0.0d) >= 1.0E-7d) {
/* 234 */               double d5 = d2 / d4;
/* 236 */               double d6 = d3 / d4;
/* 237 */               double d7 = d / d4;
/* 246 */               double d8 = ((d6 * 3.0d) - (d5 * d5)) / 9.0d;
/* 267 */               double d9 = ((d7 * 27.0d) + ((((2.0d * d5) * d5) * d5) - ((9.0d * d5) * d6))) / 54.0d;
/* 272 */               double d10 = d8 * d8 * d8;
/* 274 */               double d11 = (d9 * d9) + d10;
/* 277 */               double d12 = d5 / 3.0d;
/* 281 */               if (d11 < 0.0d) {
/* 284 */                   double dSqrt = Math.sqrt(-d10);
/* 289 */                   double d13 = (-d9) / dSqrt;
/* 294 */                   if (d13 < -1.0d) {
/* 296 */                       d13 = -1.0d;
                            }
/* 301 */                   if (d13 > 1.0d) {
/* 303 */                       d13 = 1.0d;
                            }
/* 304 */                   double dAcos = Math.acos(d13);
/* 313 */                   double dI00000oIO = l1I1Il.I00000oIO((float) dSqrt) * 2.0f;
/* 323 */                   float fCos = (float) ((Math.cos(dAcos / 3.0d) * dI00000oIO) - d12);
/* 331 */                   float f8 = fCos < 0.0f ? 0.0f : fCos;
/* 334 */                   if (f8 > 1.0f) {
/* 336 */                       f8 = 1.0f;
                            }
/* 346 */                   if (Math.abs(f8 - fCos) > 1.05E-6f) {
/* 348 */                       f8 = Float.NaN;
                            }
/* 353 */                   if (Float.isNaN(f8)) {
/* 372 */                       float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dI00000oIO) - d12);
/* 380 */                       f8 = fCos2 < 0.0f ? 0.0f : fCos2;
/* 383 */                       if (f8 > 1.0f) {
/* 385 */                           f8 = 1.0f;
                                }
/* 395 */                       if (Math.abs(f8 - fCos2) > 1.05E-6f) {
/* 397 */                           f8 = Float.NaN;
                                }
/* 402 */                       if (Float.isNaN(f8)) {
/* 419 */                           float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dI00000oIO) - d12);
/* 422 */                           if (fCos3 >= 0.0f) {
/* 425 */                               f6 = fCos3;
                                    }
/* 434 */                           f2 = f6 > 1.0f ? 1.0f : f6;
/* 444 */                           if (Math.abs(f2 - fCos3) <= 1.05E-6f) {
                                    }
                                }
                            } else {
/* 355 */                       f7 = f8;
                            }
                        } else if (d11 == 0.0d) {
/* 455 */                   float f9 = -l1I1Il.I00000oIO((float) d9);
/* 458 */                   float f10 = (float) d12;
/* 459 */                   float f11 = (f9 * 2.0f) - f10;
/* 467 */                   float f12 = f11 < 0.0f ? 0.0f : f11;
/* 470 */                   if (f12 > 1.0f) {
/* 472 */                       f12 = 1.0f;
                            }
/* 482 */                   if (Math.abs(f12 - f11) > 1.05E-6f) {
/* 484 */                       f12 = Float.NaN;
                            }
/* 489 */                   if (Float.isNaN(f12)) {
/* 494 */                       float f13 = (-f9) - f10;
/* 497 */                       if (f13 >= 0.0f) {
/* 500 */                           f6 = f13;
                                }
/* 509 */                       f2 = f6 > 1.0f ? 1.0f : f6;
/* 519 */                       if (Math.abs(f2 - f13) <= 1.05E-6f) {
                                }
                            } else {
/* 491 */                       f7 = f12;
                            }
                        } else {
/* 522 */                   double dSqrt2 = Math.sqrt(d11);
/* 542 */                   float fI00000oIO = (float) ((l1I1Il.I00000oIO((float) ((-d9) + dSqrt2)) - l1I1Il.I00000oIO((float) (d9 + dSqrt2))) - d12);
/* 545 */                   if (fI00000oIO >= 0.0f) {
/* 548 */                       f6 = fI00000oIO;
                            }
/* 557 */                   f2 = f6 > 1.0f ? 1.0f : f6;
/* 567 */                   if (Math.abs(f2 - fI00000oIO) <= 1.05E-6f) {
                            }
                        }
                    } else if (Math.abs(d2 - 0.0d) >= 1.0E-7d) {
/* 158 */               double dSqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
/* 162 */               double d14 = d2 * 2.0d;
/* 167 */               float f14 = (float) ((dSqrt3 - d3) / d14);
/* 175 */               float f15 = f14 < 0.0f ? 0.0f : f14;
/* 178 */               if (f15 > 1.0f) {
/* 180 */                   f15 = 1.0f;
                        }
/* 190 */               if (Math.abs(f15 - f14) > 1.05E-6f) {
/* 192 */                   f15 = Float.NaN;
                        }
/* 197 */               if (Float.isNaN(f15)) {
/* 205 */                   float f16 = (float) (((-d3) - dSqrt3) / d14);
/* 208 */                   if (f16 >= 0.0f) {
/* 211 */                       f6 = f16;
                            }
/* 220 */                   f2 = f6 > 1.0f ? 1.0f : f6;
/* 230 */                   if (Math.abs(f2 - f16) <= 1.05E-6f) {
                            }
                        } else {
/* 199 */                   f7 = f15;
                        }
                    } else if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
/* 118 */               float f17 = (float) ((-d) / d3);
/* 121 */               if (f17 >= 0.0f) {
/* 124 */                   f6 = f17;
                        }
/* 133 */               f2 = f6 > 1.0f ? 1.0f : f6;
/* 143 */               if (Math.abs(f2 - f17) <= 1.05E-6f) {
/* 147 */                   f7 = f2;
                        }
                    }
/* 569 */           boolean zIsNaN = Float.isNaN(f7);
/* 573 */           float f18 = this.I00iio;
/* 575 */           float f19 = this.I00iiI;
/* 577 */           if (!zIsNaN) {
/* 594 */               float f20 = ((((((f19 - f18) + 0.33333334f) * f7) + (f18 - (2.0f * f19))) * f7) + f19) * 3.0f * f7;
/* 595 */               float f21 = this.I00ilI0I1;
/* 599 */               if (f20 < f21) {
/* 601 */                   f20 = f21;
                        }
/* 602 */               float f22 = this.I00ilO0;
                        return f20 > f22 ? f22 : f20;
                    }
/* 616 */           StringBuilder sbI00100l0 = IlIi0I0.I00100l0("The cubic curve with parameters (", f3, ", ", f19, ", ");
/* 620 */           sbI00100l0.append(f4);
/* 623 */           sbI00100l0.append(", ");
/* 626 */           sbI00100l0.append(f18);
/* 631 */           sbI00100l0.append(") has no solution at ");
/* 634 */           sbI00100l0.append(f);
/* 644 */           throw new IllegalArgumentException(sbI00100l0.toString());
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Ii0i0o1lliO1)) {
/* 41 */                return false;
                    }
/* 5 */             Ii0i0o1lliO1 ii0i0o1lliO1 = (Ii0i0o1lliO1) obj;
                    return this.I00iOIl == ii0i0o1lliO1.I00iOIl && this.I00iiI == ii0i0o1lliO1.I00iiI && this.I00iiO == ii0i0o1lliO1.I00iiO && this.I00iio == ii0i0o1lliO1.I00iio;
                }

                public final int hashCode() {
/* 28 */            return Float.hashCode(this.I00iio) + OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I00iOIl) * 31, 31, this.I00iiI), 31, this.I00iiO);
                }

                public final String toString() {
/* 11 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("CubicBezierEasing(a=", this.I00iOIl, ", b=", this.I00iiI, ", c=");
/* 17 */            sbI00100l0.append(this.I00iiO);
/* 22 */            sbI00100l0.append(", d=");
/* 27 */            sbI00100l0.append(this.I00iio);
/* 32 */            sbI00100l0.append(")");
/* 35 */            return sbI00100l0.toString();
                }
            }
