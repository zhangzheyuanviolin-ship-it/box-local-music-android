            package p000;

            import android.graphics.Paint;
            import android.text.Layout;
            
            public abstract class ioOilOo1 {
                public static final float I00000oIO(Layout layout, int i, Paint paint) {
                    float fAbs;
                    float width;
/* 1 */             float lineLeft = layout.getLineLeft(i);
/* 5 */             ThreadLocal threadLocal = Oo0iliIolI.I00000oIO;
/* 12 */            if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
/* 11 */                return 0.0f;
                    }
/* 45 */            float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
/* 46 */            Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
/* 62 */            if ((paragraphAlignment == null ? -1 : Iol0IoIIIio.I00000oIO[paragraphAlignment.ordinal()]) == 1) {
/* 64 */                fAbs = Math.abs(lineLeft);
/* 76 */                width = (layout.getWidth() - fMeasureText) / 2.0f;
                    } else {
/* 79 */                fAbs = Math.abs(lineLeft);
/* 88 */                width = layout.getWidth() - fMeasureText;
                    }
/* 77 */            return width + fAbs;
                }

                public static final float I00000oOI(Layout layout, int i, Paint paint) {
                    float width;
                    float width2;
/* 1 */             ThreadLocal threadLocal = Oo0iliIolI.I00000oIO;
/* 7 */             if (layout.getEllipsisCount(i) <= 0) {
/* 110 */               return 0.0f;
                    }
/* 14 */            if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
/* 110 */               return 0.0f;
                    }
/* 53 */            float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
/* 54 */            Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
/* 70 */            if ((paragraphAlignment != null ? Iol0IoIIIio.I00000oIO[paragraphAlignment.ordinal()] : -1) == 1) {
/* 81 */                width = layout.getWidth() - layout.getLineRight(i);
/* 90 */                width2 = (layout.getWidth() - fMeasureText) / 2.0f;
                    } else {
/* 102 */               width = layout.getWidth() - layout.getLineRight(i);
/* 108 */               width2 = layout.getWidth() - fMeasureText;
                    }
/* 91 */            return width - width2;
                }
            }
