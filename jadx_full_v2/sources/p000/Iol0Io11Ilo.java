            package p000;

            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.text.Layout;
            import android.text.style.LeadingMarginSpan;
            
            public final class Iol0Io11Ilo implements LeadingMarginSpan {
                @Override
                public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
                    int lineForOffset;
/* 1 */             if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
/* 1925 */              return;
                    }
/* 17 */            ThreadLocal threadLocal = Oo0iliIolI.I00000oIO;
/* 23 */            if (layout.getEllipsisCount(lineForOffset) > 0) {
/* 33 */                float fI00000oOI = ioOilOo1.I00000oOI(layout, lineForOffset, paint) + ioOilOo1.I00000oIO(layout, lineForOffset, paint);
/* 37 */                if (fI00000oOI == 0.0f) {
/* 39 */                    return;
                        }
/* 40 */                canvas.translate(fI00000oOI, 0.0f);
                    }
                }

                @Override
                public final int getLeadingMargin(boolean z) {
/* 1 */             return 0;
                }
            }
