            package p000;

            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.Outline;
            import android.graphics.drawable.Drawable;
            import androidx.appcompat.widget.ActionBarContainer;
            
/* 27 */    public final class I0I0lO0OIliO extends Drawable {
                public ActionBarContainer I00000oIO;

                @Override
                public final void draw(Canvas canvas) {
/* 1 */             ActionBarContainer actionBarContainer = this.I00000oIO;
/* 5 */             if (actionBarContainer.I00io1l) {
/* 7 */                 Drawable drawable = actionBarContainer.I00ilO0;
/* 9 */                 if (drawable != null) {
/* 11 */                    drawable.draw(canvas);
/* 14 */                    return;
                        }
/* 77 */                return;
                    }
/* 15 */            Drawable drawable2 = actionBarContainer.I00iio;
/* 17 */            if (drawable2 != null) {
/* 19 */                drawable2.draw(canvas);
                    }
/* 22 */            Drawable drawable3 = actionBarContainer.I00ilI0I1;
/* 24 */            if (drawable3 == null || !actionBarContainer.I00ioIO) {
/* 77 */                return;
                    }
/* 30 */            drawable3.draw(canvas);
                }

                @Override
                public final int getOpacity() {
/* 1 */             return 0;
                }

                @Override
                public final void getOutline(Outline outline) {
/* 1 */             ActionBarContainer actionBarContainer = this.I00000oIO;
/* 5 */             if (actionBarContainer.I00io1l) {
/* 9 */                 if (actionBarContainer.I00ilO0 != null) {
/* 13 */                    actionBarContainer.I00iio.getOutline(outline);
                        }
                    } else {
/* 17 */                Drawable drawable = actionBarContainer.I00iio;
/* 19 */                if (drawable != null) {
/* 21 */                    drawable.getOutline(outline);
                        }
                    }
                }

                @Override
/* 28 */        public final void setAlpha(int i) {
                }

                @Override
/* 28 */        public final void setColorFilter(ColorFilter colorFilter) {
                }
            }
