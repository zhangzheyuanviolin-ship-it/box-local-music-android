            package p000;

            import android.graphics.Bitmap;
            import android.view.View;
            import android.widget.RatingBar;
            
            public final class I1I0ii1oI0lO extends RatingBar {
                public I1I0i0Ilo1Oi I00iOIl;

                @Override
                public final synchronized void onMeasure(int i, int i2) {
/* 2 */             super.onMeasure(i, i2);
/* 9 */             Bitmap bitmap = (Bitmap) this.I00iOIl.I00iiO;
/* 11 */            if (bitmap != null) {
/* 31 */                setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
                    }
                }
            }
