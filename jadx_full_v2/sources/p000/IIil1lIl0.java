            package p000;

            import android.graphics.Color;
            
            public final class IIil1lIl0 {
                public final float I00000oIO;
                public final float I00000oOI;
                public final float I0000Il00O;
                public final float I0000O;
                public final float I0000oI00;
                public final float I0001Ioi1lo;

                public IIil1lIl0(float f, float f2, float f3, float f4, float f5, float f6) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
/* 8 */             this.I0000Il00O = f3;
/* 10 */            this.I0000O = f4;
/* 12 */            this.I0000oI00 = f5;
/* 14 */            this.I0001Ioi1lo = f6;
                }

                public static IIil1lIl0 I00000oIO(int i) {
/* 1 */             OooloIO0I0 oooloIO0I0 = OooloIO0I0.I000iOII;
/* 7 */             float fI00000oOI = i1Ioli1II.I00000oOI(Color.red(i));
/* 15 */            float fI00000oOI2 = i1Ioli1II.I00000oOI(Color.green(i));
/* 23 */            float fI00000oOI3 = i1Ioli1II.I00000oOI(Color.blue(i));
/* 27 */            float[][] fArr = i1Ioli1II.I0000O;
/* 30 */            float[] fArr2 = fArr[0];
/* 44 */            float f = (fArr2[2] * fI00000oOI3) + (fArr2[1] * fI00000oOI2) + (fArr2[0] * fI00000oOI);
/* 45 */            float[] fArr3 = fArr[1];
/* 57 */            float f2 = (fArr3[2] * fI00000oOI3) + (fArr3[1] * fI00000oOI2) + (fArr3[0] * fI00000oOI);
/* 58 */            float[] fArr4 = fArr[2];
/* 70 */            float f3 = (fI00000oOI3 * fArr4[2]) + (fI00000oOI2 * fArr4[1]) + (fI00000oOI * fArr4[0]);
/* 71 */            float[][] fArr5 = i1Ioli1II.I00000oIO;
/* 73 */            float[] fArr6 = fArr5[0];
/* 85 */            float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
/* 86 */            float[] fArr7 = fArr5[1];
/* 98 */            float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
/* 99 */            float[] fArr8 = fArr5[2];
/* 111 */           float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
/* 112 */           float[] fArr9 = oooloIO0I0.I000II;
/* 114 */           float f7 = oooloIO0I0.I000OOo1O;
/* 116 */           float f8 = oooloIO0I0.I0000O;
/* 118 */           float f9 = oooloIO0I0.I00000oIO;
/* 122 */           float f10 = fArr9[0] * f4;
/* 125 */           float f11 = fArr9[1] * f5;
/* 128 */           float f12 = fArr9[2] * f6;
/* 129 */           float f13 = oooloIO0I0.I000O01llI0;
/* 149 */           float fPow = (float) Math.pow((Math.abs(f10) * f13) / 100.0d, 0.42d);
/* 161 */           float fPow2 = (float) Math.pow((Math.abs(f11) * f13) / 100.0d, 0.42d);
/* 174 */           float fPow3 = (float) Math.pow((Math.abs(f12) * f13) / 100.0d, 0.42d);
/* 187 */           float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
/* 195 */           float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
/* 203 */           float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
                    double d = fSignum3;
/* 218 */           float f14 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d)) / 11.0f;
/* 229 */           float f15 = ((float) ((fSignum + fSignum2) - (d * 2.0d))) / 9.0f;
/* 234 */           float f16 = fSignum2 * 20.0f;
/* 240 */           float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
/* 246 */           float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
/* 262 */           float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
/* 268 */           if (fAtan2 < 0.0f) {
/* 270 */               fAtan2 += 360.0f;
                    } else if (fAtan2 >= 360.0f) {
/* 276 */               fAtan2 -= 360.0f;
                    }
/* 278 */           float f19 = (3.1415927f * fAtan2) / 180.0f;
/* 297 */           float fPow4 = ((float) Math.pow((f18 * oooloIO0I0.I00000oOI) / f9, oooloIO0I0.I000OiO * f8)) * 100.0f;
/* 301 */           Math.sqrt(fPow4 / 100.0f);
/* 306 */           float f20 = f9 + 4.0f;
/* 425 */           float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, oooloIO0I0.I0001Ioi1lo), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oooloIO0I0.I0000oI00) * oooloIO0I0.I0000Il00O) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
/* 432 */           Math.sqrt((r0 * f8) / f20);
/* 446 */           float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
/* 462 */           float fLog = ((float) Math.log((f7 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
                    double d2 = f19;
/* 484 */           return new IIil1lIl0(fAtan2, fPow5, fPow4, f21, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
                }

                public static IIil1lIl0 I00000oOI(float f, float f2, float f3) {
/* 1 */             OooloIO0I0 oooloIO0I0 = OooloIO0I0.I000iOII;
/* 3 */             float f4 = oooloIO0I0.I0000O;
/* 9 */             Math.sqrt(f / 100.0d);
/* 16 */            float f5 = oooloIO0I0.I00000oIO + 4.0f;
/* 19 */            float f6 = oooloIO0I0.I000OOo1O * f2;
/* 32 */            Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * oooloIO0I0.I0000O) / f5);
/* 53 */            float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
/* 73 */            float fLog = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
/* 41 */            double d = (3.1415927f * f3) / 180.0f;
/* 94 */            return new IIil1lIl0(f3, f2, f, f7, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0000Il00O(OooloIO0I0 oooloIO0I0) {
                    float fSqrt;
/* 5 */             float f = this.I00000oOI;
                    double d = f;
/* 14 */            float f2 = this.I0000Il00O;
/* 16 */            if (d != 0.0d) {
                        double d2 = f2;
/* 32 */                fSqrt = d2 == 0.0d ? 0.0f : f / ((float) Math.sqrt(d2 / 100.0d));
                    }
/* 34 */            float f3 = oooloIO0I0.I0001Ioi1lo;
/* 36 */            float f4 = oooloIO0I0.I000O01llI0;
/* 73 */            float fPow = (float) Math.pow(fSqrt / Math.pow(1.64d - Math.pow(0.29d, f3), 0.73d), 1.1111111111111112d);
/* 82 */            double d3 = (this.I00000oIO * 3.1415927f) / 180.0f;
/* 100 */           float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
/* 121 */           float fPow2 = oooloIO0I0.I00000oIO * ((float) Math.pow(f2 / 100.0d, (1.0d / oooloIO0I0.I0000O) / oooloIO0I0.I000OiO));
/* 131 */           float f5 = fCos * 3846.1538f * oooloIO0I0.I0000oI00 * oooloIO0I0.I0000Il00O;
/* 134 */           float f6 = fPow2 / oooloIO0I0.I00000oOI;
/* 139 */           float fSin = (float) Math.sin(d3);
/* 144 */           float fCos2 = (float) Math.cos(d3);
/* 164 */           float f7 = (((0.305f + f6) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f5 * 23.0f)));
/* 165 */           float f8 = fCos2 * f7;
/* 166 */           float f9 = f7 * fSin;
/* 169 */           float f10 = f6 * 460.0f;
/* 182 */           float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
/* 194 */           float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
/* 204 */           float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
/* 237 */           float f14 = 100.0f / f4;
/* 250 */           float fSignum = Math.signum(f11) * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
/* 283 */           float fSignum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
/* 314 */           float fSignum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
/* 315 */           float[] fArr = oooloIO0I0.I000II;
/* 320 */           float f15 = fSignum / fArr[0];
/* 324 */           float f16 = fSignum2 / fArr[1];
/* 328 */           float f17 = fSignum3 / fArr[2];
/* 329 */           float[][] fArr2 = i1Ioli1II.I00000oOI;
/* 331 */           float[] fArr3 = fArr2[0];
/* 343 */           float f18 = (fArr3[2] * f17) + (fArr3[1] * f16) + (fArr3[0] * f15);
/* 344 */           float[] fArr4 = fArr2[1];
/* 356 */           float f19 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
/* 357 */           float[] fArr5 = fArr2[2];
/* 373 */           return IOOliIoI1l.I00000oIO(f18, f19, (f17 * fArr5[2]) + (f16 * fArr5[1]) + (f15 * fArr5[0]));
                }
            }
