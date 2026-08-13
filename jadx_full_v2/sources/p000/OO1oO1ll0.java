            package p000;

            import android.text.TextDirectionHeuristic;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import java.util.Objects;
            
            public final class OO1oO1ll0 {
                public TextPaint I00000oIO;
                public TextDirectionHeuristic I00000oOI;
                public int I0000Il00O;
                public int I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OO1oO1ll0)) {
/* 7 */                 return false;
                    }
/* 11 */            OO1oO1ll0 oO1oO1ll0 = (OO1oO1ll0) obj;
/* 13 */            TextPaint textPaint = this.I00000oIO;
/* 15 */            int i = this.I0000Il00O;
/* 17 */            int i2 = oO1oO1ll0.I0000Il00O;
/* 19 */            TextPaint textPaint2 = oO1oO1ll0.I00000oIO;
                    return i == i2 && this.I0000O == oO1oO1ll0.I0000O && textPaint.getTextSize() == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.I00000oOI == oO1oO1ll0.I00000oOI;
                }

                public final int hashCode() {
/* 1 */             TextPaint textPaint = this.I00000oIO;
/* 77 */            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.I00000oOI, Integer.valueOf(this.I0000Il00O), Integer.valueOf(this.I0000O));
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("{");
/* 12 */            StringBuilder sb2 = new StringBuilder("textSize=");
/* 15 */            TextPaint textPaint = this.I00000oIO;
/* 21 */            sb2.append(textPaint.getTextSize());
/* 28 */            sb.append(sb2.toString());
/* 49 */            sb.append(", textScaleX=" + textPaint.getTextScaleX());
/* 70 */            sb.append(", textSkewX=" + textPaint.getTextSkewX());
/* 91 */            sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
/* 112 */           sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
/* 133 */           sb.append(", textLocale=" + textPaint.getTextLocales());
/* 154 */           sb.append(", typeface=" + textPaint.getTypeface());
/* 175 */           sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
/* 194 */           sb.append(", textDir=" + this.I00000oOI);
/* 213 */           sb.append(", breakStrategy=" + this.I0000Il00O);
/* 232 */           sb.append(", hyphenationFrequency=" + this.I0000O);
/* 237 */           sb.append("}");
/* 240 */           return sb.toString();
                }
            }
