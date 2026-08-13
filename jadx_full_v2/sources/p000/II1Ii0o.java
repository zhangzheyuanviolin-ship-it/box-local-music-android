            package p000;

            import android.animation.ValueAnimator;
            import com.google.android.material.bottomsheet.BottomSheetBehavior;
            
            public final class II1Ii0o implements ValueAnimator.AnimatorUpdateListener {
                public BottomSheetBehavior I00000oIO;

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 7 */             float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
/* 13 */            O1Ooi0 o1Ooi0 = this.I00000oIO.I0000O;
/* 15 */            if (o1Ooi0 != null) {
/* 17 */                O1OoOIoiiO1I o1OoOIoiiO1I = o1Ooi0.I00iiI;
/* 23 */                if (o1OoOIoiiO1I.I000OiO != fFloatValue) {
/* 25 */                    o1OoOIoiiO1I.I000OiO = fFloatValue;
/* 28 */                    o1Ooi0.I00ilO0 = true;
/* 30 */                    o1Ooi0.I00io1l = true;
/* 32 */                    o1Ooi0.invalidateSelf();
                        }
                    }
                }
            }
