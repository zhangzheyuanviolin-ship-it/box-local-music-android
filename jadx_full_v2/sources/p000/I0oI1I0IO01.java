            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class I0oI1I0IO01 {
                public static final float[] I00000oIO;

                static {
                    float f;
                    float f2;
                    float f3;
                    float f4;
                    float f5;
                    float f6;
                    float f7;
                    float f8;
                    float f9;
/* 3 */             float[] fArr = new float[101];
/* 5 */             I00000oIO = fArr;
/* 7 */             float[] fArr2 = new float[101];
/* 9 */             float f10 = 0.0f;
/* 11 */            int i = 0;
/* 12 */            float f11 = 0.0f;
                    while (true) {
/* 15 */                float f12 = 1.0f;
/* 17 */                if (i >= 100) {
/* 154 */                   fArr2[100] = 1.0f;
/* 156 */                   fArr[100] = 1.0f;
/* 541 */                   return;
                        }
/* 22 */                float f13 = i / 100.0f;
/* 23 */                float f14 = 1.0f;
                        while (true) {
/* 29 */                    f = ((f14 - f10) / 2.0f) + f10;
/* 34 */                    f2 = f12 - f;
/* 36 */                    f3 = f * 3.0f * f2;
/* 53 */                    f4 = f * f * f;
/* 54 */                    float f15 = (((f * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
/* 58 */                    f5 = f12;
/* 76 */                    if (Math.abs(f15 - f13) < 1.0E-5d) {
                                break;
                            }
/* 80 */                    if (f15 > f13) {
/* 82 */                        f14 = f;
                            } else {
/* 86 */                        f10 = f;
                            }
/* 83 */                    f12 = f5;
                        }
/* 88 */                float f16 = 0.5f;
/* 94 */                fArr[i] = (((f2 * 0.5f) + f) * f3) + f4;
/* 96 */                float f17 = f5;
                        while (true) {
/* 102 */                   f6 = ((f17 - f11) / 2.0f) + f11;
/* 105 */                   f7 = f5 - f6;
/* 107 */                   f8 = f6 * 3.0f * f7;
/* 114 */                   f9 = f6 * f6 * f6;
/* 115 */                   float f18 = (((f7 * f16) + f6) * f8) + f9;
/* 122 */                   float f19 = f17;
/* 127 */                   if (Math.abs(f18 - f13) >= 1.0E-5d) {
/* 131 */                       if (f18 > f13) {
/* 133 */                           f17 = f6;
                                } else {
/* 137 */                           f11 = f6;
/* 138 */                           f17 = f19;
                                }
/* 134 */                       f16 = 0.5f;
                            }
                        }
/* 146 */               fArr2[i] = (((f6 * 0.35000002f) + (f7 * 0.175f)) * f8) + f9;
/* 148 */               i++;
                    }
                }

                public static I0oI100oi1 I00000oIO(float f) {
/* 1 */             float f2 = 0.0f;
/* 2 */             float f3 = 1.0f;
/* 4 */             float fI00000oOI = lIiioliIlo.I00000oOI(f, 0.0f, 1.0f);
/* 12 */            int i = (int) (100.0f * fI00000oOI);
/* 15 */            if (i < 100) {
/* 18 */                float f4 = i / 100.0f;
/* 19 */                int i2 = i + 1;
/* 23 */                float[] fArr = I00000oIO;
/* 25 */                float f5 = fArr[i];
/* 31 */                float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
/* 34 */                float f7 = ((fI00000oOI - f4) * f6) + f5;
/* 35 */                f2 = f6;
/* 36 */                f3 = f7;
                    }
/* 39 */            I0oI100oi1 i0oI100oi1 = new I0oI100oi1();
/* 42 */            i0oI100oi1.I00000oIO = f3;
/* 44 */            i0oI100oi1.I00000oOI = f2;
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            return i0oI100oi1;
                }
            }
