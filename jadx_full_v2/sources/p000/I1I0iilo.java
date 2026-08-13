            package p000;

            import android.graphics.Canvas;
            import android.graphics.drawable.Drawable;
            import android.widget.SeekBar;
            
            public final class I1I0iilo extends SeekBar {
                public I1I0l1lo0oo I00iOIl;

                @Override
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             I1I0l1lo0oo i1I0l1lo0oo = this.I00iOIl;
/* 6 */             I1I0iilo i1I0iilo = i1I0l1lo0oo.I00ilI0I1;
/* 8 */             Drawable drawable = i1I0l1lo0oo.I00ilO0;
/* 10 */            if (drawable != null && drawable.isStateful() && drawable.setState(i1I0iilo.getDrawableState())) {
/* 28 */                i1I0iilo.invalidateDrawable(drawable);
                    }
                }

                @Override
                public final void jumpDrawablesToCurrentState() {
/* 1 */             super.jumpDrawablesToCurrentState();
/* 6 */             Drawable drawable = this.I00iOIl.I00ilO0;
/* 8 */             if (drawable != null) {
/* 10 */                drawable.jumpToCurrentState();
                    }
                }

                @Override
                public final synchronized void onDraw(Canvas canvas) {
/* 2 */             super.onDraw(canvas);
/* 7 */             this.I00iOIl.I00i0ilIl0i(canvas);
                }
            }
