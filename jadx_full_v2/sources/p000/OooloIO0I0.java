            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OooloIO0I0 {
                public static final OooloIO0I0 I000iOII;
                public float I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;
                public float I0000oI00;
                public float I0001Ioi1lo;
                public float[] I000II;
                public float I000O01llI0;
                public float I000OOo1O;
                public float I000OiO;

                static {
/* 15 */            float fI0000Il00O = (float) ((i1Ioli1II.I0000Il00O() * 63.66197723675813d) / 100.0d);
/* 16 */            float[] fArr = i1Ioli1II.I0000Il00O;
/* 19 */            float f = fArr[0];
/* 21 */            float[][] fArr2 = i1Ioli1II.I00000oIO;
/* 23 */            float[] fArr3 = fArr2[0];
/* 27 */            float f2 = fArr3[0] * f;
/* 29 */            float f3 = fArr[1];
/* 34 */            float f4 = (fArr3[1] * f3) + f2;
/* 36 */            float f5 = fArr[2];
/* 41 */            float f6 = (fArr3[2] * f5) + f4;
/* 42 */            float[] fArr4 = fArr2[1];
/* 54 */            float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
/* 55 */            float[] fArr5 = fArr2[2];
/* 67 */            float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
/* 89 */            float fExp = (1.0f - (((float) Math.exp(((-fI0000Il00O) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
                    double d = fExp;
/* 95 */            if (d > 1.0d) {
/* 97 */                fExp = 1.0f;
                    } else if (d < 0.0d) {
/* 105 */               fExp = 0.0f;
                    }
/* 123 */           float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
/* 135 */           float f9 = 1.0f / ((5.0f * fI0000Il00O) + 1.0f);
/* 140 */           float f10 = f9 * f9 * f9 * f9;
/* 141 */           float f11 = 1.0f - f10;
/* 162 */           float fCbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(fI0000Il00O * 5.0d))) + (f10 * fI0000Il00O);
/* 169 */           float fI0000Il00O2 = i1Ioli1II.I0000Il00O() / fArr[1];
                    double d2 = fI0000Il00O2;
/* 181 */           float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
/* 197 */           float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
/* 244 */           float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * fCbrt) * f8) / 100.0d, 0.42d)};
/* 252 */           float f12 = fArr7[0];
/* 262 */           float f13 = (f12 * 400.0f) / (f12 + 27.13f);
/* 263 */           float f14 = fArr7[1];
/* 268 */           float f15 = (f14 * 400.0f) / (f14 + 27.13f);
/* 269 */           float f16 = fArr7[2];
/* 274 */           float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
/* 297 */           float f17 = ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow;
/* 307 */           float fPow2 = (float) Math.pow(fCbrt, 0.25d);
/* 308 */           OooloIO0I0 oooloIO0I0 = new OooloIO0I0();
/* 311 */           oooloIO0I0.I0001Ioi1lo = fI0000Il00O2;
/* 313 */           oooloIO0I0.I00000oIO = f17;
/* 315 */           oooloIO0I0.I00000oOI = fPow;
/* 317 */           oooloIO0I0.I0000Il00O = fPow;
/* 322 */           oooloIO0I0.I0000O = 0.69f;
/* 324 */           oooloIO0I0.I0000oI00 = 1.0f;
/* 326 */           oooloIO0I0.I000II = fArr6;
/* 328 */           oooloIO0I0.I000O01llI0 = fCbrt;
/* 330 */           oooloIO0I0.I000OOo1O = fPow2;
/* 332 */           oooloIO0I0.I000OiO = fSqrt;
/* 334 */           VarHandle.storeStoreFence();
/* 337 */           I000iOII = oooloIO0I0;
                }
            }
