            package p000;
            
            public interface III0liIO {
                public static final III0l0Ili1l I00000oIO = III0l0Ili1l.I00000oIO;

                default float I00000oIO(float f, float f2, float f3) {
/* 3 */             I00000oIO.getClass();
/* 6 */             float f4 = f2 + f;
/* 10 */            if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
/* 7 */                 return 0.0f;
                    }
/* 30 */            float f5 = f4 - f3;
                    return Math.abs(f) < Math.abs(f5) ? f : f5;
                }
            }
