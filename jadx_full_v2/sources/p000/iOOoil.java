            package p000;
            
            public abstract class iOOoil {
                public static final int I00000oIO(float f, float[] fArr, int i) {
/* 4 */             float f2 = f >= 0.0f ? f : 0.0f;
/* 12 */            if (f2 > 1.0f) {
/* 14 */                f2 = 1.0f;
                    }
/* 26 */            if (Math.abs(f2 - f) > 1.05E-6f) {
/* 28 */                f2 = Float.NaN;
                    }
/* 30 */            fArr[i] = f2;
/* 36 */            return !Float.isNaN(f2) ? 1 : 0;
                }
            }
