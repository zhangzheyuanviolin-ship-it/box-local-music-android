            package p000;

            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.Typeface;
            import android.text.Spanned;
            import android.text.TextPaint;
            import android.text.style.CharacterStyle;
            import android.text.style.MetricAffectingSpan;
            import android.text.style.ReplacementSpan;
            import java.nio.ByteBuffer;
            
            public final class OoOlI0ii extends ReplacementSpan {
                public Paint.FontMetricsInt I00iOIl;
                public OoOl1ol1l I00iiI;
                public short I00iiO;
                public float I00iio;
                public TextPaint I00ilI0I1;

                /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
/* 9 */             TextPaint textPaint = null;
/* 10 */            if (charSequence instanceof Spanned) {
/* 24 */                CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
/* 27 */                if (characterStyleArr.length != 0) {
/* 32 */                    if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
/* 39 */                        TextPaint textPaint2 = this.I00ilI0I1;
/* 41 */                        if (textPaint2 == null) {
/* 45 */                            textPaint2 = new TextPaint();
/* 48 */                            this.I00ilI0I1 = textPaint2;
                                }
/* 50 */                        textPaint = textPaint2;
/* 51 */                        textPaint.set(paint);
/* 55 */                        for (CharacterStyle characterStyle : characterStyleArr) {
/* 61 */                            if (!(characterStyle instanceof MetricAffectingSpan)) {
/* 63 */                                characterStyle.updateDrawState(textPaint);
                                    }
                                }
                            } else if (paint instanceof TextPaint) {
/* 76 */                        textPaint = (TextPaint) paint;
                            }
                        }
                    } else if (paint instanceof TextPaint) {
/* 84 */                textPaint = (TextPaint) paint;
                    }
/* 69 */            TextPaint textPaint3 = textPaint;
/* 87 */            if (textPaint3 != null && textPaint3.bgColor != 0) {
/* 104 */               int color = textPaint3.getColor();
/* 108 */               Paint.Style style = textPaint3.getStyle();
/* 114 */               textPaint3.setColor(textPaint3.bgColor);
/* 119 */               textPaint3.setStyle(Paint.Style.FILL);
/* 126 */               canvas.drawRect(f, i3, f + this.I00iiO, i5, textPaint3);
/* 129 */               textPaint3.setStyle(style);
/* 132 */               textPaint3.setColor(color);
                    }
/* 139 */           IiollO1llli.I00000oIO().getClass();
/* 142 */           OoOl1ol1l ooOl1ol1l = this.I00iiI;
                    float f2 = i4;
                    Paint paint2 = textPaint3;
/* 147 */           if (textPaint3 == null) {
/* 150 */               paint2 = paint;
                    }
/* 151 */           OillOo0 oillOo0 = ooOl1ol1l.I00000oOI;
/* 155 */           Typeface typeface = (Typeface) oillOo0.I00ilI0I1;
/* 157 */           Typeface typeface2 = paint2.getTypeface();
/* 161 */           paint2.setTypeface(typeface);
/* 182 */           canvas.drawText((char[]) oillOo0.I00iiO, ooOl1ol1l.I00000oIO * 2, 2, f, f2, paint2);
/* 185 */           paint2.setTypeface(typeface2);
                }

                @Override
                public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
/* 1 */             Paint.FontMetricsInt fontMetricsInt2 = this.I00iOIl;
/* 3 */             paint.getFontMetricsInt(fontMetricsInt2);
/* 18 */            float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
/* 19 */            OoOl1ol1l ooOl1ol1l = this.I00iiI;
/* 49 */            this.I00iio = fAbs / (ooOl1ol1l.I00000oOI().I00000oIO(14) != 0 ? ((ByteBuffer) r8.I00iiI).getShort(r1 + r8.I00iOIl) : (short) 0);
/* 51 */            O1liI1Ii o1liI1IiI00000oOI = ooOl1ol1l.I00000oOI();
/* 55 */            int iI00000oIO = o1liI1IiI00000oOI.I00000oIO(14);
/* 59 */            if (iI00000oIO != 0) {
/* 68 */                ((ByteBuffer) o1liI1IiI00000oOI.I00iiI).getShort(iI00000oIO + o1liI1IiI00000oOI.I00iOIl);
                    }
/* 99 */            short s = (short) ((ooOl1ol1l.I00000oOI().I00000oIO(12) != 0 ? ((ByteBuffer) r5.I00iiI).getShort(r7 + r5.I00iOIl) : (short) 0) * this.I00iio);
/* 100 */           this.I00iiO = s;
/* 102 */           if (fontMetricsInt != null) {
/* 106 */               fontMetricsInt.ascent = fontMetricsInt2.ascent;
/* 110 */               fontMetricsInt.descent = fontMetricsInt2.descent;
/* 114 */               fontMetricsInt.top = fontMetricsInt2.top;
/* 118 */               fontMetricsInt.bottom = fontMetricsInt2.bottom;
                    }
/* 399 */           return s;
                }
            }
