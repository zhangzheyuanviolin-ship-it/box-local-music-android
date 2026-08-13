            package p000;
            
            public abstract class l1I1Il {
                public static final float I00000oIO(float f) {
/* 20 */            float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
/* 34 */            float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
/* 41 */            return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
                }

                public static final float I00000oOI(float f, float f2, float f3) {
/* 6 */             return (f3 * f2) + ((1.0f - f3) * f);
                }

                public static final int I0000Il00O(int i, int i2, float f) {
/* 10 */            return i + ((int) Math.round((i2 - i) * f));
                }
            }
