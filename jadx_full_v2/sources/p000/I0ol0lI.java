            package p000;

            import android.graphics.Matrix;
            import android.graphics.Path;
            import android.graphics.RectF;
            
            public final class I0ol0lI {
                public final Path I00000oIO;
                public RectF I00000oOI;
                public float[] I0000Il00O;
                public Matrix I0000O;

                public I0ol0lI(Path path) {
/* 4 */             this.I00000oIO = path;
                }

                public static void I00000oIO(I0ol0lI i0ol0lI, I0ol0lI i0ol0lI2) {
/* 1 */             Path path = i0ol0lI.I00000oIO;
/* 5 */             if (i0ol0lI2 instanceof I0ol0lI) {
/* 18 */                path.addPath(i0ol0lI2.I00000oIO, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                    } else {
/* 24 */                OoOil11Ol1o.I000OiO("Unable to obtain android.graphics.Path");
                    }
                }

                public static void I00000oOI(I0ol0lI i0ol0lI, OOo0IO oOo0IO) {
/* 1 */             OO0I1o1I[] oO0I1o1IArr = OO0I1o1I.I00iOIl;
/* 3 */             float f = oOo0IO.I00000oIO;
/* 5 */             float f2 = oOo0IO.I0000O;
/* 7 */             float f3 = oOo0IO.I0000Il00O;
/* 9 */             float f4 = oOo0IO.I00000oOI;
/* 15 */            if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
/* 37 */                I0olIlI11.I00000oOI("Invalid rectangle, make sure no value is NaN");
                    }
/* 40 */            RectF rectF = i0ol0lI.I00000oOI;
/* 42 */            if (rectF == null) {
/* 46 */                rectF = new RectF();
/* 49 */                i0ol0lI.I00000oOI = rectF;
                    }
/* 51 */            rectF.set(f, f4, f3, f2);
/* 60 */            i0ol0lI.I00000oIO.addRect(i0ol0lI.I00000oOI, Path.Direction.CCW);
                }

                public static void I0000Il00O(I0ol0lI i0ol0lI, OiI101I1oIi oiI101I1oIi) {
/* 1 */             OO0I1o1I[] oO0I1o1IArr = OO0I1o1I.I00iOIl;
/* 3 */             RectF rectF = i0ol0lI.I00000oOI;
/* 5 */             if (rectF == null) {
/* 9 */                 rectF = new RectF();
/* 12 */                i0ol0lI.I00000oOI = rectF;
                    }
/* 14 */            float f = oiI101I1oIi.I00000oIO;
/* 16 */            long j = oiI101I1oIi.I000O01llI0;
/* 18 */            long j2 = oiI101I1oIi.I000II;
/* 20 */            long j3 = oiI101I1oIi.I0001Ioi1lo;
/* 22 */            long j4 = oiI101I1oIi.I0000oI00;
/* 30 */            rectF.set(f, oiI101I1oIi.I00000oOI, oiI101I1oIi.I0000Il00O, oiI101I1oIi.I0000O);
/* 33 */            float[] fArr = i0ol0lI.I0000Il00O;
/* 35 */            if (fArr == null) {
/* 39 */                fArr = new float[8];
/* 41 */                i0ol0lI.I0000Il00O = fArr;
                    }
/* 53 */            fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
/* 67 */            fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
/* 77 */            fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
/* 86 */            fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
/* 96 */            fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
/* 105 */           fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
/* 115 */           fArr[6] = Float.intBitsToFloat((int) (j >> 32));
/* 125 */           fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
/* 135 */           i0ol0lI.I00000oIO.addRoundRect(i0ol0lI.I00000oOI, i0ol0lI.I0000Il00O, Path.Direction.CCW);
                }

                public final OOo0IO I0000O() {
/* 1 */             RectF rectF = this.I00000oOI;
/* 3 */             if (rectF == null) {
/* 7 */                 rectF = new RectF();
/* 10 */                this.I00000oOI = rectF;
                    }
/* 15 */            this.I00000oIO.computeBounds(rectF, true);
/* 28 */            return new OOo0IO(rectF.left, rectF.top, rectF.right, rectF.bottom);
                }

                public final void I0000oI00(float f, float f2) {
/* 3 */             this.I00000oIO.lineTo(f, f2);
                }

                public final void I0001Ioi1lo(float f, float f2) {
/* 3 */             this.I00000oIO.moveTo(f, f2);
                }

                public final boolean I000II(I0ol0lI i0ol0lI, I0ol0lI i0ol0lI2, int i) {
/* 24 */            Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
/* 31 */            if (!(i0ol0lI instanceof I0ol0lI)) {
/* 52 */                OoOil11Ol1o.I000OiO("Unable to obtain android.graphics.Path");
/* 28 */                return false;
                    }
/* 33 */            Path path = i0ol0lI.I00000oIO;
/* 37 */            if (i0ol0lI2 instanceof I0ol0lI) {
/* 43 */                return this.I00000oIO.op(path, i0ol0lI2.I00000oIO, op);
                    }
/* 48 */            OoOil11Ol1o.I000OiO("Unable to obtain android.graphics.Path");
/* 28 */            return false;
                }

                public final void I000O01llI0() {
/* 3 */             this.I00000oIO.reset();
                }

                public final void I000OOo1O() {
/* 3 */             this.I00000oIO.rewind();
                }

                public final void I000OiO(long j) {
/* 1 */             Matrix matrix = this.I0000O;
/* 3 */             if (matrix == null) {
/* 10 */                this.I0000O = new Matrix();
                    } else {
/* 13 */                matrix.reset();
                    }
/* 38 */            this.I0000O.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
/* 45 */            this.I00000oIO.transform(this.I0000O);
                }
            }
