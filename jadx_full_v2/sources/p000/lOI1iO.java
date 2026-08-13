            package p000;

            import android.graphics.Path;
            import android.graphics.RectF;
            
            public abstract class lOI1iO {
                public static final boolean I00000oIO(float f, float f2, I0ol0lI i0ol0lI) {
/* 4 */             float f3 = f - 0.005f;
/* 6 */             float f4 = f2 - 0.005f;
/* 8 */             float f5 = f + 0.005f;
/* 9 */             float f6 = f2 + 0.005f;
/* 10 */            I0ol0lI i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 14 */            OO0I1o1I[] oO0I1o1IArr = OO0I1o1I.I00iOIl;
/* 20 */            if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
/* 42 */                I0olIlI11.I00000oOI("Invalid rectangle, make sure no value is NaN");
                    }
/* 45 */            RectF rectF = i0ol0lII00000oIO.I00000oOI;
/* 47 */            if (rectF == null) {
/* 51 */                rectF = new RectF();
/* 54 */                i0ol0lII00000oIO.I00000oOI = rectF;
                    }
/* 56 */            rectF.set(f3, f4, f5, f6);
/* 65 */            i0ol0lII00000oIO.I00000oIO.addRect(i0ol0lII00000oIO.I00000oOI, Path.Direction.CCW);
/* 68 */            I0ol0lI i0ol0lII00000oIO2 = I0olIlI11.I00000oIO();
/* 73 */            i0ol0lII00000oIO2.I000II(i0ol0lI, i0ol0lII00000oIO, 1);
/* 78 */            boolean zIsEmpty = i0ol0lII00000oIO2.I00000oIO.isEmpty();
/* 82 */            i0ol0lII00000oIO2.I000O01llI0();
/* 85 */            i0ol0lII00000oIO.I000O01llI0();
/* 88 */            return !zIsEmpty;
                }

                public static final boolean I00000oOI(float f, float f2, float f3, float f4, long j) {
/* 1 */             float f5 = f - f3;
/* 2 */             float f6 = f2 - f4;
/* 8 */             float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 20 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                    return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
                }
            }
