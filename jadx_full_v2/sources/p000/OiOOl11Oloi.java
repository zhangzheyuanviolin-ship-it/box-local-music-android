            package p000;

            import android.animation.ValueAnimator;
            import android.view.View;
            
            public final class OiOOl11Oloi implements ValueAnimator.AnimatorUpdateListener {
                public final int I00000oIO;
                public Object I00000oOI;

                public OiOOl11Oloi(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 1 */             int i = this.I00000oIO;
/* 3 */             Object obj = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 34 */                    ((Float) valueAnimator.getAnimatedValue()).getClass();
/* 40 */                    l11I11lO.I0000O(3, "ScreenFlashView");
/* 53 */                    ((OiOOo110O) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        default:
/* 22 */                    ((View) ((i00IOoliil0i) ((iiOlilo0IIIl) obj).I00iOIl).I0000O.getParent()).invalidate();
                            break;
                    }
                }
            }
