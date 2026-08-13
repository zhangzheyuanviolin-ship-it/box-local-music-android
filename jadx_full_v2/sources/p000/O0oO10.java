            package p000;

            import android.text.TextPaint;
            import android.text.style.MetricAffectingSpan;
            
            public final class O0oO10 extends MetricAffectingSpan {
                public float I00iOIl;

                @Override
                public final void updateDrawState(TextPaint textPaint) {
/* 9 */             float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
/* 13 */            if (textScaleX == 0.0f) {
/* 15 */                return;
                    }
/* 19 */            textPaint.setLetterSpacing(this.I00iOIl / textScaleX);
                }

                @Override
                public final void updateMeasureState(TextPaint textPaint) {
/* 9 */             float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
/* 13 */            if (textScaleX == 0.0f) {
/* 15 */                return;
                    }
/* 19 */            textPaint.setLetterSpacing(this.I00iOIl / textScaleX);
                }
            }
