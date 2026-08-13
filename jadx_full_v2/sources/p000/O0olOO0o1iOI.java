            package p000;

            import android.graphics.Paint;
            import android.text.style.LineHeightSpan;
            
            public final class O0olOO0o1iOI implements LineHeightSpan {
                public float I00iOIl;

                @Override
                public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
/* 6 */             if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
/* 8 */                 return;
                    }
/* 33 */            int iCeil = (int) Math.ceil(fontMetricsInt.descent * ((r0 * 1.0f) / r1));
/* 34 */            fontMetricsInt.descent = iCeil;
/* 37 */            fontMetricsInt.ascent = iCeil - ((int) Math.ceil(this.I00iOIl));
                }
            }
