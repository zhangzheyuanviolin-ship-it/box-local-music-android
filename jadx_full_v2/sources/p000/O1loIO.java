            package p000;

            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LO1loIO;", "LOooioIIoi0O;", "<init>", "()V", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class O1loIO extends OooioIIoi0O {
                public final OlO0OIIl1 I00000oOI;
                public final OOli1O I0000Il00O;
                public OlIl0i I0000O;
                public final Paint I0000oI00;

                public O1loIO() {
/* 18 */            OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(new O1loIIIOiO(null, null, 0, null, 36.0f, false, null, false));
/* 22 */            this.I00000oOI = olO0OIIl1I00000oIO;
/* 28 */            this.I0000Il00O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
/* 32 */            Paint paint = new Paint();
/* 37 */            paint.setColor(-16777216);
/* 42 */            paint.setStrokeCap(Paint.Cap.ROUND);
/* 47 */            paint.setStrokeJoin(Paint.Join.ROUND);
/* 52 */            paint.setStyle(Paint.Style.STROKE);
/* 56 */            paint.setAntiAlias(false);
/* 59 */            this.I0000oI00 = paint;
                }

                @Override
                public final void I0000O() {
/* 1 */             OlIl0i olIl0i = this.I0000O;
/* 3 */             if (olIl0i != null) {
/* 6 */                 olIl0i.I000II(null);
                    }
                }

                public final void I0000oI00(float f, float f2, float f3, float f4) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 9 */             Bitmap bitmap = ((O1loIIIOiO) olO0OIIl1.getValue()).I00000oOI;
/* 11 */            if (bitmap == null) {
/* 13 */                return;
                    }
/* 20 */            float f5 = ((O1loIIIOiO) olO0OIIl1.getValue()).I0000oI00;
/* 22 */            Paint paint = this.I0000oI00;
/* 24 */            paint.setStrokeWidth(f5);
/* 36 */            new Canvas(bitmap).drawLine(f, f2, f3, f4, paint);
/* 70 */            olO0OIIl1.I000lI(null, O1loIIIOiO.I00000oIO((O1loIIIOiO) olO0OIIl1.getValue(), null, null, ((O1loIIIOiO) olO0OIIl1.getValue()).I0000Il00O + 1, null, 0.0f, false, null, false, 251));
                }
            }
