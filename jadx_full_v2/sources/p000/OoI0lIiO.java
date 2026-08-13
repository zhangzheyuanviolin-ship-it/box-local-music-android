            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.util.Size;
            
            public abstract class OoI0lIiO {
                public static final RectF I00000oIO = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

                public static Matrix I00000oIO(RectF rectF, RectF rectF2, int i, boolean z) {
/* 3 */             Matrix matrix = new Matrix();
/* 6 */             Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
/* 8 */             RectF rectF3 = I00000oIO;
/* 10 */            matrix.setRectToRect(rectF, rectF3, scaleToFit);
/* 14 */            matrix.postRotate(i);
/* 17 */            if (z) {
/* 23 */                matrix.postScale(-1.0f, 1.0f);
                    }
/* 28 */            Matrix matrix2 = new Matrix();
/* 31 */            matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
/* 34 */            matrix.postConcat(matrix2);
/* 204 */           return matrix;
                }

                public static int I00000oOI(Matrix matrix) {
/* 5 */             matrix.getValues(new float[9]);
/* 31 */            return I000OOo1O((int) Math.round(Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
                }

                public static boolean I0000Il00O(int i) {
/* 3 */             if (i == 90 || i == 270) {
/* 30 */                return true;
                    }
/* 10 */            if (i == 0 || i == 180) {
/* 28 */                return false;
                    }
/* 23 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Invalid rotation degrees: "));
/* 26 */            return false;
                }

                public static boolean I0000O(Size size, boolean z, Size size2) {
                    float width;
                    float width2;
/* 3 */             if (z) {
/* 15 */                width = size.getWidth() / size.getHeight();
/* 16 */                width2 = width;
                    } else {
/* 30 */                width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
/* 43 */                width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
                    }
                    return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
                }

                public static boolean I0000oI00(Matrix matrix) {
/* 2 */             float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
/* 7 */             matrix.mapVectors(fArr);
/* 11 */            float f = fArr[0];
/* 14 */            float f2 = fArr[1];
/* 17 */            float f3 = fArr[2];
/* 20 */            float f4 = fArr[3];
/* 26 */            float f5 = (f2 * f4) + (f * f3);
/* 31 */            float f6 = (f * f4) - (f2 * f3);
/* 49 */            double dSqrt = Math.sqrt((f2 * f2) + (f * f)) * Math.sqrt((f4 * f4) + (f3 * f3));
                    return ((float) Math.toDegrees(Math.atan2(((double) f6) / dSqrt, ((double) f5) / dSqrt))) > 0.0f;
                }

                public static Size I0001Ioi1lo(Rect rect) {
/* 11 */            return new Size(rect.width(), rect.height());
                }

                public static Size I000II(int i, Size size) {
/* 22 */            lII1OI11o1I.I00000oIO("Invalid rotation degrees: " + i, i % 90 == 0);
                    return I0000Il00O(I000OOo1O(i)) ? new Size(size.getHeight(), size.getWidth()) : size;
                }

                public static RectF I000O01llI0(Size size) {
/* 14 */            return new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
                }

                public static int I000OOo1O(int i) {
/* 5 */             return ((i % 360) + 360) % 360;
                }
            }
