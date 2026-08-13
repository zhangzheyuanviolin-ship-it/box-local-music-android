            package p000;
            
            public abstract class ilO11lo1O {
                public static float I00000oIO(float[] fArr, float[] fArr2) {
/* 3 */             if (fArr.length != fArr2.length) {
/* 5 */                 return -1.0f;
                    }
/* 8 */             int length = fArr.length;
/* 9 */             float f = 0.0f;
/* 11 */            for (int i = 0; i < length; i++) {
/* 18 */                f += fArr[i] * fArr2[i];
                    }
/* 37 */            return f;
                }
            }
