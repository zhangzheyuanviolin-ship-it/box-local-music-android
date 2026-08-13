            package p000;

            import android.text.PrecomputedText;
            import android.text.Spannable;
            import android.text.SpannableString;
            import java.util.stream.IntStream;
            
            public final class Ooii0i implements Spannable {
                public boolean I00iOIl = false;
                public Spannable I00iiI;

                public Ooii0i(Spannable spannable) {
/* 7 */             this.I00iiI = spannable;
                }

                @Override
                public final char charAt(int i) {
/* 3 */             return this.I00iiI.charAt(i);
                }

                @Override
                public final IntStream chars() {
/* 3 */             return this.I00iiI.chars();
                }

                @Override
                public final IntStream codePoints() {
/* 3 */             return this.I00iiI.codePoints();
                }

                @Override
                public final int getSpanEnd(Object obj) {
/* 3 */             return this.I00iiI.getSpanEnd(obj);
                }

                @Override
                public final int getSpanFlags(Object obj) {
/* 3 */             return this.I00iiI.getSpanFlags(obj);
                }

                @Override
                public final int getSpanStart(Object obj) {
/* 3 */             return this.I00iiI.getSpanStart(obj);
                }

                @Override
                public final Object[] getSpans(int i, int i2, Class cls) {
/* 3 */             return this.I00iiI.getSpans(i, i2, cls);
                }

                @Override
                public final int length() {
/* 3 */             return this.I00iiI.length();
                }

                @Override
                public final int nextSpanTransition(int i, int i2, Class cls) {
/* 3 */             return this.I00iiI.nextSpanTransition(i, i2, cls);
                }

                @Override
                public final void removeSpan(Object obj) {
/* 1 */             Spannable spannable = this.I00iiI;
/* 5 */             if (!this.I00iOIl && (spannable instanceof PrecomputedText)) {
/* 13 */                SpannableString spannableString = new SpannableString(spannable);
/* 16 */                this.I00iiI = spannableString;
/* 18 */                spannable = spannableString;
                    }
/* 20 */            this.I00iOIl = true;
/* 22 */            spannable.removeSpan(obj);
                }

                @Override
                public final void setSpan(Object obj, int i, int i2, int i3) {
/* 1 */             Spannable spannable = this.I00iiI;
/* 5 */             if (!this.I00iOIl && (spannable instanceof PrecomputedText)) {
/* 13 */                SpannableString spannableString = new SpannableString(spannable);
/* 16 */                this.I00iiI = spannableString;
/* 18 */                spannable = spannableString;
                    }
/* 20 */            this.I00iOIl = true;
/* 22 */            spannable.setSpan(obj, i, i2, i3);
                }

                @Override
                public final CharSequence subSequence(int i, int i2) {
/* 3 */             return this.I00iiI.subSequence(i, i2);
                }

                @Override
                public final String toString() {
/* 3 */             return this.I00iiI.toString();
                }
            }
