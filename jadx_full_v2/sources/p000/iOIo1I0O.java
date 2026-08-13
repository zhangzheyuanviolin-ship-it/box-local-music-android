            package p000;

            import android.text.TextPaint;
            
            public abstract class iOIo1I0O {
                public static final void I00000oIO(TextPaint textPaint, float f) {
/* 5 */             if (Float.isNaN(f)) {
/* 37 */                return;
                    }
/* 10 */            if (f < 0.0f) {
/* 12 */                f = 0.0f;
                    }
/* 17 */            if (f > 1.0f) {
/* 19 */                f = 1.0f;
                    }
/* 27 */            textPaint.setAlpha(Math.round(f * 255.0f));
                }
            }
