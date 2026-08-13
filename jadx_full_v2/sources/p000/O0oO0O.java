            package p000;

            import android.text.TextPaint;
            import android.text.style.MetricAffectingSpan;
            
            public final class O0oO0O extends MetricAffectingSpan {
                public float I00iOIl;

                @Override
                public final void updateDrawState(TextPaint textPaint) {
/* 3 */             textPaint.setLetterSpacing(this.I00iOIl);
                }

                @Override
                public final void updateMeasureState(TextPaint textPaint) {
/* 3 */             textPaint.setLetterSpacing(this.I00iOIl);
                }
            }
