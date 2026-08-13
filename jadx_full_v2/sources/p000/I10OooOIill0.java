            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.drawable.Animatable2;
            import android.graphics.drawable.Drawable;
            
            public final class I10OooOIill0 extends Animatable2.AnimationCallback {
                public final O1Olool I00000oIO;

                public I10OooOIill0(O1Olool o1Olool) {
/* 1 */             this.I00000oIO = o1Olool;
                }

                @Override
                public final void onAnimationEnd(Drawable drawable) {
/* 5 */             ColorStateList colorStateList = this.I00000oIO.I00000oOI.I00o0iI0io1;
/* 7 */             if (colorStateList != null) {
/* 9 */                 drawable.setTintList(colorStateList);
                    }
                }

                @Override
                public final void onAnimationStart(Drawable drawable) {
/* 3 */             this.I00000oIO.I00000oIO(drawable);
                }
            }
