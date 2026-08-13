            package p000;

            import android.text.Editable;
            import android.text.SpanWatcher;
            import android.text.Spannable;
            import android.text.TextWatcher;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class OlIIii1O implements TextWatcher, SpanWatcher {
                public Object I00iOIl;
                public AtomicInteger I00iiI;

                @Override
                public final void afterTextChanged(Editable editable) {
/* 5 */             ((TextWatcher) this.I00iOIl).afterTextChanged(editable);
                }

                @Override
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 5 */             ((TextWatcher) this.I00iOIl).beforeTextChanged(charSequence, i, i2, i3);
                }

                @Override
                public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
/* 7 */             if (this.I00iiI.get() <= 0 || !(obj instanceof OoOlI0ii)) {
/* 18 */                ((SpanWatcher) this.I00iOIl).onSpanAdded(spannable, obj, i, i2);
                    }
                }

                @Override
                public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
/* 7 */             if (this.I00iiI.get() <= 0 || !(obj instanceof OoOlI0ii)) {
/* 25 */                ((SpanWatcher) this.I00iOIl).onSpanChanged(spannable, obj, i, i2, i3, i4);
                    }
                }

                @Override
                public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
/* 7 */             if (this.I00iiI.get() <= 0 || !(obj instanceof OoOlI0ii)) {
/* 18 */                ((SpanWatcher) this.I00iOIl).onSpanRemoved(spannable, obj, i, i2);
                    }
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 5 */             ((TextWatcher) this.I00iOIl).onTextChanged(charSequence, i, i2, i3);
                }
            }
