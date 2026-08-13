            package p000;

            import java.util.Arrays;
            
            public abstract class iliiiIoIoI {
                public static float I00000oIO(float f, float[] fArr, float[] fArr2) {
                    float f2;
                    float f3;
                    float f4;
                    float f5;
/* 1 */             float fAbs = Math.abs(f);
/* 5 */             float fSignum = Math.signum(f);
/* 9 */             int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
/* 13 */            if (iBinarySearch >= 0) {
/* 17 */                return fSignum * fArr2[iBinarySearch];
                    }
/* 21 */            int i = -(iBinarySearch + 1);
                    int i2 = i - 1;
/* 28 */            if (i2 >= fArr.length - 1) {
/* 33 */                float f6 = fArr[fArr.length - 1];
/* 38 */                float f7 = fArr2[fArr.length - 1];
/* 42 */                if (f6 == 0.0f) {
/* 27 */                    return 0.0f;
                        }
/* 46 */                return (f7 / f6) * f;
                    }
/* 49 */            if (i2 == -1) {
/* 52 */                float f8 = fArr[0];
/* 54 */                f4 = fArr2[0];
/* 56 */                f5 = f8;
/* 57 */                f3 = 0.0f;
/* 58 */                f2 = 0.0f;
                    } else {
/* 60 */                float f9 = fArr[i2];
/* 62 */                float f10 = fArr[i];
/* 64 */                f2 = fArr2[i2];
/* 69 */                f3 = f9;
/* 66 */                f4 = fArr2[i];
/* 71 */                f5 = f10;
                    }
/* 94 */            return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
                }
            }
