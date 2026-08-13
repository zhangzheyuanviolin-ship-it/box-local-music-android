            package p000;
            
            public final class OIOlo1 extends IOOl0ll {
                public static final float[] I0000O;
                public static final float[] I0000oI00;
                public static final float[] I0001Ioi1lo;
                public static final float[] I000II;

                static {
/* 27 */            float[] fArrI0001Ioi1lo = iiOiII0.I0001Ioi1lo(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, iiOiII0.I00000oOI(I0IiO0lO.I0000Il00O.I00000oOI, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
/* 31 */            I0000O = fArrI0001Ioi1lo;
/* 33 */            float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
/* 38 */            I0000oI00 = fArr;
/* 44 */            I0001Ioi1lo = iiOiII0.I0000oI00(fArrI0001Ioi1lo);
/* 50 */            I000II = iiOiII0.I0000oI00(fArr);
                }

                @Override
                public final float I00000oIO(int i) {
                    return i == 0 ? 1.0f : 0.5f;
                }

                @Override
                public final float I00000oOI(int i) {
                    return i == 0 ? 0.0f : -0.5f;
                }

                @Override
                public final long I0000O(float f, float f2, float f3) {
/* 4 */             if (f < 0.0f) {
/* 6 */                 f = 0.0f;
                    }
/* 11 */            if (f > 1.0f) {
/* 13 */                f = 1.0f;
                    }
/* 18 */            if (f2 < -0.5f) {
/* 20 */                f2 = -0.5f;
                    }
/* 25 */            if (f2 > 0.5f) {
/* 27 */                f2 = 0.5f;
                    }
/* 30 */            if (f3 < -0.5f) {
/* 32 */                f3 = -0.5f;
                    }
/* 35 */            float f4 = f3 <= 0.5f ? f3 : 0.5f;
/* 39 */            float[] fArr = I000II;
/* 54 */            float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
/* 68 */            float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
/* 83 */            float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
/* 86 */            float f8 = f5 * f5 * f5;
/* 89 */            float f9 = f6 * f6 * f6;
/* 92 */            float f10 = f7 * f7 * f7;
/* 93 */            float[] fArr2 = I0001Ioi1lo;
/* 137 */           return (Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8))) << 32) | (4294967295L & Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8)));
                }

                @Override
                public final float I0000oI00(float f, float f2, float f3) {
/* 4 */             if (f < 0.0f) {
/* 6 */                 f = 0.0f;
                    }
/* 11 */            if (f > 1.0f) {
/* 13 */                f = 1.0f;
                    }
/* 18 */            if (f2 < -0.5f) {
/* 20 */                f2 = -0.5f;
                    }
/* 25 */            if (f2 > 0.5f) {
/* 27 */                f2 = 0.5f;
                    }
/* 30 */            if (f3 < -0.5f) {
/* 32 */                f3 = -0.5f;
                    }
/* 35 */            float f4 = f3 <= 0.5f ? f3 : 0.5f;
/* 40 */            float[] fArr = I000II;
/* 54 */            float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
/* 68 */            float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
/* 83 */            float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
/* 86 */            float f8 = f5 * f5 * f5;
/* 89 */            float f9 = f6 * f6 * f6;
/* 92 */            float f10 = f7 * f7 * f7;
/* 93 */            float[] fArr2 = I0001Ioi1lo;
/* 105 */           return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
                }

                @Override
                public final long I0001Ioi1lo(float f, float f2, float f3, float f4, IOOl0ll iOOl0ll) {
/* 1 */             float[] fArr = I0000O;
/* 16 */            float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
/* 30 */            float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
/* 45 */            float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
/* 46 */            float fI00000oIO = l1I1Il.I00000oIO(f5);
/* 50 */            float fI00000oIO2 = l1I1Il.I00000oIO(f6);
/* 54 */            float fI00000oIO3 = l1I1Il.I00000oIO(f7);
/* 58 */            float[] fArr2 = I0000oI00;
/* 95 */            return iiO01ll11o1l.I00000oIO((fArr2[6] * fI00000oIO3) + (fArr2[3] * fI00000oIO2) + (fArr2[0] * fI00000oIO), (fArr2[7] * fI00000oIO3) + (fArr2[4] * fI00000oIO2) + (fArr2[1] * fI00000oIO), (fArr2[8] * fI00000oIO3) + (fArr2[5] * fI00000oIO2) + (fArr2[2] * fI00000oIO), f4, iOOl0ll);
                }
            }
