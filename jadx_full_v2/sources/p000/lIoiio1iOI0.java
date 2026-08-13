            package p000;
            
            public abstract class lIoiio1iOI0 {
                public static float I00000oIO(float[] fArr) {
/* 4 */             if (fArr.length < 6) {
/* 3 */                 return 0.0f;
                    }
/* 8 */             float f = fArr[0];
/* 11 */            float f2 = fArr[1];
/* 14 */            float f3 = fArr[2];
/* 17 */            float f4 = fArr[3];
/* 20 */            float f5 = fArr[4];
/* 23 */            float f6 = fArr[5];
/* 41 */            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
                    return f7 < 0.0f ? -f7 : f7;
                }
            }
