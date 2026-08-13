            package p000;

            import android.graphics.PathMeasure;
            
            public final class I0olIil0 {
                public PathMeasure I00000oIO;

                public final boolean I00000oIO(float f, float f2, I0ol0lI i0ol0lI) {
/* 1 */             PathMeasure pathMeasure = this.I00000oIO;
/* 5 */             if (i0ol0lI instanceof I0ol0lI) {
/* 10 */                return pathMeasure.getSegment(f, f2, i0ol0lI.I00000oIO, true);
                    }
/* 17 */            OoOil11Ol1o.I000OiO("Unable to obtain android.graphics.Path");
/* 20 */            return false;
                }

                public final void I00000oOI(I0ol0lI i0ol0lI) {
/* 10 */            this.I00000oIO.setPath(i0ol0lI != null ? i0ol0lI.I00000oIO : null, false);
                }
            }
