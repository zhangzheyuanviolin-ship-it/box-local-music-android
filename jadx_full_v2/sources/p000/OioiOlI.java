            package p000;

            import android.graphics.Matrix;
            import android.graphics.Path;
            
            public final class OioiOlI extends Oioii11ilO {
                public float I00000oOI;
                public float I0000Il00O;

                @Override
                public final void I00000oIO(Matrix matrix, Path path) {
/* 1 */             Matrix matrix2 = this.I00000oIO;
/* 3 */             matrix.invert(matrix2);
/* 6 */             path.transform(matrix2);
/* 13 */            path.lineTo(this.I00000oOI, this.I0000Il00O);
/* 16 */            path.transform(matrix);
                }
            }
