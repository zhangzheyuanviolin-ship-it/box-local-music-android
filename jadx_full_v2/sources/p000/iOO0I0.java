            package p000;
            
            public abstract class iOO0I0 {
                public static I110IiI1I1 I00000oIO(float f, float f2, int i) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 f2 = 0.0f;
                    }
/* 24 */            return new I110IiI1I1(Ooo0ii.I00000oIO, Float.valueOf(f), new I110iOiOllO(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
                }

                public static I110IiI1I1 I00000oOI(I110IiI1I1 i110IiI1I1, float f, float f2, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 13 */                f = ((Number) i110IiI1I1.I00iiI.getValue()).floatValue();
                    }
/* 19 */            if ((i & 2) != 0) {
/* 25 */                f2 = ((I110iOiOllO) i110IiI1I1.I00iiO).I00000oIO;
                    }
/* 46 */            return new I110IiI1I1(i110IiI1I1.I00iOIl, Float.valueOf(f), new I110iOiOllO(f2), i110IiI1I1.I00iio, i110IiI1I1.I00ilI0I1, i110IiI1I1.I00ilO0);
                }
            }
