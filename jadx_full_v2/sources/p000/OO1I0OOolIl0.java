            package p000;

            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.text.style.ReplacementSpan;
            
/* 1819 */  public final class OO1I0OOolIl0 extends ReplacementSpan {
                public float I00iOIl;
                public int I00iiI;
                public float I00iiO;
                public int I00iio;
                public float I00ilI0I1;
                public float I00ilO0;
                public int I00io1l;
                public Paint.FontMetricsInt I00ioIO;
                public int I00l0I0l0lO1;
                public int I00l0OO0IO;
                public boolean I00li1OI;

                public final Paint.FontMetricsInt I00000oIO() {
/* 1 */             Paint.FontMetricsInt fontMetricsInt = this.I00ioIO;
/* 3 */             if (fontMetricsInt != null) {
/* 5 */                 return fontMetricsInt;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("fontMetrics");
/* 20 */            throw null;
                }

                public final int I00000oOI() {
/* 3 */             if (!this.I00li1OI) {
/* 7 */                 Ioliol.I0000Il00O("PlaceholderSpan is not laid out yet.");
                    }
/* 10 */            return this.I00l0OO0IO;
                }

                public final int I0000Il00O() {
/* 3 */             if (!this.I00li1OI) {
/* 7 */                 Ioliol.I0000Il00O("PlaceholderSpan is not laid out yet.");
                    }
/* 10 */            return this.I00l0I0l0lO1;
                }

                @Override
                public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                    float f;
                    float f2;
/* 2 */             this.I00li1OI = true;
/* 4 */             float textSize = paint.getTextSize();
/* 12 */            this.I00ioIO = paint.getFontMetricsInt();
/* 26 */            if (I00000oIO().descent <= I00000oIO().ascent) {
/* 31 */                Ioliol.I00000oIO("Invalid fontMetrics: line height can not be negative.");
                    }
/* 34 */            int i3 = this.I00iiI;
/* 39 */            if (i3 == 0) {
/* 54 */                f = this.I00ilI0I1;
                    } else {
/* 41 */                if (i3 != 1) {
/* 47 */                    Ioliol.I00000oOI("Unsupported unit.");
/* 50 */                    IOOlIIilOl0.I0000Il00O();
/* 36 */                    return 0;
                        }
/* 45 */                f = this.I00iOIl * textSize;
                    }
/* 63 */            this.I00l0I0l0lO1 = (int) Math.ceil(f);
/* 65 */            int i4 = this.I00iio;
/* 67 */            if (i4 == 0) {
/* 82 */                f2 = this.I00ilO0;
                    } else {
/* 69 */                if (i4 != 1) {
/* 75 */                    Ioliol.I00000oOI("Unsupported unit.");
/* 78 */                    IOOlIIilOl0.I0000Il00O();
/* 36 */                    return 0;
                        }
/* 73 */                f2 = this.I00iiO * textSize;
                    }
/* 91 */            this.I00l0OO0IO = (int) Math.ceil(f2);
/* 93 */            if (fontMetricsInt != null) {
/* 101 */               fontMetricsInt.ascent = I00000oIO().ascent;
/* 109 */               fontMetricsInt.descent = I00000oIO().descent;
/* 117 */               fontMetricsInt.leading = I00000oIO().leading;
                        switch (this.I00io1l) {
                            case 0:
/* 215 */                       if (fontMetricsInt.ascent > (-I00000oOI())) {
/* 222 */                           fontMetricsInt.ascent = -I00000oOI();
                                    break;
                                }
                                break;
                            case 1:
                            case 4:
/* 196 */                       if (I00000oOI() + fontMetricsInt.ascent > fontMetricsInt.descent) {
/* 205 */                           fontMetricsInt.descent = I00000oOI() + fontMetricsInt.ascent;
                                    break;
                                }
                                break;
                            case 2:
                            case 5:
/* 175 */                       if (fontMetricsInt.ascent > fontMetricsInt.descent - I00000oOI()) {
/* 184 */                           fontMetricsInt.ascent = fontMetricsInt.descent - I00000oOI();
                                    break;
                                }
                                break;
                            case 3:
                            case 6:
/* 139 */                       if (fontMetricsInt.descent - fontMetricsInt.ascent < I00000oOI()) {
/* 155 */                           int iI00000oOI = fontMetricsInt.ascent - ((I00000oOI() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
/* 156 */                           fontMetricsInt.ascent = iI00000oOI;
/* 163 */                           fontMetricsInt.descent = I00000oOI() + iI00000oOI;
                                    break;
                                }
                                break;
                            default:
/* 126 */                       Ioliol.I00000oIO("Unknown verticalAlign.");
                                break;
                        }
/* 236 */               fontMetricsInt.top = Math.min(I00000oIO().top, fontMetricsInt.ascent);
/* 250 */               fontMetricsInt.bottom = Math.max(I00000oIO().bottom, fontMetricsInt.descent);
                    }
/* 252 */           return I0000Il00O();
                }

                @Override
/* 1820 */      public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                }
            }
