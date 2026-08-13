            package p000;
            
            public abstract class ill1O0010 {
                public static final String I00000oIO(float f) {
/* 5 */             if (Float.isNaN(f)) {
/* 7 */                 return "NaN";
                    }
/* 14 */            if (Float.isInfinite(f)) {
                        return f < 0.0f ? "-Infinity" : "Infinity";
                    }
/* 29 */            int iMax = Math.max(1, 0);
/* 40 */            float fPow = (float) Math.pow(10.0d, iMax);
/* 41 */            float f2 = f * fPow;
/* 42 */            int i = (int) f2;
/* 49 */            if (f2 - i >= 0.5f) {
/* 51 */                i++;
                    }
/* 54 */            float f3 = i / fPow;
                    return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
                }
            }
