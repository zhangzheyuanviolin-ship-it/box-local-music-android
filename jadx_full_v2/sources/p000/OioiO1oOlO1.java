            package p000;

            import android.graphics.Matrix;
            import android.graphics.Path;
            import android.graphics.RectF;
            
            public final class OioiO1oOlO1 extends Oioii11ilO {
                public static final RectF I000O01llI0 = new RectF();
                public final float I00000oOI;
                public final float I0000Il00O;
                public final float I0000O;
                public final float I0000oI00;
                public float I0001Ioi1lo;
                public float I000II;

                public OioiO1oOlO1(float f, float f2, float f3, float f4) {
/* 4 */             this.I00000oOI = f;
/* 6 */             this.I0000Il00O = f2;
/* 8 */             this.I0000O = f3;
/* 10 */            this.I0000oI00 = f4;
                }

                @Override
                public final void I00000oIO(Matrix matrix, Path path) {
/* 1 */             Matrix matrix2 = this.I00000oIO;
/* 3 */             matrix.invert(matrix2);
/* 6 */             path.transform(matrix2);
/* 9 */             float f = this.I0000O;
/* 11 */            float f2 = this.I0000oI00;
/* 13 */            RectF rectF = I000O01llI0;
/* 19 */            rectF.set(this.I00000oOI, this.I0000Il00O, f, f2);
/* 27 */            path.arcTo(rectF, this.I0001Ioi1lo, this.I000II, false);
/* 30 */            path.transform(matrix);
                }
            }
