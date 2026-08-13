            package p000;
            
            public abstract class liI0oli01O0 {
                public static final float[] I00000oIO(short[] sArr) {
/* 1 */             int length = sArr.length;
/* 2 */             float[] fArr = new float[length];
/* 5 */             for (int i = 0; i < length; i++) {
/* 13 */                fArr[i] = sArr[i] / 32768.0f;
                    }
/* 29 */            return fArr;
                }
            }
