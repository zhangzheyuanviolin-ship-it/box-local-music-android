            package p000;
            
            public abstract class l00lO1OO0OI {
                public static final boolean I00000oIO(float[] fArr, float[] fArr2) {
/* 9 */             if (fArr.length < 16 || fArr2.length < 16) {
/* 6 */                 return false;
                    }
/* 18 */            float f = fArr[0];
/* 21 */            float f2 = fArr[1];
/* 24 */            float f3 = fArr[2];
/* 27 */            float f4 = fArr[3];
/* 30 */            float f5 = fArr[4];
/* 33 */            float f6 = fArr[5];
/* 36 */            float f7 = fArr[6];
/* 40 */            float f8 = fArr[7];
/* 46 */            float f9 = fArr[8];
/* 52 */            float f10 = fArr[9];
/* 56 */            float f11 = fArr[10];
/* 60 */            float f12 = fArr[11];
/* 66 */            float f13 = fArr[12];
/* 70 */            float f14 = fArr[13];
/* 74 */            float f15 = fArr[14];
/* 78 */            float f16 = fArr[15];
/* 84 */            float f17 = (f * f6) - (f2 * f5);
/* 90 */            float f18 = (f * f7) - (f3 * f5);
/* 96 */            float f19 = (f * f8) - (f4 * f5);
/* 102 */           float f20 = (f2 * f7) - (f3 * f6);
/* 108 */           float f21 = (f2 * f8) - (f4 * f6);
/* 114 */           float f22 = (f3 * f8) - (f4 * f7);
/* 120 */           float f23 = (f9 * f14) - (f10 * f13);
/* 126 */           float f24 = (f9 * f15) - (f11 * f13);
/* 132 */           float f25 = (f9 * f16) - (f12 * f13);
/* 138 */           float f26 = (f10 * f15) - (f11 * f14);
/* 144 */           float f27 = (f10 * f16) - (f12 * f14);
/* 150 */           float f28 = (f11 * f16) - (f12 * f15);
/* 172 */           float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
/* 178 */           if (f29 != 0.0f) {
/* 184 */               float f30 = 1.0f / f29;
/* 198 */               fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
/* 215 */               fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
/* 229 */               fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
/* 244 */               fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
/* 246 */               float f31 = -f5;
/* 259 */               fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
/* 273 */               fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
/* 275 */               float f32 = -f13;
/* 288 */               fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
/* 302 */               fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
/* 315 */               fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
/* 330 */               fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
/* 342 */               fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
/* 357 */               fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
/* 369 */               fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
/* 381 */               fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
/* 395 */               fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
/* 408 */               fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
                    }
/* 417 */           return !(f29 == 0.0f);
                }
            }
