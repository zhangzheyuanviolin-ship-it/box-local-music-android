            package p000;

            import android.graphics.Typeface;
            import android.text.TextPaint;
            import android.text.style.MetricAffectingSpan;
            
            public final class IliOOlO extends MetricAffectingSpan {
                public final int I00iOIl;
                public Object I00iiI;

                @Override
                public final void updateDrawState(TextPaint textPaint) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    textPaint.setFontFeatureSettings((String) this.I00iiI);
                            break;
                        default:
/* 10 */                    textPaint.setTypeface((Typeface) this.I00iiI);
                            break;
                    }
                }

                @Override
                public final void updateMeasureState(TextPaint textPaint) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    textPaint.setFontFeatureSettings((String) this.I00iiI);
                            break;
                        default:
/* 10 */                    textPaint.setTypeface((Typeface) this.I00iiI);
                            break;
                    }
                }
            }
