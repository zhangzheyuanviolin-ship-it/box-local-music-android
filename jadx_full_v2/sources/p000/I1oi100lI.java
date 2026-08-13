            package p000;

            import android.text.TextPaint;
            import android.text.style.MetricAffectingSpan;
            
            public final class I1oi100lI extends MetricAffectingSpan {
                public final int I00iOIl;
                public float I00iiI;

                @Override
                public final void updateDrawState(TextPaint textPaint) {
                    switch (this.I00iOIl) {
                        case 0:
                            textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.I00iiI);
                            break;
                        default:
/* 13 */                    textPaint.setTextSkewX(textPaint.getTextSkewX() + this.I00iiI);
                            break;
                    }
                }

                @Override
                public final void updateMeasureState(TextPaint textPaint) {
                    switch (this.I00iOIl) {
                        case 0:
                            textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.I00iiI);
                            break;
                        default:
/* 13 */                    textPaint.setTextSkewX(textPaint.getTextSkewX() + this.I00iiI);
                            break;
                    }
                }
            }
