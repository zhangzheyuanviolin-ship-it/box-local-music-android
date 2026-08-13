            package p000;

            import android.text.BoringLayout;
            import android.text.Layout;
            import android.text.SpannableString;
            import android.text.Spanned;
            import android.text.TextPaint;
            import android.text.style.CharacterStyle;
            import android.text.style.MetricAffectingSpan;
            
            public final class O0iOlIOIl0 {
                public CharSequence I00000oIO;
                public TextPaint I00000oOI;
                public int I0000Il00O;
                public float I0000O;
                public float I0000oI00;
                public BoringLayout.Metrics I0001Ioi1lo;
                public boolean I000II;
                public CharSequence I000O01llI0;

                public final CharSequence I00000oIO() {
/* 1 */             CharSequence charSequence = this.I000O01llI0;
/* 3 */             if (charSequence == null) {
/* 5 */                 charSequence = this.I00000oIO;
/* 9 */                 if (charSequence instanceof Spanned) {
/* 12 */                    Spanned spanned = (Spanned) charSequence;
/* 20 */                    if (lOO1lIo0.I00000oIO(spanned, CharacterStyle.class)) {
/* 32 */                        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
/* 34 */                        if (characterStyleArr != null && characterStyleArr.length != 0) {
/* 41 */                            SpannableString spannableString = null;
/* 42 */                            for (CharacterStyle characterStyle : characterStyleArr) {
/* 48 */                                if (!(characterStyle instanceof MetricAffectingSpan)) {
/* 50 */                                    if (spannableString == null) {
/* 54 */                                        spannableString = new SpannableString(charSequence);
                                            }
/* 57 */                                    spannableString.removeSpan(characterStyle);
                                        }
                                    }
/* 63 */                            if (spannableString != null) {
/* 65 */                                charSequence = spannableString;
                                    }
                                }
                            }
                        }
/* 66 */                this.I000O01llI0 = charSequence;
                    }
/* 110 */           return charSequence;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final float I00000oOI() {
/* 1 */             CharSequence charSequence = this.I00000oIO;
/* 3 */             TextPaint textPaint = this.I00000oOI;
/* 11 */            if (!Float.isNaN(this.I0000O)) {
/* 13 */                return this.I0000O;
                    }
/* 18 */            if (!this.I000II) {
/* 32 */                this.I0001Ioi1lo = BoringLayout.isBoring(charSequence, textPaint, Oo0iliIolI.I00000oOI(this.I0000Il00O), true, null);
/* 34 */                this.I000II = true;
                    }
/* 36 */            BoringLayout.Metrics metrics = this.I0001Ioi1lo;
/* 43 */            float fCeil = metrics != null ? metrics.width : -1;
/* 48 */            if (fCeil < 0.0f) {
/* 72 */                fCeil = (float) Math.ceil(Layout.getDesiredWidth(I00000oIO(), 0, I00000oIO().length(), textPaint));
                    }
/* 75 */            if (fCeil != 0.0f) {
/* 80 */                if (charSequence instanceof Spanned) {
/* 82 */                    Spanned spanned = (Spanned) charSequence;
/* 90 */                    if (lOO1lIo0.I00000oIO(spanned, O0oO10.class) || lOO1lIo0.I00000oIO(spanned, O0oO0O.class)) {
/* 111 */                       fCeil += 0.5f;
                            } else if (textPaint.getLetterSpacing() != 0.0f) {
                            }
                        }
                    }
/* 112 */           this.I0000O = fCeil;
/* 245 */           return fCeil;
                }
            }
