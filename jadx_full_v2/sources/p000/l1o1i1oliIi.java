            package p000;

            import android.graphics.Rect;
            import android.text.Spanned;
            import android.text.TextPaint;
            import android.text.style.MetricAffectingSpan;
            
            public abstract class l1o1i1oliIi {
                public static final Rect I00000oIO(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
/* 3 */             if (charSequence instanceof Spanned) {
/* 6 */                 Spanned spanned = (Spanned) charSequence;
/* 16 */                if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
/* 20 */                    Rect rect = new Rect();
/* 25 */                    Rect rect2 = new Rect();
/* 30 */                    TextPaint textPaint2 = new TextPaint();
/* 33 */                    while (i < i2) {
/* 35 */                        int iNextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
/* 43 */                        MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
/* 45 */                        textPaint2.set(textPaint);
/* 50 */                        for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
/* 62 */                            if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
/* 64 */                                metricAffectingSpan.updateMeasureState(textPaint2);
                                    }
                                }
/* 70 */                        textPaint2.getTextBounds(charSequence, i, iNextSpanTransition, rect2);
/* 80 */                        rect.right = rect2.width() + rect.right;
/* 90 */                        rect.top = Math.min(rect.top, rect2.top);
/* 100 */                       rect.bottom = Math.max(rect.bottom, rect2.bottom);
/* 102 */                       i = iNextSpanTransition;
                            }
/* 104 */                   return rect;
                        }
                    }
/* 107 */           Rect rect3 = new Rect();
/* 110 */           textPaint.getTextBounds(charSequence, i, i2, rect3);
/* 204 */           return rect3;
                }
            }
