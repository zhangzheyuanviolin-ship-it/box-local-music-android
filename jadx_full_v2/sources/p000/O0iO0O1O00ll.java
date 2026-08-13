            package p000;
            
            public final class O0iO0O1O00ll extends IOOl0ll {
                public final int I0000O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O0iO0O1O00ll(int i, int i2, long j, String str) {
/* 3 */             super(i, j, str);
/* 1 */             this.I0000O = i2;
                }

                @Override
                public final float I00000oIO(int i) {
                    switch (this.I0000O) {
                        case 0:
                            return i == 0 ? 100.0f : 128.0f;
                        default:
/* 6 */                     return 2.0f;
                    }
                }

                @Override
                public final float I00000oOI(int i) {
                    switch (this.I0000O) {
                        case 0:
                            return i == 0 ? 0.0f : -128.0f;
                        default:
/* 6 */                     return -2.0f;
                    }
                }

                @Override
                public final long I0000O(float f, float f2, float f3) {
                    long jFloatToRawIntBits;
                    long j;
                    switch (this.I0000O) {
                        case 0:
/* 56 */                    if (f < 0.0f) {
/* 58 */                        f = 0.0f;
                            }
/* 63 */                    if (f > 100.0f) {
/* 65 */                        f = 100.0f;
                            }
/* 70 */                    if (f2 < -128.0f) {
/* 72 */                        f2 = -128.0f;
                            }
/* 77 */                    if (f2 > 128.0f) {
/* 79 */                        f2 = 128.0f;
                            }
/* 85 */                    float f4 = (f + 16.0f) / 116.0f;
/* 90 */                    float f5 = (f2 * 0.002f) + f4;
/* 109 */                   float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
/* 120 */                   float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
/* 123 */                   float[] fArr = iIo1Iiloo.I0000oI00;
/* 127 */                   float f8 = f6 * fArr[0];
/* 131 */                   float f9 = f7 * fArr[1];
/* 132 */                   long jFloatToRawIntBits2 = Float.floatToRawIntBits(f8);
/* 137 */                   jFloatToRawIntBits = Float.floatToRawIntBits(f9);
/* 142 */                   j = jFloatToRawIntBits2 << 32;
                            break;
                        default:
/* 17 */                    if (f < -2.0f) {
/* 19 */                        f = -2.0f;
                            }
/* 24 */                    if (f > 2.0f) {
/* 26 */                        f = 2.0f;
                            }
/* 29 */                    if (f2 < -2.0f) {
/* 31 */                        f2 = -2.0f;
                            }
/* 34 */                    float f10 = f2 <= 2.0f ? f2 : 2.0f;
/* 38 */                    long jFloatToRawIntBits3 = Float.floatToRawIntBits(f);
/* 43 */                    jFloatToRawIntBits = Float.floatToRawIntBits(f10);
/* 48 */                    j = jFloatToRawIntBits3 << 32;
                            break;
                    }
/* 51 */            return j | (jFloatToRawIntBits & 4294967295L);
                }

                @Override
                public final float I0000oI00(float f, float f2, float f3) {
                    switch (this.I0000O) {
                        case 0:
/* 24 */                    if (f < 0.0f) {
/* 26 */                        f = 0.0f;
                            }
/* 31 */                    if (f > 100.0f) {
/* 33 */                        f = 100.0f;
                            }
/* 38 */                    if (f3 < -128.0f) {
/* 40 */                        f3 = -128.0f;
                            }
/* 45 */                    if (f3 > 128.0f) {
/* 47 */                        f3 = 128.0f;
                            }
/* 58 */                    float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
/* 83 */                    return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * iIo1Iiloo.I0000oI00[2];
                        default:
/* 10 */                    if (f3 < -2.0f) {
/* 12 */                        f3 = -2.0f;
                            }
/* 17 */                    if (f3 > 2.0f) {
/* 13 */                        return 2.0f;
                            }
/* 20 */                    return f3;
                    }
                }

                @Override
                public final long I0001Ioi1lo(float f, float f2, float f3, float f4, IOOl0ll iOOl0ll) {
                    switch (this.I0000O) {
                        case 0:
/* 47 */                    float[] fArr = iIo1Iiloo.I0000oI00;
/* 51 */                    float f5 = f / fArr[0];
/* 55 */                    float f6 = f2 / fArr[1];
/* 59 */                    float f7 = f3 / fArr[2];
/* 81 */                    float fCbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
/* 94 */                    float fCbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
/* 107 */                   float fCbrt3 = f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
/* 114 */                   float f8 = (116.0f * fCbrt2) - 16.0f;
/* 118 */                   float f9 = (fCbrt - fCbrt2) * 500.0f;
/* 122 */                   float f10 = (fCbrt2 - fCbrt3) * 200.0f;
/* 126 */                   if (f8 < 0.0f) {
/* 128 */                       f8 = 0.0f;
                            }
/* 133 */                   if (f8 > 100.0f) {
/* 135 */                       f8 = 100.0f;
                            }
/* 140 */                   if (f9 < -128.0f) {
/* 142 */                       f9 = -128.0f;
                            }
/* 147 */                   if (f9 > 128.0f) {
/* 149 */                       f9 = 128.0f;
                            }
/* 152 */                   if (f10 < -128.0f) {
/* 154 */                       f10 = -128.0f;
                            }
/* 161 */                   return iiO01ll11o1l.I00000oIO(f8, f9, f10 <= 128.0f ? f10 : 128.0f, f4, iOOl0ll);
                        default:
/* 10 */                    if (f < -2.0f) {
/* 12 */                        f = -2.0f;
                            }
/* 17 */                    if (f > 2.0f) {
/* 19 */                        f = 2.0f;
                            }
/* 22 */                    if (f2 < -2.0f) {
/* 24 */                        f2 = -2.0f;
                            }
/* 27 */                    if (f2 > 2.0f) {
/* 29 */                        f2 = 2.0f;
                            }
/* 32 */                    if (f3 < -2.0f) {
/* 34 */                        f3 = -2.0f;
                            }
/* 41 */                    return iiO01ll11o1l.I00000oIO(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, iOOl0ll);
                    }
                }
            }
